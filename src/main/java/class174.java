import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class174 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field2589 = 0;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field2590 = 0;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "J")
    private static long field2591 = 0L;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field2593 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Lom;")
    private static class156 field2594 = new class156();

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lom;")
    private static class156 field2595 = new class156();

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lom;")
    private static class156 field2596 = new class156();

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lom;")
    private static class156 field2597 = new class156();

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[I")
    private static int[] field2598 = new int[1000];

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method1208(int arg0, int arg1, int arg2) {
        if (field2589 == arg2) {
            class261 var3 = new class261(arg1);
            var3.field1603 = (long) arg0;
            field2594.method1108(var3, 65280);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V", line = 15)
    public static final synchronized void method1209(int arg0, int arg1) {
        if (field2589 == arg1) {
            class261 var2 = new class261();
            var2.field1603 = (long) arg0;
            field2597.method1108(var2, 65280);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()V", line = 25)
    public static final synchronized void method1210() {
        GL var0 = class117.field1801;
        int var1 = 0;
        while (true) {
            class261 var2 = (class261) field2594.method1114(-13454);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2598, 0);
                    var1 = 0;
                }
                while (true) {
                    class261 var3 = (class261) field2595.method1114(-13454);
                    if (var3 == null) {
                        while (true) {
                            class261 var4 = (class261) field2596.method1114(-13454);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2598, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class261 var6 = (class261) field2597.method1114(-13454);
                                    if (var6 == null) {
                                        if (field2593 + field2590 + field2592 > 100663296 && class231.method1594(-20375) > field2591 + 60000L) {
                                            System.gc();
                                            field2591 = class231.method1594(-20375);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field1603;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2598[var1++] = (int) var4.field1603;
                            field2592 -= var4.field3954;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2598, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2598[var1++] = (int) var3.field1603;
                    field2593 -= var3.field3954;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2598, 0);
                        var1 = 0;
                    }
                }
            }
            field2598[var1++] = (int) var2.field1603;
            field2590 -= var2.field3954;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2598, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()V", line = 111)
    public static final synchronized void method1211() {
        field2589++;
        field2594.method1113((byte) 80);
        field2595.method1113((byte) 27);
        field2596.method1113((byte) 64);
        field2597.method1113((byte) 64);
        field2590 = 0;
        field2593 = 0;
        field2592 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)V", line = 132)
    public static final synchronized void method1212(int arg0, int arg1, int arg2) {
        if (field2589 == arg2) {
            class261 var3 = new class261(arg1);
            var3.field1603 = (long) arg0;
            field2595.method1108(var3, 65280);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)V", line = 152)
    public static final synchronized void method1213(int arg0, int arg1, int arg2) {
        if (field2589 == arg2) {
            class261 var3 = new class261(arg1);
            var3.field1603 = (long) arg0;
            field2596.method1108(var3, 65280);
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "()V", line = 169)
    public static void method1214() {
        field2594 = null;
        field2595 = null;
        field2596 = null;
        field2597 = null;
        field2598 = null;
    }
}
