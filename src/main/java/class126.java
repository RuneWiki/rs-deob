import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class126 {

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[[I")
    private int[][] field1635;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "J")
    public static long field1624 = 0L;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Lsr;")
    public static class167 field1627 = new class167();

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "[I")
    public static int[] field1632 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "[[I")
    public static int[][] field1633 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
    public final int method760(int arg0, int arg1) {
        if (arg1 != 2) {
            return -126;
        }
        if (this.field1635 != null) {
            arg0 = (int) ((long) this.field1629 * (long) arg0 / (long) this.field1623);
        }
        field1628++;
        return arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([BI)[B")
    public final byte[] method761(byte[] arg0, int arg1) {
        if (arg1 != -21046) {
            field1632 = null;
        }
        if (this.field1635 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1629 / (long) this.field1623) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1635[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1629 + var6;
                int var14 = var13 / this.field1623;
                var6 = var13 - this.field1623 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field1625++;
        return arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static final void method762(byte arg0) {
        field1631++;
        class391.field5656 = 0;
        class69.field806.method984(false);
        if (arg0 != 121) {
            method762((byte) 94);
        }
        class483.field7125 = false;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)I")
    public final int method763(boolean arg0, int arg1) {
        if (this.field1635 != null) {
            arg1 = (int) ((long) this.field1629 * (long) arg1 / (long) this.field1623) + 6;
        }
        field1630++;
        if (arg0) {
            this.method761(null, 69);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)Z")
    public static final boolean method764(int arg0, int arg1) {
        field1626++;
        int var2 = -83 % ((arg0 - 33) / 60);
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method765(boolean arg0) {
        if (arg0) {
            field1627 = null;
            field1632 = null;
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
    public class126(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class180.method1052(5, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field1635 = new int[var4][14];
            this.field1623 = var4;
            this.field1629 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1635[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
