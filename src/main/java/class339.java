import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class339 implements class30 {

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "Lbj;")
    private class159 field4667 = new class159(128);

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
    public int[] field4675 = new int[class468.field6847.field3096];

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "[I")
    private int[] field4672 = new int[class468.field6847.field3096];

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "F")
    public static float field4670;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I", line = 3)
    public final int method204(int arg0, int arg1) {
        if (arg1 != 64) {
            method1882((byte) 26, -42);
        }
        field4673++;
        return this.field4675[arg0];
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BI)Lss;", line = 15)
    public static final class295 method1882(byte arg0, int arg1) {
        if (arg0 < 53) {
            return null;
        }
        field4676++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class522.field7701[var2] == null || class522.field7701[var2][var3] == null) {
            boolean var4 = class478.method2809(var2, false);
            if (!var4) {
                return null;
            }
        }
        return class522.field7701[var2][var3];
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 40)
    public static final void method1883(byte arg0) {
        field4678++;
        class305.field4186 = 1;
        class362.field4979 = -1;
        class261.field3592 = false;
        class77.field1122 = 0;
        class320.field4424 = -3;
        class89.field1219 = 0;
        if (arg0 != -59) {
            field4670 = 0.34074712F;
        }
        class329.field4489 = 0;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I", line = 61)
    public final int method205(int arg0, int arg1) {
        field4664++;
        class401 var3 = class389.field5456.method1879(arg0, (byte) -57);
        if (arg1 != 15503) {
            this.field4672 = null;
        }
        int var4 = var3.field5586;
        int var5 = var3.field5576;
        int var6 = var3.field5575;
        int var7 = class386.field5426[var6 - var5];
        return this.field4675[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZ)V", line = 84)
    public final void method1884(int arg0, int arg1, boolean arg2) {
        field4669++;
        class401 var4 = class389.field5456.method1879(arg1, (byte) -108);
        int var5 = var4.field5586;
        int var6 = var4.field5576;
        int var7 = var4.field5575;
        int var8 = class386.field5426[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        if (arg2) {
            field4670 = 2.0819016F;
        }
        this.method1890((byte) 88, var5, arg0 << var6 & var9 | this.field4675[var5] & ~var9);
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(IIZ)V", line = 112)
    public final void method1885(int arg0, int arg1, boolean arg2) {
        this.field4672[arg1] = arg0;
        field4665++;
        class329 var4 = (class329) this.field4667.method979((byte) 28, (long) arg1);
        if (var4 == null) {
            class329 var5 = new class329(4611686018427387905L);
            this.field4667.method990((long) arg1, (byte) 63, var5);
        } else if (var4.field4488 != 4611686018427387905L) {
            var4.field4488 = class333.method1850(-3562) + 500L | 0x4000000000000000L;
        }
        if (!arg2) {
            field4670 = -0.061615415F;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BZ)I", line = 141)
    public final int method1886(byte arg0, boolean arg1) {
        field4677++;
        long var3 = class333.method1850(-3562);
        class329 var5 = arg1 ? (class329) this.field4667.method981(0) : (class329) this.field4667.method989(0);
        int var6 = -54 % ((arg0 - 47) / 59);
        while (var5 != null) {
            if (var3 > (var5.field4488 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field4488 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var5.field7342;
                    this.field4675[var7] = this.field4672[var7];
                    var5.method2946(-127);
                    return var7;
                }
                var5.method2946(-103);
            }
            var5 = (class329) this.field4667.method989(0);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIBIII)V", line = 179)
    public static final void method1887(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class201 var7 = (class201) class384.field5402.method2306(112);
        int var8 = 72 / ((arg3 + 63) / 41);
        while (var7 != null) {
            if (class393.field5484 >= var7.field2864) {
                var7.method2645(125);
            } else {
                class266.method1536((var7.field2868 << 7) + 64, arg1 >> 1, arg2 >> 1, (var7.field2869 << 7) + 64, arg5, (byte) -40, arg4, var7.field2870 * 2, var7.field2867);
                class34.field487.method2884(arg6 + class172.field2457[1], class172.field2457[0] + arg0, var7.field2865 | 0xFF000000, -101, 0, var7.field2871);
            }
            var7 = (class201) class384.field5402.method2302(-110);
        }
        field4666++;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V", line = 209)
    public final void method1888(int arg0, int arg1, int arg2) {
        field4674++;
        class401 var4 = class389.field5456.method1879(arg0, (byte) -43);
        int var5 = var4.field5586;
        int var6 = var4.field5576;
        if (arg1 >= -63) {
            method1887(124, -99, -112, (byte) -62, -75, -94, -86);
        }
        int var7 = var4.field5575;
        int var8 = class386.field5426[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1885(this.field4672[var5] & ~var9 | var9 & arg2 << var6, var5, true);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 238)
    public final void method1889(int arg0) {
        if (arg0 != -16777216) {
            return;
        }
        for (int var2 = 0; var2 < class468.field6847.field3096; var2++) {
            class315 var3 = class468.field6847.method1306(arg0 + 16777241, var2);
            if (var3 != null && var3.field4311 == 0) {
                this.field4672[var2] = 0;
                this.field4675[var2] = 0;
            }
        }
        field4668++;
        this.field4667 = new class159(128);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BII)V", line = 280)
    public final void method1890(byte arg0, int arg1, int arg2) {
        this.field4675[arg1] = arg2;
        field4671++;
        if (arg0 != 88) {
            return;
        }
        class329 var4 = (class329) this.field4667.method979((byte) 28, (long) arg1);
        if (var4 == null) {
            class329 var5 = new class329(class333.method1850(-3562) + 500L);
            this.field4667.method990((long) arg1, (byte) 49, var5);
        } else {
            var4.field4488 = class333.method1850(-3562) + 500L;
        }
    }
}
