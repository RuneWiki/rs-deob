import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class412 extends class446 {

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public int field5853 = 1;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
    public static int[] field5852 = new int[3];

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lgd;")
    public static class188 field5846 = null;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lbj;")
    public static class131 field5842 = new class131(4);

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field5854 = 0;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "C")
    public char field5848;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lqa;")
    public static class134 field5841;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkh;BI)V", line = 5)
    private final void method2582(class11 arg0, byte arg1, int arg2) {
        field5847++;
        if (arg1 < 123) {
            field5845 = -112;
        }
        if (arg2 == 1) {
            this.field5848 = class436.method2744(63, arg0.method162(-4436));
        } else if (arg2 == 2) {
            this.field5853 = 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkh;Z)V", line = 26)
    public final void method2583(class11 arg0, boolean arg1) {
        field5850++;
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method2582(arg0, (byte) 125, var3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Lgh;", line = 52)
    public static final class327 method2584(int arg0, boolean arg1) {
        field5844++;
        class131 var2 = class39.field570;
        class327 var3;
        synchronized (class39.field570) {
            var3 = (class327) class39.field570.method904(false, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class123.field1706.method1745(class303.method1956(arg0, 1), (byte) 95, class80.method577(arg0, (byte) -89));
        if (!arg1) {
            method2585((byte) -118);
        }
        class327 var5 = new class327();
        var5.field4472 = arg0;
        if (var4 != null) {
            var5.method2106(new class11(var4), false);
        }
        var5.method2101(115);
        class131 var6 = class39.field570;
        synchronized (class39.field570) {
            class39.field570.method902((long) arg0, (byte) 112, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)Lbf;", line = 82)
    public static final class316 method2585(byte arg0) {
        field5849++;
        if (arg0 >= -80) {
            field5842 = null;
        }
        try {
            return (class316) Class.forName("gl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 100)
    public static void method2586(int arg0) {
        field5852 = null;
        field5841 = null;
        int var1 = 75 % ((arg0 - 81) / 43);
        field5842 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lnq;I)V", line = 113)
    public static final void method2587(class268 arg0, int arg1) {
        class91.field1271 = arg0;
        if (arg1 >= -50) {
            field5841 = null;
        }
        field5851++;
        class108.field1559 = class91.field1271.method1739(91, 19);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V", line = 136)
    public static final void method2588(int arg0, int arg1) {
        if (arg1 <= 39) {
            field5842 = null;
        }
        field5843++;
        class46.method411(false);
        class263.method1720(true);
        class34.method336((byte) 111, true, arg0);
        class331.method2134(class212.field2969, class260.field3643, class64.field949, -3560);
        class279.method1820(class212.field2969, false, class64.field949);
        class128.method877(81, class278.field3900);
        class303.method1958((byte) -128);
        class386.method2450((byte) -89);
        if (class446.field6250 == 10) {
            class19.method273(false, true);
        } else if (class446.field6250 == 30) {
            class139.method958(25, false);
        } else if (class446.field6250 == 5) {
            class334.method2144(class212.field2969, -100, class64.field949);
        }
    }
}
