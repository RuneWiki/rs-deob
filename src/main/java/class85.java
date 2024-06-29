import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class85 extends class128 {

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    private int field1084 = 0;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    private int field1091 = 4096;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "[S")
    public static short[] field1088 = new short[256];

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lii;")
    public static class227 field1083 = new class227(16);

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "[I")
    public static int[] field1094 = new int[50];

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Llc;")
    public static class175 field1086;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "Llc;")
    public static class175 field1095;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "[[[B")
    public static byte[][][] field1082;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)V", line = 7)
    public static final void method503(int arg0, int arg1, byte arg2) {
        field1093++;
        int var3 = 123 / ((25 - arg2) / 48);
        class96 var4 = class141.method935(arg0, 6, 98);
        var4.method581((byte) -118);
        var4.field1243 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 21)
    public static final void method504(byte arg0) {
        field1090++;
        class74.field951.method1237((byte) 72);
        class167.field2325.method1237((byte) 41);
        if (arg0 != -99) {
            field1088 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[[I", line = 35)
    public final int[][] method102(int arg0, int arg1) {
        field1087++;
        int[][] var3 = this.field1755.method875(97, arg0);
        if (arg1 != 5110) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class10.field141; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var8[var11];
                if (var12 < this.field1084) {
                    var7[var11] = this.field1084;
                } else if (var12 > this.field1091) {
                    var7[var11] = this.field1091;
                } else {
                    var7[var11] = var12;
                }
                if (var13 < this.field1084) {
                    var9[var11] = this.field1084;
                } else if (this.field1091 >= var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field1091;
                }
                if (var14 < this.field1084) {
                    var10[var11] = this.field1084;
                } else if (this.field1091 >= var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field1091;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 177)
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)[I", line = 116)
    public final int[] method126(byte arg0, int arg1) {
        field1092++;
        if (arg0 < 100) {
            return (int[]) null;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -100, 0, arg1);
            for (int var5 = 0; var5 < class10.field141; var5++) {
                int var6 = var4[var5];
                if (this.field1084 > var6) {
                    var3[var5] = this.field1084;
                } else if (var6 > this.field1091) {
                    var3[var5] = this.field1091;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 164)
    public static void method505(byte arg0) {
        field1095 = null;
        field1094 = null;
        int var1 = 32 % ((arg0 - 11) / 59);
        field1082 = (byte[][][]) null;
        field1086 = null;
        field1088 = null;
        field1083 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lp;II)V", line = 188)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field1085++;
        if (arg1 == 0) {
            this.field1084 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field1091 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        if (arg2 >= -85) {
            field1089 = -65;
        }
    }
}
