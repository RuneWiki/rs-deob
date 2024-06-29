import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class73 {

    @OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!haa", name = "s", descriptor = "Lhaa;")
    public class73 field777;

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "Lq;")
    public class389 field763;

    @OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!haa", name = "n", descriptor = "Z")
    public static boolean field772 = false;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
    public static int field759 = 1;

    @OriginalMember(owner = "client!haa", name = "q", descriptor = "Lkfa;")
    public static class549 field775 = new class549(7, -1);

    @OriginalMember(owner = "client!haa", name = "t", descriptor = "I")
    public static int field778 = 1406;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!haa", name = "d", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!haa", name = "j", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!haa", name = "l", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!haa", name = "r", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!haa", name = "m", descriptor = "Lgs;")
    public static class41 field771;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIIIBI)V", line = 3)
    public static final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field761++;
        if (arg7 == 67) {
            class250.method1439(arg6, arg2, arg0, arg3, arg8, true, arg4, arg1, 0, arg5);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)Lvf;", line = 14)
    public final class138 method465(boolean arg0) {
        field766++;
        return arg0 ? null : class692.method3830(this.field774, (byte) 23);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)I", line = 28)
    public static final int method466(int arg0, int arg1, int arg2) {
        field776++;
        return ~arg1 == arg0 || arg1 == 5 ? class397.field5296[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)V", line = 43)
    public static void method467(byte arg0) {
        field775 = null;
        int var1 = 14 / ((-arg0 - 10) / 52);
        field771 = null;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)Lhaa;", line = 67)
    public final class73 method468(int arg0, int arg1) {
        field760++;
        if (arg0 != -3) {
            method466(-101, -47, 15);
        }
        return new class73(this.field774, arg1);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "([FIFIIIIIBI)V", line = 81)
    public static final void method469(float[] arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        int var10 = arg9 - arg7;
        int var11 = arg5 - arg3;
        field768++;
        if (arg8 != 83) {
            return;
        }
        int var12 = arg4 - arg6;
        float var13 = arg0[2] * (float) var11 + arg0[0] * (float) var12 + arg0[1] * (float) var10;
        float var14 = arg0[5] * (float) var11 + arg0[3] * (float) var12 + arg0[4] * (float) var10;
        float var15 = arg0[8] * (float) var11 + arg0[7] * (float) var10 + arg0[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg2 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class589.field8383 = var18;
        class478.field6972 = var17;
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V", line = 135)
    public static final void method470(byte arg0) {
        if (arg0 != 84) {
            field771 = null;
        }
        field770++;
        if (class32.field358 != null) {
            class32.field358.method715(arg0 ^ 0x35);
        }
        if (class600.field8522 != null) {
            class600.field8522.method715(arg0 ^ 0x6A);
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(II)V", line = 162)
    public class73(int arg0, int arg1) {
        this.field773 = arg1;
        this.field774 = arg0;
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lhaa;I)V", line = 170)
    public class73(class73 arg0, int arg1) {
        this.field777 = arg0;
        this.field774 = this.field777.field774;
        this.field763 = this.field777.field763;
        this.field773 = this.field777.field773 + arg1;
    }
}
