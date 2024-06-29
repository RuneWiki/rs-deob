import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class139 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2327 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2326 = 0;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "J")
    private static long field2328 = 0L;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lfg;")
    private static class203 field2329 = new class203();

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lfg;")
    private static class203 field2331 = new class203();

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Lfg;")
    private static class203 field2332 = new class203();

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lfg;")
    private static class203 field2333 = new class203();

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[I")
    private static int[] field2334 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method1038(int arg0, int arg1, int arg2) {
        if (field2330 == arg2) {
            class172 var3 = new class172(arg1);
            var3.field3568 = (long) arg0;
            field2329.method1472(true, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()V", line = 15)
    public static void method1039() {
        field2329 = null;
        field2331 = null;
        field2332 = null;
        field2333 = null;
        field2334 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()V", line = 23)
    public static final synchronized void method1040() {
        GL var0 = class281.field4839;
        int var1 = 0;
        while (true) {
            class172 var2 = (class172) field2329.method1468(73);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2334, 0);
                    var1 = 0;
                }
                while (true) {
                    class172 var3 = (class172) field2331.method1468(-105);
                    if (var3 == null) {
                        while (true) {
                            class172 var4 = (class172) field2332.method1468(38);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2334, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class172 var6 = (class172) field2333.method1468(-125);
                                    if (var6 == null) {
                                        if (field2327 + field2325 + field2326 > 100663296 && class218.method1541(-92) > field2328 + 60000L) {
                                            System.gc();
                                            field2328 = class218.method1541(97);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field3568;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2334[var1++] = (int) var4.field3568;
                            field2326 -= var4.field2849;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2334, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2334[var1++] = (int) var3.field3568;
                    field2325 -= var3.field2849;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2334, 0);
                        var1 = 0;
                    }
                }
            }
            field2334[var1++] = (int) var2.field3568;
            field2327 -= var2.field2849;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2334, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V", line = 109)
    public static final synchronized void method1041(int arg0, int arg1) {
        if (field2330 == arg1) {
            class172 var2 = new class172();
            var2.field3568 = (long) arg0;
            field2333.method1472(true, var2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()V", line = 118)
    public static final synchronized void method1042() {
        field2330++;
        field2329.method1474(true);
        field2331.method1474(true);
        field2332.method1474(true);
        field2333.method1474(true);
        field2327 = 0;
        field2325 = 0;
        field2326 = 0;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V", line = 135)
    public static final synchronized void method1043(int arg0, int arg1, int arg2) {
        if (field2330 == arg2) {
            class172 var3 = new class172(arg1);
            var3.field3568 = (long) arg0;
            field2331.method1472(true, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(III)V", line = 152)
    public static final synchronized void method1044(int arg0, int arg1, int arg2) {
        if (field2330 == arg2) {
            class172 var3 = new class172(arg1);
            var3.field3568 = (long) arg0;
            field2332.method1472(true, var3);
        }
    }
}
