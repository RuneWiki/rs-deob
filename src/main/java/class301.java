import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class301 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4648 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "J")
    private static long field4652 = 0L;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lnk;")
    private static class2 field4651 = new class2();

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lnk;")
    private static class2 field4653 = new class2();

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lnk;")
    private static class2 field4654 = new class2();

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lnk;")
    private static class2 field4655 = new class2();

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lnk;")
    private static class2 field4656 = new class2();

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lnk;")
    private static class2 field4657 = new class2();

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[I")
    private static int[] field4658 = new int[1000];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V", line = 7)
    public static final synchronized void method1977(int arg0, int arg1) {
        if (field4649 == arg1) {
            class27 var2 = new class27();
            var2.field2852 = (long) arg0;
            field4657.method7((byte) -51, var2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V", line = 16)
    public static final synchronized void method1978(int arg0, int arg1) {
        if (field4649 == arg1) {
            class27 var2 = new class27();
            var2.field2852 = (long) arg0;
            field4655.method7((byte) -51, var2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V", line = 36)
    public static final synchronized void method1979(int arg0, int arg1, int arg2) {
        if (field4649 == arg2) {
            class27 var3 = new class27(arg1);
            var3.field2852 = (long) arg0;
            field4653.method7((byte) -51, var3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 46)
    public static final synchronized void method1980() {
        GL var0 = class333.field5160;
        int var1 = 0;
        while (true) {
            class27 var2 = (class27) field4651.method12(-97);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4658, 0);
                    var1 = 0;
                }
                while (true) {
                    class27 var3 = (class27) field4653.method12(-101);
                    if (var3 == null) {
                        while (true) {
                            class27 var4 = (class27) field4654.method12(67);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4658, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class27 var6 = (class27) field4655.method12(-63);
                                    if (var6 == null) {
                                        while (true) {
                                            class250 var7 = (class250) field4656.method12(123);
                                            if (var7 == null) {
                                                while (true) {
                                                    class27 var8 = (class27) field4657.method12(115);
                                                    if (var8 == null) {
                                                        if (field4650 + field4647 + field4648 > 100663296 && class195.method1322(121) > field4652 + 60000L) {
                                                            System.gc();
                                                            field4652 = class195.method1322(126);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field2852;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3919.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3918, var7.field3919[var10].field90);
                                            }
                                            var0.glDeleteObjectARB(var7.field3918);
                                        }
                                    }
                                    int var11 = (int) var6.field2852;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field4658[var1++] = (int) var4.field2852;
                            field4648 -= var4.field344;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4658, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4658[var1++] = (int) var3.field2852;
                    field4647 -= var3.field344;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4658, 0);
                        var1 = 0;
                    }
                }
            }
            field4658[var1++] = (int) var2.field2852;
            field4650 -= var2.field344;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4658, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V", line = 163)
    public static final synchronized void method1981(int arg0, int arg1, int arg2) {
        if (field4649 == arg2) {
            class27 var3 = new class27(arg1);
            var3.field2852 = (long) arg0;
            field4651.method7((byte) -51, var3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[Lka;I)V", line = 172)
    public static final synchronized void method1982(int arg0, class9[] arg1, int arg2) {
        if (field4649 == arg2) {
            field4656.method7((byte) -51, new class250(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)V", line = 183)
    public static final synchronized void method1983(int arg0, int arg1, int arg2) {
        if (field4649 == arg2) {
            class27 var3 = new class27(arg1);
            var3.field2852 = (long) arg0;
            field4654.method7((byte) -51, var3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V", line = 193)
    public static final synchronized void method1984() {
        field4649++;
        field4651.method5(36);
        field4653.method5(34);
        field4654.method5(54);
        field4655.method5(45);
        field4656.method5(122);
        field4657.method5(57);
        field4650 = 0;
        field4647 = 0;
        field4648 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V", line = 212)
    public static void method1985() {
        field4651 = null;
        field4653 = null;
        field4654 = null;
        field4655 = null;
        field4656 = null;
        field4657 = null;
        field4658 = null;
    }
}
