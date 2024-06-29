import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class240 {

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Ljava/lang/String;")
    public String field3379;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Ljava/lang/String;")
    public String field3376;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "J")
    public long field3382;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "[Lhu;")
    public static class133[] field3383;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
    public static void method1505(byte arg0) {
        if (arg0 == -10) {
            field3383 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1506(String arg0, boolean arg1) {
        if (!arg1) {
            field3383 = null;
        }
        field3380++;
        System.out.println("Error: " + class574.method3159(arg0, "\n", "%0a", 108));
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIII)V")
    public static final void method1507(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3381++;
        class127 var5 = class760.method4231(arg4, -874792672, 4);
        var5.method1010(614);
        if (arg1 != 100) {
            field3383 = null;
        }
        var5.field2092 = arg3;
        var5.field2097 = arg0;
        var5.field2099 = arg2;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIILjg;)V")
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, class343 arg4) {
        class701 var5 = class229.method1455(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field3505 = (arg1 << class140.field2224) + class307.field4416;
        arg4.field3510 = arg3;
        arg4.field3502 = (arg2 << class140.field2224) + class307.field4416;
        var5.field9740 = arg4;
        int var6 = class588.field7675 == class507.field6771 ? 1 : 0;
        if (arg4.method806((byte) -72)) {
            if (arg4.method801(false)) {
                arg4.field3513 = class8.field162[var6];
                class8.field162[var6] = arg4;
                return;
            }
            arg4.field3513 = class496.field6694[var6];
            class496.field6694[var6] = arg4;
            class302.field4291 = true;
            return;
        }
        arg4.field3513 = class15.field214[var6];
        class15.field214[var6] = arg4;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZIILog;I)Z")
    public static final boolean method1509(boolean arg0, int arg1, int arg2, class649 arg3, int arg4) {
        field3384++;
        if (!class499.field6715 || !class557.field7336) {
            return false;
        } else if (class462.field6335 < 100) {
            return false;
        } else {
            if (arg0) {
                field3383 = null;
            }
            if (!class336.method2023((byte) -124, arg1, arg4, arg2)) {
                return false;
            }
            int var5 = arg4 << class140.field2224;
            int var6 = arg2 << class140.field2224;
            int var7 = class507.field6771[arg1].method1742(arg4, 96, arg2) - 1;
            int var8 = var7 + arg3.method789(-32768);
            if (arg3.field8623 == 1) {
                if (!class566.method3128(false, var5, var5, var7, var5, var8, class384.field5377 + var6, var8, var6, var6)) {
                    return false;
                } else if (class566.method3128(false, var5, var5, var7, var5, var7, class384.field5377 + var6, var8, class384.field5377 + var6, var6)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 == 2) {
                if (!class566.method3128(false, var5, var5 + class384.field5377, var7, var5, var8, class384.field5377 + var6, var8, class384.field5377 + var6, class384.field5377 + var6)) {
                    return false;
                } else if (class566.method3128(false, var5, var5 + class384.field5377, var7, class384.field5377 + var5, var8, class384.field5377 + var6, var7, var6 + class384.field5377, class384.field5377 + var6)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 == 4) {
                if (!class566.method3128(false, class384.field5377 + var5, class384.field5377 + var5, var7, var5 + class384.field5377, var8, var6 + class384.field5377, var8, var6, var6)) {
                    return false;
                } else if (class566.method3128(false, var5 + class384.field5377, class384.field5377 + var5, var7, class384.field5377 + var5, var7, class384.field5377 + var6, var8, class384.field5377 + var6, var6)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 == 8) {
                if (!class566.method3128(arg0, var5, class384.field5377 + var5, var7, var5, var8, var6, var8, var6, var6)) {
                    return false;
                } else if (class566.method3128(false, var5, var5 + class384.field5377, var7, var5 + class384.field5377, var8, var6, var7, var6, var6)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 == 16) {
                if (class703.method3958(class307.field4416, var8, var7, class307.field4416 + var6, var5, 51, class307.field4416)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 == 32) {
                if (class703.method3958(class307.field4416, var8, var7, class307.field4416 + var6, class307.field4416 + var5, 50, class307.field4416)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 == 64) {
                if (class703.method3958(class307.field4416, var8, var7, var6, class307.field4416 + var5, 38, class307.field4416)) {
                    class166.field2577++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg3.field8623 != 128) {
                return true;
            } else if (class703.method3958(class307.field4416, var8, var7, var6, var5, 85, class307.field4416)) {
                class166.field2577++;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class240(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field3379 = arg3;
        this.field3376 = arg1;
        this.field3378 = arg0;
        this.field3377 = arg2;
        this.field3382 = arg4;
    }
}
