import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "J")
    private static long field87 = 0L;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field86 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field91 = 0;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljk;")
    private static class76 field88 = new class76();

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljk;")
    private static class76 field92 = new class76();

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Ljk;")
    private static class76 field93 = new class76();

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Ljk;")
    private static class76 field94 = new class76();

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    private static int[] field95 = new int[1000];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 4)
    public static void method25() {
        field88 = null;
        field92 = null;
        field93 = null;
        field94 = null;
        field95 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V", line = 13)
    public static final synchronized void method26(int arg0, int arg1, int arg2) {
        if (field91 == arg2) {
            class69 var3 = new class69(arg1);
            var3.field292 = (long) arg0;
            field93.method451(-91453648, var3);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V", line = 26)
    public static final synchronized void method27() {
        field91++;
        field88.method453(255);
        field92.method453(255);
        field93.method453(255);
        field94.method453(255);
        field86 = 0;
        field90 = 0;
        field89 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V", line = 36)
    public static final synchronized void method28(int arg0, int arg1, int arg2) {
        if (field91 == arg2) {
            class69 var3 = new class69(arg1);
            var3.field292 = (long) arg0;
            field88.method451(-91453648, var3);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 46)
    public static final synchronized void method29(int arg0, int arg1) {
        if (field91 == arg1) {
            class69 var2 = new class69();
            var2.field292 = (long) arg0;
            field94.method451(-91453648, var2);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()V", line = 61)
    public static final synchronized void method30() {
        GL var0 = class90.field1390;
        int var1 = 0;
        while (true) {
            class69 var2 = (class69) field88.method447(true);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field95, 0);
                    var1 = 0;
                }
                while (true) {
                    class69 var3 = (class69) field92.method447(true);
                    if (var3 == null) {
                        while (true) {
                            class69 var4 = (class69) field93.method447(true);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field95, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class69 var6 = (class69) field94.method447(true);
                                    if (var6 == null) {
                                        if (field90 + field86 + field89 > 100663296 && class194.method1368((byte) 94) > field87 + 60000L) {
                                            System.gc();
                                            field87 = class194.method1368((byte) 125);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field292;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field95[var1++] = (int) var4.field292;
                            field89 -= var4.field919;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field95, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field95[var1++] = (int) var3.field292;
                    field90 -= var3.field919;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field95, 0);
                        var1 = 0;
                    }
                }
            }
            field95[var1++] = (int) var2.field292;
            field86 -= var2.field919;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field95, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)V", line = 155)
    public static final synchronized void method31(int arg0, int arg1, int arg2) {
        if (field91 == arg2) {
            class69 var3 = new class69(arg1);
            var3.field292 = (long) arg0;
            field92.method451(-91453648, var3);
        }
    }
}
