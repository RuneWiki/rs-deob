import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class28 {

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "J")
    public long field363 = 0L;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field365 = 0;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "Lri;")
    public static class273 field359 = new class273();

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lf;")
    public class231 field358;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lf;")
    public class231 field361;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[[B")
    public static byte[][] field356;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 10)
    public static void method145(int arg0) {
        field359 = null;
        if (arg0 != -15802) {
            method150(false, -43);
        }
        field356 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)I", line = 38)
    public static final int method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        if (arg0 != 24179) {
            return 81;
        }
        int var8 = arg3 & 0x3;
        field351++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 1 + 7 - arg6 - arg5;
        } else if (var8 == 2) {
            return (7 - arg2) + 1 - arg1;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I", line = 76)
    public static final int method147(int arg0, int arg1) {
        if (arg0 != 255) {
            field357 = 3;
        }
        field355++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILdk;II)Z", line = 92)
    public static final boolean method148(int arg0, class241 arg1, int arg2, int arg3) {
        field347++;
        if (arg3 != -38) {
            return true;
        }
        byte[] var4 = arg1.method1647(arg0, (byte) 119, arg2);
        if (var4 == null) {
            return false;
        } else {
            class217.method1505(-2, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZ)V", line = 114)
    public static final void method149(int arg0, int arg1, boolean arg2) {
        field348++;
        if (class18.method83((byte) -109, arg0)) {
            if (!arg2) {
                field356 = (byte[][]) ((byte[][]) null);
            }
            class69.method389(arg1, (byte) 79, class272.field4582[arg0]);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V", line = 134)
    public static final void method150(boolean arg0, int arg1) {
        field353++;
        if (arg1 == 37) {
            class175.field2836 = 3.0F;
        } else if (arg1 == 50) {
            class175.field2836 = 4.0F;
        } else if (arg1 == 75) {
            class175.field2836 = 6.0F;
        } else {
            class175.field2836 = 8.0F;
        }
        class148.field2293 = -1;
        class148.field2293 = -1;
        if (arg0) {
            method147(-17, -89);
        }
    }
}
