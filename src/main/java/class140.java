import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class140 {

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Z")
    public static boolean field2507 = false;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "Lha;")
    public static class46 field2506 = class271.method1828("<col=ff7000>", -46);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2504 = 0;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
    public static int[] field2511 = new int[25];

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field2505 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lpi;I)V")
    public static final void method1059(class181 arg0, int arg1) {
        field2503++;
        client.field4682 = class216.method1513(arg0, 1179648, class268.field4635);
        class120.field2256 = new int[256];
        for (int var2 = arg1; var2 < 3; var2++) {
            float var4 = (float) (class61.field1033[var2] >> 16 & 0xFF);
            int var5 = (class61.field1033[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class61.field1033[var2] >> 8 & 0xFF);
            int var8 = (class61.field1033[var2 + 1] & 0xFF00) >> 8;
            float var9 = ((float) var8 - var7) / 64.0F;
            int var10 = class61.field1033[var2 + 1] & 0xFF;
            float var11 = (float) (class61.field1033[var2] & 0xFF);
            float var12 = ((float) var10 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class120.field2256[var2 * 64 + var13] = class235.method1595((int) var11, class235.method1595((int) var7 << 8, (int) var4 << 16));
                var7 += var9;
                var4 += var6;
                var11 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class120.field2256[var3] = class61.field1033[3];
        }
        class60.field1006 = new int[32768];
        class63.field1058 = new int[32768];
        class213.method1501((class179) null, -946146713);
        class215.field3811 = new int[32768];
        class158.field2808 = new int[32768];
        class32.field603 = new class21(128, 254);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        field2505 = null;
        field2511 = null;
        field2506 = null;
        if (arg0 != -100) {
            field2506 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1061(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2509++;
        int var7 = arg0 + arg4;
        int var8 = arg0;
        if (arg1 != -112) {
            return;
        }
        while (var7 > var8) {
            class24.method170((byte) 33, arg2, class6.field100[var8], arg6, arg3);
            var8++;
        }
        int var9 = arg6 - arg4;
        int var10 = arg5 - arg4;
        for (int var11 = arg5; var11 > var10; var11--) {
            class24.method170((byte) 33, arg2, class6.field100[var11], arg6, arg3);
        }
        int var12 = arg2 + arg4;
        for (int var13 = var7; var13 <= var10; var13++) {
            int[] var14 = class6.field100[var13];
            class24.method170((byte) 33, arg2, var14, var12, arg3);
            class24.method170((byte) 33, var9, var14, arg6, arg3);
        }
    }
}
