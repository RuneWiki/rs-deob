import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class79 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field1321 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field1326 = 0;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "J")
    private static long field1325 = 0L;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field1324 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lud;")
    private static class52 field1322 = new class52();

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lud;")
    private static class52 field1327 = new class52();

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lud;")
    private static class52 field1328 = new class52();

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lud;")
    private static class52 field1329 = new class52();

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
    private static int[] field1330 = new int[1000];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 4)
    public static final synchronized void method609() {
        field1324++;
        field1322.method328(false);
        field1327.method328(false);
        field1328.method328(false);
        field1329.method328(false);
        field1323 = 0;
        field1321 = 0;
        field1326 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V", line = 14)
    public static void method610() {
        field1322 = null;
        field1327 = null;
        field1328 = null;
        field1329 = null;
        field1330 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V", line = 26)
    public static final synchronized void method611() {
        GL var0 = class154.field2479;
        int var1 = 0;
        while (true) {
            class173 var2 = (class173) field1322.method329(25);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1330, 0);
                    var1 = 0;
                }
                while (true) {
                    class173 var3 = (class173) field1327.method329(25);
                    if (var3 == null) {
                        while (true) {
                            class173 var4 = (class173) field1328.method329(25);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1330, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class173 var6 = (class173) field1329.method329(25);
                                    if (var6 == null) {
                                        if (field1323 + field1321 + field1326 > 100663296 && class293.method1985((byte) -71) > field1325 + 60000L) {
                                            System.gc();
                                            field1325 = class293.method1985((byte) -71);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field3499;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field1330[var1++] = (int) var4.field3499;
                            field1326 -= var4.field2796;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1330, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1330[var1++] = (int) var3.field3499;
                    field1321 -= var3.field2796;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1330, 0);
                        var1 = 0;
                    }
                }
            }
            field1330[var1++] = (int) var2.field3499;
            field1323 -= var2.field2796;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1330, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 115)
    public static final synchronized void method612(int arg0, int arg1, int arg2) {
        if (field1324 == arg2) {
            class173 var3 = new class173(arg1);
            var3.field3499 = (long) arg0;
            field1322.method330(var3, -103);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V", line = 124)
    public static final synchronized void method613(int arg0, int arg1, int arg2) {
        if (field1324 == arg2) {
            class173 var3 = new class173(arg1);
            var3.field3499 = (long) arg0;
            field1327.method330(var3, -85);
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(III)V", line = 135)
    public static final synchronized void method614(int arg0, int arg1, int arg2) {
        if (field1324 == arg2) {
            class173 var3 = new class173(arg1);
            var3.field3499 = (long) arg0;
            field1328.method330(var3, -68);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 150)
    public static final synchronized void method615(int arg0, int arg1) {
        if (field1324 == arg1) {
            class173 var2 = new class173();
            var2.field3499 = (long) arg0;
            field1329.method330(var2, -103);
        }
    }
}
