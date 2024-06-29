import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class661 implements class549 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Ljn;")
    public static class134 field9297 = new class134(26, 6);

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "Lpb;")
    public static class2 field9302 = new class2(3);

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "Lps;")
    public static class7 field9301;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field9305;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "[Ls;")
    public static class418[] field9303;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public static void method3774(byte arg0) {
        if (arg0 >= -71) {
            return;
        }
        field9301 = null;
        field9302 = null;
        field9297 = null;
        field9303 = null;
        field9305 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public static final void method3775(int arg0) {
        class469 var1 = (class469) class297.field4327.method3668(-96);
        if (arg0 < 43) {
            field9302 = null;
        }
        while (var1 != null) {
            if (var1.field6500) {
                var1.field6500 = false;
            } else {
                class128.method878(var1.field6505, -1805);
            }
            var1 = (class469) class297.field4327.method3667((byte) -109);
        }
        field9299++;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B[IJLo;)Ljava/lang/String;")
    public final String method3246(byte arg0, int[] arg1, long arg2, class208 arg3) {
        field9298++;
        if (class760.field10440 == arg3) {
            class559 var6 = class281.field4027.method3538(-113, arg1[0]);
            return var6.method3290((int) arg2, (byte) -121);
        } else if (class269.field3897 == arg3 || class626.field8765 == arg3) {
            class581 var7 = class35.field367.method3051((byte) -20, (int) arg2);
            return var7.field8230;
        } else if (class570.field8018 == arg3 || class289.field4264 == arg3 || class574.field8077 == arg3) {
            return class281.field4027.method3538(-112, arg1[0]).method3290((int) arg2, (byte) -121);
        } else {
            if (arg0 > -92) {
                field9304 = -108;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)Z")
    public static final boolean method3776(int arg0, int arg1) {
        if (arg1 != 0) {
            method3776(74, -52);
        }
        field9300++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }
}
