import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class784 {

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "[[I")
    public static int[][] field10781 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field10780;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field10782;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field10783;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public static int field10784;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "[I")
    public static int[] field10779;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III[BZILkv;I)Lbo;")
    public static final class759 method4293(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, int arg5, class280 arg6, int arg7) {
        field10780++;
        if (arg5 != 34037) {
            method4297(false, -14);
        }
        if (!arg6.field4218 && (!class315.method2071(-126, arg7) || !class315.method2071(arg5 - 34164, arg1))) {
            return arg6.field4291 ? new class759(arg6, 34037, arg0, arg7, arg1, arg4, arg3, arg2) : new class759(arg6, arg0, arg7, arg1, class89.method631((byte) -110, arg7), class89.method631((byte) -68, arg1), arg3, arg2);
        } else {
            return new class759(arg6, 3553, arg0, arg7, arg1, arg4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BIIII)V")
    public static final void method4294(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field10782++;
        if (arg0 == 59 && class450.field6463 <= arg4 && class285.field4372 >= arg4) {
            int var5 = class387.method2374(1, arg1, class738.field10297, class414.field5846);
            int var6 = class387.method2374(1, arg2, class738.field10297, class414.field5846);
            class185.method1376(arg0 - 26884, arg3, var6, var5, arg4);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method4295(int arg0) {
        field10781 = null;
        field10779 = null;
        if (arg0 >= -14) {
            method4295(-94);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILha;Lwq;II)V")
    public static final void method4296(int arg0, int arg1, class66 arg2, class176 arg3, int arg4, int arg5) {
        field10784++;
        for (int var6 = 7; var6 >= 0; var6--) {
            for (int var8 = 127; var8 >= 0; var8--) {
                int var9 = var8 & 0x7F | var6 & 0x7 << 7 | (arg5 & 0x3F) << 10;
                class211.method1486(false, true, (byte) -128);
                int var10 = class444.field6323[var9];
                class209.method1485(false, (byte) 30, true);
                arg2.method474((arg3.field2673 * var8 >> 7) + arg1, ((7 - var6) * arg3.field2664 >> 3) + arg4, (arg3.field2673 >> 7) + 1, (arg3.field2664 >> 3) + 1, var10, 0);
            }
        }
        int var7 = 56 % ((arg0 + 38) / 32);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
    public static final void method4297(boolean arg0, int arg1) {
        field10783++;
        if (arg0) {
            class87.field1135 = arg1;
            class49.field707.method2364(1);
        }
    }
}
