import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class241 extends class264 {

    @OriginalMember(owner = "client!gl", name = "fb", descriptor = "I")
    private int field3994 = 409;

    @OriginalMember(owner = "client!gl", name = "lb", descriptor = "I")
    private int field4000 = 8;

    @OriginalMember(owner = "client!gl", name = "wb", descriptor = "I")
    private int field4011 = 204;

    @OriginalMember(owner = "client!gl", name = "zb", descriptor = "I")
    private int field4014 = 1024;

    @OriginalMember(owner = "client!gl", name = "sb", descriptor = "I")
    private int field4007 = 4;

    @OriginalMember(owner = "client!gl", name = "mb", descriptor = "I")
    private int field4001 = 81;

    @OriginalMember(owner = "client!gl", name = "gb", descriptor = "I")
    private int field3995 = 1024;

    @OriginalMember(owner = "client!gl", name = "Ab", descriptor = "I")
    private int field4015 = 0;

    @OriginalMember(owner = "client!gl", name = "tb", descriptor = "Lma;")
    private static class5 field4008 = class12.method119("FULL", (byte) 90);

    @OriginalMember(owner = "client!gl", name = "kb", descriptor = "Lma;")
    public static class5 field3999 = field4008;

    @OriginalMember(owner = "client!gl", name = "pb", descriptor = "Ltj;")
    public static class73 field4004 = new class73(64);

    @OriginalMember(owner = "client!gl", name = "Fb", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!gl", name = "Eb", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!gl", name = "Gb", descriptor = "Lma;")
    private static class5 field4021 = class12.method119(" ", (byte) 120);

    @OriginalMember(owner = "client!gl", name = "Ib", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!gl", name = "Hb", descriptor = "Lma;")
    public static class5 field4022 = field4021;

    @OriginalMember(owner = "client!gl", name = "hb", descriptor = "I")
    private int field3996;

    @OriginalMember(owner = "client!gl", name = "ib", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!gl", name = "jb", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!gl", name = "nb", descriptor = "I")
    private int field4002;

    @OriginalMember(owner = "client!gl", name = "qb", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!gl", name = "vb", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!gl", name = "xb", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!gl", name = "yb", descriptor = "I")
    private int field4013;

    @OriginalMember(owner = "client!gl", name = "Bb", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!gl", name = "Cb", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!gl", name = "ub", descriptor = "Lsc;")
    public static class136 field4009;

    @OriginalMember(owner = "client!gl", name = "Db", descriptor = "[I")
    private int[] field4018;

    @OriginalMember(owner = "client!gl", name = "ob", descriptor = "[[I")
    private int[][] field4003;

    @OriginalMember(owner = "client!gl", name = "rb", descriptor = "[[I")
    private int[][] field4006;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 183)
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V", line = 13)
    public final void method111(int arg0) {
        this.method1703(7);
        field4017++;
        int var2 = 92 % ((66 - arg0) / 44);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IJ)V", line = 27)
    public static final void method1700(int arg0, long arg1) {
        field3998++;
        if (arg1 == 0L) {
            return;
        }
        class147.field2127.method1389((byte) 100, 83);
        class137.field2037++;
        class147.field2127.method1548(false, arg1);
        if (arg0 != 6) {
            method1700(-1, -24L);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[I", line = 47)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 >= -58) {
            this.method4(75, -93, (class221) null);
        }
        field4012++;
        int[] var3 = this.field4501.method1176(arg1, 124);
        if (this.field4501.field2741) {
            int var4 = 0;
            int var5;
            for (var5 = class116.field1726[arg1] + this.field4015; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4000 && var5 >= this.field4018[var4]) {
                var4++;
            }
            int var6 = this.field4018[var4 - 1];
            int var7 = var4 - 1;
            int var8 = this.field4018[var4];
            boolean var9 = (var4 & 0x1) == 0;
            if (var5 > this.field4002 + var6 && var8 - this.field4002 > var5) {
                for (int var10 = 0; var10 < class226.field3716; var10++) {
                    int var11 = var9 ? this.field4014 : -this.field4014;
                    int var12 = (this.field4013 * var11 >> 12) + class251.field4159[var10];
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (var13 < this.field4007 && var12 >= this.field4003[var7][var13]) {
                        var13++;
                    }
                    int var14 = var13 - 1;
                    int var15 = this.field4003[var7][var13];
                    int var16 = this.field4003[var7][var14];
                    if (var12 > this.field4002 + var16 && var12 < var15 - this.field4002) {
                        var3[var10] = this.field4006[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class42.method292(var3, 0, class226.field3716, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V", line = 147)
    public static void method1701(int arg0) {
        field3999 = null;
        field4004 = null;
        field4021 = null;
        field4008 = null;
        field4009 = null;
        if (arg0 == 16585) {
            field4022 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BIILni;)[Lpk;", line = 169)
    public static final class74[] method1702(byte arg0, int arg1, int arg2, class202 arg3) {
        field4016++;
        if (class180.method1171(arg1, arg2, arg3, (byte) -128)) {
            return arg0 == -119 ? class67.method479(17090) : (class74[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "(I)V", line = 195)
    private final void method1703(int arg0) {
        Random var2 = new Random((long) this.field4000);
        this.field4003 = new int[this.field4000][this.field4007 + 1];
        this.field4018 = new int[this.field4000 + 1];
        this.field3996 = 4096 / this.field4000;
        this.field4013 = 4096 / this.field4007;
        int var3 = this.field4013 / 2;
        field4005++;
        this.field4006 = new int[this.field4000][this.field4007];
        if (arg0 != 7) {
            this.method111(59);
        }
        this.field4018[0] = 0;
        int var4 = this.field3996 / 2;
        this.field4002 = this.field4001 / 2;
        for (int var5 = 0; var5 < this.field4000; var5++) {
            if (var5 > 0) {
                int var6 = this.field3996;
                int var7 = (class81.method555((byte) -57, 4096, var2) - 2048) * this.field4011 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4018[var5] = this.field4018[var5 - 1] + var8;
            }
            this.field4003[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4007; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4013;
                    int var11 = (class81.method555((byte) -57, 4096, var2) - 2048) * this.field3994 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4003[var5][var9] = this.field4003[var5][var9 - 1] + var12;
                }
                this.field4006[var5][var9] = this.field3995 <= 0 ? 4096 : 4096 - class81.method555((byte) -57, this.field3995, var2);
            }
            this.field4003[var5][this.field4007] = 4096;
        }
        this.field4018[this.field4000] = 4096;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILii;)V", line = 272)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field4010++;
        if (arg0 == 0) {
            this.field4007 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field4000 = arg2.method1509(true);
        } else if (arg0 == 2) {
            this.field3994 = arg2.method1524((byte) 79);
        } else if (arg0 == 3) {
            this.field4011 = arg2.method1524((byte) 56);
        } else if (arg0 == 4) {
            this.field4014 = arg2.method1524((byte) 38);
        } else if (arg0 == 5) {
            this.field4015 = arg2.method1524((byte) 86);
        } else if (arg0 == 6) {
            this.field4001 = arg2.method1524((byte) 81);
        } else if (arg0 == 7) {
            this.field3995 = arg2.method1524((byte) 41);
        }
        if (arg1 >= -27) {
            this.method5(-103, -83);
        }
    }
}
