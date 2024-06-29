import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class143 {

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field2329;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[F")
    public static float[] field2325 = new float[2];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lin;")
    public static class380 field2324 = new class380(97, 4);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lin;")
    public static class380 field2331 = new class380(26, 6);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2332;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[Lmq;")
    public static class85[] field2327;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZZIIIII)V")
    public static final void method1147(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 > arg5) {
            int var7 = (arg5 + arg3) / 2;
            int var8 = arg5;
            class422 var9 = class556.field7710[var7];
            class556.field7710[var7] = class556.field7710[arg3];
            class556.field7710[arg3] = var9;
            for (int var10 = arg5; var10 < arg3; var10++) {
                if (class591.method3465(class556.field7710[var10], 0, arg2, arg0, arg4, var9, arg1) <= 0) {
                    class422 var11 = class556.field7710[var10];
                    class556.field7710[var10] = class556.field7710[var8];
                    class556.field7710[var8++] = var11;
                }
            }
            class556.field7710[arg3] = class556.field7710[var8];
            class556.field7710[var8] = var9;
            method1147(arg0, arg1, arg2, var8 - 1, arg4, arg5, -102);
            method1147(arg0, arg1, arg2, arg3, arg4, var8 + 1, -84);
        }
        field2323++;
        if (arg6 >= -44) {
            field2331 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)I")
    public static final int method1148(int arg0, int arg1) {
        return class722.field10080 == null ? 0 : class722.field10080[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Lig;")
    public final class143 method1149(byte arg0, int arg1) {
        field2322++;
        if (arg0 != -31) {
            field2327 = null;
        }
        return new class143(this.field2328, arg1, this.field2326, this.field2330);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method1150(int arg0) {
        field2325 = null;
        field2332 = null;
        field2331 = null;
        if (arg0 != 2) {
            field2327 = null;
        }
        field2324 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIII)V")
    public class143(int arg0, int arg1, int arg2, int arg3) {
        this.field2328 = arg0;
        this.field2330 = arg3;
        this.field2326 = arg2;
        this.field2329 = arg1;
    }
}
