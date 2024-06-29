import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class461 {

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "[Z")
    public static boolean[] field6476 = new boolean[5];

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[F")
    public static float[] field6477 = new float[16384];

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[F")
    public static float[] field6478 = new float[16384];

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field6480 = 100;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Lsv;")
    public static class688 field6481;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field6479;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6478[var2] = (float) Math.sin((double) var2 * var0);
            field6477[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6481 = new class688();
        field6482 = -1;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)Ljava/lang/String;", line = 3)
    public static final String method2781(int arg0) {
        field6479++;
        if (class672.field9218 || class748.field10391 == null) {
            return "";
        } else {
            if (arg0 != 0) {
                field6478 = null;
            }
            return class748.field10391.field1026;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 30)
    public static final String method2782(int arg0, byte arg1) {
        field6475++;
        int var2 = 11 % ((-arg1 - 49) / 47);
        class318 var3 = (class318) class444.field5950.method2121(97, (long) arg0);
        if (var3 != null) {
            class164 var4 = var3.field3917.method2247(false);
            if (var4 != null) {
                double var5 = var3.field3917.method2240((byte) 35);
                if (var5 >= (double) var4.method1141((byte) 116) && var5 <= (double) var4.method1145(false)) {
                    return var4.method1146(116);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V", line = 60)
    public static void method2783(int arg0) {
        field6477 = null;
        field6476 = null;
        field6481 = null;
        field6478 = null;
        if (arg0 < 25) {
            field6482 = -15;
        }
    }
}
