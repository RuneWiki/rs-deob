import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class53 implements class16 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Loe;")
    private class137 field978 = new class137(256);

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lci;")
    private class320 field982;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lci;")
    private class320 field981;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[Lmk;")
    private class39[] field979;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lge;")
    public static class511 field980 = new class511(32);

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z", line = 8)
    public final boolean method92(int arg0, int arg1) {
        field988++;
        if (arg0 == 12624) {
            class429 var3 = this.method467(0, arg1);
            return var3 != null && var3.method2549(this, this.field982, false);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIFIZI)[F", line = 21)
    public final float[] method95(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5) {
        field975++;
        int var7 = -29 % ((51 - arg3) / 34);
        return this.method467(0, arg1).method2545((byte) 120, arg0, this.field979[arg1].field825, this, arg5, this.field982);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Let;", line = 32)
    private final class429 method467(int arg0, int arg1) {
        field976++;
        if (arg0 != 0) {
            this.method91(-9, false, 103, 104, 0.41074678F, (byte) -48);
        }
        class525 var3 = this.field978.method997((byte) -128, (long) arg1);
        if (var3 != null) {
            return (class429) var3;
        }
        byte[] var4 = this.field981.method2029(arg1, false);
        if (var4 == null) {
            return null;
        } else {
            class429 var5 = new class429(new class519(var4));
            this.field978.method998((byte) -51, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)Lmm;", line = 60)
    public static final class188 method468(int arg0, int arg1, int arg2) {
        if (class461.field6675[arg0][arg1][arg2] == null) {
            boolean var3 = class461.field6675[0][arg1][arg2] != null && class461.field6675[0][arg1][arg2].field2772 != null;
            if (var3 && arg0 >= class251.field3740 - 1) {
                return null;
            }
            class133.method976(arg0, arg1, arg2);
        }
        return class461.field6675[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V", line = 73)
    public static void method469(boolean arg0) {
        if (!arg0) {
            field980 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIIFB)[I", line = 83)
    public final int[] method91(int arg0, boolean arg1, int arg2, int arg3, float arg4, byte arg5) {
        field977++;
        return arg5 == 26 ? this.method467(0, arg3).method2546((byte) 50, arg0, this, this.field982, (double) arg4, this.field979[arg3].field825, arg2) : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lmk;", line = 99)
    public final class39 method93(byte arg0, int arg1) {
        int var3 = -105 / ((-arg0 - 11) / 45);
        field983++;
        return this.field979[arg1];
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lci;Lci;Lci;)V", line = 132)
    public class53(class320 arg0, class320 arg1, class320 arg2) {
        this.field982 = arg2;
        this.field981 = arg1;
        class519 var4 = new class519(arg0.method2037(0, (byte) 72, 0));
        this.field987 = var4.method3018(566990904);
        this.field979 = new class39[this.field987];
        for (int var5 = 0; var5 < this.field987; var5++) {
            if (var4.method3072((byte) -121) == 1) {
                this.field979[var5] = new class39();
            }
        }
        for (int var6 = 0; var6 < this.field987; var6++) {
            if (this.field979[var6] != null) {
                this.field979[var6].field814 = var4.method3072((byte) -127) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field987; var7++) {
            if (this.field979[var7] != null) {
                this.field979[var7].field830 = var4.method3072((byte) -120) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field987; var8++) {
            if (this.field979[var8] != null) {
                this.field979[var8].field823 = var4.method3072((byte) -123) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field987; var9++) {
            if (this.field979[var9] != null) {
                this.field979[var9].field831 = var4.method3072((byte) -124) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field987; var10++) {
            if (this.field979[var10] != null) {
                this.field979[var10].field822 = var4.method3034((byte) 121);
            }
        }
        for (int var11 = 0; var11 < this.field987; var11++) {
            if (this.field979[var11] != null) {
                this.field979[var11].field816 = var4.method3034((byte) -100);
            }
        }
        for (int var12 = 0; var12 < this.field987; var12++) {
            if (this.field979[var12] != null) {
                this.field979[var12].field819 = var4.method3034((byte) 75);
            }
        }
        for (int var13 = 0; var13 < this.field987; var13++) {
            if (this.field979[var13] != null) {
                this.field979[var13].field821 = var4.method3034((byte) -59);
            }
        }
        for (int var14 = 0; var14 < this.field987; var14++) {
            if (this.field979[var14] != null) {
                this.field979[var14].field828 = (short) var4.method3018(566990904);
            }
        }
        for (int var15 = 0; var15 < this.field987; var15++) {
            if (this.field979[var15] != null) {
                this.field979[var15].field832 = var4.method3034((byte) -102);
            }
        }
        for (int var16 = 0; var16 < this.field987; var16++) {
            if (this.field979[var16] != null) {
                this.field979[var16].field817 = var4.method3034((byte) -95);
            }
        }
        for (int var17 = 0; var17 < this.field987; var17++) {
            if (this.field979[var17] != null) {
                this.field979[var17].field829 = var4.method3072((byte) -119) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field987; var18++) {
            if (this.field979[var18] != null) {
                this.field979[var18].field825 = var4.method3072((byte) -122) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field987; var19++) {
            if (this.field979[var19] != null) {
                this.field979[var19].field824 = var4.method3034((byte) -119);
            }
        }
        for (int var20 = 0; var20 < this.field987; var20++) {
            if (this.field979[var20] != null) {
                this.field979[var20].field826 = var4.method3072((byte) -128) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field987; var21++) {
            if (this.field979[var21] != null) {
                this.field979[var21].field820 = var4.method3072((byte) -121) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field987; var22++) {
            if (this.field979[var22] != null) {
                this.field979[var22].field827 = var4.method3072((byte) -127) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field987; var23++) {
            if (this.field979[var23] != null) {
                this.field979[var23].field813 = var4.method3072((byte) -126);
            }
        }
        for (int var24 = 0; var24 < this.field987; var24++) {
            if (this.field979[var24] != null) {
                this.field979[var24].field834 = var4.method3053(-129);
            }
        }
        for (int var25 = 0; var25 < this.field987; var25++) {
            if (this.field979[var25] != null) {
                this.field979[var25].field818 = var4.method3072((byte) -121) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BFZIII)[I", line = 123)
    public final int[] method94(byte arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = -114 % ((arg0 - 30) / 47);
        field986++;
        return this.method467(0, arg5).method2547(arg4, (byte) 38, this.field979[arg5].field825, arg3, (double) arg1, arg2, this.field982, this);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrg;I)Z", line = 346)
    public static final boolean method470(class463 arg0, int arg1) {
        if (arg1 != 32478) {
            return false;
        }
        field984++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field6719) {
            return false;
        } else if (!arg0.method2743(class382.field5451, (byte) -124)) {
            return false;
        } else if (class517.field7488.method2284(true, (long) arg0.field6699) == null) {
            return class417.field5927.method2284(true, (long) arg0.field6712) == null;
        } else {
            return false;
        }
    }
}
