import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class204 {

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Lpa;")
    private class387 field2984 = new class387(64);

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lpa;")
    public class387 field2998 = new class387(50);

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lpa;")
    public class387 field3000 = new class387(5);

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Liv;")
    public class106 field2985;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Z")
    public boolean field2991;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lcb;")
    public class544 field2981;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lcb;")
    private class544 field2989;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lpa;")
    public static class387 field2986 = new class387(5);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
    public static boolean field2996 = false;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lpa;")
    public static class387 field2988 = new class387(8);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public int field3001;

    // $FF: synthetic field
    @OriginalMember(owner = "client!me", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field3002;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public final void method1457(int arg0, int arg1) {
        this.field3001 = arg1;
        field2978++;
        class387 var3 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method2364(1);
        }
        class387 var4 = this.field3000;
        synchronized (this.field3000) {
            this.field3000.method2364(1);
        }
        if (arg0 != -1010) {
            this.method1466((byte) 7, 50);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static final void method1458(byte arg0) {
        field2993++;
        if (class757.field10456 == 7) {
            class599.method3460(true, false);
            return;
        }
        class435.field6187 = class76.field1025;
        if (arg0 == -80) {
            class76.field1025 = null;
            class374.method2323(13, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
    public final void method1459(int arg0, int arg1) {
        class387 var3 = this.field2984;
        synchronized (this.field2984) {
            this.field2984.method2366(arg1, 108);
            if (arg0 != 50) {
                this.method1457(-50, 62);
            }
        }
        field2995++;
        class387 var4 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method2366(arg1, 119);
        }
        class387 var5 = this.field3000;
        synchronized (this.field3000) {
            this.field3000.method2366(arg1, arg0 ^ 0x5F);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lpb;I)Z")
    public static final boolean method1460(class680 arg0, int arg1) {
        if (arg1 >= -103) {
            return true;
        } else {
            field2979++;
            return class90.field1161 == arg0 || class180.field2730 == arg0 || class492.field6986 == arg0 || class653.field9214 == arg0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public final void method1461(int arg0) {
        class387 var2 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method2364(arg0);
        }
        field2983++;
        class387 var3 = this.field3000;
        synchronized (this.field3000) {
            this.field3000.method2364(arg0);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public final void method1462(boolean arg0) {
        field2987++;
        class387 var2 = this.field2984;
        synchronized (this.field2984) {
            this.field2984.method2364(1);
        }
        class387 var3 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method2364(1);
        }
        class387 var4 = this.field3000;
        synchronized (this.field3000) {
            if (!arg0) {
                this.field2991 = false;
            }
            this.field3000.method2364(1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z")
    public static final boolean method1463(String arg0, int arg1, Class arg2) {
        if (arg1 <= 80) {
            method1467(41);
        }
        field2990++;
        Class var3 = (Class) class219.field3121.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg2.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class45.field658.get(arg0);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg2, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class219.field3121.put(arg0, arg2);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class219.field3121.put(arg0, field3002 == null ? (field3002 = method1470("jia")) : field3002);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method1464(int arg0) {
        if (arg0 != 5) {
            return;
        }
        field2999++;
        class387 var2 = this.field2984;
        synchronized (this.field2984) {
            this.field2984.method2369(-1);
        }
        class387 var3 = this.field2998;
        synchronized (this.field2998) {
            this.field2998.method2369(-1);
        }
        class387 var4 = this.field3000;
        synchronized (this.field3000) {
            this.field3000.method2369(-1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
    public final void method1465(int arg0, boolean arg1) {
        field2982++;
        if (this.field2991 == arg1) {
            return;
        }
        this.field2991 = arg1;
        this.method1462(true);
        if (arg0 != -1010) {
            this.method1457(39, 23);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI)Lrn;")
    public final class279 method1466(byte arg0, int arg1) {
        field2994++;
        class387 var3 = this.field2984;
        class279 var4;
        synchronized (this.field2984) {
            var4 = (class279) this.field2984.method2373((long) arg1, 103);
        }
        if (var4 != null) {
            return var4;
        }
        class544 var5 = this.field2989;
        byte[] var6;
        synchronized (this.field2989) {
            var6 = this.field2989.method3150(class503.method2935(arg1, -127), 101, class698.method3942(arg1, -1054069881));
        }
        int var7 = 84 % ((-arg0 - 64) / 33);
        class279 var8 = new class279();
        var8.field3939 = this;
        var8.field3916 = arg1;
        if (var6 != null) {
            var8.method1813(-121, new class120(var6));
        }
        var8.method1812((byte) -119);
        class387 var9 = this.field2984;
        synchronized (this.field2984) {
            this.field2984.method2362(var8, 0, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method1467(int arg0) {
        field2988 = null;
        field2986 = null;
        if (arg0 != 50) {
            method1467(6);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Z")
    public static final boolean method1468(byte arg0) {
        int var1 = 54 / ((arg0 - 10) / 52);
        field2997++;
        if (class324.field4852 == null) {
            return false;
        } else {
            if (class324.field4852.field4640 >= 2000) {
                class324.field4852.field4640 -= 2000;
            }
            return class324.field4852.field4640 == 1009;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)Ldd;")
    public static final class731 method1469(int arg0, int arg1, int arg2, int arg3) {
        field2980++;
        class731 var4 = null;
        if (arg1 == arg2) {
            class258.field3628++;
            var4 = class155.method1222(260, class420.field5906, class237.field3417);
        }
        if (arg1 == 1) {
            class213.field3076++;
            var4 = class155.method1222(arg2 ^ 0x104, class328.field4909, class237.field3417);
        }
        var4.field10211.method840(class311.field4630.method2733(126, 82) ? 1 : 0, (byte) 106);
        var4.field10211.method832(-107, arg0 + class103.field1295);
        var4.field10211.method832(arg2 ^ 0xFFFFFF97, class175.field2496 + arg3);
        class334.field4981 = false;
        class336.field4995 = arg3;
        class697.field9843 = arg0;
        class777.method4274(false);
        return var4;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Liv;IZLcb;Lcb;)V")
    public class204(class106 arg0, int arg1, boolean arg2, class544 arg3, class544 arg4) {
        this.field2985 = arg0;
        this.field2991 = arg2;
        this.field2981 = arg4;
        this.field2989 = arg3;
        if (this.field2989 != null) {
            int var6 = this.field2989.method3136(false) - 1;
            this.field2989.method3147(var6, 38);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1470(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
