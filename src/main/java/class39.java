import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class39 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field492 = -1;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Z")
    public static boolean field495 = false;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Z")
    public static boolean field496 = false;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Z")
    public static boolean field497 = true;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[Lsd;")
    public static class50[] field499 = new class50[32768];

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field500 = -1;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 5)
    public static void method263(int arg0) {
        field499 = null;
        if (arg0 != 29357) {
            field499 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 22)
    public static final void method264(String arg0, int arg1, int arg2) {
        field493++;
        if (arg2 != 31606) {
            method265((String) null, (class186) null, false);
        }
        class211 var3 = class281.method1921(2, arg1, (byte) -108);
        var3.method1490((byte) 117);
        var3.field3374 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljg;Z)I", line = 39)
    public static final int method265(String arg0, class186 arg1, boolean arg2) {
        field494++;
        int var3 = arg1.field3044;
        if (arg2) {
            method266(123, 5, -10);
        }
        byte[] var4 = class429.method2657(arg0, 94);
        arg1.method1295(var4.length, 26485384);
        arg1.field3044 += class64.field837.method2655(var4, 0, var4.length, arg1.field3066, -5775, arg1.field3044);
        return arg1.field3044 - var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V", line = 60)
    public static final void method266(int arg0, int arg1, int arg2) {
        field498++;
        if (class178.method1225(58, arg2)) {
            class323.method2139(arg0, 121, class203.field3266[arg2]);
            if (arg1 != -4174) {
                field496 = true;
            }
        }
    }
}
