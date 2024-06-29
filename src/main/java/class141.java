import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class141 extends class200 {

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Lid;")
    public static class149 field2592 = class60.method382("::fpson", (byte) 98);

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lid;")
    public static class149 field2594 = class60.method382("<col=ff3000>", (byte) 63);

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field2598 = 0;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class141() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lal;B)V")
    public static final void method986(class230 arg0, byte arg1) {
        class259.field4553 = arg0;
        ++field2593;
        class83.field1517 = class259.field4553.method1559(4, 102);
        int var2 = 113 / ((arg1 - -7) / 44);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        int[] var3 = super.field3638.method1879(arg0, true);
        if (arg1 != 55) {
            field2594 = null;
        }
        ++field2595;
        if (super.field3638.field4887) {
            int[][] var4 = this.method1366(arg0, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class137.field2515; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[III)V")
    public static final void method987(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        int var11 = arg3 - 1;
        int var5 = -7 + var11;
        --arg1;
        ++field2597;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg2[var6] = arg4;
            int var7 = var6 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var12 = var10 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg1 = var13 + 1;
            arg2[arg1] = arg4;
        }
        while (var11 > arg1) {
            ++arg1;
            arg2[arg1] = arg4;
        }
        if (arg0 != 2) {
            method988(-86);
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public static final void method988(int arg0) {
        class3 var1 = (class3) class34.field499.method633((byte) 29);
        if (arg0 != 1) {
            field2592 = null;
        }
        while (var1 != null) {
            int var2 = var1.field42;
            if (class104.method735(var2, false)) {
                boolean var3 = true;
                class47[] var4 = class14.field206[var2];
                for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field718;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1148;
                    class47 var7 = class251.method1741((byte) 110, var6);
                    if (var7 != null) {
                        class182.method1267(var7, 88);
                    }
                }
            }
            var1 = (class3) class34.field499.method630(11);
        }
        ++field2596;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2594 = null;
        field2592 = null;
        if (arg0 < 41) {
            method986((class230) null, (byte) 99);
        }
    }
}
