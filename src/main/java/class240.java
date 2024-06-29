import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class240 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lid;")
    public static class149 field4191 = class60.method382("Ablegen", (byte) 55);

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lid;")
    public static class149 field4189 = class60.method382("Liste des serveurs charg-Be", (byte) 43);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lid;")
    public static class149 field4186 = class60.method382("unzap", (byte) 12);

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[[[B")
    public static byte[][][] field4192;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([Lid;I)[Lid;")
    public static final class149[] method1650(class149[] arg0, int arg1) {
        class149[] var2 = new class149[5];
        for (int var3 = arg1; var3 < 5; var3++) {
            var2[var3] = class237.method1603(new class149[] { class211.method1434(var3, true), class80.field1482 }, -96);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class237.method1603(new class149[] { var2[var3], arg0[var3] }, -121);
            }
        }
        field4196++;
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
    public static final void method1651(int arg0, int arg1) {
        field4188++;
        class216 var2 = class139.method972(arg1, false, arg0);
        var2.method1457(0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lid;BI)V")
    public static final void method1652(class149 arg0, byte arg1, int arg2) {
        int var3 = 92 % ((arg1 + 43) / 41);
        field4190++;
        class208.field3720.method162(2, 188);
        class270.field4858++;
        class208.field3720.method495(-27699, arg2);
        class208.field3720.method496(2, arg0.method1023((byte) -16));
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        field4189 = null;
        field4192 = null;
        field4191 = null;
        int var1 = -22 / ((arg0 - 4) / 57);
        field4186 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILal;ZIII)V")
    public static final void method1654(int arg0, int arg1, class230 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class76.field1375 = 1;
        class128.field2254 = arg2;
        class93.field1643 = arg6;
        class10.field133 = arg3;
        field4187++;
        class99.field1757 = arg5;
        if (arg4 != 12672) {
            method1656((class230) null, false);
        }
        class71.field1246 = arg0;
        class231.field4070 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
    public static final void method1655(byte arg0) {
        class182.method1267(class244.field4296, 77);
        field4195++;
        class270.field4856++;
        if (arg0 > -119) {
            method1654(72, -60, (class230) null, false, 123, 23, 73);
        }
        if (class174.field3204 && class20.field305) {
            int var1 = class285.field5068;
            int var2 = var1 - class106.field1831;
            int var3 = class49.field883;
            int var4 = class244.field4296.field800;
            int var5 = var3 - class106.field1839;
            if (var5 < class143.field2603) {
                var5 = class143.field2603;
            }
            if (class143.field2603 + class102.field1801.field722 < var5 - -class244.field4296.field722) {
                var5 = class102.field1801.field722 + class143.field2603 - class244.field4296.field722;
            }
            int var6 = var5 - class163.field3020;
            int var7 = var5 + class102.field1801.field805 - class143.field2603;
            if (var2 < class99.field1755) {
                var2 = class99.field1755;
            }
            if ((class99.field1755 + class102.field1801.field727) < (class244.field4296.field727 + var2)) {
                var2 = class99.field1755 + class102.field1801.field727 - class244.field4296.field727;
            }
            int var8 = var2 - class45.field691;
            int var9 = class102.field1801.field824 + var2 - class99.field1755;
            if (class244.field4296.field796 < class270.field4856 && (var6 > var4 || var6 < -var4 || var8 > var4 || var8 < -var4)) {
                class182.field3285 = true;
            }
            if (class244.field4296.field850 != null && class182.field3285) {
                class1 var10 = new class1();
                var10.field13 = class244.field4296;
                var10.field17 = class244.field4296.field850;
                var10.field21 = var9;
                var10.field14 = var7;
                class288.method1973(var10, -115);
            }
            if (class263.field4671 == 0) {
                if (class182.field3285) {
                    if (class244.field4296.field704 != null) {
                        class1 var11 = new class1();
                        var11.field21 = var9;
                        var11.field17 = class244.field4296.field704;
                        var11.field14 = var7;
                        var11.field13 = class244.field4296;
                        var11.field12 = class116.field1995;
                        class288.method1973(var11, 82);
                    }
                    if (class116.field1995 != null && client.method1115(class244.field4296) != null) {
                        class84.field1539++;
                        class208.field3720.method162(2, 79);
                        class208.field3720.method479(class244.field4296.field834, -127);
                        class208.field3720.method509(class116.field1995.field799, 1608904784);
                        class208.field3720.method517(class116.field1995.field834, 126);
                        class208.field3720.method509(class244.field4296.field799, 1608904784);
                    }
                } else if ((class236.field4146 == 1 || class221.method1488(class60.field1092 - 1, (byte) -53)) && class60.field1092 > 2) {
                    class36.method212(-38);
                } else if (class60.field1092 > 0) {
                    class147.method1013(117);
                }
                class244.field4296 = null;
            }
        } else if (class270.field4856 > 1) {
            class244.field4296 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lal;Z)V")
    public static final void method1656(class230 arg0, boolean arg1) {
        if (arg1) {
            method1651(-91, 70);
        }
        field4193++;
    }
}
