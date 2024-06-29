import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class426 {

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
    public static int field5745 = 0;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field5750 = 0;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Lga;")
    public static class332 field5748;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIZILia;)Z")
    public static final boolean method2413(int arg0, int arg1, boolean arg2, int arg3, class190 arg4) {
        field5751++;
        if (!class611.field8479) {
            return false;
        } else if (class469.field6278 < 100) {
            return false;
        } else if (class454.method2559(arg1, arg0, 1, arg3)) {
            int var5 = arg1 << class62.field762;
            int var6 = arg3 << class62.field762;
            int var7 = class246.field3214[arg0].method1611(arg1, true, arg3) - 1;
            int var8 = var7 + arg4.method176((byte) -127);
            if (arg4.field2632 == 1) {
                if (!class309.method1823(2, var7, var8, class458.field6012 + var6, var6, var8, var5, var6, var5, var5)) {
                    return false;
                } else if (class309.method1823(2, var7, var7, class458.field6012 + var6, class458.field6012 + var6, var8, var5, var6, var5, var5)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field2632 == 2) {
                if (!class309.method1823(2, var7, var8, class458.field6012 + var6, class458.field6012 + var6, var8, var5, class458.field6012 + var6, var5, class458.field6012 + var5)) {
                    return false;
                } else if (class309.method1823(2, var7, var8, class458.field6012 + var6, var6 - -class458.field6012, var7, var5, var6 + class458.field6012, class458.field6012 + var5, class458.field6012 + var5)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field2632 == 4) {
                if (!class309.method1823(2, var7, var8, class458.field6012 + var6, var6, var8, var5 + class458.field6012, var6, class458.field6012 + var5, class458.field6012 + var5)) {
                    return false;
                } else if (class309.method1823(2, var7, var7, class458.field6012 + var6, class458.field6012 + var6, var8, class458.field6012 + var5, var6, class458.field6012 + var5, class458.field6012 + var5)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field2632 == 8) {
                if (!class309.method1823(2, var7, var8, var6, var6, var8, var5, var6, var5, class458.field6012 + var5)) {
                    return false;
                } else if (class309.method1823(2, var7, var8, var6, var6, var7, var5, var6, var5 + class458.field6012, class458.field6012 + var5)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg2) {
                return false;
            } else if (arg4.field2632 == 16) {
                if (class246.method1500(var7, var5, 0, class332.field4443, class332.field4443, var8, class332.field4443 + var6)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field2632 == 32) {
                if (class246.method1500(var7, var5 + class332.field4443, 0, class332.field4443, class332.field4443, var8, class332.field4443 + var6)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field2632 == 64) {
                if (class246.method1500(var7, var5 + class332.field4443, 0, class332.field4443, class332.field4443, var8, var6)) {
                    class627.field8681++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field2632 != 128) {
                return true;
            } else if (class246.method1500(var7, var5, 0, class332.field4443, class332.field4443, var8, var6)) {
                class627.field8681++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "([BIBI)I")
    public static final int method2414(byte[] arg0, int arg1, byte arg2, int arg3) {
        field5747++;
        int var4 = -1;
        if (arg2 >= -47) {
            field5750 = -33;
        }
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class591.field8149[(arg0[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static void method2415(byte arg0) {
        if (arg0 < 4) {
            field5745 = 119;
        }
        field5748 = null;
    }
}
