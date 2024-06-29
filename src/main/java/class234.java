import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class234 extends class137 {

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "Ljava/lang/String;")
    private String field3767 = "null";

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "Lhb;")
    public static class155 field3763 = new class155(16);

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field3775 = "Starting 3d Library";

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    public static int field3774 = 100;

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "[Lwi;")
    public static class245[] field3776 = new class245[8];

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "[I")
    public static int[] field3773 = new int[5];

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "Ljava/lang/String;")
    public static String field3777 = "Loaded input handler";

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "C")
    public char field3753;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "C")
    public char field3756;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    private int field3757;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Lhb;")
    public class155 field3755;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Lhb;")
    private class155 field3762;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "Ldk;")
    public static class251 field3752;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method1577(Object arg0, boolean arg1, byte arg2) {
        if (arg2 != -16) {
            field3773 = null;
        }
        field3770++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class19.method96(var3, 0) : var3;
        } else if (arg0 instanceof class143) {
            class143 var4 = (class143) arg0;
            return var4.method1001(6193);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Z")
    public final boolean method1578(int arg0, int arg1) {
        field3764++;
        if (this.field3755 == null) {
            return false;
        }
        if (arg1 < 18) {
            field3769 = 57;
        }
        if (this.field3762 == null) {
            this.method1582((byte) 85);
        }
        class281 var3 = (class281) this.field3762.method1059(0, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILag;IIZ)V")
    public static final void method1579(int arg0, class211 arg1, int arg2, int arg3, boolean arg4) {
        field3761++;
        int var5 = arg1.field3430;
        if (arg1.field3421 == 0) {
            arg1.field3430 = arg1.field3389;
        } else if (arg1.field3421 == 1) {
            arg1.field3430 = arg2 - arg1.field3389;
        } else if (arg1.field3421 == 2) {
            arg1.field3430 = arg1.field3389 * arg2 >> 14;
        } else if (arg1.field3421 == 3) {
            if (arg1.field3385 == 2) {
                arg1.field3430 = (arg1.field3389 - 1) * arg1.field3432 + arg1.field3389 * 32;
            } else if (arg1.field3385 == 7) {
                arg1.field3430 = arg1.field3389 * 115 + ((arg1.field3389 - 1) * arg1.field3432);
            }
        }
        int var6 = arg1.field3394;
        if (arg1.field3349 == 0) {
            arg1.field3394 = arg1.field3502;
        } else if (arg1.field3349 == 1) {
            arg1.field3394 = arg3 - arg1.field3502;
        } else if (arg1.field3349 == 2) {
            arg1.field3394 = arg1.field3502 * arg3 >> 14;
        } else if (arg1.field3349 == 3) {
            if (arg1.field3385 == 2) {
                arg1.field3394 = (arg1.field3502 - 1) * arg1.field3330 + arg1.field3502 * 32;
            } else if (arg1.field3385 == 7) {
                arg1.field3394 = (arg1.field3502 - 1) * arg1.field3330 + arg1.field3502 * 12;
            }
        }
        if (arg1.field3421 == 4) {
            arg1.field3430 = arg1.field3394 * arg1.field3366 / arg1.field3398;
        }
        if (arg1.field3349 == 4) {
            arg1.field3394 = arg1.field3430 * arg1.field3398 / arg1.field3366;
        }
        if (arg0 > -90) {
            return;
        }
        if (class176.field2877 && (client.method2015(arg1).field3629 != 0 || arg1.field3385 == 0)) {
            if (arg1.field3394 < 5 && arg1.field3430 < 5) {
                arg1.field3394 = 5;
                arg1.field3430 = 5;
            } else {
                if (arg1.field3430 <= 0) {
                    arg1.field3430 = 5;
                }
                if (arg1.field3394 <= 0) {
                    arg1.field3394 = 5;
                }
            }
        }
        if (arg1.field3446 == 1337) {
            class121.field1934 = arg1;
        }
        if (arg4 && arg1.field3466 != null && arg1.field3430 != var5 || arg1.field3394 != var6) {
            class126 var7 = new class126();
            var7.field2000 = arg1;
            var7.field1989 = arg1.field3466;
            class288.field4611.method1646(true, var7);
        }
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V")
    public static void method1580(int arg0) {
        field3777 = null;
        field3763 = null;
        field3776 = null;
        if (arg0 != -6216) {
            field3773 = null;
        }
        field3773 = null;
        field3752 = null;
        field3775 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLwd;I)V")
    private final void method1581(byte arg0, class162 arg1, int arg2) {
        if (arg0 != 48) {
            method1580(-101);
        }
        if (arg2 == 1) {
            this.field3753 = class309.method2061(arg1.method1107((byte) -77), (byte) -66);
        } else if (arg2 == 2) {
            this.field3756 = class309.method2061(arg1.method1107((byte) -86), (byte) -78);
        } else if (arg2 == 3) {
            this.field3767 = arg1.method1152(-47);
        } else if (arg2 == 4) {
            this.field3757 = arg1.method1157(65280);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1142(-18970);
            this.field3755 = new class155(class247.method1654(var4, 455314946));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1157(65280);
                class128 var7;
                if (arg2 == 5) {
                    var7 = new class59(arg1.method1152(arg0 - 106));
                } else {
                    var7 = new class281(arg1.method1157(65280));
                }
                this.field3755.method1052((long) var6, (byte) -65, var7);
            }
        }
        field3772++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    private final void method1582(byte arg0) {
        this.field3762 = new class155(this.field3755.method1053(0));
        int var2 = 28 / ((arg0 + 25) / 43);
        for (class281 var3 = (class281) this.field3755.method1063(-114); var3 != null; var3 = (class281) this.field3755.method1055(18178)) {
            class281 var4 = new class281((int) var3.field2012);
            this.field3762.method1052((long) var3.field4495, (byte) -65, var4);
        }
        field3751++;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
    public static final void method1583(int arg0, int arg1) {
        if (arg0 != 11680) {
            method1589((char) 65516, -118);
        }
        field3758++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class276.method1860(1);
        } else if (arg1 == 2) {
            class170.method1231((byte) 62);
        } else if (arg1 == 3) {
            class174.method1265(7692);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)I")
    public final int method1584(byte arg0, int arg1) {
        field3760++;
        if (this.field3755 == null) {
            return this.field3757;
        } else if (arg0 == -27) {
            class281 var3 = (class281) this.field3755.method1059(0, (long) arg1);
            return var3 == null ? this.field3757 : var3.field4495;
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1585(boolean arg0, int arg1) {
        if (!arg0) {
            method1583(-69, -81);
        }
        field3766++;
        if (this.field3755 == null) {
            return this.field3767;
        } else {
            class59 var3 = (class59) this.field3755.method1059(0, (long) arg1);
            return var3 == null ? this.field3767 : var3.field965;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)Lr;")
    public static final class253 method1586(int arg0, boolean arg1) {
        class253 var2 = (class253) class81.field1329.method1261(0, (long) arg0);
        field3771++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class83.field1382.method1680(class131.method924(arg0, -91), class207.method1451(arg0, (byte) 48), -69);
        class253 var4 = new class253();
        var4.field4039 = arg0;
        if (var3 != null) {
            var4.method1710(new class162(var3), (byte) 108);
        }
        if (!arg1) {
            method1579(-102, (class211) null, 11, -87, false);
        }
        var4.method1713(-30342);
        class81.field1329.method1264(-1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
    private final void method1587(byte arg0) {
        this.field3762 = new class155(this.field3755.method1053(0));
        field3765++;
        class59 var2 = (class59) this.field3755.method1063(-100);
        if (arg0 >= -15) {
            method1589((char) 65462, -100);
        }
        while (var2 != null) {
            class187 var3 = new class187(var2.field965, (int) var2.field2012);
            this.field3762.method1052(class307.method2053((byte) 69, var2.field965), (byte) -65, var3);
            var2 = (class59) this.field3755.method1055(18178);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwd;Z)V")
    public final void method1588(class162 arg0, boolean arg1) {
        if (arg1) {
            this.method1584((byte) -77, 59);
        }
        while (true) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 == 0) {
                field3754++;
                return;
            }
            this.method1581((byte) 48, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(CI)Z")
    public static final boolean method1589(char arg0, int arg1) {
        if (arg1 > -118) {
            field3775 = null;
        }
        field3759++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1590(String arg0, byte arg1) {
        field3768++;
        if (this.field3755 == null) {
            return false;
        }
        if (this.field3762 == null) {
            this.method1587((byte) -35);
        }
        int var3 = -66 % ((4 - arg1) / 51);
        for (class187 var4 = (class187) this.field3762.method1059(0, class307.method2053((byte) 98, arg0)); var4 != null; var4 = (class187) this.field3762.method1061(94)) {
            if (var4.field3045.equals(arg0)) {
                return true;
            }
        }
        return false;
    }
}
