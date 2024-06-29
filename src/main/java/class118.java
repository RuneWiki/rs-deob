import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class118 {

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "[I")
    public static int[] field1844 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Luf;")
    public static class168 field1845 = class148.method1019(-1720, "<col=ffffff>");

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Luf;")
    public static class168 field1841 = class148.method1019(-1720, ")1");

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Luf;")
    private static class168 field1846 = class148.method1019(-1720, "Members object");

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Luf;")
    public static class168 field1838 = field1846;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "F")
    public static float field1834;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lcd;")
    public static class35 field1842;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[I")
    public static int[] field1843;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[[[I")
    public static int[][][] field1835;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldk;ILuf;)Lek;", line = 13)
    public static final class244 method848(class241 arg0, int arg1, class168 arg2) {
        int var3 = arg0.method1646(-27248, arg2);
        field1847++;
        if (var3 == -1) {
            return new class244(0);
        }
        int[] var4 = arg0.method1635(var3, true);
        class244 var5 = new class244(var4.length);
        int var6 = 0;
        int var7 = 44 / ((18 - arg1) / 52);
        while (var5.field4146 > var6) {
            class153 var8 = new class153(arg0.method1647(var3, (byte) 119, var4[var6]));
            var5.field4158[var6] = var8.method1075(60);
            var5.field4151[var6] = var8.method1078(-6338);
            var5.field4144[var6] = (short) var8.method1069(32);
            var5.field4148[var6] = (short) var8.method1069(34);
            var5.field4147[var6] = var8.method1089((byte) -14);
            var6++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I", line = 47)
    public static final int method849(int arg0, byte arg1) {
        if (arg1 < 90) {
            field1841 = (class168) null;
        }
        field1837++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 62)
    public static void method850(int arg0) {
        if (arg0 >= -7) {
            method851(24, -96, 122);
        }
        field1846 = null;
        field1843 = null;
        field1838 = null;
        field1842 = null;
        field1844 = null;
        field1845 = null;
        field1835 = (int[][][]) null;
        field1841 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)J", line = 79)
    public static final long method851(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        return var3 == null || var3.field1979 == null ? 0L : var3.field1979.field497;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)V", line = 93)
    public static final void method852(int arg0, int arg1, byte arg2) {
        if (arg2 != 116) {
            return;
        }
        class85.field1306++;
        field1849++;
        class249.field4262.method726(53, 2138389379);
        class249.field4262.method1090((byte) 127, arg1);
        class249.field4262.method1076(arg0, -44);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lcj;ZI)V", line = 110)
    public static final void method853(class75 arg0, boolean arg1, int arg2) {
        field1840++;
        int var3 = -54 % ((arg2 + 36) / 61);
        if (arg1) {
            class69.field913 = 3;
            class124.method883(false, 44);
            class48.field593 = 255;
            class164.field2632 = false;
            class219.field3558 = 0;
            class61.field796 = false;
            class69.field914 = false;
            class17.field201 = 0;
            class53.field653 = false;
            class165.field2654 = false;
            class1.field1 = 127;
            client.field4939 = false;
            class145.field2250 = false;
            class164.field2631 = false;
            class263.field4460 = false;
            class161.field2599 = 0;
            class201.field3310 = 0;
            class12.field133 = false;
            class44.field539 = false;
            class72.field968 = 127;
            class120.field1865 = false;
            class275.method1898(-101, arg0);
            return;
        }
        class69.field913 = 3;
        class124.method883(true, -83);
        class165.field2654 = true;
        class164.field2632 = true;
        class72.field968 = 127;
        class69.field914 = true;
        client.field4939 = true;
        class201.field3310 = 2;
        class1.field1 = 127;
        class53.field653 = true;
        class219.field3558 = 0;
        class17.field201 = 0;
        class44.field539 = true;
        class145.field2250 = true;
        class263.field4460 = true;
        class120.field1865 = true;
        class286 var4 = null;
        class164.field2631 = true;
        class161.field2599 = 0;
        class61.field796 = true;
        class48.field593 = 255;
        class12.field133 = true;
        try {
            class112 var5 = arg0.method436(-27632, "runescape");
            while (var5.field1746 == 0) {
                class300.method2054(10, 1L);
            }
            if (var5.field1746 == 1) {
                var4 = (class286) var5.field1742;
                byte[] var6 = new byte[(int) var4.method1974(-1)];
                int var8;
                for (int var7 = 0; var7 < var6.length; var7 += var8) {
                    var8 = var4.method1976(var7, var6, (byte) 109, var6.length - var7);
                    if (var8 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class233.method1582(new class153(var6), 127);
            }
        } catch (Exception var12) {
        }
        try {
            if (var4 != null) {
                var4.method1977(115);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldk;I)V", line = 233)
    public static final void method854(class241 arg0, int arg1) {
        field1836++;
        if (arg1 != 255) {
            method850(-66);
        }
        class70.field939 = arg0;
        class85.field1330 = class70.field939.method1633(arg1 - 291, 16);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V", line = 249)
    public static final void method855(boolean arg0) {
        field1839++;
        if (arg0) {
            return;
        }
        int var1 = class85.method580(0);
        if (var1 == 0) {
            class291.field4914 = (byte[][][]) null;
            class211.method1472(true, 0);
        } else if (var1 == 1) {
            class96.method733((byte) -94, (byte) 0);
            class211.method1472(true, 512);
            class201.method1409(-105);
        } else {
            class96.method733((byte) -110, (byte) (class134.field2091 - 4 & 0xFF));
            class211.method1472(true, 2);
        }
    }
}
