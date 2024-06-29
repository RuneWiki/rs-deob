import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class193 extends class467 {

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    private int field2735;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    private int field2725;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lpg;")
    public static class492 field2731 = new class492(69, 14);

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Lpg;")
    public static class492 field2733 = new class492(65, 8);

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "Lbn;")
    public static class348 field2736 = new class348(128);

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Lcm;")
    public static class449 field2739 = new class449(5, -1);

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Lpg;")
    public static class492 field2743 = new class492(50, 6);

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "Lui;")
    public static class375 field2744 = new class375("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "F")
    public static float field2741;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([IIBI)V", line = 8)
    public final void method1358(int[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = -35 / ((arg2 - 63) / 56);
        field2738++;
        arg0[1] = this.field2728 + arg3 - this.field2734;
        arg0[0] = 0;
        arg0[2] = arg1 - (this.field2729 - this.field2726);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)Z", line = 22)
    public final boolean method1359(int arg0, int arg1, int arg2, int arg3) {
        field2730++;
        if (arg0 == 17747) {
            return this.field2724 == arg2 && this.field2734 <= arg1 && this.field2735 >= arg1 && this.field2729 <= arg3 && this.field2725 >= arg3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V", line = 37)
    public static void method1360(byte arg0) {
        if (arg0 >= -97) {
            method1360((byte) 103);
        }
        field2731 = null;
        field2736 = null;
        field2733 = null;
        field2744 = null;
        field2739 = null;
        field2743 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z", line = 55)
    public final boolean method1361(int arg0, int arg1, int arg2) {
        field2737++;
        if (arg0 == 0) {
            return this.field2734 <= arg2 && this.field2735 >= arg2 && this.field2729 <= arg1 && this.field2725 >= arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)Z", line = 78)
    public final boolean method1362(int arg0, int arg1, int arg2) {
        field2740++;
        if (arg1 != 1) {
            this.method1363(25, 33, null, -123);
        }
        return this.field2728 <= arg0 && this.field2727 >= arg0 && this.field2726 <= arg2 && arg2 <= this.field2742;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[II)V", line = 96)
    public final void method1363(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[arg3] = this.field2724;
        field2732++;
        arg2[2] = this.field2729 + arg0 - this.field2726;
        arg2[1] = this.field2734 + arg1 - this.field2728;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIIIIII)V", line = 115)
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2742 = arg8;
        this.field2724 = arg0;
        this.field2729 = arg2;
        this.field2735 = arg3;
        this.field2725 = arg4;
        this.field2726 = arg6;
        this.field2728 = arg5;
        this.field2734 = arg1;
        this.field2727 = arg7;
    }
}
