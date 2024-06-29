import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class262 {

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lns;")
    private class406 field3436;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    private int field3416;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    private int field3435;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lwr;")
    private class459 field3427;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lfha;")
    public static class382 field3428 = new class382(8, 4);

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
    public static boolean field3431 = false;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
    public static int[] field3432 = new int[1000];

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
    public static int[] field3434 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field3438;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field3439;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
    public final int method1562(int arg0) {
        if (arg0 <= 6) {
            field3432 = null;
        }
        field3421++;
        return this.field3416;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method1563(int arg0) {
        this.field3436.method2342(16711680);
        field3418++;
        this.field3427.method2556(-99);
        if (arg0 <= 0) {
            this.method1565(null, 41);
        }
        this.field3435 = this.field3416;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method1564(int arg0, Class arg1, String arg2) {
        field3424++;
        int var3 = -53 / ((arg0 + 65) / 50);
        Class var4 = (Class) class289.field3833.get(arg2);
        if (var4 != null) {
            return var4.getClassLoader() == arg1.getClassLoader();
        }
        File var5 = null;
        if (var5 == null) {
            var5 = (File) class6.field45.get(arg2);
        }
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class289.field3833.put(arg2, arg1);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class289.field3833.put(arg2, field3439 == null ? (field3439 = method1578("l")) : field3439);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lbda;I)V")
    private final void method1565(class506 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method315(56);
            arg0.method2287((byte) -90);
            this.field3435 += arg0.field6857;
        }
        field3426++;
        if (arg1 != 7) {
            this.field3416 = 122;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I")
    public final int method1566(int arg0) {
        field3422++;
        int var2 = 0;
        if (arg0 > -117) {
            this.method1568(33);
        }
        for (class506 var3 = (class506) this.field3436.method2348(-1); var3 != null; var3 = (class506) this.field3436.method2343(0)) {
            if (!var3.method626(127)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method1567(byte arg0) {
        field3428 = null;
        field3434 = null;
        field3432 = null;
        if (arg0 != 22) {
            method1570((byte) -119, -90, 83, 33);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
    public final int method1568(int arg0) {
        field3425++;
        if (arg0 != 1551398789) {
            field3434 = null;
        }
        return this.field3435;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
    public class262(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
    public final void method1569(byte arg0, int arg1) {
        if (class719.field10065 != null) {
            for (class506 var3 = (class506) this.field3436.method2348(-1); var3 != null; var3 = (class506) this.field3436.method2343(0)) {
                if (var3.method626(124)) {
                    if (var3.method622(true) == null) {
                        var3.method315(98);
                        var3.method2287((byte) -90);
                        this.field3435 += var3.field6857;
                    }
                } else if ((long) arg1 < ++var3.field5550) {
                    class506 var4 = class719.field10065.method1910(0, var3);
                    this.field3427.method2558(var4, var3.field556, -1);
                    class278.method1655(var3, (byte) 37, var4);
                    var3.method315(arg0 + 43);
                    var3.method2287((byte) -90);
                }
            }
        }
        if (arg0 != 62) {
            this.field3435 = -25;
        }
        field3420++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIII)I")
    public static final int method1570(byte arg0, int arg1, int arg2, int arg3) {
        field3419++;
        if (arg0 != -11) {
            return 96;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        return ((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method1571(int arg0, long arg1) {
        field3437++;
        if (arg0 > -118) {
            this.field3427 = null;
        }
        class506 var4 = (class506) this.field3427.method2552(arg1, -1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method622(true);
        if (var5 == null) {
            var4.method315(100);
            var4.method2287((byte) -90);
            this.field3435 += var4.field6857;
            return null;
        }
        if (var4.method626(119)) {
            class86 var6 = new class86(var5, var4.field6857);
            this.field3427.method2558(var6, var4.field556, -1);
            this.field3436.method2341(var6, -55);
            var6.field5550 = 0L;
            var4.method315(123);
            var4.method2287((byte) -90);
        } else {
            this.field3436.method2341(var4, -50);
            var4.field5550 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1572(boolean arg0) {
        field3415++;
        if (arg0) {
            this.field3435 = -74;
        }
        class506 var2 = (class506) this.field3427.method2560(116);
        while (var2 != null) {
            Object var3 = var2.method622(true);
            if (var3 != null) {
                return var3;
            }
            class506 var4 = var2;
            var2 = (class506) this.field3427.method2557(-1);
            var4.method315(73);
            var4.method2287((byte) -90);
            this.field3435 += var4.field6857;
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1573(boolean arg0) {
        field3423++;
        class506 var2 = (class506) this.field3427.method2557(-1);
        if (arg0) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method622(true);
            if (var3 != null) {
                return var3;
            }
            class506 var4 = var2;
            var2 = (class506) this.field3427.method2557(-1);
            var4.method315(74);
            var4.method2287((byte) -90);
            this.field3435 += var4.field6857;
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JLjava/lang/Object;B)V")
    public final void method1574(long arg0, Object arg1, byte arg2) {
        this.method1576(13436, arg0, 1, arg1);
        if (arg2 == -80) {
            field3433++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public final void method1575(byte arg0) {
        int var2 = -40 / ((arg0 + 35) / 43);
        for (class506 var3 = (class506) this.field3436.method2348(-1); var3 != null; var3 = (class506) this.field3436.method2343(0)) {
            if (var3.method626(122)) {
                var3.method315(55);
                var3.method2287((byte) -90);
                this.field3435 += var3.field6857;
            }
        }
        field3417++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IJILjava/lang/Object;)V")
    public final void method1576(int arg0, long arg1, int arg2, Object arg3) {
        field3430++;
        if (arg2 > this.field3416) {
            throw new IllegalStateException("s>cs");
        }
        this.method1577(arg1, arg0 + 67095427);
        this.field3435 -= arg2;
        while (this.field3435 < 0) {
            class506 var7 = (class506) this.field3436.method2345(arg0 ^ 0xFF00CB7C);
            this.method1565(var7, arg0 ^ 0x347B);
        }
        class86 var6 = new class86(arg3, arg2);
        this.field3427.method2558(var6, arg1, -1);
        if (arg0 != 13436) {
            this.method1576(-1, 58L, 23, null);
        }
        this.field3436.method2341(var6, -28);
        var6.field5550 = 0L;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
    private final void method1577(long arg0, int arg1) {
        if (arg1 != 67108863) {
            this.method1563(-39);
        }
        field3438++;
        class506 var4 = (class506) this.field3427.method2552(arg0, -1);
        this.method1565(var4, 7);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
    public class262(int arg0, int arg1) {
        this.field3436 = new class406();
        this.field3416 = arg0;
        this.field3435 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field3427 = new class459(var3);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1578(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
