import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class178 {

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Lij;")
    public static class316 field2546;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lwn;")
    public static class77 field2547;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2543;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIII)V")
    public static final void method1262(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2545++;
        class26 var5 = class217.method1445(arg0, arg2, 10);
        var5.method158(28194);
        var5.field341 = arg3;
        var5.field336 = arg4;
        var5.field339 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field2543 = null;
        field2547 = null;
        field2546 = null;
        if (arg0 != -1) {
            field2546 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
    public static final void method1264(byte arg0) {
        if (arg0 != -119) {
            return;
        }
        for (int var1 = 0; var1 < class182.field2561; var1++) {
            int var10002 = class260.field3596[var1]--;
            if (class260.field3596[var1] >= -10) {
                class201 var3 = class15.field206[var1];
                if (var3 == null) {
                    var3 = class201.method1384(class62.field841, class129.field1948[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class260.field3596[var1] += var3.method1382();
                    class15.field206[var1] = var3;
                }
                if (class260.field3596[var1] < 0) {
                    int var10;
                    if (class124.field1875[var1] == 0) {
                        var10 = class116.field1766[var1] * class231.field3253 >> 8;
                    } else {
                        int var4 = (class124.field1875[var1] & 0xFF) * 128;
                        int var5 = (class124.field1875[var1] & 0xFF688B) >> 16;
                        int var6 = var5 * 128 + 64 - class359.field4970.field40;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class124.field1875[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 - (class359.field4970.field44 - 64);
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class260.field3596[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class336.field4540 * class116.field1766[var1] / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class224 var11 = var3.method1383().method1470(class383.field5269);
                        class148 var12 = class148.method1087(var11, 100, var10);
                        var12.method1097(class284.field3867[var1] - 1);
                        class48.field616.method1127(var12);
                    }
                    class260.field3596[var1] = -100;
                }
            } else {
                class182.field2561--;
                for (int var2 = var1; var2 < class182.field2561; var2++) {
                    class129.field1948[var2] = class129.field1948[var2 + 1];
                    class15.field206[var2] = class15.field206[var2 + 1];
                    class284.field3867[var2] = class284.field3867[var2 + 1];
                    class260.field3596[var2] = class260.field3596[var2 + 1];
                    class124.field1875[var2] = class124.field1875[var2 + 1];
                    class116.field1766[var2] = class116.field1766[var2 + 1];
                }
                var1--;
            }
        }
        field2544++;
        if (class133.field1993 && !class187.method1302(arg0 + 119)) {
            if (class1.field2 != 0 && class354.field4762 != -1) {
                class300.method1827(0, class354.field4762, false, class2.field14, class1.field2, (byte) -74);
            }
            class133.field1993 = false;
        } else if (class1.field2 != 0 && class354.field4762 != -1 && !class187.method1302(0)) {
            class278.field3791++;
            class88.field1232.method1151(31, (byte) -52);
            class88.field1232.method2261(class354.field4762, -176);
            class354.field4762 = -1;
        }
    }
}
