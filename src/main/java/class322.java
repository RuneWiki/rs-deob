import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class322 extends class756 {

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    private int field4103;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "Z")
    public static boolean field4112 = false;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Z")
    public static boolean field4113 = false;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lkha;")
    public static class687 field4109;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Lwea;")
    public static class98 field4106;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public final void method1897(int arg0, int arg1, int arg2) {
        int var4 = 58 % ((arg2 - 68) / 33);
        ++field4101;
        int var5 = this.field4108 * arg0 >> 12;
        int var6 = this.field4103 * arg0 >> 12;
        int var7 = this.field4105 * arg1 >> 12;
        int var8 = this.field4110 * arg1 >> 12;
        class215.method1305(var7, (byte) -46, var5, super.field10528, var6, var8);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;B)V")
    public static final void method1898(int arg0, boolean arg1, String arg2, String arg3, byte arg4) {
        ++field4104;
        class650 var5 = class158.method983(-126);
        var5.field8928.method1141(class283.field3607.field2536, 26);
        var5.field8928.method1157(0, (byte) 116);
        int var6 = var5.field8928.field2354;
        var5.field8928.method1157(636, (byte) 123);
        int[] var7 = class487.method2847((byte) -112, var5);
        int var8 = var5.field8928.field2354;
        var5.field8928.method1110(arg3, -30452);
        var5.field8928.method1157(class718.field10135, (byte) 118);
        var5.field8928.method1110(arg2, -30452);
        var5.field8928.method1104(57, class584.field8114);
        var5.field8928.method1141(class416.field5920, 57);
        var5.field8928.method1141(class702.field9902.field3627, -123);
        class563.method3177(24880, var5.field8928);
        String var9 = class202.field2579;
        var5.field8928.method1141(var9 != null ? 1 : 0, -95);
        if (var9 != null) {
            var5.field8928.method1110(var9, -30452);
        }
        var5.field8928.method1141(arg0, 108);
        var5.field8928.method1141(arg1 ? 1 : 0, 88);
        var5.field8928.field2354 += 7;
        var5.field8928.method1149(var8, var7, (byte) 94, var5.field8928.field2354);
        var5.field8928.method1090(-var6 + var5.field8928.field2354, 122);
        class108.method745(var5, -102);
        class486.field6915 = 0;
        class219.field2784 = -3;
        class722.field10163 = 0;
        if (arg4 >= 2) {
            class272.field3446 = 1;
            if (arg0 < 13) {
                class181.field2382 = true;
                class574.method3221(-102);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1899(byte arg0) {
        field4106 = null;
        if (arg0 >= 45) {
            field4109 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZ)I")
    public static final int method1900(int arg0, int arg1, boolean arg2) {
        ++field4100;
        if (arg2) {
            return 0;
        } else {
            class464 var3 = class175.method1082(arg2, arg1, (byte) 20);
            if (var3 == null) {
                return class492.field6975.method3134(5, arg1).field7931;
            } else {
                int var4 = arg0;
                for (int var5 = 0; var3.field6715.length > var5; ++var5) {
                    if (~var3.field6715[var5] == 0) {
                        ++var4;
                    }
                }
                return var4 + (class492.field6975.method3134(5, arg1).field7931 - var3.field6715.length);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static final void method1901(int arg0) {
        for (class144 var1 = (class144) class488.field6950.method1834(0); var1 != null; var1 = (class144) class488.field6950.method1834(0)) {
            class408.method2421(var1, (byte) 77);
        }
        ++field4107;
        int var2;
        int var3;
        if (~class223.field2944.field619.method444((byte) -124) != -2) {
            var2 = class553.field7772;
            var3 = class553.field7772;
        } else {
            var2 = 3;
            var3 = 0;
        }
        client.method707();
        for (int var4 = var3; var2 >= var4; ++var4) {
            client.method711();
            client.method717(var4);
            client.method705(var4);
        }
        if (arg0 > -122) {
            field4106 = null;
        }
        client.method706();
        client.method704();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)V")
    public final void method1902(int arg0, int arg1, byte arg2) {
        ++field4102;
        int var4 = this.field4108 * arg1 >> 12;
        int var5 = this.field4103 * arg1 >> 12;
        if (arg2 < -74) {
            int var6 = this.field4105 * arg0 >> 12;
            int var7 = this.field4110 * arg0 >> 12;
            class30.method300(122, var6, var4, super.field10533, var7, super.field10528, var5, super.field10527);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
    public final void method1903(byte arg0, int arg1, int arg2) {
        int var4 = 18 % ((arg0 - 82) / 40);
        ++field4111;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIII)V")
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4110 = arg3;
        this.field4103 = arg2;
        this.field4105 = arg1;
        this.field4108 = arg0;
    }
}
