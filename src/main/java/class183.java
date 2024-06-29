import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class183 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field2688 = 5;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field2687 = 2;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public int field2691 = -1;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field2699 = -1;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
    public boolean field2703 = false;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field2704 = -1;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field2706 = -1;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Z")
    public boolean field2690 = false;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public int field2711 = -1;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Z")
    public boolean field2709 = false;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field2701 = 0;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public int field2712 = 99;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Lhl;")
    public static class375 field2696 = new class375(32);

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lci;")
    public static class320 field2702;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Lgj;")
    public class457 field2710;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
    public int[] field2692;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
    private int[] field2695;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "[I")
    public int[] field2713;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[Z")
    public boolean[] field2707;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "[[I")
    public int[][] field2708;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLwn;)V")
    public final void method1267(boolean arg0, class519 arg1) {
        if (arg0) {
            this.method1271(-38, 114, null);
        }
        while (true) {
            int var3 = arg1.method3072((byte) -124);
            if (var3 == 0) {
                field2700++;
                return;
            }
            this.method1271(13, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lka;IIIII)Lka;")
    public final class336 method1268(class336 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2694++;
        int var7 = this.field2713[arg2];
        int var8 = this.field2692[arg2];
        class543 var9 = this.field2710.method2714(var8 >> 16, (byte) 116);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method1154((byte) 1, arg1, true);
        }
        class543 var11 = null;
        if ((this.field2703 || class89.field1441) && arg5 != -1 && this.field2692.length > arg5) {
            int var12 = this.field2692[arg5];
            var11 = this.field2710.method2714(var12 >> 16, (byte) 77);
            arg5 = var12 & 0xFFFF;
        }
        class543 var13 = null;
        class543 var14 = null;
        if (arg3 < 106) {
            this.method1270((byte) -38, (byte) -84, 58, 121, -10, 115, null, -43);
        }
        int var15 = 0;
        int var16 = 0;
        if (this.field2695 != null) {
            if (this.field2695.length > arg2) {
                var15 = this.field2695[arg2];
                if (var15 != 65535) {
                    var13 = this.field2710.method2714(var15 >> 16, (byte) 105);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2703 || class89.field1441) && arg5 != -1 && this.field2695.length > arg5) {
                var16 = this.field2695[arg5];
                if (var16 != 65535) {
                    var14 = this.field2710.method2714(var16 >> 16, (byte) 122);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2690) {
            arg1 |= 0x200;
        }
        if (var9.method3188(var10, -1)) {
            arg1 |= 0x80;
        }
        if (var9.method3184((byte) 116, var10)) {
            arg1 |= 0x100;
        }
        if (var9.method3182(var10, 75)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3188(var15, -1)) {
                arg1 |= 0x80;
            }
            if (var13.method3184((byte) 116, var15)) {
                arg1 |= 0x100;
            }
            if (var13.method3182(var15, 125)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3188(arg5, -1)) {
                arg1 |= 0x80;
            }
            if (var11.method3184((byte) 116, arg5)) {
                arg1 |= 0x100;
            }
            if (var11.method3182(arg5, -116)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3188(var16, -1)) {
                arg1 |= 0x80;
            }
            if (var14.method3184((byte) 116, var16)) {
                arg1 |= 0x100;
            }
            if (var14.method3182(var16, 118)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class336 var18 = arg0.method1154((byte) 1, var17, true);
        var18.method2131(arg5, (byte) -96, 0, var7, arg4 - 1, var9, this.field2690, var11, var10);
        if (var13 != null) {
            var18.method2131(var16, (byte) -121, 0, var7, arg4 - 1, var13, this.field2690, var14, var15);
        }
        return var18;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static void method1269(boolean arg0) {
        field2696 = null;
        if (!arg0) {
            method1269(true);
        }
        field2702 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BBIIIILka;I)Lka;")
    public final class336 method1270(byte arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class336 arg6, int arg7) {
        field2693++;
        int var9 = this.field2713[arg2];
        int var10 = this.field2692[arg2];
        class543 var11 = this.field2710.method2714(var10 >> 16, (byte) 91);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method1154(arg0, arg7, true);
        }
        class543 var13 = null;
        if ((this.field2703 || class89.field1441) && arg5 != -1 && this.field2692.length > arg5) {
            int var14 = this.field2692[arg5];
            var13 = this.field2710.method2714(var14 >> 16, (byte) 105);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field2690) {
            arg7 |= 0x200;
        }
        if (var11.method3188(var12, -1)) {
            arg7 |= 0x80;
        }
        if (var11.method3184((byte) 116, var12)) {
            arg7 |= 0x100;
        }
        if (var11.method3182(var12, 91)) {
            arg7 |= 0x400;
        }
        if (arg1 != 3) {
            field2696 = null;
        }
        if (var13 != null) {
            if (var13.method3188(arg5, -1)) {
                arg7 |= 0x80;
            }
            if (var13.method3184((byte) 116, arg5)) {
                arg7 |= 0x100;
            }
            if (var13.method3182(arg5, 96)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class336 var16 = arg6.method1154(arg0, var15, true);
        var16.method2131(arg5, (byte) -100, arg3, var9, arg4 - 1, var11, this.field2690, var13, var12);
        return var16;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILwn;)V")
    private final void method1271(int arg0, int arg1, class519 arg2) {
        if (arg0 != 13) {
            return;
        }
        if (arg1 == 1) {
            int var13 = arg2.method3018(566990904);
            this.field2713 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2713[var14] = arg2.method3018(566990904);
            }
            this.field2692 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2692[var15] = arg2.method3018(566990904);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2692[var16] += arg2.method3018(arg0 + 566990891) << 16;
            }
        } else if (arg1 == 2) {
            this.field2691 = arg2.method3018(arg0 + 566990891);
        } else if (arg1 == 3) {
            this.field2707 = new boolean[256];
            int var11 = arg2.method3072((byte) -128);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2707[arg2.method3072((byte) -123)] = true;
            }
        } else if (arg1 == 5) {
            this.field2688 = arg2.method3072((byte) -124);
        } else if (arg1 == 6) {
            this.field2711 = arg2.method3018(566990904);
        } else if (arg1 == 7) {
            this.field2699 = arg2.method3018(566990904);
        } else if (arg1 == 8) {
            this.field2712 = arg2.method3072((byte) -128);
        } else if (arg1 == 9) {
            this.field2704 = arg2.method3072((byte) -128);
        } else if (arg1 == 10) {
            this.field2706 = arg2.method3072((byte) -119);
        } else if (arg1 == 11) {
            this.field2687 = arg2.method3072((byte) -120);
        } else if (arg1 == 12) {
            int var8 = arg2.method3072((byte) -124);
            this.field2695 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2695[var9] = arg2.method3018(566990904);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2695[var10] = (arg2.method3018(566990904) << 16) + this.field2695[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method3018(566990904);
            this.field2708 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3072((byte) -125);
                if (var6 > 0) {
                    this.field2708[var5] = new int[var6];
                    this.field2708[var5][0] = arg2.method3040((byte) -3);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field2708[var5][var7] = arg2.method3018(566990904);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field2690 = true;
        } else if (arg1 == 15) {
            this.field2703 = true;
        } else if (arg1 == 16) {
            this.field2709 = true;
        } else if (arg1 == 17) {
            this.field2701 = arg2.method3072((byte) -120);
        }
        field2697++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public final void method1272(byte arg0) {
        if (arg0 != -100) {
            return;
        }
        if (this.field2706 == -1) {
            if (this.field2707 == null) {
                this.field2706 = 0;
            } else {
                this.field2706 = 2;
            }
        }
        field2698++;
        if (this.field2704 != -1) {
            return;
        }
        if (this.field2707 == null) {
            this.field2704 = 0;
        } else {
            this.field2704 = 2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIZ)I")
    public final int method1273(int arg0, int arg1, int arg2, boolean arg3) {
        field2689++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2692[arg0];
        class543 var8 = null;
        class543 var9 = this.field2710.method2714(var7 >> 16, (byte) 103);
        if (arg2 != 128) {
            return -108;
        }
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2703 || class89.field1441) && arg1 != -1 && this.field2692.length > arg1) {
            int var11 = this.field2692[arg1];
            var8 = this.field2710.method2714(var11 >> 16, (byte) 104);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2690) {
            var5 |= 0x200;
        }
        if (var9.method3188(var10, -1)) {
            var5 |= 0x80;
        }
        if (var9.method3184((byte) 116, var10)) {
            var5 |= 0x100;
        }
        if (var9.method3182(var10, 90)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3188(var6, -1)) {
                var5 |= 0x80;
            }
            if (var8.method3184((byte) 116, var6)) {
                var5 |= 0x100;
            }
            if (var8.method3182(var6, 118)) {
                var5 |= 0x400;
            }
        }
        if (this.field2695 != null && arg3) {
            if (this.field2695.length > arg0) {
                int var12 = this.field2695[arg0];
                if (var12 != 65535) {
                    class543 var13 = this.field2710.method2714(var12 >> 16, (byte) 81);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3188(var14, -1)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3184((byte) 116, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3182(var14, 124)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2703 || class89.field1441) && arg1 != -1 && arg1 < this.field2695.length) {
                int var15 = this.field2695[arg1];
                if (var15 != 65535) {
                    class543 var16 = this.field2710.method2714(var15 >> 16, (byte) 71);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3188(var17, -1)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3184((byte) 116, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3182(var17, 57)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }
}
