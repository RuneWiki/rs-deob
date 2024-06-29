import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class231 implements class655 {

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Lvea;")
    public class305 field3058;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "Ltca;")
    public class545 field3055;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Liba;")
    public static class211 field3056 = new class211(6, 12);

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "Lvg;")
    public static class622 field3062 = new class622(26, -1);

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field3064 = 0;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "Lvg;")
    public static class622 field3063 = new class622(108, -1);

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field3060;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field3065;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Lmh;")
    public class139 method599(int arg0) {
        field3054++;
        int var2 = 0 % ((arg0 + 89) / 34);
        return class625.field9042;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLjava/io/File;Z)V")
    public static final void method1432(byte arg0, File arg1, boolean arg2) {
        field3057++;
        if (class488.field6929 == null) {
            class507.method2882((byte) 100);
        }
        try {
            int var3 = -19 % ((29 - arg0) / 45);
            Class var4 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var5 = var4.getDeclaredMethod("dumpHeap", field3065 == null ? (field3065 = method1436("java.lang.String")) : field3065, Boolean.TYPE);
            var5.invoke(class488.field6929, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3056 = null;
        field3063 = null;
        if (arg0 > -5) {
            field3063 = null;
        }
        field3062 = null;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
    public static final void method1434(int arg0) {
        if (class80.field1292 == null) {
            class80.field1292 = class580.method3332(17);
            class205.field2797 = class80.field1292[0];
            class102.field1525 = class60.method371(false);
        }
        field3059++;
        if (class199.field2714 == null) {
            class340.method2106(false);
        }
        class580 var1 = class205.field2797;
        int var2 = class149.method1064(true);
        if (arg0 != 0) {
            method1435(-99, -2);
        }
        if (class205.field2797 == var1) {
            class436.field6332 = class205.field2797.field8415.method1654(99, class262.field3401);
            if (class205.field2797.field8425) {
                class125.field1834 = (class205.field2797.field8417 - class205.field2797.field8422) * var2 / 100 + class205.field2797.field8422;
            }
            if (class205.field2797.field8414) {
                class436.field6332 = class436.field6332 + class125.field1834 + "%";
            }
        } else if (class580.field8446 == class205.field2797) {
            class199.field2714 = null;
            class322.method2003(0, 3);
        } else {
            class436.field6332 = var1.field8419.method1654(arg0 ^ 0xFFFFFF8C, class262.field3401);
            class125.field1834 = var1.field8417;
            if (class205.field2797.field8414) {
                class436.field6332 = class436.field6332 + var1.field8417 + "%";
            }
            if (class205.field2797.field8425 || var1.field8425) {
                class102.field1525 = class60.method371(false);
            }
        }
        if (class199.field2714 == null) {
            return;
        }
        class199.field2714.method3307(class102.field1525, class436.field6332, class205.field2797, arg0 ^ 0xFFFFFFBF, class125.field1834);
        if (class326.field4725 == null) {
            return;
        }
        for (int var3 = class373.field5509 + 1; var3 < class326.field4725.length; var3++) {
            if (class326.field4725[var3].method900((byte) 124) >= 100 && var3 - 1 == class373.field5509 && class264.field3451 >= 1 && class199.field2714.method3317((byte) 76)) {
                try {
                    class326.field4725[var3].method902((byte) -18);
                } catch (Exception var4) {
                    class326.field4725 = null;
                    return;
                }
                class199.field2714.method3316(class326.field4725[var3], -73);
                class373.field5509++;
                if (class373.field5509 >= (class326.field4725.length - 1) && class326.field4725.length > 1) {
                    class373.field5509 = class430.field6256.method1289((byte) -92) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
    public static final void method1435(int arg0, int arg1) {
        field3060++;
        class643.field9237 = 1000000000L / (long) arg0;
        if (arg1 != 24938) {
            field3062 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(ILtca;Lvea;II)V")
    public class231(int arg0, class545 arg1, class305 arg2, int arg3, int arg4) {
        this.field3061 = arg0;
        this.field3058 = arg2;
        this.field3055 = arg1;
        this.field3053 = arg3;
        this.field3052 = arg4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1436(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
