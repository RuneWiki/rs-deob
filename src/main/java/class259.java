import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class259 extends class90 {

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "[I")
    public int[] field3610;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "[I")
    public int[] field3615;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Lcs;")
    public static class351 field3612 = new class351(70, 3);

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "[I")
    public static int[] field3614 = new int[50];

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Lfl;")
    public static class345 field3613 = new class345("RC", 1);

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "[Las;")
    public static class446[] field3617 = new class446[6];

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Lkm;")
    public static class487 field3611;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIZ)I", line = 5)
    public static final int method1605(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg1 & 0x3;
        field3609++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (arg3) {
            return -81;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 27)
    public static void method1606(int arg0) {
        field3617 = null;
        field3613 = null;
        field3611 = null;
        field3614 = null;
        field3612 = null;
        int var1 = 84 / ((arg0 - 40) / 39);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBZ)V", line = 53)
    public static final void method1607(int arg0, byte arg1, boolean arg2) {
        int var3 = 72 / ((10 - arg1) / 44);
        field3608++;
        class459 var4 = class27.method228((byte) -123, arg2, arg0);
        if (var4 != null) {
            var4.method1182(28818);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(II[I[I)V", line = 68)
    public class259(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field3610 = arg2;
        this.field3615 = arg3;
    }
}
