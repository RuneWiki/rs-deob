import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class95 {

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[Lsl;")
    private class18[] field1614;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public static boolean field1613 = false;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    public static int[] field1615 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[Led;")
    public static class186[] field1617;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[[B")
    public static byte[][] field1609;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method710(byte arg0) {
        client.method1056();
        field1611++;
        for (int var1 = 0; var1 < 4; var1++) {
            class176.field2765[var1].method346(32);
        }
        if (arg0 != 98) {
            method712(85, -27, 43, 78, -11, -34, 122);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1608++;
        if (arg0 != 239) {
            field1615 = null;
        }
        for (int var5 = 0; var5 < class77.field1262; var5++) {
            if (arg2 < (class251.field4040[var5] + class129.field2025[var5]) && class129.field2025[var5] < arg2 + arg4 && (class278.field4418[var5] + class115.field1879[var5]) > arg1 && class115.field1879[var5] < (arg1 + arg3)) {
                class25.field335[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1612++;
        if (arg3 > -119) {
            method711(9, -111, -7, -64, 30);
        }
        class83[] var7 = class28.field393;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class83 var9 = var7[var8];
            if (var9 != null && var9.field1397 == 2) {
                class213.method1446(arg4, var9.field1407 * 2, arg5 >> 1, (var9.field1402 - class46.field656 << 7) + var9.field1395, (-class260.field4162 + var9.field1400 << 7) + var9.field1406, (byte) -51, arg6 >> 1, arg2);
                if (class294.field4630 > -1 && class192.field2978 % 20 < 10) {
                    class167.field2615[var9.field1404].method856(arg0 + class294.field4630 - 12, arg1 + -28 - -class84.field1414);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method713(int arg0) {
        field1617 = null;
        field1615 = null;
        if (arg0 == 19) {
            field1609 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V")
    public class95(int arg0) {
        this.field1614 = new class18[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class18 var3 = this.field1614[var2] = new class18();
            var3.field278 = var3;
            var3.field276 = var3;
        }
    }
}
