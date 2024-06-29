import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class63 extends class186 {

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "Lkc;")
    public static class157 field916 = new class157("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "Leo;")
    public static class428 field919 = new class428(0, -1);

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "Lmg;")
    public static class530 field922 = new class530();

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "Lbr;")
    public static class146 field920;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "Ldk;")
    public static class421 field914;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "Ldk;")
    public static class421 field923;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 11)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        if (arg4 < 54) {
            this.method168(30);
        }
        field917++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(B)V", line = 22)
    public static void method420(byte arg0) {
        if (arg0 < 124) {
            return;
        }
        field920 = null;
        field916 = null;
        field919 = null;
        field923 = null;
        field914 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Z", line = 39)
    public final boolean method169(int arg0) {
        field913++;
        if (arg0 != -28206) {
            field921 = 90;
        }
        return false;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V", line = 57)
    public static final void method421(int arg0, boolean arg1) {
        field907++;
        if (class494.field7155 == arg0) {
            return;
        }
        if (class494.field7155 == 0) {
            class115.method861(false);
        }
        if (arg0 == 12) {
            class532.method3155(class518.field7611, class61.field899, -115, class481.field6957);
        }
        if (arg0 != 12 && class412.field5875 != null) {
            class412.field5875.method172(12292);
            class412.field5875 = null;
        }
        if (arg0 == 2) {
            class347.method2085(class415.field6027 != class236.field3268, -1);
        }
        if (arg0 == 6) {
            class149.method1082(-52, class236.field3268 != class133.field2029);
        }
        if (arg0 == 4) {
            class286.method1644(1, class518.field7611, class481.field6957);
        } else if (arg0 == 5) {
            class532.method3155(class518.field7611, class61.field899, -116, class481.field6957);
        } else if (arg0 == 8) {
            class532.method3155(class518.field7611, class61.field899, -119, class481.field6957);
        } else if (arg0 == 11) {
            class286.method1644(1, class518.field7611, class481.field6957);
        }
        if (class473.method2769(2, class494.field7155)) {
            class503.field7358.field6093 = 2;
            class457.field6656.field6093 = 2;
            class77.field1099.field6093 = 2;
            field923.field6093 = 2;
            class40.field597.field6093 = 2;
            class286.field3880.field6093 = 2;
            class96.field1552.field6093 = 2;
        }
        if (class473.method2769(2, arg0)) {
            class191.field2789 = 0;
            class95.field1540 = 1;
            class193.field2814 = 0;
            class473.field6857 = 1;
            class37.field555 = 0;
            class235.method1432((byte) 122, true);
            class503.field7358.field6093 = 1;
            class457.field6656.field6093 = 1;
            class77.field1099.field6093 = 1;
            field923.field6093 = 1;
            class40.field597.field6093 = 1;
            class286.field3880.field6093 = 1;
            class96.field1552.field6093 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class482.method2864((byte) 79);
        }
        if (arg0 == 1) {
            class222.method1385(class275.field3737, (byte) -98, class509.field7453);
        } else {
            class156.method1122((byte) -8);
        }
        boolean var2 = arg0 == 1 || class317.method1823(3, arg0) || class222.method1384(0, arg0);
        boolean var3 = class494.field7155 == 1 || class317.method1823(3, class494.field7155) || class222.method1384(0, class494.field7155);
        if (var3 != var2) {
            if (var2) {
                class72.field1027 = field921;
                if (class76.field1075.field3685 == 0) {
                    class165.method1155((byte) -115, 2);
                } else {
                    class341.method2067(false, 0, class76.field1075.field3685, 113, class437.field6309, field921, 2);
                }
                class503.field7364.method1295(false, (byte) 91);
            } else {
                class165.method1155((byte) 93, 2);
                class503.field7364.method1295(true, (byte) 112);
            }
        }
        if (class473.method2769(2, arg0) || arg0 == 12) {
            class275.field3737.method516();
        }
        class494.field7155 = arg0;
        if (!arg1) {
            method420((byte) 92);
        }
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V", line = 182)
    public final void method168(int arg0) {
        field912++;
        int var2 = 15 / ((43 - arg0) / 56);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIIII)V", line = 192)
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field918 = arg3;
        this.field910 = arg2;
        this.field908 = arg5;
        this.field909 = arg6;
        this.field911 = arg1;
        this.field906 = arg0;
        this.field915 = arg4;
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)I")
    public abstract int method419(int arg0);
}
