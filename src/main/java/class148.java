import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class148 extends class36 {

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    private int field2427;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    private int field2424;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Z")
    public static boolean field2423 = true;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Z")
    public static boolean field2428 = false;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "[I")
    public static int[] field2431 = new int[14];

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIB)V")
    public final void method310(int arg0, int arg1, byte arg2) {
        int var4 = 21 % ((arg2 - -65) / 34);
        ++field2425;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        int var4 = this.field2424 * arg1 >> 12;
        int var5 = this.field2430 * arg1 >> 12;
        int var6 = this.field2426 * arg0 >> 12;
        if (arg2 != -17) {
            method1089(-17, -65, -90);
        }
        ++field2432;
        int var7 = this.field2427 * arg0 >> 12;
        class13.method92(var7, var5, var6, var4, super.field611, true, super.field608, super.field610);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method1088(int arg0) {
        if (arg0 != -15886) {
            method1089(-111, -64, 10);
        }
        field2431 = null;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(III)Lmb;")
    public static final class128 method1089(int arg0, int arg1, int arg2) {
        class129 var3 = class26.field455[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2144;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    public final void method307(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2423 = false;
        }
        int var4 = this.field2424 * arg1 >> 12;
        ++field2433;
        int var5 = this.field2430 * arg1 >> 12;
        int var6 = this.field2427 * arg2 >> 12;
        int var7 = this.field2426 * arg2 >> 12;
        class40.method329((byte) -98, var7, var5, var4, super.field608, var6);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIII)V")
    public class148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2427 = arg3;
        this.field2426 = arg1;
        this.field2424 = arg0;
        this.field2430 = arg2;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
    public static final void method1090(int arg0) {
        class180.field2996.method218(false);
        ++field2422;
        class138.field2311 = arg0;
        class225.field3579 = null;
    }
}
