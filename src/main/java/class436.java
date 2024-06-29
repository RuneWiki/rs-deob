import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class436 extends class85 {

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Z")
    public static volatile boolean field5982 = true;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public int field5980;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Ljava/lang/String;")
    public String field5975;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILgk;I[IB[I)Lio;", line = 5)
    public static final class116 method2566(int arg0, class463 arg1, int arg2, int[] arg3, byte arg4, int[] arg5) {
        ++field5985;
        byte[] var6 = new byte[arg0 * arg2];
        if (arg4 <= 115) {
            field5986 = -22;
        }
        for (int var7 = 0; ~arg0 < ~var7; ++var7) {
            int var8 = arg2 * var7 + arg5[var7];
            for (int var9 = 0; arg3[var7] > var9; ++var9) {
                var6[var8++] = -1;
            }
        }
        return new class116(arg1, arg2, arg0, var6);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 36)
    public final void method2567(int arg0) {
        ++field5983;
        if (arg0 != 16013) {
            field5982 = true;
        }
        super.field1143 = 500L + class173.method1134(true) | super.field1143 & Long.MIN_VALUE;
        class465.field6839.method2858(15, this);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)J", line = 49)
    public final long method2568(boolean arg0) {
        if (!arg0) {
            return 15L;
        } else {
            ++field5984;
            return super.field1143 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I", line = 60)
    public final int method2569(int arg0) {
        if (arg0 > -41) {
            method2572(false);
        }
        ++field5976;
        return (int) (255L & super.field7456 >>> 32);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)Lsu;", line = 72)
    public static final class111 method2570(byte arg0, int arg1) {
        ++field5981;
        class111[] var2 = class282.method1723((byte) -32);
        if (arg0 != 15) {
            method2572(true);
        }
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class111 var4 = var2[var3];
            if (var4.field1531 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V", line = 99)
    public static final void method2571(int arg0) {
        ++field5987;
        if (class470.field6876 != 0) {
            if (arg0 == 1000) {
                try {
                    if (++class421.field5646 > 1500) {
                        if (class286.field3643 != null) {
                            class286.field3643.method1003(arg0 + -999);
                            class286.field3643 = null;
                        }
                        if (~class418.field5558 <= -2) {
                            class470.field6876 = 0;
                            class169.field2211 = -5;
                            return;
                        }
                        if (~class474.field6929 == ~class440.field6122) {
                            class474.field6929 = class25.field440;
                        } else {
                            class474.field6929 = class440.field6122;
                        }
                        class421.field5646 = 0;
                        ++class418.field5558;
                        class470.field6876 = 1;
                    }
                    if (~class470.field6876 == -2) {
                        class265.field3367 = class172.field2221.method2622(class512.field7541, class474.field6929, -1727);
                        class470.field6876 = 2;
                    }
                    if (class470.field6876 == 2) {
                        if (~class265.field3367.field3542 == -3) {
                            throw new IOException();
                        }
                        if (class265.field3367.field3542 != 1) {
                            return;
                        }
                        class286.field3643 = new class144((Socket) class265.field3367.field3541, class172.field2221);
                        class265.field3367 = null;
                        class286.field3643.method1001(0, (byte) -128, class319.field4112.field1223, class319.field4112.field1176);
                        class114.method741((byte) 7);
                        int var1 = class286.field3643.method1000((byte) 29);
                        class114.method741((byte) -123);
                        if (var1 != 101) {
                            class470.field6876 = 0;
                            class169.field2211 = var1;
                            class286.field3643.method1003(1);
                            class286.field3643 = null;
                            return;
                        }
                        class470.field6876 = 3;
                    }
                    if (class470.field6876 == 3) {
                        if (class286.field3643.method1004(3) >= 2) {
                            int var2 = class286.field3643.method1000((byte) 29) << 8 | class286.field3643.method1000((byte) 29);
                            class18.method119((byte) -80, var2);
                            if (~class375.field4875 == 0) {
                                class169.field2211 = 6;
                                class470.field6876 = 0;
                                class286.field3643.method1003(1);
                                class286.field3643 = null;
                            } else {
                                class470.field6876 = 0;
                                class286.field3643.method1003(1);
                                class286.field3643 = null;
                                class164.method1086(14052);
                            }
                        }
                    }
                } catch (IOException var3) {
                    if (class286.field3643 != null) {
                        class286.field3643.method1003(1);
                        class286.field3643 = null;
                    }
                    if (~class418.field5558 <= -2) {
                        class169.field2211 = -4;
                        class470.field6876 = 0;
                    } else {
                        if (~class474.field6929 == ~class440.field6122) {
                            class474.field6929 = class25.field440;
                        } else {
                            class474.field6929 = class440.field6122;
                        }
                        class421.field5646 = 0;
                        ++class418.field5558;
                        class470.field6876 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V", line = 231)
    public static final void method2572(boolean arg0) {
        if (!arg0) {
            field5986 = -124;
        }
        ++field5989;
        for (class72 var1 = (class72) class315.field4060.method49(31); var1 != null; var1 = (class72) class315.field4060.method46((byte) 60)) {
            if (var1.field884) {
                var1.method409(93);
            }
        }
        for (class72 var2 = (class72) class368.field4741.method49(-128); var2 != null; var2 = (class72) class368.field4741.method46((byte) 78)) {
            if (var2.field884) {
                var2.method409(106);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)I", line = 264)
    public final int method2573(int arg0) {
        ++field5978;
        if (arg0 <= 45) {
            this.field5979 = 104;
        }
        return (int) super.field7456;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V", line = 284)
    public final void method2574(byte arg0) {
        ++field5988;
        super.field1143 |= Long.MIN_VALUE;
        if (arg0 <= 28) {
            this.field5980 = 126;
        }
        if (this.method2568(true) == 0L) {
            class484.field7042.method2858(15, this);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lqa;IILia;III[[[B[I[I[I[I[IIBIIZ)V", line = 301)
    public static final void method2575(class129 arg0, int arg1, int arg2, class142 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class372.field4831 = arg0;
        class8.field82 = arg1;
        class370.field4774 = arg3;
        class98.field1368 = class372.field4831.method843() > 0;
        class225.field2922 = arg4 >> class169.field2206;
        class477.field6969 = arg6 >> class169.field2206;
        class273.field3472 = arg4;
        field5986 = arg6;
        class332.field4258 = arg5;
        class297.field3862 = class225.field2922 - class18.field318;
        if (class297.field3862 < 0) {
            class503.field7392 = -class297.field3862;
            class297.field3862 = 0;
        } else {
            class503.field7392 = 0;
        }
        class83.field1027 = class477.field6969 - class18.field318;
        if (class83.field1027 < 0) {
            class448.field6236 = -class83.field1027;
            class83.field1027 = 0;
        } else {
            class448.field6236 = 0;
        }
        class411.field5491 = class225.field2922 + class18.field318;
        if (class411.field5491 > class166.field2155) {
            class411.field5491 = class166.field2155;
        }
        class271.field3438 = class477.field6969 + class18.field318;
        if (class271.field3438 > class13.field230) {
            class271.field3438 = class13.field230;
        }
        for (int var18 = 0; var18 < class18.field318 + class18.field318 + 2; ++var18) {
            for (int var23 = 0; var23 < class18.field318 + class18.field318 + 2; ++var23) {
                int var24 = class225.field2922 - class18.field318 + var18;
                int var25 = class477.field6969 - class18.field318 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class166.field2155 && var25 < class13.field230) {
                    int var26 = var24 << class169.field2206;
                    int var27 = var25 << class169.field2206;
                    int var28 = class405.field5436[class405.field5436.length - 1].method1187(var24, var25) - (1000 << class169.field2206 - 7);
                    int var29 = class283.field3620 != null ? class283.field3620[0].method1187(var24, var25) + class286.field3658 : class405.field5436[0].method1187(var24, var25) + class286.field3658;
                    class465.field6840[var18][var23] = class372.field4831.method887(var26, var28, var27, var26, var29, var27);
                } else {
                    class465.field6840[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class18.field318 + class18.field318 + 1; ++var19) {
            for (int var22 = 0; var22 < class18.field318 + class18.field318 + 1; ++var22) {
                class357.field4598[var19][var22] = class465.field6840[var19][var22] || class465.field6840[var19 + 1][var22] || class465.field6840[var19][var22 + 1] || class465.field6840[var19 + 1][var22 + 1];
            }
        }
        class493.field7206 = arg8;
        class391.field5131 = arg9;
        class269.field3406 = arg10;
        class349.field4472 = arg11;
        class29.field498 = arg12;
        class301.method1805();
        class113.method739((byte) 27);
        for (class465 var20 = (class465) class193.field2500.method2122(0); var20 != null; var20 = (class465) class193.field2500.method2129(95)) {
            var20.method2336((byte) 119);
            class316.method1885(true, var20);
        }
        if (class98.field1368) {
            for (int var21 = 0; var21 < class278.field3564; ++var21) {
                class121.field1683[var21].method543(arg1, arg17, 114);
            }
        }
        if (arg2 > 1) {
            class372.field4831.method908(0);
            if (class522.field7748 == null || class522.field7748 instanceof class119) {
                class522.field7748 = new class29();
            }
        } else if (class522.field7748 == null || class522.field7748 instanceof class29) {
            class522.field7748 = new class119();
        }
        class522.field7748.method200(arg2, -128);
        class522.field7748.method202((byte) 49);
        if (class354.field4550 != null) {
            class105.method699(true);
            class522.field7748.method205(22, true);
            class421.method2484(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class522.field7748.method202((byte) -122);
            class522.field7748.method205(23, true);
            class105.method699(false);
        }
        class421.method2484(arg2, arg7, arg13, arg14, arg15, arg16);
        class522.field7748.method202((byte) -101);
        class522.field7748.method199(5000);
        class522.field7748.method202((byte) -115);
        if (arg2 > 1) {
            class372.field4831.method874(0);
        }
        class372.field4831.method906(0, (class182[]) null);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V", line = 457)
    public class436(int arg0, int arg1) {
        super.field7456 = (long) arg0 << 32 | (long) arg1;
    }
}
