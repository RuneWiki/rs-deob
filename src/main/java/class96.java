import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class96 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "J")
    public static long field1563 = 0L;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lvp;")
    public static class123 field1565 = new class123(76, 2);

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "F")
    public static float field1567;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "[I")
    public static int[] field1566;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)[Lnc;")
    public static final class21[] method763(byte arg0) {
        if (arg0 > -108) {
            method765(false);
        }
        field1561++;
        return new class21[] { class72.field1204, class246.field3568, class169.field2539 };
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method764(boolean arg0, String arg1, boolean arg2) {
        field1564++;
        if (arg2) {
            method764(true, null, false);
        }
        class8.field120.field1398 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class8.field111.field7658; var6++) {
            class172 var9 = class8.field111.method3077(66, var6);
            if ((!arg0 || var9.field2597) && var9.field2589 == -1 && var9.field2574 == -1 && var9.field2586 == 0 && var9.field2569.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class305.field4375 = null;
                    class95.field1554 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class95.field1554 = var5;
        class305.field4375 = var4;
        class76.field1254 = 0;
        String[] var7 = new String[class95.field1554];
        for (int var8 = 0; var8 < class95.field1554; var8++) {
            var7[var8] = class8.field111.method3077(-120, var4[var8]).field2569;
        }
        class113.method835((byte) -104, class305.field4375, var7);
        class8.field120.method663(0);
        class8.field120.field1398 = 2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public static void method765(boolean arg0) {
        field1565 = null;
        if (!arg0) {
            method766((byte) -123, null);
        }
        field1566 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLak;)Ljava/lang/String;")
    public static final String method766(byte arg0, class231 arg1) {
        field1562++;
        int var2 = -30 % ((-arg0 - 30) / 62);
        return arg1.field3364 == null || arg1.field3364.length() <= 0 ? arg1.field3362 : arg1.field3362 + class169.field2540.method1273(true, class370.field5530) + arg1.field3364;
    }
}
