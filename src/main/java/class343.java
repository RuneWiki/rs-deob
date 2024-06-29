import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class343 extends class424 {

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    private int field4629 = 1024;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    private int field4626 = 2048;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    private int field4627 = 3072;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field4624 = 0;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "Lka;")
    public static class408 field4628 = new class408(4);

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "[I")
    public static int[] field4633 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "[S")
    public static short[] field4634 = new short[256];

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "Z")
    public static boolean field4635 = false;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Ljm;")
    public static class162 field4621;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class343() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public static final void method2086(int arg0) {
        class408 var1 = class219.field3072;
        synchronized (class219.field3072) {
            class219.field3072.method2522((byte) 108);
            if (arg0 != 2) {
                field4634 = null;
            }
        }
        ++field4622;
        class408 var2 = class445.field6237;
        synchronized (class445.field6237) {
            class445.field6237.method2522((byte) 125);
        }
        class408 var3 = class218.field3060;
        synchronized (class218.field3060) {
            class218.field3060.method2522((byte) 103);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 == -48) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field5893 = ~arg0.method2306((byte) 112) == -2;
                    }
                } else {
                    this.field4627 = arg0.method2297(13352);
                }
            } else {
                this.field4629 = arg0.method2297(13352);
            }
            ++field4631;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field4626 = -this.field4629 + this.field4627;
        if (arg0 != 3) {
            this.method43(-110, (byte) 76);
        }
        ++field4630;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            this.field4629 = 35;
        }
        ++field4632;
        int[] var3 = super.field5892.method783(arg0, (byte) -91);
        if (super.field5892.field1427) {
            int[] var4 = this.method2621(0, arg1 + -109, arg0);
            for (int var5 = 0; ~var5 > ~class303.field4135; ++var5) {
                var3[var5] = (var4[var5] * this.field4626 >> 12) + this.field4629;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field4625;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (!arg1) {
            field4633 = null;
        }
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(arg1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class303.field4135; ++var11) {
                var8[var11] = (var5[var11] * this.field4626 >> 12) + this.field4629;
                var9[var11] = this.field4629 - -(var6[var11] * this.field4626 >> 12);
                var10[var11] = this.field4629 - -(var7[var11] * this.field4626 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
    public static void method2087(byte arg0) {
        field4621 = null;
        field4628 = null;
        field4633 = null;
        if (arg0 <= 92) {
            method2086(126);
        }
        field4634 = null;
    }
}
