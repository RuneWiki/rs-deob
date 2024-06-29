import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class295 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    public static int[] field4322 = new int[4096];

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lnj;")
    public static class487 field4325;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ltt;")
    public class313 field4323;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public int[] field4324;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[Ltaa;")
    public static class272[] field4326;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)V")
    public static final void method1828(byte arg0, int arg1) {
        if (arg0 >= -105) {
            method1831(-78, (byte) -14);
        }
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field4318++;
        class588.field8730 = arg1;
        class264.field3912 = new class96[class622.field9112[class588.field8730] + 1];
        class626.field9182 = 0;
        field4327 = 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method1829(boolean arg0) {
        field4325 = null;
        field4322 = null;
        if (!arg0) {
            field4326 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBILaba;ZI)V")
    public static final void method1830(int arg0, int arg1, byte arg2, int arg3, class224 arg4, boolean arg5, int arg6) {
        field4319++;
        if (class68.field779 >= 50 || arg4 == null || arg4.field3305 == null || arg0 >= arg4.field3305.length || arg4.field3305[arg0] == null) {
            return;
        }
        int var7 = arg4.field3305[arg0][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        if (arg4.field3305[arg0].length > 1) {
            int var10 = (int) ((double) arg4.field3305[arg0].length * Math.random());
            if (var10 > 0) {
                var8 = arg4.field3305[arg0][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg5) {
                class486.method2950(var9, -1, 255, 0, var8);
            }
        } else if (class94.field1158.field303 != 0) {
            int var12 = -101 % ((arg2 + 26) / 63);
            int var13 = arg6 - 64 >> 7;
            int var14 = arg1 - 64 >> 7;
            class10.field94[class68.field779++] = new class585((byte) 1, var8, var9, 0, 255, (arg3 << 24) + (var13 << 16) + (var14 << 8) + var11);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
    public static final void method1831(int arg0, byte arg1) {
        if (arg1 > -120) {
            method1831(-103, (byte) -93);
        }
        field4320++;
        class467.field6744 = -1;
        class535.field7925 = arg0;
        class59.field710 = 3;
        class181.field2785 = 100;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4322[var0] = class387.method2341(false, var0);
        }
        field4325 = new class487("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");
        field4327 = 0;
    }
}
