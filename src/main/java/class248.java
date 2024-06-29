import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class248 extends class390 {

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public int field3497 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public int field3498 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public int field3504 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public int field3503 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public int field3500 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public int field3502 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public int field3506 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public int field3508 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "Lco;")
    public class62 field3511;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "Lbj;")
    public static class131 field3509 = new class131(4);

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "Lkn;")
    public static class442 field3510 = new class442("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "[I")
    public static int[] field3513 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "Lnq;")
    public static class268 field3512;

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lco;)V", line = 156)
    public class248(class62 arg0) {
        this.field3511 = arg0;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILkm;I)V", line = 19)
    public static final void method1668(int arg0, int arg1, class198 arg2, int arg3) {
        if (arg2.field5264 == arg0 && arg0 != -1) {
            class411 var4 = class108.method761((byte) -82, arg0);
            int var5 = var4.field5832;
            if (var5 == 1) {
                arg2.field5251 = arg1;
                arg2.field5319 = 0;
                arg2.field5255 = 0;
                arg2.field5266 = 1;
                arg2.field5250 = 0;
                class431.method2721(arg2.field6266, arg2.field6262, var4, -57, false, arg2.field5319);
            }
            if (var5 == 2) {
                arg2.field5250 = 0;
            }
        } else if (arg0 == -1 || arg2.field5264 == -1 || class108.method761((byte) -82, arg0).field5825 >= class108.method761((byte) -82, arg2.field5264).field5825) {
            arg2.field5255 = 0;
            arg2.field5250 = 0;
            arg2.field5251 = arg1;
            arg2.field5266 = 1;
            arg2.field5264 = arg0;
            arg2.field5328 = arg2.field5344;
            arg2.field5319 = 0;
            if (arg2.field5264 != -1) {
                class431.method2721(arg2.field6266, arg2.field6262, class108.method761((byte) -82, arg2.field5264), arg3 - 58, false, arg2.field5319);
            }
        }
        field3499++;
        if (arg3 != -1) {
            method1671(-119);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)Z", line = 92)
    public final boolean method1669(int arg0, int arg1, int arg2) {
        field3505++;
        if (arg2 != 0) {
            method1671(70);
        }
        if (this.field3497 <= arg0 && arg0 <= this.field3503 && arg1 >= this.field3500 && this.field3504 >= arg1) {
            return true;
        } else {
            return this.field3498 <= arg0 && arg0 <= this.field3502 && this.field3506 <= arg1 && this.field3508 >= arg1;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V", line = 118)
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 100) {
            field3513 = null;
        }
        field3501++;
        class239 var5 = class436.method2740(4, arg3, -323285792);
        var5.method1622(-2);
        var5.field3397 = arg1;
        var5.field3399 = arg4;
        var5.field3408 = arg0;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V", line = 134)
    public static void method1671(int arg0) {
        field3513 = null;
        field3510 = null;
        if (arg0 == 0) {
            field3512 = null;
            field3509 = null;
        }
    }
}
