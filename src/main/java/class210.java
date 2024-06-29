import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class210 extends class338 {

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[[I")
    public int[][] field2850;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
    public int[] field2852;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[I")
    public int[] field2856;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[Z")
    public boolean[] field2855;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "[I")
    public static int[] field2857 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V", line = 3)
    public static final void method1139(int arg0, int arg1, byte arg2) {
        field2854++;
        int var3 = class427.field6264.field6119[0];
        if (arg2 >= -85) {
            field2848 = 119;
        }
        int var4 = class427.field6264.field6109[0];
        if (class62.field636 == 1) {
            if (!class108.method573(0, 0, var4, var3, 1, arg1, 1, -2, true, arg0, false)) {
                class108.method573(0, 0, var4, var3, 1, arg1, 1, -3, true, arg0, false);
            }
        } else if (!class108.method573(0, 0, var4, var3, 1, arg1, 1, -3, true, arg0, false)) {
            class108.method573(0, 0, var4, var3, 1, arg1, 1, -2, true, arg0, false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V", line = 47)
    public static void method1140(int arg0) {
        field2857 = null;
        if (arg0 != -31978) {
            method1139(15, 13, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V", line = 60)
    public static final void method1141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            field2857 = null;
        }
        if (arg0 >= class322.field4306 && class310.field4183 >= arg2 && class335.field4462 <= arg5 && arg1 <= class6.field42) {
            class145.method789(arg0, arg5, 88, arg4, arg2, arg1);
        } else {
            class164.method876(3, arg0, arg4, arg2, arg1, arg5);
        }
        field2858++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLhq;)V", line = 77)
    public static final void method1142(byte arg0, class173 arg1) {
        arg1.field2169 = null;
        field2851++;
        if (class330.field4412 < 20) {
            class145.field1866.method992(arg1, -77);
            class330.field4412++;
        }
        if (arg0 <= 34) {
            method1139(-53, 121, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I[B)V", line = 99)
    public class210(int arg0, byte[] arg1) {
        this.field2860 = arg0;
        class250 var3 = new class250(arg1);
        this.field2853 = var3.method1350(31351);
        this.field2850 = new int[this.field2853][];
        this.field2852 = new int[this.field2853];
        this.field2856 = new int[this.field2853];
        this.field2855 = new boolean[this.field2853];
        for (int var4 = 0; var4 < this.field2853; var4++) {
            this.field2852[var4] = var3.method1350(31351);
        }
        for (int var5 = 0; var5 < this.field2853; var5++) {
            this.field2855[var5] = var3.method1350(31351) == 1;
        }
        for (int var6 = 0; var6 < this.field2853; var6++) {
            this.field2856[var6] = var3.method1374(-2);
        }
        for (int var7 = 0; var7 < this.field2853; var7++) {
            this.field2850[var7] = new int[var3.method1350(31351)];
        }
        for (int var8 = 0; var8 < this.field2853; var8++) {
            for (int var9 = 0; var9 < this.field2850[var8].length; var9++) {
                this.field2850[var8][var9] = var3.method1350(31351);
            }
        }
    }
}
