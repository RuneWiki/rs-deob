import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class163 {

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "J")
    public long field2448 = 0L;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "J")
    public static long field2450 = 0L;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2454 = "shake:";

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lmd;")
    public class233 field2451;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lmd;")
    public class233 field2452;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lea;")
    public static class235 field2453;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Ljava/lang/String;", line = 23)
    public static final String method1152(int arg0, int arg1) {
        if (arg0 > -74) {
            field2450 = -38L;
        }
        field2458++;
        return class180.field2686[arg1].length() <= 0 ? class307.field4677[arg1] : class307.field4677[arg1] + class299.field4570 + class180.field2686[arg1];
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/lang/String;)V", line = 38)
    public static final void method1153(int arg0, String arg1) {
        field2459++;
        for (class61 var2 = (class61) class211.field3208.method1109(arg0 ^ 0x26E9); var2 != null; var2 = (class61) class211.field3208.method1115((byte) 76)) {
            if (var2.field814.equals(arg1)) {
                class9.field71 = var2;
                return;
            }
        }
        if (arg0 != -9877) {
            field2454 = (String) null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V", line = 64)
    public static final void method1154(int arg0, int arg1, int arg2, int arg3) {
        class169 var4 = class101.method712(arg1, arg0, 2089666400);
        var4.method1183(false);
        field2462++;
        var4.field2530 = arg2;
        var4.field2542 = arg3;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 78)
    public static final void method1155(int arg0, int arg1) {
        field2456++;
        if (class293.field4490 == arg0) {
            return;
        }
        if (class293.field4490 == 0) {
            class203.method1393((byte) -118);
        }
        if (arg0 == 40) {
            class132.method971((byte) 48);
        }
        if (arg0 != 40 && class157.field2355 != null) {
            class157.field2355.method1138(-16726864);
            class157.field2355 = null;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 28) {
            class270.field4134 = 1;
            class28.field377 = 0;
            class21.field249 = 0;
            class271.field4154 = 0;
            class162.field2446 = 1;
            class198.method1363(-1, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class122.method885((byte) -87);
        }
        if (arg0 == 5) {
            class185.method1273(0, class68.field898);
        } else {
            class6.method16(arg1 + 24418);
        }
        boolean var3 = class293.field4490 == 5 || class293.field4490 == 10 || class293.field4490 == 28;
        if (var2 != var3) {
            if (var2) {
                class195.field2943 = class80.field1132;
                if (class115.field1760 == 0) {
                    class84.method587(2, (byte) -45);
                } else {
                    class291.method2038(false, 255, 0, class48.field613, 2, class80.field1132, -25614);
                }
                class274.field4208.method652((byte) -56, false);
            } else {
                class84.method587(2, (byte) -74);
                class274.field4208.method652((byte) -76, true);
            }
        }
        if (class117.field1817 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class117.method827();
        }
        class293.field4490 = arg0;
        if (arg1 != 10) {
            method1154(-110, -110, 114, -113);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 169)
    public static void method1156(int arg0) {
        if (arg0 != 5) {
            field2450 = 82L;
        }
        field2454 = null;
        field2453 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lf;I)V", line = 181)
    public static final void method1157(class329 arg0, int arg1) {
        field2463++;
        int var2 = arg0.field5032;
        if (var2 == 324) {
            if (class134.field2050 == -1) {
                class305.field4655 = arg0.field4976;
                class134.field2050 = arg0.field5050;
            }
            if (class43.field520.field3867) {
                arg0.field5050 = class134.field2050;
            } else {
                arg0.field5050 = class305.field4655;
            }
        } else if (var2 == 325) {
            if (class134.field2050 == -1) {
                class305.field4655 = arg0.field4976;
                class134.field2050 = arg0.field5050;
            }
            if (class43.field520.field3867) {
                arg0.field5050 = class305.field4655;
            } else {
                arg0.field5050 = class134.field2050;
            }
        } else if (var2 == 327) {
            arg0.field5097 = 150;
            arg0.field4961 = (int) (Math.sin((double) class304.field4641 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4939 = -1;
            arg0.field4937 = 5;
        } else {
            if (arg1 != 24394) {
                method1154(122, 111, -108, 34);
            }
            if (var2 == 328) {
                if (class114.field1750.field2934 == null) {
                    arg0.field4939 = 0;
                } else {
                    arg0.field5097 = 150;
                    arg0.field4961 = (int) (Math.sin((double) class304.field4641 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field4937 = 5;
                    arg0.field4939 = ((int) class242.method1638(class114.field1750.field2934, -14393) << 11) + 2047;
                    arg0.field5059 = 0;
                    arg0.field4958 = class114.field1750.field1507;
                    arg0.field4970 = class114.field1750.field1480;
                    arg0.field4986 = class114.field1750.field1555;
                }
            }
        }
    }
}
