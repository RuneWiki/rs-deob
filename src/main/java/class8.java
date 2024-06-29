import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 implements class221 {

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    private int field169 = 50;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Z")
    private boolean field144 = false;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lue;")
    private class86 field167;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lue;")
    private class86 field153;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lsb;")
    private class216 field160;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lsb;")
    private class216 field161;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[B")
    private byte[] field157;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "[B")
    private byte[] field159;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[Z")
    private boolean[] field148;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[Z")
    private boolean[] field147;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[B")
    private byte[] field143;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "[B")
    private byte[] field178;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[S")
    private short[] field168;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "[Z")
    private boolean[] field170;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[Z")
    private boolean[] field162;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[Z")
    private boolean[] field155;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Loh;")
    public static class263 field146 = null;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[Lsi;")
    public static class194[] field142 = new class194[2048];

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Loh;")
    public static class263 field164 = class253.method1681(-117, "; Max)2Age=");

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "Loh;")
    public static class263 field173 = class253.method1681(-128, "scrollbar");

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "[I")
    public static int[] field171;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public final void method49(boolean arg0, int arg1) {
        field141++;
        if (arg1 != 24722) {
            this.field167 = null;
        }
        this.field144 = arg0;
        this.method50(1);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.field160.method1470((byte) 45);
        if (this.field161 != null) {
            this.field161.method1470((byte) 45);
        }
        field145++;
        if (arg0 != 1) {
            this.field162 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(II)Loh;")
    public static final class263 method51(int arg0, int arg1) {
        field165++;
        class263 var2 = class136.method891(-111, arg0);
        int var3 = var2.method1740(-124) - 3;
        if (arg1 >= -103) {
            field164 = null;
        }
        while (var3 > 0) {
            var2 = class124.method797(-119, new class263[] { var2.method1763(-127, var3, 0), class245.field4315, var2.method1787(var3, false) });
            var3 -= 3;
        }
        if (var2.method1740(-124) > 9) {
            return class124.method797(-67, new class263[] { class277.field4842, var2.method1763(-117, var2.method1740(-126) - 8, 0), class189.field3396, class101.field1919, var2, class122.field2272 });
        } else if (var2.method1740(-128) > 6) {
            return class124.method797(-77, new class263[] { class89.field1770, var2.method1763(-119, var2.method1740(-123) - 4, 0), class168.field3099, class101.field1919, var2, class122.field2272 });
        } else {
            return class124.method797(-80, new class263[] { class70.field1420, var2, class91.field1800 });
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)Z")
    public final boolean method52(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method63(-66, -94);
        }
        field177++;
        return this.field170[arg0];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        field156++;
        class44 var3 = this.method62(arg1, (byte) -55);
        if (arg0 >= -51) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return var3.method269(this, this.field144 || this.field155[arg1], this.field153, 64);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public static void method54(int arg0) {
        field164 = null;
        field171 = null;
        field173 = null;
        if (arg0 != 6950) {
            method55(1, 35);
        }
        field142 = null;
        field146 = null;
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(II)Lpc;")
    public static final class21 method55(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        field163++;
        int var3 = arg1 & arg0;
        if (class164.field2974[var2] == null || class164.field2974[var2][var3] == null) {
            boolean var4 = class166.method1090((byte) -125, var2);
            if (!var4) {
                return null;
            }
        }
        return class164.field2974[var2][var3];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIBII[BIZ[Lpg;)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, byte[] arg7, int arg8, boolean arg9, class73[] arg10) {
        byte var11;
        if (arg9) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg9) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg2 + var12 > 0 && (arg2 + var12) < 103 && arg1 + var13 > 0 && (arg1 + var13) < 103) {
                        arg10[arg0].field1527[arg2 + var12][arg1 + var13] = class263.method1777(arg10[arg0].field1527[arg2 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        field151++;
        if (arg4 != -19) {
            method55(37, 57);
        }
        class194 var14 = new class194(arg7);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg3 == var15 && arg8 <= var16 && arg8 + 8 > var16 && var17 >= arg5 && var17 < (arg5 + 8)) {
                        class78.method534(var14, arg0, 0, class136.method887(var17 & 0x7, var16 & 0x7, -126, arg6) + arg2, true, arg6, 0, class222.method1509(var16 & 0x7, (byte) 66, arg6, var17 & 0x7) + arg1, arg9);
                    } else {
                        class78.method534(var14, 0, 0, -1, true, 0, 0, -1, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(FBI)[I")
    public final int[] method57(float arg0, byte arg1, int arg2) {
        field174++;
        if (arg1 != -86) {
            this.field144 = true;
        }
        class44 var4 = this.method62(arg2, (byte) -109);
        if (var4 == null) {
            return null;
        } else {
            var4.field957 = true;
            return var4.method266(this, arg0, this.field153, 31, this.field144 || this.field155[arg2]);
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(II)V")
    public final void method58(int arg0, int arg1) {
        int var3 = 108 % ((arg1 - 27) / 49);
        for (class44 var4 = (class44) this.field160.method1461(64); var4 != null; var4 = (class44) this.field160.method1468(-57)) {
            if (var4.field957) {
                var4.method267(arg0, -1);
                var4.field957 = false;
            }
        }
        field175++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)Z")
    public final boolean method59(int arg0, boolean arg1) {
        field152++;
        if (arg1) {
            this.field157 = null;
        }
        return this.field144 || this.field155[arg0];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
    public final int method60(int arg0, int arg1) {
        field172++;
        if (arg0 != 65535) {
            field142 = null;
        }
        return this.field168[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)Z")
    public final boolean method61(int arg0, int arg1) {
        field154++;
        class44 var3 = this.method62(arg1, (byte) 105);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 >= -40) {
                this.method52(-52, -10);
            }
            return var3.method272(this, this.field153, Integer.MAX_VALUE);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Lrh;")
    private final class44 method62(int arg0, byte arg1) {
        field150++;
        class44 var3 = (class44) this.field160.method1464((byte) 41, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field167.method596(17, arg0, 0);
        if (var4 == null) {
            return null;
        }
        int var5 = 52 / ((arg1 - 52) / 53);
        class194 var6 = new class194(var4);
        class44 var7 = new class44(var6);
        this.field160.method1472((byte) -29, (long) arg0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)Z")
    public final boolean method63(int arg0, int arg1) {
        field166++;
        if (arg0 != 65535) {
            method54(-33);
        }
        return this.field162[arg1];
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lue;Lue;Lue;IZ)V")
    public class8(class86 arg0, class86 arg1, class86 arg2, int arg3, boolean arg4) {
        this.field169 = arg3;
        this.field167 = arg0;
        this.field153 = arg2;
        this.field144 = arg4;
        this.field160 = new class216(this.field169);
        this.field161 = null;
        class194 var6 = new class194(arg1.method596(-121, 0, 0));
        int var7 = var6.method1294((byte) 3);
        this.field157 = new byte[var7];
        this.field159 = new byte[var7];
        this.field148 = new boolean[var7];
        this.field147 = new boolean[var7];
        this.field143 = new byte[var7];
        this.field178 = new byte[var7];
        this.field168 = new short[var7];
        this.field170 = new boolean[var7];
        this.field162 = new boolean[var7];
        this.field155 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field148[var8] = var6.method1301(-8317) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field148[var9]) {
                this.field170[var9] = var6.method1301(-8317) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field148[var10]) {
                this.field162[var10] = var6.method1301(-8317) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field148[var11]) {
                this.field155[var11] = var6.method1301(-8317) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field148[var12]) {
                this.field147[var12] = var6.method1301(-8317) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field148[var13]) {
                this.field157[var13] = var6.method1281((byte) 126);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field148[var14]) {
                this.field178[var14] = var6.method1281((byte) -17);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field148[var15]) {
                this.field159[var15] = var6.method1281((byte) -106);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field148[var16]) {
                this.field143[var16] = var6.method1281((byte) 126);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field148[var17]) {
                this.field168[var17] = (short) var6.method1294((byte) 3);
            }
        }
    }
}
