import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class275 {

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "J")
    public long field4717 = 0L;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field4701 = 0;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lwm;")
    public static class152 field4705 = class157.method1048("Poser", 124);

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lwm;")
    public static class152 field4714 = class157.method1048("Benutzen", 106);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lwm;")
    public static class152 field4704 = class157.method1048("<col=80ff00>", 126);

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[I")
    public static int[] field4710 = new int[32];

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public int field4711;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public int field4719;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Lah;")
    public static class205 field4702;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lv;")
    public class73 field4700;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "Lv;")
    public class73 field4707;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBIIII)V", line = 8)
    public static final void method1884(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field4715++;
        if (arg1 <= 113) {
            field4704 = (class152) null;
        }
        int var6 = 0;
        method1885(arg5, class179.field2843[arg3], arg0 - arg4, arg0 - -arg4, -2611);
        int var7 = arg4 * arg4;
        int var8 = arg2;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        int var13 = var9 - (var12 - 1) * var11;
        int var14 = (1 - var12) * var7 + var10;
        int var15 = var9 << 2;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (arg2 - 1) * var16;
        int var20 = (var6 + 1) * var15;
        while (var8 > 0) {
            var8--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var20;
                    var20 += var15;
                    var14 += var17;
                    var17 += var15;
                    var6++;
                }
            }
            int var21 = arg3 + var8;
            if (var13 < 0) {
                var6++;
                var14 += var17;
                var13 += var20;
                var17 += var15;
                var20 += var15;
            }
            int var22 = arg0 - var6;
            var13 += -var18;
            int var23 = arg0 + var6;
            int var24 = arg3 - var8;
            method1885(arg5, class179.field2843[var24], var22, var23, -2611);
            var14 += -var19;
            method1885(arg5, class179.field2843[var21], var22, var23, -2611);
            var19 -= var16;
            var18 -= var16;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4710[var1] = var0 - 1;
            var0 += var0;
        }
        field4721 = (int) (Math.random() * 33.0D) - 16;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[IIII)V", line = 96)
    public static final void method1885(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field4709++;
        if (arg4 != -2611) {
            field4702 = (class205) null;
        }
        int var8 = arg3 - 1;
        int var5 = var8 - 7;
        arg2--;
        while (var5 > arg2) {
            int var6 = arg2 + 1;
            arg1[var6] = arg0;
            int var7 = var6 + 1;
            arg1[var7] = arg0;
            int var9 = var7 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg2 = var13 + 1;
            arg1[arg2] = arg0;
        }
        while (arg2 < var8) {
            arg2++;
            arg1[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIBIIIIIII)V", line = 126)
    public static final void method1886(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -37 % ((-arg2 - 31) / 51);
        class85 var11 = null;
        field4716++;
        for (class85 var12 = (class85) class134.field2063.method1221((byte) 123); var12 != null; var12 = (class85) class134.field2063.method1223(65)) {
            if (var12.field1177 == arg8 && var12.field1181 == arg5 && var12.field1189 == arg3 && var12.field1182 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class85();
            var11.field1189 = arg3;
            var11.field1182 = arg7;
            var11.field1177 = arg8;
            var11.field1181 = arg5;
            class42.method296(var11, (byte) -113);
            class134.field2063.method1214(false, var11);
        }
        var11.field1179 = arg6;
        var11.field1180 = arg0;
        var11.field1192 = arg9;
        var11.field1184 = arg1;
        var11.field1185 = arg4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 182)
    public static void method1887(byte arg0) {
        int var1 = -9 / ((-arg0 - 14) / 57);
        field4702 = null;
        field4705 = null;
        field4714 = null;
        field4704 = null;
        field4710 = null;
    }
}
