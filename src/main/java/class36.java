import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class36 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "J")
    private static long field578 = 0L;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lel;")
    private static class218 field577 = new class218();

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lel;")
    private static class218 field579 = new class218();

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lel;")
    private static class218 field580 = new class218();

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lel;")
    private static class218 field581 = new class218();

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
    private static int[] field582 = new int[1000];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V", line = 7)
    public static final synchronized void method257() {
        field576++;
        field577.method1474((byte) 37);
        field579.method1474((byte) 124);
        field580.method1474((byte) 62);
        field581.method1474((byte) 9);
        field575 = 0;
        field573 = 0;
        field574 = 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V", line = 23)
    public static final synchronized void method258(int arg0, int arg1, int arg2) {
        if (field576 == arg2) {
            class276 var3 = new class276(arg1);
            var3.field5004 = (long) arg0;
            field577.method1485(-8564, var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V", line = 36)
    public static final synchronized void method259(int arg0, int arg1, int arg2) {
        if (field576 == arg2) {
            class276 var3 = new class276(arg1);
            var3.field5004 = (long) arg0;
            field579.method1485(-8564, var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 52)
    public static void method260() {
        field577 = null;
        field579 = null;
        field580 = null;
        field581 = null;
        field582 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 60)
    public static final synchronized void method261(int arg0, int arg1) {
        if (field576 == arg1) {
            class276 var2 = new class276();
            var2.field5004 = (long) arg0;
            field581.method1485(-8564, var2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V", line = 69)
    public static final synchronized void method262(int arg0, int arg1, int arg2) {
        if (field576 == arg2) {
            class276 var3 = new class276(arg1);
            var3.field5004 = (long) arg0;
            field580.method1485(-8564, var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V", line = 90)
    public static final synchronized void method263() {
        GL var0 = class45.field688;
        int var1 = 0;
        while (true) {
            class276 var2 = (class276) field577.method1481(true);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field582, 0);
                    var1 = 0;
                }
                while (true) {
                    class276 var3 = (class276) field579.method1481(true);
                    if (var3 == null) {
                        while (true) {
                            class276 var4 = (class276) field580.method1481(true);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field582, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class276 var6 = (class276) field581.method1481(true);
                                    if (var6 == null) {
                                        if (field575 + field573 + field574 > 100663296 && class212.method1404((byte) -94) > field578 + 60000L) {
                                            System.gc();
                                            field578 = class212.method1404((byte) -127);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field5004;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field582[var1++] = (int) var4.field5004;
                            field574 -= var4.field4703;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field582, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field582[var1++] = (int) var3.field5004;
                    field573 -= var3.field4703;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field582, 0);
                        var1 = 0;
                    }
                }
            }
            field582[var1++] = (int) var2.field5004;
            field575 -= var2.field4703;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field582, 0);
                var1 = 0;
            }
        }
    }
}
