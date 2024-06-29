import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class530 extends class82 {

    @OriginalMember(owner = "client!paa", name = "P", descriptor = "I")
    private int field7440 = 1;

    @OriginalMember(owner = "client!paa", name = "U", descriptor = "I")
    private int field7445 = 0;

    @OriginalMember(owner = "client!paa", name = "X", descriptor = "I")
    private int field7448 = 0;

    @OriginalMember(owner = "client!paa", name = "L", descriptor = "Lvj;")
    public static class373 field7436 = new class373(92, 8);

    @OriginalMember(owner = "client!paa", name = "W", descriptor = "[I")
    public static int[] field7447 = new int[8];

    @OriginalMember(owner = "client!paa", name = "Y", descriptor = "I")
    public static int field7449 = 4;

    @OriginalMember(owner = "client!paa", name = "Z", descriptor = "I")
    public static int field7450 = 0;

    @OriginalMember(owner = "client!paa", name = "M", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!paa", name = "N", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!paa", name = "O", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!paa", name = "Q", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!paa", name = "T", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!paa", name = "R", descriptor = "Lvk;")
    public static class308 field7442;

    @OriginalMember(owner = "client!paa", name = "V", descriptor = "Lgr;")
    public static class367 field7446;

    @OriginalMember(owner = "client!paa", name = "ab", descriptor = "Z")
    public static boolean field7451;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIBII)V", line = 4)
    public static final void method3018(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field7438;
        if (arg2 >= -16) {
            method3019((class544) null, (class544) null, -10);
        }
        if (class565.field8299.field2167 != 0 && arg1 != 0 && ~class570.field8370 > -51 && arg4 != -1) {
            class250.field3228[class570.field8370++] = new class114((byte) 2, arg4, arg1, arg0, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V", line = 21)
    public final void method438(int arg0) {
        if (arg0 != -2) {
            method3019((class544) null, (class544) null, 81);
        }
        ++field7441;
        class623.method3571(-86);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lwda;Lwda;I)V", line = 32)
    public static final void method3019(class544 arg0, class544 arg1, int arg2) {
        ++field7444;
        if (arg0.field7965 != null) {
            arg0.method3187(true);
        }
        arg0.field7964 = arg1;
        if (arg2 != -311981535) {
            field7446 = null;
        }
        arg0.field7965 = arg1.field7965;
        arg0.field7965.field7964 = arg0;
        arg0.field7964.field7965 = arg0;
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(II)[I", line = 52)
    public final int[] method201(int arg0, int arg1) {
        ++field7439;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            method3018(-40, 79, (byte) 96, -104, 127);
        }
        if (super.field990.field3641) {
            int var4 = class85.field1036[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class629.field9033; ++var6) {
                int var7 = class366.field4817[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field7445 == 0) {
                    var9 = (var7 - var4) * this.field7440;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field7440 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field7448 != 0) {
                    if (~this.field7448 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class445.field6135[(4086 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "(I)V", line = 127)
    public static void method3020(int arg0) {
        field7442 = null;
        if (arg0 != 3) {
            method3018(33, -22, (byte) 107, 12, 7);
        }
        field7436 = null;
        field7447 = null;
        field7446 = null;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "()V", line = 197)
    public class530() {
        super(0, true);
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILos;)V", line = 145)
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field7440 = arg2.method2129(-116);
                }
            } else {
                this.field7448 = arg2.method2129(-128);
            }
        } else {
            this.field7445 = arg2.method2129(-87);
        }
        int var5 = 103 / ((-69 - arg1) / 42);
        ++field7437;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZIILdn;)Lfc;", line = 216)
    public static final class216 method3021(boolean arg0, int arg1, int arg2, class438 arg3) {
        ++field7443;
        byte[] var4 = arg3.method2558(100, arg1, arg2);
        if (var4 == null) {
            return null;
        } else {
            return arg0 ? null : new class216(var4);
        }
    }
}
