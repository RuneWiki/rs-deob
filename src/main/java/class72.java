import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class72 implements Runnable {

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[Lti;")
    public volatile class5[] field1149 = new class5[2];

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Z")
    public volatile boolean field1146 = false;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Z")
    public volatile boolean field1143 = false;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[Lna;")
    public static class32[] field1144 = new class32[32768];

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[Lng;")
    public static class77[] field1142 = new class77[4];

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field1153 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Luf;")
    public static class176 field1152;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lja;")
    public class59 field1141;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Z")
    public static boolean field1140;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[[[B")
    public static byte[][][] field1139;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLka;)V")
    public static final void method560(boolean arg0, class264 arg1) {
        arg1.field4157 = arg0;
        field1151++;
        if (arg1.field4148 != -1) {
            class223 var2 = class28.method224(arg1.field4148, 88);
            if (var2 == null || var2.field3484 == null) {
                arg1.field4148 = -1;
            } else {
                arg1.field4192++;
                if (arg1.field4164 < var2.field3484.length && arg1.field4192 > var2.field3488[arg1.field4164]) {
                    arg1.field4175++;
                    arg1.field4164++;
                    arg1.field4192 = 1;
                    class56.method452((byte) 106, arg1.field4164, arg1.field4176, var2, class261.field4058 == arg1, arg1.field4123);
                }
                if (var2.field3484.length <= arg1.field4164) {
                    arg1.field4164 = 0;
                    arg1.field4192 = 0;
                    class56.method452((byte) 109, arg1.field4164, arg1.field4176, var2, class261.field4058 == arg1, arg1.field4123);
                }
                arg1.field4175 = arg1.field4164 + 1;
                if (var2.field3484.length <= arg1.field4175) {
                    arg1.field4175 = 0;
                }
            }
        }
        if (arg1.field4135 != -1 && class267.field4256 >= arg1.field4174) {
            class259 var3 = class23.method189(arg1.field4135, (byte) -122);
            int var4 = var3.field3963;
            if (var4 == -1) {
                arg1.field4135 = -1;
            } else {
                label292: {
                    class223 var5 = class28.method224(var4, 110);
                    if (var3.field3959) {
                        if (var5.field3502 == 3) {
                            if (arg1.field4151 > 0 && class267.field4256 >= arg1.field4201 && class267.field4256 > arg1.field4219) {
                                arg1.field4135 = -1;
                                break label292;
                            }
                        } else if (var5.field3502 == 1 && arg1.field4151 > 0 && arg1.field4201 <= class267.field4256 && class267.field4256 > arg1.field4219) {
                            arg1.field4174 = class267.field4256 + 1;
                            break label292;
                        }
                    }
                    if (var5 == null || var5.field3484 == null) {
                        arg1.field4135 = -1;
                    } else {
                        if (arg1.field4188 < 0) {
                            arg1.field4188 = 0;
                            class56.method452((byte) 102, 0, arg1.field4176, var5, class261.field4058 == arg1, arg1.field4123);
                        }
                        arg1.field4206++;
                        if (var5.field3484.length > arg1.field4188 && var5.field3488[arg1.field4188] < arg1.field4206) {
                            arg1.field4206 = 1;
                            arg1.field4188++;
                            class56.method452((byte) -89, arg1.field4188, arg1.field4176, var5, class261.field4058 == arg1, arg1.field4123);
                        }
                        if (arg1.field4188 >= var5.field3484.length) {
                            if (var3.field3959) {
                                arg1.field4188 -= var5.field3487;
                                arg1.field4189++;
                                if (arg1.field4189 >= var5.field3486) {
                                    arg1.field4135 = -1;
                                } else if (arg1.field4188 >= 0 && var5.field3484.length > arg1.field4188) {
                                    class56.method452((byte) 92, arg1.field4188, arg1.field4176, var5, class261.field4058 == arg1, arg1.field4123);
                                } else {
                                    arg1.field4135 = -1;
                                }
                            } else {
                                arg1.field4135 = -1;
                            }
                        }
                        arg1.field4136 = arg1.field4188 + 1;
                        if (arg1.field4136 >= var5.field3484.length) {
                            if (var3.field3959) {
                                arg1.field4136 -= var5.field3487;
                                if (var5.field3486 <= (arg1.field4189 + 1)) {
                                    arg1.field4136 = -1;
                                } else if (arg1.field4136 < 0 || var5.field3484.length <= arg1.field4136) {
                                    arg1.field4136 = -1;
                                }
                            } else {
                                arg1.field4136 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4210 != -1 && arg1.field4179 <= 1) {
            class223 var6 = class28.method224(arg1.field4210, 64);
            if (var6.field3502 == 3) {
                if (arg1.field4151 > 0 && arg1.field4201 <= class267.field4256 && class267.field4256 > arg1.field4219) {
                    arg1.field4210 = -1;
                }
            } else if (var6.field3502 == 1 && arg1.field4151 > 0 && arg1.field4201 <= class267.field4256 && class267.field4256 > arg1.field4219) {
                arg1.field4179 = 1;
            }
        }
        if (arg1.field4210 != -1 && arg1.field4179 == 0) {
            class223 var7 = class28.method224(arg1.field4210, 85);
            if (var7 == null || var7.field3484 == null) {
                arg1.field4210 = -1;
            } else {
                arg1.field4194++;
                if (var7.field3484.length > arg1.field4185 && arg1.field4194 > var7.field3488[arg1.field4185]) {
                    arg1.field4185++;
                    arg1.field4194 = 1;
                    class56.method452((byte) 104, arg1.field4185, arg1.field4176, var7, class261.field4058 == arg1, arg1.field4123);
                }
                if (var7.field3484.length <= arg1.field4185) {
                    arg1.field4181++;
                    arg1.field4185 -= var7.field3487;
                    if (var7.field3486 <= arg1.field4181) {
                        arg1.field4210 = -1;
                    } else if (arg1.field4185 >= 0 && var7.field3484.length > arg1.field4185) {
                        class56.method452((byte) 118, arg1.field4185, arg1.field4176, var7, class261.field4058 == arg1, arg1.field4123);
                    } else {
                        arg1.field4210 = -1;
                    }
                }
                arg1.field4196 = arg1.field4185 + 1;
                if (var7.field3484.length <= arg1.field4196) {
                    arg1.field4196 -= var7.field3487;
                    if ((arg1.field4181 + 1) >= var7.field3486) {
                        arg1.field4196 = -1;
                    } else if (arg1.field4196 < 0 || arg1.field4196 >= var7.field3484.length) {
                        arg1.field4196 = -1;
                    }
                }
                arg1.field4157 = var7.field3497;
            }
        }
        if (arg1.field4179 > 0) {
            arg1.field4179--;
        }
        for (int var8 = 0; var8 < arg1.field4215.length; var8++) {
            class85 var9 = arg1.field4215[var8];
            if (var9 != null) {
                if (var9.field1401 > 0) {
                    var9.field1401--;
                } else {
                    class223 var10 = class28.method224(var9.field1398, 76);
                    if (var10 == null || var10.field3484 == null) {
                        arg1.field4215[var8] = null;
                    } else {
                        var9.field1402++;
                        if (var10.field3484.length > var9.field1392 && var9.field1402 > var10.field3488[var9.field1392]) {
                            var9.field1392++;
                            var9.field1402 = 1;
                            class56.method452((byte) -83, var9.field1392, arg1.field4176, var10, class261.field4058 == arg1, arg1.field4123);
                        }
                        if (var10.field3484.length <= var9.field1392) {
                            var9.field1392 -= var10.field3487;
                            var9.field1395++;
                            if (var9.field1395 >= var10.field3486) {
                                arg1.field4215[var8] = null;
                            } else if (var9.field1392 >= 0 && var9.field1392 < var10.field3484.length) {
                                class56.method452((byte) -122, var9.field1392, arg1.field4176, var10, class261.field4058 == arg1, arg1.field4123);
                            } else {
                                arg1.field4215[var8] = null;
                            }
                        }
                        var9.field1400 = var9.field1392 + 1;
                        if (var9.field1400 >= var10.field3484.length) {
                            var9.field1400 -= var10.field3487;
                            if (var9.field1395 + 1 >= var10.field3486) {
                                var9.field1400 = -1;
                            } else if (var9.field1400 < 0 || var9.field1400 >= var10.field3484.length) {
                                var9.field1400 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "run", descriptor = "()V")
    public final void run() {
        this.field1143 = true;
        field1150++;
        try {
            while (!this.field1146) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class5 var2 = this.field1149[var1];
                    if (var2 != null) {
                        var2.method64((byte) -106);
                    }
                }
                class42.method354(10L, false);
                class6.method73((Object) null, this.field1141, false);
            }
        } catch (Exception var9) {
            class223.method1490(var9, (String) null, (byte) -59);
        } finally {
            Object var6 = null;
            this.field1143 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)I")
    public static final int method561(int arg0, int arg1, int arg2) {
        if (arg2 == -221806177) {
            int var3 = arg1 - 1 & arg0 >> 31;
            field1148++;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method562(String arg0, boolean arg1, int arg2) {
        int var3 = 0;
        String var4 = arg0.toLowerCase();
        short[] var5 = new short[16];
        field1145++;
        for (int var6 = arg2; var6 < class292.field4595; var6++) {
            class123 var9 = class32.method260(var6, true);
            if ((!arg1 || var9.field1900) && var9.field1922 == -1 && var9.field1887 == -1 && var9.field1948 == 0 && var9.field1885.toLowerCase().indexOf(var4) != -1) {
                if (var3 >= 250) {
                    class16.field256 = -1;
                    class98.field1571 = null;
                    return;
                }
                if (var3 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var3++] = (short) var6;
            }
        }
        class98.field1571 = var5;
        class28.field424 = 0;
        class16.field256 = var3;
        String[] var7 = new String[class16.field256];
        for (int var8 = 0; var8 < class16.field256; var8++) {
            var7[var8] = class32.method260(var5[var8], true).field1885;
        }
        class50.method418(var7, class98.field1571, arg2 ^ 0xFFFFFFA1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method563(int arg0) {
        field1152 = null;
        field1139 = null;
        field1142 = null;
        field1144 = null;
        if (arg0 < 82) {
            field1140 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static final int method564(int arg0, int arg1) {
        field1147++;
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        if (arg0 != 255) {
            field1152 = null;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
