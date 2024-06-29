import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class407 implements Runnable {

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[Lvl;")
    public volatile class11[] field5821 = new class11[2];

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Z")
    public volatile boolean field5822 = false;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Z")
    public volatile boolean field5814 = false;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field5823;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Lvl;")
    public static class11 field5820;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Lpc;")
    public class476 field5815;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Liv;")
    public static class65 field5817;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field5825;

    // $FF: synthetic method
    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2407(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 3)
    public static void method2403(int arg0) {
        field5820 = null;
        field5817 = null;
        if (arg0 != 17394) {
            method2404(true, 117, -103);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZII)Z", line = 14)
    public static final boolean method2404(boolean arg0, int arg1, int arg2) {
        field5818++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        class102 var3 = class315.field4017.method1958(-10091, arg2);
        if (arg0) {
            return false;
        } else {
            if (arg1 >= 5 && arg1 <= 8) {
                arg1 = 4;
            }
            return var3.method760(arg1, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!uo", name = "run", descriptor = "()V", line = 40)
    public final void run() {
        field5816++;
        this.field5814 = true;
        try {
            while (!this.field5822) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class11 var2 = this.field5821[var1];
                    if (var2 != null) {
                        var2.method75((byte) -55);
                    }
                }
                class199.method1251(10L, (byte) -56);
                class156.method1016(this.field5815, null, (byte) -125);
            }
        } catch (Exception var9) {
            class461.method2719(var9, null, 1);
        } finally {
            Object var6 = null;
            this.field5814 = false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIBI)V", line = 73)
    public static final void method2405(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5819++;
        int var7 = class33.method242(arg3, class533.field7845, class289.field3694, (byte) -128);
        int var8 = class33.method242(arg1, class533.field7845, class289.field3694, (byte) -128);
        int var9 = class33.method242(arg4, class147.field1870, class237.field3019, (byte) -128);
        int var10 = class33.method242(arg6, class147.field1870, class237.field3019, (byte) -128);
        int var11 = class33.method242(arg2 + arg3, class533.field7845, class289.field3694, (byte) -128);
        int var12 = class33.method242(arg1 - arg2, class533.field7845, class289.field3694, (byte) -128);
        for (int var13 = var7; var13 < var11; var13++) {
            class184.method1160(class387.field5088[var13], arg5 - 45, arg0, var10, var9);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class184.method1160(class387.field5088[var14], -7, arg0, var10, var9);
        }
        int var15 = class33.method242(arg2 + arg4, class147.field1870, class237.field3019, (byte) -128);
        int var16 = class33.method242(arg6 - arg2, class147.field1870, class237.field3019, (byte) -128);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class387.field5088[var17];
            class184.method1160(var18, -7, arg0, var15, var9);
            class184.method1160(var18, -7, arg0, var10, var16);
        }
        if (arg5 != 38) {
            method2405(11, 110, -67, 97, -101, (byte) 65, -94);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V", line = 126)
    public static final void method2406(int arg0) {
        field5824++;
        if (arg0 != 8) {
            field5823 = 81;
        }
        if (class476.field6902 == 2) {
            class105.field1333 = 96;
            return;
        }
        try {
            Method var1 = (field5825 == null ? (field5825 = method2407("java.lang.Runtime")) : field5825).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class105.field1333 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }
}
