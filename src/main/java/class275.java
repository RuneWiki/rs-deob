import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class275 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4357 = 0;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "J")
    private static long field4356 = 0L;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4355 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4358 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4359 = 0;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lqg;")
    private static class256 field4360 = new class256();

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lqg;")
    private static class256 field4361 = new class256();

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lqg;")
    private static class256 field4362 = new class256();

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lqg;")
    private static class256 field4363 = new class256();

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lqg;")
    private static class256 field4364 = new class256();

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lqg;")
    private static class256 field4365 = new class256();

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
    private static int[] field4366 = new int[1000];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method1957(int arg0, int arg1, int arg2) {
        if (field4359 == arg2) {
            class310 var3 = new class310(arg1);
            var3.field916 = (long) arg0;
            field4362.method1815((byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V", line = 13)
    public static final synchronized void method1958(int arg0, int arg1) {
        if (field4359 == arg1) {
            class310 var2 = new class310();
            var2.field916 = (long) arg0;
            field4365.method1815((byte) -125, var2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V", line = 22)
    public static void method1959() {
        field4360 = null;
        field4361 = null;
        field4362 = null;
        field4363 = null;
        field4364 = null;
        field4365 = null;
        field4366 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()V", line = 32)
    public static final synchronized void method1960() {
        GL var0 = class186.field2990;
        int var1 = 0;
        while (true) {
            class310 var2 = (class310) field4360.method1814(-30321);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4366, 0);
                    var1 = 0;
                }
                while (true) {
                    class310 var3 = (class310) field4361.method1814(-30321);
                    if (var3 == null) {
                        while (true) {
                            class310 var4 = (class310) field4362.method1814(-30321);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4366, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class310 var6 = (class310) field4363.method1814(-30321);
                                    if (var6 == null) {
                                        while (true) {
                                            class150 var7 = (class150) field4364.method1814(-30321);
                                            if (var7 == null) {
                                                while (true) {
                                                    class310 var8 = (class310) field4365.method1814(-30321);
                                                    if (var8 == null) {
                                                        if (field4357 + field4355 + field4358 > 100663296 && class304.method2128((byte) -116) > field4356 + 60000L) {
                                                            System.gc();
                                                            field4356 = class304.method2128((byte) -91);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field916;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field2308.length; var10++) {
                                                var0.glDetachObjectARB(var7.field2307, var7.field2308[var10].field591);
                                            }
                                            var0.glDeleteObjectARB(var7.field2307);
                                        }
                                    }
                                    int var11 = (int) var6.field916;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field4366[var1++] = (int) var4.field916;
                            field4358 -= var4.field4844;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4366, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4366[var1++] = (int) var3.field916;
                    field4357 -= var3.field4844;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4366, 0);
                        var1 = 0;
                    }
                }
            }
            field4366[var1++] = (int) var2.field916;
            field4355 -= var2.field4844;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4366, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V", line = 154)
    public static final synchronized void method1961(int arg0, int arg1, int arg2) {
        if (field4359 == arg2) {
            class310 var3 = new class310(arg1);
            var3.field916 = (long) arg0;
            field4361.method1815((byte) 108, var3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V", line = 163)
    public static final synchronized void method1962(int arg0, int arg1, int arg2) {
        if (field4359 == arg2) {
            class310 var3 = new class310(arg1);
            var3.field916 = (long) arg0;
            field4360.method1815((byte) -126, var3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()V", line = 172)
    public static final synchronized void method1963() {
        field4359++;
        field4360.method1811((byte) 25);
        field4361.method1811((byte) 25);
        field4362.method1811((byte) 25);
        field4363.method1811((byte) 25);
        field4364.method1811((byte) 25);
        field4365.method1811((byte) 25);
        field4355 = 0;
        field4357 = 0;
        field4358 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V", line = 185)
    public static final synchronized void method1964(int arg0, int arg1) {
        if (field4359 == arg1) {
            class310 var2 = new class310();
            var2.field916 = (long) arg0;
            field4363.method1815((byte) -127, var2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[Ldl;I)V", line = 198)
    public static final synchronized void method1965(int arg0, class43[] arg1, int arg2) {
        if (field4359 == arg2) {
            field4364.method1815((byte) -126, new class150(arg0, arg1));
        }
    }
}
