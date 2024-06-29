import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "[Lub;")
    public volatile class134[] field1787 = new class134[2];

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Z")
    public volatile boolean field1776 = false;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Z")
    public volatile boolean field1779 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Loc;")
    public static class99 field1763 = class48.method402((byte) -104, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Loc;")
    private static class99 field1767 = class48.method402((byte) -104, "To");

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
    public static boolean field1766 = false;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Loc;")
    private static class99 field1773 = class48.method402((byte) -104, "OFF");

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Loc;")
    public static class99 field1777 = field1773;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "[[I")
    public static int[][] field1780 = new int[104][104];

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Loc;")
    private static class99 field1783 = class48.method402((byte) -104, "Members object");

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Loc;")
    private static class99 field1785 = class48.method402((byte) -104, "Loaded interfaces");

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Loc;")
    public static class99 field1778 = field1767;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Loc;")
    public static class99 field1782 = field1785;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Loc;")
    public static class99 field1772 = field1783;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lse;")
    public static class126 field1770;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "[I")
    public static int[] field1781;

    @OriginalMember(owner = "client!ka", name = "run", descriptor = "()V")
    public final void run() {
        field1788++;
        this.field1779 = true;
        try {
            while (!this.field1776) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class134 var2 = this.field1787[var1];
                    if (var2 != null) {
                        var2.method1093(118);
                    }
                }
                class57.method509(-127, 10L);
                class86.method737(116, false);
            }
        } catch (Exception var4) {
            class72.method659(var4, (byte) 111, null);
        }
        this.field1779 = false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
    public static final void method601(int arg0, byte arg1) {
        field1768++;
        if (!class35.method306((byte) -30, arg0)) {
            return;
        }
        class54[] var2 = class132.field3230[arg0];
        int var3 = 0;
        if (arg1 <= 105) {
            method603((byte) -55);
        }
        while (var3 < var2.length) {
            class54 var4 = var2[var3];
            if (var4 != null) {
                var4.field1313 = 0;
                var4.field1280 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public static final void method602(int arg0, int arg1) {
        class55.field1410 = null;
        if (arg1 > -85) {
            return;
        }
        class87.field2168 = false;
        class127.field3086 = arg0;
        class142.field3512 = 0;
        class95.field2306 = -1;
        class80.field1989 = -1;
        class11.field259 = 1;
        field1771++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method603(byte arg0) {
        field1785 = null;
        field1763 = null;
        field1772 = null;
        field1773 = null;
        field1778 = null;
        field1783 = null;
        field1782 = null;
        field1781 = null;
        field1777 = null;
        field1770 = null;
        int var1 = 64 % ((61 - arg0) / 51);
        field1780 = null;
        field1767 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILhe;I)I")
    public static final int method604(int arg0, class54 arg1, int arg2) {
        field1769++;
        if (arg1.field1362 == null || arg1.field1362.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1362[arg2];
            int var4 = 0;
            byte var5 = 0;
            if (arg0 != 3) {
                return 100;
            }
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var9 = class130.field3196[var3[var6++]];
                }
                if (var7 == 2) {
                    var9 = class73.field1855[var3[var6++]];
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 3) {
                    var9 = class99.field2369[var3[var6++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class54 var12 = class63.method552(var11, (byte) 125);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class1.method2((byte) -128, var13).field3544 || class143.field3554)) {
                        for (int var14 = 0; var14 < var12.field1368.length; var14++) {
                            if (var13 + 1 == var12.field1368[var14]) {
                                var9 += var12.field1304[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class94.field2283[var3[var6++]];
                }
                if (var7 == 6) {
                    var9 = class100.field2434[class73.field1855[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class94.field2283[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = field1770.field3030;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class57.field1481[var15]) {
                            var9 += class73.field1855[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class54 var18 = class63.method552(var17, (byte) 126);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class1.method2((byte) 14, var19).field3544 || class143.field3554)) {
                        for (int var20 = 0; var20 < var18.field1368.length; var20++) {
                            if (var19 + 1 == var18.field1368[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class150.field3714;
                }
                if (var7 == 12) {
                    var9 = class101.field2463;
                }
                if (var7 == 13) {
                    int var21 = class94.field2283[var3[var6++]];
                    int var22 = var3[var6++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var9 = class100.method856(30957, var23);
                }
                if (var7 == 18) {
                    var9 = (field1770.field3115 >> 7) + class67.field1712;
                }
                if (var7 == 19) {
                    var9 = (field1770.field3077 >> 7) + class5.field120;
                }
                if (var7 == 20) {
                    var9 = var3[var6++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var4 += var9;
                    }
                    if (var5 == 1) {
                        var4 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var5 == 3) {
                        var4 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Z")
    public static final boolean method605(byte arg0, int arg1) {
        field1784++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            if (arg0 > -17) {
                method608(91);
            }
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/awt/Component;Lpc;Lpc;)V")
    public static final void method606(byte arg0, Component arg1, class105 arg2, class105 arg3) {
        field1764++;
        if (class145.field3626) {
            return;
        }
        class104.field2518 = class59.method531(503, false, 765, arg1);
        class104.field2518.method874((byte) 87);
        class96.method787();
        byte[] var4 = arg3.method900(0, class104.field2519, class109.field2703);
        class4.field70 = new class64(var4, arg1);
        class89.field2210 = class4.field70.method569();
        class143.field3567 = class91.method756(class109.field2703, (byte) -43, class83.field2051, arg2);
        class37.field939 = class91.method756(class109.field2703, (byte) -43, class21.field504, arg2);
        class59.field1592 = class91.method756(class109.field2703, (byte) -43, class55.field1421, arg2);
        class1.field20 = class72.method660(class109.field2703, class1.field24, (byte) -99, arg2);
        class59.field1580 = class72.method660(class109.field2703, class119.field2926, (byte) -108, arg2);
        class2.field43 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class2.field43[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class2.field43[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class2.field43[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class2.field43[var8 + 192] = 16777215;
        }
        class60.field1598 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class60.field1598[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class60.field1598[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class60.field1598[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class60.field1598[var12 + 192] = 16777215;
        }
        class80.field1982 = new int[256];
        if (arg0 > -90) {
            return;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class80.field1982[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class80.field1982[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class80.field1982[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class80.field1982[var16 + 192] = 16777215;
        }
        class52.field1236 = new int[32768];
        class16.field414 = new int[256];
        class52.field1254 = new int[32768];
        class100.method859(-713, null);
        class4.field72 = false;
        class53.field1257 = new int[32768];
        class109.field2702 = class109.field2703;
        if (class60.field1603 == 0) {
            class148.field3661 = true;
        } else {
            class148.field3661 = false;
        }
        class54.field1282 = new int[32768];
        class109.field2709 = class109.field2703;
        class121.field2950 = 0;
        if (class148.field3661) {
            method602(2, -96);
        } else {
            class61.method544((byte) 122, class109.field2703, class142.field3519, false, 2, class99.field2372, 255);
        }
        class61.method543(false, -73);
        class145.field3626 = true;
        class80.field1971 = true;
        class4.field70.method573(0, 0);
        class89.field2210.method573(382, 0);
        class143.field3567.method216(382 - class143.field3567.field569 / 2, 18);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static final void method607(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        if (arg0 != 1) {
            method608(5);
        }
        field1774++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method608(int arg0) {
        field1786++;
        if (arg0 < 116) {
            method608(-41);
        }
        for (int var1 = 0; var1 < class141.field3493; var1++) {
            int var2 = class126.field3041[var1];
            class126 var3 = class59.field1571[var2];
            int var4 = class39.field965.method510(-113);
            if ((var4 & 0x2) != 0) {
                var4 += class39.field965.method510(-109) << 8;
            }
            class145.method1192(var3, var2, var4, -116);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)I")
    public static int method609(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
