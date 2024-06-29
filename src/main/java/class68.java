import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class68 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1125 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1128 = 0;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "J")
    private static long field1127 = 0L;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1130 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Llc;")
    private static class160 field1126 = new class160();

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Llc;")
    private static class160 field1131 = new class160();

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Llc;")
    private static class160 field1132 = new class160();

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Llc;")
    private static class160 field1133 = new class160();

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[I")
    private static int[] field1134 = new int[1000];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 4)
    public static final synchronized void method502(int arg0, int arg1) {
        if (field1125 == arg1) {
            class101 var2 = new class101();
            var2.field2883 = (long) arg0;
            field1133.method1258(0, var2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V", line = 16)
    public static final synchronized void method503(int arg0, int arg1, int arg2) {
        if (field1125 == arg2) {
            class101 var3 = new class101(arg1);
            var3.field2883 = (long) arg0;
            field1131.method1258(0, var3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V", line = 28)
    public static final synchronized void method504(int arg0, int arg1, int arg2) {
        if (field1125 == arg2) {
            class101 var3 = new class101(arg1);
            var3.field2883 = (long) arg0;
            field1126.method1258(0, var3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(III)V", line = 37)
    public static final synchronized void method505(int arg0, int arg1, int arg2) {
        if (field1125 == arg2) {
            class101 var3 = new class101(arg1);
            var3.field2883 = (long) arg0;
            field1132.method1258(0, var3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V", line = 51)
    public static void method506() {
        field1126 = null;
        field1131 = null;
        field1132 = null;
        field1133 = null;
        field1134 = null;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V", line = 59)
    public static final synchronized void method507() {
        GL var0 = class271.field4641;
        int var1 = 0;
        while (true) {
            class101 var2 = (class101) field1126.method1254(0);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1134, 0);
                    var1 = 0;
                }
                while (true) {
                    class101 var3 = (class101) field1131.method1254(0);
                    if (var3 == null) {
                        while (true) {
                            class101 var4 = (class101) field1132.method1254(0);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1134, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class101 var6 = (class101) field1133.method1254(0);
                                    if (var6 == null) {
                                        if (field1129 + field1128 + field1130 > 100663296 && class67.method501(-128) > field1127 + 60000L) {
                                            System.gc();
                                            field1127 = class67.method501(-127);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field2883;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field1134[var1++] = (int) var4.field2883;
                            field1130 -= var4.field1627;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1134, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1134[var1++] = (int) var3.field2883;
                    field1129 -= var3.field1627;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1134, 0);
                        var1 = 0;
                    }
                }
            }
            field1134[var1++] = (int) var2.field2883;
            field1128 -= var2.field1627;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1134, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()V", line = 154)
    public static final synchronized void method508() {
        field1125++;
        field1126.method1257(2);
        field1131.method1257(2);
        field1132.method1257(2);
        field1133.method1257(2);
        field1128 = 0;
        field1129 = 0;
        field1130 = 0;
    }
}
