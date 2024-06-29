import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class274 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "J")
    private static long field4747 = 0L;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field4748 = 0;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field4745 = 0;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field4746 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lvf;")
    private static class296 field4743 = new class296();

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lvf;")
    private static class296 field4749 = new class296();

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lvf;")
    private static class296 field4750 = new class296();

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lvf;")
    private static class296 field4751 = new class296();

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    private static int[] field4752 = new int[1000];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V", line = 5)
    public static final synchronized void method1921(int arg0, int arg1, int arg2) {
        if (field4748 == arg2) {
            class155 var3 = new class155(arg1);
            var3.field4915 = (long) arg0;
            field4749.method2029((byte) -34, var3);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V", line = 14)
    public static final synchronized void method1922(int arg0, int arg1, int arg2) {
        if (field4748 == arg2) {
            class155 var3 = new class155(arg1);
            var3.field4915 = (long) arg0;
            field4743.method2029((byte) -34, var3);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V", line = 29)
    public static final synchronized void method1923(int arg0, int arg1) {
        if (field4748 == arg1) {
            class155 var2 = new class155();
            var2.field4915 = (long) arg0;
            field4751.method2029((byte) -34, var2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 41)
    public static final synchronized void method1924() {
        field4748++;
        field4743.method2025((byte) -97);
        field4749.method2025((byte) -97);
        field4750.method2025((byte) -97);
        field4751.method2025((byte) -97);
        field4745 = 0;
        field4746 = 0;
        field4744 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 53)
    public static final synchronized void method1925() {
        GL var0 = class247.field4253;
        int var1 = 0;
        while (true) {
            class155 var2 = (class155) field4743.method2020((byte) -42);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4752, 0);
                    var1 = 0;
                }
                while (true) {
                    class155 var3 = (class155) field4749.method2020((byte) -127);
                    if (var3 == null) {
                        while (true) {
                            class155 var4 = (class155) field4750.method2020((byte) -57);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4752, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class155 var6 = (class155) field4751.method2020((byte) -55);
                                    if (var6 == null) {
                                        if (field4746 + field4745 + field4744 > 100663296 && class71.method470(true) > field4747 + 60000L) {
                                            System.gc();
                                            field4747 = class71.method470(true);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field4915;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field4752[var1++] = (int) var4.field4915;
                            field4744 -= var4.field2672;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4752, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4752[var1++] = (int) var3.field4915;
                    field4746 -= var3.field2672;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4752, 0);
                        var1 = 0;
                    }
                }
            }
            field4752[var1++] = (int) var2.field4915;
            field4745 -= var2.field2672;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4752, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 142)
    public static void method1926() {
        field4743 = null;
        field4749 = null;
        field4750 = null;
        field4751 = null;
        field4752 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(III)V", line = 156)
    public static final synchronized void method1927(int arg0, int arg1, int arg2) {
        if (field4748 == arg2) {
            class155 var3 = new class155(arg1);
            var3.field4915 = (long) arg0;
            field4750.method2029((byte) -34, var3);
        }
    }
}
