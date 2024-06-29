import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class356 implements class682 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lbs;")
    private class148 field4609;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ldq;")
    private class517 field4613;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Z")
    public static boolean field4607 = false;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4612;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4608;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lxa;")
    public static class511 field4617;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public static void method2047(byte arg0) {
        field4612 = null;
        field4617 = null;
        if (arg0 <= 18) {
            method2050(70, -73);
        }
        field4608 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method449(int arg0) {
        field4615++;
        int var2 = 19 % ((arg0 - 65) / 45);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)Z")
    public static final boolean method2048(byte arg0, int arg1) {
        if (arg0 == 68) {
            field4605++;
            return arg1 == 1 || arg1 == 3 || arg1 == 5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)Z")
    public static final boolean method2049(int arg0, int arg1, int arg2) {
        if (arg0 > -41) {
            method2050(29, 60);
        }
        field4606++;
        return class421.method2424(arg2, (byte) 123, arg1) | (arg2 & 0x800) != 0 || class337.method1932(-1, arg2, arg1);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Z")
    public final boolean method444(byte arg0) {
        field4611++;
        if (arg0 > -10) {
            field4607 = false;
        }
        return this.field4609.method1095((byte) -43);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method2050(int arg0, int arg1) {
        if (arg0 == -6) {
            if (class13.field148 == null || arg1 > class13.field148.length) {
                class13.field148 = new int[arg1];
            }
            field4610++;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIIILta;Ljava/lang/String;)I")
    private final int method2051(byte arg0, int arg1, int arg2, int arg3, class597 arg4, String arg5) {
        if (arg0 != 61) {
            field4614 = -113;
        }
        field4604++;
        return arg4.method3256(0, this.field4613.field6763, this.field4613.field6761 - arg1 * 2, arg1 + arg2, arg1 + arg3, 0, arg5, null, -111, null, this.field4613.field6770, null, 0, this.field4613.field6762 - arg1 * 2, 0, 0);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lbs;Ldq;)V")
    public class356(class148 arg0, class517 arg1) {
        this.field4609 = arg0;
        this.field4613 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
    public final void method448(int arg0, boolean arg1) {
        field4616++;
        if (arg0 != -207) {
            return;
        }
        class658 var3 = this.field4609.method1096(9710, this.field4613.field6772);
        if (var3 == null) {
            return;
        }
        int var4 = this.field4613.field6766.method3005(class94.field1240, (byte) -124, this.field4613.field6762) + this.field4613.field6773;
        int var5 = this.field4613.field6771.method3059(this.field4613.field6761, class535.field6968, -103) + this.field4613.field6765;
        if (this.field4613.field6764) {
            class520.field6799.method388(var4, var5, this.field4613.field6762, this.field4613.field6761, this.field4613.field6760, 0);
        }
        int var6 = var5 + this.method2051((byte) 61, 5, var5, var4, class456.field5983, var3.field9168) * 12;
        int var9 = var6 + 8;
        if (this.field4613.field6764) {
            class520.field6799.method406(var4, var9, this.field4613.field6762 + var4 - 1, var9, this.field4613.field6760, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2051((byte) 61, 5, var6, var4, class456.field5983, var3.field9172) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2051((byte) 61, 5, var10, var4, class456.field5983, var3.field9173) * 12;
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field4612 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4608 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
