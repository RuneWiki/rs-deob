import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class573 extends class465 {

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Lqfa;")
    public static class98 field8109 = new class98(62, 4);

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "[I")
    public static int[] field8111 = new int[500];

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "Lfp;")
    public static class323 field8110;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(FI)V")
    public final void method1044(float arg0, int arg1) {
        ++field8106;
        super.field6582 = arg0;
        if (arg1 != 65536) {
            field8111 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3) {
        super.field6579 = arg2;
        super.field6583 = arg1;
        if (arg3 != 16) {
            this.method1044(0.75609535F, 79);
        }
        super.field6592 = arg0;
        ++field8108;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[IILkd;)V")
    public static final void method3286(int arg0, int[] arg1, int arg2, class280 arg3) {
        if (arg3.field7911 != null) {
            boolean var4 = true;
            for (int var5 = 0; ~arg3.field7911.length < ~var5; ++var5) {
                if (arg3.field7911[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field7991 != -1) {
                class709 var6 = class343.field4785.method3525(arg3.field7991, (byte) -125);
                int var7 = var6.field9848;
                if (var7 == 1) {
                    arg3.field7925 = arg2;
                    arg3.field7965 = 0;
                    arg3.field7921 = 0;
                    arg3.field7944 = 0;
                    arg3.field7922 = 1;
                    if (!arg3.field7970) {
                        class346.method2239(-701644944, arg3.field7965, arg3, var6);
                    }
                }
                if (~var7 == -3) {
                    arg3.field7944 = 0;
                }
            }
        }
        ++field8107;
        boolean var8 = true;
        for (int var9 = 0; ~var9 > ~arg1.length; ++var9) {
            if (~arg1[var9] != 0) {
                var8 = false;
            }
            if (arg3.field7911 == null || ~arg3.field7911[var9] == 0 || class343.field4785.method3525(arg1[var9], (byte) -38).field9824 >= class343.field4785.method3525(arg3.field7911[var9], (byte) -122).field9824) {
                arg3.field7925 = arg2;
                arg3.field7911 = arg1;
                break;
            }
        }
        if (var8) {
            arg3.field7925 = arg2;
            arg3.field7911 = arg1;
        }
        if (arg0 != -1) {
            field8110 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
    public static void method3287(int arg0) {
        field8111 = null;
        field8109 = null;
        field8110 = null;
        if (arg0 < 110) {
            method3287(126);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIF)V")
    public class573(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
