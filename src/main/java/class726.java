import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class726 extends class71 {

    @OriginalMember(owner = "client!uha", name = "m", descriptor = "I")
    public int field10058 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uha", name = "v", descriptor = "I")
    public int field10067 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uha", name = "w", descriptor = "I")
    public int field10068 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uha", name = "u", descriptor = "I")
    public int field10066 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uha", name = "o", descriptor = "I")
    public int field10060 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!uha", name = "r", descriptor = "I")
    public int field10063 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
    public int field10071 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
    public int field10077 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!uha", name = "q", descriptor = "Lto;")
    public class717 field10062;

    @OriginalMember(owner = "client!uha", name = "n", descriptor = "I")
    public static int field10059 = 0;

    @OriginalMember(owner = "client!uha", name = "k", descriptor = "Z")
    public static boolean field10056 = true;

    @OriginalMember(owner = "client!uha", name = "x", descriptor = "I")
    public static int field10069 = 1401;

    @OriginalMember(owner = "client!uha", name = "s", descriptor = "I")
    public static int field10064 = 100;

    @OriginalMember(owner = "client!uha", name = "t", descriptor = "I")
    public static int field10065 = 100;

    @OriginalMember(owner = "client!uha", name = "j", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!uha", name = "l", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!uha", name = "p", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!uha", name = "A", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!uha", name = "C", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!uha", name = "E", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!uha", name = "G", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!uha", name = "D", descriptor = "Lqg;")
    public static class269 field10075;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)Z")
    public static final boolean method4050(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field10064 = 32;
        }
        field10072++;
        return (arg0 & 0x40000) != 0 | class551.method3267((byte) -66, arg0, arg1) || class286.method1899((byte) -122, arg1, arg0);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIB)Z")
    public final boolean method4051(int arg0, int arg1, byte arg2) {
        field10076++;
        if (this.field10060 <= arg0 && arg0 <= this.field10058 && arg1 >= this.field10067 && this.field10077 >= arg1) {
            return true;
        } else if (arg0 >= this.field10066 && arg0 <= this.field10063 && this.field10068 <= arg1 && arg1 <= this.field10071) {
            return true;
        } else if (arg2 < 116) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(III)I")
    public static final int method4052(int arg0, int arg1, int arg2) {
        if (arg2 != Integer.MAX_VALUE) {
            field10065 = 19;
        }
        field10078++;
        int var3 = class181.method1144(-24140, arg0 - 1, arg1 + -1) - (-class181.method1144(-24140, arg0 - 1, arg1 + 1) - class181.method1144(-24140, arg0 + 1, arg1 - 1)) + class181.method1144(-24140, arg0 + 1, arg1 + 1);
        int var4 = class181.method1144(-24140, arg0, arg1 - 1) + (class181.method1144(arg2 + 2147459509, arg0, arg1 + 1) - (-class181.method1144(-24140, arg0 - 1, arg1) - class181.method1144(-24140, arg0 + 1, arg1)));
        int var5 = class181.method1144(arg2 + 2147459509, arg0, arg1);
        return var3 / 16 + var5 / 4 + (var4 / 8);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lnf;B)V")
    public static final void method4053(class20 arg0, byte arg1) {
        class325.field4495 = arg0;
        if (arg1 != 116) {
            method4053(null, (byte) -5);
        }
        field10074++;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)I")
    public static final int method4054(boolean arg0) {
        field10073++;
        class548 var1 = class129.field1802;
        boolean var2 = false;
        if (class332.field4707.field4789.method963(0) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class577.method3365(0, var3, null, null, 106, 0);
            var2 = true;
        }
        long var4 = class97.method664((byte) -50);
        if (arg0) {
            return -84;
        }
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1423(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class97.method664((byte) -50) - var4);
        var1.method3249(0, 124, 100, 100, -16777216, 0);
        if (var2) {
            var1.method3248((byte) -88);
        }
        return var7;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
    public static void method4055(int arg0) {
        field10075 = null;
        if (arg0 <= 56) {
            field10059 = 109;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B[Lfd;)V")
    public static final void method4056(byte arg0, class298[] arg1) {
        class3.field24 = arg1.length;
        field10061++;
        class11.field91 = new int[class3.field24 + 10];
        class719.field10005 = new class298[class3.field24 + 10];
        class245.method1649(arg1, 0, class719.field10005, 0, class3.field24);
        if (arg0 <= 78) {
            field10064 = 77;
        }
        for (int var2 = 0; var2 < class3.field24; var2++) {
            class11.field91[var2] = class719.field10005[var2].method1961();
        }
        for (int var3 = class3.field24; var3 < class719.field10005.length; var3++) {
            class11.field91[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lto;)V")
    public class726(class717 arg0) {
        this.field10062 = arg0;
    }
}
