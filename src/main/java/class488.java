import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class488 extends class529 {

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    private int field6939 = 16;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    private int field6943 = 0;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    private int field6938 = 4096;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    private int field6945 = 0;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    private int field6946 = 2000;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "[Z")
    public static boolean[] field6948 = new boolean[5];

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "Lmq;")
    public static class78 field6942 = new class78(76, 6);

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "Lwo;")
    public static class314 field6950 = new class314();

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class488() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 <= 45) {
            this.method303(-71);
        }
        ++field6940;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field6938 = arg2.method1107(false);
                        }
                    } else {
                        this.field6945 = arg2.method1107(false);
                    }
                } else {
                    this.field6939 = arg2.method1094(255);
                }
            } else {
                this.field6946 = arg2.method1107(false);
            }
        } else {
            this.field6943 = arg2.method1094(255);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        if (arg0 > -92) {
            method2856((byte) -89);
        }
        ++field6947;
        class713.method3947((byte) -117);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
    public static void method2856(byte arg0) {
        field6942 = null;
        field6950 = null;
        field6948 = null;
        if (arg0 != 123) {
            field6942 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field6944;
        int[] var3 = super.field7456.method1635(arg0, -92);
        int var4 = 72 % ((arg1 - 27) / 49);
        if (super.field7456.field3449) {
            int var5 = this.field6938 >> 1;
            int[][] var6 = super.field7456.method1634((byte) -39);
            Random var7 = new Random((long) this.field6943);
            for (int var8 = 0; ~var8 > ~this.field6946; ++var8) {
                int var9 = this.field6938 <= 0 ? this.field6945 : -var5 + this.field6945 + class408.method2420((byte) -120, var7, this.field6938);
                int var10 = (var9 & 4093) >> 4;
                int var11 = class408.method2420((byte) 50, var7, class304.field3909);
                int var12 = class408.method2420((byte) -29, var7, class424.field6042);
                int var13 = (class132.field1574[var10] * this.field6939 >> 12) + var11;
                int var14 = var12 - -(class550.field7739[var10] * this.field6939 >> 12);
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (~var16 != -1 || var15 != 0) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var17 = ~var16 > ~var15;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (~var13 > ~var11) {
                        int var20 = var11;
                        var11 = var13;
                        int var21 = var12;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var11 + var13;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = -(class408.method2420((byte) 5, var7, 4096) >> 2) + 1024;
                    int var28 = ~var12 <= ~var14 ? -1 : 1;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    for (int var29 = var11; var13 > var29; ++var29) {
                        int var30 = (-var11 + var29) * var26 + 1024 + var27;
                        int var31 = class404.field5700 & var29;
                        int var32 = var22 & class33.field516;
                        var25 += var24;
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                        if (~var25 < -1) {
                            var25 += -var23;
                            var22 += var28;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
