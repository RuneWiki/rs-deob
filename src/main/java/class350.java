import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class350 extends class49 {

    @OriginalMember(owner = "client!wja", name = "A", descriptor = "Lcd;")
    public class629 field5088;

    @OriginalMember(owner = "client!wja", name = "y", descriptor = "I")
    public static int field5086 = 0;

    @OriginalMember(owner = "client!wja", name = "C", descriptor = "Ljn;")
    public static class134 field5090 = null;

    @OriginalMember(owner = "client!wja", name = "z", descriptor = "[J")
    public static long[] field5087 = new long[100];

    @OriginalMember(owner = "client!wja", name = "w", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!wja", name = "x", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!wja", name = "B", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!wja", name = "D", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!wja", name = "E", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!wja", name = "F", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!wja", name = "G", descriptor = "I")
    public static int field5094;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wja", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field5095;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2211(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2205(boolean arg0) {
        if (arg0) {
            field5090 = null;
        }
        field5090 = null;
        field5087 = null;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(Ljava/io/File;IZ)V", line = 19)
    public static final void method2206(File arg0, int arg1, boolean arg2) {
        if (class313.field4500 == null) {
            class56.method469((byte) 101);
        }
        if (arg1 != 1) {
            method2209(110, -11, 1.1488069F, -16, false, -118, 25, 41);
        }
        field5091++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field5095 == null ? (field5095 = method2211("java.lang.String")) : field5095, Boolean.TYPE);
            var4.invoke(class313.field4500, arg0.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)[Lld;", line = 46)
    public static final class127[] method2207(int arg0) {
        if (arg0 == 3) {
            field5089++;
            return new class127[] { class495.field6816, class718.field9940, class580.field8147 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(ZI)V", line = 57)
    public static final void method2208(boolean arg0, int arg1) {
        field5084++;
        class571 var2 = (class571) class566.field7987.method1041(1048832);
        if (arg1 != 0) {
            method2205(false);
        }
        while (var2 != null) {
            if (var2.field8026 != null) {
                class44.field468.method2512(var2.field8026);
                var2.field8026 = null;
            }
            if (var2.field8049 != null) {
                class44.field468.method2512(var2.field8049);
                var2.field8049 = null;
            }
            var2.method527(-11229);
            var2 = (class571) class566.field7987.method1033(-1);
        }
        if (!arg0) {
            return;
        }
        for (class571 var3 = (class571) class536.field7419.method1041(1048832); var3 != null; var3 = (class571) class536.field7419.method1033(-1)) {
            if (var3.field8026 != null) {
                class44.field468.method2512(var3.field8026);
                var3.field8026 = null;
            }
            var3.method527(-11229);
        }
        for (class571 var4 = (class571) class12.field74.method3668(2); var4 != null; var4 = (class571) class12.field74.method3667((byte) -126)) {
            if (var4.field8026 != null) {
                class44.field468.method2512(var4.field8026);
                var4.field8026 = null;
            }
            var4.method527(-11229);
        }
    }

    @OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lcd;)V", line = 127)
    public class350(class629 arg0) {
        this.field5088 = arg0;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIFIZIII)[I", line = 136)
    public static final int[] method2209(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field5085++;
        if (arg5 != -8289) {
            field5094 = -4;
        }
        int[] var8 = new int[arg3];
        class618 var9 = new class618();
        var9.field8672 = arg7;
        var9.field8678 = arg4;
        var9.field8676 = arg0;
        var9.field8677 = arg6;
        var9.field8684 = (int) (arg2 * 4096.0F);
        var9.field8674 = arg1;
        var9.method653((byte) -21);
        class769.method4249(arg3, (byte) -77, 1);
        var9.method3568((byte) 108, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(III)I", line = 164)
    public static final int method2210(int arg0, int arg1, int arg2) {
        field5092++;
        if (arg0 == 1 || arg0 == 3) {
            return class473.field6568[arg2 & 0x3];
        } else {
            if (arg1 != 7749) {
                method2206(null, -10, true);
            }
            return class580.field8142[arg2 & 0x3];
        }
    }
}
