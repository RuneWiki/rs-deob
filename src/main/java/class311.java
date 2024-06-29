import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class311 extends class94 {

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field5509 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lud;")
    public static class279 field5508 = class130.method1024("::tele ", 255);

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lud;")
    public static class279 field5506 = class130.method1024(" ", 255);

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "[I")
    public static int[] field5513;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V", line = 5)
    public static final void method2210() {
        for (int var0 = 0; var0 < class272.field4849; var0++) {
            class18 var1 = class180.field3264[var0];
            class213.method1565(var1);
            class180.field3264[var0] = null;
        }
        class272.field4849 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 22)
    public static void method2211(byte arg0) {
        field5506 = null;
        if (arg0 == 36) {
            field5513 = null;
            field5508 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBLqg;IIILqb;Lcn;)V", line = 41)
    public static final void method2212(int arg0, byte arg1, class239 arg2, int arg3, int arg4, int arg5, class102 arg6, class264 arg7) {
        class52 var8 = new class52();
        if (arg1 != -82) {
            method2211((byte) -125);
        }
        field5511++;
        var8.field1098 = arg3;
        var8.field1076 = arg5 * 128;
        var8.field1079 = arg0 * 128;
        if (arg7 != null) {
            var8.field1086 = arg7.field4711 * 128;
            var8.field1084 = arg7.field4755;
            var8.field1102 = arg7.field4697;
            var8.field1081 = arg7.field4702;
            var8.field1072 = arg7.field4713;
            var8.field1069 = arg7;
            int var9 = arg7.field4733;
            int var10 = arg7.field4766;
            if (arg4 == 1 || arg4 == 3) {
                var9 = arg7.field4766;
                var10 = arg7.field4733;
            }
            var8.field1078 = (arg0 + var10) * 128;
            var8.field1068 = (arg5 + var9) * 128;
            if (arg7.field4760 != null) {
                var8.field1075 = true;
                var8.method434((byte) 30);
            }
            if (var8.field1081 != null) {
                var8.field1089 = var8.field1072 + (int) ((double) (var8.field1102 - var8.field1072) * Math.random());
            }
            class322.field5623.method2246(true, var8);
        } else if (arg6 != null) {
            var8.field1073 = arg6;
            class125 var11 = arg6.field1921;
            if (var11.field2321 != null) {
                var8.field1075 = true;
                var11 = var11.method999(13102);
            }
            if (var11 != null) {
                var8.field1078 = (var11.field2266 + arg0) * 128;
                var8.field1068 = (var11.field2266 + arg5) * 128;
                var8.field1084 = class130.method1027(arg6, (byte) -121);
                var8.field1086 = var11.field2264 * 128;
            }
            class60.field1263.method2246(true, var8);
        } else if (arg2 != null) {
            var8.field1101 = arg2;
            var8.field1078 = (arg0 + arg2.method3((byte) -111)) * 128;
            var8.field1068 = (arg5 + arg2.method3((byte) -124)) * 128;
            var8.field1084 = class253.method1810(false, arg2);
            var8.field1086 = arg2.field4199 * 128;
            class15.field438.method612(false, var8, arg2.field4197.method2013(122));
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 127)
    public static final void method2213(int arg0, int arg1) {
        if (arg0 != -20600) {
            field5506 = (class279) null;
        }
        field5507++;
        class104 var2 = class293.method2085(8, arg1, false);
        var2.method875(12466);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIII)V", line = 148)
    public static final void method2214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5510++;
        if (class97.field1824) {
            int var8 = arg2 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class124.field2262 - class105.field1982) * var8 / 100 + class105.field1982;
            arg4 = arg4 * var9 >> 8;
        }
        int var10 = 2048 - arg0 & 0x7FF;
        int var11 = 0;
        int var12 = 2048 - arg5 & 0x7FF;
        int var13 = 0;
        int var14 = arg4;
        if (arg7 < 48) {
            method2214(-70, -40, 119, 92, 3, -101, 123, -108);
        }
        if (var10 != 0) {
            int var15 = class27.field642[var10];
            int var16 = class27.field654[var10];
            var13 = -arg4 * var16 >> 16;
            var14 = arg4 * var15 >> 16;
        }
        if (var12 != 0) {
            int var17 = class27.field654[var12];
            int var18 = class27.field642[var12];
            var11 = var14 * var17 >> 16;
            var14 = var14 * var18 >> 16;
        }
        class306.field5438 = arg6 - var13;
        class92.field1747 = arg1 - var14;
        class21.field589 = arg3 - var11;
        class62.field1278 = arg0;
        class5.field124 = arg5;
    }
}
