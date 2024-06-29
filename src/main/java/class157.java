import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class157 extends class138 {

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field2499 = 0;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Lck;")
    public static class119 field2503 = class298.method1987((byte) 6, "S3 Graphics");

    @OriginalMember(owner = "client!n", name = "G", descriptor = "[I")
    public static int[] field2502 = new int[1000];

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
    public static int[] field2505;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 11)
    public static void method1004(int arg0) {
        field2505 = null;
        field2503 = null;
        if (arg0 >= -117) {
            method1005(76, (class145[]) null);
        }
        field2502 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I[Lib;)V", line = 24)
    public static final void method1005(int arg0, class145[] arg1) {
        class25.field376[arg0] = arg1;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V", line = 33)
    public static final void method1006(int arg0) {
        for (int var1 = -1; var1 < class233.field3757; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class226.field3609[var1];
            }
            class292 var3 = class23.field346[var2];
            if (var3 != null && var3.field4997 > 0) {
                var3.field4997--;
                if (var3.field4997 == 0) {
                    var3.field4994 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < field2499; var4++) {
            int var5 = class23.field348[var4];
            class163 var6 = class70.field1103[var5];
            if (var6 != null && var6.field4997 > 0) {
                var6.field4997--;
                if (var6.field4997 == 0) {
                    var6.field4994 = null;
                }
            }
        }
        field2500++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBI)I", line = 101)
    public static final int method1007(int arg0, int arg1, byte arg2, int arg3) {
        field2501++;
        int var4 = arg3 / arg1;
        int var5 = arg1 - 1 & arg3;
        if (arg2 != 105) {
            method1007(-54, -15, (byte) 64, -71);
        }
        int var6 = arg1 - 1 & arg0;
        int var7 = arg0 / arg1;
        int var8 = class190.method1203(var4, var7, arg2 ^ 0xFFFFFF96);
        int var9 = class190.method1203(var4 + 1, var7, -1);
        int var10 = class190.method1203(var4, var7 + 1, -1);
        int var11 = class190.method1203(var4 + 1, var7 + 1, -1);
        int var12 = class215.method1352(var9, arg1, -1981784127, var5, var8);
        int var13 = class215.method1352(var11, arg1, -1981784127, var5, var10);
        return class215.method1352(var13, arg1, -1981784127, var6, var12);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method447(int arg0);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)Z")
    public abstract boolean method448(byte arg0);
}
