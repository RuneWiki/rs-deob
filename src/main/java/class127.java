import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class127 {

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field1688 = 0;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "[S")
    public static short[] field1691 = new short[256];

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1689 = "shake:";

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "Lqj;")
    public static class238 field1692;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1687;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V", line = 3)
    public static void method866(boolean arg0) {
        field1689 = null;
        field1691 = null;
        field1692 = null;
        field1687 = null;
        if (arg0) {
            field1692 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lnr;)V", line = 19)
    public static final void method867(class437 arg0) {
        for (int var1 = class57.field821; var1 < class137.field1817; var1++) {
            for (int var2 = 0; var2 < class308.field4403; var2++) {
                for (int var3 = 0; var3 < class413.field6175; var3++) {
                    class10 var4 = class343.field5032[var1][var2][var3];
                    if (var4 != null) {
                        class349 var5 = var4.field117;
                        class349 var6 = var4.field120;
                        if (var5 != null && var5.method151((byte) -115)) {
                            class51.method352(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method151((byte) -115)) {
                                class51.method352(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method153((byte) -128, arg0, 0, 0, false, var5, 0);
                                var6.method163(0);
                            }
                            var5.method163(0);
                        }
                        for (class39 var7 = var4.field109; var7 != null; var7 = var7.field627) {
                            class361 var9 = var7.field621;
                            if (var9 != null && var9.method151((byte) -115)) {
                                class51.method352(arg0, var9, var1, var2, var3, var9.field5293 + 1 - var9.field5296, var9.field5286 - var9.field5288 + 1);
                                var9.method163(0);
                            }
                        }
                        class381 var8 = var4.field124;
                        if (var8 != null && var8.method151((byte) -115)) {
                            class358.method2353(arg0, var8, var1, var2, var3);
                            var8.method163(0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V", line = 103)
    public static final void method868(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method866(true);
        }
        field1686++;
        class324.field4649++;
        class232.field3279.method756(0, 147);
        class232.field3279.method1670(arg2, (byte) -115);
        class232.field3279.method1716((byte) -8, arg1);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V", line = 124)
    public static final void method869(int arg0, boolean arg1) {
        field1693++;
        if (arg0 == 3037 && arg1 != class212.field3006) {
            class212.field3006 = arg1;
            class405.method2639((byte) 110);
        }
    }
}
