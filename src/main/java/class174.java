import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class174 extends class182 {

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public int field3128 = 2;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    public int field3141 = -1;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    public int field3138 = 5;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "Z")
    private boolean field3143 = false;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public int field3137 = -1;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "Z")
    public boolean field3152 = false;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public int field3150 = -1;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public int field3147 = 99;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public int field3154 = -1;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public int field3155 = -1;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field3129 = 0;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field3131 = 0;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "Lkh;")
    public static class117 field3140 = class224.method1450((byte) 121, ":trade:");

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field3151 = 0;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[I")
    public static int[] field3127 = new int[50];

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "Ls;")
    public static class197 field3135;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "[I")
    private int[] field3130;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "[I")
    private int[] field3133;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "[I")
    public int[] field3144;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "[I")
    public int[] field3148;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
    public int[][] field3136;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILcf;)Lcf;")
    public final class29 method1211(byte arg0, int arg1, class29 arg2) {
        int var4 = this.field3144[arg1];
        class122 var5 = class43.method361(arg0 - 202, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field3132++;
        if (var5 == null) {
            return arg2.method254(true, true);
        }
        class29 var7 = arg2.method254(!var5.method856(var6, (byte) 65), !this.field3143);
        var7.method260(var5, var6, this.field3143);
        if (arg0 != 119) {
            field3140 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILcf;)Lcf;")
    public final class29 method1212(int arg0, int arg1, int arg2, class29 arg3) {
        field3146++;
        int var5 = this.field3144[arg2];
        if (arg1 != 1) {
            return null;
        }
        class122 var6 = class43.method361(-76, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method254(true, true);
        }
        int var8 = arg0 & 0x3;
        class29 var9 = arg3.method254(!var6.method856(var7, (byte) 65), !this.field3143);
        if (var8 == 1) {
            var9.method255();
        } else if (var8 == 2) {
            var9.method259();
        } else if (var8 == 3) {
            var9.method252();
        }
        var9.method260(var6, var7, this.field3143);
        if (var8 == 1) {
            var9.method252();
        } else if (var8 == 2) {
            var9.method259();
        } else if (var8 == 3) {
            var9.method255();
        }
        return var9;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILcf;)Lcf;")
    public final class29 method1213(int arg0, int arg1, class29 arg2) {
        field3134++;
        int var4 = this.field3144[arg0];
        class122 var5 = class43.method361(-83, var4 >> 16);
        int var6 = 117 % ((-arg1 - 15) / 50);
        int var7 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method250(true, true);
        } else {
            class29 var8 = arg2.method250(!var5.method856(var7, (byte) 65), !this.field3143);
            var8.method260(var5, var7, this.field3143);
            return var8;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lpj;IILcf;I)Lcf;")
    public final class29 method1214(class174 arg0, int arg1, int arg2, class29 arg3, int arg4) {
        field3142++;
        if (arg4 > -43) {
            return null;
        }
        int var6 = this.field3144[arg1];
        class122 var7 = class43.method361(-95, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method1211((byte) 119, arg2, arg3);
        }
        int var9 = arg0.field3144[arg2];
        class122 var10 = class43.method361(-103, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class29 var12 = arg3.method254(!var7.method856(var8, (byte) 65), !this.field3143);
            var12.method260(var7, var8, this.field3143);
            return var12;
        } else {
            class29 var13 = arg3.method254(!var7.method856(var8, (byte) 65) & !var10.method856(var11, (byte) 65), !this.field3143 & !arg0.field3143);
            var13.method256(var7, var8, var10, var11, this.field3133, arg0.field3143 | this.field3143);
            return var13;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILnc;)V")
    public final void method1215(int arg0, class145 arg1) {
        field3153++;
        if (arg0 != 3521) {
            this.method1218(0, null, -4);
        }
        while (true) {
            int var3 = arg1.method998(105);
            if (var3 == 0) {
                return;
            }
            this.method1218(-1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILcf;I)Lcf;")
    public final class29 method1216(int arg0, class29 arg1, int arg2) {
        field3145++;
        int var4 = this.field3144[arg0];
        class122 var5 = class43.method361(-101, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method254(true, true);
        }
        class122 var7 = null;
        int var8 = 0;
        int var9 = -57 % ((arg2 + 73) / 48);
        if (this.field3130 != null && arg0 < this.field3130.length) {
            int var10 = this.field3130[arg0];
            var7 = class43.method361(-88, var10 >> 16);
            var8 = var10 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class29 var12 = arg1.method254(!var5.method856(var6, (byte) 65), !this.field3143);
            var12.method260(var5, var6, this.field3143);
            return var12;
        } else {
            class29 var11 = arg1.method254(!var5.method856(var6, (byte) 65) & !var7.method856(var8, (byte) 65), !this.field3143);
            var11.method260(var5, var6, this.field3143);
            var11.method260(var7, var8, this.field3143);
            return var11;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public final void method1217(int arg0) {
        if (this.field3150 == -1) {
            if (this.field3133 == null) {
                this.field3150 = 0;
            } else {
                this.field3150 = 2;
            }
        }
        if (this.field3141 == -1) {
            if (this.field3133 == null) {
                this.field3141 = 0;
            } else {
                this.field3141 = 2;
            }
        }
        int var2 = -19 % ((-arg0 - 77) / 47);
        field3149++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILnc;I)V")
    private final void method1218(int arg0, class145 arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg1.method1049((byte) 127);
            this.field3148 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3148[var14] = arg1.method1049((byte) 117);
            }
            this.field3144 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3144[var15] = arg1.method1049((byte) 99);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3144[var16] += arg1.method1049((byte) 119) << 16;
            }
        } else if (arg2 == 2) {
            this.field3137 = arg1.method1049((byte) 120);
        } else if (arg2 == 3) {
            int var4 = arg1.method998(arg0 + 103);
            this.field3133 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3133[var5] = arg1.method998(57);
            }
            this.field3133[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field3152 = true;
        } else if (arg2 == 5) {
            this.field3138 = arg1.method998(arg0 + 70);
        } else if (arg2 == 6) {
            this.field3155 = arg1.method1049((byte) 104);
        } else if (arg2 == 7) {
            this.field3154 = arg1.method1049((byte) 105);
        } else if (arg2 == 8) {
            this.field3147 = arg1.method998(101);
        } else if (arg2 == 9) {
            this.field3150 = arg1.method998(67);
        } else if (arg2 == 10) {
            this.field3141 = arg1.method998(59);
        } else if (arg2 == 11) {
            this.field3128 = arg1.method998(arg0 + 99);
        } else if (arg2 == 12) {
            int var6 = arg1.method998(arg0 ^ 0xFFFFFF89);
            this.field3130 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3130[var7] = arg1.method1049((byte) 96);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3130[var8] += arg1.method1049((byte) 110) << 16;
            }
        } else if (arg2 == 13) {
            int var9 = arg1.method1049((byte) 98);
            this.field3136 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg1.method998(arg0 + 65);
                if (var11 > 0) {
                    this.field3136[var10] = new int[var11];
                    this.field3136[var10][0] = arg1.method1023(-1002744);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field3136[var10][var12] = arg1.method1049((byte) 94);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3143 = true;
        }
        if (arg0 == -1) {
            field3139++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    public static void method1219(int arg0) {
        if (arg0 != -10256) {
            field3131 = -106;
        }
        field3127 = null;
        field3135 = null;
        field3140 = null;
    }
}
