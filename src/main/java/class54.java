import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field1534 = -1;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lrd;")
    public static class117 field1531 = class95.method812("Freunde", (byte) 8);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lrd;")
    public static class117 field1532 = class95.method812("welle2:", (byte) 8);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Z")
    public static boolean field1529 = false;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lrd;")
    private static class117 field1537 = class95.method812("Enter name of friend to delete from list", (byte) 8);

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lrd;")
    public static class117 field1541 = class95.method812("@gr3@", (byte) 8);

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lrd;")
    public static class117 field1539 = field1537;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lcd;")
    public static class19 field1533;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lge;")
    public static class47 field1544;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lie;")
    public class61 field1538;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
    public int[] field1543;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[Lrd;")
    public class117[] field1530;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
    public static final void method587(int arg0, byte arg1) {
        field1542++;
        int[] var2 = class147.field3588.field2085;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class124.field3002[arg0][var21][var5] & 0x18) == 0) {
                    class90.field2308.method325(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class124.field3002[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class90.field2308.method325(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class147.field3588.method716();
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        if (arg1 <= 59) {
            method588((byte) 100);
        }
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class124.field3002[arg0][var19][var8] & 0x18) == 0) {
                    class7.method48(var19, var8, arg0, var7, var6, (byte) 84);
                }
                if (arg0 < 3 && (class124.field3002[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class7.method48(var19, var8, arg0 + 1, var7, var6, (byte) 106);
                }
            }
        }
        class140.field3342 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class90.field2308.method360(class120.field2940, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class147.method1191((byte) 87, var12).field1734;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class18.field461[class120.field2940].field1455;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class111.field2775[class140.field3342] = class140.field3340[var13];
                        class84.field2190[class140.field3342] = var14;
                        class33.field997[class140.field3342] = var15;
                        class140.field3342++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method588(byte arg0) {
        field1537 = null;
        field1531 = null;
        field1533 = null;
        field1544 = null;
        field1541 = null;
        if (arg0 != 58) {
            method587(122, (byte) 107);
        }
        field1532 = null;
        field1539 = null;
    }
}
