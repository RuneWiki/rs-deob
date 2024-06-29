import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class299 extends class177 {

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    private int field4688 = 0;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "[S")
    private short[] field4701 = new short[257];

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field4697 = 0;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[Lng;")
    public static class162[] field4689 = new class162[14];

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4693 = " from your friend list first.";

    @OriginalMember(owner = "client!be", name = "V", descriptor = "Lta;")
    public static class197 field4706 = new class197(64);

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    public static int field4710 = 0;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "[I")
    public static int[] field4709 = new int[200];

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!be", name = "W", descriptor = "Lek;")
    public static class184 field4707;

    @OriginalMember(owner = "client!be", name = "X", descriptor = "Llb;")
    public static class211 field4708;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "[I")
    private int[] field4699;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "[I")
    private int[] field4702;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "[[I")
    private int[][] field4698;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lhb;II)V", line = 5)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field4704++;
        if (arg1 != -18061) {
            method2101(true);
        }
        if (arg2 != 0) {
            return;
        }
        this.field4688 = arg0.method273(arg1 ^ 0xFFFF4673);
        this.field4698 = new int[arg0.method273(65280)][2];
        for (int var4 = 0; var4 < this.field4698.length; var4++) {
            this.field4698[var4][0] = arg0.method300(-1394191632);
            this.field4698[var4][1] = arg0.method300(-1394191632);
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 34)
    private final void method2099(int arg0) {
        field4700++;
        int[] var2 = this.field4698[0];
        int[] var3 = this.field4698[this.field4698.length - 2];
        int[] var4 = this.field4698[this.field4698.length - 1];
        int[] var5 = this.field4698[1];
        this.field4699 = new int[] { var3[0] - (var4[0] - var3[0]), var3[1] + -var4[1] + var3[1] };
        this.field4702 = new int[] { var2[0] + var2[0] - var5[0], var2[1] + -var5[arg0] + var2[1] };
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)[I", line = 51)
    private final int[] method2100(int arg0, int arg1) {
        field4694++;
        int var3 = -64 / ((arg1 + 71) / 46);
        if (arg0 >= 0) {
            return arg0 < this.field4698.length ? this.field4698[arg0] : this.field4699;
        } else {
            return this.field4702;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I", line = 69)
    public final int[] method95(int arg0, int arg1) {
        field4696++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -60);
        if (arg0 >= -52) {
            method2102(51);
        }
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4701[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V", line = 111)
    public static final void method2101(boolean arg0) {
        class297.field4655.method1433(30);
        if (arg0) {
            field4708 = (class211) null;
        }
        field4691++;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 123)
    public class299() {
        super(1, true);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 127)
    public static void method2102(int arg0) {
        field4709 = null;
        field4708 = null;
        int var1 = 25 % ((-arg0 - 30) / 63);
        field4689 = null;
        field4706 = null;
        field4693 = null;
        field4707 = null;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 143)
    private final void method2103(int arg0) {
        field4690++;
        int var2 = this.field4688;
        if (var2 == 2) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; var5 < (this.field4698.length - 1) && this.field4698[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field4698[var5];
                int[] var7 = this.field4698[var5 - 1];
                int var8 = this.method2100(var5 - 2, -117)[1];
                int var9 = var6[1];
                int var10 = var7[1];
                int var11 = this.method2100(var5 + 1, 74)[1];
                int var12 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var13 = var12 * var12 >> 12;
                int var14 = var11 + var10 - var9 - var8;
                int var15 = var9 - var8;
                int var16 = var8 - var10 - var14;
                int var17 = (var12 * var14 >> 12) * var13 >> 12;
                int var19 = var13 * var16 >> 12;
                int var20 = var12 * var15 >> 12;
                int var21 = var19 + var10 + var17 + var20;
                if (var21 <= -32768) {
                    var21 = -32767;
                }
                if (var21 >= 32768) {
                    var21 = 32767;
                }
                this.field4701[var3] = (short) var21;
            }
        } else if (var2 == 1) {
            for (int var30 = 0; var30 < 257; var30++) {
                int var31 = var30 << 4;
                int var32;
                for (var32 = 1; var32 < this.field4698.length - 1 && var31 >= this.field4698[var32][0]; var32++) {
                }
                int[] var33 = this.field4698[var32 - 1];
                int[] var34 = this.field4698[var32];
                int var35 = (var31 - var33[0] << 12) / (var34[0] - var33[0]);
                int var36 = 4096 - class156.field2345[var35 >> 5 & 0xFF] >> 1;
                int var37 = 4096 - var36;
                int var38 = var33[1] * var37 + var34[1] * var36 >> 12;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4701[var30] = (short) var38;
            }
        } else {
            for (int var22 = 0; var22 < 257; var22++) {
                int var23 = var22 << 4;
                int var24;
                for (var24 = 1; (this.field4698.length - 1) > var24 && var23 >= this.field4698[var24][0]; var24++) {
                }
                int[] var25 = this.field4698[var24 - 1];
                int[] var26 = this.field4698[var24];
                int var27 = (var23 - var25[0] << 12) / (var26[0] - var25[0]);
                int var28 = 4096 - var27;
                int var29 = var25[1] * var28 + var26[1] * var27 >> 12;
                if (var29 <= -32768) {
                    var29 = -32767;
                }
                if (var29 >= 32768) {
                    var29 = 32767;
                }
                this.field4701[var22] = (short) var29;
            }
        }
        if (arg0 <= 47) {
            field4693 = (String) null;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(II)[B", line = 328)
    public static final byte[] method2104(int arg0, int arg1) {
        field4695++;
        class325 var2 = (class325) class108.field1653.method816((long) arg1, (byte) 73);
        if (arg0 != 0) {
            return (byte[]) null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class66.method561(true, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class325(var3);
            class108.field1653.method817(var2, (long) arg1, (byte) -112);
        }
        return var2.field5063;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 379)
    public final void method465(int arg0) {
        field4692++;
        if (this.field4698 == null) {
            this.field4698 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        if (this.field4698.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field4688 == 2) {
            this.method2099(1);
        }
        class308.method2137(-125);
        int var2 = 53 / ((arg0 + 6) / 43);
        this.method2103(68);
    }
}
