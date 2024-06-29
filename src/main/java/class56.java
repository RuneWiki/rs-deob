import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class56 {

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lai;")
    public static class10 field994 = class44.method278("W-=hlen Sie eine Option", -16);

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Lai;")
    private static class10 field995 = class44.method278("You have only just left another world)3", 117);

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lai;")
    public static class10 field992 = class44.method278("Bitte warten Sie eine Minute", 122);

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static volatile int field989 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lai;")
    public static class10 field987 = field995;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lc;")
    public static class21 field986;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lc;")
    public static class21 field996;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JB)Lai;")
    public static final class10 method381(long arg0, byte arg1) {
        field998++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class85.field1495[(int) (var8 - arg0 * 37L)];
            }
            class10 var7 = new class10();
            var7.field160 = var6;
            var7.field118 = var6.length;
            if (arg1 <= 56) {
                field986 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method382(int arg0) {
        if (arg0 != 4959) {
            return;
        }
        field994 = null;
        field996 = null;
        field992 = null;
        field986 = null;
        field987 = null;
        field995 = null;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method383(int arg0) {
        if (arg0 >= -70) {
            field997 = 127;
        }
        class18.field263 = null;
        class87.field1547 = null;
        class140.field2639 = null;
        field990++;
        class189.field3615 = null;
        class100.field1857 = null;
        class145.field2781 = null;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static final void method384(int arg0) {
        field991++;
        for (int var1 = 0; var1 < class34.field532; var1++) {
            int var2 = class160.field3076[var1];
            class125 var3 = class168.field3249[var2];
            int var4 = class74.field1273.method767(true);
            if ((var4 & 0x8) != 0) {
                var3.field2386 = class129.method900((byte) 56, class74.field1273.method775(-86));
                var3.field1079 = var3.field2386.field3563;
                var3.field1131 = var3.field2386.field3581;
                var3.field1091 = var3.field2386.field3586;
                var3.field1140 = var3.field2386.field3587;
                var3.field1082 = var3.field2386.field3598;
                var3.field1126 = var3.field2386.field3575;
                var3.field1111 = var3.field2386.field3599;
                var3.field1092 = var3.field2386.field3566;
                var3.field1139 = var3.field2386.field3568;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1141 = class74.field1273.method780(10664);
                int var5 = class74.field1273.method790(8);
                var3.field1098 = var5 >> 16;
                var3.field1086 = 0;
                var3.field1145 = (var5 & 0xFFFF) + class120.field2304;
                if (var3.field1145 > class120.field2304) {
                    var3.field1086 = -1;
                }
                if (var3.field1141 == 65535) {
                    var3.field1141 = -1;
                }
                var3.field1084 = 0;
            }
            if ((var4 & 0x80) != 0) {
                int var6 = class74.field1273.method801(-129);
                int var7 = class74.field1273.method801(-129);
                var3.method428(var7, -5, class120.field2304, var6);
                var3.field1115 = class120.field2304 + 300;
                var3.field1137 = class74.field1273.method767(true);
                var3.field1095 = class74.field1273.method774(arg0 + 258);
            }
            if ((var4 & 0x4) != 0) {
                int var8 = class74.field1273.method762((byte) 122);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class74.field1273.method767(true);
                if (var3.field1081 == var8 && var8 != -1) {
                    int var10 = class142.method958((byte) -125, var8).field1347;
                    if (var10 == 1) {
                        var3.field1110 = var9;
                        var3.field1093 = 0;
                        var3.field1083 = 0;
                        var3.field1117 = 0;
                    }
                    if (var10 == 2) {
                        var3.field1083 = 0;
                    }
                } else if (var8 == -1 || var3.field1081 == -1 || class142.method958((byte) -119, var8).field1330 >= class142.method958((byte) -117, var3.field1081).field1330) {
                    var3.field1117 = 0;
                    var3.field1081 = var8;
                    var3.field1093 = 0;
                    var3.field1125 = var3.field1116;
                    var3.field1110 = var9;
                    var3.field1083 = 0;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1087 = class74.field1273.method764((byte) 28);
                var3.field1132 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field1130 = class74.field1273.method762((byte) 92);
                if (var3.field1130 == 65535) {
                    var3.field1130 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1134 = class74.field1273.method775(arg0 ^ 0x56);
                var3.field1143 = class74.field1273.method762((byte) 87);
            }
            if ((var4 & 0x20) != 0) {
                int var11 = class74.field1273.method801(-129);
                int var12 = class74.field1273.method806(0);
                var3.method428(var12, arg0 ^ 0x6, class120.field2304, var11);
                var3.field1115 = class120.field2304 + 300;
                var3.field1137 = class74.field1273.method767(true);
                var3.field1095 = class74.field1273.method801(-129);
            }
        }
        if (arg0 != -3) {
            field996 = null;
        }
    }
}
