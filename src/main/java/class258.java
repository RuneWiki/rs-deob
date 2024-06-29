import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class258 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4010 = 0;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4011 = 0;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field4013 = 0;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field4014 = 0;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "J")
    private static long field4015 = 0L;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Lth;")
    private static class55 field4012 = new class55();

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Lth;")
    private static class55 field4016 = new class55();

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lth;")
    private static class55 field4017 = new class55();

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lth;")
    private static class55 field4018 = new class55();

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Lth;")
    private static class55 field4019 = new class55();

    @OriginalMember(owner = "client!um", name = "k", descriptor = "Lth;")
    private static class55 field4020 = new class55();

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[I")
    private static int[] field4021 = new int[1000];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 5)
    public static final synchronized void method1726() {
        GL var0 = class249.field3898;
        int var1 = 0;
        while (true) {
            class166 var2 = (class166) field4012.method430(5);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4021, 0);
                    var1 = 0;
                }
                while (true) {
                    class166 var3 = (class166) field4016.method430(5);
                    if (var3 == null) {
                        while (true) {
                            class166 var4 = (class166) field4017.method430(5);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4021, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class166 var6 = (class166) field4018.method430(5);
                                    if (var6 == null) {
                                        while (true) {
                                            class262 var7 = (class262) field4019.method430(5);
                                            if (var7 == null) {
                                                while (true) {
                                                    class166 var8 = (class166) field4020.method430(5);
                                                    if (var8 == null) {
                                                        if (field4011 + field4010 + field4014 > 100663296 && class338.method2339((byte) -120) > field4015 + 60000L) {
                                                            System.gc();
                                                            field4015 = class338.method2339((byte) -120);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field702;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field4083.length; var10++) {
                                                var0.glDetachObjectARB(var7.field4082, var7.field4083[var10].field1674);
                                            }
                                            var0.glDeleteObjectARB(var7.field4082);
                                        }
                                    }
                                    int var11 = (int) var6.field702;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field4021[var1++] = (int) var4.field702;
                            field4014 -= var4.field2682;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4021, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4021[var1++] = (int) var3.field702;
                    field4011 -= var3.field2682;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4021, 0);
                        var1 = 0;
                    }
                }
            }
            field4021[var1++] = (int) var2.field702;
            field4010 -= var2.field2682;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4021, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V", line = 122)
    public static final synchronized void method1727(int arg0, int arg1) {
        if (field4013 == arg1) {
            class166 var2 = new class166();
            var2.field702 = (long) arg0;
            field4020.method427((byte) 93, var2);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V", line = 131)
    public static final synchronized void method1728(int arg0, int arg1) {
        if (field4013 == arg1) {
            class166 var2 = new class166();
            var2.field702 = (long) arg0;
            field4018.method427((byte) 88, var2);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()V", line = 140)
    public static void method1729() {
        field4012 = null;
        field4016 = null;
        field4017 = null;
        field4018 = null;
        field4019 = null;
        field4020 = null;
        field4021 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V", line = 151)
    public static final synchronized void method1730(int arg0, int arg1, int arg2) {
        if (field4013 == arg2) {
            class166 var3 = new class166(arg1);
            var3.field702 = (long) arg0;
            field4016.method427((byte) 118, var3);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()V", line = 160)
    public static final synchronized void method1731() {
        field4013++;
        field4012.method432(62);
        field4016.method432(-105);
        field4017.method432(-74);
        field4018.method432(112);
        field4019.method432(82);
        field4020.method432(73);
        field4010 = 0;
        field4011 = 0;
        field4014 = 0;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)V", line = 174)
    public static final synchronized void method1732(int arg0, int arg1, int arg2) {
        if (field4013 == arg2) {
            class166 var3 = new class166(arg1);
            var3.field702 = (long) arg0;
            field4017.method427((byte) 124, var3);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)V", line = 196)
    public static final synchronized void method1733(int arg0, int arg1, int arg2) {
        if (field4013 == arg2) {
            class166 var3 = new class166(arg1);
            var3.field702 = (long) arg0;
            field4012.method427((byte) -66, var3);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[Lkm;I)V", line = 205)
    public static final synchronized void method1734(int arg0, class92[] arg1, int arg2) {
        if (field4013 == arg2) {
            field4019.method427((byte) 116, new class262(arg0, arg1));
        }
    }
}
