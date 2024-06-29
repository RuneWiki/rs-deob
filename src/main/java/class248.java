import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class248 extends class177 {

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    private int field3727 = 8;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    private int field3728 = 1024;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    private int field3729 = 4;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    private int field3730 = 0;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    private int field3723 = 81;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    private int field3733 = 1024;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    private int field3735 = 409;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    private int field3736 = 204;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "[[I")
    public static int[][] field3717 = new int[104][104];

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "Llb;")
    public static class211 field3724;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "[I")
    private int[] field3718;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[[I")
    private int[][] field3721;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[[I")
    private int[][] field3725;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 5)
    public static final void method1722(boolean arg0, int arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field3734++;
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class291.field4576; var6++) {
            class274 var7 = class225.method1603(var6, arg1);
            if ((!arg0 || var7.field4161) && var7.field4156 == -1 && var7.field4177 == -1 && var7.field4179 == 0 && var7.field4149.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class125.field1980 = -1;
                    class322.field5001 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class125.field1980 = var4;
        class324.field5054 = 0;
        class322.field5001 = var5;
        String[] var10 = new String[class125.field1980];
        for (int var11 = arg1; var11 < class125.field1980; var11++) {
            var10[var11] = class225.method1603(var5[var11], 0).field4149;
        }
        class294.method2076(class322.field5001, var10, (byte) -119);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I", line = 74)
    public final int[] method95(int arg0, int arg1) {
        field3726++;
        if (arg0 >= -52) {
            method1722(true, -58, (String) null);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -28);
        if (this.field2652.field3287) {
            int var4 = 0;
            int var5;
            for (var5 = class260.field3858[arg1] + this.field3730; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field3727 && this.field3718[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = this.field3718[var4];
            int var8 = this.field3718[var4 - 1];
            int var9 = var4 - 1;
            if (var5 > (this.field3716 + var8) && var5 < (var7 - this.field3716)) {
                for (int var10 = 0; var10 < class287.field4415; var10++) {
                    int var11 = var6 ? this.field3733 : -this.field3733;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field3719 * var11 >> 12) + class179.field2684[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3729 > var12 && this.field3721[var9][var12] <= var13) {
                        var12++;
                    }
                    int var14 = this.field3721[var9][var12];
                    int var15 = var12 - 1;
                    int var16 = this.field3721[var9][var15];
                    if (var13 > (var16 + this.field3716) && var13 < var14 - this.field3716) {
                        var3[var10] = this.field3725[var9][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class151.method1116(var3, 0, class287.field4415, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 179)
    public static void method1723(boolean arg0) {
        field3717 = (int[][]) null;
        if (!arg0) {
            method1722(false, -45, (String) null);
        }
        field3724 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lhb;II)V", line = 221)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3729 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field3727 = arg0.method273(65280);
        } else if (arg2 == 2) {
            this.field3735 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field3736 = arg0.method300(-1394191632);
        } else if (arg2 == 4) {
            this.field3733 = arg0.method300(-1394191632);
        } else if (arg2 == 5) {
            this.field3730 = arg0.method300(-1394191632);
        } else if (arg2 == 6) {
            this.field3723 = arg0.method300(arg1 - 1394173571);
        } else if (arg2 == 7) {
            this.field3728 = arg0.method300(arg1 ^ 0x5319EB83);
        }
        if (arg1 != -18061) {
            this.field3733 = 67;
        }
        field3737++;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 325)
    public class248() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)I", line = 295)
    public static final int method1724(int arg0) {
        if (arg0 != 14183) {
            method1724(-23);
        }
        field3731++;
        return 6;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 316)
    public final void method465(int arg0) {
        this.method1725(18076);
        field3722++;
        int var2 = 27 / ((arg0 + 6) / 43);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 346)
    private final void method1725(int arg0) {
        field3732++;
        Random var2 = new Random((long) this.field3727);
        this.field3719 = 4096 / this.field3729;
        this.field3725 = new int[this.field3727][this.field3729];
        this.field3721 = new int[this.field3727][this.field3729 + 1];
        int var3 = this.field3719 / 2;
        this.field3716 = this.field3723 / 2;
        this.field3718 = new int[this.field3727 + 1];
        this.field3718[0] = 0;
        this.field3720 = 4096 / this.field3727;
        int var4 = this.field3720 / 2;
        if (arg0 != 18076) {
            return;
        }
        for (int var5 = 0; var5 < this.field3727; var5++) {
            if (var5 > 0) {
                int var6 = this.field3720;
                int var7 = (class66.method561(true, var2, 4096) - 2048) * this.field3736 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3718[var5] = this.field3718[var5 - 1] + var8;
            }
            this.field3721[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3729; var9++) {
                if (var9 > 0) {
                    int var10 = this.field3719;
                    int var11 = (class66.method561(true, var2, 4096) - 2048) * this.field3735 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3721[var5][var9] = this.field3721[var5][var9 - 1] + var12;
                }
                this.field3725[var5][var9] = this.field3728 > 0 ? 4096 - class66.method561(true, var2, this.field3728) : 4096;
            }
            this.field3721[var5][this.field3729] = 4096;
        }
        this.field3718[this.field3727] = 4096;
    }
}
