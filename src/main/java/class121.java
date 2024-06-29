import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class121 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2022 = 0;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "J")
    private static long field2027 = 0L;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lvc;")
    private static class129 field2024 = new class129();

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lvc;")
    private static class129 field2028 = new class129();

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lvc;")
    private static class129 field2029 = new class129();

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lvc;")
    private static class129 field2030 = new class129();

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
    private static int[] field2031 = new int[1000];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 8)
    public static final synchronized void method791(int arg0, int arg1) {
        if (field2023 == arg1) {
            class27 var2 = new class27();
            var2.field1117 = (long) arg0;
            field2030.method899(var2, -28);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 17)
    public static void method792() {
        field2024 = null;
        field2028 = null;
        field2029 = null;
        field2030 = null;
        field2031 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 24)
    public static final synchronized void method793(int arg0, int arg1, int arg2) {
        if (field2023 == arg2) {
            class27 var3 = new class27(arg1);
            var3.field1117 = (long) arg0;
            field2028.method899(var3, -28);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V", line = 42)
    public static final synchronized void method794(int arg0, int arg1, int arg2) {
        if (field2023 == arg2) {
            class27 var3 = new class27(arg1);
            var3.field1117 = (long) arg0;
            field2029.method899(var3, -28);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()V", line = 51)
    public static final synchronized void method795() {
        field2023++;
        field2024.method905((byte) 96);
        field2028.method905((byte) 127);
        field2029.method905((byte) 117);
        field2030.method905((byte) 45);
        field2026 = 0;
        field2022 = 0;
        field2025 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)V", line = 61)
    public static final synchronized void method796(int arg0, int arg1, int arg2) {
        if (field2023 == arg2) {
            class27 var3 = new class27(arg1);
            var3.field1117 = (long) arg0;
            field2024.method899(var3, -28);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()V", line = 72)
    public static final synchronized void method797() {
        GL var0 = class56.field848;
        int var1 = 0;
        while (true) {
            class27 var2 = (class27) field2024.method895(14189);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2031, 0);
                    var1 = 0;
                }
                while (true) {
                    class27 var3 = (class27) field2028.method895(14189);
                    if (var3 == null) {
                        while (true) {
                            class27 var4 = (class27) field2029.method895(14189);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2031, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class27 var6 = (class27) field2030.method895(14189);
                                    if (var6 == null) {
                                        if (field2026 + field2022 + field2025 > 100663296 && class261.method1765(16299) > field2027 + 60000L) {
                                            System.gc();
                                            field2027 = class261.method1765(16299);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field1117;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2031[var1++] = (int) var4.field1117;
                            field2025 -= var4.field383;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2031, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2031[var1++] = (int) var3.field1117;
                    field2022 -= var3.field383;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2031, 0);
                        var1 = 0;
                    }
                }
            }
            field2031[var1++] = (int) var2.field1117;
            field2026 -= var2.field383;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2031, 0);
                var1 = 0;
            }
        }
    }
}
