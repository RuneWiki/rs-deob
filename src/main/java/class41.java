import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 extends class202 {

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Ljava/lang/String;")
    public static String field756 = "K";

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field769 = 20;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "Ljava/lang/String;")
    public static String field776 = "shake:";

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field771 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lkg;")
    public class136 field779;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lff;")
    public class18 field754;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lqh;")
    public static class201 field770;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Llh;")
    public class288 field765;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lcf;")
    public class93 field758;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)Z")
    public static final boolean method351(int arg0, int arg1, int arg2, int arg3) {
        if (class188.method1286(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class204.method1409(var4 + 1, class124.field2012[arg0][arg1][arg2] + arg3, var5 + 1) && class204.method1409(var4 + 128 - 1, class124.field2012[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class204.method1409(var4 + 128 - 1, class124.field2012[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class204.method1409(var4 + 1, class124.field2012[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILik;IJ)Z")
    public static final boolean method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class260 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class221.method1511(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lvk;")
    public static final class35 method353(int arg0, int arg1) {
        field760++;
        class35 var2 = (class35) class199.field3182.method480((long) arg0, 70);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class198.field3153.method1357(arg0, 16, -1);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method290(19552, new class221(var3));
        }
        if (arg1 > -81) {
            return null;
        } else {
            class199.field3182.method474((long) arg0, (byte) 103, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public final void method354(byte arg0) {
        this.field765 = null;
        if (arg0 >= -111) {
            method351(-48, -124, 117, -85);
        }
        this.field758 = null;
        this.field779 = null;
        this.field754 = null;
        field768++;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public static void method355(int arg0) {
        if (arg0 != -30325) {
            method353(-124, -110);
        }
        field756 = null;
        field776 = null;
        field770 = null;
    }
}
