import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "J")
    public static long field921 = 0L;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field926 = new int[] { 0, 0, -2, 0, 10, 6, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 5, 11, 2, 0, 0, 0, 0, 0, 1, 5, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, -2, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 10, 0, 4, 0, 0, 0, 0, 24, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, -2, 0, 0, 3, 11, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 6, 0, 2, 0, -2, 0, -2, 0, 0, 0, 0, 0, 2, -2, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1, 8, 0, 0, 0, 2, 7, 6, 0, 7, 0, 6, 0, 0, 0, 0, 0, 6, -1, 6, 2, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, -2, 0, 0, 0, 6, 0, 4, 6, 0, 0, 0, 0, 0, 0, 0, 2, 6, 0, 0, 8, 15, 0, 0, 0, 12, 0, 0, 0, -2, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lke;")
    public static class74 field929;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public static int[] field922;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[S")
    public static short[] field925;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILff;Lff;)V")
    public static final void method305(int arg0, class42 arg1, class42 arg2) {
        class128.field2938 = arg2;
        if (arg0 != 0) {
            method307((byte) -105, true);
        }
        class36.field915 = arg1;
        field927++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static void method306(boolean arg0) {
        if (arg0) {
            method305(-51, null, null);
        }
        field929 = null;
        field925 = null;
        field926 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BZ)V")
    public static final void method307(byte arg0, boolean arg1) {
        field930++;
        if (class89.field2151 == null) {
            return;
        }
        try {
            class105 var2 = new class105(4);
            var2.method800(-101, arg1 ? 2 : 3);
            var2.method798(68, 0);
            class89.field2151.method409((byte) -105, var2.field2405, 0, 4);
            if (arg0 >= -15) {
                field928 = 87;
            }
        } catch (IOException var4) {
            try {
                class89.field2151.method408((byte) 112);
            } catch (Exception var3) {
            }
            class89.field2151 = null;
            class9.field205++;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvd;IIIII)V")
    public static final void method308(class150 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field924++;
        int var6 = arg2 * arg2 + arg4 * arg4;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = class103.field2375 + class153.field3460 & 0x7FF;
            int var8 = class58.field1354[var7];
            int var9 = class58.field1346[var7];
            int var10 = var9 * 256 / (class153.field3452 + 256);
            int var11 = var8 * 256 / (class153.field3452 + 256);
            int var12 = arg2 * var11 + arg4 * var10 >> 16;
            int var13 = arg2 * var10 - arg4 * var11 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            class153.field3449.method1106(arg3 + var16 + 94 + 4 - 10, -var17 + arg1 - -83 - 20, 20, 20, 15, 15, var14, 256);
        } else {
            class92.method735(arg4, arg2, arg0, arg5 ^ 0x114, arg3, arg1);
        }
        if (arg5 != 20) {
            field922 = null;
        }
    }
}
