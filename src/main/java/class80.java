import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class80 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "J")
    private static long field1182 = 0L;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field1184 = 0;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "La;")
    private static class281 field1181 = new class281();

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "La;")
    private static class281 field1187 = new class281();

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "La;")
    private static class281 field1188 = new class281();

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "La;")
    private static class281 field1189 = new class281();

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "La;")
    private static class281 field1190 = new class281();

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "La;")
    private static class281 field1191 = new class281();

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[I")
    private static int[] field1192 = new int[1000];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 4)
    public static final synchronized void method617() {
        field1183++;
        field1181.method1951(29532);
        field1187.method1951(29532);
        field1188.method1951(29532);
        field1189.method1951(29532);
        field1190.method1951(29532);
        field1191.method1951(29532);
        field1185 = 0;
        field1184 = 0;
        field1186 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V", line = 17)
    public static void method618() {
        field1181 = null;
        field1187 = null;
        field1188 = null;
        field1189 = null;
        field1190 = null;
        field1191 = null;
        field1192 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V", line = 26)
    public static final synchronized void method619(int arg0, int arg1, int arg2) {
        if (field1183 == arg2) {
            class293 var3 = new class293(arg1);
            var3.field69 = (long) arg0;
            field1187.method1952(var3, 39);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[Lsm;I)V", line = 36)
    public static final synchronized void method620(int arg0, class124[] arg1, int arg2) {
        if (field1183 == arg2) {
            field1190.method1952(new class253(arg0, arg1), -53);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 44)
    public static final synchronized void method621(int arg0, int arg1) {
        if (field1183 == arg1) {
            class293 var2 = new class293();
            var2.field69 = (long) arg0;
            field1191.method1952(var2, 118);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)V", line = 57)
    public static final synchronized void method622(int arg0, int arg1, int arg2) {
        if (field1183 == arg2) {
            class293 var3 = new class293(arg1);
            var3.field69 = (long) arg0;
            field1181.method1952(var3, 122);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V", line = 69)
    public static final synchronized void method623(int arg0, int arg1) {
        if (field1183 == arg1) {
            class293 var2 = new class293();
            var2.field69 = (long) arg0;
            field1189.method1952(var2, -93);
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "()V", line = 89)
    public static final synchronized void method624() {
        GL var0 = class73.field1051;
        int var1 = 0;
        while (true) {
            class293 var2 = (class293) field1181.method1944(118);
            if (var2 == null) {
                if (var1 > 0) {
                    var0.glDeleteBuffersARB(var1, field1192, 0);
                    var1 = 0;
                }
                while (true) {
                    class293 var3 = (class293) field1187.method1944(102);
                    if (var3 == null) {
                        while (true) {
                            class293 var4 = (class293) field1188.method1944(126);
                            if (var4 == null) {
                                if (var1 > 0) {
                                    var0.glDeleteTextures(var1, field1192, 0);
                                    boolean var5 = false;
                                }
                                while (true) {
                                    class293 var6 = (class293) field1189.method1944(123);
                                    if (var6 == null) {
                                        while (true) {
                                            class253 var7 = (class253) field1190.method1944(83);
                                            if (var7 == null) {
                                                while (true) {
                                                    class293 var8 = (class293) field1191.method1944(120);
                                                    if (var8 == null) {
                                                        if (field1185 + field1184 + field1186 > 100663296 && class105.method789((byte) 55) > field1182 + 60000L) {
                                                            System.gc();
                                                            field1182 = class105.method789((byte) 55);
                                                        }
                                                        return;
                                                    }
                                                    int var9 = (int) var8.field69;
                                                    var0.glDeleteObjectARB(var9);
                                                }
                                            }
                                            for (int var10 = 0; var10 < var7.field3809.length; var10++) {
                                                var0.glDetachObjectARB(var7.field3810, var7.field3809[var10].field1887);
                                            }
                                            var0.glDeleteObjectARB(var7.field3810);
                                        }
                                    }
                                    int var11 = (int) var6.field69;
                                    var0.glDeleteLists(var11, 1);
                                }
                            }
                            field1192[var1++] = (int) var4.field69;
                            field1186 -= var4.field4519;
                            if (var1 == 1000) {
                                var0.glDeleteTextures(var1, field1192, 0);
                                var1 = 0;
                            }
                        }
                    }
                    field1192[var1++] = (int) var3.field69;
                    field1184 -= var3.field4519;
                    if (var1 == 1000) {
                        var0.glDeleteTextures(var1, field1192, 0);
                        var1 = 0;
                    }
                }
            }
            field1192[var1++] = (int) var2.field69;
            field1185 -= var2.field4519;
            if (var1 == 1000) {
                var0.glDeleteBuffersARB(var1, field1192, 0);
                var1 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(III)V", line = 206)
    public static final synchronized void method625(int arg0, int arg1, int arg2) {
        if (field1183 == arg2) {
            class293 var3 = new class293(arg1);
            var3.field69 = (long) arg0;
            field1188.method1952(var3, -115);
        }
    }
}
