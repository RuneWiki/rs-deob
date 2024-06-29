import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class560 implements class660 {

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lpf;")
    public class759 field7122;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Z")
    public boolean field7115;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public int field7118;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public int field7126;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public int field7121;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Ldg;")
    public class20 field7114;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public int field7116;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field7120;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field7112;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field7111;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field7117;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field7109 = 0;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Z")
    public static boolean field7110 = false;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[I")
    public static int[] field7123 = new int[32];

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Z")
    public static boolean field7119 = false;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "F")
    public static float field7125 = 1.0F;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lgp;", line = 5)
    public final class576 method3(byte arg0) {
        if (arg0 >= -15) {
            return null;
        } else {
            field7124++;
            return class316.field3940;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 22)
    public static void method3033(boolean arg0) {
        field7123 = null;
        if (arg0) {
            field7119 = true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;BZI)V", line = 56)
    public static final void method3034(String arg0, byte arg1, boolean arg2, int arg3) {
        class472.method2666((byte) -90);
        field7113++;
        if (arg3 == 0) {
            class576.field7320 = class576.method3099(true, 0, class485.field6252.field6939.method3350(false) * 2, class678.field8763, class790.field10813, class345.field4229);
            if (arg0 != null) {
                class576.field7320.method907(0);
                class166 var4 = class165.method1046(-100, 0, class171.field2264, class353.field4310);
                class420 var5 = class576.field7320.method1002(var4, class388.method2226(class172.field2270, class353.field4310, 0), true);
                class90.method544((byte) -37);
                class530.method2903(arg0, class576.field7320, var5, true, arg1 ^ 0x7A, var4);
            }
        } else {
            class570 var6 = null;
            if (arg0 != null) {
                var6 = class576.method3099(true, 0, 0, class678.field8763, class790.field10813, class345.field4229);
                var6.method907(0);
                class166 var7 = class165.method1046(-118, 0, class171.field2264, class353.field4310);
                class420 var8 = var6.method1002(var7, class388.method2226(class172.field2270, class353.field4310, 0), true);
                class90.method544((byte) -65);
                class530.method2903(arg0, var6, var8, true, -1, var7);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class576.field7320 = class576.method3099(true, arg3, class485.field6252.field6939.method3350(false) * 2, class678.field8763, class790.field10813, class345.field4229);
                    if (arg0 != null) {
                        var6.method907(0);
                        class166 var9 = class165.method1046(-98, 0, class171.field2264, class353.field4310);
                        class420 var10 = var6.method1002(var9, class388.method2226(class172.field2270, class353.field4310, 0), true);
                        class90.method544((byte) -28);
                        class530.method2903(arg0, var6, var10, true, -1, var9);
                    }
                    if (class576.field7320.method914()) {
                        boolean var11 = true;
                        try {
                            var11 = class231.field3108.field4432 > 256;
                        } catch (Throwable var28) {
                        }
                        class270 var12;
                        if (var11) {
                            var12 = class576.field7320.method975(146800640);
                        } else {
                            var12 = class576.field7320.method975(104857600);
                        }
                        class576.field7320.method929(var12);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var13 = class485.field6252.field6949.method2402(false);
                    if (var13 == 2) {
                        class251.field3422 = true;
                    }
                    class485.field6252.method2986(0, class485.field6252.field6949, (byte) -98);
                    method3034(arg0, (byte) -123, arg2, var13);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var6 != null) {
                            try {
                                var6.method3072(5);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method3072(5);
                    } catch (Throwable var25) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var6 != null) {
                try {
                    var6.method3072(5);
                } catch (Throwable var27) {
                }
            }
        }
        if (arg1 != -123) {
            return;
        }
        class485.field6252.field6949.method2403(arg1 ^ 0xFFFFFF87, !arg2);
        class485.field6252.method2986(arg3, class485.field6252.field6949, (byte) 115);
        class210.method1408((byte) 119);
        class576.field7320.method892(10000);
        class576.field7320.method944(32);
        class129.field1724 = class576.field7320.method994();
        class5.field57 = class576.field7320.method994();
        class259.method1653((byte) -102);
        class576.field7320.method984(class485.field6252.field6921.method2445(false) == 1);
        if (class576.field7320.method993()) {
            class283.method1728(-2271, ~class485.field6252.field6936.method3272(false) == -2);
        }
        class762.method4155(class576.field7320, class240.field3280 >> 3, (byte) -80, class276.field3602 >> 3);
        class193.method1346((byte) -112);
        class119.field1603 = null;
        class165.field2184 = false;
        class459.field5997 = true;
        class243.method1597(2);
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(ILpf;Ldg;IIIIIIIZ)V", line = 179)
    public class560(int arg0, class759 arg1, class20 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field7122 = arg1;
        this.field7115 = arg10;
        this.field7118 = arg9;
        this.field7126 = arg4;
        this.field7121 = arg7;
        this.field7114 = arg2;
        this.field7116 = arg3;
        this.field7120 = arg6;
        this.field7112 = arg5;
        this.field7111 = arg8;
        this.field7117 = arg0;
    }
}
