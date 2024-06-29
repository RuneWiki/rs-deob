import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class41 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field659 = 0;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "J")
    private static long field662 = 0L;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lli;")
    private static class18 field663 = new class18();

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lli;")
    private static class18 field664 = new class18();

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lli;")
    private static class18 field665 = new class18();

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Lli;")
    private static class18 field666 = new class18();

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[I")
    private static int[] field667 = new int[1000];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method301(int arg0, int arg1, int arg2) {
        if (field659 == arg2) {
            class188 var3 = new class188(arg1);
            var3.field2701 = (long) arg0;
            field665.method167(false, var3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()V", line = 14)
    public static void method302() {
        field663 = null;
        field664 = null;
        field665 = null;
        field666 = null;
        field667 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V", line = 25)
    public static final synchronized void method303(int arg0, int arg1) {
        if (field659 == arg1) {
            class188 var2 = new class188();
            var2.field2701 = (long) arg0;
            field666.method167(false, var2);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V", line = 34)
    public static final synchronized void method304(int arg0, int arg1, int arg2) {
        if (field659 == arg2) {
            class188 var3 = new class188(arg1);
            var3.field2701 = (long) arg0;
            field663.method167(false, var3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()V", line = 44)
    public static final synchronized void method305() {
        GL var0 = class117.field2143;
        int var1 = 0;
        while (true) {
            class188 var2 = (class188) field663.method170(125);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field667, 0);
                    var1 = 0;
                }
                while (true) {
                    class188 var3 = (class188) field664.method170(102);
                    if (var3 == null) {
                        while (true) {
                            class188 var4 = (class188) field665.method170(126);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field667, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class188 var6 = (class188) field666.method170(116);
                                    if (var6 == null) {
                                        if (field661 + field660 + field658 > 100663296 && class300.method2048((byte) 18) > field662 + 60000L) {
                                            System.gc();
                                            field662 = class300.method2048((byte) 18);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field2701;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field667[var1++] = (int) var4.field2701;
                            field658 -= var4.field3237;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field667, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field667[var1++] = (int) var3.field2701;
                    field661 -= var3.field3237;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field667, 0);
                        var1 = 0;
                    }
                }
            }
            field667[var1++] = (int) var2.field2701;
            field660 -= var2.field3237;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field667, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()V", line = 130)
    public static final synchronized void method306() {
        field659++;
        field663.method171(31);
        field664.method171(-96);
        field665.method171(-80);
        field666.method171(41);
        field660 = 0;
        field661 = 0;
        field658 = 0;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)V", line = 142)
    public static final synchronized void method307(int arg0, int arg1, int arg2) {
        if (field659 == arg2) {
            class188 var3 = new class188(arg1);
            var3.field2701 = (long) arg0;
            field664.method167(false, var3);
        }
    }
}
