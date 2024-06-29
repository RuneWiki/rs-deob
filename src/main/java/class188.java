import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class188 extends class94 {

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    private final int field3301;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    private final int field3303;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    private final int field3306;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    private final int field3300;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    private final int field3298;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    private final int field3304;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    private final int field3310;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    private final int field3311;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lsb;")
    public static class221 field3297 = new class221(32);

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3307 = 255;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Lp;")
    public static class280 field3308 = class18.method140((byte) -125, "Angreifen");

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Lp;")
    public static class280 field3309 = null;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "Lp;")
    public static class280 field3305 = class18.method140((byte) -121, "www");

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3301 = arg3;
        this.field3303 = arg0;
        this.field3306 = arg7;
        this.field3300 = arg4;
        this.field3298 = arg2;
        this.field3304 = arg1;
        this.field3310 = arg6;
        this.field3311 = arg5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILp;Lp;)V")
    public static final void method1312(int arg0, int arg1, class280 arg2, class280 arg3) {
        ++field3312;
        if (arg0 == -1117075764) {
            class92.method655(-1, arg3, (class280) null, (byte) 99, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIB)V")
    public final void method597(int arg0, int arg1, byte arg2) {
        ++field3313;
        int var4 = -120 / ((arg2 - -53) / 60);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)V")
    public final void method601(int arg0, byte arg1, int arg2) {
        ++field3299;
        int var4 = this.field3303 * arg2 >> 12;
        int var5 = this.field3298 * arg2 >> 12;
        int var6 = this.field3301 * arg0 >> 12;
        int var7 = this.field3300 * arg2 >> 12;
        int var8 = this.field3304 * arg0 >> 12;
        if (arg1 != 77) {
            method1312(35, -78, (class280) null, (class280) null);
        }
        int var9 = this.field3310 * arg2 >> 12;
        int var10 = this.field3306 * arg0 >> 12;
        int var11 = this.field3311 * arg0 >> 12;
        class238.method1593(var7, var10, 115, var11, var8, var6, super.field1520, var5, var4, var9);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V")
    public final void method602(byte arg0, int arg1, int arg2) {
        int var4 = -68 / ((arg0 - 12) / 45);
        ++field3302;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1313(int arg0) {
        field3308 = null;
        field3305 = null;
        field3309 = null;
        field3297 = null;
        if (arg0 != -18195) {
            method1312(124, 93, (class280) null, (class280) null);
        }
    }
}
