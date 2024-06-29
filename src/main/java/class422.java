import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class422 extends class551 {

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    private int field6090 = 0;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "Lmu;")
    public static class303 field6091 = new class303(18, 0);

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "Z")
    public static boolean field6093 = false;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "Lmu;")
    public static class303 field6092 = new class303(10, -2);

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field6095 = 0;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "Lut;")
    public static class126 field6085;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ep", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field6096;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BZ)V")
    public final void method1475(byte arg0, boolean arg1) {
        ++field6086;
        int var3 = super.field7598.field2304.method892(class478.field6661, super.field7594.method1618(), (byte) -117) - -super.field7598.field2299;
        int var4 = super.field7598.field2301.method1644(class22.field488, super.field7594.method1614(), 1595) + super.field7598.field2300;
        super.field7594.method2930((float) (super.field7594.method1618() / 2 + var3), (float) (super.field7594.method1614() / 2 + var4), 4096, this.field6090);
        this.field6090 += ((class427) super.field7598).field6137;
        if (arg0 != -49) {
            this.method1475((byte) -26, true);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZLuba;I)V")
    public static final void method2587(boolean arg0, boolean arg1, class432 arg2, int arg3) {
        ++field6089;
        int var4 = arg2.field6181;
        int var5 = (int) arg2.field5204;
        if (arg3 == 2533) {
            arg2.method2314((byte) 35);
            if (arg0) {
                class747.method4171(var4, (byte) -116);
            }
            class730.method4039(arg3 ^ -2531, var4);
            class378 var6 = class60.method633(1512932720, var5);
            if (var6 != null) {
                class296.method1945(-9343, var6);
            }
            class172.method1290((byte) 119);
            if (!arg1 && ~class184.field2784 != 0) {
                class640.method3635((byte) -8, class184.field2784, 1);
            }
            class666 var7 = new class666(class323.field4473);
            for (class432 var8 = (class432) var7.method3742((byte) 123); var8 != null; var8 = (class432) var7.method3744((byte) 99)) {
                if (!var8.method2311((byte) 4)) {
                    var8 = (class432) var7.method3742((byte) 123);
                    if (var8 == null) {
                        return;
                    }
                }
                if (var8.field6184 == 3) {
                    int var9 = (int) var8.field5204;
                    if (var9 >>> 16 == var4) {
                        method2587(true, arg1, var8, 2533);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lin;Lwg;)V")
    public class422(class91 arg0, class427 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public static final void method2588(boolean arg0) {
        ++field6088;
        try {
            Method var1 = (field6096 != null ? field6096 : (field6096 = method2590("java.lang.Runtime"))).getMethod("availableProcessors");
            if (arg0) {
                method2587(false, false, (class432) null, -35);
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class153.field2496 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
    public static void method2589(int arg0) {
        field6091 = null;
        field6085 = null;
        field6092 = null;
        if (arg0 != 1) {
            method2588(true);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2590(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
