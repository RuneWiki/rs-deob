import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class701 {

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "[J")
    private long[] field9798 = new long[8];

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    private int field9797 = 0;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "[B")
    private byte[] field9800 = new byte[64];

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "[J")
    private long[] field9807 = new long[8];

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "[J")
    private long[] field9801 = new long[8];

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    private int field9809 = 0;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "[J")
    private long[] field9810 = new long[8];

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "[J")
    private long[] field9812 = new long[8];

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "[B")
    private byte[] field9806 = new byte[32];

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "Z")
    public static boolean field9811 = false;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Lsv;")
    public static class617 field9803 = new class617();

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "[Ll;")
    public static class18[] field9808;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "[[I")
    public static int[][] field9813;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(J[BI)V", line = 3)
    public final void method3875(long arg0, byte[] arg1, int arg2) {
        field9799++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        if (arg2 != -1) {
            this.method3876((byte) 7);
        }
        int var7 = this.field9809 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field9806[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field9806[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field9800[this.field9797] = (byte) class364.method2113(this.field9800[this.field9797], var15 >>> var7);
            this.field9797++;
            this.field9809 += 8 - var7;
            if (this.field9809 == 512) {
                this.method3876((byte) 77);
                this.field9809 = this.field9797 = 0;
            }
            this.field9800[this.field9797] = (byte) class109.method762(255, var15 << 8 - var7);
            arg0 -= 8L;
            var5++;
            this.field9809 += var7;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field9800[this.field9797] = (byte) class364.method2113(this.field9800[this.field9797], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field9809 = (int) ((long) this.field9809 + arg0);
            return;
        }
        this.field9797++;
        long var13 = arg0 - (long) (8 - var7);
        this.field9809 += 8 - var7;
        if (this.field9809 == 512) {
            this.method3876((byte) 109);
            this.field9809 = this.field9797 = 0;
        }
        this.field9800[this.field9797] = (byte) class109.method762(255, var12 << 8 - var7);
        this.field9809 += (int) var13;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V", line = 97)
    private final void method3876(byte arg0) {
        field9804++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field9807[var2] = class311.method1832(class311.method1832(class311.method1832(class431.method2370((long) this.field9800[var3 + 5] << 16, 0xFFL << 16), class311.method1832(class311.method1832(class311.method1832(class311.method1832((long) this.field9800[var3] << 56, class431.method2370((long) this.field9800[var3 + 1] << 48, 0xFFL << 48)), class431.method2370(0xFFL << 40, (long) this.field9800[var3 + 2] << 40)), class431.method2370((long) this.field9800[var3 + 3] << 32, 0xFFL << 32)), class431.method2370(0xFFL << 24, (long) this.field9800[var3 + 4] << 24))), class431.method2370(255L, (long) this.field9800[var3 + 6]) << 8), class431.method2370(255L, (long) this.field9800[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field9812[var4] = class311.method1832(this.field9807[var4], this.field9801[var4] = this.field9810[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field9798[var8] = 0L;
                int var14 = 0;
                int var15 = 56;
                while (var14 < 8) {
                    this.field9798[var8] = class311.method1832(this.field9798[var8], class409.field5258[var14][class109.method762(255, (int) (this.field9801[class109.method762(7, var8 - var14)] >>> var15))]);
                    var15 -= 8;
                    var14++;
                }
            }
            for (int var9 = 0; var9 < 8; var9++) {
                this.field9801[var9] = this.field9798[var9];
            }
            this.field9801[0] = class311.method1832(this.field9801[0], class409.field5261[var5]);
            for (int var10 = 0; var10 < 8; var10++) {
                this.field9798[var10] = this.field9801[var10];
                int var12 = 0;
                int var13 = 56;
                while (var12 < 8) {
                    this.field9798[var10] = class311.method1832(this.field9798[var10], class409.field5258[var12][class109.method762(255, (int) (this.field9812[class109.method762(var10 - var12, 7)] >>> var13))]);
                    var13 -= 8;
                    var12++;
                }
            }
            for (int var11 = 0; var11 < 8; var11++) {
                this.field9812[var11] = this.field9798[var11];
            }
        }
        int var6 = 0;
        int var7 = 65 % ((arg0 + 37) / 61);
        while (var6 < 8) {
            this.field9810[var6] = class311.method1832(this.field9810[var6], class311.method1832(this.field9812[var6], this.field9807[var6]));
            var6++;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V", line = 207)
    public final void method3877(int arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field9806[var2] = 0;
        }
        field9805++;
        this.field9809 = this.field9797 = 0;
        this.field9800[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field9810[var3] = 0L;
        }
        if (arg0 >= -95) {
            this.method3879(-33, (byte) -75, null);
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V", line = 264)
    public static void method3878(int arg0) {
        field9803 = null;
        if (arg0 != 8) {
            field9803 = null;
        }
        field9808 = null;
        field9813 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB[B)V", line = 280)
    public final void method3879(int arg0, byte arg1, byte[] arg2) {
        field9802++;
        this.field9800[this.field9797] = (byte) class364.method2113(this.field9800[this.field9797], 0x80 >>> class109.method762(7, this.field9809));
        this.field9797++;
        if (this.field9797 > 32) {
            while (true) {
                if (this.field9797 >= 64) {
                    this.method3876((byte) 113);
                    this.field9797 = 0;
                    break;
                }
                this.field9800[this.field9797++] = 0;
            }
        }
        while (this.field9797 < 32) {
            this.field9800[this.field9797++] = 0;
        }
        class70.method557(this.field9806, 0, this.field9800, 32, 32);
        this.method3876((byte) 122);
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field9810[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
        if (arg1 != -69) {
            method3878(-39);
        }
    }
}
