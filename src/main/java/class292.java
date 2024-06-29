import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class292 {

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    private int field4288 = 0;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "[J")
    private long[] field4292 = new long[8];

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "[B")
    private byte[] field4291 = new byte[64];

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "[J")
    private long[] field4296 = new long[8];

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "[J")
    private long[] field4295 = new long[8];

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    private int field4290 = 0;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "[J")
    private long[] field4297 = new long[8];

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "[B")
    private byte[] field4289 = new byte[32];

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "[J")
    private long[] field4301 = new long[8];

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "Z")
    public static boolean field4299 = false;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "[[[B")
    public static byte[][][] field4287;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "([BII)V")
    public final void method1930(byte[] arg0, int arg1, int arg2) {
        this.field4291[this.field4290] = (byte) class613.method3544(this.field4291[this.field4290], 0x80 >>> class407.method2490(this.field4288, 7));
        field4300++;
        this.field4290++;
        if (this.field4290 > 32) {
            while (true) {
                if (this.field4290 >= 64) {
                    this.method1932(true);
                    this.field4290 = 0;
                    break;
                }
                this.field4291[this.field4290++] = 0;
            }
        }
        while (this.field4290 < 32) {
            this.field4291[this.field4290++] = 0;
        }
        class335.method2118(this.field4289, 0, this.field4291, 32, 32);
        this.method1932(true);
        int var4 = 0;
        int var5 = arg1;
        if (arg2 != -19134) {
            this.field4292 = null;
        }
        while (var4 < 8) {
            long var6 = this.field4295[var4];
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

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V")
    public static void method1931(int arg0) {
        int var1 = 4 % ((-arg0 - 81) / 45);
        field4287 = null;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)V")
    private final void method1932(boolean arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field4301[var2] = class778.method4284(class154.method1008((long) this.field4291[var3 + 7], 255L), class778.method4284(class778.method4284(class154.method1008(255L, (long) this.field4291[var3 + 5]) << 16, class778.method4284(class778.method4284(class154.method1008((long) this.field4291[var3 + 3] << 32, 0xFFL << 32), class778.method4284(class154.method1008((long) this.field4291[var3 + 2], 255L) << 40, class778.method4284(class154.method1008((long) this.field4291[var3 + 1], 255L) << 48, (long) this.field4291[var3] << 56))), class154.method1008(255L, (long) this.field4291[var3 + 4]) << 24)), class154.method1008(255L, (long) this.field4291[var3 + 6]) << 8));
            var2++;
            var3 += 8;
        }
        if (!arg0) {
            method1931(-6);
        }
        field4293++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field4292[var4] = class778.method4284(this.field4301[var4], this.field4296[var4] = this.field4295[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field4297[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field4297[var7] = class778.method4284(this.field4297[var7], class641.field9010[var13][class407.method2490(255, (int) (this.field4296[class407.method2490(var7 - var13, 7)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field4296[var8] = this.field4297[var8];
            }
            this.field4296[0] = class778.method4284(this.field4296[0], class641.field9007[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field4297[var9] = this.field4296[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field4297[var9] = class778.method4284(this.field4297[var9], class641.field9010[var11][class407.method2490((int) (this.field4292[class407.method2490(var9 - var11, 7)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field4292[var10] = this.field4297[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field4295[var6] = class778.method4284(this.field4295[var6], class778.method4284(this.field4292[var6], this.field4301[var6]));
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BJ[B)V")
    public final void method1933(byte arg0, long arg1, byte[] arg2) {
        field4294++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = 70 / ((arg0 + 26) / 45);
        int var8 = this.field4288 & 0x7;
        long var9 = arg1;
        int var11 = 31;
        int var12 = 0;
        while (var11 >= 0) {
            int var17 = (this.field4289[var11] & 0xFF) + ((int) var9 & 0xFF) + var12;
            this.field4289[var11] = (byte) var17;
            var9 >>>= 0x8;
            var12 = var17 >>> 8;
            var11--;
        }
        while (arg1 > 8L) {
            int var16 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var16 < 0 || var16 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field4291[this.field4290] = (byte) class613.method3544(this.field4291[this.field4290], var16 >>> var8);
            this.field4290++;
            this.field4288 += 8 - var8;
            if (this.field4288 == 512) {
                this.method1932(true);
                this.field4288 = this.field4290 = 0;
            }
            this.field4291[this.field4290] = (byte) class407.method2490(var16 << 8 - var8, 255);
            var5++;
            this.field4288 += var8;
            arg1 -= 8L;
        }
        int var13;
        if (arg1 > 0L) {
            var13 = arg2[var5] << var6 & 0xFF;
            this.field4291[this.field4290] = (byte) class613.method3544(this.field4291[this.field4290], var13 >>> var8);
        } else {
            var13 = 0;
        }
        if ((long) var8 + arg1 < 8L) {
            this.field4288 = (int) ((long) this.field4288 + arg1);
            return;
        }
        long var14 = arg1 - (long) (8 - var8);
        this.field4290++;
        this.field4288 += 8 - var8;
        if (this.field4288 == 512) {
            this.method1932(true);
            this.field4288 = this.field4290 = 0;
        }
        this.field4291[this.field4290] = (byte) class407.method2490(var13 << 8 - var8, 255);
        this.field4288 += (int) var14;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V")
    public final void method1934(boolean arg0) {
        field4298++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field4289[var2] = 0;
        }
        this.field4288 = this.field4290 = 0;
        this.field4291[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field4295[var3] = 0L;
        }
        if (!arg0) {
            this.method1934(true);
        }
    }
}
