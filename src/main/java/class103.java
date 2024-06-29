import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class103 {

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "J")
    private static long field1459 = 0L;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1457 = 0;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lda;")
    private static class212 field1461 = new class212();

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lda;")
    private static class212 field1463 = new class212();

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "Lda;")
    private static class212 field1464 = new class212();

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Lda;")
    private static class212 field1465 = new class212();

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
    private static int[] field1466 = new int[1000];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 4)
    public static void method711() {
        field1461 = null;
        field1463 = null;
        field1464 = null;
        field1465 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()V", line = 11)
    public static final synchronized void method712() {
        field1460++;
        field1461.method1499(-3868);
        field1463.method1499(-3868);
        field1464.method1499(-3868);
        field1465.method1499(-3868);
        field1462 = 0;
        field1458 = 0;
        field1457 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 21)
    public static final synchronized void method713(int arg0, int arg1, int arg2) {
        if (field1460 == arg2) {
            class55 var3 = new class55(arg1);
            var3.field844 = (long) arg0;
            field1463.method1503(var3, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "()V", line = 32)
    public static final synchronized void method714() {
        GL var0 = class166.field2648;
        int var1 = 0;
        while (true) {
            class55 var2 = (class55) field1461.method1497((byte) 125);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1466, 0);
                    var1 = 0;
                }
                while (true) {
                    class55 var3 = (class55) field1463.method1497((byte) 122);
                    if (var3 == null) {
                        while (true) {
                            class55 var4 = (class55) field1464.method1497((byte) 108);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1466, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class55 var6 = (class55) field1465.method1497((byte) 115);
                                    if (var6 == null) {
                                        if (field1462 + field1458 + field1457 > 100663296 && class247.method1762(19166) > field1459 + 60000L) {
                                            System.gc();
                                            field1459 = class247.method1762(19166);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field844;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field1466[var1++] = (int) var4.field844;
                            field1457 -= var4.field804;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1466, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1466[var1++] = (int) var3.field844;
                    field1458 -= var3.field804;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1466, 0);
                        var1 = 0;
                    }
                }
            }
            field1466[var1++] = (int) var2.field844;
            field1462 -= var2.field804;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1466, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V", line = 123)
    public static final synchronized void method715(int arg0, int arg1, int arg2) {
        if (field1460 == arg2) {
            class55 var3 = new class55(arg1);
            var3.field844 = (long) arg0;
            field1464.method1503(var3, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 135)
    public static final synchronized void method716(int arg0, int arg1) {
        if (field1460 == arg1) {
            class55 var2 = new class55();
            var2.field844 = (long) arg0;
            field1465.method1503(var2, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(III)V", line = 152)
    public static final synchronized void method717(int arg0, int arg1, int arg2) {
        if (field1460 == arg2) {
            class55 var3 = new class55(arg1);
            var3.field844 = (long) arg0;
            field1461.method1503(var3, (byte) -82);
        }
    }
}
