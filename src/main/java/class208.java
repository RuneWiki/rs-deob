import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class208 extends class182 {

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    private int field3476 = 16;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    private int field3475 = 0;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    private int field3480 = 4096;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    private int field3472 = 2000;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "I")
    private int field3485 = 0;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "[I")
    public static int[] field3474 = new int[25];

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
    public static int field3481 = 0;

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "Z")
    public static boolean field3483 = false;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3479 = 0;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 13)
    public static void method1439(byte arg0) {
        if (arg0 != -91) {
            field3481 = -65;
        }
        field3474 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Loe;IB)V", line = 23)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field3482++;
        if (arg1 == 0) {
            this.field3475 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field3472 = arg0.method989(119);
        } else if (arg1 == 2) {
            this.field3476 = arg0.method1005((byte) 122);
        } else if (arg1 == 3) {
            this.field3485 = arg0.method989(60);
        } else if (arg1 == 4) {
            this.field3480 = arg0.method989(112);
        }
        if (arg2 != 60) {
            this.method163(-108);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 278)
    public class208() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([BI)Z", line = 96)
    public static final boolean method1440(byte[] arg0, int arg1) {
        field3473++;
        class146 var2 = new class146(arg0);
        int var3 = var2.method1005((byte) 122);
        if (var3 != 1) {
            return false;
        }
        if (arg1 != 7506) {
            method1440((byte[]) null, -8);
        }
        boolean var4 = var2.method1005((byte) 122) == 1;
        if (var4) {
            class299.method2140(arg1 - 28380, var2);
        }
        class201.method1377(105, var2);
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[I", line = 128)
    public final int[] method125(int arg0, int arg1) {
        field3477++;
        int[] var3 = this.field3166.method775(arg1, arg0 + 124);
        if (this.field3166.field1903) {
            int var4 = this.field3480 >> 1;
            int[][] var5 = this.field3166.method776(97);
            Random var6 = new Random((long) this.field3475);
            for (int var7 = 0; var7 < this.field3472; var7++) {
                int var8 = this.field3480 <= 0 ? this.field3485 : this.field3485 - (var4 - class91.method696(var6, this.field3480, 93));
                int var9 = (var8 & 0xFF6) >> 4;
                int var10 = class91.method696(var6, class26.field672, 112);
                int var11 = class91.method696(var6, class334.field5323, 58);
                int var12 = (class223.field3690[var9] * this.field3476 >> 12) + var11;
                int var13 = var12 - var11;
                int var14 = (class107.field1937[var9] * this.field3476 >> 12) + var10;
                int var15 = var14 - var10;
                if (var15 != 0 || var13 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var13;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var14;
                        var14 = var12;
                        var11 = var17;
                        var12 = var18;
                    }
                    if (var14 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var14;
                        var14 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var11;
                    int var23 = var14 - var10;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var24 = 1024 - (class91.method696(var6, 4096, 93) >> 2);
                    int var25 = 2048 / var23;
                    int var26 = -var23 / 2;
                    int var27 = var12 <= var11 ? -1 : 1;
                    for (int var28 = var10; var28 < var14; var28++) {
                        int var29 = ((var28 - var10) * var25) + var24 + 1024;
                        var26 += var22;
                        int var30 = var28 & class53.field1056;
                        int var31 = var21 & class194.field3266;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var26 > 0) {
                            var21 += var27;
                            var26 += -var23;
                        }
                    }
                }
            }
        }
        if (arg0 != 2) {
            method1440((byte[]) null, 85);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 265)
    public final void method163(int arg0) {
        if (arg0 != 100) {
            this.field3475 = 97;
        }
        class219.method1526(arg0 ^ 0x164);
        field3484++;
    }
}
