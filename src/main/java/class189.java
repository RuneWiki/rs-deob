import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class189 extends class34 {

    @OriginalMember(owner = "client!td", name = "G", descriptor = "[I")
    public static int[] field3470 = new int[500];

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Lke;")
    public static class256 field3483 = class316.method2202("Abbrechen", 27626);

    @OriginalMember(owner = "client!td", name = "P", descriptor = "F")
    public static float field3479;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Lke;")
    public class256 field3472;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "[I")
    public int[] field3476;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[I")
    public int[] field3481;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[I")
    public int[] field3484;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "[I")
    public static int[] field3485;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "[I")
    public int[] field3490;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "[[[B")
    public static byte[][][] field3488;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lra;BI)V", line = 5)
    private final void method1371(class41 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3472 = arg0.method313((byte) 54);
        } else if (arg2 == 2) {
            int var7 = arg0.method357(false);
            this.field3481 = new int[var7];
            this.field3476 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3481[var8] = arg0.method346(-16);
                int var9 = arg0.method357(false);
                if (var9 == 0) {
                    this.field3476[var8] = -1;
                } else {
                    this.field3476[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method357(false);
            this.field3490 = new int[var4];
            this.field3484 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3484[var5] = arg0.method346(-16);
                int var6 = arg0.method357(false);
                if (var6 == 0) {
                    this.field3490[var5] = -1;
                } else {
                    this.field3490[var5] = var6;
                }
            }
        } else if (arg2 != 4) {
        }
        if (arg1 != -75) {
            field3470 = (int[]) null;
        }
        field3487++;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Lra;B)V", line = 76)
    public final void method1372(class41 arg0, byte arg1) {
        if (arg1 != -124) {
            this.method1371((class41) null, (byte) -40, 4);
        }
        while (true) {
            int var3 = arg0.method357(false);
            if (var3 == 0) {
                field3477++;
                return;
            }
            this.method1371(arg0, (byte) -75, var3);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLng;)V", line = 117)
    public static final void method1373(byte arg0, class138 arg1) {
        field3480++;
        class32.field516 = arg1;
        class277.field4753 = class32.field516.method991(4, -1);
        int var2 = -98 % ((arg0 + 41) / 50);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lng;ILng;II)Lvf;", line = 129)
    public static final class61 method1374(class138 arg0, int arg1, class138 arg2, int arg3, int arg4) {
        field3474++;
        if (class83.method611(arg1, 93, arg2, arg4)) {
            if (arg3 < 101) {
                field3488 = (byte[][][]) ((byte[][][]) null);
            }
            return class65.method504(arg0.method1016(arg4, 100, arg1), -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIB)I", line = 144)
    public static final int method1375(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 53) {
            return -49;
        }
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        field3473++;
        return (arg2 >> 2 << 10) - (-(arg0 >> 5 << 7) - (arg1 >> 1));
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I", line = 183)
    public final int method1376(int arg0, int arg1) {
        field3478++;
        if (this.field3484 == null) {
            return -1;
        } else if (arg0 == 29696) {
            for (int var3 = 0; var3 < this.field3484.length; var3++) {
                if (this.field3490[var3] == arg1) {
                    return this.field3484[var3];
                }
            }
            return -1;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V", line = 207)
    public static void method1377(int arg0) {
        field3483 = null;
        field3488 = (byte[][][]) null;
        field3470 = null;
        field3485 = null;
        if (arg0 != 6791) {
            method1380(true, (class138) null);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)I", line = 228)
    public final int method1378(byte arg0, int arg1) {
        int var3 = 67 / ((arg0 + 28) / 35);
        field3489++;
        if (this.field3481 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field3481.length; var4++) {
            if (this.field3476[var4] == arg1) {
                return this.field3481[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)Z", line = 249)
    public static final boolean method1379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class305.field5275[arg0][var8][var9] == -class121.field2131) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class118.field2090[arg0][arg1][arg3] + arg5;
            if (!class101.method732(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class101.method732(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class101.method732(var10, var12, var14)) {
                return false;
            } else if (class101.method732(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class233.method1582(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class101.method732(var6 + 1, class118.field2090[arg0][arg1][arg3] + arg5, var7 + 1) && class101.method732(var6 + 128 - 1, class118.field2090[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class101.method732(var6 + 128 - 1, class118.field2090[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class101.method732(var6 + 1, class118.field2090[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLng;)V", line = 309)
    public static final void method1380(boolean arg0, class138 arg1) {
        class148.field2603 = arg1;
        if (!arg0) {
            field3479 = -0.5153088F;
        }
        field3471++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lke;I)I", line = 320)
    public static final int method1381(class256 arg0, int arg1) {
        field3475++;
        if (class301.field5189 == null || arg0.method1799(arg1 ^ 0x7D) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class301.field5189.field4113; var2++) {
            if (class301.field5189.field4124[var2].method1782((byte) -25, class86.field1556, class238.field4058).method1806(false, arg0)) {
                return var2;
            }
        }
        if (arg1 != 2) {
            method1375(37, 108, -36, (byte) -71);
        }
        return -1;
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V", line = 350)
    public static final void method1382(int arg0) {
        if (arg0 == 1) {
            field3486++;
            class171.field3045.method2084(122);
        }
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V", line = 361)
    public final void method1383(int arg0) {
        if (arg0 != 24991) {
            return;
        }
        field3482++;
        if (this.field3484 != null) {
            for (int var2 = 0; var2 < this.field3484.length; var2++) {
                this.field3484[var2] = class100.method721(this.field3484[var2], 32768);
            }
        }
        if (this.field3481 != null) {
            for (int var3 = 0; var3 < this.field3481.length; var3++) {
                this.field3481[var3] = class100.method721(this.field3481[var3], 32768);
            }
        }
    }
}
