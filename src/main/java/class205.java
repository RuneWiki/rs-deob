import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class205 {

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3530 = 0;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3528 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static final void method1421(int arg0) {
        if (!class170.field2981) {
            class79.field1346[0] = 1002;
            class208.field3586[0] = class135.field2428;
            class73.field1254 = 1;
            if (class71.field1223 != 0) {
                class146.field2601 = class17.field253;
                class122.field2267 = class140.field2504;
            } else if (class272.field4734 == 0) {
                class122.field2267 = class214.field3684;
                class146.field2601 = class17.field244;
            } else {
                class146.field2601 = class167.field2950;
                class122.field2267 = class272.field4722;
            }
            class192.field3316[0] = class120.field2227;
        }
        if (class107.field1825 != -1) {
            class189.method1331(class107.field1825, 2643);
        }
        for (int var1 = 0; var1 < class47.field822; var1++) {
            if (class176.field3059[var1]) {
                class19.field317[var1] = true;
            }
            class201.field3483[var1] = class176.field3059[var1];
            class176.field3059[var1] = false;
        }
        field3529++;
        class215.field3695 = class236.field4053;
        class193.field3329 = null;
        class251.field4349 = -1;
        class265.field4632 = -1;
        if (class107.field1825 != -1) {
            class47.field822 = 0;
            class156.method1134(class232.field3979, 0, class107.field1825, -1, (byte) -17, class168.field2954, 0, 0, 0);
        }
        class84.method609();
        class236.method1597(128);
        if (class170.field2981) {
            class196.method1368(false);
        } else if (class251.field4349 != -1) {
            class78.method557(class265.field4632, class251.field4349, false);
        }
        if (class211.field3639 == 3) {
            for (int var2 = 0; var2 < class47.field822; var2++) {
                if (class201.field3483[var2]) {
                    class84.method592(class270.field4698[var2], class266.field4643[var2], class271.field4717[var2], class61.field1046[var2], 16711935, 128);
                } else if (class19.field317[var2]) {
                    class84.method592(class270.field4698[var2], class266.field4643[var2], class271.field4717[var2], class61.field1046[var2], 16711680, 128);
                }
            }
        }
        class207.method1434(class236.field4047.field4533, class236.field4047.field4511, class62.field1063, class216.field3712, 64);
        class62.field1063 = arg0;
    }
}
