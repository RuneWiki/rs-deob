import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class172 extends class744 {

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field2324 = -1;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "F")
    public static float field2327;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "[B")
    private byte[] field2321;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIZII)V", line = 3)
    public static final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2320++;
        if (arg5) {
            method1072(38, -88, 76, 105, -77, true, 106, 104);
        }
        if (arg2 == arg3) {
            class327.method1912(arg0, arg2, arg7, arg1, 1, arg6, arg4);
        } else if ((arg1 - arg2) >= class490.field6592 && class116.field1628 >= arg1 + arg2 && arg7 - arg3 >= class675.field9512 && class395.field5484 >= (arg3 + arg7)) {
            class741.method4128(arg6, arg7, arg3, 2, arg4, arg0, arg2, arg1);
        } else {
            class457.method2744(arg2, arg0, arg6, arg1, arg3, arg4, !arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILpaa;IB)V", line = 28)
    public static final void method1073(int arg0, class712 arg1, int arg2, byte arg3) {
        class209.field2970 = arg0;
        if (arg3 != 46) {
            field2325 = 109;
        }
        class133.field1798 = arg1;
        class393.field5475 = arg2;
        field2323++;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 41)
    public class172() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)V", line = 50)
    public final void method1074(int arg0, int arg1, byte arg2) {
        field2318++;
        int var4 = arg0 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2321[var10001] = -1;
        int var5 = arg2 & 0xFF;
        this.field2321[var6] = (byte) (var5 * 3 >> 5);
        if (arg1 != 4096) {
            field2324 = -15;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BZIIILwu;Lqc;)V", line = 71)
    public static final void method1075(byte arg0, boolean arg1, int arg2, int arg3, int arg4, class557 arg5, class379 arg6) {
        class82.method489(arg3, arg5, arg1, arg2, (byte) -31, arg4);
        field2319++;
        class539.field7539 = arg6;
        int var7 = 33 % ((arg0 - 49) / 48);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IIII)[B", line = 82)
    public final byte[] method1076(int arg0, int arg1, int arg2, int arg3) {
        this.field2321 = new byte[arg1 * arg2 * 2 * arg0];
        if (arg3 < 102) {
            method1072(102, -79, 48, -56, 10, true, -52, 2);
        }
        field2322++;
        this.method1217(-85, arg1, arg2, arg0);
        return this.field2321;
    }
}
