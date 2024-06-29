import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class86 {

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "Lmia;")
    public static class63 field1223 = new class63(59, 3);

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "Llq;")
    public class554 field1230;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "[I")
    public int[] field1225;

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "[[Lsca;")
    public static class46[][] field1229;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BII)I", line = 4)
    public static final int method699(byte arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 >= -100) {
            return -35;
        }
        field1224++;
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method700(int arg0, int arg1, int arg2) {
        if (arg0 <= 101) {
            field1223 = null;
        }
        field1228++;
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)Z", line = 49)
    public static final boolean method701(byte arg0) {
        field1226++;
        if (arg0 != 124) {
            method702(0.57159466F, (byte) 9);
        }
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class188.field2855.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class188.field2855.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class188.field2855.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class445.field6614.get(var9);
                        Class var11 = (Class) class188.field2855.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; var13++) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, Integer.valueOf(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class188.field2855 = var1;
        return class188.field2855.isEmpty();
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(FB)F", line = 152)
    public static final float method702(float arg0, byte arg1) {
        field1221++;
        if (arg1 >= -112) {
            method701((byte) -17);
        }
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLsca;Lha;)V", line = 163)
    public static final void method703(byte arg0, class46 arg1, class60 arg2) {
        field1222++;
        if (arg0 != 13) {
            method701((byte) 108);
        }
        boolean var3 = class336.field4876.method2085(arg2, arg1.field683, arg1.field687, 69, arg1.field537, arg1.field628 | 0xFF000000, arg1.field562, arg1.field534 ? class130.field1749.field9495 : null) == null;
        if (var3) {
            class569.field8064.method1203(new class252(arg1.field687, arg1.field562, arg1.field683, arg1.field628 | 0xFF000000, arg1.field537, arg1.field534), (byte) 80);
            class673.method3850(arg1, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)V", line = 182)
    public static void method704(byte arg0) {
        field1229 = null;
        if (arg0 == 112) {
            field1223 = null;
        }
    }
}
