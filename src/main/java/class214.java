import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class214 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
    private static long field3408 = 0L;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field3411 = 0;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field3409 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lea;")
    private static class204 field3407 = new class204();

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lea;")
    private static class204 field3412 = new class204();

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lea;")
    private static class204 field3413 = new class204();

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lea;")
    private static class204 field3414 = new class204();

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[I")
    private static int[] field3415 = new int[1000];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 4)
    public static void method1548() {
        field3407 = null;
        field3412 = null;
        field3413 = null;
        field3414 = null;
        field3415 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 15)
    public static final synchronized void method1549() {
        GL var0 = class265.field4099;
        int var1 = 0;
        while (true) {
            class250 var2 = (class250) field3407.method1496(-29960);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3415, 0);
                    var1 = 0;
                }
                while (true) {
                    class250 var3 = (class250) field3412.method1496(-29960);
                    if (var3 == null) {
                        while (true) {
                            class250 var4 = (class250) field3413.method1496(-29960);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3415, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class250 var6 = (class250) field3414.method1496(-29960);
                                    if (var6 == null) {
                                        if (field3411 + field3406 + field3410 > 100663296 && class154.method1172((byte) 83) > field3408 + 60000L) {
                                            System.gc();
                                            field3408 = class154.method1172((byte) 99);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field3734;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field3415[var1++] = (int) var4.field3734;
                            field3410 -= var4.field3858;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3415, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3415[var1++] = (int) var3.field3734;
                    field3411 -= var3.field3858;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3415, 0);
                        var1 = 0;
                    }
                }
            }
            field3415[var1++] = (int) var2.field3734;
            field3406 -= var2.field3858;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3415, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V", line = 101)
    public static final synchronized void method1550(int arg0, int arg1) {
        if (field3409 == arg1) {
            class250 var2 = new class250();
            var2.field3734 = (long) arg0;
            field3414.method1493(-102, var2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V", line = 115)
    public static final synchronized void method1551(int arg0, int arg1, int arg2) {
        if (field3409 == arg2) {
            class250 var3 = new class250(arg1);
            var3.field3734 = (long) arg0;
            field3412.method1493(-93, var3);
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()V", line = 125)
    public static final synchronized void method1552() {
        field3409++;
        field3407.method1489(200);
        field3412.method1489(200);
        field3413.method1489(200);
        field3414.method1489(200);
        field3406 = 0;
        field3411 = 0;
        field3410 = 0;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)V", line = 138)
    public static final synchronized void method1553(int arg0, int arg1, int arg2) {
        if (field3409 == arg2) {
            class250 var3 = new class250(arg1);
            var3.field3734 = (long) arg0;
            field3413.method1493(-88, var3);
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)V", line = 159)
    public static final synchronized void method1554(int arg0, int arg1, int arg2) {
        if (field3409 == arg2) {
            class250 var3 = new class250(arg1);
            var3.field3734 = (long) arg0;
            field3407.method1493(-103, var3);
        }
    }
}
