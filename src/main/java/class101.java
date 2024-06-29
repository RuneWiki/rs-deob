import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class101 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field1722 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "J")
    private static long field1725 = 0L;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Lj;")
    private static class269 field1721 = new class269();

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lj;")
    private static class269 field1726 = new class269();

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lj;")
    private static class269 field1727 = new class269();

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lj;")
    private static class269 field1728 = new class269();

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    private static int[] field1729 = new int[1000];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V", line = 5)
    public static final synchronized void method668(int arg0, int arg1, int arg2) {
        if (field1723 == arg2) {
            class119 var3 = new class119(arg1);
            var3.field1445 = (long) arg0;
            field1721.method1809(var3, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 15)
    public static void method669() {
        field1721 = null;
        field1726 = null;
        field1727 = null;
        field1728 = null;
        field1729 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V", line = 22)
    public static final synchronized void method670(int arg0, int arg1) {
        if (field1723 == arg1) {
            class119 var2 = new class119();
            var2.field1445 = (long) arg0;
            field1728.method1809(var2, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V", line = 36)
    public static final synchronized void method671(int arg0, int arg1, int arg2) {
        if (field1723 == arg2) {
            class119 var3 = new class119(arg1);
            var3.field1445 = (long) arg0;
            field1726.method1809(var3, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)V", line = 50)
    public static final synchronized void method672(int arg0, int arg1, int arg2) {
        if (field1723 == arg2) {
            class119 var3 = new class119(arg1);
            var3.field1445 = (long) arg0;
            field1727.method1809(var3, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V", line = 59)
    public static final synchronized void method673() {
        field1723++;
        field1721.method1810(108);
        field1726.method1810(54);
        field1727.method1810(-80);
        field1728.method1810(41);
        field1724 = 0;
        field1722 = 0;
        field1720 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()V", line = 74)
    public static final synchronized void method674() {
        GL var0 = class167.field2806;
        int var1 = 0;
        while (true) {
            class119 var2 = (class119) field1721.method1814(false);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1729, 0);
                    var1 = 0;
                }
                while (true) {
                    class119 var3 = (class119) field1726.method1814(false);
                    if (var3 == null) {
                        while (true) {
                            class119 var4 = (class119) field1727.method1814(false);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1729, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class119 var6 = (class119) field1728.method1814(false);
                                    if (var6 == null) {
                                        if (field1724 + field1722 + field1720 > 100663296 && class216.method1426(255) > field1725 + 60000L) {
                                            System.gc();
                                            field1725 = class216.method1426(255);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field1445;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field1729[var1++] = (int) var4.field1445;
                            field1720 -= var4.field1998;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1729, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1729[var1++] = (int) var3.field1445;
                    field1722 -= var3.field1998;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1729, 0);
                        var1 = 0;
                    }
                }
            }
            field1729[var1++] = (int) var2.field1445;
            field1724 -= var2.field1998;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1729, 0);
                var1 = 0;
            }
        }
    }
}
