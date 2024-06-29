import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class274 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field4577 = 0;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field4580 = 0;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field4581 = 0;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "J")
    private static long field4582 = 0L;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lo;")
    private static class227 field4579 = new class227();

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lo;")
    private static class227 field4583 = new class227();

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lo;")
    private static class227 field4584 = new class227();

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Lo;")
    private static class227 field4585 = new class227();

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "[I")
    private static int[] field4586 = new int[1000];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method1895(int arg0, int arg1, int arg2) {
        if (field4577 == arg2) {
            class295 var3 = new class295(arg1);
            var3.field1325 = (long) arg0;
            field4584.method1582(var3, 4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)V", line = 18)
    public static final synchronized void method1896(int arg0, int arg1, int arg2) {
        if (field4577 == arg2) {
            class295 var3 = new class295(arg1);
            var3.field1325 = (long) arg0;
            field4583.method1582(var3, 4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 30)
    public static final synchronized void method1897() {
        GL var0 = class99.field1682;
        int var1 = 0;
        while (true) {
            class295 var2 = (class295) field4579.method1574(-71);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4586, 0);
                    var1 = 0;
                }
                while (true) {
                    class295 var3 = (class295) field4583.method1574(119);
                    if (var3 == null) {
                        while (true) {
                            class295 var4 = (class295) field4584.method1574(-92);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4586, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class295 var6 = (class295) field4585.method1574(122);
                                    if (var6 == null) {
                                        if (field4581 + field4580 + field4578 > 100663296 && class130.method935(false) > field4582 + 60000L) {
                                            System.gc();
                                            field4582 = class130.method935(false);
                                        }
                                        return;
                                    }
                                    int var7 = (int) var6.field1325;
                                    var0.glDeleteLists(var7, 1);
                                }
                            }
                            field4586[var1++] = (int) var4.field1325;
                            field4578 -= var4.field4829;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4586, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4586[var1++] = (int) var3.field1325;
                    field4581 -= var3.field4829;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4586, 0);
                        var1 = 0;
                    }
                }
            }
            field4586[var1++] = (int) var2.field1325;
            field4580 -= var2.field4829;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4586, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 117)
    public static void method1898() {
        field4579 = null;
        field4583 = null;
        field4584 = null;
        field4585 = null;
        field4586 = null;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(III)V", line = 125)
    public static final synchronized void method1899(int arg0, int arg1, int arg2) {
        if (field4577 == arg2) {
            class295 var3 = new class295(arg1);
            var3.field1325 = (long) arg0;
            field4579.method1582(var3, 4);
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V", line = 138)
    public static final synchronized void method1900() {
        field4577++;
        field4579.method1573((byte) -48);
        field4583.method1573((byte) -48);
        field4584.method1573((byte) -48);
        field4585.method1573((byte) -48);
        field4580 = 0;
        field4581 = 0;
        field4578 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V", line = 151)
    public static final synchronized void method1901(int arg0, int arg1) {
        if (field4577 == arg1) {
            class295 var2 = new class295();
            var2.field1325 = (long) arg0;
            field4585.method1582(var2, 4);
        }
    }
}
