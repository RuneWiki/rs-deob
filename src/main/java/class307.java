import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class307 extends class303 {

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    private int field4825 = 8;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    private int field4828 = 1024;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    private int field4831 = 204;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    private int field4836 = 4;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    private int field4833 = 0;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    private int field4827 = 409;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    private int field4844 = 1024;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    private int field4840 = 81;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "[[I")
    public static int[][] field4823 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "Z")
    public static boolean field4846 = true;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field4839 = -2;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    private int field4832;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    private int field4834;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Lgk;")
    public static class7 field4822;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "[I")
    private int[] field4837;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "[[B")
    public static byte[][] field4845;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "[[I")
    private int[][] field4835;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "[[I")
    private int[][] field4842;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 7)
    public final void method70(int arg0) {
        if (arg0 < 13) {
            this.method65(63, (class101) null, -28);
        }
        this.method2124(-20943);
        field4829++;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 21)
    public class307() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/lang/String;)I", line = 38)
    public static final int method2123(byte arg0, String arg1) {
        field4830++;
        if (arg0 != -122) {
            field4822 = (class7) null;
        }
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V", line = 51)
    private final void method2124(int arg0) {
        if (arg0 != -20943) {
            this.method2124(-65);
        }
        Random var2 = new Random((long) this.field4825);
        this.field4837 = new int[this.field4825 + 1];
        this.field4832 = 4096 / this.field4836;
        this.field4835 = new int[this.field4825][this.field4836];
        int var3 = this.field4832 / 2;
        this.field4842 = new int[this.field4825][this.field4836 + 1];
        field4826++;
        this.field4834 = this.field4840 / 2;
        this.field4837[0] = 0;
        this.field4843 = 4096 / this.field4825;
        int var4 = this.field4843 / 2;
        for (int var5 = 0; var5 < this.field4825; var5++) {
            if (var5 > 0) {
                int var6 = this.field4843;
                int var7 = (class86.method621((byte) -104, var2, 4096) - 2048) * this.field4831 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4837[var5] = this.field4837[var5 - 1] + var8;
            }
            this.field4842[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4836; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4832;
                    int var11 = (class86.method621((byte) 123, var2, 4096) - 2048) * this.field4827 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4842[var5][var9] = this.field4842[var5][var9 - 1] + var12;
                }
                this.field4835[var5][var9] = this.field4844 > 0 ? 4096 - class86.method621((byte) -37, var2, this.field4844) : 4096;
            }
            this.field4842[var5][this.field4836] = 4096;
        }
        this.field4837[this.field4825] = 4096;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[I", line = 116)
    public final int[] method67(int arg0, int arg1) {
        field4838++;
        int[] var3 = this.field4763.method394(arg0 ^ arg0, arg1);
        if (this.field4763.field863) {
            int var4 = 0;
            int var5;
            for (var5 = class36.field591[arg1] + this.field4833; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4825 && this.field4837[var4] <= var5) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = this.field4837[var4 - 1];
            int var8 = this.field4837[var4];
            int var9 = var4 - 1;
            if (this.field4834 + var7 < var5 && var5 < (var8 - this.field4834)) {
                for (int var10 = 0; var10 < class70.field1108; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field4828 : -this.field4828;
                    int var13;
                    for (var13 = (this.field4832 * var12 >> 12) + class291.field4427[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field4836 && var13 >= this.field4842[var9][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field4842[var9][var11];
                    int var16 = this.field4842[var9][var14];
                    if (this.field4834 + var16 < var13 && (var15 - this.field4834) > var13) {
                        var3[var10] = this.field4835[var9][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class271.method1955(var3, 0, class70.field1108, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V", line = 212)
    public static void method2125(int arg0) {
        field4845 = (byte[][]) null;
        int var1 = 69 % ((arg0 - 59) / 57);
        field4822 = null;
        field4823 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILpe;I)V", line = 232)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            this.method65(-38, (class101) null, 36);
        }
        if (arg2 == 0) {
            this.field4836 = arg1.method741(45);
        } else if (arg2 == 1) {
            this.field4825 = arg1.method741(73);
        } else if (arg2 == 2) {
            this.field4827 = arg1.method731(false);
        } else if (arg2 == 3) {
            this.field4831 = arg1.method731(false);
        } else if (arg2 == 4) {
            this.field4828 = arg1.method731(false);
        } else if (arg2 == 5) {
            this.field4833 = arg1.method731(false);
        } else if (arg2 == 6) {
            this.field4840 = arg1.method731(false);
        } else if (arg2 == 7) {
            this.field4844 = arg1.method731(false);
        }
        field4841++;
    }
}
