import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class553 extends class108 {

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public int field7827;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field7831;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BIIILgp;IZ)V", line = 3)
    public static final void method3103(byte arg0, int arg1, int arg2, int arg3, class561 arg4, int arg5, boolean arg6) {
        class66.field1086 = arg5;
        class161.field2392 = arg6;
        class376.field5531 = 1;
        class617.field8732 = arg3;
        class444.field6479 = arg1;
        class69.field1309 = arg4;
        int var7 = 115 % ((arg0 + 16) / 47);
        field7828++;
        class442.field6468 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLmda;)V", line = 22)
    public static final void method3104(byte arg0, class17 arg1) {
        if (arg0 != -89) {
            method3106(-89, -88, (byte) -47, -94, 107);
        }
        arg1.field254 = null;
        field7832++;
        if (class430.field6274 < 20) {
            class118.field1909.method952((byte) 15, arg1);
            class430.field6274++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)I", line = 46)
    public static final int method3105(byte arg0, int arg1, int arg2) {
        field7830++;
        if (arg1 == 4 || arg1 == 5) {
            return class498.field6985[arg2 & 0x3];
        } else {
            if (arg0 != 65) {
                method3103((byte) 34, 79, 33, 4, null, 36, false);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBII)V", line = 61)
    public static final void method3106(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7829++;
        for (class154 var5 = (class154) class134.field2163.method427(true); var5 != null; var5 = (class154) class134.field2163.method420(false)) {
            class642.method3701(arg1, (byte) 59, arg4, var5, arg0, arg3);
        }
        if (arg2 > -77) {
            method3106(4, 84, (byte) 113, -17, 104);
        }
        for (class154 var6 = (class154) class90.field1611.method427(true); var6 != null; var6 = (class154) class90.field1611.method420(false)) {
            byte var11 = 1;
            class298 var12 = var6.field2317.method772(0);
            if (var6.field2317.field1489) {
                var11 = 0;
            } else if (var6.field2317.field1531 == var12.field4275 || var6.field2317.field1531 == var12.field4301 || var6.field2317.field1531 == var12.field4297 || var6.field2317.field1531 == var12.field4305) {
                var11 = 2;
            } else if (var6.field2317.field1531 == var12.field4310 || var6.field2317.field1531 == var12.field4283 || var6.field2317.field1531 == var12.field4300 || var6.field2317.field1531 == var12.field4282) {
                var11 = 3;
            }
            if (var6.field2325 != var11) {
                int var13 = class19.method217(-114, var6.field2317);
                if (var6.field2315 != var13) {
                    if (var6.field2312 != null) {
                        class35.field485.method44(var6.field2312);
                        var6.field2312 = null;
                    }
                    var6.field2315 = var13;
                }
                var6.field2325 = var11;
            }
            var6.field2307 = var6.field2317.field5108;
            var6.field2308 = var6.field2317.field5108 + (var6.field2317.method781((byte) -90) << 6);
            var6.field2314 = var6.field2317.field5109;
            var6.field2319 = var6.field2317.field5109 + (var6.field2317.method781((byte) 42) << 6);
            class642.method3701(arg1, (byte) 59, arg4, var6, arg0, arg3);
        }
        for (class154 var7 = (class154) class424.field6207.method734(0); var7 != null; var7 = (class154) class424.field6207.method736(-1)) {
            byte var8 = 1;
            class298 var9 = var7.field2322.method772(0);
            if (var7.field2322.field1489) {
                var8 = 0;
            } else if (var7.field2322.field1531 == var9.field4275 || var7.field2322.field1531 == var9.field4301 || var7.field2322.field1531 == var9.field4297 || var7.field2322.field1531 == var9.field4305) {
                var8 = 2;
            } else if (var7.field2322.field1531 == var9.field4310 || var7.field2322.field1531 == var9.field4283 || var7.field2322.field1531 == var9.field4300 || var7.field2322.field1531 == var9.field4282) {
                var8 = 3;
            }
            if (var7.field2325 != var8) {
                int var10 = class133.method1027(var7.field2322, false);
                if (var7.field2315 != var10) {
                    if (var7.field2312 != null) {
                        class35.field485.method44(var7.field2312);
                        var7.field2312 = null;
                    }
                    var7.field2315 = var10;
                }
                var7.field2325 = var8;
            }
            var7.field2307 = var7.field2322.field5108;
            var7.field2308 = var7.field2322.field5108 + (var7.field2322.method781((byte) 47) << 6);
            var7.field2314 = var7.field2322.field5109;
            var7.field2319 = var7.field2322.field5109 + (var7.field2322.method781((byte) 126) << 6);
            class642.method3701(arg1, (byte) 59, arg4, var7, arg0, arg3);
        }
    }
}
