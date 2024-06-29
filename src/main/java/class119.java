import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class119 extends class240 implements class284 {

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Z")
    private boolean field1685 = false;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    private int field1699 = 50;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Leh;")
    private class137 field1697;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Leh;")
    private class137 field1691;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lj;")
    private class209 field1693;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lj;")
    private class209 field1679;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
    public static int[] field1682 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1694 = "Loading wordpack - ";

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "[Lib;")
    public static class56[] field1702;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
    public static final void method766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 1) {
            method766(-94, -61, 36, 22, -83, -66);
        }
        if (class132.field2105 >= arg5 && arg4 >= class117.field1656) {
            boolean var6;
            if (class116.field1653 > arg3) {
                var6 = false;
                arg3 = class116.field1653;
            } else if (class114.field1634 < arg3) {
                var6 = false;
                arg3 = class114.field1634;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg1 < class116.field1653) {
                var7 = false;
                arg1 = class116.field1653;
            } else if (arg1 <= class114.field1634) {
                var7 = true;
            } else {
                arg1 = class114.field1634;
                var7 = false;
            }
            if (arg5 >= class117.field1656) {
                class78.method433(arg1, arg3, class14.field186[arg5++], arg0, (byte) 123);
            } else {
                arg5 = class117.field1656;
            }
            if (arg4 <= class132.field2105) {
                class78.method433(arg1, arg3, class14.field186[arg4--], arg0, (byte) 123);
            } else {
                arg4 = class132.field2105;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg4; var8++) {
                    int[] var9 = class14.field186[var8];
                    var9[arg3] = var9[arg1] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg5; var10 <= arg4; var10++) {
                    class14.field186[var10][arg3] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg5; var11 <= arg4; var11++) {
                    class14.field186[var11][arg1] = arg0;
                }
            }
        }
        field1700++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public final void method767(int arg0) {
        this.field1693.method1466((byte) 116);
        field1692++;
        if (this.field1679 != null) {
            this.field1679.method1466((byte) 108);
        }
        int var2 = 69 % ((arg0 + 35) / 36);
        class97.field1290 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwb;Z)Ljava/lang/String;")
    public static final String method768(class123 arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field1684++;
        if (client.method735(arg0).method1171(-115) == 0) {
            return null;
        } else if (arg0.field1863 == null || arg0.field1863.trim().length() == 0) {
            return class60.field764 ? "Hidden-use" : null;
        } else {
            return arg0.field1863;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFIIZ)Lnf;")
    public final class227 method769(int arg0, float arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 != -4) {
            field1682 = null;
        }
        field1696++;
        class97 var6 = this.method773(2, arg0);
        if (var6 != null && var6.method599(this, this.field1691)) {
            return arg4 ? var6.field1293.method413(true, arg2, arg2, false, this.field1691, this, (double) arg1) : var6.field1293.method414(arg2, arg2, this, 255, this.field1691, false, (double) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
    public final boolean method770(int arg0, byte arg1) {
        field1681++;
        if (arg1 != 20) {
            this.field1693 = null;
        }
        return this.method34(25412, arg0).field1002;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
    public static void method771(byte arg0) {
        if (arg0 != -120) {
            method766(-100, 48, -9, -9, 22, -84);
        }
        field1694 = null;
        field1682 = null;
        field1702 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFB)[I")
    public final int[] method772(int arg0, float arg1, byte arg2) {
        class97 var4 = this.method773(2, arg0);
        field1687++;
        if (var4 == null) {
            return null;
        } else {
            int var5 = -102 / ((arg2 + 72) / 43);
            var4.field1288 = true;
            return var4.method600(this, this.field1691, arg1, this.field1685 || this.method34(25412, arg0).field1005);
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(II)Lfc;")
    private final class97 method773(int arg0, int arg1) {
        field1680++;
        class97 var3 = (class97) this.field1693.method1469(arg0 + 8286, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1697.method928(arg1, (byte) 110, 0);
        if (arg0 != 2) {
            this.field1691 = null;
        }
        if (var4 == null) {
            return null;
        } else {
            class97 var5 = new class97(new class96(var4));
            this.field1693.method1467((byte) -119, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)Lsa;")
    public final class73 method774(int arg0, boolean arg1) {
        field1686++;
        if (arg1) {
            this.method779(-12, 120);
        }
        class97 var3 = this.method773(2, arg0);
        return var3 == null ? null : var3.field1293;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)V")
    public final void method775(boolean arg0, boolean arg1) {
        if (!arg0) {
            method766(112, -22, 119, 103, 120, 99);
        }
        field1689++;
        this.field1685 = arg1;
        this.method767(42);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z")
    public final boolean method776(int arg0, int arg1) {
        if (arg1 != 65535) {
            this.field1697 = null;
        }
        field1688++;
        return this.field1685 || this.method34(25412, arg0).field1005;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Leh;Leh;Leh;IZ)V")
    public class119(class137 arg0, class137 arg1, class137 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1697 = arg0;
        this.field1685 = arg4;
        this.field1691 = arg2;
        this.field1699 = arg3;
        this.field1693 = new class209(this.field1699);
        this.field1679 = null;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)Lpd;")
    public static final class96 method777(byte arg0) {
        field1690++;
        class96 var1 = new class96(34);
        var1.method580((byte) 97, 11);
        var1.method580((byte) 115, class32.field430);
        var1.method580((byte) 82, class52.field674 ? 1 : 0);
        if (arg0 != 31) {
            field1682 = null;
        }
        var1.method580((byte) 123, class137.field2207 ? 1 : 0);
        var1.method580((byte) 101, class96.field1281 ? 1 : 0);
        var1.method580((byte) 81, class98.field1321 ? 1 : 0);
        var1.method580((byte) 103, class259.field4204 ? 1 : 0);
        var1.method580((byte) 92, class285.field4525 ? 1 : 0);
        var1.method580((byte) 104, class196.field3131 ? 1 : 0);
        var1.method580((byte) 120, class113.field1624 ? 1 : 0);
        var1.method580((byte) 111, class160.field2549);
        var1.method580((byte) 99, class213.field3429 ? 1 : 0);
        var1.method580((byte) 120, class82.field1021 ? 1 : 0);
        var1.method580((byte) 88, class39.field486 ? 1 : 0);
        var1.method580((byte) 61, class194.field3109);
        var1.method580((byte) 78, class212.field3405 ? 1 : 0);
        var1.method580((byte) 97, class272.field4350);
        var1.method580((byte) 120, class218.field3493);
        var1.method580((byte) 99, class63.field818);
        var1.method572(true, class98.field1315);
        var1.method572(true, class138.field2213);
        var1.method580((byte) 105, class268.method1799());
        var1.method574(class74.field933, -1);
        var1.method580((byte) 71, class67.field855);
        var1.method580((byte) 70, class272.field4348 ? 1 : 0);
        var1.method580((byte) 124, class129.field2065 ? 1 : 0);
        var1.method580((byte) 127, class95.field1201);
        var1.method580((byte) 107, class71.field905 ? 1 : 0);
        var1.method580((byte) 123, class85.field1050 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IB)V")
    public final void method778(int arg0, byte arg1) {
        if (arg1 != 58) {
            method780((byte) 13);
        }
        field1701++;
        for (class97 var3 = (class97) this.field1693.method1471(arg1 - 64); var3 != null; var3 = (class97) this.field1693.method1472((byte) 108)) {
            if (var3.field1288) {
                var3.method601(arg0);
                var3.field1288 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
    public final int method779(int arg0, int arg1) {
        if (arg0 == -7078) {
            field1695++;
            return this.method34(arg0 + 32490, arg1).field1006 & 0xFFFF;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)V")
    public static final void method780(byte arg0) {
        if (arg0 != 96) {
            field1682 = null;
        }
        if (class238.field3933 < 128.0F) {
            class238.field3933 = 128.0F;
        }
        field1683++;
        int var1 = class83.field1031 >> 7;
        int var2 = class200.field3172 >> 7;
        if (class238.field3933 > 383.0F) {
            class238.field3933 = 383.0F;
        }
        while (class226.field3639 >= 2048.0F) {
            class226.field3639 -= 2048.0F;
        }
        while (class226.field3639 < 0.0F) {
            class226.field3639 += 2048.0F;
        }
        int var3 = class166.method1148(class244.field4011, class200.field3172, class83.field1031, (byte) -121);
        int var4 = 0;
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= (var2 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class244.field4011;
                    if (var7 < 3 && (class117.field1664[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 + ((class204.field3214[var7][var5][var6] & 0xFF) * 8) - class17.field209[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class171.field2706) {
            class171.field2706 += (var9 - class171.field2706) / 24;
        } else if (var9 < class171.field2706) {
            class171.field2706 += (var9 - class171.field2706) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)Z")
    public final boolean method781(int arg0, int arg1) {
        if (arg0 != 19146) {
            this.method774(54, true);
        }
        field1698++;
        return !this.method34(25412, arg1).field1003;
    }
}
