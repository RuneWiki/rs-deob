import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class104 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1710 = 0;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "J")
    private static long field1713 = 0L;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1711 = 0;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lkl;")
    private static class64 field1715 = new class64();

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lkl;")
    private static class64 field1716 = new class64();

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lkl;")
    private static class64 field1717 = new class64();

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lkl;")
    private static class64 field1718 = new class64();

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[I")
    private static int[] field1719 = new int[1000];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 4)
    public static final synchronized void method784(int arg0, int arg1) {
        if (field1712 == arg1) {
            class174 var2 = new class174();
            var2.field4932 = (long) arg0;
            field1718.method532(104, var2);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V", line = 15)
    public static final synchronized void method785(int arg0, int arg1, int arg2) {
        if (field1712 == arg2) {
            class174 var3 = new class174(arg1);
            var3.field4932 = (long) arg0;
            field1717.method532(120, var3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V", line = 30)
    public static final synchronized void method786(int arg0, int arg1, int arg2) {
        if (field1712 == arg2) {
            class174 var3 = new class174(arg1);
            var3.field4932 = (long) arg0;
            field1715.method532(81, var3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V", line = 40)
    public static void method787() {
        field1715 = null;
        field1716 = null;
        field1717 = null;
        field1718 = null;
        field1719 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V", line = 48)
    public static final synchronized void method788() {
        GL var0 = class55.field812;
        int var1 = 0;
        while (true) {
            class174 var2 = (class174) field1715.method526((byte) -4);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1719, 0);
                    var1 = 0;
                }
                while (true) {
                    class174 var3 = (class174) field1716.method526((byte) -100);
                    if (var3 == null) {
                        while (true) {
                            class174 var4 = (class174) field1717.method526((byte) -41);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1719, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class174 var6 = (class174) field1718.method526((byte) -11);
                                    if (var6 == null) {
                                        if (field1714 + field1710 + field1711 > 100663296 && class205.method1451(-122) > field1713 + 60000L) {
                                            System.gc();
                                            field1713 = class205.method1451(-104);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field4932;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field1719[var1++] = (int) var4.field4932;
                            field1711 -= var4.field2851;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1719, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1719[var1++] = (int) var3.field4932;
                    field1714 -= var3.field2851;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1719, 0);
                        var1 = 0;
                    }
                }
            }
            field1719[var1++] = (int) var2.field4932;
            field1710 -= var2.field2851;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1719, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()V", line = 134)
    public static final synchronized void method789() {
        field1712++;
        field1715.method530(-15068);
        field1716.method530(-15068);
        field1717.method530(-15068);
        field1718.method530(-15068);
        field1710 = 0;
        field1714 = 0;
        field1711 = 0;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V", line = 166)
    public static final synchronized void method790(int arg0, int arg1, int arg2) {
        if (field1712 == arg2) {
            class174 var3 = new class174(arg1);
            var3.field4932 = (long) arg0;
            field1716.method532(111, var3);
        }
    }
}
