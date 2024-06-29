import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class747 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public int field10437 = 2;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public int field10441 = -1;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field10432 = -1;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public int field10447 = 5;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Z")
    public boolean field10436 = false;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Z")
    public boolean field10434 = false;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public int field10456 = -1;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
    public boolean field10448 = false;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public int field10460 = 99;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
    public boolean field10459 = false;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field10461 = -1;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field10454 = -1;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field10445 = 0;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
    public static int[] field10446 = new int[1000];

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "[I")
    public static int[] field10450 = new int[14];

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "D")
    public static double field10442;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public int field10444;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field10455;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lnaa;")
    public class93 field10462;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
    private int[] field10433;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
    public int[] field10435;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
    public int[] field10438;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "[I")
    public int[] field10453;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
    public int[] field10457;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "[I")
    public int[] field10458;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[Z")
    public boolean[] field10439;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "[[I")
    public int[][] field10451;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltn;IB)V")
    private final void method4173(class179 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method1107(false);
            this.field10453 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10453[var5] = arg0.method1107(false);
            }
            this.field10458 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field10458[var6] = arg0.method1107(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field10458[var7] = (arg0.method1107(false) << 16) + this.field10458[var7];
            }
        } else if (arg1 == 2) {
            this.field10441 = arg0.method1107(false);
        } else if (arg1 == 3) {
            this.field10439 = new boolean[256];
            int var18 = arg0.method1094(255);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field10439[arg0.method1094(255)] = true;
            }
        } else if (arg1 == 5) {
            this.field10447 = arg0.method1094(255);
        } else if (arg1 == 6) {
            this.field10432 = arg0.method1107(false);
        } else if (arg1 == 7) {
            this.field10461 = arg0.method1107(false);
        } else if (arg1 == 8) {
            this.field10460 = arg0.method1094(255);
        } else if (arg1 == 9) {
            this.field10454 = arg0.method1094(255);
        } else if (arg1 == 10) {
            this.field10456 = arg0.method1094(255);
        } else if (arg1 == 11) {
            this.field10437 = arg0.method1094(255);
        } else if (arg1 == 12) {
            int var8 = arg0.method1094(255);
            this.field10433 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field10433[var9] = arg0.method1107(false);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field10433[var10] = (arg0.method1107(false) << 16) + this.field10433[var10];
            }
        } else if (arg1 == 13) {
            int var14 = arg0.method1107(false);
            this.field10451 = new int[var14][];
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method1094(255);
                if (var16 > 0) {
                    this.field10451[var15] = new int[var16];
                    this.field10451[var15][0] = arg0.method1114(class14.method189(arg2, 29));
                    for (int var17 = 1; var17 < var16; var17++) {
                        this.field10451[var15][var17] = arg0.method1107(false);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field10459 = true;
        } else if (arg1 == 15) {
            this.field10436 = true;
        } else if (arg1 == 16) {
            this.field10448 = true;
        } else if (arg1 == 18) {
            this.field10434 = true;
        } else if (arg1 == 19) {
            if (this.field10438 == null) {
                this.field10438 = new int[this.field10451.length];
                for (int var13 = 0; var13 < this.field10451.length; var13++) {
                    this.field10438[var13] = 255;
                }
            }
            this.field10438[arg0.method1094(255)] = arg0.method1094(255);
        } else if (arg1 == 20) {
            if (this.field10435 == null || this.field10457 == null) {
                this.field10435 = new int[this.field10451.length];
                this.field10457 = new int[this.field10451.length];
                for (int var11 = 0; var11 < this.field10451.length; var11++) {
                    this.field10435[var11] = 256;
                    this.field10457[var11] = 256;
                }
            }
            int var12 = arg0.method1094(255);
            this.field10435[var12] = arg0.method1107(false);
            this.field10457[var12] = arg0.method1107(false);
        }
        field10443++;
        if (arg2 != 75) {
            this.field10456 = 12;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method4174(int arg0) {
        field10450 = null;
        field10446 = null;
        int var1 = 4 % ((57 - arg0) / 44);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILka;IIII)Lka;")
    public final class219 method4175(int arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5) {
        field10452++;
        int var7 = this.field10453[arg0];
        int var8 = this.field10458[arg0];
        class555 var9 = this.field10462.method637((byte) -124, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method1337((byte) 1, arg4, true);
        }
        class555 var11 = null;
        if ((this.field10436 || class322.field4112) && arg3 != -1 && arg3 < this.field10458.length) {
            int var12 = this.field10458[arg3];
            var11 = this.field10462.method637((byte) -124, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class555 var13 = null;
        class555 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field10433 != null) {
            if (arg0 < this.field10433.length) {
                var15 = this.field10433[arg0];
                if (var15 != 65535) {
                    var13 = this.field10462.method637((byte) -127, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field10436 || class322.field4112) && arg3 != -1 && arg3 < this.field10433.length) {
                var16 = this.field10433[arg3];
                if (var16 != 65535) {
                    var14 = this.field10462.method637((byte) -124, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field10459) {
            arg4 |= 0x200;
        }
        if (var9.method3154(var10, (byte) 98)) {
            arg4 |= 0x80;
        }
        if (var9.method3156(-32146, var10)) {
            arg4 |= 0x100;
        }
        if (var9.method3155(var10, (byte) 92)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3154(var15, (byte) 72)) {
                arg4 |= 0x80;
            }
            if (var13.method3156(-32146, var15)) {
                arg4 |= 0x100;
            }
            if (var13.method3155(var15, (byte) 66)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3154(arg3, (byte) -47)) {
                arg4 |= 0x80;
            }
            if (var11.method3156(-32146, arg3)) {
                arg4 |= 0x100;
            }
            if (var11.method3155(arg3, (byte) 89)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3154(var16, (byte) -89)) {
                arg4 |= 0x80;
            }
            if (var14.method3156(-32146, var16)) {
                arg4 |= 0x100;
            }
            if (var14.method3155(var16, (byte) -103)) {
                arg4 |= 0x400;
            }
        }
        if (arg5 < 92) {
            return null;
        }
        int var17 = arg4 | 0x20;
        class219 var18 = arg1.method1337((byte) 1, var17, true);
        var18.method1360(0, (byte) 65, var7, var11, this.field10459, var10, arg3, var9, arg2 - 1);
        if (var13 != null) {
            var18.method1360(0, (byte) -94, var7, var14, this.field10459, var15, var16, var13, arg2 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIILka;IIB)Lka;")
    public final class219 method4176(int arg0, int arg1, int arg2, int arg3, class219 arg4, int arg5, int arg6, byte arg7) {
        field10449++;
        int var9 = this.field10453[arg5];
        int var10 = this.field10458[arg5];
        class555 var11 = this.field10462.method637((byte) -127, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method1337(arg7, arg2, true);
        }
        if (arg3 != 2336) {
            method4174(-7);
        }
        class555 var13 = null;
        if ((this.field10436 || class322.field4112) && arg0 != -1 && this.field10458.length > arg0) {
            int var14 = this.field10458[arg0];
            var13 = this.field10462.method637((byte) -127, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field10459) {
            arg2 |= 0x200;
        }
        if (var11.method3154(var12, (byte) -46)) {
            arg2 |= 0x80;
        }
        if (var11.method3156(-32146, var12)) {
            arg2 |= 0x100;
        }
        if (var11.method3155(var12, (byte) 87)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3154(arg0, (byte) 94)) {
                arg2 |= 0x80;
            }
            if (var13.method3156(-32146, arg0)) {
                arg2 |= 0x100;
            }
            if (var13.method3155(arg0, (byte) 86)) {
                arg2 |= 0x400;
            }
        }
        int var15 = arg2 | 0x20;
        class219 var16 = arg4.method1337(arg7, var15, true);
        var16.method1360(arg1, (byte) -99, var9, var13, this.field10459, var12, arg0, var11, arg6 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ltn;B)V")
    public final void method4177(class179 arg0, byte arg1) {
        int var3 = -90 % ((40 - arg1) / 48);
        field10431++;
        while (true) {
            int var4 = arg0.method1094(255);
            if (var4 == 0) {
                return;
            }
            this.method4173(arg0, var4, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIZ)I")
    public final int method4178(int arg0, int arg1, int arg2, boolean arg3) {
        field10455++;
        int var5 = 0;
        if (arg2 != -31599) {
            this.method4177(null, (byte) -10);
        }
        int var6 = 0;
        int var7 = this.field10458[arg0];
        class555 var8 = null;
        class555 var9 = this.field10462.method637((byte) -124, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field10436 || class322.field4112) && arg1 != -1 && arg1 < this.field10458.length) {
            int var11 = this.field10458[arg1];
            var8 = this.field10462.method637((byte) -128, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field10459) {
            var5 |= 0x200;
        }
        if (var9.method3154(var10, (byte) -36)) {
            var5 |= 0x80;
        }
        if (var9.method3156(-32146, var10)) {
            var5 |= 0x100;
        }
        if (var9.method3155(var10, (byte) 58)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3154(var6, (byte) 88)) {
                var5 |= 0x80;
            }
            if (var8.method3156(-32146, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3155(var6, (byte) 114)) {
                var5 |= 0x400;
            }
        }
        if (this.field10433 != null && arg3) {
            if (this.field10433.length > arg0) {
                int var12 = this.field10433[arg0];
                if (var12 != 65535) {
                    class555 var13 = this.field10462.method637((byte) -126, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3154(var14, (byte) -22)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3156(-32146, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3155(var14, (byte) 94)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field10436 || class322.field4112) && arg1 != -1 && arg1 < this.field10433.length) {
                int var15 = this.field10433[arg1];
                if (var15 != 65535) {
                    class555 var16 = this.field10462.method637((byte) -127, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3154(var17, (byte) 113)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3156(-32146, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3155(var17, (byte) 76)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public final void method4179(boolean arg0) {
        if (this.field10454 == -1) {
            if (this.field10439 == null) {
                this.field10454 = 0;
            } else {
                this.field10454 = 2;
            }
        }
        field10463++;
        if (this.field10456 == -1) {
            if (this.field10439 == null) {
                this.field10456 = 0;
            } else {
                this.field10456 = 2;
            }
        }
        if (arg0) {
            this.field10461 = 28;
        }
    }
}
