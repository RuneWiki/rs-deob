import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class5 implements class63 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    private int field113 = 50;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Z")
    private boolean field140 = false;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lmb;")
    private class178 field121;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lmb;")
    private class178 field116;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Lw;")
    private class82 field139;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[S")
    private short[] field129;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[B")
    private byte[] field117;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[B")
    private byte[] field124;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "[Z")
    private boolean[] field125;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[Z")
    private boolean[] field136;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[B")
    private byte[] field123;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[Z")
    private boolean[] field115;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[Z")
    private boolean[] field111;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "[Z")
    private boolean[] field134;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "[B")
    private byte[] field130;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field114 = -1;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Lia;")
    public static class257 field132 = class28.method234(75, "runes");

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Lia;")
    public static class257 field137 = class28.method234(-58, "sl_arrows");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "Lmb;")
    public static class178 field131;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
    public final boolean method88(int arg0, boolean arg1) {
        field119++;
        if (this.field140 || this.field136[arg0]) {
            return true;
        } else {
            if (!arg1) {
                this.field111 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IZ)[I")
    public final int[] method89(int arg0, boolean arg1) {
        class50 var3 = this.method91(-193, arg0);
        if (!arg1) {
            this.method100(52, true);
        }
        field133++;
        return var3 == null ? null : var3.method393(this, this.field140 || this.field136[arg0], -27932, this.field121);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IFB)[I")
    public final int[] method90(int arg0, float arg1, byte arg2) {
        field138++;
        int var4 = -32 % ((arg2 - 69) / 39);
        class50 var5 = this.method91(-193, arg0);
        if (var5 == null) {
            return null;
        } else {
            var5.field1114 = true;
            return var5.method389(0, this.field121, this.field140 || this.field136[arg0], this, arg1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)Ldd;")
    private final class50 method91(int arg0, int arg1) {
        field135++;
        class50 var3 = (class50) this.field139.method615(false, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field116.method1197(0, arg1, -2);
        if (arg0 != -193) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            class152 var5 = new class152(var4);
            class50 var6 = new class50(var5);
            this.field139.method619((byte) 24, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BZZ)I")
    public static final int method92(byte arg0, boolean arg1, boolean arg2) {
        field127++;
        if (arg0 != 61) {
            method96(39, true);
        }
        int var3 = 0;
        if (arg2) {
            var3 += class80.field1566 + class32.field619;
        }
        if (arg1) {
            var3 += class138.field2459 + class115.field2067;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Z")
    public final boolean method93(int arg0, byte arg1) {
        if (arg1 < 67) {
            this.method91(63, 76);
        }
        field126++;
        return this.field111[arg0];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
    public final boolean method94(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method102(17, 47);
        }
        field141++;
        return this.field134[arg1];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method95(byte arg0) {
        field132 = null;
        field137 = null;
        field131 = null;
        int var1 = 35 % ((-arg0 - 26) / 53);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(IZ)Lp;")
    public static final class233 method96(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        class233 var2 = (class233) class239.field4104.method836(-92, (long) arg0);
        field110++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field542.method1197(class256.method1666(arg0, 2), class170.method1165((byte) 18, arg0), -2);
        class233 var4 = new class233();
        var4.field4019 = arg0;
        if (var3 != null) {
            var4.method1527(-1344, new class152(var3));
        }
        var4.method1534(-11484);
        if (!class90.field1727 && var4.field4000) {
            var4.field3987 = null;
        }
        if (var4.field3964) {
            var4.field4012 = false;
            var4.field4016 = 0;
        }
        class239.field4104.method832(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public final int method97(int arg0, int arg1) {
        field109++;
        if (arg1 != 65535) {
            method95((byte) -26);
        }
        return this.field129[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(IZ)Z")
    public final boolean method98(int arg0, boolean arg1) {
        field112++;
        if (arg1) {
            this.method100(36, false);
        }
        class50 var3 = this.method91(-193, arg0);
        return var3 == null ? false : var3.method391(this.field121, this, -1324762808);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public final void method99(int arg0) {
        this.field139.method614(0);
        field118++;
        if (arg0 != -24024) {
            this.field136 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(IZ)V")
    public final void method100(int arg0, boolean arg1) {
        this.field140 = arg1;
        if (arg0 <= -5) {
            this.method99(-24024);
            field120++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field128++;
        for (class103 var5 = (class103) class174.field2979.method288(26111); var5 != null; var5 = (class103) class174.field2979.method277(arg0 ^ 0x41)) {
            class96.method697(false, arg2, var5, arg4, arg3, arg1);
        }
        class103 var6 = (class103) class233.field3974.method288(26111);
        if (arg0 != 64) {
            return;
        }
        while (var6 != null) {
            byte var10 = 1;
            if (var6.field1917.field4170 == var6.field1917.field4165) {
                var10 = 0;
            } else if (var6.field1917.field4170 == var6.field1917.field4135) {
                var10 = 2;
            }
            if (var6.field1921 != var10) {
                int var11 = class199.method1339(var6.field1917, 56);
                if (var6.field1927 != var11) {
                    if (var6.field1913 != null) {
                        class78.field1504.method459(var6.field1913);
                        var6.field1913 = null;
                    }
                    var6.field1927 = var11;
                }
                var6.field1921 = var10;
            }
            var6.field1912 = var6.field1917.field4177;
            var6.field1926 = var6.field1917.field4128 * 64 + var6.field1917.field4177;
            var6.field1922 = var6.field1917.field4128 * 64 + var6.field1917.field4143;
            var6.field1932 = var6.field1917.field4143;
            class96.method697(false, arg2, var6, arg4, arg3, arg1);
            var6 = (class103) class233.field3974.method277(arg0 - 63);
        }
        for (class103 var7 = (class103) class79.field1553.method427((byte) 58); var7 != null; var7 = (class103) class79.field1553.method428(false)) {
            byte var8 = 1;
            if (var7.field1920.field4170 == var7.field1920.field4165) {
                var8 = 0;
            } else if (var7.field1920.field4170 == var7.field1920.field4135) {
                var8 = 2;
            }
            if (var7.field1921 != var8) {
                int var9 = class120.method846(0, var7.field1920);
                if (var7.field1927 != var9) {
                    if (var7.field1913 != null) {
                        class78.field1504.method459(var7.field1913);
                        var7.field1913 = null;
                    }
                    var7.field1927 = var9;
                }
                var7.field1921 = var8;
            }
            var7.field1912 = var7.field1920.field4177;
            var7.field1926 = var7.field1920.field4128 * 64 + var7.field1920.field4177;
            var7.field1922 = var7.field1920.field4143 + (var7.field1920.field4128 * 64);
            var7.field1932 = var7.field1920.field4143;
            class96.method697(false, arg2, var7, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(II)V")
    public final void method102(int arg0, int arg1) {
        if (arg1 < 118) {
            this.field123 = null;
        }
        for (class50 var3 = (class50) this.field139.method616((byte) -82); var3 != null; var3 = (class50) this.field139.method613((byte) 38)) {
            if (var3.field1114) {
                var3.method388((byte) -91, arg0);
                var3.field1114 = false;
            }
        }
        field122++;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lmb;Lmb;Lmb;IZ)V")
    public class5(class178 arg0, class178 arg1, class178 arg2, int arg3, boolean arg4) {
        this.field121 = arg2;
        this.field113 = arg3;
        this.field140 = arg4;
        this.field116 = arg0;
        this.field139 = new class82(this.field113);
        class152 var6 = new class152(arg1.method1197(0, 0, -2));
        int var7 = var6.method1063(-17162);
        this.field129 = new short[var7];
        this.field117 = new byte[var7];
        this.field124 = new byte[var7];
        this.field125 = new boolean[var7];
        this.field136 = new boolean[var7];
        this.field123 = new byte[var7];
        this.field115 = new boolean[var7];
        this.field111 = new boolean[var7];
        this.field134 = new boolean[var7];
        this.field130 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field115[var8] = var6.method1051((byte) 93) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field115[var9]) {
                this.field134[var9] = var6.method1051((byte) 86) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field115[var10]) {
                this.field111[var10] = var6.method1051((byte) 82) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field115[var11]) {
                this.field136[var11] = var6.method1051((byte) 112) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field115[var12]) {
                this.field125[var12] = var6.method1051((byte) -47) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field115[var13]) {
                this.field117[var13] = var6.method1060((byte) -58);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field115[var14]) {
                this.field123[var14] = var6.method1060((byte) -58);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field115[var15]) {
                this.field130[var15] = var6.method1060((byte) -58);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field115[var16]) {
                this.field124[var16] = var6.method1060((byte) -58);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field115[var17]) {
                this.field129[var17] = (short) var6.method1063(-17162);
            }
        }
    }
}
