import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class325 extends class70 {

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public int field4797;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    public int field4799;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "[[I")
    public static int[][] field4804 = new int[6][];

    @OriginalMember(owner = "client!or", name = "B", descriptor = "Lpl;")
    public static class616 field4803 = new class616(8);

    @OriginalMember(owner = "client!or", name = "F", descriptor = "Z")
    public static boolean field4807 = false;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "Lit;")
    public static class34 field4806;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 6)
    public static void method2102(int arg0) {
        field4803 = null;
        if (arg0 != 9624) {
            field4806 = null;
        }
        field4806 = null;
        field4804 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lvj;", line = 18)
    public class26 method117(int arg0) {
        field4798++;
        if (arg0 != 1) {
            field4804 = null;
        }
        return class33.field314;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 29)
    public static final void method2103(int arg0, byte arg1, String arg2) {
        field4802++;
        class118 var3 = class86.method755(true, 3, arg0);
        var3.method933((byte) 75);
        if (arg1 != -64) {
            field4804 = null;
        }
        var3.field1813 = arg2;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lnha;Ljn;IIIIIIIIIIIII)V", line = 49)
    public class325(class686 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field4795 = arg11;
        this.field4801 = arg9;
        this.field4794 = arg14;
        this.field4797 = arg12;
        this.field4799 = arg13;
        this.field4796 = arg10;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZIB)Lii;", line = 68)
    public static final class520 method2104(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field4800++;
        class520 var5 = new class520();
        var5.field7511 = arg0;
        var5.field7515 = arg1;
        class36.field340.method3516(255, (long) arg3, var5);
        class195.method1471(false, arg0);
        class353 var6 = class65.method638(arg3, 1668949296);
        if (var6 != null) {
            class717.method3960(var6, (byte) 54);
        }
        if (class139.field2176 != null) {
            class717.method3960(class139.field2176, (byte) 82);
            class139.field2176 = null;
        }
        if (arg4 > -92) {
            field4803 = null;
        }
        class377.method2381(123);
        if (var6 != null) {
            class134.method1083(!arg2, (byte) 103, var6);
        }
        if (!arg2) {
            class464.method2847(arg0);
        }
        if (!arg2 && class673.field9523 != -1) {
            class101.method834(false, 1, class673.field9523);
        }
        return var5;
    }
}
