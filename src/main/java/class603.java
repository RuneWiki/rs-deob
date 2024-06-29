import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class603 extends class5 {

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    private int field8490 = 3072;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    private int field8496 = 1024;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    private int field8497 = 2048;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "[I")
    public static int[] field8493 = new int[2];

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "Lwp;")
    public static class453 field8492 = new class453(41, 3);

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field8498 = 1339;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field8491;
        int[][] var3 = super.field135.method2706(arg0, -55);
        if (!arg1) {
            this.field8490 = -57;
        }
        if (super.field135.field6667) {
            int[][] var4 = this.method45(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class657.field9287 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field8497 >> 12) + this.field8496;
                var9[var11] = this.field8496 - -(var6[var11] * this.field8497 >> 12);
                var10[var11] = (var7[var11] * this.field8497 >> 12) + this.field8496;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IBI)V")
    public static final void method3308(int arg0, byte arg1, int arg2) {
        ++field8489;
        if (arg1 != 15) {
            field8493 = null;
        }
        class592 var3 = class61.method371(7, arg0, (byte) -61);
        var3.method3256((byte) 11);
        var3.field8314 = arg2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3309(int arg0, int arg1, String arg2) {
        if (arg0 != -8) {
            field8492 = null;
        }
        ++field8494;
        int var3 = class596.field8384;
        int[] var4 = class354.field4521;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; ++var6) {
            class514 var7 = class351.field4490[var4[var6]];
            if (var7 != null && class376.field4748 != var7 && var7.field7017 != null && var7.field7017.equalsIgnoreCase(arg2)) {
                if (arg1 == 1) {
                    ++class645.field9066;
                    class704 var8 = class314.method1820(class220.field2690, class400.field5014, (byte) 103);
                    var8.field9929.method3505(-122, var4[var6]);
                    var8.field9929.method3509(0, (byte) -110);
                    class122.method654(var8, (byte) -36);
                } else if (~arg1 != -5) {
                    if (~arg1 == -6) {
                        ++class289.field3597;
                        class704 var9 = class314.method1820(class161.field2124, class400.field5014, (byte) -101);
                        var9.field9929.method3505(26, var4[var6]);
                        var9.field9929.method3525((byte) 125, 0);
                        class122.method654(var9, (byte) -36);
                    } else if (arg1 == 6) {
                        ++class340.field4393;
                        class704 var10 = class314.method1820(class117.field1514, class400.field5014, (byte) -122);
                        var10.field9929.method3525((byte) 125, 0);
                        var10.field9929.method3505(64, var4[var6]);
                        class122.method654(var10, (byte) -36);
                    } else if (~arg1 == -8) {
                        ++class516.field7043;
                        class704 var11 = class314.method1820(class220.field2689, class400.field5014, (byte) 106);
                        var11.field9929.method3518((byte) -72, 0);
                        var11.field9929.method3505(90, var4[var6]);
                        class122.method654(var11, (byte) -36);
                    }
                } else {
                    ++class50.field707;
                    class704 var12 = class314.method1820(class639.field8961, class400.field5014, (byte) 91);
                    var12.field9929.method3466(120, var4[var6]);
                    var12.field9929.method3512(0, (byte) 7);
                    class122.method654(var12, (byte) -36);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class250.method1468(4, false, class83.field1129.method476((byte) -74, class250.field3068) + arg2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class603() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field120 = ~arg1.method3501(-9268) == -2;
                }
            } else {
                this.field8490 = arg1.method3470(arg0 + 13110);
            }
        } else {
            this.field8496 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            method3310(-111);
        }
        ++field8495;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.field8497 = this.field8490 - this.field8496;
        ++field8487;
        int var2 = -128 % ((arg0 - 64) / 60);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field8488;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int[] var4 = this.method49(arg1, false, 0);
            for (int var5 = 0; class657.field9287 > var5; ++var5) {
                var3[var5] = this.field8496 - -(var4[var5] * this.field8497 >> 12);
            }
        }
        int var6 = -106 % ((81 - arg0) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public static void method3310(int arg0) {
        if (arg0 != 0) {
            field8492 = null;
        }
        field8492 = null;
        field8493 = null;
    }
}
