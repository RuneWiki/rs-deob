import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class179 extends class259 {

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "Z")
    public volatile boolean field2683 = true;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2686 = "Loading title screen - ";

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field2690 = -1;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "Lmh;")
    public static class154 field2685;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Lcd;")
    public static class78 field2684;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "Z")
    public boolean field2688;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Z")
    public boolean field2691;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIIIZZLtb;BI)Lpa;", line = 13)
    public static final class2 method1234(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, class246 arg6, byte arg7, int arg8) {
        field2682++;
        class309 var9 = class190.method1302(arg1, (byte) 73);
        if (arg3 > 1 && var9.field4797 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field4813[var11] <= arg3 && var9.field4813[var11] != 0) {
                    var10 = var9.field4797[var11];
                }
            }
            if (var10 != -1) {
                var9 = class190.method1302(var10, (byte) 30);
            }
        }
        if (arg7 != 23) {
            field2685 = (class154) null;
        }
        class133 var12 = var9.method2183(arg6, false);
        if (var12 == null) {
            return null;
        }
        class158 var13 = null;
        if (var9.field4860 != -1) {
            var13 = (class158) method1234(false, var9.field4846, 0, 10, true, true, arg6, (byte) 23, 1);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field4840 != -1) {
            var13 = (class158) method1234(false, var9.field4835, arg2, arg3, false, true, arg6, (byte) 23, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class343.field5439;
        int var15 = class343.field5437;
        int var16 = class343.field5438;
        int[] var17 = new int[4];
        class343.method2366(var17);
        class158 var18 = new class158(36, 32);
        class343.method2355(var18.field2455, 36, 32);
        class104.method671();
        class104.method670(16, 16);
        int var19 = var9.field4836;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg8 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class104.field1428 = false;
        int var20 = class104.field1426[var9.field4866] * var19 >> 16;
        int var21 = class104.field1435[var9.field4866] * var19 >> 16;
        var12.method853(0, var9.field4822, var9.field4790, var9.field4866, var9.field4802, var20 + var9.field4815 - (var12.method417() / 2), var9.field4815 + var21, -1L);
        if (arg8 >= 1) {
            var18.method1154(1);
            if (arg8 >= 2) {
                var18.method1154(16777215);
            }
            class343.method2355(var18.field2455, 36, 32);
        }
        if (arg2 != 0) {
            var18.method1155(arg2);
        }
        if (var9.field4860 != -1) {
            var13.method11(0, 0);
        } else if (var9.field4840 != -1) {
            class343.method2355(var13.field2455, 36, 32);
            var18.method11(0, 0);
            var18 = var13;
        }
        if (arg0 && (var9.field4814 == 1 || arg3 != 1) && arg3 != -1) {
            class266.field4196.method1685(class307.method2163(65, arg3), 0, 9, 16776960, 1);
        }
        class343.method2355(var14, var15, var16);
        class343.method2373(var17);
        class104.method671();
        class104.field1428 = true;
        return class272.field4317 && !arg5 ? new class200(var18) : var18;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V", line = 152)
    public static final void method1236(int arg0) {
        if (arg0 != 6063) {
            field2685 = (class154) null;
        }
        if (class110.field1507 != -1) {
            class349.method2419(false, class110.field1507, (byte) 32, -1, -1);
            class110.field1507 = -1;
        }
        field2692++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLrj;Llf;I)V", line = 171)
    public static final void method1237(boolean arg0, class22 arg1, class143 arg2, int arg3) {
        field2689++;
        class27 var4 = new class27();
        var4.field314 = arg2.method1043(true);
        var4.field322 = arg2.method1057(-108);
        var4.field315 = new int[var4.field314];
        var4.field324 = new byte[var4.field314][][];
        var4.field313 = new int[var4.field314];
        var4.field325 = new int[var4.field314];
        var4.field320 = new class153[var4.field314];
        var4.field311 = new class153[var4.field314];
        for (int var5 = 0; var5 < var4.field314; var5++) {
            try {
                int var6 = arg2.method1043(!arg0);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1040((byte) -127);
                    String var8 = arg2.method1040((byte) -128);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1057(-113);
                    }
                    var4.field325[var5] = var6;
                    var4.field313[var5] = var9;
                    var4.field311[var5] = arg1.method159((byte) 63, var8, class30.method216(var7, 2859));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1040((byte) -127);
                    String var11 = arg2.method1040((byte) -128);
                    int var12 = arg2.method1043(!arg0);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1040((byte) -128);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1057(-124);
                            var15[var16] = new byte[var17];
                            arg2.method1020(var17, var15[var16], (byte) 67, 0);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field325[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class30.method216(var13[var19], 2859);
                    }
                    var4.field320[var5] = arg1.method171(var11, class30.method216(var10, 2859), var18, 113);
                    var4.field324[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field315[var5] = -1;
            } catch (SecurityException var26) {
                var4.field315[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field315[var5] = -3;
            } catch (Exception var28) {
                var4.field315[var5] = -4;
            } catch (Throwable var29) {
                var4.field315[var5] = -5;
            }
        }
        if (arg0) {
            method1234(true, 94, -40, -78, false, false, (class246) null, (byte) 6, -9);
        }
        class307.field4774.method1814(var4, true);
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V", line = 285)
    public static void method1239(int arg0) {
        field2684 = null;
        field2686 = null;
        field2685 = null;
        if (arg0 != 1) {
            field2686 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)I")
    public abstract int method1235(boolean arg0);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)[B")
    public abstract byte[] method1238(byte arg0);
}
