import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class13 extends class113 {

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public int field251 = -1;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field253 = -1;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Lpq;")
    public static class131 field258;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(ZLqa;)V")
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.field248 = 82;
        }
        ++field254;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILqa;)Lou;")
    public final class437 method136(int arg0, class165 arg1) {
        ++field249;
        class14 var3 = arg1.method751();
        var3.method141(super.field1576, super.field1572, super.field1570);
        class437 var4 = class530.method3133(false, 3);
        if (~this.field253 != 0) {
            class334 var5 = class103.field1489.method1603((byte) -99, this.field253).method521(0, (class405) null, this.field255, -1, true, (class91) null, 2048, 0, arg1);
            if (var5 != null) {
                var5.method53(var3, var4.field6608[2], 0);
            }
        }
        if (this.field251 != -1) {
            class334 var6 = class103.field1489.method1603((byte) -99, this.field251).method521(0, (class405) null, this.field252, -1, true, (class91) null, 2048, 0, arg1);
            if (var6 != null) {
                var6.method53(var3, var4.field6608[1], 0);
            }
        }
        class334 var7 = class103.field1489.method1603((byte) -99, this.field256).method521(arg0, (class405) null, this.field248, -1, true, (class91) null, 2048, 0, arg1);
        if (var7 != null) {
            var7.method53(var3, var4.field6608[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIBLga;)V")
    public static final void method137(int arg0, boolean arg1, int arg2, byte arg3, class282 arg4) {
        ++field257;
        if (arg3 == 96) {
            int var5 = arg4.field3991;
            if (arg4.field4121 == 0) {
                arg4.field3991 = arg4.field4143;
            } else if (arg4.field4121 != 1) {
                if (arg4.field4121 == 2) {
                    arg4.field3991 = arg4.field4143 * arg2 >> 14;
                }
            } else {
                arg4.field3991 = -arg4.field4143 + arg2;
            }
            int var6 = arg4.field4043;
            if (arg4.field4006 == 0) {
                arg4.field4043 = arg4.field4075;
            } else if (~arg4.field4006 != -2) {
                if (~arg4.field4006 == -3) {
                    arg4.field4043 = arg4.field4075 * arg0 >> 14;
                }
            } else {
                arg4.field4043 = arg0 - arg4.field4075;
            }
            if (~arg4.field4121 == -5) {
                arg4.field3991 = arg4.field4101 * arg4.field4043 / arg4.field3988;
            }
            if (~arg4.field4006 == -5) {
                arg4.field4043 = arg4.field3991 * arg4.field3988 / arg4.field4101;
            }
            if (class215.field3038 && (client.method1348(arg4).field6684 != 0 || ~arg4.field4103 == -1)) {
                if (~arg4.field4043 > -6 && arg4.field3991 < 5) {
                    arg4.field3991 = 5;
                    arg4.field4043 = 5;
                } else {
                    if (~arg4.field4043 >= -1) {
                        arg4.field4043 = 5;
                    }
                    if (~arg4.field3991 >= -1) {
                        arg4.field3991 = 5;
                    }
                }
            }
            if (class385.field5850 == arg4.field4014) {
                class80.field1139 = arg4;
            }
            if (arg1 && arg4.field4011 != null) {
                if (arg4.field3991 != var5 || arg4.field4043 != var6) {
                    class143 var7 = new class143();
                    var7.field1903 = arg4;
                    var7.field1912 = arg4.field4011;
                    class518.field7619.method453((byte) 119, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BIILqa;)Z")
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field250;
        if (arg0 < 121) {
            this.method135(false, (class165) null);
        }
        class14 var5 = arg3.method751();
        var5.method141(super.field1576, super.field1572, super.field1570);
        class334 var6 = class103.field1489.method1603((byte) -99, this.field256).method521(0, (class405) null, this.field248, -1, true, (class91) null, 131072, 0, arg3);
        if (var6 != null && var6.method68(arg2, arg1, var5, true)) {
            return true;
        } else {
            if (~this.field251 != 0) {
                class334 var7 = class103.field1489.method1603((byte) -99, this.field251).method521(0, (class405) null, this.field252, -1, true, (class91) null, 131072, 0, arg3);
                if (var7 != null && var7.method68(arg2, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field253 != -1) {
                class334 var8 = class103.field1489.method1603((byte) -99, this.field253).method521(0, (class405) null, this.field255, -1, true, (class91) null, 131072, 0, arg3);
                if (var8 != null && var8.method68(arg2, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static void method139(int arg0) {
        if (arg0 != 0) {
            method137(34, true, -61, (byte) 103, (class282) null);
        }
        field258 = null;
    }
}
