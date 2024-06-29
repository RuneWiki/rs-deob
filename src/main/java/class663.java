import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class663 extends class362 implements class366 {

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "C")
    public char field9066;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "I")
    public int field9071;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
    public int field9072;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "J")
    public long field9069;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "Lin;")
    public static class91 field9075;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
    public final int method2328(int arg0) {
        if (arg0 != 26276) {
            this.method2328(113);
        }
        field9074++;
        return this.field9076;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)C")
    public final char method2329(byte arg0) {
        field9073++;
        if (arg0 < 8) {
            this.method2328(113);
        }
        return this.field9066;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
    public final int method2327(int arg0) {
        field9067++;
        if (arg0 != -7616) {
            this.method2330((byte) 38);
        }
        return this.field9071;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)J")
    public final long method2330(byte arg0) {
        int var2 = 17 / ((arg0 - 46) / 58);
        field9070++;
        return this.field9069;
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(B)V")
    public static void method3723(byte arg0) {
        field9075 = null;
        if (arg0 != 104) {
            method3723((byte) -6);
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3724(String arg0, byte arg1) {
        field9068++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class443.field6289; var2++) {
            if (arg0.equalsIgnoreCase(class648.field8912[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class58.field1147.field8189)) {
            return true;
        } else if (arg1 == -63) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)I")
    public final int method2331(boolean arg0) {
        field9065++;
        return arg0 ? -114 : this.field9072;
    }
}
