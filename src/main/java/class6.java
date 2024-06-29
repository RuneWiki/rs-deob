import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class6 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "J")
    private static long field51 = 0L;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field50 = 0;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Lam;")
    private static class277 field49 = new class277();

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Lam;")
    private static class277 field52 = new class277();

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "Lam;")
    private static class277 field53 = new class277();

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lam;")
    private static class277 field54 = new class277();

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
    private static int[] field55 = new int[1000];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method34(int arg0, int arg1, int arg2) {
        if (field47 == arg2) {
            class259 var3 = new class259(arg1);
            var3.field2418 = (long) arg0;
            field49.method1940((byte) -90, var3);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)V", line = 13)
    public static final synchronized void method35(int arg0, int arg1, int arg2) {
        if (field47 == arg2) {
            class259 var3 = new class259(arg1);
            var3.field2418 = (long) arg0;
            field53.method1940((byte) -113, var3);
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(III)V", line = 22)
    public static final synchronized void method36(int arg0, int arg1, int arg2) {
        if (field47 == arg2) {
            class259 var3 = new class259(arg1);
            var3.field2418 = (long) arg0;
            field52.method1940((byte) -121, var3);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()V", line = 36)
    public static void method37() {
        field49 = null;
        field52 = null;
        field53 = null;
        field54 = null;
        field55 = null;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()V", line = 51)
    public static final synchronized void method38() {
        GL var0 = class147.field2479;
        int var1 = 0;
        while (true) {
            class259 var2 = (class259) field49.method1932(-1);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field55, 0);
                    var1 = 0;
                }
                while (true) {
                    class259 var3 = (class259) field52.method1932(-1);
                    if (var3 == null) {
                        while (true) {
                            class259 var4 = (class259) field53.method1932(-1);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field55, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class259 var6 = (class259) field54.method1932(-1);
                                    if (var6 == null) {
                                        if (field48 + field46 + field50 > 100663296 && class57.method391(19211) > field51 + 60000L) {
                                            System.gc();
                                            field51 = class57.method391(19211);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field2418;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field55[var1++] = (int) var4.field2418;
                            field50 -= var4.field4431;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field55, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field55[var1++] = (int) var3.field2418;
                    field48 -= var3.field4431;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field55, 0);
                        var1 = 0;
                    }
                }
            }
            field55[var1++] = (int) var2.field2418;
            field46 -= var2.field4431;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field55, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()V", line = 137)
    public static final synchronized void method39() {
        field47++;
        field49.method1938(71);
        field52.method1938(71);
        field53.method1938(71);
        field54.method1938(71);
        field46 = 0;
        field48 = 0;
        field50 = 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 149)
    public static final synchronized void method40(int arg0, int arg1) {
        if (field47 == arg1) {
            class259 var2 = new class259();
            var2.field2418 = (long) arg0;
            field54.method1940((byte) 10, var2);
        }
    }
}
