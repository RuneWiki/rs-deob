import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 {

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[Lna;")
    public class26[] field166;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[S")
    public short[] field160;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[B")
    public byte[] field177;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "[S")
    public short[] field173;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field164 = -1;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lna;")
    public static class26 field175 = class69.method505("Eingabeprozedur geladen)3", (byte) -125);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lna;")
    public static class26 field169 = class69.method505(" )2>", (byte) -120);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lna;")
    private static class26 field158 = class69.method505("Prepared sound engine", (byte) -122);

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lna;")
    private static class26 field171 = class69.method505("Select", (byte) -121);

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public static int[] field176 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lna;")
    public static class26 field167 = field171;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "Lna;")
    public static class26 field178 = field158;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lve;")
    public static class266 field168;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 4)
    public static final void method73(int arg0) {
        field172++;
        while (class300.field5157.method1430(class259.field4228, 32666) >= 11) {
            int var1 = class300.field5157.method1427((byte) -11, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class268.field4427[var1] == null) {
                class268.field4427[var1] = new class159();
                var2 = true;
                if (class64.field1018[var1] != null) {
                    class268.field4427[var1].method1080(-54, class64.field1018[var1]);
                }
            }
            class95.field1550[class80.field1261++] = var1;
            class159 var3 = class268.field4427[var1];
            var3.field3982 = class229.field3626;
            int var4 = class300.field5157.method1427((byte) -11, 1);
            if (var4 == 1) {
                class168.field2599[class28.field474++] = var1;
            }
            int var5 = class300.field5157.method1427((byte) -11, 5);
            int var6 = class322.field5527[class300.field5157.method1427((byte) -11, 3)];
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var2) {
                var3.field3946 = var3.field3922 = var6;
            }
            int var7 = class300.field5157.method1427((byte) -11, 1);
            int var8 = class300.field5157.method1427((byte) -11, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1084((byte) 126, class13.field221.field3904[0] + var5, var7 == 1, class13.field221.field3890[0] + var8);
        }
        if (arg0 < -46) {
            class300.field5157.method1433(false);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Z", line = 73)
    public final boolean method74(int arg0, byte arg1) {
        field180++;
        if (arg1 != -124) {
            method80((class26) null, (class26) null, -17, (byte) 94);
        }
        return (this.field177[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIZ)I", line = 89)
    public static final int method75(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            return 127;
        }
        int var5 = arg3 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg1) : arg2;
        field179++;
        int var7 = var5 < 8 ? arg0 : arg2;
        return ((var5 & 0x1) == 0 ? var7 : -var7) + ((var5 & 0x2) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Z", line = 110)
    public final boolean method76(int arg0, int arg1) {
        field162++;
        if (arg1 != 530) {
            this.method81(-111, 26);
        }
        return (this.field177[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 121)
    public static final void method77(int arg0, int arg1, int arg2) {
        field174++;
        if (arg2 < 90) {
            field178 = (class26) null;
        }
        class120 var3 = class293.method2059(4, 5, arg0);
        var3.method833((byte) 33);
        var3.field1877 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)I", line = 140)
    public final int method78(int arg0, int arg1) {
        if (arg1 == 8) {
            field159++;
            return this.field177[arg0] & 0x3;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 153)
    public static void method79(int arg0) {
        field176 = null;
        if (arg0 != 0) {
            return;
        }
        field168 = null;
        field171 = null;
        field178 = null;
        field158 = null;
        field167 = null;
        field175 = null;
        field169 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lna;Lna;IB)V", line = 181)
    public static final void method80(class26 arg0, class26 arg1, int arg2, byte arg3) {
        class2.field19 = arg1;
        field163++;
        class178.field2792 = arg2;
        class2.field22 = arg0;
        if (class2.field22.method159((byte) -42, class2.field18) || class2.field19.method159((byte) -42, class2.field18)) {
            class170.field2658 = 3;
        } else if (class263.field4309 == -1) {
            class55.field902 = 0;
            class193.field3013 = 0;
            class170.field2658 = -3;
            class194.field3024 = 1;
            class82 var4 = new class82(128);
            var4.method591((byte) -97, 10);
            var4.method643(-20037, (int) (Math.random() * 99999.0D));
            var4.method643(-20037, 530);
            var4.method579(class2.field22.method209(-117), -2037491440);
            var4.method577(-123, (int) (Math.random() * 9.9999999E7D));
            var4.method584(0, class2.field19);
            var4.method577(-128, (int) (Math.random() * 9.9999999E7D));
            int var5 = 9 / ((arg3 - 29) / 60);
            var4.method639(class292.field4859, class144.field2190, -296);
            class114.field1789.field1301 = 0;
            class114.field1789.method591((byte) -29, 210);
            class114.field1789.method591((byte) -121, var4.field1301);
            class114.field1789.method592(var4.field1280, 0, var4.field1301, 125);
        } else {
            class284.method2008(0);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Z", line = 226)
    public final boolean method81(int arg0, int arg1) {
        if (arg1 != -20138) {
            method75(122, 38, -120, -29, false);
        }
        field161++;
        return (this.field177[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V", line = 248)
    public class12(int arg0) {
        this.field165 = arg0;
        this.field166 = new class26[this.field165];
        this.field160 = new short[this.field165];
        this.field170 = new int[this.field165];
        this.field177 = new byte[this.field165];
        this.field173 = new short[this.field165];
    }
}
