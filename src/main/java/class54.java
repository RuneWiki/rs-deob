import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class54 {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[S")
    public short[] field1043;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[B")
    public byte[] field1041;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[S")
    public short[] field1044;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[Lmh;")
    public class128[] field1049;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
    public int[] field1040;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lq;")
    public static class90 field1051 = new class90(5000);

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lmh;")
    public static class128 field1052 = class22.method156(124, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lmh;")
    public static class128 field1054 = class22.method156(127, "<br>");

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 4)
    public static void method364(int arg0) {
        field1051 = null;
        field1054 = null;
        field1052 = null;
        if (arg0 > -41) {
            field1051 = (class90) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I", line = 18)
    public final int method365(int arg0, int arg1) {
        field1050++;
        if (arg0 != 13808) {
            field1051 = (class90) null;
        }
        return this.field1041[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V", line = 30)
    public static final void method366(int arg0, int arg1) {
        field1046++;
        class229 var2 = class241.method1638(arg1, 106, arg0);
        var2.method1566((byte) -3);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lem;ZII)V", line = 44)
    public static final void method367(class10 arg0, boolean arg1, int arg2, int arg3) {
        field1048++;
        if (class283.field4872 != 0 && class283.field4872 != 3 || !arg0.method79(98)) {
            return;
        }
        int var4 = arg0.field268[arg3];
        if (arg2 < var4 || arg0.field289[arg3] + var4 < arg2) {
            return;
        }
        int var5 = arg2 - arg0.field260 / 2;
        int var6 = arg3 - arg0.field226 / 2;
        int var7 = class216.field3803 + class118.field1997 & 0x7FF;
        int var8 = class141.field2424[var7];
        int var9 = (class145.field2480 + 256) * var8 >> 8;
        if (arg1) {
            field1051 = (class90) null;
        }
        int var10 = class141.field2411[var7];
        int var11 = (class145.field2480 + 256) * var10 >> 8;
        int var12 = var6 * var11 - var5 * var9 >> 11;
        int var13 = class163.field2796.field418 - var12 >> 7;
        int var14 = var5 * var11 + var6 * var9 >> 11;
        int var15 = class163.field2796.field478 + var14 >> 7;
        if (class226.field3943 > 0 && class257.field4426[82] && class257.field4426[81]) {
            class106.method651(false, class4.field72 + var13, class133.field2315, class221.field3889 + var15);
            return;
        }
        boolean var16 = class11.method87(0, 0, 1, 0, class163.field2796.field422[0], var15, 0, class163.field2796.field450[0], var13, 0, 0, true);
        if (!var16) {
            return;
        }
        class71.field1320.method1352(7528, var5);
        class71.field1320.method1352(7528, var6);
        class71.field1320.method1324(class118.field1997, 15803);
        class71.field1320.method1352(7528, 57);
        class71.field1320.method1352(7528, class216.field3803);
        class71.field1320.method1352(7528, class145.field2480);
        class71.field1320.method1352(7528, 89);
        class71.field1320.method1324(class163.field2796.field478, 15803);
        class71.field1320.method1324(class163.field2796.field418, 15803);
        class71.field1320.method1352(7528, class190.field3298);
        class71.field1320.method1352(7528, 63);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)Z", line = 113)
    public final boolean method368(int arg0, int arg1) {
        if (arg1 != 0) {
            method364(-32);
        }
        field1045++;
        return (this.field1041[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V", line = 128)
    public class54(int arg0) {
        this.field1047 = arg0;
        this.field1043 = new short[this.field1047];
        this.field1041 = new byte[this.field1047];
        this.field1044 = new short[this.field1047];
        this.field1049 = new class128[this.field1047];
        this.field1040 = new int[this.field1047];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ldj;I)V", line = 142)
    public static final void method369(class314 arg0, int arg1) {
        class281.field4859 = arg0.method2142(1, class4.field83);
        field1042++;
        class91.field1554 = arg0.method2142(1, class264.field4586);
        class256.field4399 = arg0.method2142(1, class268.field4640);
        class287.field4908 = arg0.method2142(1, class94.field1582);
        class196.field3446 = arg0.method2142(1, class285.field4894);
        class271.field4712 = arg0.method2142(1, class133.field2308);
        class192.field3324 = arg0.method2142(1, class58.field1114);
        class306.field5209 = arg0.method2142(1, class289.field4945);
        class218.field3839 = arg0.method2142(1, class284.field4874);
        class158.field2706 = arg0.method2142(1, class200.field3490);
        class254.field4387 = arg0.method2142(arg1 ^ 0xBD99288A, class10.field368);
        class88.field1512 = arg0.method2142(1, class216.field3805);
        class157.field2689 = arg0.method2142(arg1 + 1114036086, class289.field4959);
        class301.field5113 = arg0.method2142(1, class16.field454);
        class65.field1248 = arg0.method2142(1, class178.field3131);
        class166.field2849 = arg0.method2142(1, class221.field3892);
        class195.field3423 = arg0.method2142(1, class169.field2949);
        if (arg1 != -1114036085) {
            method364(11);
        }
        class285.field4891 = arg0.method2142(1, class37.field750);
        class159.field2728 = arg0.method2142(1, class253.field4365);
    }
}
