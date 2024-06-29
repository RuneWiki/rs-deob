import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class363 {

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lok;")
    public class61 field5248 = new class61();

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field5235 = new int[2];

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field5237 = 0;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "J")
    public static volatile long field5241 = 0L;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5244 = "scroll:";

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field5247 = 2;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "B")
    public static byte field5236;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Ldr;")
    public static class212 field5246;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lok;")
    private class61 field5249;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field5251;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[Lcq;")
    public static class67[] field5240;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method2371(byte arg0) {
        field5250++;
        if (arg0 != 118) {
            method2373((byte) -34);
        }
        if (class36.field511 == 2) {
            class134.field1867 = 96;
            return;
        }
        try {
            Method var1 = (field5251 == null ? (field5251 = method2377("java.lang.Runtime")) : field5251).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class134.field1867 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)Lok;")
    public final class61 method2372(int arg0) {
        field5242++;
        class61 var2 = this.field5249;
        if (arg0 != 1048576) {
            method2371((byte) 32);
        }
        if (this.field5248 == var2) {
            this.field5249 = null;
            return null;
        } else {
            this.field5249 = var2.field801;
            return var2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    public static void method2373(byte arg0) {
        field5235 = null;
        if (arg0 != 23) {
            field5240 = null;
        }
        field5244 = null;
        field5240 = null;
        field5246 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public final void method2374(int arg0) {
        field5239++;
        while (true) {
            class61 var2 = this.field5248.field801;
            if (this.field5248 == var2) {
                if (arg0 < 122) {
                    return;
                } else {
                    this.field5249 = null;
                    return;
                }
            }
            var2.method425(-109);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLok;)V")
    public final void method2375(boolean arg0, class61 arg1) {
        if (arg1.field806 != null) {
            arg1.method425(-92);
        }
        field5245++;
        arg1.field806 = this.field5248.field806;
        arg1.field801 = this.field5248;
        arg1.field806.field801 = arg1;
        if (!arg0) {
            field5247 = 0;
        }
        arg1.field801.field806 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)Lok;")
    public final class61 method2376(byte arg0) {
        field5243++;
        class61 var2 = this.field5248.field801;
        if (this.field5248 == var2) {
            this.field5249 = null;
            return null;
        } else {
            this.field5249 = var2.field801;
            return arg0 >= -90 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class363() {
        this.field5248.field801 = this.field5248;
        this.field5248.field806 = this.field5248;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2377(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
