import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
    public static int[] field535 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lkd;")
    private static class73 field540 = class126.method1070((byte) -66, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lkd;")
    public static class73 field539 = field540;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lkd;")
    public static class73 field533 = class126.method1070((byte) -66, "(X");

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lkd;")
    public static class73 field537 = class126.method1070((byte) -66, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lkd;")
    private static class73 field541 = class126.method1070((byte) -66, "Private chat");

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lkd;")
    public static class73 field534 = field541;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field544 = 0;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)[Lde;")
    public static final class27[] method154(byte arg0) {
        field532++;
        class27[] var1 = new class27[class5.field182];
        int var2 = 0;
        if (arg0 != 88) {
            method157(null, -103, (byte) 8, 95);
        }
        while (var2 < class5.field182) {
            class27 var3 = var1[var2] = new class27();
            var3.field777 = class111.field2723;
            var3.field778 = class45.field1192;
            var3.field775 = class22.field641[var2];
            var3.field776 = class132.field3315[var2];
            var3.field772 = class72.field1819[var2];
            var3.field774 = class2.field150[var2];
            var3.field773 = class24.field682;
            var3.field771 = class92.field2382[var2];
            var2++;
        }
        class57.method492(-4202);
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method155(int arg0) {
        field538++;
        if (arg0 > -104) {
            field540 = null;
        }
        class61.field1597.method534((byte) -98);
        class50.field1330.method534((byte) -109);
        class78.field1991.method534((byte) 68);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method156(byte arg0) {
        field535 = null;
        if (arg0 < 3) {
            field536 = 40;
        }
        field537 = null;
        field541 = null;
        field539 = null;
        field534 = null;
        field540 = null;
        field533 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lkd;IBI)Lkd;")
    public static final class73 method157(class73[] arg0, int arg1, byte arg2, int arg3) {
        int var4 = 0;
        field543++;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = class42.field1137;
            }
            var4 += arg0[arg3 + var5].field1880;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = -12 % ((-arg2 - 7) / 58);
        for (int var9 = 0; var9 < arg1; var9++) {
            class73 var11 = arg0[arg3 + var9];
            class128.method1077(var11.field1858, 0, var6, var7, var11.field1880);
            var7 += var11.field1880;
        }
        class73 var10 = new class73();
        var10.field1880 = var4;
        var10.field1858 = var6;
        return var10;
    }
}
