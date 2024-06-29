import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class305 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field4569 = 0;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "J")
    private static long field4572 = 0L;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field4573 = 0;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lbo;")
    private static class16 field4571 = new class16();

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lbo;")
    private static class16 field4574 = new class16();

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lbo;")
    private static class16 field4575 = new class16();

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lbo;")
    private static class16 field4576 = new class16();

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lbo;")
    private static class16 field4577 = new class16();

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lbo;")
    private static class16 field4578 = new class16();

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    private static int[] field4579 = new int[1000];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V", line = 4)
    public static final synchronized void method2143(int arg0, int arg1, int arg2) {
        if (field4573 == arg2) {
            class35 var3 = new class35(arg1);
            var3.field1656 = (long) arg0;
            field4574.method106(var3, -126);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()V", line = 13)
    public static final synchronized void method2144() {
        field4573++;
        field4571.method95(-30123);
        field4574.method95(-30123);
        field4575.method95(-30123);
        field4576.method95(-30123);
        field4577.method95(-30123);
        field4578.method95(-30123);
        field4568 = 0;
        field4569 = 0;
        field4570 = 0;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V", line = 26)
    public static final synchronized void method2145(int arg0, int arg1, int arg2) {
        if (field4573 == arg2) {
            class35 var3 = new class35(arg1);
            var3.field1656 = (long) arg0;
            field4575.method106(var3, -126);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V", line = 43)
    public static final synchronized void method2146() {
        GL var0 = class141.field2025;
        int var1 = 0;
        while (true) {
            class35 var2 = (class35) field4571.method102((byte) -40);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4579, 0);
                    var1 = 0;
                }
                while (true) {
                    class35 var3 = (class35) field4574.method102((byte) -40);
                    if (var3 == null) {
                        while (true) {
                            class35 var4 = (class35) field4575.method102((byte) -40);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4579, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class35 var6 = (class35) field4576.method102((byte) -40);
                                    if (var6 == null) {
                                        while (true) {
                                            class238 var7 = (class238) field4577.method102((byte) -40);
                                            if (var7 == null) {
                                                while (true) {
                                                    class35 var8 = (class35) field4578.method102((byte) -40);
                                                    if (var8 == null) {
                                                        if (field4569 + field4568 + field4570 > 100663296 && class176.method1234(5574) > field4572 + 60000L) {
                                                            System.gc();
                                                            field4572 = class176.method1234(5574);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field1656;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3557.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3556, var7.field3557[var10].field5241);
                                            }
                                            var0.glDeleteObjectARB(var7.field3556);
                                        }
                                    }
                                    int var11 = (int) var6.field1656;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field4579[var1++] = (int) var4.field1656;
                            field4570 -= var4.field515;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4579, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4579[var1++] = (int) var3.field1656;
                    field4569 -= var3.field515;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4579, 0);
                        var1 = 0;
                    }
                }
            }
            field4579[var1++] = (int) var2.field1656;
            field4568 -= var2.field515;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4579, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V", line = 163)
    public static final synchronized void method2147(int arg0, int arg1) {
        if (field4573 == arg1) {
            class35 var2 = new class35();
            var2.field1656 = (long) arg0;
            field4576.method106(var2, -128);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V", line = 172)
    public static final synchronized void method2148(int arg0, int arg1) {
        if (field4573 == arg1) {
            class35 var2 = new class35();
            var2.field1656 = (long) arg0;
            field4578.method106(var2, -127);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[Lac;I)V", line = 182)
    public static final synchronized void method2149(int arg0, class337[] arg1, int arg2) {
        if (field4573 == arg2) {
            field4577.method106(new class238(arg0, arg1), -128);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()V", line = 200)
    public static void method2150() {
        field4571 = null;
        field4574 = null;
        field4575 = null;
        field4576 = null;
        field4577 = null;
        field4578 = null;
        field4579 = null;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V", line = 209)
    public static final synchronized void method2151(int arg0, int arg1, int arg2) {
        if (field4573 == arg2) {
            class35 var3 = new class35(arg1);
            var3.field1656 = (long) arg0;
            field4571.method106(var3, -126);
        }
    }
}
