import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class344 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field4821 = -1;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljr;")
    public static class112 field4819 = new class112(20);

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4823 = -1;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[Ls;")
    public static class281[] field4822;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static void method2167(boolean arg0) {
        field4819 = null;
        field4822 = null;
        if (!arg0) {
            field4823 = 110;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
    public static final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4820++;
        if (arg2 >= -6) {
            field4819 = null;
        }
        if (arg0 < arg1) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class691.field9345[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class691.field9345[var6][arg3] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZII)V")
    public static final void method2169(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4818++;
        for (int var5 = 0; var5 < class697.field9413; var5++) {
            Rectangle var6 = class27.field743[var5];
            if (arg3 < (var6.x + var6.width) && (arg0 + arg3) > var6.x && arg1 < (var6.y + var6.height) && (arg1 + arg4) > var6.y) {
                class521.field7232[var5] = true;
            }
        }
        class546.method3152(-5590, arg3, arg0 + arg3, arg1, arg1 + arg4);
        if (!arg2) {
            method2169(-120, -24, false, -125, -16);
        }
    }
}
