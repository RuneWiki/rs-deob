import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "J")
    private static long field1 = 0L;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field6 = 0;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lgj;")
    private static class257 field4 = new class257();

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lgj;")
    private static class257 field7 = new class257();

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lgj;")
    private static class257 field8 = new class257();

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lgj;")
    private static class257 field9 = new class257();

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lgj;")
    private static class257 field10 = new class257();

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lgj;")
    private static class257 field11 = new class257();

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
    private static int[] field12 = new int[1000];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V", line = 5)
    public static final synchronized void method1(int arg0, int arg1, int arg2) {
        if (field3 == arg2) {
            class305 var3 = new class305(arg1);
            var3.field2834 = (long) arg0;
            field4.method1814(var3, true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V", line = 14)
    public static final synchronized void method2() {
        field3++;
        field4.method1811((byte) -30);
        field7.method1811((byte) -30);
        field8.method1811((byte) -30);
        field9.method1811((byte) -30);
        field10.method1811((byte) -30);
        field11.method1811((byte) -30);
        field6 = 0;
        field5 = 0;
        field2 = 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[Lha;I)V", line = 31)
    public static final synchronized void method3(int arg0, class335[] arg1, int arg2) {
        if (field3 == arg2) {
            field10.method1814(new class317(arg0, arg1), true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V", line = 37)
    public static final synchronized void method4(int arg0, int arg1, int arg2) {
        if (field3 == arg2) {
            class305 var3 = new class305(arg1);
            var3.field2834 = (long) arg0;
            field8.method1814(var3, true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)V", line = 46)
    public static final synchronized void method5(int arg0, int arg1, int arg2) {
        if (field3 == arg2) {
            class305 var3 = new class305(arg1);
            var3.field2834 = (long) arg0;
            field7.method1814(var3, true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V", line = 55)
    public static void method6() {
        field4 = null;
        field7 = null;
        field8 = null;
        field9 = null;
        field10 = null;
        field11 = null;
        field12 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 67)
    public static final synchronized void method7(int arg0, int arg1) {
        if (field3 == arg1) {
            class305 var2 = new class305();
            var2.field2834 = (long) arg0;
            field9.method1814(var2, true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V", line = 78)
    public static final synchronized void method8() {
        GL var0 = class272.field4310;
        int var1 = 0;
        while (true) {
            class305 var2 = (class305) field4.method1808(0);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field12, 0);
                    var1 = 0;
                }
                while (true) {
                    class305 var3 = (class305) field7.method1808(0);
                    if (var3 == null) {
                        while (true) {
                            class305 var4 = (class305) field8.method1808(0);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field12, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class305 var6 = (class305) field9.method1808(0);
                                    if (var6 == null) {
                                        while (true) {
                                            class317 var7 = (class317) field10.method1808(0);
                                            if (var7 == null) {
                                                while (true) {
                                                    class305 var8 = (class305) field11.method1808(0);
                                                    if (var8 == null) {
                                                        if (field6 + field5 + field2 > 100663296 && class9.method57(-14133) > field1 + 60000L) {
                                                            System.gc();
                                                            field1 = class9.method57(-14133);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field2834;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field4957.length; var10++) {
                                                var0.glDetachObjectARB(var7.field4956, var7.field4957[var10].field5340);
                                            }
                                            var0.glDeleteObjectARB(var7.field4956);
                                        }
                                    }
                                    int var11 = (int) var6.field2834;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field12[var1++] = (int) var4.field2834;
                            field2 -= var4.field4748;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field12, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field12[var1++] = (int) var3.field2834;
                    field5 -= var3.field4748;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field12, 0);
                        var1 = 0;
                    }
                }
            }
            field12[var1++] = (int) var2.field2834;
            field6 -= var2.field4748;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field12, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V", line = 199)
    public static final synchronized void method9(int arg0, int arg1) {
        if (field3 == arg1) {
            class305 var2 = new class305();
            var2.field2834 = (long) arg0;
            field11.method1814(var2, true);
        }
    }
}
