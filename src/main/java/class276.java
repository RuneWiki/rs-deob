import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class276 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lqo;")
    private class141 field3832 = new class141(256);

    @OriginalMember(owner = "client!en", name = "k", descriptor = "Lqo;")
    private class141 field3838 = new class141(256);

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Lns;")
    private class438 field3836;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Lns;")
    private class438 field3837;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field3835 = -1;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field3834 = 0;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III[I)Luq;", line = 3)
    private final class343 method1750(int arg0, int arg1, int arg2, int[] arg3) {
        field3833++;
        int var5 = (arg1 << 4 & 0xFFF4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class343 var9 = (class343) this.field3838.method943(var7, -1);
        if (arg2 < 97) {
            return null;
        } else if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class400 var10 = class400.method2458(this.field3837, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class343 var11 = var10.method2457();
            this.field3838.method940(var7, -48, var11);
            if (arg3 != null) {
                arg3[0] -= var11.field5386.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IIB)Luq;", line = 44)
    public final class343 method1751(int[] arg0, int arg1, byte arg2) {
        field3831++;
        int var4 = -16 % ((52 - arg2) / 47);
        if (this.field3836.method2649(-79) == 1) {
            return this.method1754((byte) -65, arg0, arg1, 0);
        } else if (this.field3836.method2645(1, arg1) == 1) {
            return this.method1754((byte) -58, arg0, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lqa;)V", line = 67)
    public static final void method1752(class496 arg0) {
        for (int var1 = class143.field2065; var1 < class222.field3107; var1++) {
            for (int var2 = 0; var2 < class492.field7186; var2++) {
                for (int var3 = 0; var3 < class285.field4248; var3++) {
                    class420 var4 = class380.field5802[var1][var2][var3];
                    if (var4 != null) {
                        class70 var5 = var4.field6261;
                        class70 var6 = var4.field6271;
                        if (var5 != null && var5.method49(7)) {
                            class494.method2938(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method49(7)) {
                                class494.method2938(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method61(var5, (byte) 118, arg0, 0, false, 0, 0);
                                var6.method57(-5077);
                            }
                            var5.method57(-5077);
                        }
                        for (class115 var7 = var4.field6273; var7 != null; var7 = var7.field1600) {
                            class153 var9 = var7.field1594;
                            if (var9 != null && var9.method49(7)) {
                                class494.method2938(arg0, var9, var1, var2, var3, var9.field2214 + 1 - var9.field2208, var9.field2213 - var9.field2216 + 1);
                                var9.method57(-5077);
                            }
                        }
                        class383 var8 = var4.field6260;
                        if (var8 != null && var8.method49(7)) {
                            class127.method815(arg0, var8, var1, var2, var3);
                            var8.method57(-5077);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([III)Luq;", line = 154)
    public final class343 method1753(int[] arg0, int arg1, int arg2) {
        field3830++;
        if (this.field3837.method2649(arg2 - 127) == 1) {
            return this.method1750(arg1, 0, arg2 + 114, arg0);
        } else if (this.field3837.method2645(arg2 ^ 0x1, arg1) == 1) {
            return this.method1750(0, arg1, arg2 + 118, arg0);
        } else {
            if (arg2 != 0) {
                this.field3837 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lns;Lns;)V", line = 234)
    public class276(class438 arg0, class438 arg1) {
        this.field3836 = arg1;
        this.field3837 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B[III)Luq;", line = 183)
    private final class343 method1754(byte arg0, int[] arg1, int arg2, int arg3) {
        field3829++;
        int var5 = arg2 ^ (arg3 >>> 12 | (arg3 & 0x10000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        if (arg0 >= -28) {
            this.field3832 = null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class343 var9 = (class343) this.field3838.method943(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class360 var10 = (class360) this.field3832.method943(var7, -1);
            if (var10 == null) {
                var10 = class360.method2272(this.field3836, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3832.method940(var7, -86, var10);
            }
            class343 var11 = var10.method2276(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method2785((byte) -120);
                this.field3838.method940(var7, -64, var11);
                return var11;
            }
        } else {
            return null;
        }
    }
}
