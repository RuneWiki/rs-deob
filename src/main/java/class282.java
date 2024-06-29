import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class282 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "B")
    public byte field3736;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "Lsr;")
    public static class167 field3740 = new class167();

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "Lrd;")
    public class224 field3737;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lrk;")
    public class25 field3734;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lfo;")
    public static class361 field3733;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lkl;")
    public class56 field3730;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Ljj;")
    public class77 field3726;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 4)
    public static void method1704(int arg0) {
        if (arg0 == -9993) {
            field3733 = null;
            field3740 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)I", line = 15)
    public static final int method1705(int arg0, int arg1, int arg2) {
        if (arg0 != -1794365889) {
            field3733 = null;
        }
        field3729++;
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 30)
    public static final void method1706(int arg0) {
        field3731++;
        class60.method361(class319.field4256.field4657, (byte) -18);
        int var1 = (class238.field3171 >> 10) + (class357.field4867 >> 3);
        class210.field2808 = class96.field1170.field3695 = 0;
        int var2 = (class418.field6074 >> 3) + (class139.field1857 >> 10);
        class96.field1170.method3152(8, 128, 8);
        byte var3 = 18;
        class245.field3230 = new int[var3];
        class195.field2507 = new int[var3];
        class48.field496 = new int[var3][4];
        class180.field2346 = new int[var3];
        class391.field5650 = new int[var3];
        class68.field775 = new byte[var3][];
        class47.field494 = new byte[var3][];
        class318.field4245 = new int[var3];
        class467.field6937 = new int[var3];
        class409.field5862 = new byte[var3][];
        class396.field5734 = new byte[var3][];
        class31.field318 = new byte[var3][];
        int var4 = 0;
        if (arg0 >= -62) {
            method1705(30, -114, -124);
        }
        for (int var5 = (var1 - (class308.field4128 >> 4)) / 8; var5 <= (var1 + (class308.field4128 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class426.field6200 >> 4)) / 8; var8 <= (((class426.field6200 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class467.field6937[var4] = var9;
                class318.field4245[var4] = class426.field6186.method2148("m" + var5 + "_" + var8, 0);
                class391.field5650[var4] = class426.field6186.method2148("l" + var5 + "_" + var8, 0);
                class180.field2346[var4] = class426.field6186.method2148("n" + var5 + "_" + var8, 0);
                class245.field3230[var4] = class426.field6186.method2148("um" + var5 + "_" + var8, 0);
                class195.field2507[var4] = class426.field6186.method2148("ul" + var5 + "_" + var8, 0);
                if (class180.field2346[var4] == -1) {
                    class318.field4245[var4] = -1;
                    class391.field5650[var4] = -1;
                    class245.field3230[var4] = -1;
                    class195.field2507[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class180.field2346.length; var6++) {
            class180.field2346[var6] = -1;
            class318.field4245[var6] = -1;
            class391.field5650[var6] = -1;
            class245.field3230[var6] = -1;
            class195.field2507[var6] = -1;
        }
        byte var7;
        if (class527.field7734 == 1 || class527.field7734 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class514.method3066(var7, var1, false, var2, 0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lqr;ILza;ILql;I)Z", line = 130)
    public static final boolean method1707(class48 arg0, int arg1, class287 arg2, int arg3, class519 arg4, int arg5) {
        field3727++;
        int var6 = Integer.MAX_VALUE;
        int var7 = arg5;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field537 != null) {
            var6 = (arg4.field7651 + arg0.field529 - class416.field6018) * (class416.field6017 - class416.field6016) / (class416.field6019 - class416.field6018) + class416.field6016;
            var7 = class416.field6016 + ((class416.field6017 - class416.field6016) * (arg0.field502 + arg4.field7651 - class416.field6018) / (class416.field6019 - class416.field6018));
            var8 = class416.field6007 - (arg0.field540 + arg4.field7648 - class416.field6010) * (class416.field6007 - class416.field6012) / (class416.field6013 - class416.field6010);
            var9 = class416.field6007 - ((arg0.field535 + arg4.field7648 - class416.field6010) * (class416.field6007 - class416.field6012) / (class416.field6013 - class416.field6010));
        }
        class24 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field536 != -1) {
            if (arg4.field7652 && arg0.field538 != -1) {
                var10 = arg0.method277(arg5 + Integer.MIN_VALUE, true, arg2);
            } else {
                var10 = arg0.method277(0, false, arg2);
            }
            if (var10 != null) {
                var11 = arg4.field7645 - (var10.method155() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg4.field7645 + (var10.method155() + 1 >> 1);
                var13 = arg4.field7650 - (var10.method153() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg4.field7650 + (var10.method153() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class145 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field520 != null) {
            var15 = class124.method746(arg0.field509, arg5 ^ 0x80000002);
            if (var15 != null) {
                var16 = class328.field4362.method1064((byte) -125, null, null, class376.field5103, arg0.field520);
                int var23 = arg4.field7650;
                if (var10 == null) {
                    var17 = var23 - var15.method885() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method153() >> 1) + (var16 * var15.method889()));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class376.field5103[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method886(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3 + arg4.field7645 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg3 + arg4.field7645;
                var21 = arg1 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var16 * var15.method889() + arg1 + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class416.field6016 > var7 || var6 > class416.field6017 || class416.field6012 > var9 || class416.field6007 < var8) {
            return true;
        }
        if (arg0.field537 != null) {
            int[] var27 = new int[arg0.field537.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg0.field537[var28 * 2] + arg4.field7651;
                int var31 = arg0.field537[var28 * 2 + 1] + arg4.field7648;
                var27[var28 * 2] = (class416.field6017 - class416.field6016) * (var30 - class416.field6018) / (class416.field6019 - class416.field6018) + class416.field6016;
                var27[var28 * 2 + 1] = class416.field6007 - ((var31 - class416.field6010) * (class416.field6007 - class416.field6012) / (class416.field6013 - class416.field6010));
            }
            class120.method718(arg2, var27, arg0.field513);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method1722(-126, var27[var29 * 2 + 2], var27[var29 * 2 + 1], arg0.field527, var27[var29 * 2], var27[var29 * 2 + 3]);
            }
            arg2.method1722(arg5 + 2147483576, var27[0], var27[var27.length - 1], arg0.field527, var27[var27.length - 2], var27[1]);
        }
        if (var10 != null) {
            if (class509.field7386 > 0 && (class183.field2379 != -1 && class183.field2379 == arg4.field7646 || class307.field4117 != -1 && class307.field4117 == arg0.field512)) {
                int var32;
                if (class53.field615 <= 50) {
                    var32 = class53.field615 * 2;
                } else {
                    var32 = (100 - class53.field615) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method1719(arg4.field7650, arg4.field7645, var10.method150() / 2 + 7, var33, 82);
                arg2.method1719(arg4.field7650, arg4.field7645, var10.method150() / 2 + 5, var33, 30);
                arg2.method1719(arg4.field7650, arg4.field7645, var10.method150() / 2 + 3, var33, 104);
                arg2.method1719(arg4.field7650, arg4.field7645, var10.method150() / 2 + 1, var33, 3);
                arg2.method1719(arg4.field7650, arg4.field7645, var10.method150() / 2, var33, arg5 ^ 0x80000007);
            }
            var10.method144(arg4.field7645 - (var10.method155() >> 1), arg4.field7650 - (var10.method153() >> 1));
        }
        if (arg0.field520 != null && var15 != null) {
            class317.method1890(var15, var17, arg2, arg0, arg4, arg5 + 2147463611, var18, var16);
        }
        if (arg0.field536 != -1 || arg0.field520 != null) {
            class320 var34 = new class320(arg4);
            var34.field4269 = var20;
            var34.field4264 = var11;
            var34.field4263 = var22;
            var34.field4262 = var19;
            var34.field4267 = var14;
            var34.field4273 = var12;
            var34.field4270 = var21;
            var34.field4266 = var13;
            class342.field4590.method975(0, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(BIIIII)V", line = 344)
    public class282(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3728 = arg1;
        this.field3739 = arg3;
        this.field3735 = arg4;
        this.field3736 = arg0;
        this.field3738 = arg5;
        this.field3732 = arg2;
    }
}
