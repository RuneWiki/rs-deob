import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class332 {

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lrm;")
    private class284 field5046;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Lhf;")
    private class273 field5043;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lrd;")
    private class224 field5044;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lbj;")
    public static class162 field5038 = new class162(62, 8);

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field5041 = 0;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lnn;")
    private class289 field5033;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[Ljl;")
    private class179[] field5034;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method2097(byte arg0, int arg1) {
        field5035++;
        if (arg0 > -20) {
            field5041 = -119;
        }
        return arg1 == 6 || arg1 == 7 || arg1 == 8;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 18)
    public static void method2098(byte arg0) {
        if (arg0 < 97) {
            method2098((byte) 26);
        }
        field5038 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILha;)V", line = 32)
    public static final void method2099(int arg0, class43 arg1) {
        field5045++;
        arg1.method268(-29708);
        int var2 = class174.field2806;
        class366 var3 = class15.field266 = class73.field1444[var2] = new class366();
        var3.field7789 = var2;
        int var4 = arg1.method261(30, arg0 ^ arg0);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFEE08) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field7866[0] = var6 - class496.field7292;
        var3.field6073 = (var3.field7866[0] << 7) + (var3.method2241(-36) << 6);
        var3.field7870[0] = var7 - class212.field3378;
        var3.field6078 = (var3.field7870[0] << 7) + (var3.method2241(arg0 ^ 0x4D) << 6);
        class211.field3371 = var3.field6084 = var5;
        if (class334.field5057[var2] != null) {
            var3.method2243(126, class334.field5057[var2]);
        }
        class229.field3560 = 0;
        class316.field4782[class229.field3560++] = var2;
        class320.field4891[var2] = 0;
        class458.field6799 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method261(18, 0);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class202 var13 = class253.field3890[var8] = new class202();
                var13.field3256 = 0;
                var13.field3260 = false;
                var13.field3258 = (var10 << 28) + (var11 << 14) + var12;
                var13.field3257 = -1;
                class514.field7471[class458.field6799++] = var8;
                class320.field4891[var8] = 0;
            }
        }
        arg1.method264(-123);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILfq;Lfq;I)Ljl;", line = 102)
    public final class179 method2100(int arg0, class137 arg1, class137 arg2, int arg3) {
        if (arg3 != -1) {
            method2103(null, -77, -60, 123, 49, -54, true);
        }
        field5039++;
        return this.method2101(arg0, arg2, false, true, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILfq;ZZLfq;)Ljl;", line = 117)
    private final class179 method2101(int arg0, class137 arg1, boolean arg2, boolean arg3, class137 arg4) {
        field5042++;
        if (this.field5033 == null) {
            throw new RuntimeException();
        }
        this.field5033.field4399 = arg0 * 8 + 5;
        if (this.field5033.field4408.length <= this.field5033.field4399) {
            throw new RuntimeException();
        } else if (this.field5034[arg0] == null) {
            int var6 = this.field5033.method1815((byte) -47);
            int var7 = this.field5033.method1815((byte) -108);
            if (arg2) {
                method2103(null, -47, -125, -115, 121, -41, false);
            }
            class179 var8 = new class179(arg0, arg4, arg1, this.field5043, this.field5046, var6, var7, arg3);
            this.field5034[arg0] = var8;
            return var8;
        } else {
            return this.field5034[arg0];
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z", line = 156)
    public final boolean method2102(boolean arg0) {
        if (arg0) {
            this.field5034 = null;
        }
        field5036++;
        if (this.field5033 != null) {
            return true;
        }
        if (this.field5044 == null) {
            if (this.field5043.method1724(20)) {
                return false;
            }
            this.field5044 = this.field5043.method1727(true, 255, 255, true, (byte) 0);
        }
        if (this.field5044.field582) {
            return false;
        } else {
            this.field5033 = new class289(this.field5044.method259(14));
            this.field5034 = new class179[(this.field5033.field4408.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lph;IIIIIZ)V", line = 186)
    public static final void method2103(class459 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class194.field3135 = arg5;
        class138.field2322 = arg0;
        class4.field80 = arg4;
        class503.field7350 = arg2;
        class309.field4690 = arg6;
        field5048++;
        class224.field3507 = arg3;
        class491.field7200 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V", line = 203)
    public final void method2104(boolean arg0) {
        field5037++;
        if (this.field5034 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5034.length; var2++) {
            if (this.field5034[var2] != null) {
                this.field5034[var2].method1228(-1);
            }
        }
        for (int var3 = 0; var3 < this.field5034.length; var3++) {
            if (this.field5034[var3] != null) {
                this.field5034[var3].method1222(0);
            }
        }
        if (!arg0) {
            method2099(-60, null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lhf;Lrm;)V", line = 252)
    public class332(class273 arg0, class284 arg1) {
        this.field5046 = arg1;
        this.field5043 = arg0;
        if (!this.field5043.method1724(20)) {
            this.field5044 = this.field5043.method1727(true, 255, 255, true, (byte) 0);
        }
    }
}
