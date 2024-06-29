import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class101 extends class603 {

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "[C")
    public static char[] field1349 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "Ljk;")
    public static class585 field1346 = new class585(55, 7);

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "Lwo;")
    public static class690 field1354 = new class690(16, 4);

    @OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "Lf;")
    private class701 field1345;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lun;I)Lvaa;", line = 5)
    public static final class435 method748(class389 arg0, int arg1) {
        ++field1344;
        class514 var2 = class249.method1525(arg0, -1);
        int var3 = arg0.method2255(255);
        int var4 = arg0.method2255(255);
        return arg1 != 13703 ? null : new class435(var2.field7533, var2.field7535, var2.field7530, var2.field7532, var2.field7540, var2.field7528, var2.field7529, var2.field7537, var2.field7538, var3, var4);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 22)
    public final void method749(int arg0) {
        super.method749(arg0);
        ++field1352;
        this.field1345 = class273.method1638((byte) -114, super.field8685, ((class63) super.field8689).field1017);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lr;II)V", line = 32)
    public static final void method750(class165 arg0, int arg1, int arg2) {
        ++field1351;
        if (!class186.field2276) {
            class78.field1141 = 0;
        } else {
            if (class247.field3383) {
                class203.field2447 = class604.field8711.method796(false);
            }
            class627.field8992 = 0;
            class408.field5788 = 0;
            class577.field8430 = 0;
            if (arg1 != 24818) {
                method754(103, -85);
            }
            int[] var3 = arg0.method264();
            class300.field4040 = (int) ((float) var3[2] / 3.0F);
            class499.field6985 = (int) ((float) var3[3] / 3.0F);
            arg0.method319(class242.field3329);
            if (~((int) ((float) class242.field3329[0] / 3.0F)) != ~class353.field4718 || (int) ((float) class242.field3329[1] / 3.0F) != class432.field6204) {
                class353.field4718 = (int) ((float) class242.field3329[0] / 3.0F);
                class432.field6204 = (int) ((float) class242.field3329[1] / 3.0F);
                class697.field9873 = class432.field6204 >> 1;
                class380.field5094 = class353.field4718 >> 1;
                class501.field6999 = new int[class432.field6204 * class353.field4718];
            }
            class423.field6032 = arg0.method238();
            class78.field1141 = 0;
            for (int var4 = 0; ~class516.field7558 < ~var4; ++var4) {
                class40.method451(arg0, class147.field1801[var4], arg2, (byte) 92);
            }
            for (int var5 = 0; var5 < class10.field100; ++var5) {
                class40.method451(arg0, class436.field6246[var5], arg2, (byte) 82);
            }
            for (int var6 = 0; class133.field1693 > var6; ++var6) {
                class40.method451(arg0, class683.field9755[var6], arg2, (byte) 82);
            }
            class86.field1213 = 0;
            if (class78.field1141 > 0) {
                int var7 = class501.field6999.length;
                int var8 = var7 - var7 & 7;
                int var9 = 0;
                while (var8 > var9) {
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                }
                while (var7 > var9) {
                    class501.field6999[var9++] = Integer.MAX_VALUE;
                }
                class159.field1938 = 1;
                for (int var10 = 0; var10 < class78.field1141; ++var10) {
                    class568 var11 = class677.field9705[var10];
                    class19.method330(var11.field8302[1], false, var11.field8298[3], var11.field8309[1], var11.field8298[0], var11.field8298[1], var11.field8302[0], var11.field8309[3], var11.field8309[0], var11.field8302[3]);
                    class19.method330(var11.field8302[2], false, var11.field8298[3], var11.field8309[2], var11.field8298[1], var11.field8298[2], var11.field8302[1], var11.field8309[3], var11.field8309[1], var11.field8302[3]);
                }
                class159.field1938 = 2;
            }
            if (class247.field3383) {
                class588.field8525 = class604.field8711.method796(false) - class203.field2447;
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljn;Ljn;Lpv;)V", line = 137)
    public class101(class668 arg0, class668 arg1, class63 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZZ)V", line = 140)
    public final void method751(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field1350;
        if (arg3) {
            class68.field1045.method278(arg0 + -2, arg1, super.field8689.field7540 + 4, super.field8689.field7528 + 2, ((class63) super.field8689).field1018, 0);
            class68.field1045.method278(arg0 + -1, arg1 - -1, super.field8689.field7540 + 2, super.field8689.field7528, 0, 0);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V", line = 159)
    public static void method752(byte arg0) {
        field1354 = null;
        field1349 = null;
        int var1 = -92 % ((31 - arg0) / 53);
        field1346 = null;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)Z", line = 170)
    public final boolean method753(int arg0) {
        ++field1353;
        if (!super.method753(arg0)) {
            return false;
        } else {
            if (arg0 != -29791) {
                this.method751(-43, 91, false, true);
            }
            return super.field8685.method3802(((class63) super.field8689).field1017, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V", line = 187)
    public static final void method754(int arg0, int arg1) {
        if (class331.field4408 == null || arg1 > class331.field4408.length) {
            class331.field4408 = new int[arg1];
        }
        ++field1347;
        if (arg0 != 1) {
            field1354 = null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IZII)V", line = 206)
    public final void method755(int arg0, boolean arg1, int arg2, int arg3) {
        ++field1348;
        int var5 = this.method3477(-11833) * super.field8689.field7540 / 10000;
        int[] var6 = new int[4];
        class68.field1045.method251(var6);
        class68.field1045.method292(arg2, arg3 + 2, arg2 - -var5, arg3 - -super.field8689.field7528);
        this.field1345.method3923(arg2, arg3 - -2, super.field8689.field7540, super.field8689.field7528);
        class68.field1045.method292(var6[0], var6[arg0], var6[2], var6[3]);
    }
}
