import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class232 extends class76 {

    @OriginalMember(owner = "client!qf", name = "xb", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!qf", name = "Bb", descriptor = "[B")
    public static byte[] field4047 = new byte[520];

    @OriginalMember(owner = "client!qf", name = "zb", descriptor = "Lub;")
    public static class227 field4045 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!qf", name = "yb", descriptor = "Lta;")
    public static class105 field4044 = null;

    @OriginalMember(owner = "client!qf", name = "Eb", descriptor = "Lub;")
    private static class227 field4050 = class257.method1749("Please wait )2 attempting to reestablish)3", 17263);

    @OriginalMember(owner = "client!qf", name = "Cb", descriptor = "Lub;")
    public static class227 field4048 = field4050;

    @OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!qf", name = "Db", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!qf", name = "Fb", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!qf", name = "Gb", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!qf", name = "wb", descriptor = "Lnh;")
    public static class57 field4042;

    @OriginalMember(owner = "client!qf", name = "Ab", descriptor = "[I")
    public static int[] field4046;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)I")
    public static final int method1561(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & -715827883) + (arg1 & 1431655765);
        ++field4041;
        int var3 = ((var2 & -858993460) >>> 2) + (858993459 & var2);
        if (arg0 != 255) {
            method1562(-42, -115);
        }
        int var4 = 252645135 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field4051;
        if (arg0 != 230) {
            field4043 = -16;
        }
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (super.field4213.field3771 && this.method450(0)) {
            int[] var4 = var3[2];
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int var7 = arg1 % super.field1318 * super.field1318;
            for (int var8 = 0; ~class212.field3586 < ~var8; ++var8) {
                int var9 = super.field1332[var8 % super.field1319 + var7];
                var4[var8] = class76.method446(4080, var9 << 4);
                var5[var8] = class76.method446(65280, var9) >> 4;
                var6[var8] = class76.method446(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(II)V")
    public static final void method1562(int arg0, int arg1) {
        if (arg0 == 16640) {
            ++field4049;
            class235.field4077 = 1000 / arg1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
    public static void method1563(byte arg0) {
        field4044 = null;
        if (arg0 != -92) {
            field4050 = null;
        }
        field4045 = null;
        field4048 = null;
        field4046 = null;
        field4050 = null;
        field4047 = null;
        field4042 = null;
    }
}
