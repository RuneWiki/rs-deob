import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class91 extends class154 {

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "[I")
    public static int[] field1478 = new int[100];

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "Lp;")
    public static class280 field1482 = class18.method140((byte) -123, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "Lp;")
    public static class280 field1483 = class18.method140((byte) -124, "classement ");

    @OriginalMember(owner = "client!od", name = "ub", descriptor = "Lp;")
    public static class280 field1485 = class18.method140((byte) -121, ":");

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "[[I")
    public static int[][] field1484;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "(I)V")
    public static void method652(int arg0) {
        if (arg0 != 31722) {
            method654(-74, -46, -15, -100, -82);
        }
        field1483 = null;
        field1484 = null;
        field1482 = null;
        field1478 = null;
        field1485 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field1481;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357 && this.method1088(-125)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg1 % super.field2675 * super.field2675;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class264.field4654; ++var8) {
                int var9 = super.field2669[var8 % super.field2662 + var6];
                var7[var8] = class214.method1432(var9 << 4, 4080);
                var5[var8] = class214.method1432(var9, 65280) >> 4;
                var4[var8] = class214.method1432(var9 >> 12, 4080);
            }
        }
        if (!arg0) {
            field1480 = -100;
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
    public static final void method653(int arg0, int arg1) {
        ++field1479;
        class201 var2 = (class201) class103.field1708.method150((long) arg1, 111);
        if (var2 != null) {
            var2.method1146(26159);
            int var3 = -22 % ((-56 - arg0) / 62);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 4080) {
            method654(83, 77, -89, -77, 97);
        }
        ++field1477;
        if (~class89.field1440 >= ~arg4 && ~arg4 >= ~class12.field249) {
            int var5 = class76.method564(class36.field654, -109, arg3, class249.field4360);
            int var6 = class76.method564(class36.field654, arg1 ^ -3984, arg0, class249.field4360);
            class127.method876(var6, arg2, var5, 4096, arg4);
        }
    }
}
