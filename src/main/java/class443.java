import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class443 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lpu;")
    private class522 field6450;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    private int field6453;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[Z")
    private boolean[] field6451;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[[I")
    private int[][] field6458;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Z")
    public static boolean field6452;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[I")
    public static int[] field6454;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 6)
    public static void method2625(int arg0) {
        field6454 = null;
        if (arg0 != -1) {
            method2627(-77, 111, 39, -51);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Llg;", line = 17)
    public final class377 method2626(int arg0, int arg1) {
        field6462++;
        byte[] var3 = this.field6450.method3007(1, arg1, 5);
        class377 var4 = new class377();
        var4.method2271(0, new class695(var3));
        return arg0 < 16 ? null : var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method2627(int arg0, int arg1, int arg2, int arg3) {
        field6463++;
        int var4 = class109.field1672 + arg2;
        int var5 = class203.field2874 + arg0;
        if (class153.field2210 == null || arg2 < 0 || arg0 < 0 || arg2 >= class199.field2812 || arg0 >= class232.field3611 || !class287.field4270.method2747(56, class328.field4859) && class648.field9106.field3019 != arg1) {
            return;
        }
        long var6 = (long) (var4 | arg1 << 28 | var5 << 14);
        class44 var8 = (class44) class22.field296.method1405(var6, (byte) -112);
        if (var8 == null) {
            class383.method2293(arg1, arg2, arg0);
            return;
        }
        class370 var9 = (class370) var8.field705.method472((byte) -25);
        if (var9 == null) {
            class383.method2293(arg1, arg2, arg0);
            return;
        }
        class533 var10 = (class533) class383.method2293(arg1, arg2, arg0);
        if (var10 == null) {
            var10 = new class533(arg2 << 9, class296.field4340[arg1].method432(arg2, false, arg0), arg0 << 9, arg1, arg1);
        } else {
            var10.field7474 = var10.field7480 = -1;
        }
        var10.field7486 = var9.field5279;
        var10.field7484 = var9.field5280;
        label61: while (true) {
            class370 var11 = (class370) var8.field705.method482(116);
            if (var11 == null) {
                break;
            }
            if (var10.field7486 != var11.field5279) {
                var10.field7474 = var11.field5279;
                var10.field7492 = var11.field5280;
                while (true) {
                    class370 var12 = (class370) var8.field705.method482(arg3 + 28296);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field7486 != var12.field5279 && var10.field7474 != var12.field5279) {
                        var10.field7480 = var12.field5279;
                        var10.field7478 = var12.field5280;
                    }
                }
            }
        }
        int var13 = class674.method3748((arg2 << 9) + 256, arg1, arg3 + 28502, (arg0 << 9) - -256);
        var10.field3029 = arg0 << 9;
        var10.field3018 = var13;
        var10.field3024 = arg2 << 9;
        if (arg3 != -28422) {
            return;
        }
        var10.field3023 = (byte) arg1;
        var10.field3019 = (byte) arg1;
        if (class261.method1718(arg0, 1, arg2)) {
            var10.field3023++;
        }
        class22.method276(arg1, arg2, arg0, var13, var10);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 131)
    public static final void method2628(int arg0) {
        field6455++;
        if (arg0 != 19576 || !class571.field8038) {
            return;
        }
        while (true) {
            while (class439.field6407.length > class511.field7193) {
                class178 var1 = class439.field6407[class511.field7193];
                if (var1 != null && var1.field2540 == -1) {
                    if (class553.field7842 == null) {
                        class553.field7842 = class578.field8142.method64(true, var1.field2532);
                    }
                    int var2 = class553.field7842.field5075;
                    if (var2 == -1) {
                        return;
                    }
                    class553.field7842 = null;
                    class511.field7193++;
                    var1.field2540 = var2;
                } else {
                    class511.field7193++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 173)
    public static final void method2629(byte arg0) {
        int var1 = -51 % ((-arg0 - 34) / 57);
        class479.field6801 = 0;
        class498.field7054 = 0;
        class20.field226 = 0;
        class699.field9886 = 0;
        field6460++;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z", line = 183)
    public final boolean method2630(int arg0) {
        field6456++;
        if (arg0 > -100) {
            field6454 = null;
        }
        return this.field6453 != -1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)[I", line = 201)
    public final int[] method2631(byte arg0, int arg1) {
        field6461++;
        if (arg1 >= 0 && arg1 < this.field6458.length) {
            if (arg0 <= 63) {
                method2628(-82);
            }
            if (!this.field6451[arg1] || this.field6458[arg1].length <= 1) {
                return this.field6458[arg1];
            }
            int var3 = this.field6453 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field6458[arg1].length];
            class476.method2793(this.field6458[arg1], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class311.method1976(-1, var5.length - var3, var4) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else if (this.field6453 == -1) {
            return new int[0];
        } else {
            return new int[] { this.field6453 };
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 250)
    public class443(class693 arg0, int arg1, class522 arg2) {
        this.field6450 = arg2;
        this.field6450.method2988(103, 1);
        class695 var4 = new class695(this.field6450.method3007(0, 0, 5));
        int var5 = var4.method3826(false);
        if (var5 > 3) {
            this.field6453 = -1;
            this.field6451 = new boolean[0];
            this.field6458 = new int[0][];
        } else {
            int var6 = var4.method3826(false);
            class703[] var7 = class406.method2461(false);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method3826(false);
                    if (var7[var9].field9911 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method3826(false);
                int var12 = var4.method3826(false);
                if (var5 > 2) {
                    this.field6453 = var4.method3814(false);
                } else {
                    this.field6453 = -1;
                }
                this.field6451 = new boolean[var12 + 1];
                this.field6458 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method3826(false);
                    this.field6451[var15] = var4.method3826(false) == 1;
                    int var16 = var4.method3847((byte) 118);
                    if (this.field6453 == -1) {
                        this.field6458[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field6458[var15][var18] = var4.method3847((byte) 118);
                        }
                    } else {
                        this.field6458[var15] = new int[var16 + 1];
                        this.field6458[var15][0] = this.field6453;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6458[var15][var17 + 1] = var4.method3847((byte) 118);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field6458[var14] == null) {
                        if (this.field6453 == -1) {
                            this.field6458[var14] = new int[0];
                        } else {
                            this.field6458[var14] = new int[] { this.field6453 };
                        }
                    }
                }
            } else {
                this.field6458 = new int[0][];
                this.field6451 = new boolean[0];
                this.field6453 = -1;
            }
        }
    }
}
