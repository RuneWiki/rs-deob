import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class567 extends class408 {

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/lang/String;")
    public String field8054;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lre;")
    public class603 field8055;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field8049 = 0;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Z")
    public static boolean field8048 = false;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field8058 = 0;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public int field8052;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "Lvf;")
    public static class152 field8057;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lcs;I)Z")
    public final boolean method3299(class342 arg0, int arg1) {
        if (arg1 != 14551) {
            field8048 = false;
        }
        field8056++;
        arg0.method2597(-82);
        boolean var3 = true;
        class342 var4 = (class342) this.field8055.method3508(-2);
        while (var4 != null) {
            if (class676.method3884(arg0.field4972, var4.field4972, (byte) -111)) {
                class474.method2861(var4, arg0, (byte) 97);
                this.field8052++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class342) this.field8055.method3507(-68);
            var3 = false;
        }
        this.field8055.method3505(arg0, 4);
        this.field8052++;
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)I")
    public final int method3300(byte arg0) {
        field8050++;
        if (this.field8055.field8521.field6156 == this.field8055.field8521) {
            if (arg0 <= 7) {
                this.field8054 = null;
            }
            return -1;
        } else {
            return ((class342) this.field8055.field8521.field6156).field4972;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method3301(int arg0) {
        field8057 = null;
        if (arg0 != -1) {
            field8057 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILcs;)Z")
    public final boolean method3302(int arg0, class342 arg1) {
        if (arg0 != -1) {
            return true;
        }
        field8051++;
        int var3 = this.method3300((byte) 19);
        arg1.method2597(-109);
        this.field8052--;
        if (this.field8052 != 0) {
            return var3 != this.method3300((byte) 102);
        }
        this.method1304((byte) 7);
        this.method2597(-117);
        class565.field8032--;
        class606.field8553.method801(arg0 ^ 0xFFFFFFFE, this, arg1.field4959);
        return false;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class567(String arg0) {
        this.field8054 = arg0;
        this.field8055 = new class603();
    }
}
