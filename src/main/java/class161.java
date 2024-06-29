import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class161 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[Lhf;")
    public static class225[] field2718 = new class225[6];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
    public static int[] field2716;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 8)
    public static void method1155(int arg0) {
        field2716 = null;
        field2718 = null;
        if (arg0 != -18) {
            field2718 = (class225[]) null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method1157(boolean arg0) {
        int var1 = class137.field2340;
        int var2 = class351.field5616;
        field2717++;
        int var3 = class232.field3802;
        int var4 = 6116423;
        int var5 = class278.field4528;
        if (class241.field4016) {
            class337.method2378(var1, var2, var5, var3, var4);
            class337.method2378(var1 + 1, var2 + 1, var5 - 2, 16, 0);
            class337.method2387(var1 + 1, var2 - -18, var5 - 2, var3 + -19, 0);
        } else {
            class270.method1894(var1, var2, var5, var3, var4);
            class270.method1894(var1 + 1, var2 - -1, var5 - 2, 16, 0);
            class270.method1904(var1 + 1, var2 + 18, var5 - 2, var3 + -19, 0);
        }
        class332.field5297.method619(class20.field518, var1 + 3, var2 + 14, var4, -1);
        int var6 = class73.field1339;
        if (arg0) {
            return;
        }
        int var7 = class26.field662;
        for (int var8 = 0; var8 < class137.field2343; var8++) {
            int var9 = (class137.field2343 - (var8 + 1)) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var5 && var7 > (var9 - 13) && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class332.field5297.method619(class142.method972(var8, (byte) 37), var1 + 3, var9, var10, 0);
        }
        class192.method1331(class137.field2340, -18359, class232.field3802, class351.field5616, class278.field4528);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lek;ILek;)I", line = 81)
    public static final int method1158(class206 arg0, int arg1, class206 arg2) {
        field2719++;
        if (arg1 != 1) {
            field2716 = (int[]) null;
        }
        int var3 = 0;
        if (arg2.method1401(class251.field4130, -2689)) {
            var3++;
        }
        if (arg2.method1401(class50.field1033, -2689)) {
            var3++;
        }
        if (arg2.method1401(class225.field3705, -2689)) {
            var3++;
        }
        if (arg0.method1401(class251.field4130, -2689)) {
            var3++;
        }
        if (arg0.method1401(class50.field1033, arg1 - 2690)) {
            var3++;
        }
        if (arg0.method1401(class225.field3705, arg1 - 2690)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method1153(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Loh;")
    public abstract class20 method1154(int arg0);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I")
    public abstract int method1156(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(II)[B")
    public abstract byte[] method1159(int arg0, int arg1);
}
