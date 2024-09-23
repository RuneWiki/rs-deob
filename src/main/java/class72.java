import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZIUDVZAI")
public class class72 {

    @OriginalMember(owner = "ZIUDVZAI", name = "g", descriptor = "Z")
    public boolean field1715 = false;

    @OriginalMember(owner = "ZIUDVZAI", name = "h", descriptor = "I")
    public int field1716 = -1;

    @OriginalMember(owner = "ZIUDVZAI", name = "a", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "ZIUDVZAI", name = "d", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "ZIUDVZAI", name = "e", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "ZIUDVZAI", name = "f", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "ZIUDVZAI", name = "i", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "ZIUDVZAI", name = "c", descriptor = "Ljava/lang/String;")
    public String field1711;

    @OriginalMember(owner = "ZIUDVZAI", name = "b", descriptor = "[LZIUDVZAI;")
    public static class72[] field1710;

    @OriginalMember(owner = "ZIUDVZAI", name = "a", descriptor = "(ZLXRWUKRPO;)V")
    public static void method589(boolean arg0, class65 arg1) {
        class21 var2 = new class21(arg1.method581("varbit.dat", null), -49015);
        if (arg0) {
            return;
        }
        field1709 = var2.method246();
        if (field1710 == null) {
            field1710 = new class72[field1709];
        }
        for (int var3 = 0; var3 < field1709; var3++) {
            if (field1710[var3] == null) {
                field1710[var3] = new class72();
            }
            field1710[var3].method590(false, var3, var2);
            if (field1710[var3].field1715) {
                class4.field95[field1710[var3].field1712].field107 = true;
            }
        }
        if (var2.field817.length != var2.field818) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "ZIUDVZAI", name = "a", descriptor = "(ZILGLMIQHJI;)V")
    public void method590(boolean arg0, int arg1, class21 arg2) {
        if (arg0) {
            return;
        }
        while (true) {
            int var4 = arg2.method244();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1712 = arg2.method246();
                this.field1713 = arg2.method244();
                this.field1714 = arg2.method244();
            } else if (var4 == 10) {
                this.field1711 = arg2.method251();
            } else if (var4 == 2) {
                this.field1715 = true;
            } else if (var4 == 3) {
                this.field1716 = arg2.method249();
            } else if (var4 == 4) {
                this.field1717 = arg2.method249();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
