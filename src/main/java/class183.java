import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class183 extends class194 {

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    private int field2119 = 4096;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    private int field2124 = 0;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "Lhq;")
    public static class365 field2122 = new class365(256);

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Z")
    public static boolean field2125 = true;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "[[[B")
    public static byte[][][] field2126;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field2120;
        int var4 = -110 % ((arg1 - 52) / 61);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2119 = arg2.method1587((byte) -102);
            }
        } else {
            this.field2124 = arg2.method1587((byte) -102);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgi;III[Z)V")
    public static final void method1139(class416 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class75.field915 != class304.field4096) {
            int var5 = class219.field2709[arg1].method1054(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class279 var7 = class219.field2709[var6];
                    if (var7 != null) {
                        var7.method1044(arg0, arg2, var5 - var7.method1054(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
    public static void method1140(int arg0) {
        if (arg0 >= -91) {
            field2126 = null;
        }
        field2122 = null;
        field2126 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lpd;Lna;Luo;Z)V")
    public static final void method1141(class278 arg0, class222 arg1, class118 arg2, boolean arg3) {
        ++field2118;
        class436 var4 = arg1.method1346(arg2, -10345);
        if (var4 != null) {
            int var5 = var4.method230();
            if (var5 < var4.method237()) {
                var5 = var4.method237();
            }
            byte var6 = 10;
            int var7 = arg0.field3603;
            int var8 = arg0.field3605;
            int var9 = 0;
            int var10 = 0;
            if (!arg3) {
                int var11 = 0;
                if (arg1.field2785 != null) {
                    var9 = class207.field2509.method2202(class386.field5280, (class436[]) null, (int[]) null, arg1.field2785, (byte) 123);
                    for (int var12 = 0; ~var9 < ~var12; ++var12) {
                        String var13 = class386.field5280[var12];
                        if (~(var9 + -1) < ~var12) {
                            var13 = var13.substring(0, -4 + var13.length());
                        }
                        int var14 = class282.field3685.method683(var13);
                        if (~var10 > ~var14) {
                            var10 = var14;
                        }
                    }
                    var11 = var9 * class282.field3685.method679() - -(class282.field3685.method685() / 2);
                }
                int var15 = var5 / 2 + arg0.field3603;
                int var16 = arg0.field3605;
                if (class224.field2829 + var5 > var7) {
                    var7 = class224.field2829;
                    var15 = var5 / 2 + (class224.field2829 - -var6) + 5 - -(var10 / 2);
                } else if (~(class224.field2830 - var5) > ~var7) {
                    var7 = -var5 + class224.field2830;
                    var15 = -(var5 / 2) + class224.field2830 + -var6 + -(var10 / 2) + -5;
                }
                if (~(class224.field2835 + var5) >= ~var8) {
                    if (~var8 < ~(-var5 + class224.field2819)) {
                        var8 = -var5 + class224.field2819;
                        var16 = -(var5 / 2) + class224.field2819 + -var11 + -var6;
                    }
                } else {
                    var8 = class224.field2835;
                    var16 = var5 / 2 + class224.field2835 + var6;
                }
                int var17 = (int) (32767.0D * (Math.atan2((double) (var7 - arg0.field3603), (double) (-arg0.field3605 + var8)) / 3.141592653589793D)) & 65535;
                var4.method2661((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
                int var18 = -2;
                int var19 = -2;
                int var20 = -2;
                int var21 = -2;
                if (arg1.field2785 != null) {
                    var18 = var15 - 5 + -(var10 / 2);
                    var19 = var16;
                    var21 = var9 * class282.field3685.method679() + var16 + 3;
                    var20 = var18 - (-var10 - 10);
                    if (arg1.field2778 != 0) {
                        arg2.method739((byte) 84, arg1.field2778, var18, -var18 + var20, var16, var21 - var16);
                    }
                    if (~arg1.field2780 != -1) {
                        arg2.method731(var18, var16, -var18 + var20, arg1.field2780, (byte) 92, -var16 + var21);
                    }
                    for (int var22 = 0; ~var22 > ~var9; ++var22) {
                        String var23 = class386.field5280[var22];
                        if (~(var9 + -1) < ~var22) {
                            var23 = var23.substring(0, var23.length() - 4);
                        }
                        class282.field3685.method681(arg2, var23, var15, var16, arg1.field2777, true);
                        var16 += class282.field3685.method679();
                    }
                }
                if (~arg1.field2783 != 0 || arg1.field2785 != null) {
                    class428 var24 = new class428(arg0);
                    int var25 = var5 >> 1;
                    var24.field5846 = var18;
                    var24.field5848 = -var25 + var8;
                    var24.field5861 = var8 + var25;
                    var24.field5855 = var21;
                    var24.field5863 = var19;
                    var24.field5850 = var7 - var25;
                    var24.field5852 = var7 + var25;
                    var24.field5859 = var20;
                    class141.field1663.method1696(false, var24);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field2121;
        int var3 = -115 / ((arg1 - 57) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 66, arg0);
            for (int var6 = 0; var6 < class138.field1579; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~var7 <= ~this.field2124 && ~var7 >= ~this.field2119 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, true);
    }

    static {
        new class72("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
