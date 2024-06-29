import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class14 extends class71 {

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    private int field425 = 4096;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    private int field431 = 4096;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    private int field435 = 4096;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "Lud;")
    public static class279 field429 = class130.method1024("<col=ffff00>", 255);

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Lud;")
    public static class279 field422 = class130.method1024("Verbindung zum Update)2Server hergestellt)3", 255);

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field434 = 0;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Lok;")
    public static class149 field426;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "[[B")
    public static byte[][] field424;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "[[[I")
    public static int[][][] field432;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 4)
    public class14() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I", line = 17)
    public final int[][] method86(int arg0, int arg1) {
        int var3 = 31 / ((-arg1 - 70) / 54);
        field427++;
        int[][] var4 = this.field1400.method1746((byte) 34, arg0);
        if (this.field1400.field4363) {
            int[][] var5 = this.method619(0, 2, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var5[2];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class215.field3787; var12++) {
                int var13 = var7[var12];
                int var14 = var10[var12];
                int var15 = var6[var12];
                if (var14 == var15 && var13 == var14) {
                    var9[var12] = this.field425 * var15 >> 12;
                    var8[var12] = this.field435 * var14 >> 12;
                    var11[var12] = this.field431 * var13 >> 12;
                } else {
                    var9[var12] = this.field425;
                    var8[var12] = this.field435;
                    var11[var12] = this.field431;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lok;II)Lbn;", line = 75)
    public static final class66 method98(class149 arg0, int arg1, int arg2) {
        if (arg2 != -4482) {
            method100(31, 67);
        }
        field423++;
        return class125.method993(arg0, 117, arg1) ? class84.method731(69) : null;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V", line = 107)
    public static void method99(int arg0) {
        int var1 = 67 / ((arg0 - 55) / 35);
        field422 = null;
        field432 = (int[][][]) null;
        field424 = (byte[][]) null;
        field426 = null;
        field429 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z", line = 123)
    public static final boolean method100(int arg0, int arg1) {
        field430++;
        int var2 = 32 % ((arg0 - 52) / 34);
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZLvh;)V", line = 143)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            this.method86(-18, 98);
        }
        if (arg0 == 0) {
            this.field425 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field435 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field431 = arg2.method468(28214);
        }
        field433++;
    }
}
