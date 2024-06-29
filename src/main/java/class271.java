import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class271 extends class163 {

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "[Lsk;")
    public class269[] field4624 = new class269[5];

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "[I")
    public int[] field4627 = new int[5];

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public int field4634 = 0;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Lke;")
    private static class256 field4638 = class316.method2202("skill: ", 27626);

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Lke;")
    public static class256 field4640 = field4638;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public int field4626;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "Ldj;")
    public class139 field4632;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Lka;")
    public class197 field4639;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "Lnm;")
    public class198 field4631;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Lbf;")
    public class223 field4628;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Lmh;")
    public class271 field4619;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "Lhk;")
    public class39 field4643;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "Lil;")
    public class3 field4625;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Z")
    public boolean field4635;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Z")
    public boolean field4636;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "Z")
    public boolean field4644;

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V", line = 9)
    public class271(int arg0, int arg1, int arg2) {
        this.field4620 = arg1;
        this.field4621 = arg2;
        this.field4633 = this.field4622 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 20)
    public static void method1870(int arg0) {
        if (arg0 == 0) {
            field4640 = null;
            field4638 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Ljk;", line = 55)
    public static final class273 method1871(int arg0, int arg1) {
        class273 var2 = (class273) class209.field3775.method2077(-13408, (long) arg1);
        field4618++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field2749.method1016(class29.method208((byte) -21, arg1), 100, class50.method403(-85, arg1));
        if (arg0 < 121) {
            field4640 = (class256) null;
        }
        class273 var4 = new class273();
        var4.field4684 = arg1;
        if (var3 != null) {
            var4.method1891(new class41(var3), (byte) 119);
        }
        var4.method1883(-90);
        if (!class316.field5450 && var4.field4700) {
            var4.field4676 = null;
        }
        if (var4.field4709) {
            var4.field4710 = 0;
            var4.field4661 = false;
        }
        class209.field3775.method2074(var4, (long) arg1, -1);
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V", line = 100)
    public static final void method1872(int arg0, int arg1) {
        if (arg0 == 2048) {
            field4629++;
            class77 var2 = class156.method1158(7, false, arg1);
            var2.method586((byte) 98);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)V", line = 114)
    public static final void method1873(int arg0, byte arg1, int arg2) {
        if (class161.field2858 != arg2) {
            class290.field5017 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class290.field5017[var3] = (var3 << 12) / arg2;
            }
            class159.field2836 = arg2 == 64 ? 2048 : 4096;
            class285.field4945 = arg2 - 1;
            class161.field2858 = arg2;
        }
        field4646++;
        if (arg1 > -41) {
            field4638 = (class256) null;
        }
        if (class38.field697 == arg0) {
            return;
        }
        if (class161.field2858 == arg0) {
            class292.field5049 = class290.field5017;
        } else {
            class292.field5049 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class292.field5049[var4] = (var4 << 12) / arg0;
            }
        }
        class38.field697 = arg0;
        class19.field255 = arg0 - 1;
    }
}
