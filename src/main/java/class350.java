import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class350 extends class325 {

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    private int field5129 = 16;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    private int field5135 = 4096;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    private int field5134 = 0;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    private int field5133 = 2000;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    private int field5140 = 0;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "[Lkf;")
    public static class267[] field5139 = new class267[300];

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Lph;")
    public static class671 field5132;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class350() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field5137;
        if (arg0 < 21) {
            this.field5134 = -42;
        }
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int var4 = this.field5135 >> 1;
            int[][] var5 = super.field4727.method2602(0);
            Random var6 = new Random((long) this.field5140);
            for (int var7 = 0; this.field5133 > var7; ++var7) {
                int var8 = this.field5135 <= 0 ? this.field5134 : this.field5134 - var4 - -class739.method4090(var6, 7, this.field5135);
                int var9 = (var8 & 4082) >> 4;
                int var10 = class739.method4090(var6, -108, class261.field3874);
                int var11 = class739.method4090(var6, 88, class657.field9077);
                int var12 = (class224.field3075[var9] * this.field5129 >> 12) + var10;
                int var13 = (class406.field5886[var9] * this.field5129 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class739.method4090(var6, -4, 4096) >> 2) + 1024;
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = var26 - -((var28 - var10) * var25) + 1024;
                        int var30 = var28 & class625.field8423;
                        int var31 = class566.field7574 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIILha;II)V")
    public static final void method2205(byte arg0, int arg1, int arg2, class65 arg3, int arg4, int arg5) {
        class86.field1200 = arg3;
        ++field5131;
        class298.field4325 = class86.field1200.method472();
        class198.field2650 = class86.field1200.method472();
        class468.field6495 = class86.field1200.method472();
        class462.field6396 = null;
        class38.field584 = arg1;
        int var6 = 87 / ((-64 - arg0) / 62);
        class205.field2686 = null;
        class669.field9399 = 0;
        class111.field1526 = arg2;
        class403.method2515(arg4, (byte) 125, arg5);
        class373.field5401 = -1;
        class671.field9443 = -1;
        class122.field1781 = -1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        ++field5136;
        class38.method266(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        ++field5130;
        if (arg2 >= -41) {
            method2205((byte) -32, -121, -5, (class65) null, -22, 60);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field5135 = arg0.method2359(-1);
                        }
                    } else {
                        this.field5134 = arg0.method2359(-1);
                    }
                } else {
                    this.field5129 = arg0.method2398(-1372747256);
                }
            } else {
                this.field5133 = arg0.method2359(-1);
            }
        } else {
            this.field5140 = arg0.method2398(-1372747256);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method2206(int arg0) {
        field5132 = null;
        field5139 = null;
        if (arg0 != -2953) {
            method2205((byte) -3, 42, 7, (class65) null, -12, -43);
        }
    }
}
