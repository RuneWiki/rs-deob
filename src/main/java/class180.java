import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class180 extends class115 {

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "[J")
    public static long[] field2574 = new long[500];

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[[I")
    public static int[][] field2575 = new int[104][104];

    @OriginalMember(owner = "client!o", name = "N", descriptor = "[I")
    public static int[] field2571 = new int[25];

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field2579 = 0;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            field2579 = -103;
        }
        ++field2578;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            class164.method1094(var3, 0, class77.field1178, this.field2572);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field2570;
        if (arg0 == -1) {
            if (arg2 == 0) {
                this.field2572 = (arg1.method760(false) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JZ)V")
    public static final void method1163(long arg0, boolean arg1) {
        ++field2576;
        if (~arg0 != -1L) {
            if (arg1) {
                field2571 = null;
            }
            if (class247.field3707 >= 100) {
                class255.method1712((byte) 72, class109.field1572, 0, "");
            } else {
                String var3 = class204.method1321((byte) 117, arg0);
                for (int var4 = 0; ~class247.field3707 < ~var4; ++var4) {
                    if (~class81.field1253[var4] == ~arg0) {
                        class255.method1712((byte) 72, var3 + class130.field1900, 0, "");
                        return;
                    }
                }
                for (int var5 = 0; ~var5 > ~class55.field836; ++var5) {
                    if (class95.field1452[var5] == arg0) {
                        class255.method1712((byte) 72, class48.field707 + var3 + class163.field2375, 0, "");
                        return;
                    }
                }
                if (var3.equals(class55.field847.field766)) {
                    class255.method1712((byte) 72, class197.field2847, 0, "");
                } else {
                    class81.field1253[class247.field3707] = arg0;
                    class62.field1003[class247.field3707++] = class273.method1845(arg0, 28549);
                    ++class30.field432;
                    class113.field1611 = class213.field3063;
                    class95.field1451.method522(169, 28727);
                    class95.field1451.method765(532401312, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILkl;)Lsj;")
    public static final class47 method1164(int arg0, class114 arg1) {
        if (arg0 <= 15) {
            method1165((byte) 18, -98);
        }
        ++field2577;
        return new class47(arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method763(true), arg1.method779(16711680), arg1.method779(16711680), arg1.method760(false));
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
    public static final void method1165(byte arg0, int arg1) {
        class202.field2917.method258(arg1, (byte) 80);
        ++field2568;
        if (arg0 < 120) {
            field2579 = 23;
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
    public static void method1166(byte arg0) {
        field2575 = null;
        if (arg0 != -69) {
            method1164(-88, (class114) null);
        }
        field2574 = null;
        field2571 = null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class180() {
        this(4096);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IISJII)V")
    public static final void method1167(String arg0, String arg1, int arg2, int arg3, short arg4, long arg5, int arg6, int arg7) {
        ++field2573;
        if (!class151.field2185) {
            int var9 = 34 / ((arg6 - 62) / 57);
            if (class283.field4508 < 500) {
                class86.field1330[class283.field4508] = arg0;
                class69.field1087[class283.field4508] = arg1;
                class187.field2665[class283.field4508] = arg2 != -1 ? arg2 : class275.field4416;
                class280.field4475[class283.field4508] = arg4;
                field2574[class283.field4508] = arg5;
                class212.field3048[class283.field4508] = arg7;
                class195.field2798[class283.field4508] = arg3;
                ++class283.field4508;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
    private class180(int arg0) {
        super(0, true);
        this.field2572 = 4096;
        this.field2572 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLkl;)Lik;")
    public static final class225 method1168(byte arg0, class114 arg1) {
        class225 var2 = new class225(arg1.method753(arg0 + -40), arg1.method753(-128), arg1.method756(-29901), arg1.method756(-29901), arg1.method759((byte) 115), ~arg1.method760(false) == -2, arg1.method760(false));
        int var3 = arg1.method760(false);
        ++field2567;
        if (arg0 != -88) {
            method1168((byte) 80, (class114) null);
        }
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            var2.field3368.method652(126, new class152(arg1.method756(-29901), arg1.method756(arg0 ^ 29851), arg1.method756(arg0 ^ 29851), arg1.method756(-29901)));
        }
        var2.method1470((byte) 100);
        return var2;
    }
}
