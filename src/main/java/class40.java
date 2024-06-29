import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class40 extends class303 {

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    private int field721 = 2000;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    private int field715 = 0;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    private int field722 = 16;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    private int field723 = 0;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    private int field718 = 4096;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field717 = -1;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "[Lwf;")
    public static class58[] field716 = new class58[50];

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[I")
    public static int[] field728 = new int[500];

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILpe;I)V", line = 18)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field715 = arg1.method741(11);
        } else if (arg2 == 1) {
            this.field721 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field722 = arg1.method741(arg0 + 4040);
        } else if (arg2 == 3) {
            this.field723 = arg1.method731(false);
        } else if (arg2 == 4) {
            this.field718 = arg1.method731(false);
        }
        field727++;
        if (arg0 != -4004) {
            field717 = 89;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(III)V", line = 67)
    public static final void method325(int arg0, int arg1, int arg2) {
        field726++;
        class300.field4724 = class259.field4026[arg0][arg1].field1975;
        if (arg2 == 0) {
            class160.field2522 = class259.field4026[arg0][arg1].field1976;
            class256.field3959 = class259.field4026[arg0][arg1].field1987;
            class97.method709((float) class300.field4724, (float) class160.field2522, (float) class256.field3959);
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 86)
    public static final void method326(int arg0) {
        if (~field725 > arg0) {
            field725 = 0;
            class295.field4670 = -1;
            class188.field2994 = -1;
        }
        if (class79.field1208 < field725) {
            class295.field4670 = -1;
            field725 = class79.field1208;
            class188.field2994 = -1;
        }
        if (class95.field1565 < 0) {
            class95.field1565 = 0;
            class295.field4670 = -1;
            class188.field2994 = -1;
        }
        field714++;
        if (class95.field1565 > class279.field4316) {
            class295.field4670 = -1;
            class188.field2994 = -1;
            class95.field1565 = class279.field4316;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILoj;BLpe;)V", line = 128)
    public static final void method327(int arg0, class325 arg1, byte arg2, class101 arg3) {
        field713++;
        class215 var4 = new class215();
        var4.field3416 = arg3.method741(15);
        var4.field3425 = arg3.method775(-100);
        var4.field3428 = new int[var4.field3416];
        var4.field3432 = new int[var4.field3416];
        var4.field3424 = new class21[var4.field3416];
        var4.field3423 = new byte[var4.field3416][][];
        var4.field3417 = new class21[var4.field3416];
        var4.field3419 = new int[var4.field3416];
        for (int var5 = 0; var5 < var4.field3416; var5++) {
            try {
                int var6 = arg3.method741(52);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method749((byte) -103);
                    String var18 = arg3.method749((byte) -86);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method775(-116);
                    }
                    var4.field3419[var5] = var6;
                    var4.field3432[var5] = var19;
                    var4.field3424[var5] = arg1.method2235((byte) -6, class92.method665(true, var17), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method749((byte) -94);
                    String var8 = arg3.method749((byte) -69);
                    int var9 = arg3.method741(53);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method749((byte) -62);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method775(-93);
                            var12[var13] = new byte[var14];
                            arg3.method770(var14, var12[var13], -1127, 0);
                        }
                    }
                    var4.field3419[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class92.method665(true, var10[var16]);
                    }
                    var4.field3417[var5] = arg1.method2219(var8, class92.method665(true, var7), var15, 27739);
                    var4.field3423[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field3428[var5] = -1;
            } catch (SecurityException var26) {
                var4.field3428[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field3428[var5] = -3;
            } catch (Exception var28) {
                var4.field3428[var5] = -4;
            } catch (Throwable var29) {
                var4.field3428[var5] = -5;
            }
        }
        if (arg2 >= 119) {
            class92.field1514.method1493(-121, var4);
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 245)
    public final void method70(int arg0) {
        field720++;
        if (arg0 < 13) {
            method327(3, (class325) null, (byte) 77, (class101) null);
        }
        class226.method1635(4096);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 256)
    public static void method328(int arg0) {
        field728 = null;
        if (arg0 != -1) {
            field716 = (class58[]) null;
        }
        field716 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 268)
    public class40() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[I", line = 280)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            this.method65(-123, (class101) null, -41);
        }
        field712++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = this.field718 >> 1;
            int[][] var5 = this.field4763.method396(-14579);
            Random var6 = new Random((long) this.field715);
            for (int var7 = 0; var7 < this.field721; var7++) {
                int var8 = this.field718 <= 0 ? this.field723 : this.field723 + class86.method621((byte) 110, var6, this.field718) - var4;
                int var9 = class86.method621((byte) -41, var6, class70.field1108);
                int var10 = (var8 & 0xFF2) >> 4;
                int var11 = class86.method621((byte) 108, var6, class247.field3815);
                int var12 = var9 + (class123.field1971[var10] * this.field722 >> 12);
                int var13 = (class148.field2386[var10] * this.field722 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var9 > var12) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 > var11 ? 1 : -1;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = var12 - var9;
                    int var25 = 2048 / var24;
                    int var26 = -var24 / 2;
                    int var27 = 1024 - (class86.method621((byte) 111, var6, 4096) >> 2);
                    for (int var28 = var9; var28 < var12; var28++) {
                        var26 += var23;
                        int var29 = (var28 - var9) * var25 + var27 + 1024;
                        int var30 = field724 & var28;
                        int var31 = var21 & class12.field240;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var26 > 0) {
                            var21 += var22;
                            var26 += -var24;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)V", line = 412)
    public static final void method329(byte arg0) {
        if (arg0 != -90) {
            field725 = 111;
        }
        if (class101.field1719 < class54.field862) {
            class101.field1719 = (float) ((double) class101.field1719 / 30.0D + (double) class101.field1719);
            if (class101.field1719 > class54.field862) {
                class101.field1719 = class54.field862;
            }
            method326(-1);
        } else if (class101.field1719 > class54.field862) {
            class101.field1719 = (float) ((double) class101.field1719 - (double) class101.field1719 / 30.0D);
            if (class101.field1719 < class54.field862) {
                class101.field1719 = class54.field862;
            }
            method326(-1);
        }
        field719++;
        if (class295.field4670 == -1 || class188.field2994 == -1) {
            return;
        }
        int var1 = class295.field4670 - field725;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        field725 += var1;
        int var2 = class188.field2994 - class95.field1565;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class95.field1565 += var2;
        if (var1 == 0 && var2 == 0) {
            class295.field4670 = -1;
            class188.field2994 = -1;
        }
        method326(arg0 ^ 0x59);
    }
}
