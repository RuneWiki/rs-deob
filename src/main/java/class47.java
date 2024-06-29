import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class47 extends class180 {

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lna;")
    private class209 field840 = null;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    private int field833 = -1;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    private int field845 = -32768;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    private int field846 = -1;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    private int field849;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    private int field836;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "Lqe;")
    private class51 field841;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field844 = 0;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field852 = 0;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Ln;")
    public static class138 field835;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lfh;")
    private final class180 method261(int arg0) {
        field834++;
        if (arg0 != 20334) {
            this.method88();
        }
        return this.method266(false, (byte) 108);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lub;I)Lub;")
    public static final class227 method262(class227 arg0, int arg1) {
        field853++;
        if (arg1 == -23277) {
            class194 var2 = class96.method589(arg0, 120);
            return var2 == null ? class243.field4208 : var2.field3302;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()I")
    public final int method88() {
        field842++;
        return this.field845;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method263(byte arg0) {
        if (arg0 >= 47) {
            field835 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field830++;
        class180 var11 = this.method261(20334);
        if (var11 != null) {
            var11.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field845 = var11.method88();
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZIII)V")
    public final void method264(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            this.field832 = 127;
        }
        field850++;
        this.method265((byte) -98, ((arg3 - arg2 >> 1) + arg2) * 128 + 64, ((-arg0 + arg4 >> 1) + arg0) * 128 + 64);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)V")
    private final void method265(byte arg0, int arg1, int arg2) {
        int var4 = 11 % ((-arg0 - 48) / 45);
        field847++;
        if (this.field841 == null) {
            return;
        }
        int var5 = class253.field4393 - this.field829;
        if (var5 > 100 && this.field841.field905 > 0) {
            int var6 = this.field841.field910.length - this.field841.field905;
            while (this.field839 < var6 && var5 > this.field841.field899[this.field839]) {
                var5 -= this.field841.field899[this.field839];
                this.field839++;
            }
            if (this.field839 >= var6) {
                int var7 = 0;
                for (int var8 = var6; var8 < this.field841.field910.length; var8++) {
                    var7 += this.field841.field899[var8];
                }
                var5 %= var7;
            }
        }
        while (var5 > this.field841.field899[this.field839]) {
            class67.method421(128, this.field841, arg2, arg1, this.field839, false);
            var5 -= this.field841.field899[this.field839];
            this.field839++;
            if (this.field841.field910.length <= this.field839) {
                this.field839 -= this.field841.field905;
                if (this.field839 < 0 || this.field841.field910.length <= this.field839) {
                    this.field841 = null;
                    break;
                }
            }
        }
        this.field829 = class253.field4393 - var5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)Lfh;")
    private final class180 method266(boolean arg0, byte arg1) {
        field831++;
        boolean var3 = class98.field1717 != class235.field4080;
        class45 var4 = class220.method1389(this.field836, (byte) 69);
        if (var4.field754 != null) {
            var4 = var4.method242(64);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field843 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field810;
            var6 = var4.field790;
        } else {
            var6 = var4.field810;
            var7 = var4.field790;
        }
        int var8 = 42 % ((63 - arg1) / 34);
        int var9 = this.field837 + (var6 >> 1);
        int var10 = (var6 + 1 >> 1) + this.field837;
        int var11 = (var7 >> 1) + this.field832;
        int var12 = this.field832 + (var7 + 1 >> 1);
        this.method265((byte) 96, var9 * 128, var11 * 128);
        boolean var13 = !var3 && var4.field748 && (this.field833 != var4.field743 || this.field846 != this.field839 && class221.field3753 >= 2);
        if (arg0 && !var13) {
            return null;
        }
        int[][] var14 = class98.field1717[this.field849];
        int var15 = var14[var9][var11] + var14[var10][var11] + var14[var9][var12] + var14[var10][var12] >> 2;
        int var16 = (this.field837 << 7) + (var6 << 6);
        int var17 = (this.field832 << 7) + (var7 << 6);
        int[][] var18 = null;
        boolean var19 = this.field840 == null;
        if (var3) {
            var18 = class235.field4080[0];
        } else if (this.field849 < 3) {
            var18 = class98.field1717[this.field849 + 1];
        }
        class85 var20;
        if (this.field841 == null) {
            var20 = var4.method254(var16, -90, this.field843, var13, var18, var19 ? class243.field4220 : this.field840, var14, var15, this.field851, var17, false);
        } else {
            var20 = var4.method246(this.field841, this.field843, var15, var13, var17, var14, var16, var18, this.field851, this.field839, var19 ? class243.field4220 : this.field840, 121);
        }
        return var20 == null ? null : var20.field1474;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIZLfh;)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class180 arg8) {
        this.field849 = arg3;
        this.field832 = arg5;
        this.field836 = arg0;
        this.field851 = arg1;
        this.field843 = arg2;
        this.field837 = arg4;
        if (arg6 != -1) {
            this.field841 = class25.method127(true, arg6);
            this.field839 = 0;
            this.field829 = class253.field4393 - 1;
            if (this.field841.field896 == 0 && arg8 != null && arg8 instanceof class47) {
                class47 var10 = (class47) arg8;
                if (this.field841 == var10.field841) {
                    this.field829 = var10.field829;
                    this.field839 = var10.field839;
                    return;
                }
            }
            if (arg7 && this.field841.field905 != -1) {
                this.field839 = (int) ((double) this.field841.field910.length * Math.random());
                this.field829 -= (int) (Math.random() * (double) this.field841.field899[this.field839]);
                return;
            }
        }
    }
}
