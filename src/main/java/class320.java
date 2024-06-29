import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class320 extends class27 {

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    private int field4813;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4810 = "flash1:";

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "Lth;")
    public static class57 field4814 = new class57(16);

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2226(boolean arg0) {
        if (!arg0) {
            field4810 = null;
            field4814 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V", line = 18)
    public static final void method2227(int arg0) {
        int var1 = 122 % ((63 - arg0) / 60);
        field4817++;
        class104.field1491.method462(24);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)[I", line = 36)
    public final int[] method18(int arg0, byte arg1) {
        field4812++;
        if (arg1 != -62) {
            method2228(-84, 76);
        }
        int[] var3 = this.field375.method2087(-128, arg0);
        if (this.field375.field4382) {
            class84.method690(var3, 0, class209.field3053, this.field4813);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILsb;I)V", line = 59)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            this.field4813 = 37;
        }
        field4811++;
        if (arg2 == 0) {
            this.field4813 = (arg1.method1319(255) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 85)
    public class320() {
        this(4096);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V", line = 92)
    public class320(int arg0) {
        super(0, true);
        this.field4813 = 4096;
        this.field4813 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Ljava/lang/String;", line = 101)
    public static final String method2228(int arg0, int arg1) {
        field4816++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 >= 10000000) {
            if (arg0 != 0) {
                method2228(24, 22);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class180.field2597 + "</col>";
        } else {
            return "<col=ffffff>" + arg1 / 1000 + class191.field2781 + "</col>";
        }
    }
}
