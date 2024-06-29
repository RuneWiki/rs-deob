import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class163 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lwm;")
    public static class152 field2573 = class157.method1048("null", 95);

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Lwm;")
    public static class152 field2586 = class157.method1048(" zuerst von Ihrer Ignorieren)2Liste(Q", 96);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[Lwm;")
    public static class152[] field2580;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[Lcc;")
    public static class248[] field2579;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V", line = 12)
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg8 - arg5;
        if (arg0 != 1) {
            field2579 = (class248[]) null;
        }
        field2575++;
        int var10 = (arg6 - arg3 << 16) / var9;
        int var11 = arg1 - arg7;
        int var12 = (arg4 - arg2 << 16) / var11;
        class46.method314(0, arg1, var10, arg3, arg5, arg8, (byte) -89, arg7, 0, arg2, var12);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z", line = 34)
    public final boolean method1090(int arg0) {
        field2572++;
        if (arg0 == 0) {
            return (this.field2583 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 47)
    public static void method1091(int arg0) {
        field2580 = null;
        field2586 = null;
        field2573 = null;
        if (arg0 != -1007775216) {
            field2579 = (class248[]) null;
        }
        field2579 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Z", line = 69)
    public final boolean method1092(byte arg0) {
        field2576++;
        if (arg0 == 104) {
            return (this.field2583 & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I", line = 80)
    public static final int method1093(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return -80;
        }
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg0--;
            arg1 >>>= 0x1;
        }
        field2578++;
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Z", line = 110)
    public final boolean method1094(byte arg0) {
        field2582++;
        int var2 = -107 / ((arg0 - 24) / 50);
        return (this.field2583 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Z", line = 124)
    public final boolean method1095(int arg0) {
        field2585++;
        if (arg0 != -31887) {
            this.method1095(63);
        }
        return (this.field2583 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Lda;", line = 138)
    public static final class120 method1096(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        return var3 == null || var3.field558 == null ? null : var3.field558;
    }
}
