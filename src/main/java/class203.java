import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class203 extends class226 {

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    private int field3591 = -32768;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
    public static int[] field3593 = new int[2048];

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Lmh;")
    public static class128 field3597 = class22.method156(122, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field3583 = 0;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Loe;")
    public static class120 field3585 = new class120(16);

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Lmh;")
    private static class128 field3601 = class22.method156(126, "glow3:");

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "Lmh;")
    public static class128 field3599 = field3601;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "Lmh;")
    public static class128 field3598 = field3601;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "B")
    public static byte field3600;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3589;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()I", line = 4)
    public final int method204() {
        field3595++;
        return this.field3591;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIJ)V", line = 12)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3587++;
        class60 var11 = class180.method1226(false, this.field3586).method1383(768, this.field3590, (class1) null, 0);
        if (var11 != null) {
            var11.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3591 = var11.method204();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BILql;)V", line = 26)
    public static final void method1410(byte arg0, int arg1, class16 arg2) {
        if (arg2.field426 > class293.field5011) {
            class82.method520(arg2, (byte) -65);
        } else if (arg2.field447 >= class293.field5011) {
            class5.method28(arg2, 0);
        } else {
            class117.method703(0, arg2);
        }
        if (arg0 > -42) {
            method1410((byte) 94, 91, (class16) null);
        }
        if (arg2.field478 < 128 || arg2.field418 < 128 || arg2.field478 >= 13184 || arg2.field418 >= 13184) {
            arg2.field416 = -1;
            arg2.field426 = 0;
            arg2.field447 = 0;
            arg2.field451 = -1;
            arg2.field478 = arg2.field450[0] * 128 + (arg2.method118(-1) * 64);
            arg2.field418 = arg2.field422[0] * 128 + (arg2.method118(-1) * 64);
            arg2.method120((byte) -100);
        }
        if (class163.field2796 == arg2 && (arg2.field478 < 1536 || arg2.field418 < 1536 || arg2.field478 >= 11776 || arg2.field418 >= 11776)) {
            arg2.field447 = 0;
            arg2.field451 = -1;
            arg2.field426 = 0;
            arg2.field416 = -1;
            arg2.field478 = arg2.field450[0] * 128 + (arg2.method118(-1) * 64);
            arg2.field418 = arg2.field422[0] * 128 + arg2.method118(-1) * 64;
            arg2.method120((byte) 120);
        }
        field3588++;
        class79.method505(arg2, -69);
        class105.method645(0, arg2);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)Lh;", line = 75)
    public static final class208 method1411(boolean arg0, int arg1) {
        field3596++;
        class208 var2 = (class208) class294.field5028.method1836((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method1412(true);
        }
        byte[] var3 = class97.field1665.method2155(class114.method686((byte) 60, arg1), class236.method1618((byte) -121, arg1), (byte) 70);
        class208 var4 = new class208();
        var4.field3679 = arg1;
        if (var3 != null) {
            var4.method1432(new class194(var3), (byte) 83);
        }
        var4.method1428(true);
        class294.field5028.method1835((byte) -81, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 117)
    public static void method1412(boolean arg0) {
        if (arg0) {
            method1412(true);
        }
        field3598 = null;
        field3589 = null;
        field3585 = null;
        field3599 = null;
        field3593 = null;
        field3601 = null;
        field3597 = null;
    }
}
