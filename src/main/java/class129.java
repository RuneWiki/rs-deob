import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class129 {

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Z")
    public boolean field1768 = true;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field1761 = 1400;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lrc;")
    public static class108 field1769 = new class108(30, -1);

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lch;")
    public static class151 field1770 = new class151("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lrc;")
    public static class108 field1771 = new class108(42, 2);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "C")
    private char field1760;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljava/lang/String;")
    public String field1767;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILkk;)V", line = 4)
    public final void method967(int arg0, class161 arg1) {
        if (arg0 != -4) {
            return;
        }
        while (true) {
            int var3 = arg1.method1172((byte) -113);
            if (var3 == 0) {
                field1763++;
                return;
            }
            this.method971(arg1, var3, -31);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 29)
    public static void method968(byte arg0) {
        field1771 = null;
        if (arg0 == -48) {
            field1770 = null;
            field1769 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 41)
    public static final void method969(byte arg0) {
        class192.field2867.method773(-1568);
        field1759++;
        for (class73 var1 = (class73) class6.field38.method775(1); var1 != null; var1 = (class73) class6.field38.method763(0)) {
            if (var1.field1048 < 1000) {
                var1.method2714(51);
                class192.field2867.method766(var1, -1);
            }
        }
        class192.field2867.method778(-1, class6.field38);
        int var2 = -1;
        if (class69.field1012 != null) {
            var2 = class69.field1012.method937(5);
        }
        if (arg0 <= 2) {
            field1771 = null;
        }
        if (!class205.field3005) {
            if (var2 == 0 && (class398.field5463 == 1 && class303.field4310 > 2 || class206.method1414((byte) 99))) {
                var2 = 2;
            }
            if (var2 == 2 && class303.field4310 > 0 && class69.field1012 != null) {
                if (class464.field6538 == null && class169.field2446 == 0) {
                    class487.method2867((byte) 104, class69.field1012.method936(0), class69.field1012.method938(1));
                } else {
                    class412.field5645 = 2;
                }
            }
            if (var2 == 0 && class303.field4310 > 0) {
                class294.method1917(-89);
            }
            if (class464.field6538 != null || class169.field2446 != 0) {
                return;
            }
            class373.field5137 = null;
            class412.field5645 = 0;
            return;
        }
        if (var2 == -1) {
            int var3 = class175.field2661.method1625((byte) -128);
            int var4 = class175.field2661.method1617(false);
            if (var3 < (class104.field1469 - 10) || (class104.field1469 + class315.field4455 + 10) < var3 || (class167.field2424 - 10) > var4 || (class433.field6135 + class167.field2424 + 10) < var4) {
                class205.field3005 = false;
                class69.method638(class433.field6135, class315.field4455, class104.field1469, (byte) 55, class167.field2424);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class104.field1469;
        int var6 = class167.field2424;
        int var7 = class315.field4455;
        int var8 = class69.field1012.method936(0);
        int var9 = class69.field1012.method938(1);
        int var10 = -1;
        for (int var11 = 0; var11 < class303.field4310; var11++) {
            if (class128.field1746) {
                int var16 = (class303.field4310 - var11 - 1) * 16 + (var6 + 33);
                if (var5 < var8 && var8 < (var5 + var7) && var16 - 13 < var9 && var16 + 4 > var9) {
                    var10 = var11;
                }
            } else {
                int var15 = var6 - (-(class303.field4310 - var11 - 1) * 16 - 31);
                if (var8 > var5 && var8 < (var5 + var7) && var9 > var15 - 13 && var15 + 3 > var9) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class450 var13 = new class450(class6.field38);
            for (class73 var14 = (class73) var13.method2717(-17927); var14 != null; var14 = (class73) var13.method2720(-116)) {
                if (var10 == var12) {
                    class434.method2622((byte) 118, var9, var8, var14);
                }
                var12++;
            }
        }
        class205.field3005 = false;
        class69.method638(class433.field6135, class315.field4455, class104.field1469, (byte) 73, class167.field2424);
        return;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkk;I)V", line = 198)
    public static final void method970(class161 arg0, int arg1) {
        field1762++;
        byte[] var2 = new byte[24];
        if (class469.field6614 != null) {
            try {
                class469.field6614.method1284(false, 0L);
                class469.field6614.method1280(var2, true);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        int var5 = -93 % ((48 - arg1) / 58);
        arg0.method1166(var2, 0, 24, false);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lkk;II)V", line = 243)
    private final void method971(class161 arg0, int arg1, int arg2) {
        field1764++;
        if (arg2 != -31) {
            this.field1760 = (char) 65445;
        }
        if (arg1 == 1) {
            this.field1760 = class441.method2681(16, arg0.method1152(-1910700904));
        } else if (arg1 == 2) {
            this.field1765 = arg0.method1168(255);
        } else if (arg1 == 4) {
            this.field1768 = false;
            return;
        } else if (arg1 == 5) {
            this.field1767 = arg0.method1186(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Z", line = 274)
    public final boolean method972(int arg0) {
        field1766++;
        if (arg0 != 2087) {
            field1770 = null;
        }
        return this.field1760 == 's';
    }
}
