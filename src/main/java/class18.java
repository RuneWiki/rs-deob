import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class18 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lob;")
    private static class141 field315 = class175.method1195(40, "level)2");

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lob;")
    public static class141 field317 = field315;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field322 = -1;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[S")
    public static short[] field323 = new short[] { 40, 30, 29, 44, 2, 19, 16, 6 };

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
    public static volatile boolean field324 = false;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
    public static int[] field321;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field325++;
        int var8 = class106.method703(class35.field698, class130.field2470, true, arg4);
        int var9 = class106.method703(class35.field698, class130.field2470, true, arg7);
        int var10 = class106.method703(class68.field1323, class136.field2590, true, arg2);
        int var11 = class106.method703(class68.field1323, class136.field2590, true, arg1);
        int var12 = class106.method703(class35.field698, class130.field2470, true, arg4 + arg0);
        int var13 = class106.method703(class35.field698, class130.field2470, true, arg7 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class180.method1217(var11, (byte) 52, var10, arg6, class41.field805[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class180.method1217(var11, (byte) 52, var10, arg6, class41.field805[var15]);
        }
        int var16 = class106.method703(class68.field1323, class136.field2590, true, arg0 + arg2);
        int var17 = class106.method703(class68.field1323, class136.field2590, true, arg1 - arg0);
        int var18 = var12;
        if (arg5 != 19) {
            method110(false);
        }
        while (var18 <= var13) {
            int[] var19 = class41.field805[var18];
            class180.method1217(var16, (byte) 52, var10, arg6, var19);
            class180.method1217(var17, (byte) 52, var16, arg3, var19);
            class180.method1217(var11, (byte) 52, var17, arg6, var19);
            var18++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZLra;)Lob;")
    public static final class141 method109(int arg0, boolean arg1, class170 arg2) {
        field320++;
        if (!arg1) {
            method110(false);
        }
        if (!class25.method177(class26.method180(arg2, 18125), arg0, 1) && arg2.field3288 == null) {
            return null;
        } else if (arg2.field3404 == null || arg2.field3404.length <= arg0 || arg2.field3404[arg0] == null || arg2.field3404[arg0].method924(38).method908(false) == 0) {
            return class97.field1923 ? class220.method1422(new class141[] { class7.field113, class78.method543((byte) 93, arg0) }, -3) : null;
        } else {
            return arg2.field3404[arg0];
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static final void method110(boolean arg0) {
        class165.field3199 = 0;
        field319++;
        class135.field2561 = 0;
        class41.method268((byte) -106);
        client.method222((byte) -116);
        class59.method397(32);
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class135.field2561; var1++) {
            int var3 = class204.field3913[var1];
            if (class20.field344 != class10.field172[var3].field3885) {
                class10.field172[var3].field2507 = null;
                class10.field172[var3] = null;
            }
        }
        if (class187.field3632 != class156.field3014.field2865) {
            throw new RuntimeException("gnp1 pos:" + class156.field3014.field2865 + " psize:" + class187.field3632);
        }
        for (int var2 = 0; var2 < class195.field3738; var2++) {
            if (class10.field172[class203.field3888[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class195.field3738);
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method111(byte arg0) {
        if (arg0 < 49) {
            method110(false);
        }
        field315 = null;
        field321 = null;
        field317 = null;
        field323 = null;
    }
}
