import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WOJPETNO")
public class class61 {

    @OriginalMember(owner = "WOJPETNO", name = "g", descriptor = "Z")
    public boolean field1646 = false;

    @OriginalMember(owner = "WOJPETNO", name = "h", descriptor = "I")
    public int field1647 = -1;

    @OriginalMember(owner = "WOJPETNO", name = "j", descriptor = "Z")
    public boolean field1649 = true;

    @OriginalMember(owner = "WOJPETNO", name = "a", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "WOJPETNO", name = "d", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "WOJPETNO", name = "e", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "WOJPETNO", name = "f", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "WOJPETNO", name = "i", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "WOJPETNO", name = "c", descriptor = "Ljava/lang/String;")
    public String field1642;

    @OriginalMember(owner = "WOJPETNO", name = "b", descriptor = "[LWOJPETNO;")
    public static class61[] field1641;

    @OriginalMember(owner = "WOJPETNO", name = "a", descriptor = "(LGWOEELWB;B)V")
    public static void method576(class18 arg0, byte arg1) {
        class30 var2 = new class30(true, arg0.method249("varbit.dat", null));
        field1640 = var2.method298();
        if (arg1 != 3) {
            return;
        }
        boolean var3 = false;
        if (field1641 == null) {
            field1641 = new class61[field1640];
        }
        for (int var4 = 0; var4 < field1640; var4++) {
            if (field1641[var4] == null) {
                field1641[var4] = new class61();
            }
            field1641[var4].method577(10762, var4, var2);
            if (field1641[var4].field1646) {
                class25.field966[field1641[var4].field1643].field978 = true;
            }
        }
        if (var2.field1091.length != var2.field1092) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "WOJPETNO", name = "a", descriptor = "(IILMLYYHULT;)V")
    public void method577(int arg0, int arg1, class30 arg2) {
        if (arg0 != 10762) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method296();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1643 = arg2.method298();
                this.field1644 = arg2.method296();
                this.field1645 = arg2.method296();
            } else if (var5 == 10) {
                this.field1642 = arg2.method303();
            } else if (var5 == 2) {
                this.field1646 = true;
            } else if (var5 == 3) {
                this.field1647 = arg2.method301();
            } else if (var5 == 4) {
                this.field1648 = arg2.method301();
            } else if (var5 == 5) {
                this.field1649 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
