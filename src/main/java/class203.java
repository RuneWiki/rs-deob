import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class203 extends class81 {

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "[B")
    public byte[] field3480;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Lpj;")
    public static class237 field3481 = null;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lpj;")
    public static class237 field3483 = class33.method353("<col=ffffff>)0", 114);

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lak;")
    public static class135 field3482 = new class135(500);

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[[I")
    public static int[][] field3484 = new int[104][104];

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lpj;")
    public static class237 field3485 = class33.method353("b12_full", 64);

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Lfa;")
    public static class239 field3477;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public static void method1374(int arg0) {
        field3477 = null;
        field3483 = null;
        field3482 = null;
        if (arg0 >= 69) {
            field3484 = null;
            field3485 = null;
            field3481 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfa;Lpi;IZLfa;)V")
    public static final void method1375(class239 arg0, class136 arg1, int arg2, boolean arg3, class239 arg4) {
        class43.field941 = arg0;
        class243.field4259 = arg4;
        class256.field4395 = arg3;
        field3486++;
        int var5 = class243.field4259.method1640(arg2 ^ -10) - 1;
        if (arg2 != 9) {
            field3477 = null;
        }
        class148.field2633 = class243.field4259.method1638(var5, (byte) -73) + var5 * 256;
        class155.field2738 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILqe;Lqe;IIJ)V")
    public static final void method1376(int arg0, int arg1, int arg2, int arg3, class95 arg4, class95 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class114 var10 = new class114();
        var10.field2000 = arg8;
        var10.field2003 = arg1 * 128 + 64;
        var10.field2005 = arg2 * 128 + 64;
        var10.field1995 = arg3;
        var10.field1999 = arg4;
        var10.field1993 = arg5;
        var10.field1996 = arg6;
        var10.field2004 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class274.field4775[var11][arg1][arg2] == null) {
                class274.field4775[var11][arg1][arg2] = new class35(var11, arg1, arg2);
            }
        }
        class274.field4775[arg0][arg1][arg2].field763 = var10;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    public class203(byte[] arg0) {
        this.field3480 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lpj;")
    public static final class237 method1377(int arg0, int arg1) {
        field3479++;
        class237 var2 = class14.method130(arg1, (byte) 117);
        if (arg0 != 500) {
            method1376(48, 24, 17, -84, (class95) null, (class95) null, 121, -103, -32L);
        }
        for (int var3 = var2.method1588(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class238.method1626(new class237[] { var2.method1620(123, var3, 0), class196.field3404, var2.method1610(var3, 119) }, -126);
        }
        if (var2.method1588(false) > 9) {
            return class238.method1626(new class237[] { class178.field3138, var2.method1620(125, var2.method1588(false) - 8, 0), class195.field3394, class81.field1522, var2, class65.field1292 }, -70);
        } else if (var2.method1588(false) > 6) {
            return class238.method1626(new class237[] { class183.field3217, var2.method1620(108, var2.method1588(false) - 4, 0), class121.field2146, class81.field1522, var2, class65.field1292 }, -53);
        } else {
            return class238.method1626(new class237[] { class70.field1379, var2, class32.field695 }, -126);
        }
    }
}
