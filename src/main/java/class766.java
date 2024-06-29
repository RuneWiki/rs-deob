import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class766 extends class620 {

    @OriginalMember(owner = "client!it", name = "v", descriptor = "Ljava/lang/String;")
    public static String field10546 = null;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Laf;")
    public static class39 field10538 = new class39(4);

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public int field10539;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public int field10542;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "I")
    public int field10543;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "I")
    public static int field10545;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "I")
    public int field10547;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field10548;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "I")
    public static int field10549;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "J")
    public long field10544;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I")
    public final int method1623(boolean arg0) {
        if (arg0) {
            field10545++;
            return this.field10542;
        } else {
            return 123;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)J")
    public final long method1624(int arg0) {
        if (arg0 > -5) {
            this.field10542 = 120;
        }
        field10541++;
        return this.field10544;
    }

    @OriginalMember(owner = "client!it", name = "h", descriptor = "(I)V")
    public static void method4221(int arg0) {
        field10538 = null;
        if (arg0 < 77) {
            method4221(-69);
        }
        field10546 = null;
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "(I)I")
    public final int method1626(int arg0) {
        field10548++;
        if (arg0 <= 22) {
            this.method1626(-105);
        }
        return this.field10547;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)I")
    public final int method1625(int arg0) {
        if (arg0 != 8459) {
            this.field10543 = -26;
        }
        field10540++;
        return this.field10539;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)I")
    public final int method1627(boolean arg0) {
        field10549++;
        return arg0 ? -115 : this.field10543;
    }
}
