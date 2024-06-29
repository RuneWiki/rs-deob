import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class476 extends class125 {

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "Luia;")
    public static class272 field6775 = new class272();

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)V", line = 4)
    public static void method2849(byte arg0) {
        if (arg0 <= 10) {
            method2849((byte) -15);
        }
        field6775 = null;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(Z)I", line = 14)
    public final int method2850(boolean arg0) {
        if (arg0) {
            field6775 = null;
        }
        ++field6773;
        return super.field1732;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lgp;)V", line = 27)
    public class476(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(Z)V", line = 30)
    public final void method156(boolean arg0) {
        ++field6776;
        if (!arg0) {
            method2851((String) null, 126, -115);
        }
        if (super.field1732 != 1 && ~super.field1732 != -1) {
            super.field1732 = this.method158((byte) 55);
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)I", line = 44)
    public final int method155(boolean arg0, int arg1) {
        if (!arg0) {
            field6769 = -117;
        }
        ++field6772;
        return 1;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Ljava/lang/String;II)Loea;", line = 56)
    public static final class541 method2851(String arg0, int arg1, int arg2) {
        ++field6774;
        class541 var3;
        try {
            var3 = (class541) Class.forName("ga").newInstance();
        } catch (Throwable var5) {
            var3 = new class221();
        }
        int var4 = 13 / ((arg1 - -72) / 35);
        var3.field7849 = arg2;
        var3.field7850 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)I", line = 76)
    public final int method158(byte arg0) {
        ++field6770;
        int var2 = -26 % ((arg0 - -63) / 49);
        return 1;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(ILgp;)V", line = 86)
    public class476(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(BI)V", line = 92)
    public final void method157(byte arg0, int arg1) {
        super.field1732 = arg1;
        if (arg0 <= -32) {
            ++field6771;
        }
    }
}
