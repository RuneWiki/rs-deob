import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class272 extends class479 {

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "Lfc;")
    public static class235 field3834 = new class235(38, 4);

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3836 = new String[100];

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "Lfc;")
    public static class235 field3837 = new class235(3, 3);

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[ILen;IZB)Lan;")
    public static final class22 method1636(int arg0, int[] arg1, class289 arg2, int arg3, boolean arg4, byte arg5) {
        field3835++;
        if (arg5 < 36) {
            field3836 = null;
        }
        if (!arg2.field4292 && (!class17.method89(arg3, 508337774) || !class17.method89(arg0, 508337774))) {
            return arg2.field4335 ? new class22(arg2, 34037, arg3, arg0, arg4, arg1) : new class22(arg2, arg3, arg0, class350.method2082(127, arg3), class350.method2082(126, arg0), arg1);
        } else {
            return new class22(arg2, 3553, arg3, arg0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method1637(boolean arg0) {
        field3834 = null;
        field3836 = null;
        field3837 = null;
        if (arg0) {
            method1636(0, null, null, 6, true, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Lhs;")
    public final class295 method52(int arg0) {
        if (arg0 == -14151) {
            field3832++;
            return class270.field3827;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)Z")
    public static final boolean method1638(int arg0) {
        field3833++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class674.field9492.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class674.field9492.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            int var5 = -115 % ((-arg0 - 13) / 47);
            Class var6 = Class.forName("java.lang.ClassLoader");
            Field var7 = var6.getDeclaredField("nativeLibraries");
            Method var8 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var8.invoke(var7, Boolean.TRUE);
            try {
                Enumeration var9 = class674.field9492.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class210.field3095.get(var10);
                        Class var12 = (Class) class674.field9492.get(var10);
                        Vector var13 = (Vector) var7.get(var12.getClassLoader());
                        for (int var14 = 0; var13.size() > var14; var14++) {
                            try {
                                Object var15 = var13.elementAt(var14);
                                Field var16 = var15.getClass().getDeclaredField("name");
                                var8.invoke(var16, Boolean.TRUE);
                                try {
                                    String var17 = (String) var16.get(var15);
                                    if (var17 != null && var17.equalsIgnoreCase(var11.getCanonicalPath())) {
                                        Field var18 = var15.getClass().getDeclaredField("handle");
                                        Method var19 = var15.getClass().getDeclaredMethod("finalize");
                                        var8.invoke(var18, Boolean.TRUE);
                                        var8.invoke(var19, Boolean.TRUE);
                                        try {
                                            var19.invoke(var15);
                                            var18.set(var15, Integer.valueOf(0));
                                            var1.remove(var10);
                                        } catch (Throwable var20) {
                                        }
                                        var8.invoke(var19, Boolean.FALSE);
                                        var8.invoke(var18, Boolean.FALSE);
                                    }
                                } catch (Throwable var21) {
                                }
                                var8.invoke(var16, Boolean.FALSE);
                            } catch (Throwable var22) {
                            }
                        }
                    } catch (Throwable var23) {
                    }
                }
            } catch (Throwable var24) {
            }
            var8.invoke(var7, Boolean.FALSE);
        } catch (Throwable var25) {
        }
        class674.field9492 = var1;
        return class674.field9492.isEmpty();
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(ILfw;Ldg;III)V")
    public class272(int arg0, class52 arg1, class377 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3831 = arg5;
    }
}
