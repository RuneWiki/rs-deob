import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class388 extends class115 {

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    private int field5687 = 0;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    private int field5693 = 0;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    private int field5692 = 16;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    private int field5686 = 4096;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    private int field5695 = 2000;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "Ljava/lang/String;")
    public static String field5684 = "red:";

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field5682 = 0;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "Lfi;")
    public static class331 field5690 = new class331(64);

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)V")
    public static final void method2476(int arg0) {
        ++field5683;
        class331 var1 = class123.field1633;
        synchronized (class123.field1633) {
            class123.field1633.method2052(0);
        }
        if (arg0 == 360) {
            class331 var2 = class171.field2392;
            synchronized (class171.field2392) {
                class171.field2392.method2052(0);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)V")
    public static final void method2477(int arg0, int arg1) {
        ++field5688;
        class238.method1521((byte) -106);
        class366.method2314(91);
        int var2 = class350.method2228(arg0, -2).field3970;
        if (var2 != 0) {
            int var3 = class283.field3972[arg0];
            if (var2 == 6) {
                class435.field6382 = var3;
            }
            if (~var2 == -10) {
                class147.field2060 = var3;
            }
            if (var2 == 5) {
                class354.field5175 = var3;
            }
            if (arg1 != 3504) {
                field5682 = -94;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
    public static final void method2478(int arg0) {
        ++field5689;
        class350.method2232(108, class169.field2373);
        if (arg0 == -1046088316) {
            int var1 = (class40.field427 >> 3) + (class272.field3853 >> 10);
            int var2 = (class272.field3852 >> 10) + (class217.field2975 >> 3);
            byte var3 = 0;
            byte var4 = 8;
            byte var5 = 8;
            byte var6 = 18;
            class291.field4182 = new int[var6];
            class193.field2638 = new int[var6];
            class237.field3226 = new int[var6];
            class433.field6308 = new byte[var6][];
            class349.field5097 = new byte[var6][];
            class37.field382 = new byte[var6][];
            class246.field3338 = new int[var6];
            class239.field3252 = new byte[var6][];
            class157.field2234 = new int[var6];
            class71.field805 = new int[var6];
            class315.field4489 = new int[var6][4];
            class98.field1109 = new byte[var6][];
            int var7 = 0;
            for (int var8 = (-(class279.field3935 >> 4) + var1) / 8; ((class279.field3935 >> 4) + var1) / 8 >= var8; ++var8) {
                for (int var10 = (-(class164.field2287 >> 4) + var2) / 8; var10 <= (var2 - -(class164.field2287 >> 4)) / 8; ++var10) {
                    int var11 = (var8 << 8) + var10;
                    class71.field805[var7] = var11;
                    class291.field4182[var7] = class282.field3968.method332("m" + var8 + "_" + var10, -1);
                    class237.field3226[var7] = class282.field3968.method332("l" + var8 + "_" + var10, -1);
                    class246.field3338[var7] = class282.field3968.method332("n" + var8 + "_" + var10, -1);
                    class157.field2234[var7] = class282.field3968.method332("um" + var8 + "_" + var10, -1);
                    class193.field2638[var7] = class282.field3968.method332("ul" + var8 + "_" + var10, -1);
                    if (~class246.field3338[var7] == 0) {
                        class291.field4182[var7] = -1;
                        class237.field3226[var7] = -1;
                        class157.field2234[var7] = -1;
                        class193.field2638[var7] = -1;
                    }
                    ++var7;
                }
            }
            for (int var9 = var7; class246.field3338.length > var9; ++var9) {
                class246.field3338[var9] = -1;
                class291.field4182[var9] = -1;
                class237.field3226[var9] = -1;
                class157.field2234[var9] = -1;
                class193.field2638[var9] = -1;
            }
            class35.method201(var2, -30684, var5, true, var4, false, var3, var1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 != 0) {
            this.field5693 = 10;
        }
        class170.method1131(256);
        ++field5694;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field5685;
        int[] var3 = super.field1340.method14(31, arg0);
        if (super.field1340.field35) {
            int var4 = this.field5686 >> 1;
            int[][] var5 = super.field1340.method15(true);
            Random var6 = new Random((long) this.field5687);
            for (int var7 = 0; var7 < this.field5695; ++var7) {
                int var8 = ~this.field5686 >= -1 ? this.field5693 : this.field5693 - (var4 + -class239.method1529(this.field5686, (byte) -96, var6));
                int var9 = (var8 & 4081) >> 4;
                int var10 = class239.method1529(class218.field2979, (byte) -96, var6);
                int var11 = class239.method1529(class392.field5738, (byte) -96, var6);
                int var12 = (class63.field726[var9] * this.field5692 >> 12) + var10;
                int var13 = var11 - -(class157.field2227[var9] * this.field5692 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class239.method1529(4096, (byte) -96, var6) >> 2) + 1024;
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (var28 - var10) * var25 + var26 + 1024;
                        int var30 = var28 & class92.field1013;
                        int var31 = class315.field4488 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        if (arg1 != 0) {
            this.method140(-122);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field5691;
        if (arg0 <= 83) {
            field5682 = 100;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field5686 = arg1.method1355(32136);
                        }
                    } else {
                        this.field5693 = arg1.method1355(32136);
                    }
                } else {
                    this.field5692 = arg1.method1342((byte) -128);
                }
            } else {
                this.field5695 = arg1.method1355(32136);
            }
        } else {
            this.field5687 = arg1.method1342((byte) -127);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBII)V")
    public static final void method2479(int arg0, byte arg1, int arg2, int arg3) {
        ++field5681;
        if (arg1 <= 40) {
            field5684 = null;
        }
        class249 var4 = class114.field1321[arg3][arg2];
        class87.method476((byte) -123, var4 == null ? class72.field812 : var4, arg0);
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
    public static void method2480(int arg0) {
        field5690 = null;
        if (arg0 == -646) {
            field5684 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class388() {
        super(0, true);
    }
}
