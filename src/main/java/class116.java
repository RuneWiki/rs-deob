import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class116 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljm;")
    public static class485 field1561 = new class485(62, -1);

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Luf;")
    public static class310 field1573 = new class310(3, 8);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[B")
    public byte[] field1563;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[B")
    public byte[] field1570;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 10)
    public static final void method739(int arg0, int arg1) {
        class378 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class35 var4 = class19.field195[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class472.field6900; var5++) {
                    for (int var6 = 0; var6 < class469.field6860; var6++) {
                        var2 = var4.method224(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class34.field484;
                            int var8 = var5 << class34.field484;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class35 var10 = class19.field195[var9];
                                if (var10 != null) {
                                    int var11 = var4.method221(var6, var5) - var10.method221(var6, var5);
                                    int var12 = var4.method221(var6 + 1, var5) - var10.method221(var6 + 1, var5);
                                    int var13 = var4.method221(var6 + 1, var5 + 1) - var10.method221(var6 + 1, var5 + 1);
                                    int var14 = var4.method221(var6, var5 + 1) - var10.method221(var6, var5 + 1);
                                    var10.method227(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLjava/lang/String;)V", line = 80)
    public static final void method740(byte arg0, String arg1) {
        field1564++;
        if (arg1 == null) {
            return;
        }
        if (!(class223.field3106 < 100 || class220.field3082) || class223.field3106 >= 200) {
            class99.method662((byte) 41, class149.field2104.method590(class105.field1434, -22602));
            return;
        }
        String var2 = class451.method2659(arg1, (byte) -120);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class223.field3106; var3++) {
            String var7 = class451.method2659(class52.field702[var3], (byte) -120);
            if (var7 != null && var7.equals(var2)) {
                class99.method662((byte) 41, arg1 + class464.field6746.method590(class105.field1434, -22602));
                return;
            }
            if (class133.field1926[var3] != null) {
                String var8 = class451.method2659(class133.field1926[var3], (byte) -120);
                if (var8 != null && var8.equals(var2)) {
                    class99.method662((byte) 41, arg1 + class464.field6746.method590(class105.field1434, -22602));
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class336.field4605; var4++) {
            String var5 = class451.method2659(class159.field2284[var4], (byte) -120);
            if (var5 != null && var5.equals(var2)) {
                class99.method662((byte) 41, class31.field453.method590(class105.field1434, -22602) + arg1 + class135.field1950.method590(class105.field1434, -22602));
                return;
            }
            if (class463.field6729[var4] != null) {
                String var6 = class451.method2659(class463.field6729[var4], (byte) -120);
                if (var6 != null && var6.equals(var2)) {
                    class99.method662((byte) 41, class31.field453.method590(class105.field1434, -22602) + arg1 + class135.field1950.method590(class105.field1434, -22602));
                    return;
                }
            }
        }
        if (arg0 <= 77) {
            return;
        }
        if (class451.method2659(class75.field1089.field2693, (byte) -120).equals(var2)) {
            class99.method662((byte) 41, class332.field4529.method590(class105.field1434, -22602));
        } else {
            class410.field5760++;
            class356.method1978((byte) 47, class444.field6454);
            class244.field3395.method2084(class121.method780(arg1, (byte) 104), false);
            class244.field3395.method2073(-112, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 183)
    public static void method741(boolean arg0) {
        field1561 = null;
        if (!arg0) {
            field1573 = null;
        }
    }
}
