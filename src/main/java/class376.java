import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class376 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lmq;")
    private class472 field5053 = new class472(128);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljn;")
    private class668 field5045;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Loe;")
    public static class183 field5049 = new class183();

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Ln;")
    public static class17 field5054 = null;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lle;")
    public static class280 field5043;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field5055;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2190(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)Lrl;", line = 5)
    public final class671 method2182(int arg0, byte arg1) {
        field5050++;
        class472 var3 = this.field5053;
        class671 var4;
        synchronized (this.field5053) {
            var4 = (class671) this.field5053.method2766(-122, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 == -89) {
            class668 var5 = this.field5045;
            byte[] var6;
            synchronized (this.field5045) {
                var6 = this.field5045.method3800(arg0, 1, (byte) -92);
            }
            class671 var7 = new class671();
            if (var6 != null) {
                var7.method3824((byte) -71, new class389(var6));
            }
            class472 var8 = this.field5053;
            synchronized (this.field5053) {
                this.field5053.method2772(var7, true, (long) arg0);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 36)
    public final void method2183(byte arg0) {
        class472 var2 = this.field5053;
        synchronized (this.field5053) {
            this.field5053.method2778((byte) 126);
        }
        field5048++;
        if (arg0 <= 38) {
            method2186(null, 59);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)Z", line = 49)
    public static final boolean method2184(int arg0, int arg1, byte arg2) {
        field5046++;
        if (arg2 >= -17) {
            method2186(null, -44);
        }
        return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 61)
    public final void method2185(int arg0) {
        if (arg0 != 0) {
            method2184(-11, -22, (byte) 30);
        }
        field5052++;
        class472 var2 = this.field5053;
        synchronized (this.field5053) {
            this.field5053.method2776(false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([[[Lcq;I)V", line = 75)
    public static final void method2186(class433[][][] arg0, int arg1) {
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class433[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class433 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6221 instanceof class691) {
                            ((class691) var6.field6221).method1071(-31121);
                        }
                        if (var6.field6212 instanceof class691) {
                            ((class691) var6.field6212).method1071(-31121);
                        }
                        if (var6.field6209 instanceof class691) {
                            ((class691) var6.field6209).method1071(-31121);
                        }
                        if (var6.field6217 instanceof class691) {
                            ((class691) var6.field6217).method1071(-31121);
                        }
                        if (var6.field6210 instanceof class691) {
                            ((class691) var6.field6210).method1071(-31121);
                        }
                        for (class182 var7 = var6.field6218; var7 != null; var7 = var7.field2226) {
                            class43 var8 = var7.field2227;
                            if (var8 instanceof class691) {
                                ((class691) var8).method1071(-31121);
                            }
                        }
                    }
                }
            }
        }
        field5044++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 147)
    public static final void method2187(int arg0) {
        try {
            Method var1 = (field5055 == null ? (field5055 = method2190("java.lang.Runtime")) : field5055).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class32.field649 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != 24) {
            field5043 = null;
        }
        field5051++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 184)
    public static void method2188(byte arg0) {
        field5049 = null;
        if (arg0 != -110) {
            method2187(17);
        }
        field5054 = null;
        field5043 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V", line = 199)
    public final void method2189(byte arg0, int arg1) {
        field5047++;
        class472 var3 = this.field5053;
        synchronized (this.field5053) {
            this.field5053.method2777(arg1, 26);
        }
        if (arg0 >= -77) {
            field5054 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ler;ILjn;)V", line = 219)
    public class376(class90 arg0, int arg1, class668 arg2) {
        this.field5045 = arg2;
        this.field5045.method3805(1, false);
    }
}
