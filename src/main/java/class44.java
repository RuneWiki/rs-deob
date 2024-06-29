import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class44 extends class158 {

    @OriginalMember(owner = "client!pj", name = "nb", descriptor = "Ljava/lang/Object;")
    private Object field742;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "Lsb;")
    public static class98 field739 = class47.method368("::clientdrop", 0);

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "I")
    public static int field741 = 0;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "Lhh;")
    public static class38 field734;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(B)Z")
    public final boolean method349(byte arg0) {
        field738++;
        if (arg0 != -122) {
            this.field742 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILq;)Lsb;")
    public static final class98 method350(int arg0, int arg1, class148 arg2) {
        field733++;
        if (!class227.method1566((byte) -120, arg1, client.method761(arg2)) && arg2.field2626 == null) {
            return null;
        }
        if (arg0 >= -77) {
            field732 = 29;
        }
        if (arg2.field2727 == null || arg1 >= arg2.field2727.length || arg2.field2727[arg1] == null || arg2.field2727[arg1].method723(255).method724((byte) 25) == 0) {
            return class186.field3207 ? class186.method1288(new class98[] { class205.field3498, class125.method930(25904, arg1) }, 31618) : null;
        } else {
            return arg2.field2727[arg1];
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method351(boolean arg0) {
        field737++;
        if (arg0) {
            method350(-113, 15, (class148) null);
        }
        return this.field742;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)Z")
    public static final boolean method352(int arg0, int arg1) {
        if (arg1 != 0) {
            method353((byte) -18);
        }
        field736++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "(B)V")
    public static void method353(byte arg0) {
        field739 = null;
        if (arg0 < 53) {
            field735 = -50;
        }
        field734 = null;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class44(Object arg0) {
        this.field742 = arg0;
    }
}
