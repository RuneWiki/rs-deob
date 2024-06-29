import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class450 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
    public int[] field6287;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Llk;")
    public static class638 field6288 = new class638(64);

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field6290 = 0;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6286;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field6291;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[[Z")
    public static boolean[][] field6289;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static final void method2718(int arg0) {
        if (class129.field1674.field10561) {
            class771.field10608 = 96;
        } else {
            try {
                Method var1 = (field6291 == null ? (field6291 = method2722("java.lang.Runtime")) : field6291).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class771.field10608 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field6286++;
        if (arg0 != 1) {
            method2718(-34);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lgga;I)V")
    private final void method2719(class511 arg0, int arg1) {
        field6285++;
        while (true) {
            int var3;
            do {
                var3 = arg0.method3013(-117);
                if (var3 == 0) {
                    if (arg1 != 17218) {
                        field6289 = null;
                        return;
                    }
                    return;
                }
            } while (var3 != 1);
            int var4 = arg0.method3013(arg1 - 17323);
            this.field6287 = new int[var4];
            for (int var5 = 0; var5 < this.field6287.length; var5++) {
                this.field6287[var5] = arg0.method3013(arg1 - 17319);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Ldja;")
    public static final class44 method2720(int arg0, int arg1, int arg2) {
        class472 var3 = class59.field688[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6551;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public static void method2721(boolean arg0) {
        field6289 = null;
        if (!arg0) {
            method2721(false);
        }
        field6288 = null;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lae;)V")
    public class450(class283 arg0) {
        byte[] var2 = arg0.method1854(0, 6);
        this.method2719(new class511(var2), 17218);
        if (this.field6287 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    protected class450() {
        this.field6287 = new int[0];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2722(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
