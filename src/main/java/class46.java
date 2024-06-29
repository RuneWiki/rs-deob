import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 implements class505 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lbv;")
    public static class567 field639 = new class567("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lpp;")
    public static class464 field642 = new class464(29, -1);

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lpp;")
    public static class464 field643 = new class464(5, 7);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([ILio;IJ)Ljava/lang/String;", line = 6)
    public final String method410(int[] arg0, class151 arg1, int arg2, long arg3) {
        if (arg2 != -1) {
            return null;
        }
        field640++;
        if (class310.field4548 == arg1) {
            class44 var6 = class386.field5742.method1019(arg0[0], true);
            return var6.method385((byte) 123, (int) arg3);
        } else if (class400.field5974 == arg1 || class306.field4407 == arg1) {
            class381 var7 = class611.field8684.method1621((byte) 67, (int) arg3);
            return var7.field5658;
        } else if (class194.field2785 == arg1 || class495.field6943 == arg1 || class66.field1083 == arg1) {
            return class386.field5742.method1019(arg0[0], true).method385((byte) 54, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(CZ)Z", line = 41)
    public static final boolean method411(char arg0, boolean arg1) {
        field644++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class609.field8662;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return !arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 82)
    public static void method412(int arg0) {
        if (arg0 == 0) {
            field639 = null;
            field643 = null;
            field642 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLco;)Lot;", line = 95)
    public static final class209 method413(byte arg0, class268 arg1) {
        if (arg0 > -67) {
            field643 = null;
        }
        field641++;
        return new class209(arg1.method1730(13436), arg1.method1730(13436), arg1.method1730(13436), arg1.method1730(13436), arg1.method1700((byte) 44), arg1.method1700((byte) 44), arg1.method1738(255));
    }
}
