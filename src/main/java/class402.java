import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class402 extends class504 {

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "Lcu;")
    public static class206 field5346 = new class206(34, -1);

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "[F")
    public static float[] field5352 = new float[16384];

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "[F")
    public static float[] field5355 = new float[16384];

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
    public int field5349;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
    public int field5350;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "Lcea;")
    public class201 field5354;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "Lcu;")
    public class206 field5347;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "[I")
    public static int[] field5353;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lvj;B)I")
    public static final int method2304(class411 arg0, byte arg1) {
        field5351++;
        if (arg0.field5614 == 0) {
            return 0;
        }
        if (arg1 != 82) {
            method2304(null, (byte) 96);
        }
        if (arg0.field5551 != -1) {
            class411 var2 = null;
            if (arg0.field5551 < 32768) {
                class280 var3 = (class280) class616.field8143.method2918((long) arg0.field5551, (byte) -125);
                if (var3 != null) {
                    var2 = var3.field3983;
                }
            } else if (arg0.field5551 >= 32768) {
                var2 = class572.field7601[arg0.field5551 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field8620 - var2.field8620;
                int var5 = arg0.field8612 - var2.field8612;
                if (var4 != 0 || var5 != 0) {
                    arg0.method2360(98, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0 instanceof class403)) {
            class403 var9 = (class403) arg0;
            if (var9.field5364 != -1 && (var9.field5642 == 0 || var9.field5644 > 0)) {
                var9.method2360(arg1 + 43, var9.field5364);
                var9.field5364 = -1;
            }
        } else if (arg0 instanceof class287) {
            class287 var6 = (class287) arg0;
            if (var6.field4060 != -1 && (var6.field5642 == 0 || var6.field5644 > 0)) {
                int var7 = var6.field8620 - ((var6.field4060 - class473.field6334 - class473.field6334) * 256);
                int var8 = var6.field8612 - ((var6.field4036 - class233.field3269 - class233.field3269) * 256);
                if (var7 != 0 || var8 != 0) {
                    var6.method2360(arg1 + 34, (int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF);
                }
                var6.field4060 = -1;
            }
        }
        return arg0.method2356((byte) 88);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static void method2305(int arg0) {
        field5355 = null;
        field5352 = null;
        if (arg0 != 5696) {
            method2304(null, (byte) -20);
        }
        field5346 = null;
        field5353 = null;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
    public final void method2306(int arg0) {
        field5348++;
        if (class655.field8877 < class501.field6703.length && arg0 == 256) {
            class501.field6703[class655.field8877++] = this;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5355[var2] = (float) Math.sin((double) var2 * var0);
            field5352[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
