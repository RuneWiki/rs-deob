import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZESTMKXA")
public class class72 {

    @OriginalMember(owner = "ZESTMKXA", name = "h", descriptor = "Z")
    public boolean field1720 = false;

    @OriginalMember(owner = "ZESTMKXA", name = "i", descriptor = "I")
    public int field1721 = -1;

    @OriginalMember(owner = "ZESTMKXA", name = "a", descriptor = "I")
    private static int field1713 = -113;

    @OriginalMember(owner = "ZESTMKXA", name = "b", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "ZESTMKXA", name = "e", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "ZESTMKXA", name = "f", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "ZESTMKXA", name = "g", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "ZESTMKXA", name = "j", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "ZESTMKXA", name = "d", descriptor = "Ljava/lang/String;")
    public String field1716;

    @OriginalMember(owner = "ZESTMKXA", name = "c", descriptor = "[LZESTMKXA;")
    public static class72[] field1715;

    @OriginalMember(owner = "ZESTMKXA", name = "a", descriptor = "(ZLEAXVDNXA;)V")
    public static void method591(boolean arg0, class12 arg1) {
        class5 var2 = new class5(2, arg1.method255("varbit.dat", null));
        field1714 = var2.method46();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1715 == null) {
            field1715 = new class72[field1714];
        }
        for (int var4 = 0; var4 < field1714; var4++) {
            if (field1715[var4] == null) {
                field1715[var4] = new class72();
            }
            field1715[var4].method592(var4, field1713, var2);
            if (field1715[var4].field1720) {
                class9.field648[field1715[var4].field1717].field660 = true;
            }
        }
        if (var2.field122.length != var2.field123) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "ZESTMKXA", name = "a", descriptor = "(IILCKBTFRZM;)V")
    public void method592(int arg0, int arg1, class5 arg2) {
        if (arg1 >= 0) {
            return;
        }
        while (true) {
            int var4 = arg2.method44();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1717 = arg2.method46();
                this.field1718 = arg2.method44();
                this.field1719 = arg2.method44();
            } else if (var4 == 10) {
                this.field1716 = arg2.method51();
            } else if (var4 == 2) {
                this.field1720 = true;
            } else if (var4 == 3) {
                this.field1721 = arg2.method49();
            } else if (var4 == 4) {
                this.field1722 = arg2.method49();
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
