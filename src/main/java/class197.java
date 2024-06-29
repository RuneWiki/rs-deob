import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class197 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3056 = 0;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "J")
    private static long field3059 = 0L;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3058 = 0;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3060 = 0;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3061 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lih;")
    private static class32 field3057 = new class32();

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Lih;")
    private static class32 field3062 = new class32();

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lih;")
    private static class32 field3063 = new class32();

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lih;")
    private static class32 field3064 = new class32();

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
    private static int[] field3065 = new int[1000];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V", line = 7)
    public static final synchronized void method1322(int arg0, int arg1, int arg2) {
        if (field3058 == arg2) {
            class188 var3 = new class188(arg1);
            var3.field2293 = (long) arg0;
            field3063.method257(true, var3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 16)
    public static final synchronized void method1323(int arg0, int arg1) {
        if (field3058 == arg1) {
            class188 var2 = new class188();
            var2.field2293 = (long) arg0;
            field3064.method257(true, var2);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V", line = 25)
    public static void method1324() {
        field3057 = null;
        field3062 = null;
        field3063 = null;
        field3064 = null;
        field3065 = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()V", line = 34)
    public static final synchronized void method1325() {
        field3058++;
        field3057.method253(-110);
        field3062.method253(-88);
        field3063.method253(-123);
        field3064.method253(-115);
        field3061 = 0;
        field3060 = 0;
        field3056 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V", line = 53)
    public static final synchronized void method1326(int arg0, int arg1, int arg2) {
        if (field3058 == arg2) {
            class188 var3 = new class188(arg1);
            var3.field2293 = (long) arg0;
            field3057.method257(true, var3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V", line = 67)
    public static final synchronized void method1327() {
        GL var0 = class255.field4181;
        int var1 = 0;
        while (true) {
            class188 var2 = (class188) field3057.method262((byte) -3);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3065, 0);
                    var1 = 0;
                }
                while (true) {
                    class188 var3 = (class188) field3062.method262((byte) -3);
                    if (var3 == null) {
                        while (true) {
                            class188 var4 = (class188) field3063.method262((byte) -3);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3065, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class188 var6 = (class188) field3064.method262((byte) -3);
                                    if (var6 == null) {
                                        if (field3061 + field3060 + field3056 > 100663296 && class128.method869((byte) -55) > field3059 + 60000L) {
                                            System.gc();
                                            field3059 = class128.method869((byte) -55);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field2293;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field3065[var1++] = (int) var4.field2293;
                            field3056 -= var4.field2961;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3065, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3065[var1++] = (int) var3.field2293;
                    field3060 -= var3.field2961;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3065, 0);
                        var1 = 0;
                    }
                }
            }
            field3065[var1++] = (int) var2.field2293;
            field3061 -= var2.field2961;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3065, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(III)V", line = 156)
    public static final synchronized void method1328(int arg0, int arg1, int arg2) {
        if (field3058 == arg2) {
            class188 var3 = new class188(arg1);
            var3.field2293 = (long) arg0;
            field3062.method257(true, var3);
        }
    }
}
