import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class657 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[J")
    private long[] field9438 = new long[8];

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[J")
    private long[] field9439 = new long[8];

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[J")
    private long[] field9437 = new long[8];

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[B")
    private byte[] field9444 = new byte[32];

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[J")
    private long[] field9442 = new long[8];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[J")
    private long[] field9436 = new long[8];

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[B")
    private byte[] field9446 = new byte[64];

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    private int field9445 = 0;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    private int field9448 = 0;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lqh;ZLjava/lang/String;)I")
    public static final int method3737(class61 arg0, boolean arg1, String arg2) {
        if (!arg1) {
            method3737(null, true, null);
        }
        field9449++;
        int var3 = arg0.field1393;
        byte[] var4 = class391.method2416(arg2, (byte) 124);
        arg0.method748((byte) -126, var4.length);
        arg0.field1393 += class301.field4497.method3686(arg0.field1393, var4.length, -12135, arg0.field1397, var4, 0);
        return arg0.field1393 - var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(JJ)J")
    public static long method3738(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BZI)V")
    public final void method3739(byte[] arg0, boolean arg1, int arg2) {
        this.field9446[this.field9445] = (byte) class2.method189(this.field9446[this.field9445], 0x80 >>> class481.method2919(7, this.field9448));
        field9441++;
        this.field9445++;
        if (this.field9445 > 32) {
            while (true) {
                if (this.field9445 >= 64) {
                    this.method3741(111019040);
                    this.field9445 = 0;
                    break;
                }
                this.field9446[this.field9445++] = 0;
            }
        }
        while (this.field9445 < 32) {
            this.field9446[this.field9445++] = 0;
        }
        class692.method3873(this.field9444, 0, this.field9446, 32, 32);
        if (arg1) {
            this.field9436 = null;
        }
        this.method3741(111019040);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field9439[var4];
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

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public final void method3740(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            this.field9437 = null;
        }
        while (var2 < 32) {
            this.field9444[var2] = 0;
            var2++;
        }
        field9440++;
        this.field9446[0] = 0;
        this.field9448 = this.field9445 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field9439[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    private final void method3741(int arg0) {
        field9443++;
        if (arg0 != 111019040) {
            this.field9448 = -110;
        }
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field9438[var2] = class662.method3767(class662.method3767(class662.method3767(class523.method3073((long) this.field9446[var3 + 5] << 16, 0xFFL << 16), class662.method3767(class523.method3073(255L, (long) this.field9446[var3 + 4]) << 24, class662.method3767(class523.method3073(255L, (long) this.field9446[var3 + 3]) << 32, class662.method3767(class523.method3073(0xFFL << 40, (long) this.field9446[var3 + 2] << 40), class662.method3767((long) this.field9446[var3] << 56, class523.method3073(255L, (long) this.field9446[var3 + 1]) << 48))))), class523.method3073(255L, (long) this.field9446[var3 + 6]) << 8), class523.method3073(255L, (long) this.field9446[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field9442[var4] = class662.method3767(this.field9438[var4], this.field9436[var4] = this.field9439[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field9437[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field9437[var7] = class662.method3767(this.field9437[var7], class290.field4349[var13][class481.method2919(255, (int) (this.field9436[class481.method2919(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field9436[var8] = this.field9437[var8];
            }
            this.field9436[0] = class662.method3767(this.field9436[0], class290.field4353[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field9437[var9] = this.field9436[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field9437[var9] = class662.method3767(this.field9437[var9], class290.field4349[var11][class481.method2919(255, (int) (this.field9442[class481.method2919(var9 - var11, 7)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field9442[var10] = this.field9437[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field9439[var6] = class662.method3767(this.field9439[var6], class662.method3767(this.field9438[var6], this.field9442[var6]));
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJ[B)V")
    public final void method3742(byte arg0, long arg1, byte[] arg2) {
        field9447++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field9448 & 0x7;
        if (arg0 != 23) {
            this.method3742((byte) -28, 107L, null);
        }
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field9444[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field9444[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field9446[this.field9445] = (byte) class2.method189(this.field9446[this.field9445], var15 >>> var7);
            this.field9448 += 8 - var7;
            this.field9445++;
            if (this.field9448 == 512) {
                this.method3741(111019040);
                this.field9448 = this.field9445 = 0;
            }
            this.field9446[this.field9445] = (byte) class481.method2919(var15 << 8 - var7, 255);
            arg1 -= 8L;
            var5++;
            this.field9448 += var7;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field9446[this.field9445] = (byte) class2.method189(this.field9446[this.field9445], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg1) < 8L) {
            this.field9448 = (int) ((long) this.field9448 + arg1);
            return;
        }
        long var13 = arg1 - (long) (8 - var7);
        this.field9448 += 8 - var7;
        this.field9445++;
        if (this.field9448 == 512) {
            this.method3741(111019040);
            this.field9448 = this.field9445 = 0;
        }
        this.field9446[this.field9445] = (byte) class481.method2919(255, var12 << 8 - var7);
        this.field9448 += (int) var13;
    }
}
