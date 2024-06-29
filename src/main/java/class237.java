import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class237 extends class176 {

    @OriginalMember(owner = "client!um", name = "z", descriptor = "Z")
    private boolean field3946 = true;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "Llj;")
    private class5 field3953 = null;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    private int field3960 = -1;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    private int field3947 = 0;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "I")
    private int field3961 = 0;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    private int field3943 = -1;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "I")
    private int field3962 = -32768;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "I")
    private int field3967 = 0;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    private int field3963;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "Lqg;")
    private class129 field3935;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    private int field3936;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field3945 = 0;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "Ltl;")
    public static class59 field3944 = class85.method639("_labels", 9588);

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Ltl;")
    public static class59 field3939 = class85.method639("details", 9588);

    @OriginalMember(owner = "client!um", name = "r", descriptor = "Ltl;")
    private static class59 field3938 = class85.method639("Drop", 9588);

    @OriginalMember(owner = "client!um", name = "N", descriptor = "Ltl;")
    public static class59 field3958 = class85.method639(":duelstake:", 9588);

    @OriginalMember(owner = "client!um", name = "V", descriptor = "Ltl;")
    public static class59 field3965 = field3938;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lbi;")
    public static class67 field3934;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "Lclient;")
    public static client field3964;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Lfg;", line = 4)
    private final class176 method1659(byte arg0) {
        if (arg0 < 20) {
            return (class176) null;
        } else {
            field3940++;
            return this.method1662(128, false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZI)Ltl;", line = 18)
    public static final class59 method1660(int arg0, int arg1, boolean arg2, int arg3) {
        field3954++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = arg0 / arg3;
        int var5 = 1;
        while (var4 != 0) {
            var5++;
            var4 /= arg3;
        }
        int var6 = var5;
        if (arg0 < 0 || arg2) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        if (arg1 <= 109) {
            field3939 = (class59) null;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg0 % arg3;
            arg0 /= arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class59 var10 = new class59();
        var10.field863 = var6;
        var10.field889 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)V", line = 91)
    public static final void method1661(int arg0, int arg1, int arg2) {
        field3956++;
        if (arg2 > -16) {
            method1660(34, 8, false, 26);
        }
        class270.field4683++;
        class234.field3888.method1768(true, 51);
        class234.field3888.method1207(-75, arg1);
        class234.field3888.method1196((byte) 78, arg0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()I", line = 108)
    public final int method152() {
        field3950++;
        return this.field3962;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Lfg;", line = 118)
    private final class176 method1662(int arg0, boolean arg1) {
        field3957++;
        boolean var3 = class97.field1558 != class239.field3993;
        class180 var4 = class188.method1390(this.field3952, false);
        if (var4.field3005 != null) {
            var4 = var4.method1335(false);
        }
        if (var4 == null) {
            if (class55.field815 && !var3) {
                this.method1663(-2024168478);
            }
            return null;
        }
        int var5 = this.field3966 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3006;
            var7 = var4.field2976;
        } else {
            var6 = var4.field2976;
            var7 = var4.field3006;
        }
        int var8 = (var7 >> 1) + this.field3949;
        int var9 = this.field3951 + (var6 >> 1);
        int var10 = (var6 + 1 >> 1) + this.field3951;
        int var11 = (var7 + 1 >> 1) + this.field3949;
        this.method1664((byte) 45, arg0 * var9, var8 * 128);
        boolean var12 = !var3 && var4.field2953 && (this.field3943 != var4.field2981 || this.field3960 != this.field3942 && class268.field4658 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class97.field1558[this.field3963];
        int var14 = var13[var8][var9] + var13[var11][var9] + var13[var8][var10] + var13[var11][var10] >> 2;
        int var15 = (this.field3951 << 7) + (var6 << 6);
        int[][] var16 = (int[][]) null;
        if (var3) {
            var16 = class239.field3993[0];
        } else if (this.field3963 < 3) {
            var16 = class97.field1558[this.field3963 + 1];
        }
        int var17 = (this.field3949 << 7) + (var7 << 6);
        if (class55.field815 && var12) {
            class158.method1120(this.field3953, this.field3947, this.field3967, this.field3961);
        }
        boolean var18 = this.field3953 == null;
        class78 var19;
        if (this.field3935 == null) {
            var19 = var4.method1326(var16, var12, var18 ? class10.field132 : this.field3953, var15, this.field3948, false, this.field3966, var17, arg0 ^ 0xB22, var13, var14);
        } else {
            var19 = var4.method1325((byte) -11, this.field3935, this.field3942, var15, var14, var18 ? class10.field132 : this.field3953, var13, var17, this.field3948, this.field3966, var16, var12);
        }
        if (var19 == null) {
            return null;
        }
        if (class55.field815 && var12) {
            if (var18) {
                class10.field132 = var19.field1241;
            }
            int var20 = 0;
            if (this.field3963 != 0) {
                int[][] var21 = class97.field1558[0];
                var20 = var14 - (var21[var8][var9] + var21[var11][var9] + var21[var8][var10] + var21[var11][var10] >> 2);
            }
            class5 var22 = var19.field1241;
            if (this.field3946 && class158.method1126(var22, var17, var20, var15)) {
                this.field3946 = false;
            }
            if (!this.field3946) {
                class158.method1119(var22, var17, var20, var15);
                this.field3947 = var17;
                if (var18) {
                    class10.field132 = null;
                }
                this.field3953 = var22;
                this.field3961 = var15;
                this.field3967 = var20;
            }
            this.field3960 = this.field3942;
            this.field3943 = var4.field2981;
        }
        return var19.field1243;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIIIZLfg;)V", line = 439)
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class176 arg8) {
        this.field3948 = arg1;
        this.field3963 = arg3;
        this.field3949 = arg4;
        this.field3952 = arg0;
        this.field3951 = arg5;
        this.field3966 = arg2;
        if (class55.field815 && arg8 != null) {
            if ((arg8 instanceof class237)) {
                ((class237) arg8).method1663(-2024168478);
            } else {
                class180 var10 = class188.method1390(this.field3952, false);
                if (var10.field3005 != null) {
                    var10 = var10.method1335(false);
                }
                if (var10 != null) {
                    class228.method1564(this.field3966, this.field3949, var10, this.field3951, this.field3948, true, 0, 0, this.field3963);
                }
            }
        }
        if (arg6 != -1) {
            this.field3935 = class265.method1834((byte) -39, arg6);
            this.field3936 = class30.field420 - 1;
            this.field3942 = 0;
            if (this.field3935.field2140 == 0 && arg8 != null && arg8 instanceof class237) {
                class237 var11 = (class237) arg8;
                if (this.field3935 == var11.field3935) {
                    this.field3942 = var11.field3942;
                    this.field3936 = var11.field3936;
                    return;
                }
            }
            if (arg7 && this.field3935.field2114 != -1) {
                this.field3942 = (int) ((double) this.field3935.field2118.length * Math.random());
                this.field3936 -= (int) ((double) this.field3935.field2132[this.field3942] * Math.random());
            }
        }
        if (class55.field815 && arg8 != null) {
            this.method1662(128, true);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 275)
    public final void method1663(int arg0) {
        if (this.field3953 != null) {
            class158.method1120(this.field3953, this.field3947, this.field3967, this.field3961);
        }
        this.field3943 = -1;
        field3955++;
        this.field3953 = null;
        if (arg0 != -2024168478) {
            this.method152();
        }
        this.field3960 = -1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIJ)V", line = 298)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3959++;
        class176 var11 = this.method1659((byte) 97);
        if (var11 != null) {
            var11.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3962 = var11.method152();
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)V", line = 329)
    private final void method1664(byte arg0, int arg1, int arg2) {
        if (this.field3935 != null) {
            int var4 = class30.field420 - this.field3936;
            if (var4 > 100 && this.field3935.field2114 > 0) {
                int var5 = this.field3935.field2118.length - this.field3935.field2114;
                while (this.field3942 < var5 && var4 > this.field3935.field2132[this.field3942]) {
                    var4 -= this.field3935.field2132[this.field3942];
                    this.field3942++;
                }
                if (this.field3942 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3935.field2118.length; var7++) {
                        var6 += this.field3935.field2132[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (var4 <= this.field3935.field2132[this.field3942]) {
                            break label62;
                        }
                        class29.method182(arg0 ^ 0xFFFD2, false, arg2, this.field3935, this.field3942, arg1);
                        var4 -= this.field3935.field2132[this.field3942];
                        this.field3942++;
                    } while (this.field3942 < this.field3935.field2118.length);
                    this.field3942 -= this.field3935.field2114;
                } while (this.field3942 >= 0 && this.field3935.field2118.length > this.field3942);
                this.field3935 = null;
            }
            this.field3936 = class30.field420 - var4;
        }
        if (arg0 == 45) {
            field3937++;
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)V", line = 398)
    public static void method1665(byte arg0) {
        field3958 = null;
        field3938 = null;
        field3939 = null;
        field3934 = null;
        field3965 = null;
        field3964 = null;
        field3944 = null;
        if (arg0 != -18) {
            field3964 = (client) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBIII)V", line = 417)
    public final void method1311(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3941++;
        int var6 = 37 / ((42 - arg1) / 42);
        if (class55.field815) {
            this.method1662(128, true);
        } else {
            this.method1664((byte) 45, ((arg4 - arg0 >> 1) + arg0) * 128 + 64, ((-arg2 + arg3 >> 1) + arg2) * 128 - -64);
        }
    }
}
