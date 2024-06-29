import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class294 extends class183 {

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    private int field5028 = 4096;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    private int field5032 = 4096;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    private int field5037 = 4096;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field5026 = 0;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "F")
    public static float field5035;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "[I")
    public static int[] field5025;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V", line = 7)
    public static void method2036(int arg0) {
        field5025 = null;
        if (arg0 >= -123) {
            method2036(84);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 17)
    public class294() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lhg;III)V", line = 20)
    public static final void method2037(class174 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class170.field2971) {
            class125 var4 = class312.field5246[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2190 != null && var4.field2190.field2480.method1183()) {
                arg0.method1180(var4.field2190.field2480, 128, 0, 0, true);
            }
        }
        if (arg3 < class170.field2971) {
            class125 var5 = class312.field5246[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2190 != null && var5.field2190.field2480.method1183()) {
                arg0.method1180(var5.field2190.field2480, 0, 0, 128, true);
            }
        }
        if (arg2 < class170.field2971 && arg3 < class10.field119) {
            class125 var6 = class312.field5246[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2190 != null && var6.field2190.field2480.method1183()) {
                arg0.method1180(var6.field2190.field2480, 128, 0, 128, true);
            }
        }
        if (arg2 < class170.field2971 && arg3 > 0) {
            class125 var7 = class312.field5246[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2190 != null && var7.field2190.field2480.method1183()) {
                arg0.method1180(var7.field2190.field2480, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILkh;I)V", line = 89)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field5031++;
        if (arg2 == 0) {
            this.field5032 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field5037 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field5028 = arg1.method116(-1);
        }
        if (arg0 >= -43) {
            this.field5028 = 117;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIB)I", line = 148)
    public static final int method2038(int arg0, int arg1, byte arg2) {
        if (arg2 != -48) {
            method2036(123);
        }
        int var3 = arg0 >>> 31;
        field5034++;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIILkh;IIIIZ)V", line = 167)
    public static final void method2039(int arg0, int arg1, int arg2, class14 arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg6 >= 0 && arg6 < 104 && arg4 >= 0 && arg4 < 104) {
            if (!arg8) {
                class142.field2464[arg5][arg6][arg4] = 0;
            }
            while (true) {
                int var9 = arg3.method93(false);
                if (var9 == 0) {
                    if (arg8) {
                        class132.field2328[0][arg6][arg4] = class16.field256[0][arg6][arg4];
                    } else if (arg5 == 0) {
                        class132.field2328[0][arg6][arg4] = -class89.method634(arg0 + arg4 + 556238, arg6 + 932731 - -arg7, true) * 8;
                    } else {
                        class132.field2328[arg5][arg6][arg4] = class132.field2328[arg5 - 1][arg6][arg4] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg3.method93(false);
                    if (arg8) {
                        class132.field2328[0][arg6][arg4] = var10 * 8 + class16.field256[0][arg6][arg4];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg5 == 0) {
                            class132.field2328[0][arg6][arg4] = -var10 * 8;
                        } else {
                            class132.field2328[arg5][arg6][arg4] = class132.field2328[arg5 - 1][arg6][arg4] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class217.field3735[arg5][arg6][arg4] = arg3.method98(true);
                    class115.field2083[arg5][arg6][arg4] = (byte) ((var9 - 2) / 4);
                    class236.field4084[arg5][arg6][arg4] = (byte) class305.method2086(3, var9 + arg1 - 2);
                } else if (var9 > 81) {
                    class260.field4515[arg5][arg6][arg4] = (byte) (var9 - 81);
                } else if (!arg8) {
                    class142.field2464[arg5][arg6][arg4] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg3.method93(false);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg3.method93(false);
                    break;
                }
                if (var11 <= 49) {
                    arg3.method93(false);
                }
            }
        }
        if (arg2 != -105) {
            method2038(96, -67, (byte) 66);
        }
        field5029++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[[I", line = 277)
    public final int[][] method12(int arg0, int arg1) {
        int var3 = 44 % ((arg0 - 18) / 61);
        field5033++;
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[][] var5 = this.method1250(arg1, 0, (byte) 110);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class22.field393; var12++) {
                int var13 = var8[var12];
                int var14 = var7[var12];
                int var15 = var6[var12];
                if (var13 == var14 && var13 == var15) {
                    var9[var12] = this.field5032 * var14 >> 12;
                    var10[var12] = this.field5037 * var13 >> 12;
                    var11[var12] = this.field5028 * var15 >> 12;
                } else {
                    var9[var12] = this.field5032;
                    var10[var12] = this.field5037;
                    var11[var12] = this.field5028;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JZ)V", line = 336)
    public static final void method2040(long arg0, boolean arg1) {
        field5030++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        if (!arg1) {
            method2040(-91L, true);
        }
        while (class162.field2753 > var3) {
            if (class212.field3643[var3] == arg0) {
                class162.field2753--;
                class331.field5643++;
                for (int var4 = var3; var4 < class162.field2753; var4++) {
                    class212.field3643[var4] = class212.field3643[var4 + 1];
                    class52.field906[var4] = class52.field906[var4 + 1];
                }
                class258.field4491 = class6.field70;
                class84.field1608.method1397(110, 0);
                class84.field1608.method118(arg0, (byte) -125);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lkh;Z)Lmc;", line = 381)
    public static final class183 method2041(class14 arg0, boolean arg1) {
        field5038++;
        arg0.method93(false);
        int var2 = arg0.method93(false);
        class183 var3 = class213.method1461(6454, var2);
        var3.field3170 = arg0.method93(false);
        int var4 = arg0.method93(!arg1);
        int var5 = 0;
        if (!arg1) {
            field5026 = 56;
        }
        while (var4 > var5) {
            int var6 = arg0.method93(false);
            var3.method14(-69, arg0, var6);
            var5++;
        }
        var3.method25(-8);
        return var3;
    }
}
