import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class190 {

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "[J")
    private long[] field2964 = new long[8];

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    private int field2968 = 0;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "[J")
    private long[] field2969 = new long[8];

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "[J")
    private long[] field2970 = new long[8];

    @OriginalMember(owner = "client!mfa", name = "k", descriptor = "[B")
    private byte[] field2973 = new byte[32];

    @OriginalMember(owner = "client!mfa", name = "m", descriptor = "[B")
    private byte[] field2975 = new byte[64];

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    private int field2971 = 0;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "[J")
    private long[] field2966 = new long[8];

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "[J")
    private long[] field2977 = new long[8];

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "Ljn;")
    public static class117 field2967 = new class117(128, 4);

    @OriginalMember(owner = "client!mfa", name = "j", descriptor = "J")
    public static long field2972 = 0L;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[BB)V")
    public final void method1347(int arg0, byte[] arg1, byte arg2) {
        field2963++;
        this.field2975[this.field2968] = (byte) class460.method2676(this.field2975[this.field2968], 0x80 >>> class248.method1593(7, this.field2971));
        this.field2968++;
        if (this.field2968 > 32) {
            while (true) {
                if (this.field2968 >= 64) {
                    this.method1351(0);
                    this.field2968 = 0;
                    break;
                }
                this.field2975[this.field2968++] = 0;
            }
        }
        while (this.field2968 < 32) {
            this.field2975[this.field2968++] = 0;
        }
        class553.method3242(this.field2973, 0, this.field2975, 32, 32);
        this.method1351(0);
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field2977[var4];
            arg1[var5] = (byte) ((int) (var6 >>> 56));
            arg1[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg1[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg1[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg1[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg1[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg1[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg1[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
        if (arg2 != -37) {
            this.field2969 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
    public static void method1348(int arg0) {
        if (arg0 <= -86) {
            field2967 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(J[BI)V")
    public final void method1349(long arg0, byte[] arg1, int arg2) {
        field2976++;
        if (arg2 != 255) {
            this.field2977 = null;
        }
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field2971 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field2973[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field2973[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field2975[this.field2968] = (byte) class460.method2676(this.field2975[this.field2968], var15 >>> var7);
            this.field2968++;
            this.field2971 += 8 - var7;
            if (this.field2971 == 512) {
                this.method1351(0);
                this.field2971 = this.field2968 = 0;
            }
            this.field2975[this.field2968] = (byte) class248.method1593(255, var15 << 8 - var7);
            this.field2971 += var7;
            arg0 -= 8L;
            var5++;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field2975[this.field2968] = (byte) class460.method2676(this.field2975[this.field2968], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field2971 = (int) ((long) this.field2971 + arg0);
            return;
        }
        this.field2968++;
        this.field2971 += 8 - var7;
        long var13 = arg0 - (long) (8 - var7);
        if (this.field2971 == 512) {
            this.method1351(0);
            this.field2971 = this.field2968 = 0;
        }
        this.field2975[this.field2968] = (byte) class248.method1593(var12 << 8 - var7, 255);
        this.field2971 += (int) var13;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V")
    public final void method1350(int arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field2973[var2] = 0;
        }
        field2974++;
        this.field2975[0] = 0;
        this.field2971 = this.field2968 = 0;
        for (int var3 = arg0; var3 < 8; var3++) {
            this.field2977[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "(I)V")
    private final void method1351(int arg0) {
        field2965++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field2964[var2] = class302.method1853(class302.method1853(class302.method1853(class613.method3468(255L, (long) this.field2975[var3 + 5]) << 16, class302.method1853(class302.method1853(class613.method3468((long) this.field2975[var3 + 3], 255L) << 32, class302.method1853(class613.method3468((long) this.field2975[var3 + 2] << 40, 0xFFL << 40), class302.method1853(class613.method3468((long) this.field2975[var3 + 1] << 48, 0xFFL << 48), (long) this.field2975[var3] << 56))), class613.method3468((long) this.field2975[var3 + 4] << 24, 0xFFL << 24))), class613.method3468((long) this.field2975[var3 + 6], 255L) << 8), class613.method3468((long) this.field2975[var3 + 7], 255L));
            var2++;
            var3 += 8;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field2966[var4] = class302.method1853(this.field2964[var4], this.field2970[var4] = this.field2977[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field2969[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field2969[var7] = class302.method1853(this.field2969[var7], class8.field96[var13][class248.method1593((int) (this.field2970[class248.method1593(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field2970[var8] = this.field2969[var8];
            }
            this.field2970[0] = class302.method1853(this.field2970[0], class8.field91[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field2969[var9] = this.field2970[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field2969[var9] = class302.method1853(this.field2969[var9], class8.field96[var11][class248.method1593((int) (this.field2966[class248.method1593(var9 - var11, 7)] >>> var12), 255)]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field2966[var10] = this.field2969[var10];
            }
        }
        for (int var6 = arg0; var6 < 8; var6++) {
            this.field2977[var6] = class302.method1853(this.field2977[var6], class302.method1853(this.field2964[var6], this.field2966[var6]));
        }
    }
}
