import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class123 {

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
    public boolean field1555 = true;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    private int field1548 = -1;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Liu;")
    private class564 field1549;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lqj;")
    private class548 field1560;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "Lpm;")
    private class133 field1559;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Ldw;")
    private class125 field1556;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lwk;")
    private class442 field1551;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 9)
    private final void method655(byte arg0) {
        field1553++;
        if (!this.field1555) {
            return;
        }
        this.field1555 = false;
        byte[] var2 = this.field1549.field7847;
        byte[] var3 = this.field1560.field7628;
        if (arg0 != -62) {
            this.field1556 = null;
        }
        int var4 = 0;
        int var5 = this.field1549.field7840;
        int var6 = this.field1549.field7840 * this.field1545 + this.field1557;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1559 != null && this.field1548 == var4) {
            this.field1555 = false;
            return;
        }
        this.field1548 = var4;
        int var8 = 0;
        int var9 = this.field1545 * var5 + this.field1557;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field1549.field7840 - 128;
        }
        if (this.field1559 == null) {
            this.field1559 = new class133(this.field1560, 3553, 6406, 128, 128, false, this.field1560.field7628, 6406, false);
            this.field1559.method774(false, (byte) -126, false);
            this.field1559.method3396(true, 17137);
        } else {
            this.field1559.method768(0, 6406, 0, 0, false, 128, 3314, 0, this.field1560.field7628, 128);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BIII)V", line = 114)
    public final void method656(byte[] arg0, int arg1, int arg2, int arg3) {
        field1558++;
        this.field1551.method665(arg1, 17816, this.field1560.method3006((byte) 74, arg1) * arg2, arg0);
        int var5 = -11 % ((52 - arg3) / 49);
        this.method659(-6202, arg2, this.field1551);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V", line = 127)
    public final void method657(byte arg0) {
        this.method659(-6202, this.field1552, this.field1556);
        if (arg0 != -94) {
            this.field1559 = null;
        }
        field1554++;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lqj;Liu;Ldga;IIIII)V", line = 221)
    public class123(class548 arg0, class564 arg1, class445 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1549 = arg1;
        this.field1560 = arg0;
        this.field1545 = arg7;
        this.field1557 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3441 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5614[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1552 = var10;
        if (var10 <= 0) {
            this.field1559 = null;
        } else {
            class630 var14 = new class630(var10 * 2);
            if (this.field1560.field7579) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3441 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5614[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method3526(var23[var24] & 0xFFFF, 13469);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3441 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5614[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method3484(var18[var19] & 0xFFFF, (byte) 0);
                            }
                        }
                    }
                }
            }
            this.field1556 = this.field1560.method2984((byte) -81, var14.field8812, var14.field8804, false, 5123);
            this.field1551 = new class442(this.field1560, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I[FBFIIIIII)V", line = 147)
    public static final void method658(int arg0, float[] arg1, byte arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg7 - arg5;
        int var11 = arg8 - arg4;
        field1547++;
        int var12 = arg6 - arg9;
        float var13 = arg1[2] * (float) var12 + arg1[1] * (float) var11 + arg1[0] * (float) var10;
        if (arg2 >= -5) {
            field1561 = -121;
        }
        float var14 = arg1[5] * (float) var12 + arg1[4] * (float) var11 + arg1[3] * (float) var10;
        float var15 = arg1[8] * (float) var12 + arg1[7] * (float) var11 + arg1[6] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg3 + 0.5F;
        if (arg0 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg0 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg0 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class32.field461 = var17;
        class580.field8123 = var18;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILdw;)V", line = 205)
    private final void method659(int arg0, int arg1, class125 arg2) {
        field1546++;
        if (arg1 == 0) {
            return;
        }
        this.method655((byte) -62);
        this.field1560.method2960(this.field1559, -2);
        this.field1560.method2978(arg1, 0, 4, arg2, arg0 ^ 0xFFFFE739);
        if (arg0 != -6202) {
            this.field1549 = null;
        }
    }
}
