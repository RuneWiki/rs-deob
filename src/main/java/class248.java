import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class248 extends class115 {

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field4310 = 5063219;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field4311 = 127;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Lub;")
    public static class227 field4314 = class257.method1749(":", 17263);

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Lub;")
    private static class227 field4315 = class257.method1749("skill)2", 17263);

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Lub;")
    public static class227 field4316 = field4315;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "Lub;")
    public static class227 field4313 = class257.method1749("Mitglieder)2Welt", 17263);

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI[Lta;)V")
    public static final void method1663(byte arg0, int arg1, class105[] arg2) {
        int var3 = 106 / ((16 - arg0) / 35);
        for (int var4 = 0; var4 < arg2.length; var4++) {
            class105 var5 = arg2[var4];
            if (var5 != null) {
                if (var5.field1829 == 0) {
                    if (var5.field1956 != null) {
                        method1663((byte) -57, arg1, var5.field1956);
                    }
                    class182 var6 = (class182) class58.field1070.method1298(-102, (long) var5.field1861);
                    if (var6 != null) {
                        class7.method27(arg1, var6.field3106, false);
                    }
                }
                if (arg1 == 0 && var5.field1882 != null) {
                    class34 var7 = new class34();
                    var7.field568 = var5.field1882;
                    var7.field583 = var5;
                    class218.method1377(var7, false);
                }
                if (arg1 == 1 && var5.field1930 != null) {
                    if (var5.field1884 >= 0) {
                        class105 var8 = class27.method137(var5.field1861, -954490064);
                        if (var8 == null || var8.field1956 == null || var8.field1956.length <= var5.field1884 || var8.field1956[var5.field1884] != var5) {
                            continue;
                        }
                    }
                    class34 var9 = new class34();
                    var9.field568 = var5.field1930;
                    var9.field583 = var5;
                    class218.method1377(var9, false);
                }
            }
        }
        field4312++;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)Z")
    public abstract boolean method668(boolean arg0);

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method667(byte arg0);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
    public static void method1664(byte arg0) {
        int var1 = -6 / ((arg0 - 40) / 48);
        field4313 = null;
        field4314 = null;
        field4316 = null;
        field4315 = null;
    }
}
