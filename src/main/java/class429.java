import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class429 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    private int field6348 = -1;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    private boolean field6359 = true;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field6354;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    private int field6360;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "[Lrc;")
    private class540[] field6355;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    private int field6356;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    private int field6358;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Lrc;")
    private class540[] field6346;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Lrc;")
    private class540 field6361;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    private int field6352;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    private int field6357;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lpga;")
    private class536 field6349;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILha;IIIII)V", line = 4)
    public final void method2669(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg6 + arg9 & 0x3FFF;
        field6362++;
        if (this.field6360 == -1 || this.field6357 == 0) {
            arg4.method516(arg5, arg1, arg3, arg7, arg2, 0);
        } else {
            class293 var12 = class728.field10181.method1124((byte) 101, this.field6360);
            if (this.field6349 == null && class728.field10181.method1121(-30695, this.field6360)) {
                int[] var13 = var12.field4192 == 2 ? class728.field10181.method1126(false, this.field6360, (byte) 94, 0.7F, this.field6357, this.field6357) : class728.field10181.method1123((byte) 119, 0.7F, false, this.field6360, this.field6357, this.field6357);
                this.field6349 = arg4.method531(this.field6357, this.field6357, var13, this.field6357, 0, (byte) -101);
            }
            if (var12.field4192 == 2) {
                arg4.method516(arg5, arg1, arg3, arg7, arg2, 0);
            }
            if (this.field6349 != null) {
                int var14 = var12.field4192 == 2 ? 1 : 0;
                int var15 = arg0 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg3 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg3; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field6349.method3144(var17 + arg5, arg1 + var18, arg7, arg7, 1, 0, var14);
                    }
                }
            }
        }
        if (arg8 == 1) {
            for (int var19 = this.field6352 - 1; var19 >= 0; var19--) {
                this.field6346[var19].method3166(arg4, arg5, arg1, arg3, arg7, arg0, var11);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)Z", line = 81)
    public static final boolean method2670(int arg0, byte arg1, int arg2) {
        field6350++;
        int var3 = 17 / ((arg1 + 29) / 51);
        return class514.method3037(-66, arg0, arg2) | (arg2 & 0x70000) != 0 || class238.method1578(5121, arg0, arg2);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JJ)J", line = 91)
    public static long method2671(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 98)
    public final void method2672(byte arg0) {
        if (this.field6355 != null) {
            for (int var2 = 0; var2 < this.field6355.length; var2++) {
                this.field6355[var2].method3171();
            }
        }
        field6347++;
        if (arg0 <= 97) {
            this.field6358 = -49;
        }
        this.field6349 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lha;II)Z", line = 127)
    public final boolean method2673(class60 arg0, int arg1, int arg2) {
        field6353++;
        int var4 = 9 % ((8 - arg1) / 53);
        if (this.field6348 != arg2) {
            this.field6348 = arg2;
            int var5 = class505.method2996(arg2, -120);
            if (var5 > 512) {
                var5 = 512;
            }
            if (var5 <= 0) {
                var5 = 1;
            }
            if (this.field6357 != var5) {
                this.field6357 = var5;
                this.field6349 = null;
            }
            if (this.field6355 != null) {
                this.field6352 = 0;
                int[] var6 = new int[this.field6355.length];
                for (int var7 = 0; var7 < this.field6355.length; var7++) {
                    class540 var8 = this.field6355[var7];
                    if (var8.method3163(this.field6354, this.field6358, this.field6356, this.field6348)) {
                        var6[this.field6352] = var8.field7713;
                        this.field6346[this.field6352++] = var8;
                    }
                }
                class467.method2832(0, (byte) 117, this.field6352 - 1, this.field6346, var6);
            }
            this.field6359 = true;
        }
        boolean var9 = false;
        if (this.field6359) {
            this.field6359 = false;
            for (int var10 = this.field6352 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field6346[var10].method3169(arg0, this.field6361);
                var9 |= var11;
                this.field6359 |= !var11;
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I[Lrc;IIII)V", line = 259)
    public class429(int arg0, class540[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6354 = arg3;
        this.field6360 = arg0;
        this.field6355 = arg1;
        this.field6356 = arg5;
        this.field6358 = arg4;
        if (arg1 == null) {
            this.field6346 = null;
            this.field6361 = null;
        } else {
            this.field6346 = new class540[arg1.length];
            this.field6361 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)Z", line = 221)
    public static final boolean method2674(boolean arg0, int arg1) {
        field6351++;
        if (arg1 != -23542) {
            method2674(true, 82);
        }
        boolean var2 = class736.field10316.method441();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class736.field10316.method427();
        } else if (!class736.field10316.method478()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class63.field916.method4111(109, arg0 ? 1 : 0, class63.field916.field10201);
            class585.method3384(arg1 + 23414);
            return true;
        }
    }
}
