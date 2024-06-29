import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class15 extends class182 {

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    private int field441 = 4096;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    private int field447 = 0;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    private int field448 = 12288;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    private int field455 = 2048;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    private int field443 = 2048;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
    private int field459 = 8192;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "[B")
    public static byte[] field445 = new byte[32896];

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lbn;")
    public static class75 field450;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z", line = 4)
    private final boolean method152(int arg0, int arg1, int arg2) {
        if (arg2 <= 97) {
            return true;
        }
        int var4 = (arg1 - arg0) * this.field448 >> 12;
        field460++;
        int var5 = class107.field1937[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field448;
        int var7 = (var6 << 12) / this.field459;
        int var8 = this.field441 * var7 >> 12;
        return (arg0 + arg1) < var8 && (-var8) < (arg0 + arg1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Loe;IB)V", line = 22)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            this.method125(114, -111);
        }
        if (arg1 == 0) {
            this.field443 = arg0.method989(arg2 ^ 0x59);
        } else if (arg1 == 1) {
            this.field453 = arg0.method989(arg2 + 46);
        } else if (arg1 == 2) {
            this.field447 = arg0.method989(87);
        } else if (arg1 == 3) {
            this.field455 = arg0.method989(102);
        } else if (arg1 == 4) {
            this.field448 = arg0.method989(86);
        } else if (arg1 == 5) {
            this.field441 = arg0.method989(94);
        } else if (arg1 == 6) {
            this.field459 = arg0.method989(76);
        }
        field454++;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V", line = 104)
    public static final void method153(int arg0) {
        field457++;
        class274.field4463.method895(128);
        if (arg0 != -1) {
            field452 = -66;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V", line = 115)
    public static final void method154(byte arg0) {
        field439++;
        int var1 = -87 / ((-arg0 - 15) / 40);
        class229.field3755.method895(128);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V", line = 125)
    public static final void method155(byte arg0) {
        class292.field4735.method895(128);
        if (arg0 < -122) {
            field449++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqc;)V", line = 138)
    public static final void method156(int arg0, class6 arg1) {
        field438++;
        arg1.field189 = false;
        if (arg1.field206 != -1) {
            class300 var2 = class258.method1807(arg1.field206, 74);
            if (var2 == null || var2.field4885 == null) {
                arg1.field206 = -1;
            } else {
                arg1.field177++;
                if (arg1.field150 < var2.field4885.length && arg1.field177 > var2.field4877[arg1.field150]) {
                    arg1.field150++;
                    arg1.field149++;
                    arg1.field177 = 1;
                    class347.method2479(class96.field1750 == arg1, (byte) -69, var2, arg1.field150, arg1.field199, arg1.field213);
                }
                if (var2.field4885.length <= arg1.field150) {
                    arg1.field150 = 0;
                    arg1.field177 = 0;
                    class347.method2479(class96.field1750 == arg1, (byte) -111, var2, arg1.field150, arg1.field199, arg1.field213);
                }
                arg1.field149 = arg1.field150 + 1;
                if (arg1.field149 >= var2.field4885.length) {
                    arg1.field149 = 0;
                }
            }
        }
        if (arg1.field127 != -1 && arg1.field209 <= class267.field4371) {
            class198 var3 = class134.method944(arg0 + 13352, arg1.field127);
            int var4 = var3.field3322;
            if (var4 == -1) {
                arg1.field127 = -1;
            } else {
                label318: {
                    class300 var5 = class258.method1807(var4, 81);
                    if (var3.field3316) {
                        if (var5.field4870 == 3) {
                            if (arg1.field212 > 0 && arg1.field172 <= class267.field4371 && arg1.field161 < class267.field4371) {
                                arg1.field127 = -1;
                                break label318;
                            }
                        } else if (var5.field4870 == 1 && arg1.field212 > 0 && class267.field4371 >= arg1.field172 && arg1.field161 < class267.field4371) {
                            arg1.field209 = class267.field4371 + 1;
                            break label318;
                        }
                    }
                    if (var5 == null || var5.field4885 == null) {
                        arg1.field127 = -1;
                    } else {
                        if (arg1.field147 < 0) {
                            arg1.field147 = 0;
                            class347.method2479(class96.field1750 == arg1, (byte) -122, var5, 0, arg1.field199, arg1.field213);
                        }
                        arg1.field153++;
                        if (var5.field4885.length > arg1.field147 && arg1.field153 > var5.field4877[arg1.field147]) {
                            arg1.field153 = 1;
                            arg1.field147++;
                            class347.method2479(class96.field1750 == arg1, (byte) -113, var5, arg1.field147, arg1.field199, arg1.field213);
                        }
                        if (arg1.field147 >= var5.field4885.length) {
                            if (var3.field3316) {
                                arg1.field147 -= var5.field4871;
                                arg1.field132++;
                                if (arg1.field132 >= var5.field4875) {
                                    arg1.field127 = -1;
                                } else if (arg1.field147 >= 0 && var5.field4885.length > arg1.field147) {
                                    class347.method2479(class96.field1750 == arg1, (byte) -88, var5, arg1.field147, arg1.field199, arg1.field213);
                                } else {
                                    arg1.field127 = -1;
                                }
                            } else {
                                arg1.field127 = -1;
                            }
                        }
                        arg1.field204 = arg1.field147 + 1;
                        if (arg1.field204 >= var5.field4885.length) {
                            if (var3.field3316) {
                                arg1.field204 -= var5.field4871;
                                if (var5.field4875 <= arg1.field132 + 1) {
                                    arg1.field204 = -1;
                                } else if (arg1.field204 < 0 || arg1.field204 >= var5.field4885.length) {
                                    arg1.field204 = -1;
                                }
                            } else {
                                arg1.field204 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field166 != -1 && arg1.field180 <= 1) {
            class300 var6 = class258.method1807(arg1.field166, 80);
            if (var6.field4870 == 3) {
                if (arg1.field212 > 0 && arg1.field172 <= class267.field4371 && class267.field4371 > arg1.field161) {
                    arg1.field166 = -1;
                }
            } else if (var6.field4870 == 1 && arg1.field212 > 0 && class267.field4371 >= arg1.field172 && arg1.field161 < class267.field4371) {
                arg1.field180 = 2;
            }
        }
        if (arg1.field166 != -1 && arg1.field180 == 0) {
            class300 var7 = class258.method1807(arg1.field166, arg0 ^ 0xFFFFCB93);
            if (var7 == null || var7.field4885 == null) {
                arg1.field166 = -1;
            } else {
                arg1.field210++;
                if (arg1.field220 < var7.field4885.length && var7.field4877[arg1.field220] < arg1.field210) {
                    arg1.field220++;
                    arg1.field210 = 1;
                    class347.method2479(class96.field1750 == arg1, (byte) -47, var7, arg1.field220, arg1.field199, arg1.field213);
                }
                if (arg1.field220 >= var7.field4885.length) {
                    arg1.field220 -= var7.field4871;
                    arg1.field191++;
                    if (arg1.field191 >= var7.field4875) {
                        arg1.field166 = -1;
                    } else if (arg1.field220 >= 0 && arg1.field220 < var7.field4885.length) {
                        class347.method2479(class96.field1750 == arg1, (byte) -53, var7, arg1.field220, arg1.field199, arg1.field213);
                    } else {
                        arg1.field166 = -1;
                    }
                }
                arg1.field203 = arg1.field220 + 1;
                if (arg1.field203 >= var7.field4885.length) {
                    arg1.field203 -= var7.field4871;
                    if ((arg1.field191 + 1) >= var7.field4875) {
                        arg1.field203 = -1;
                    } else if (arg1.field203 < 0 || arg1.field203 >= var7.field4885.length) {
                        arg1.field203 = -1;
                    }
                }
                arg1.field189 = var7.field4867;
            }
        }
        if (arg1.field180 > 0) {
            arg1.field180--;
        }
        if (arg0 != -13351) {
            return;
        }
        for (int var8 = 0; var8 < arg1.field167.length; var8++) {
            class242 var9 = arg1.field167[var8];
            if (var9 != null) {
                if (var9.field4043 > 0) {
                    var9.field4043--;
                } else {
                    class300 var10 = class258.method1807(var9.field4045, 91);
                    if (var10 == null || var10.field4885 == null) {
                        arg1.field167[var8] = null;
                    } else {
                        var9.field4046++;
                        if (var10.field4885.length > var9.field4041 && var10.field4877[var9.field4041] < var9.field4046) {
                            var9.field4046 = 1;
                            var9.field4041++;
                            class347.method2479(class96.field1750 == arg1, (byte) -128, var10, var9.field4041, arg1.field199, arg1.field213);
                        }
                        if (var10.field4885.length <= var9.field4041) {
                            var9.field4041 -= var10.field4871;
                            var9.field4042++;
                            if (var10.field4875 <= var9.field4042) {
                                arg1.field167[var8] = null;
                            } else if (var9.field4041 >= 0 && var10.field4885.length > var9.field4041) {
                                class347.method2479(class96.field1750 == arg1, (byte) -97, var10, var9.field4041, arg1.field199, arg1.field213);
                            } else {
                                arg1.field167[var8] = null;
                            }
                        }
                        var9.field4044 = var9.field4041 + 1;
                        if (var10.field4885.length <= var9.field4044) {
                            var9.field4044 -= var10.field4871;
                            if (var9.field4042 + 1 >= var10.field4875) {
                                var9.field4044 = -1;
                            } else if (var9.field4044 < 0 || var10.field4885.length <= var9.field4044) {
                                var9.field4044 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lhm;", line = 445)
    public static final class24 method157(int arg0, byte arg1) {
        if (arg1 < 27) {
            method157(49, (byte) 121);
        }
        class24 var2 = (class24) class331.field5290.method893((long) arg0, 71);
        field446++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field645.method1404(0, arg0, (byte) -72);
        class24 var4 = new class24();
        if (var3 != null) {
            var4.method206(4, new class146(var3));
        }
        var4.method205(-17342);
        class331.field5290.method888((long) arg0, var4, 100);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)I", line = 473)
    public static final int method158(int arg0, int arg1) {
        if (arg1 != -26846) {
            method160(53, (byte) 111, 93);
        }
        field437++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V", line = 485)
    public static final void method159(int arg0, int arg1) {
        field456++;
        if (arg0 == arg1) {
            return;
        }
        if (arg1 == 1) {
            class75.method577(-27220);
        } else if (arg1 == 2) {
            class190.method1317(69);
        } else if (arg1 == 3) {
            class353.method2512(-1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 583)
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IBI)V", line = 518)
    public static final void method160(int arg0, byte arg1, int arg2) {
        class105.field1914 = arg2 - class38.field826;
        field458++;
        class170.field2809 = class38.field820 + class38.field821 - arg0 - 1;
        int var3 = 125 % ((-arg1) / 59);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I", line = 534)
    public final int[] method125(int arg0, int arg1) {
        int[] var3 = this.field3166.method775(arg1, 125);
        if (arg0 != 2) {
            return (int[]) null;
        }
        field442++;
        if (this.field3166.field1903) {
            int var4 = class248.field4066[arg1] - 2048;
            for (int var5 = 0; var5 < class26.field672; var5++) {
                int var6 = class21.field539[var5] - 2048;
                int var7 = var6 + this.field443;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = this.field453 + var4;
                int var10 = var8 > 2048 ? var8 - 4096 : var8;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = this.field447 + var6;
                int var14 = var4 + this.field455;
                int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                int var16 = var13 >= -2048 ? var13 : var13 + 4096;
                int var17 = var16 > 2048 ? var16 - 4096 : var16;
                int var18 = var15 > 2048 ? var15 - 4096 : var15;
                var3[var5] = this.method152(var10, var12, 125) || this.method164(var18, -116, var17) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/awt/Component;)Lv;", line = 588)
    public static final class83 method161(int arg0, int arg1, int arg2, Component arg3) {
        field461++;
        try {
            Class var4 = Class.forName("ac");
            class83 var5 = (class83) var4.getDeclaredConstructor().newInstance();
            if (arg1 >= -25) {
                method153(-115);
            }
            var5.method618(-732, arg0, arg2, arg3);
            return var5;
        } catch (Throwable var8) {
            class160 var7 = new class160();
            var7.method618(-732, arg0, arg2, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V", line = 611)
    public static void method162(byte arg0) {
        if (arg0 < 22) {
            method155((byte) 73);
        }
        field450 = null;
        field445 = null;
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 629)
    public final void method163(int arg0) {
        if (arg0 != 100) {
            method155((byte) 78);
        }
        class219.method1526(256);
        field440++;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(III)Z", line = 654)
    private final boolean method164(int arg0, int arg1, int arg2) {
        field444++;
        int var4 = (arg0 + arg2) * this.field448 >> 12;
        if (arg1 >= -102) {
            method157(-74, (byte) -40);
        }
        int var5 = class107.field1937[(var4 * 255 & 0xFFE56) >> 12];
        int var6 = (var5 << 12) / this.field448;
        int var7 = (var6 << 12) / this.field459;
        int var8 = this.field441 * var7 >> 12;
        return (arg0 - arg2) < var8 && (arg0 - arg2) > (-var8);
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V", line = 674)
    public static final void method165(int arg0) {
        int var1 = 32 % ((-arg0 - 7) / 45);
        class51.field1038.method291((byte) -105, 60);
        class251.field4120++;
        field451++;
        class51.field1038.method1002((byte) -79, class26.field677);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field445[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
