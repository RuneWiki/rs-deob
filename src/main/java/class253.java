import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class253 extends class17 {

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "I")
    private int field4410 = 0;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "[S")
    private short[] field4405 = new short[257];

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "Lsf;")
    public static class108 field4414 = class140.method973(255, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "[I")
    public static int[] field4418 = new int[1000];

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "[I")
    private int[] field4407;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "[I")
    private int[] field4413;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "[[I")
    private int[][] field4416;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 5)
    public class253() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V", line = 13)
    public static final void method1787(int arg0) {
        field4409++;
        int var1 = 0;
        int[] var2 = new int[class197.field3553];
        if (arg0 != 1) {
            field4414 = (class108) null;
        }
        for (int var3 = 0; var3 < class197.field3553; var3++) {
            class145 var4 = class144.method994(true, var3);
            if (var4.field2595 >= 0 || var4.field2591 >= 0) {
                var2[var1++] = var3;
            }
        }
        class196.field3543 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class196.field3543[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLrm;I)V", line = 57)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4410 = arg1.method1731(true);
            this.field4416 = new int[arg1.method1731(true)][2];
            for (int var4 = 0; var4 < this.field4416.length; var4++) {
                this.field4416[var4][0] = arg1.method1712(-1);
                this.field4416[var4][1] = arg1.method1712(arg0 + 113);
            }
        }
        if (arg0 != -114) {
            this.field4410 = 110;
        }
        field4415++;
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V", line = 86)
    private final void method1788(int arg0) {
        field4417++;
        int[] var2 = this.field4416[1];
        int[] var3 = this.field4416[0];
        int[] var4 = this.field4416[this.field4416.length - 2];
        int[] var5 = this.field4416[this.field4416.length - 1];
        this.field4413 = new int[] { var3[0] + var3[0] - var2[0], var3[1] + -var2[1] + var3[1] };
        this.field4407 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + -var5[1] + var4[1] };
        if (arg0 != 31135) {
            this.field4413 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V", line = 106)
    public final void method116(boolean arg0) {
        if (this.field4416 == null) {
            this.field4416 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field4408++;
        if (this.field4416.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4410 == 2) {
            this.method1788(31135);
        }
        class271.method1959(1);
        this.method1789(arg0);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)V", line = 126)
    private final void method1789(boolean arg0) {
        if (!arg0) {
            field4414 = (class108) null;
        }
        int var2 = this.field4410;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; (this.field4416.length - 1) > var5 && this.field4416[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4416[var5];
                int[] var7 = this.field4416[var5 - 1];
                int var8 = this.method1791(var5 - 2, -100)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var12 = var9 - var8;
                int var13 = this.method1791(var5 + 1, -55)[1];
                int var14 = var13 + var10 - var8 - var9;
                int var15 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var16 = var8 - var10 - var14;
                int var17 = var15 * var15 >> 12;
                int var18 = (var14 * var15 >> 12) * var17 >> 12;
                int var19 = var16 * var17 >> 12;
                int var20 = var12 * var15 >> 12;
                int var21 = var19 + var20 + var18 + var10;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field4405[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; this.field4416.length - 1 > var24 && var23 >= this.field4416[var24][0]; var24++) {
                }
                int[] var25 = this.field4416[var24 - 1];
                int[] var26 = this.field4416[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - class256.field4505[var27 >> 5 & 0xFF] >> 1;
                int var29 = 4096 - var28;
                int var30 = var25[1] * var29 + var26[1] * var28 >> 12;
                if (var30 <= -32768) {
                    var30 = -32767;
                }
                if (var30 >= 32768) {
                    var30 = 32767;
                }
                this.field4405[var22] = (short) var30;
            }
        } else {
            for (int var31 = 0; var31 < 257; var31++) {
                int var32 = var31 << 4;
                int var33;
                for (var33 = 1; (this.field4416.length - 1) > var33 && var32 >= this.field4416[var33][0]; var33++) {
                }
                int[] var34 = this.field4416[var33 - 1];
                int[] var35 = this.field4416[var33];
                int var36 = (var32 - var34[0] << 12) / (var35[0] - var34[0]);
                int var37 = 4096 - var36;
                int var38 = var34[1] * var37 + var35[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4405[var31] = (short) var38;
            }
        }
        field4411++;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)[I", line = 319)
    public final int[] method120(int arg0, int arg1) {
        field4412++;
        if (arg0 >= -95) {
            method1787(103);
        }
        int[] var3 = this.field217.method1698(-117, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(71, 0, arg1);
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4405[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V", line = 366)
    public static void method1790(byte arg0) {
        int var1 = -20 % ((arg0 - 26) / 39);
        field4418 = null;
        field4414 = null;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(II)[I", line = 375)
    private final int[] method1791(int arg0, int arg1) {
        if (arg1 >= -3) {
            this.field4407 = (int[]) null;
        }
        field4406++;
        if (arg0 < 0) {
            return this.field4413;
        } else if (arg0 < this.field4416.length) {
            return this.field4416[arg0];
        } else {
            return this.field4407;
        }
    }
}
