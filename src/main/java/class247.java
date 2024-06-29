import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class247 extends class302 {

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "[J")
    private long[] field4088 = new long[10];

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    private int field4098 = 256;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    private int field4089 = 0;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private int field4100 = 1;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "J")
    private long field4096 = class212.method1404((byte) -87);

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4090 = -1;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field4092 = 255;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    private int field4094;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 225)
    public class247() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4088[var1] = this.field4096;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 19)
    public final void method1728(byte arg0) {
        field4091++;
        if (arg0 == 24) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field4088[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)I", line = 41)
    public final int method1729(int arg0, int arg1, byte arg2) {
        int var4 = 103 % ((arg2 + 28) / 37);
        field4099++;
        int var5 = this.field4098;
        this.field4098 = 300;
        int var6 = this.field4100;
        this.field4100 = 1;
        this.field4096 = class212.method1404((byte) -87);
        if (this.field4088[this.field4094] == 0L) {
            this.field4098 = var5;
            this.field4100 = var6;
        } else if (this.field4088[this.field4094] < this.field4096) {
            this.field4098 = (int) ((long) (arg1 * 2560) / (this.field4096 - this.field4088[this.field4094]));
        }
        if (this.field4098 < 25) {
            this.field4098 = 25;
        }
        if (this.field4098 > 256) {
            this.field4098 = 256;
            this.field4100 = (int) ((long) arg1 - (this.field4096 - this.field4088[this.field4094]) / 10L);
        }
        if (arg1 < this.field4100) {
            this.field4100 = arg1;
        }
        this.field4088[this.field4094] = this.field4096;
        this.field4094 = (this.field4094 + 1) % 10;
        if (this.field4100 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field4088[var7] != 0L) {
                    this.field4088[var7] -= -((long) this.field4100);
                }
            }
        }
        if (arg0 > this.field4100) {
            this.field4100 = arg0;
        }
        int var8 = 0;
        class116.method759(-1, (long) this.field4100);
        while (this.field4089 < 256) {
            var8++;
            this.field4089 += this.field4098;
        }
        this.field4089 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V", line = 114)
    public static final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class239.method1690(arg1 - arg4, 23267, arg1 + arg4, class137.field2032[arg2], arg3);
        field4097++;
        if (arg0 != 16262) {
            method1731(-93, 80);
        }
        int var5 = arg4;
        int var6 = 0;
        int var7 = -arg4;
        int var8 = -1;
        while (var5 > var6) {
            var8 += 2;
            var7 += var8;
            var6++;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var9 = class137.field2032[arg2 - var5];
                int[] var10 = class137.field2032[arg2 + var5];
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                class239.method1690(var11, 23267, var12, var10, arg3);
                class239.method1690(var11, 23267, var12, var9, arg3);
            }
            int var13 = arg1 + var5;
            int var14 = arg1 - var5;
            int[] var15 = class137.field2032[arg2 - var6];
            int[] var16 = class137.field2032[arg2 + var6];
            class239.method1690(var14, 23267, var13, var16, arg3);
            class239.method1690(var14, 23267, var13, var15, arg3);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 202)
    public static final int method1731(int arg0, int arg1) {
        field4095++;
        class130 var2 = class188.method1237(arg0 + 29393, arg1);
        if (arg0 != -29267) {
            field4090 = -114;
        }
        int var3 = var2.field1946;
        int var4 = var2.field1949;
        int var5 = var2.field1945;
        int var6 = class231.field3837[var5 - var3];
        return var6 & class149.field2149[var4] >> var3;
    }
}
