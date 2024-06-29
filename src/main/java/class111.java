import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class111 {

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Ljr;")
    private class112 field1923 = new class112(64);

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lin;")
    private class91 field1917;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Ljr;")
    public static class112 field1919 = new class112(64);

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 6)
    public static void method978(int arg0) {
        if (arg0 != -1) {
            method978(-34);
        }
        field1919 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 18)
    public static final void method979(boolean arg0, byte arg1, String arg2) {
        if (arg1 >= -51) {
            field1919 = null;
        }
        field1915++;
        class313.method2034(-1, 113, arg0, arg2, -1);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V", line = 29)
    public final void method980(int arg0, int arg1) {
        if (arg1 != 3758) {
            this.field1923 = null;
        }
        class112 var3 = this.field1923;
        synchronized (this.field1923) {
            this.field1923.method987(2, arg0);
        }
        field1916++;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)Low;", line = 42)
    public final class348 method981(int arg0, int arg1) {
        field1922++;
        class112 var3 = this.field1923;
        class348 var4;
        synchronized (this.field1923) {
            var4 = (class348) this.field1923.method992((long) arg1, -126);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field1917;
        byte[] var6;
        synchronized (this.field1917) {
            var6 = this.field1917.method863(-1860, 16, arg1);
            if (arg0 >= -17) {
                this.field1923 = null;
            }
        }
        class348 var7 = new class348();
        if (var6 != null) {
            var7.method2190(new class215(var6), true);
        }
        class112 var8 = this.field1923;
        synchronized (this.field1923) {
            this.field1923.method991(var7, (long) arg1, (byte) -124);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 73)
    public final void method982(byte arg0) {
        field1918++;
        class112 var2 = this.field1923;
        synchronized (this.field1923) {
            this.field1923.method999(0);
        }
        if (arg0 < 126) {
            this.method981(-98, -35);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V", line = 91)
    public final void method983(int arg0) {
        field1921++;
        if (arg0 != 0) {
            this.field1920 = -97;
        }
        class112 var2 = this.field1923;
        synchronized (this.field1923) {
            this.field1923.method996(arg0 ^ 0xFFFFFF94);
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 109)
    public class111(class460 arg0, int arg1, class91 arg2) {
        this.field1917 = arg2;
        if (this.field1917 == null) {
            this.field1920 = 0;
        } else {
            this.field1920 = this.field1917.method860(0, 16);
        }
    }
}
