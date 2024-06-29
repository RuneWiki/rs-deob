import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class50 {

    @OriginalMember(owner = "client!hb", name = "Sc", descriptor = "[I")
    public static int[] field1025 = new int[4000];

    @OriginalMember(owner = "client!hb", name = "Oc", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1021 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hb", name = "Wc", descriptor = "Z")
    public static boolean field1029 = true;

    @OriginalMember(owner = "client!hb", name = "Yc", descriptor = "Lsc;")
    private static class128 field1031 = class129.method1017(false, "Enter your username (V password)3");

    @OriginalMember(owner = "client!hb", name = "Xc", descriptor = "Lsc;")
    public static class128 field1030 = class129.method1017(false, "::gc");

    @OriginalMember(owner = "client!hb", name = "ad", descriptor = "[J")
    public static long[] field1033 = new long[100];

    @OriginalMember(owner = "client!hb", name = "Zc", descriptor = "[[I")
    public static int[][] field1032 = new int[104][104];

    @OriginalMember(owner = "client!hb", name = "dd", descriptor = "Lsc;")
    public static class128 field1036 = field1031;

    @OriginalMember(owner = "client!hb", name = "bd", descriptor = "Lrb;")
    public static class120 field1034 = new class120(64);

    @OriginalMember(owner = "client!hb", name = "Mc", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hb", name = "Nc", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hb", name = "Pc", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!hb", name = "Qc", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!hb", name = "Rc", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!hb", name = "Tc", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hb", name = "Uc", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!hb", name = "cd", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!hb", name = "Vc", descriptor = "Lid;")
    public class60 field1028;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([Lsc;Z)Lsc;")
    public static final class128 method395(class128[] arg0, boolean arg1) {
        ++field1027;
        if (arg1) {
            field1035 = -123;
        }
        if (~arg0.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class70.method524(arg0, 0, arg0.length, 57);
        }
    }

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
    public static void method396(int arg0) {
        field1032 = null;
        field1025 = null;
        field1021 = null;
        field1033 = null;
        if (arg0 != -18199) {
            field1025 = null;
        }
        field1030 = null;
        field1031 = null;
        field1036 = null;
        field1034 = null;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)Llb;")
    public final class78 method1(int arg0) {
        ++field1019;
        if (this.field1028 == null) {
            return null;
        } else {
            class134 var2 = super.field981 != -1 && ~super.field970 == -1 ? class70.method527(12, super.field981) : null;
            class134 var3 = ~super.field958 == 0 || super.field958 == super.field1009 && var2 != null ? null : class70.method527(12, super.field958);
            if (arg0 != -20521144) {
                return null;
            } else {
                class78 var4 = this.field1028.method460(var2, super.field955, -1, super.field973, var3);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method584();
                    super.field956 = var4.field3593;
                    if (~super.field968 != 0 && super.field998 != -1) {
                        class78 var5 = class147.method1184(super.field968, arg0 + 20521157).method858(super.field998, arg0 ^ 20521179);
                        if (var5 != null) {
                            var5.method583(0, -super.field961, 0);
                            class78[] var6 = new class78[] { var4, var5 };
                            var4 = new class78(var6, 2);
                        }
                    }
                    if (~this.field1028.field1290 == -2) {
                        var4.field1699 = true;
                    }
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)V")
    public static final void method397(int arg0) {
        ++field1023;
        if (arg0 != -5472) {
            method395((class128[]) null, true);
        }
        if (~class89.field2044 < -1) {
            for (int var1 = 0; var1 < 256; ++var1) {
                if (~class89.field2044 >= -769) {
                    if (~class89.field2044 < -257) {
                        class27.field533[var1] = class35.field653[var1];
                    } else {
                        class27.field533[var1] = class150.method1195(-97, class20.field389[var1], -class89.field2044 + 256, class35.field653[var1]);
                    }
                } else {
                    class27.field533[var1] = class150.method1195(arg0 + 5355, class35.field653[var1], -class89.field2044 + 1024, class20.field389[var1]);
                }
            }
        } else if (class131.field3038 > 0) {
            for (int var2 = 0; var2 < 256; ++var2) {
                if (class131.field3038 <= 768) {
                    if (~class131.field3038 < -257) {
                        class27.field533[var2] = class43.field798[var2];
                    } else {
                        class27.field533[var2] = class150.method1195(arg0 + 5363, class20.field389[var2], -class131.field3038 + 256, class43.field798[var2]);
                    }
                } else {
                    class27.field533[var2] = class150.method1195(-118, class43.field798[var2], -class131.field3038 + 1024, class20.field389[var2]);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; ++var3) {
                class27.field533[var3] = class20.field389[var3];
            }
        }
        short var4 = 256;
        class138.method1125(0, 9, 128, var4 + 7);
        int var5 = 0;
        int var6 = 6885;
        class151.field3475.method40(0, 0);
        class138.method1138();
        for (int var7 = 1; var4 + -1 > var7; ++var7) {
            int var20 = (-var7 + var4) * class157.field3604[var7] / var4;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; ~var22 > -129; ++var22) {
                int var23 = class148.field3422[var5++];
                if (var23 != 0) {
                    int var24 = -var23 + 256;
                    int var26 = class27.field533[var23];
                    int var27 = class5.field51.field2780[var6];
                    class5.field51.field2780[var6++] = class25.method224(class25.method224(var27, 16711935) * var24 + var23 * class25.method224(var26, 16711935), -16711936) + class25.method224(16711680, var24 * class25.method224(65280, var27) + var23 * class25.method224(65280, var26)) >> 8;
                } else {
                    ++var6;
                }
            }
            var6 += var21 + 765 + -128;
        }
        int var8 = 0;
        int var9 = 7546;
        class138.method1125(637, 9, 765, var4 - -7);
        class152.field3514.method40(382, 0);
        class138.method1138();
        for (int var10 = 1; var10 < var4 + -1; ++var10) {
            int var11 = (-var10 + var4) * class157.field3604[var10] / var4;
            int var12 = var9 + var11;
            int var13 = -var11 + 103;
            for (int var14 = 0; ~var14 > ~var13; ++var14) {
                int var15 = class148.field3422[var8++];
                if (~var15 == -1) {
                    ++var12;
                } else {
                    int var17 = -var15 + 256;
                    int var18 = class27.field533[var15];
                    int var19 = class5.field51.field2780[var12];
                    class5.field51.field2780[var12++] = class25.method224(-16711936, class25.method224(16711935, var19) * var17 + var15 * class25.method224(var18, 16711935)) + class25.method224(var17 * class25.method224(var19, 65280) + class25.method224(var18, 65280) * var15, 16711680) >> 8;
                }
            }
            var8 += -var13 + 128;
            var9 = -var11 + 765 - var13 + var12;
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)Z")
    public final boolean method391(int arg0) {
        ++field1022;
        if (arg0 != -30036) {
            return false;
        } else {
            return this.field1028 != null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lhd;IIB)V")
    public static final void method398(class53 arg0, int arg1, int arg2, byte arg3) {
        if ((32 & arg1) != 0) {
            arg0.field1001 = class158.field3626.method670(-1);
            if (~arg0.field1001.method981(false, 0) == -127) {
                arg0.field1001 = arg0.field1001.method998((byte) 65, 1);
                class126.method958(2, 1, arg0.field1050, arg0.field1001);
            } else if (class151.field3473 == arg0) {
                class126.method958(2, 1, arg0.field1050, arg0.field1001);
            }
            arg0.field1002 = 0;
            arg0.field1003 = 150;
            arg0.field990 = 0;
        }
        ++field1026;
        if ((arg1 & 256) != 0) {
            int var4 = class158.field3626.method659(96);
            int var5 = class158.field3626.method658(255);
            arg0.method390(false, var5, class29.field554, var4);
            arg0.field979 = class29.field554 + 300;
            arg0.field952 = class158.field3626.method659(63);
            arg0.field993 = class158.field3626.method668(-24845);
        }
        if (~(4 & arg1) != -1) {
            int var6 = class158.field3626.method659(-85);
            byte[] var7 = new byte[var6];
            class86 var8 = new class86(var7);
            class158.field3626.method663(var6, -19, var7, 0);
            class129.field2959[arg2] = var8;
            arg0.method405(true, var8);
        }
        if (~(64 & arg1) != -1) {
            int var9 = class158.field3626.method650(65536);
            int var10 = class158.field3626.method646(-15447);
            if (var9 == 65535) {
                var9 = -1;
            }
            class137.method1121(var9, var10, 0, arg0);
        }
        if (~(1024 & arg1) != -1) {
            arg0.field968 = class158.field3626.method650(65536);
            int var11 = class158.field3626.method665((byte) -123);
            arg0.field1000 = (65535 & var11) + class29.field554;
            if (~arg0.field968 == -65536) {
                arg0.field968 = -1;
            }
            arg0.field961 = var11 >> 16;
            arg0.field998 = 0;
            arg0.field966 = 0;
            if (class29.field554 < arg0.field1000) {
                arg0.field998 = -1;
            }
        }
        if ((16 & arg1) != 0) {
            int var12 = class158.field3626.method659(-27);
            int var13 = class158.field3626.method658(255);
            arg0.method390(false, var13, class29.field554, var12);
            arg0.field979 = class29.field554 + 300;
            arg0.field952 = class158.field3626.method646(-15447);
            arg0.field993 = class158.field3626.method668(-24845);
        }
        if (~(arg1 & 1) != -1) {
            arg0.field980 = class158.field3626.method639(-106);
            arg0.field999 = class158.field3626.method650(65536);
        }
        if ((arg1 & 2) != 0) {
            arg0.field951 = class158.field3626.method632((byte) -80);
            if (arg0.field951 == 65535) {
                arg0.field951 = -1;
            }
        }
        if ((arg1 & 8) != 0) {
            int var14 = class158.field3626.method678(0);
            int var15 = class158.field3626.method659(120);
            int var16 = class158.field3626.method668(-24845);
            int var17 = class158.field3626.field1924;
            if (arg0.field1050 != null && arg0.field1043 != null) {
                long var18 = arg0.field1050.method973(-91);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; ~var21 > ~class151.field3476; ++var21) {
                        if (~field1033[var21] == ~var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && ~class79.field1770 == -1) {
                    class89.field2031.field1924 = 0;
                    class158.field3626.method642((byte) -35, 0, var16, class89.field2031.field1920);
                    class89.field2031.field1924 = 0;
                    class128 var22 = class133.method1061(class87.method680((byte) 122, class89.field2031).method1006(90));
                    arg0.field1001 = var22.method975(-1);
                    arg0.field990 = var14 & 255;
                    arg0.field1002 = var14 >> 8;
                    arg0.field1003 = 150;
                    if (var15 != 2 && ~var15 != -4) {
                        if (var15 == 1) {
                            class126.method958(1, 1, method395(new class128[] { class146.field3382, arg0.field1050 }, false), var22);
                        } else {
                            class126.method958(2, 1, arg0.field1050, var22);
                        }
                    } else {
                        class126.method958(1, 1, method395(new class128[] { class157.field3615, arg0.field1050 }, false), var22);
                    }
                }
            }
            class158.field3626.field1924 = var16 + var17;
        }
        if (arg3 < -83) {
            if (~(arg1 & 512) != -1) {
                arg0.field971 = class158.field3626.method668(-24845);
                arg0.field969 = class158.field3626.method659(-40);
                arg0.field982 = class158.field3626.method646(-15447);
                arg0.field974 = class158.field3626.method658(255);
                arg0.field949 = class158.field3626.method632((byte) -80) + class29.field554;
                arg0.field1014 = class158.field3626.method639(-124) - -class29.field554;
                arg0.field988 = class158.field3626.method659(127);
                arg0.field947 = 1;
                arg0.field1004 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZII)Lsc;")
    public static final class128 method399(boolean arg0, int arg1, int arg2) {
        int var3 = -arg1 + arg2;
        ++field1020;
        if (~var3 > 8) {
            return class79.field1776;
        } else {
            if (arg0) {
                field1033 = null;
            }
            if (var3 < -6) {
                return class21.field405;
            } else if (~var3 > 2) {
                return class108.field2456;
            } else if (~var3 > -1) {
                return client.field443;
            } else if (~var3 < -10) {
                return class104.field2360;
            } else if (var3 > 6) {
                return class82.field1812;
            } else if (~var3 < -4) {
                return class58.field1255;
            } else {
                return var3 > 0 ? class43.field811 : class25.field491;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "(I)V")
    public static final void method400(int arg0) {
        if (arg0 >= -49) {
            method399(true, -61, -81);
        }
        for (int var1 = 0; ~class41.field767 < ~var1; ++var1) {
            int var2 = class68.field1528[var1];
            class51 var3 = class92.field2104[var2];
            if (var3 != null) {
                class142.method1159(var3.field1028.field1290, 128, var3);
            }
        }
        ++field1024;
    }
}
