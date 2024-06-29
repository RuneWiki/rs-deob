import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class89 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1404 = "Loaded sprites";

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1405 = 0;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[I")
    public static int[] field1408 = new int[50];

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field1409;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjj;IILvb;IILee;)V")
    public static final void method573(int arg0, class107 arg1, int arg2, int arg3, class61 arg4, int arg5, int arg6, class288 arg7) {
        field1403++;
        if (arg6 < 37) {
            return;
        }
        class151 var8 = new class151();
        var8.field2173 = arg2;
        var8.field2172 = arg0 * 128;
        var8.field2190 = arg5 * 128;
        if (arg7 != null) {
            var8.field2178 = arg7.field4347;
            var8.field2188 = arg7;
            var8.field2183 = arg7.field4322;
            var8.field2181 = arg7.field4380;
            var8.field2187 = arg7.field4324;
            int var10 = arg7.field4383;
            var8.field2174 = arg7.field4360;
            int var11 = arg7.field4307;
            var8.field2182 = arg7.field4372 * 128;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg7.field4307;
                var11 = arg7.field4383;
            }
            var8.field2186 = (arg5 + var11) * 128;
            var8.field2180 = (arg0 + var10) * 128;
            if (arg7.field4336 != null) {
                var8.field2184 = true;
                var8.method915(true);
            }
            if (var8.field2183 != null) {
                var8.field2176 = var8.field2174 + (int) (Math.random() * (double) (var8.field2187 - var8.field2174));
            }
            class295.field4670.method987(var8, (byte) -121);
        } else if (arg4 != null) {
            var8.field2191 = arg4;
            class72 var9 = arg4.field959;
            if (var9.field1196 != null) {
                var8.field2184 = true;
                var9 = var9.method487(-1);
            }
            if (var9 != null) {
                var8.field2186 = (var9.field1148 + arg5) * 128;
                var8.field2180 = (var9.field1148 + arg0) * 128;
                var8.field2178 = class178.method1107(arg4, true);
                var8.field2182 = var9.field1175 * 128;
                var8.field2181 = var9.field1202;
            }
            class264.field3988.method987(var8, (byte) -121);
        } else if (arg1 != null) {
            var8.field2177 = arg1;
            var8.field2180 = (arg1.method676(-30217) + arg0) * 128;
            var8.field2186 = (arg1.method676(-30217) + arg5) * 128;
            var8.field2178 = class112.method727((byte) 92, arg1);
            var8.field2181 = arg1.field1641;
            var8.field2182 = arg1.field1655 * 128;
            class278.field4193.method1663(class94.method604((byte) 65, arg1.field1663), var8, -79);
            return;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Lrf;")
    public static final class289 method574(byte arg0, int arg1) {
        field1406++;
        if (arg0 != -15) {
            return null;
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class234.field3532[var3] == null || class234.field3532[var3][var2] == null) {
            boolean var4 = class294.method1943((byte) 96, var3);
            if (!var4) {
                return null;
            }
        }
        return class234.field3532[var3][var2];
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static void method575(boolean arg0) {
        field1408 = null;
        if (!arg0) {
            method573(2, (class107) null, -18, -70, (class61) null, -24, 29, (class288) null);
        }
        field1404 = null;
        field1409 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method576(byte arg0) {
        field1410++;
        int var1 = class213.field3190;
        int var2 = class236.field3558;
        int var3 = class283.field4239;
        byte var4 = 20;
        int var5 = class32.field470 - 3;
        if (arg0 < 46) {
            field1401 = 91;
        }
        if (class241.field3625 == null || class288.field4315 == null) {
            if (class295.field4675.method1960(class274.field4126, (byte) 123) && class295.field4675.method1960(class175.field2680, (byte) 122)) {
                class241.field3625 = class94.method599(class295.field4675, class274.field4126, 0, false);
                class288.field4315 = class94.method599(class295.field4675, class175.field2680, 0, false);
            } else {
                class111.method715(var1, var2, var3, var4, class275.field4148, 256 - class297.field4693);
            }
        }
        if (class241.field3625 != null && class288.field4315 != null) {
            int var6 = (var3 - (class288.field4315.field3473 * 2)) / class241.field3625.field3473;
            for (int var7 = 0; var7 < var6; var7++) {
                class241.field3625.method1274(class241.field3625.field3473 * var7 + var1 + class288.field4315.field3473, var2);
            }
            class288.field4315.method1274(var1, var2);
            class288.field4315.method1269(var1 + var3 - class288.field4315.field3473, var2);
        }
        class192.field2953.method1024(class96.field1514, var1 + 3, var2 + 14, class18.field212, -1);
        class111.method715(var1, var2 + var4, var3, var5 - var4, class275.field4148, 256 - class297.field4693);
        int var8 = class203.field3065;
        int var9 = class91.field1438;
        for (int var10 = 0; var10 < class218.field3278; var10++) {
            int var18 = (class218.field3278 - var10 - 1) * 15 + var2 + var4 + 13;
            if (var9 > var1 && (var1 + var3) > var9 && var18 - 13 < var8 && var8 < var18 + 3) {
                class111.method715(var1, var18 - 12, var3, 15, class10.field136, 256 - class197.field2995);
            }
        }
        if ((class100.field1575 == null || class212.field3179 == null || class81.field1305 == null) && class295.field4675.method1960(class256.field3891, (byte) 127) && class295.field4675.method1960(class119.field1805, (byte) 121) && class295.field4675.method1960(class253.field3840, (byte) 126)) {
            class100.field1575 = class94.method599(class295.field4675, class256.field3891, 0, false);
            class212.field3179 = class94.method599(class295.field4675, class119.field1805, 0, false);
            class81.field1305 = class94.method599(class295.field4675, class253.field3840, 0, false);
        }
        if (class100.field1575 != null && class212.field3179 != null && class81.field1305 != null) {
            int var11 = (var3 - (class81.field1305.field3473 * 2)) / class100.field1575.field3473;
            for (int var12 = 0; var12 < var11; var12++) {
                class100.field1575.method1274(class81.field1305.field3473 + var1 + (class100.field1575.field3473 * var12), -class100.field1575.field3464 + var5 + var2);
            }
            int var13 = (var5 - class81.field1305.field3464 - var4) / class212.field3179.field3464;
            for (int var14 = 0; var14 < var13; var14++) {
                class212.field3179.method1274(var1, class212.field3179.field3464 * var14 + var4 + var2);
                class212.field3179.method1269(var1 + var3 - class212.field3179.field3473, class212.field3179.field3464 * var14 + var2 + var4);
            }
            class81.field1305.method1274(var1, var2 + var5 - class81.field1305.field3464);
            class81.field1305.method1269(var1 + var3 - class81.field1305.field3473, -class81.field1305.field3464 + var2 - -var5);
        }
        for (int var15 = 0; var15 < class218.field3278; var15++) {
            int var16 = (class218.field3278 - var15 - 1) * 15 + var2 + var4 + 13;
            int var17 = class18.field212;
            if (var9 > var1 && (var1 + var3) > var9 && var8 > (var16 - 13) && var8 < var16 + 3) {
                var17 = class3.field37;
            }
            class192.field2953.method1024(class233.method1486(0, var15), var1 + 3, var16, var17, 0);
        }
        class191.method1195(class283.field4239, class213.field3190, class32.field470, (byte) 127, class236.field3558);
    }
}
