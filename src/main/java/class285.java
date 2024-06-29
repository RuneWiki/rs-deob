import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class285 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4891 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4889 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4893 = 0;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "J")
    private static long field4894 = 0L;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Lke;")
    private static class106 field4892 = new class106();

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lke;")
    private static class106 field4895 = new class106();

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lke;")
    private static class106 field4896 = new class106();

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lke;")
    private static class106 field4897 = new class106();

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
    private static int[] field4898 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 9)
    public static final synchronized void method1974(int arg0, int arg1, int arg2) {
        if (field4893 == arg2) {
            class84 var3 = new class84(arg1);
            var3.field417 = (long) arg0;
            field4895.method781(var3, 10751);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 18)
    public static final synchronized void method1975() {
        field4893++;
        field4892.method776((byte) 69);
        field4895.method776((byte) 89);
        field4896.method776((byte) 98);
        field4897.method776((byte) 112);
        field4889 = 0;
        field4890 = 0;
        field4891 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 28)
    public static final synchronized void method1976(int arg0, int arg1) {
        if (field4893 == arg1) {
            class84 var2 = new class84();
            var2.field417 = (long) arg0;
            field4897.method781(var2, 10751);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()V", line = 41)
    public static final synchronized void method1977() {
        GL var0 = class123.field2212;
        int var1 = 0;
        while (true) {
            class84 var2 = (class84) field4892.method780((byte) -66);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4898, 0);
                    var1 = 0;
                }
                while (true) {
                    class84 var3 = (class84) field4895.method780((byte) -75);
                    if (var3 == null) {
                        while (true) {
                            class84 var4 = (class84) field4896.method780((byte) 102);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4898, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class84 var6 = (class84) field4897.method780((byte) -84);
                                    if (var6 == null) {
                                        if (field4890 + field4889 + field4891 > 100663296 && class154.method1114(true) > field4894 + 60000L) {
                                            System.gc();
                                            field4894 = class154.method1114(true);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field417;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field4898[var1++] = (int) var4.field417;
                            field4891 -= var4.field1552;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4898, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4898[var1++] = (int) var3.field417;
                    field4890 -= var3.field1552;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4898, 0);
                        var1 = 0;
                    }
                }
            }
            field4898[var1++] = (int) var2.field417;
            field4889 -= var2.field1552;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4898, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V", line = 146)
    public static void method1978() {
        field4892 = null;
        field4895 = null;
        field4896 = null;
        field4897 = null;
        field4898 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V", line = 153)
    public static final synchronized void method1979(int arg0, int arg1, int arg2) {
        if (field4893 == arg2) {
            class84 var3 = new class84(arg1);
            var3.field417 = (long) arg0;
            field4896.method781(var3, 10751);
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V", line = 166)
    public static final synchronized void method1980(int arg0, int arg1, int arg2) {
        if (field4893 == arg2) {
            class84 var3 = new class84(arg1);
            var3.field417 = (long) arg0;
            field4892.method781(var3, 10751);
        }
    }
}
