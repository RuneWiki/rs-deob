import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class96 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public int field1523 = 0;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "[[I")
    public int[][] field1525 = new int[6][258];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[B")
    public byte[] field1522 = new byte[256];

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "[I")
    public int[] field1531 = new int[16];

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[Z")
    public boolean[] field1542 = new boolean[16];

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "[I")
    public int[] field1548 = new int[6];

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "[Z")
    public boolean[] field1546 = new boolean[256];

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public int field1545 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[B")
    public byte[] field1520 = new byte[18002];

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "[I")
    public int[] field1553 = new int[257];

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "[[B")
    public byte[][] field1550 = new byte[6][258];

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "[B")
    public byte[] field1551 = new byte[4096];

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "[[I")
    public int[][] field1557 = new int[6][258];

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "[I")
    public int[] field1560 = new int[256];

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "[B")
    public byte[] field1541 = new byte[18002];

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "[[I")
    public int[][] field1561 = new int[6][258];

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field1538 = -1;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lce;")
    private static class126 field1535 = class206.method1445(-7923, " is already on your friend list)3");

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "Lce;")
    public static class126 field1544 = class206.method1445(-7923, "ondulation2:");

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Lce;")
    public static class126 field1530 = class206.method1445(-7923, "(U(Y");

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lce;")
    public static class126 field1529 = field1535;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Lce;")
    public static class126 field1556 = class206.method1445(-7923, "Kampfstufe: ");

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "B")
    public byte field1533;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public int field1524;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "[B")
    public byte[] field1527;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[B")
    public byte[] field1537;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method655(int arg0) {
        field1521++;
        int var1 = class243.field4116.length;
        int var2 = 0;
        if (arg0 != -105) {
            method657((byte) -128);
        }
        while (var2 < var1) {
            if (class243.field4116[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class30.field420; var4++) {
                    if (class226.field3811[var4] == class148.field2732[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class226.field3811[class30.field420] = class148.field2732[var2];
                    var3 = class30.field420++;
                }
                int var5 = 0;
                class134 var6 = new class134(class243.field4116[var2]);
                while (class243.field4116[var2].length > var6.field2299 && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method942(true);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = (class148.field2732[var2] >> 8) * 64 + var10 - class58.field914;
                    int var12 = var8 & 0x3F;
                    int var13 = (class148.field2732[var2] & 0xFF) * 64 + var12 - class138.field2473;
                    class304 var14 = class54.method344(var6.method942(true), (byte) -125);
                    if (class199.field3391[var7] == null && (var14.field5108 & 0x1) > 0 && class297.field4944 == var9 && var11 >= 0 && var14.field5109 + var11 < 104 && var13 >= 0 && (var14.field5109 + var13) < 104) {
                        class199.field3391[var7] = new class89();
                        class89 var15 = class199.field3391[var7];
                        class279.field4639[class30.field425++] = var7;
                        var15.field2447 = class249.field4174;
                        var15.method625(var14, 18);
                        var15.method1015(11380, var15.field1389.field5109);
                        var15.field2444 = var15.field2483 = class55.field838[var15.field1389.field5118];
                        var15.field2474 = var15.field1389.field5084;
                        var15.field2465 = var15.field1389.field5098;
                        var15.field2458 = var15.field1389.field5086;
                        var15.field2442 = var15.field1389.field5066;
                        var15.field2441 = var15.field1389.field5115;
                        var15.field2506 = var15.field1389.field5056;
                        if (var15.field2465 == 0) {
                            var15.field2483 = 0;
                        }
                        var15.field2496 = var15.field1389.field5054;
                        var15.field2494 = var15.field1389.field5068;
                        var15.method1008(true, var13, var11, var15.method1013(false), (byte) -40);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIBII)V", line = 138)
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1532++;
        if (arg6 >= 1 && arg7 >= 1 && arg6 <= 102 && arg7 <= 102) {
            if (!class22.method109(4096) && (class301.field4992[0][arg6][arg7] & 0x2) == 0) {
                int var8 = arg0;
                if ((class301.field4992[arg0][arg6][arg7] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class297.field4944 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (arg0 < 3 && (class301.field4992[1][arg6][arg7] & 0x2) == 2) {
                var9 = arg0 + 1;
            }
            class199.method1410((byte) -56, class94.field1475[arg0], arg6, var9, arg1, arg7, arg0);
            if (arg3 >= 0) {
                boolean var10 = class44.field677;
                class44.field677 = true;
                class52.method329(67, arg6, arg0, var9, class94.field1475[arg0], arg7, arg4, arg2, false, arg3, false);
                class44.field677 = var10;
            }
        }
        int var11 = 91 % ((arg5 - 28) / 34);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 191)
    public static void method657(byte arg0) {
        field1535 = null;
        field1530 = null;
        field1544 = null;
        if (arg0 < -72) {
            field1556 = null;
            field1529 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)V", line = 231)
    public static final void method658(byte arg0, int arg1) {
        field1526++;
        if (!class297.field4942) {
            arg1 = -1;
        }
        if (arg0 > -114) {
            field1530 = (class126) null;
        }
        if (class303.field5042 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class69 var2 = class103.method703(arg1, 33);
            class184 var3 = var2.method502(124);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class161.field2907.method1098(var3.method1317(), var3.field4597, var3.field4600, class24.field342, (byte) 76, new Point(var2.field1136, var2.field1145));
                class303.field5042 = arg1;
            }
        }
        if (arg1 == -1 && class303.field5042 != -1) {
            class161.field2907.method1098((int[]) null, -1, -1, class24.field342, (byte) 76, new Point());
            class303.field5042 = -1;
        }
    }
}
