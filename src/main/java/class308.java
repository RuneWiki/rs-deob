import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class308 {

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field5471 = 0;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field5469 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field5468 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
    private static long field5470 = 0L;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field5473 = 0;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Ldg;")
    private static class317 field5472 = new class317();

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Ldg;")
    private static class317 field5474 = new class317();

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Ldg;")
    private static class317 field5475 = new class317();

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Ldg;")
    private static class317 field5476 = new class317();

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
    private static int[] field5477 = new int[1000];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 6)
    public static void method2192() {
        field5472 = null;
        field5474 = null;
        field5475 = null;
        field5476 = null;
        field5477 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V", line = 14)
    public static final synchronized void method2193() {
        GL var0 = class97.field1801;
        int var1 = 0;
        while (true) {
            class91 var2 = (class91) field5472.method2247(104);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field5477, 0);
                    var1 = 0;
                }
                while (true) {
                    class91 var3 = (class91) field5474.method2247(51);
                    if (var3 == null) {
                        while (true) {
                            class91 var4 = (class91) field5475.method2247(12);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field5477, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class91 var6 = (class91) field5476.method2247(114);
                                    if (var6 == null) {
                                        if (field5473 + field5468 + field5471 > 100663296 && class127.method1015(21504) > field5470 + 60000L) {
                                            System.gc();
                                            field5470 = class127.method1015(21504);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field5539;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field5477[var1++] = (int) var4.field5539;
                            field5471 -= var4.field1714;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field5477, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field5477[var1++] = (int) var3.field5539;
                    field5473 -= var3.field1714;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field5477, 0);
                        var1 = 0;
                    }
                }
            }
            field5477[var1++] = (int) var2.field5539;
            field5468 -= var2.field1714;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field5477, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "()V", line = 100)
    public static final synchronized void method2194() {
        field5469++;
        field5472.method2243(107);
        field5474.method2243(126);
        field5475.method2243(68);
        field5476.method2243(120);
        field5468 = 0;
        field5473 = 0;
        field5471 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V", line = 110)
    public static final synchronized void method2195(int arg0, int arg1) {
        if (field5469 == arg1) {
            class91 var2 = new class91();
            var2.field5539 = (long) arg0;
            field5476.method2246(true, var2);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V", line = 121)
    public static final synchronized void method2196(int arg0, int arg1, int arg2) {
        if (field5469 == arg2) {
            class91 var3 = new class91(arg1);
            var3.field5539 = (long) arg0;
            field5475.method2246(true, var3);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V", line = 139)
    public static final synchronized void method2197(int arg0, int arg1, int arg2) {
        if (field5469 == arg2) {
            class91 var3 = new class91(arg1);
            var3.field5539 = (long) arg0;
            field5472.method2246(true, var3);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(III)V", line = 153)
    public static final synchronized void method2198(int arg0, int arg1, int arg2) {
        if (field5469 == arg2) {
            class91 var3 = new class91(arg1);
            var3.field5539 = (long) arg0;
            field5474.method2246(true, var3);
        }
    }
}
