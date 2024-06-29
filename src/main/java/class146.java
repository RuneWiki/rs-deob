import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class146 {

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "Laa;")
    private class275 field1925 = new class275();

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Lsi;")
    public static class321 field1921 = new class321(8);

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Lsf;")
    public static class143 field1923 = new class143(128);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Laa;")
    private class275 field1927;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 7)
    public static void method971(int arg0) {
        if (arg0 != 0) {
            method971(35);
        }
        field1923 = null;
        field1921 = null;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)Laa;", line = 23)
    public final class275 method972(int arg0) {
        field1917++;
        class275 var2 = this.field1925.field4042;
        if (arg0 != 128) {
            field1915 = -111;
        }
        if (this.field1925 == var2) {
            this.field1927 = null;
            return null;
        } else {
            this.field1927 = var2.field4042;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method973(int arg0) {
        if (arg0 != 128) {
            field1923 = null;
        }
        field1918++;
        return this.field1925.field4040 == this.field1925;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Laa;B)V", line = 55)
    public final void method974(class275 arg0, byte arg1) {
        if (arg0.field4042 != null) {
            arg0.method1754((byte) 71);
        }
        field1919++;
        if (arg1 >= -109) {
            this.field1925 = null;
        }
        arg0.field4040 = this.field1925;
        arg0.field4042 = this.field1925.field4042;
        arg0.field4042.field4040 = arg0;
        arg0.field4040.field4042 = arg0;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)I", line = 79)
    public final int method975(int arg0) {
        field1922++;
        int var2 = 0;
        if (arg0 != 18337) {
            return -75;
        }
        class275 var3 = this.field1925.field4040;
        while (this.field1925 != var3) {
            var3 = var3.field4040;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Laa;", line = 100)
    public final class275 method976(byte arg0) {
        field1916++;
        class275 var2 = this.field1925.field4040;
        if (arg0 != 42) {
            return null;
        } else if (this.field1925 == var2) {
            this.field1927 = null;
            return null;
        } else {
            this.field1927 = var2.field4040;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V", line = 123)
    public final void method977(int arg0) {
        field1914++;
        while (true) {
            class275 var2 = this.field1925.field4040;
            if (this.field1925 == var2) {
                this.field1927 = null;
                if (arg0 == 0) {
                    return;
                } else {
                    field1923 = null;
                    return;
                }
            }
            var2.method1754((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)Laa;", line = 147)
    public final class275 method978(byte arg0) {
        int var2 = -50 % ((31 - arg0) / 62);
        field1920++;
        class275 var3 = this.field1925.field4040;
        if (this.field1925 == var3) {
            return null;
        } else {
            var3.method1754((byte) 71);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)Laa;", line = 173)
    public final class275 method979(int arg0) {
        int var2 = -79 / ((-arg0 - 28) / 45);
        field1924++;
        class275 var3 = this.field1927;
        if (this.field1925 == var3) {
            this.field1927 = null;
            return null;
        } else {
            this.field1927 = var3.field4040;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V", line = 201)
    public class146() {
        this.field1925.field4040 = this.field1925;
        this.field1925.field4042 = this.field1925;
    }
}
