import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class210 extends class147 {

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[I")
    public static int[] field3258 = new int[25];

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Lna;")
    private static class26 field3266 = class69.method505("red:", (byte) -122);

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lna;")
    public static class26 field3259 = field3266;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lna;")
    public static class26 field3261 = class69.method505(":clan:", (byte) -119);

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lna;")
    public static class26 field3272 = field3266;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V", line = 5)
    public static final void method1407(byte arg0) {
        int var1 = 44 / ((-arg0 - 2) / 52);
        if (class181.field2815 != null) {
            class35.method297(class181.field2815, 0);
            class181.field2815 = null;
        }
        field3267++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method1408(boolean arg0) {
        field3265++;
        class223.method1490();
        class302.field5204 = null;
        class258.field4202 = -1;
        class18.method120((byte) 55);
        class43.field699.method37(2);
        class24.field350 = new class157();
        ((class13) class200.field3102).method99(0);
        class226.field3588 = 0;
        class226.field3577 = new class215[255];
        class239.method1639();
        class179.method1240();
        class64.method487(false);
        class28.method228(17, arg0);
        class74.method528((byte) 51);
        for (int var1 = 0; var1 < 2048; var1++) {
            class159 var2 = class268.field4427[var1];
            if (var2 != null) {
                var2.field3933 = null;
            }
        }
        if (class255.field4184) {
            class179.method1238(104, 104);
            class19.method124();
        }
        class33.method268(class266.field4374, 0, class319.field5464);
        class42.method339(21, class319.field5464);
        class301.field5192 = null;
        class142.field2182 = null;
        class121.field1888 = null;
        class313.field5351 = null;
        class317.field5431 = null;
        if (class207.field3217 == 5) {
            class317.method2201(class319.field5464, (byte) -60);
        }
        if (class207.field3217 == 10) {
            class46.method350(false, 3000);
        }
        if (class207.field3217 == 30) {
            class193.method1302(25, 5);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIBII)V", line = 118)
    public static final void method1409(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class57.field929 = arg3;
        class126.field1954 = arg2;
        class71.field1091 = arg6;
        field3260++;
        class252.field4143 = arg1;
        class189.field2972 = arg5;
        if (arg0 && class57.field929 >= 100) {
            class324.field5589 = class71.field1091 * 128 + 64;
            class14.field231 = class189.field2972 * 128 + 64;
            class178.field2793 = class17.method118(class279.field4651, 1, class324.field5589, class14.field231) - class126.field1954;
        }
        int var7 = 76 % ((-arg4 - 79) / 35);
        class37.field614 = 2;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 146)
    public static void method1410(int arg0) {
        field3272 = null;
        field3258 = null;
        field3259 = null;
        if (arg0 != 25) {
            method1407((byte) -58);
        }
        field3266 = null;
        field3261 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V", line = 162)
    public class210(int arg0, int arg1) {
        this.field3262 = arg1;
        this.field3271 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lve;Lve;ILve;)V", line = 172)
    public static final void method1411(class266 arg0, class266 arg1, int arg2, class266 arg3) {
        class249.field4063 = arg1;
        int var4 = -110 / ((-arg2 - 7) / 43);
        field3270++;
        class178.field2790 = arg0;
        class12.field168 = arg3;
    }
}
