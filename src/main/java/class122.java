import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class122 extends class165 {

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "[Z")
    public boolean[] field1910;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "[I")
    public int[] field1914;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "[I")
    public int[] field1916;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "[[I")
    public int[][] field1919;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "[Lpi;")
    public static class202[] field1917 = new class202[14];

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "F")
    public static float field1920;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "[I")
    public static int[] field1918;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V", line = 9)
    public static final void method881(byte arg0) {
        class70.field990++;
        int var1 = -114 / ((-arg0 - 47) / 48);
        field1913++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 29)
    public static int method882(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIII)I", line = 40)
    public static final int method883(boolean arg0, int arg1, int arg2, int arg3) {
        field1912++;
        int var4 = arg3 - 1 & arg2;
        int var5 = arg1 / arg3;
        int var6 = arg2 / arg3;
        int var7 = arg1 & arg3 - 1;
        int var8 = class93.method623(122, var5, var6);
        int var9 = class93.method623(88, var5, var6 + 1);
        int var10 = class93.method623(97, var5 + 1, var6);
        int var11 = class93.method623(70, var5 + 1, var6 + 1);
        if (arg0) {
            method883(false, 7, -44, 127);
        }
        int var12 = class233.method1687(var9, arg3, (byte) -27, var8, var4);
        int var13 = class233.method1687(var11, arg3, (byte) -27, var10, var4);
        return class233.method1687(var13, arg3, (byte) -27, var12, var7);
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I[B)V", line = 69)
    public class122(int arg0, byte[] arg1) {
        this.field1915 = arg0;
        class44 var3 = new class44(arg1);
        this.field1908 = var3.method286((byte) -87);
        this.field1910 = new boolean[this.field1908];
        this.field1914 = new int[this.field1908];
        this.field1916 = new int[this.field1908];
        this.field1919 = new int[this.field1908][];
        for (int var4 = 0; var4 < this.field1908; var4++) {
            this.field1914[var4] = var3.method286((byte) -94);
        }
        for (int var5 = 0; var5 < this.field1908; var5++) {
            this.field1910[var5] = var3.method286((byte) -83) == 1;
        }
        for (int var6 = 0; var6 < this.field1908; var6++) {
            this.field1916[var6] = var3.method271(21081);
        }
        for (int var7 = 0; var7 < this.field1908; var7++) {
            this.field1919[var7] = new int[var3.method286((byte) -72)];
        }
        for (int var8 = 0; var8 < this.field1908; var8++) {
            for (int var9 = 0; var9 < this.field1919[var8].length; var9++) {
                this.field1919[var8][var9] = var3.method286((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 128)
    public static void method884(boolean arg0) {
        field1917 = null;
        if (arg0) {
            method884(false);
        }
        field1918 = null;
    }
}
