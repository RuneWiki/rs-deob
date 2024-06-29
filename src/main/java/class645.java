import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class645 {

    @OriginalMember(owner = "client!no", name = "d", descriptor = "[[[I")
    public static int[][][] field9155 = new int[2][][];

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    private int field9161;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public int field9162;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)I")
    public final int method3589(boolean arg0) {
        if (!arg0) {
            field9155 = null;
        }
        field9152++;
        return this.field9162 & 0x3FFF;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method3590(int arg0) {
        this.field9162 &= 0x3FFF;
        if (arg0 <= 119) {
            method3593((byte) -90);
        }
        field9153++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIZ)Z")
    public final boolean method3591(int arg0, int arg1, int arg2, boolean arg3) {
        field9156++;
        int var5 = this.field9161;
        if (this.field9162 == arg1 && this.field9161 == 0) {
            return false;
        }
        if (arg3) {
            method3594(-57, (byte) 109);
        }
        boolean var8;
        if (this.field9161 == 0) {
            if (this.field9162 < arg1 && this.field9162 + arg0 >= arg1 || this.field9162 > arg1 && arg1 >= this.field9162 - arg0) {
                this.field9162 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field9161 > 0 && arg1 > this.field9162) {
            int var6 = this.field9161 * this.field9161 / (arg0 * 2);
            int var7 = this.field9162 + var6;
            if (var7 < arg1 && this.field9162 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field9161 < 0 && this.field9162 > arg1) {
            int var9 = this.field9161 * this.field9161 / (arg0 * 2);
            int var10 = this.field9162 - var9;
            if (var10 > arg1 && var10 <= this.field9162) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg1 <= this.field9162) {
                this.field9161 -= arg0;
                if (arg2 != 0 && this.field9161 < (-arg2)) {
                    this.field9161 = -arg2;
                }
            } else {
                this.field9161 += arg0;
                if (arg2 != 0 && arg2 < this.field9161) {
                    this.field9161 = arg2;
                }
            }
            if (this.field9161 != var5) {
                int var11 = this.field9161 * this.field9161 / (arg0 * 2);
                if (arg1 > this.field9162) {
                    if (arg1 < (this.field9162 + var11)) {
                        this.field9161 = var5;
                    }
                } else if (arg1 < this.field9162 && arg1 > this.field9162 - var11) {
                    this.field9161 = var5;
                }
            }
        } else if (this.field9161 <= 0) {
            this.field9161 += arg0;
            if (this.field9161 > 0) {
                this.field9161 = 0;
            }
        } else {
            this.field9161 -= arg0;
            if (this.field9161 < 0) {
                this.field9161 = 0;
            }
        }
        this.field9162 += this.field9161 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)V")
    public final void method3592(int arg0, int arg1) {
        if (arg1 <= 5) {
            method3595(null, 65, -108, 98, 30, 63, 36, -22, 42, 114, -104);
        }
        this.field9162 = arg0;
        this.field9161 = 0;
        field9160++;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
    public static void method3593(byte arg0) {
        field9155 = null;
        if (arg0 != -84) {
            method3593((byte) 50);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)Leca;")
    public static final class694 method3594(int arg0, byte arg1) {
        if (arg1 <= 12) {
            return null;
        }
        field9157++;
        if (arg0 == 0) {
            return new class678();
        } else if (arg0 == 1) {
            return new class368();
        } else if (arg0 == 2) {
            return new class24();
        } else if (arg0 == 3) {
            return new class542();
        } else if (arg0 == 4) {
            return new class454();
        } else if (arg0 == 5) {
            return new class183();
        } else if (arg0 == 6) {
            return new class395();
        } else if (arg0 == 7) {
            return new class606();
        } else if (arg0 == 8) {
            return new class355();
        } else if (arg0 == 9) {
            return new class465();
        } else if (arg0 == 10) {
            return new class288();
        } else if (arg0 == 11) {
            return new class398();
        } else if (arg0 == 12) {
            return new class441();
        } else if (arg0 == 13) {
            return new class66();
        } else if (arg0 == 14) {
            return new class105();
        } else if (arg0 == 15) {
            return new class7();
        } else if (arg0 == 16) {
            return new class29();
        } else if (arg0 == 17) {
            return new class507();
        } else if (arg0 == 18) {
            return new class116();
        } else if (arg0 == 19) {
            return new class607();
        } else if (arg0 == 20) {
            return new class414();
        } else if (arg0 == 21) {
            return new class87();
        } else if (arg0 == 22) {
            return new class23();
        } else if (arg0 == 23) {
            return new class522();
        } else if (arg0 == 24) {
            return new class604();
        } else if (arg0 == 25) {
            return new class571();
        } else if (arg0 == 26) {
            return new class94();
        } else if (arg0 == 27) {
            return new class628();
        } else if (arg0 == 28) {
            return new class196();
        } else if (arg0 == 29) {
            return new class380();
        } else if (arg0 == 30) {
            return new class673();
        } else if (arg0 == 31) {
            return new class671();
        } else if (arg0 == 32) {
            return new class122();
        } else if (arg0 == 33) {
            return new class612();
        } else if (arg0 == 34) {
            return new class203();
        } else if (arg0 == 35) {
            return new class502();
        } else if (arg0 == 36) {
            return new class422();
        } else if (arg0 == 37) {
            return new class222();
        } else if (arg0 == 38) {
            return new class256();
        } else if (arg0 == 39) {
            return new class3();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Liaa;IIIIIIIIII)Z")
    public static final boolean method3595(class455 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field9159++;
        int var11 = arg5;
        if (arg10 != -21812) {
            method3595(null, -61, 6, -18, -121, 45, -45, -112, -15, 93, -8);
        }
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class134.field1900[var13][var14] = 99;
        int var16 = arg9 - var14;
        class247.field3509[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class450.field6289[var17] = arg5;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class29.field360[var10001] = arg9;
        int[][] var19 = arg0.field6346;
        while (var26 != var18) {
            var12 = class29.field360[var18];
            var11 = class450.field6289[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - arg0.field6355;
            int var21 = var12 - arg0.field6344;
            int var22 = var12 - var16;
            int var23 = var11 - var15;
            if (arg7 == -4) {
                if (arg6 == var11 && arg1 == var12) {
                    class63.field838 = var12;
                    class588.field8206 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class460.method2652(arg4, arg3, arg1, 1, 1, var11, arg6, arg10 ^ 0xFFFFAAB0, var12)) {
                    class588.field8206 = var11;
                    class63.field838 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg0.method2613(var11, arg4, arg6, 1, 8, var12, arg3, 1, arg8, arg1)) {
                    class588.field8206 = var11;
                    class63.field838 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg0.method2611(arg3, var12, arg4, arg8, arg1, (byte) 80, var11, arg6, 1)) {
                    class588.field8206 = var11;
                    class63.field838 = var12;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg0.method2615(arg10 - 4913, arg2, arg7, var12, var11, arg1, 1, arg6)) {
                    class588.field8206 = var11;
                    class63.field838 = var12;
                    return true;
                }
            } else if (arg0.method2625(arg6, arg7, var12, 1, 103, arg1, var11, arg2)) {
                class588.field8206 = var11;
                class63.field838 = var12;
                return true;
            }
            int var25 = class247.field3509[var23][var22] + 1;
            if (var23 > 0 && class134.field1900[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class450.field6289[var26] = var11 - 1;
                class29.field360[var26] = var12;
                class134.field1900[var23 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class247.field3509[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class134.field1900[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class450.field6289[var26] = var11 + 1;
                class29.field360[var26] = var12;
                class134.field1900[var23 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class247.field3509[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class134.field1900[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class450.field6289[var26] = var11;
                class29.field360[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class134.field1900[var23][var22 - 1] = 1;
                class247.field3509[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class134.field1900[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class450.field6289[var26] = var11;
                class29.field360[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class134.field1900[var23][var22 + 1] = 4;
                class247.field3509[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class134.field1900[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class450.field6289[var26] = var11 - 1;
                class29.field360[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class134.field1900[var23 - 1][var22 - 1] = 3;
                class247.field3509[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class134.field1900[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class450.field6289[var26] = var11 + 1;
                class29.field360[var26] = var12 - 1;
                class134.field1900[var23 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class247.field3509[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class134.field1900[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class450.field6289[var26] = var11 - 1;
                class29.field360[var26] = var12 + 1;
                class134.field1900[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class247.field3509[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class134.field1900[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class450.field6289[var26] = var11 + 1;
                class29.field360[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class134.field1900[var23 + 1][var22 + 1] = 12;
                class247.field3509[var23 + 1][var22 + 1] = var25;
            }
        }
        class588.field8206 = var11;
        class63.field838 = var12;
        return false;
    }
}
