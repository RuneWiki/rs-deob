import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class30 extends class167 {

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    private int field703 = 0;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    private int field704 = 4096;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field699 = 16;

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
    private int field715 = 2000;

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
    private int field716 = 0;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "Lkh;")
    private static class117 field700 = class224.method1450((byte) -98, "Connection timed out)3");

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "Lkh;")
    public static class117 field706 = field700;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "Lkh;")
    public static class117 field708 = class224.method1450((byte) 106, "");

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "Lkh;")
    private static class117 field714 = class224.method1450((byte) 125, "Please try using a different world)3");

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "Lkh;")
    public static class117 field702 = field714;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "Lkh;")
    public static class117 field711 = field714;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "Lkh;")
    public static class117 field707 = field714;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "Lkh;")
    public static class117 field710 = field714;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "Lkh;")
    public static class117 field701 = field714;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "Lkh;")
    public static class117 field712 = field714;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "Lge;")
    public static class71 field697 = new class71(64);

    @OriginalMember(owner = "client!cg", name = "pb", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!cg", name = "qb", descriptor = "I")
    public static int field720 = 2301979;

    @OriginalMember(owner = "client!cg", name = "sb", descriptor = "I")
    public static int field722 = 0;

    @OriginalMember(owner = "client!cg", name = "rb", descriptor = "I")
    public static int field721 = 0;

    @OriginalMember(owner = "client!cg", name = "tb", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!cg", name = "nb", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!cg", name = "ob", descriptor = "[[B")
    public static byte[][] field718;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (arg0 != -96) {
            return null;
        } else {
            if (super.field3013.field4085) {
                int var4 = this.field704 >> 1;
                int[][] var5 = super.field3013.method1465(75);
                Random var6 = new Random((long) this.field716);
                for (int var7 = 0; var7 < this.field715; ++var7) {
                    int var8 = this.field704 <= 0 ? this.field703 : this.field703 - var4 - -class223.method1447(this.field704, var6, (byte) -79);
                    int var9 = var8 >> 4 & 255;
                    int var10 = class223.method1447(class115.field2146, var6, (byte) -79);
                    int var11 = class223.method1447(class57.field1185, var6, (byte) -79);
                    int var12 = var10 - -(class60.field1218[var9] * this.field699 >> 12);
                    int var13 = (class128.field2361[var9] * this.field699 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || ~var14 != -1) {
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = var15 < var14;
                        if (var16) {
                            int var17 = var12;
                            var12 = var13;
                            int var18 = var10;
                            var10 = var11;
                            var13 = var17;
                            var11 = var18;
                        }
                        if (~var10 < ~var12) {
                            int var19 = var10;
                            var10 = var12;
                            var12 = var19;
                            int var20 = var11;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = -var11 + var13;
                        int var23 = var12 - var10;
                        if (~var22 > -1) {
                            var22 = -var22;
                        }
                        int var24 = 2048 / var23;
                        int var25 = 1024 + -(class223.method1447(4096, var6, (byte) -79) >> 2);
                        int var26 = -var23 / 2;
                        int var27 = var13 > var11 ? 1 : -1;
                        for (int var28 = var10; var28 < var12; ++var28) {
                            int var29 = (var28 - var10) * var24 + (var25 - -1024);
                            var26 += var22;
                            int var30 = class101.field1839 & var21;
                            int var31 = var28 & class34.field801;
                            if (~var26 < -1) {
                                var26 += -var23;
                                var21 += var27;
                            }
                            if (!var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                        }
                    }
                }
            }
            ++field705;
            return var3;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field721 = 77;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field704 = arg0.method1049((byte) 113);
                        }
                    } else {
                        this.field703 = arg0.method1049((byte) 89);
                    }
                } else {
                    this.field699 = arg0.method998(98);
                }
            } else {
                this.field715 = arg0.method1049((byte) 99);
            }
        } else {
            this.field716 = arg0.method998(101);
        }
        ++field709;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        int var2 = 53 / ((arg0 - -18) / 59);
        ++field698;
        class212.method1395((byte) 84);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public static void method263(int arg0) {
        field712 = null;
        field714 = null;
        field711 = null;
        field710 = null;
        field702 = null;
        field708 = null;
        field700 = null;
        field701 = null;
        field718 = null;
        field707 = null;
        field706 = null;
        field697 = null;
        int var1 = -109 % ((arg0 - 81) / 39);
    }
}
