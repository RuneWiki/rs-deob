import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class198 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
    private static long field2963 = 0L;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lql;")
    private static class87 field2965 = new class87();

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lql;")
    private static class87 field2967 = new class87();

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lql;")
    private static class87 field2968 = new class87();

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lql;")
    private static class87 field2969 = new class87();

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lql;")
    private static class87 field2970 = new class87();

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Lql;")
    private static class87 field2971 = new class87();

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "[I")
    private static int[] field2972 = new int[1000];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 5)
    public static final synchronized void method1403(int arg0, int arg1, int arg2) {
        if (field2966 == arg2) {
            class295 var3 = new class295(arg1);
            var3.field758 = (long) arg0;
            field2967.method632(-121, var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V", line = 15)
    public static final synchronized void method1404(int arg0, int arg1, int arg2) {
        if (field2966 == arg2) {
            class295 var3 = new class295(arg1);
            var3.field758 = (long) arg0;
            field2968.method632(-64, var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V", line = 25)
    public static final synchronized void method1405(int arg0, int arg1) {
        if (field2966 == arg1) {
            class295 var2 = new class295();
            var2.field758 = (long) arg0;
            field2971.method632(-63, var2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)V", line = 34)
    public static final synchronized void method1406(int arg0, int arg1) {
        if (field2966 == arg1) {
            class295 var2 = new class295();
            var2.field758 = (long) arg0;
            field2969.method632(-120, var2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)V", line = 44)
    public static final synchronized void method1407(int arg0, int arg1, int arg2) {
        if (field2966 == arg2) {
            class295 var3 = new class295(arg1);
            var3.field758 = (long) arg0;
            field2965.method632(-108, var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "()V", line = 65)
    public static void method1408() {
        field2965 = null;
        field2967 = null;
        field2968 = null;
        field2969 = null;
        field2970 = null;
        field2971 = null;
        field2972 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[Lpa;I)V", line = 77)
    public static final synchronized void method1409(int arg0, class283[] arg1, int arg2) {
        if (field2966 == arg2) {
            field2970.method632(-102, new class147(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "()V", line = 86)
    public static final synchronized void method1410() {
        GL var0 = class94.field1473;
        int var1 = 0;
        while (true) {
            class295 var2 = (class295) field2965.method633(-1);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2972, 0);
                    var1 = 0;
                }
                while (true) {
                    class295 var3 = (class295) field2967.method633(-1);
                    if (var3 == null) {
                        while (true) {
                            class295 var4 = (class295) field2968.method633(-1);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2972, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class295 var6 = (class295) field2969.method633(-1);
                                    if (var6 == null) {
                                        while (true) {
                                            class147 var7 = (class147) field2970.method633(-1);
                                            if (var7 == null) {
                                                while (true) {
                                                    class295 var8 = (class295) field2971.method633(-1);
                                                    if (var8 == null) {
                                                        if (field2964 + field2962 + field2961 > 100663296 && class102.method743((byte) 117) > field2963 + 60000L) {
                                                            System.gc();
                                                            field2963 = class102.method743((byte) 109);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field758;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field2241.length; var10++) {
                                                var0.glDetachObjectARB(var7.field2240, var7.field2241[var10].field4375);
                                            }
                                            var0.glDeleteObjectARB(var7.field2240);
                                        }
                                    }
                                    int var11 = (int) var6.field758;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field2972[var1++] = (int) var4.field758;
                            field2961 -= var4.field4562;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2972, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2972[var1++] = (int) var3.field758;
                    field2964 -= var3.field4562;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2972, 0);
                        var1 = 0;
                    }
                }
            }
            field2972[var1++] = (int) var2.field758;
            field2962 -= var2.field4562;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2972, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "()V", line = 203)
    public static final synchronized void method1411() {
        field2966++;
        field2965.method634((byte) -96);
        field2967.method634((byte) -90);
        field2968.method634((byte) 77);
        field2969.method634((byte) -109);
        field2970.method634((byte) -124);
        field2971.method634((byte) -89);
        field2962 = 0;
        field2964 = 0;
        field2961 = 0;
    }
}
