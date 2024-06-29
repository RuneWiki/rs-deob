import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class340 extends class4 {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    private int field5514;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field5512;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field5513;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    private int field5507;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field5510 = 100;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public static int[] field5506 = new int[2];

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    public static int[] field5515 = new int[256];

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field5508;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V")
    public final void method21(int arg0, int arg1, int arg2) {
        ++field5517;
        int var4 = this.field5507 * arg0 >> 12;
        int var5 = this.field5513 * arg0 >> 12;
        int var6 = this.field5514 * arg2 >> 12;
        int var7 = this.field5512 * arg2 >> 12;
        if (arg1 != 8746) {
            field5510 = -19;
        }
        class597.method3484(var6, super.field28, -1004229456, var7, var4, var5);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method2327(int arg0) {
        field5506 = null;
        field5515 = null;
        field5508 = null;
        if (arg0 > -118) {
            field5510 = -79;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIII)V")
    public class340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5514 = arg1;
        this.field5512 = arg3;
        this.field5513 = arg2;
        this.field5507 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JJ)J")
    public static long method2328(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public static final void method2329(int arg0, int arg1) {
        class206.field3451 = arg0;
        ++field5509;
        class234.field3710.method569(arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)V")
    public final void method22(int arg0, int arg1, byte arg2) {
        ++field5511;
        if (arg2 >= -124) {
            this.method22(-38, -23, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)V")
    public final void method19(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            ++field5516;
        }
    }
}
