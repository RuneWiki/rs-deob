import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class529 {

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lhn;")
    public static class509 field7732;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public int field7729;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public int field7731;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field7736;

    static {
        new class234("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field7732 = new class509(24, 8);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 9)
    public static final String method3130(String arg0, String arg1, String arg2, int arg3) {
        field7736++;
        int var4 = -38 % ((-arg3 - 48) / 46);
        for (int var5 = arg0.indexOf(arg1); var5 != -1; var5 = arg0.indexOf(arg1, var5 + arg2.length())) {
            arg0 = arg0.substring(0, var5) + arg2 + arg0.substring(var5 + arg1.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 30)
    public static void method3131(int arg0) {
        if (arg0 != -1) {
            field7735 = -85;
        }
        field7732 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;I)I", line = 41)
    public static final int method3132(byte arg0, String arg1, int arg2) {
        field7728++;
        if (arg0 <= 39) {
            field7735 = -102;
        }
        return class429.method2671(90, arg2, true, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZII)Z", line = 53)
    public static final boolean method3133(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        } else {
            field7730++;
            return (arg1 & 0x40000) != 0 | class216.method1500(29, arg1, arg2) || class262.method1748(arg1, (byte) 106, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Object;IIZ)[B", line = 67)
    public static final byte[] method3134(Object arg0, int arg1, int arg2, boolean arg3) {
        field7734++;
        if (arg0 == null) {
            return null;
        }
        if (arg3) {
            method3133(false, -56, 114);
        }
        if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class519.method3089(46, arg2, arg1, var4);
        } else if (arg0 instanceof class200) {
            class200 var5 = (class200) arg0;
            return var5.method1399(arg2, arg1, -26915);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILhp;)V", line = 99)
    private final void method3135(int arg0, int arg1, class217 arg2) {
        if (~arg0 == arg1) {
            this.field7729 = arg2.method1511(-35);
            this.field7731 = arg2.method1515((byte) 125);
            this.field7727 = arg2.method1515((byte) 124);
        }
        field7725++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILhp;)V", line = 123)
    public final void method3136(int arg0, class217 arg1) {
        field7726++;
        while (true) {
            int var3 = arg1.method1515((byte) 127);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    field7733 = 87;
                    return;
                }
            }
            this.method3135(var3, -2, arg1);
        }
    }
}
