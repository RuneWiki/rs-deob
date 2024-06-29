import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class437 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[I")
    public static int[] field5990 = new int[1000];

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Ltm;")
    public static class112 field5991 = new class112("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lss;")
    public static class76 field5993;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z", line = 16)
    public static final boolean method2539(boolean arg0) {
        for (int var1 = class425.field5846; var1 < class109.field1542; var1++) {
            class406[][] var2 = class455.field6293[var1];
            for (int var3 = -class125.field1713; var3 <= 0; var3++) {
                int var4 = class381.field5398 + var3;
                int var5 = class381.field5398 - var3;
                if (var4 >= class443.field6111 || var5 < class371.field5246) {
                    for (int var6 = -class125.field1713; var6 <= 0; var6++) {
                        int var7 = class8.field171 + var6;
                        int var8 = class8.field171 - var6;
                        if (var4 >= class443.field6111) {
                            if (var7 >= class175.field2568) {
                                class406 var9 = var2[var4][var7];
                                if (var9 != null && var9.field5609) {
                                    class375.field5311 = arg0;
                                    class302.field4135.method812(var9, (byte) 10);
                                    class302.field4135.method814(-13417);
                                }
                            }
                            if (var8 < class153.field2206) {
                                class406 var10 = var2[var4][var8];
                                if (var10 != null && var10.field5609) {
                                    class375.field5311 = arg0;
                                    class302.field4135.method812(var10, (byte) 10);
                                    class302.field4135.method814(-13417);
                                }
                            }
                        }
                        if (var5 < class371.field5246) {
                            if (var7 >= class175.field2568) {
                                class406 var11 = var2[var5][var7];
                                if (var11 != null && var11.field5609) {
                                    class375.field5311 = arg0;
                                    class302.field4135.method812(var11, (byte) 10);
                                    class302.field4135.method814(-13417);
                                }
                            }
                            if (var8 < class153.field2206) {
                                class406 var12 = var2[var5][var8];
                                if (var12 != null && var12.field5609) {
                                    class375.field5311 = arg0;
                                    class302.field4135.method812(var12, (byte) 10);
                                    class302.field4135.method814(-13417);
                                }
                            }
                        }
                        if (class356.field4977 == 0) {
                            if (class101.field1443) {
                                class302.field4135.method811(4, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V", line = 143)
    public static final void method2540(int arg0, int arg1) {
        field5992++;
        class265 var2 = class440.method2554(arg0, 2, 11);
        if (arg1 > -21) {
            method2541(-68, -87, 63);
        }
        var2.method1677(21748);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 177)
    public static final void method2541(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5625 != null) {
            var3.field5625 = null;
        }
        if (var3.field5608 != null) {
            var3.field5608 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 206)
    public static void method2542(int arg0) {
        field5993 = null;
        if (arg0 != -18559) {
            field5990 = null;
        }
        field5990 = null;
        field5991 = null;
    }
}
