import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class269 implements class702 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field3776;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Laba;")
    public class185 field3784;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lfda;")
    public class336 field3774;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
    public static int[] field3771 = new int[14];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Ljava/applet/Applet;")
    public static Applet field3782;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[Lpia;")
    public static class103[] field3772;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static final void method1757(byte arg0) {
        field3778++;
        for (class315 var1 = (class315) class686.field9727.method2508((byte) -95); var1 != null; var1 = (class315) class686.field9727.method2505((byte) -55)) {
            if (var1.field4686) {
                var1.method2068((byte) -121);
            }
        }
        if (arg0 != -124) {
            field3782 = null;
        }
        for (class315 var2 = (class315) class751.field10412.method2508((byte) -28); var2 != null; var2 = (class315) class751.field10412.method2505((byte) -55)) {
            if (var2.field4686) {
                var2.method2068((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lcb;I)I")
    public static final int method1758(class544 arg0, int arg1) {
        field3779++;
        int var2 = 0;
        if (arg0.method3131(112, class698.field9857)) {
            var2++;
        }
        if (arg0.method3131(-104, class573.field8113)) {
            var2++;
        }
        if (arg0.method3131(91, class14.field259)) {
            var2++;
        }
        if (arg0.method3131(-105, field3780)) {
            var2++;
        }
        if (arg0.method3131(-73, class237.field3414)) {
            var2++;
        }
        if (arg0.method3131(-100, class264.field3728)) {
            var2++;
        }
        if (arg0.method3131(-88, class305.field4565)) {
            var2++;
        }
        if (arg0.method3131(-89, class631.field8904)) {
            var2++;
        }
        if (arg0.method3131(-64, class631.field8913)) {
            var2++;
        }
        if (arg1 > -12) {
            field3782 = null;
        }
        if (arg0.method3131(109, class37.field523)) {
            var2++;
        }
        if (arg0.method3131(-109, class325.field4870)) {
            var2++;
        }
        if (arg0.method3131(-115, class181.field2757)) {
            var2++;
        }
        if (arg0.method3131(112, class758.field10469)) {
            var2++;
        }
        if (arg0.method3131(119, class688.field9746)) {
            var2++;
        }
        if (arg0.method3131(-37, class75.field1003)) {
            var2++;
        }
        if (arg0.method3131(-47, class645.field9083)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lve;")
    public class527 method606(int arg0) {
        field3770++;
        if (arg0 != 0) {
            this.field3775 = 21;
        }
        return null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method1759(int arg0) {
        field3771 = null;
        if (arg0 == 12519) {
            field3782 = null;
            field3772 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lfda;Laba;IIIIIII)V")
    public class269(class336 arg0, class185 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3773 = arg5;
        this.field3777 = arg2;
        this.field3775 = arg7;
        this.field3776 = arg8;
        this.field3781 = arg6;
        this.field3783 = arg3;
        this.field3769 = arg4;
        this.field3784 = arg1;
        this.field3774 = arg0;
    }
}
