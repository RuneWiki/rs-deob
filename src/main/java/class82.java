import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class82 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field952 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Ljs;")
    public static class180 field951;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method458(int arg0, String arg1, int arg2) {
        field950++;
        class20 var3 = class369.method2351((byte) 111, 3, arg2);
        var3.method146(115);
        if (arg0 != 4) {
            method460((byte) -98, -20);
        }
        var3.field263 = arg1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method459(byte arg0) {
        if (arg0 != -10) {
            field952 = 19;
        }
        field951 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
    public static final void method460(byte arg0, int arg1) {
        field948++;
        if (class68.field789 == arg1) {
            return;
        }
        class176.field2403 = class383.field5395 = class21.field271[arg1];
        class151.field1873.method633(50, (int) ((double) class176.field2403 * 34.46D));
        class123.field1507 = new int[class176.field2403][class383.field5395];
        class193.field2775 = new int[class176.field2403][class383.field5395];
        class330.field4670 = new int[4][class176.field2403 >> 3][class383.field5395 >> 3];
        if (arg0 != -83) {
            method458(-97, (String) null, 19);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class102.field1247[var2] = class14.method102(-116, class176.field2403, class383.field5395);
        }
        class325.field4622 = new byte[4][class176.field2403][class383.field5395];
        class182.method1225(class383.field5395, class176.field2403, true, 4);
        class40.method239(class176.field2403 >> 3, class383.field5395 >> 3, -73, class151.field1873);
        class68.field789 = arg1;
    }
}
