import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class80 {

    @OriginalMember(owner = "client!li", name = "e", descriptor = "[Llj;")
    public static class44[] field1564 = new class44[5000];

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lr;")
    public static class66 field1565 = class93.method641(43, "<col=ffffff>");

    @OriginalMember(owner = "client!li", name = "b", descriptor = "[I")
    public static int[] field1561 = new int[256];

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Lr;")
    public static class66 field1572;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "B")
    public static byte field1567;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "J")
    public long field1560;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Lsg;")
    public static class247 field1570;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Lha;")
    public static class63 field1573;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lli;")
    public class80 field1569;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lli;")
    public class80 field1571;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method556(int arg0) {
        field1572 = null;
        field1564 = null;
        field1561 = null;
        int var1 = -117 / ((arg0 + 67) / 42);
        field1573 = null;
        field1565 = null;
        field1570 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Z")
    public static final boolean method557(int arg0, int arg1) {
        field1566++;
        if (arg1 == 1424444319) {
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZB)V")
    public static final void method558(boolean arg0, byte arg1) {
        field1562++;
        if (arg1 >= -13) {
            method557(-38, -97);
        }
        byte var2 = 4;
        byte[][] var3 = class76.field1503;
        for (int var4 = 0; var4 < var2; var4++) {
            class129.method901(16322);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class14.field180[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = (var7 & 0x36B78C8) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var7 & 0xFFDA27) >> 14;
                            int var11 = (var7 & 0x6) >> 1;
                            int var12 = (var7 & 0x3FFE) >> 3;
                            int var13 = (var10 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class202.field3469.length; var14++) {
                                if (class202.field3469[var14] == var13 && var3[var14] != null) {
                                    var8 = true;
                                    class240.method1577((var10 & 0x7) * 8, false, var5 * 8, var3[var14], (var12 & 0x7) * 8, class193.field3346, var11, var4, arg0, var9, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class188.method1243(8, -81, 8, var4, var6 * 8, var5 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
    public final boolean method559(int arg0) {
        field1563++;
        if (this.field1569 == null) {
            return false;
        } else {
            if (arg0 <= 64) {
                method556(-119);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public final void method560(int arg0) {
        field1568++;
        if (this.field1569 != null && arg0 == -17554) {
            this.field1569.field1571 = this.field1571;
            this.field1571.field1569 = this.field1569;
            this.field1569 = null;
            this.field1571 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1561[var0] = var1;
        }
        field1574 = 0;
        field1572 = class93.method641(43, "Lade)3)3)3");
    }
}
