import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class296 {

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    private int field4965 = 0;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    private int field4958 = -1;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lli;")
    private class18 field4955 = new class18();

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Z")
    public boolean field4967 = false;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    private int field4963;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[[I")
    private int[][] field4960;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    private int field4964;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[Lle;")
    private class91[] field4959;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field4961 = 2;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    public static int[] field4954 = new int[2];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lda;")
    public static class143 field4956;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 17)
    public final void method2027(int arg0) {
        field4962++;
        if (arg0 != -2) {
            return;
        }
        for (int var2 = 0; var2 < this.field4963; var2++) {
            this.field4960[var2] = null;
        }
        this.field4959 = null;
        this.field4960 = (int[][]) null;
        this.field4955.method171(-87);
        this.field4955 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 57)
    public static void method2028(byte arg0) {
        field4956 = null;
        if (arg0 == -107) {
            field4954 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V", line = 68)
    public static final void method2029(int arg0, int arg1) {
        class233.field3888.method1538(arg1, (byte) -46);
        field4951++;
        if (arg0 == -2) {
            class216.field3612.method1538(arg1, (byte) -40);
            class90.field1600.method1538(arg1, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)[[I", line = 88)
    public final int[][] method2030(int arg0) {
        field4966++;
        if (arg0 != 2595) {
            return (int[][]) ((int[][]) null);
        } else if (this.field4964 == this.field4963) {
            for (int var2 = 0; var2 < this.field4963; var2++) {
                this.field4959[var2] = class303.field5119;
            }
            return this.field4960;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILda;)Z", line = 116)
    public static final boolean method2031(int arg0, class143 arg1) {
        if (arg0 == -4097) {
            field4957++;
            return arg1.method1118(class104.field1870, 26604);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[I", line = 135)
    public final int[] method2032(int arg0, int arg1) {
        if (arg0 != 3) {
            return (int[]) null;
        }
        field4952++;
        if (this.field4964 == this.field4963) {
            this.field4967 = this.field4959[arg1] == null;
            this.field4959[arg1] = class303.field5119;
            return this.field4960[arg1];
        } else if (this.field4963 == 1) {
            this.field4967 = this.field4958 != arg1;
            this.field4958 = arg1;
            return this.field4960[0];
        } else {
            class91 var3 = this.field4959[arg1];
            if (var3 == null) {
                this.field4967 = true;
                if (this.field4963 > this.field4965) {
                    var3 = new class91(arg1, this.field4965);
                    this.field4965++;
                } else {
                    class91 var4 = (class91) this.field4955.method160((byte) -48);
                    var3 = new class91(arg1, var4.field1615);
                    this.field4959[var4.field1610] = null;
                    var4.method1183(false);
                }
                this.field4959[arg1] = var3;
            } else {
                this.field4967 = false;
            }
            this.field4955.method163((byte) 77, var3);
            return this.field4960[var3.field1615];
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V", line = 296)
    public class296(int arg0, int arg1, int arg2) {
        this.field4963 = arg0;
        this.field4960 = new int[this.field4963][arg2];
        this.field4964 = arg1;
        this.field4959 = new class91[this.field4964];
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V", line = 211)
    public static final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 128) {
            method2029(-31, 84);
        }
        field4953++;
        if (arg3 == arg5 && arg2 == arg8 && arg0 == arg4 && arg1 == arg6) {
            class148.method1175(arg6, arg9, false, arg2, arg4, arg5);
            return;
        }
        int var10 = arg5;
        int var11 = arg2;
        int var12 = arg5 * 3;
        int var13 = arg2 * 3;
        int var14 = arg8 * 3;
        int var15 = arg3 * 3;
        int var16 = arg0 * 3;
        int var17 = arg1 * 3;
        int var18 = arg4 + var15 - var16 - arg5;
        int var19 = var17 - (var14 - var13) - var14;
        int var20 = arg6 + var14 - var17 - arg2;
        int var21 = var16 + var12 - var15 - var15;
        int var22 = var15 - var12;
        int var23 = var14 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var20 * var26;
            int var29 = var21 * var25;
            int var30 = var19 * var25;
            int var31 = var23 * var24;
            int var32 = var22 * var24;
            int var33 = (var27 + var29 + var32 >> 12) + arg5;
            int var34 = (var28 + var31 + var30 >> 12) + arg2;
            class148.method1175(var34, arg9, false, var11, var33, var10);
            var10 = var33;
            var11 = var34;
        }
    }
}
