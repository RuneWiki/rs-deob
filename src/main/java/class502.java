import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class502 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public int field6940 = 2;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field6951 = -1;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field6948 = 5;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public int field6950 = -1;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public int field6960 = -1;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
    public boolean field6954 = false;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
    public boolean field6943 = false;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public int field6966 = -1;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field6957 = 0;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public int field6965 = 99;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public int field6962 = -1;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Z")
    public boolean field6967 = false;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Lcea;")
    public static class180 field6961 = new class180("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public int field6963;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Ljh;")
    public class138 field6953;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
    public int[] field6944;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[I")
    public int[] field6952;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[I")
    private int[] field6964;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[Z")
    public boolean[] field6958;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[[I")
    public int[][] field6955;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZLos;)V", line = 3)
    private final void method2894(int arg0, boolean arg1, class374 arg2) {
        if (arg0 == 1) {
            int var13 = arg2.method2136(false);
            this.field6952 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field6952[var14] = arg2.method2136(false);
            }
            this.field6944 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field6944[var15] = arg2.method2136(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field6944[var16] = (arg2.method2136(false) << 16) + this.field6944[var16];
            }
        } else if (arg0 == 2) {
            this.field6966 = arg2.method2136(false);
        } else if (arg0 == 3) {
            this.field6958 = new boolean[256];
            int var11 = arg2.method2129(-123);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field6958[arg2.method2129(-91)] = true;
            }
        } else if (arg0 == 5) {
            this.field6948 = arg2.method2129(-99);
        } else if (arg0 == 6) {
            this.field6950 = arg2.method2136(arg1);
        } else if (arg0 == 7) {
            this.field6960 = arg2.method2136(false);
        } else if (arg0 == 8) {
            this.field6965 = arg2.method2129(-62);
        } else if (arg0 == 9) {
            this.field6951 = arg2.method2129(-75);
        } else if (arg0 == 10) {
            this.field6962 = arg2.method2129(-125);
        } else if (arg0 == 11) {
            this.field6940 = arg2.method2129(-66);
        } else if (arg0 == 12) {
            int var4 = arg2.method2129(-90);
            this.field6964 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6964[var5] = arg2.method2136(arg1);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field6964[var6] = (arg2.method2136(false) << 16) + this.field6964[var6];
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method2136(arg1);
            this.field6955 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method2129(-67);
                if (var9 > 0) {
                    this.field6955[var8] = new int[var9];
                    this.field6955[var8][0] = arg2.method2128(true);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field6955[var8][var10] = arg2.method2136(false);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field6943 = true;
        } else if (arg0 == 15) {
            this.field6954 = true;
        } else if (arg0 == 16) {
            this.field6967 = true;
        } else if (arg0 == 17) {
            this.field6957 = arg2.method2129(-73);
        }
        field6959++;
        if (arg1) {
            this.method2898(89, -76, null, 124, -97, 75);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 162)
    public final void method2895(int arg0) {
        if (arg0 != -8453) {
            return;
        }
        field6956++;
        if (this.field6951 == -1) {
            if (this.field6958 == null) {
                this.field6951 = 0;
            } else {
                this.field6951 = 2;
            }
        }
        if (this.field6962 != -1) {
            return;
        }
        if (this.field6958 == null) {
            this.field6962 = 0;
        } else {
            this.field6962 = 2;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZBII)I", line = 192)
    public final int method2896(boolean arg0, byte arg1, int arg2, int arg3) {
        field6945++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6944[arg3];
        class183 var8 = null;
        class183 var9 = this.field6953.method766(var7 >> 16, 100);
        if (arg1 != 8) {
            return -100;
        }
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6954 || class166.field2034) && arg2 != -1 && arg2 < this.field6944.length) {
            int var11 = this.field6944[arg2];
            var8 = this.field6953.method766(var11 >> 16, 100);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6943) {
            var5 |= 0x200;
        }
        if (var9.method1004((byte) -6, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1006(134217727, var10)) {
            var5 |= 0x100;
        }
        if (var9.method1002(var10, 3)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1004((byte) -6, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1006(arg1 ^ 0x7FFFFF7, var6)) {
                var5 |= 0x100;
            }
            if (var8.method1002(var6, 3)) {
                var5 |= 0x400;
            }
        }
        if (this.field6964 != null && arg0) {
            if (this.field6964.length > arg3) {
                int var12 = this.field6964[arg3];
                if (var12 != 65535) {
                    class183 var13 = this.field6953.method766(var12 >> 16, 100);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1004((byte) -6, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1006(134217727, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1002(var14, 3)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6954 || class166.field2034) && arg2 != -1 && arg2 < this.field6964.length) {
                int var15 = this.field6964[arg2];
                if (var15 != 65535) {
                    class183 var16 = this.field6953.method766(var15 >> 16, 100);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1004((byte) -6, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1006(134217727, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1002(var17, 3)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILgn;I)Lpv;", line = 324)
    public static final class61 method2897(int arg0, class598 arg1, int arg2) {
        field6947++;
        int var3 = 105 % ((11 - arg2) / 32);
        class61 var4;
        if (class538.field7881 == null) {
            var4 = new class61();
        } else {
            var4 = class538.field7881;
            class538.field7881 = class538.field7881.field595;
            class485.field6791--;
            var4.field595 = null;
        }
        var4.field591 = arg0;
        var4.field589 = arg1;
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILr;III)Lr;", line = 350)
    public final class157 method2898(int arg0, int arg1, class157 arg2, int arg3, int arg4, int arg5) {
        field6941++;
        int var7 = this.field6952[arg5];
        int var8 = this.field6944[arg5];
        class183 var9 = this.field6953.method766(var8 >> 16, 100);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method64((byte) 1, arg3, true);
        }
        class183 var11 = null;
        if ((this.field6954 || class166.field2034) && arg1 != -1 && this.field6944.length > arg1) {
            int var12 = this.field6944[arg1];
            var11 = this.field6953.method766(var12 >> 16, 100);
            arg1 = var12 & 0xFFFF;
        }
        class183 var13 = null;
        class183 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6964 != null) {
            if (arg5 < this.field6964.length) {
                var15 = this.field6964[arg5];
                if (var15 != 65535) {
                    var13 = this.field6953.method766(var15 >> 16, 100);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6954 || class166.field2034) && arg1 != -1 && arg1 < this.field6964.length) {
                var16 = this.field6964[arg1];
                if (var16 != 65535) {
                    var14 = this.field6953.method766(var16 >> 16, 100);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6943) {
            arg3 |= 0x200;
        }
        if (var9.method1004((byte) -6, var10)) {
            arg3 |= 0x80;
        }
        if (var9.method1006(134217727, var10)) {
            arg3 |= 0x100;
        }
        if (var9.method1002(var10, 3)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1004((byte) -6, var15)) {
                arg3 |= 0x80;
            }
            if (var13.method1006(134217727, var15)) {
                arg3 |= 0x100;
            }
            if (var13.method1002(var15, 3)) {
                arg3 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1004((byte) -6, arg1)) {
                arg3 |= 0x80;
            }
            if (var11.method1006(134217727, arg1)) {
                arg3 |= 0x100;
            }
            if (var11.method1002(arg1, 3)) {
                arg3 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1004((byte) -6, var16)) {
                arg3 |= 0x80;
            }
            if (var14.method1006(134217727, var16)) {
                arg3 |= 0x100;
            }
            if (var14.method1002(var16, 3)) {
                arg3 |= 0x400;
            }
        }
        int var17 = arg3 | 0x20;
        if (arg0 <= 1) {
            this.field6965 = -3;
        }
        class157 var18 = arg2.method64((byte) 1, var17, true);
        var18.method863(var11, 0, var10, 0, this.field6943, arg1, var9, arg4 - 1, var7);
        if (var13 != null) {
            var18.method863(var14, 0, var15, 0, this.field6943, var16, var13, arg4 - 1, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lmh;IBIII)Lwo;", line = 485)
    public static final class632 method2899(class537 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field6949++;
        if (arg2 != -93) {
            field6961 = null;
        }
        if (!arg0.field7777 && (!class415.method2366(-127, arg5) || !class415.method2366(-125, arg1))) {
            return arg0.field7795 ? new class632(arg0, 34037, arg3, arg4, arg5, arg1, true) : new class632(arg0, arg3, arg4, arg5, arg1, class129.method731(arg5, -27265), class129.method731(arg1, -27265), true);
        } else {
            return new class632(arg0, 3553, arg3, arg4, arg5, arg1, true);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIILr;IIIB)Lr;", line = 513)
    public final class157 method2900(byte arg0, int arg1, int arg2, class157 arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6946++;
        int var9 = this.field6952[arg5];
        int var10 = this.field6944[arg5];
        class183 var11 = this.field6953.method766(var10 >> 16, 100);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg3.method64(arg0, arg2, true);
        }
        class183 var13 = null;
        if ((this.field6954 || class166.field2034) && arg1 != -1 && this.field6944.length > arg1) {
            int var14 = this.field6944[arg1];
            var13 = this.field6953.method766(var14 >> 16, 100);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field6943) {
            arg2 |= 0x200;
        }
        int var15 = 35 / ((-arg7 - 9) / 33);
        if (var11.method1004((byte) -6, var12)) {
            arg2 |= 0x80;
        }
        if (var11.method1006(134217727, var12)) {
            arg2 |= 0x100;
        }
        if (var11.method1002(var12, 3)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1004((byte) -6, arg1)) {
                arg2 |= 0x80;
            }
            if (var13.method1006(134217727, arg1)) {
                arg2 |= 0x100;
            }
            if (var13.method1002(arg1, 3)) {
                arg2 |= 0x400;
            }
        }
        int var16 = arg2 | 0x20;
        class157 var17 = arg3.method64(arg0, var16, true);
        var17.method863(var13, 0, var12, arg4, this.field6943, arg1, var11, arg6 - 1, var9);
        return var17;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 585)
    public static void method2901(boolean arg0) {
        if (arg0) {
            method2897(-90, null, 78);
        }
        field6961 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Los;B)V", line = 597)
    public final void method2902(class374 arg0, byte arg1) {
        if (arg1 <= 85) {
            return;
        }
        field6942++;
        while (true) {
            int var3 = arg0.method2129(-83);
            if (var3 == 0) {
                return;
            }
            this.method2894(var3, false, arg0);
        }
    }
}
