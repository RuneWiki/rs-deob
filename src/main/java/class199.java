import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class199 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "J")
    private static long field3170 = 0L;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field3174 = 0;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field3173 = 0;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lci;")
    private static class327 field3171 = new class327();

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lci;")
    private static class327 field3175 = new class327();

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lci;")
    private static class327 field3176 = new class327();

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lci;")
    private static class327 field3177 = new class327();

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lci;")
    private static class327 field3178 = new class327();

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Lci;")
    private static class327 field3179 = new class327();

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    private static int[] field3180 = new int[1000];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V", line = 10)
    public static final synchronized void method1527() {
        field3172++;
        field3171.method2301(-23);
        field3175.method2301(-23);
        field3176.method2301(-23);
        field3177.method2301(-23);
        field3178.method2301(-23);
        field3179.method2301(-23);
        field3169 = 0;
        field3174 = 0;
        field3173 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 22)
    public static final synchronized void method1528(int arg0, int arg1) {
        if (field3172 == arg1) {
            class301 var2 = new class301();
            var2.field698 = (long) arg0;
            field3179.method2302((byte) -113, var2);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V", line = 32)
    public static void method1529() {
        field3171 = null;
        field3175 = null;
        field3176 = null;
        field3177 = null;
        field3178 = null;
        field3179 = null;
        field3180 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 41)
    public static final synchronized void method1530(int arg0, int arg1, int arg2) {
        if (field3172 == arg2) {
            class301 var3 = new class301(arg1);
            var3.field698 = (long) arg0;
            field3171.method2302((byte) -118, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V", line = 53)
    public static final synchronized void method1531(int arg0, int arg1, int arg2) {
        if (field3172 == arg2) {
            class301 var3 = new class301(arg1);
            var3.field698 = (long) arg0;
            field3175.method2302((byte) -111, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V", line = 62)
    public static final synchronized void method1532(int arg0, int arg1) {
        if (field3172 == arg1) {
            class301 var2 = new class301();
            var2.field698 = (long) arg0;
            field3177.method2302((byte) -38, var2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lul;I)V", line = 71)
    public static final synchronized void method1533(int arg0, class228[] arg1, int arg2) {
        if (field3172 == arg2) {
            field3178.method2302((byte) -122, new class207(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V", line = 84)
    public static final synchronized void method1534() {
        GL var0 = class42.field627;
        int var1 = 0;
        while (true) {
            class301 var2 = (class301) field3171.method2307((byte) 127);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3180, 0);
                    var1 = 0;
                }
                while (true) {
                    class301 var3 = (class301) field3175.method2307((byte) 127);
                    if (var3 == null) {
                        while (true) {
                            class301 var4 = (class301) field3176.method2307((byte) 127);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3180, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class301 var6 = (class301) field3177.method2307((byte) 127);
                                    if (var6 == null) {
                                        while (true) {
                                            class207 var7 = (class207) field3178.method2307((byte) 127);
                                            if (var7 == null) {
                                                while (true) {
                                                    class301 var8 = (class301) field3179.method2307((byte) 127);
                                                    if (var8 == null) {
                                                        if (field3174 + field3169 + field3173 > 100663296 && class47.method371(-99) > field3170 + 60000L) {
                                                            System.gc();
                                                            field3170 = class47.method371(-82);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field698;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3261.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3262, var7.field3261[var10].field3801);
                                            }
                                            var0.glDeleteObjectARB(var7.field3262);
                                        }
                                    }
                                    int var11 = (int) var6.field698;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field3180[var1++] = (int) var4.field698;
                            field3173 -= var4.field4846;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3180, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3180[var1++] = (int) var3.field698;
                    field3174 -= var3.field4846;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3180, 0);
                        var1 = 0;
                    }
                }
            }
            field3180[var1++] = (int) var2.field698;
            field3169 -= var2.field4846;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3180, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V", line = 206)
    public static final synchronized void method1535(int arg0, int arg1, int arg2) {
        if (field3172 == arg2) {
            class301 var3 = new class301(arg1);
            var3.field698 = (long) arg0;
            field3176.method2302((byte) -41, var3);
        }
    }
}
