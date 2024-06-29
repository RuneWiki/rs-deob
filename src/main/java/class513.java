import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class513 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    private int field7222;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public int field7227;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lis;")
    public class427 field7221;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ldaa;Z)V")
    public final void method2970(class11 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 104);
            if (var3 == 0) {
                field7220++;
                if (arg1) {
                    this.field7223 = -109;
                    return;
                }
                return;
            }
            this.method2972(var3, !arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lbt;")
    public final synchronized class38 method2971(int arg0) {
        field7217++;
        class38 var2 = (class38) this.field7221.field6068.method3252((long) this.field7222, (byte) -119);
        if (var2 != null) {
            return var2;
        }
        class38 var3 = class38.method399(this.field7221.field6059, this.field7222, 0);
        if (var3 != null) {
            this.field7221.field6068.method3243(var3, (long) this.field7222, 60);
        }
        return arg0 > -58 ? null : var3;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLdaa;)V")
    private final void method2972(int arg0, boolean arg1, class11 arg2) {
        if (arg0 == 1) {
            this.field7222 = arg2.method93((byte) 104);
        } else if (arg0 == 2) {
            this.field7227 = arg2.method110((byte) 42);
            this.field7223 = arg2.method110((byte) 39);
        }
        if (!arg1) {
            this.method2970(null, true);
        }
        field7224++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2973(int arg0, byte arg1, int arg2) {
        field7226++;
        if (arg1 >= -80) {
            field7228 = 126;
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2974(int arg0, String arg1) {
        field7218++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != -1) {
            return -32;
        }
        while (class367.field4989 > var2) {
            if (arg1.equalsIgnoreCase(class474.field6677[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    static {
        new class104(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
    }
}
