import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class488 {

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "[J")
    private long[] field6751 = new long[8];

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "[B")
    private byte[] field6759 = new byte[32];

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "[B")
    private byte[] field6750 = new byte[64];

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    private int field6758 = 0;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    private int field6755 = 0;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "[J")
    private long[] field6761 = new long[8];

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "[J")
    private long[] field6753 = new long[8];

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "[J")
    private long[] field6762 = new long[8];

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "[J")
    private long[] field6760 = new long[8];

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "Lmga;")
    public static class739 field6752 = new class739(51, 4);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "Ldb;")
    public static class343 field6763;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "Leu;")
    public static class508 field6756;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[B)V", line = 5)
    public final void method2832(int arg0, int arg1, byte[] arg2) {
        field6748++;
        this.field6750[this.field6755] = (byte) class213.method1409(this.field6750[this.field6755], 0x80 >>> class440.method2643(this.field6758, 7));
        this.field6755++;
        if (this.field6755 > 32) {
            while (true) {
                if (this.field6755 >= 64) {
                    this.method2834(56);
                    this.field6755 = 0;
                    break;
                }
                this.field6750[this.field6755++] = 0;
            }
        }
        while (this.field6755 < 32) {
            this.field6750[this.field6755++] = 0;
        }
        class278.method1796(this.field6759, 0, this.field6750, 32, 32);
        if (arg0 != -2091170296) {
            return;
        }
        this.method2834(56);
        int var4 = 0;
        int var5 = arg1;
        while (var4 < 8) {
            long var6 = this.field6761[var4];
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
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I", line = 58)
    public static final int method2833(int arg0, int arg1) {
        if (arg1 < 61) {
            return 61;
        } else {
            field6749++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 74)
    private final void method2834(int arg0) {
        int var2 = 0;
        if (arg0 != 56) {
            method2839('(', -58);
        }
        int var3 = 0;
        while (var2 < 8) {
            this.field6753[var2] = class27.method203(class163.method1185((long) this.field6750[var3 + 7], 255L), class27.method203(class27.method203(class163.method1185(0xFFL << 16, (long) this.field6750[var3 + 5] << 16), class27.method203(class27.method203(class163.method1185(255L, (long) this.field6750[var3 + 3]) << 32, class27.method203(class27.method203(class163.method1185((long) this.field6750[var3 + 1] << 48, 0xFFL << 48), (long) this.field6750[var3] << 56), class163.method1185(255L, (long) this.field6750[var3 + 2]) << 40)), class163.method1185(0xFFL << 24, (long) this.field6750[var3 + 4] << 24))), class163.method1185(255L, (long) this.field6750[var3 + 6]) << 8));
            var2++;
            var3 += 8;
        }
        field6764++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field6751[var4] = class27.method203(this.field6753[var4], this.field6760[var4] = this.field6761[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field6762[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field6762[var7] = class27.method203(this.field6762[var7], class277.field4107[var13][class440.method2643(255, (int) (this.field6760[class440.method2643(7, var7 - var13)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field6760[var8] = this.field6762[var8];
            }
            this.field6760[0] = class27.method203(this.field6760[0], class277.field4104[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field6762[var9] = this.field6760[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field6762[var9] = class27.method203(this.field6762[var9], class277.field4107[var11][class440.method2643(255, (int) (this.field6751[class440.method2643(7, var9 - var11)] >>> var12))]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field6751[var10] = this.field6762[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field6761[var6] = class27.method203(this.field6761[var6], class27.method203(this.field6751[var6], this.field6753[var6]));
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 184)
    public final void method2835(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field6759[var2] = 0;
        }
        if (arg0 < 48) {
            method2839('E', 23);
        }
        field6754++;
        this.field6758 = this.field6755 = 0;
        this.field6750[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field6761[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([BBJ)V", line = 213)
    public final void method2836(byte[] arg0, byte arg1, long arg2) {
        field6757++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field6758 & 0x7;
        long var8 = arg2;
        if (arg1 <= 15) {
            field6752 = null;
        }
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field6759[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field6759[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field6750[this.field6755] = (byte) class213.method1409(this.field6750[this.field6755], var15 >>> var7);
            this.field6755++;
            this.field6758 += 8 - var7;
            if (this.field6758 == 512) {
                this.method2834(56);
                this.field6758 = this.field6755 = 0;
            }
            this.field6750[this.field6755] = (byte) class440.method2643(255, var15 << 8 - var7);
            this.field6758 += var7;
            var5++;
            arg2 -= 8L;
        }
        int var12;
        if (arg2 <= 0L) {
            var12 = 0;
        } else {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field6750[this.field6755] = (byte) class213.method1409(this.field6750[this.field6755], var12 >>> var7);
        }
        if (((long) var7 + arg2) < 8L) {
            this.field6758 = (int) ((long) this.field6758 + arg2);
            return;
        }
        this.field6755++;
        this.field6758 += 8 - var7;
        long var13 = arg2 - (long) (8 - var7);
        if (this.field6758 == 512) {
            this.method2834(56);
            this.field6758 = this.field6755 = 0;
        }
        this.field6750[this.field6755] = (byte) class440.method2643(var12 << 8 - var7, 255);
        this.field6758 += (int) var13;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V", line = 301)
    public static void method2837(int arg0) {
        field6752 = null;
        field6756 = null;
        if (arg0 != 0) {
            method2833(-17, -34);
        }
        field6763 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V", line = 334)
    public static final void method2838(int arg0, byte arg1) {
        field6765++;
        if (!class768.method4253(arg1 + 23, arg0)) {
            return;
        }
        class668[] var2 = class111.field1528[arg0];
        if (arg1 != -26) {
            method2839('\u000b', -60);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class668 var4 = var2[var3];
            if (var4 != null) {
                var4.field9323 = 0;
                var4.field9315 = 1;
                var4.field9264 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(CI)Z", line = 372)
    public static final boolean method2839(char arg0, int arg1) {
        if (arg1 != -98) {
            method2838(104, (byte) 106);
        }
        field6766++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
