import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class39 extends class23 {

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "Lpl;")
    public static class186 field705 = new class186(32);

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "Lqd;")
    public static class40 field708 = class147.method1106("overlay", (byte) -128);

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "[Lle;")
    public static class236[] field709;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)[I", line = 7)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            field709 = (class236[]) null;
        }
        int[] var3 = this.field403.method724((byte) 88, arg1);
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, arg0 + 94, arg1);
            int[] var5 = this.method174(1, 0, arg1);
            int[] var6 = this.method174(2, 0, arg1);
            for (int var7 = 0; var7 < class52.field1007; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        field704++;
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 61)
    public class39() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V", line = 66)
    public static void method322(int arg0) {
        field709 = null;
        field705 = null;
        field708 = null;
        if (arg0 != -3701) {
            field705 = (class186) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILbg;IJIIII)Z", line = 83)
    public static final boolean method323(int arg0, int arg1, int arg2, int arg3, class196 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class303.method2066(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[Lwe;)V", line = 89)
    public static final void method324(int arg0, class47[] arg1) {
        class293.field4933[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[[I", line = 102)
    public final int[][] method17(int arg0, int arg1) {
        int[][] var3 = this.field417.method1251(arg1, 119);
        if (this.field417.field2751) {
            int[] var4 = this.method174(2, 0, arg1);
            int[][] var5 = this.method173(0, arg1, (byte) 81);
            int[][] var6 = this.method173(1, arg1, (byte) -112);
            int[] var7 = var3[2];
            int[] var8 = var5[1];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var5[2];
            int[] var12 = var5[0];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class52.field1007; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var12[var16];
                    var10[var16] = var8[var16];
                    var7[var16] = var11[var16];
                } else if (var17 == 0) {
                    var9[var16] = var13[var16];
                    var10[var16] = var15[var16];
                    var7[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var9[var16] = var12[var16] * var17 + var13[var16] * var18 >> 12;
                    var10[var16] = var8[var16] * var17 + (var15[var16] * var18) >> 12;
                    var7[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        if (arg0 < 30) {
            this.method32((byte) -38, -91);
        }
        field707++;
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILsd;)V", line = 189)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field706++;
        if (arg1 != 0) {
            this.method17(24, -109);
        }
        if (arg0 == 0) {
            this.field415 = arg2.method226(255) == 1;
        }
    }
}
