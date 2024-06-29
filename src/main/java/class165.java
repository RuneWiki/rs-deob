import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class165 {

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public int field2403 = -1;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "[F")
    public static float[] field2400 = new float[16384];

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "[F")
    public static float[] field2405 = new float[16384];

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2407;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "Lui;")
    public static class375 field2408;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Z")
    public static boolean field2412;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lci;")
    public class479 field2402;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Lqa;")
    public static class496 field2410;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "[I")
    public int[] field2404;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "[I")
    public static int[] field2411;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field2401;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method1164(byte arg0) {
        field2400 = null;
        field2405 = null;
        field2411 = null;
        if (arg0 > 125) {
            field2408 = null;
            field2410 = null;
            field2407 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIBII)V")
    public static final void method1165(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2406++;
        if (arg2 != -117) {
            method1164((byte) 51);
        }
        class377 var5 = class99.method672(arg0, false, 4);
        var5.method2340((byte) 127);
        var5.field5762 = arg3;
        var5.field5763 = arg1;
        var5.field5759 = arg4;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2400[var2] = (float) Math.sin((double) var2 * var0);
            field2405[var2] = (float) Math.cos((double) var2 * var0);
        }
        field2407 = null;
        field2408 = new class375("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
        field2412 = false;
    }
}
