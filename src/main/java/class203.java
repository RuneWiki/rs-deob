import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class203 implements class304 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Z")
    private boolean field3184 = false;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    private int field3212 = 50;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "Lja;")
    private class64 field3215;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Lja;")
    private class64 field3211;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lj;")
    private class285 field3185;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lj;")
    private class285 field3183;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[Z")
    private boolean[] field3201;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "[Z")
    private boolean[] field3188;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "[Z")
    private boolean[] field3218;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "[S")
    private short[] field3200;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "[Z")
    private boolean[] field3204;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[Z")
    private boolean[] field3187;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "[B")
    private byte[] field3216;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "[B")
    private byte[] field3195;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[B")
    private byte[] field3190;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "[B")
    private byte[] field3213;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[C")
    public static char[] field3197 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Lcn;")
    public static class267 field3192 = new class267(0, 0);

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
    public static int[] field3226 = new int[5];

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)[I", line = 6)
    public final int[] method1465(int arg0, byte arg1) {
        class223 var3 = this.method1484(127, arg0);
        int var4 = -87 / ((-arg1 - 24) / 51);
        field3220++;
        return var3 == null ? null : var3.method1622((byte) 114, this, this.field3215, this.field3184 || this.field3204[arg0]);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)Z", line = 20)
    public final boolean method1466(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field3216 = (byte[]) null;
        }
        field3186++;
        return this.field3187[arg1];
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1467(int arg0) {
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class270.field4203[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class65.field1058; var3++) {
            class30 var4 = class82.field1228[class149.field2398[var3]];
            if (var4 != null) {
                var4.field1437 = false;
            }
        }
        if (arg0 != -12436) {
            method1479(47, 76);
        }
        for (int var5 = 0; var5 < class77.field1173; var5++) {
            class305 var6 = class138.field2196[class145.field2279[var5]];
            if (var6 != null) {
                var6.field1437 = false;
            }
        }
        field3207++;
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(II)Lni;", line = 88)
    private final class24 method1468(int arg0, int arg1) {
        field3198++;
        class24 var3 = (class24) this.field3183.method2017(1022, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        if (arg0 >= -21) {
            this.method1475(114, -84);
        }
        class24 var4 = new class24(this.field3200[arg1] & 0xFFFF);
        this.field3183.method2018((long) arg1, var4, -127);
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)V", line = 113)
    public final void method1469(int arg0, byte arg1) {
        boolean var3 = false;
        class308.method2132(this.field3195[arg0] & 0xFF, (byte) -28, this.field3216[arg0] & 0xFF);
        field3208++;
        class223 var4 = this.method1484(127, arg0);
        if (var4 != null) {
            var3 = var4.method1620(this, this.field3215, 3, this.field3184 || this.field3204[arg0]);
        }
        if (arg1 >= -31) {
            this.method1483(true, 90);
        }
        if (!var3) {
            class24 var5 = this.method1468(-70, arg0);
            var5.method168(-97);
        }
    }

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "(II)V", line = 141)
    public final void method1470(int arg0, int arg1) {
        field3219++;
        this.field3212 = arg0;
        this.field3185 = new class285(this.field3212);
        if (class265.field4126) {
            this.field3183 = new class285(this.field3212);
        } else {
            this.field3183 = null;
        }
        if (arg1 != 0) {
            this.method1478(-128, 7);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I", line = 159)
    public final int method1471(byte arg0, int arg1) {
        int var3 = 50 / ((arg0 + 12) / 37);
        field3199++;
        return this.field3213[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 169)
    public final void method1472(int arg0) {
        if (arg0 <= 56) {
            this.method1470(36, 118);
        }
        this.field3185.method2019((byte) 107);
        field3206++;
        if (this.field3183 != null) {
            this.field3183.method2019((byte) -14);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZF)[I", line = 185)
    public final int[] method1473(int arg0, boolean arg1, float arg2) {
        field3202++;
        class223 var4 = this.method1484(127, arg0);
        if (arg1) {
            return (int[]) null;
        } else if (var4 == null) {
            return null;
        } else {
            var4.field3582 = true;
            return var4.method1624(arg2, this.field3215, (byte) 95, this.field3184 || this.field3204[arg0], this);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Z", line = 204)
    public final boolean method1474(int arg0, byte arg1) {
        field3193++;
        if (this.field3184 || this.field3204[arg0]) {
            return true;
        } else {
            if (arg1 != 64) {
                this.method1480(-91, (byte) -37);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(II)Z", line = 219)
    public final boolean method1475(int arg0, int arg1) {
        if (arg1 < 19) {
            this.field3188 = (boolean[]) null;
        }
        field3210++;
        return this.field3188[arg0];
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)I", line = 237)
    public final int method1476(int arg0, int arg1) {
        if (arg0 != 65535) {
            field3225 = -128;
        }
        field3224++;
        return this.field3200[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 249)
    public static void method1477(int arg0) {
        field3192 = null;
        if (arg0 == 54) {
            field3226 = null;
            field3197 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(II)I", line = 261)
    public final int method1478(int arg0, int arg1) {
        if (arg0 != 255) {
            this.field3211 = (class64) null;
        }
        field3217++;
        return this.field3195[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(II)I", line = 277)
    public static final int method1479(int arg0, int arg1) {
        if (arg1 == 261782) {
            field3203++;
            return (arg0 & 0x3FE96) >> 11;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lja;Lja;Lja;IZ)V", line = 435)
    public class203(class64 arg0, class64 arg1, class64 arg2, int arg3, boolean arg4) {
        this.field3215 = arg2;
        this.field3211 = arg0;
        this.field3212 = arg3;
        this.field3184 = arg4;
        this.field3185 = new class285(this.field3212);
        if (class265.field4126) {
            this.field3183 = new class285(this.field3212);
        } else {
            this.field3183 = null;
        }
        class101 var6 = new class101(arg1.method467(0, 108, 0));
        int var7 = var6.method731(false);
        this.field3201 = new boolean[var7];
        this.field3188 = new boolean[var7];
        this.field3218 = new boolean[var7];
        this.field3200 = new short[var7];
        this.field3204 = new boolean[var7];
        this.field3187 = new boolean[var7];
        this.field3216 = new byte[var7];
        this.field3195 = new byte[var7];
        this.field3190 = new byte[var7];
        this.field3213 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3218[var8] = var6.method741(66) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3218[var9]) {
                this.field3201[var9] = var6.method741(13) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3218[var10]) {
                this.field3187[var10] = var6.method741(28) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3218[var11]) {
                this.field3204[var11] = var6.method741(48) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3218[var12]) {
                this.field3188[var12] = var6.method741(73) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3218[var13]) {
                this.field3190[var13] = var6.method727((byte) 111);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3218[var14]) {
                this.field3213[var14] = var6.method727((byte) 121);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3218[var15]) {
                this.field3195[var15] = var6.method727((byte) 113);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3218[var16]) {
                this.field3216[var16] = var6.method727((byte) 120);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3218[var17]) {
                this.field3200[var17] = (short) var6.method731(false);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IB)V", line = 293)
    public final void method1480(int arg0, byte arg1) {
        field3221++;
        for (class223 var3 = (class223) this.field3185.method2022(1); var3 != null; var3 = (class223) this.field3185.method2024(false)) {
            if (var3.field3582) {
                var3.method1619(14530, arg0);
                var3.field3582 = false;
            }
        }
        if (arg1 > -18) {
            this.field3185 = (class285) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I", line = 318)
    public final int method1481(int arg0, int arg1) {
        if (arg1 != -23794) {
            field3226 = (int[]) null;
        }
        field3205++;
        return this.field3190[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V", line = 331)
    public final void method1482(int arg0, boolean arg1) {
        if (arg0 < -23) {
            field3214++;
            this.field3184 = arg1;
            this.method1472(111);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)I", line = 348)
    public final int method1483(boolean arg0, int arg1) {
        if (arg0) {
            return -65;
        } else {
            field3194++;
            return this.field3216[arg1] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(II)Lkf;", line = 372)
    private final class223 method1484(int arg0, int arg1) {
        field3196++;
        class223 var3 = (class223) this.field3185.method2017(1022, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3211.method467(0, 85, arg1);
        if (arg0 < 126) {
            this.field3185 = (class285) null;
        }
        if (var4 == null) {
            return null;
        } else {
            class101 var5 = new class101(var4);
            class223 var6 = new class223(var5);
            this.field3185.method2018((long) arg1, var6, -86);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)Z", line = 406)
    public final boolean method1485(byte arg0, int arg1) {
        if (arg0 < 66) {
            this.field3184 = true;
        }
        field3191++;
        class223 var3 = this.method1484(127, arg1);
        return var3 == null ? false : var3.method1621(-125, this.field3215, this);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z", line = 422)
    public final boolean method1486(int arg0, int arg1) {
        field3209++;
        int var3 = -102 / ((-arg0 - 52) / 54);
        return this.field3201[arg1];
    }
}
