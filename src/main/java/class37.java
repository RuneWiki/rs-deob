import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class37 extends class64 {

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "I")
    private int field720 = 1638;

    @OriginalMember(owner = "client!dh", name = "lb", descriptor = "I")
    private int field723 = 4;

    @OriginalMember(owner = "client!dh", name = "mb", descriptor = "I")
    private int field724 = 4;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    private int field718 = 0;

    @OriginalMember(owner = "client!dh", name = "rb", descriptor = "[I")
    private int[] field729 = new int[512];

    @OriginalMember(owner = "client!dh", name = "ub", descriptor = "Z")
    private boolean field732 = true;

    @OriginalMember(owner = "client!dh", name = "wb", descriptor = "I")
    private int field734 = 4;

    @OriginalMember(owner = "client!dh", name = "ob", descriptor = "Lqf;")
    public static class150 field726 = null;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "Lsg;")
    public static class169 field714 = class165.method1060("(U", 1536);

    @OriginalMember(owner = "client!dh", name = "yb", descriptor = "[I")
    public static int[] field736 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
    public static int field721 = 0;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!dh", name = "kb", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!dh", name = "nb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!dh", name = "qb", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!dh", name = "sb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dh", name = "tb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!dh", name = "vb", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!dh", name = "zb", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "[I")
    private int[] field717;

    @OriginalMember(owner = "client!dh", name = "pb", descriptor = "[I")
    private int[] field727;

    @OriginalMember(owner = "client!dh", name = "xb", descriptor = "[Lgd;")
    public static class59[] field735;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)I")
    private final int method239(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field713;
        int var6 = arg1 & -4096;
        int var7 = arg3 & -4096;
        int var8 = arg1 - var6;
        int var9 = arg3 - var7;
        int var10 = arg2 & -4096;
        int var11 = var7 >> 12;
        int var12 = var11 - -1;
        int var13 = var6 >> 12;
        int var14 = -4096 & arg0;
        int var15 = var11 & 255;
        if (var10 >> 12 <= var12) {
            var12 = 0;
        }
        int var16 = var13 + 1;
        int var17 = var13 & 255;
        if (~(var14 >> 12) >= ~var16) {
            var16 = 0;
        }
        int var18 = var16 & 255;
        int var19 = this.field729[this.field729[var15] + var17] % 4;
        int var20 = var12 & 255;
        int var21 = this.field729[this.field729[var20] + var17] % 4;
        int var22 = this.field729[this.field729[var15] + var18] % 4;
        int var23 = this.field729[this.field729[var20] + var18] % 4;
        int var24 = class31.method219(var9, var8, class148.field2739[var19], false);
        int var25 = class31.method219(var9, var8 + -4096, class148.field2739[var22], false);
        int var26 = class31.method219(var9 - 4096, var8, class148.field2739[var21], false);
        int var27 = class31.method219(var9 + -4096, var8 + -4096, class148.field2739[var23], false);
        int var28 = class88.method520(var8, (byte) -69);
        int var29 = class88.method520(var9, (byte) -69);
        int var30 = client.method200(4096, var24, var25, var28);
        int var31 = client.method200(4096, var26, var27, var28);
        int var32 = -14 / ((-62 - arg4) / 32);
        return client.method200(4096, var30, var31, var29);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method240(byte arg0) {
        if (class149.field2762 != null) {
            class149.field2762.method1218(-25666);
        }
        if (class20.field438 != null) {
            class20.field438.method1218(-25666);
        }
        if (arg0 <= -59) {
            ++field728;
        }
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(I)V")
    public static void method241(int arg0) {
        field714 = null;
        field726 = null;
        field736 = null;
        if (arg0 != 30048) {
            method241(116);
        }
        field735 = null;
    }

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "(I)V")
    private final void method242(int arg0) {
        if (arg0 <= 107) {
            method241(-12);
        }
        ++field737;
        if (this.field720 <= 0) {
            if (this.field727 != null && this.field727.length == this.field723) {
                this.field717 = new int[this.field723];
                for (int var2 = 0; ~var2 > ~this.field723; ++var2) {
                    this.field717[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
                }
                return;
            }
        } else {
            this.field717 = new int[this.field723];
            this.field727 = new int[this.field723];
            for (int var3 = 0; ~this.field723 < ~var3; ++var3) {
                this.field727[var3] = (int) (4096.0D * Math.pow((double) (this.field720 / 4096), (double) var3));
                this.field717[var3] = (int) (Math.pow(2.0D, (double) var3) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "(I)V")
    private final void method243(int arg0) {
        ++field715;
        Random var2 = new Random((long) this.field718);
        if (arg0 != -1) {
            field714 = null;
        }
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field729[var3] = -1;
        }
        for (int var4 = 0; ~var4 > -256; ++var4) {
            int var5;
            do {
                var5 = class45.method283(-1838102752, var2, 255);
            } while (this.field729[var5] != -1);
            this.field729[var5 + 255] = this.field729[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLsg;Lqf;)Lsg;")
    public static final class169 method244(byte arg0, class169 arg1, class150 arg2) {
        if (arg0 < 88) {
            return null;
        } else {
            ++field719;
            if (~arg1.method1116(-248, field714) != 0) {
                while (true) {
                    int var3 = arg1.method1116(-248, class152.field2928);
                    if (~var3 == 0) {
                        while (true) {
                            int var4 = arg1.method1116(-248, class201.field3929);
                            if (var4 == -1) {
                                while (true) {
                                    int var5 = arg1.method1116(-248, class150.field2841);
                                    if (var5 == -1) {
                                        while (true) {
                                            int var6 = arg1.method1116(-248, class177.field3459);
                                            if (var6 == -1) {
                                                while (true) {
                                                    int var7 = arg1.method1116(-248, class125.field2295);
                                                    if (var7 == -1) {
                                                        while (true) {
                                                            int var8 = arg1.method1116(-248, class95.field1810);
                                                            if (~var8 == 0) {
                                                                return arg1;
                                                            }
                                                            class169 var9 = class45.field838;
                                                            if (class5.field113 != null) {
                                                                var9 = class204.method1325(class5.field113.field3297, 99);
                                                                try {
                                                                    if (class5.field113.field3299 != null) {
                                                                        byte[] var10 = ((String) class5.field113.field3299).getBytes("ISO-8859-1");
                                                                        var9 = class65.method413(var10, 0, 0, var10.length);
                                                                    }
                                                                } catch (UnsupportedEncodingException var11) {
                                                                }
                                                            }
                                                            arg1 = class165.method1058(0, new class169[] { arg1.method1132(0, 125, var8), var9, arg1.method1106(false, var8 + 4) });
                                                        }
                                                    }
                                                    arg1 = class165.method1058(0, new class169[] { arg1.method1132(0, 110, var7), class161.method1034(class193.method1277(arg2, 4, -2701), 19661088), arg1.method1106(false, var7 + 2) });
                                                }
                                            }
                                            arg1 = class165.method1058(0, new class169[] { arg1.method1132(0, 108, var6), class161.method1034(class193.method1277(arg2, 3, -2701), 19661088), arg1.method1106(false, var6 + 2) });
                                        }
                                    }
                                    arg1 = class165.method1058(0, new class169[] { arg1.method1132(0, 103, var5), class161.method1034(class193.method1277(arg2, 2, -2701), 19661088), arg1.method1106(false, var5 - -2) });
                                }
                            }
                            arg1 = class165.method1058(0, new class169[] { arg1.method1132(0, 125, var4), class161.method1034(class193.method1277(arg2, 1, -2701), 19661088), arg1.method1106(false, var4 + 2) });
                        }
                    }
                    arg1 = class165.method1058(0, new class169[] { arg1.method1132(0, 112, var3), class161.method1034(class193.method1277(arg2, 0, -2701), 19661088), arg1.method1106(false, var3 - -2) });
                }
            } else {
                return arg1;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = -83 / ((arg0 - -60) / 36);
        ++field716;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field723 = arg1.method819((byte) 22);
            } else {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field734 = this.field724 = arg1.method819((byte) 22);
                        return;
                    }
                    if (~arg2 == -5) {
                        this.field718 = arg1.method819((byte) 22);
                        return;
                    }
                    if (arg2 == 5) {
                        this.field734 = arg1.method819((byte) 22);
                        return;
                    }
                    if (~arg2 == -7) {
                        this.field724 = arg1.method819((byte) 22);
                        return;
                    }
                } else {
                    this.field720 = arg1.method818(1629612104);
                    if (this.field720 < 0) {
                        this.field727 = new int[this.field723];
                        for (int var6 = 0; this.field723 > var6; ++var6) {
                            this.field727[var6] = arg1.method818(1629612104);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field732 = arg1.method819((byte) 22) == 1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class37() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            this.field727 = null;
        }
        ++field725;
        int[] var3 = super.field1192.method19((byte) 125, arg0);
        if (super.field1192.field75) {
            int var4 = this.field734 << 12;
            int var5 = this.field724 << 12;
            int var6 = class189.field3699[arg0] * this.field724;
            for (int var7 = 0; ~class147.field2715 < ~var7; ++var7) {
                int var8 = 0;
                int var9 = class185.field3607[var7] * this.field734;
                for (int var10 = 0; ~var10 > ~this.field723; ++var10) {
                    int var11 = this.field717[var10];
                    int var12 = this.field727[var10];
                    int var13 = this.method239(var4 * var11 >> 12, var9 * var11 >> 12, var5 * var11 >> 12, var6 * var11 >> 12, -14);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field732) {
                    var8 = (var8 >> 1) + 2048;
                }
                var3[var7] = var8;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (arg0) {
            method240((byte) 97);
        }
        this.method243(-1);
        this.method242(116);
        ++field733;
    }
}
