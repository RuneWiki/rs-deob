import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class180 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "J")
    private static long field2411 = 0L;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2409 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lhi;")
    private static class192 field2410 = new class192();

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lhi;")
    private static class192 field2415 = new class192();

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lhi;")
    private static class192 field2416 = new class192();

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lhi;")
    private static class192 field2417 = new class192();

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lhi;")
    private static class192 field2418 = new class192();

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lhi;")
    private static class192 field2419 = new class192();

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
    private static int[] field2420 = new int[1000];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 5)
    public static final synchronized void method1244(int arg0, int arg1) {
        if (field2413 == arg1) {
            class336 var2 = new class336();
            var2.field2522 = (long) arg0;
            field2417.method1339((byte) -121, var2);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "()V", line = 14)
    public static final synchronized void method1245() {
        field2413++;
        field2410.method1345(-74);
        field2415.method1345(-93);
        field2416.method1345(-118);
        field2417.method1345(-37);
        field2418.method1345(-65);
        field2419.method1345(-32);
        field2409 = 0;
        field2414 = 0;
        field2412 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lfc;I)V", line = 28)
    public static final synchronized void method1246(int arg0, class261[] arg1, int arg2) {
        if (field2413 == arg2) {
            field2418.method1339((byte) -123, new class191(arg0, arg1));
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V", line = 35)
    public static final synchronized void method1247(int arg0, int arg1, int arg2) {
        if (field2413 == arg2) {
            class336 var3 = new class336(arg1);
            var3.field2522 = (long) arg0;
            field2415.method1339((byte) -107, var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "()V", line = 47)
    public static final synchronized void method1248() {
        GL var0 = class67.field899;
        int var1 = 0;
        while (true) {
            class336 var2 = (class336) field2410.method1350((byte) -127);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field2420, 0);
                    var1 = 0;
                }
                while (true) {
                    class336 var3 = (class336) field2415.method1350((byte) -126);
                    if (var3 == null) {
                        while (true) {
                            class336 var4 = (class336) field2416.method1350((byte) -127);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field2420, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class336 var6 = (class336) field2417.method1350((byte) -127);
                                    if (var6 == null) {
                                        while (true) {
                                            class191 var7 = (class191) field2418.method1350((byte) -126);
                                            if (var7 == null) {
                                                while (true) {
                                                    class336 var8 = (class336) field2419.method1350((byte) -126);
                                                    if (var8 == null) {
                                                        if (field2414 + field2409 + field2412 > 100663296 && class29.method174(27763) > field2411 + 60000L) {
                                                            System.gc();
                                                            field2411 = class29.method174(27763);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field2522;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field2625.length; var10++) {
                                                var0.glDetachObjectARB(var7.field2624, var7.field2625[var10].field3837);
                                            }
                                            var0.glDeleteObjectARB(var7.field2624);
                                        }
                                    }
                                    int var11 = (int) var6.field2522;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field2420[var1++] = (int) var4.field2522;
                            field2412 -= var4.field5063;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field2420, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field2420[var1++] = (int) var3.field2522;
                    field2414 -= var3.field5063;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field2420, 0);
                        var1 = 0;
                    }
                }
            }
            field2420[var1++] = (int) var2.field2522;
            field2409 -= var2.field5063;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field2420, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V", line = 164)
    public static final synchronized void method1249(int arg0, int arg1, int arg2) {
        if (field2413 == arg2) {
            class336 var3 = new class336(arg1);
            var3.field2522 = (long) arg0;
            field2416.method1339((byte) 99, var3);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "()V", line = 182)
    public static void method1250() {
        field2410 = null;
        field2415 = null;
        field2416 = null;
        field2417 = null;
        field2418 = null;
        field2419 = null;
        field2420 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V", line = 191)
    public static final synchronized void method1251(int arg0, int arg1) {
        if (field2413 == arg1) {
            class336 var2 = new class336();
            var2.field2522 = (long) arg0;
            field2419.method1339((byte) 4, var2);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V", line = 200)
    public static final synchronized void method1252(int arg0, int arg1, int arg2) {
        if (field2413 == arg2) {
            class336 var3 = new class336(arg1);
            var3.field2522 = (long) arg0;
            field2410.method1339((byte) -127, var3);
        }
    }
}
