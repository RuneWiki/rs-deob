import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class28 {

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "Lau;")
    private class692 field494 = new class692(16);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lmv;")
    private class295 field484;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "Lvg;")
    public static class622 field489 = new class622(104, -2);

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Lfa;")
    public static class615 field492;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field493;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 6)
    public final void method178(boolean arg0) {
        class692 var2 = this.field494;
        synchronized (this.field494) {
            this.field494.method3891(13747);
            if (arg0) {
                field489 = null;
            }
        }
        field485++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 21)
    public final void method179(byte arg0) {
        field491++;
        class692 var2 = this.field494;
        synchronized (this.field494) {
            this.field494.method3890(-1);
        }
        int var3 = -93 % ((62 - arg0) / 34);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z", line = 35)
    public static final boolean method180(byte arg0) {
        int var1 = -59 / ((arg0 - 68) / 34);
        field486++;
        Hashtable var2 = new Hashtable();
        Enumeration var3 = class145.field2084.keys();
        while (var3.hasMoreElements()) {
            Object var4 = var3.nextElement();
            var2.put(var4, class145.field2084.get(var4));
        }
        try {
            Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var6 = Class.forName("java.lang.ClassLoader");
            Field var7 = var6.getDeclaredField("nativeLibraries");
            Method var8 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var8.invoke(var7, Boolean.TRUE);
            try {
                Enumeration var9 = class145.field2084.keys();
                while (var9.hasMoreElements()) {
                    String var10 = (String) var9.nextElement();
                    try {
                        File var11 = (File) class285.field3798.get(var10);
                        Class var12 = (Class) class145.field2084.get(var10);
                        Vector var13 = (Vector) var7.get(var12.getClassLoader());
                        for (int var14 = 0; var14 < var13.size(); var14++) {
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
                                            var2.remove(var10);
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
        class145.field2084 = var2;
        return class145.field2084.isEmpty();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 133)
    public static void method181(int arg0) {
        field489 = null;
        field492 = null;
        if (arg0 != 0) {
            method180((byte) 27);
        }
        field493 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lbf;", line = 146)
    public final class676 method182(int arg0, int arg1) {
        field488++;
        class692 var3 = this.field494;
        class676 var4;
        synchronized (this.field494) {
            var4 = (class676) this.field494.method3901((long) arg0, -113);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != -2) {
            this.field484 = null;
        }
        class295 var5 = this.field484;
        byte[] var6;
        synchronized (this.field484) {
            var6 = this.field484.method1844(30, 31330, arg0);
        }
        class676 var7 = new class676();
        if (var6 != null) {
            var7.method3790(arg1 - 10723, new class540(var6));
        }
        class692 var8 = this.field494;
        synchronized (this.field494) {
            this.field494.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V", line = 178)
    public final void method183(int arg0, int arg1) {
        class692 var3 = this.field494;
        synchronized (this.field494) {
            if (arg1 != -23980) {
                this.field484 = null;
            }
            this.field494.method3900(arg0, 0);
        }
        field490++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V", line = 198)
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field487++;
        class489 var5 = class704.method3942(arg2, 10, 0);
        var5.method2797(-1);
        var5.field6945 = arg3;
        int var6 = 92 / ((-arg4 - 11) / 55);
        var5.field6952 = arg1;
        var5.field6942 = arg0;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 215)
    public class28(class373 arg0, int arg1, class295 arg2) {
        this.field484 = arg2;
        this.field484.method1845(30, true);
    }
}
