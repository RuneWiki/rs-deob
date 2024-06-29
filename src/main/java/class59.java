import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class59 extends class37 {

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "Ljava/lang/Object;")
    private Object field966;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "Luj;")
    public static class225 field964 = new class225(5000);

    @OriginalMember(owner = "client!g", name = "jb", descriptor = "Lhl;")
    public static class139 field975 = new class139(5);

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!g", name = "db", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!g", name = "fb", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!g", name = "gb", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!g", name = "ib", descriptor = "Lb;")
    public static class80 field974;

    @OriginalMember(owner = "client!g", name = "kb", descriptor = "[I")
    public static int[] field976;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)[Lji;")
    public static final class256[] method481(int arg0) {
        field963++;
        class256[] var1 = new class256[class246.field3823];
        if (arg0 != 18) {
            method484(14, 65, -64, -44);
        }
        for (int var2 = 0; var2 < class246.field3823; var2++) {
            byte[] var3 = class209.field3125[var2];
            int var4 = class27.field525[var2] * class173.field2530[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class15.field221[class131.method904(var3[var6], 255)];
            }
            var1[var2] = new class289(client.field729, class126.field1857, class135.field1973[var2], class5.field69[var2], class27.field525[var2], class173.field2530[var2], var5);
        }
        class293.method1936(-14);
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BILjk;)I")
    public static final int method482(byte arg0, int arg1, class297 arg2) {
        int var3 = 18 / ((-arg0 - 26) / 61);
        field973++;
        if (!client.method333(arg2).method1963(2912, arg1) && arg2.field4685 == null) {
            return -1;
        } else if (arg2.field4623 == null || arg1 >= arg2.field4623.length) {
            return -1;
        } else {
            return arg2.field4623[arg1];
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JZ)V")
    public static final void method483(long arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field969++;
        if (arg0 != 0L) {
            field964.method1540(59, (byte) -2);
            class143.field2067++;
            field964.method440(arg0, -86);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V")
    public static final void method484(int arg0, int arg1, int arg2, int arg3) {
        field967++;
        class105 var4 = class9.method72(11, -1, arg1);
        var4.method763(false);
        if (arg3 >= 67) {
            var4.field1553 = arg0;
            var4.field1545 = arg2;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lgj;I)V")
    public static final void method485(class271 arg0, int arg1) {
        field965++;
        if (arg0.field4221 != null) {
            arg0.field4221.field843 = 0;
        }
        arg0.field4222 = false;
        for (class271 var2 = arg0.method259(); var2 != null; var2 = arg0.method250()) {
            method485(var2, -97);
        }
        int var3 = 50 / ((-arg1 - 10) / 58);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Lpk;I)V")
    public static final void method486(class237 arg0, int arg1) {
        field971++;
        if (class88.field1339) {
            return;
        }
        class72.method559();
        class190.field2876 = class12.method88(arg0, (byte) -112, class136.field1983);
        int var2 = class85.field1311;
        int var3 = var2 * 956 / 503;
        class190.field2876.method1225((class126.field1854 - var3) / 2, 0, var3, var2);
        class60.field979 = class20.method142(3000, arg0, class171.field2511);
        class60.field979.method368(class126.field1854 / arg1 - (class60.field979.field3546 / 2), 18);
        class88.field1339 = true;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)Z")
    public final boolean method293(boolean arg0) {
        field972++;
        return !arg0;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class59(Object arg0) {
        this.field966 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
    public static void method487(int arg0) {
        field974 = null;
        if (arg0 != 17400) {
            field976 = null;
        }
        field964 = null;
        field975 = null;
        field976 = null;
    }

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method291(int arg0) {
        field968++;
        if (arg0 != 22473) {
            field974 = null;
        }
        return this.field966;
    }
}
