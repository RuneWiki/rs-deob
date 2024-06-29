import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class196 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "J")
    private static long field3441 = 0L;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field3442 = 0;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field3440 = 0;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lmi;")
    private static class12 field3443 = new class12();

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lmi;")
    private static class12 field3444 = new class12();

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lmi;")
    private static class12 field3445 = new class12();

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lmi;")
    private static class12 field3446 = new class12();

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "[I")
    private static int[] field3447 = new int[1000];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V", line = 6)
    public static final synchronized void method1315(int arg0, int arg1, int arg2) {
        if (field3439 == arg2) {
            class119 var3 = new class119(arg1);
            var3.field2642 = (long) arg0;
            field3445.method82(var3, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 20)
    public static final synchronized void method1316(int arg0, int arg1) {
        if (field3439 == arg1) {
            class119 var2 = new class119();
            var2.field2642 = (long) arg0;
            field3446.method82(var2, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V", line = 29)
    public static final synchronized void method1317(int arg0, int arg1, int arg2) {
        if (field3439 == arg2) {
            class119 var3 = new class119(arg1);
            var3.field2642 = (long) arg0;
            field3444.method82(var3, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 38)
    public static void method1318() {
        field3443 = null;
        field3444 = null;
        field3445 = null;
        field3446 = null;
        field3447 = null;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V", line = 53)
    public static final synchronized void method1319(int arg0, int arg1, int arg2) {
        if (field3439 == arg2) {
            class119 var3 = new class119(arg1);
            var3.field2642 = (long) arg0;
            field3443.method82(var3, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 64)
    public static final synchronized void method1320() {
        GL var0 = class257.field4409;
        int var1 = 0;
        while (true) {
            class119 var2 = (class119) field3443.method88(true);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3447, 0);
                    var1 = 0;
                }
                while (true) {
                    class119 var3 = (class119) field3444.method88(true);
                    if (var3 == null) {
                        while (true) {
                            class119 var4 = (class119) field3445.method88(true);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3447, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class119 var6 = (class119) field3446.method88(true);
                                    if (var6 == null) {
                                        if (field3440 + field3438 + field3442 > 100663296 && class25.method197(-3418) > field3441 + 60000L) {
                                            System.gc();
                                            field3441 = class25.method197(-3418);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field2642;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field3447[var1++] = (int) var4.field2642;
                            field3442 -= var4.field2107;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3447, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3447[var1++] = (int) var3.field2642;
                    field3440 -= var3.field2107;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3447, 0);
                        var1 = 0;
                    }
                }
            }
            field3447[var1++] = (int) var2.field2642;
            field3438 -= var2.field2107;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3447, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V", line = 158)
    public static final synchronized void method1321() {
        field3439++;
        field3443.method80(0);
        field3444.method80(0);
        field3445.method80(0);
        field3446.method80(0);
        field3438 = 0;
        field3440 = 0;
        field3442 = 0;
    }
}
