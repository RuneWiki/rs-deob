import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class151 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2670 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "J")
    private static long field2672 = 0L;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lc;")
    private static class331 field2668 = new class331();

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lc;")
    private static class331 field2673 = new class331();

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Lc;")
    private static class331 field2674 = new class331();

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lc;")
    private static class331 field2675 = new class331();

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lc;")
    private static class331 field2676 = new class331();

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lc;")
    private static class331 field2677 = new class331();

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[I")
    private static int[] field2678 = new int[1000];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V", line = 8)
    public static final synchronized void method1186(int arg0, int arg1, int arg2) {
        if (field2669 == arg2) {
            class142 var3 = new class142(arg1);
            var3.field5062 = (long) arg0;
            field2673.method2303((byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 17)
    public static final synchronized void method1187(int arg0, int arg1) {
        if (field2669 == arg1) {
            class142 var2 = new class142();
            var2.field5062 = (long) arg0;
            field2677.method2303((byte) -124, var2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 31)
    public static final synchronized void method1188() {
        GL var0 = class43.field651;
        int var1 = 0;
        while (true) {
            class142 var2 = (class142) field2668.method2301((byte) 102);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2678, 0);
                    var1 = 0;
                }
                while (true) {
                    class142 var3 = (class142) field2673.method2301((byte) 113);
                    if (var3 == null) {
                        while (true) {
                            class142 var4 = (class142) field2674.method2301((byte) 105);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2678, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class142 var6 = (class142) field2675.method2301((byte) 98);
                                    if (var6 == null) {
                                        while (true) {
                                            class174 var7 = (class174) field2676.method2301((byte) 88);
                                            if (var7 == null) {
                                                while (true) {
                                                    class142 var8 = (class142) field2677.method2301((byte) 106);
                                                    if (var8 == null) {
                                                        if (field2670 + field2667 + field2671 > 100663296 && class306.method2102(-289) > field2672 + 60000L) {
                                                            System.gc();
                                                            field2672 = class306.method2102(-289);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field5062;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field2982.length; var10++) {
                                                var0.glDetachObjectARB(var7.field2983, var7.field2982[var10].field5553);
                                            }
                                            var0.glDeleteObjectARB(var7.field2983);
                                        }
                                    }
                                    int var11 = (int) var6.field5062;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field2678[var1++] = (int) var4.field5062;
                            field2671 -= var4.field2601;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2678, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2678[var1++] = (int) var3.field5062;
                    field2667 -= var3.field2601;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2678, 0);
                        var1 = 0;
                    }
                }
            }
            field2678[var1++] = (int) var2.field5062;
            field2670 -= var2.field2601;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2678, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V", line = 149)
    public static void method1189() {
        field2668 = null;
        field2673 = null;
        field2674 = null;
        field2675 = null;
        field2676 = null;
        field2677 = null;
        field2678 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V", line = 161)
    public static final synchronized void method1190(int arg0, int arg1, int arg2) {
        if (field2669 == arg2) {
            class142 var3 = new class142(arg1);
            var3.field5062 = (long) arg0;
            field2674.method2303((byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(III)V", line = 170)
    public static final synchronized void method1191(int arg0, int arg1, int arg2) {
        if (field2669 == arg2) {
            class142 var3 = new class142(arg1);
            var3.field5062 = (long) arg0;
            field2668.method2303((byte) -124, var3);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V", line = 184)
    public static final synchronized void method1192(int arg0, int arg1) {
        if (field2669 == arg1) {
            class142 var2 = new class142();
            var2.field5062 = (long) arg0;
            field2675.method2303((byte) -124, var2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()V", line = 197)
    public static final synchronized void method1193() {
        field2669++;
        field2668.method2302(128);
        field2673.method2302(128);
        field2674.method2302(128);
        field2675.method2302(128);
        field2676.method2302(128);
        field2677.method2302(128);
        field2670 = 0;
        field2667 = 0;
        field2671 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Lef;I)V", line = 212)
    public static final synchronized void method1194(int arg0, class350[] arg1, int arg2) {
        if (field2669 == arg2) {
            field2676.method2303((byte) -124, new class174(arg0, arg1));
        }
    }
}
