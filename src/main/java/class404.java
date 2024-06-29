import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class404 extends class472 {

    @OriginalMember(owner = "client!no", name = "E", descriptor = "[I")
    private int[] field5964;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "[I")
    private int[] field5969;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "Lub;")
    private class305 field5961;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "Lub;")
    private class305 field5962;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "Lub;")
    private class305 field5968;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "[Lub;")
    private class305[] field5967;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "Ljp;")
    public static class55 field5960 = new class55(9, 12);

    @OriginalMember(owner = "client!no", name = "R", descriptor = "[I")
    public static int[] field5977 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!no", name = "S", descriptor = "I")
    public static int field5978 = 0;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "F")
    public static float field5965;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "Ljp;")
    public static class55 field5966;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILl;Lum;)Z", line = 7)
    public final boolean method2538(int arg0, class127 arg1, class83 arg2) {
        field5976++;
        if (arg0 > class175.field2690) {
            for (int var4 = 0; var4 < this.field5969.length; var4++) {
                if (!arg2.method739((byte) -35, this.field5969[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5969.length; var5++) {
                if (!arg2.method758((byte) -102, class175.field2690, this.field5969[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field5964.length; var6++) {
            if (!arg1.method936(this.field5964[var6], (byte) -119)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBII)V", line = 63)
    public static final void method2539(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -64) {
            method2543((byte) -100);
        }
        for (int var5 = 0; var5 < class500.field7273; var5++) {
            Rectangle var6 = class489.field7147[var5];
            if ((var6.x + var6.width) > arg1 && arg0 + arg1 > var6.x && arg4 < (var6.y + var6.height) && (arg3 + arg4) > var6.y) {
                class327.field4946[var5] = true;
            }
        }
        field5973++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLum;ILl;II)[F", line = 87)
    public final float[] method2540(boolean arg0, class83 arg1, int arg2, class127 arg3, int arg4, int arg5) {
        if (arg2 >= -108) {
            return null;
        }
        class432.field6416 = arg3;
        class405.field5996 = arg1;
        field5971++;
        for (int var7 = 0; var7 < this.field5967.length; var7++) {
            this.field5967[var7].method2018((byte) -26, arg4, arg5);
        }
        class178.method1258(true, arg4, arg5);
        float[] var8 = new float[arg4 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5962.field4675) {
                int[] var16 = this.field5962.method15(var10, 4688);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field5962.method72(var10, (byte) -114);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field5968.field4675) {
                var17 = this.field5968.method15(var10, 4688);
            } else {
                var17 = this.field5968.method72(var10, (byte) -85)[0];
            }
            int[] var18;
            if (this.field5961.field4675) {
                var18 = this.field5961.method15(var10, 4688);
            } else {
                var18 = this.field5961.method72(var10, (byte) -63)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field5967.length; var11++) {
            this.field5967[var11].method2019((byte) -103);
        }
        return var8;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBLum;)Lfe;", line = 198)
    public static final class153 method2541(int arg0, int arg1, byte arg2, class83 arg3) {
        field5974++;
        byte[] var4 = arg3.method731(0, arg1, arg0);
        if (var4 == null) {
            return null;
        } else if (arg2 < 34) {
            return null;
        } else {
            return new class153(var4);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)Les;", line = 221)
    public static final class481 method2542(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        return var3 == null || var3.field4371 == null ? null : var3.field4371;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V", line = 228)
    public static void method2543(byte arg0) {
        int var1 = -46 / ((arg0 + 25) / 35);
        field5960 = null;
        field5966 = null;
        field5977 = null;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BZDIILum;Ll;)[I", line = 242)
    public final int[] method2544(byte arg0, boolean arg1, double arg2, int arg3, int arg4, class83 arg5, class127 arg6) {
        field5970++;
        class405.field5996 = arg5;
        class432.field6416 = arg6;
        for (int var9 = 0; var9 < this.field5967.length; var9++) {
            this.field5967[var9].method2018((byte) -26, arg3, arg4);
        }
        class296.method1974(arg2, (byte) 90);
        class178.method1258(true, arg3, arg4);
        int[] var10 = new int[arg3 * 4 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5962.field4675) {
                int[] var18 = this.field5962.method15(var12, 4688);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field5962.method72(var12, (byte) -117);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            if (arg1) {
                var11 = var12;
            }
            int[] var19;
            if (this.field5968.field4675) {
                var19 = this.field5968.method15(var12, 4688);
            } else {
                var19 = this.field5968.method72(var12, (byte) -112)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class346.field5153[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class346.field5153[var22];
                int var26 = class346.field5153[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + (var27 << 24) + ((var24 << 16) - -var26);
                if (arg1) {
                    var11 += arg4 - 1;
                }
            }
        }
        if (arg0 <= 48) {
            return null;
        } else {
            for (int var13 = 0; var13 < this.field5967.length; var13++) {
                this.field5967[var13].method2019((byte) -27);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZILum;ZILl;D)[I", line = 377)
    public final int[] method2545(int arg0, boolean arg1, int arg2, class83 arg3, boolean arg4, int arg5, class127 arg6, double arg7) {
        field5972++;
        if (arg5 != 1) {
            field5975 = 1;
        }
        class432.field6416 = arg6;
        class405.field5996 = arg3;
        for (int var10 = 0; var10 < this.field5967.length; var10++) {
            this.field5967[var10].method2018((byte) -26, arg2, arg0);
        }
        class296.method1974(arg7, (byte) 90);
        class178.method1258(true, arg2, arg0);
        int[] var11 = new int[arg0 * arg2];
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var13 = -1;
            var12 = -1;
            var14 = arg0 - 1;
        } else {
            var12 = arg0;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field5962.field4675) {
                int[] var18 = this.field5962.method15(var16, 4688);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field5962.method72(var16, (byte) -95);
                var20 = var22[2];
                var19 = var22[0];
                var21 = var22[1];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class346.field5153[var25];
                int var28 = class346.field5153[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class346.field5153[var26];
                int var30 = (var28 << 16) - (-(var27 << 8) - var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field5967.length; var17++) {
            this.field5967[var17].method2019((byte) 72);
        }
        return var11;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V", line = 533)
    public class404() {
        this.field5964 = new int[0];
        this.field5969 = new int[0];
        this.field5961 = new class224(0);
        this.field5961.field4667 = 1;
        this.field5962 = new class224();
        this.field5962.field4667 = 1;
        this.field5968 = new class224();
        this.field5967 = new class305[] { this.field5962, this.field5968, this.field5961 };
        this.field5968.field4667 = 1;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lfh;)V", line = 548)
    public class404(class194 arg0) {
        int var2 = arg0.method1337((byte) 13);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field5967 = new class305[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class305 var16 = class334.method2173(arg0, 0);
            if (var16.method2017(-24033) >= 0) {
                var3++;
            }
            if (var16.method2020((byte) 117) >= 0) {
                var4++;
            }
            int var17 = var16.field4668.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1337((byte) -125);
            }
            this.field5967[var6] = var16;
        }
        this.field5969 = new int[var3];
        this.field5964 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class305 var11 = this.field5967[var9];
            int var12 = var11.field4668.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4668[var13] = this.field5967[var5[var9][var13]];
            }
            int var14 = var11.method2017(-24033);
            int var15 = var11.method2020((byte) 47);
            if (var14 > 0) {
                this.field5969[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5964[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5962 = this.field5967[arg0.method1337((byte) -124)];
        this.field5968 = this.field5967[arg0.method1337((byte) 117)];
        this.field5961 = this.field5967[arg0.method1337((byte) -118)];
        Object var10 = null;
    }
}
