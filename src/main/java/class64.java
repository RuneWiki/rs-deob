import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 extends class96 {

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public int field1612 = -1;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public int field1629 = 0;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lwb;")
    public static class130 field1615 = class26.method212("rot:", -32376);

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Lwb;")
    private static class130 field1616 = class26.method212(" from your friend list first", -32376);

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lwb;")
    public static class130 field1617 = class26.method212("::noclip", -32376);

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lwb;")
    public static class130 field1618 = class26.method212("::fpson", -32376);

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lwb;")
    private static class130 field1620 = class26.method212("Enter your username (V password)3", -32376);

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Lwb;")
    private static class130 field1625 = class26.method212("To create a new account you need to", -32376);

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lwb;")
    public static class130 field1636 = field1616;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "Lwb;")
    public static class130 field1630 = field1625;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lwb;")
    public static class130 field1638 = field1620;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "[I")
    public static int[] field1639 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Z")
    public static boolean field1640 = false;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "Lwb;")
    public static class130 field1641 = class26.method212("invback", -32376);

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field1635 = 0;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "Lmc;")
    public static class75 field1634;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "[I")
    public static int[] field1626;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(La;I)V", line = 46)
    public static final void method527(class1 arg0, int arg1) {
        field1624++;
        class88.field2103 = arg0;
        if (arg1 != 0) {
            method528(-50, 29, null, -28);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILk;I)Lqd;", line = 60)
    public static final class100 method528(int arg0, int arg1, class60 arg2, int arg3) {
        field1613++;
        if (arg1 == 10583) {
            return class24.method210(arg2, (byte) 127, arg0, arg3) ? class58.method478(14858) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V", line = 90)
    public static final void method529(int arg0, boolean arg1) {
        if (arg0 != -5) {
            method530(-106);
        }
        field1633++;
        class23.field671 = arg1;
        if (!class23.field671) {
            int var25 = (class65.field1661 - class67.field1682.field1057) / 16;
            class132.field3201 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class132.field3201[var26][var37] = class67.field1682.method348(0);
                }
            }
            int var27 = class67.field1682.method337((byte) 13);
            int var28 = class67.field1682.method351((byte) -104);
            int var29 = class67.field1682.method346(arg0 ^ 0x7FFB);
            int var30 = class67.field1682.method337((byte) 13);
            int var31 = class67.field1682.method365((byte) -124);
            class53.field1388 = new int[var25];
            class72.field1851 = new byte[var25][];
            class29.field799 = new int[var25];
            class108.field2608 = new int[var25];
            boolean var32 = false;
            class24.field699 = new byte[var25][];
            int var33 = 0;
            if ((var27 / 8 == 48 || var27 / 8 == 49) && (var29 / 8) == 48) {
                var32 = true;
            }
            if (var27 / 8 == 48 && var29 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var27 - 6) / 8; var34 <= (var27 + 6) / 8; var34++) {
                for (int var35 = (var29 - 6) / 8; var35 <= (var29 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class108.field2608[var33] = var36;
                        class29.field799[var33] = field1634.method507(class15.method114(new class130[] { class93.field2247, class109.method831(var34, 10), class111.field2723, class109.method831(var35, arg0 + 15) }, -20349), -1);
                        class53.field1388[var33] = field1634.method507(class15.method114(new class130[] { class63.field1604, class109.method831(var34, 10), class111.field2723, class109.method831(var35, 10) }, -20349), -1);
                        var33++;
                    }
                }
            }
            class112.method861(var27, var29, var28, -15, var30, var31);
            return;
        }
        int var2 = class67.field1682.method333(0);
        int var3 = class67.field1682.method346(-32768);
        int var4 = class67.field1682.method346(arg0 - 32763);
        class67.field1682.method723((byte) -104);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class67.field1682.method721(1, (byte) -110);
                    if (var24 == 1) {
                        class58.field1464[var5][var22][var23] = class67.field1682.method721(26, (byte) -126);
                    } else {
                        class58.field1464[var5][var22][var23] = -1;
                    }
                }
            }
        }
        class67.field1682.method730(-1);
        int var6 = (class65.field1661 - class67.field1682.field1057) / 16;
        class132.field3201 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class132.field3201[var7][var21] = class67.field1682.method348(0);
            }
        }
        int var8 = class67.field1682.method337((byte) 13);
        int var9 = class67.field1682.method337((byte) 13);
        class24.field699 = new byte[var6][];
        class29.field799 = new int[var6];
        class108.field2608 = new int[var6];
        class72.field1851 = new byte[var6][];
        class53.field1388 = new int[var6];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class58.field1464[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class108.field2608[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class108.field2608[var10] = var17;
                            int var19 = var17 & 0xFF;
                            int var20 = var17 >> 8 & 0xFF;
                            class29.field799[var10] = field1634.method507(class15.method114(new class130[] { class93.field2247, class109.method831(var20, 10), class111.field2723, class109.method831(var19, arg0 + 15) }, -20349), arg0 + 4);
                            class53.field1388[var10] = field1634.method507(class15.method114(new class130[] { class63.field1604, class109.method831(var20, 10), class111.field2723, class109.method831(var19, arg0 + 15) }, class111.method854(arg0, 20344)), arg0 + 4);
                            var10++;
                        }
                    }
                }
            }
        }
        class112.method861(var4, var3, var8, arg0 ^ 0xFFFFFFB8, var9, var2);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 359)
    public static void method530(int arg0) {
        field1636 = null;
        field1634 = null;
        field1638 = null;
        field1615 = null;
        field1617 = null;
        field1641 = null;
        field1630 = null;
        field1639 = null;
        if (arg0 >= -27) {
            return;
        }
        field1626 = null;
        field1616 = null;
        field1618 = null;
        field1620 = null;
        field1625 = null;
    }
}
