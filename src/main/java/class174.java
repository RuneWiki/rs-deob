import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class174 extends class3 {

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "Z")
    public boolean field2832 = true;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field2819 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Lok;")
    public static class41 field2823 = class137.method956("rot:", 45);

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Lok;")
    public static class41 field2822 = class137.method956("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 45);

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!qm", name = "ab", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qm", name = "bb", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "Lhd;")
    public static class129 field2831;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "[I")
    public int[] field2828;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "[I")
    private int[] field2830;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "[Lok;")
    private class41[] field2829;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "[[I")
    private int[][] field2835;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILlb;)Lok;", line = 12)
    public final class41 method1242(int arg0, class112 arg1) {
        field2818++;
        class41 var3 = class230.method1645(80, (byte) -127);
        if (this.field2830 != null) {
            for (int var4 = 0; var4 < this.field2830.length; var4++) {
                var3.method266(this.field2829[var4], 0);
                var3.method266(class24.method164(this.field2830[var4], this.field2835[var4], arg1.method774(class212.field3411[this.field2830[var4]], false), 0), 0);
            }
        }
        var3.method266(this.field2829[this.field2829.length - 1], arg0);
        return var3.method271((byte) -120);
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 39)
    public final void method1243(int arg0) {
        if (this.field2828 != null) {
            for (int var2 = 0; var2 < this.field2828.length; var2++) {
                this.field2828[var2] = class255.method1813(this.field2828[var2], 32768);
            }
        }
        if (arg0 != 0) {
            field2819 = 46;
        }
        field2834++;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I", line = 63)
    public final int method1244(byte arg0) {
        if (arg0 > -112) {
            return 120;
        } else {
            field2824++;
            return this.field2830 == null ? 0 : this.field2830.length;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lie;B)I", line = 79)
    public static final int method1245(class50 arg0, byte arg1) {
        field2837++;
        class147 var2 = arg0.field758;
        if (arg1 != 38) {
            return -66;
        }
        if (var2.field2284 != null) {
            var2 = var2.method1015(arg1 - 39);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2240;
        if (arg0.field4333 == arg0.field4321) {
            var3 = var2.field2295;
        } else if (arg0.field4333 == arg0.field4310) {
            var3 = var2.field2293;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([J[IB)V", line = 123)
    public static final void method1246(long[] arg0, int[] arg1, byte arg2) {
        class53.method363(0, arg1, arg0.length - 1, arg0, (byte) 127);
        int var3 = -63 % ((4 - arg2) / 40);
        field2833++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Llb;II)V", line = 135)
    private final void method1247(class112 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2829 = arg0.method763(true).method289(-3607, 60);
        } else if (arg2 == 2) {
            int var8 = arg0.method792(2);
            this.field2828 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2828[var9] = arg0.method759((byte) -84);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method792(2);
            this.field2835 = new int[var4][];
            this.field2830 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method759((byte) -124);
                this.field2830[var5] = var6;
                this.field2835[var5] = new int[class131.field1961[var6]];
                for (int var7 = 0; var7 < class131.field1961[var6]; var7++) {
                    this.field2835[var5][var7] = arg0.method759((byte) -72);
                }
            }
        } else if (arg2 == 4) {
            this.field2832 = false;
        }
        int var10 = 110 % ((75 - arg1) / 35);
        field2839++;
    }

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)V", line = 200)
    public static void method1248(int arg0) {
        field2823 = null;
        field2831 = null;
        if (arg0 != 0) {
            method1245((class50) null, (byte) -66);
        }
        field2822 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILlb;[I)V", line = 212)
    public final void method1249(int arg0, class112 arg1, int[] arg2) {
        field2838++;
        if (this.field2830 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 != 80) {
            return;
        }
        while (var4 < this.field2830.length && var4 < arg2.length) {
            int var5 = class235.field3776[this.method1251((byte) -48, var4)];
            if (var5 > 0) {
                arg1.method783((long) arg2[var4], (byte) 123, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)Lok;", line = 245)
    public final class41 method1250(byte arg0) {
        field2836++;
        int var2 = 48 % ((arg0) / 40);
        class41 var3 = class230.method1645(80, (byte) -125);
        if (this.field2829 == null) {
            return class140.field2146;
        }
        var3.method266(this.field2829[0], 0);
        for (int var4 = 1; var4 < this.field2829.length; var4++) {
            var3.method266(class264.field4181, 0);
            var3.method266(this.field2829[var4], 0);
        }
        return var3.method271((byte) -83);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)I", line = 272)
    public final int method1251(byte arg0, int arg1) {
        int var3 = 41 % ((25 - arg0) / 62);
        field2820++;
        return this.field2830 == null || arg1 < 0 || arg1 > this.field2830.length ? -1 : this.field2830[arg1];
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Llb;I)V", line = 286)
    public final void method1252(class112 arg0, int arg1) {
        if (arg1 != 0) {
            field2826 = -102;
        }
        field2825++;
        while (true) {
            int var3 = arg0.method792(arg1 ^ 0x2);
            if (var3 == 0) {
                return;
            }
            this.method1247(arg0, 111, var3);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIB)I", line = 318)
    public final int method1253(int arg0, int arg1, byte arg2) {
        field2827++;
        if (arg2 != -93) {
            this.method1244((byte) -46);
        }
        if (this.field2830 == null || arg1 < 0 || arg1 > this.field2830.length) {
            return -1;
        } else if (this.field2835[arg1] == null || arg0 < 0 || arg0 > this.field2835[arg1].length) {
            return -1;
        } else {
            return this.field2835[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIII)V", line = 344)
    public static final void method1254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2821++;
        if (arg3 == arg5) {
            class97.method697(arg4, arg2, 0, arg5, arg1);
            return;
        }
        if (arg0 != 2) {
            field2819 = -122;
        }
        if ((arg1 - arg5) >= class273.field4449 && (arg1 + arg5) <= class153.field2439 && (arg4 - arg3) >= class15.field192 && arg3 + arg4 <= class237.field3801) {
            class307.method2127(arg4, 0, arg5, arg2, arg1, arg3);
        } else {
            class70.method514(arg1, arg5, 0, arg2, arg4, arg3);
        }
    }
}
