import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class30 extends class310 {

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "Z")
    private boolean field358 = true;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    private int field363 = -1;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "Lom;")
    private class70 field364 = null;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    private int field355 = -1;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    private int field369 = -32768;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    private int field388 = 0;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    private int field365 = 0;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lng;")
    private class162 field362;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "Lrf;")
    public static class276 field354 = new class276(0, -1);

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "Lhj;")
    public static class29 field385 = new class29(16);

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "I")
    public static int field386 = 50;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "Ljava/lang/String;")
    public static String field387 = "flash3:";

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    public static int field389 = 1;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "Lt;")
    private class254 field372;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "[[[I")
    public static int[][][] field383;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V", line = 14)
    public static final void method209(byte arg0, int arg1) {
        field378++;
        class69.field1014.method1429((byte) 127, arg1);
        if (arg0 != 122) {
            field383 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 25)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        field356++;
        class310 var13 = this.method213(16);
        if (var13 != null) {
            var13.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field372);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIII)V", line = 43)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class36.field534) {
            this.method214((byte) -48, true);
        } else {
            this.method210(arg4, (byte) 126, arg3);
        }
        field360++;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIIIIZLgd;)V", line = 463)
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class310 arg8) {
        this.field367 = arg3;
        this.field353 = arg0;
        this.field366 = arg2;
        this.field375 = arg4;
        this.field370 = arg1;
        this.field382 = arg5;
        if (class36.field534 && arg8 != null) {
            if ((arg8 instanceof class30)) {
                ((class30) arg8).method212((byte) 80);
            } else {
                class101 var10 = class281.method1984(this.field353, false);
                if (var10.field1542 != null) {
                    var10 = var10.method784(true);
                }
                if (var10 != null) {
                    class97.method769(var10, this.field366, (byte) 96, this.field367, this.field370, 0, 0, this.field375, this.field382);
                }
            }
        }
        if (arg6 != -1) {
            this.field362 = class173.method1259((byte) 119, arg6);
            this.field376 = 0;
            if (this.field362.field2401.length <= 1) {
                this.field384 = 0;
            } else {
                this.field384 = 1;
            }
            this.field377 = 1;
            this.field381 = class312.field4852 - 1;
            if (this.field362.field2402 == 0 && arg8 != null && arg8 instanceof class30) {
                class30 var11 = (class30) arg8;
                if (this.field362 == var11.field362) {
                    this.field377 = var11.field377;
                    this.field381 = var11.field381;
                    this.field384 = var11.field384;
                    this.field376 = var11.field376;
                    return;
                }
            }
            if (arg7 && this.field362.field2407 != -1) {
                this.field376 = (int) ((double) this.field362.field2401.length * Math.random());
                this.field384 = this.field376 + 1;
                if (this.field384 >= this.field362.field2401.length) {
                    this.field384 -= this.field362.field2407;
                    if (this.field384 < 0 || this.field362.field2401.length <= this.field384) {
                        this.field384 = -1;
                    }
                }
                this.field377 = (int) (Math.random() * (double) this.field362.field2423[this.field376]) + 1;
                this.field381 = class312.field4852 - this.field377;
            }
        }
        if (class36.field534 && arg8 != null) {
            this.method214((byte) -51, true);
        }
        if (arg8 == null) {
            class101 var12 = class281.method1984(this.field353, false);
            if (var12.field1542 != null) {
                this.field368 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IBI)V", line = 67)
    private final void method210(int arg0, byte arg1, int arg2) {
        if (arg1 < 101) {
            this.method16(124, -21, 86, -60, 126);
        }
        if (this.field362 != null) {
            int var4 = class312.field4852 - this.field381;
            if (var4 > 100 && this.field362.field2407 > 0) {
                int var5 = this.field362.field2401.length - this.field362.field2407;
                while (var5 > this.field376 && var4 > this.field362.field2423[this.field376]) {
                    var4 -= this.field362.field2423[this.field376];
                    this.field376++;
                }
                if (this.field376 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field362.field2401.length; var7++) {
                        var6 += this.field362.field2423[var7];
                    }
                    var4 %= var6;
                }
                this.field384 = this.field376 + 1;
                if (this.field384 >= this.field362.field2401.length) {
                    this.field384 -= this.field362.field2407;
                    if (this.field384 < 0 || this.field362.field2401.length <= this.field384) {
                        this.field384 = -1;
                    }
                }
            }
            while (this.field362.field2423[this.field376] < var4) {
                class158.method1143(arg0, 96, arg2, this.field362, false, this.field376);
                var4 -= this.field362.field2423[this.field376];
                this.field376++;
                if (this.field362.field2401.length <= this.field376) {
                    this.field376 -= this.field362.field2407;
                    if (this.field376 < 0 || this.field362.field2401.length <= this.field376) {
                        this.field362 = null;
                        break;
                    }
                }
                this.field384 = this.field376 + 1;
                if (this.field362.field2401.length <= this.field384) {
                    this.field384 -= this.field362.field2407;
                    if (this.field384 < 0 || this.field362.field2401.length <= this.field384) {
                        this.field384 = -1;
                    }
                }
            }
            this.field381 = class312.field4852 - var4;
            this.field377 = var4;
        }
        field361++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()I", line = 152)
    public final int method19() {
        field379++;
        return this.field369;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 168)
    public static final void method211(int arg0) {
        for (int var1 = 0; var1 < class122.field1922; var1++) {
            int var2 = class227.field3515[var1];
            class121 var3 = class319.field4964[var2];
            int var4 = class88.field1293.method273(arg0 + 65279);
            if ((var4 & 0x4) != 0) {
                var4 += class88.field1293.method273(arg0 ^ 0xFF01) << 8;
            }
            class132.method1005(var2, var4, 0, var3);
        }
        if (arg0 != 1) {
            field383 = (int[][][]) ((int[][][]) null);
        }
        field373++;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 204)
    public final void method212(byte arg0) {
        field374++;
        if (this.field364 != null) {
            class247.method1719(this.field364, this.field365, this.field371, this.field388);
        }
        this.field364 = null;
        this.field363 = -1;
        this.field355 = -1;
        if (arg0 <= 0) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)Lgd;", line = 235)
    public final class310 method213(int arg0) {
        field380++;
        if (arg0 != 16) {
            field387 = (String) null;
        }
        return this.method214((byte) 83, false);
    }

    @OriginalMember(owner = "client!nl", name = "finalize", descriptor = "()V", line = 246)
    protected final void finalize() {
        field359++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BZ)Lgd;", line = 259)
    private final class310 method214(byte arg0, boolean arg1) {
        field357++;
        boolean var3 = class41.field612 != class258.field3844;
        class101 var4 = class281.method1984(this.field353, false);
        int var5 = var4.field1565;
        if (var4.field1542 != null) {
            var4 = var4.method784(true);
        }
        if (var4 == null) {
            if (class36.field534 && !var3) {
                this.method212((byte) 125);
            }
            return null;
        }
        if (class3.field12 != 0 && this.field368 && (this.field362 == null || this.field362 != null && this.field362.field2412 != var4.field1565)) {
            int var6 = var4.field1565;
            if (var4.field1565 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field362 = null;
            } else {
                this.field362 = class173.method1259((byte) 119, var6);
            }
            if (this.field362 != null) {
                if (var4.field1513 && this.field362.field2407 != -1) {
                    this.field376 = (int) (Math.random() * (double) this.field362.field2401.length);
                    this.field381 -= (int) (Math.random() * (double) this.field362.field2423[this.field376]);
                } else {
                    this.field381 = class312.field4852 - 1;
                    this.field376 = 0;
                }
            }
        }
        int var7 = this.field366 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field1524;
            var9 = var4.field1533;
        } else {
            var8 = var4.field1533;
            var9 = var4.field1524;
        }
        int var10 = (var8 >> 1) + this.field375;
        int var11 = this.field375 + (var8 + 1 >> 1);
        int var12 = (var9 >> 1) + this.field382;
        int var13 = (var9 + 1 >> 1) + this.field382;
        this.method210(var12 * 128, (byte) 126, var10 * 128);
        boolean var14 = !var3 && var4.field1572 && (this.field363 != var4.field1570 || (this.field376 != this.field355 || this.field362 != null && (this.field362.field2418 || class16.field188) && this.field384 != this.field376) && class143.field2212 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class41.field612[this.field367];
        int var16 = -49 % ((-arg0 - 7) / 35);
        int var17 = var15[var10][var12] + var15[var11][var12] + var15[var11][var13] + var15[var10][var13] >> 2;
        int var18 = (this.field375 << 7) + (var8 << 6);
        int var19 = (this.field382 << 7) + (var9 << 6);
        int[][] var20 = (int[][]) null;
        if (var3) {
            var20 = class258.field3844[0];
        } else if (this.field367 < 3) {
            var20 = class41.field612[this.field367 + 1];
        }
        if (class36.field534 && var14) {
            class247.method1719(this.field364, this.field365, this.field371, this.field388);
        }
        boolean var21 = this.field364 == null;
        class136 var22;
        if (this.field362 == null) {
            var22 = var4.method792(var15, var14, var17, var21 ? class208.field3270 : this.field364, var19, var20, var18, false, this.field366, false, this.field370);
        } else {
            var22 = var4.method795(this.field377, var14, this.field366, var18, this.field376, var15, var17, var19, var20, this.field370, var21 ? class208.field3270 : this.field364, this.field384, false, this.field362);
        }
        if (var22 == null) {
            return null;
        }
        if (class36.field534 && var14) {
            if (var21) {
                class208.field3270 = var22.field2118;
            }
            int var23 = 0;
            if (this.field367 != 0) {
                int[][] var24 = class41.field612[0];
                var23 = var17 - (var24[var10][var12] + var24[var11][var12] + var24[var10][var13] + var24[var11][var13] >> 2);
            }
            class70 var25 = var22.field2118;
            if (this.field358 && class247.method1720(var25, var18, var23, var19)) {
                this.field358 = false;
            }
            if (!this.field358) {
                class247.method1712(var25, var18, var23, var19);
                this.field371 = var23;
                this.field364 = var25;
                this.field365 = var18;
                if (var21) {
                    class208.field3270 = null;
                }
                this.field388 = var19;
            }
            this.field355 = this.field376;
            this.field363 = var4.field1570;
        }
        return var22.field2121;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 426)
    public static void method215(int arg0) {
        field383 = (int[][][]) null;
        field354 = null;
        field385 = null;
        field387 = null;
        if (arg0 != -2118089310) {
            field389 = -87;
        }
    }
}
