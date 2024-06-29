import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class102 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    private int field1862 = 0;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lfk;")
    private class144 field1859;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
    public static boolean field1861 = false;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Loh;")
    public static class258 field1868 = class153.method1046("cookiehost", 107);

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lkh;")
    private class154 field1860;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lgb;")
    public static class213 field1863;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 14)
    public static void method772(byte arg0) {
        if (arg0 != 100) {
            method774((Component) null, false);
        }
        field1868 = null;
        field1863 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB)I", line = 25)
    public static final int method773(int arg0, int arg1, byte arg2) {
        field1867++;
        if (arg2 != -80) {
            method773(22, 3, (byte) 87);
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lfk;)V", line = 120)
    public class102(class144 arg0) {
        this.field1859 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 71)
    public static final void method774(Component arg0, boolean arg1) {
        if (arg1) {
            method776((class213) null, -44, 87, 126);
        }
        field1866++;
        arg0.removeKeyListener(class215.field3729);
        arg0.removeFocusListener(class215.field3729);
        class7.field93 = -1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Lkh;", line = 84)
    public final class154 method775(int arg0) {
        this.field1862 = 0;
        field1864++;
        if (arg0 != -3) {
            this.method775(-3);
        }
        return this.method777(false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lgb;III)[Ldb;", line = 101)
    public static final class41[] method776(class213 arg0, int arg1, int arg2, int arg3) {
        field1865++;
        if (class162.method1086(0, arg0, arg1, arg3)) {
            return arg2 <= 37 ? (class41[]) null : class148.method1021(-127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Lkh;", line = 132)
    public final class154 method777(boolean arg0) {
        if (arg0) {
            this.field1860 = (class154) null;
        }
        field1869++;
        if (this.field1862 > 0 && this.field1859.field2417[this.field1862 - 1] != this.field1860) {
            class154 var2 = this.field1860;
            this.field1860 = var2.field2636;
            return var2;
        }
        class154 var3;
        do {
            if (this.field1862 >= this.field1859.field2403) {
                return null;
            }
            var3 = this.field1859.field2417[this.field1862++].field2636;
        } while (this.field1859.field2417[this.field1862 - 1] == var3);
        this.field1860 = var3.field2636;
        return var3;
    }
}
