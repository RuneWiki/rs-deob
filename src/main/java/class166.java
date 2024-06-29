import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class166 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2499 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2500 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2495 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "J")
    private static long field2497 = 0L;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lad;")
    private static class128 field2496 = new class128();

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lad;")
    private static class128 field2501 = new class128();

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lad;")
    private static class128 field2502 = new class128();

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lad;")
    private static class128 field2503 = new class128();

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
    private static int[] field2504 = new int[1000];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "()V", line = 5)
    public static final synchronized void method1214() {
        GL var0 = class36.field518;
        int var1 = 0;
        while (true) {
            class181 var2 = (class181) field2496.method979(49);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2504, 0);
                    var1 = 0;
                }
                while (true) {
                    class181 var3 = (class181) field2501.method979(49);
                    if (var3 == null) {
                        while (true) {
                            class181 var4 = (class181) field2502.method979(49);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2504, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class181 var6 = (class181) field2503.method979(49);
                                    if (var6 == null) {
                                        if (field2500 + field2495 + field2499 > 100663296 && class234.method1650((byte) -103) > field2497 + 60000L) {
                                            System.gc();
                                            field2497 = class234.method1650((byte) -113);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field3418;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2504[var1++] = (int) var4.field3418;
                            field2499 -= var4.field2713;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2504, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2504[var1++] = (int) var3.field3418;
                    field2495 -= var3.field2713;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2504, 0);
                        var1 = 0;
                    }
                }
            }
            field2504[var1++] = (int) var2.field3418;
            field2500 -= var2.field2713;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2504, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V", line = 93)
    public static final synchronized void method1215(int arg0, int arg1, int arg2) {
        if (field2498 == arg2) {
            class181 var3 = new class181(arg1);
            var3.field3418 = (long) arg0;
            field2496.method977(4, var3);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 103)
    public static final synchronized void method1216(int arg0, int arg1) {
        if (field2498 == arg1) {
            class181 var2 = new class181();
            var2.field3418 = (long) arg0;
            field2503.method977(4, var2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "()V", line = 114)
    public static final synchronized void method1217() {
        field2498++;
        field2496.method980(1);
        field2501.method980(1);
        field2502.method980(1);
        field2503.method980(1);
        field2500 = 0;
        field2495 = 0;
        field2499 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "()V", line = 125)
    public static void method1218() {
        field2496 = null;
        field2501 = null;
        field2502 = null;
        field2503 = null;
        field2504 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V", line = 132)
    public static final synchronized void method1219(int arg0, int arg1, int arg2) {
        if (field2498 == arg2) {
            class181 var3 = new class181(arg1);
            var3.field3418 = (long) arg0;
            field2502.method977(4, var3);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)V", line = 146)
    public static final synchronized void method1220(int arg0, int arg1, int arg2) {
        if (field2498 == arg2) {
            class181 var3 = new class181(arg1);
            var3.field3418 = (long) arg0;
            field2501.method977(4, var3);
        }
    }
}
