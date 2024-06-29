import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class121 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lne;")
    private class83 field1930 = new class83();

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    public static boolean field1926 = false;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lag;")
    public static class211 field1934 = null;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1935 = "purple:";

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Loh;")
    public static class264 field1929 = new class264();

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lne;")
    private class83 field1937;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method851(int arg0) {
        field1934 = null;
        field1935 = null;
        int var1 = -116 / ((-arg0 - 19) / 38);
        field1929 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static final void method852(int arg0) {
        class97.field1557.method1257(-111);
        field1931++;
        if (arg0 >= -38) {
            method852(100);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    public final int method853(byte arg0) {
        field1932++;
        int var2 = 0;
        class83 var3 = this.field1930.field1378;
        if (arg0 != -57) {
            this.method853((byte) 16);
        }
        while (this.field1930 != var3) {
            var2++;
            var3 = var3.field1378;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static final void method854(byte arg0) {
        class57.field954.method1257(-125);
        if (arg0 < -98) {
            field1928++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Lne;")
    public final class83 method855(boolean arg0) {
        if (!arg0) {
            return null;
        }
        class83 var2 = this.field1937;
        field1933++;
        if (this.field1930 == var2) {
            this.field1937 = null;
            return null;
        } else {
            this.field1937 = var2.field1378;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lne;")
    public final class83 method856(int arg0) {
        class83 var2 = this.field1930.field1378;
        field1936++;
        if (this.field1930 == var2) {
            this.field1937 = null;
            return null;
        }
        if (arg0 >= -122) {
            this.method853((byte) 45);
        }
        this.field1937 = var2.field1378;
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lne;I)V")
    public final void method857(class83 arg0, int arg1) {
        field1925++;
        int var3 = 92 / ((arg1 - 19) / 62);
        if (arg0.field1383 != null) {
            arg0.method574(-95);
        }
        arg0.field1378 = this.field1930;
        arg0.field1383 = this.field1930.field1383;
        arg0.field1383.field1378 = arg0;
        arg0.field1378.field1383 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILdk;)V")
    public static final void method858(int arg0, class251 arg1) {
        class270.field4352 = arg1;
        field1927++;
        if (arg0 <= 76) {
            method858(65, (class251) null);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class121() {
        this.field1930.field1383 = this.field1930;
        this.field1930.field1378 = this.field1930;
    }
}
