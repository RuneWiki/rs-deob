import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class89 {

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "F")
    public float field1011 = 1.0F;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "F")
    public float field1008 = 0.25F;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "F")
    public float field1024 = 1.0F;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "F")
    public float field1015;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "F")
    public float field1021;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lmc;")
    public class316 field1013;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "F")
    public float field1007;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method488(byte arg0) {
        field1006++;
        if (arg0 != 35) {
            field1005 = -4;
        }
        class235.field3242.method1560(class281.field3851, class12.field115, class385.field5486);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lu;")
    public static final class185 method489(int arg0) {
        field1019++;
        if (arg0 != 32) {
            return null;
        }
        try {
            return (class185) Class.forName("jc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLja;)Z")
    public final boolean method490(boolean arg0, class89 arg1) {
        field1016++;
        if (arg0) {
            return this.field1020 == arg1.field1020 && this.field1015 == arg1.field1015 && this.field1007 == arg1.field1007 && this.field1021 == arg1.field1021 && this.field1008 == arg1.field1008 && this.field1024 == arg1.field1024 && this.field1011 == arg1.field1011 && this.field1014 == arg1.field1014 && this.field1017 == arg1.field1017 && this.field1013 == arg1.field1013;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ltq;I)V")
    public final void method491(class250 arg0, int arg1) {
        this.field1024 = (float) (arg0.method1350(31351) * 8) / 255.0F;
        field1010++;
        this.field1008 = (float) (arg0.method1350(31351) * 8) / 255.0F;
        if (arg1 < 22) {
            this.field1007 = 0.075482674F;
        }
        this.field1011 = (float) (arg0.method1350(31351) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static final void method492(byte arg0) {
        if (arg0 != -20) {
            field1005 = 76;
        }
        field1023++;
        class58.field601.method606((byte) 92);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)V")
    public static final void method493(int arg0, boolean arg1, int arg2) {
        field1009++;
        try {
            if (arg2 != 0 && arg1) {
                class88.field1003 = class88.method486(class293.field3985, class159.field2055, (byte) 97, 0, class38.field391, 0);
                class88.field1003.method1578(0);
                class402 var3 = class243.method1305(class199.field2662, 0, class333.field4428, true);
                class298 var4 = class88.field1003.method1601(var3, class241.method1291(class72.field797, class333.field4428, 0), true);
                class88.method484(var4, 0, class337.field4499, true);
                class88.field1003.method1646();
                class279.method1543((byte) -127);
            }
            class88.field1003 = class88.method486(class293.field3985, class159.field2055, (byte) 127, arg2, class38.field391, class424.field6226 * 2);
            if (class88.field1003.method1624()) {
                class130 var5 = class88.field1003.method1595(536870912);
                class88.field1003.method1582(var5);
            }
        } catch (Throwable var7) {
            if (arg2 != 0) {
                arg2 = 0;
                class88.field1003 = class88.method486(class293.field3985, class159.field2055, (byte) 88, 0, class38.field391, 0);
            }
        }
        class101.field1182 = arg2;
        class374.method2248((byte) 51);
        if (!class88.field1003.method1557()) {
            class353.field4935 = 1;
        }
        class88.field1003.method1627(class353.field4935);
        class88.field1003.method1618(arg0);
        class62.field635 = class88.field1003.method1586();
        class143.field1834 = class88.field1003.method1586();
        int var6 = (int) ((double) class315.field4214 * 34.46D);
        if (class88.field1003.method1563()) {
            var6 += 128;
        }
        class88.field1003.method1600(50, var6);
        class88.field1003.method1558(!class92.field1058);
        if (class88.field1003.method1619()) {
            class188.method1012(class225.field3041, -1);
        }
        class77.field871 = !class138.method758(-10762);
        class230.method1252(-22602, class88.field1003, class315.field4214 >> 3, class340.field4549 >> 3);
        class232.method1258(95);
        class114.field1416 = false;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLem;ZZ)V")
    public static final void method494(boolean arg0, class141 arg1, boolean arg2, boolean arg3) {
        field1022++;
        int var4 = arg1.field1802;
        int var5 = (int) arg1.field4510;
        arg1.method1967(-1);
        if (arg2) {
            class301.method1780(var4, (byte) -59);
        }
        class222.method1198(var4, true);
        class194 var6 = class57.method301(var5, (byte) 63);
        if (var6 != null) {
            class204.method1107(var6, (byte) -105);
        }
        class414.method2570(arg3);
        if (!arg0 && class272.field3680 != -1) {
            class345.method2011(class272.field3680, 1, -13);
        }
        class243 var7 = new class243(class337.field4495);
        for (class141 var8 = (class141) var7.method1303(0); var8 != null; var8 = (class141) var7.method1304((byte) -109)) {
            if (!var8.method1970(-2)) {
                var8 = (class141) var7.method1303(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field1803 == 3) {
                int var9 = (int) var8.field4510;
                if (var9 >>> 16 == var4) {
                    method494(arg0, var8, true, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class89() {
        this.field1015 = 1.1523438F;
        this.field1025 = -50;
        this.field1021 = 1.2F;
        this.field1013 = class75.field826;
        this.field1014 = class305.field4141;
        this.field1018 = -60;
        this.field1007 = 0.69921875F;
        this.field1020 = class109.field1339;
        this.field1012 = -50;
        this.field1017 = 0;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ltq;)V")
    public class89(class250 arg0) {
        int var2 = arg0.method1350(31351);
        if (class199.field2664 && class235.field3242.method1590() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1020 = class109.field1339;
            } else {
                this.field1020 = arg0.method1359(255);
            }
            if ((var2 & 0x2) == 0) {
                this.field1015 = 1.1523438F;
            } else {
                this.field1015 = (float) arg0.method1374(-2) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1007 = 0.69921875F;
            } else {
                this.field1007 = (float) arg0.method1374(-2) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1021 = 1.2F;
            } else {
                this.field1021 = (float) arg0.method1374(-2) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1359(255);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1374(-2);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1374(-2);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1374(-2);
            }
            this.field1015 = 1.1523438F;
            this.field1021 = 1.2F;
            this.field1020 = class109.field1339;
            this.field1007 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1018 = -60;
            this.field1025 = -50;
            this.field1012 = -50;
        } else {
            this.field1012 = arg0.method1366((byte) 33);
            this.field1018 = arg0.method1366((byte) -108);
            this.field1025 = arg0.method1366((byte) -101);
        }
        if ((var2 & 0x20) == 0) {
            this.field1014 = class305.field4141;
        } else {
            this.field1014 = arg0.method1359(255);
        }
        if ((var2 & 0x40) == 0) {
            this.field1017 = 0;
        } else {
            this.field1017 = arg0.method1374(-2);
        }
        if ((var2 & 0x80) == 0) {
            this.field1013 = class75.field826;
        } else {
            this.field1013 = class279.method1545(arg0.method1374(-2), arg0.method1374(-2), arg0.method1374(-2), arg0.method1374(-2), arg0.method1374(-2), false, arg0.method1374(-2));
        }
    }
}
