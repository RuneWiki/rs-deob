import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class19 extends class304 implements class267 {

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Lor;")
    public class304 field214;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[[I")
    public static int[][] field200 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field203 = 1;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "[I")
    public static int[] field202 = new int[5];

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lmn;")
    public static class162 field196;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Lvq;")
    public static class346 field199;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lza;")
    public static class497 field198;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        field197++;
        return arg0 <= 87 ? -3 : 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        field213++;
        if (arg0 != -6682) {
            field200 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)I")
    public final int method98(int arg0) {
        field206++;
        if (arg0 != 0) {
            field200 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        field208++;
        return arg0 <= 53 ? -45 : 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (arg0) {
            field200 = null;
        }
        field205++;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)V")
    public static void method101(boolean arg0) {
        field196 = null;
        field200 = null;
        field199 = null;
        field198 = null;
        field202 = null;
        if (!arg0) {
            field200 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIILor;)V")
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, class304 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class16.method89(arg0, (byte) -118, arg1));
        this.field214 = arg5;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        if (arg0 != -1) {
            this.method106((byte) -86);
        }
        field211++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        field204++;
        if (arg0 > -95) {
            field199 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        if (arg1 != 26768) {
            field203 = 71;
        }
        field212++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        field209++;
        if (arg1 != 32689) {
            this.method102(8, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        field195++;
        if (arg0 != 18) {
            this.method108(-19, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        field207++;
        if (arg0) {
            field199 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        if (arg0 == 2) {
            field201++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Z")
    public static final boolean method109(int arg0, int arg1) {
        if (arg0 != -8702) {
            method101(false);
        }
        field210++;
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }
}
