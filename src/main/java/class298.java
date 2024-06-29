import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class298 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field4318 = 0;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field4319 = 0;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "J")
    private static long field4321 = 0L;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field4323 = 0;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field4320 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lll;")
    private static class54 field4322 = new class54();

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lll;")
    private static class54 field4324 = new class54();

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lll;")
    private static class54 field4325 = new class54();

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lll;")
    private static class54 field4326 = new class54();

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lll;")
    private static class54 field4327 = new class54();

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lll;")
    private static class54 field4328 = new class54();

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "[I")
    private static int[] field4329 = new int[1000];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lec;I)V", line = 4)
    public static final synchronized void method2032(int arg0, class349[] arg1, int arg2) {
        if (field4320 == arg2) {
            field4327.method415((byte) 16, new class202(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 10)
    public static final synchronized void method2033() {
        field4320++;
        field4322.method409(1986850152);
        field4324.method409(1986850152);
        field4325.method409(1986850152);
        field4326.method409(1986850152);
        field4327.method409(1986850152);
        field4328.method409(1986850152);
        field4319 = 0;
        field4323 = 0;
        field4318 = 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V", line = 22)
    public static final synchronized void method2034(int arg0, int arg1) {
        if (field4320 == arg1) {
            class7 var2 = new class7();
            var2.field304 = (long) arg0;
            field4326.method415((byte) -107, var2);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 44)
    public static void method2035() {
        field4322 = null;
        field4324 = null;
        field4325 = null;
        field4326 = null;
        field4327 = null;
        field4328 = null;
        field4329 = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()V", line = 56)
    public static final synchronized void method2036() {
        GL var0 = class47.field592;
        int var1 = 0;
        while (true) {
            class7 var2 = (class7) field4322.method411(false);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4329, 0);
                    var1 = 0;
                }
                while (true) {
                    class7 var3 = (class7) field4324.method411(false);
                    if (var3 == null) {
                        while (true) {
                            class7 var4 = (class7) field4325.method411(false);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4329, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class7 var6 = (class7) field4326.method411(false);
                                    if (var6 == null) {
                                        while (true) {
                                            class202 var7 = (class202) field4327.method411(false);
                                            if (var7 == null) {
                                                while (true) {
                                                    class7 var8 = (class7) field4328.method411(false);
                                                    if (var8 == null) {
                                                        if (field4323 + field4319 + field4318 > 100663296 && class6.method37(10828) > field4321 + 60000L) {
                                                            System.gc();
                                                            field4321 = class6.method37(10828);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field304;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field2824.length; var10++) {
                                                var0.glDetachObjectARB(var7.field2825, var7.field2824[var10].field5457);
                                            }
                                            var0.glDeleteObjectARB(var7.field2825);
                                        }
                                    }
                                    int var11 = (int) var6.field304;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field4329[var1++] = (int) var4.field304;
                            field4318 -= var4.field67;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4329, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4329[var1++] = (int) var3.field304;
                    field4323 -= var3.field67;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4329, 0);
                        var1 = 0;
                    }
                }
            }
            field4329[var1++] = (int) var2.field304;
            field4319 -= var2.field67;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4329, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 173)
    public static final synchronized void method2037(int arg0, int arg1, int arg2) {
        if (field4320 == arg2) {
            class7 var3 = new class7(arg1);
            var3.field304 = (long) arg0;
            field4325.method415((byte) -102, var3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V", line = 182)
    public static final synchronized void method2038(int arg0, int arg1, int arg2) {
        if (field4320 == arg2) {
            class7 var3 = new class7(arg1);
            var3.field304 = (long) arg0;
            field4322.method415((byte) 119, var3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V", line = 193)
    public static final synchronized void method2039(int arg0, int arg1, int arg2) {
        if (field4320 == arg2) {
            class7 var3 = new class7(arg1);
            var3.field304 = (long) arg0;
            field4324.method415((byte) -99, var3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V", line = 203)
    public static final synchronized void method2040(int arg0, int arg1) {
        if (field4320 == arg1) {
            class7 var2 = new class7();
            var2.field304 = (long) arg0;
            field4328.method415((byte) 107, var2);
        }
    }
}
