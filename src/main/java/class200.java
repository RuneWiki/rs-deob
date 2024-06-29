import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class200 extends class177 {

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Z")
    private boolean field3429 = false;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "B")
    public byte field3447 = 0;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public int field3463 = 0;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public int field3467 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[I")
    public int[] field3435;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
    public int[] field3442;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[I")
    public int[] field3430;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
    public int[] field3437;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "[I")
    public int[] field3458;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "[I")
    public int[] field3465;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
    public int[] field3473;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "[B")
    public byte[] field3452;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "[B")
    public byte[] field3456;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "[B")
    public byte[] field3462;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "[S")
    public short[] field3461;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[S")
    public short[] field3440;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "[B")
    public byte[] field3477;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
    public int[] field3451;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[B")
    public byte[] field3433;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "[S")
    public short[] field3445;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[S")
    public short[] field3439;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "[S")
    public short[] field3455;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[S")
    public short[] field3431;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[S")
    public short[] field3449;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[S")
    public short[] field3432;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "[B")
    public byte[] field3444;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "[B")
    public byte[] field3474;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "[B")
    public byte[] field3448;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "[B")
    public byte[] field3446;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "[B")
    public byte[] field3457;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "[[I")
    public int[][] field3469;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "[[I")
    public int[][] field3454;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "[Lgi;")
    public class205[] field3475;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "[Lsm;")
    public class147[] field3472;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "[Lgi;")
    public class205[] field3443;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "S")
    public short field3434;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "S")
    public short field3450;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "[I")
    private static int[] field3453 = class283.field4870;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "[I")
    private static int[] field3464 = class283.field4877;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    private static int field3476 = 0;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    private static int[] field3441 = new int[10000];

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "[I")
    private static int[] field3459 = new int[10000];

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "S")
    private short field3436;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "S")
    private short field3438;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "S")
    private short field3460;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "S")
    private short field3466;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "S")
    private short field3468;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "S")
    private short field3470;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lrg;II)Llb;", line = 4)
    public static final class200 method1431(class88 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method636(arg1, (byte) 72, arg2);
        return var3 == null ? null : new class200(var3);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Llb;I)I", line = 14)
    private final int method1432(class200 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3435[arg1];
        int var5 = arg0.field3442[arg1];
        int var6 = arg0.field3430[arg1];
        for (int var7 = 0; var7 < this.field3463; var7++) {
            if (this.field3435[var7] == var4 && this.field3442[var7] == var5 && this.field3430[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3435[this.field3463] = var4;
            this.field3442[this.field3463] = var5;
            this.field3430[this.field3463] = var6;
            if (arg0.field3437 != null) {
                this.field3437[this.field3463] = arg0.field3437[arg1];
            }
            var3 = this.field3463++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V", line = 55)
    public final void method1433(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3463; var4++) {
            this.field3435[var4] += arg0;
            this.field3442[var4] += arg1;
            this.field3430[var4] += arg2;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIIIJ)V", line = 69)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 1900)
    private class200() {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V", line = 1902)
    private class200(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1449(arg0);
        } else {
            this.method1450(arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(III)V", line = 1986)
    public class200(int arg0, int arg1, int arg2) {
        this.field3435 = new int[arg0];
        this.field3442 = new int[arg0];
        this.field3430 = new int[arg0];
        this.field3437 = new int[arg0];
        this.field3458 = new int[arg1];
        this.field3465 = new int[arg1];
        this.field3473 = new int[arg1];
        this.field3452 = new byte[arg1];
        this.field3456 = new byte[arg1];
        this.field3462 = new byte[arg1];
        this.field3461 = new short[arg1];
        this.field3440 = new short[arg1];
        this.field3477 = new byte[arg1];
        this.field3451 = new int[arg1];
        if (arg2 > 0) {
            this.field3433 = new byte[arg2];
            this.field3445 = new short[arg2];
            this.field3439 = new short[arg2];
            this.field3455 = new short[arg2];
            this.field3431 = new short[arg2];
            this.field3449 = new short[arg2];
            this.field3432 = new short[arg2];
            this.field3444 = new byte[arg2];
            this.field3474 = new byte[arg2];
            this.field3448 = new byte[arg2];
            this.field3446 = new byte[arg2];
            this.field3457 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([Llb;I)V", line = 2018)
    public class200(class200[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3463 = 0;
        this.field3467 = 0;
        this.field3471 = 0;
        this.field3447 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class200 var10 = arg0[var9];
            if (var10 != null) {
                this.field3463 += var10.field3463;
                this.field3467 += var10.field3467;
                this.field3471 += var10.field3471;
                if (var10.field3456 == null) {
                    if (this.field3447 == -1) {
                        this.field3447 = var10.field3447;
                    }
                    if (this.field3447 != var10.field3447) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field3452 != null;
                var5 |= var10.field3462 != null;
                var6 |= var10.field3451 != null;
                var7 |= var10.field3440 != null;
                var8 |= var10.field3477 != null;
            }
        }
        this.field3435 = new int[this.field3463];
        this.field3442 = new int[this.field3463];
        this.field3430 = new int[this.field3463];
        this.field3437 = new int[this.field3463];
        this.field3458 = new int[this.field3467];
        this.field3465 = new int[this.field3467];
        this.field3473 = new int[this.field3467];
        if (var3) {
            this.field3452 = new byte[this.field3467];
        }
        if (var4) {
            this.field3456 = new byte[this.field3467];
        }
        if (var5) {
            this.field3462 = new byte[this.field3467];
        }
        if (var6) {
            this.field3451 = new int[this.field3467];
        }
        if (var7) {
            this.field3440 = new short[this.field3467];
        }
        if (var8) {
            this.field3477 = new byte[this.field3467];
        }
        this.field3461 = new short[this.field3467];
        if (this.field3471 > 0) {
            this.field3433 = new byte[this.field3471];
            this.field3445 = new short[this.field3471];
            this.field3439 = new short[this.field3471];
            this.field3455 = new short[this.field3471];
            this.field3431 = new short[this.field3471];
            this.field3449 = new short[this.field3471];
            this.field3432 = new short[this.field3471];
            this.field3444 = new byte[this.field3471];
            this.field3474 = new byte[this.field3471];
            this.field3448 = new byte[this.field3471];
            this.field3446 = new byte[this.field3471];
            this.field3457 = new byte[this.field3471];
        }
        this.field3463 = 0;
        this.field3467 = 0;
        this.field3471 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class200 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field3467; var13++) {
                    if (var3 && var12.field3452 != null) {
                        this.field3452[this.field3467] = var12.field3452[var13];
                    }
                    if (var4) {
                        if (var12.field3456 == null) {
                            this.field3456[this.field3467] = var12.field3447;
                        } else {
                            this.field3456[this.field3467] = var12.field3456[var13];
                        }
                    }
                    if (var5 && var12.field3462 != null) {
                        this.field3462[this.field3467] = var12.field3462[var13];
                    }
                    if (var6 && var12.field3451 != null) {
                        this.field3451[this.field3467] = var12.field3451[var13];
                    }
                    if (var7) {
                        if (var12.field3440 == null) {
                            this.field3440[this.field3467] = -1;
                        } else {
                            this.field3440[this.field3467] = var12.field3440[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field3477 == null || var12.field3477[var13] == -1) {
                            this.field3477[this.field3467] = -1;
                        } else {
                            this.field3477[this.field3467] = (byte) (var12.field3477[var13] + this.field3471);
                        }
                    }
                    this.field3461[this.field3467] = var12.field3461[var13];
                    this.field3458[this.field3467] = this.method1432(var12, var12.field3458[var13]);
                    this.field3465[this.field3467] = this.method1432(var12, var12.field3465[var13]);
                    this.field3473[this.field3467] = this.method1432(var12, var12.field3473[var13]);
                    this.field3467++;
                }
                for (int var14 = 0; var14 < var12.field3471; var14++) {
                    byte var15 = this.field3433[this.field3471] = var12.field3433[var14];
                    if (var15 == 0) {
                        this.field3445[this.field3471] = (short) this.method1432(var12, var12.field3445[var14]);
                        this.field3439[this.field3471] = (short) this.method1432(var12, var12.field3439[var14]);
                        this.field3455[this.field3471] = (short) this.method1432(var12, var12.field3455[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field3445[this.field3471] = var12.field3445[var14];
                        this.field3439[this.field3471] = var12.field3439[var14];
                        this.field3455[this.field3471] = var12.field3455[var14];
                        this.field3431[this.field3471] = var12.field3431[var14];
                        this.field3449[this.field3471] = var12.field3449[var14];
                        this.field3432[this.field3471] = var12.field3432[var14];
                        this.field3444[this.field3471] = var12.field3444[var14];
                        this.field3474[this.field3471] = var12.field3474[var14];
                        this.field3448[this.field3471] = var12.field3448[var14];
                    }
                    if (var15 == 2) {
                        this.field3446[this.field3471] = var12.field3446[var14];
                        this.field3457[this.field3471] = var12.field3457[var14];
                    }
                    this.field3471++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Llb;ZZZZ)V", line = 2227)
    public class200(class200 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3463 = arg0.field3463;
        this.field3467 = arg0.field3467;
        this.field3471 = arg0.field3471;
        if (arg1) {
            this.field3435 = arg0.field3435;
            this.field3442 = arg0.field3442;
            this.field3430 = arg0.field3430;
        } else {
            this.field3435 = new int[this.field3463];
            this.field3442 = new int[this.field3463];
            this.field3430 = new int[this.field3463];
            for (int var6 = 0; var6 < this.field3463; var6++) {
                this.field3435[var6] = arg0.field3435[var6];
                this.field3442[var6] = arg0.field3442[var6];
                this.field3430[var6] = arg0.field3430[var6];
            }
        }
        if (arg2) {
            this.field3461 = arg0.field3461;
        } else {
            this.field3461 = new short[this.field3467];
            for (int var7 = 0; var7 < this.field3467; var7++) {
                this.field3461[var7] = arg0.field3461[var7];
            }
        }
        if (arg3 || arg0.field3440 == null) {
            this.field3440 = arg0.field3440;
        } else {
            this.field3440 = new short[this.field3467];
            for (int var8 = 0; var8 < this.field3467; var8++) {
                this.field3440[var8] = arg0.field3440[var8];
            }
        }
        if (arg4) {
            this.field3462 = arg0.field3462;
        } else {
            this.field3462 = new byte[this.field3467];
            if (arg0.field3462 == null) {
                for (int var9 = 0; var9 < this.field3467; var9++) {
                    this.field3462[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3467; var10++) {
                    this.field3462[var10] = arg0.field3462[var10];
                }
            }
        }
        this.field3458 = arg0.field3458;
        this.field3465 = arg0.field3465;
        this.field3473 = arg0.field3473;
        this.field3452 = arg0.field3452;
        this.field3456 = arg0.field3456;
        this.field3477 = arg0.field3477;
        this.field3447 = arg0.field3447;
        this.field3433 = arg0.field3433;
        this.field3445 = arg0.field3445;
        this.field3439 = arg0.field3439;
        this.field3455 = arg0.field3455;
        this.field3431 = arg0.field3431;
        this.field3449 = arg0.field3449;
        this.field3432 = arg0.field3432;
        this.field3444 = arg0.field3444;
        this.field3474 = arg0.field3474;
        this.field3448 = arg0.field3448;
        this.field3446 = arg0.field3446;
        this.field3457 = arg0.field3457;
        this.field3437 = arg0.field3437;
        this.field3451 = arg0.field3451;
        this.field3469 = arg0.field3469;
        this.field3454 = arg0.field3454;
        this.field3475 = arg0.field3475;
        this.field3472 = arg0.field3472;
        this.field3443 = arg0.field3443;
        this.field3434 = arg0.field3434;
        this.field3450 = arg0.field3450;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([[III)I", line = 76)
    private static final int method1434(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[[I[[IIIIZZ)Llb;", line = 103)
    public final class200 method1435(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1436();
        int var10 = this.field3468 + arg4;
        int var11 = this.field3438 + arg4;
        int var12 = this.field3466 + arg6;
        int var13 = this.field3460 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class200 var18;
        if (arg7) {
            var18 = new class200();
            var18.field3463 = this.field3463;
            var18.field3467 = this.field3467;
            var18.field3471 = this.field3471;
            var18.field3458 = this.field3458;
            var18.field3465 = this.field3465;
            var18.field3473 = this.field3473;
            var18.field3452 = this.field3452;
            var18.field3456 = this.field3456;
            var18.field3462 = this.field3462;
            var18.field3477 = this.field3477;
            var18.field3461 = this.field3461;
            var18.field3440 = this.field3440;
            var18.field3447 = this.field3447;
            var18.field3433 = this.field3433;
            var18.field3445 = this.field3445;
            var18.field3439 = this.field3439;
            var18.field3455 = this.field3455;
            var18.field3431 = this.field3431;
            var18.field3449 = this.field3449;
            var18.field3432 = this.field3432;
            var18.field3444 = this.field3444;
            var18.field3474 = this.field3474;
            var18.field3448 = this.field3448;
            var18.field3446 = this.field3446;
            var18.field3457 = this.field3457;
            var18.field3437 = this.field3437;
            var18.field3451 = this.field3451;
            var18.field3469 = this.field3469;
            var18.field3454 = this.field3454;
            var18.field3434 = this.field3434;
            var18.field3450 = this.field3450;
            var18.field3475 = this.field3475;
            var18.field3472 = this.field3472;
            var18.field3443 = this.field3443;
            if (arg0 == 3) {
                var18.field3435 = class153.method1125(this.field3435, (byte) 109);
                var18.field3442 = class153.method1125(this.field3442, (byte) 96);
                var18.field3430 = class153.method1125(this.field3430, (byte) 74);
            } else {
                var18.field3435 = this.field3435;
                var18.field3442 = new int[var18.field3463];
                var18.field3430 = this.field3430;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field3463; var19++) {
                int var20 = this.field3435[var19] + arg4;
                int var21 = this.field3430[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field3442[var19] = this.field3442[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field3463; var29++) {
                int var30 = (this.field3442[var29] << 16) / this.field3470;
                if (var30 < arg1) {
                    int var31 = this.field3435[var29] + arg4;
                    int var32 = this.field3430[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field3442[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field3442[var29];
                } else {
                    var18.field3442[var29] = this.field3442[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1455(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field3436 - this.field3470;
            for (int var43 = 0; var43 < this.field3463; var43++) {
                int var44 = this.field3435[var43] + arg4;
                int var45 = this.field3430[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field3442[var43] = var52 + this.field3442[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field3436 - this.field3470;
            for (int var54 = 0; var54 < this.field3463; var54++) {
                int var55 = this.field3435[var54] + arg4;
                int var56 = this.field3430[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field3442[var54] = ((this.field3442[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1458();
        } else {
            this.field3429 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 363)
    private final void method1436() {
        if (this.field3429) {
            return;
        }
        this.field3429 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field3463; var7++) {
            int var8 = this.field3435[var7];
            int var9 = this.field3442[var7];
            int var10 = this.field3430[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field3468 = (short) var1;
        this.field3438 = (short) var4;
        this.field3470 = (short) var2;
        this.field3436 = (short) var5;
        this.field3466 = (short) var3;
        this.field3460 = (short) var6;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 421)
    private final void method1437(int arg0) {
        int var2 = field3464[arg0];
        int var3 = field3453[arg0];
        for (int var4 = 0; var4 < this.field3463; var4++) {
            int var5 = this.field3442[var4] * var2 + this.field3435[var4] * var3 >> 16;
            this.field3442[var4] = this.field3442[var4] * var3 - this.field3435[var4] * var2 >> 16;
            this.field3435[var4] = var5;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(SS)V", line = 443)
    public final void method1438(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3467; var3++) {
            if (this.field3461[var3] == arg0) {
                this.field3461[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()V", line = 458)
    public final void method1439() {
        for (int var1 = 0; var1 < this.field3463; var1++) {
            this.field3430[var1] = -this.field3430[var1];
        }
        for (int var2 = 0; var2 < this.field3467; var2++) {
            int var3 = this.field3458[var2];
            this.field3458[var2] = this.field3473[var2];
            this.field3473[var2] = var3;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IIIII)Lof;", line = 478)
    public final class227 method1440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class281.field4827) {
            class193 var6 = new class193(this, arg0, arg1, true);
            var6.method1361();
            return var6;
        } else {
            return new class267(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(III)V", line = 493)
    public final void method1441(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3463; var4++) {
            this.field3435[var4] = this.field3435[var4] * arg0 / 128;
            this.field3442[var4] = this.field3442[var4] * arg1 / 128;
            this.field3430[var4] = this.field3430[var4] * arg2 / 128;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lme;IIIZ)V", line = 506)
    public final void method1261(class177 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class200 var6 = (class200) arg0;
        var6.method1436();
        var6.method1454();
        field3476++;
        int var7 = 0;
        int[] var8 = var6.field3435;
        int var9 = var6.field3463;
        for (int var10 = 0; var10 < this.field3463; var10++) {
            class205 var11 = this.field3475[var10];
            if (var11.field3524 != 0) {
                int var12 = this.field3442[var10] - arg2;
                if (var12 >= var6.field3470 && var12 <= var6.field3436) {
                    int var13 = this.field3435[var10] - arg1;
                    if (var13 >= var6.field3468 && var13 <= var6.field3438) {
                        int var14 = this.field3430[var10] - arg3;
                        if (var14 >= var6.field3466 && var14 <= var6.field3460) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class205 var16 = var6.field3475[var15];
                                if (var8[var15] == var13 && var6.field3430[var15] == var14 && var6.field3442[var15] == var12 && var16.field3524 != 0) {
                                    if (this.field3443 == null) {
                                        this.field3443 = new class205[this.field3463];
                                    }
                                    if (var6.field3443 == null) {
                                        var6.field3443 = new class205[var9];
                                    }
                                    class205 var17 = this.field3443[var10];
                                    if (var17 == null) {
                                        var17 = this.field3443[var10] = new class205(var11);
                                    }
                                    class205 var18 = var6.field3443[var15];
                                    if (var18 == null) {
                                        var18 = var6.field3443[var15] = new class205(var16);
                                    }
                                    var17.field3517 += var16.field3517;
                                    var17.field3518 += var16.field3518;
                                    var17.field3520 += var16.field3520;
                                    var17.field3524 += var16.field3524;
                                    var18.field3517 += var11.field3517;
                                    var18.field3518 += var11.field3518;
                                    var18.field3520 += var11.field3520;
                                    var18.field3524 += var11.field3524;
                                    var7++;
                                    field3441[var10] = field3476;
                                    field3459[var15] = field3476;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field3467; var19++) {
            if (field3441[this.field3458[var19]] == field3476 && field3441[this.field3465[var19]] == field3476 && field3441[this.field3473[var19]] == field3476) {
                if (this.field3452 == null) {
                    this.field3452 = new byte[this.field3467];
                }
                this.field3452[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field3467; var20++) {
            if (field3459[var6.field3458[var20]] == field3476 && field3459[var6.field3465[var20]] == field3476 && field3459[var6.field3473[var20]] == field3476) {
                if (var6.field3452 == null) {
                    var6.field3452 = new byte[var6.field3467];
                }
                var6.field3452[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 624)
    public final void method1442(int arg0) {
        int var2 = field3464[arg0];
        int var3 = field3453[arg0];
        for (int var4 = 0; var4 < this.field3463; var4++) {
            int var5 = this.field3435[var4] * var3 + this.field3430[var4] * var2 >> 16;
            this.field3430[var4] = this.field3430[var4] * var3 - this.field3435[var4] * var2 >> 16;
            this.field3435[var4] = var5;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()Llb;", line = 648)
    public final class200 method1443() {
        class200 var1 = new class200();
        if (this.field3452 != null) {
            var1.field3452 = new byte[this.field3467];
            for (int var2 = 0; var2 < this.field3467; var2++) {
                var1.field3452[var2] = this.field3452[var2];
            }
        }
        var1.field3463 = this.field3463;
        var1.field3467 = this.field3467;
        var1.field3471 = this.field3471;
        var1.field3435 = this.field3435;
        var1.field3442 = this.field3442;
        var1.field3430 = this.field3430;
        var1.field3458 = this.field3458;
        var1.field3465 = this.field3465;
        var1.field3473 = this.field3473;
        var1.field3456 = this.field3456;
        var1.field3462 = this.field3462;
        var1.field3477 = this.field3477;
        var1.field3461 = this.field3461;
        var1.field3440 = this.field3440;
        var1.field3447 = this.field3447;
        var1.field3433 = this.field3433;
        var1.field3445 = this.field3445;
        var1.field3439 = this.field3439;
        var1.field3455 = this.field3455;
        var1.field3431 = this.field3431;
        var1.field3449 = this.field3449;
        var1.field3432 = this.field3432;
        var1.field3444 = this.field3444;
        var1.field3474 = this.field3474;
        var1.field3448 = this.field3448;
        var1.field3446 = this.field3446;
        var1.field3457 = this.field3457;
        var1.field3437 = this.field3437;
        var1.field3451 = this.field3451;
        var1.field3469 = this.field3469;
        var1.field3454 = this.field3454;
        var1.field3475 = this.field3475;
        var1.field3472 = this.field3472;
        var1.field3434 = this.field3434;
        var1.field3450 = this.field3450;
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()Z", line = 701)
    public final boolean method1264() {
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "()V", line = 709)
    public final void method1444() {
        int var10002;
        if (this.field3437 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3463; var3++) {
                int var4 = this.field3437[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3469 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3469[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3463) {
                int var7 = this.field3437[var6];
                this.field3469[var7][var1[var7]++] = var6++;
            }
            this.field3437 = null;
        }
        if (this.field3451 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3467; var10++) {
            int var11 = this.field3451[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3454 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3454[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3467) {
            int var14 = this.field3451[var13];
            this.field3454[var14][var8[var14]++] = var13++;
        }
        this.field3451 = null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(IIIII)Lae;", line = 802)
    public final class267 method1445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class267(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(III)I", line = 807)
    public final int method1446(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3463; var4++) {
            if (this.field3435[var4] == arg0 && this.field3442[var4] == arg1 && this.field3430[var4] == arg2) {
                return var4;
            }
        }
        this.field3435[this.field3463] = arg0;
        this.field3442[this.field3463] = arg1;
        this.field3430[this.field3463] = arg2;
        return this.field3463++;
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "()V", line = 821)
    public static void method1447() {
        field3441 = null;
        field3459 = null;
        field3464 = null;
        field3453 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(SS)V", line = 827)
    public final void method1448(short arg0, short arg1) {
        if (this.field3440 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3467; var3++) {
            if (this.field3440[var3] == arg0) {
                this.field3440[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B)V", line = 848)
    private final void method1449(byte[] arg0) {
        class70 var2 = new class70(arg0);
        class70 var3 = new class70(arg0);
        class70 var4 = new class70(arg0);
        class70 var5 = new class70(arg0);
        class70 var6 = new class70(arg0);
        class70 var7 = new class70(arg0);
        class70 var8 = new class70(arg0);
        var2.field1068 = arg0.length - 23;
        int var9 = var2.method423(255);
        int var10 = var2.method423(255);
        int var11 = var2.method481(0);
        int var12 = var2.method481(0);
        int var13 = var2.method481(0);
        int var14 = var2.method481(0);
        int var15 = var2.method481(0);
        int var16 = var2.method481(0);
        int var17 = var2.method481(0);
        int var18 = var2.method423(255);
        int var19 = var2.method423(255);
        int var20 = var2.method423(255);
        int var21 = var2.method423(255);
        int var22 = var2.method423(255);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3433 = new byte[var11];
            var2.field1068 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field3433[var26] = var2.method466((byte) -78);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field3463 = var9;
        this.field3467 = var10;
        this.field3471 = var11;
        this.field3435 = new int[var9];
        this.field3442 = new int[var9];
        this.field3430 = new int[var9];
        this.field3458 = new int[var10];
        this.field3465 = new int[var10];
        this.field3473 = new int[var10];
        if (var17 == 1) {
            this.field3437 = new int[var9];
        }
        if (var12 == 1) {
            this.field3452 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3456 = new byte[var10];
        } else {
            this.field3447 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3462 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3451 = new int[var10];
        }
        if (var16 == 1) {
            this.field3440 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3477 = new byte[var10];
        }
        this.field3461 = new short[var10];
        if (var11 > 0) {
            this.field3445 = new short[var11];
            this.field3439 = new short[var11];
            this.field3455 = new short[var11];
            if (var24 > 0) {
                this.field3431 = new short[var24];
                this.field3449 = new short[var24];
                this.field3432 = new short[var24];
                this.field3444 = new byte[var24];
                this.field3474 = new byte[var24];
                this.field3448 = new byte[var24];
            }
            if (var25 > 0) {
                this.field3446 = new byte[var25];
                this.field3457 = new byte[var25];
            }
        }
        var2.field1068 = var11;
        var3.field1068 = var44;
        var4.field1068 = var46;
        var5.field1068 = var48;
        var6.field1068 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method481(0);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method448(false);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method448(false);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method448(false);
            }
            this.field3435[var66] = var63 + var68;
            this.field3442[var66] = var64 + var69;
            this.field3430[var66] = var65 + var70;
            var63 = this.field3435[var66];
            var64 = this.field3442[var66];
            var65 = this.field3430[var66];
            if (var17 == 1) {
                this.field3437[var66] = var6.method481(0);
            }
        }
        var2.field1068 = var42;
        var3.field1068 = var31;
        var4.field1068 = var34;
        var5.field1068 = var37;
        var6.field1068 = var35;
        var7.field1068 = var40;
        var8.field1068 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field3461[var71] = (short) var2.method423(255);
            if (var12 == 1) {
                this.field3452[var71] = var3.method466((byte) -76);
            }
            if (var13 == 255) {
                this.field3456[var71] = var4.method466((byte) -20);
            }
            if (var14 == 1) {
                this.field3462[var71] = var5.method466((byte) -24);
            }
            if (var15 == 1) {
                this.field3451[var71] = var6.method481(0);
            }
            if (var16 == 1) {
                this.field3440[var71] = (short) (var7.method423(255) - 1);
            }
            if (this.field3477 != null) {
                if (this.field3440[var71] == -1) {
                    this.field3477[var71] = -1;
                } else {
                    this.field3477[var71] = (byte) (var8.method481(0) - 1);
                }
            }
        }
        var2.field1068 = var33;
        var3.field1068 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method481(0);
            if (var77 == 1) {
                var72 = var2.method448(false) + var75;
                var73 = var2.method448(false) + var72;
                var74 = var2.method448(false) + var73;
                var75 = var74;
                this.field3458[var76] = var72;
                this.field3465[var76] = var73;
                this.field3473[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method448(false) + var75;
                var75 = var74;
                this.field3458[var76] = var72;
                this.field3465[var76] = var73;
                this.field3473[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method448(false) + var75;
                var75 = var74;
                this.field3458[var76] = var72;
                this.field3465[var76] = var73;
                this.field3473[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method448(false) + var75;
                var75 = var74;
                this.field3458[var76] = var72;
                this.field3465[var76] = var80;
                this.field3473[var76] = var74;
            }
        }
        var2.field1068 = var50;
        var3.field1068 = var52;
        var4.field1068 = var54;
        var5.field1068 = var56;
        var6.field1068 = var58;
        var7.field1068 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field3433[var81] & 0xFF;
            if (var82 == 0) {
                this.field3445[var81] = (short) var2.method423(255);
                this.field3439[var81] = (short) var2.method423(255);
                this.field3455[var81] = (short) var2.method423(255);
            }
            if (var82 == 1) {
                this.field3445[var81] = (short) var3.method423(255);
                this.field3439[var81] = (short) var3.method423(255);
                this.field3455[var81] = (short) var3.method423(255);
                this.field3431[var81] = (short) var4.method423(255);
                this.field3449[var81] = (short) var4.method423(255);
                this.field3432[var81] = (short) var4.method423(255);
                this.field3444[var81] = var5.method466((byte) -83);
                this.field3474[var81] = var6.method466((byte) -65);
                this.field3448[var81] = var7.method466((byte) -38);
            }
            if (var82 == 2) {
                this.field3445[var81] = (short) var3.method423(255);
                this.field3439[var81] = (short) var3.method423(255);
                this.field3455[var81] = (short) var3.method423(255);
                this.field3431[var81] = (short) var4.method423(255);
                this.field3449[var81] = (short) var4.method423(255);
                this.field3432[var81] = (short) var4.method423(255);
                this.field3444[var81] = var5.method466((byte) -118);
                this.field3474[var81] = var6.method466((byte) -102);
                this.field3448[var81] = var7.method466((byte) -125);
                this.field3446[var81] = var7.method466((byte) -99);
                this.field3457[var81] = var7.method466((byte) -104);
            }
            if (var82 == 3) {
                this.field3445[var81] = (short) var3.method423(255);
                this.field3439[var81] = (short) var3.method423(255);
                this.field3455[var81] = (short) var3.method423(255);
                this.field3431[var81] = (short) var4.method423(255);
                this.field3449[var81] = (short) var4.method423(255);
                this.field3432[var81] = (short) var4.method423(255);
                this.field3444[var81] = var5.method466((byte) -50);
                this.field3474[var81] = var6.method466((byte) -20);
                this.field3448[var81] = var7.method466((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([B)V", line = 1270)
    private final void method1450(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class70 var4 = new class70(arg0);
        class70 var5 = new class70(arg0);
        class70 var6 = new class70(arg0);
        class70 var7 = new class70(arg0);
        class70 var8 = new class70(arg0);
        var4.field1068 = arg0.length - 18;
        int var9 = var4.method423(255);
        int var10 = var4.method423(255);
        int var11 = var4.method481(0);
        int var12 = var4.method481(0);
        int var13 = var4.method481(0);
        int var14 = var4.method481(0);
        int var15 = var4.method481(0);
        int var16 = var4.method481(0);
        int var17 = var4.method423(255);
        int var18 = var4.method423(255);
        int var19 = var4.method423(255);
        int var20 = var4.method423(255);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3463 = var9;
        this.field3467 = var10;
        this.field3471 = var11;
        this.field3435 = new int[var9];
        this.field3442 = new int[var9];
        this.field3430 = new int[var9];
        this.field3458 = new int[var10];
        this.field3465 = new int[var10];
        this.field3473 = new int[var10];
        if (var11 > 0) {
            this.field3433 = new byte[var11];
            this.field3445 = new short[var11];
            this.field3439 = new short[var11];
            this.field3455 = new short[var11];
        }
        if (var16 == 1) {
            this.field3437 = new int[var9];
        }
        if (var12 == 1) {
            this.field3452 = new byte[var10];
            this.field3477 = new byte[var10];
            this.field3440 = new short[var10];
        }
        if (var13 == 255) {
            this.field3456 = new byte[var10];
        } else {
            this.field3447 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3462 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3451 = new int[var10];
        }
        this.field3461 = new short[var10];
        var4.field1068 = var21;
        var5.field1068 = var36;
        var6.field1068 = var38;
        var7.field1068 = var40;
        var8.field1068 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method481(0);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method448(false);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method448(false);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method448(false);
            }
            this.field3435[var46] = var43 + var48;
            this.field3442[var46] = var44 + var49;
            this.field3430[var46] = var45 + var50;
            var43 = this.field3435[var46];
            var44 = this.field3442[var46];
            var45 = this.field3430[var46];
            if (var16 == 1) {
                this.field3437[var46] = var8.method481(0);
            }
        }
        var4.field1068 = var32;
        var5.field1068 = var28;
        var6.field1068 = var26;
        var7.field1068 = var30;
        var8.field1068 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field3461[var51] = (short) var4.method423(255);
            if (var12 == 1) {
                int var52 = var5.method481(0);
                if ((var52 & 0x1) == 1) {
                    this.field3452[var51] = 1;
                    var2 = true;
                } else {
                    this.field3452[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field3477[var51] = (byte) (var52 >> 2);
                    this.field3440[var51] = this.field3461[var51];
                    this.field3461[var51] = 127;
                    if (this.field3440[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3477[var51] = -1;
                    this.field3440[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field3456[var51] = var6.method466((byte) -49);
            }
            if (var14 == 1) {
                this.field3462[var51] = var7.method466((byte) -21);
            }
            if (var15 == 1) {
                this.field3451[var51] = var8.method481(0);
            }
        }
        var4.field1068 = var25;
        var5.field1068 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method481(0);
            if (var58 == 1) {
                var53 = var4.method448(false) + var56;
                var54 = var4.method448(false) + var53;
                var55 = var4.method448(false) + var54;
                var56 = var55;
                this.field3458[var57] = var53;
                this.field3465[var57] = var54;
                this.field3473[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method448(false) + var56;
                var56 = var55;
                this.field3458[var57] = var53;
                this.field3465[var57] = var54;
                this.field3473[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method448(false) + var56;
                var56 = var55;
                this.field3458[var57] = var53;
                this.field3465[var57] = var54;
                this.field3473[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method448(false) + var56;
                var56 = var55;
                this.field3458[var57] = var53;
                this.field3465[var57] = var61;
                this.field3473[var57] = var55;
            }
        }
        var4.field1068 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field3433[var62] = 0;
            this.field3445[var62] = (short) var4.method423(255);
            this.field3439[var62] = (short) var4.method423(255);
            this.field3455[var62] = (short) var4.method423(255);
        }
        if (this.field3477 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field3477[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field3445[var65] & 0xFFFF) == this.field3458[var64] && (this.field3439[var65] & 0xFFFF) == this.field3465[var64] && (this.field3455[var65] & 0xFFFF) == this.field3473[var64]) {
                        this.field3477[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field3477 = null;
            }
        }
        if (!var3) {
            this.field3440 = null;
        }
        if (!var2) {
            this.field3452 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 1611)
    private final void method1451(int arg0) {
        int var2 = field3464[arg0];
        int var3 = field3453[arg0];
        for (int var4 = 0; var4 < this.field3463; var4++) {
            int var5 = this.field3442[var4] * var3 - this.field3430[var4] * var2 >> 16;
            this.field3430[var4] = this.field3442[var4] * var2 + this.field3430[var4] * var3 >> 16;
            this.field3442[var4] = var5;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "()V", line = 1629)
    public final void method1452() {
        this.field3437 = null;
        this.field3451 = null;
        this.field3469 = (int[][]) null;
        this.field3454 = (int[][]) null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIBSB)I", line = 1635)
    public final int method1453(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field3458[this.field3467] = arg0;
        this.field3465[this.field3467] = arg1;
        this.field3473[this.field3467] = arg2;
        this.field3452[this.field3467] = arg3;
        this.field3477[this.field3467] = -1;
        this.field3461[this.field3467] = arg4;
        this.field3440[this.field3467] = -1;
        this.field3462[this.field3467] = arg5;
        return this.field3467++;
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "()V", line = 1650)
    public final void method1454() {
        if (this.field3475 != null) {
            return;
        }
        this.field3475 = new class205[this.field3463];
        for (int var1 = 0; var1 < this.field3463; var1++) {
            this.field3475[var1] = new class205();
        }
        for (int var2 = 0; var2 < this.field3467; var2++) {
            int var3 = this.field3458[var2];
            int var4 = this.field3465[var2];
            int var5 = this.field3473[var2];
            int var6 = this.field3435[var4] - this.field3435[var3];
            int var7 = this.field3442[var4] - this.field3442[var3];
            int var8 = this.field3430[var4] - this.field3430[var3];
            int var9 = this.field3435[var5] - this.field3435[var3];
            int var10 = this.field3442[var5] - this.field3442[var3];
            int var11 = this.field3430[var5] - this.field3430[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field3452 == null) {
                var19 = 0;
            } else {
                var19 = this.field3452[var2];
            }
            if (var19 == 0) {
                class205 var20 = this.field3475[var3];
                var20.field3517 += var16;
                var20.field3518 += var17;
                var20.field3520 += var18;
                var20.field3524++;
                class205 var21 = this.field3475[var4];
                var21.field3517 += var16;
                var21.field3518 += var17;
                var21.field3520 += var18;
                var21.field3524++;
                class205 var22 = this.field3475[var5];
                var22.field3517 += var16;
                var22.field3518 += var17;
                var22.field3520 += var18;
                var22.field3524++;
            } else if (var19 == 1) {
                if (this.field3472 == null) {
                    this.field3472 = new class147[this.field3467];
                }
                class147 var23 = this.field3472[var2] = new class147();
                var23.field2492 = var16;
                var23.field2491 = var17;
                var23.field2495 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([[IIIIII)V", line = 1750)
    private final void method1455(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1434(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1434(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1434(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1434(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1451(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1437(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1433(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "()V", line = 1818)
    public final void method1456() {
        for (int var1 = 0; var1 < this.field3463; var1++) {
            int var2 = this.field3435[var1];
            this.field3435[var1] = this.field3430[var1];
            this.field3430[var1] = -var2;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Lme;", line = 1835)
    public final class177 method1263(int arg0, int arg1, int arg2) {
        return this.method1440(this.field3434, this.field3450, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "()V", line = 1842)
    public final void method1457() {
        for (int var1 = 0; var1 < this.field3463; var1++) {
            this.field3435[var1] = -this.field3435[var1];
            this.field3430[var1] = -this.field3430[var1];
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "()V", line = 1858)
    private final void method1458() {
        this.field3475 = null;
        this.field3443 = null;
        this.field3472 = null;
        this.field3429 = false;
    }

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "()V", line = 1878)
    public final void method1459() {
        for (int var1 = 0; var1 < this.field3463; var1++) {
            int var2 = this.field3430[var1];
            this.field3430[var1] = this.field3435[var1];
            this.field3435[var1] = -var2;
        }
        this.method1458();
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(III)V", line = 1913)
    public final void method1460(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field3464[arg2];
            int var5 = field3453[arg2];
            for (int var6 = 0; var6 < this.field3463; var6++) {
                int var7 = this.field3442[var6] * var4 + this.field3435[var6] * var5 >> 16;
                this.field3442[var6] = this.field3442[var6] * var5 - this.field3435[var6] * var4 >> 16;
                this.field3435[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field3464[arg0];
            int var9 = field3453[arg0];
            for (int var10 = 0; var10 < this.field3463; var10++) {
                int var11 = this.field3442[var10] * var9 - this.field3430[var10] * var8 >> 16;
                this.field3430[var10] = this.field3442[var10] * var8 + this.field3430[var10] * var9 >> 16;
                this.field3442[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field3464[arg1];
        int var13 = field3453[arg1];
        for (int var14 = 0; var14 < this.field3463; var14++) {
            int var15 = this.field3435[var14] * var13 + this.field3430[var14] * var12 >> 16;
            this.field3430[var14] = this.field3430[var14] * var13 - this.field3435[var14] * var12 >> 16;
            this.field3435[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()I", line = 1975)
    public final int method176() {
        if (!this.field3429) {
            this.method1436();
        }
        return this.field3470;
    }
}
