import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class229 extends RuntimeException {

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Ljava/lang/String;")
    public String field3888;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3886;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lcd;")
    public static class64 field3884 = class44.method335((byte) 71, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field3883 = -1;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
    public static int[] field3881 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "S")
    public static short field3887 = 205;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lcd;")
    public static class64 field3889 = class44.method335((byte) 71, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field3885 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 10)
    public static void method1651(int arg0) {
        field3889 = null;
        if (arg0 == -14116) {
            field3884 = null;
            field3881 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 32)
    public static final void method1652(boolean arg0) {
        if (arg0) {
            field3891++;
            class280.field4822++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILqm;)V", line = 52)
    public static final void method1653(int arg0, class222 arg1) {
        field3882++;
        class189.field3254 = class81.method632(0, 85, arg1, class32.field538);
        class200.field3432 = new class176[class189.field3254.length];
        class14.field315 = new class176[class189.field3254.length];
        class273.field4682 = new class176[class189.field3254.length];
        for (int var2 = 0; var2 < class189.field3254.length; var2++) {
            class189.field3254[var2].method1230();
            class200.field3432[var2] = class189.field3254[var2].method1228();
            class189.field3254[var2].method1230();
            class14.field315[var2] = class189.field3254[var2].method1228();
            class189.field3254[var2].method1230();
            class273.field4682[var2] = class189.field3254[var2].method1228();
            class189.field3254[var2].method1230();
        }
        class108.field2005 = class155.method1121(0, -32768, arg1, class151.field2692);
        class80.field1478 = class283.method1968(true, class28.field451, arg1, 0);
        class53.field856 = class283.method1968(true, class78.field1467, arg1, arg0);
        class69.field1322 = class283.method1968(true, class169.field2948, arg1, 0);
        class11.field217 = class283.method1968(true, class70.field1352, arg1, 0);
        class211.field3546 = class93.method712(0, arg1, (byte) 115, class304.field5204);
        class137.field2437 = class93.method712(0, arg1, (byte) 124, class222.field3755);
        class185.field3182 = class60.method474(arg1, (byte) 51, class7.field169, 0);
        class184.field3150 = class93.method712(0, arg1, (byte) 87, class85.field1580);
        class29.field496 = class93.method712(0, arg1, (byte) 110, class233.field3937);
        class131.field2332 = class269.method1882(-19903, 0, arg1, class218.field3689);
        class99.field1796 = class269.method1882(arg0 ^ 0xFFFFB241, 0, arg1, class236.field3984);
        class180.field3091.method1259(class99.field1796, (int[]) null);
        class278.field4796.method1259(class99.field1796, (int[]) null);
        class75.field1419.method1259(class99.field1796, (int[]) null);
        if (class123.field2216) {
            class302.field5182 = class81.method632(0, 64, arg1, class92.field1664);
            for (int var3 = 0; var3 < class302.field5182.length; var3++) {
                class302.field5182[var3].method1233();
            }
        }
        class127 var4 = class276.method1917(0, arg1, class31.field529, 0);
        var4.method925();
        if (class123.field2216) {
            class27.field436 = new class136(var4);
        } else {
            class27.field436 = var4;
        }
        class127[] var5 = class155.method1121(0, -32768, arg1, class200.field3427);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method925();
        }
        if (class123.field2216) {
            class145.field2565 = new class40[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class145.field2565[var7] = new class136(var5[var7]);
            }
        } else {
            class145.field2565 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        for (int var12 = 0; var12 < class108.field2005.length; var12++) {
            class108.field2005[var12].method928(var8 + var10, var10 + var11, var9 + var10);
        }
        class189.field3254[0].method1236(var8 + var10, var11 - -var10, var9 + var10);
        if (class123.field2216) {
            class164.field2886 = new class40[class108.field2005.length];
            for (int var13 = 0; var13 < class108.field2005.length; var13++) {
                class164.field2886[var13] = new class136(class108.field2005[var13]);
            }
        } else {
            class164.field2886 = class108.field2005;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)I", line = 171)
    public static final int method1654(int arg0, boolean arg1) {
        long var2 = class154.method1114(true);
        field3880++;
        if (arg0 != 0) {
            return 39;
        }
        for (class66 var4 = arg1 ? (class66) class196.field3339.method1143(0) : (class66) class196.field3339.method1147((byte) 18); var4 != null; var4 = (class66) class196.field3339.method1147((byte) 18)) {
            if ((var4.field1312 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1312 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field417;
                    class289.field4941[var5] = class88.field1601[var5];
                    var4.method232(128);
                    return var5;
                }
                var4.method232(128);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IZ)V", line = 226)
    public static final void method1655(int arg0, boolean arg1) {
        class135.field2392.method1197((byte) 101, arg0);
        if (arg1) {
            field3884 = (class64) null;
        }
        field3879++;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 240)
    public class229(Throwable arg0, String arg1) {
        this.field3888 = arg1;
        this.field3886 = arg0;
    }
}
