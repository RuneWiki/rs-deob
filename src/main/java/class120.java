import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class120 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1664 = -1;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lrm;")
    public static class184 field1670 = new class184(4);

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1672 = 0;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lca;")
    public static class131 field1671;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lci;")
    public class201 field1669;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lgh;")
    public class248 field1665;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 4)
    public static void method859(byte arg0) {
        field1671 = null;
        field1670 = null;
        if (arg0 != -60) {
            method859((byte) 68);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)J", line = 17)
    public static final long method860(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        return var3 == null || var3.field1779 == null ? 0L : var3.field1779.field4373;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILvl;)Llc;", line = 35)
    public static final class294 method861(int arg0, int arg1, class6 arg2) {
        class294 var3 = new class294(arg1, arg2.method40(false), arg2.method40(false), arg2.method73((byte) 19), arg2.method73((byte) 19), arg2.method58(-288140008) == 1, arg2.method58(-288140008));
        field1667++;
        int var4 = arg2.method58(-288140008);
        int var5 = 0;
        if (arg0 >= -105) {
            field1672 = 77;
        }
        while (var4 > var5) {
            var3.field4545.method19(new class213(arg2.method58(-288140008), arg2.method58(-288140008), arg2.method39((byte) 100), arg2.method39((byte) 108), arg2.method39((byte) 121), arg2.method39((byte) 56), arg2.method39((byte) 123), arg2.method39((byte) 97), arg2.method39((byte) 56), arg2.method39((byte) 94)), -1058);
            var5++;
        }
        var3.method2044((byte) -101);
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILug;I)Lbh;", line = 64)
    public static final class18 method862(int arg0, class253 arg1, int arg2) {
        if (arg0 > -105) {
            method862(-14, (class253) null, 44);
        }
        field1668++;
        return class192.method1415(arg1, arg2, 17082) ? class292.method2040((byte) -117) : null;
    }
}
