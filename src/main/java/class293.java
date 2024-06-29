import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class293 extends class117 {

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    private int field4696 = 4096;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field4690 = 4096;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    private int field4701 = 4096;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field4693 = -1;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "Ldk;")
    public static class251 field4700;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4695;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "[[[I")
    public static int[][][] field4703;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 == 255) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field4696 = arg0.method1142(arg1 ^ -19175);
                    }
                } else {
                    this.field4701 = arg0.method1142(-18970);
                }
            } else {
                this.field4690 = arg0.method1142(arg1 ^ -19175);
            }
            ++field4694;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILbc;II)V")
    public static final void method1948(int arg0, class299 arg1, int arg2, int arg3) {
        if (arg1.field699 == arg3 && ~arg3 != 0) {
            class307 var4 = class22.method121(arg3, true);
            int var5 = var4.field4893;
            if (var5 == 1) {
                arg1.field619 = 0;
                arg1.field688 = 1;
                arg1.field686 = 0;
                arg1.field617 = 0;
                arg1.field717 = arg2;
                class274.method1838(arg1.field710, class239.field3829 == arg1, var4, arg1.field686, (byte) -110, arg1.field637);
            }
            if (var5 == 2) {
                arg1.field617 = 0;
            }
        } else if (arg3 == -1 || ~arg1.field699 == 0 || class22.method121(arg3, true).field4898 >= class22.method121(arg1.field699, true).field4898) {
            arg1.field686 = 0;
            arg1.field688 = 1;
            arg1.field617 = 0;
            arg1.field636 = arg1.field674;
            arg1.field717 = arg2;
            arg1.field619 = 0;
            arg1.field699 = arg3;
            if (~arg1.field699 != 0) {
                class274.method1838(arg1.field710, class239.field3829 == arg1, class22.method121(arg1.field699, true), arg1.field686, (byte) -106, arg1.field637);
            }
        }
        if (arg0 == 1875869548) {
            ++field4702;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class293() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(III)V")
    public static final void method1949(int arg0, int arg1, int arg2) {
        if (~class120.field1919 == -3) {
            class71.field1207 = arg2;
            class264.field4245 = arg0;
        }
        class20.field240 = (float) arg0;
        ++field4697;
        if (arg1 > 46) {
            class90.field1456 = (float) arg2;
            class296.method1966(-116);
            class221.field3610 = true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IJ)V")
    public static final void method1950(int arg0, long arg1) {
        int var3 = 112 % ((10 - arg0) / 34);
        ++field4704;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(III)I")
    public static final int method1951(int arg0, int arg1, int arg2) {
        if (~arg2 < ~arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        ++field4699;
        if (arg1 != -14261) {
            field4695 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILdk;)V")
    public static final void method1952(int arg0, class251 arg1) {
        class11.field117 = arg1;
        if (arg0 != 0) {
            method1954((byte) 42);
        }
        ++field4698;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int[][] var3 = super.field1886.method419(arg0, (byte) 102);
        ++field4706;
        if (super.field1886.field1022) {
            int[][] var4 = this.method838(0, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class168.field2737; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field4690 * var12 >> 12;
                    var9[var11] = this.field4701 * var13 >> 12;
                    var10[var11] = this.field4696 * var14 >> 12;
                } else {
                    var8[var11] = this.field4690;
                    var9[var11] = this.field4701;
                    var10[var11] = this.field4696;
                }
            }
        }
        int var15 = 109 / ((arg1 - 37) / 38);
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "(I)V")
    public static final void method1953(int arg0) {
        ++field4692;
        class309.field4932.method151(29051);
        int var1 = 76 % ((arg0 - -28) / 60);
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class256.field4151[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; ++var3) {
            class308.field4928[var3] = 0L;
        }
        class276.field4435 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
    public static void method1954(byte arg0) {
        field4703 = null;
        field4695 = null;
        field4700 = null;
        if (arg0 <= 52) {
            method1951(-45, -69, 28);
        }
    }
}
