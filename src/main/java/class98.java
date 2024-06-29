import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class98 extends class283 {

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "I")
    private int field1591 = 4096;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    private int field1587 = 0;

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "Lih;")
    public static class32 field1595 = new class32();

    @OriginalMember(owner = "client!ca", name = "db", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!ca", name = "eb", descriptor = "[I")
    public static int[] field1602 = new int[100];

    @OriginalMember(owner = "client!ca", name = "bb", descriptor = "Lna;")
    public static class26 field1599 = class69.method505("Examiner", (byte) -118);

    @OriginalMember(owner = "client!ca", name = "fb", descriptor = "[I")
    public static int[] field1603 = new int[50];

    @OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lna;")
    public static class26 field1600 = class313.method2176(23161, 160);

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ca", name = "gb", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lve;")
    public static class266 field1597;

    @OriginalMember(owner = "client!ca", name = "ab", descriptor = "Z")
    public static boolean field1598;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "[I")
    public static int[] field1596;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "(I)V", line = 9)
    public static final void method728(int arg0) {
        int var1 = (class324.field5589 >> 10) + (class12.field157 >> 3);
        field1592++;
        int var2 = (class14.field231 >> 10) + (class165.field2568 >> 3);
        if (arg0 != 20479) {
            return;
        }
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class47.field761 = new byte[var5][];
        class132.field2010 = new int[var5];
        class201.field3136 = new byte[var5][];
        client.field4126 = new int[var5];
        class224.field3545 = new int[var5][4];
        class2.field15 = new byte[var5][];
        class293.field4884 = new int[var5];
        class51.field808 = new byte[var5][];
        class185.field2874 = new int[var5];
        class303.field5224 = new int[var5];
        class225.field3573 = new int[var5];
        byte var6 = 8;
        class84.field1372 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class293.field4884[var7] = var10;
                client.field4126[var7] = field1597.method1876(class236.method1587(new class26[] { class214.field3344, class149.method1019((byte) 9, var8), class292.field4858, class149.method1019((byte) 9, var9) }, (byte) -128), (byte) -30);
                class225.field3573[var7] = field1597.method1876(class236.method1587(new class26[] { class154.field2403, class149.method1019((byte) 9, var8), class292.field4858, class149.method1019((byte) 9, var9) }, (byte) -73), (byte) -30);
                class185.field2874[var7] = field1597.method1876(class236.method1587(new class26[] { class127.field1972, class149.method1019((byte) 9, var8), class292.field4858, class149.method1019((byte) 9, var9) }, (byte) -82), (byte) -30);
                class303.field5224[var7] = field1597.method1876(class236.method1587(new class26[] { class313.field5343, class149.method1019((byte) 9, var8), class292.field4858, class149.method1019((byte) 9, var9) }, (byte) -104), (byte) -30);
                class132.field2010[var7] = field1597.method1876(class236.method1587(new class26[] { class216.field3386, class149.method1019((byte) 9, var8), class292.field4858, class149.method1019((byte) 9, var9) }, (byte) -114), (byte) -30);
                if (class185.field2874[var7] == -1) {
                    client.field4126[var7] = -1;
                    class225.field3573[var7] = -1;
                    class303.field5224[var7] = -1;
                    class132.field2010[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class185.field2874.length; var11++) {
            class185.field2874[var11] = -1;
            client.field4126[var11] = -1;
            class225.field3573[var11] = -1;
            class303.field5224[var11] = -1;
            class132.field2010[var11] = -1;
        }
        class233.method1568(var3, var2, var1, var6, true, var4, true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)[I", line = 90)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = 69 / ((arg1 - 30) / 36);
        field1594++;
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(0, arg0, 32755);
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                int var7 = var5[var6];
                var4[var6] = this.field1587 <= var7 && var7 <= this.field1591 ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 125)
    public static final void method729(boolean arg0) {
        class153.field2390.method1986((byte) -117);
        field1588++;
        class205.field3200.method1986((byte) -111);
        if (arg0) {
            field1603 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILwa;Z)V", line = 147)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1593++;
        if (!arg2) {
            method729(true);
        }
        if (arg0 == 0) {
            this.field1587 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field1591 = arg1.method576(1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 184)
    public class98() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)V", line = 189)
    public static void method730(int arg0) {
        field1599 = null;
        field1596 = null;
        field1595 = null;
        field1602 = null;
        field1600 = null;
        if (arg0 == 1) {
            field1603 = null;
            field1597 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V", line = 211)
    public static final void method731(boolean arg0, int arg1) {
        if (arg1 != -32624) {
            method729(true);
        }
        field1589++;
        int var2 = class51.field808.length;
        byte[][] var3;
        if (class255.field4184 && arg0) {
            var3 = class84.field1372;
        } else {
            var3 = class47.field761;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class293.field4884[var4] >> 8) * 64 - class12.field157;
                int var7 = (class293.field4884[var4] & 0xFF) * 64 - class165.field2568;
                class258.method1815(arg1 + 16239);
                class88.method693(var6, arg0, var5, var7, 0, class218.field3479);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V", line = 251)
    public static final void method732(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -799) {
            field1598 = true;
        }
        field1590++;
        if (class263.field4311 == 0 || arg0 == 0 || class101.field1624 >= 50 || arg1 == -1) {
            return;
        }
        class186.field2891[class101.field1624] = arg1;
        class10.field128[class101.field1624] = arg0;
        class26.field437[class101.field1624] = arg2;
        class13.field194[class101.field1624] = null;
        field1603[class101.field1624] = 0;
        class101.field1624++;
    }
}
