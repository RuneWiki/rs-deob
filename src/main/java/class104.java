import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class104 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field1843 = 50;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "[I")
    public static int[] field1849 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Z")
    public static boolean field1848 = true;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[I")
    public static int[] field1842 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[I")
    public static int[] field1852 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[Lsb;")
    public static class98[] field1844 = new class98[field1843];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
    public static int[] field1839 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[I")
    public static int[] field1846 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    public static int[] field1841 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "[I")
    public static int[] field1853 = new int[field1843];

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lse;")
    public static class87 field1850 = new class87();

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lsb;")
    public static class98 field1856 = class47.method368("<col=ffff00>", 0);

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lac;")
    public static class188 field1838;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "[Lsb;")
    public static class98[] field1857;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method798(byte arg0) {
        if (arg0 <= 109) {
            field1852 = null;
        }
        class121.field2230.method1554((byte) -109);
        field1847++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    public static final void method799(int arg0, int arg1) {
        if (arg0 != -21731) {
            field1848 = false;
        }
        field1840++;
        class264.field4628.method1561(-109, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static void method800(byte arg0) {
        field1842 = null;
        field1849 = null;
        field1857 = null;
        field1846 = null;
        field1853 = null;
        field1852 = null;
        field1844 = null;
        field1838 = null;
        field1850 = null;
        field1841 = null;
        field1856 = null;
        int var1 = 88 % ((-arg0 - 76) / 36);
        field1839 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1845++;
        for (class60 var5 = (class60) class82.field1448.method371((byte) 61); var5 != null; var5 = (class60) class82.field1448.method370(true)) {
            class14.method117(arg4, arg2, arg3, arg0, (byte) -120, var5);
        }
        for (class60 var6 = (class60) class2.field38.method371((byte) 61); var6 != null; var6 = (class60) class2.field38.method370(true)) {
            byte var10 = 1;
            if (var6.field978.field4510 == var6.field978.field4479) {
                var10 = 0;
            } else if (var6.field978.field4490 == var6.field978.field4479) {
                var10 = 2;
            }
            if (var6.field1011 != var10) {
                int var11 = class233.method1594(var6.field978, -1);
                if (var6.field1007 != var11) {
                    if (var6.field997 != null) {
                        class36.field606.method1213(var6.field997);
                        var6.field997 = null;
                    }
                    var6.field1007 = var11;
                }
                var6.field1011 = var10;
            }
            var6.field1003 = var6.field978.field4466;
            var6.field1005 = var6.field978.field4486 * 64 + var6.field978.field4466;
            var6.field994 = var6.field978.field4492;
            var6.field1001 = var6.field978.field4486 * 64 + var6.field978.field4492;
            class14.method117(arg4, arg2, arg3, arg0, (byte) -120, var6);
        }
        for (class60 var7 = (class60) class34.field594.method1514((byte) 112); var7 != null; var7 = (class60) class34.field594.method1515(121)) {
            byte var8 = 1;
            if (var7.field995.field4510 == var7.field995.field4479) {
                var8 = 0;
            } else if (var7.field995.field4490 == var7.field995.field4479) {
                var8 = 2;
            }
            if (var7.field1011 != var8) {
                int var9 = class115.method859(var7.field995, -11492);
                if (var7.field1007 != var9) {
                    if (var7.field997 != null) {
                        class36.field606.method1213(var7.field997);
                        var7.field997 = null;
                    }
                    var7.field1007 = var9;
                }
                var7.field1011 = var8;
            }
            var7.field1001 = var7.field995.field4486 * 64 + var7.field995.field4492;
            var7.field1005 = var7.field995.field4466 + (var7.field995.field4486 * 64);
            var7.field1003 = var7.field995.field4466;
            var7.field994 = var7.field995.field4492;
            class14.method117(arg4, arg2, arg3, arg0, (byte) -120, var7);
        }
        if (arg1 != 64) {
            method801(79, 103, -24, -116, 104);
        }
    }
}
