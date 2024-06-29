import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class136 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[[[B")
    public static byte[][][] field1546;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I", line = 8)
    public static final int method879(int arg0) {
        field1545++;
        if (class264.field3404 == null) {
            if (!class49.field574 && class57.field660 > 0) {
                if (class384.field5257 && class261.field3359.method623(arg0 ^ 0xF9, 81) && class57.field660 > 2) {
                    return ((class266) class97.field1138.field3483.field507.field507).field3429;
                }
                return ((class266) class97.field1138.field3483.field507).field3429;
            }
            int var1 = class358.field4866.method1860(16);
            int var2 = class358.field4866.method1858(-18493);
            int var3 = class148.field1735;
            int var4 = class76.field941;
            int var5 = class143.field1686;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class57.field660; var7++) {
                    if (class231.field3044) {
                        int var12 = (class57.field660 - var7 - 1) * 16 + (var4 + 33);
                        if (var2 > (var12 - 13) && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class57.field660 - var7 - 1) * 16 + var4 + 31;
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class35 var9 = new class35(class97.field1138);
                    for (class266 var10 = (class266) var9.method227(1798357390); var10 != null; var10 = (class266) var9.method224(-1354376344)) {
                        if (var8++ == var6) {
                            return var10.field3429;
                        }
                    }
                }
            }
        }
        return arg0 == 240 ? -1 : 71;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Z", line = 106)
    public static final boolean method880(byte arg0) {
        field1543++;
        try {
            if (class139.field1590 == 2) {
                if (class174.field2013 == null) {
                    class174.field2013 = class160.method1018(class369.field5026, class264.field3385, class372.field5048);
                    if (class174.field2013 == null) {
                        return false;
                    }
                }
                if (class383.field5250 == null) {
                    class383.field5250 = new class184(class291.field3843, class274.field3543);
                }
                if (class284.field3716.method1419(class72.field896, class174.field2013, 22050, (byte) 118, class383.field5250)) {
                    class284.field3716.method1400((byte) 51);
                    class284.field3716.method1417(class97.field1144, (byte) -88);
                    class284.field3716.method1414(true, class137.field1554, class174.field2013);
                    class139.field1590 = 0;
                    class369.field5026 = null;
                    class174.field2013 = null;
                    class383.field5250 = null;
                    return true;
                }
            }
            if (arg0 != -3) {
                method881(false);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class284.field3716.method1415(0);
            class369.field5026 = null;
            class383.field5250 = null;
            class139.field1590 = 0;
            class174.field2013 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 155)
    public static void method881(boolean arg0) {
        field1546 = null;
        if (!arg0) {
            method882(true);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V", line = 165)
    public static final void method882(boolean arg0) {
        field1544++;
        class264.field3401.method2298(0);
        if (!arg0) {
            method881(true);
        }
    }
}
