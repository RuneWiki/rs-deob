import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class28 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "J")
    private static long field457 = 0L;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "Lfk;")
    private static class317 field456 = new class317();

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lfk;")
    private static class317 field460 = new class317();

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Lfk;")
    private static class317 field461 = new class317();

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lfk;")
    private static class317 field462 = new class317();

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lfk;")
    private static class317 field463 = new class317();

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lfk;")
    private static class317 field464 = new class317();

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "[I")
    private static int[] field465 = new int[1000];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 4)
    public static final synchronized void method320(int arg0, int arg1) {
        if (field455 == arg1) {
            class164 var2 = new class164();
            var2.field2734 = (long) arg0;
            field464.method2245(var2, 44);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V", line = 15)
    public static final synchronized void method321() {
        GL var0 = class240.field3771;
        int var1 = 0;
        while (true) {
            class164 var2 = (class164) field456.method2242((byte) 5);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field465, 0);
                    var1 = 0;
                }
                while (true) {
                    class164 var3 = (class164) field460.method2242((byte) -120);
                    if (var3 == null) {
                        while (true) {
                            class164 var4 = (class164) field461.method2242((byte) -109);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field465, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class164 var6 = (class164) field462.method2242((byte) 23);
                                    if (var6 == null) {
                                        while (true) {
                                            class198 var7 = (class198) field463.method2242((byte) 37);
                                            if (var7 == null) {
                                                while (true) {
                                                    class164 var8 = (class164) field464.method2242((byte) -120);
                                                    if (var8 == null) {
                                                        if (field458 + field454 + field459 > 100663296 && class156.method1273((byte) -64) > field457 + 60000L) {
                                                            System.gc();
                                                            field457 = class156.method1273((byte) -112);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field2734;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3089.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3088, var7.field3089[var10].field119);
                                            }
                                            var0.glDeleteObjectARB(var7.field3088);
                                        }
                                    }
                                    int var11 = (int) var6.field2734;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field465[var1++] = (int) var4.field2734;
                            field459 -= var4.field2610;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field465, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field465[var1++] = (int) var3.field2734;
                    field458 -= var3.field2610;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field465, 0);
                        var1 = 0;
                    }
                }
            }
            field465[var1++] = (int) var2.field2734;
            field454 -= var2.field2610;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field465, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[Lvg;I)V", line = 132)
    public static final synchronized void method322(int arg0, class8[] arg1, int arg2) {
        if (field455 == arg2) {
            field463.method2245(new class198(arg0, arg1), 51);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V", line = 138)
    public static void method323() {
        field456 = null;
        field460 = null;
        field461 = null;
        field462 = null;
        field463 = null;
        field464 = null;
        field465 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V", line = 154)
    public static final synchronized void method324(int arg0, int arg1, int arg2) {
        if (field455 == arg2) {
            class164 var3 = new class164(arg1);
            var3.field2734 = (long) arg0;
            field461.method2245(var3, 64);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()V", line = 183)
    public static final synchronized void method325() {
        field455++;
        field456.method2233(-118);
        field460.method2233(-110);
        field461.method2233(-51);
        field462.method2233(-55);
        field463.method2233(-120);
        field464.method2233(-109);
        field454 = 0;
        field458 = 0;
        field459 = 0;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V", line = 195)
    public static final synchronized void method326(int arg0, int arg1) {
        if (field455 == arg1) {
            class164 var2 = new class164();
            var2.field2734 = (long) arg0;
            field462.method2245(var2, 101);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V", line = 204)
    public static final synchronized void method327(int arg0, int arg1, int arg2) {
        if (field455 == arg2) {
            class164 var3 = new class164(arg1);
            var3.field2734 = (long) arg0;
            field460.method2245(var3, 62);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V", line = 213)
    public static final synchronized void method328(int arg0, int arg1, int arg2) {
        if (field455 == arg2) {
            class164 var3 = new class164(arg1);
            var3.field2734 = (long) arg0;
            field456.method2245(var3, 75);
        }
    }
}
