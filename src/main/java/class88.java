import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class88 {

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "[I")
    public static int[] field1246 = new int[200];

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
    public static boolean field1244 = false;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "[B")
    public byte[] field1245;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "[B")
    public byte[] field1253;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Z")
    public static final boolean method611(int arg0, int arg1) {
        if (arg1 != 2) {
            field1244 = true;
        }
        field1255++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BZIIIIZ)V")
    public static final void method612(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 <= 49) {
            return;
        }
        field1249++;
        if (arg5 <= arg2) {
            return;
        }
        int var7 = (arg2 + arg5) / 2;
        int var8 = arg2;
        class370 var9 = class462.field6425[var7];
        class462.field6425[var7] = class462.field6425[arg5];
        class462.field6425[arg5] = var9;
        for (int var10 = arg2; var10 < arg5; var10++) {
            if (class327.method2091(arg6, arg3, arg4, var9, class462.field6425[var10], arg1, 0) <= 0) {
                class370 var11 = class462.field6425[var10];
                class462.field6425[var10] = class462.field6425[var8];
                class462.field6425[var8++] = var11;
            }
        }
        class462.field6425[arg5] = class462.field6425[var8];
        class462.field6425[var8] = var9;
        method612((byte) 111, arg1, arg2, arg3, arg4, var8 - 1, arg6);
        method612((byte) 61, arg1, var8 + 1, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static void method613(int arg0) {
        if (arg0 == 0) {
            field1246 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IFFF)F")
    public static final float method614(int arg0, float arg1, float arg2, float arg3) {
        int var4 = -47 / ((arg0 + 21) / 56);
        field1242++;
        return (arg1 - arg2) * arg3 + arg2;
    }
}
