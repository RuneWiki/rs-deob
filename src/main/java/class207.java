import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class207 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field3381 = 0;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field3383 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field3385 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3382 = 0;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "J")
    private static long field3386 = 0L;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lek;")
    private static class183 field3384 = new class183();

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lek;")
    private static class183 field3387 = new class183();

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lek;")
    private static class183 field3388 = new class183();

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lek;")
    private static class183 field3389 = new class183();

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[I")
    private static int[] field3390 = new int[1000];

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "()V", line = 6)
    public static final synchronized void method1393() {
        field3383++;
        field3384.method1224((byte) 56);
        field3387.method1224((byte) 56);
        field3388.method1224((byte) 56);
        field3389.method1224((byte) 56);
        field3381 = 0;
        field3382 = 0;
        field3385 = 0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V", line = 20)
    public static final synchronized void method1394(int arg0, int arg1, int arg2) {
        if (field3383 == arg2) {
            class114 var3 = new class114(arg1);
            var3.field4689 = (long) arg0;
            field3384.method1214(false, var3);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "()V", line = 32)
    public static final synchronized void method1395() {
        GL var0 = class217.field3551;
        int var1 = 0;
        while (true) {
            class114 var2 = (class114) field3384.method1215((byte) -90);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3390, 0);
                    var1 = 0;
                }
                while (true) {
                    class114 var3 = (class114) field3387.method1215((byte) -111);
                    if (var3 == null) {
                        while (true) {
                            class114 var4 = (class114) field3388.method1215((byte) -116);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3390, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class114 var6 = (class114) field3389.method1215((byte) -93);
                                    if (var6 == null) {
                                        if (field3382 + field3381 + field3385 > 100663296 && class76.method507(-30994) > field3386 + 60000L) {
                                            System.gc();
                                            field3386 = class76.method507(-30994);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field4689;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field3390[var1++] = (int) var4.field4689;
                            field3385 -= var4.field1616;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3390, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3390[var1++] = (int) var3.field4689;
                    field3382 -= var3.field1616;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3390, 0);
                        var1 = 0;
                    }
                }
            }
            field3390[var1++] = (int) var2.field4689;
            field3381 -= var2.field1616;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3390, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 121)
    public static final synchronized void method1396(int arg0, int arg1) {
        if (field3383 == arg1) {
            class114 var2 = new class114();
            var2.field4689 = (long) arg0;
            field3389.method1214(false, var2);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "()V", line = 130)
    public static void method1397() {
        field3384 = null;
        field3387 = null;
        field3388 = null;
        field3389 = null;
        field3390 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(III)V", line = 137)
    public static final synchronized void method1398(int arg0, int arg1, int arg2) {
        if (field3383 == arg2) {
            class114 var3 = new class114(arg1);
            var3.field4689 = (long) arg0;
            field3387.method1214(false, var3);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(III)V", line = 156)
    public static final synchronized void method1399(int arg0, int arg1, int arg2) {
        if (field3383 == arg2) {
            class114 var3 = new class114(arg1);
            var3.field4689 = (long) arg0;
            field3388.method1214(false, var3);
        }
    }
}
