import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class129 {

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Lgg;")
    public static class61 field2158 = new class61(16);

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "[I")
    public static int[] field2163 = new int[2];

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2162 = -1;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[B")
    public byte[] field2150;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[B")
    public byte[] field2157;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[I")
    public static int[] field2166;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method894(int arg0, boolean arg1, String arg2) {
        field2155++;
        String var3 = class243.method1598(class250.method1651(arg2, (byte) 56), -30311);
        boolean var4 = arg1;
        for (int var5 = 0; var5 < class70.field969; var5++) {
            class235 var6 = class260.field4141[class51.field721[var5]];
            if (var6 != null && var6.field3735 != null && var6.field3735.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg0 == 1) {
                    class193.field3077++;
                    class83.field1148.method1238(5, -136478397);
                    class83.field1148.method1769(128, class51.field721[var5]);
                    class83.field1148.method1757(0, (byte) 110);
                } else if (arg0 == 4) {
                    class133.field2208++;
                    class83.field1148.method1238(161, -136478397);
                    class83.field1148.method1761(class51.field721[var5], 4334);
                    class83.field1148.method1744(-115, 0);
                } else if (arg0 == 5) {
                    class83.field1148.method1238(92, -136478397);
                    class142.field2307++;
                    class83.field1148.method1772((byte) -29, class51.field721[var5]);
                    class83.field1148.method1744(-58, 0);
                } else if (arg0 == 6) {
                    class83.field1148.method1238(30, -136478397);
                    class83.field1148.method1768(82, class51.field721[var5]);
                    class83.field1148.method1744(-69, 0);
                    class140.field2299++;
                } else if (arg0 == 7) {
                    class83.field1148.method1238(250, -136478397);
                    class257.field4105++;
                    class83.field1148.method1744(-55, 0);
                    class83.field1148.method1761(class51.field721[var5], 4334);
                }
                break;
            }
        }
        if (!var4) {
            class297.method1986(0, "", true, class77.field1047 + var3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjj;Ljj;)V")
    public static final void method895(int arg0, class134 arg1, class134 arg2) {
        field2146++;
        class122.field2050 = class30.method207(arg2, class284.field4544, arg1, 0, -93);
        class1.field16 = (class210) class122.field2050;
        class58.field809 = class30.method207(arg2, class225.field3562, arg1, arg0, 67);
        class283.field4524 = class30.method207(arg2, class191.field3055, arg1, 0, 118);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method896(int arg0) {
        field2164++;
        if (class119.field2009 == 2) {
            if (class216.field3470 == class120.field2031 && class215.field3465 == class104.field1752) {
                class119.field2009 = 0;
                if (class219.field3507 && class247.field3975[81] && class202.field3248 > 2) {
                    class251.method1653((byte) -3, class202.field3248 - 2);
                } else {
                    class251.method1653((byte) -3, class202.field3248 - 1);
                }
            }
        } else if (class266.field4319 == class120.field2031 && class232.field3696 == class104.field1752) {
            class119.field2009 = 0;
            if (class219.field3507 && class247.field3975[81] && class202.field3248 > 2) {
                class251.method1653((byte) -3, class202.field3248 - 2);
            } else {
                class251.method1653((byte) -3, class202.field3248 - 1);
            }
        } else {
            class215.field3465 = class232.field3696;
            class216.field3470 = class266.field4319;
            class119.field2009 = 2;
        }
        if (arg0 != 16) {
            method896(23);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    public static final int method897(int arg0, int arg1) {
        field2156++;
        if (arg0 > 0) {
            return 1;
        } else if (arg1 < ~arg0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method898(byte arg0) {
        field2158 = null;
        field2163 = null;
        if (arg0 == 9) {
            field2166 = null;
        }
    }
}
