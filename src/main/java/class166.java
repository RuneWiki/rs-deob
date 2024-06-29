import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class166 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Ldl;")
    public static class31 field3053 = null;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lsg;")
    public static class30 field3052 = class167.method1221((byte) 33, "Null");

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[Lsg;")
    public static class30[] field3054;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[[[B")
    public static byte[][][] field3050;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method1218(byte arg0) {
        field3052 = null;
        field3053 = null;
        field3054 = null;
        field3050 = null;
        if (arg0 > -124) {
            method1220(-51);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
    public static final void method1219(int arg0, boolean arg1) {
        class91 var2 = (class91) class167.field3084.method478(0);
        if (arg0 != 100000) {
            return;
        }
        while (var2 != null) {
            if (var2.field1829 != null) {
                class127.field2469.method186(var2.field1829);
                var2.field1829 = null;
            }
            if (var2.field1848 != null) {
                class127.field2469.method186(var2.field1848);
                var2.field1848 = null;
            }
            var2.method1681(false);
            var2 = (class91) class167.field3084.method476((byte) 13);
        }
        if (arg1) {
            for (class91 var3 = (class91) class239.field4254.method478(0); var3 != null; var3 = (class91) class239.field4254.method476((byte) 13)) {
                if (var3.field1829 != null) {
                    class127.field2469.method186(var3.field1829);
                    var3.field1829 = null;
                }
                var3.method1681(false);
            }
            for (class91 var4 = (class91) class68.field1482.method1178(true); var4 != null; var4 = (class91) class68.field1482.method1176((byte) 22)) {
                if (var4.field1829 != null) {
                    class127.field2469.method186(var4.field1829);
                    var4.field1829 = null;
                }
                var4.method1681(false);
            }
        }
        field3055++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method1220(int arg0) {
        if (arg0 != -8193) {
            field3050 = null;
        }
        class101.field2060.method1650(59);
        field3057++;
    }
}
