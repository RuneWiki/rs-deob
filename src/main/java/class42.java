import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class42 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lvv;")
    public static class313 field687 = new class313(16, 0);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 3)
    public static void method310(byte arg0) {
        field687 = null;
        if (arg0 > -39) {
            field687 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lza;)V", line = 26)
    public static final void method311(class491 arg0) {
        for (int var1 = class497.field7298; var1 < class76.field1315; var1++) {
            for (int var2 = 0; var2 < class236.field4089; var2++) {
                for (int var3 = 0; var3 < class276.field4537; var3++) {
                    class465 var4 = class66.field977[var1][var2][var3];
                    if (var4 != null) {
                        class218 var5 = var4.field6907;
                        class218 var6 = var4.field6901;
                        if (var5 != null && var5.method42(false)) {
                            class326.method2049(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method42(false)) {
                                class326.method2049(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method39(0, 0, arg0, 0, 0, var5, false);
                                var6.method36(false);
                            }
                            var5.method36(false);
                        }
                        for (class1 var7 = var4.field6898; var7 != null; var7 = var7.field2) {
                            class290 var9 = var7.field9;
                            if (var9 != null && var9.method42(false)) {
                                class326.method2049(arg0, var9, var1, var2, var3, var9.field4722 + 1 - var9.field4718, var9.field4713 - var9.field4717 + 1);
                                var9.method36(false);
                            }
                        }
                        class125 var8 = var4.field6913;
                        if (var8 != null && var8.method42(false)) {
                            class509.method2995(arg0, var8, var1, var2, var3);
                            var8.method36(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I", line = 101)
    public static final int method312(int arg0) {
        field686++;
        if (arg0 < 85) {
            return 62;
        } else {
            class231 var1 = class322.field5060;
            synchronized (class322.field5060) {
                return class322.field5060.method1599((byte) -108);
            }
        }
    }
}
