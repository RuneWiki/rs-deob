import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class110 {

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lvh;")
    public static class108 field1985;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lme;")
    public static class39 field1988;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    public static int[] field1983;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V")
    public static final void method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 10140) {
            method766(94, 12);
        }
        class280[] var7 = class26.field398;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class280 var9 = var7[var8];
            if (var9 != null && var9.field4460 == 2) {
                class112.method783(var9.field4462 * 2, arg2, (var9.field4453 - class255.field4162 << 7) + var9.field4457, arg0 >> 1, arg3, -129, (var9.field4451 - class126.field2206 << 7) + var9.field4456, arg5 >> 1);
                if (class85.field1536 > -1 && (class266.field4301 % 20) < 10) {
                    class194.field3133[var9.field4450].method447(class85.field1536 + arg1 - 12, arg4 - -class111.field1999 - 28);
                }
            }
        }
        field1987++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)Llg;")
    public static final class11 method765(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class11 var4 = var3.field1978;
            var3.field1978 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Z")
    public static final boolean method766(int arg0, int arg1) {
        field1992++;
        if (arg0 != -13786) {
            return true;
        } else if (class63.field1095[arg1]) {
            return true;
        } else if (class84.field1518.method751(arg0 - 7855, arg1)) {
            int var2 = class84.field1518.method754(-118, arg1);
            if (var2 == 0) {
                class63.field1095[arg1] = true;
                return true;
            }
            if (class115.field2068[arg1] == null) {
                class115.field2068[arg1] = new class46[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class115.field2068[arg1][var3] == null) {
                    byte[] var4 = class84.field1518.method746(var3, (byte) -128, arg1);
                    if (var4 != null) {
                        class46 var5 = class115.field2068[arg1][var3] = new class46();
                        var5.field786 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method288(new class101(var4), 96);
                        } else {
                            var5.method283(new class101(var4), (byte) 23);
                        }
                    }
                }
            }
            class63.field1095[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        int var1 = 123 % ((53 - arg0) / 62);
        field1988 = null;
        field1983 = null;
        field1985 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V")
    public static final void method768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class207.field3455[0].method631(arg2, arg1);
        field1984++;
        class207.field3455[1].method631(arg2, arg1 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg4 / (arg0 - arg3);
        class283.method1855(arg2, arg1 + 16, 16, arg3 - 32, class288.field4593);
        class283.method1855(arg2, arg1 - (-var7 - 16), 16, var6, class116.field2072);
        class283.method1857(arg2, arg1 + var7 + 16, var6, class10.field148);
        class283.method1857(arg2 + 1, arg1 - -16 + var7, var6, class10.field148);
        class283.method1839(arg2, arg1 + var7 + 16, 16, class10.field148);
        class283.method1839(arg2, arg1 + var7 + 17, 16, class10.field148);
        class283.method1857(arg2 + 15, arg1 + 16 + var7, var6, class14.field194);
        class283.method1857(arg2 + 14, arg1 + 17 - -var7, var6 - 1, class14.field194);
        class283.method1839(arg2, arg1 + var7 + var6 + 15, 16, class14.field194);
        class283.method1839(arg2 - arg5, arg1 + 14 + var7 + var6, 15, class14.field194);
    }
}
