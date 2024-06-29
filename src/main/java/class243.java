import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class243 extends class242 {

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    private int field4267 = 2048;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    private int field4279 = 0;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    private int field4277 = 10;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "Lp;")
    public static class280 field4269 = class18.method140((byte) -125, "Module texte charg-B");

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "Lp;")
    public static class280 field4274 = class18.method140((byte) -117, "Fallen lassen");

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4270 = -1;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
    public static int[] field4271 = new int[5];

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "Lp;")
    public static class280 field4283 = class18.method140((byte) -124, "Impossible de trouver ");

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[I")
    public static int[] field4263;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "[I")
    private int[] field4275;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "[I")
    private int[] field4281;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "[[[I")
    public static int[][][] field4265;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg0 >= -119) {
            this.method49(51, -91, (class25) null);
        }
        ++field4276;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4279 = arg2.method189((byte) -103);
                }
            } else {
                this.field4267 = arg2.method193((byte) 77);
            }
        } else {
            this.field4277 = arg2.method189((byte) -103);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    private final void method1650(byte arg0) {
        this.field4275 = new int[this.field4277 + 1];
        ++field4273;
        this.field4281 = new int[this.field4277 - -1];
        int var2 = 0;
        if (arg0 < 52) {
            method1654(84, 124, 47, 93);
        }
        int var3 = 4096 / this.field4277;
        int var4 = this.field4267 * var3 >> 12;
        for (int var5 = 0; ~this.field4277 < ~var5; ++var5) {
            this.field4275[var5] = var2;
            this.field4281[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4275[this.field4277] = 4096;
        this.field4281[this.field4277] = this.field4281[0] + 4096;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public static void method1651(boolean arg0) {
        field4269 = null;
        field4274 = null;
        field4263 = null;
        field4265 = null;
        if (arg0) {
            field4282 = 15;
        }
        field4271 = null;
        field4283 = null;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        class248.field4343.method1485((byte) -105);
        ++field4278;
        class245.field4305.method1485((byte) -126);
        class30.field566.method1485((byte) -85);
        class261.field4616.method1485((byte) -125);
        int var1 = -82 / ((arg0 - 72) / 44);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field4284;
        int var3 = 102 % ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 98, arg0);
        if (super.field4251.field3655) {
            int var5 = class117.field2106[arg0];
            if (~this.field4279 != -1) {
                for (int var6 = 0; class264.field4654 > var6; ++var6) {
                    short var7 = 0;
                    int var8 = 0;
                    int var9 = class102.field1701[var6];
                    int var10 = this.field4279;
                    if (var10 != 1) {
                        if (var10 != 2) {
                            if (~var10 == -4) {
                                var8 = (-var5 + var9 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var9 - -var5 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var9;
                    }
                    for (int var11 = 0; this.field4277 > var11; ++var11) {
                        if (~var8 <= ~this.field4275[var11] && var8 < this.field4275[var11 - -1]) {
                            if (~var8 > ~this.field4281[var11]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var6] = var7;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; ~var13 > ~this.field4277; ++var13) {
                    if (~var5 <= ~this.field4275[var13] && var5 < this.field4275[var13 + 1]) {
                        if (this.field4281[var13] > var5) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class143.method986(var4, 0, class264.field4654, var12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V")
    public static final void method1653(int arg0) {
        int var1 = 2 / ((-68 - arg0) / 53);
        ++field4272;
        class101.field1644.method1481(false);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.method1650((byte) 86);
        if (arg0 < 122) {
            this.method49(71, -91, (class25) null);
        }
        ++field4280;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V")
    public static final void method1654(int arg0, int arg1, int arg2, int arg3) {
        class162 var4 = class220.field3787[arg0][arg1][arg2];
        if (var4 != null) {
            class49 var5 = var4.field2852;
            if (var5 != null) {
                var5.field797 = var5.field797 * arg3 / 16;
                var5.field802 = var5.field802 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1655(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class57.field928 * 128) {
            arg0 = class57.field928 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class86.field1411 * 128) {
            arg2 = class86.field1411 * 128 - 1;
        }
        class113.field1960 = class146.field2545[arg3];
        class66.field1112 = class146.field2541[arg3];
        class182.field3204 = class146.field2545[arg4];
        class158.field2762 = class146.field2541[arg4];
        class51.field841 = arg0;
        class277.field4814 = arg1;
        class108.field1786 = arg2;
        class15.field284 = arg0 / 128;
        class277.field4811 = arg2 / 128;
        class46.field771 = class15.field284 - class18.field324;
        if (class46.field771 < 0) {
            class46.field771 = 0;
        }
        class271.field4744 = class277.field4811 - class18.field324;
        if (class271.field4744 < 0) {
            class271.field4744 = 0;
        }
        class45.field748 = class18.field324 + class15.field284;
        if (class45.field748 > class57.field928) {
            class45.field748 = class57.field928;
        }
        class98.field1574 = class277.field4811 + class18.field324;
        if (class98.field1574 > class86.field1411) {
            class98.field1574 = class86.field1411;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class18.field324 + class18.field324 + 2; ++var16) {
            for (int var19 = 0; var19 < class18.field324 + class18.field324 + 2; ++var19) {
                int var20 = (var16 - class18.field324 << 7) - (class51.field841 & 127);
                int var21 = (var19 - class18.field324 << 7) - (class108.field1786 & 127);
                int var22 = class15.field284 - class18.field324 + var16;
                int var23 = class277.field4811 - class18.field324 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class57.field928 && var23 < class86.field1411) {
                    int var24;
                    if (class265.field4670 != null) {
                        var24 = class265.field4670[0][var22][var23] - class277.field4814 + 128;
                    } else {
                        var24 = class168.field2937[0][var22][var23] - class277.field4814 + 128;
                    }
                    int var25 = class168.field2937[3][var22][var23] - class277.field4814 - 1000;
                    class100.field1639[var16][var19] = class240.method1632(var20, var25, var24, var21, var15);
                } else {
                    class100.field1639[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class18.field324 + class18.field324 + 1; ++var17) {
            for (int var18 = 0; var18 < class18.field324 + class18.field324 + 1; ++var18) {
                class55.field905[var17][var18] = class100.field1639[var17][var18] || class100.field1639[var17 + 1][var18] || class100.field1639[var17][var18 + 1] || class100.field1639[var17 + 1][var18 + 1];
            }
        }
        class25.field495 = arg6;
        class61.field995 = arg7;
        class204.field3540 = arg8;
        class33.field623 = arg9;
        class23.field431 = arg10;
        class254.method1709();
        if (class25.field473 != null) {
            class112.method781(true);
            class185.method1288(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class112.method781(false);
        }
        class185.method1288(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
