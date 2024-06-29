import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class113 extends class424 {

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    private int field1741 = 16;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    private int field1739 = 0;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
    private int field1745 = 0;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    private int field1738 = 2000;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
    private int field1746 = 4096;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "Lka;")
    public static class408 field1742 = new class408(16);

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "Ltn;")
    public static class109 field1744 = new class109(8);

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "Lhc;")
    public static class368 field1747 = new class368("green:", "", "", "");

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field1737;
        int[] var3 = super.field5892.method783(arg0, (byte) -60);
        if (super.field5892.field1427) {
            int var4 = this.field1746 >> 1;
            int[][] var5 = super.field5892.method781(32335);
            Random var6 = new Random((long) this.field1739);
            for (int var7 = 0; ~var7 > ~this.field1738; ++var7) {
                int var8 = ~this.field1746 < -1 ? this.field1745 + class92.method724(var6, this.field1746, 117) + -var4 : this.field1745;
                int var9 = (4084 & var8) >> 4;
                int var10 = class92.method724(var6, class303.field4135, 110);
                int var11 = class92.method724(var6, class423.field5866, 103);
                int var12 = (class62.field843[var9] * this.field1741 >> 12) + var10;
                int var13 = var11 - -(class269.field3688[var9] * this.field1741 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class92.method724(var6, 4096, arg1 + 118) >> 2);
                    int var27 = var13 > var11 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = var26 - -((-var10 + var28) * var25) + 1024;
                        int var30 = var28 & class65.field898;
                        int var31 = class174.field2484 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        if (arg1 != -10) {
            this.field1741 = 93;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field1746 = arg0.method2297(arg1 ^ -13320);
                        }
                    } else {
                        this.field1745 = arg0.method2297(13352);
                    }
                } else {
                    this.field1741 = arg0.method2306((byte) 66);
                }
            } else {
                this.field1738 = arg0.method2297(13352);
            }
        } else {
            this.field1739 = arg0.method2306((byte) 118);
        }
        ++field1743;
        if (arg1 != -48) {
            this.method43(-104, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        class361.method2227(4096);
        ++field1740;
        if (arg0 != 3) {
            this.method19((class366) null, (byte) -30, 112);
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V")
    public static void method858(byte arg0) {
        if (arg0 <= -15) {
            field1744 = null;
            field1747 = null;
            field1742 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, true);
    }
}
