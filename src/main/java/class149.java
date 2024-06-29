import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class149 implements class264 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field2471 = 4;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "[I")
    public static int[] field2470 = new int[120];

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "[I")
    public static int[] field2474;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "[F")
    public static float[] field2477;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "[F")
    public static float[] field2478;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "[F")
    public static float[] field2481;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "[J")
    public static long[] field2472;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "[Lf;")
    public static class702[] field2479;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var5 = var1 + 1;
            int var6 = (int) (Math.pow(2.0D, (double) var5 / 7.0D) * 300.0D + (double) var5);
            var0 += var6;
            field2470[var1] = var0 / 4;
        }
        field2474 = new int[14];
        field2476 = 0;
        field2477 = new float[16384];
        field2478 = new float[16384];
        double var2 = 3.834951969714103E-4D;
        for (int var4 = 0; var4 < 16384; var4++) {
            field2477[var4] = (float) Math.sin((double) var4 * var2);
            field2478[var4] = (float) Math.cos((double) var4 * var2);
        }
        field2481 = new float[4];
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V", line = 5)
    public static final void method1245(int arg0) {
        field2469++;
        class89.field1077 = new class594();
        if (arg0 < 52) {
            field2476 = -103;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 17)
    public static void method1246(byte arg0) {
        field2477 = null;
        field2472 = null;
        field2481 = null;
        field2478 = null;
        field2479 = null;
        field2474 = null;
        if (arg0 != 105) {
            method1245(-14);
        }
        field2470 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Leu;", line = 33)
    public final class444 method1247(int arg0) {
        field2473++;
        if (arg0 != 3848) {
            field2479 = null;
        }
        return class609.field8651;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(I)V", line = 45)
    public class149(int arg0) {
        this.field2468 = arg0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIII)V", line = 61)
    public static final void method1248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class177.field2910 = arg1;
        class503.field7364 = arg5;
        class556.field8042 = arg4;
        class640.field8986 = arg0;
        field2480++;
        class131.field2151 = arg3;
        if (class556.field8042 >= 100) {
            int var6 = class177.field2910 * 512 + 256;
            int var7 = class640.field8986 * 512 + 256;
            int var8 = class202.method1568(var6, class423.field6439, var7, 2) - class131.field2151;
            int var9 = var6 - class675.field9521;
            int var10 = var8 - class607.field8638;
            int var11 = var7 - class412.field6318;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class13.field197 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class523.field7598 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class13.field197 < 1024) {
                class13.field197 = 1024;
            }
            class617.field8744 = 0;
            if (class13.field197 > 3072) {
                class13.field197 = 3072;
            }
        }
        class81.field1005 = -1;
        class664.field9243 = -1;
        class126.field2062 = arg2;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)V", line = 161)
    public static final void method1249(int arg0, int arg1) {
        field2475++;
        if (class107.method1016(arg1, (byte) 118) && arg0 <= -23) {
            class319.method2171(-1, 0, class564.field8105[arg1]);
        }
    }
}
