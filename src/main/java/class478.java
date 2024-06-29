import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class478 {

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field6939 = -1;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Laia;")
    public static class257 field6941 = new class257("LIVE", "", "", 0);

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lla;")
    public static class422 field6932;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lha;")
    public static class544 field6933;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[Lbg;")
    public static class328[] field6940;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 13)
    public static void method2905(int arg0) {
        field6940 = null;
        if (arg0 == -16) {
            field6933 = null;
            field6932 = null;
            field6941 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Component;B)Lld;", line = 46)
    public static final class43 method2906(Component arg0, byte arg1) {
        field6938++;
        int var2 = 15 % ((arg1 + 5) / 53);
        return new class445(arg0);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Laa;ZLraa;IILit;II)V", line = 76)
    public static final void method2907(class570 arg0, boolean arg1, class353 arg2, int arg3, int arg4, class34 arg5, int arg6, int arg7) {
        if (!arg1) {
            field6933 = null;
        }
        field6935++;
        if (arg5 == null) {
            return;
        }
        int var8;
        if (class639.field8978 == 4) {
            var8 = (int) class261.field4064 & 0x3FFF;
        } else {
            var8 = (int) class261.field4064 + class25.field252 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field5230 / 2, arg2.field5280 / 2) + 10;
        int var10 = arg4 * arg4 + arg7 * arg7;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class582.field8226[var8];
        int var12 = class582.field8230[var8];
        if (class639.field8978 != 4) {
            var11 = var11 * 256 / (class754.field10516 + 256);
            var12 = var12 * 256 / (class754.field10516 + 256);
        }
        int var13 = arg4 * var12 + arg7 * var11 >> 14;
        int var14 = arg7 * var12 - (arg4 * var11) >> 14;
        arg5.method52(arg2.field5230 / 2 + (arg3 - (arg5.method177() / 2 - var13)), arg6 - (-(arg2.field5280 / 2) + var14 - -(arg5.method184() / 2)), arg0, arg3, arg6);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 124)
    public static final void method2908(int arg0) {
        field6937++;
        if (arg0 > -51) {
            return;
        }
        for (int var1 = 0; var1 < class49.field808; var1++) {
            int var2 = class83.field1224[var1];
            class461 var3 = ((class53) class332.field4881.method3512(true, (long) var2)).field847;
            int var4 = class624.field8742.method1987(-96);
            if ((var4 & 0x40) != 0) {
                var4 += class624.field8742.method1987(-3) << 8;
            }
            if ((var4 & 0x1) != 0) {
                var3.field6690 = class624.field8742.method1938(-1);
                var3.field6692 = class624.field8742.method1938(-1);
            }
            if ((var4 & 0x100) != 0) {
                var3.field1620 = class624.field8742.method1979((byte) 123);
                var3.field1651 = class624.field8742.method1984(4);
                var3.field1652 = class624.field8742.method1984(4);
                var3.field1688 = (byte) class624.field8742.method1924(5970);
                var3.field1644 = class199.field3403 + class624.field8742.method1938(-1);
                var3.field1642 = class199.field3403 + class624.field8742.method1972(-128);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1608 = class624.field8742.method1930(-268435456);
                var3.field1619 = class624.field8742.method1984(4);
                var3.field1685 = class624.field8742.method1979((byte) 56);
                var3.field1592 = class624.field8742.method1979((byte) 127);
                var3.field1645 = class624.field8742.method1938(-1) + class199.field3403;
                var3.field1660 = class624.field8742.method1989((byte) -32) + class199.field3403;
                var3.field1666 = class624.field8742.method1987(-62);
                var3.field1706 = 1;
                var3.field1592 += var3.field1704[0];
                var3.field1619 += var3.field1704[0];
                var3.field1707 = 0;
                var3.field1685 += var3.field1702[0];
                var3.field1608 += var3.field1702[0];
            }
            if ((var4 & 0x20) != 0) {
                int[] var5 = new int[4];
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] = class624.field8742.method1972(-128);
                    if (var5[var6] == 65535) {
                        var5[var6] = -1;
                    }
                }
                int var7 = class624.field8742.method1987(-81);
                class570.method3306(var3, var7, (byte) 127, var5);
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class624.field8742.method1989((byte) -64);
                int var9 = class624.field8742.method1934(-2);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var10 = class624.field8742.method1924(5970);
                int var11 = var10 & 0x7;
                int var12 = var10 >> 3 & 0xF;
                if (var12 == 15) {
                    var12 = -1;
                }
                var3.method892((byte) 123, var9, var12, var11, var8, false);
            }
            if ((var4 & 0x1000) != 0) {
                int var13 = class624.field8742.method1938(-1);
                int var14 = class624.field8742.method1937(0);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var15 = class624.field8742.method1924(5970);
                int var16 = var15 & 0x7;
                int var17 = (var15 & 0x7E) >> 3;
                if (var17 == 15) {
                    var17 = -1;
                }
                var3.method892((byte) 100, var14, var17, var16, var13, true);
            }
            if ((var4 & 0x4) != 0) {
                if (var3.field6688.method3041(65535)) {
                    class4.method13(353, var3);
                }
                var3.method2829(-11847, class740.field10382.method3434((byte) -115, class624.field8742.method1938(-1)));
                var3.method890(var3.field6688.field7303, 92);
                var3.field1606 = var3.field6688.field7315 << 3;
                if (var3.field6688.method3041(65535)) {
                    class52.method498(null, var3.field9470, var3.field1702[0], null, (byte) -112, 0, var3, var3.field1704[0]);
                }
            }
            if ((var4 & 0x4000) != 0) {
                int var18 = class624.field8742.method1938(-1);
                var3.field1622 = class624.field8742.method1988(118);
                var3.field1602 = class624.field8742.method1988(91);
                var3.field1675 = (var18 & 0x8000) != 0;
                var3.field1590 = var18 & 0x7FFF;
                var3.field1621 = class199.field3403 + var3.field1590 + var3.field1622;
            }
            if ((var4 & 0x2000) != 0) {
                int var19 = class624.field8742.method1987(-24);
                int[] var20 = new int[var19];
                int[] var21 = new int[var19];
                for (int var22 = 0; var22 < var19; var22++) {
                    int var23 = class624.field8742.method1961(true);
                    if ((var23 & 0xC000) == 49152) {
                        int var24 = class624.field8742.method1989((byte) -55);
                        var20[var22] = class112.method903(var24, var23 << 16);
                    } else {
                        var20[var22] = var23;
                    }
                    var21[var22] = class624.field8742.method1989((byte) -63);
                }
                var3.method880(var20, -126, var21);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1633 = class624.field8742.method1958(-3438);
                var3.field1665 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1687 = class624.field8742.method1989((byte) -72);
                if (var3.field1687 == 65535) {
                    var3.field1687 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var25 = class624.field8742.method1945(0);
                if (var25 > 0) {
                    for (int var26 = 0; var26 < var25; var26++) {
                        int var27 = -1;
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = class624.field8742.method1968((byte) 106);
                        if (var30 == 32767) {
                            var30 = class624.field8742.method1968((byte) 49);
                            var28 = class624.field8742.method1968((byte) 70);
                            var27 = class624.field8742.method1968((byte) 25);
                            var29 = class624.field8742.method1968((byte) 32);
                        } else if (var30 == 32766) {
                            var30 = -1;
                        } else {
                            var28 = class624.field8742.method1968((byte) 28);
                        }
                        int var31 = class624.field8742.method1968((byte) 96);
                        int var32 = class624.field8742.method1987(-117);
                        var3.method893(var30, class199.field3403, var28, var27, var31, var32, var29, -115);
                    }
                }
            }
            if ((var4 & 0x400) != 0) {
                int var33 = class624.field8742.method1988(89);
                int[] var34 = new int[var33];
                int[] var35 = new int[var33];
                int[] var36 = new int[var33];
                for (int var37 = 0; var37 < var33; var37++) {
                    int var38 = class624.field8742.method1989((byte) -119);
                    if (var38 == 65535) {
                        var38 = -1;
                    }
                    var34[var37] = var38;
                    var35[var37] = class624.field8742.method1924(5970);
                    var36[var37] = class624.field8742.method1961(true);
                }
                class53.method504(var3, -1, var35, var34, var36);
            }
        }
    }
}
