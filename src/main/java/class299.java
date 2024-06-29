import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class299 extends class53 {

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    private int field5099 = 81;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    private int field5110 = 4;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    private int field5115 = 204;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    private int field5107 = 409;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    private int field5104 = 1024;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    private int field5108 = 1024;

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "I")
    private int field5122 = 8;

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "I")
    private int field5125 = 0;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "[I")
    public static int[] field5098 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Lwa;")
    public static class75 field5101 = class66.method560("rot:", false);

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "Lwa;")
    public static class75 field5109 = class66.method560("(U3", false);

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field5105 = 0;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
    public static int field5118 = 0;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lwa;")
    private static class75 field5113 = class66.method560("Loaded input handler", false);

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lwa;")
    public static class75 field5111 = class66.method560("Welt", false);

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "Lwa;")
    public static class75 field5126 = field5113;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    private int field5100;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    private int field5114;

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "I")
    private int field5123;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "Lre;")
    public static class262 field5120;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "Ljava/awt/Frame;")
    public static Frame field5117;

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "[I")
    private int[] field5119;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "[[I")
    private int[][] field5112;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "[[I")
    private int[][] field5116;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 8)
    public final void method56(byte arg0) {
        field5127++;
        this.method2064(2042245388);
        if (arg0 != -79) {
            method2063(38, (byte) 109, 121, (class96) null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 439)
    public class299() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 46)
    public static void method2062(byte arg0) {
        field5098 = null;
        field5101 = null;
        field5126 = null;
        field5111 = null;
        field5117 = null;
        field5109 = null;
        field5120 = null;
        field5113 = null;
        int var1 = -31 % ((52 - arg0) / 43);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)[I", line = 64)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            this.method54(-103, (class60) null, false);
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 116);
        field5124++;
        if (this.field878.field3749) {
            int var4 = 0;
            int var5;
            for (var5 = class50.field814[arg1] + this.field5125; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field5122 > var4 && this.field5119[var4] <= var5) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field5119[var4 - 1];
            int var9 = this.field5119[var4];
            if ((this.field5123 + var8) < var5 && var5 < var9 - this.field5123) {
                for (int var10 = 0; var10 < class269.field4644; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field5108 : -this.field5108;
                    int var13;
                    for (var13 = (this.field5114 * var12 >> 12) + class67.field1178[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field5110 && var13 >= this.field5116[var6][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field5116[var6][var11];
                    int var16 = this.field5116[var6][var14];
                    if ((this.field5123 + var16) < var13 && var15 - this.field5123 > var13) {
                        var3[var10] = this.field5112[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class231.method1691(var3, 0, class269.field4644, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBILwc;)V", line = 171)
    public static final void method2063(int arg0, byte arg1, int arg2, class96 arg3) {
        if (arg1 <= 64) {
            field5117 = (Frame) null;
        }
        if (arg3.field3204 == arg0 && arg0 != -1) {
            class28 var4 = class302.method2082(arg0, 26);
            int var5 = var4.field381;
            if (var5 == 1) {
                arg3.field3260 = 0;
                arg3.field3234 = 0;
                arg3.field3268 = arg2;
                arg3.field3270 = 0;
                class292.method2034(arg3.field3234, class279.field4831 == arg3, arg3.field3259, var4, 27, arg3.field3218);
            }
            if (var5 == 2) {
                arg3.field3270 = 0;
            }
        } else if (arg0 == -1 || arg3.field3204 == -1 || class302.method2082(arg0, 23).field383 >= class302.method2082(arg3.field3204, 124).field383) {
            arg3.field3222 = arg3.field3246;
            arg3.field3270 = 0;
            arg3.field3260 = 0;
            arg3.field3234 = 0;
            arg3.field3204 = arg0;
            arg3.field3268 = arg2;
            if (arg3.field3204 != -1) {
                class292.method2034(arg3.field3234, class279.field4831 == arg3, arg3.field3259, class302.method2082(arg3.field3204, 61), 59, arg3.field3218);
            }
        }
        field5106++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILja;Z)V", line = 223)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            method2063(37, (byte) 20, 7, (class96) null);
        }
        field5102++;
        if (arg0 == 0) {
            this.field5110 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field5122 = arg1.method501(0);
        } else if (arg0 == 2) {
            this.field5107 = arg1.method485((byte) -2);
        } else if (arg0 == 3) {
            this.field5115 = arg1.method485((byte) -2);
        } else if (arg0 == 4) {
            this.field5108 = arg1.method485((byte) -2);
        } else if (arg0 == 5) {
            this.field5125 = arg1.method485((byte) -2);
        } else if (arg0 == 6) {
            this.field5099 = arg1.method485((byte) -2);
        } else if (arg0 == 7) {
            this.field5104 = arg1.method485((byte) -2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 334)
    private final void method2064(int arg0) {
        field5121++;
        if (arg0 != 2042245388) {
            method2062((byte) -23);
        }
        Random var2 = new Random((long) this.field5122);
        this.field5112 = new int[this.field5122][this.field5110];
        this.field5119 = new int[this.field5122 + 1];
        this.field5119[0] = 0;
        this.field5114 = 4096 / this.field5110;
        this.field5100 = 4096 / this.field5122;
        this.field5123 = this.field5099 / 2;
        int var3 = this.field5100 / 2;
        int var4 = this.field5114 / 2;
        this.field5116 = new int[this.field5122][this.field5110 + 1];
        for (int var5 = 0; var5 < this.field5122; var5++) {
            if (var5 > 0) {
                int var6 = this.field5100;
                int var7 = (class29.method197(var2, true, 4096) - 2048) * this.field5115 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field5119[var5] = this.field5119[var5 - 1] + var8;
            }
            this.field5116[var5][0] = 0;
            for (int var9 = 0; var9 < this.field5110; var9++) {
                if (var9 > 0) {
                    int var10 = this.field5114;
                    int var11 = (class29.method197(var2, true, 4096) - 2048) * this.field5107 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field5116[var5][var9] = this.field5116[var5][var9 - 1] + var12;
                }
                this.field5112[var5][var9] = this.field5104 <= 0 ? 4096 : 4096 - class29.method197(var2, true, this.field5104);
            }
            this.field5116[var5][this.field5110] = 4096;
        }
        this.field5119[this.field5122] = 4096;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(III)V", line = 415)
    public static final void method2065(int arg0, int arg1, int arg2) {
        if (arg2 != 7604) {
            method2065(13, 36, 45);
        }
        field5103++;
        class156 var3 = class206.method1525(12, arg2 - 40305, arg0);
        var3.method1183(true);
        var3.field2665 = arg1;
    }
}
