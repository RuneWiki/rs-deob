import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class21 extends class366 {

    @OriginalMember(owner = "client!o", name = "C", descriptor = "[I")
    public static int[] field271 = new int[1000];

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field275 = -1;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "F")
    public static float field270;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method116(int arg0) {
        field271 = null;
        if (arg0 != 25453) {
            method116(48);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method117(int arg0) {
        class243.field3604.method102((byte) -111);
        if (arg0 <= -17) {
            field273++;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILsg;Lbr;Lvj;ZI)V")
    public static final void method118(int arg0, int arg1, int arg2, class226 arg3, class223 arg4, class256 arg5, boolean arg6, int arg7) {
        field272++;
        if (arg5 == null) {
            return;
        }
        int var8;
        if (class336.field4878 == 4) {
            var8 = (int) class358.field5176 & 0x3FFF;
        } else {
            var8 = (int) class358.field5176 + class63.field842 & 0x3FFF;
        }
        int var9 = Math.max(arg4.field3250 / 2, arg4.field3282 / 2) + 10;
        int var10 = arg0 * arg0 + arg7 * arg7;
        if (arg6 || var10 > var9 * var9) {
            return;
        }
        int var11 = class447.field6381[var8];
        int var12 = class447.field6390[var8];
        if (class336.field4878 != 4) {
            var12 = var12 * 256 / (class261.field3863 + 256);
            var11 = var11 * 256 / (class261.field3863 + 256);
        }
        int var13 = arg0 * var12 + arg7 * var11 >> 15;
        int var14 = arg7 * var12 - (arg0 * var11) >> 15;
        arg5.method78(arg4.field3250 / 2 + arg2 + var13 - (arg5.method83() / 2), arg1 - -(arg4.field3282 / 2) - var14 + -(arg5.method75() / 2), arg3, arg2, arg1);
    }
}
