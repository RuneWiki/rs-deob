import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class22 {

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
    private boolean field501;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Z")
    private boolean field476;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lce;")
    public static class10 field470 = null;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[I")
    public static int[] field467 = new int[2];

    @OriginalMember(owner = "client!da", name = "W", descriptor = "Le;")
    public static class86 field508 = new class86();

    @OriginalMember(owner = "client!da", name = "X", descriptor = "[Lij;")
    public static class50[] field509 = new class50[1000];

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field510 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lkg;")
    private class48 field469;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[I")
    private int[] field472;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[I")
    public int[] field473;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[I")
    private int[] field478;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
    public int[] field480;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "[I")
    public int[] field490;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "[I")
    private int[] field496;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "[Lkg;")
    private class48[] field498;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "[Ljava/lang/Object;")
    public Object[] field507;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "[[I")
    private int[][] field494;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "[[I")
    private int[][] field499;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field468;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)Z")
    public final boolean method163(int arg0, byte arg1, int arg2) {
        field475++;
        int var4 = -70 % ((66 - arg1) / 33);
        if (!this.method192(arg2, -7606, arg0)) {
            return false;
        } else if (this.field468[arg2] != null && this.field468[arg2][arg0] != null) {
            return true;
        } else if (this.field507[arg2] == null) {
            this.method157(-92, arg2);
            return this.field507[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)I")
    public int method154(byte arg0, int arg1) {
        if (arg0 > -88) {
            this.method181((class50) null, -67, (class50) null);
        }
        field481++;
        if (this.method179((byte) 87, arg1)) {
            return this.field507[arg1] == null ? 0 : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILij;)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, class50 arg4) {
        field505++;
        class10 var5 = class62.method475(arg3, arg2, -1);
        if (var5 == null) {
            return;
        }
        if (var5.field240 != null) {
            class93 var6 = new class93();
            var6.field1745 = arg1;
            var6.field1739 = var5.field240;
            var6.field1740 = var5;
            var6.field1733 = arg4;
            class214.method1422(var6, -15181);
        }
        boolean var7 = true;
        if (var5.field259 > 0) {
            var7 = class155.method1092((byte) -59, var5);
        }
        if (!var7 || !method177(77, client.method605(var5), arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class29.field612++;
            class190.field3141.method1598((byte) -94, 232);
            class190.field3141.method1446(-6, arg2);
            class190.field3141.method1494(arg3, (byte) -93);
        }
        if (arg1 == 2) {
            class233.field3903++;
            class190.field3141.method1598((byte) -95, 194);
            class190.field3141.method1446(arg0 ^ 0xFFFFE083, arg2);
            class190.field3141.method1494(arg3, (byte) -49);
        }
        if (arg1 == 3) {
            class200.field3296++;
            class190.field3141.method1598((byte) -93, 77);
            class190.field3141.method1446(124, arg2);
            class190.field3141.method1494(arg3, (byte) -42);
        }
        if (arg0 != -7958) {
            field510 = -72;
        }
        if (arg1 == 4) {
            class246.field4291++;
            class190.field3141.method1598((byte) -119, 122);
            class190.field3141.method1446(-80, arg2);
            class190.field3141.method1494(arg3, (byte) -17);
        }
        if (arg1 == 5) {
            class53.field958++;
            class190.field3141.method1598((byte) -112, 240);
            class190.field3141.method1446(-21, arg2);
            class190.field3141.method1494(arg3, (byte) -70);
        }
        if (arg1 == 6) {
            class190.field3141.method1598((byte) -118, 7);
            class86.field1650++;
            class190.field3141.method1446(96, arg2);
            class190.field3141.method1494(arg3, (byte) -14);
        }
        if (arg1 == 7) {
            class224.field3769++;
            class190.field3141.method1598((byte) -98, 188);
            class190.field3141.method1446(arg0 ^ 0xFFFFE08F, arg2);
            class190.field3141.method1494(arg3, (byte) -62);
        }
        if (arg1 == 8) {
            class175.field2923++;
            class190.field3141.method1598((byte) -87, 65);
            class190.field3141.method1446(-126, arg2);
            class190.field3141.method1494(arg3, (byte) -22);
        }
        if (arg1 == 9) {
            class217.field3584++;
            class190.field3141.method1598((byte) -100, 85);
            class190.field3141.method1446(-86, arg2);
            class190.field3141.method1494(arg3, (byte) -95);
        }
        if (arg1 == 10) {
            class21.field453++;
            class190.field3141.method1598((byte) -128, 145);
            class190.field3141.method1446(109, arg2);
            class190.field3141.method1494(arg3, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BZZ)V")
    public final void method165(byte arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            this.field478 = null;
            this.field469 = null;
        }
        int var4 = -57 / ((arg0 - 26) / 60);
        if (arg1) {
            this.field499 = null;
            this.field498 = null;
        }
        field486++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III[I)[B")
    public final byte[] method166(int arg0, int arg1, int arg2, int[] arg3) {
        field463++;
        if (!this.method192(arg2, -7606, arg0)) {
            return null;
        }
        if (this.field468[arg2] == null || this.field468[arg2][arg0] == null) {
            boolean var5 = this.method187((byte) 50, arg2, arg3);
            if (!var5) {
                this.method157(arg1 ^ 0xFFFFFF8C, arg2);
                boolean var6 = this.method187((byte) 50, arg2, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 != 1) {
            field509 = null;
        }
        byte[] var7 = class205.method1386(false, this.field468[arg2][arg0], 255);
        if (this.field476) {
            this.field468[arg2][arg0] = null;
            if (this.field496[arg2] == 1) {
                this.field468[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILij;)I")
    public final int method167(int arg0, class50 arg1) {
        field477++;
        int var3 = 68 % ((51 - arg0) / 53);
        class50 var4 = arg1.method402(2023);
        int var5 = this.field469.method359(27585, var4.method385(-22884));
        return this.method154((byte) -124, var5);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ILij;)Z")
    public final boolean method168(int arg0, class50 arg1) {
        if (arg0 == 1) {
            field466++;
            class50 var3 = arg1.method402(arg0 + 2022);
            int var4 = this.field469.method359(arg0 + 27584, var3.method385(-22884));
            return this.method191(var4, (byte) 99);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Lgh;")
    public static final class106 method169(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1244; var4++) {
            class106 var5 = var3.field1236[var4];
            if ((var5.field1905 >> 29 & 0x3L) == 2L && var5.field1913 == arg1 && var5.field1906 == arg2) {
                class223.method1529(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public void method157(int arg0, int arg1) {
        int var3 = 54 % ((-arg0 - 36) / 56);
        field482++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 == -1) {
            field462++;
            return this.field496.length;
        } else {
            return 110;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public final void method171(byte arg0) {
        if (arg0 == 109) {
            for (int var2 = 0; var2 < this.field468.length; var2++) {
                this.field468[var2] = null;
            }
            field491++;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
    public void method155(int arg0, int arg1) {
        field485++;
        if (arg0 != 255) {
            this.method183(true, 65);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILij;Lij;)Z")
    public final boolean method172(int arg0, class50 arg1, class50 arg2) {
        class50 var4 = arg1.method402(2023);
        class50 var5 = arg2.method402(2023);
        int var6 = this.field469.method359(27585, var4.method385(-22884));
        field474++;
        if (arg0 != 1) {
            this.method154((byte) 50, 102);
        }
        if (this.method179((byte) 104, var6)) {
            int var7 = this.field498[var6].method359(27585, var5.method385(-22884));
            return this.method163(var7, (byte) 127, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)V")
    public final void method173(int arg0, int arg1) {
        field493++;
        if (arg0 != -17961) {
            this.field468 = null;
        }
        if (this.method179((byte) -117, arg1)) {
            this.field468[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)[B")
    public final byte[] method174(int arg0, int arg1, int arg2) {
        field497++;
        if (!this.method192(arg1, -7606, arg0)) {
            return null;
        }
        if (this.field468[arg1] == null || this.field468[arg1][arg0] == null) {
            boolean var4 = this.method187((byte) 50, arg1, (int[]) null);
            if (!var4) {
                this.method157(37, arg1);
                boolean var5 = this.method187((byte) 50, arg1, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class205.method1386(false, this.field468[arg1][arg0], 255);
        return arg2 == 145 ? var6 : null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method175(int arg0) {
        field470 = null;
        field509 = null;
        field467 = null;
        if (arg0 == -1) {
            field508 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)Z")
    public final boolean method176(int arg0) {
        boolean var2 = true;
        field484++;
        for (int var3 = 0; var3 < this.field472.length; var3++) {
            int var4 = this.field472[var3];
            if (this.field507[var4] == null) {
                this.method157(-97, var4);
                if (this.field507[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 >= -20) {
            field508 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(III)Z")
    public static final boolean method177(int arg0, int arg1, int arg2) {
        if (arg0 != 77) {
            field510 = 127;
        }
        field503++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)[I")
    public final int[] method178(int arg0, boolean arg1) {
        if (!arg1) {
            field508 = null;
        }
        field465++;
        if (!this.method179((byte) 69, arg0)) {
            return null;
        }
        int[] var3 = this.field494[arg0];
        if (var3 == null) {
            var3 = new int[this.field490[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)Z")
    public final boolean method179(byte arg0, int arg1) {
        field502++;
        if (arg1 >= 0 && this.field496.length > arg1 && this.field496[arg1] != 0) {
            int var3 = -124 / ((arg0 - 4) / 57);
            return true;
        } else if (class195.field3242) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)I")
    public final int method180(boolean arg0, int arg1) {
        if (arg0) {
            this.field498 = null;
        }
        field483++;
        return this.method179((byte) -113, arg1) ? this.field496[arg1] : 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lij;ILij;)[B")
    public final byte[] method181(class50 arg0, int arg1, class50 arg2) {
        int var4 = 83 / ((arg1 + 73) / 37);
        class50 var5 = arg0.method402(2023);
        field479++;
        class50 var6 = arg2.method402(2023);
        int var7 = this.field469.method359(27585, var5.method385(-22884));
        if (this.method179((byte) 111, var7)) {
            int var8 = this.field498[var7].method359(27585, var6.method385(-22884));
            return this.method190((byte) -128, var8, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lij;I)V")
    public final void method182(class50 arg0, int arg1) {
        field506++;
        class50 var3 = arg0.method402(arg1 + 2023);
        int var4 = this.field469.method359(arg1 ^ 0x6BC1, var3.method385(-22884));
        this.method155(arg1 ^ 0xFF, var4);
        if (arg1 != 0) {
            this.method179((byte) 15, 39);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(ZI)[B")
    public final byte[] method183(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        }
        field495++;
        if (this.field496.length == 1) {
            return this.method190((byte) -61, arg1, 0);
        } else if (!this.method179((byte) 108, arg1)) {
            return null;
        } else if (this.field496[arg1] == 1) {
            return this.method190((byte) -62, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BI)V")
    public final void method184(byte[] arg0, int arg1) {
        this.field492 = class173.method1195((byte) 88, arg0.length, arg0);
        field471++;
        class217 var3 = new class217(class86.method683(arg0, -116));
        int var4 = var3.method1487(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        int var5 = 0;
        int var6 = -1;
        if (var4 >= 6) {
            var3.method1466((byte) -15);
        }
        int var7 = var3.method1487(255);
        this.field461 = var3.method1441(-69);
        this.field472 = new int[this.field461];
        for (int var8 = 0; var8 < this.field461; var8++) {
            this.field472[var8] = var5 += var3.method1441(115);
            if (this.field472[var8] > var6) {
                var6 = this.field472[var8];
            }
        }
        this.field494 = new int[var6 + 1][];
        this.field480 = new int[var6 + 1];
        this.field496 = new int[var6 + 1];
        this.field490 = new int[var6 + 1];
        this.field468 = new Object[var6 + 1][];
        this.field507 = new Object[var6 + 1];
        this.field473 = new int[var6 + 1];
        if (var7 != 0) {
            this.field478 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field478[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field461; var10++) {
                this.field478[this.field472[var10]] = var3.method1466((byte) -15);
            }
            this.field469 = new class48(this.field478);
        }
        for (int var11 = 0; var11 < this.field461; var11++) {
            this.field473[this.field472[var11]] = var3.method1466((byte) -15);
        }
        int var12 = 0;
        int var13 = -107 / ((arg1 + 54) / 40);
        while (var12 < this.field461) {
            this.field480[this.field472[var12]] = var3.method1466((byte) -15);
            var12++;
        }
        for (int var14 = 0; var14 < this.field461; var14++) {
            this.field490[this.field472[var14]] = var3.method1441(-31);
        }
        for (int var15 = 0; var15 < this.field461; var15++) {
            int var22 = 0;
            int var23 = this.field472[var15];
            int var24 = -1;
            int var25 = this.field490[var23];
            this.field494[var23] = new int[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                int var27 = this.field494[var23][var26] = var22 += var3.method1441(-60);
                if (var24 < var27) {
                    var24 = var27;
                }
            }
            this.field496[var23] = var24 + 1;
            if ((var24 + 1) == var25) {
                this.field494[var23] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field498 = new class48[var6 + 1];
        this.field499 = new int[var6 + 1][];
        for (int var16 = 0; var16 < this.field461; var16++) {
            int var17 = this.field472[var16];
            int var18 = this.field490[var17];
            this.field499[var17] = new int[this.field496[var17]];
            for (int var19 = 0; var19 < this.field496[var17]; var19++) {
                this.field499[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field494[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field494[var17][var20];
                }
                this.field499[var17][var21] = var3.method1466((byte) -15);
            }
            this.field498[var17] = new class48(this.field499[var17]);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)V")
    public static final void method185(int arg0, int arg1) {
        class65 var2 = class59.field1089[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class65 var4 = class59.field1089[var3][arg0][arg1] = class59.field1089[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1255--;
                for (int var5 = 0; var5 < var4.field1244; var5++) {
                    class106 var6 = var4.field1236[var5];
                    if ((var6.field1905 >> 29 & 0x3L) == 2L && var6.field1913 == arg0 && var6.field1906 == arg1) {
                        var6.field1912--;
                    }
                }
            }
        }
        if (class59.field1089[0][arg0][arg1] == null) {
            class59.field1089[0][arg0][arg1] = new class65(0, arg0, arg1);
        }
        class59.field1089[0][arg0][arg1].field1241 = var2;
        class59.field1089[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(ILij;)I")
    public final int method186(int arg0, class50 arg1) {
        class50 var3 = arg1.method402(2023);
        field464++;
        if (arg0 <= 24) {
            this.method189((byte) 38);
        }
        int var4 = this.field469.method359(27585, var3.method385(-22884));
        return this.method179((byte) -127, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI[I)Z")
    private final boolean method187(byte arg0, int arg1, int[] arg2) {
        field504++;
        if (!this.method179((byte) -108, arg1)) {
            return false;
        } else if (this.field507[arg1] == null) {
            return false;
        } else {
            int var4 = this.field490[arg1];
            int[] var5 = this.field494[arg1];
            if (this.field468[arg1] == null) {
                this.field468[arg1] = new Object[this.field496[arg1]];
            }
            boolean var6 = true;
            Object[] var7 = this.field468[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            if (arg0 != 50) {
                this.method173(-43, -122);
            }
            byte[] var10;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var10 = class205.method1386(true, this.field507[arg1], 255);
                class217 var11 = new class217(var10);
                var11.method1452((byte) -41, 5, var11.field3633.length, arg2);
            } else {
                var10 = class205.method1386(false, this.field507[arg1], 255);
            }
            byte[] var12;
            try {
                var12 = class86.method683(var10, arg0 - 159);
            } catch (RuntimeException var31) {
                throw class126.method905(var31, "T3 - " + (arg2 != null) + "," + arg1 + "," + var10.length + "," + class173.method1195((byte) 102, var10.length, var10) + "," + class173.method1195((byte) 91, var10.length - 2, var10) + "," + this.field473[arg1] + "," + this.field492);
            }
            if (this.field501) {
                this.field507[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var15 * 4 * var4;
                int[] var17 = new int[var4];
                class217 var18 = new class217(var12);
                var18.field3581 = var16;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var18.method1466((byte) -15);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var18.field3581 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var18.method1466((byte) -15);
                        class105.method792(var12, var24, var22[var27], var17[var27], var26);
                        var24 += var26;
                        var17[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field476) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class223.method1528(13744, false, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field476) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class223.method1528(13744, false, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(BI)Z")
    public final boolean method188(byte arg0, int arg1) {
        field488++;
        if (this.field496.length == 1) {
            return this.method163(arg1, (byte) 115, 0);
        }
        if (arg0 < 95) {
            this.method184((byte[]) null, -10);
        }
        if (!this.method179((byte) -112, arg1)) {
            return false;
        } else if (this.field496[arg1] == 1) {
            return this.method163(0, (byte) 113, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)I")
    public final int method189(byte arg0) {
        field460++;
        int var2 = 44 % ((76 - arg0) / 47);
        int var3 = 0;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field507.length; var5++) {
            if (this.field490[var5] > 0) {
                var4 += this.method154((byte) -116, var5);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var4 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)[B")
    public final byte[] method190(byte arg0, int arg1, int arg2) {
        field487++;
        if (arg0 >= -17) {
            this.method155(-105, 76);
        }
        return this.method166(arg1, 1, arg2, (int[]) null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Z")
    public final boolean method191(int arg0, byte arg1) {
        field489++;
        if (!this.method179((byte) 98, arg0)) {
            return false;
        } else if (this.field507[arg0] == null) {
            if (arg1 != 99) {
                this.field499 = null;
            }
            this.method157(104, arg0);
            return this.field507[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(III)Z")
    private final boolean method192(int arg0, int arg1, int arg2) {
        field500++;
        if (arg0 >= 0 && arg2 >= 0 && this.field496.length > arg0 && arg2 < this.field496[arg0]) {
            if (arg1 != -7606) {
                this.field501 = true;
            }
            return true;
        } else if (class195.field3242) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(ZZ)V")
    public class22(boolean arg0, boolean arg1) {
        this.field501 = arg0;
        this.field476 = arg1;
    }
}
