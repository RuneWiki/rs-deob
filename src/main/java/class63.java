import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class63 extends class300 {

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    private int field912 = -1;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field916 = 1;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "Ljava/lang/String;")
    public static String field913 = "Loading textures - ";

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
    public static boolean field911 = false;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field918 = -1;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "[I")
    public int[] field917;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static void method402(int arg0) {
        if (arg0 != 0) {
            field916 = -20;
        }
        field913 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvl;Z)Z")
    public static final boolean method403(class73 arg0, boolean arg1) {
        if (!arg1) {
            return true;
        } else {
            ++field909;
            return arg0.method509(27635, class129.field1860);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V")
    public static final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class112.field1624[0].method621(arg3, arg1);
        int var6 = (arg2 + -32) * arg2 / arg5;
        ++field920;
        class112.field1624[1].method621(arg3, arg1 + arg2 + -16);
        if (~var6 > -9) {
            var6 = 8;
        }
        int var7 = (arg2 - 32 - var6) * arg4 / (-arg2 + arg5);
        class151.method1026(arg3, arg1 - -16, 16, arg2 + -32, class144.field2144);
        class151.method1026(arg3, arg1 + var7 + 16, 16, var6, class1.field20);
        class151.method1021(arg3, var7 + 16 + arg1, var6, class36.field436);
        class151.method1021(arg3 + 1, arg1 - -var7 + 16, var6, class36.field436);
        class151.method1027(arg3, arg1 + var7 - -16, 16, class36.field436);
        class151.method1027(arg3, arg1 + var7 - -17, 16, class36.field436);
        class151.method1021(arg3 - -15, arg1 - -16 + var7, var6, class182.field2865);
        class151.method1021(arg0 + arg3, arg1 - -17 + var7, var6 - 1, class182.field2865);
        class151.method1027(arg3, arg1 - (-var7 + -15 - var6), 16, class182.field2865);
        class151.method1027(arg3 - -1, arg1 - -14 + var6 + var7, 15, class182.field2865);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public final void method405(byte arg0) {
        ++field919;
        super.method405(arg0);
        this.field917 = null;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)I")
    public final int method406(byte arg0) {
        if (arg0 >= -40) {
            this.field921 = -35;
        }
        ++field906;
        return this.field912;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class63() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)Z")
    public final boolean method407(int arg0) {
        ++field922;
        if (this.field917 != null) {
            return true;
        } else {
            if (arg0 != -1) {
                this.method406((byte) 49);
            }
            if (this.field912 >= 0) {
                class48 var2 = ~class61.field887 <= -1 ? class62.method400((byte) 116, this.field912, class61.field887, class305.field4847) : class96.method659((byte) -75, class305.field4847, this.field912);
                var2.method295();
                this.field914 = var2.field3351;
                this.field921 = var2.field3353;
                this.field917 = var2.field602;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[[I")
    public int[][] method36(int arg0, int arg1) {
        int[][] var3 = super.field4786.method538(arg1, (byte) -41);
        int var4 = 57 % (-arg0 / 47);
        ++field910;
        if (super.field4786.field1200 && this.method407(-1)) {
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field921 * (~class4.field61 != ~this.field914 ? this.field914 * arg1 / class4.field61 : arg1);
            int[] var8 = var3[0];
            if (class180.field2826 != this.field921) {
                for (int var9 = 0; class180.field2826 > var9; ++var9) {
                    int var10 = this.field921 * var9 / class180.field2826;
                    int var11 = this.field917[var7 + var10];
                    var6[var9] = class205.method1411(var11 << 4, 4080);
                    var5[var9] = class205.method1411(65280, var11) >> 4;
                    var8[var9] = class205.method1411(var11 >> 12, 4080);
                }
            } else {
                for (int var12 = 0; class180.field2826 > var12; ++var12) {
                    int var13 = this.field917[var7++];
                    var6[var12] = class205.method1411(var13, 255) << 4;
                    var5[var12] = class205.method1411(var13, 65280) >> 4;
                    var8[var12] = class205.method1411(4080, var13 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field907;
        if (~arg2 == -1) {
            this.field912 = arg0.method1186((byte) -40);
        }
        if (arg1 > -43) {
            field916 = 46;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILfe;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method408(int arg0, class231 arg1, String arg2) {
        if (arg0 != 16) {
            return null;
        } else {
            ++field908;
            if (~arg2.indexOf("%") != 0) {
                while (true) {
                    int var3 = arg2.indexOf("%1");
                    if (~var3 == 0) {
                        while (true) {
                            int var4 = arg2.indexOf("%2");
                            if (~var4 == 0) {
                                while (true) {
                                    int var5 = arg2.indexOf("%3");
                                    if (~var5 == 0) {
                                        while (true) {
                                            int var6 = arg2.indexOf("%4");
                                            if (~var6 == 0) {
                                                while (true) {
                                                    int var7 = arg2.indexOf("%5");
                                                    if (var7 == -1) {
                                                        while (true) {
                                                            int var8 = arg2.indexOf("%dns");
                                                            if (var8 == -1) {
                                                                return arg2;
                                                            }
                                                            String var9 = "";
                                                            if (class307.field4914 != null) {
                                                                if (class307.field4914.field2401 != null) {
                                                                    var9 = (String) class307.field4914.field2401;
                                                                } else {
                                                                    var9 = class271.method1888(class307.field4914.field2398, 6139);
                                                                }
                                                            }
                                                            arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                        }
                                                    }
                                                    arg2 = arg2.substring(0, var7) + class57.method365(class6.method33(arg0 ^ -35, arg1, 4), 58) + arg2.substring(var7 + 2);
                                                }
                                            }
                                            arg2 = arg2.substring(0, var6) + class57.method365(class6.method33(arg0 ^ -4, arg1, 3), 115) + arg2.substring(var6 + 2);
                                        }
                                    }
                                    arg2 = arg2.substring(0, var5) + class57.method365(class6.method33(7, arg1, 2), arg0 ^ 5) + arg2.substring(var5 - -2);
                                }
                            }
                            arg2 = arg2.substring(0, var4) + class57.method365(class6.method33(127, arg1, 1), 127) + arg2.substring(var4 + 2);
                        }
                    }
                    arg2 = arg2.substring(0, var3) + class57.method365(class6.method33(125, arg1, 0), 38) + arg2.substring(var3 + 2);
                }
            } else {
                return arg2;
            }
        }
    }
}
