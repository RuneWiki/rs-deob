import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class486 {

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "[B")
    private byte[] field6738 = new byte[32];

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "[J")
    private long[] field6744 = new long[8];

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    private int field6741 = 0;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    private int field6736 = 0;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "[J")
    private long[] field6745 = new long[8];

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "[J")
    private long[] field6746 = new long[8];

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "[B")
    private byte[] field6748 = new byte[64];

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "[J")
    private long[] field6742 = new long[8];

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "[J")
    private long[] field6747 = new long[8];

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V", line = 8)
    private final void method2861(int arg0) {
        field6735++;
        int var2 = 0;
        int var3 = arg0;
        while (var2 < 8) {
            this.field6746[var2] = class557.method3203(class557.method3203(class272.method1799(255L, (long) this.field6748[var3 + 6]) << 8, class557.method3203(class272.method1799((long) this.field6748[var3 + 5] << 16, 0xFFL << 16), class557.method3203(class557.method3203(class272.method1799(0xFFL << 32, (long) this.field6748[var3 + 3] << 32), class557.method3203(class557.method3203(class272.method1799(0xFFL << 48, (long) this.field6748[var3 + 1] << 48), (long) this.field6748[var3] << 56), class272.method1799((long) this.field6748[var3 + 2] << 40, 0xFFL << 40))), class272.method1799((long) this.field6748[var3 + 4], 255L) << 24))), class272.method1799(255L, (long) this.field6748[var3 + 7]));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field6742[var4] = class557.method3203(this.field6746[var4], this.field6745[var4] = this.field6747[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field6744[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field6744[var7] = class557.method3203(this.field6744[var7], class508.field7065[var13][class263.method1762(255, (int) (this.field6745[class263.method1762(7, var7 - var13)] >>> var14))]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field6745[var8] = this.field6744[var8];
            }
            this.field6745[0] = class557.method3203(this.field6745[0], class508.field7066[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field6744[var9] = this.field6745[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field6744[var9] = class557.method3203(this.field6744[var9], class508.field7065[var11][class263.method1762(255, (int) (this.field6742[class263.method1762(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field6742[var10] = this.field6744[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field6747[var6] = class557.method3203(this.field6747[var6], class557.method3203(this.field6746[var6], this.field6742[var6]));
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BII)V", line = 116)
    public static final void method2862(byte arg0, int arg1, int arg2) {
        if (arg0 != 38) {
            method2862((byte) 63, 119, 33);
        }
        field6740++;
        if (class569.field7823 == null) {
            return;
        }
        int var3 = class589.field8025;
        int var4 = class391.field5761;
        class616.method3496(-1, arg1, arg2);
        if (class215.field3119 == 0) {
            class691.field9342 = null;
            class691.field9342 = class569.field7823.method319(class569.field7823.method353(class225.field3209, class218.field3157), class569.field7823.method273(class225.field3209, class218.field3157));
        } else if (class215.field3119 == 1 && (class478.field6662 == null || class589.field8025 != var3 || class391.field5761 != var4)) {
            class478.field6662 = new class503[class589.field8025 * class391.field5761];
            for (int var5 = 0; var5 < class478.field6662.length; var5++) {
                class478.field6662[var5] = class569.field7823.method319(class569.field7823.method353(class273.field3847, class386.field5603), class569.field7823.method273(class273.field3847, class386.field5603));
            }
            class58.field1149 = new int[class589.field8025 * class391.field5761];
            class576.field7925 = 1;
        }
        class30.field778 = true;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V", line = 164)
    public final void method2863(int arg0) {
        field6739++;
        int var2 = -69 % ((arg0 - 33) / 43);
        for (int var3 = 0; var3 < 32; var3++) {
            this.field6738[var3] = 0;
        }
        this.field6748[0] = 0;
        this.field6736 = this.field6741 = 0;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field6747[var4] = 0L;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIBZI)V", line = 190)
    public static final void method2864(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field6734++;
        class587.method3355(0);
        class30.field774 = 0L;
        int var5 = class324.method2072(-82);
        if (arg2 != 102) {
            return;
        }
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class272.field3822.method238()) {
            arg3 = true;
        }
        class653.method3687((byte) -125, arg3, arg1, var5, arg0, arg4);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIII)I", line = 212)
    public static final int method2865(int arg0, int arg1, int arg2, int arg3) {
        field6749++;
        int var4 = 106 / ((-arg3 - 20) / 48);
        if (arg1 < arg2) {
            return arg2;
        } else if (arg0 >= arg1) {
            return arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(J[BI)V", line = 224)
    public final void method2866(long arg0, byte[] arg1, int arg2) {
        field6737++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field6736 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var17 = (this.field6738[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field6738[var10] = (byte) var17;
            var8 >>>= 0x8;
            var11 = var17 >>> 8;
            var10--;
        }
        int var12 = 6 % ((arg2 - 64) / 52);
        while (arg0 > 8L) {
            int var16 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var16 < 0 || var16 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field6748[this.field6741] = (byte) class418.method2577(this.field6748[this.field6741], var16 >>> var7);
            this.field6741++;
            this.field6736 += 8 - var7;
            if (this.field6736 == 512) {
                this.method2861(0);
                this.field6736 = this.field6741 = 0;
            }
            this.field6748[this.field6741] = (byte) class263.method1762(var16 << 8 - var7, 255);
            var5++;
            arg0 -= 8L;
            this.field6736 += var7;
        }
        int var13;
        if (arg0 > 0L) {
            var13 = arg1[var5] << var6 & 0xFF;
            this.field6748[this.field6741] = (byte) class418.method2577(this.field6748[this.field6741], var13 >>> var7);
        } else {
            var13 = 0;
        }
        if (((long) var7 + arg0) < 8L) {
            this.field6736 = (int) ((long) this.field6736 + arg0);
            return;
        }
        this.field6736 += 8 - var7;
        long var14 = arg0 - (long) (8 - var7);
        this.field6741++;
        if (this.field6736 == 512) {
            this.method2861(0);
            this.field6736 = this.field6741 = 0;
        }
        this.field6748[this.field6741] = (byte) class263.method1762(var13 << 8 - var7, 255);
        this.field6736 += (int) var14;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI[B)V", line = 322)
    public final void method2867(boolean arg0, int arg1, byte[] arg2) {
        field6743++;
        this.field6748[this.field6741] = (byte) class418.method2577(this.field6748[this.field6741], 0x80 >>> class263.method1762(this.field6736, 7));
        this.field6741++;
        if (this.field6741 > 32) {
            while (true) {
                if (this.field6741 >= 64) {
                    this.method2861(0);
                    this.field6741 = 0;
                    break;
                }
                this.field6748[this.field6741++] = 0;
            }
        }
        while (this.field6741 < 32) {
            this.field6748[this.field6741++] = 0;
        }
        class363.method2319(this.field6738, 0, this.field6748, 32, 32);
        this.method2861(0);
        int var4 = 0;
        if (!arg0) {
            method2864(-1, -123, (byte) 39, false, 61);
        }
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field6747[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }
}
