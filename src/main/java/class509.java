import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class509 extends class11 {

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Z")
    private boolean field7561 = true;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    private int field7557 = 4096;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field7554 = 0;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Ljava/lang/String;")
    public static String field7562;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field7563;

    static {
        new class466("Use", "Benutzen", "Utiliser", "Usar");
        field7562 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lya;IIIIII)Lt;", line = 3)
    public static final class471 method3046(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7558;
        long var7 = (long) arg5;
        class471 var9 = (class471) class173.field2569.method1073(var7, false);
        short var10 = 2055;
        if (var9 == null) {
            class419 var11 = class109.method798(class523.field7739, 0, arg5, arg6 ^ -121);
            if (var11 == null) {
                return null;
            }
            if (~var11.field6121 > -14) {
                var11.method2492((byte) -62, 0);
            }
            var9 = arg0.method231(var11, var10, class273.field3760, 64, 768);
            class173.field2569.method1072(var7, var9, false);
        }
        class471 var12 = var9.method381((byte) 2, var10, true);
        if (arg3 != arg6) {
            var12.method393(arg3);
        }
        if (~arg1 != -1) {
            var12.method396(arg1);
        }
        if (~arg4 != -1) {
            var12.method409(arg4);
        }
        if (arg2 != 0) {
            var12.method392(0, arg2, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 46)
    public class509() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 52)
    public static final void method3047(String arg0, int arg1, boolean arg2) {
        ++field7556;
        class469.field6853.field1541 = 1;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~class328.field4480.field7676 < ~var6; ++var6) {
            class508 var9 = class328.field4480.method3091(116, var6);
            if ((!arg2 || var9.field7542) && var9.field7530 == -1 && ~var9.field7540 == 0 && var9.field7538 == 0 && var9.field7506.toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -251) {
                    class525.field7763 = -1;
                    class170.field2530 = null;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class170.field2530 = var4;
        class525.field7763 = var5;
        class131.field1924 = 0;
        String[] var7 = new String[class525.field7763];
        for (int var8 = 0; class525.field7763 > var8; ++var8) {
            var7[var8] = class328.field4480.method3091(39, var4[var8]).field7506;
        }
        class231.method1427(126, var7, class170.field2530);
        if (arg1 > -2) {
            field7554 = -100;
        }
        class469.field6853.method748(0);
        class469.field6853.field1541 = 2;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)Lei;", line = 129)
    public static final class117 method3048(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        return var3 != null && var3.field7100 != null ? var3.field7100 : null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsi;II)V", line = 151)
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 >= -40) {
            method3046((class38) null, -128, -1, 14, -37, -3, 5);
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field7561 = ~arg0.method2348(-2) == -2;
            }
        } else {
            this.field7557 = arg0.method2353((byte) 115);
        }
        ++field7563;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IJLya;)V", line = 186)
    public static final void method3049(int arg0, long arg1, class38 arg2) {
        class101.field1534 = 0;
        class507.field7466 = class85.field1260;
        ++field7555;
        class85.field1260 = 0;
        long var4 = class246.method1483(5957);
        if (arg0 < -125) {
            for (class190 var6 = (class190) class458.field6717.method2461(-88); var6 != null; var6 = (class190) class458.field6717.method2458(19)) {
                if (var6.method1189(arg2, arg1)) {
                    ++class101.field1534;
                }
            }
            if (class397.field5791 && ~(arg1 % 100L) == -1L) {
                System.out.println("Particle system count: " + class458.field6717.method2459(-4137) + ", running: " + class101.field1534 + ". Particles: " + class85.field1260 + ". Time taken: " + (-var4 + class246.method1483(5957)) + "ms");
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[[I", line = 222)
    public final int[][] method41(int arg0, int arg1) {
        int var3 = 33 % ((arg0 - -75) / 49);
        ++field7559;
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[] var5 = this.method48(arg1 + -1 & class183.field2683, 0, (byte) -67);
            int[] var6 = this.method48(arg1, 0, (byte) -114);
            int[] var7 = this.method48(arg1 + 1 & class183.field2683, 0, (byte) -81);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class90.field1316 > var11; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field7557;
                int var13 = (var6[class99.field1490 & var11 + 1] + -var6[var11 - 1 & class99.field1490]) * this.field7557;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 - -var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var19 = var13 / var18;
                    var20 = var12 / var18;
                    var21 = 16777216 / var18;
                }
                if (this.field7561) {
                    var19 = (var19 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var11] = var19;
                var9[var11] = var20;
                var10[var11] = var21;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZIB)I", line = 302)
    public static final int method3050(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field7560;
        class128 var4 = class507.method3024(arg2, arg1, Integer.MIN_VALUE);
        if (var4 == null) {
            return -1;
        } else if (~arg0 <= -1 && ~arg0 > ~var4.field1893.length) {
            return arg3 != 85 ? 28 : var4.field1893[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V", line = 328)
    public static void method3051(int arg0) {
        field7562 = null;
        if (arg0 < 46) {
            field7562 = null;
        }
    }
}
