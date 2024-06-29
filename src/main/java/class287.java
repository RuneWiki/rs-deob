import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class287 extends class87 {

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4594 = "white:";

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "[Lhc;")
    public static class53[] field4598 = new class53[2048];

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field4601 = -1;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Lpi;")
    public static class201 field4595 = new class201(100);

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Lpi;")
    public static class201 field4602 = new class201(200);

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "[I")
    public static int[] field4605 = new int[1000];

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V")
    public static final void method1963(byte arg0, int arg1) {
        if (arg0 == -41) {
            ++field4599;
            if (!class32.field398) {
                arg1 = -1;
            }
            if (~class283.field4560 != ~arg1) {
                if (arg1 != -1) {
                    class187 var2 = class36.method230(arg1, false);
                    class148 var3 = var2.method1340(false);
                    if (var3 != null) {
                        class273.field4426.method933(class12.field136, true, new Point(var2.field2778, var2.field2783), var3.method868(), var3.field1587, var3.field1580);
                        class283.field4560 = arg1;
                    } else {
                        arg1 = -1;
                    }
                }
                if (~arg1 == 0 && ~class283.field4560 != 0) {
                    class273.field4426.method933(class12.field136, true, new Point(), (int[]) null, -1, -1);
                    class283.field4560 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class287() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field4597;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (arg1) {
            return null;
        } else {
            if (super.field1378.field733) {
                int[][] var4 = this.method648(arg0, 17, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class206.field3032 < ~var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(BI)I")
    public static final int method1964(byte arg0, int arg1) {
        ++field4596;
        int var2 = arg1 & 63;
        if (arg0 != 10) {
            method1963((byte) 2, -72);
        }
        int var3 = 3 & arg1 >> 6;
        if (var2 != 18) {
            if (var2 == 19 || var2 == 21) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (~var3 == -4) {
                    return 128;
                }
            }
        } else {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static void method1965(boolean arg0) {
        field4595 = null;
        field4594 = null;
        field4605 = null;
        if (arg0) {
            field4602 = null;
            field4598 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lnc;I)V")
    public static final void method1966(class12 arg0, int arg1) {
        ++field4600;
        for (class301 var2 = (class301) class219.field3193.method8(-118); var2 != null; var2 = (class301) class219.field3193.method12((byte) 69)) {
            if (var2.field4858 == arg0) {
                if (var2.field4854 != null) {
                    class241.field3543.method1248(var2.field4854);
                    var2.field4854 = null;
                }
                var2.method1781(5250);
                return;
            }
        }
        if (arg1 >= -27) {
            method1965(false);
        }
    }
}
