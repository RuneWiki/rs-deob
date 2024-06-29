import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public abstract class class9 {

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "Lia;")
    public static class15 field75 = class28.method196("sprites", false);

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Lia;")
    public static class15 field74 = class28.method196(" )2 ", false);

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "Lia;")
    public static class15 field76 = class28.method196("Dairy Churn", false);

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "Lia;")
    public static class15 field77 = class28.method196("Silk Trader", false);

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "[[B")
    public static byte[][] field78;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)[Lv;", line = 5)
    public static final class40[] method47(int arg0) {
        class40[] var1 = new class40[mapview.field336];
        for (int var2 = arg0; var2 < mapview.field336; var2++) {
            class40 var3 = new class40();
            var3.field523 = mapview.field294;
            var3.field526 = class3.field30;
            var3.field525 = class6.field60[var2];
            var3.field522 = class30.field425[var2];
            var3.field524 = class33.field471[var2];
            var3.field520 = class25.field358[var2];
            var3.field521 = class10.field79;
            var3.field519 = field78[var2];
            var1[var2] = var3;
        }
        class39.method252(0);
        return var1;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Loa;III)Z", line = 71)
    public static final boolean method49(class27 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method183(arg3, arg2, 14);
        if (var4 == null) {
            return false;
        } else {
            class3.method16(var4, -97);
            int var5 = 80 / ((arg1 + 64) / 36);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(B)V", line = 103)
    public static void method50(byte arg0) {
        field77 = null;
        field75 = null;
        if (arg0 < 38) {
            field73 = -26;
        }
        field74 = null;
        field76 = null;
        field78 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(III)I")
    public abstract int method48(int arg0, int arg1, int arg2);
}
