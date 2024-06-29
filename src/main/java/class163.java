import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class163 extends class80 {

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljm;")
    public static class485 field2323 = new class485(56, -1);

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2331 = 205;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Ljava/lang/String;")
    public String field2326;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method1010(int arg0) {
        ++field2322;
        super.field1140 = 500L + class333.method1850(-3562) | Long.MIN_VALUE & super.field1140;
        class341.field4702.method1335(-571093627, this);
        if (arg0 != 1504) {
            this.method1014(96);
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
    public final int method1011(int arg0) {
        if (arg0 != 31047) {
            return 36;
        } else {
            ++field2330;
            return (int) super.field7342;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1012(int arg0, int arg1, byte arg2) {
        if (arg2 != -93) {
            field2323 = null;
        }
        ++field2329;
        return ~(arg0 & 458752) != -1 | class249.method1470((byte) 109, arg0, arg1) || class87.method607((byte) 68, arg0, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)I")
    public final int method1013(byte arg0) {
        if (arg0 != -111) {
            this.field2324 = 83;
        }
        ++field2325;
        return (int) (255L & super.field7342 >>> 32);
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)J")
    public final long method1014(int arg0) {
        if (arg0 != 458752) {
            this.field2332 = -121;
        }
        ++field2321;
        return super.field1140 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lvh;ILvh;Lvh;Lvh;)V")
    public static final void method1015(class240 arg0, int arg1, class240 arg2, class240 arg3, class240 arg4) {
        class36.field506 = arg4;
        class222.field3089 = arg3;
        ++field2333;
        class97.field1340 = arg0;
        if (arg1 == -23978) {
            class420.field6129 = arg2;
            class522.field7701 = new class295[class36.field506.method1410(arg1 ^ -23978)][];
            class359.field4910 = new boolean[class36.field506.method1410(arg1 ^ -23978)];
        }
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)V")
    public static void method1016(int arg0) {
        if (arg0 > -18) {
            field2331 = 71;
        }
        field2323 = null;
    }

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)V")
    public final void method1017(int arg0) {
        ++field2320;
        super.field1140 |= Long.MIN_VALUE;
        if (arg0 != 0) {
            this.method1013((byte) 93);
        }
        if (~this.method1014(458752) == -1L) {
            class142.field2032.method1335(arg0 + -571093627, this);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
    public class163(int arg0, int arg1) {
        super.field7342 = (long) arg0 << 32 | (long) arg1;
    }

    static {
        new class83("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
