import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class177 {

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "J")
    private static long field2822 = 0L;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field2820 = 0;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Lwn;")
    private static class30 field2818 = new class30();

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Lwn;")
    private static class30 field2824 = new class30();

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Lwn;")
    private static class30 field2825 = new class30();

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "Lwn;")
    private static class30 field2826 = new class30();

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "Lwn;")
    private static class30 field2827 = new class30();

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lwn;")
    private static class30 field2828 = new class30();

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "[I")
    private static int[] field2829 = new int[1000];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[La;I)V", line = 8)
    public static final synchronized void method1300(int arg0, class290[] arg1, int arg2) {
        if (field2819 == arg2) {
            field2827.method277(new class238(arg0, arg1), (byte) -119);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V", line = 15)
    public static final synchronized void method1301(int arg0, int arg1, int arg2) {
        if (field2819 == arg2) {
            class304 var3 = new class304(arg1);
            var3.field879 = (long) arg0;
            field2818.method277(var3, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 28)
    public static final synchronized void method1302(int arg0, int arg1) {
        if (field2819 == arg1) {
            class304 var2 = new class304();
            var2.field879 = (long) arg0;
            field2826.method277(var2, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()V", line = 38)
    public static final synchronized void method1303() {
        GL var0 = class162.field2654;
        int var1 = 0;
        while (true) {
            class304 var2 = (class304) field2818.method275(-1);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2829, 0);
                    var1 = 0;
                }
                while (true) {
                    class304 var3 = (class304) field2824.method275(-1);
                    if (var3 == null) {
                        while (true) {
                            class304 var4 = (class304) field2825.method275(-1);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2829, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class304 var6 = (class304) field2826.method275(-1);
                                    if (var6 == null) {
                                        while (true) {
                                            class238 var7 = (class238) field2827.method275(-1);
                                            if (var7 == null) {
                                                while (true) {
                                                    class304 var8 = (class304) field2828.method275(-1);
                                                    if (var8 == null) {
                                                        if (field2823 + field2821 + field2820 > 100663296 && class212.method1543(22326) > field2822 + 60000L) {
                                                            System.gc();
                                                            field2822 = class212.method1543(22326);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field879;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3582.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3581, var7.field3582[var10].field4561);
                                            }
                                            var0.glDeleteObjectARB(var7.field3581);
                                        }
                                    }
                                    int var11 = (int) var6.field879;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field2829[var1++] = (int) var4.field879;
                            field2820 -= var4.field4844;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2829, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2829[var1++] = (int) var3.field879;
                    field2821 -= var3.field4844;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2829, 0);
                        var1 = 0;
                    }
                }
            }
            field2829[var1++] = (int) var2.field879;
            field2823 -= var2.field4844;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2829, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V", line = 159)
    public static final synchronized void method1304(int arg0, int arg1) {
        if (field2819 == arg1) {
            class304 var2 = new class304();
            var2.field879 = (long) arg0;
            field2828.method277(var2, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()V", line = 168)
    public static final synchronized void method1305() {
        field2819++;
        field2818.method266(-20840);
        field2824.method266(-20840);
        field2825.method266(-20840);
        field2826.method266(-20840);
        field2827.method266(-20840);
        field2828.method266(-20840);
        field2823 = 0;
        field2821 = 0;
        field2820 = 0;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "()V", line = 184)
    public static void method1306() {
        field2818 = null;
        field2824 = null;
        field2825 = null;
        field2826 = null;
        field2827 = null;
        field2828 = null;
        field2829 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)V", line = 196)
    public static final synchronized void method1307(int arg0, int arg1, int arg2) {
        if (field2819 == arg2) {
            class304 var3 = new class304(arg1);
            var3.field879 = (long) arg0;
            field2824.method277(var3, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)V", line = 209)
    public static final synchronized void method1308(int arg0, int arg1, int arg2) {
        if (field2819 == arg2) {
            class304 var3 = new class304(arg1);
            var3.field879 = (long) arg0;
            field2825.method277(var3, (byte) -119);
        }
    }
}
