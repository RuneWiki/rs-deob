import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class103 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "J")
    private static long field1371 = 0L;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lma;")
    private static class5 field1372 = new class5();

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lma;")
    private static class5 field1375 = new class5();

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lma;")
    private static class5 field1376 = new class5();

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lma;")
    private static class5 field1377 = new class5();

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lma;")
    private static class5 field1378 = new class5();

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lma;")
    private static class5 field1379 = new class5();

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "[I")
    private static int[] field1380 = new int[1000];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V", line = 5)
    public static final synchronized void method712() {
        GL var0 = class109.field1456;
        int var1 = 0;
        while (true) {
            class233 var2 = (class233) field1372.method24(0);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1380, 0);
                    var1 = 0;
                }
                while (true) {
                    class233 var3 = (class233) field1375.method24(0);
                    if (var3 == null) {
                        while (true) {
                            class233 var4 = (class233) field1376.method24(0);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1380, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class233 var6 = (class233) field1377.method24(0);
                                    if (var6 == null) {
                                        while (true) {
                                            class288 var7 = (class288) field1378.method24(0);
                                            if (var7 == null) {
                                                while (true) {
                                                    class233 var8 = (class233) field1379.method24(0);
                                                    if (var8 == null) {
                                                        if (field1373 + field1370 + field1374 > 100663296 && class219.method1609(-898) > field1371 + 60000L) {
                                                            System.gc();
                                                            field1371 = class219.method1609(-898);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field4430;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field4438.length; var10++) {
                                                var0.glDetachObjectARB(var7.field4439, var7.field4438[var10].field410);
                                            }
                                            var0.glDeleteObjectARB(var7.field4439);
                                        }
                                    }
                                    int var11 = (int) var6.field4430;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field1380[var1++] = (int) var4.field4430;
                            field1374 -= var4.field3633;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1380, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1380[var1++] = (int) var3.field4430;
                    field1370 -= var3.field3633;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1380, 0);
                        var1 = 0;
                    }
                }
            }
            field1380[var1++] = (int) var2.field4430;
            field1373 -= var2.field3633;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1380, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[Lbd;I)V", line = 123)
    public static final synchronized void method713(int arg0, class28[] arg1, int arg2) {
        if (field1369 == arg2) {
            field1378.method19(new class288(arg0, arg1), -1058);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V", line = 130)
    public static final synchronized void method714(int arg0, int arg1, int arg2) {
        if (field1369 == arg2) {
            class233 var3 = new class233(arg1);
            var3.field4430 = (long) arg0;
            field1376.method19(var3, -1058);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V", line = 141)
    public static final synchronized void method715(int arg0, int arg1, int arg2) {
        if (field1369 == arg2) {
            class233 var3 = new class233(arg1);
            var3.field4430 = (long) arg0;
            field1372.method19(var3, -1058);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 156)
    public static final synchronized void method716(int arg0, int arg1) {
        if (field1369 == arg1) {
            class233 var2 = new class233();
            var2.field4430 = (long) arg0;
            field1379.method19(var2, -1058);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()V", line = 169)
    public static final synchronized void method717() {
        field1369++;
        field1372.method27((byte) 108);
        field1375.method27((byte) 87);
        field1376.method27((byte) 99);
        field1377.method27((byte) 124);
        field1378.method27((byte) 71);
        field1379.method27((byte) 86);
        field1373 = 0;
        field1370 = 0;
        field1374 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(III)V", line = 181)
    public static final synchronized void method718(int arg0, int arg1, int arg2) {
        if (field1369 == arg2) {
            class233 var3 = new class233(arg1);
            var3.field4430 = (long) arg0;
            field1375.method19(var3, -1058);
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()V", line = 190)
    public static void method719() {
        field1372 = null;
        field1375 = null;
        field1376 = null;
        field1377 = null;
        field1378 = null;
        field1379 = null;
        field1380 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V", line = 209)
    public static final synchronized void method720(int arg0, int arg1) {
        if (field1369 == arg1) {
            class233 var2 = new class233();
            var2.field4430 = (long) arg0;
            field1377.method19(var2, -1058);
        }
    }
}
