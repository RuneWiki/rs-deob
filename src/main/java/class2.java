import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    private int[] field18;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    private int[] field13;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lpl;")
    private class264 field23;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lpl;")
    private class264 field20;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[Lpl;")
    private class264[] field14;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "S")
    public static short field16 = 256;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lma;")
    public static class5 field24 = class12.method119("showingVideoAd", (byte) 118);

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lni;")
    public static class202 field17;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lti;IZDLni;BIZ)[I", line = 9)
    public final int[] method8(class173 arg0, int arg1, boolean arg2, double arg3, class202 arg4, byte arg5, int arg6, boolean arg7) {
        field15++;
        class149.method940(95, arg3);
        class139.field2065 = arg4;
        int[] var10 = new int[arg1 * arg6];
        class238.field3930 = arg0;
        int var11 = -69 / ((arg5 - 30) / 56);
        class138.method898(16828, arg1, arg6);
        for (int var12 = 0; var12 < this.field14.length; var12++) {
            this.field14[var12].method1818(-103, arg1, arg6);
        }
        int var13 = 0;
        int var14;
        byte var15;
        int var16;
        if (arg2) {
            var14 = arg6 - 1;
            var15 = -1;
            var16 = -1;
        } else {
            var14 = 0;
            var15 = 1;
            var16 = arg6;
        }
        for (int var17 = 0; var17 < arg1; var17++) {
            if (arg7) {
                var13 = var17;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field23.field4496) {
                int[] var22 = this.field23.method5(-109, var17);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field23.method138((byte) -101, var17);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            for (int var23 = var14; var23 != var16; var23 += var15) {
                int var24 = var20[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class296.field4979[var25];
                int var27 = var19[var23] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class296.field4979[var27];
                int var29 = class296.field4979[var24];
                var10[var13++] = (var29 << 8) + (var26 << 16) + var28;
                if (arg7) {
                    var13 += arg6 - 1;
                }
            }
        }
        for (int var30 = 0; var30 < this.field14.length; var30++) {
            this.field14[var30].method652(-62);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lti;Lni;ZIIDZ)[B", line = 144)
    public final byte[] method9(class173 arg0, class202 arg1, boolean arg2, int arg3, int arg4, double arg5, boolean arg6) {
        class149.method940(123, arg5);
        class139.field2065 = arg1;
        field21++;
        byte[] var9 = new byte[arg4 * 4 * arg3];
        class238.field3930 = arg0;
        class138.method898(16828, arg3, arg4);
        for (int var10 = 0; var10 < this.field14.length; var10++) {
            this.field14[var10].method1818(-124, arg3, arg4);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field23.field4496) {
                int[] var17 = this.field23.method5(-123, var12);
                var15 = var17;
                var16 = var17;
                var14 = var17;
            } else {
                int[][] var13 = this.field23.method138((byte) -107, var12);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            if (arg6) {
                var11 = var12 << 2;
            }
            int[] var18;
            if (this.field20.field4496) {
                var18 = this.field20.method5(-115, var12);
            } else {
                var18 = this.field20.method138((byte) -112, var12)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                int var22 = var16[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var23 = class296.field4979[var22];
                int var24 = class296.field4979[var21];
                int var25 = class296.field4979[var20];
                int var26;
                if (var25 == 0 && var24 == 0 && var23 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var26;
                if (arg6) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        if (!arg2) {
            this.field23 = (class264) null;
        }
        for (int var27 = 0; var27 < this.field14.length; var27++) {
            this.field14[var27].method652(-25);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 291)
    public static void method10(int arg0) {
        if (arg0 != 20703) {
            method10(11);
        }
        field24 = null;
        field17 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLni;Lti;)Z", line = 307)
    public final boolean method11(byte arg0, class202 arg1, class173 arg2) {
        if (arg0 != -60) {
            return true;
        }
        field19++;
        for (int var4 = 0; var4 < this.field13.length; var4++) {
            if (!arg1.method1341(arg0 ^ 0xFFFFFF88, this.field13[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field18.length; var5++) {
            if (!arg2.method1093((byte) -75, this.field18[var5])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 357)
    public class2() {
        this.field18 = new int[0];
        this.field13 = new int[0];
        this.field23 = new class116();
        this.field23.field4528 = 1;
        this.field20 = new class116();
        this.field20.field4528 = 1;
        this.field14 = new class264[] { this.field23, this.field20 };
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lii;)V", line = 370)
    public class2(class221 arg0) {
        int var2 = 0;
        int var3 = arg0.method1509(true);
        this.field14 = new class264[var3];
        int var4 = 0;
        int[][] var5 = new int[var3][];
        for (int var6 = 0; var6 < var3; var6++) {
            class264 var7 = class98.method629(arg0, -4097);
            if (var7.method657(-1) >= 0) {
                var2++;
            }
            if (var7.method744(29) >= 0) {
                var4++;
            }
            int var8 = var7.field4505.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1509(true);
            }
            this.field14[var6] = var7;
        }
        this.field18 = new int[var4];
        this.field13 = new int[var2];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var3; var12++) {
            class264 var13 = this.field14[var12];
            int var14 = var13.field4505.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4505[var15] = this.field14[var5[var12][var15]];
            }
            int var16 = var13.method657(-1);
            int var17 = var13.method744(-106);
            if (var16 > 0) {
                this.field13[var11++] = var16;
            }
            if (var17 > 0) {
                this.field18[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field23 = this.field14[arg0.method1509(true)];
        this.field20 = this.field14[arg0.method1509(true)];
    }
}
