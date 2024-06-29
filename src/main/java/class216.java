import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class216 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lsg;")
    public static class30 field3942 = class167.method1221((byte) 33, "k");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lsg;")
    public static class30 field3943 = class167.method1221((byte) 33, "mapdots");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[[S")
    public static short[][] field3947;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1578(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3944++;
        int var8 = arg6 + arg4;
        int var9 = arg0 - arg4;
        int var10 = arg3 + arg4;
        for (int var11 = arg6; var11 < var8; var11++) {
            class194.method1405(true, class121.field2390[var11], arg1, arg3, arg5);
        }
        for (int var12 = arg0; var12 > var9; var12--) {
            class194.method1405(true, class121.field2390[var12], arg1, arg3, arg5);
        }
        int var13 = arg1 - arg4;
        if (arg2 != 63) {
            return;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class121.field2390[var14];
            class194.method1405(true, var15, var10, arg3, arg5);
            class194.method1405(true, var15, var13, var10, arg7);
            class194.method1405(true, var15, arg1, var13, arg5);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIZII)V")
    public static final void method1579(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class132.field2605 = arg4;
        class53.field1185 = arg1;
        field3945++;
        class223.field4002 = arg2;
        class142.field2750 = arg5;
        class52.field1162 = arg0;
        if (arg3) {
            method1580(-25);
        }
        if (class53.field1185 >= 100) {
            int var6 = class142.field2750 * 128 + 64;
            int var7 = class223.field4002 * 128 + 64;
            int var8 = class31.method303(var7, var6, class159.field2998, -4) - class52.field1162;
            int var9 = var8 - class64.field1419;
            int var10 = var7 - class207.field3725;
            int var11 = var6 - class150.field2849;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class276.field4820 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class123.field2422 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class276.field4820 < 128) {
                class276.field4820 = 128;
            }
            if (class276.field4820 > 383) {
                class276.field4820 = 383;
            }
        }
        class215.field3931 = 2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1580(int arg0) {
        int var1 = 75 / ((37 - arg0) / 56);
        field3943 = null;
        field3942 = null;
        field3947 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILmc;)[Lgj;")
    public static final class192[] method1581(int arg0, int arg1, class151 arg2) {
        if (arg1 != -4333) {
            field3943 = null;
        }
        field3941++;
        return class41.method433(arg0, 0, arg2) ? class137.method1030(13588) : null;
    }
}
