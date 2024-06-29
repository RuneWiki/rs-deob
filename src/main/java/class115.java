import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class115 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Lmh;")
    public static class62 field1929 = class201.method1405(true, "overlay");

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Lmh;")
    public static class62 field1927 = class201.method1405(true, " <col=00ff80>");

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lmh;")
    public static class62 field1933 = class201.method1405(true, "titlebg");

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "F")
    public static float field1928;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lhi;")
    public static class26 field1931;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lij;", line = 14)
    public static final class271 method895(int arg0, int arg1) {
        class271 var2 = (class271) class36.field496.method1396(0, (long) arg1);
        field1926++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class177.field2839.method157(class29.method174(255, arg1), class81.method625(arg1, (byte) -41), (byte) 19);
        class271 var4 = new class271();
        var4.field4600 = arg1;
        if (var3 != null) {
            var4.method1856(new class92(var3), (byte) -20);
        }
        int var5 = -89 % ((arg0 + 8) / 42);
        class36.field496.method1397((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 37)
    public static void method896(int arg0) {
        if (arg0 > -116) {
            method895(105, -44);
        }
        field1929 = null;
        field1933 = null;
        field1931 = null;
        field1927 = null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Lmi;", line = 71)
    public static final class92 method897(int arg0) {
        field1925++;
        class92 var1 = new class92(24);
        var1.method717(1, 3);
        var1.method717(1, class44.field662);
        var1.method717(1, class150.field2361 ? 1 : 0);
        var1.method717(1, class113.field1877 ? 1 : 0);
        int var2 = -111 % ((-arg0 - 5) / 39);
        var1.method717(1, class276.field4733 ? 1 : 0);
        var1.method717(1, class306.field5262 ? 1 : 0);
        var1.method717(1, class74.field1157 ? 1 : 0);
        var1.method717(1, class92.field1499 ? 1 : 0);
        var1.method717(1, class170.field2777 ? 1 : 0);
        var1.method717(1, class158.field2547 ? 1 : 0);
        var1.method717(1, class301.field5179);
        var1.method717(1, client.field5162 ? 1 : 0);
        var1.method717(1, class72.field1107 ? 1 : 0);
        var1.method717(1, class52.field756 ? 1 : 0);
        var1.method717(1, class97.field1596);
        var1.method717(1, class218.field3770 ? 1 : 0);
        var1.method717(1, class169.field2744);
        var1.method717(1, class100.field1650);
        var1.method717(1, class114.field1902);
        var1.method738((byte) 107, class124.field2055);
        var1.method738((byte) -107, class54.field795);
        var1.method717(1, class235.field4039 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIII)V", line = 118)
    public static final void method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1932++;
        int var8 = arg0 + 1;
        class271.method1861(arg2, true, class282.field4817[arg0], arg1, arg5);
        int var9 = arg4 - 1;
        class271.method1861(arg2, true, class282.field4817[arg4], arg1, arg5);
        if (arg3 > 122) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class282.field4817[var6];
                var7[arg5] = var7[arg1] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)[B")
    public abstract byte[] method28(int arg0);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)V")
    public abstract void method27(int arg0, byte[] arg1);
}
