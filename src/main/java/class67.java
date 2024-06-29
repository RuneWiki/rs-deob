import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class67 extends class252 {

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field692;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static volatile int field687 = 0;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lhg;")
    public static class289 field696;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
    public static boolean field689;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method376(int arg0) {
        if (arg0 != -22769) {
            method379(3);
        }
        ++field690;
        class114 var1 = class424.field6221;
        synchronized (class424.field6221) {
            class424.field6221.method613(true);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        ++field694;
        int var4 = this.field688 * arg1 >> 12;
        int var5 = this.field699 * arg1 >> 12;
        int var6 = this.field701 * arg0 >> 12;
        int var7 = this.field692 * arg0 >> 12;
        if (arg2 != 0) {
            this.field688 = -55;
        }
        class263.method1470(1, var4, var6, var7, var5, super.field3450);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIII)V")
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field701 = arg1;
        this.field688 = arg0;
        this.field699 = arg2;
        this.field692 = arg3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method378(int arg0, int arg1, int arg2) {
        ++field698;
        int var4 = this.field688 * arg2 >> 12;
        int var5 = this.field699 * arg2 >> 12;
        if (arg0 != 16136) {
            field689 = false;
        }
        int var6 = this.field701 * arg1 >> 12;
        int var7 = this.field692 * arg1 >> 12;
        class228.method1238(var4, super.field3450, var7, var5, super.field3448, var6, super.field3447, (byte) 121);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public static void method379(int arg0) {
        if (arg0 == 918037484) {
            field696 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII)V")
    public final void method380(boolean arg0, int arg1, int arg2) {
        ++field695;
        if (!arg0) {
            field697 = -80;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)Z")
    public static final boolean method381(byte arg0, int arg1, int arg2) {
        ++field691;
        int var3 = -82 % ((52 - arg0) / 42);
        return ~(2 & class282.field3872[1][arg2][arg1]) != -1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZ)V")
    public static final void method382(int arg0, boolean arg1, boolean arg2) {
        ++field693;
        if (arg2) {
            ++class271.field3666;
            class171.method900(0);
        }
        if (arg1) {
            ++class54.field553;
            class187.method1007(3);
        }
        int var3 = -117 / ((arg0 - 79) / 33);
    }
}
