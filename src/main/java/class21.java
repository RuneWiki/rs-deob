import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    private int field440 = 100;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    private int field441 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field443 = 500;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
    private int[] field433 = new int[5];

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
    private int[] field434 = new int[5];

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
    private int[] field442 = new int[5];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field432 = 0;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
    private static int[] field447 = new int[32768];

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
    private static int[] field445;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    private static int[] field437;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
    private static int[] field450;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "[I")
    private static int[] field453;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
    private static int[] field454;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "[I")
    private static int[] field449;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "[I")
    private static int[] field452;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lgb;")
    private class45 field430;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lgb;")
    private class45 field431;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lgb;")
    private class45 field435;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lgb;")
    private class45 field436;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lgb;")
    private class45 field438;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lgb;")
    private class45 field439;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lgb;")
    private class45 field444;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lgb;")
    private class45 field446;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lgb;")
    private class45 field451;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lle;")
    private class81 field448;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public static void method132() {
        field437 = null;
        field447 = null;
        field445 = null;
        field453 = null;
        field452 = null;
        field450 = null;
        field454 = null;
        field449 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
    private final int method133(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field445[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field447[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[I")
    public final int[] method134(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field437[var3] = 0;
        }
        if (arg1 < 10) {
            return field437;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field446.method326();
        this.field451.method326();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field431 != null) {
            this.field431.method326();
            this.field439.method326();
            var6 = (int) ((double) (this.field431.field985 - this.field431.field988) * 32.768D / var4);
            var7 = (int) ((double) this.field431.field988 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field444 != null) {
            this.field444.method326();
            this.field435.method326();
            var9 = (int) ((double) (this.field444.field985 - this.field444.field988) * 32.768D / var4);
            var10 = (int) ((double) this.field444.field988 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field442[var12] != 0) {
                field453[var12] = 0;
                field452[var12] = (int) ((double) this.field434[var12] * var4);
                field450[var12] = (this.field442[var12] << 14) / 100;
                field454[var12] = (int) ((double) (this.field446.field985 - this.field446.field988) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field433[var12]) / var4);
                field449[var12] = (int) ((double) this.field446.field988 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field446.method327(arg0);
            int var41 = this.field451.method327(arg0);
            if (this.field431 != null) {
                int var42 = this.field431.method327(arg0);
                int var43 = this.field439.method327(arg0);
                var40 += this.method133(var8, var43, this.field431.field986) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field444 != null) {
                int var44 = this.field444.method327(arg0);
                int var45 = this.field435.method327(arg0);
                var41 = var41 * ((this.method133(var11, var45, this.field444.field986) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field442[var46] != 0) {
                    int var47 = field452[var46] + var13;
                    if (var47 < arg0) {
                        field437[var47] += this.method133(field453[var46], field450[var46] * var41 >> 15, this.field446.field986);
                        field453[var46] += (field454[var46] * var40 >> 16) + field449[var46];
                    }
                }
            }
        }
        if (this.field436 != null) {
            this.field436.method326();
            this.field430.method326();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field436.method327(arg0);
                int var19 = this.field430.method327(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field436.field985 - this.field436.field988) * var18 >> 8) + this.field436.field988;
                } else {
                    var20 = ((this.field436.field985 - this.field436.field988) * var19 >> 8) + this.field436.field988;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field437[var17] = 0;
                }
            }
        }
        if (this.field441 > 0 && this.field440 > 0) {
            int var21 = (int) ((double) this.field441 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field437[var22] += field437[var22 - var21] * this.field440 / 100;
            }
        }
        if (this.field448.field2001[0] > 0 || this.field448.field2001[1] > 0) {
            this.field438.method326();
            int var23 = this.field438.method327(arg0 + 1);
            int var24 = this.field448.method684(0, (float) var23 / 65536.0F);
            int var25 = this.field448.method684(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field437[var24 + var26] * (long) class81.field1995 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field437[var24 + var26 - var37 - 1] * (long) class81.field1994[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field437[var26 - var38 - 1] * (long) class81.field1994[1][var38] >> 16);
                    }
                    field437[var26] = var36;
                    var23 = this.field438.method327(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field437[var24 + var26] * (long) class81.field1995 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field437[var24 + var26 - var34 - 1] * (long) class81.field1994[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field437[var26 - var35 - 1] * (long) class81.field1994[1][var35] >> 16);
                        }
                        field437[var26] = var33;
                        var23 = this.field438.method327(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field437[var24 + var26 - var30 - 1] * (long) class81.field1994[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field437[var26 - var31 - 1] * (long) class81.field1994[1][var31] >> 16);
                            }
                            field437[var26] = var29;
                            this.field438.method327(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field448.method684(0, (float) var23 / 65536.0F);
                    var25 = this.field448.method684(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field437[var39] < -32768) {
                field437[var39] = -32768;
            }
            if (field437[var39] > 32767) {
                field437[var39] = 32767;
            }
        }
        return field437;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhb;)V")
    public final void method135(class51 arg0) {
        this.field446 = new class45();
        this.field446.method328(arg0);
        this.field451 = new class45();
        this.field451.method328(arg0);
        int var2 = arg0.method373(25094);
        if (var2 != 0) {
            arg0.field1128--;
            this.field431 = new class45();
            this.field431.method328(arg0);
            this.field439 = new class45();
            this.field439.method328(arg0);
        }
        int var3 = arg0.method373(25094);
        if (var3 != 0) {
            arg0.field1128--;
            this.field444 = new class45();
            this.field444.method328(arg0);
            this.field435 = new class45();
            this.field435.method328(arg0);
        }
        int var4 = arg0.method373(25094);
        if (var4 != 0) {
            arg0.field1128--;
            this.field436 = new class45();
            this.field436.method328(arg0);
            this.field430 = new class45();
            this.field430.method328(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method382(255);
            if (var6 == 0) {
                break;
            }
            this.field442[var5] = var6;
            this.field433[var5] = arg0.method410(-30497);
            this.field434[var5] = arg0.method382(255);
        }
        this.field441 = arg0.method382(255);
        this.field440 = arg0.method382(255);
        this.field443 = arg0.method383(-2056200760);
        this.field432 = arg0.method383(-2056200760);
        this.field448 = new class81();
        this.field438 = new class45();
        this.field448.method686(arg0, this.field438);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field447[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field445 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field445[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field437 = new int[220500];
        field450 = new int[5];
        field453 = new int[5];
        field454 = new int[5];
        field449 = new int[5];
        field452 = new int[5];
    }
}
