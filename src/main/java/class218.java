import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class218 extends class238 {

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    private int field3262;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!du", name = "A", descriptor = "I")
    private int field3270;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!du", name = "C", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "Z")
    public static volatile boolean field3258 = true;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "I")
    public static int field3268 = 0;

    @OriginalMember(owner = "client!du", name = "D", descriptor = "Lwf;")
    public static class79 field3273;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!du", name = "z", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!du", name = "B", descriptor = "Lb;")
    public static class201 field3271;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "[Ltr;")
    public static class176[] field3264;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IBI)Z")
    public final boolean method1393(int arg0, byte arg1, int arg2) {
        int var4 = -15 % ((16 - arg1) / 61);
        field3269++;
        return this.field3255 <= arg0 && arg0 <= this.field3259 && this.field3266 <= arg2 && arg2 <= this.field3272;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BIII)Z")
    public final boolean method1394(byte arg0, int arg1, int arg2, int arg3) {
        field3261++;
        if (arg0 <= 118) {
            return false;
        } else {
            return this.field3260 == arg3 && this.field3265 <= arg1 && arg1 <= this.field3270 && this.field3262 <= arg2 && arg2 <= this.field3263;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II[II)V")
    public final void method1395(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = this.field3255 + arg0 - this.field3265;
        arg2[2] = arg1 + this.field3266 - this.field3262;
        if (arg3 != -916) {
            this.field3265 = 85;
        }
        arg2[0] = 0;
        field3267++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public static void method1396(int arg0) {
        field3271 = null;
        field3264 = null;
        field3273 = null;
        if (arg0 != 1) {
            field3258 = false;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(III)Z")
    public final boolean method1397(int arg0, int arg1, int arg2) {
        field3256++;
        if (arg0 != 48) {
            this.field3266 = -119;
        }
        return arg2 >= this.field3265 && this.field3270 >= arg2 && arg1 >= this.field3262 && this.field3263 >= arg1;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B[III)V")
    public final void method1398(byte arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = this.field3260;
        arg1[2] = arg2 + this.field3262 - this.field3266;
        arg1[1] = this.field3265 + arg3 - this.field3255;
        if (arg0 >= 53) {
            field3257++;
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3262 = arg2;
        this.field3259 = arg7;
        this.field3266 = arg6;
        this.field3270 = arg3;
        this.field3265 = arg1;
        this.field3260 = arg0;
        this.field3255 = arg5;
        this.field3263 = arg4;
        this.field3272 = arg8;
    }

    static {
        new class326((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field3273 = new class79(48, 11);
    }
}
