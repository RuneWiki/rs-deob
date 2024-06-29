import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class122 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
    private boolean field2614;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Z")
    private boolean field2617;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
    public static int[] field2618 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "[I")
    public static int[] field2629 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[Lhb;")
    public static class44[] field2621 = new class44[50];

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Lec;")
    public static class28 field2641 = class28.method210(-46, "null");

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Lpa;")
    public static class91 field2643 = new class91(64);

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "Lec;")
    public static class28 field2658 = class28.method210(-46, "@whi@ )4 ");

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    public static int field2662 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field2663 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Lpd;")
    private class94 field2645;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "Ljava/awt/Image;")
    public static Image field2656;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
    private int[] field2619;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
    public int[] field2624;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "[I")
    public int[] field2644;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "[I")
    public int[] field2646;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "[I")
    private int[] field2653;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[Lpd;")
    private class94[] field2623;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[[B")
    public byte[][] field2634;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[[I")
    private int[][] field2620;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[[I")
    private int[][] field2631;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "[[[B")
    private byte[][][] field2627;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method923(byte arg0, Component arg1) {
        field2633++;
        try {
            int var2 = -55 / ((-arg0 - 61) / 34);
            Method var3 = class82.field1868;
            if (var3 != null) {
                var3.invoke(arg1, Boolean.FALSE);
            }
        } catch (Throwable var4) {
        }
        arg1.addKeyListener(class49.field1133);
        arg1.addFocusListener(class49.field1133);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method924(int arg0) {
        field2615++;
        class80.field1842.method659(1000);
        if (arg0 == 1) {
            class9.field156.method659(arg0 ^ 0x3E9);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lke;II)V")
    public static final void method925(class65 arg0, int arg1, int arg2) {
        field2636++;
        int var3 = -99 / ((arg1 + 56) / 63);
        class127.method972(true, arg0.field1446, arg2, arg0.field1501);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)[B")
    public final byte[] method926(int arg0, int arg1, int arg2) {
        field2628++;
        if (arg1 < 1) {
            return null;
        } else if (arg2 < 0 || this.field2627.length <= arg2 || this.field2627[arg2] == null || arg0 < 0 || arg0 >= this.field2627[arg2].length) {
            return null;
        } else {
            if (this.field2627[arg2][arg0] == null) {
                boolean var4 = this.method944(arg2, null, 0);
                if (!var4) {
                    this.method48((byte) 124, arg2);
                    boolean var5 = this.method944(arg2, null, 0);
                    if (!var5) {
                        return null;
                    }
                }
            }
            return this.field2627[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lec;B)V")
    public final void method927(class28 arg0, byte arg1) {
        class28 var3 = arg0.method234((byte) -100);
        int var4 = 84 % ((arg1 - 11) / 50);
        field2612++;
        int var5 = this.field2645.method675(var3.method222(125), true);
        if (var5 >= 0) {
            this.method55(100, var5);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)V")
    public void method48(byte arg0, int arg1) {
        field2652++;
        if (arg0 < 123) {
            field2662 = -69;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method928(byte arg0) {
        field2621 = null;
        field2641 = null;
        field2643 = null;
        field2629 = null;
        field2658 = null;
        field2656 = null;
        field2618 = null;
        if (arg0 < 49) {
            field2643 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method929(int arg0) {
        field2610++;
        for (int var2 = arg0; var2 < this.field2627.length; var2++) {
            if (this.field2627[var2] != null) {
                for (int var3 = 0; var3 < this.field2627[var2].length; var3++) {
                    this.field2627[var2][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BILec;)I")
    public final int method930(byte arg0, int arg1, class28 arg2) {
        if (arg0 < 18) {
            this.method945(54, 7);
        }
        field2654++;
        class28 var4 = arg2.method234((byte) -105);
        return this.field2623[arg1].method675(var4.method222(126), true);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
    public final int[] method931(int arg0, int arg1) {
        field2609++;
        if (arg0 != 1) {
            this.method932(97, -77, -97);
        }
        return this.field2631[arg1];
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)[B")
    public final byte[] method932(int arg0, int arg1, int arg2) {
        int var4 = -121 % ((arg0 - 73) / 49);
        field2630++;
        return this.method943(arg1, -26048, null, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public final void method933(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field2627[arg0].length; var3++) {
            this.field2627[arg0][var3] = null;
        }
        if (arg1 >= -57) {
            this.method55(42, 96);
        }
        field2649++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILec;Lec;)[B")
    public final byte[] method934(int arg0, class28 arg1, class28 arg2) {
        class28 var4 = arg2.method234((byte) -102);
        class28 var5 = arg1.method234((byte) -120);
        if (arg0 != 2) {
            this.field2644 = null;
        }
        field2655++;
        int var6 = this.field2645.method675(var4.method222(arg0 + 124), true);
        int var7 = this.field2623[var6].method675(var5.method222(125), true);
        return this.method932(127, var7, var6);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lec;ILec;)Z")
    public final boolean method935(class28 arg0, int arg1, class28 arg2) {
        field2651++;
        class28 var4 = arg2.method234((byte) -103);
        class28 var5 = arg0.method234((byte) 78);
        int var6 = this.field2645.method675(var4.method222(125), true);
        int var7 = this.field2623[var6].method675(var5.method222(127), true);
        if (arg1 != 1) {
            this.method940(null, 73);
        }
        return this.method941(var7, (byte) -110, var6);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)[B")
    public final byte[] method936(byte arg0, int arg1) {
        field2635++;
        if (arg0 >= -39) {
            return null;
        } else if (this.field2627.length == 1) {
            return this.method932(-95, arg1, 0);
        } else if (this.field2627[arg1].length == 1) {
            return this.method932(-121, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)I")
    public final int method937(byte arg0) {
        if (arg0 == -128) {
            field2613++;
            return this.field2627.length;
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)Z")
    public final boolean method938(int arg0) {
        if (arg0 != 32453) {
            return true;
        }
        field2639++;
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2619.length; var3++) {
            int var4 = this.field2619[var3];
            if (this.field2634[var4] == null) {
                this.method48((byte) 126, var4);
                if (this.field2634[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILvb;Lvb;)V")
    public static final void method939(int arg0, class122 arg1, class122 arg2) {
        if (arg0 != 14667) {
            field2618 = null;
        }
        field2626++;
        class51.field1183 = arg2;
        class11.field189 = arg1;
        class8.field146 = class11.field189.method947(3, (byte) 58);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)V")
    public final void method940(byte[] arg0, int arg1) {
        this.field2616 = class37.method307(arg0, arg0.length, (byte) -117);
        field2642++;
        class119 var3 = new class119(class30.method244(arg0, (byte) -114));
        int var4 = var3.method879((byte) 45);
        if (var4 != 5) {
            return;
        }
        int var5 = 0;
        int var6 = var3.method879((byte) 45);
        int var7 = -1;
        this.field2647 = var3.method903(2);
        this.field2619 = new int[this.field2647];
        for (int var8 = 0; var8 < this.field2647; var8++) {
            this.field2619[var8] = var5 += var3.method903(2);
            if (this.field2619[var8] > var7) {
                var7 = this.field2619[var8];
            }
        }
        this.field2644 = new int[var7 + 1];
        if (arg1 >= -102) {
            this.method927(null, (byte) -17);
        }
        this.field2634 = new byte[var7 + 1][];
        this.field2646 = new int[var7 + 1];
        this.field2631 = new int[var7 + 1][];
        this.field2624 = new int[var7 + 1];
        this.field2627 = new byte[var7 + 1][][];
        if (var6 != 0) {
            this.field2653 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field2647; var9++) {
                this.field2653[this.field2619[var9]] = var3.method882(-20);
            }
            this.field2645 = new class94(this.field2653);
        }
        for (int var10 = 0; var10 < this.field2647; var10++) {
            this.field2644[this.field2619[var10]] = var3.method882(-5);
        }
        for (int var11 = 0; var11 < this.field2647; var11++) {
            this.field2624[this.field2619[var11]] = var3.method882(5);
        }
        for (int var12 = 0; var12 < this.field2647; var12++) {
            this.field2646[this.field2619[var12]] = var3.method903(2);
        }
        for (int var13 = 0; var13 < this.field2647; var13++) {
            int var18 = this.field2619[var13];
            int var19 = 0;
            int var20 = this.field2646[var18];
            this.field2631[var18] = new int[var20];
            int var21 = -1;
            for (int var22 = 0; var22 < var20; var22++) {
                int var23 = this.field2631[var18][var22] = var19 += var3.method903(2);
                if (var23 > var21) {
                    var21 = var23;
                }
            }
            this.field2627[var18] = new byte[var21 + 1][];
        }
        if (var6 == 0) {
            return;
        }
        this.field2623 = new class94[var7 + 1];
        this.field2620 = new int[var7 + 1][];
        for (int var14 = 0; var14 < this.field2647; var14++) {
            int var15 = this.field2619[var14];
            int var16 = this.field2646[var15];
            this.field2620[var15] = new int[this.field2627[var15].length];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field2620[var15][this.field2631[var15][var17]] = var3.method882(-16);
            }
            this.field2623[var15] = new class94(this.field2620[var15]);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)Z")
    public final boolean method941(int arg0, byte arg1, int arg2) {
        field2650++;
        if (arg2 < 0 || this.field2627.length <= arg2 || this.field2627[arg2] == null || arg0 < 0 || this.field2627[arg2].length <= arg0) {
            return false;
        }
        if (arg1 != -110) {
            this.field2623 = null;
        }
        if (this.field2627[arg2][arg0] != null) {
            return true;
        } else if (this.field2634[arg2] == null) {
            this.method48((byte) 127, arg2);
            return this.field2634[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lec;I)I")
    public final int method942(class28 arg0, int arg1) {
        field2632++;
        class28 var3 = arg0.method234((byte) 31);
        if (arg1 != 1) {
            this.field2653 = null;
        }
        return this.field2645.method675(var3.method222(arg1 ^ 0x7E), true);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II[II)[B")
    public final byte[] method943(int arg0, int arg1, int[] arg2, int arg3) {
        field2637++;
        if (arg3 < 0 || this.field2627.length <= arg3 || this.field2627[arg3] == null || arg0 < 0 || arg0 >= this.field2627[arg3].length) {
            return null;
        }
        if (this.field2627[arg3][arg0] == null) {
            boolean var5 = this.method944(arg3, arg2, 0);
            if (!var5) {
                this.method48((byte) 127, arg3);
                boolean var6 = this.method944(arg3, arg2, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != -26048) {
            this.field2620 = null;
        }
        byte[] var7 = this.field2627[arg3][arg0];
        if (this.field2617) {
            this.field2627[arg3][arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[II)Z")
    private final boolean method944(int arg0, int[] arg1, int arg2) {
        field2640++;
        if (this.field2634[arg0] == null) {
            return false;
        }
        int var4 = this.field2646[arg0];
        int[] var5 = this.field2631[arg0];
        boolean var6 = true;
        byte[][] var7 = this.field2627[arg0];
        for (int var8 = arg2; var8 < var4; var8++) {
            if (var7[var5[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
            var9 = this.field2634[arg0];
        } else {
            var9 = new byte[this.field2634[arg0].length];
            class84.method637(this.field2634[arg0], 0, var9, 0, var9.length);
            class119 var10 = new class119(var9);
            var10.method875(arg1, true, var10.field2531.length, 5);
        }
        byte[] var11 = class30.method244(var9, (byte) -55);
        if (this.field2614) {
            this.field2634[arg0] = null;
        }
        if (var4 <= 1) {
            var7[var5[0]] = var11;
        } else {
            int var12 = var11.length;
            int var25 = var12 - 1;
            int var13 = var11[var25] & 0xFF;
            int var14 = var25 - var4 * var13 * 4;
            class119 var15 = new class119(var11);
            var15.field2554 = var14;
            int[] var16 = new int[var4];
            for (int var17 = 0; var17 < var13; var17++) {
                int var23 = 0;
                for (int var24 = 0; var24 < var4; var24++) {
                    var23 += var15.method882(arg2 ^ 0x76);
                    var16[var24] += var23;
                }
            }
            for (int var18 = 0; var18 < var4; var18++) {
                if (var7[var5[var18]] == null) {
                    var7[var5[var18]] = new byte[var16[var18]];
                }
                var16[var18] = 0;
            }
            int var19 = 0;
            var15.field2554 = var14;
            for (int var20 = 0; var20 < var13; var20++) {
                int var21 = 0;
                for (int var22 = 0; var22 < var4; var22++) {
                    var21 += var15.method882(-102);
                    class84.method637(var11, var19, var7[var5[var22]], var16[var22], var21);
                    var19 += var21;
                    var16[var22] += var21;
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)[B")
    public final byte[] method945(int arg0, int arg1) {
        field2611++;
        if (this.field2627.length == arg0) {
            return this.method926(arg1, 35, 0);
        } else if (this.field2627[arg1].length == 1) {
            return this.method926(0, arg0 + 47, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)V")
    public void method55(int arg0, int arg1) {
        if (arg0 != 100) {
            field2618 = null;
        }
        field2648++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(BI)Z")
    public final boolean method946(byte arg0, int arg1) {
        if (arg0 != 26) {
            return false;
        }
        field2625++;
        if (this.field2634[arg1] == null) {
            this.method48((byte) 126, arg1);
            return this.field2634[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)I")
    public final int method947(int arg0, byte arg1) {
        if (arg1 <= 44) {
            return 65;
        } else {
            field2638++;
            return this.field2627[arg0].length;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ZZ)V")
    public class122(boolean arg0, boolean arg1) {
        this.field2614 = arg0;
        this.field2617 = arg1;
    }
}
