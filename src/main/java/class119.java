import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class119 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
    private static long field2004 = 0L;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2009 = 0;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lmc;")
    private static class170 field2006 = new class170();

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lmc;")
    private static class170 field2010 = new class170();

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lmc;")
    private static class170 field2011 = new class170();

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lmc;")
    private static class170 field2012 = new class170();

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
    private static int[] field2013 = new int[1000];

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()V", line = 6)
    public static final synchronized void method906() {
        GL var0 = class47.field739;
        int var1 = 0;
        while (true) {
            class8 var2 = (class8) field2006.method1258(50);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2013, 0);
                    var1 = 0;
                }
                while (true) {
                    class8 var3 = (class8) field2010.method1258(50);
                    if (var3 == null) {
                        while (true) {
                            class8 var4 = (class8) field2011.method1258(50);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2013, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class8 var6 = (class8) field2012.method1258(50);
                                    if (var6 == null) {
                                        if (field2007 + field2005 + field2008 > 100663296 && class78.method669(2047) > field2004 + 60000L) {
                                            System.gc();
                                            field2004 = class78.method669(2047);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field3488;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2013[var1++] = (int) var4.field3488;
                            field2008 -= var4.field109;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2013, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2013[var1++] = (int) var3.field3488;
                    field2005 -= var3.field109;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2013, 0);
                        var1 = 0;
                    }
                }
            }
            field2013[var1++] = (int) var2.field3488;
            field2007 -= var2.field109;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2013, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 93)
    public static final synchronized void method907(int arg0, int arg1) {
        if (field2009 == arg1) {
            class8 var2 = new class8();
            var2.field3488 = (long) arg0;
            field2012.method1251(var2, -126);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()V", line = 103)
    public static final synchronized void method908() {
        field2009++;
        field2006.method1261(2);
        field2010.method1261(2);
        field2011.method1261(2);
        field2012.method1261(2);
        field2007 = 0;
        field2005 = 0;
        field2008 = 0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V", line = 113)
    public static final synchronized void method909(int arg0, int arg1, int arg2) {
        if (field2009 == arg2) {
            class8 var3 = new class8(arg1);
            var3.field3488 = (long) arg0;
            field2010.method1251(var3, -116);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()V", line = 122)
    public static void method910() {
        field2006 = null;
        field2010 = null;
        field2011 = null;
        field2012 = null;
        field2013 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(III)V", line = 132)
    public static final synchronized void method911(int arg0, int arg1, int arg2) {
        if (field2009 == arg2) {
            class8 var3 = new class8(arg1);
            var3.field3488 = (long) arg0;
            field2011.method1251(var3, -124);
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(III)V", line = 155)
    public static final synchronized void method912(int arg0, int arg1, int arg2) {
        if (field2009 == arg2) {
            class8 var3 = new class8(arg1);
            var3.field3488 = (long) arg0;
            field2006.method1251(var3, -121);
        }
    }
}
