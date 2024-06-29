import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class260 {

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "Lld;")
    private class105 field3446;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Liu;")
    public static class375 field3448;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lag;")
    private class445 field3445;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static final void method1462(int arg0) {
        field3447++;
        class387.field5360 = null;
        if (arg0 <= 110) {
            field3448 = null;
        }
        class308.field4073 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lag;")
    public final class445 method1463(int arg0) {
        field3444++;
        class445 var2 = this.field3445;
        if (this.field3446.field1573 == var2) {
            this.field3445 = null;
            return null;
        }
        this.field3445 = var2.field6046;
        if (arg0 <= 10) {
            method1462(-122);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public static void method1464(int arg0) {
        if (arg0 >= -117) {
            field3448 = null;
        }
        field3448 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lld;I)V")
    public final void method1465(class105 arg0, int arg1) {
        if (arg1 != 19067) {
            this.field3446 = null;
        }
        this.field3446 = arg0;
        field3449++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lag;")
    public final class445 method1466(byte arg0) {
        field3450++;
        class445 var2 = this.field3446.field1573.field6046;
        if (this.field3446.field1573 == var2) {
            this.field3445 = null;
            return null;
        } else {
            int var3 = 10 / ((arg0 + 61) / 35);
            this.field3445 = var2.field6046;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class260() {
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lld;)V")
    public class260(class105 arg0) {
        this.field3446 = arg0;
    }
}
