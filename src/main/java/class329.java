import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class329 {

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "Ldv;")
    public static class566 field4402 = new class566(71, 12);

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field4404 = -1;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lqa;")
    public static class207 field4405;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Ljava/lang/String;")
    public String field4401;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method2024(int arg0) {
        field4402 = null;
        if (arg0 >= 32) {
            field4405 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
    public static final void method2025(int arg0, int arg1, int arg2) {
        field4400++;
        class314 var3 = class483.method2819(12, arg2, 21303);
        if (arg0 > 86) {
            var3.method1959(19793);
            var3.field4227 = arg1;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Z")
    public static final boolean method2026(boolean arg0) {
        for (int var1 = class244.field3410; var1 < class395.field5610; var1++) {
            class622[][] var2 = class356.field4807[var1];
            for (int var3 = -class325.field4377; var3 <= 0; var3++) {
                int var4 = class120.field1970 + var3;
                int var5 = class120.field1970 - var3;
                if (var4 >= class213.field3024 || var5 < class258.field3595) {
                    for (int var6 = -class325.field4377; var6 <= 0; var6++) {
                        int var7 = class546.field7561 + var6;
                        int var8 = class546.field7561 - var6;
                        if (var4 >= class213.field3024) {
                            if (var7 >= class67.field1139) {
                                class622 var9 = var2[var4][var7];
                                if (var9 != null && var9.field8975) {
                                    class109.field1687 = arg0;
                                    class233.field3288.method2865(var9, true);
                                    class233.field3288.method2858(-111);
                                }
                            }
                            if (var8 < class277.field3834) {
                                class622 var10 = var2[var4][var8];
                                if (var10 != null && var10.field8975) {
                                    class109.field1687 = arg0;
                                    class233.field3288.method2865(var10, true);
                                    class233.field3288.method2858(-118);
                                }
                            }
                        }
                        if (var5 < class258.field3595) {
                            if (var7 >= class67.field1139) {
                                class622 var11 = var2[var5][var7];
                                if (var11 != null && var11.field8975) {
                                    class109.field1687 = arg0;
                                    class233.field3288.method2865(var11, true);
                                    class233.field3288.method2858(-88);
                                }
                            }
                            if (var8 < class277.field3834) {
                                class622 var12 = var2[var5][var8];
                                if (var12 != null && var12.field8975) {
                                    class109.field1687 = arg0;
                                    class233.field3288.method2865(var12, true);
                                    class233.field3288.method2858(-87);
                                }
                            }
                        }
                        if (class440.field6264 == 0) {
                            if (class474.field6665) {
                                class233.field3288.method2863(24, 0);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
