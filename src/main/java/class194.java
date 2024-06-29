import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class194 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Loc;")
    public static class151 field3465 = class137.method873(2, "Clientscript error in: ");

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[[B")
    public static byte[][] field3469 = new byte[250][];

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lwd;")
    public static class232 field3464;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILwd;II)V")
    public static final void method1218(int arg0, class232 arg1, int arg2, int arg3) {
        field3467++;
        if (arg3 != 2048) {
            field3469 = null;
        }
        if (class222.field3860 != null || class225.field3917 || (arg1 == null || class179.method1132(arg1, 103) == null)) {
            return;
        }
        class222.field3860 = arg1;
        class63.field1227 = class179.method1132(arg1, 113);
        class2.field59 = arg0;
        class31.field650 = 0;
        class190.field3358 = false;
        class31.field646 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 2048 - arg3 & 0x7FF;
        field3466++;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        if (arg1 != 28646) {
            return;
        }
        int var10 = arg6;
        int var11 = 0;
        if (var7 != 0) {
            int var12 = class61.field1191[var7];
            int var13 = class61.field1208[var7];
            int var14 = var11 * var13 - arg6 * var12 >> 16;
            var10 = arg6 * var13 + var11 * var12 >> 16;
            var11 = var14;
        }
        if (var8 != 0) {
            int var15 = class61.field1208[var8];
            int var16 = class61.field1191[var8];
            int var17 = var9 * var15 + var10 * var16 >> 16;
            var10 = var10 * var15 - var9 * var16 >> 16;
            var9 = var17;
        }
        class147.field2640 = arg4;
        class90.field1650 = arg0 - var9;
        class37.field779 = arg3;
        class181.field3267 = arg5 - var10;
        class113.field2011 = arg2 - var11;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method1220(int arg0) {
        if (arg0 >= -8) {
            method1220(-91);
        }
        field3464 = null;
        field3465 = null;
        field3469 = null;
    }
}
