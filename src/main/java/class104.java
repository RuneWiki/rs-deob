import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class104 {

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Luf;")
    private class380 field1236 = new class380(256);

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Lga;")
    private class332 field1232;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Ltca;")
    public static class141 field1230 = new class141(6, 1);

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Leba;")
    public static class550 field1237 = new class550(27, 6);

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1242 = new String[100];

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "F")
    public static float field1241;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "[I")
    public static int[] field1239;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[I")
    public static int[] field1240;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lhe;I)V")
    public static final void method572(class231 arg0, int arg1) {
        if (arg0.field3067 != -1) {
            class186 var2 = class423.field5620.method1707(arg0.field3067, -99);
            if (var2 == null || var2.field2570 == null) {
                arg0.field3067 = -1;
                arg0.field3021 = false;
            } else {
                label397: {
                    arg0.field3030++;
                    if (arg0.field3008 < var2.field2570.length && arg0.field3030 > var2.field2595[arg0.field3008]) {
                        arg0.field3030 = 1;
                        arg0.field3073++;
                        arg0.field3008++;
                        class615.method3398(arg0.field3008, arg0.field398, var2, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                    }
                    if (arg0.field3008 >= var2.field2570.length) {
                        arg0.field3008 = 0;
                        arg0.field3030 = 0;
                        if (arg0.field3021) {
                            arg0.field3067 = arg0.method1432(-1).method1590(true);
                            if (arg0.field3067 == -1) {
                                arg0.field3021 = false;
                                break label397;
                            }
                            var2 = class423.field5620.method1707(arg0.field3067, -87);
                        }
                        class615.method3398(arg0.field3008, arg0.field398, var2, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                    }
                    arg0.field3073 = arg0.field3008 + 1;
                    if (var2.field2570.length <= arg0.field3073) {
                        arg0.field3073 = 0;
                    }
                }
            }
        }
        field1229++;
        if (arg0.field3022 != -1 && class327.field4404 >= arg0.field3049) {
            class521 var3 = class24.field291.method2940(arg0.field3022, 17);
            int var4 = var3.field7228;
            if (var4 == -1) {
                arg0.field3022 = -1;
            } else {
                label399: {
                    class186 var5 = class423.field5620.method1707(var4, -77);
                    if (var3.field7219) {
                        if (var5.field2568 == 3) {
                            if (arg0.field3085 > 0 && class327.field4404 >= arg0.field3036 && class327.field4404 > arg0.field2984) {
                                arg0.field3022 = -1;
                                break label399;
                            }
                        } else if (var5.field2568 == 1 && arg0.field3085 > 0 && class327.field4404 >= arg0.field3036 && arg0.field2984 < class327.field4404) {
                            arg0.field3049 = class327.field4404 + 1;
                            break label399;
                        }
                    }
                    if (var5 == null || var5.field2570 == null) {
                        arg0.field3022 = -1;
                    } else {
                        if (arg0.field3000 < 0) {
                            arg0.field3000 = 0;
                            class615.method3398(0, arg0.field398, var5, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                        }
                        arg0.field3040++;
                        if (arg0.field3000 < var5.field2570.length && var5.field2595[arg0.field3000] < arg0.field3040) {
                            arg0.field3000++;
                            arg0.field3040 = 1;
                            class615.method3398(arg0.field3000, arg0.field398, var5, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                        }
                        if (arg0.field3000 >= var5.field2570.length) {
                            if (var3.field7219) {
                                arg0.field3066++;
                                arg0.field3000 -= var5.field2587;
                                if (var5.field2586 <= arg0.field3066) {
                                    arg0.field3022 = -1;
                                } else if (arg0.field3000 >= 0 && var5.field2570.length > arg0.field3000) {
                                    class615.method3398(arg0.field3000, arg0.field398, var5, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                                } else {
                                    arg0.field3022 = -1;
                                }
                            } else {
                                arg0.field3022 = -1;
                            }
                        }
                        arg0.field3001 = arg0.field3000 + 1;
                        if (var5.field2570.length <= arg0.field3001) {
                            if (var3.field7219) {
                                arg0.field3001 -= var5.field2587;
                                if (arg0.field3066 + 1 >= var5.field2586) {
                                    arg0.field3001 = -1;
                                } else if (arg0.field3001 < 0 || arg0.field3001 >= var5.field2570.length) {
                                    arg0.field3001 = -1;
                                }
                            } else {
                                arg0.field3001 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field3064 != -1 && class327.field4404 >= arg0.field3006) {
            class521 var6 = class24.field291.method2940(arg0.field3064, 17);
            int var7 = var6.field7228;
            if (var7 == -1) {
                arg0.field3064 = -1;
            } else {
                label403: {
                    class186 var8 = class423.field5620.method1707(var7, 103);
                    if (var6.field7219) {
                        if (var8.field2568 == 3) {
                            if (arg0.field3085 > 0 && arg0.field3036 <= class327.field4404 && arg0.field2984 < class327.field4404) {
                                arg0.field3064 = -1;
                                break label403;
                            }
                        } else if (var8.field2568 == 1 && arg0.field3085 > 0 && arg0.field3036 <= class327.field4404 && arg0.field2984 < class327.field4404) {
                            arg0.field3006 = class327.field4404 + 1;
                            break label403;
                        }
                    }
                    if (var8 == null || var8.field2570 == null) {
                        arg0.field3064 = -1;
                    } else {
                        if (arg0.field3063 < 0) {
                            arg0.field3063 = 0;
                            class615.method3398(0, arg0.field398, var8, arg1 - 1772, arg0.field397, arg0.field385, class408.field5369 == arg0);
                        }
                        arg0.field3059++;
                        if (var8.field2570.length > arg0.field3063 && var8.field2595[arg0.field3063] < arg0.field3059) {
                            arg0.field3063++;
                            arg0.field3059 = 1;
                            class615.method3398(arg0.field3063, arg0.field398, var8, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                        }
                        if (var8.field2570.length <= arg0.field3063) {
                            if (var6.field7219) {
                                arg0.field2993++;
                                arg0.field3063 -= var8.field2587;
                                if (arg0.field2993 >= var8.field2586) {
                                    arg0.field3064 = -1;
                                } else if (arg0.field3063 >= 0 && var8.field2570.length > arg0.field3063) {
                                    class615.method3398(arg0.field3063, arg0.field398, var8, arg1 - 1772, arg0.field397, arg0.field385, class408.field5369 == arg0);
                                } else {
                                    arg0.field3064 = -1;
                                }
                            } else {
                                arg0.field3064 = -1;
                            }
                        }
                        arg0.field2996 = arg0.field3063 + 1;
                        if (arg0.field2996 >= var8.field2570.length) {
                            if (var6.field7219) {
                                arg0.field2996 -= var8.field2587;
                                if (arg0.field2993 + 1 >= var8.field2586) {
                                    arg0.field2996 = -1;
                                } else if (arg0.field2996 < 0 || var8.field2570.length <= arg0.field2996) {
                                    arg0.field2996 = -1;
                                }
                            } else {
                                arg0.field2996 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field3048 != arg1 && arg0.field3068 <= 1) {
            class186 var9 = class423.field5620.method1707(arg0.field3048, arg1 ^ 0xFFFFFFDF);
            if (var9.field2568 == 3) {
                if (arg0.field3085 > 0 && class327.field4404 >= arg0.field3036 && class327.field4404 > arg0.field2984) {
                    arg0.field2989 = null;
                    arg0.field3048 = -1;
                }
            } else if (var9.field2568 == 1 && arg0.field3085 > 0 && class327.field4404 >= arg0.field3036 && class327.field4404 > arg0.field2984) {
                arg0.field3068 = 2;
            }
        }
        if (arg0.field3048 != -1 && arg0.field3068 == 0) {
            class186 var10 = class423.field5620.method1707(arg0.field3048, -127);
            if (var10 == null || var10.field2570 == null) {
                arg0.field3048 = -1;
                arg0.field2989 = null;
            } else {
                arg0.field3058++;
                if (arg0.field2991 < var10.field2570.length && var10.field2595[arg0.field2991] < arg0.field3058) {
                    arg0.field3058 = 1;
                    arg0.field2991++;
                    class615.method3398(arg0.field2991, arg0.field398, var10, arg1 ^ 0x6EC, arg0.field397, arg0.field385, class408.field5369 == arg0);
                }
                if (var10.field2570.length <= arg0.field2991) {
                    arg0.field2991 -= var10.field2587;
                    arg0.field3051++;
                    if (arg0.field3051 >= var10.field2586) {
                        arg0.field2989 = null;
                        arg0.field3048 = -1;
                    } else if (arg0.field2991 >= 0 && arg0.field2991 < var10.field2570.length) {
                        class615.method3398(arg0.field2991, arg0.field398, var10, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                    } else {
                        arg0.field2989 = null;
                        arg0.field3048 = -1;
                    }
                }
                arg0.field3026 = arg0.field2991 + 1;
                if (arg0.field3026 >= var10.field2570.length) {
                    arg0.field3026 -= var10.field2587;
                    if ((arg0.field3051 + 1) >= var10.field2586) {
                        arg0.field3026 = -1;
                    } else if (arg0.field3026 < 0 || var10.field2570.length <= arg0.field3026) {
                        arg0.field3026 = -1;
                    }
                }
            }
        }
        if (arg0.field3068 > 0) {
            arg0.field3068--;
        }
        for (int var11 = 0; var11 < arg0.field3047.length; var11++) {
            class405 var12 = arg0.field3047[var11];
            if (var12 != null) {
                if (var12.field5346 > 0) {
                    var12.field5346--;
                } else {
                    class186 var13 = class423.field5620.method1707(var12.field5350, -126);
                    if (var13 == null || var13.field2570 == null) {
                        arg0.field3047[var11] = null;
                    } else {
                        var12.field5347++;
                        if (var13.field2570.length > var12.field5352 && var12.field5347 > var13.field2595[var12.field5352]) {
                            var12.field5347 = 1;
                            var12.field5352++;
                            class615.method3398(var12.field5352, arg0.field398, var13, arg1 ^ 0x6EC, arg0.field397, arg0.field385, class408.field5369 == arg0);
                        }
                        if (var13.field2570.length <= var12.field5352) {
                            var12.field5348++;
                            var12.field5352 -= var13.field2587;
                            if (var12.field5348 >= var13.field2586) {
                                arg0.field3047[var11] = null;
                            } else if (var12.field5352 >= 0 && var12.field5352 < var13.field2570.length) {
                                class615.method3398(var12.field5352, arg0.field398, var13, -1773, arg0.field397, arg0.field385, class408.field5369 == arg0);
                            } else {
                                arg0.field3047[var11] = null;
                            }
                        }
                        var12.field5351 = var12.field5352 + 1;
                        if (var12.field5351 >= var13.field2570.length) {
                            var12.field5351 -= var13.field2587;
                            if (var12.field5348 + 1 >= var13.field2586) {
                                var12.field5351 = -1;
                            } else if (var12.field5351 < 0 || var12.field5351 >= var13.field2570.length) {
                                var12.field5351 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public final void method573(int arg0) {
        class380 var2 = this.field1236;
        synchronized (this.field1236) {
            if (arg0 >= -48) {
                field1242 = null;
            }
            this.field1236.method2168((byte) -110);
        }
        field1231++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
    public final void method574(int arg0, boolean arg1) {
        class380 var3 = this.field1236;
        synchronized (this.field1236) {
            this.field1236.method2179(arg1, arg0);
        }
        field1235++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method575(int arg0, int arg1) {
        if (arg1 == 7455) {
            field1234++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
    public static final void method576(boolean arg0) {
        field1238++;
        class610.field8468.method1079(class458.field6017, class216.field2836, class428.field5761);
        if (arg0) {
            method572(null, 92);
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)Lb;")
    public final class623 method577(int arg0, int arg1) {
        field1233++;
        class380 var3 = this.field1236;
        class623 var4;
        synchronized (this.field1236) {
            var4 = (class623) this.field1236.method2176(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field1232;
        byte[] var6;
        synchronized (this.field1232) {
            var6 = this.field1232.method1938(arg0, arg1, arg1 ^ 0xFFFFFFF5);
        }
        class623 var7 = new class623();
        if (var6 != null) {
            var7.method3464(arg1 - 25, new class157(var6));
        }
        class380 var8 = this.field1236;
        synchronized (this.field1236) {
            this.field1236.method2174(var7, (long) arg0, (byte) -44);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public final void method578(int arg0) {
        field1228++;
        class380 var2 = this.field1236;
        synchronized (this.field1236) {
            this.field1236.method2172(-15112);
            if (arg0 != -1) {
                method576(true);
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method579(byte arg0) {
        field1230 = null;
        field1242 = null;
        field1237 = null;
        field1239 = null;
        int var1 = -15 % ((arg0 + 54) / 55);
        field1240 = null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lnq;ILga;)V")
    public class104(class650 arg0, int arg1, class332 arg2) {
        this.field1232 = arg2;
        this.field1232.method1939(0, 26);
    }
}
