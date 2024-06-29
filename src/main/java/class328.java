import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class328 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Z")
    private boolean field4820 = true;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    private int field4822 = -1;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "[Lkk;")
    private class129[] field4823;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    private int field4819;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    private int field4828;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    private int field4826;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Lkk;")
    private class129 field4817;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "[Lkk;")
    private class129[] field4827;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Z")
    public static boolean field4821 = false;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    private int field4824;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
    private int field4829;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Lci;")
    public static class320 field4816;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Laa;")
    private class343 field4814;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2073(int arg0) {
        if (arg0 != 2) {
            method2073(34);
        }
        field4816 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIILqa;III)V")
    public final void method2074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6, int arg7, int arg8, int arg9) {
        field4815++;
        int var11 = arg2 + arg4 & 0x3FFF;
        if (this.field4828 == -1) {
            arg6.method215(arg5, arg9, arg8, arg7, arg3, 0);
        } else {
            class39 var12 = class483.field7009.method93((byte) -61, this.field4828);
            if (this.field4814 == null && class483.field7009.method92(arg1 + 16720, this.field4828)) {
                int[] var13 = var12.field818 ? class483.field7009.method91(this.field4824, false, this.field4824, this.field4828, 0.7F, (byte) 26) : class483.field7009.method94((byte) 105, 0.7F, false, this.field4824, this.field4824, this.field4828);
                this.field4814 = arg6.method284(var13, 0, this.field4824, this.field4824, this.field4824);
            }
            if (var12.field818) {
                arg6.method215(arg5, arg9, arg8, arg7, arg3, 0);
            }
            if (this.field4814 != null) {
                int var14 = var12.field818 ? 1 : 0;
                int var15 = arg0 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg8 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (var15 > arg7) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg8; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field4814.method372(arg5 + var17, arg9 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4829 - 1; var19 >= 0; var19--) {
            this.field4827[var19].method954(arg6, arg5, arg9, arg8, arg7, arg0, var11);
        }
        if (arg1 != -4096) {
            this.field4820 = true;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public final void method2075(int arg0) {
        field4830++;
        if (arg0 != -29545) {
            return;
        }
        if (this.field4823 != null) {
            for (int var2 = 0; var2 < this.field4823.length; var2++) {
                this.field4823[var2].method951();
            }
        }
        this.field4814 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lqa;IB)Z")
    public final boolean method2076(class167 arg0, int arg1, byte arg2) {
        field4825++;
        int var4 = 51 % ((23 - arg2) / 56);
        if (this.field4822 != arg1) {
            this.field4822 = arg1;
            int var5 = class285.method1834(-100, arg1);
            if (var5 > 512) {
                var5 = 512;
            }
            if (var5 <= 0) {
                var5 = 1;
            }
            if (this.field4824 != var5) {
                this.field4814 = null;
                this.field4824 = var5;
            }
            if (this.field4823 != null) {
                this.field4829 = 0;
                int[] var6 = new int[this.field4823.length];
                for (int var7 = 0; var7 < this.field4823.length; var7++) {
                    class129 var8 = this.field4823[var7];
                    if (var8.method947(this.field4818, this.field4819, this.field4826, this.field4822)) {
                        var6[this.field4829] = var8.field2012;
                        this.field4827[this.field4829++] = var8;
                    }
                }
                class178.method1245(this.field4827, var6, 1, this.field4829 - 1, 0);
            }
            this.field4820 = true;
        }
        boolean var9 = false;
        if (this.field4820) {
            this.field4820 = false;
            for (int var10 = this.field4829 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field4827[var10].method948(arg0, this.field4817);
                var9 |= var11;
                this.field4820 |= !var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I[Lkk;IIII)V")
    public class328(int arg0, class129[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4818 = arg3;
        this.field4823 = arg1;
        this.field4819 = arg4;
        this.field4828 = arg0;
        this.field4826 = arg5;
        if (arg1 == null) {
            this.field4817 = null;
            this.field4827 = null;
        } else {
            this.field4827 = new class129[arg1.length];
            this.field4817 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
