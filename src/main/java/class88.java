import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class88 extends class207 {

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "[S")
    public static short[] field1750 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Ljd;")
    private static class86 field1761 = class122.method868(" has logged out)3", true);

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Ljd;")
    public static class86 field1753 = class122.method868("<col=00ff80>", true);

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Ljd;")
    public static class86 field1768 = field1761;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Luk;")
    public static class96 field1739 = new class96(64);

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "F")
    public static float field1769;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public int field1754;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Lc;")
    public class104 field1751;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lhe;")
    public class19 field1760;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Lkc;")
    public class266 field1762;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Ljf;")
    public class63 field1763;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/awt/Frame;")
    public static Frame field1746;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILqk;)V")
    public static final void method645(int arg0, class200 arg1) {
        if (arg0 != -23724) {
            method646(119, (class9[]) null, -90, 116, (byte[]) null, 109, -10, -80, 120, true, -45);
        }
        field1755++;
        while (true) {
            while (arg1.field3547.length > arg1.field3565) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1408((byte) -53) == 1) {
                    var3 = arg1.method1408((byte) -47);
                    var2 = true;
                    var4 = arg1.method1408((byte) -75);
                }
                int var5 = arg1.method1408((byte) -38);
                int var6 = arg1.method1408((byte) -120);
                int var7 = var5 * 64 - class90.field1847;
                int var8 = class38.field894 + class238.field4289 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class263.field4668 && class38.field894 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method1412((byte) 90);
                                if (var13 != 0) {
                                    if (class20.field518[var9][var10] == null) {
                                        class20.field518[var9][var10] = new byte[4096];
                                    }
                                    class20.field518[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1412((byte) 90);
                                    if (class116.field2207[var9][var10] == null) {
                                        class116.field2207[var9][var10] = new byte[4096];
                                    }
                                    class116.field2207[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1412((byte) 96);
                        if (var16 != 0) {
                            arg1.field3565++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[Lig;II[BIIIIZI)V")
    public static final void method646(int arg0, class9[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (!arg9) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((arg3 + var11) > 0 && (arg3 + var11) < 103 && arg5 + var12 > 0 && (arg5 + var12) < 103) {
                        arg1[arg2].field300[arg3 + var11][arg5 + var12] = class1.method5(arg1[arg2].field300[arg3 + var11][arg5 + var12], -16777217);
                    }
                }
            }
        }
        byte var13;
        if (arg9) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        field1744++;
        class200 var14 = new class200(arg4);
        for (int var15 = arg10; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg0 == var15 && var16 >= arg7 && var16 < arg7 + 8 && var17 >= arg6 && (arg6 + 8) > var17) {
                        class108.method768(arg3 + class177.method1248(var16 & 0x7, var17 & 0x7, arg8, -2), arg2, var14, 0, 0, arg9, arg8, 114, arg5 + class43.method344(0, var17 & 0x7, arg8, var16 & 0x7));
                    } else {
                        class108.method768(-1, 0, var14, 0, 0, arg9, 0, arg10 + 121, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final void method647(int arg0) {
        this.field1760 = null;
        this.field1763 = null;
        this.field1762 = null;
        field1740++;
        this.field1751 = null;
        if (arg0 != 0) {
            field1741 = -94;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1746 = null;
        int var1 = -34 % ((61 - arg0) / 49);
        field1768 = null;
        field1739 = null;
        field1750 = null;
        field1761 = null;
        field1753 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lqk;BI)Ljd;")
    public static final class86 method649(class200 arg0, byte arg1, int arg2) {
        field1756++;
        try {
            if (arg1 < 18) {
                method648(-46);
            }
            class86 var3 = new class86();
            var3.field1704 = arg0.method1402(20740);
            if (arg2 < var3.field1704) {
                var3.field1704 = arg2;
            }
            var3.field1670 = new byte[var3.field1704];
            arg0.field3565 += class181.field3254.method532(false, arg0.field3565, 0, var3.field1704, var3.field1670, arg0.field3547);
            return var3;
        } catch (Exception var4) {
            return class79.field1558;
        }
    }
}
