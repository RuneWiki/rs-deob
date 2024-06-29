import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class259 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "J")
    public long field4185 = 0L;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
    public static int[] field4176 = new int[2048];

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field4188 = 100;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field4179;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field4181;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field4187;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Ldk;")
    public static class251 field4189;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lqk;")
    public class2 field4174;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lqk;")
    public class2 field4186;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field4184;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "[Lbl;")
    public static class146[] field4177;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
    public static final void method1738(int arg0, int arg1, int arg2, int arg3) {
        class175 var4 = class182.method1317(9, arg0, false);
        if (arg3 < 73) {
            field4184 = null;
        }
        var4.method1279((byte) -80);
        var4.field2865 = arg2;
        field4191++;
        var4.field2855 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZILag;II)V")
    public static final void method1739(boolean arg0, int arg1, class211 arg2, int arg3, int arg4) {
        if (class178.field2908 >= 3) {
            class127.method884(arg3, arg4, 0, arg2.field3460, arg2.field3505);
        } else {
            ((class232) class123.field1962).method1401(arg3, arg4, arg2.field3430, arg2.field3394, class123.field1962.field2303 / 2, class123.field1962.field2297 / 2, (int) class90.field1456, 256, arg2.field3460, arg2.field3505);
        }
        field4182++;
        class85.field1415[arg1] = true;
        if (arg0) {
            field4176 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4175++;
        class265 var13 = new class265();
        var13.field4267 = arg5;
        var13.field4254 = arg6;
        var13.field4260 = arg2;
        var13.field4263 = arg12;
        var13.field4250 = arg8;
        var13.field4262 = arg7;
        var13.field4269 = arg4;
        var13.field4251 = arg0;
        var13.field4268 = arg10;
        var13.field4256 = arg9;
        var13.field4255 = arg1;
        if (arg11 != 256) {
            field4176 = null;
        }
        var13.field4259 = arg3;
        class212.field3511.method1646(true, var13);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        field4184 = null;
        if (arg0 < 16) {
            field4188 = 33;
        }
        field4177 = null;
        field4189 = null;
        field4176 = null;
    }
}
