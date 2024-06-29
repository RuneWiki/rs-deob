import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class49 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Li;")
    public static class88 field914 = class208.method1425(105, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "S")
    public static short field921 = 205;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Li;")
    public static class88 field915 = class208.method1425(105, ")4slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lq;")
    public static class174 field923 = null;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Li;")
    public static class88 field920 = class208.method1425(105, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field919 = 0;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Li;")
    private static class88 field916 = class208.method1425(105, "Loading config )2 ");

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Li;")
    public static class88 field918 = field916;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lp;")
    public static class163 field912;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Lcc;")
    public static class26 field917;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class67.field1207 <= arg6 && class12.field183 >= arg0 && arg3 >= field919 && arg7 <= class18.field279) {
            class192.method1335(arg5, arg3, true, arg7, arg4, arg6, arg0, arg1);
        } else {
            class147.method988(arg5, arg0, arg3, arg6, arg7, arg4, 86, arg1);
        }
        field922++;
        int var8 = 6 % ((arg2 + 63) / 44);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lrh;I)V")
    public static final void method369(class193 arg0, int arg1) {
        field913++;
        for (int var2 = 0; var2 < class221.field4171.length; var2++) {
            class221.field4171[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * 128.0D * Math.random());
            class221.field4171[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class113.field2051[var15] = (class221.field4171[var15 + 1] + class221.field4171[var15 - 1] + class221.field4171[var15 - -128] + class221.field4171[var15 - 128]) / 4;
                }
            }
            int[] var13 = class221.field4171;
            class221.field4171 = class113.field2051;
            class113.field2051 = var13;
        }
        if (arg1 != 5000) {
            method368(-9, 68, -123, 10, -51, -110, 78, -56);
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2439; var7++) {
            for (int var8 = 0; var8 < arg0.field2436; var8++) {
                if (arg0.field3706[var6++] != 0) {
                    int var9 = var8 + arg0.field2440 + 16;
                    int var10 = var7 + arg0.field2434 + 16;
                    int var11 = var9 + (var10 << 7);
                    class221.field4171[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method370(byte arg0) {
        field916 = null;
        field923 = null;
        if (arg0 != 122) {
            method370((byte) -123);
        }
        field917 = null;
        field918 = null;
        field912 = null;
        field914 = null;
        field920 = null;
        field915 = null;
    }
}
