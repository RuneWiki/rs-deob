import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class319 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "[J")
    private long[] field4544 = new long[8];

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "[J")
    private long[] field4543 = new long[8];

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    private int field4549 = 0;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "[B")
    private byte[] field4551 = new byte[32];

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "[J")
    private long[] field4553 = new long[8];

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "[B")
    private byte[] field4555 = new byte[64];

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "[J")
    private long[] field4548 = new long[8];

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    private int field4552 = 0;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "[J")
    private long[] field4556 = new long[8];

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "[Z")
    public static boolean[] field4545 = new boolean[100];

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([BJI)V")
    public final void method1931(byte[] arg0, long arg1, int arg2) {
        field4547++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field4552 & 0x7;
        if (arg2 > -123) {
            method1933(true);
        }
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field4551[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field4551[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4555[this.field4549] = (byte) class446.method2556(this.field4555[this.field4549], var15 >>> var7);
            this.field4549++;
            this.field4552 += 8 - var7;
            if (this.field4552 == 512) {
                this.method1934((byte) -79);
                this.field4552 = this.field4549 = 0;
            }
            this.field4555[this.field4549] = (byte) class48.method346(var15 << 8 - var7, 255);
            this.field4552 += var7;
            arg1 -= 8L;
            var5++;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field4555[this.field4549] = (byte) class446.method2556(this.field4555[this.field4549], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg1) < 8L) {
            this.field4552 = (int) ((long) this.field4552 + arg1);
            return;
        }
        this.field4552 += 8 - var7;
        this.field4549++;
        long var13 = arg1 - (long) (8 - var7);
        if (this.field4552 == 512) {
            this.method1934((byte) -116);
            this.field4552 = this.field4549 = 0;
        }
        this.field4555[this.field4549] = (byte) class48.method346(var12 << 8 - var7, 255);
        this.field4552 += (int) var13;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "([BII)V")
    public final void method1932(byte[] arg0, int arg1, int arg2) {
        field4546++;
        this.field4555[this.field4549] = (byte) class446.method2556(this.field4555[this.field4549], 0x80 >>> class48.method346(7, this.field4552));
        this.field4549++;
        if (this.field4549 > 32) {
            while (true) {
                if (this.field4549 >= 64) {
                    this.method1934((byte) -113);
                    this.field4549 = 0;
                    break;
                }
                this.field4555[this.field4549++] = 0;
            }
        }
        while (this.field4549 < 32) {
            this.field4555[this.field4549++] = 0;
        }
        class335.method2020(this.field4551, 0, this.field4555, arg2, 32);
        this.method1934((byte) -91);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field4553[var4];
            arg0[var5] = (byte) ((int) (var6 >>> 56));
            arg0[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg0[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg0[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg0[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg0[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg0[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg0[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
    public static void method1933(boolean arg0) {
        field4545 = null;
        if (!arg0) {
            field4545 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    private final void method1934(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        if (arg0 > -49) {
            method1933(false);
        }
        while (var2 < 8) {
            this.field4548[var2] = class484.method2734(class484.method2734(class438.method2514((long) this.field4555[var3 + 6], 255L) << 8, class484.method2734(class438.method2514((long) this.field4555[var3 + 5], 255L) << 16, class484.method2734(class484.method2734(class484.method2734(class438.method2514(255L, (long) this.field4555[var3 + 2]) << 40, class484.method2734((long) this.field4555[var3] << 56, class438.method2514((long) this.field4555[var3 + 1], 255L) << 48)), class438.method2514(0xFFL << 32, (long) this.field4555[var3 + 3] << 32)), class438.method2514((long) this.field4555[var3 + 4], 255L) << 24))), class438.method2514(255L, (long) this.field4555[var3 + 7]));
            var2++;
            var3 += 8;
        }
        field4550++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4543[var4] = class484.method2734(this.field4548[var4], this.field4544[var4] = this.field4553[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4556[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4556[var7] = class484.method2734(this.field4556[var7], class328.field4680[var13][class48.method346((int) (this.field4544[class48.method346(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4544[var8] = this.field4556[var8];
            }
            this.field4544[0] = class484.method2734(this.field4544[0], class328.field4689[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4556[var9] = this.field4544[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4556[var9] = class484.method2734(this.field4556[var9], class328.field4680[var11][class48.method346(255, (int) (this.field4543[class48.method346(7, var9 - var11)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4543[var10] = this.field4556[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field4553[var6] = class484.method2734(this.field4553[var6], class484.method2734(this.field4543[var6], this.field4548[var6]));
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(III)Z")
    public static final boolean method1935(int arg0, int arg1, int arg2) {
        field4554++;
        if (arg1 != -1) {
            method1935(29, 31, -14);
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public final void method1936(int arg0) {
        field4557++;
        int var2 = 0;
        if (arg0 >= -18) {
            return;
        }
        while (var2 < 32) {
            this.field4551[var2] = 0;
            var2++;
        }
        this.field4555[0] = 0;
        this.field4552 = this.field4549 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field4553[var3] = 0L;
        }
    }
}
