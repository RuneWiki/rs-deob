import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class230 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field3662 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "J")
    private static long field3659 = 0L;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field3663 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lhh;")
    private static class169 field3661 = new class169();

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lhh;")
    private static class169 field3664 = new class169();

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lhh;")
    private static class169 field3665 = new class169();

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lhh;")
    private static class169 field3666 = new class169();

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lhh;")
    private static class169 field3667 = new class169();

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lhh;")
    private static class169 field3668 = new class169();

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[I")
    private static int[] field3669 = new int[1000];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V", line = 5)
    public static final synchronized void method1627(int arg0, int arg1, int arg2) {
        if (field3658 == arg2) {
            class174 var3 = new class174(arg1);
            var3.field2744 = (long) arg0;
            field3664.method1232(93, var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 14)
    public static final synchronized void method1628() {
        field3658++;
        field3661.method1233(30602);
        field3664.method1233(30602);
        field3665.method1233(30602);
        field3666.method1233(30602);
        field3667.method1233(30602);
        field3668.method1233(30602);
        field3660 = 0;
        field3662 = 0;
        field3663 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[Ldn;I)V", line = 26)
    public static final synchronized void method1629(int arg0, class132[] arg1, int arg2) {
        if (field3658 == arg2) {
            field3667.method1232(88, new class16(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)V", line = 32)
    public static final synchronized void method1630(int arg0, int arg1, int arg2) {
        if (field3658 == arg2) {
            class174 var3 = new class174(arg1);
            var3.field2744 = (long) arg0;
            field3665.method1232(120, var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()V", line = 41)
    public static void method1631() {
        field3661 = null;
        field3664 = null;
        field3665 = null;
        field3666 = null;
        field3667 = null;
        field3668 = null;
        field3669 = null;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V", line = 52)
    public static final synchronized void method1632() {
        GL var0 = class232.field3716;
        int var1 = 0;
        while (true) {
            class174 var2 = (class174) field3661.method1234((byte) 77);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3669, 0);
                    var1 = 0;
                }
                while (true) {
                    class174 var3 = (class174) field3664.method1234((byte) 47);
                    if (var3 == null) {
                        while (true) {
                            class174 var4 = (class174) field3665.method1234((byte) 43);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3669, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class174 var6 = (class174) field3666.method1234((byte) 118);
                                    if (var6 == null) {
                                        while (true) {
                                            class16 var7 = (class16) field3667.method1234((byte) 37);
                                            if (var7 == null) {
                                                while (true) {
                                                    class174 var8 = (class174) field3668.method1234((byte) 30);
                                                    if (var8 == null) {
                                                        if (field3662 + field3660 + field3663 > 100663296 && class283.method2038((byte) 122) > field3659 + 60000L) {
                                                            System.gc();
                                                            field3659 = class283.method2038((byte) 122);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field2744;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field196.length; var10++) {
                                                var0.glDetachObjectARB(var7.field195, var7.field196[var10].field2078);
                                            }
                                            var0.glDeleteObjectARB(var7.field195);
                                        }
                                    }
                                    int var11 = (int) var6.field2744;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field3669[var1++] = (int) var4.field2744;
                            field3663 -= var4.field2881;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3669, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3669[var1++] = (int) var3.field2744;
                    field3662 -= var3.field2881;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3669, 0);
                        var1 = 0;
                    }
                }
            }
            field3669[var1++] = (int) var2.field2744;
            field3660 -= var2.field2881;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3669, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)V", line = 171)
    public static final synchronized void method1633(int arg0, int arg1, int arg2) {
        if (field3658 == arg2) {
            class174 var3 = new class174(arg1);
            var3.field2744 = (long) arg0;
            field3661.method1232(101, var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 186)
    public static final synchronized void method1634(int arg0, int arg1) {
        if (field3658 == arg1) {
            class174 var2 = new class174();
            var2.field2744 = (long) arg0;
            field3668.method1232(121, var2);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V", line = 209)
    public static final synchronized void method1635(int arg0, int arg1) {
        if (field3658 == arg1) {
            class174 var2 = new class174();
            var2.field2744 = (long) arg0;
            field3666.method1232(103, var2);
        }
    }
}
