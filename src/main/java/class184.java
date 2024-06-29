import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class184 extends class68 {

    @OriginalMember(owner = "client!k", name = "O", descriptor = "[I")
    private int[] field2547 = new int[3];

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    private int field2550 = 409;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    private int field2549 = 4096;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    private int field2554 = 4096;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "I")
    private int field2556 = 4096;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "Lhc;")
    public static class235 field2551;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "[I")
    public static int[] field2553;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method28((class224) null, 78, true);
        }
        ++field2552;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method1454(88);
                            this.field2547[0] = class235.method1572(267386880, var5 << 4);
                            this.field2547[1] = class235.method1572(65280, var5) >> 4;
                            this.field2547[2] = class235.method1572(0, var5 >> 12);
                        }
                    } else {
                        this.field2549 = arg0.method1445(false);
                    }
                } else {
                    this.field2554 = arg0.method1445(!arg2);
                }
            } else {
                this.field2556 = arg0.method1445(false);
            }
        } else {
            this.field2550 = arg0.method1445(false);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class184() {
        super(1, false);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBII)V")
    public static final void method1192(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field2555;
        if (class279.field4327 < 100) {
            class224.method1486(52);
        }
        class64.method398(arg0, arg1, arg0 - -arg3, arg1 + arg4);
        if (~class279.field4327 > -101) {
            int var5 = arg0 - -(arg3 / 2);
            byte var6 = 20;
            int var7 = arg1 - -(arg4 / 2) + -var6 + -18;
            class64.method401(arg0, arg1, arg3, arg4, 0);
            class64.method393(var5 - 152, var7, 304, 34, 9179409);
            class64.method393(var5 - 151, var7 - -1, 302, 32, 0);
            class64.method401(var5 + -150, var7 + 2, class279.field4327 * 3, 30, 9179409);
            class64.method401(var5 - (-(class279.field4327 * 3) + 150), var7 + 2, -(class279.field4327 * 3) + 300, 30, 0);
            class54.field787.method825(class153.field2126, var5, var6 + var7, 16777215, -1);
        } else {
            if (arg2 != -39) {
                method1193(-79);
            }
            class234.field3534 = (int) ((float) (arg3 * 2) / class221.field3310);
            class266.field4084 = (int) ((float) (arg4 * 2) / class221.field3310);
            class284.field4435 = -((int) ((float) arg4 / class221.field3310)) + class234.field3529;
            int var8 = class234.field3529 - (int) ((float) arg4 / class221.field3310);
            int var9 = client.field2181 - (int) ((float) arg3 / class221.field3310);
            class62.field855 = client.field2181 - (int) ((float) arg3 / class221.field3310);
            int var10 = client.field2181 - -((int) ((float) arg3 / class221.field3310));
            int var11 = (int) ((float) arg4 / class221.field3310) + class234.field3529;
            class8.method53(var9, arg0, var10, arg1 + arg4, arg0 + arg3, var8, var11, (byte) -121, arg1);
            class236.method1587(var11, (byte) 56, var9, var10, arg0, class180.field2522, var8, arg1, arg0 - -arg3, arg1 - -arg4);
            class116.method782(arg1, arg0 + arg3, -167582047, var9, var8, arg0, var11, var10, arg1 + arg4);
            if (class145.field2026 > 0) {
                --class29.field393;
                if (class29.field393 == 0) {
                    --class145.field2026;
                    class29.field393 = 20;
                }
            }
            if (class172.field2389) {
                int var12 = arg0 - -arg3 - 5;
                int var13 = arg1 - -arg4 + -8;
                class208.field2968.method829("Fps:" + class135.field1894, var12, var13, 16776960, -1);
                Runtime var14 = Runtime.getRuntime();
                int var17 = var13 - 15;
                int var15 = (int) ((var14.totalMemory() + -var14.freeMemory()) / 1024L);
                int var16 = 16776960;
                if (var15 > 65536) {
                    var16 = 16711680;
                }
                class208.field2968.method829("Mem:" + var15 + "k", var12, var17, var16, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field2546;
        int[][] var3 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[][] var4 = this.method429(0, arg0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class89.field1248; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2547[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field2550) {
                    var7[var11] = var12;
                    var9[var11] = var8[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var8[var11];
                    int var15 = -this.field2547[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field2550 < var15) {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = -this.field2547[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field2550) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field2549 * var12 >> 12;
                            var9[var11] = this.field2554 * var14 >> 12;
                            var10[var11] = this.field2556 * var16 >> 12;
                        }
                    }
                }
            }
        }
        int var18 = 44 / ((arg1 - 63) / 61);
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static void method1193(int arg0) {
        if (arg0 != 65536) {
            method1192(13, 37, (byte) -73, -91, 77);
        }
        field2553 = null;
        field2551 = null;
    }
}
