import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class120 {

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static volatile int field1756 = 0;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field1754 = 2;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Llf;")
    public static class211 field1747 = new class211(32);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "J")
    public long field1750;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ldh;")
    public class120 field1749;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Ldh;")
    public class120 field1752;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public final void method784(boolean arg0) {
        field1757++;
        if (this.field1749 == null) {
            return;
        }
        this.field1749.field1752 = this.field1752;
        this.field1752.field1749 = this.field1749;
        this.field1752 = null;
        if (arg0) {
            this.field1752 = null;
        }
        this.field1749 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Z")
    public final boolean method785(int arg0) {
        field1755++;
        if (this.field1749 == null) {
            return false;
        } else {
            if (arg0 != 32) {
                this.method784(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method786(int arg0) {
        field1747 = null;
        if (arg0 != 12993) {
            field1751 = 40;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public static int method787(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
