import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class124 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field2103 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "J")
    private static long field2098 = 0L;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field2101 = 0;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Laj;")
    private static class1 field2102 = new class1();

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Laj;")
    private static class1 field2104 = new class1();

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Laj;")
    private static class1 field2105 = new class1();

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Laj;")
    private static class1 field2106 = new class1();

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[I")
    private static int[] field2107 = new int[1000];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V", line = 7)
    public static final synchronized void method858() {
        GL var0 = class231.field4052;
        int var1 = 0;
        while (true) {
            class236 var2 = (class236) field2102.method12(49);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2107, 0);
                    var1 = 0;
                }
                while (true) {
                    class236 var3 = (class236) field2104.method12(92);
                    if (var3 == null) {
                        while (true) {
                            class236 var4 = (class236) field2105.method12(61);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2107, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class236 var6 = (class236) field2106.method12(49);
                                    if (var6 == null) {
                                        if (field2101 + field2100 + field2103 > 100663296 && class118.method835(-1272) > field2098 + 60000L) {
                                            System.gc();
                                            field2098 = class118.method835(-1272);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field3375;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2107[var1++] = (int) var4.field3375;
                            field2103 -= var4.field4144;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2107, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2107[var1++] = (int) var3.field3375;
                    field2101 -= var3.field4144;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2107, 0);
                        var1 = 0;
                    }
                }
            }
            field2107[var1++] = (int) var2.field3375;
            field2100 -= var2.field4144;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2107, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V", line = 94)
    public static final synchronized void method859(int arg0, int arg1, int arg2) {
        if (field2099 == arg2) {
            class236 var3 = new class236(arg1);
            var3.field3375 = (long) arg0;
            field2104.method5(var3, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V", line = 106)
    public static final synchronized void method860(int arg0, int arg1, int arg2) {
        if (field2099 == arg2) {
            class236 var3 = new class236(arg1);
            var3.field3375 = (long) arg0;
            field2102.method5(var3, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()V", line = 115)
    public static final synchronized void method861() {
        field2099++;
        field2102.method9((byte) -91);
        field2104.method9((byte) -101);
        field2105.method9((byte) -113);
        field2106.method9((byte) -126);
        field2100 = 0;
        field2101 = 0;
        field2103 = 0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 125)
    public static final synchronized void method862(int arg0, int arg1) {
        if (field2099 == arg1) {
            class236 var2 = new class236();
            var2.field3375 = (long) arg0;
            field2106.method5(var2, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()V", line = 141)
    public static void method863() {
        field2102 = null;
        field2104 = null;
        field2105 = null;
        field2106 = null;
        field2107 = null;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(III)V", line = 153)
    public static final synchronized void method864(int arg0, int arg1, int arg2) {
        if (field2099 == arg2) {
            class236 var3 = new class236(arg1);
            var3.field3375 = (long) arg0;
            field2105.method5(var3, (byte) -13);
        }
    }
}
