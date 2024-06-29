import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class60 {

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Loa;")
    public static class99 field1004 = class221.method1463(2844, "sch-Utteln:");

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[[I")
    public static int[][] field1002;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    public abstract int method330(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public abstract void method331(int arg0);

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1000++;
        int var8 = class166.method1127(class137.field2414, arg0, class178.field3101, 8946);
        int var9 = class166.method1127(class137.field2414, arg7, class178.field3101, 8946);
        int var10 = class166.method1127(class79.field1395, arg6, class197.field3437, 8946);
        int var11 = class166.method1127(class79.field1395, arg2, class197.field3437, arg5 ^ 0xFFFF8EE7);
        if (arg5 != -21483) {
            field1003 = 124;
        }
        int var12 = class166.method1127(class137.field2414, arg0 + arg1, class178.field3101, 8946);
        int var13 = class166.method1127(class137.field2414, arg7 - arg1, class178.field3101, arg5 + 30429);
        for (int var14 = var8; var14 < var12; var14++) {
            class175.method1174(class124.field2177[var14], arg3, -7, var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class175.method1174(class124.field2177[var15], arg3, -7, var10, var11);
        }
        int var16 = class166.method1127(class79.field1395, arg6 + arg1, class197.field3437, 8946);
        int var17 = class166.method1127(class79.field1395, arg2 - arg1, class197.field3437, arg5 + 30429);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class124.field2177[var18];
            class175.method1174(var19, arg3, arg5 + 21476, var10, var16);
            class175.method1174(var19, arg4, -7, var16, var17);
            class175.method1174(var19, arg3, -7, var17, var11);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method404(byte arg0) {
        field1002 = null;
        if (arg0 >= -41) {
            method403(-111, -84, -27, 48, -92, -79, 107, -119);
        }
        field1004 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public static final void method405(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -7757) {
            return;
        }
        field1001++;
        class9 var5 = (class9) class277.field4868.method1550(true, (long) arg2);
        if (var5 == null) {
            var5 = new class9();
            class277.field4868.method1544((byte) 110, (long) arg2, var5);
        }
        if (var5.field66.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field66.length; var8++) {
                var6[var8] = var5.field66[var8];
                var7[var8] = var5.field69[var8];
            }
            for (int var9 = var5.field66.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field66 = var6;
            var5.field69 = var7;
        }
        var5.field66[arg1] = arg3;
        var5.field69[arg1] = arg0;
    }
}
