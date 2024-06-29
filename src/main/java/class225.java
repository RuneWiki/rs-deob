import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class225 extends class73 {

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lli;")
    public static class185 field4114 = class245.method1649("null", 123);

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lp;")
    public static class82 field4118 = null;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lli;")
    public static class185 field4122 = class245.method1649("Speicher wird zugewiesen)3", -100);

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field4119 = 0;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Lli;")
    public static class185 field4125 = class245.method1649("<col=00ff00>", 125);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Z")
    public static boolean field4116 = true;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lhi;")
    public static class250 field4117;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBII)V")
    public static final void method1557(int arg0, byte arg1, int arg2, int arg3) {
        class174 var4 = class249.method1671(11, arg2, (byte) -102);
        var4.method1233(0);
        var4.field3190 = arg3;
        var4.field3186 = arg0;
        if (arg1 != 85) {
            method1558(false, false);
        }
        field4123++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZZ)V")
    public static final void method1558(boolean arg0, boolean arg1) {
        class272.field4825 = null;
        class232.field4179 = null;
        class234.field4204 = null;
        field4115++;
        class258.field4590 = null;
        class199.field3662 = null;
        class40.field637 = null;
        class165.field3091 = null;
        class232.field4176 = null;
        class60.field1081 = null;
        if (arg1 && class65.field1124 != null) {
            class9.field181 = class65.field1124.field1680;
        } else {
            class9.field181 = null;
        }
        class129.field2312 = null;
        client.field3929 = 0;
        class65.field1124 = null;
        class152.field2882.method1383((byte) 91);
        class146.field2771 = null;
        class234.field4203 = null;
        class80.field1401 = null;
        class149.field2824 = -1;
        class97.field1810 = null;
        if (arg0) {
            method1561((byte) -12);
        }
        class251.field4472 = -1;
        class10.field198 = null;
        class132.field2373 = null;
        class215.field3955 = null;
        class148.field2791 = null;
        class152.field2883 = null;
        class240.field4278 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjd;)V")
    public static final void method1559(byte arg0, class118 arg1) {
        byte[] var2 = new byte[24];
        field4121++;
        if (class211.field3858 != null) {
            try {
                class211.field3858.method8(16197, 0L);
                int var3 = 0;
                class211.field3858.method15(false, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method848(var2, 0, (byte) 56, 24);
        if (arg0 != -10) {
            method1561((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public static void method1560(int arg0) {
        if (arg0 <= 98) {
            field4119 = 70;
        }
        field4125 = null;
        field4118 = null;
        field4114 = null;
        field4117 = null;
        field4122 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
    public class225(int arg0, int arg1) {
        this.field4120 = arg1;
        this.field4113 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1561(byte arg0) {
        field4124++;
        class105.method741(5, -126);
        int var1 = 108 / ((79 - arg0) / 47);
        class173.method1231(0, 5);
        class149.method1057(1374435937, 5);
        class229.method1583((byte) -95, 5);
        class260.method1768(5, (byte) -27);
        class155.method1101((byte) -88, 5);
        class63.method429(13047, 5);
        class254.method1721((byte) -112, 5);
        class211.method1481((byte) 119, 5);
        class233.method1593(5, -54);
        class1.method1(5, -26927);
        class196.method1402(5, (byte) 122);
        class73.method474(50, (byte) -73);
        class253.method1716(5, 123);
        class64.method434(5, 0);
        class52.field901.method85((byte) 75, 5);
        class194.field3581.method85((byte) 75, 5);
    }
}
