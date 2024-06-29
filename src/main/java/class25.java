import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class179 {

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Ljd;")
    public static class86 field598 = class122.method868("welle2:", true);

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Ljd;")
    public static class86 field602 = class122.method868(":duelstake:", true);

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[Z")
    public static boolean[] field606 = new boolean[5];

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Loj;")
    public static class155 field604;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lkh;")
    public static class44 field601;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[I")
    public static int[] field597;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method177(byte arg0) {
        field597 = null;
        field602 = null;
        field598 = null;
        field606 = null;
        if (arg0 != -19) {
            method178(22, 107);
        }
        field604 = null;
        field601 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Lwj;")
    public static final class6 method178(int arg0, int arg1) {
        if (arg0 < 60) {
            field597 = null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field600++;
        if (class108.field2070[var2] == null || class108.field2070[var2][var3] == null) {
            boolean var4 = class179.method1258(var2, (byte) -36);
            if (!var4) {
                return null;
            }
        }
        return class108.field2070[var2][var3];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V")
    public static final void method179(boolean arg0, int arg1) {
        field596++;
        if (arg1 != -23565) {
            method177((byte) -39);
        }
        if (class221.field3971 != arg0) {
            class221.field3971 = arg0;
            class121.method853(arg1 + 23472);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BZ)Lwk;")
    public static final class259 method180(byte[] arg0, boolean arg1) {
        field605++;
        if (!arg1) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            class148 var2 = new class148(arg0, class138.field2628, class1.field6, class24.field592, class191.field3393, class213.field3857);
            class127.method894((byte) 20);
            return var2;
        }
    }
}
