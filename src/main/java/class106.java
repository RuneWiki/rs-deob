import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class106 {

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Loe;")
    private class183 field1381;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1382 = -1;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "Lii;")
    private class513 field1378;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lii;", line = 7)
    public final class513 method772(int arg0) {
        field1380++;
        int var2 = 21 % ((arg0 + 30) / 43);
        class513 var3 = this.field1378;
        if (this.field1381.field2232 == var3) {
            this.field1378 = null;
            return null;
        } else {
            this.field1378 = var3.field7520;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Loe;I)V", line = 26)
    public final void method773(class183 arg0, int arg1) {
        field1383++;
        this.field1381 = arg0;
        if (arg1 < 67) {
            this.field1381 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)Lii;", line = 41)
    public final class513 method774(int arg0) {
        if (arg0 < 72) {
            this.field1378 = null;
        }
        field1379++;
        class513 var2 = this.field1381.field2232.field7520;
        if (this.field1381.field2232 == var2) {
            this.field1378 = null;
            return null;
        } else {
            this.field1378 = var2.field7520;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 61)
    public class106() {
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Loe;)V", line = 63)
    public class106(class183 arg0) {
        this.field1381 = arg0;
    }
}
