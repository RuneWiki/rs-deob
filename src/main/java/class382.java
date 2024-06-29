import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class382 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Ljg;")
    public static class215 field5559 = new class215();

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2290(int arg0) {
        class418.field6026.method1761(-120);
        field5562++;
        class336.field5043.method1761(arg0 - 110);
        class189.field3019.method1761(-118);
        class501.field7588.method1761(-115);
        if (arg0 == -2) {
            class201.field3189.method1761(-112);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)I", line = 20)
    public static final int method2291(int arg0, byte arg1, int arg2) {
        field5566++;
        if (arg1 <= 6) {
            field5563 = -70;
        }
        return arg2 == 1 || arg2 == 3 ? class500.field7572[arg0 & 0x3] : class142.field2310[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIILqq;)V", line = 34)
    public static final void method2292(boolean arg0, int arg1, int arg2, class318 arg3) {
        if (!arg0) {
            return;
        }
        class329.field4937 = arg3;
        field5561++;
        class152.field2427 = new class174[arg1][arg2];
        if (class444.field6858 != null) {
            class295.field4487 = class311.method1861(class444.field6858[5], class444.field6858[4], class444.field6858[3], class444.field6858[0], -29965, class444.field6858[1], class444.field6858[2]);
        }
        class487.field7412 = new class174();
        class216.method1328((byte) -72);
    }

    @OriginalMember(owner = "client!qi", name = "toString", descriptor = "()Ljava/lang/String;", line = 53)
    public final String toString() {
        field5560++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 66)
    public static void method2293(int arg0) {
        if (arg0 != 19499) {
            method2294(107, (byte) 87, -59, 16, 120, 9, -32);
        }
        field5559 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIIIII)I", line = 81)
    public static final int method2294(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        field5565++;
        if (var7 == 0) {
            return arg6;
        } else if (arg1 < 68) {
            return 83;
        } else if (var7 == 1) {
            return 7 + 1 - arg5 - arg4;
        } else if (var7 == 2) {
            return 7 - arg6 - (arg3 + -1);
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lta;I)V", line = 111)
    public static final void method2295(class135 arg0, int arg1) {
        field5564++;
        boolean var2 = false;
        if (class369.field5424 == arg0.field2160 || arg0.field2174 == -1 || arg0.field2188 != 0) {
            var2 = true;
        } else {
            class87 var3 = class429.field6302.method106(-104, arg0.field2174);
            if (var3.field1523 || arg0.field2186 + 1 > var3.field1526[arg0.field2141]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field2160 - arg0.field2144;
            int var5 = class369.field5424 - arg0.field2144;
            int var6 = arg0.field2182 * 128 + arg0.method337(arg1 - 128) * 64;
            int var7 = arg0.field2200 * 128 + (arg0.method337(arg1 ^ 0x80) * 64);
            int var8 = arg0.field2224 * 128 + arg0.method337(arg1 - 128) * 64;
            int var9 = arg0.field2221 * 128 + arg0.method337(0) * 64;
            arg0.field3218 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field3222 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        if (arg1 != 128) {
            method2290(-56);
        }
        arg0.field2233 = 0;
        if (arg0.field2181 == 0) {
            arg0.method902(8192, (byte) 104);
        }
        if (arg0.field2181 == 1) {
            arg0.method902(12288, (byte) 104);
        }
        if (arg0.field2181 == 2) {
            arg0.method902(0, (byte) 104);
        }
        if (arg0.field2181 == 3) {
            arg0.method902(4096, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 170)
    public class382(String arg0, int arg1) {
        this.field5558 = arg1;
    }
}
