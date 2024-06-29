import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class259 extends class175 {

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    private int field4499 = 4096;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    private int field4488 = 0;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Lmb;")
    private static class96 field4483 = class243.method1708("Jan", (byte) 127);

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "Lmb;")
    public static class96 field4484 = class243.method1708(")2", (byte) 112);

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Lmb;")
    private static class96 field4481 = class243.method1708("Mar", (byte) 101);

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "Lmb;")
    private static class96 field4489 = class243.method1708("May", (byte) 100);

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lmb;")
    private static class96 field4490 = class243.method1708("Dec", (byte) 114);

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Lmb;")
    private static class96 field4482 = class243.method1708("Jul", (byte) 93);

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field4493 = 0;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lmb;")
    private static class96 field4497 = class243.method1708("Feb", (byte) 123);

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Lmb;")
    private static class96 field4480 = class243.method1708("Jun", (byte) 112);

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lmb;")
    public static class96 field4496 = class243.method1708("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) 103);

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Lmb;")
    private static class96 field4479 = class243.method1708("Nov", (byte) 118);

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lmb;")
    private static class96 field4500 = class243.method1708("Apr", (byte) 111);

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lmb;")
    private static class96 field4495 = class243.method1708("Aug", (byte) 91);

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lmb;")
    private static class96 field4498 = class243.method1708("Sep", (byte) 116);

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "[I")
    public static int[] field4485 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "Lmb;")
    private static class96 field4502 = class243.method1708("Oct", (byte) 127);

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "[Lmb;")
    public static class96[] field4492 = new class96[] { field4483, field4497, field4481, field4500, field4489, field4480, field4482, field4495, field4498, field4502, field4479, field4490 };

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "[[[Ldk;")
    public static class187[][][] field4487;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lff;Z)Z")
    public static final boolean method1788(class3 arg0, boolean arg1) {
        ++field4486;
        if (arg0.method15(-96, class203.field3521)) {
            return true;
        } else {
            return !arg1 ? false : false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class259() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IJ)V")
    public static final void method1789(int arg0, long arg1) {
        ++field4494;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        int var3 = 40 % ((11 - arg0) / 51);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field4478;
        int var3 = -66 % ((62 - arg0) / 54);
        int[] var4 = super.field3044.method904((byte) 92, arg1);
        if (super.field3044.field2150) {
            int[] var5 = this.method1255(0, arg1, 128);
            for (int var6 = 0; ~var6 > ~class1.field11; ++var6) {
                int var7 = var5[var6];
                var4[var6] = var7 >= this.field4488 && ~var7 >= ~this.field4499 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field4499 = arg2.method1663((byte) -66);
            }
        } else {
            this.field4488 = arg2.method1663((byte) 79);
        }
        int var5 = -40 % ((-22 - arg0) / 58);
        ++field4491;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
    public static void method1790(int arg0) {
        field4497 = null;
        field4492 = null;
        field4495 = null;
        if (arg0 != 30908) {
            method1788((class3) null, false);
        }
        field4479 = null;
        field4484 = null;
        field4498 = null;
        field4480 = null;
        field4487 = null;
        field4485 = null;
        field4481 = null;
        field4496 = null;
        field4500 = null;
        field4489 = null;
        field4483 = null;
        field4502 = null;
        field4490 = null;
        field4482 = null;
    }
}
