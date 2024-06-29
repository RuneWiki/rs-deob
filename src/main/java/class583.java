import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class583 extends class245 {

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    private int field8233 = 0;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "Lnga;")
    public static class510 field8235 = new class510(4);

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "[F")
    public static float[] field8237 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field8236 = new String[200];

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
    public static void method3371(int arg0) {
        if (arg0 < -81) {
            field8237 = null;
            field8235 = null;
            field8236 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3372(int arg0, byte arg1, int arg2) {
        if (arg1 <= 27) {
            field8236 = null;
        }
        ++field8230;
        return (65536 & arg0) != 0;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Leq;Lgu;)V")
    public class583(class209 arg0, class577 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(B)V")
    public static final void method3373(byte arg0) {
        if (arg0 == -92) {
            class617.field8924 = 0;
            ++class515.field7337;
            class299.field4151 = 0;
            ++field8232;
            class254.method1735(arg0 ^ -21587);
            class67.method706((byte) -99);
            class423.method2582((byte) -40);
            boolean var1 = false;
            for (int var2 = 0; ~class299.field4151 < ~var2; ++var2) {
                int var5 = class92.field1616[var2];
                class272 var6 = (class272) class758.field10539.method4203(true, (long) var5);
                class84 var7 = var6.field3885;
                if (class34.field450 && class417.method2542(arg0 ^ 2603, var5)) {
                    class361.method2248(-16874);
                }
                if (class515.field7337 != var7.field933) {
                    if (var7.field1523.method2928((byte) 108)) {
                        class310.method2011(-116, var7);
                    }
                    var7.method809((class488) null, arg0 ^ 91);
                    var1 = true;
                    var6.method3617(1);
                }
            }
            if (var1) {
                class130.field1948 = class758.field10539.method4208(false);
                class758.field10539.method4201(arg0 + 211, class379.field5284);
            }
            if (class374.field5243 != class644.field9146.field469) {
                throw new RuntimeException("gnp1 pos:" + class644.field9146.field469 + " psize:" + class374.field5243);
            } else {
                for (int var3 = 0; var3 < class152.field2290; ++var3) {
                    if (class758.field10539.method4203(true, (long) class323.field4590[var3]) == null) {
                        throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class152.field2290);
                    }
                }
                if (~(-class152.field2290 + class130.field1948) != -1) {
                    throw new RuntimeException("gnp3 mis:" + (-class152.field2290 + class130.field1948));
                } else {
                    for (int var4 = 0; ~class130.field1948 < ~var4; ++var4) {
                        if (~class515.field7337 != ~class379.field5284[var4].field3885.field933) {
                            throw new RuntimeException("gnp4 uk:" + class379.field5284[var4].field3885.field931);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZI)V")
    public final void method1172(boolean arg0, int arg1) {
        ++field8229;
        int var3 = super.field3413.field1778.method2152(class57.field1064, super.field3410.method82(), -105) - -super.field3413.field1774;
        int var4 = 111 % (arg1 / 39);
        int var5 = super.field3413.field1775.method3892(super.field3410.method83(), class477.field6814, 4) + super.field3413.field1779;
        super.field3410.method4134((float) (super.field3410.method82() / 2 + var3), (float) (super.field3410.method83() / 2 + var5), 4096, this.field8233);
        this.field8233 += ((class577) super.field3413).field8164;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3374(int arg0, String arg1) {
        ++field8234;
        if (class737.field10375 && (class464.field6709 & 24) != 0) {
            boolean var2 = false;
            int var3 = class206.field2950;
            int[] var4 = class209.field3013;
            for (int var5 = arg0; ~var3 < ~var5; ++var5) {
                class349 var6 = class165.field2442[var4[var5]];
                if (var6.field4939 != null && var6.field4939.equalsIgnoreCase(arg1) && (class468.field6748 == var6 && ~(16 & class464.field6709) != -1 || var6 != null && ~(8 & class464.field6709) != -1)) {
                    ++class348.field4890;
                    class135 var7 = class273.method1801(class459.field6629, class543.field7659, 2);
                    var7.field2109.method285(-128, class40.field590);
                    var7.field2109.method226((byte) 91, class54.field1033);
                    var7.field2109.method251(class31.field415, -2072603704);
                    var7.field2109.method285(-128, var4[var5]);
                    var7.field2109.method229(-22416, 0);
                    class539.method3178(var7, -18925);
                    class453.method2713(0, true, var6.method482(false), (byte) 79, -2, var6.method482(false), var6.field991[0], var6.field995[0], 0);
                    var2 = true;
                    break;
                }
            }
            if (!var2) {
                class570.method3327((byte) 44, 4, class281.field3962.method1839((byte) 45, class744.field10426) + arg1);
            }
            if (class737.field10375) {
                class249.method1662((byte) 122);
            }
        }
    }
}
