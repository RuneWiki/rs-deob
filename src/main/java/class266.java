import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class266 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "J")
    private static long field4191 = 0L;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field4193 = 0;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field4195 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field4192 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lan;")
    private static class337 field4194 = new class337();

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lan;")
    private static class337 field4197 = new class337();

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lan;")
    private static class337 field4198 = new class337();

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lan;")
    private static class337 field4199 = new class337();

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lan;")
    private static class337 field4200 = new class337();

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lan;")
    private static class337 field4201 = new class337();

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    private static int[] field4202 = new int[1000];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V", line = 5)
    public static final synchronized void method1927(int arg0, int arg1, int arg2) {
        if (field4192 == arg2) {
            class172 var3 = new class172(arg1);
            var3.field5065 = (long) arg0;
            field4198.method2325(var3, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V", line = 18)
    public static final synchronized void method1928(int arg0, int arg1, int arg2) {
        if (field4192 == arg2) {
            class172 var3 = new class172(arg1);
            var3.field5065 = (long) arg0;
            field4194.method2325(var3, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V", line = 28)
    public static final synchronized void method1929() {
        field4192++;
        field4194.method2333(3393);
        field4197.method2333(3393);
        field4198.method2333(3393);
        field4199.method2333(3393);
        field4200.method2333(3393);
        field4201.method2333(3393);
        field4193 = 0;
        field4195 = 0;
        field4196 = 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[Lae;I)V", line = 40)
    public static final synchronized void method1930(int arg0, class294[] arg1, int arg2) {
        if (field4192 == arg2) {
            field4200.method2325(new class126(arg0, arg1), (byte) 34);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()V", line = 49)
    public static final synchronized void method1931() {
        GL var0 = class250.field3818;
        int var1 = 0;
        while (true) {
            class172 var2 = (class172) field4194.method2323((byte) -88);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field4202, 0);
                    var1 = 0;
                }
                while (true) {
                    class172 var3 = (class172) field4197.method2323((byte) -55);
                    if (var3 == null) {
                        while (true) {
                            class172 var4 = (class172) field4198.method2323((byte) -104);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field4202, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class172 var6 = (class172) field4199.method2323((byte) -88);
                                    if (var6 == null) {
                                        while (true) {
                                            class126 var7 = (class126) field4200.method2323((byte) -110);
                                            if (var7 == null) {
                                                while (true) {
                                                    class172 var8 = (class172) field4201.method2323((byte) -23);
                                                    if (var8 == null) {
                                                        if (field4195 + field4193 + field4196 > 100663296 && class200.method1375(-16185) > field4191 + 60000L) {
                                                            System.gc();
                                                            field4191 = class200.method1375(-16185);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field5065;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field1734.length; var10++) {
                                                var0.glDetachObjectARB(var7.field1733, var7.field1734[var10].field4600);
                                            }
                                            var0.glDeleteObjectARB(var7.field1733);
                                        }
                                    }
                                    int var11 = (int) var6.field5065;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field4202[var1++] = (int) var4.field5065;
                            field4196 -= var4.field2483;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field4202, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field4202[var1++] = (int) var3.field5065;
                    field4195 -= var3.field2483;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field4202, 0);
                        var1 = 0;
                    }
                }
            }
            field4202[var1++] = (int) var2.field5065;
            field4193 -= var2.field2483;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field4202, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 173)
    public static final synchronized void method1932(int arg0, int arg1) {
        if (field4192 == arg1) {
            class172 var2 = new class172();
            var2.field5065 = (long) arg0;
            field4199.method2325(var2, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)V", line = 186)
    public static final synchronized void method1933(int arg0, int arg1) {
        if (field4192 == arg1) {
            class172 var2 = new class172();
            var2.field5065 = (long) arg0;
            field4201.method2325(var2, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()V", line = 200)
    public static void method1934() {
        field4194 = null;
        field4197 = null;
        field4198 = null;
        field4199 = null;
        field4200 = null;
        field4201 = null;
        field4202 = null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(III)V", line = 209)
    public static final synchronized void method1935(int arg0, int arg1, int arg2) {
        if (field4192 == arg2) {
            class172 var3 = new class172(arg1);
            var3.field5065 = (long) arg0;
            field4197.method2325(var3, (byte) 34);
        }
    }
}
