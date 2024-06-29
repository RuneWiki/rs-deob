import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class102 extends class30 {

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lia;")
    public static class257 field1875 = class28.method234(72, "null");

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field1880 = -1;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
    public static int[] field1892 = new int[5];

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public int field1890;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public int field1895;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Lfd;")
    public class253 field1888;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lbe;")
    public class25 field1879;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "Loh;")
    public class261 field1889;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lnc;")
    public class4 field1877;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Z")
    public static boolean field1899;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[[[B")
    public static byte[][][] field1898;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static final void method743(byte arg0) {
        field1901++;
        if (arg0 <= 97) {
            return;
        }
        for (int var1 = 0; var1 < class212.field3628; var1++) {
            int var2 = class210.field3591[var1];
            class197 var3 = class92.field1758[var2];
            int var4 = class40.field827.method1051((byte) 83);
            if ((var4 & 0x8) != 0) {
                var3.field4171 = class40.field827.method1041((byte) 109);
                if (var3.field4171 == 65535) {
                    var3.field4171 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field4168 = class40.field827.method1039(1995);
                var3.field4138 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class40.field827.method1051((byte) 102);
                int var6 = class40.field827.method1051((byte) 127);
                var3.method1581(class7.field153, var5, var6, -82);
                var3.field4158 = class7.field153 + 300;
                var3.field4137 = class40.field827.method1029(25925);
            }
            if ((var4 & 0x40) != 0) {
                var3.field4184 = class40.field827.method1052(false);
                var3.field4160 = class40.field827.method1067(515473640);
            }
            if ((var4 & 0x2) != 0) {
                var3.field4172 = class40.field827.method1063(-17162);
                int var7 = class40.field827.method1042(117);
                var3.field4156 = var7 >> 16;
                var3.field4186 = (var7 & 0xFFFF) + class7.field153;
                if (var3.field4172 == 65535) {
                    var3.field4172 = -1;
                }
                var3.field4181 = 0;
                var3.field4150 = 0;
                if (class7.field153 < var3.field4186) {
                    var3.field4150 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var8 = class40.field827.method1063(-17162);
                int var9 = class40.field827.method1029(25925);
                if (var8 == 65535) {
                    var8 = -1;
                }
                class174.method1181(var3, var9, var8, (byte) -31);
            }
            if ((var4 & 0x10) != 0) {
                int var10 = class40.field827.method1021((byte) 62);
                int var11 = class40.field827.method1021((byte) 113);
                var3.method1581(class7.field153, var10, var11, -105);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field3322.method1333(false)) {
                    class257.method1690(var3, 63);
                }
                var3.field3322 = class92.method682(true, class40.field827.method1067(515473640));
                var3.field4165 = var3.field3322.field3343;
                var3.field4128 = var3.field3322.field3390;
                var3.field4146 = var3.field3322.field3400;
                var3.field4145 = var3.field3322.field3373;
                var3.field4183 = var3.field3322.field3389;
                var3.field4176 = var3.field3322.field3360;
                var3.field4149 = var3.field3322.field3368;
                var3.field4124 = var3.field3322.field3384;
                var3.field4178 = var3.field3322.field3351;
                if (var3.field3322.method1333(false)) {
                    class13.method135(var3, var3.field4182[0], (class233) null, class189.field3261, (class180) null, 0, 128, var3.field4119[0]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public final void method744(int arg0) {
        if (arg0 != -1) {
            method746(109);
        }
        this.field1877 = null;
        this.field1879 = null;
        this.field1889 = null;
        this.field1888 = null;
        field1883++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILmb;I)Lak;")
    public static final class190 method745(int arg0, class178 arg1, int arg2) {
        if (arg0 <= 77) {
            field1875 = null;
        }
        field1882++;
        return class231.method1505(-23917, arg1, arg2) ? class74.method549(false) : null;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1875 = null;
        if (arg0 == 7778) {
            field1892 = null;
            field1898 = null;
        }
    }
}
