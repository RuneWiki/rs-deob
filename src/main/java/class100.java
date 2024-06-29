import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class100 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1753 = new String[1000];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1758 = -1;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method659(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class2 var5 = class212.method1433(arg4, 4, -13802);
        var5.method13((byte) -1);
        var5.field43 = arg2;
        var5.field39 = arg3;
        field1755++;
        if (arg0 != 8418) {
            method661(false, -98);
        }
        var5.field32 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(CI)Z", line = 40)
    public static final boolean method660(char arg0, int arg1) {
        if (arg1 == 57) {
            field1759++;
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 53)
    public static final void method661(boolean arg0, int arg1) {
        field1754++;
        byte[][] var2;
        byte var3;
        if (class249.field3893 && arg0) {
            var2 = client.field905;
            var3 = 1;
        } else {
            var2 = class164.field2654;
            var3 = 4;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var2[var5];
            int var8 = class95.field1708[var5] & 0xFF;
            int var9 = class95.field1708[var5] >> 8;
            int var10 = var9 * 64 - class246.field3818;
            int var11 = var8 * 64 - class101.field1769;
            if (var7 != null) {
                class268.method1782(true);
                var6 = class255.method1711(arg0, var7, class246.field3818, var10, class101.field1769, -84, class326.field4990, var11);
            }
            if (!arg0 && class303.field4597 / 8 == var9 && class14.field270 / 8 == var8) {
                if (var6 == null) {
                    class168.field2696 = -1;
                } else {
                    class252.field3942 = var6[4];
                    class164.field2640 = var6[2];
                    class168.field2696 = var6[0];
                    class343.field5327 = var6[1];
                    class212.field3410 = var6[3];
                }
            }
        }
        int var12 = 0;
        if (arg1 >= -76) {
            field1753 = (String[]) null;
        }
        while (var4 > var12) {
            int var13 = (class95.field1708[var12] >> 8) * 64 - class246.field3818;
            int var14 = (class95.field1708[var12] & 0xFF) * 64 - class101.field1769;
            byte[] var15 = var2[var12];
            if (var15 == null && class14.field270 < 800) {
                class268.method1782(true);
                for (int var16 = 0; var16 < var3; var16++) {
                    class85.method595(var14, 64, (byte) -118, var13, var16, 64);
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 147)
    public static void method662(int arg0) {
        field1753 = null;
        int var1 = 104 / ((arg0 + 36) / 41);
    }
}
