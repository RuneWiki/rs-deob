import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class441 extends class553 {

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public int field5882 = -1;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public int field5890 = -1;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public static int field5884 = -1;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public int field5886;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public int field5891;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    public int field5893;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(ILqa;)Lin;", line = 7)
    public final class77 method181(int arg0, class208 arg1) {
        ++field5881;
        class165 var3 = arg1.method428();
        var3.method353(super.field8235, super.field8237, super.field8232);
        class77 var4 = class450.method2725(3, 26728);
        if (~this.field5882 != 0) {
            class159 var5 = class150.field2242.method3606((byte) 98, this.field5882).method3283(arg1, this.field5891, (class560) null, 0, 0, 0, -1, (class78) null, 2048);
            if (var5 != null) {
                var5.method93(var3, var4.field1022[2], 0);
            }
        }
        if (arg0 <= 0) {
            method2563(true, -69, -4, true);
        }
        if (this.field5890 != -1) {
            class159 var6 = class150.field2242.method3606((byte) 122, this.field5890).method3283(arg1, this.field5893, (class560) null, 0, 0, 0, -1, (class78) null, 2048);
            if (var6 != null) {
                var6.method93(var3, var4.field1022[1], 0);
            }
        }
        class159 var7 = class150.field2242.method3606((byte) -27, this.field5887).method3283(arg1, this.field5886, (class560) null, 0, 0, 0, -1, (class78) null, 2048);
        if (var7 != null) {
            var7.method93(var3, var4.field1022[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(III)Lnj;", line = 51)
    public static final class205 method2562(int arg0, int arg1, int arg2) {
        if (class420.field5697[arg0][arg1][arg2] == null) {
            boolean var3 = class420.field5697[0][arg1][arg2] != null && class420.field5697[0][arg1][arg2].field3025 != null;
            if (var3 && arg0 >= class348.field4772 - 1) {
                return null;
            }
            class630.method3672(arg0, arg1, arg2);
        }
        return class420.field5697[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILqa;IB)Z", line = 68)
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field5885;
        class165 var5 = arg1.method428();
        var5.method353(super.field8235, super.field8237, super.field8232);
        class159 var6 = class150.field2242.method3606((byte) -102, this.field5887).method3283(arg1, this.field5886, (class560) null, 0, 0, 0, -1, (class78) null, 131072);
        if (var6 != null && var6.method72(arg2, arg0, var5, true)) {
            return true;
        } else {
            if (arg3 < 44) {
                this.method171(94, (class208) null, -95, (byte) 34);
            }
            if (~this.field5890 != 0) {
                class159 var7 = class150.field2242.method3606((byte) -122, this.field5890).method3283(arg1, this.field5893, (class560) null, 0, 0, 0, -1, (class78) null, 131072);
                if (var7 != null && var7.method72(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            if (this.field5882 != -1) {
                class159 var8 = class150.field2242.method3606((byte) -125, this.field5882).method3283(arg1, this.field5891, (class560) null, 0, 0, 0, -1, (class78) null, 131072);
                if (var8 != null && var8.method72(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZIIZ)Ljava/lang/String;", line = 116)
    public static final String method2563(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field5892;
        if (~arg1 <= -3 && ~arg1 >= -37) {
            if (arg3 && arg2 >= 0) {
                int var4 = 2;
                for (int var5 = arg2 / arg1; ~var5 != -1; var5 /= arg1) {
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                if (!arg0) {
                    method2564(120, 85, -65, 22);
                }
                for (int var7 = var4 + -1; var7 > 0; --var7) {
                    int var8 = arg2;
                    arg2 /= arg1;
                    int var9 = -(arg1 * arg2) + var8;
                    if (var9 < 10) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg1);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILqa;)V", line = 169)
    public final void method194(int arg0, class208 arg1) {
        if (arg0 != 0) {
            method2564(-114, 72, -8, -54);
        }
        ++field5888;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIII)I", line = 179)
    public static final int method2564(int arg0, int arg1, int arg2, int arg3) {
        ++field5883;
        if (class624.field9190 < 100) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class339.field4685 + arg2;
            int var7 = arg0 - class339.field4696;
            for (class101 var8 = (class101) class339.field4681.method124((byte) 42); var8 != null; var8 = (class101) class339.field4681.method120(125)) {
                if (~var8.field1463 == ~arg1) {
                    int var9 = var8.field1470;
                    int var10 = var8.field1465;
                    int var11 = var10 - -class339.field4696 | class339.field4685 + var9 << 14;
                    int var12 = (var7 - var10) * (-var10 + var7) + (-var9 + var6) * (-var9 + var6);
                    if (var4 < 0 || ~var12 > ~var5) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            if (arg3 != 0) {
                field5884 = -15;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lqa;I)Lpl;", line = 227)
    public final class558 method189(class208 arg0, int arg1) {
        ++field5880;
        if (arg1 != 31733) {
            this.field5887 = 110;
        }
        return null;
    }
}
