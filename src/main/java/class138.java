import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class138 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field1996 = -1;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field1999 = 0;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "Lta;")
    public class245 field2004;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "[I")
    public int[] field2002;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLpk;)V")
    public static final void method935(boolean arg0, class237 arg1) {
        field2001++;
        class124.field1839 = class47.method373(arg0, 0, class45.field780, arg1);
        class151.field2216 = class245.method1669(23971, 0, arg1, class122.field1812);
        class146.field2115 = class245.method1669(23971, 0, arg1, class155.field2261);
        class15.field224 = class245.method1669(23971, 0, arg1, class42.field739);
        class89.field1347 = class245.method1669(23971, 0, arg1, class215.field3305);
        class135.field1974 = class245.method1669(23971, 0, arg1, class51.field833);
        class101.field1481 = class245.method1669(23971, 0, arg1, class3.field46);
        class62.field1037 = class155.method1047(arg1, class245.field3798, 0, 19161);
        class55.field916 = class217.method1457(class105.field1549, arg1, 0, (byte) -104);
        class201.field3013 = class217.method1457(class206.field3092, arg1, 0, (byte) -91);
        class148.field2147 = class260.method1758(0, arg1, !arg0, class55.field929);
        class71.field1166 = class260.method1758(0, arg1, true, class224.field3511);
        class246.field3835.method1300(class71.field1166, (int[]) null);
        class269.field4186.method1300(class71.field1166, (int[]) null);
        class105.field1555.method1300(class71.field1166, (int[]) null);
        if (arg0) {
            method936((byte) 87);
        }
        class289 var2 = class150.method1021(arg1, class260.field3984, 27030, 0);
        var2.method1914();
        class92.field1389 = var2;
        class289[] var3 = class47.method373(arg0, 0, class134.field1964, arg1);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1914();
        }
        class3.field41 = var3;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class124.field1839.length; var9++) {
            class124.field1839[var9].method1906(var6 + var7, var5 + var7, var7 + var8);
        }
        class22.field363 = class124.field1839;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static final void method936(byte arg0) {
        class24.field387.method940(73);
        field2003++;
        if (arg0 != -126) {
            method936((byte) 46);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)V")
    public static final void method937(int arg0, byte arg1) {
        field1998++;
        if (arg1 != -24) {
            method937(38, (byte) 56);
        }
        class105 var2 = class9.method72(2, arg1 ^ 0x17, arg0);
        var2.method764((byte) -116);
    }
}
