import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class264 {

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[B")
    private byte[] field3908 = new byte[64];

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[J")
    private long[] field3913 = new long[8];

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    private int field3909 = 0;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    private int field3914 = 0;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[J")
    private long[] field3910 = new long[8];

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[J")
    private long[] field3917 = new long[8];

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[J")
    private long[] field3916 = new long[8];

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[J")
    private long[] field3919 = new long[8];

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[B")
    private byte[] field3915 = new byte[32];

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lnj;")
    public static class487 field3921 = new class487("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Lnj;")
    public static class487 field3923 = new class487("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "[[[I")
    public static int[][][] field3926 = new int[2][][];

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Llh;")
    public static class125 field3901;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lbca;")
    public static class286 field3905;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lar;")
    public static class4 field3924;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[Lqv;")
    public static class96[] field3912;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[S")
    public static short[] field3922;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 8)
    private final void method1687(byte arg0) {
        field3920++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field3917[var2] = class410.method2438(class155.method901((long) this.field3908[var3 + 7], 255L), class410.method2438(class155.method901((long) this.field3908[var3 + 6] << 8, 0xFFL << 8), class410.method2438(class410.method2438(class155.method901(0xFFL << 24, (long) this.field3908[var3 + 4] << 24), class410.method2438(class410.method2438(class155.method901(255L, (long) this.field3908[var3 + 2]) << 40, class410.method2438((long) this.field3908[var3] << 56, class155.method901(0xFFL << 48, (long) this.field3908[var3 + 1] << 48))), class155.method901(255L, (long) this.field3908[var3 + 3]) << 32)), class155.method901(0xFFL << 16, (long) this.field3908[var3 + 5] << 16))));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field3910[var4] = class410.method2438(this.field3917[var4], this.field3919[var4] = this.field3916[var4]);
        }
        if (arg0 != 82) {
            method1694(false);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field3913[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field3913[var7] = class410.method2438(this.field3913[var7], class340.field4984[var13][class637.method3693((int) (this.field3919[class637.method3693(var7 - var13, 7)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field3919[var8] = this.field3913[var8];
            }
            this.field3919[0] = class410.method2438(this.field3919[0], class340.field4981[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field3913[var9] = this.field3919[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field3913[var9] = class410.method2438(this.field3913[var9], class340.field4984[var11][class637.method3693((int) (this.field3910[class637.method3693(var9 - var11, 7)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field3910[var10] = this.field3913[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field3916[var6] = class410.method2438(this.field3916[var6], class410.method2438(this.field3910[var6], this.field3917[var6]));
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(J[BB)V", line = 117)
    public final void method1688(long arg0, byte[] arg1, byte arg2) {
        field3906++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field3914 & 0x7;
        if (arg2 != -12) {
            this.method1691((byte) 50, null, 21);
        }
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field3915[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field3915[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field3908[this.field3909] = (byte) class313.method1926(this.field3908[this.field3909], var15 >>> var7);
            this.field3914 += 8 - var7;
            this.field3909++;
            if (this.field3914 == 512) {
                this.method1687((byte) 82);
                this.field3914 = this.field3909 = 0;
            }
            this.field3908[this.field3909] = (byte) class637.method3693(var15 << 8 - var7, 255);
            arg0 -= 8L;
            this.field3914 += var7;
            var5++;
        }
        int var12;
        if (arg0 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field3908[this.field3909] = (byte) class313.method1926(this.field3908[this.field3909], var12 >>> var7);
        }
        if (((long) var7 + arg0) < 8L) {
            this.field3914 = (int) ((long) this.field3914 + arg0);
            return;
        }
        this.field3909++;
        long var13 = arg0 - (long) (8 - var7);
        this.field3914 += 8 - var7;
        if (this.field3914 == 512) {
            this.method1687((byte) 82);
            this.field3914 = this.field3909 = 0;
        }
        this.field3908[this.field3909] = (byte) class637.method3693(255, var12 << 8 - var7);
        this.field3914 += (int) var13;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZI)I", line = 209)
    public static final int method1689(int arg0, boolean arg1, int arg2) {
        field3918++;
        if (arg2 != -13242) {
            field3922 = null;
        }
        if (arg1) {
            return 0;
        }
        class580 var3 = class585.method3419(-14473, arg1, arg0);
        if (var3 == null) {
            return class151.field1933.method1864((byte) -80, arg0).field5062;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field8538.length; var5++) {
            if (var3.field8538[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class151.field1933.method1864((byte) 115, arg0).field5062 - var3.field8538.length);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 254)
    public final void method1690(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field3915[var2] = 0;
        }
        field3902++;
        this.field3914 = this.field3909 = 0;
        this.field3908[0] = arg0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field3916[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[BI)V", line = 283)
    public final void method1691(byte arg0, byte[] arg1, int arg2) {
        this.field3908[this.field3909] = (byte) class313.method1926(this.field3908[this.field3909], 0x80 >>> class637.method3693(7, this.field3914));
        field3904++;
        this.field3909++;
        if (this.field3909 > 32) {
            while (true) {
                if (this.field3909 >= 64) {
                    this.method1687((byte) 82);
                    this.field3909 = 0;
                    break;
                }
                this.field3908[this.field3909++] = 0;
            }
        }
        while (this.field3909 < 32) {
            this.field3908[this.field3909++] = 0;
        }
        class473.method2883(this.field3915, 0, this.field3908, 32, 32);
        this.method1687((byte) 82);
        if (arg0 != -57) {
            return;
        }
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field3916[var4];
            arg1[var5] = (byte) ((int) (var6 >>> 56));
            arg1[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg1[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg1[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg1[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg1[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg1[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg1[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)V", line = 333)
    public static final void method1692(byte arg0, int arg1) {
        field3911++;
        class574.field8471 = 1000000000L / (long) arg1;
        if (arg0 > -2) {
            field3928 = -13;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Z", line = 349)
    public static final boolean method1693(int arg0, int arg1, int arg2) {
        field3907++;
        return arg1 >= -100;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 373)
    public static void method1694(boolean arg0) {
        field3926 = null;
        field3923 = null;
        field3922 = null;
        field3921 = null;
        field3905 = null;
        field3901 = null;
        field3912 = null;
        if (arg0) {
            field3923 = null;
        }
        field3924 = null;
    }
}
