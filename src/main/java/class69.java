import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XESCWZPS")
public class class69 {

    @OriginalMember(owner = "XESCWZPS", name = "i", descriptor = "Z")
    public boolean field1642 = false;

    @OriginalMember(owner = "XESCWZPS", name = "j", descriptor = "Z")
    public boolean field1643 = true;

    @OriginalMember(owner = "XESCWZPS", name = "l", descriptor = "Z")
    public boolean field1645 = false;

    @OriginalMember(owner = "XESCWZPS", name = "o", descriptor = "Z")
    public boolean field1648 = false;

    @OriginalMember(owner = "XESCWZPS", name = "p", descriptor = "I")
    public int field1649 = -1;

    @OriginalMember(owner = "XESCWZPS", name = "q", descriptor = "Z")
    public boolean field1650 = true;

    @OriginalMember(owner = "XESCWZPS", name = "b", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "XESCWZPS", name = "d", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "XESCWZPS", name = "g", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "XESCWZPS", name = "h", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "XESCWZPS", name = "k", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "XESCWZPS", name = "m", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "XESCWZPS", name = "n", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "XESCWZPS", name = "f", descriptor = "Ljava/lang/String;")
    public String field1639;

    @OriginalMember(owner = "XESCWZPS", name = "a", descriptor = "Z")
    private static boolean field1634;

    @OriginalMember(owner = "XESCWZPS", name = "e", descriptor = "[I")
    public static int[] field1638;

    @OriginalMember(owner = "XESCWZPS", name = "c", descriptor = "[LXESCWZPS;")
    public static class69[] field1636;

    @OriginalMember(owner = "XESCWZPS", name = "a", descriptor = "(ILTXPLZUUI;)V")
    public static void method574(int arg0, class60 arg1) {
        class43 var2 = new class43(arg1.method506("varp.dat", null), 0);
        if (arg0 < 3 || arg0 > 3) {
            field1634 = !field1634;
        }
        field1637 = 0;
        field1635 = var2.method332();
        if (field1636 == null) {
            field1636 = new class69[field1635];
        }
        if (field1638 == null) {
            field1638 = new int[field1635];
        }
        for (int var3 = 0; var3 < field1635; var3++) {
            if (field1636[var3] == null) {
                field1636[var3] = new class69();
            }
            field1636[var3].method575(var3, var2, -376);
        }
        if (var2.field1104.length != var2.field1105) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "XESCWZPS", name = "a", descriptor = "(ILPKHWFJLM;I)V")
    public void method575(int arg0, class43 arg1, int arg2) {
        if (arg2 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg1.method330();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1640 = arg1.method330();
            } else if (var4 == 2) {
                this.field1641 = arg1.method330();
            } else if (var4 == 3) {
                this.field1642 = true;
                field1638[field1637++] = arg0;
            } else if (var4 == 4) {
                this.field1643 = false;
            } else if (var4 == 5) {
                this.field1644 = arg1.method332();
            } else if (var4 == 6) {
                this.field1645 = true;
            } else if (var4 == 7) {
                this.field1646 = arg1.method335();
            } else if (var4 == 8) {
                this.field1647 = 1;
                this.field1648 = true;
            } else if (var4 == 10) {
                this.field1639 = arg1.method337();
            } else if (var4 == 11) {
                this.field1648 = true;
            } else if (var4 == 12) {
                this.field1649 = arg1.method335();
            } else if (var4 == 13) {
                this.field1647 = 2;
                this.field1648 = true;
            } else if (var4 == 14) {
                this.field1650 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
