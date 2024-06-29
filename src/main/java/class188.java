import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class188 extends class609 {

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "Lms;")
    public static class791 field2816 = class407.method2455((byte) 113);

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "Lmga;")
    public static class737 field2817 = new class737();

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "J")
    public static long field2818 = -1L;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    public static int field2815;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sq", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2819;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "[B")
    private byte[] field2811;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1395(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)[B", line = 4)
    public final byte[] method1391(int arg0, int arg1, int arg2, int arg3) {
        this.field2811 = new byte[arg1 * 2 * arg3 * arg2];
        if (arg0 == -1) {
            field2813++;
            this.method1626(arg2, arg1, -121, arg3);
            return this.field2811;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V", line = 17)
    public static void method1392(int arg0) {
        field2816 = null;
        field2817 = null;
        if (arg0 != 2) {
            field2818 = -97L;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZBI)V", line = 29)
    public final void method1296(boolean arg0, byte arg1, int arg2) {
        field2814++;
        int var4 = arg2 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        if (arg0) {
            this.field2811[var4++] = var5;
            this.field2811[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 47)
    public class188() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIBIII)J", line = 50)
    public static final long method1393(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2815++;
        class241.field3459.clear();
        class241.field3459.set(arg1, arg4, arg2, arg5, arg6, arg0);
        if (arg3 != 55) {
            field2817 = null;
        }
        return class241.field3459.getTime().getTime();
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V", line = 64)
    public static final void method1394(int arg0) {
        field2812++;
        try {
            Method var1 = (field2819 == null ? (field2819 = method1395("java.lang.Runtime")) : field2819).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class576.field8143 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 < 72) {
                field2818 = -116L;
            }
        } catch (Exception var5) {
        }
    }
}
