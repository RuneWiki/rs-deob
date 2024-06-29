import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class187 {

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2896 = 0;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[[I")
    public static int[][] field2898 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ldf;")
    public static class56 field2892;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[[Z")
    public static boolean[][] field2893;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method1269(boolean arg0) {
        field2893 = null;
        field2898 = null;
        if (arg0) {
            field2892 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1270(byte arg0, String arg1) {
        if (arg0 > -32) {
            return -81;
        } else {
            field2891++;
            return arg1.length() + 1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIB)I")
    public static final int method1271(int arg0, int arg1, int arg2, byte arg3) {
        field2894++;
        int var4 = arg1 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg0 & arg2 - 1;
        int var7 = arg0 / arg2;
        int var8 = class292.method2039(var5, -15529, var7);
        int var9 = class292.method2039(var5 + 1, -15529, var7);
        int var10 = class292.method2039(var5, -15529, var7 + 1);
        int var11 = class292.method2039(var5 + 1, -15529, var7 + 1);
        if (arg3 == 67) {
            int var12 = class57.method348(var4, -2048, arg2, var8, var9);
            int var13 = class57.method348(var4, -2048, arg2, var10, var11);
            return class57.method348(var6, -2048, arg2, var12, var13);
        } else {
            return 108;
        }
    }
}
