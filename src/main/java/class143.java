import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class143 {

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field2279 = 0;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "J")
    private static long field2282 = 0L;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field2280 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Luj;")
    private static class156 field2281 = new class156();

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Luj;")
    private static class156 field2283 = new class156();

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Luj;")
    private static class156 field2284 = new class156();

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Luj;")
    private static class156 field2285 = new class156();

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
    private static int[] field2286 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()V", line = 4)
    public static void method936() {
        field2281 = null;
        field2283 = null;
        field2284 = null;
        field2285 = null;
        field2286 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V", line = 14)
    public static final synchronized void method937(int arg0, int arg1, int arg2) {
        if (field2280 == arg2) {
            class204 var3 = new class204(arg1);
            var3.field1218 = (long) arg0;
            field2284.method999(var3, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 25)
    public static final synchronized void method938(int arg0, int arg1) {
        if (field2280 == arg1) {
            class204 var2 = new class204();
            var2.field1218 = (long) arg0;
            field2285.method999(var2, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V", line = 44)
    public static final synchronized void method939(int arg0, int arg1, int arg2) {
        if (field2280 == arg2) {
            class204 var3 = new class204(arg1);
            var3.field1218 = (long) arg0;
            field2283.method999(var3, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()V", line = 53)
    public static final synchronized void method940() {
        field2280++;
        field2281.method1001(78);
        field2283.method1001(-69);
        field2284.method1001(96);
        field2285.method1001(93);
        field2278 = 0;
        field2277 = 0;
        field2279 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(III)V", line = 69)
    public static final synchronized void method941(int arg0, int arg1, int arg2) {
        if (field2280 == arg2) {
            class204 var3 = new class204(arg1);
            var3.field1218 = (long) arg0;
            field2281.method999(var3, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()V", line = 85)
    public static final synchronized void method942() {
        GL var0 = class264.field4313;
        int var1 = 0;
        while (true) {
            class204 var2 = (class204) field2281.method991(16771501);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2286, 0);
                    var1 = 0;
                }
                while (true) {
                    class204 var3 = (class204) field2283.method991(16771501);
                    if (var3 == null) {
                        while (true) {
                            class204 var4 = (class204) field2284.method991(16771501);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2286, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class204 var6 = (class204) field2285.method991(16771501);
                                    if (var6 == null) {
                                        if (field2278 + field2277 + field2279 > 100663296 && class110.method707((byte) 127) > field2282 + 60000L) {
                                            System.gc();
                                            field2282 = class110.method707((byte) 112);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field1218;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field2286[var1++] = (int) var4.field1218;
                            field2279 -= var4.field3230;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2286, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2286[var1++] = (int) var3.field1218;
                    field2277 -= var3.field3230;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2286, 0);
                        var1 = 0;
                    }
                }
            }
            field2286[var1++] = (int) var2.field1218;
            field2278 -= var2.field3230;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2286, 0);
                var1 = 0;
            }
        }
    }
}
