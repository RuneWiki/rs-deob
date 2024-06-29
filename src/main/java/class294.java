import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class294 extends class429 {

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    private int field3858;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    private int field3866;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    private int field3859;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "[Ljf;")
    public static class198[] field3864 = new class198[34];

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "Lpca;")
    public static class653 field3865 = new class653(64);

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Lvca;")
    public static class254 field3868;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "Ljo;")
    public static class303 field3869;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Lpe;")
    public static class556 field3867;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V", line = 5)
    public final void method57(int arg0, byte arg1, int arg2) {
        ++field3856;
        if (arg1 != -122) {
            field3867 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(IBI)V", line = 15)
    public final void method54(int arg0, byte arg1, int arg2) {
        if (arg1 < 62) {
            method1675(-22);
        }
        ++field3862;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)B", line = 26)
    public static final byte method1673(int arg0, int arg1, int arg2) {
        if (arg2 <= 51) {
            method1674((class452) null, -84);
        }
        ++field3860;
        if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) ((1 & arg1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Liaa;I)Lkc;", line = 49)
    public static final class120 method1674(class452 arg0, int arg1) {
        ++field3857;
        int var2 = -120 / ((arg1 - -16) / 48);
        int var3 = arg0.method2574(-1758460248);
        class215 var4 = class220.method1292(123)[arg0.method2541(83)];
        class278 var5 = class437.method2415(-120)[arg0.method2541(54)];
        int var6 = arg0.method2549((byte) 32);
        int var7 = arg0.method2549((byte) 32);
        return new class120(var3, var4, var5, var6, var7);
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(IIIIII)V", line = 70)
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3858 = arg2;
        this.field3866 = arg1;
        this.field3861 = arg3;
        this.field3859 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 81)
    public static void method1675(int arg0) {
        field3869 = null;
        field3865 = null;
        field3864 = null;
        if (arg0 != -10) {
            method1673(-96, 114, -12);
        }
        field3867 = null;
        field3868 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)V", line = 106)
    public final void method55(int arg0, int arg1, byte arg2) {
        ++field3863;
        int var4 = this.field3859 * arg0 >> 12;
        int var5 = this.field3858 * arg0 >> 12;
        int var6 = this.field3866 * arg1 >> 12;
        int var7 = this.field3861 * arg1 >> 12;
        class227.method1324(var5, var7, -1, var4, super.field5688, var6);
        if (arg2 <= 108) {
            field3865 = null;
        }
    }
}
