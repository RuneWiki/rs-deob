import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class class370 extends class41 {

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "S")
    public short field5535;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public int field5534;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "B")
    public byte field5536;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "S")
    public short field5542;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public int field5539;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "S")
    public short field5540;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "B")
    public byte field5538;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field5529;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "S")
    public short field5532;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "Z")
    public boolean field5543;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field5530 = 0;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIZZI)V")
    public static final void method2370(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field5537++;
        if (!arg3 && class351.field5335 == arg4 && class251.field3624 == arg0 && class434.field6317 == class334.field5132 || class397.field5830.method1292(class399.field5865, -2)) {
            return;
        }
        class251.field3624 = arg0;
        class351.field5335 = arg4;
        class334.field5132 = class434.field6317;
        if (class397.field5830.method1292(class399.field5865, arg1 ^ 0xFFFFFF7E)) {
            class334.field5132 = 0;
        }
        if (arg2) {
            class138.method1022(28, 1);
        } else {
            class138.method1022(25, arg1 - 127);
        }
        class54.method392((byte) 117, true, class239.field3480.method1273(true, field5530), class55.field808);
        int var5 = class483.field7082;
        class483.field7082 = (class351.field5335 - (class237.field3436 >> 4)) * 8;
        if (arg1 != 128) {
            return;
        }
        int var6 = class465.field6840;
        class465.field6840 = (class251.field3624 - (class83.field1366 >> 4)) * 8;
        class80.field1325 = class2.method19(class351.field5335 * 8, class251.field3624 * 8);
        class518.field7617 = null;
        int var7 = class483.field7082 - var5;
        int var8 = class465.field6840 - var6;
        if (arg2) {
            class322.field4943 = 0;
            int var9 = class237.field3436 * 128 - 128;
            int var10 = (class83.field1366 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class13 var12 = class132.field2030[var11];
                if (var12 != null) {
                    var12.field5529 -= var7 * 128;
                    var12.field5539 -= var8 * 128;
                    if (var12.field5529 >= 0 && var9 >= var12.field5529 && var12.field5539 >= 0 && var10 >= var12.field5539) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field409[var14] -= var7;
                            var12.field416[var14] -= var8;
                            if (var12.field409[var14] < 0 || var12.field409[var14] >= class237.field3436 || var12.field416[var14] < 0 || var12.field416[var14] >= class83.field1366) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class101.field1623[class322.field4943++] = var11;
                        } else {
                            class132.field2030[var11].method119(null, 0);
                            class132.field2030[var11] = null;
                        }
                    } else {
                        class132.field2030[var11].method119(null, 0);
                        class132.field2030[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class13 var23 = class132.field2030[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field409[var24] -= var7;
                        var23.field416[var24] -= var8;
                    }
                    var23.field5529 -= var7 * 128;
                    var23.field5539 -= var8 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class62 var21 = class390.field5783[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field409[var22] -= var7;
                    var21.field416[var22] -= var8;
                }
                var21.field5539 -= var8 * 128;
                var21.field5529 -= var7 * 128;
            }
        }
        class324[] var17 = class187.field2777;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class324 var20 = var17[var18];
            if (var20 != null) {
                var20.field4971 -= var7 * 128;
                var20.field4968 -= var8 * 128;
            }
        }
        class504.method2997(var7, arg1 ^ 0x67DB, var8);
        for (class64 var19 = (class64) class516.field7581.method2257((byte) 109); var19 != null; var19 = (class64) class516.field7581.method2256(arg1 - 22)) {
            var19.field1121 -= var8;
            var19.field1122 -= var7;
            if (class445.field6534 != 3 && (var19.field1122 < 0 || var19.field1121 < 0 || var19.field1122 >= class237.field3436 || class83.field1366 <= var19.field1121)) {
                var19.method2663(arg1 - 252);
            }
        }
        if (class403.field5926 != 0) {
            class403.field5926 -= var7;
            class48.field723 -= var8;
        }
        class513.method3039(110);
        if (arg2) {
            class311.field4453 -= var8;
            class303.field4339 -= var7;
            class294.field4197 -= var7;
            class430.field6262 -= var7 * 128;
            class291.field4175 -= var8 * 128;
            class520.field7637 -= var8;
            if (Math.abs(var7) > class237.field3436 || Math.abs(var8) > class83.field1366) {
                class193.method1317(16711680);
            }
        } else if (class403.field5944 == 4) {
            class380.field5663 -= var8 * 128;
            class117.field1850 -= var7 * 128;
            class510.field7532 -= var7 * 128;
            class87.field1460 -= var8 * 128;
        } else {
            class403.field5944 = 1;
        }
        class72.method608(0);
        class74.method620(-1);
        class91.field1503.method2264(arg1 ^ 0xB9);
        class214.field3087.method2264(106);
        class389.field5758.method1641(arg1 - 125);
        class324.method2099(false);
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
    public void method188(byte arg0) {
        if (arg0 != 76) {
            method2371(102, 93, -21, -95, -43);
        }
        field5533++;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(Z)I")
    public abstract int method107(boolean arg0);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V")
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5531++;
        class434 var5 = class483.method2888(arg4, 51, 8);
        if (arg0 != 20545) {
            field5530 = -35;
        }
        var5.method2632((byte) 81);
        var5.field6310 = arg3;
        var5.field6314 = arg2;
        var5.field6306 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field5535 = (short) arg6;
        this.field5534 = arg2;
        this.field5536 = arg9;
        this.field5542 = (short) arg5;
        this.field5539 = arg3;
        this.field5540 = (short) arg7;
        this.field5538 = (byte) arg0;
        this.field5529 = arg1;
        this.field5532 = (short) arg4;
        this.field5543 = arg8;
    }
}
