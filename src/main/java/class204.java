import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class204 extends class545 {

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "[J")
    public static long[] field2697 = new long[100];

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "[Luq;")
    public static class318[] field2694;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1236(long arg0, int arg1) {
        field2696++;
        class647.field8679.setTime(new Date(arg0));
        int var3 = class647.field8679.get(7);
        int var4 = class647.field8679.get(5);
        int var5 = class647.field8679.get(2);
        int var6 = class647.field8679.get(1);
        int var7 = class647.field8679.get(11);
        int var8 = class647.field8679.get(12);
        int var9 = class647.field8679.get(13);
        int var10 = 80 / ((arg1 - 44) / 46);
        return class463.field6426[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class119.field1573[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lrg;Lal;IIIIIIIIII)V")
    public class204(class557 arg0, class125 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2690 = arg11;
        this.field2695 = arg10;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
    public static void method1237(int arg0) {
        field2697 = null;
        if (arg0 >= -59) {
            method1236(36L, 110);
        }
        field2694 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Lww;")
    public final class288 method1206(boolean arg0) {
        field2691++;
        if (arg0) {
            this.field2695 = 115;
        }
        return class220.field2975;
    }
}
