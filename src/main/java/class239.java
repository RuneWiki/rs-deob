import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class239 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3976 = 0;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "J")
    private static long field3977 = 0L;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3975 = 0;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Len;")
    private static class49 field3979 = new class49();

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Len;")
    private static class49 field3980 = new class49();

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Len;")
    private static class49 field3981 = new class49();

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Len;")
    private static class49 field3982 = new class49();

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Len;")
    private static class49 field3983 = new class49();

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "Len;")
    private static class49 field3984 = new class49();

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "[I")
    private static int[] field3985 = new int[1000];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 12)
    public static void method1666() {
        field3979 = null;
        field3980 = null;
        field3981 = null;
        field3982 = null;
        field3983 = null;
        field3984 = null;
        field3985 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 26)
    public static final synchronized void method1667(int arg0, int arg1) {
        if (field3974 == arg1) {
            class111 var2 = new class111();
            var2.field1291 = (long) arg0;
            field3984.method437(var2, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V", line = 38)
    public static final synchronized void method1668(int arg0, int arg1, int arg2) {
        if (field3974 == arg2) {
            class111 var3 = new class111(arg1);
            var3.field1291 = (long) arg0;
            field3980.method437(var3, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Led;I)V", line = 50)
    public static final synchronized void method1669(int arg0, class327[] arg1, int arg2) {
        if (field3974 == arg2) {
            field3983.method437(new class343(arg0, arg1), (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 57)
    public static final synchronized void method1670() {
        GL var0 = class241.field4012;
        int var1 = 0;
        while (true) {
            class111 var2 = (class111) field3979.method432(true);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field3985, 0);
                    var1 = 0;
                }
                while (true) {
                    class111 var3 = (class111) field3980.method432(true);
                    if (var3 == null) {
                        while (true) {
                            class111 var4 = (class111) field3981.method432(true);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field3985, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class111 var6 = (class111) field3982.method432(true);
                                    if (var6 == null) {
                                        while (true) {
                                            class343 var7 = (class343) field3983.method432(true);
                                            if (var7 == null) {
                                                while (true) {
                                                    class111 var8 = (class111) field3984.method432(true);
                                                    if (var8 == null) {
                                                        if (field3978 + field3976 + field3975 > 100663296 && class218.method1520((byte) 59) > field3977 + 60000L) {
                                                            System.gc();
                                                            field3977 = class218.method1520((byte) 104);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field1291;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field5423.length; var10++) {
                                                var0.glDetachObjectARB(var7.field5424, var7.field5423[var10].field5258);
                                            }
                                            var0.glDeleteObjectARB(var7.field5424);
                                        }
                                    }
                                    int var11 = (int) var6.field1291;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field3985[var1++] = (int) var4.field1291;
                            field3975 -= var4.field2030;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field3985, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field3985[var1++] = (int) var3.field1291;
                    field3976 -= var3.field2030;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field3985, 0);
                        var1 = 0;
                    }
                }
            }
            field3985[var1++] = (int) var2.field1291;
            field3978 -= var2.field2030;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field3985, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V", line = 174)
    public static final synchronized void method1671(int arg0, int arg1, int arg2) {
        if (field3974 == arg2) {
            class111 var3 = new class111(arg1);
            var3.field1291 = (long) arg0;
            field3981.method437(var3, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(III)V", line = 183)
    public static final synchronized void method1672(int arg0, int arg1, int arg2) {
        if (field3974 == arg2) {
            class111 var3 = new class111(arg1);
            var3.field1291 = (long) arg0;
            field3979.method437(var3, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V", line = 195)
    public static final synchronized void method1673(int arg0, int arg1) {
        if (field3974 == arg1) {
            class111 var2 = new class111();
            var2.field1291 = (long) arg0;
            field3982.method437(var2, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 208)
    public static final synchronized void method1674() {
        field3974++;
        field3979.method440(-44);
        field3980.method440(-65);
        field3981.method440(-35);
        field3982.method440(-50);
        field3983.method440(-21);
        field3984.method440(-126);
        field3978 = 0;
        field3976 = 0;
        field3975 = 0;
    }
}
