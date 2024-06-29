import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class469 {

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    private int field6532 = 0;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "[B")
    private byte[] field6533 = new byte[64];

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    private int field6537 = 0;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "[J")
    private long[] field6544 = new long[8];

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "[J")
    private long[] field6539 = new long[8];

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "[J")
    private long[] field6543 = new long[8];

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "[J")
    private long[] field6542 = new long[8];

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "[B")
    private byte[] field6547 = new byte[32];

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "[J")
    private long[] field6535 = new long[8];

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "Lkfa;")
    public static class549 field6546 = new class549(58, 3);

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "I")
    public static int field6549 = 0;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "Lqv;")
    public static class406 field6548 = new class406(4, 1);

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[BI)V")
    public final void method2656(int arg0, byte[] arg1, int arg2) {
        this.field6533[this.field6537] = (byte) class139.method776(this.field6533[this.field6537], 0x80 >>> class203.method1246(7, this.field6532));
        field6540++;
        this.field6537++;
        if (this.field6537 > 32) {
            while (true) {
                if (this.field6537 >= 64) {
                    this.method2659(118);
                    this.field6537 = 0;
                    break;
                }
                this.field6533[this.field6537++] = 0;
            }
        }
        while (this.field6537 < 32) {
            this.field6533[this.field6537++] = 0;
        }
        class652.method3679(this.field6547, 0, this.field6533, 32, 32);
        this.method2659(10);
        if (arg2 != -4416) {
            this.field6543 = null;
        }
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field6544[var4];
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
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(J[BB)V")
    public final void method2657(long arg0, byte[] arg1, byte arg2) {
        field6538++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field6532 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = -37 % ((49 - arg2) / 45);
        int var12 = 0;
        while (var10 >= 0) {
            int var17 = (this.field6547[var10] & 0xFF) + ((int) var8 & 0xFF) + var12;
            this.field6547[var10] = (byte) var17;
            var12 = var17 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg0 > 8L) {
            int var16 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var16 < 0 || var16 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field6533[this.field6537] = (byte) class139.method776(this.field6533[this.field6537], var16 >>> var7);
            this.field6532 += 8 - var7;
            this.field6537++;
            if (this.field6532 == 512) {
                this.method2659(-124);
                this.field6532 = this.field6537 = 0;
            }
            this.field6533[this.field6537] = (byte) class203.method1246(255, var16 << 8 - var7);
            arg0 -= 8L;
            this.field6532 += var7;
            var5++;
        }
        int var13;
        if (arg0 > 0L) {
            var13 = arg1[var5] << var6 & 0xFF;
            this.field6533[this.field6537] = (byte) class139.method776(this.field6533[this.field6537], var13 >>> var7);
        } else {
            var13 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field6532 = (int) ((long) this.field6532 + arg0);
            return;
        }
        long var14 = arg0 - (long) (8 - var7);
        this.field6532 += 8 - var7;
        this.field6537++;
        if (this.field6532 == 512) {
            this.method2659(-15);
            this.field6532 = this.field6537 = 0;
        }
        this.field6533[this.field6537] = (byte) class203.method1246(var13 << 8 - var7, 255);
        this.field6532 += (int) var14;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IZ)Lqq;")
    public static final class434 method2658(int arg0, boolean arg1) {
        field6545++;
        if (arg0 == 0) {
            if ((double) class637.field9019 == 3.0D) {
                return class172.field2055;
            }
            if ((double) class637.field9019 == 4.0D) {
                return class462.field6421;
            }
            if ((double) class637.field9019 == 6.0D) {
                return class61.field630;
            }
            if ((double) class637.field9019 >= 8.0D) {
                return class213.field2570;
            }
        } else if (arg0 == 1) {
            if ((double) class637.field9019 == 3.0D) {
                return class61.field630;
            }
            if ((double) class637.field9019 == 4.0D) {
                return class213.field2570;
            }
            if ((double) class637.field9019 == 6.0D) {
                return class653.field9330;
            }
            if ((double) class637.field9019 >= 8.0D) {
                return class14.field128;
            }
        } else if (arg0 == 2) {
            if ((double) class637.field9019 == 3.0D) {
                return class653.field9330;
            }
            if ((double) class637.field9019 == 4.0D) {
                return class14.field128;
            }
            if ((double) class637.field9019 == 6.0D) {
                return class343.field4444;
            }
            if ((double) class637.field9019 >= 8.0D) {
                return class107.field1241;
            }
        }
        return arg1 ? null : null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
    private final void method2659(int arg0) {
        field6541++;
        int var2 = 0;
        int var3 = -12 / ((arg0 + 76) / 40);
        int var4 = 0;
        while (var2 < 8) {
            this.field6539[var2] = class243.method1403(class436.method2409((long) this.field6533[var4 + 7], 255L), class243.method1403(class436.method2409(0xFFL << 8, (long) this.field6533[var4 + 6] << 8), class243.method1403(class243.method1403(class243.method1403(class243.method1403(class436.method2409((long) this.field6533[var4 + 2], 255L) << 40, class243.method1403((long) this.field6533[var4] << 56, class436.method2409((long) this.field6533[var4 + 1], 255L) << 48)), class436.method2409((long) this.field6533[var4 + 3], 255L) << 32), class436.method2409(255L, (long) this.field6533[var4 + 4]) << 24), class436.method2409(0xFFL << 16, (long) this.field6533[var4 + 5] << 16))));
            var2++;
            var4 += 8;
        }
        for (int var5 = 0; var5 < 8; var5++) {
            this.field6535[var5] = class243.method1403(this.field6539[var5], this.field6543[var5] = this.field6544[var5]);
        }
        for (int var6 = 1; var6 <= 10; var6++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field6542[var8] = 0L;
                int var14 = 0;
                int var15 = 56;
                while (var14 < 8) {
                    this.field6542[var8] = class243.method1403(this.field6542[var8], class30.field350[var14][class203.method1246((int) (this.field6543[class203.method1246(7, var8 - var14)] >>> var15), 255)]);
                    var15 -= 8;
                    var14++;
                }
            }
            for (int var9 = 0; var9 < 8; var9++) {
                this.field6543[var9] = this.field6542[var9];
            }
            this.field6543[0] = class243.method1403(this.field6543[0], class30.field351[var6]);
            for (int var10 = 0; var10 < 8; var10++) {
                this.field6542[var10] = this.field6543[var10];
                int var12 = 0;
                int var13 = 56;
                while (var12 < 8) {
                    this.field6542[var10] = class243.method1403(this.field6542[var10], class30.field350[var12][class203.method1246(255, (int) (this.field6535[class203.method1246(var10 - var12, 7)] >>> var13))]);
                    var12++;
                    var13 -= 8;
                }
            }
            for (int var11 = 0; var11 < 8; var11++) {
                this.field6535[var11] = this.field6542[var11];
            }
        }
        for (int var7 = 0; var7 < 8; var7++) {
            this.field6544[var7] = class243.method1403(this.field6544[var7], class243.method1403(this.field6539[var7], this.field6535[var7]));
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V")
    public static void method2660(int arg0) {
        field6546 = null;
        if (arg0 > -36) {
            method2660(14);
        }
        field6548 = null;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
    public final void method2661(int arg0) {
        field6536++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field6547[var2] = 0;
        }
        this.field6532 = this.field6537 = 0;
        int var3 = -94 / ((71 - arg0) / 41);
        this.field6533[0] = 0;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field6544[var4] = 0L;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ldj;I)I")
    public static final int method2662(class311 arg0, int arg1) {
        if (arg1 != -1252293808) {
            field6549 = 43;
        }
        field6534++;
        if (class205.field2502 == arg0) {
            return 9216;
        } else if (class223.field2831 == arg0) {
            return 34065;
        } else if (class23.field206 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
