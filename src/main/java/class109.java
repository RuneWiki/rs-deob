import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class109 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Laj;")
    private class287 field1919 = new class287(64);

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Lom;")
    private class344 field1922;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lln;")
    public static class349 field1916;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method979(int arg0) {
        class287 var2 = this.field1919;
        synchronized (this.field1919) {
            this.field1919.method1912(-2552);
            if (arg0 != 2048) {
                this.method979(73);
            }
        }
        field1921++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lap;")
    public final class445 method980(int arg0, int arg1) {
        field1920++;
        class287 var3 = this.field1919;
        class445 var4;
        synchronized (this.field1919) {
            var4 = (class445) this.field1919.method1900((long) arg1, 76);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 5 % ((arg0 + 21) / 52);
        class344 var6 = this.field1922;
        byte[] var7;
        synchronized (this.field1922) {
            var7 = this.field1922.method2216(11, arg1, true);
        }
        class445 var8 = new class445();
        if (var7 != null) {
            var8.method2680(new class61(var7), (byte) 29);
        }
        class287 var9 = this.field1919;
        synchronized (this.field1919) {
            this.field1919.method1904(var8, (long) arg1, -1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V")
    public final void method981(int arg0, byte arg1) {
        if (arg1 != 115) {
            this.field1919 = null;
        }
        field1915++;
        class287 var3 = this.field1919;
        synchronized (this.field1919) {
            this.field1919.method1908(arg0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        class287 var2 = this.field1919;
        synchronized (this.field1919) {
            this.field1919.method1913(true);
        }
        field1918++;
        if (arg0 != 64) {
            this.method980(-88, -93);
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    public static void method983(int arg0) {
        if (arg0 != 26945) {
            field1916 = null;
        }
        field1916 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)Z")
    public static final boolean method984(int arg0, int arg1, byte arg2) {
        field1917++;
        int var3 = 23 / ((2 - arg2) / 37);
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class109(class398 arg0, int arg1, class344 arg2) {
        this.field1922 = arg2;
        if (this.field1922 != null) {
            this.field1922.method2236(11, 0);
        }
    }
}
