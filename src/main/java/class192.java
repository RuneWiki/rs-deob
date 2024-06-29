import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class192 extends InputStream {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2798 = "glow1:";

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field2803 = 0;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field2799 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field2805 = 2;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2806 = new String[100];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1382(int arg0) {
        class107.field1533.method1915(true, 202);
        if (arg0 < 35) {
            method1383((class228) null, -123, 118);
        }
        class166.field2386++;
        field2800++;
        class107.field1533.method1361(class30.field425, (byte) 124);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lqm;II)V", line = 28)
    public static final void method1383(class228 arg0, int arg1, int arg2) {
        if (arg1 != 32768) {
            field2803 = -64;
        }
        field2801++;
        class349 var3 = (class349) class50.field746.method1405((long) arg2, false);
        if (var3 == null) {
            class277.method2029(arg0.field5186[0], (class181) null, class321.field4835, (byte) 9, arg0.field5162[0], arg2, (class261) null, 0, arg0);
        } else {
            var3.method2446(arg1 - 24949);
        }
    }

    @OriginalMember(owner = "client!eg", name = "read", descriptor = "()I", line = 46)
    public final int read() {
        field2802++;
        class184.method1283(30000L, 10);
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 55)
    public static void method1384(byte arg0) {
        field2806 = null;
        field2798 = null;
        if (arg0 != -110) {
            field2806 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lrn;", line = 75)
    public static final class308 method1385(int arg0, int arg1) {
        field2804++;
        class308 var2 = (class308) class216.field3181.method551(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class33.field479.method2520(1, arg1 & 0x7FFF, (byte) -25);
        } else {
            var3 = class175.field2519.method2520(1, arg1, (byte) -25);
        }
        if (arg0 <= 7) {
            method1383((class228) null, -11, 51);
        }
        class308 var4 = new class308();
        if (var3 != null) {
            var4.method2172(-15067, new class190(var3));
        }
        if (arg1 >= 32768) {
            var4.method2168(16567);
        }
        class216.field3181.method547((long) arg1, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V", line = 109)
    public static final void method1386(int arg0, boolean arg1) {
        for (class349 var2 = (class349) class247.field3654.method93((byte) -33); var2 != null; var2 = (class349) class247.field3654.method97(-118)) {
            if (var2.field5405 != null) {
                class179.field2576.method1397(var2.field5405);
                var2.field5405 = null;
            }
            if (var2.field5397 != null) {
                class179.field2576.method1397(var2.field5397);
                var2.field5397 = null;
            }
            var2.method876(8);
        }
        if (arg0 != 2) {
            field2799 = 50;
        }
        field2796++;
        if (!arg1) {
            return;
        }
        for (class349 var3 = (class349) class158.field2282.method93((byte) -102); var3 != null; var3 = (class349) class158.field2282.method97(-83)) {
            if (var3.field5405 != null) {
                class179.field2576.method1397(var3.field5405);
                var3.field5405 = null;
            }
            var3.method876(8);
        }
        for (class349 var4 = (class349) class50.field746.method1406(arg0 - 2); var4 != null; var4 = (class349) class50.field746.method1404(-110)) {
            if (var4.field5405 != null) {
                class179.field2576.method1397(var4.field5405);
                var4.field5405 = null;
            }
            var4.method876(8);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 176)
    public static final void method1387(byte arg0) {
        field2797++;
        class125.field1815 = null;
        class126.field1825 = null;
        class356.field5463 = null;
        class7.field140 = null;
        if (arg0 < 56) {
            method1386(45, false);
        }
    }
}
