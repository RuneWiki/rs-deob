import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class94 extends class760 {

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field1339 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!tn", name = "V", descriptor = "Lfb;")
    public static class704 field1341 = new class704();

    @OriginalMember(owner = "client!tn", name = "W", descriptor = "[Lofa;")
    public static class349[] field1342 = new class349[2048];

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V", line = 5)
    public static final void method750(int arg0, int arg1) {
        if (class566.field7573 == null || class566.field7573.length < arg1) {
            class566.field7573 = new int[arg1];
        }
        ++field1336;
        if (arg0 != -13886) {
            method755(true);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lwea;IIIII)V", line = 24)
    public static final void method751(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class315.field4541 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class405.field5875) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class710.field9947 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class243 var14 = class626.field8501[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class528.field7227[var11].method1880(var12, false, var13) + class528.field7227[var11].method1880(var12 + 1, false, var13) + class528.field7227[var11].method1880(var12, false, var13 + 1) + class528.field7227[var11].method1880(var12 + 1, false, var13 + 1)) / 4 - (class528.field7227[arg1].method1880(arg2, false, arg3) + class528.field7227[arg1].method1880(arg2 + 1, false, arg3) + class528.field7227[arg1].method1880(arg2, false, arg3 + 1) + class528.field7227[arg1].method1880(arg2 + 1, false, arg3 + 1)) / 4;
                                    class516 var16 = var14.field3270;
                                    class516 var17 = var14.field3269;
                                    if (var16 != null && var16.method59(-1)) {
                                        arg0.method60(class192.field2582, var16, var6, -73, (var12 - arg2) * class48.field722 + (1 - arg4) * class30.field464, var15, (var13 - arg3) * class48.field722 + (1 - arg5) * class30.field464);
                                    }
                                    if (var17 != null && var17.method59(-1)) {
                                        arg0.method60(class192.field2582, var17, var6, -120, (var12 - arg2) * class48.field722 + (1 - arg4) * class30.field464, var15, (var13 - arg3) * class48.field722 + (1 - arg5) * class30.field464);
                                    }
                                    for (class48 var18 = var14.field3272; var18 != null; var18 = var18.field726) {
                                        class319 var19 = var18.field725;
                                        if (var19 != null && var19.method59(-1) && (var19.field4600 == var12 || var7 == var12) && (var19.field4590 == var13 || var9 == var13)) {
                                            int var20 = var19.field4595 - var19.field4600 + 1;
                                            int var21 = var19.field4585 - var19.field4590 + 1;
                                            arg0.method60(class192.field2582, var19, var6, -118, (var19.field4600 - arg2) * class48.field722 + (var20 - arg4) * class30.field464, var15, (var19.field4590 - arg3) * class48.field722 + (var21 - arg5) * class30.field464);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(III)Lkp;", line = 114)
    public static final class516 method752(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3270;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIJ)Lds;", line = 121)
    public static final class16 method753(int arg0, int arg1, long arg2) {
        if (arg1 != 13175) {
            return null;
        } else {
            ++field1334;
            class16 var4 = (class16) class226.field3096.method3953((long) arg0 << 56 | arg2, 14);
            if (var4 == null) {
                var4 = new class16(arg0, arg2);
                class226.field3096.method3962(var4.field1409, var4, -123);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B[I)Ljava/lang/String;", line = 140)
    public static final String method754(byte arg0, int[] arg1) {
        int var2 = 45 / ((arg0 - -17) / 55);
        ++field1337;
        StringBuffer var3 = new StringBuffer();
        int var4 = class24.field382;
        for (int var5 = 0; ~arg1.length < ~var5; ++var5) {
            class606 var6 = class564.field7557.method3260((byte) -18, arg1[var5]);
            if (var6.field8222 != -1) {
                class147 var7 = (class147) class549.field7422.method1541(-10, (long) var6.field8222);
                if (var7 == null) {
                    class508 var8 = class508.method2950(class643.field8927, var6.field8222, 0);
                    if (var8 != null) {
                        var7 = class379.field5542.method477(var8, true);
                        class549.field7422.method1544(true, var7, (long) var6.field8222);
                    }
                }
                if (var7 != null) {
                    class688.field9677[var4] = var7;
                    var3.append(" <img=").append(var4).append(">");
                    ++var4;
                }
            }
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V", line = 191)
    public static void method755(boolean arg0) {
        field1342 = null;
        field1341 = null;
        field1339 = null;
        if (!arg0) {
            field1341 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)[[I", line = 204)
    public final int[][] method360(int arg0, byte arg1) {
        ++field1340;
        int[][] var3 = super.field4733.method1251((byte) 69, arg0);
        if (super.field4733.field2369 && this.method4219(-26298)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field10525 * super.field10525;
            for (int var8 = 0; ~class261.field3874 < ~var8; ++var8) {
                int var9 = super.field10530[var7 - -(var8 % super.field10527)];
                var6[var8] = class440.method2643(255, var9) << 4;
                var5[var8] = class440.method2643(65280, var9) >> 4;
                var4[var8] = class440.method2643(var9, 16711680) >> 12;
            }
        }
        return arg1 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V", line = 258)
    public static final void method756(int arg0) {
        if (arg0 != 15696) {
            field1338 = -104;
        }
        class405.field5877 = 0;
        ++field1335;
        class781.field10707 = 0;
        for (int var1 = 0; ~var1 > ~class40.field637; ++var1) {
            int var2 = class704.field9863 * var1;
            for (int var3 = 0; var3 < class704.field9863; ++var3) {
                int var4 = var2 + var3;
                class205.field2686[var4].method2187(class639.field8876 * var3, class462.field6403 * var1, class639.field8876, class462.field6403, 0, 0, true, true);
            }
        }
    }
}
