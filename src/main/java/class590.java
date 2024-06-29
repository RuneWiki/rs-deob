import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class590 implements class437 {

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public int field8062;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field8048;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public int field8059;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public int field8060;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "Ljava/lang/String;")
    public String field8058;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lsd;")
    public class95 field8064;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public int field8047;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public int field8056;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public int field8063;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "Lec;")
    public class236 field8061;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public int field8052;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public int field8051;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public int field8053;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Leq;")
    public static class213 field8050 = new class213(8);

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Lwh;")
    public static class149 field8054;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ot", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field8065;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3370(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/io/File;ZZ)V", line = 3)
    public static final void method3367(File arg0, boolean arg1, boolean arg2) {
        if (class445.field6328 == null) {
            class405.method2527((byte) 26);
        }
        field8055++;
        if (arg2) {
            field8054 = null;
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field8065 == null ? (field8065 = method3370("java.lang.String")) : field8065, Boolean.TYPE);
            var4.invoke(class445.field6328, arg0.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)Lad;", line = 40)
    public final class426 method119(byte arg0) {
        field8057++;
        if (arg0 <= 116) {
            field8054 = null;
        }
        return class558.field7732;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)[Lsd;", line = 54)
    public static final class95[] method3368(int arg0) {
        field8049++;
        if (arg0 < 11) {
            field8054 = null;
        }
        return new class95[] { class311.field4330, class416.field6019, class426.field6126 };
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V", line = 67)
    public static void method3369(boolean arg0) {
        if (!arg0) {
            method3368(-21);
        }
        field8050 = null;
        field8054 = null;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ljava/lang/String;Lsd;Lec;IIIIIIIIII)V", line = 83)
    public class590(String arg0, class95 arg1, class236 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field8062 = arg6;
        this.field8048 = arg4;
        this.field8059 = arg5;
        this.field8060 = arg10;
        this.field8058 = arg0;
        this.field8064 = arg1;
        this.field8047 = arg8;
        this.field8056 = arg12;
        this.field8063 = arg3;
        this.field8061 = arg2;
        this.field8052 = arg9;
        this.field8051 = arg11;
        this.field8053 = arg7;
    }
}
