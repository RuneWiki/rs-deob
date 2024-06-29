import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class18 extends class264 {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    private int field217 = -32768;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Leh;")
    public static class137 field224;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[[[B")
    public static byte[][][] field218;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public static final int method94(int arg0, int arg1) {
        field215++;
        if (arg1 != 0) {
            field224 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method95(int arg0) {
        field218 = null;
        if (arg0 != 255) {
            field218 = null;
        }
        field224 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)I")
    public static final int method96(int arg0, int arg1) {
        if (arg0 < 45) {
            return 73;
        } else {
            field225++;
            return arg1 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Leh;IIZ)Lnf;")
    public static final class227 method97(class137 arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field226++;
            return class111.method714(arg1, arg2, arg0, 101) ? class239.method1685(91) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public static final void method98(int arg0) {
        field214++;
        if (class51.field662 || class77.field969 == 2) {
            return;
        }
        try {
            class277.method1848(class222.field3583, 2795, "tbrefresh");
            if (arg0 > -54) {
                field224 = null;
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field219++;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public static final void method100(int arg0) {
        if (arg0 >= -58) {
            method97((class137) null, 105, 99, false);
        }
        field220++;
        class161.field2566.method1701((byte) 95);
        class118.field1677.method1701((byte) 110);
        class235.field3879.method1701((byte) 77);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
        field223++;
        class158 var13 = class256.method1753(-2, this.field222).method653(-1, 0, (byte) -25, this.field216, (class134) null, (class165) null, 0);
        if (var13 != null) {
            var13.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field217 = var13.method102();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
    public final int method102() {
        field221++;
        return this.field217;
    }
}
