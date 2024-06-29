import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class269 implements class547 {

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Z")
    public boolean field3394;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "Lrc;")
    public class29 field3398;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "Lct;")
    public class414 field3401;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Lwp;")
    public static class453 field3399 = new class453(40, 2);

    @OriginalMember(owner = "client!js", name = "o", descriptor = "Z")
    public static boolean field3404 = false;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "[I")
    public static int[] field3405;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Lwea;", line = 5)
    public final class259 method235(int arg0) {
        field3391++;
        return arg0 <= 38 ? null : class484.field6425;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILrc;ILct;IIIIIII)V", line = 28)
    public static final void method1552(int arg0, int arg1, class29 arg2, int arg3, class414 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class676.field9501 = arg0;
        class525.field7129 = arg4;
        field3397++;
        class611.field8575 = arg1;
        class155.field2014 = arg5;
        if (arg3 > -94) {
            return;
        }
        class372.field4701 = arg10;
        class551.field7680 = arg6;
        class30.field434 = arg11;
        class294.field3639 = null;
        class271.field3426 = arg7;
        class556.field7732 = null;
        class702.field9927 = arg8;
        class462.field5893 = null;
        class587.field8254 = arg2;
        class481.field6404 = arg9;
        class484.method2630(3171);
        class193.field2412 = true;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Z", line = 62)
    public static final boolean method1553(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field3400++;
            return (arg1 & 0x580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V", line = 82)
    public static void method1554(byte arg0) {
        field3405 = null;
        if (arg0 <= 55) {
            field3404 = false;
        }
        field3399 = null;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(ILct;Lrc;IIIIIIIZ)V", line = 99)
    public class269(int arg0, class414 arg1, class29 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field3396 = arg9;
        this.field3407 = arg5;
        this.field3390 = arg3;
        this.field3394 = arg10;
        this.field3398 = arg2;
        this.field3392 = arg0;
        this.field3393 = arg6;
        this.field3395 = arg7;
        this.field3402 = arg4;
        this.field3401 = arg1;
        this.field3406 = arg8;
    }
}
