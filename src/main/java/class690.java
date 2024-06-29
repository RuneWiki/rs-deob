import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class690 {

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public int field9839;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    private int field9834;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "[J")
    public static long[] field9836 = new long[32];

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field9842 = 0;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "[I")
    public static int[] field9838;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
    public static final boolean method3899(byte arg0) {
        field9841++;
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class674.field9678.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class674.field9678.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            if (arg0 != -32) {
                method3899((byte) -45);
            }
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class674.field9678.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class540.field7845.get(var9);
                        Class var11 = (Class) class674.field9678.get(var9);
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
        class674.field9678 = var1;
        return class674.field9678.isEmpty();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method3900(byte arg0, byte[] arg1) {
        field9843++;
        class389 var2 = new class389(arg1);
        int var3 = var2.method2229(255);
        if (arg0 >= -61) {
            method3900((byte) 120, null);
        }
        int var4 = var2.method2255(255);
        if (var4 < 0 || class564.field8156 != 0 && class564.field8156 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2250(-1, var4, var5, 0);
            return var5;
        } else {
            int var6 = var2.method2255(255);
            if (var6 < 0 || class564.field8156 != 0 && class564.field8156 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class398.method2407(var7, var6, arg1, var4, 9);
            } else {
                class231 var8 = class158.field1927;
                synchronized (class158.field1927) {
                    class158.field1927.method1395(var2, 124, var7);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
    public static void method3901(byte arg0) {
        field9838 = null;
        if (arg0 > -51) {
            method3901((byte) -128);
        }
        field9836 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method3902(int arg0, byte[] arg1) {
        field9835++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class252.method1545(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(II)V")
    public class690(int arg0, int arg1) {
        this.field9839 = arg1;
        this.field9834 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9840++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
    public final int method3903(boolean arg0) {
        if (!arg0) {
            this.field9834 = -123;
        }
        field9837++;
        return this.field9834;
    }
}
