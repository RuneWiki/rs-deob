import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class165 {

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Ldb;")
    public static class32 field3162 = new class32(8);

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[S")
    public static short[] field3163 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lai;")
    public static class10 field3166 = class44.method278("M", -19);

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lai;")
    public static class10 field3169 = class44.method278("Benutzen Sie bitte eine andere Welt)3", -12);

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lai;")
    public static class10 field3168 = class44.method278(" )2> <col=ffffff>", 106);

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3171 = 99;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field3161;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lnd;")
    public class122 field3159;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lnd;")
    public class122 field3165;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lnd;")
    public class122 field3167;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLh;)V")
    public static final void method1096(byte arg0, class65 arg1) {
        if (arg0 != 40) {
            method1098(null, -12, 65, 111, null, null);
        }
        field3172++;
        if (class120.field2304 == arg1.field1127 || arg1.field1081 == -1 || arg1.field1110 != 0 || arg1.field1093 + 1 > class142.method958((byte) -111, arg1.field1081).field1358[arg1.field1117]) {
            int var2 = arg1.field1126 * 64 + arg1.field1096 * 128;
            int var3 = arg1.field1126 * 64 + arg1.field1090 * 128;
            int var4 = arg1.field1127 - arg1.field1121;
            int var5 = class120.field2304 - arg1.field1121;
            int var6 = arg1.field1105 * 128 + arg1.field1126 * 64;
            arg1.field1100 = ((var4 - var5) * var2 + var5 * var6) / var4;
            int var7 = arg1.field1126 * 64 + arg1.field1104 * 128;
            arg1.field1097 = ((var4 - var5) * var3 + var5 * var7) / var4;
        }
        if (arg1.field1122 == 0) {
            arg1.field1108 = 1024;
        }
        arg1.field1114 = 0;
        if (arg1.field1122 == 1) {
            arg1.field1108 = 1536;
        }
        if (arg1.field1122 == 2) {
            arg1.field1108 = 0;
        }
        if (arg1.field1122 == 3) {
            arg1.field1108 = 512;
        }
        arg1.field1109 = arg1.field1108;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field3169 = null;
        field3163 = null;
        field3162 = null;
        if (arg0 == -9323) {
            field3168 = null;
            field3166 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lka;III[B[Ll;)V")
    public static final void method1098(class92 arg0, int arg1, int arg2, int arg3, byte[] arg4, class100[] arg5) {
        class114 var6 = new class114(arg4);
        field3155++;
        int var7 = -25 / ((arg3 - 5) / 45);
        int var8 = -1;
        while (true) {
            int var9 = var6.method804((byte) -117);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method804((byte) -109);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 12;
                int var14 = var6.method767(true);
                int var15 = var10 >> 6 & 0x3F;
                int var16 = var14 & 0x3;
                int var17 = var14 >> 2;
                int var18 = arg2 + var15;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var13;
                    if ((class185.field3527[1][var18][var19] & 0x2) == 2) {
                        var20 = var13 - 1;
                    }
                    class100 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    class47.method290(arg0, var16, (byte) 33, var21, var19, var13, var8, var17, var18);
                }
            }
        }
    }
}
