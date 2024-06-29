import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class79 extends class106 {

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "Loc;")
    public class151 field1525;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "Loc;")
    private static class151 field1531 = class137.method873(2, " is already on your friend list)3");

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "[Lph;")
    public static class166[] field1529 = new class166[24];

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Loc;")
    public static class151 field1527 = field1531;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1526 = 0;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Lwd;")
    public static class232 field1524;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[[[B")
    public static byte[][][] field1521;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
    public static void method508(byte arg0) {
        field1529 = null;
        if (arg0 != -34) {
            method508((byte) 122);
        }
        field1524 = null;
        field1527 = null;
        field1531 = null;
        field1521 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I")
    public static final int method509(int arg0, int arg1) {
        int var2 = 12 % ((arg0 + 26) / 50);
        field1528++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLeb;)V")
    public static final void method510(int arg0, boolean arg1, class47 arg2) {
        field1532++;
        if (class229.field4052 != null) {
            try {
                class229.field4052.method336(arg0 - 13112);
            } catch (Exception var8) {
            }
            class229.field4052 = null;
        }
        class229.field4052 = arg2;
        class116.method703((byte) -74, arg1);
        class94.field1753 = null;
        class139.field2537.field4101 = 0;
        class178.field3213 = 0;
        class124.field2221 = null;
        while (true) {
            class188 var3 = (class188) class104.field1864.method1534(20912);
            if (var3 == null) {
                while (true) {
                    class188 var4 = (class188) class109.field1923.method1534(20912);
                    if (var4 == null) {
                        if (class78.field1507 != 0) {
                            try {
                                class229 var5 = new class229(4);
                                var5.method1447(-1, 4);
                                var5.method1447(-1, class78.field1507);
                                var5.method1463(arg0 - 105, 0);
                                class229.field4052.method331(49, 4, var5.field4087, 0);
                            } catch (IOException var7) {
                                try {
                                    class229.field4052.method336(arg0 - 13112);
                                } catch (Exception var6) {
                                }
                                class229.field4052 = null;
                                class215.field3766++;
                            }
                        }
                        class83.field1568 = arg0;
                        class236.field4396 = class217.method1351(-91);
                        return;
                    }
                    class53.field1079.method329((byte) 42, var4);
                    class20.field426.method1536((byte) 98, var4, var4.field1881);
                    class232.field4263++;
                    class206.field3655--;
                }
            }
            class36.field750.method1536((byte) 123, var3, var3.field1881);
            class170.field3095--;
            class232.field4227++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
    public static final void method511(byte arg0) {
        if (arg0 >= -75) {
            field1526 = -1;
        }
        field1530++;
        for (class212 var1 = (class212) class180.field3257.method1358(-29726); var1 != null; var1 = (class212) class180.field3257.method1360(true)) {
            if (var1.field3720 > 0) {
                var1.field3720--;
            }
            if (var1.field3720 != 0) {
                if (var1.field3725 > 0) {
                    var1.field3725--;
                }
                if (var1.field3725 == 0 && var1.field3728 >= 1 && var1.field3713 >= 1 && var1.field3728 <= 102 && var1.field3713 <= 102 && (var1.field3711 < 0 || class103.method631(var1.field3711, (byte) -21, var1.field3729))) {
                    class12.method95(var1.field3715, var1.field3719, var1.field3723, var1.field3711, (byte) -80, var1.field3729, var1.field3728, var1.field3713);
                    var1.field3725 = -1;
                    if (var1.field3721 == var1.field3711 && var1.field3721 == -1) {
                        var1.method636(110);
                    } else if (var1.field3721 == var1.field3711 && var1.field3719 == var1.field3712 && var1.field3729 == var1.field3718) {
                        var1.method636(62);
                    }
                }
            } else if (var1.field3721 < 0 || class103.method631(var1.field3721, (byte) -81, var1.field3718)) {
                class12.method95(var1.field3715, var1.field3712, var1.field3723, var1.field3721, (byte) -80, var1.field3718, var1.field3728, var1.field3713);
                var1.method636(95);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class79() {
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Loc;)V")
    public class79(class151 arg0) {
        this.field1525 = arg0;
    }
}
