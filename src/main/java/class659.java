import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class659 {

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public int field9190 = class275.method1668(3);

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Ljava/lang/String;")
    public String field9180;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public int field9185;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public int field9186;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "Ljava/lang/String;")
    public String field9194;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Ljava/lang/String;")
    public String field9193;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljava/lang/String;")
    public String field9181;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public int field9189;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public int field9188;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Ljava/lang/String;")
    public String field9182;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field9184 = -1;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Z")
    public static boolean field9179 = false;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field9191 = 0;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field9195;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sn", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field9196;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3625(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z", line = 4)
    public static final boolean method3621(Class arg0, String arg1, int arg2) {
        field9187++;
        Class var3 = (Class) class94.field1242.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        if (arg2 != 8580) {
            method3622(-64, (byte) -1, 107, null, 105, 36);
        }
        Object var4 = null;
        File var5 = (File) class305.field4010.get(arg1);
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg0, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class94.field1242.put(arg1, arg0);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class94.field1242.put(arg1, field9196 == null ? (field9196 = method3625("go")) : field9196);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI[BII)V", line = 75)
    public static final void method3622(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field9192++;
        if (arg5 >= arg2) {
            return;
        }
        if (arg1 < 72) {
            method3621(null, null, 4);
        }
        int var6 = arg4 + arg5;
        int var7 = arg2 - arg5 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IBLjava/lang/String;)V", line = 109)
    public final void method3623(String arg0, int arg1, String arg2, int arg3, String arg4, String arg5, int arg6, byte arg7, String arg8) {
        this.field9190 = class275.method1668(3);
        if (arg7 < 62) {
            method3622(3, (byte) -93, -38, null, -107, -55);
        }
        field9183++;
        this.field9194 = arg2;
        this.field9180 = arg5;
        this.field9181 = arg0;
        this.field9182 = arg4;
        this.field9186 = arg6;
        this.field9189 = arg3;
        this.field9193 = arg8;
        this.field9188 = class424.field5503;
        this.field9185 = arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)I", line = 129)
    public static final int method3624(int arg0, byte arg1, int arg2) {
        field9195++;
        if (arg1 != 118) {
            method3622(-31, (byte) 14, -28, null, 91, 65);
        }
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 170)
    public class659(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field9180 = arg5;
        this.field9185 = arg6;
        this.field9186 = arg0;
        this.field9194 = arg7;
        this.field9193 = arg2;
        this.field9181 = arg3;
        this.field9189 = arg1;
        this.field9188 = class424.field5503;
        this.field9182 = arg4;
    }
}
