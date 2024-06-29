import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class19 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    private int field235 = -1;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Z")
    public boolean field246 = true;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lsn;")
    private class281 field234;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lag;")
    private class469 field245;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Ldga;")
    private class441 field240;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lvh;")
    private class265 field247;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lhd;")
    private class290 field238;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ltt;")
    public static class338 field243 = new class338(4, 11);

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field249 = -1;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILvh;B)V")
    private final void method112(int arg0, class265 arg1, byte arg2) {
        field242++;
        if (arg0 != 0) {
            this.method115(13605);
            this.field245.method2627(55, this.field240);
            int var4 = -57 % ((arg2 - 42) / 48);
            this.field245.method2674(0, 4, arg1, 8704, arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI[B)V")
    public final void method113(int arg0, byte arg1, int arg2, byte[] arg3) {
        int var5 = 48 / ((arg1 + 13) / 53);
        field236++;
        this.field238.method1241(arg0 * this.field245.method2666(arg2, 2), (byte) -23, arg2, arg3);
        this.method112(arg0, this.field238, (byte) 110);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public final void method114(int arg0) {
        field248++;
        this.method112(this.field244, this.field247, (byte) 93);
        if (arg0 >= -123) {
            method116((byte) -111);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    private final void method115(int arg0) {
        field241++;
        if (!this.field246) {
            return;
        }
        this.field246 = false;
        if (arg0 != 13605) {
            method116((byte) 81);
        }
        byte[] var2 = this.field234.field3714;
        byte[] var3 = this.field245.field6546;
        int var4 = 0;
        int var5 = this.field234.field3707;
        int var6 = this.field239 + (this.field234.field3707 * this.field237);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field240 != null && this.field235 == var4) {
            this.field246 = false;
            return;
        }
        this.field235 = var4;
        int var8 = this.field237 * var5 + this.field239;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field234.field3707 - 128;
        }
        if (this.field240 == null) {
            this.field240 = new class441(this.field245, 3553, 6406, 128, 128, false, this.field245.field6546, 6406, false);
            this.field240.method2495(false, false, (byte) -1);
            this.field240.method1582(118, true);
        } else {
            this.field240.method2492(128, -37, 0, this.field245.field6546, 6406, false, 128, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method116(byte arg0) {
        field243 = null;
        if (arg0 != -86) {
            field243 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lag;Lsn;Lal;IIIII)V")
    public class19(class469 arg0, class281 arg1, class303 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field237 = arg7;
        this.field239 = arg6;
        this.field234 = arg1;
        this.field245 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3524 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field4004[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field244 = var10;
        if (var10 <= 0) {
            this.field240 = null;
        } else {
            class157 var14 = new class157(var10 * 2);
            if (this.field245.field6466) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3524 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field4004[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method918(24551, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3524 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field4004[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method913(var23[var24] & 0xFFFF, true);
                            }
                        }
                    }
                }
            }
            this.field247 = this.field245.method2654(false, var14.field2219, (byte) -112, var14.field2199, 5123);
            this.field238 = new class290(this.field245, 5123, null, 1);
        }
    }
}
