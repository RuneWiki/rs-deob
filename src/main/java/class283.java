import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class283 extends class3 {

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    private int field4654 = 204;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    private int field4655 = 1;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    private int field4646 = 1;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "J")
    public static volatile long field4651 = 0L;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 57) {
            field4652 = -42;
        }
        field4650++;
        int var6 = class34.method288(3, arg5, class33.field505, class278.field4586);
        int var7 = class34.method288(3, arg4, class33.field505, class278.field4586);
        int var8 = class34.method288(3, arg2, class341.field5494, class196.field3001);
        int var9 = class34.method288(3, arg3, class341.field5494, class196.field3001);
        for (int var10 = var6; var10 <= var7; var10++) {
            class270.method1906(arg0, var9, var8, class306.field4998[var10], 116);
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V", line = 32)
    public static final void method2004(int arg0) {
        if (class275.field4544 != null) {
            class216 var1 = class275.field4544;
            synchronized (class275.field4544) {
                class275.field4544 = null;
            }
        }
        field4653++;
        int var3 = -81 / ((arg0 - 80) / 34);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 49)
    public static final void method2005(boolean arg0) {
        if (arg0) {
            method2004(-79);
        }
        class69.field1067 = new class150();
        field4657++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 63)
    public static final void method2006(int arg0, String arg1, int arg2) {
        field4656++;
        String var3 = class120.method778(class14.method103(arg1, (byte) -104), (byte) -120);
        boolean var4 = false;
        if (arg0 != 180) {
            method2006(2, (String) null, -5);
        }
        for (int var5 = 0; var5 < class38.field561; var5++) {
            class39 var6 = class130.field1984[class150.field2410[var5]];
            if (var6 != null && var6.field597 != null && var6.field597.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg2 == 1) {
                    class41.field616++;
                    class195.field2992.method250(21066, 198);
                    class195.field2992.method2191(arg0 ^ 0x1AFD, 0);
                    class195.field2992.method2189(class150.field2410[var5], -1669644664);
                } else if (arg2 == 4) {
                    class195.field2992.method250(arg0 ^ 0x52FE, 180);
                    class306.field5000++;
                    class195.field2992.method2191(6729, 0);
                    class195.field2992.method2189(class150.field2410[var5], -1669644664);
                } else if (arg2 == 5) {
                    class195.field2992.method250(21066, 5);
                    class293.field4854++;
                    class195.field2992.method2233(class150.field2410[var5], -29032);
                    class195.field2992.method2196(0, 128);
                } else if (arg2 == 6) {
                    class195.field2992.method250(21066, 101);
                    class195.field2992.method2189(class150.field2410[var5], -1669644664);
                    class195.field2992.method2193(0, false);
                    class89.field1296++;
                } else if (arg2 == 7) {
                    class195.field2992.method250(arg0 + 20886, 97);
                    class292.field4840++;
                    class195.field2992.method2236(-1620419064, class150.field2410[var5]);
                    class195.field2992.method2209(0, (byte) 118);
                }
                break;
            }
        }
        if (!var4) {
            class147.method1047(false, class140.field2266 + var3, "", 0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfh;IZ)V", line = 140)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field4649++;
        if (arg1 == 0) {
            this.field4646 = arg0.method2224(-119);
        } else if (arg1 == 1) {
            this.field4655 = arg0.method2224(-121);
        } else if (arg1 == 2) {
            this.field4654 = arg0.method2250(-1613178296);
        }
        if (arg2) {
            this.method25((byte) -25, 78);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)Lme;", line = 193)
    public static final class82 method2007(int arg0, boolean arg1) {
        field4645++;
        class82 var2 = (class82) class287.field4702.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class71.field1099.method1504(0, arg1, arg0);
        class82 var4 = new class82(var3);
        var4.method1219(class13.field175, (int[]) null);
        class287.field4702.method642(var4, (long) arg0, -106);
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 213)
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[I", line = 227)
    public final int[] method25(byte arg0, int arg1) {
        field4648++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (arg0 <= 57) {
            method2003(126, -108, -116, -102, 120, -4);
        }
        if (this.field21.field2808) {
            for (int var4 = 0; var4 < class326.field5342; var4++) {
                int var5 = class159.field2546[arg1];
                int var6 = class163.field2591[var4];
                int var7 = this.field4646 * var6 >> 12;
                int var8 = this.field4655 * var5 >> 12;
                int var9 = var5 % (4096 / this.field4655) * this.field4655;
                int var10 = var6 % (4096 / this.field4646) * this.field4646;
                if (var9 < this.field4654) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field4654) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var10 < this.field4654) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
