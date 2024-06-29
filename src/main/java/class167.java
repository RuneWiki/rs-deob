import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class167 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lia;")
    public static class257 field2903 = class28.method234(-96, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public static int[] field2904 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lvb;")
    public static class226 field2905;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method1134(int arg0, int arg1) {
        if (arg0 != 2) {
            return;
        }
        class42.field852 = arg1;
        if (class217.field3675 == 40) {
            class209.method1404((byte) -38, 8);
        } else {
            class209.method1404((byte) -38, 10);
        }
        field2906++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method1135(int arg0) {
        if (arg0 != -6162) {
            field2905 = null;
        }
        field2904 = null;
        field2905 = null;
        field2903 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILme;ILte;)V")
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, class44 arg4, int arg5, class184 arg6) {
        field2902++;
        if (arg6 == null) {
            return;
        }
        if (arg0 >= -83) {
            method1136(-25, 73, 24, -33, (class44) null, 49, (class184) null);
        }
        int var7 = arg2 * arg2 + (arg5 * arg5);
        int var8 = class25.field479 + class215.field3648 & 0x7FF;
        int var9 = Math.max(arg4.field926 / 2, arg4.field981 / 2) + 10;
        if ((var9 * var9) < var7) {
            return;
        }
        int var10 = class101.field1871[var8];
        int var11 = class101.field1872[var8];
        int var12 = var10 * 256 / (class95.field1796 + 256);
        int var13 = var11 * 256 / (class95.field1796 + 256);
        int var14 = arg5 * var12 - (arg2 * var13) >> 16;
        int var15 = arg2 * var12 + arg5 * var13 >> 16;
        ((class190) arg6).method1284(arg1 + (arg4.field926 / 2) + var15 - (arg6.field3194 / 2), arg4.field981 / 2 + -(arg6.field3198 / 2) + -var14 + arg3, arg4.field1010, arg4.field974);
    }
}
