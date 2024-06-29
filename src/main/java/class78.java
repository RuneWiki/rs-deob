import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class78 {

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Lvn;")
    public static class169 field880 = new class169();

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Z")
    public static boolean field885 = true;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "[I")
    public static int[] field890 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "Lra;")
    public static class57 field889;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "[B")
    public byte[] field877;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "[B")
    public byte[] field879;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "[Lac;")
    public static class319[] field887;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I", line = 6)
    public static final int method439(int arg0, int arg1) {
        field876++;
        if (arg0 != 255) {
            field883 = -4;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBIIIIIII)V", line = 20)
    public static final void method440(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != -28) {
            return;
        }
        field873++;
        if (arg4 < 1 || arg6 < 1 || arg4 > (class279.field3935 - 2) || class164.field2287 - 2 < arg6) {
            return;
        }
        if (!class257.method1613(-119) && !class139.method831(arg4, class356.field5209, arg0, arg6, (byte) -87)) {
            return;
        }
        if (class19.field202 == null) {
            return;
        }
        int var9 = arg0;
        if (arg0 < 3 && class278.method1759(arg6, 26002, arg4)) {
            var9 = arg0 + 1;
        }
        class353.method2248(arg4, class218.field2991, arg6, -88, class54.field613[arg0], arg0, arg3, var9);
        if (arg8 < 0) {
            return;
        }
        boolean var10 = class281.field3945;
        class281.field3945 = true;
        class103.method558(var9, arg7, class218.field2991, arg2, class54.field613[arg0], arg0, arg8, arg6, arg5, arg4, false, false, -91);
        class281.field3945 = var10;
        return;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIII)V", line = 66)
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class58[] var7 = class286.field4039;
        if (arg6 != 2) {
            field887 = null;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class58 var9 = var7[var8];
            if (var9 != null && var9.field708 == 2) {
                class249.method1564(arg6 + 115, (-class40.field427 + var9.field707 << 7) + var9.field694, arg3, arg1 >> 1, arg4, arg2 >> 1, (var9.field702 - class217.field2975 << 7) + var9.field706, var9.field703 * 2);
                if (class33.field313[0] > -1 && (class221.field3033 % 20) < 10) {
                    class147.field2062[var9.field696].method90(class33.field313[0] + arg5 - 12, class33.field313[1] + arg0 + -28);
                }
            }
        }
        field872++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIBII)V", line = 105)
    public static final void method442(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field874++;
        if (class344.method2202((byte) -92, arg4)) {
            class20.method137(0, arg3, class224.field3054[arg4], arg1, -1, arg0);
            if (arg2 <= 65) {
                field885 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 122)
    public static void method443(int arg0) {
        field890 = null;
        field880 = null;
        field887 = null;
        field889 = null;
        if (arg0 != -3) {
            field880 = null;
        }
    }
}
