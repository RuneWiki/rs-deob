import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class221 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field3869 = 0;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "J")
    private static long field3870 = 0L;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field3872 = 0;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3871 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lij;")
    private static class175 field3868 = new class175();

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lij;")
    private static class175 field3873 = new class175();

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lij;")
    private static class175 field3874 = new class175();

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lij;")
    private static class175 field3875 = new class175();

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
    private static int[] field3876 = new int[1000];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V", line = 9)
    public static final synchronized void method1519(int arg0, int arg1, int arg2) {
        if (field3871 == arg2) {
            class6 var3 = new class6(arg1);
            var3.field2895 = (long) arg0;
            field3868.method1269(false, var3);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()V", line = 18)
    public static void method1520() {
        field3868 = null;
        field3873 = null;
        field3874 = null;
        field3875 = null;
        field3876 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V", line = 29)
    public static final synchronized void method1521() {
        GL var0 = class253.field4319;
        int var1 = 0;
        while (true) {
            class6 var2 = (class6) field3868.method1267(-42);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3876, 0);
                    var1 = 0;
                }
                while (true) {
                    class6 var3 = (class6) field3873.method1267(99);
                    if (var3 == null) {
                        while (true) {
                            class6 var4 = (class6) field3874.method1267(-108);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3876, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class6 var6 = (class6) field3875.method1267(-38);
                                    if (var6 == null) {
                                        if (field3872 + field3867 + field3869 > 100663296 && class224.method1536(false) > field3870 + 60000L) {
                                            System.gc();
                                            field3870 = class224.method1536(false);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field2895;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field3876[var1++] = (int) var4.field2895;
                            field3869 -= var4.field94;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3876, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3876[var1++] = (int) var3.field2895;
                    field3867 -= var3.field94;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3876, 0);
                        var1 = 0;
                    }
                }
            }
            field3876[var1++] = (int) var2.field2895;
            field3872 -= var2.field94;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3876, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V", line = 115)
    public static final synchronized void method1522() {
        field3871++;
        field3868.method1275((byte) -127);
        field3873.method1275((byte) -118);
        field3874.method1275((byte) -73);
        field3875.method1275((byte) -78);
        field3872 = 0;
        field3867 = 0;
        field3869 = 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V", line = 125)
    public static final synchronized void method1523(int arg0, int arg1) {
        if (field3871 == arg1) {
            class6 var2 = new class6();
            var2.field2895 = (long) arg0;
            field3875.method1269(false, var2);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V", line = 138)
    public static final synchronized void method1524(int arg0, int arg1, int arg2) {
        if (field3871 == arg2) {
            class6 var3 = new class6(arg1);
            var3.field2895 = (long) arg0;
            field3874.method1269(false, var3);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(III)V", line = 147)
    public static final synchronized void method1525(int arg0, int arg1, int arg2) {
        if (field3871 == arg2) {
            class6 var3 = new class6(arg1);
            var3.field2895 = (long) arg0;
            field3873.method1269(false, var3);
        }
    }
}
