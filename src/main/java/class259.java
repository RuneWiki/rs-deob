import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class259 extends class175 {

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    private int field4502 = 0;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private int field4504 = 0;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    private int field4511 = 0;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field4512 = 0;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    private int field4499;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    private int field4508;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "Lwd;")
    public static class217 field4513;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
    public static final void method1742(byte arg0, int arg1) {
        class254.field4393 = -1;
        class142.field2484 = -1;
        if (arg0 >= 26) {
            class215.field3559 = arg1;
            ++field4515;
            class125.method899(-1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public static void method1743(int arg0) {
        int var1 = 117 / ((-22 - arg0) / 58);
        field4513 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIB)V")
    private final void method1744(int arg0, int arg1, int arg2, byte arg3) {
        ++field4505;
        int var5 = arg0 >= arg2 ? arg0 : arg2;
        int var6 = var5 < arg1 ? arg1 : var5;
        if (arg3 > -33) {
            method1743(83);
        }
        int var7 = ~arg2 <= ~arg0 ? arg0 : arg2;
        int var8 = var7 > arg1 ? arg1 : var7;
        this.field4508 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 <= 0) {
            this.field4501 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (arg2 == var6) {
                this.field4501 = arg0 == var8 ? var12 + 20480 : 4096 - var10;
            } else if (~arg0 != ~var6) {
                this.field4501 = arg2 != var8 ? -var11 + 20480 : var10 + 12288;
            } else {
                this.field4501 = ~arg1 != ~var8 ? -var12 + 12288 : var11 + 4096;
            }
            this.field4501 /= 6;
        }
        if (~this.field4508 < -1 && this.field4508 < 4096) {
            this.field4510 = (var9 << 12) / (~this.field4508 < -2049 ? -(this.field4508 * 2) + 8192 : this.field4508 * 2);
        } else {
            this.field4510 = 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field4506;
        if (!arg0) {
            field4507 = 114;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4511 = (arg2.method1444((byte) -73) << 12) / 100;
                }
            } else {
                this.field4504 = (arg2.method1444((byte) -121) << 12) / 100;
            }
        } else {
            this.field4502 = arg2.method1438(16);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBI)V")
    private final void method1745(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = ~arg3 < -2049 ? arg1 + arg3 + -(arg1 * arg3 >> 12) : (4096 - -arg1) * arg3 >> 12;
        int var6 = 100 / ((26 - arg2) / 36);
        if (~var5 < -1) {
            int var7 = arg0 * 6;
            int var8 = -var5 + arg3 + arg3;
            int var9 = (-var8 + var5 << 12) / var5;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var5 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var5;
            if (~var10 != -1) {
                if (var10 != 1) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (var10 != 4) {
                                if (var10 == 5) {
                                    this.field4500 = var5;
                                    this.field4499 = var16;
                                    this.field4503 = var8;
                                }
                            } else {
                                this.field4500 = var15;
                                this.field4499 = var5;
                                this.field4503 = var8;
                            }
                        } else {
                            this.field4500 = var8;
                            this.field4499 = var5;
                            this.field4503 = var16;
                        }
                    } else {
                        this.field4500 = var8;
                        this.field4499 = var15;
                        this.field4503 = var5;
                    }
                } else {
                    this.field4500 = var16;
                    this.field4499 = var8;
                    this.field4503 = var5;
                }
            } else {
                this.field4499 = var8;
                this.field4500 = var5;
                this.field4503 = var15;
            }
        } else {
            this.field4500 = this.field4503 = this.field4499 = arg3;
        }
        ++field4509;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field4514;
        if (arg1 != -20740) {
            this.field4511 = 8;
        }
        int[][] var3 = super.field2920.method117(arg0, (byte) -121);
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, arg0, (byte) 54);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class211.field3514 < ~var11; ++var11) {
                this.method1744(var6[var11], var8[var11], var5[var11], (byte) -101);
                this.field4508 += this.field4511;
                if (~this.field4508 > -1) {
                    this.field4508 = 0;
                }
                this.field4510 += this.field4504;
                this.field4501 += this.field4502;
                if (~this.field4508 < -4097) {
                    this.field4508 = 4096;
                }
                if (this.field4510 < 0) {
                    this.field4510 = 0;
                }
                if (~this.field4510 < -4097) {
                    this.field4510 = 4096;
                }
                while (this.field4501 < 0) {
                    this.field4501 += 4096;
                }
                while (~this.field4501 < -4097) {
                    this.field4501 -= 4096;
                }
                this.method1745(this.field4501, this.field4510, (byte) -105, this.field4508);
                var7[var11] = this.field4500;
                var9[var11] = this.field4503;
                var10[var11] = this.field4499;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public static final void method1746(boolean arg0) {
        ++field4498;
        class127.field2222 = new class86();
        if (arg0) {
            method1746(true);
        }
    }
}
