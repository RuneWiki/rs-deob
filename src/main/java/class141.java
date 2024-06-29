import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public abstract class class141 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Z")
    public static boolean field1891 = false;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "Ldaa;")
    public static class12 field1894 = new class12(1);

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1895;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hw", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1896;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method987(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(CI)C", line = 4)
    public static final char method979(char arg0, int arg1) {
        if (arg1 > -89) {
            method982(false, null, 110);
        }
        field1892++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLjava/io/File;I)V", line = 410)
    public static final void method982(boolean arg0, File arg1, int arg2) {
        if (class196.field2545 == null) {
            class325.method2102(-102);
        }
        field1895++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field1896 == null ? (field1896 = method987("java.lang.String")) : field1896, Boolean.TYPE);
            var4.invoke(class196.field2545, arg1.getAbsolutePath(), Boolean.valueOf(arg0));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
        if (arg2 != 110) {
            method986(-75);
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(Z)V", line = 438)
    public static final void method984(boolean arg0) {
        field1893++;
        for (int var1 = 0; var1 < 100; var1++) {
            class559.field7665[var1] = null;
        }
        if (!arg0) {
            method986(-78);
        }
        class773.field10630 = 0;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V", line = 461)
    public static void method986(int arg0) {
        if (arg0 < -49) {
            field1894 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public abstract void method980(int arg0);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)Loea;")
    public abstract class622 method981(boolean arg0);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
    public abstract boolean method983(int arg0, int arg1);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public abstract void method985(byte arg0);
}
