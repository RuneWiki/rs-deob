import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class123 {

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1794 = "Loaded title screen";

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1788 = "red:";

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
    public static boolean field1795 = true;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZLph;Lph;)V", line = 6)
    public static final void method922(boolean arg0, boolean arg1, class361 arg2, class361 arg3) {
        if (!arg0) {
            field1794 = (String) null;
        }
        field1791++;
        class130.field1883 = arg1;
        class356.field5462 = arg3;
        class72.field1061 = arg2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 21)
    public static void method923(int arg0) {
        field1794 = null;
        field1788 = null;
        if (arg0 != 0) {
            field1788 = (String) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 38)
    public static final void method924(byte arg0) {
        class31.method225(34);
        field1792++;
        client.method360(arg0 + 1547);
        class152.method1097((byte) 112);
        class173.method1215((byte) -21);
        class132.method954((byte) -91);
        class335.method2367((byte) 61);
        class353.method2462((byte) 11);
        class8.method49(false);
        class166.method1185(arg0 ^ 0xFFFFFFCB);
        class78.method638(arg0 ^ 0xFFFFFFCF);
        class93.method730(107);
        class307.method2157(126);
        class152.method1098((byte) 37);
        class288.method2081(82);
        class343.method2395(-2);
        class323.method2243(arg0 - 19959);
        class49.method417((byte) 64);
        if (arg0 != -53) {
            field1794 = (String) null;
        }
        client.method342((byte) -112);
        class103.method794(arg0 ^ 0xFFFFFFCB);
        class277.method2025(-25);
        class273.method2005(114);
        class259.field3868.method458((byte) -79);
        class360.field5679.method458((byte) 95);
        class67.field972.method458((byte) 85);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)[Lwi;", line = 73)
    public static final class234[] method925(byte arg0) {
        class234[] var1 = new class234[class220.field3285];
        field1790++;
        if (arg0 >= -17) {
            method925((byte) 124);
        }
        for (int var2 = 0; var2 < class220.field3285; var2++) {
            var1[var2] = new class234(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], class225.field3385[var2], class206.field3015);
        }
        class321.method2235(-2182);
        return var1;
    }
}
