import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class309 {

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public int field4288 = 443;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "Z")
    private boolean field4290 = false;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "Z")
    private boolean field4300 = false;

    @OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
    public int field4298 = 43594;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "Lvh;")
    public static class125 field4292 = new class125(1, 18);

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    public static int field4299 = 0;

    @OriginalMember(owner = "client!qaa", name = "l", descriptor = "[[I")
    public static int[][] field4297 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "Lvh;")
    public static class125 field4301 = new class125(42, -1);

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "I")
    public static int field4296;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field4302;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Ljava/lang/String;")
    public String field4286;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lwv;I)Ltj;")
    public final class614 method1870(class705 arg0, int arg1) {
        if (arg1 != -17813) {
            this.field4290 = false;
        }
        field4289++;
        return arg0.method3963((byte) -10, this.field4300, this.field4286, this.field4290 ? this.field4288 : this.field4298);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4293++;
        if (arg1 != 7) {
            field4295 = 11;
        }
        if (class512.field7620 <= arg9 && arg9 <= class94.field1398 && class512.field7620 <= arg8 && class94.field1398 >= arg8 && arg2 >= class512.field7620 && arg2 <= class94.field1398 && class512.field7620 <= arg7 && arg7 <= class94.field1398 && arg5 >= class198.field3084 && arg5 <= class627.field8931 && arg4 >= class198.field3084 && class627.field8931 >= arg4 && class198.field3084 <= arg6 && class627.field8931 >= arg6 && class198.field3084 <= arg0 && class627.field8931 >= arg0) {
            class500.method2988(arg4, arg9, arg0, true, arg7, arg2, arg3, arg6, arg8, arg5);
        } else {
            class467.method2761(arg6, (byte) -120, arg2, arg3, arg4, arg7, arg0, arg9, arg5, arg8);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public final void method1872(int arg0) {
        if (!this.field4290) {
            this.field4300 = true;
            this.field4290 = true;
        } else if (this.field4300) {
            this.field4300 = false;
        } else {
            this.field4290 = false;
        }
        field4287++;
        if (arg0 != 0) {
            method1873(-119);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V")
    public static void method1873(int arg0) {
        field4292 = null;
        field4297 = null;
        field4301 = null;
        if (arg0 != 12515) {
            method1873(-38);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILqaa;)Z")
    public final boolean method1874(int arg0, class309 arg1) {
        int var3 = -109 % ((arg0 + 51) / 37);
        field4296++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field4294 == arg1.field4294 && this.field4286.equals(arg1.field4286);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/io/File;ZI)V")
    public static final void method1875(File arg0, boolean arg1, int arg2) {
        if (class102.field1673 == null) {
            class64.method527((byte) 35);
        }
        field4291++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field4302 == null ? (field4302 = method1876("java.lang.String")) : field4302, Boolean.TYPE);
            int var5 = -6 / ((4 - arg2) / 61);
            var4.invoke(class102.field1673, arg0.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1876(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
