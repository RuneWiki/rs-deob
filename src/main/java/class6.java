import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lea;")
    public static class38 field160 = class9.method46((byte) 117, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lea;")
    public static class38 field157 = class9.method46((byte) 125, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field161 = 0;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lea;")
    public static class38 field159 = class9.method46((byte) 101, "(Y<)4col>");

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Lea;")
    private static class38 field158 = class9.method46((byte) 123, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lea;")
    public static class38 field162 = field158;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lnb;")
    public static class118 field156;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILea;I)V")
    public static final void method29(int arg0, class38 arg1, int arg2) {
        field153++;
        if (arg2 > -26) {
            field159 = null;
        }
        boolean var3 = false;
        class38 var4 = arg1.method271(-1).method268(70);
        for (int var5 = 0; var5 < class50.field1247; var5++) {
            class144 var6 = class175.field3550[class65.field1556[var5]];
            if (var6 != null && var6.field3022 != null && var6.field3022.method263(var4, (byte) 108)) {
                class14.method81(class195.field3842.field409[0], 0, var6.field391[0], class195.field3842.field391[0], false, 2, 0, 1, 0, var6.field409[0], 0, 1);
                var3 = true;
                if (arg0 == 1) {
                    class22.field479++;
                    class111.field2483.method169(-1494101117, 96);
                    class111.field2483.method488(true, class65.field1556[var5]);
                } else if (arg0 == 4) {
                    class94.field2114++;
                    class111.field2483.method169(-1494101117, 247);
                    class111.field2483.method476(19058, class65.field1556[var5]);
                } else if (arg0 == 6) {
                    class111.field2483.method169(-1494101117, 244);
                    class150.field3095++;
                    class111.field2483.method476(19058, class65.field1556[var5]);
                } else if (arg0 == 7) {
                    class111.field2483.method169(-1494101117, 211);
                    class111.field2483.method488(true, class65.field1556[var5]);
                    class35.field725++;
                }
                break;
            }
        }
        if (!var3) {
            class102.method839(class70.field1731, 0, class163.method1168(-71, new class38[] { class9.field202, var4 }), (byte) 87);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method30(int arg0) {
        field159 = null;
        field160 = null;
        field162 = null;
        field158 = null;
        field156 = null;
        field157 = null;
        if (arg0 != 0) {
            method30(81);
        }
    }
}
