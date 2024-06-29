import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class194 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZLuv;)V")
    public static final void method1202(int arg0, boolean arg1, class755 arg2) {
        if (arg0 <= 79) {
            method1202(-121, false, null);
        }
        field2628++;
        int var3 = arg2.field10433 == 0 ? arg2.field10393 : arg2.field10433;
        int var4 = arg2.field10479 == 0 ? arg2.field10501 : arg2.field10479;
        class350.method2231(var4, arg1, arg2.field10445, 127, var3, class266.field3900[arg2.field10445 >> 16]);
        if (arg2.field10503 != null) {
            class350.method2231(var4, arg1, arg2.field10445, -124, var3, arg2.field10503);
        }
        class654 var5 = (class654) class259.field3747.method812(127, (long) arg2.field10445);
        if (var5 != null) {
            class328.method2094(var3, var4, var5.field8745, arg1, (byte) -96);
        }
    }
}
