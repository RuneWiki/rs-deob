import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class136 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2300 = 0;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "J")
    private static long field2302 = 0L;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2303 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2301 = 0;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2304 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lhi;")
    private static class282 field2299 = new class282();

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lhi;")
    private static class282 field2305 = new class282();

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lhi;")
    private static class282 field2306 = new class282();

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lhi;")
    private static class282 field2307 = new class282();

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    private static int[] field2308 = new int[1000];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V", line = 18)
    public static void method1004() {
        field2299 = null;
        field2305 = null;
        field2306 = null;
        field2307 = null;
        field2308 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()V", line = 29)
    public static final synchronized void method1005() {
        GL var0 = class21.field377;
        int var1 = 0;
        while (true) {
            class270 var2 = (class270) field2299.method1969(100);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2308, 0);
                    var1 = 0;
                }
                while (true) {
                    class270 var3 = (class270) field2305.method1969(100);
                    if (var3 == null) {
                        while (true) {
                            class270 var4 = (class270) field2306.method1969(100);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2308, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class270 var6 = (class270) field2307.method1969(100);
                                    if (var6 == null) {
                                        if (field2304 + field2301 + field2303 > 100663296 && class69.method535(true) > field2302 + 60000L) {
                                            System.gc();
                                            field2302 = class69.method535(true);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field5149;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2308[var1++] = (int) var4.field5149;
                            field2303 -= var4.field4483;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2308, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2308[var1++] = (int) var3.field5149;
                    field2301 -= var3.field4483;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2308, 0);
                        var1 = 0;
                    }
                }
            }
            field2308[var1++] = (int) var2.field5149;
            field2304 -= var2.field4483;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2308, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V", line = 119)
    public static final synchronized void method1006(int arg0, int arg1) {
        if (field2300 == arg1) {
            class270 var2 = new class270();
            var2.field5149 = (long) arg0;
            field2307.method1972(var2, 71);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V", line = 128)
    public static final synchronized void method1007(int arg0, int arg1, int arg2) {
        if (field2300 == arg2) {
            class270 var3 = new class270(arg1);
            var3.field5149 = (long) arg0;
            field2305.method1972(var3, -103);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V", line = 140)
    public static final synchronized void method1008(int arg0, int arg1, int arg2) {
        if (field2300 == arg2) {
            class270 var3 = new class270(arg1);
            var3.field5149 = (long) arg0;
            field2306.method1972(var3, -118);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V", line = 149)
    public static final synchronized void method1009(int arg0, int arg1, int arg2) {
        if (field2300 == arg2) {
            class270 var3 = new class270(arg1);
            var3.field5149 = (long) arg0;
            field2299.method1972(var3, 108);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()V", line = 158)
    public static final synchronized void method1010() {
        field2300++;
        field2299.method1966((byte) 89);
        field2305.method1966((byte) 58);
        field2306.method1966((byte) 58);
        field2307.method1966((byte) 80);
        field2304 = 0;
        field2301 = 0;
        field2303 = 0;
    }
}
