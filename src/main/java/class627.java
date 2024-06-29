import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class627 extends class86 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lkka;")
    public static class542 field7959 = new class542();

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field7964 = 0;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I", line = 4)
    public final int method3350(boolean arg0) {
        if (arg0) {
            return 14;
        } else {
            ++field7960;
            return super.field1200;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 18)
    public static final void method3351(int arg0, String[] arg1) {
        ++field7968;
        if (~arg1.length >= -2) {
            class656.field8466 = class656.field8466 + arg1[0];
            class749.field10220 += arg1[0].length();
        } else {
            for (int var2 = 0; ~arg1.length < ~var2; ++var2) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class789.method4318("Pausing for " + var3 + " seconds...", false);
                    class549.field6891 = arg1;
                    class545.field6826 = var2 + 1;
                    class675.field8735 = class502.method2786(arg0 + 603625936) - -((long) (var3 * 1000));
                    return;
                }
                class656.field8466 = arg1[var2];
                class636.method3432(false, true);
            }
        }
        if (arg0 != -603633050) {
            method3353(-93);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)I", line = 68)
    public static final int method3352(int arg0, int arg1) {
        return class329.field4032 != null ? class329.field4032[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 72)
    public static void method3353(int arg0) {
        field7959 = null;
        if (arg0 != -1) {
            field7964 = -18;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BIIII)Z", line = 82)
    public static final boolean method3354(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7969;
        boolean var6 = true;
        if (arg5 != -8428) {
            method3351(85, (String[]) null);
        }
        class234 var7 = new class234(arg1);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method1510(107);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method1505((byte) -6);
                    if (~var13 == -1) {
                        continue label60;
                    }
                    var10 += var13 + -1;
                    int var14 = 63 & var10;
                    int var15 = (4080 & var10) >> 6;
                    int var16 = var7.method1509(true) >> 2;
                    int var17 = arg4 + var15;
                    int var18 = var14 - -arg0;
                    if (~var17 < -1 && ~var18 < -1 && ~(arg2 + -1) < ~var17 && arg3 - 1 > var18) {
                        class773 var19 = class390.field4983.method4292(var8, (byte) -103);
                        if (var16 != 22 || class485.field6252.field6938.method2223(false) != 0 || var19.field10488 != 0 || var19.field10464 == 1 || var19.field10476) {
                            if (!var19.method4209(-85)) {
                                ++class122.field1631;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method1505((byte) -6);
                if (var12 == 0) {
                    break;
                }
                var7.method1509(true);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I", line = 167)
    public final int method72(int arg0, int arg1) {
        ++field7966;
        if (!class124.method732(super.field1203.field6949.method2402(false), arg1 + 94)) {
            return 3;
        } else {
            if (arg1 != -2) {
                this.method3350(true);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V", line = 182)
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        if (arg1) {
            field7959 = null;
        }
        ++field7962;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ILsf;)V", line = 193)
    public class627(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)I", line = 197)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            method3352(20, 71);
        }
        ++field7961;
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lsf;)V", line = 209)
    public class627(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)Z", line = 216)
    public final boolean method3355(int arg0) {
        int var2 = -75 % ((arg0 - -57) / 57);
        ++field7963;
        return class124.method732(super.field1203.field6949.method2402(false), 34);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 230)
    public static final void method3356(int arg0) {
        if (arg0 <= 1) {
            field7959 = null;
        }
        ++field7965;
        class80 var1 = null;
        try {
            class339 var2 = class740.field10014.method4234("", true, 0);
            while (~var2.field4144 == -1) {
                class591.method3181(1L, 0);
            }
            if (~var2.field4144 == -2) {
                var1 = (class80) var2.field4142;
                class234 var3 = class485.field6252.method2989(6654);
                var1.method500(var3.field3193, var3.field3133, (byte) 0, 0);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method503((byte) 61);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 267)
    public final void method71(byte arg0) {
        if (super.field1203.field6949.method2400(-25176) && !class124.method732(super.field1203.field6949.method2402(false), arg0 ^ -111)) {
            super.field1200 = 0;
        }
        ++field7967;
        if (arg0 != -65) {
            field7959 = null;
        }
        if (~super.field1200 > -1 || super.field1200 > 2) {
            super.field1200 = this.method73(0);
        }
    }
}
