import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class115 {

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field1749 = 8;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field1752 = 16777215;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field1745 = -1;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Z")
    public boolean field1741;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 8)
    public static final String method791(int arg0, String arg1, String arg2, String arg3) {
        field1754++;
        int var4 = 75 % ((arg0 - 53) / 53);
        int var5 = arg3.length();
        int var6 = arg2.length();
        int var7 = arg1.length();
        if (var6 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var8 = var5;
        int var9 = var7 - var6;
        if (var9 != 0) {
            int var10 = 0;
            while (true) {
                int var11 = arg3.indexOf(arg2, var10);
                if (var11 < 0) {
                    break;
                }
                var10 = var6 + var11;
                var8 += var9;
            }
        }
        StringBuffer var12 = new StringBuffer(var8);
        int var13 = 0;
        while (true) {
            int var14 = arg3.indexOf(arg2, var13);
            if (var14 < 0) {
                var12.append(arg3.substring(var13));
                return var12.toString();
            }
            var12.append(arg3.substring(var13, var14));
            var12.append(arg1);
            var13 = var6 + var14;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBLjj;I)V", line = 66)
    private final void method792(int arg0, byte arg1, class44 arg2, int arg3) {
        if (arg1 != 28) {
            return;
        }
        field1751++;
        if (arg3 == 1) {
            this.field1749 = arg2.method271(21081);
        } else if (arg3 == 2) {
            this.field1741 = true;
        } else if (arg3 == 3) {
            this.field1739 = arg2.method228(true);
            this.field1742 = arg2.method228(true);
            this.field1753 = arg2.method228(true);
        } else if (arg3 == 4) {
            this.field1747 = arg2.method286((byte) -69);
        } else if (arg3 == 5) {
            this.field1748 = arg2.method271(arg1 + 21053);
        } else if (arg3 == 6) {
            this.field1752 = arg2.method273(-867673064);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZB)V", line = 122)
    public static final void method793(boolean arg0, byte arg1) {
        class280.field4520 = (byte[][][]) null;
        class127.field1989 = null;
        class73.field1025 = (byte[][][]) null;
        if (arg0 && class225.field3604 != null) {
            class179.field2972 = class225.field3604.field4658;
        } else {
            class179.field2972 = -1;
        }
        class110.field1635 = null;
        class29.field398 = (int[][][]) null;
        class225.field3604 = null;
        class195.field3191 = (byte[][][]) null;
        class296.field4683 = (int[][][]) null;
        class113.field1719 = (byte[][][]) null;
        class323.field5007 = (int[][][]) null;
        class52.field738 = 0;
        field1740++;
        class129.field2018 = (byte[][][]) null;
        class97.field1324.method1233(arg1 ^ 0xFFFF8854);
        class128.field2004 = null;
        if (arg1 != -34) {
            method795((byte) 40);
        }
        class50.field707 = -1;
        class88.field1218 = -1;
        class102.field1483 = null;
        class199.field3236 = null;
        class133.field2085 = null;
        class296.field4687 = null;
        class157.field2473 = null;
        class103.field1505 = null;
        class54.field770 = null;
        class10.field129 = null;
        class64.field922 = null;
        class20.field289 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 167)
    public static final void method794(int arg0) {
        for (int var1 = 0; var1 < class192.field3138; var1++) {
            int var2 = class322.field4988[var1];
            class334 var3 = class74.field1049[var2];
            int var4 = class247.field3898.method286((byte) -124);
            if ((var4 & 0x4) != 0) {
                var4 += class247.field3898.method286((byte) -85) << 8;
            }
            class287.method2064(var2, var4, var3, (byte) 108);
        }
        int var5 = -69 / ((-arg0 - 34) / 39);
        field1746++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 192)
    public static final void method795(byte arg0) {
        field1744++;
        class300.method2143(20358);
        class336.method2346((byte) 58);
        class321.method2257((byte) -31);
        class338.method2357(false);
        class164.method1207((byte) 114);
        class74.method495((byte) -97);
        class144.method1068(-116);
        class174.method1309(84);
        class49.method318(1);
        class185.method1390((byte) 73);
        class110.method761(Integer.MAX_VALUE);
        class120.method842(0);
        class180.method1349(108);
        class278.method2010(-98);
        class129.method936(-128);
        class55.method354(0);
        class212.method1527(-6010);
        class274.method1984((byte) -125);
        if (class34.field456 != 0) {
            for (int var1 = 0; var1 < class77.field1090.length; var1++) {
                class77.field1090[var1] = null;
            }
            class55.field777 = 0;
        }
        class231.method1641(-80);
        int var2 = 24 / ((-arg0 - 10) / 51);
        class303.method2163((byte) 96);
        class339.field5285.method707(0);
        if (!class232.field3690) {
            ((class130) class170.field2814).method939(-121);
        }
        class336.field5257.method747((byte) -8);
        class309.field4806.method1282(0);
        class304.field4777.method1282(0);
        class79.field1106.method1282(0);
        class128.field1997.method1282(0);
        class234.field3748.method1282(0);
        class243.field3846.method1282(0);
        class126.field1967.method1282(0);
        class130.field2034.method1282(0);
        class2.field26.method1282(0);
        class288.field4615.method1282(0);
        class226.field3610.method1282(0);
        class93.field1270.method707(0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjj;I)V", line = 255)
    public final void method796(int arg0, class44 arg1, int arg2) {
        field1750++;
        int var4 = -40 % ((-arg2 - 35) / 32);
        while (true) {
            int var5 = arg1.method286((byte) -74);
            if (var5 == 0) {
                return;
            }
            this.method792(arg0, (byte) 28, arg1, var5);
        }
    }
}
