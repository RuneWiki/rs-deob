import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class355 {

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "[J")
    private long[] field4733 = new long[8];

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "[J")
    private long[] field4730 = new long[8];

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "[J")
    private long[] field4732 = new long[8];

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    private int field4738 = 0;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "[B")
    private byte[] field4736 = new byte[32];

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "[J")
    private long[] field4744 = new long[8];

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "[B")
    private byte[] field4743 = new byte[64];

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "[J")
    private long[] field4742 = new long[8];

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    private int field4745 = 0;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)Lfs;", line = 5)
    public static final class383 method2090(byte arg0, int arg1) {
        field4731++;
        class383 var2 = (class383) class24.field286.method2176(-124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class220.field2871.method1938(arg1, 0, -17);
        class383 var4 = new class383();
        if (var3 != null) {
            var4.method2193(arg1, new class157(var3), -1);
        }
        if (arg0 < 37) {
            method2092((byte) -18, -6);
        }
        class24.field286.method2174(var4, (long) arg1, (byte) 125);
        return var4;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B[BI)V", line = 37)
    public final void method2091(byte arg0, byte[] arg1, int arg2) {
        field4740++;
        this.field4743[this.field4745] = (byte) class665.method3789(this.field4743[this.field4745], 0x80 >>> class15.method97(7, this.field4738));
        this.field4745++;
        if (this.field4745 > 32) {
            while (true) {
                if (this.field4745 >= 64) {
                    this.method2096(8);
                    this.field4745 = 0;
                    break;
                }
                this.field4743[this.field4745++] = 0;
            }
        }
        while (this.field4745 < 32) {
            this.field4743[this.field4745++] = 0;
        }
        class2.method9(this.field4736, 0, this.field4743, 32, 32);
        this.method2096(8);
        int var4 = 0;
        int var5 = -93 / ((66 - arg0) / 59);
        int var6 = arg2;
        while (var4 < 8) {
            long var7 = this.field4732[var4];
            arg1[var6] = (byte) ((int) (var7 >>> 56));
            arg1[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg1[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg1[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg1[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg1[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg1[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg1[var6 + 7] = (byte) ((int) var7);
            var4++;
            var6 += 8;
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(BI)V", line = 90)
    public static final void method2092(byte arg0, int arg1) {
        field4741++;
        class256 var2 = class592.method3279((byte) -36, 8, arg1);
        int var3 = -106 % ((arg0 - 32) / 56);
        var2.method1546((byte) 122);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)Z", line = 102)
    public static final boolean method2093(int arg0, int arg1) {
        if (arg1 != 1) {
            method2092((byte) -39, 100);
        }
        field4737++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([BJI)V", line = 145)
    public final void method2094(byte[] arg0, long arg1, int arg2) {
        field4734++;
        if (arg2 != 255) {
            return;
        }
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field4738 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field4736[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field4736[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4743[this.field4745] = (byte) class665.method3789(this.field4743[this.field4745], var15 >>> var7);
            this.field4738 += 8 - var7;
            this.field4745++;
            if (this.field4738 == 512) {
                this.method2096(8);
                this.field4738 = this.field4745 = 0;
            }
            this.field4743[this.field4745] = (byte) class15.method97(255, var15 << 8 - var7);
            var5++;
            this.field4738 += var7;
            arg1 -= 8L;
        }
        int var12;
        if (arg1 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field4743[this.field4745] = (byte) class665.method3789(this.field4743[this.field4745], var12 >>> var7);
        }
        if (((long) var7 + arg1) < 8L) {
            this.field4738 = (int) ((long) this.field4738 + arg1);
            return;
        }
        long var13 = arg1 - (long) (8 - var7);
        this.field4738 += 8 - var7;
        this.field4745++;
        if (this.field4738 == 512) {
            this.method2096(8);
            this.field4738 = this.field4745 = 0;
        }
        this.field4743[this.field4745] = (byte) class15.method97(var12 << 8 - var7, 255);
        this.field4738 += (int) var13;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V", line = 232)
    public final void method2095(byte arg0) {
        field4739++;
        int var2 = 22 / ((18 - arg0) / 42);
        for (int var3 = 0; var3 < 32; var3++) {
            this.field4736[var3] = 0;
        }
        this.field4738 = this.field4745 = 0;
        this.field4743[0] = 0;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4732[var4] = 0L;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V", line = 258)
    private final void method2096(int arg0) {
        if (arg0 != 8) {
            this.field4743 = null;
        }
        field4735++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field4733[var2] = class487.method2796(class487.method2796(class487.method2796(class487.method2796(class487.method2796(class215.method1368(0xFFL << 32, (long) this.field4743[var3 + 3] << 32), class487.method2796(class215.method1368(255L, (long) this.field4743[var3 + 2]) << 40, class487.method2796((long) this.field4743[var3] << 56, class215.method1368((long) this.field4743[var3 + 1], 255L) << 48))), class215.method1368((long) this.field4743[var3 + 4], 255L) << 24), class215.method1368(0xFFL << 16, (long) this.field4743[var3 + 5] << 16)), class215.method1368(0xFFL << 8, (long) this.field4743[var3 + 6] << 8)), class215.method1368(255L, (long) this.field4743[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4744[var4] = class487.method2796(this.field4733[var4], this.field4742[var4] = this.field4732[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4730[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4730[var7] = class487.method2796(this.field4730[var7], class668.field9501[var13][class15.method97(255, (int) (this.field4742[class15.method97(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4742[var8] = this.field4730[var8];
            }
            this.field4742[0] = class487.method2796(this.field4742[0], class668.field9502[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4730[var9] = this.field4742[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4730[var9] = class487.method2796(this.field4730[var9], class668.field9501[var11][class15.method97((int) (this.field4744[class15.method97(7, var9 - var11)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4744[var10] = this.field4730[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field4732[var6] = class487.method2796(this.field4732[var6], class487.method2796(this.field4733[var6], this.field4744[var6]));
        }
    }
}
