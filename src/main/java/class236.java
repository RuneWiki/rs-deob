import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class236 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lpa;")
    private class204 field4075 = new class204(256);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lpa;")
    private class204 field4086 = new class204(256);

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lge;")
    private class68 field4082;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lge;")
    private class68 field4083;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4077 = -1;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4079 = 0;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Z")
    public static boolean field4084 = true;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[Lc;")
    public static class103[] field4074;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[[I)V")
    public static final void method1573(int arg0, int[][] arg1) {
        class146.field2488 = arg1;
        field4088++;
        if (arg0 > -89) {
            field4079 = -8;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[I)Llb;")
    private final class126 method1574(int arg0, int arg1, int arg2, int[] arg3) {
        field4078++;
        int var5 = (arg1 << 4 & 0xFFF5 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        if (arg0 != -19397) {
            return null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class126 var9 = (class126) this.field4086.method1398(1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class53 var10 = (class53) this.field4075.method1398(arg0 + 19398, var7);
            if (var10 == null) {
                var10 = class53.method351(this.field4082, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4075.method1393(var10, var7, 817);
            }
            class126 var11 = var10.method353(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1753(137);
                this.field4086.method1393(var11, var7, 817);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1575(int arg0) {
        if (arg0 <= 59) {
            field4079 = 86;
        }
        field4074 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI[II)Llb;")
    private final class126 method1576(byte arg0, int arg1, int[] arg2, int arg3) {
        field4076++;
        int var5 = arg1 ^ ((arg3 & 0x60000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class126 var9 = (class126) this.field4086.method1398(1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 != null && arg2[0] <= 0) {
            return null;
        } else if (arg0 < 46) {
            return null;
        } else {
            class89 var10 = class89.method660(this.field4083, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class126 var11 = var10.method657();
            this.field4086.method1393(var11, var7, 817);
            if (arg2 != null) {
                arg2[0] -= var11.field2211.length;
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)I")
    public static final int method1577(int arg0, int arg1, byte arg2) {
        if (arg2 <= 60) {
            method1581(-66, -14, 12);
        }
        field4080++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI[I)Llb;")
    public final class126 method1578(byte arg0, int arg1, int[] arg2) {
        field4085++;
        if (this.field4082.method478(true) == 1) {
            return this.method1574(-19397, 0, arg1, arg2);
        } else if (this.field4082.method456(arg1, -95) == 1) {
            return this.method1574(-19397, arg1, 0, arg2);
        } else {
            if (arg0 != -111) {
                method1581(-39, -92, -94);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[I)Llb;")
    public final class126 method1579(int arg0, int arg1, int[] arg2) {
        field4087++;
        if (this.field4083.method478(true) == 1) {
            return this.method1576((byte) 50, arg1, arg2, 0);
        } else if (this.field4083.method456(arg1, arg0 + 22671) == 1) {
            return this.method1576((byte) 68, 0, arg2, arg1);
        } else if (arg0 == -22763) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1580(int arg0, int arg1) {
        class208 var2 = class99.field1780[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class208 var4 = class99.field1780[var3][arg0][arg1] = class99.field1780[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3647--;
                for (int var5 = 0; var5 < var4.field3646; var5++) {
                    class213 var6 = var4.field3650[var5];
                    if ((var6.field3728 >> 29 & 0x3L) == 2L && var6.field3731 == arg0 && var6.field3729 == arg1) {
                        var6.field3727--;
                    }
                }
            }
        }
        if (class99.field1780[0][arg0][arg1] == null) {
            class99.field1780[0][arg0][arg1] = new class208(0, arg0, arg1);
        }
        class99.field1780[0][arg0][arg1].field3651 = var2;
        class99.field1780[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lge;Lge;)V")
    public class236(class68 arg0, class68 arg1) {
        this.field4082 = arg1;
        this.field4083 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public static final void method1581(int arg0, int arg1, int arg2) {
        if (arg0 != 10007) {
            method1573(80, (int[][]) null);
        }
        field4081++;
        if (class228.field3951 > 0) {
            class199.method1370(-871, class228.field3951);
            class228.field3951 = 0;
        }
        short var3 = 256;
        int var4 = 0;
        int var5 = class179.field3066 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class271.field4803[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class187.field3222[var6++];
                int var12 = class179.field3068[arg1 + (var5++)];
                if (var11 == 0) {
                    class23.field335.field4745[var4++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 238 - var11;
                    int var15 = class93.field1702[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class23.field335.field4745[var4++] = class135.method899(-16711936, var13 * class135.method899(16711935, var15) + (class135.method899(16711935, var12) * var14)) + class135.method899(16711680, class135.method899(65280, var15) * var13 + (var14 * class135.method899(var12, 65280))) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class23.field335.field4745[var4++] = class179.field3068[arg1 + var5++];
            }
            var5 += class179.field3066 - 128;
        }
        class23.field335.method50(arg1, arg2);
    }
}
