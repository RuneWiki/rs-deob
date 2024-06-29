import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class507 {

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "Ltca;")
    private class184 field7109 = new class184(256);

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "Ltca;")
    private class184 field7113 = new class184(256);

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Luq;")
    private class172 field7103;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "Luq;")
    private class172 field7110;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field7106 = 0;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "([IBI)Lpv;")
    public final class78 method2946(int[] arg0, byte arg1, int arg2) {
        field7108++;
        if (this.field7103.method1193(true) == 1) {
            return this.method2949(arg0, 0, true, arg2);
        } else if (arg1 != -91) {
            return null;
        } else if (this.field7103.method1175(arg2, (byte) 88) == 1) {
            return this.method2949(arg0, arg2, true, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[IB)Lpv;")
    public final class78 method2947(int arg0, int[] arg1, byte arg2) {
        if (arg2 < 82) {
            this.method2946(null, (byte) 98, 23);
        }
        field7112++;
        if (this.field7110.method1193(true) == 1) {
            return this.method2951(arg0, arg1, 0, 121);
        } else if (this.field7110.method1175(arg0, (byte) 114) == 1) {
            return this.method2951(0, arg1, arg0, 108);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)V")
    public static final void method2948(int arg0, int arg1, int arg2, int arg3) {
        field7104++;
        class778 var4 = class389.method2406(arg0 ^ 0x7C, (long) arg2, 9);
        var4.method4274(124);
        var4.field10690 = arg1;
        if (arg0 == 0) {
            var4.field10692 = arg3;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "([IIZI)Lpv;")
    private final class78 method2949(int[] arg0, int arg1, boolean arg2, int arg3) {
        field7101++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFF9 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class78 var9 = (class78) this.field7113.method1248(118, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class590 var10 = (class590) this.field7109.method1248(90, var7);
            if (var10 == null) {
                var10 = class590.method3313(this.field7103, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field7109.method1247(4070, var7, var10);
            }
            class78 var11 = var10.method3315(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1102((byte) 93);
                this.field7113.method1247(4070, var7, var11);
                return arg2 ? var11 : null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Z")
    public static final boolean method2950(int arg0) {
        field7111++;
        Hashtable var1 = new Hashtable();
        if (arg0 != 0) {
            return false;
        }
        Enumeration var2 = class10.field111.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class10.field111.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class10.field111.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class732.field9911.get(var9);
                        Class var11 = (Class) class10.field111.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var13 < var12.size(); var13++) {
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
        class10.field111 = var1;
        return class10.field111.isEmpty();
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[III)Lpv;")
    private final class78 method2951(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg3 <= 104) {
            this.field7113 = null;
        }
        field7105++;
        int var5 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF5);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class78 var9 = (class78) this.field7113.method1248(106, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class633 var10 = class633.method3490(this.field7110, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class78 var11 = var10.method3492();
            this.field7113.method1247(4070, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field1084.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Luq;Luq;)V")
    public class507(class172 arg0, class172 arg1) {
        this.field7103 = arg1;
        this.field7110 = arg0;
    }
}
