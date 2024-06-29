import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class182 {

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[[I")
    private int[][] field3308;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field3321;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lhj;")
    private static class69 field3305 = class181.method1318("slide:", (byte) -120);

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lhj;")
    public static class69 field3317 = class181.method1318("Lade Sprites )2 ", (byte) -115);

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field3313 = 0;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lhj;")
    public static class69 field3303 = field3305;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lhj;")
    public static class69 field3307 = field3305;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[B")
    public static byte[] field3309 = new byte[520];

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lhj;")
    private static class69 field3319 = class181.method1318("level)2", (byte) -110);

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lhj;")
    public static class69 field3316 = field3319;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
    public static int[] field3304;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILnc;)V")
    public static final void method1324(int arg0, class83 arg1) {
        class141.field2640 = arg1.method589((byte) -107, class88.field1683);
        field3315++;
        class23.field324 = arg1.method589((byte) -123, class4.field35);
        class151.field2792 = arg1.method589((byte) -123, class104.field1963);
        if (arg0 == 23018) {
            class210.field3817 = arg1.method589((byte) -116, class126.field2313);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1325(int arg0) {
        if (arg0 != 127) {
            field3309 = null;
        }
        field3316 = null;
        field3304 = null;
        field3317 = null;
        field3309 = null;
        field3305 = null;
        field3319 = null;
        field3303 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)I")
    public final int method1326(byte arg0, int arg1) {
        int var3 = 12 % ((arg0 - 65) / 49);
        if (this.field3308 != null) {
            arg1 = (int) ((long) this.field3321 * (long) arg1 / (long) this.field3312);
        }
        field3323++;
        return arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)V")
    public static final void method1327(int arg0, int arg1, byte arg2) {
        if (arg2 != 89) {
            method1327(25, -3, (byte) 34);
        }
        field3310++;
        if (class253.field4565 != arg0) {
            class24.field347 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class24.field347[var3] = (var3 << 12) / arg0;
            }
            class12.field183 = arg0 - 1;
            class253.field4565 = arg0;
            class19.field244 = arg0 == 64 ? 2048 : 4096;
        }
        if (class146.field2691 == arg1) {
            return;
        }
        if (class253.field4565 == arg1) {
            class13.field187 = class24.field347;
        } else {
            class13.field187 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class13.field187[var4] = (var4 << 12) / arg1;
            }
        }
        class146.field2691 = arg1;
        class138.field2583 = arg1 - 1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
    public static final int method1328(int arg0, int arg1) {
        field3306++;
        int var2 = -109 % ((arg0 - 56) / 37);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
    public final int method1329(int arg0, byte arg1) {
        field3311++;
        int var3 = -73 / ((-arg1 - 45) / 32);
        if (this.field3308 != null) {
            arg0 = ((int) ((long) this.field3321 * (long) arg0 / (long) this.field3312)) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V")
    public class182(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class204.method1476(arg0, false, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3312 = var5;
            this.field3308 = new int[var5][14];
            this.field3321 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3308[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BZ)[B")
    public final byte[] method1330(byte[] arg0, boolean arg1) {
        if (this.field3308 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field3321 / (long) this.field3312) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field3308[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3321 + var6;
                int var14 = var13 / this.field3312;
                var6 = var13 - this.field3312 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field3320++;
        return arg1 ? null : arg0;
    }
}
