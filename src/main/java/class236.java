import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class236 extends class285 {

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    private int field3771 = 1024;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    private int field3765 = 81;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    private int field3769 = 8;

    @OriginalMember(owner = "client!gl", name = "fb", descriptor = "I")
    private int field3782 = 409;

    @OriginalMember(owner = "client!gl", name = "ib", descriptor = "I")
    private int field3785 = 1024;

    @OriginalMember(owner = "client!gl", name = "bb", descriptor = "I")
    private int field3778 = 4;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    private int field3766 = 0;

    @OriginalMember(owner = "client!gl", name = "kb", descriptor = "I")
    private int field3787 = 204;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "Z")
    public static boolean field3767 = false;

    @OriginalMember(owner = "client!gl", name = "hb", descriptor = "I")
    public static int field3784 = 0;

    @OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!gl", name = "nb", descriptor = "J")
    public static long field3790 = 0L;

    @OriginalMember(owner = "client!gl", name = "mb", descriptor = "[I")
    public static int[] field3789 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!gl", name = "Z", descriptor = "I")
    private int field3776;

    @OriginalMember(owner = "client!gl", name = "db", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!gl", name = "jb", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!gl", name = "lb", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!gl", name = "gb", descriptor = "[I")
    private int[] field3783;

    @OriginalMember(owner = "client!gl", name = "ab", descriptor = "[[I")
    private int[][] field3777;

    @OriginalMember(owner = "client!gl", name = "cb", descriptor = "[[I")
    private int[][] field3779;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "(I)V", line = 9)
    private final void method1706(int arg0) {
        field3770++;
        Random var2 = new Random((long) this.field3769);
        this.field3777 = new int[this.field3769][this.field3778 + 1];
        this.field3786 = 4096 / this.field3769;
        this.field3776 = 4096 / this.field3778;
        this.field3779 = new int[this.field3769][this.field3778];
        this.field3783 = new int[this.field3769 + 1];
        this.field3783[0] = 0;
        this.field3774 = this.field3765 / 2;
        int var3 = this.field3776 / 2;
        if (arg0 != -8229) {
            return;
        }
        int var4 = this.field3786 / 2;
        for (int var5 = 0; var5 < this.field3769; var5++) {
            if (var5 > 0) {
                int var6 = this.field3786;
                int var7 = (class158.method1138(4096, true, var2) - 2048) * this.field3787 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3783[var5] = this.field3783[var5 - 1] + var8;
            }
            this.field3777[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3778; var9++) {
                if (var9 > 0) {
                    int var10 = this.field3776;
                    int var11 = (class158.method1138(4096, true, var2) - 2048) * this.field3782 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3777[var5][var9] = this.field3777[var5][var9 - 1] + var12;
                }
                this.field3779[var5][var9] = this.field3771 > 0 ? 4096 - class158.method1138(this.field3771, true, var2) : 4096;
            }
            this.field3777[var5][this.field3778] = 4096;
        }
        this.field3783[this.field3769] = 4096;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Lah;", line = 79)
    public static final class32 method1707(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class32 var4 = var3.field3349;
            var3.field3349 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjj;I)V", line = 90)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field3772++;
        if (arg2 == 0) {
            this.field3778 = arg1.method286((byte) -92);
        } else if (arg2 == 1) {
            this.field3769 = arg1.method286((byte) -95);
        } else if (arg2 == 2) {
            this.field3782 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field3787 = arg1.method271(21081);
        } else if (arg2 == 4) {
            this.field3785 = arg1.method271(21081);
        } else if (arg2 == 5) {
            this.field3766 = arg1.method271(21081);
        } else if (arg2 == 6) {
            this.field3765 = arg1.method271(21081);
        } else if (arg2 == 7) {
            this.field3771 = arg1.method271(21081);
        }
        if (!arg0) {
            this.field3783 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 249)
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "(I)V", line = 180)
    public static void method1708(int arg0) {
        if (arg0 != 13) {
            method1707(-68, 59, 26);
        }
        field3789 = null;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V", line = 194)
    public final void method361(int arg0) {
        this.method1706(-8229);
        field3768++;
        int var2 = -88 % ((arg0 - 42) / 36);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(JB)V", line = 214)
    public static final void method1709(long arg0, byte arg1) {
        field3775++;
        if (arg0 == 0L) {
            return;
        }
        class173.field2871++;
        class194.field3175.method2375(59, arg1 ^ 0x2C);
        class194.field3175.method255(false, arg0);
        if (arg1 != 44) {
            field3790 = -114L;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", line = 254)
    public static final void method1710(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        field3788++;
        for (int var6 = 99; var6 > 0; var6--) {
            class61.field884[var6] = class61.field884[var6 - 1];
            class80.field1122[var6] = class80.field1122[var6 - 1];
            class322.field4992[var6] = class322.field4992[var6 - 1];
            class100.field1459[var6] = class100.field1459[var6 - 1];
            class319.field4951[var6] = class319.field4951[var6 - 1];
        }
        class80.field1122[0] = arg2;
        class322.field4992[0] = arg0;
        class61.field884[0] = arg1;
        class319.field4951[0] = arg5;
        class229.field3645++;
        class146.field2277 = class186.field3074;
        if (arg4 > 0) {
            method1709(126L, (byte) -56);
        }
        class100.field1459[0] = arg3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)[I", line = 287)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.method60(false, -3);
        }
        int[] var3 = this.field4573.method1116(105, arg1);
        field3780++;
        if (this.field4573.field2420) {
            int var4 = 0;
            int var5;
            for (var5 = class27.field382[arg1] + this.field3766; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field3769 && this.field3783[var4] <= var5) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field3783[var4 - 1];
            int var9 = this.field3783[var4];
            if ((this.field3774 + var8) < var5 && var9 - this.field3774 > var5) {
                for (int var10 = 0; var10 < class287.field4599; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field3785 : -this.field3785;
                    int var13;
                    for (var13 = (this.field3776 * var12 >> 12) + class48.field669[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field3778 && var13 >= this.field3777[var6][var11]) {
                        var11++;
                    }
                    int var14 = this.field3777[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field3777[var6][var15];
                    if (var13 > (this.field3774 + var16) && var13 < var14 - this.field3774) {
                        var3[var10] = this.field3779[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class9.method49(var3, 0, class287.field4599, 0);
            }
        }
        return var3;
    }
}
