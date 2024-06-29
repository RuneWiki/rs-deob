import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class63 extends class121 {

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Loc;")
    private static class99 field1655 = class48.method402((byte) -104, "Enter your username (V password)3");

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "Loc;")
    private static class99 field1667 = class48.method402((byte) -104, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Loc;")
    private static class99 field1665 = class48.method402((byte) -104, "Message");

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "Loc;")
    public static class99 field1663 = field1655;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Loc;")
    public static class99 field1658 = field1665;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "Loc;")
    public static class99 field1668 = field1667;

    @OriginalMember(owner = "client!jb", name = "rb", descriptor = "Loc;")
    public static class99 field1680 = class48.method402((byte) -104, "blinken2:");

    @OriginalMember(owner = "client!jb", name = "qb", descriptor = "Loc;")
    public static class99 field1679 = class48.method402((byte) -104, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "Z")
    public static boolean field1677 = false;

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Loc;")
    private static class99 field1666 = class48.method402((byte) -104, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "Loc;")
    public static class99 field1671 = field1666;

    @OriginalMember(owner = "client!jb", name = "pb", descriptor = "Loc;")
    public static class99 field1678 = null;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[I")
    public int[] field1656;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "[I")
    public int[] field1670;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "[Loc;")
    public class99[] field1664;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lhe;")
    public static final class54 method552(int arg0, byte arg1) {
        field1662++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class132.field3230[var2] == null || class132.field3230[var2][var3] == null) {
            boolean var4 = class35.method306((byte) -45, var2);
            if (!var4) {
                return null;
            }
        }
        return arg1 <= 123 ? null : class132.field3230[var2][var3];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Z")
    public static final boolean method553(int arg0, int arg1) {
        field1661++;
        if (arg0 == 1) {
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
    public static void method554(byte arg0) {
        field1667 = null;
        field1680 = null;
        field1668 = null;
        field1663 = null;
        field1678 = null;
        field1671 = null;
        field1655 = null;
        field1658 = null;
        field1666 = null;
        if (arg0 >= -9) {
            method553(58, -78);
        }
        field1665 = null;
        field1679 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public static final void method555(int arg0) {
        for (class111 var1 = (class111) class140.field3466.method722(110); var1 != null; var1 = (class111) class140.field3466.method716(true)) {
            if (class84.field2116 != var1.field2752 || var1.field2770 < class101.field2444) {
                var1.method394((byte) 105);
            } else if (var1.field2760 <= class101.field2444) {
                if (var1.field2769 > 0) {
                    class149 var2 = class149.field3691[var1.field2769 - 1];
                    if (var2 != null && var2.field3115 >= 0 && var2.field3115 < 13312 && var2.field3077 >= 0 && var2.field3077 < 13312) {
                        var1.method950((byte) 108, class137.method1144(true, var2.field3115, var2.field3077, var1.field2752) - var1.field2755, var2.field3115, var2.field3077, class101.field2444);
                    }
                }
                if (var1.field2769 < 0) {
                    int var3 = -var1.field2769 - 1;
                    class126 var4;
                    if (class94.field2292 == var3) {
                        var4 = class69.field1770;
                    } else {
                        var4 = class59.field1571[var3];
                    }
                    if (var4 != null && var4.field3115 >= 0 && var4.field3115 < 13312 && var4.field3077 >= 0 && var4.field3077 < 13312) {
                        var1.method950((byte) 121, class137.method1144(true, var4.field3115, var4.field3077, var1.field2752) - var1.field2755, var4.field3115, var4.field3077, class101.field2444);
                    }
                }
                var1.method946(class143.field3566, arg0 ^ 0xFFFFF4DC);
                class68.field1757.method38(class84.field2116, (int) var1.field2783, (int) var1.field2748, (int) var1.field2775, 60, var1, var1.field2758, -1, false);
            }
        }
        field1657++;
        if (arg0 != 2923) {
            method556(false, 84);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Ln;")
    public static final class93 method556(boolean arg0, int arg1) {
        field1654++;
        class93 var2 = (class93) class55.field1425.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class110.field2734.method903(3, (byte) -128, arg1);
        if (!arg0) {
            return null;
        }
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method764(new class57(var3), 119);
        }
        class55.field1425.method993((byte) 100, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)V")
    public static final void method557(int arg0, byte arg1) {
        field1676++;
        int[] var2 = class16.field429.field1686;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class81.field2028[arg0][var21][var5] & 0x18) == 0) {
                    class68.field1757.method60(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class81.field2028[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class68.field1757.method60(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class16.field429.method561();
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class81.field2028[arg0][var19][var8] & 0x18) == 0) {
                    class122.method1013(var8, arg0, var19, (byte) -55, var7, var6);
                }
                if (arg0 < 3 && (class81.field2028[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class122.method1013(var8, arg0 + 1, var19, (byte) -105, var7, var6);
                }
            }
        }
        class31.field746 = 0;
        if (arg1 < 83) {
            method552(40, (byte) 65);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class68.field1757.method76(class84.field2116, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class83.method717(6, var12).field378;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class86.field2143[class84.field2116].field820;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && var9 - 3 < var15 && (var16[var15 - 1][var14] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && (var16[var15 + 1][var14] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var18 == 2 && var14 > 0 && var14 > var10 - 3 && (var16[var15][var14 - 1] & 0x1280102) == 0) {
                                    var14--;
                                }
                                if (var18 == 3 && var14 < 103 && var14 < var10 + 3 && (var16[var15][var14 + 1] & 0x1280120) == 0) {
                                    var14++;
                                }
                            }
                        }
                        class119.field2931[class31.field746] = class72.field1820[var13];
                        class126.field3058[class31.field746] = var15;
                        class74.field1866[class31.field746] = var14;
                        class31.field746++;
                    }
                }
            }
        }
    }
}
