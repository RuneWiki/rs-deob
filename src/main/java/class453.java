import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class453 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public int field6191 = -1;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lfp;")
    public class344 field6189;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Z")
    public static boolean field6186;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[I")
    public int[] field6187;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[J")
    public long[] field6194;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field6195;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILij;ZI)V")
    public static final void method2618(int arg0, int arg1, class445 arg2, boolean arg3, int arg4) {
        field6190++;
        for (class570 var5 = (class570) class503.field6872.method3589((byte) -128); var5 != null; var5 = (class570) class503.field6872.method3591(0)) {
            if (var5.field8113 == arg1 && arg0 << 9 == var5.field8112 && arg4 << 9 == var5.field8131 && var5.field8121.field6104 == arg2.field6104) {
                if (var5.field8114 != null) {
                    class456.field6213.method352(var5.field8114);
                    var5.field8114 = null;
                }
                if (var5.field8119 != null) {
                    class456.field6213.method352(var5.field8119);
                    var5.field8119 = null;
                }
                var5.method1207(105);
                return;
            }
        }
        if (arg3) {
            field6186 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Z")
    public static final boolean method2619(int arg0, int arg1) {
        field6184++;
        if (arg1 == 53 || arg1 == 59 || arg1 == 12 || arg1 == 21 || arg1 == 1010) {
            return true;
        } else if (arg1 == 49 || arg1 == 1007) {
            return true;
        } else {
            if (arg0 < 69) {
                field6186 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
    public static final boolean method2620(int arg0) {
        field6188++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class37.field627.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class37.field627.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            if (arg0 != -13) {
                return true;
            }
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class37.field627.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class488.field6591.get(var9);
                        Class var11 = (Class) class37.field627.get(var9);
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
        class37.field627 = var1;
        return class37.field627.isEmpty();
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
    public static final boolean method2621(int arg0) {
        if (arg0 < 114) {
            return false;
        } else {
            field6193++;
            return class469.field6348 != 0;
        }
    }
}
