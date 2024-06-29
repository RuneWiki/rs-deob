import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class320 {

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field4919 = 1;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field4920 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4922 = -1;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Llc;")
    public static class175 field4914;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lte;")
    public static class309 field4918;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lbi;")
    public static class91 field4921;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4916;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[S")
    public static short[] field4915;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2229(int arg0) {
        int var1 = -115 / ((arg0 + 41) / 35);
        field4917++;
        class179.field2597.method1241(122);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 21)
    public static final void method2230(String arg0, int arg1) {
        field4913++;
        if (class170.field2394 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class48.method285((byte) -90, arg0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class170.field2394.length && class170.field2394[var2].field5065 != var3) {
            var2++;
        }
        if (var2 >= class170.field2394.length || class170.field2394[var2] == null) {
            return;
        }
        class44.field526++;
        class140.field1954.method573(124, 101);
        if (arg1 == -13768) {
            class140.field1954.method678(class170.field2394[var2].field5065, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Len;IIIII)V", line = 60)
    public static final void method2231(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class90.field1128 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class62.field788) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class326.field4993 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class225 var14 = class158.field2184[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class167.field2324[var11][var12 + 1][var13] + class167.field2324[var11][var12][var13] + class167.field2324[var11][var12][var13 + 1] + class167.field2324[var11][var12 + 1][var13 + 1]) / 4 - (class167.field2324[arg1][arg2 + 1][arg3] + class167.field2324[arg1][arg2][arg3] + class167.field2324[arg1][arg2][arg3 + 1] + class167.field2324[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class168 var16 = var14.field3196;
                                    if (var16 != null) {
                                        if (var16.field2335.method274()) {
                                            arg0.method277(var16.field2335, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2331 != null && var16.field2331.method274()) {
                                            arg0.method277(var16.field2331, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3214; var17++) {
                                        class80 var18 = var14.field3199[var17];
                                        if (var18 != null && var18.field1024.method274() && (var18.field1015 == var12 || var7 == var12) && (var18.field1027 == var13 || var9 == var13)) {
                                            int var19 = var18.field1035 + 1 - var18.field1015;
                                            int var20 = var18.field1028 + 1 - var18.field1027;
                                            arg0.method277(var18.field1024, (var18.field1015 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1027 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 155)
    public static void method2232(int arg0) {
        field4921 = null;
        field4918 = null;
        field4914 = null;
        field4915 = null;
        int var1 = -23 % ((arg0 + 73) / 37);
        field4916 = null;
    }
}
