import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class603 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "J")
    public long field8478;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Ljava/lang/String;")
    public String field8471;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field8473;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Ljava/lang/String;")
    public String field8479;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field8480;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public static boolean field8476 = false;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field8477;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lha;I)V", line = 3)
    public static final void method3386(class58 arg0, int arg1) {
        if (class436.field6192) {
            class728.method4089(arg0, arg1 ^ 0xFF00FE);
        } else {
            class509.method3006((byte) -110, arg0);
        }
        field8472++;
        if (arg1 != -16711936) {
            method3387((byte) -123);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 19)
    public static void method3387(byte arg0) {
        field8477 = null;
        if (arg0 <= 118) {
            method3386(null, 11);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfp;Lfp;Lfp;Lfp;I)V", line = 29)
    public static final void method3388(class323 arg0, class323 arg1, class323 arg2, class323 arg3, int arg4) {
        if (arg4 != -1) {
            field8477 = null;
        }
        class108.field1307 = arg0;
        field8475++;
        class171.field2340 = arg2;
        class48.field569 = arg3;
        class37.field475 = new class493[class48.field569.method2098((byte) 20)][];
        class46.field544 = new boolean[class48.field569.method2098((byte) 20)];
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I", line = 55)
    public static final int method3389(int arg0, byte arg1) {
        field8474++;
        int var2 = 78 / ((-arg1 - 22) / 63);
        return arg0 == 16711935 ? -1 : class657.method3613(false, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 73)
    public class603(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field8478 = arg4;
        this.field8471 = arg1;
        this.field8473 = arg2;
        this.field8479 = arg3;
        this.field8480 = arg0;
    }
}
