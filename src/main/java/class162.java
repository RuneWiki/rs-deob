import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class162 {

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Lfc;")
    private class262 field2043 = new class262(64);

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "Lfc;")
    public class262 field2044 = new class262(2);

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "Lni;")
    private class522 field2036;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "Lni;")
    public class522 field2042;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "[I")
    public static int[] field2037 = new int[1];

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "J")
    public static long field2035;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Lsba;")
    public static class218 field2034;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static void method956(byte arg0) {
        int var1 = -118 % ((-arg0 - 83) / 34);
        field2034 = null;
        field2037 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public final void method957(int arg0) {
        class262 var2 = this.field2043;
        synchronized (this.field2043) {
            this.field2043.method1575((byte) -108);
        }
        field2040++;
        class262 var3 = this.field2044;
        synchronized (this.field2044) {
            this.field2044.method1575((byte) -100);
        }
        if (arg0 != 1) {
            this.method960(false, 10);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
    public final void method958(byte arg0) {
        field2041++;
        class262 var2 = this.field2043;
        synchronized (this.field2043) {
            this.field2043.method1563(123);
        }
        class262 var3 = this.field2044;
        synchronized (this.field2044) {
            this.field2044.method1563(42);
        }
        if (arg0 <= 121) {
            method956((byte) 127);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Lop;")
    public final class191 method959(int arg0, int arg1) {
        field2038++;
        if (arg1 != 25930) {
            this.field2036 = null;
        }
        class262 var3 = this.field2043;
        class191 var4;
        synchronized (this.field2043) {
            var4 = (class191) this.field2043.method1571(-123, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field2036;
        byte[] var6;
        synchronized (this.field2036) {
            var6 = this.field2036.method2885(arg0, 33, false);
        }
        class191 var7 = new class191();
        var7.field2304 = this;
        if (var6 != null) {
            var7.method1070(true, new class611(var6));
        }
        class262 var8 = this.field2043;
        synchronized (this.field2043) {
            this.field2043.method1574((long) arg0, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
    public final void method960(boolean arg0, int arg1) {
        class262 var3 = this.field2043;
        synchronized (this.field2043) {
            this.field2043.method1569((byte) 62, arg1);
        }
        field2039++;
        if (arg0) {
            this.method960(true, 93);
        }
        class262 var4 = this.field2044;
        synchronized (this.field2044) {
            this.field2044.method1569((byte) 62, arg1);
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lrga;ILni;Lni;)V")
    public class162(class242 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field2036 = arg2;
        this.field2042 = arg3;
        this.field2036.method2901(0, 33);
    }
}
