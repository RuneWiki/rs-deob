import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Loa;")
    private static class98 field1681 = class38.method349(255, "Classic");

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Loa;")
    public static class98 field1690 = field1681;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1685 = 500;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Loa;")
    private static class98 field1682 = class38.method349(255, "purple:");

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Loa;")
    public static class98 field1688 = class38.method349(255, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Loa;")
    public static class98 field1687 = field1682;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Loa;")
    public static class98 field1689 = field1682;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ln;")
    public static class90 field1684 = new class90(50);

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Loa;")
    public static class98 field1695 = class38.method349(255, "Null");

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1694 = -1;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "J")
    public static long field1693;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method626(int arg0) {
        class139.field3392 = new byte[4][105][105];
        class21.field450 = new byte[4][104][104];
        class80.field1792 = 99;
        class127.field2864 = new int[104];
        field1691++;
        class18.field402 = new int[104];
        class78.field1722 = new int[104];
        class51.field1126 = new byte[4][104][104];
        class138.field3366 = new byte[4][104][104];
        class88.field2026 = new int[4][105][105];
        class65.field1399 = new int[104];
        class44.field1001 = new int[104];
        class51.field1117 = new byte[arg0][104][104];
        class44.field1000 = new int[105][105];
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
    public static final int method627(byte arg0) {
        field1683++;
        int var1 = 3;
        if (class118.field2639 < 310) {
            int var2 = class71.field1472 >> 7;
            int var3 = class18.field394 >> 7;
            if ((class80.field1771[class114.field2572][var2][var3] & 0x4) != 0) {
                var1 = class114.field2572;
            }
            int var4 = class73.field1536.field3667 >> 7;
            int var5 = class73.field1536.field3657 >> 7;
            int var6;
            if (var2 >= var5) {
                var6 = var2 - var5;
            } else {
                var6 = var5 - var2;
            }
            int var7;
            if (var4 <= var3) {
                var7 = var3 - var4;
            } else {
                var7 = var4 - var3;
            }
            if (var7 >= var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var4) {
                    var9 += var8;
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class80.field1771[class114.field2572][var2][var3] & 0x4) != 0) {
                        var1 = class114.field2572;
                    }
                    if (var9 >= 65536) {
                        if (var2 < var5) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        if ((class80.field1771[class114.field2572][var2][var3] & 0x4) != 0) {
                            var1 = class114.field2572;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (var2 != var5) {
                    var10 += var11;
                    if (var5 > var2) {
                        var2++;
                    } else if (var2 > var5) {
                        var2--;
                    }
                    if ((class80.field1771[class114.field2572][var2][var3] & 0x4) != 0) {
                        var1 = class114.field2572;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var4) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        if ((class80.field1771[class114.field2572][var2][var3] & 0x4) != 0) {
                            var1 = class114.field2572;
                        }
                    }
                }
            }
        }
        if (arg0 >= -27) {
            method626(30);
        }
        if ((class80.field1771[class114.field2572][class73.field1536.field3657 >> 7][class73.field1536.field3667 >> 7] & 0x4) != 0) {
            var1 = class114.field2572;
        }
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static void method628(boolean arg0) {
        field1689 = null;
        field1687 = null;
        field1695 = null;
        field1688 = null;
        field1682 = null;
        field1690 = null;
        field1684 = null;
        field1681 = null;
        if (!arg0) {
            method626(-97);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)[Loc;")
    public static final class100[] method629(int arg0) {
        field1686++;
        class100[] var1 = new class100[class73.field1543];
        for (int var2 = 0; var2 < class73.field1543; var2++) {
            class100 var3 = var1[var2] = new class100();
            var3.field2327 = class78.field1713;
            var3.field2323 = class102.field2351;
            var3.field2322 = class55.field1207[var2];
            var3.field2324 = class83.field1928[var2];
            var3.field2325 = class62.field1318[var2];
            var3.field2328 = class91.field2103[var2];
            var3.field2321 = class83.field1934;
            var3.field2326 = class138.field3382[var2];
        }
        class150.method1203(arg0 - 1454146337);
        return arg0 == 104 ? var1 : null;
    }
}
