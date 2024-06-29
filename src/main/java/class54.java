import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class54 extends class447 {

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lwl;")
    public static class452 field727 = new class452(0, -1);

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Ljava/lang/String;")
    public static String field730 = null;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field729 = -1;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field731 = -1;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field728;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Ljava/lang/String;")
    public String field725;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lnr;ILnr;)V")
    public static final void method311(class97 arg0, int arg1, class97 arg2) {
        field720++;
        if (arg2.field1336 != null) {
            arg2.method625((byte) -50);
        }
        if (arg1 != -1) {
            method314(-120, 94);
        }
        arg2.field1331 = arg0;
        arg2.field1336 = arg0.field1336;
        arg2.field1336.field1331 = arg2;
        arg2.field1331.field1336 = arg2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public static final void method312(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        if (var3 != null && var3.field166 != null) {
            var3.field166 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static void method313(int arg0) {
        int var1 = 62 / ((arg0 + 67) / 57);
        field730 = null;
        field727 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
    public static final void method314(int arg0, int arg1) {
        class295.field4480 = arg0;
        if (arg1 > -74) {
            method314(62, -76);
        }
        field723++;
        class318.field4811 = -1;
        class191.field2843 = -1;
        class353.method2116(false);
    }
}
