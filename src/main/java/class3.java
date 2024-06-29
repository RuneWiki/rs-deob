import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 extends class114 {

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    private int field18 = 2000;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    private int field17 = 16;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private int field20 = 0;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    private int field21 = 4096;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    private int field27 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "[[I")
    public static int[][] field26 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "Ldl;")
    public static class48 field23;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field22;
        class288.method1923((byte) -120);
        if (arg0 <= 101) {
            this.field18 = -20;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field21 = arg0.method1379(-113);
                        }
                    } else {
                        this.field20 = arg0.method1379(-103);
                    }
                } else {
                    this.field17 = arg0.method1374((byte) -60);
                }
            } else {
                this.field18 = arg0.method1379(-114);
            }
        } else {
            this.field27 = arg0.method1374((byte) -60);
        }
        ++field24;
        if (arg2 != 12953) {
            this.field20 = -91;
        }
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    public static void method14(int arg0) {
        field23 = null;
        field26 = null;
        if (arg0 != 11118) {
            method14(-39);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBII)V")
    public static final void method15(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field25;
        if (~class247.field3873 == -2) {
            class96.field1388[class224.field3503 / 100].method694(class17.field299 + -8, class189.field2873 + -8);
        }
        if (~class247.field3873 == -3) {
            class96.field1388[class224.field3503 / 100 + 4].method694(class17.field299 + -8, class189.field2873 - 8);
        }
        if (arg2 < 117) {
            method15(113, 2, (byte) -68, 31, 83);
        }
        class290.method1949(30);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -114);
        ++field19;
        if (arg1) {
            field26 = null;
        }
        if (super.field1630.field710) {
            int var4 = this.field21 >> 1;
            int[][] var5 = super.field1630.method306(0);
            Random var6 = new Random((long) this.field27);
            for (int var7 = 0; this.field18 > var7; ++var7) {
                int var8 = ~this.field21 < -1 ? this.field20 - (var4 + -class137.method863(var6, (byte) 85, this.field21)) : this.field20;
                int var9 = class137.method863(var6, (byte) 81, class145.field2009);
                int var10 = class137.method863(var6, (byte) 84, class263.field4216);
                int var11 = var8 >> 4 & 255;
                int var12 = (class197.field3023[var11] * this.field17 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class134.field1843[var11] * this.field17 >> 12) + var9;
                int var15 = -var9 + var14;
                if (var15 != 0 || var13 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var13 < ~var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var14;
                        var14 = var12;
                        var12 = var18;
                        var9 = var10;
                        var10 = var17;
                    }
                    if (~var14 > ~var9) {
                        int var19 = var9;
                        var9 = var14;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                        var14 = var19;
                    }
                    int var21 = var10;
                    int var22 = -(class137.method863(var6, (byte) 104, 4096) >> 2) + 1024;
                    int var23 = -var9 + var14;
                    int var24 = ~var10 > ~var12 ? 1 : -1;
                    int var25 = 2048 / var23;
                    int var26 = var12 - var10;
                    if (~var26 > -1) {
                        var26 = -var26;
                    }
                    int var27 = -var23 / 2;
                    for (int var28 = var9; ~var14 < ~var28; ++var28) {
                        var27 += var26;
                        int var29 = 1024 - -((-var9 + var28) * var25) + var22;
                        int var30 = var28 & class309.field4977;
                        int var31 = class134.field1840 & var21;
                        if (var27 > 0) {
                            var27 -= var23;
                            var21 -= -var24;
                        }
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
