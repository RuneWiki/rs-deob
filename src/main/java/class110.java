import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class110 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1701 = "Connected to update server";

    @OriginalMember(owner = "client!li", name = "b", descriptor = "B")
    public byte field1695;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "B")
    public byte field1698;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "B")
    public byte field1699;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "B")
    public byte field1707;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "S")
    public short field1704;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Z")
    public boolean field1694;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Z")
    public boolean field1696;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
    public boolean field1700;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Z")
    public boolean field1706;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
    public boolean field1708;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V", line = 7)
    public static final void method741(int arg0, int arg1) {
        class174 var2 = class90.field1375[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class174 var4 = class90.field1375[var3][arg0][arg1] = class90.field1375[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2659--;
                for (int var5 = 0; var5 < var4.field2655; var5++) {
                    class272 var6 = var4.field2671[var5];
                    if ((var6.field4183 >> 29 & 0x3L) == 2L && var6.field4169 == arg0 && var6.field4186 == arg1) {
                        var6.field4177--;
                    }
                }
            }
        }
        if (class90.field1375[0][arg0][arg1] == null) {
            class90.field1375[0][arg0][arg1] = new class174(0, arg0, arg1);
        }
        class90.field1375[0][arg0][arg1].field2647 = var2;
        class90.field1375[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Luc;", line = 45)
    public static final class130 method742(byte arg0) {
        class192.field2906 = 0;
        if (arg0 == 33) {
            field1702++;
            return class14.method115(arg0 - 104);
        } else {
            return (class130) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;Lwf;I)Lva;", line = 63)
    public static final class121 method743(String arg0, class306 arg1, int arg2) {
        int var3 = arg1.method2107(arg0, (byte) 119);
        field1703++;
        int var4 = 69 % ((arg2 + 74) / 35);
        if (var3 == -1) {
            return new class121(0);
        }
        int[] var5 = arg1.method2080(2820, var3);
        class121 var6 = new class121(var5.length);
        for (int var7 = 0; var7 < var6.field1862; var7++) {
            class303 var8 = new class303(arg1.method2103(0, var3, var5[var7]));
            var6.field1857[var7] = var8.method2027(0);
            var6.field1860[var7] = var8.method2001(-3);
            var6.field1874[var7] = var8.method1996(67);
            var6.field1868[var7] = var8.method1996(-56);
        }
        return var6;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V", line = 100)
    public static void method744(byte arg0) {
        if (arg0 < 25) {
            method741(61, -32);
        }
        field1701 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(CB)B", line = 118)
    public static final byte method745(char arg0, byte arg1) {
        field1705++;
        if (arg1 != 19) {
            return -46;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)[Ln;", line = 245)
    public static final class178[] method746(byte arg0) {
        field1697++;
        class178[] var1 = new class178[class246.field3862];
        for (int var2 = 0; var2 < class246.field3862; var2++) {
            int var3 = class68.field1011[var2] * class107.field1652[var2];
            byte[] var4 = class46.field644[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class154.field2417[class311.method2135(var4[var6], 255)];
            }
            var1[var2] = new class178(class116.field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], var5);
        }
        if (arg0 > -54) {
            method742((byte) 63);
        }
        class345.method2394((byte) -92);
        return var1;
    }
}
