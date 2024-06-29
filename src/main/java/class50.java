import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class50 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Lmt;")
    public static class517 field634 = new class517(16);

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Z")
    public static boolean field637 = false;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field640 = 104;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "[I")
    public static int[] field643;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field641;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[I")
    public static int[] field647;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[I")
    public static int[] field646;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "[I")
    public static int[] field645;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "[I")
    public static int[] field642;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "[I")
    public static int[] field648;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "[[B")
    public static byte[][] field639;

    static {
        new class347("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field644 = 50;
        field643 = new int[field644];
        field641 = new String[field644];
        field647 = new int[field644];
        field646 = new int[field644];
        field645 = new int[field644];
        field642 = new int[field644];
        field648 = new int[field644];
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lfe;", line = 3)
    public static final class152 method371(int arg0, int arg1) {
        field635++;
        if (arg1 != 2) {
            method375(-63, -27, 6, 49, -94, -12);
        }
        return class488.field7280 && class378.field5696 <= arg0 && arg0 <= class2.field14 ? class295.field4418[arg0 - class378.field5696] : null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILvi;)V", line = 17)
    public static final void method372(int arg0, class480 arg1) {
        field631++;
        int var2 = -100 / ((42 - arg0) / 38);
        class203 var3 = (class203) class22.field323.method3059(46, (long) arg1.field6015);
        if (var3 == null) {
            class454.method2644(0, null, null, (byte) 38, arg1, arg1.field7686, arg1.field6065[0], arg1.field6068[0]);
        } else {
            var3.method1333(-13076);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)I", line = 35)
    public static final int method373(int arg0, int arg1, int arg2, int arg3) {
        field633++;
        if (class249.field3405 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > field640 - 1 || class448.field6611 - 1 < var5) {
            return 0;
        }
        if (arg1 != 14966) {
            method376(-112, (byte) 10, 98, 33);
        }
        int var6 = arg0;
        if (arg0 < 3 && (class524.field7736[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class249.field3405[var6].method718(arg3, arg2);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 63)
    public static final byte[] method374(boolean arg0, int arg1, Object arg2) {
        field636++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class450.method2624(var3, 71) : var3;
        } else if (arg2 instanceof class33) {
            class33 var4 = (class33) arg2;
            return var4.method282(arg1 ^ 0x3D4A);
        } else {
            if (arg1 != -1) {
                method375(-62, -107, 65, -78, -55, 78);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)V", line = 98)
    public static final void method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field638++;
        int var9 = arg4 + 1;
        class94.method740(class306.field4574[arg4], arg5, arg0, arg3, false);
        int var8 = arg1 - 1;
        class94.method740(class306.field4574[arg1], arg5, arg0, arg3, false);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class306.field4574[var6];
            var7[arg5] = var7[arg0] = arg3;
        }
        if (arg2 != -18403) {
            method372(-105, null);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBII)V", line = 122)
    public static final void method376(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            class97.method758(class289.field4334, false);
            class486.field7158++;
        }
        field632++;
        if (arg1 != 20) {
            return;
        }
        if (arg0 == 1) {
            class405.field6099++;
            class97.method758(class11.field109, false);
        }
        class43.field559.method2753(45, class49.field630.method1879(82, true) ? 1 : 0);
        class43.field559.method2777((byte) 74, class267.field3979 + arg2);
        class43.field559.method2739(class241.field3358 + arg3, (byte) -41);
        class94.field1462 = false;
        class504.field7423 = arg2;
        class182.field2702 = arg3;
        class125.method920(15);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 163)
    public static void method377(int arg0) {
        field639 = null;
        field634 = null;
        if (arg0 >= -124) {
            field643 = null;
        }
        field645 = null;
        field642 = null;
        field643 = null;
        field646 = null;
        field647 = null;
        field641 = null;
        field648 = null;
    }
}
