import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class263 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4545 = 0;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4544 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4547 = 0;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "J")
    private static long field4546 = 0L;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljg;")
    private static class303 field4548 = new class303();

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljg;")
    private static class303 field4550 = new class303();

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Ljg;")
    private static class303 field4551 = new class303();

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljg;")
    private static class303 field4552 = new class303();

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
    private static int[] field4553 = new int[1000];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method1862(int arg0, int arg1, int arg2) {
        if (field4547 == arg2) {
            class93 var3 = new class93(arg1);
            var3.field4265 = (long) arg0;
            field4548.method2079(var3, 115);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V", line = 14)
    public static final synchronized void method1863(int arg0, int arg1, int arg2) {
        if (field4547 == arg2) {
            class93 var3 = new class93(arg1);
            var3.field4265 = (long) arg0;
            field4550.method2079(var3, 38);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V", line = 23)
    public static final synchronized void method1864(int arg0, int arg1, int arg2) {
        if (field4547 == arg2) {
            class93 var3 = new class93(arg1);
            var3.field4265 = (long) arg0;
            field4551.method2079(var3, 103);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 32)
    public static final synchronized void method1865() {
        field4547++;
        field4548.method2073(true);
        field4550.method2073(true);
        field4551.method2073(true);
        field4552.method2073(true);
        field4545 = 0;
        field4544 = 0;
        field4549 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 52)
    public static final synchronized void method1866(int arg0, int arg1) {
        if (field4547 == arg1) {
            class93 var2 = new class93();
            var2.field4265 = (long) arg0;
            field4552.method2079(var2, 50);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V", line = 71)
    public static void method1867() {
        field4548 = null;
        field4550 = null;
        field4551 = null;
        field4552 = null;
        field4553 = null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()V", line = 79)
    public static final synchronized void method1868() {
        GL var0 = class108.field1899;
        int var1 = 0;
        while (true) {
            class93 var2 = (class93) field4548.method2076((byte) -109);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4553, 0);
                    var1 = 0;
                }
                while (true) {
                    class93 var3 = (class93) field4550.method2076((byte) -128);
                    if (var3 == null) {
                        while (true) {
                            class93 var4 = (class93) field4551.method2076((byte) -122);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4553, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class93 var6 = (class93) field4552.method2076((byte) -95);
                                    if (var6 == null) {
                                        if (field4545 + field4544 + field4549 > 100663296 && class153.method1032(110) > field4546 + 60000L) {
                                            System.gc();
                                            field4546 = class153.method1032(110);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field4265;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field4553[var1++] = (int) var4.field4265;
                            field4549 -= var4.field1678;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4553, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4553[var1++] = (int) var3.field4265;
                    field4544 -= var3.field1678;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4553, 0);
                        var1 = 0;
                    }
                }
            }
            field4553[var1++] = (int) var2.field4265;
            field4545 -= var2.field1678;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4553, 0);
                var1 = 0;
            }
        }
    }
}
