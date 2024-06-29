import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class309 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 9)
    public static final void method2139(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field5246++;
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILme;I)[Loj;", line = 19)
    public static final class260[] method2140(byte arg0, int arg1, class295 arg2, int arg3) {
        if (arg0 < 53) {
            return (class260[]) null;
        } else {
            field5247++;
            return class33.method222(6, arg1, arg3, arg2) ? class101.method766((byte) 32) : null;
        }
    }
}
