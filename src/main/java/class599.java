import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class599 {

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "Lfba;")
    public static class27 field8407 = new class27(8, -1);

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "Ldt;")
    public static class252 field8411 = new class252("game3", "Game 3", 2);

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "Z")
    public static volatile boolean field8412 = true;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "Lhp;")
    public static class346 field8410;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bha", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field8414;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "[Lmea;")
    public static class451[] field8413;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public static void method3489(byte arg0) {
        field8411 = null;
        int var1 = -15 / ((arg0 - 42) / 51);
        field8413 = null;
        field8410 = null;
        field8407 = null;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)I")
    public static final int method3490(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            method3491((byte) 123, null, false);
        }
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field8409++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLjava/io/File;Z)V")
    public static final void method3491(byte arg0, File arg1, boolean arg2) {
        field8408++;
        if (class777.field10678 == null) {
            class60.method404((byte) -125);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field8414 == null ? (field8414 = method3492("java.lang.String")) : field8414, Boolean.TYPE);
            var4.invoke(class777.field10678, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
            if (arg0 != -29) {
                method3491((byte) -98, null, true);
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3492(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
