import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class126 extends class279 {

    @OriginalMember(owner = "client!baa", name = "w", descriptor = "Z")
    private boolean field1954 = false;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "Z")
    public static boolean field1952 = false;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!baa", name = "v", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!baa", name = "x", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lpj;)V", line = 5)
    public class126(class38 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BILpe;)V", line = 10)
    public static final void method970(byte arg0, int arg1, class109 arg2) {
        ++field1949;
        if (arg2.field1591 != null) {
            int var3 = arg2.field1591[arg1 + 1];
            if (~arg2.field1695 != ~var3) {
                arg2.field1626 = 0;
                arg2.field1624 = 0;
                arg2.field1600 = 0;
                arg2.field1707 = arg2.field1706;
                arg2.field1611 = 1;
                arg2.field1695 = var3;
                if (arg2.field1695 != -1) {
                    class262.method1747(arg2, arg2.field1626, class83.field1219.method2358((byte) 74, arg2.field1695), -26868);
                }
            }
        }
        if (arg0 >= -62) {
            method970((byte) -66, 49, (class109) null);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)Z", line = 39)
    public final boolean method438(byte arg0) {
        if (arg0 >= -32) {
            this.field1954 = false;
        }
        ++field1948;
        return true;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZI)V", line = 50)
    public final void method435(boolean arg0, int arg1) {
        if (arg1 != 2048) {
            field1952 = true;
        }
        ++field1945;
        class295 var3 = super.field4267.method389(117);
        if (var3 != null && arg0) {
            super.field4267.method411(1, (byte) -100);
            super.field4267.method215(arg1 + -2040, var3);
            super.field4267.method333(true, class544.field7759);
            super.field4267.method411(1, (byte) -118);
            super.field4267.method365(class107.field1555, class750.field10454, (byte) -122);
            super.field4267.method338(2, class493.field7145, false, true, 31181);
            super.field4267.method227(0, class580.field8210, 70);
            class341 var4 = super.field4267.method269(1);
            var4.method2188((byte) -90, super.field4267.method247(arg1 + -22067));
            super.field4267.method342((byte) -125, class127.field1976);
            super.field4267.method411(0, (byte) -95);
            this.field1954 = true;
        } else {
            super.field4267.method227(0, class580.field8210, 70);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IZLiu;)V", line = 82)
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        super.field4267.method215(8, arg2);
        if (!arg1) {
            ++field1944;
            super.field4267.method405(arg0, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)Z", line = 94)
    public static final boolean method971(byte arg0) {
        if (arg0 != 0) {
            field1952 = true;
        }
        ++field1946;
        return ~class442.field6421 != -1 ? true : class208.field3480.method2311(-10936);
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(B)Z", line = 110)
    public static final boolean method972(byte arg0) {
        ++field1955;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class679.field9565.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class679.field9565.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            if (arg0 != -27) {
                return false;
            }
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class679.field9565.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class602.field8515.get(var9);
                        Class var11 = (Class) class679.field9565.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; var12.size() > var13; ++var13) {
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
                                            var17.set(var14, new Integer(0));
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
        class679.field9565 = var1;
        return class679.field9565.isEmpty();
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BZ)V", line = 212)
    public final void method441(byte arg0, boolean arg1) {
        if (arg0 != 9) {
            this.field1954 = false;
        }
        super.field4267.method365(class333.field4884, class750.field10454, (byte) -122);
        ++field1947;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)V", line = 227)
    public final void method442(boolean arg0) {
        ++field1951;
        if (arg0) {
            method973(113, 33, 118, 92, 122, 47);
        }
        if (!this.field1954) {
            super.field4267.method227(0, class388.field5817, 70);
        } else {
            super.field4267.method411(1, (byte) -100);
            super.field4267.method333(!arg0, class465.field6786);
            super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
            super.field4267.method321(class327.field4819, 2, (byte) -95);
            super.field4267.method227(0, class388.field5817, 70);
            super.field4267.method250(-84);
            super.field4267.method215(8, (class506) null);
            super.field4267.method411(0, (byte) -83);
            this.field1954 = false;
        }
        super.field4267.method365(class333.field4884, class333.field4884, (byte) -122);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIII)V", line = 254)
    public static final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1953;
        if (arg1 > -65) {
            field1952 = false;
        }
        if (arg0 == arg3) {
            class574.method3334(arg2, arg3, arg5, arg4, (byte) 70);
        } else if (~(-arg3 + arg2) <= ~class184.field3102 && ~(arg2 - -arg3) >= ~class657.field9347 && class76.field1126 <= -arg0 + arg4 && class461.field6699 >= arg0 + arg4) {
            class341.method2198(-14524, arg4, arg0, arg5, arg3, arg2);
        } else {
            class73.method661(arg3, (byte) -107, arg5, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V", line = 277)
    public final void method443(int arg0, int arg1, int arg2) {
        ++field1950;
        if (arg1 != 0) {
            this.method438((byte) -64);
        }
    }
}
