import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class286 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public static int[] field4492 = new int[5];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lub;B)V")
    public static final void method1919(class92 arg0, byte arg1) {
        field4497++;
        class101.field1580 = arg0.method717(104, "titlebg");
        if (arg1 != -79) {
            method1919((class92) null, (byte) -63);
        }
        class236.field3731 = arg0.method717(104, "logo");
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLtk;)V")
    public static final void method1920(byte arg0, class53 arg1) {
        if (arg0 == -46) {
            class296.field4756 = arg1;
            field4494++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1921(int arg0) {
        field4492 = null;
        if (arg0 != -51) {
            method1921(115);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4493++;
        class220 var13 = new class220();
        if (arg10 != 31923) {
            field4492 = null;
        }
        var13.field3367 = arg3;
        var13.field3350 = arg5;
        var13.field3363 = arg7;
        var13.field3353 = arg12;
        var13.field3349 = arg2;
        var13.field3362 = arg8;
        var13.field3352 = arg11;
        var13.field3358 = arg4;
        var13.field3368 = arg0;
        var13.field3354 = arg9;
        var13.field3351 = arg1;
        var13.field3364 = arg6;
        class257.field4087.method12(var13, 12);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method1923(boolean arg0, int arg1) {
        field4498++;
        if (arg0) {
            field4495 = -11;
        }
        if (arg1 == 100 && class64.field1022 > 0) {
            byte[] var2 = class214.field3281[--class64.field1022];
            class214.field3281[class64.field1022] = null;
            return var2;
        } else if (arg1 == 5000 && class236.field3733 > 0) {
            byte[] var3 = class205.field3154[--class236.field3733];
            class205.field3154[class236.field3733] = null;
            return var3;
        } else if (arg1 == 30000 && class129.field1925 > 0) {
            byte[] var4 = class208.field3222[--class129.field1925];
            class208.field3222[class129.field1925] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
