import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class60 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    private int field838 = 0;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Lcd;")
    private class69 field846;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Z")
    public static boolean field840 = false;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lcd;")
    public static class69 field839 = new class69(512);

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Ltf;")
    private class165 field835;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lbf;")
    public static class58 field847;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[Lbf;")
    public static class58[] field837;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Ltf;", line = 7)
    public final class165 method405(byte arg0) {
        if (arg0 > -43) {
            return (class165) null;
        } else {
            this.field838 = 0;
            field836++;
            return this.method407(-962);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 20)
    public static final void method406(int arg0) {
        class174.field2890 = null;
        if (arg0 >= -32) {
            method408(-45, false);
        }
        field848++;
        class136.method1012();
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Ltf;", line = 36)
    public final class165 method407(int arg0) {
        field844++;
        if (arg0 != -962) {
            return (class165) null;
        } else if (this.field838 <= 0 || this.field846.field985[this.field838 - 1] == this.field835) {
            class165 var3;
            do {
                if (this.field838 >= this.field846.field972) {
                    return null;
                }
                var3 = this.field846.field985[this.field838++].field2747;
            } while (this.field846.field985[this.field838 - 1] == var3);
            this.field835 = var3.field2747;
            return var3;
        } else {
            class165 var2 = this.field835;
            this.field835 = var2.field2747;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)Z", line = 68)
    public static final boolean method408(int arg0, boolean arg1) {
        field845++;
        if (!arg1) {
            method406(42);
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 79)
    public static void method409(boolean arg0) {
        if (arg0) {
            method408(58, true);
        }
        field837 = null;
        field839 = null;
        field847 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lcd;)V", line = 123)
    public class60(class69 arg0) {
        this.field846 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 107)
    public static final void method410(int arg0, int arg1, int arg2) {
        if (arg0 != -11484) {
            method410(54, 19, 76);
        }
        field842++;
        if (class263.method1875(20, arg2)) {
            class25.method143(arg1, class221.field3547[arg2], 127);
        }
    }
}
