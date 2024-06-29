import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class55 {

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    private int field1021 = 32;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "J")
    private long field1035 = class206.method1420(false);

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "Z")
    private boolean field1039 = true;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[Lef;")
    private class51[] field1037 = new class51[8];

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "J")
    private long field1045 = 0L;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    private int field1046 = 0;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    private int field1042 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    private int field1048 = 0;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "J")
    private long field1044 = 0L;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    private int field1049 = 0;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "[Lef;")
    private class51[] field1051 = new class51[8];

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Li;")
    public static class88 field1015 = class208.method1425(105, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "[I")
    public static int[] field1023 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "Lhj;")
    public static class87 field1032 = null;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Li;")
    private static class88 field1034 = class208.method1425(105, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field1033 = -1;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Li;")
    public static class88 field1016 = field1034;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field1027 = 0;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Lef;")
    private class51 field1036;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
    public int[] field1025;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()I")
    public int method398() throws Exception {
        field1031++;
        return this.field1038;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    private final void method399(int arg0, int arg1) {
        field1020++;
        this.field1046 -= arg0;
        if (arg1 > this.field1046) {
            this.field1046 = 0;
        }
        if (this.field1036 != null) {
            this.field1036.method384(arg0);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()V")
    public void method400() throws Exception {
        field1019++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public final synchronized void method401(int arg0) {
        this.field1039 = true;
        try {
            this.method413();
        } catch (Exception var2) {
            this.method408();
            this.field1045 = class206.method1420(false) + 2000L;
        }
        if (arg0 >= -108) {
            this.field1044 = -67L;
        }
        field1028++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public final synchronized void method402(int arg0) {
        if (class146.field2740 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class146.field2740.field3104[var3] == this) {
                    class146.field2740.field3104[var3] = null;
                }
                if (class146.field2740.field3104[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class146.field2740.field3108 = true;
                while (class146.field2740.field3109) {
                    class21.method98(50L, (byte) 38);
                }
                class146.field2740 = null;
            }
        }
        this.method408();
        this.field1025 = null;
        field1014++;
        if (arg0 != 0) {
            this.method405(null, 6);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public final void method403(boolean arg0) {
        this.field1039 = arg0;
        field1040++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILef;)V")
    private final void method404(int arg0, int arg1, class51 arg2) {
        field1017++;
        int var4 = arg1 >> 5;
        if (arg0 != 9844) {
            return;
        }
        class51 var5 = this.field1037[var4];
        if (var5 == null) {
            this.field1051[var4] = arg2;
        } else {
            var5.field936 = arg2;
        }
        this.field1037[var4] = arg2;
        arg2.field934 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([II)V")
    private final void method405(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class7.field99) {
            var3 = arg1 << 1;
        }
        class124.method837(arg0, 0, var3);
        this.field1046 -= arg1;
        if (this.field1036 != null && this.field1046 <= 0) {
            this.field1046 += class11.field161 >> 4;
            class21.method99(-46, this.field1036);
            this.method404(9844, this.field1036.method382(), this.field1036);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class51 var10 = null;
                        class51 var11 = this.field1051[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class69 var12 = var11.field935;
                                if (var12 == null || var12.field1254 <= var8) {
                                    var11.field937 = true;
                                    int var13 = var11.method383();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1254 += var13;
                                    }
                                    if (var4 >= this.field1021) {
                                        break label107;
                                    }
                                    class51 var14 = var11.method385();
                                    if (var14 != null) {
                                        int var15 = var11.field934;
                                        while (var14 != null) {
                                            this.method404(9844, var15 * var14.method382() >> 8, var14);
                                            var14 = var11.method380();
                                        }
                                    }
                                    class51 var16 = var11.field936;
                                    var11.field936 = null;
                                    if (var10 == null) {
                                        this.field1051[var7] = var16;
                                    } else {
                                        var10.field936 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1037[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field936;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class51 var18 = this.field1051[var17];
                this.field1051[var17] = this.field1037[var17] = null;
                while (var18 != null) {
                    class51 var19 = var18.field936;
                    var18.field936 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1046 < 0) {
            this.field1046 = 0;
        }
        if (this.field1036 != null) {
            this.field1036.method379(arg0, 0, arg1);
        }
        this.field1035 = class206.method1420(false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public final synchronized void method406(byte arg0) {
        field1030++;
        if (this.field1025 == null) {
            return;
        }
        long var2 = class206.method1420(false);
        if (arg0 != -70) {
            this.field1042 = -127;
        }
        try {
            if (this.field1045 != 0L) {
                if (var2 < this.field1045) {
                    return;
                }
                this.method409(this.field1038);
                this.field1045 = 0L;
                this.field1039 = true;
            }
            int var4 = this.method398();
            int var5 = this.field1052 + this.field1043;
            if (this.field1049 - var4 > this.field1042) {
                this.field1042 = this.field1049 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1038 < var5 + 256) {
                var4 = 0;
                this.field1038 += 1024;
                if (this.field1038 > 16384) {
                    this.field1038 = 16384;
                }
                this.method408();
                this.method409(this.field1038);
                this.field1039 = true;
                if (var5 + 256 > this.field1038) {
                    var5 = this.field1038 - 256;
                    this.field1052 = var5 - this.field1043;
                }
            }
            while (var4 < var5) {
                this.method405(this.field1025, 256);
                this.method400();
                var4 += 256;
            }
            if (var2 > this.field1044) {
                if (this.field1039) {
                    this.field1039 = false;
                } else if (this.field1042 == 0 && this.field1048 == 0) {
                    this.method408();
                    this.field1045 = var2 + 2000L;
                    return;
                } else {
                    this.field1052 = Math.min(this.field1048, this.field1042);
                    this.field1048 = this.field1042;
                }
                this.field1042 = 0;
                this.field1044 = var2 + 2000L;
            }
            this.field1049 = var4;
        } catch (Exception var7) {
            this.method408();
            this.field1045 = var2 + 2000L;
        }
        try {
            if (var2 > this.field1035 + 500000L) {
                var2 = this.field1035;
            }
            while (var2 > this.field1035 + 5000L) {
                this.method399(256, arg0 + 70);
                this.field1035 += 256000 / class11.field161;
            }
        } catch (Exception var6) {
            this.field1035 = var2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I")
    public static final int method407(int arg0, int arg1) {
        field1029++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        if (arg1 != -13816) {
            field1033 = 76;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()V")
    public void method408() {
        field1026++;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public void method409(int arg0) throws Exception {
        field1018++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lef;I)V")
    public final synchronized void method410(class51 arg0, int arg1) {
        field1050++;
        if (arg1 != 8) {
            method411(null, -59, 85, -89, -120, 6, 99, 121, true);
        }
        this.field1036 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lih;IIIIIIIZ)V")
    public static final void method411(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class74.field1353;
        int var11;
        int var12 = var11 = (arg7 << 7) - class216.field4050;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class62.field1137[arg1][arg6][arg7] - class241.field4463;
        int var18 = class62.field1137[arg1][arg6 + 1][arg7] - class241.field4463;
        int var19 = class62.field1137[arg1][arg6 + 1][arg7 + 1] - class241.field4463;
        int var20 = class62.field1137[arg1][arg6][arg7 + 1] - class241.field4463;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class173.field3365;
        int var46 = (var24 << 9) / var25 + class173.field3363;
        int var47 = (var27 << 9) / var31 + class173.field3365;
        int var48 = (var30 << 9) / var31 + class173.field3363;
        int var49 = (var33 << 9) / var37 + class173.field3365;
        int var50 = (var36 << 9) / var37 + class173.field3363;
        int var51 = (var39 << 9) / var43 + class173.field3365;
        int var52 = (var42 << 9) / var43 + class173.field3363;
        class173.field3350 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class118.field2147 && class23.method122(class39.field698 + class173.field3365, class35.field621 + class173.field3363, var50, var52, var48, var49, var51, var47)) {
                class114.field2059 = arg6;
                class90.field1715 = arg7;
            }
            if (!arg8) {
                class173.field3360 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class173.field3352 || var51 > class173.field3352 || var47 > class173.field3352) {
                    class173.field3360 = true;
                }
                if (arg0.field1764 == -1) {
                    if (arg0.field1767 != 12345678) {
                        class173.method1229(var50, var52, var48, var49, var51, var47, arg0.field1767, arg0.field1760, arg0.field1774);
                    }
                } else if (class104.field1884) {
                    int var53 = class173.field3358.method438(123, arg0.field1764);
                    class173.method1229(var50, var52, var48, var49, var51, var47, class117.method793(var53, arg0.field1767), class117.method793(var53, arg0.field1760), class117.method793(var53, arg0.field1774));
                } else if (arg0.field1770) {
                    class173.method1227(var50, var52, var48, var49, var51, var47, arg0.field1767, arg0.field1760, arg0.field1774, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1764);
                } else {
                    class173.method1227(var50, var52, var48, var49, var51, var47, arg0.field1767, arg0.field1760, arg0.field1774, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1764);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class118.field2147 && class23.method122(class39.field698 + class173.field3365, class35.field621 + class173.field3363, var46, var48, var52, var45, var47, var51)) {
            class114.field2059 = arg6;
            class90.field1715 = arg7;
        }
        if (arg8) {
            return;
        }
        class173.field3360 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class173.field3352 || var47 > class173.field3352 || var51 > class173.field3352) {
            class173.field3360 = true;
        }
        if (arg0.field1764 != -1) {
            if (!class104.field1884) {
                class173.method1227(var46, var48, var52, var45, var47, var51, arg0.field1762, arg0.field1774, arg0.field1760, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1764);
                return;
            }
            int var54 = class173.field3358.method438(120, arg0.field1764);
            class173.method1229(var46, var48, var52, var45, var47, var51, class117.method793(var54, arg0.field1762), class117.method793(var54, arg0.field1774), class117.method793(var54, arg0.field1760));
        } else if (arg0.field1762 != 12345678) {
            class173.method1229(var46, var48, var52, var45, var47, var51, arg0.field1762, arg0.field1774, arg0.field1760);
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method412(Component arg0) throws Exception {
        field1024++;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()V")
    public void method413() throws Exception {
        field1047++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public static void method414(boolean arg0) {
        field1016 = null;
        field1015 = null;
        field1034 = null;
        if (arg0) {
            field1041 = 81;
        }
        field1023 = null;
    }
}
