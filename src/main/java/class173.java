import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class173 {

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field2704 = 0;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "J")
    private static long field2702 = 0L;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field2703 = 0;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljo;")
    private static class150 field2700 = new class150();

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Ljo;")
    private static class150 field2706 = new class150();

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Ljo;")
    private static class150 field2707 = new class150();

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Ljo;")
    private static class150 field2708 = new class150();

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Ljo;")
    private static class150 field2709 = new class150();

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "Ljo;")
    private static class150 field2710 = new class150();

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "[I")
    private static int[] field2711 = new int[1000];

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method1191(int arg0, int arg1, int arg2) {
        if (field2703 == arg2) {
            class94 var3 = new class94(arg1);
            var3.field2549 = (long) arg0;
            field2706.method1077(16711935, var3);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V", line = 14)
    public static final synchronized void method1192() {
        field2703++;
        field2700.method1082(64);
        field2706.method1082(64);
        field2707.method1082(64);
        field2708.method1082(64);
        field2709.method1082(64);
        field2710.method1082(64);
        field2701 = 0;
        field2705 = 0;
        field2704 = 0;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()V", line = 28)
    public static final synchronized void method1193() {
        GL var0 = class245.field3884;
        int var1 = 0;
        while (true) {
            class94 var2 = (class94) field2700.method1080(-1);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2711, 0);
                    var1 = 0;
                }
                while (true) {
                    class94 var3 = (class94) field2706.method1080(-1);
                    if (var3 == null) {
                        while (true) {
                            class94 var4 = (class94) field2707.method1080(-1);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2711, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class94 var6 = (class94) field2708.method1080(-1);
                                    if (var6 == null) {
                                        while (true) {
                                            class225 var7 = (class225) field2709.method1080(-1);
                                            if (var7 == null) {
                                                while (true) {
                                                    class94 var8 = (class94) field2710.method1080(-1);
                                                    if (var8 == null) {
                                                        if (field2705 + field2701 + field2704 > 100663296 && class19.method122(-12169) > field2702 + 60000L) {
                                                            System.gc();
                                                            field2702 = class19.method122(-12169);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field2549;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3523.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3524, var7.field3523[var10].field5691);
                                            }
                                            var0.glDeleteObjectARB(var7.field3524);
                                        }
                                    }
                                    int var11 = (int) var6.field2549;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field2711[var1++] = (int) var4.field2549;
                            field2704 -= var4.field1373;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2711, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2711[var1++] = (int) var3.field2549;
                    field2705 -= var3.field1373;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2711, 0);
                        var1 = 0;
                    }
                }
            }
            field2711[var1++] = (int) var2.field2549;
            field2701 -= var2.field1373;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2711, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[Lmo;I)V", line = 145)
    public static final synchronized void method1194(int arg0, class360[] arg1, int arg2) {
        if (field2703 == arg2) {
            field2709.method1077(16711935, new class225(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V", line = 154)
    public static final synchronized void method1195(int arg0, int arg1) {
        if (field2703 == arg1) {
            class94 var2 = new class94();
            var2.field2549 = (long) arg0;
            field2708.method1077(16711935, var2);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(III)V", line = 167)
    public static final synchronized void method1196(int arg0, int arg1, int arg2) {
        if (field2703 == arg2) {
            class94 var3 = new class94(arg1);
            var3.field2549 = (long) arg0;
            field2700.method1077(16711935, var3);
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()V", line = 176)
    public static void method1197() {
        field2700 = null;
        field2706 = null;
        field2707 = null;
        field2708 = null;
        field2709 = null;
        field2710 = null;
        field2711 = null;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(III)V", line = 185)
    public static final synchronized void method1198(int arg0, int arg1, int arg2) {
        if (field2703 == arg2) {
            class94 var3 = new class94(arg1);
            var3.field2549 = (long) arg0;
            field2707.method1077(16711935, var3);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V", line = 196)
    public static final synchronized void method1199(int arg0, int arg1) {
        if (field2703 == arg1) {
            class94 var2 = new class94();
            var2.field2549 = (long) arg0;
            field2710.method1077(16711935, var2);
        }
    }
}
