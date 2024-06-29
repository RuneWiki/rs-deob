import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class287 {

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field4543 = 0;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Lwc;")
    public static class236 field4533 = new class236();

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public int field4547;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Lpa;")
    public static class220 field4541;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Laj;")
    public class48 field4538;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
    public int[] field4527;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "[I")
    public int[] field4536;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "[I")
    public int[] field4539;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[I")
    public int[] field4540;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "[I")
    public int[] field4544;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "[I")
    public int[] field4545;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "[Laj;")
    public class48[] field4529;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "[[B")
    public static byte[][] field4548;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "[[I")
    public int[][] field4526;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[[I")
    public int[][] field4534;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([BZ)V")
    private final void method1931(byte[] arg0, boolean arg1) {
        field4531++;
        class224 var3 = new class224(class77.method496(arg0, 93));
        int var4 = var3.method1453((byte) -128);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4547 = 0;
        } else {
            this.field4547 = var3.method1483((byte) 46);
        }
        int var5 = var3.method1453((byte) -128);
        this.field4549 = var3.method1445(false);
        int var6 = 0;
        int var7 = -1;
        this.field4539 = new int[this.field4549];
        for (int var8 = 0; var8 < this.field4549; var8++) {
            this.field4539[var8] = var6 += var3.method1445(false);
            if (this.field4539[var8] > var7) {
                var7 = this.field4539[var8];
            }
        }
        this.field4532 = var7 + 1;
        this.field4544 = new int[this.field4532];
        this.field4545 = new int[this.field4532];
        this.field4536 = new int[this.field4532];
        this.field4527 = new int[this.field4532];
        this.field4526 = new int[this.field4532][];
        if (var5 != 0) {
            this.field4540 = new int[this.field4532];
            for (int var9 = 0; var9 < this.field4532; var9++) {
                this.field4540[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4549; var10++) {
                this.field4540[this.field4539[var10]] = var3.method1483((byte) 46);
            }
            this.field4538 = new class48(this.field4540);
        }
        for (int var11 = 0; var11 < this.field4549; var11++) {
            this.field4544[this.field4539[var11]] = var3.method1483((byte) 46);
        }
        if (!arg1) {
            this.field4534 = null;
        }
        for (int var12 = 0; var12 < this.field4549; var12++) {
            this.field4545[this.field4539[var12]] = var3.method1483((byte) 46);
        }
        for (int var13 = 0; var13 < this.field4549; var13++) {
            this.field4536[this.field4539[var13]] = var3.method1445(false);
        }
        for (int var14 = 0; var14 < this.field4549; var14++) {
            int var21 = 0;
            int var22 = this.field4539[var14];
            int var23 = this.field4536[var22];
            int var24 = -1;
            this.field4526[var22] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field4526[var22][var25] = var21 += var3.method1445(false);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field4527[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field4526[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4534 = new int[var7 + 1][];
        this.field4529 = new class48[var7 + 1];
        for (int var15 = 0; var15 < this.field4549; var15++) {
            int var16 = this.field4539[var15];
            int var17 = this.field4536[var16];
            this.field4534[var16] = new int[this.field4527[var16]];
            for (int var18 = 0; var18 < this.field4527[var16]; var18++) {
                this.field4534[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4526[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4526[var16][var19];
                }
                this.field4534[var16][var20] = var3.method1483((byte) 46);
            }
            this.field4529[var16] = new class48(this.field4534[var16]);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIC)C")
    public static final char method1932(byte arg0, int arg1, char arg2) {
        field4537++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        int var3 = 108 % ((27 - arg0) / 32);
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILhc;)Lq;")
    public static final class128 method1933(int arg0, int arg1, class235 arg2) {
        if (arg1 != -7) {
            method1934((byte) -39);
        }
        field4542++;
        return class294.method1972(arg2, -52, arg0) ? class119.method794((byte) -109) : null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public static void method1934(byte arg0) {
        if (arg0 < 10) {
            field4535 = 66;
        }
        field4541 = null;
        field4548 = null;
        field4533 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4530++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class217.field3278 + ((class193.field2655 - class217.field3278) * var8 / 100);
        int var10 = arg4 * var9 >> 8;
        int var11 = 2048 - arg2 & 0x7FF;
        int var12 = 2048 - arg6 & 0x7FF;
        int var13 = 0;
        int var14 = var10;
        int var15 = 0;
        if (var12 != 0) {
            int var16 = class90.field1259[var12];
            var15 = -var10 * var16 >> 16;
            int var17 = class90.field1255[var12];
            var14 = var10 * var17 >> 16;
        }
        if (~var11 != arg5) {
            int var18 = class90.field1259[var11];
            var13 = var14 * var18 >> 16;
            int var19 = class90.field1255[var11];
            var14 = var14 * var19 >> 16;
        }
        class275.field4265 = arg6;
        class239.field3645 = arg2;
        class41.field618 = arg0 - var13;
        class246.field3773 = arg1 - var15;
        class89.field1252 = arg3 - var14;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static final void method1936(int arg0) {
        class231.field3497.method546(-90762264);
        field4528++;
        int var1 = -42 % ((arg0 - 22) / 48);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "([BI)V")
    public class287(byte[] arg0, int arg1) {
        this.field4546 = class286.method1923(110, arg0.length, arg0);
        if (this.field4546 != arg1) {
            throw new RuntimeException();
        }
        this.method1931(arg0, true);
    }
}
