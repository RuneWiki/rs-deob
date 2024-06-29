import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class384 {

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Z")
    public static boolean field5257 = false;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lcq;")
    public static class72 field5258 = new class72("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Z")
    public static boolean field5260 = false;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field5262 = null;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2390(int arg0) {
        if (arg0 != 11147) {
            return;
        }
        field5261++;
        if (class203.field2384 == null) {
            return;
        }
        while (true) {
            while (class213.field2603 < class213.field2614.length) {
                class27 var1 = class213.field2614[class213.field2603];
                if (var1 != null && var1.field303 == -1) {
                    if (class12.field148 == null) {
                        class12.field148 = class203.field2384.method1223(false, var1.field301);
                    }
                    int var2 = class12.field148.field1962;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field303 = var2;
                    class12.field148 = null;
                    class213.field2603++;
                } else {
                    class213.field2603++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLeh;)V", line = 48)
    public static final void method2391(byte arg0, class157 arg1) {
        if (arg0 <= 95) {
            field5258 = null;
        }
        field5253++;
        class146.field1722 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I", line = 59)
    public static final int method2392(int arg0, int arg1, int arg2) {
        field5254++;
        if (arg0 != 12403) {
            field5260 = false;
        }
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z", line = 81)
    public static final boolean method2393(int arg0, int arg1) {
        field5251++;
        class27 var2 = class235.method1515(arg1, (byte) 126);
        if (var2 == null) {
            return false;
        } else if (class441.field6075 == 3) {
            String var3 = "";
            if (class94.field1105 != 0) {
                var3 = ":" + (var2.field299 + 7000);
            }
            String var4 = "";
            if (class175.field2033 != null) {
                var4 = "/p=" + class175.field2033;
            }
            String var5 = "http://" + var2.field301 + var3 + "/l=" + class373.field5057 + "/a=" + class333.field4549 + var4 + "/j" + (class314.field4219 ? "1" : "0") + ",o" + (class41.field486 ? "1" : "0") + ",a2";
            if (arg0 != -18875) {
                field5258 = null;
            }
            try {
                class346.field4701.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class388.field5290 = var2.field299;
            class330.field4505 = var2.field301;
            if (class94.field1105 != 0) {
                class389.field5303 = class388.field5290 + 50000;
                class249.field3279 = class388.field5290 + 40000;
                class70.field874 = class249.field3279;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[III)V", line = 139)
    public static final void method2394(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field5256++;
        if (arg1 < 94) {
            method2393(-94, -98);
        }
        arg4--;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg4 = var13 + 1;
            arg2[arg4] = arg0;
        }
        while (arg4 < var6) {
            arg4++;
            arg2[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z", line = 170)
    public static final boolean method2395(boolean arg0) {
        field5259++;
        if (arg0) {
            return class139.field1590 == 0 ? class284.field3716.method1416((byte) 127) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 188)
    public static final void method2396(int arg0) {
        class276.field3570.method2298(0);
        if (arg0 > -105) {
            field5258 = null;
        }
        field5252++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 202)
    public static void method2397(byte arg0) {
        if (arg0 > -113) {
            field5257 = false;
        }
        field5258 = null;
        field5262 = null;
    }
}
