import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BCUFZZFO")
public class class4 {

    @OriginalMember(owner = "BCUFZZFO", name = "g", descriptor = "Z")
    public boolean field32 = false;

    @OriginalMember(owner = "BCUFZZFO", name = "h", descriptor = "I")
    public int field33 = -1;

    @OriginalMember(owner = "BCUFZZFO", name = "j", descriptor = "Z")
    public boolean field35 = true;

    @OriginalMember(owner = "BCUFZZFO", name = "a", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "BCUFZZFO", name = "d", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "BCUFZZFO", name = "e", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "BCUFZZFO", name = "f", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "BCUFZZFO", name = "i", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "BCUFZZFO", name = "c", descriptor = "Ljava/lang/String;")
    public String field28;

    @OriginalMember(owner = "BCUFZZFO", name = "b", descriptor = "[LBCUFZZFO;")
    public static class4[] field27;

    @OriginalMember(owner = "BCUFZZFO", name = "a", descriptor = "(ILTXPLZUUI;)V")
    public static void method6(int arg0, class60 arg1) {
        class43 var2 = new class43(arg1.method506("varbit.dat", null), 0);
        if (arg0 != 3) {
            return;
        }
        field26 = var2.method332();
        if (field27 == null) {
            field27 = new class4[field26];
        }
        for (int var3 = 0; var3 < field26; var3++) {
            if (field27[var3] == null) {
                field27[var3] = new class4();
            }
            field27[var3].method7(var3, var2, -376);
            if (field27[var3].field32) {
                class69.field1636[field27[var3].field29].field1648 = true;
            }
        }
        if (var2.field1104.length != var2.field1105) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "BCUFZZFO", name = "a", descriptor = "(ILPKHWFJLM;I)V")
    public void method7(int arg0, class43 arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg1.method330();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field29 = arg1.method332();
                this.field30 = arg1.method330();
                this.field31 = arg1.method330();
            } else if (var5 == 10) {
                this.field28 = arg1.method337();
            } else if (var5 == 2) {
                this.field32 = true;
            } else if (var5 == 3) {
                this.field33 = arg1.method335();
            } else if (var5 == 4) {
                this.field34 = arg1.method335();
            } else if (var5 == 5) {
                this.field35 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
