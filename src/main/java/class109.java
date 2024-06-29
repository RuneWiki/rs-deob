import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class109 {

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[J")
    public static long[] field1892 = new long[500];

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1891 = 0;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lkb;")
    public static class29 field1884 = new class29(0, -1);

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1895 = 0;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "F")
    public static float field1894;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Leb;")
    public static class103 field1882;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "S")
    public short field1887;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Z")
    public boolean field1879;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Z")
    public boolean field1883;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Z")
    public boolean field1886;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
    public boolean field1888;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "[[[B")
    public static byte[][][] field1896;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLhi;)Lcj;")
    public static final class288 method792(byte arg0, class264 arg1) {
        if (arg0 >= -15) {
            return null;
        }
        field1880++;
        arg1.method1779(-72);
        int var2 = arg1.method1779(-55);
        class288 var3 = class259.method1700(20, var2);
        var3.field4603 = arg1.method1779(-65);
        int var4 = arg1.method1779(-118);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1779(-96);
            var3.method20(arg1, (byte) -19, var6);
        }
        var3.method16((byte) -125);
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method793(int arg0, int arg1) {
        int var2 = -70 % ((-arg0 - 72) / 45);
        field1881++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)La;")
    public static final class247 method794(byte arg0, int arg1, int arg2) {
        field1889++;
        class247 var3 = new class247();
        if (arg0 < 30) {
            field1893 = -3;
        }
        for (class125 var4 = (class125) class102.field1538.method465((byte) -95); var4 != null; var4 = (class125) class102.field1538.method461((byte) -13)) {
            if (var4.field2077 && var4.method867(arg1, (byte) -118, arg2)) {
                var3.method1634((byte) 104, var4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method795(boolean arg0) {
        if (!arg0) {
            field1884 = null;
            field1896 = null;
            field1882 = null;
            field1892 = null;
        }
    }
}
