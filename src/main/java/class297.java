import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class297 extends class346 {

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    private int field4484 = 4096;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private int field4476 = 4096;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    private int field4488 = 4096;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "[I")
    private int[] field4483 = new int[3];

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    private int field4491 = 409;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "[Z")
    public static boolean[] field4482 = new boolean[100];

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "[C")
    public static char[] field4481 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field4480 = 0;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4489 = "Loaded textures";

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "B")
    public static byte field4478;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field4486;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288) {
            int[][] var4 = this.method2293(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class134.field1753 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field4483[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field4491) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field4483[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field4491 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4483[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field4491 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field4484 * var12 >> 12;
                            var9[var11] = this.field4488 * var14 >> 12;
                            var10[var11] = this.field4476 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (arg1 >= -3) {
            field4480 = 65;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V")
    public static final void method2010(boolean arg0) {
        ++field4485;
        class211.field2856 = null;
        if (arg0) {
            class84.method689(class233.field3246, 0, -1, (byte) -126, class435.field6313, 0, 0, 0, class357.field5298);
            if (class211.field2856 != null) {
                class377.method2462(class357.field5298, class435.field6313, class318.field4680, class211.field2856, class268.field3967.field3586, -1412584499, 0, 0, class122.field1584, 1);
                class211.field2856 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIBI)Lnn;")
    public static final class28 method2011(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4479;
        class28 var5 = new class28();
        var5.field482 = arg4;
        var5.field483 = arg1;
        class242.field3402.method2815(-1, (long) arg2, var5);
        if (arg3 != -120) {
            field4489 = null;
        }
        class100.method771(arg4, 0);
        class248 var6 = class27.method224(arg3 ^ -65417, arg2);
        if (var6 != null) {
            class92.method744(20491, var6);
        }
        if (class415.field6015 != null) {
            class92.method744(20491, class415.field6015);
            class415.field6015 = null;
        }
        class194.method1292(71);
        if (var6 != null) {
            class185.method1215(-1, !arg0, var6);
        }
        if (!arg0) {
            class293.method1988(arg4);
        }
        if (!arg0 && ~class233.field3246 != 0) {
            class276.method1817((byte) -122, class233.field3246, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class297() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static void method2012(byte arg0) {
        field4482 = null;
        if (arg0 == 10) {
            field4489 = null;
            field4481 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field4477;
        if (arg1) {
            this.method287(-72, -75);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method2249(32767);
                            this.field4483[1] = class394.method2529(var5 >> 4, 4080);
                            this.field4483[2] = class394.method2529(0, var5 >> 12);
                            this.field4483[0] = class394.method2529(var5 << 4, 267386880);
                        }
                    } else {
                        this.field4484 = arg0.method2239(-1076227960);
                    }
                } else {
                    this.field4488 = arg0.method2239(-1076227960);
                }
            } else {
                this.field4476 = arg0.method2239(-1076227960);
            }
        } else {
            this.field4491 = arg0.method2239(-1076227960);
        }
    }
}
