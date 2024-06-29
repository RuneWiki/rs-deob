import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class226 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field2786 = 127;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "Z")
    public boolean field2791 = true;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Z")
    public boolean field2789 = false;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public int field2790 = 1190717;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public int field2792 = -1;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public int field2799 = 0;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public int field2798 = 64;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public int field2795 = -1;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Z")
    public boolean field2802 = true;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public int field2801 = 512;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public int field2805 = 8;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Lsb;")
    public static class305 field2785 = new class305(16, 8);

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "Z")
    public static boolean field2806 = true;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "Ljea;")
    public static class231 field2800;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "Lfh;")
    public class268 field2793;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public final void method1358(byte arg0) {
        this.field2805 = this.field2805 << 8 | this.field2787;
        field2794++;
        if (arg0 > -28) {
            this.field2786 = 71;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILnp;I)V")
    private final void method1359(int arg0, class115 arg1, int arg2) {
        if (arg2 <= 102) {
            return;
        }
        field2804++;
        if (arg0 == 1) {
            this.field2799 = class298.method1738((byte) -95, arg1.method675(-128));
        } else if (arg0 == 2) {
            this.field2792 = arg1.method620((byte) -128);
        } else if (arg0 == 3) {
            this.field2792 = arg1.method643((byte) -77);
            if (this.field2792 == 65535) {
                this.field2792 = -1;
                return;
            }
            return;
        } else if (arg0 == 5) {
            this.field2791 = false;
            return;
        } else if (arg0 == 7) {
            this.field2795 = class298.method1738((byte) -47, arg1.method675(-125));
            return;
        } else if (arg0 == 8) {
            this.field2793.field3344 = this.field2787;
            return;
        } else if (arg0 == 9) {
            this.field2801 = arg1.method643((byte) -77) << 2;
            return;
        } else if (arg0 == 10) {
            this.field2802 = false;
            return;
        } else if (arg0 == 11) {
            this.field2805 = arg1.method620((byte) 61);
            return;
        } else if (arg0 == 12) {
            this.field2789 = true;
            return;
        } else if (arg0 == 13) {
            this.field2790 = arg1.method675(-125);
            return;
        } else if (arg0 == 14) {
            this.field2798 = arg1.method620((byte) -127) << 2;
            return;
        } else if (arg0 == 16) {
            this.field2786 = arg1.method620((byte) -128);
            return;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
    public static final void method1360(int arg0, int arg1) {
        field2803++;
        class76 var2 = class3.method28(3, (byte) 42, arg1);
        var2.method406(-975503968);
        int var3 = -4 / ((arg0 - 41) / 62);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILnp;)V")
    public final void method1361(int arg0, class115 arg1) {
        field2797++;
        while (true) {
            int var3 = arg1.method620((byte) 6);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.method1359(-7, null, -72);
                    return;
                }
            }
            this.method1359(var3, arg1, arg0 ^ 0x68);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        field2800 = null;
        field2785 = null;
        int var1 = 51 % ((arg0 + 33) / 60);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z")
    public static final boolean method1363(int arg0) {
        field2796++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class166.field1867.keys();
        if (arg0 != 64) {
            method1362((byte) -60);
        }
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class166.field1867.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class166.field1867.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class673.field9364.get(var9);
                        Class var11 = (Class) class166.field1867.get(var9);
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
        class166.field1867 = var1;
        return class166.field1867.isEmpty();
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(FB)F")
    public static final float method1364(float arg0, byte arg1) {
        if (arg1 <= 69) {
            field2785 = null;
        }
        field2788++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }
}
