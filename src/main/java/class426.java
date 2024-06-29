import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class426 extends class97 {

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lnn;")
    public static class151 field6252 = new class151("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "[I")
    public static int[] field6261 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "[I")
    public static int[] field6268;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "Lfh;")
    public static class170 field6264;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Z")
    public static boolean field6266;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "J")
    public long field6254;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lui;")
    public class426 field6251;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lui;")
    public class426 field6257;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Lwr;")
    public static class462 field6271;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ui", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field6272;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "[Lkr;")
    public static class234[] field6262;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public static final void method2621(boolean arg0, int arg1) {
        field6260++;
        if (!arg0) {
            method2622(69);
        }
        class32 var2 = class136.method854(6, (byte) 88, arg1);
        var2.method192(-17451);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public static final void method2622(int arg0) {
        field6253++;
        class130.field1650 = new class170[class163.field2257.method824(28970)][];
        if (arg0 > 62) {
            class360.field5321 = new boolean[class163.field2257.method824(28970)];
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B[Lkr;)V")
    public static final void method2623(byte arg0, class234[] arg1) {
        field6258++;
        if (arg0 != -77) {
            field6266 = true;
        }
        class67.field872 = arg1.length;
        class407.field6065 = new int[class67.field872 + 10];
        class304.field4590 = new class234[class67.field872 + 10];
        class129.method767(arg1, 0, class304.field4590, 0, class67.field872);
        for (int var2 = 0; var2 < class67.field872; var2++) {
            class407.field6065[var2] = class304.field4590[var2].method1219();
        }
        for (int var3 = class67.field872; var3 < class304.field4590.length; var3++) {
            class407.field6065[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static final void method2624(int arg0) {
        field6255++;
        if (arg0 >= -113) {
            method2621(false, -22);
        }
        if (class239.field3584 == 2) {
            class229.field3504 = 96;
            return;
        }
        try {
            Method var1 = (field6272 == null ? (field6272 = method2629("java.lang.Runtime")) : field6272).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class229.field3504 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static final void method2625(byte arg0) {
        class153.field2101 = null;
        class251.field3754 = null;
        class402.field6008 = null;
        field6262 = null;
        class107.field1426 = null;
        class262.field4013 = null;
        class315.field4775 = null;
        class284.field4334 = null;
        class435.field6404 = null;
        class259.field3958 = null;
        class184.field2767 = null;
        class196.field2968 = null;
        field6250++;
        class116.field1525 = null;
        class380.field5552 = null;
        class314.field4762 = null;
        class161.field2244 = null;
        if (arg0 > -96) {
            field6271 = null;
        }
        class246.field3691 = null;
        class299.field4534 = null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static void method2626(byte arg0) {
        field6271 = null;
        field6261 = null;
        field6262 = null;
        field6268 = null;
        field6264 = null;
        field6252 = null;
        if (arg0 > -121) {
            method2621(false, -7);
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public final void method2627(int arg0) {
        field6256++;
        if (this.field6257 == null) {
            return;
        }
        this.field6257.field6251 = this.field6251;
        this.field6251.field6257 = this.field6257;
        if (arg0 == 0) {
            this.field6257 = null;
            this.field6251 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)Z")
    public final boolean method2628(int arg0) {
        if (arg0 > -32) {
            this.method2628(-121);
        }
        field6259++;
        return this.field6257 != null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2629(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field6267 = -2;
        field6268 = new int[] { 104, 120, 136, 168 };
        field6264 = null;
        field6270 = 13156520;
        field6266 = false;
        field6269 = 0;
    }
}
