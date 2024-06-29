import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class549 {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "J")
    private long field6878 = -1L;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "Lfca;")
    private class661 field6886 = new class661();

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "Lk;")
    public static class66 field6880 = new class66("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "[[F")
    public static float[][] field6888 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "Z")
    public static boolean field6887 = false;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "J")
    private long field6881;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field6891;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method2970(int arg0, Canvas arg1) {
        field6879++;
        Dimension var2 = arg1.getSize();
        class203.method1383(var2.width, var2.height, (byte) 95);
        if (class596.field7567 == arg0) {
            class699.field9263.method889(arg1, class669.field8694, class386.field4933);
        } else {
            class699.field9263.method889(arg1, class134.field1779, class524.field6671);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static final void method2971(int arg0) {
        class296.field3758 = class66.field868.field2212 - (-class66.field868.field2201 - 2);
        class210.field2891 = new String[500];
        field6885++;
        class93.field1290 = class411.field5453.field2212 + class411.field5453.field2201 + 2;
        int var1 = 0;
        if (arg0 != -30820) {
            method2978(null, 38, -63);
        }
        while (var1 < class210.field2891.length) {
            class210.field2891[var1] = "";
            var1++;
        }
        class789.method4318(class659.field8541.method3589(class496.field6338, -22395), false);
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)[Ldg;")
    public static final class20[] method2972(int arg0) {
        field6876++;
        if (arg0 != -2) {
            field6891 = null;
        }
        return new class20[] { class213.field2925, class589.field7472, class170.field2258 };
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
    public static final void method2973(int arg0, byte arg1) {
        if (arg1 != 123) {
            method2973(-113, (byte) 70);
        }
        field6890++;
        class614 var2 = class497.method2759(7, 5977, (long) arg0);
        var2.method3279(false);
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V")
    public static void method2974(int arg0) {
        if (arg0 != 2) {
            method2975(null, (byte) 8);
        }
        field6891 = null;
        field6888 = null;
        field6880 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lha;B)V")
    public static final void method2975(class570 arg0, byte arg1) {
        field6882++;
        int var2 = 0;
        int var3 = 0;
        if (class602.field7657) {
            var2 = class498.method2765((byte) -107);
            var3 = class507.method2806((byte) -86);
        }
        int var4 = class283.field3665 + var2;
        int var5 = class721.field9471 + var3;
        int var6 = class71.field968;
        if (arg1 >= -93) {
            field6889 = 52;
        }
        int var7 = class167.field2225 - 3;
        byte var8 = 20;
        class669.method3623(class71.field968, arg0, class283.field3665 + var2, class659.field8568.method3589(class496.field6338, -22395), var8, (byte) 23, class721.field9471 + var3, class167.field2225);
        int var9 = class737.field9980.method210(0) + var2;
        int var10 = var3 + class737.field9980.method208(-96);
        if (class269.field3555) {
            int var14 = 0;
            for (class403 var15 = (class403) class253.field3440.method3855(0); var15 != null; var15 = (class403) class253.field3440.method3861(true)) {
                int var28 = var14 * 16 + var5 + var8 + 13;
                if ((class283.field3665 + var2) < var9 && class71.field968 + class283.field3665 + var2 > var9 && var10 > var28 - 13 && var28 + 4 > var10 && (var15.field5360 > 1 || ((class765) var15.field5365.field9453.field2279).field10403)) {
                    arg0.method921(class283.field3665 + var2, var28 - 12, class71.field968, 16, class48.field568 | 255 - class282.field3653 << 24, 1);
                }
                var14++;
            }
            if (class223.field3036 != null) {
                int var16 = 0;
                class669.method3623(class650.field8290, arg0, class29.field256, class223.field3036.field5366, var8, (byte) 23, class256.field3472, class400.field5303);
                for (class765 var17 = (class765) class223.field3036.field5365.method3855(0); var17 != null; var17 = (class765) class223.field3036.field5365.method3861(true)) {
                    int var18 = var16 * 16 + (class256.field3472 + var8 + 13);
                    var16++;
                    if (var9 > class29.field256 && class650.field8290 + class29.field256 > var9 && var10 > (var18 - 13) && var18 + 4 > var10 && var17.field10403) {
                        arg0.method921(class29.field256, var18 - 12, class650.field8290, 16, class48.field568 | 255 - class282.field3653 << 24, 1);
                    }
                }
                class343.method1995(class650.field8290, class29.field256, var8, arg0, class256.field3472, class400.field5303, 0);
            }
        } else {
            int var11 = 0;
            for (class765 var12 = (class765) class595.field7563.method3591(0); var12 != null; var12 = (class765) class595.field7563.method3600((byte) 65)) {
                int var13 = (class628.field7982 - var11 - 1) * 16 + var5 + var8 + 13;
                if (var9 > class283.field3665 + var2 && var2 + class71.field968 + class283.field3665 > var9 && var13 - 13 < var10 && var10 < var13 + 4 && var12.field10403) {
                    arg0.method921(class283.field3665 + var2, var13 + -12, class71.field968, 16, class48.field568 | 255 - class282.field3653 << 24, 1);
                }
                var11++;
            }
        }
        class343.method1995(class71.field968, class283.field3665 + var2, var8, arg0, class721.field9471 + var3, class167.field2225, 0);
        if (class269.field3555) {
            int var19 = 0;
            for (class403 var20 = (class403) class253.field3440.method3855(0); var20 != null; var20 = (class403) class253.field3440.method3861(true)) {
                int var24 = class721.field9471 + var19 * 16 + var8 + var3 + 13;
                var19++;
                if (var20.field5360 == 1) {
                    class585.method3132(class283.field3665 + var2, class167.field2225, (class765) var20.field5365.field9453.field2279, 86, var9, class71.field968, class784.field10740 | 0xFF000000, var24, class721.field9471 + var3, class404.field5373 | 0xFF000000, var10, arg0);
                } else {
                    class766.method4164((byte) 119, arg0, class71.field968, class404.field5373 | 0xFF000000, class784.field10740 | 0xFF000000, var24, class721.field9471 + var3, var20, class167.field2225, var10, var9, class283.field3665 + var2);
                }
            }
            if (class223.field3036 != null) {
                int var21 = 0;
                for (class765 var22 = (class765) class223.field3036.field5365.method3855(0); var22 != null; var22 = (class765) class223.field3036.field5365.method3861(true)) {
                    int var23 = class256.field3472 + 13 - (-var8 - var21 * 16);
                    var21++;
                    class585.method3132(class29.field256, class400.field5303, var22, 87, var9, class650.field8290, class784.field10740 | 0xFF000000, var23, class256.field3472, class404.field5373 | 0xFF000000, var10, arg0);
                }
                class493.method2748(class256.field3472, class650.field8290, class400.field5303, 83, class29.field256);
            }
        } else {
            int var25 = 0;
            for (class765 var26 = (class765) class595.field7563.method3591(0); var26 != null; var26 = (class765) class595.field7563.method3600((byte) 35)) {
                int var27 = var5 + var8 - (-13 - (class628.field7982 - 1 + -var25) * 16);
                var25++;
                class585.method3132(var4, var7, var26, 85, var9, var6, class784.field10740 | 0xFF000000, var27, var5, class404.field5373 | 0xFF000000, var10, arg0);
            }
        }
        class493.method2748(class721.field9471 + var3, class71.field968, class167.field2225, 29, class283.field3665 + var2);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILmc;)V")
    private final void method2976(int arg0, class234 arg1) {
        this.field6881 = arg1.method1516(-11290);
        field6877++;
        this.field6878 = arg1.method1516(-11290);
        int var3 = 96 / ((-arg0 - 57) / 35);
        for (int var4 = arg1.method1509(true); var4 != 0; var4 = arg1.method1509(true)) {
            class504 var5;
            if (var4 == 1) {
                var5 = new class157();
            } else if (var4 == 4) {
                var5 = new class663();
            } else if (var4 == 3) {
                var5 = new class643();
            } else if (var4 == 2) {
                var5 = new class432();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var5.method1006(1243, arg1);
            this.field6886.method3593(var5, 15);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLqc;)V")
    public final void method2977(byte arg0, class400 arg1) {
        field6883++;
        if (this.field6881 != arg1.field4108 || this.field6878 != arg1.field5290) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg1.field4108 + " updateNum:" + arg1.field5290 + " delta.clanHash:" + this.field6881 + " updateNum:" + this.field6878);
        }
        class504 var3 = (class504) this.field6886.method3591(0);
        if (arg0 != -116) {
            return;
        }
        while (var3 != null) {
            var3.method1003(arg1, false);
            var3 = (class504) this.field6886.method3600((byte) 41);
        }
        arg1.field5290++;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([Llq;II)V")
    public static final void method2978(class210[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class210 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2887;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2887 > (var7 & 0x1) + var6) {
                class210 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2978(arg0, arg1, var4 - 1);
        method2978(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lmc;)V")
    public class549(class234 arg0) {
        this.method2976(-15, arg0);
    }
}
