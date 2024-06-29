import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class218 extends class94 {

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lbd;")
    private class20 field3451 = null;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Z")
    private boolean field3448 = true;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Z")
    private boolean field3447 = false;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    private int field3473 = -1;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    private int field3474 = -32768;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    private int field3454 = -1;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    private int field3477 = 0;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    private int field3469 = 0;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    private int field3481 = 0;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    private int field3467;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    private int field3471;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "Lgh;")
    private class222 field3460;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    private int field3466;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    private int field3461;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "[I")
    public static int[] field3475 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "Lcj;")
    private class243 field3479;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)Lfe;", line = 10)
    private final class94 method1454(boolean arg0, int arg1) {
        boolean var3 = client.field2034 != class193.field2911;
        class17 var4 = class277.method1819((byte) -96, this.field3467);
        int var5 = var4.field201;
        if (var4.field195 != null) {
            var4 = var4.method139(-1);
        }
        if (arg1 <= 9) {
            this.field3448 = true;
        }
        field3457++;
        if (var4 == null) {
            if (class333.field5166 && !var3) {
                this.method1459((byte) -83);
            }
            return null;
        }
        if (class2.field25 != 0 && this.field3447 && (this.field3460 == null || this.field3460 != null && this.field3460.field3549 != var4.field201)) {
            int var6 = var4.field201;
            if (var4.field201 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field3460 = null;
            } else {
                this.field3460 = class118.method809((byte) 57, var6);
            }
            if (this.field3460 != null) {
                if (var4.field223 && this.field3460.field3540 != -1) {
                    this.field3466 = (int) (Math.random() * (double) this.field3460.field3529.length);
                    this.field3455 -= (int) (Math.random() * (double) this.field3460.field3522[this.field3466]);
                } else {
                    this.field3455 = class343.field5341 - 1;
                    this.field3466 = 0;
                }
            }
        }
        int var7 = this.field3459 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field187;
            var9 = var4.field212;
        } else {
            var8 = var4.field212;
            var9 = var4.field187;
        }
        int var10 = (var8 + 1 >> 1) + this.field3452;
        int var11 = (var8 >> 1) + this.field3452;
        int var12 = this.field3450 + (var9 >> 1);
        int var13 = (var9 + 1 >> 1) + this.field3450;
        this.method1457((byte) 74, var12 * 128, var11 * 128);
        boolean var14 = !var3 && var4.field173 && (this.field3473 != var4.field196 || (this.field3466 != this.field3454 || this.field3460 != null && (this.field3460.field3530 || class129.field2024) && this.field3466 != this.field3461) && class90.field1382 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = client.field2034[this.field3472];
        int var16 = var15[var11][var12] + var15[var10][var12] - (-var15[var10][var13] - var15[var11][var13]) >> 2;
        int var17 = (this.field3450 << 7) + (var9 << 6);
        int var18 = (this.field3452 << 7) + (var8 << 6);
        int[][] var19 = (int[][]) null;
        if (var3) {
            var19 = class193.field2911[0];
        } else if (this.field3472 < 3) {
            var19 = client.field2034[this.field3472 + 1];
        }
        if (class333.field5166 && var14) {
            class11.method83(this.field3451, this.field3481, this.field3469, this.field3477);
        }
        boolean var20 = this.field3451 == null;
        class118 var21;
        if (this.field3460 == null) {
            var21 = var4.method123(this.field3471, var16, false, var20 ? class4.field57 : this.field3451, true, var19, var15, var14, var17, this.field3459, var18);
        } else {
            var21 = var4.method134(this.field3466, var16, this.field3471, var19, 256, this.field3459, var15, var18, this.field3461, var20 ? class4.field57 : this.field3451, var17, var14, this.field3445, this.field3460);
        }
        if (var21 == null) {
            return null;
        }
        if (class333.field5166 && var14) {
            if (var20) {
                class4.field57 = var21.field1831;
            }
            int var22 = 0;
            if (this.field3472 != 0) {
                int[][] var23 = client.field2034[0];
                var22 = var16 - (var23[var10][var13] + var23[var11][var13] + var23[var10][var12] + var23[var11][var12] >> 2);
            }
            class20 var24 = var21.field1831;
            if (this.field3448 && class11.method76(var24, var18, var22, var17)) {
                this.field3448 = false;
            }
            if (!this.field3448) {
                class11.method84(var24, var18, var22, var17);
                this.field3477 = var17;
                this.field3451 = var24;
                if (var20) {
                    class4.field57 = null;
                }
                this.field3481 = var18;
                this.field3469 = var22;
            }
            this.field3454 = this.field3466;
            this.field3473 = var4.field196;
        }
        return var21.field1830;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)I", line = 173)
    public static final int method1455(int arg0) {
        field3470++;
        return ~class177.field2713 == arg0 ? 0 : class151.field2386[class177.field2713].method320();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)[B", line = 189)
    public static final byte[] method1456(int arg0, int arg1) {
        if (arg0 != 255) {
            field3475 = (int[]) null;
        }
        field3463++;
        class101 var2 = (class101) class213.field3367.method355((long) arg1, 6487);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class7.method39((byte) 57, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class101(var3);
            class213.field3367.method350((long) arg1, var2, true);
        }
        return var2.field1571;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIIIZLfe;)V", line = 597)
    public class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field3472 = arg3;
        this.field3452 = arg4;
        this.field3459 = arg2;
        this.field3467 = arg0;
        this.field3471 = arg1;
        this.field3450 = arg5;
        if (class333.field5166 && arg8 != null) {
            if ((arg8 instanceof class218)) {
                ((class218) arg8).method1459((byte) -79);
            } else {
                class17 var10 = class277.method1819((byte) 126, this.field3467);
                if (var10.field195 != null) {
                    var10 = var10.method139(-1);
                }
                if (var10 != null) {
                    class154.method1076(this.field3471, this.field3459, 0, this.field3452, this.field3450, this.field3472, 26008, 0, var10);
                }
            }
        }
        if (arg6 != -1) {
            this.field3460 = class118.method809((byte) 51, arg6);
            this.field3466 = 0;
            if (this.field3460.field3529.length > 1) {
                this.field3461 = 1;
            } else {
                this.field3461 = 0;
            }
            this.field3455 = class343.field5341 - 1;
            this.field3445 = 1;
            if (this.field3460.field3552 == 0 && arg8 != null && arg8 instanceof class218) {
                class218 var11 = (class218) arg8;
                if (this.field3460 == var11.field3460) {
                    this.field3445 = var11.field3445;
                    this.field3455 = var11.field3455;
                    this.field3466 = var11.field3466;
                    this.field3461 = var11.field3461;
                    return;
                }
            }
            if (arg7 && this.field3460.field3540 != -1) {
                this.field3466 = (int) (Math.random() * (double) this.field3460.field3529.length);
                this.field3461 = this.field3466 + 1;
                if (this.field3461 >= this.field3460.field3529.length) {
                    this.field3461 -= this.field3460.field3540;
                    if (this.field3461 < 0 || this.field3460.field3529.length <= this.field3461) {
                        this.field3461 = -1;
                    }
                }
                this.field3445 = (int) (Math.random() * (double) this.field3460.field3522[this.field3466]) + 1;
                this.field3455 = class343.field5341 - this.field3445;
            }
        }
        if (class333.field5166 && arg8 != null) {
            this.method1454(true, 87);
        }
        if (arg8 == null) {
            class17 var12 = class277.method1819((byte) 126, this.field3467);
            if (var12.field195 != null) {
                this.field3447 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)V", line = 245)
    private final void method1457(byte arg0, int arg1, int arg2) {
        if (this.field3460 != null) {
            int var4 = class343.field5341 - this.field3455;
            if (var4 > 100 && this.field3460.field3540 > 0) {
                int var5 = this.field3460.field3529.length - this.field3460.field3540;
                while (var5 > this.field3466 && this.field3460.field3522[this.field3466] < var4) {
                    var4 -= this.field3460.field3522[this.field3466];
                    this.field3466++;
                }
                if (var5 <= this.field3466) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3460.field3529.length; var7++) {
                        var6 += this.field3460.field3522[var7];
                    }
                    var4 %= var6;
                }
                this.field3461 = this.field3466 + 1;
                if (this.field3461 >= this.field3460.field3529.length) {
                    this.field3461 -= this.field3460.field3540;
                    if (this.field3461 < 0 || this.field3460.field3529.length <= this.field3461) {
                        this.field3461 = -1;
                    }
                }
            }
            while (var4 > this.field3460.field3522[this.field3466]) {
                class229.method1571(arg2, false, (byte) -110, arg1, this.field3460, this.field3466);
                var4 -= this.field3460.field3522[this.field3466];
                this.field3466++;
                if (this.field3460.field3529.length <= this.field3466) {
                    this.field3466 -= this.field3460.field3540;
                    if (this.field3466 < 0 || this.field3460.field3529.length <= this.field3466) {
                        this.field3460 = null;
                        break;
                    }
                }
                this.field3461 = this.field3466 + 1;
                if (this.field3460.field3529.length <= this.field3461) {
                    this.field3461 -= this.field3460.field3540;
                    if (this.field3461 < 0 || this.field3460.field3529.length <= this.field3461) {
                        this.field3461 = -1;
                    }
                }
            }
            this.field3455 = class343.field5341 - var4;
            this.field3445 = var4;
        }
        if (arg0 != 74) {
            this.field3461 = -31;
        }
        field3480++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIJILcj;)V", line = 329)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class243 arg10) {
        field3482++;
        class94 var13 = this.method1463((byte) -94);
        if (var13 != null) {
            var13.method111(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3479);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjh;IIIIII)V", line = 367)
    public static final void method1458(int arg0, class207 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3449++;
        if (arg6 != 15) {
            method1455(-55);
        }
        int var8 = arg5 * arg5 + arg7 * arg7;
        if (arg0 < var8) {
            return;
        }
        int var9 = Math.min(arg1.field3169 / 2, arg1.field3239 / 2);
        if (var8 <= (var9 * var9)) {
            class173.method1171(arg1, arg4, arg7, -103, class68.field1014[arg2], arg5, arg3);
            return;
        }
        var9 -= 10;
        int var10 = (int) class123.field1922 + class138.field2133 & 0x7FF;
        int var11 = class12.field121[var10];
        int var12 = var11 * 256 / (class14.field148 + 256);
        int var13 = class12.field127[var10];
        int var14 = var13 * 256 / (class14.field148 + 256);
        int var15 = arg5 * var12 + arg7 * var14 >> 16;
        int var16 = arg5 * var14 - arg7 * var12 >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class333.field5166) {
            ((class186) class237.field3798[arg2]).method1277(240, 240, (arg1.field3169 / 2 + arg4 + var19) * 16, (arg1.field3239 / 2 + arg3 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class178) class237.field3798[arg2]).method923(arg4 - (-(arg1.field3169 / 2) - var19) - 10, arg1.field3239 / 2 + arg3 + -var20 + -10, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 419)
    public final void method1459(byte arg0) {
        if (this.field3451 != null) {
            class11.method83(this.field3451, this.field3481, this.field3469, this.field3477);
        }
        field3446++;
        if (arg0 > -55) {
            method1460(93, -120);
        }
        this.field3451 = null;
        this.field3454 = -1;
        this.field3473 = -1;
    }

    @OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V", line = 437)
    protected final void finalize() {
        field3458++;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)V", line = 458)
    public static final void method1460(int arg0, int arg1) {
        field3453++;
        if (arg1 == 256) {
            class118.field1833.method1287(arg0, 4);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V", line = 473)
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class333.field5166) {
            this.method1454(true, 94);
        } else {
            this.method1457((byte) 74, arg4, arg3);
        }
        field3456++;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 495)
    public static void method1461(byte arg0) {
        if (arg0 < 30) {
            field3475 = (int[]) null;
        }
        field3475 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V", line = 511)
    public static final void method1462(byte arg0) {
        boolean var1 = false;
        int var2 = 41 % ((arg0 - 47) / 35);
        while (!var1) {
            var1 = true;
            for (int var3 = 0; var3 < class168.field2565 - 1; var3++) {
                if (class194.field2925[var3] < 1000 && class194.field2925[var3 + 1] > 1000) {
                    String var4 = class76.field1144[var3];
                    var1 = false;
                    class76.field1144[var3] = class76.field1144[var3 + 1];
                    class76.field1144[var3 + 1] = var4;
                    String var5 = class242.field3830[var3];
                    class242.field3830[var3] = class242.field3830[var3 + 1];
                    class242.field3830[var3 + 1] = var5;
                    int var6 = class167.field2560[var3];
                    class167.field2560[var3] = class167.field2560[var3 + 1];
                    class167.field2560[var3 + 1] = var6;
                    int var7 = class76.field1135[var3];
                    class76.field1135[var3] = class76.field1135[var3 + 1];
                    class76.field1135[var3 + 1] = var7;
                    int var8 = class89.field1355[var3];
                    class89.field1355[var3] = class89.field1355[var3 + 1];
                    class89.field1355[var3 + 1] = var8;
                    short var9 = class194.field2925[var3];
                    class194.field2925[var3] = class194.field2925[var3 + 1];
                    class194.field2925[var3 + 1] = var9;
                    long var10 = class271.field4161[var3];
                    class271.field4161[var3] = class271.field4161[var3 + 1];
                    class271.field4161[var3 + 1] = var10;
                }
            }
        }
        field3462++;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()I", line = 566)
    public final int method112() {
        field3468++;
        return this.field3474;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)Lfe;", line = 588)
    public final class94 method1463(byte arg0) {
        field3465++;
        return arg0 == -94 ? this.method1454(false, 108) : (class94) null;
    }
}
