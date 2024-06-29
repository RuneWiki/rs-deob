import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class233 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    private int field3377 = -1;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Z")
    private boolean field3392 = true;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    private int field3387;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    private int field3380;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    private int field3395;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "[Lah;")
    private class260[] field3393;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[Lah;")
    private class260[] field3386;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lah;")
    private class260 field3390;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private int field3379;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    private int field3383;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Luk;")
    public static class170 field3389;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Lf;")
    private class528 field3381;

    static {
        new class180("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwm;BIII)V", line = 5)
    public static final void method1511(class394 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3384++;
        if (arg1 != -115) {
            return;
        }
        long var5 = (long) (arg4 | arg3 << 28 | arg2 << 14);
        class63 var7 = (class63) class73.field1218.method2485(arg1 + 124, var5);
        if (var7 == null) {
            class63 var8 = new class63();
            class73.field1218.method2486(arg1 + 239, var8, var5);
            var8.field1120.method2270(0, arg0);
            return;
        }
        class172 var9 = class8.field111.method3077(arg1 + 225, arg0.field5819);
        int var10 = var9.field2555;
        if (var9.field2566 == 1) {
            var10 = (arg0.field5818 + 1) * var10;
        }
        for (class394 var11 = (class394) var7.field1120.method2257((byte) 114); var11 != null; var11 = (class394) var7.field1120.method2256(-50)) {
            class172 var12 = class8.field111.method3077(25, var11.field5819);
            int var13 = var12.field2555;
            if (var12.field2566 == 1) {
                var13 = (var11.field5818 + 1) * var13;
            }
            if (var10 > var13) {
                class359.method2315((byte) -67, arg0, var11);
                return;
            }
        }
        var7.field1120.method2270(0, arg0);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 60)
    public static void method1512(int arg0) {
        field3389 = null;
        if (arg0 != 3499) {
            field3389 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 73)
    public final void method1513(int arg0) {
        if (this.field3393 != null) {
            for (int var2 = 0; var2 < this.field3393.length; var2++) {
                this.field3393[var2].method1648();
            }
        }
        field3382++;
        if (arg0 < -19) {
            this.field3381 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLqa;I)Z", line = 99)
    public final boolean method1514(byte arg0, class162 arg1, int arg2) {
        if (this.field3377 != arg2) {
            this.field3377 = arg2;
            int var4 = class159.method1146(false, arg2);
            if (arg2 < var4) {
                var4 = class466.method2780(44, arg2);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field3383 != var4) {
                this.field3383 = var4;
                this.field3381 = null;
            }
            if (this.field3393 != null) {
                this.field3379 = 0;
                int[] var5 = new int[this.field3393.length];
                for (int var6 = 0; var6 < this.field3393.length; var6++) {
                    class260 var7 = this.field3393[var6];
                    if (var7.method1653(this.field3387, this.field3391, this.field3395, this.field3377)) {
                        var5[this.field3379] = var7.field3759;
                        this.field3386[this.field3379++] = var7;
                    }
                }
                class108.method804(this.field3379 - 1, var5, this.field3386, 0, -28);
            }
            this.field3392 = true;
        }
        field3394++;
        if (arg0 < 63) {
            return false;
        }
        boolean var8 = false;
        if (this.field3392) {
            this.field3392 = false;
            for (int var9 = this.field3379 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field3386[var9].method1649(arg1, this.field3390);
                this.field3392 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lss;", line = 182)
    public static final class295 method1515(int arg0, int arg1) {
        field3385++;
        class295 var2 = (class295) class373.field5580.method797(50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class334.field5125.method683(arg0, arg1, 5);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class295 var4 = class466.method2777(var3, -22);
            class373.field5580.method793((byte) -91, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILqa;IIIBIII)V", line = 211)
    public final void method1516(int arg0, int arg1, class162 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg4 & 0x3FFF;
        field3388++;
        if (this.field3380 == -1) {
            arg2.method471(arg5, arg7, arg1, arg8, arg9, 0);
        } else {
            class216 var12 = class207.field2985.method935(this.field3380, -8037);
            if (this.field3381 == null && class207.field2985.method937((byte) 43, this.field3380)) {
                int[] var13 = var12.field3095 ? class207.field2985.method938(this.field3380, false, 0.7F, (byte) -78, this.field3383, this.field3383) : class207.field2985.method936((byte) 97, false, this.field3380, this.field3383, this.field3383, 0.7F);
                this.field3381 = arg2.method527(var13, 0, this.field3383, this.field3383, this.field3383);
            }
            if (!var12.field3095) {
                arg2.method471(arg5, arg7, arg1, arg8, arg9, 0);
            }
            if (this.field3381 != null) {
                int var14 = var12.field3095 ? 0 : 1;
                int var15 = arg3 * arg8 / -4096;
                int var16;
                for (var16 = arg8 * var11 / 4096 + (arg1 - arg8) / 2; var16 > arg8; var16 -= arg8) {
                }
                while (var15 > arg8) {
                    var15 -= arg8;
                }
                while (var16 < 0) {
                    var16 += arg8;
                }
                while (var15 < 0) {
                    var15 += arg8;
                }
                for (int var17 = var16 - arg8; var17 < arg1; var17 += arg8) {
                    for (int var18 = var15 - arg8; var18 < arg8; var18 += arg8) {
                        this.field3381.method136(arg5 + var17, arg7 + var18, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        if (arg6 >= 28) {
            for (int var19 = this.field3379 - 1; var19 >= 0; var19--) {
                this.field3386[var19].method1650(arg2, arg5, arg7, arg1, arg8, arg3, var11);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[Lah;IIII)V", line = 297)
    public class233(int arg0, class260[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3387 = arg3;
        this.field3380 = arg0;
        this.field3395 = arg5;
        this.field3393 = arg1;
        this.field3391 = arg4;
        if (arg1 == null) {
            this.field3386 = null;
            this.field3390 = null;
        } else {
            this.field3386 = new class260[arg1.length];
            this.field3390 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
