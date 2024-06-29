import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class108 extends class53 {

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Lp;")
    public static class280 field1776 = class18.method140((byte) -117, " ");

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field1787 = 0;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Lp;")
    public static class280 field1781 = class18.method140((byte) -120, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field1783 = 0;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "[Llk;")
    public static class82[] field1777;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIZI)V")
    public static final void method751(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 - arg4 >= class89.field1440 && class12.field249 >= (arg0 + arg4) && (arg2 - arg4) >= class36.field654 && (arg2 + arg4) <= class249.field4360) {
            class107.method745(arg2, arg4, arg0, arg1, 0);
        } else {
            class32.method278(arg1, arg2, 122, arg4, arg0);
        }
        if (arg3) {
            method751(-8, 40, -81, true, -61);
        }
        field1782++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIZIIII)V")
    public static final void method752(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 <= 61) {
            method753(false);
        }
        class152.field2625 = arg3;
        field1779++;
        class82.field1356 = arg4;
        class144.field2520 = arg6;
        class24.field435 = arg1;
        class97.field1560 = arg5;
        if (arg2 && class82.field1356 >= 100) {
            class78.field1273 = class152.field2625 * 128 + 64;
            client.field2695 = class144.field2520 * 128 + 64;
            class22.field406 = class158.method1123(class231.field4013, client.field2695, -6230, class78.field1273) - class24.field435;
        }
        class4.field113 = 2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method753(boolean arg0) {
        field1777 = null;
        field1781 = null;
        field1776 = null;
        if (arg0) {
            field1776 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
    public final void method754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1790++;
        int var6 = this.field1788 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = this.field1780 << 3;
        if (arg2 == 903091299) {
            int var9 = (arg3 << 4) + (var8 & 0xF);
            this.method761(var6, var8, var7, var9, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public abstract void method755(int arg0, int arg1);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public abstract void method756(int arg0, int arg1);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V")
    public abstract void method757(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
    public abstract void method758(int arg0, int arg1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public abstract void method759(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V")
    public abstract void method760(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIIII)V")
    public abstract void method761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
