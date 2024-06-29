import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class107 extends class170 {

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Z")
    private boolean field1816 = true;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "Z")
    private boolean field1820 = true;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "[[[I")
    public static int[][][] field1823 = new int[2][][];

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Lmh;")
    public static class128 field1821 = class22.method156(127, "settings=");

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "Lmh;")
    public static class128 field1819 = class22.method156(126, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "Ldj;")
    public static class314 field1822;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "[[[I")
    public static int[][][] field1825;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBII)I", line = 15)
    public static final int method656(int arg0, byte arg1, int arg2, int arg3) {
        field1817++;
        int var4 = arg3 / arg0;
        int var5 = arg2 / arg0;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg0 - 1 & arg3;
        int var8 = class170.method1137(var4, (byte) 8, var5);
        int var9 = class170.method1137(var4 + 1, (byte) 8, var5);
        int var10 = class170.method1137(var4, (byte) 8, var5 + 1);
        int var11 = class170.method1137(var4 + 1, (byte) 8, var5 + 1);
        int var12 = class84.method533(-29436, var9, arg0, var8, var7);
        int var13 = class84.method533(-29436, var11, arg0, var10, var7);
        if (arg1 <= 123) {
            method658(-43, -10, 115, -2, -66);
        }
        return class84.method533(-29436, var13, arg0, var12, var6);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLmh;Lmh;IILmh;)V", line = 56)
    public static final void method657(boolean arg0, class128 arg1, class128 arg2, int arg3, int arg4, class128 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class45.field913[var6] = class45.field913[var6 - 1];
            class289.field4953[var6] = class289.field4953[var6 - 1];
            class287.field4903[var6] = class287.field4903[var6 - 1];
            class53.field1038[var6] = class53.field1038[var6 - 1];
            class249.field4304[var6] = class249.field4304[var6 - 1];
        }
        class45.field913[0] = arg4;
        class187.field3252 = class104.field1788;
        if (arg0) {
            return;
        }
        field1815++;
        class249.field4304[0] = arg3;
        class289.field4953[0] = arg5;
        class120.field2023++;
        class287.field4903[0] = arg1;
        class53.field1038[0] = arg2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)[I", line = 88)
    public final int[] method69(byte arg0, int arg1) {
        field1818++;
        if (arg0 != 85) {
            return (int[]) null;
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        if (this.field2977.field4552) {
            int[] var4 = this.method1142((byte) 44, 0, this.field1820 ? class297.field5073 - arg1 : arg1);
            if (this.field1816) {
                for (int var5 = 0; var5 < class185.field3225; var5++) {
                    var3[var5] = var4[class5.field94 - var5];
                }
            } else {
                class224.method1540(var4, 0, var3, 0, class185.field3225);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 272)
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILbg;B)V", line = 159)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field1816 = arg1.method1325(arg2 + 7614) == 1;
        } else if (arg0 == 1) {
            this.field1820 = arg1.method1325(arg2 + 7614) == 1;
        } else if (arg0 == 2) {
            this.field2970 = arg1.method1325(7627) == 1;
        }
        if (arg2 != 13) {
            field1823 = (int[][][]) ((int[][][]) null);
        }
        field1826++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[[I", line = 197)
    public final int[][] method62(int arg0, int arg1) {
        int[][] var3 = this.field2976.method1098(arg0, -19544);
        field1814++;
        int var4 = -80 / ((arg1 + 24) / 46);
        if (this.field2976.field2883) {
            int[][] var5 = this.method1139(0, this.field1820 ? class297.field5073 - arg0 : arg0, 0);
            int[] var6 = var3[0];
            int[] var7 = var5[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[2];
            if (this.field1816) {
                for (int var12 = 0; var12 < class185.field3225; var12++) {
                    var6[var12] = var10[class5.field94 - var12];
                    var8[var12] = var7[class5.field94 - var12];
                    var9[var12] = var11[class5.field94 - var12];
                }
            } else {
                for (int var13 = 0; var13 < class185.field3225; var13++) {
                    var6[var13] = var10[var13];
                    var8[var13] = var7[var13];
                    var9[var13] = var11[var13];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V", line = 258)
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1824++;
        class143.field2441 = class5.field110 * arg3 / arg4;
        class102.field1756 = -1;
        class30.field663 = -1;
        class310.field5255 = class155.field2671 * arg2 / arg1;
        class130.method874(~arg0);
        if (arg0 != 0) {
            field1825 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V", line = 280)
    public static void method659(int arg0) {
        field1822 = null;
        field1819 = null;
        field1823 = (int[][][]) null;
        field1825 = (int[][][]) null;
        int var1 = -90 / ((18 - arg0) / 46);
        field1821 = null;
    }
}
