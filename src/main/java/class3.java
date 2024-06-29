import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class271 {

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "S")
    public static short field32 = 1;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Ldc;")
    public static class101 field28;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "Lwa;")
    public class75 field29;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "[I")
    public int[] field33;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
    public int[] field39;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "[Lvd;")
    public class126[] field38;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "[Lwa;")
    public class75[] field40;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(BI)Leb;", line = 9)
    public static final class108 method14(byte arg0, int arg1) {
        field37++;
        class108 var2 = (class108) class26.field347.method1193((long) arg1, arg0 - 199);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class233.field3950.method1911(class175.method1292(arg1, (byte) -112), class251.method1803(arg1, 71), -94);
        class108 var4 = new class108();
        var4.field1823 = arg1;
        if (var3 != null) {
            var4.method837(new class60(var3), true);
        }
        if (arg0 != 83) {
            field28 = (class101) null;
        }
        var4.method834(1);
        if (!class221.field3770 && var4.field1870) {
            var4.field1845 = null;
        }
        if (var4.field1867) {
            var4.field1820 = 0;
            var4.field1836 = false;
        }
        class26.field347.method1194(var4, (long) arg1, false);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V", line = 53)
    public static final void method15(int arg0) {
        field35++;
        if (class76.field1320 < 0) {
            class167.field2813 = -1;
            class104.field1774 = -1;
            class76.field1320 = 0;
        }
        if (class76.field1320 > class39.field589) {
            class76.field1320 = class39.field589;
            class167.field2813 = -1;
            class104.field1774 = -1;
        }
        if (class215.field3666 < 0) {
            class215.field3666 = 0;
            class104.field1774 = -1;
            class167.field2813 = -1;
        }
        if (arg0 == 8887 && class215.field3666 > class215.field3668) {
            class215.field3666 = class215.field3668;
            class167.field2813 = -1;
            class104.field1774 = -1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lcl;Ljava/lang/Object;B)V", line = 98)
    public static final void method16(class124 arg0, Object arg1, byte arg2) {
        field30++;
        if (arg0.field2077 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2077.peekEvent() != null; var3++) {
            class235.method1708(83, 1L);
        }
        if (arg2 != -102) {
            method15(-76);
        }
        if (arg1 != null) {
            arg0.field2077.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)Z", line = 127)
    public static final boolean method17(int arg0) {
        int var1 = -50 / ((arg0 + 84) / 33);
        field27++;
        try {
            return client.method1733(-9);
        } catch (IOException var6) {
            class10.method50(1);
            return true;
        } catch (Exception var7) {
            String var4 = "T2 - " + client.field4016 + "," + class61.field1070 + "," + class143.field2471 + " - " + class299.field5105 + "," + (class279.field4831.field3236[0] + class275.field4737) + "," + (class279.field4831.field3205[0] + class175.field2939) + " - ";
            for (int var5 = 0; class299.field5105 > var5 && var5 < 50; var5++) {
                var4 = var4 + class136.field2328.field997[var5] + ",";
            }
            class17.method100(var7, -14020, var4);
            class67.method574((byte) 122);
            return true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Z", line = 166)
    public static final boolean method18(int arg0, int arg1, int arg2) {
        int var3 = class154.field2641[arg0][arg1][arg2];
        if (-class158.field2713 == var3) {
            return false;
        } else if (class158.field2713 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class2.method9(var4 + 1, class53.field879[arg0][arg1][arg2], var5 + 1) && class2.method9(var4 + 128 - 1, class53.field879[arg0][arg1 + 1][arg2], var5 + 1) && class2.method9(var4 + 128 - 1, class53.field879[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class2.method9(var4 + 1, class53.field879[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class154.field2641[arg0][arg1][arg2] = class158.field2713;
                return true;
            } else {
                class154.field2641[arg0][arg1][arg2] = -class158.field2713;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 195)
    public static void method19(byte arg0) {
        if (arg0 == 103) {
            field28 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IJ)V", line = 209)
    public static final void method20(int arg0, long arg1) {
        field41++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class40.field628 < 100 || class212.field3606 == 1) || class40.field628 >= 200) {
            class162.method1216((byte) 38, 0, class43.field709, class121.field2037);
            return;
        }
        class75 var3 = class260.method1855(arg1, false).method613(122);
        for (int var4 = 0; var4 < class40.field628; var4++) {
            if (class120.field2026[var4] == arg1) {
                class162.method1216((byte) 38, 0, class66.method562((byte) 120, new class75[] { var3, class125.field2161 }), class121.field2037);
                return;
            }
        }
        for (int var5 = 0; var5 < class205.field3472; var5++) {
            if (class66.field1152[var5] == arg1) {
                class162.method1216((byte) 38, 0, class66.method562((byte) 113, new class75[] { class86.field1412, var3, class48.field781 }), class121.field2037);
                return;
            }
        }
        if (var3.method660(class279.field4831.field1561, -117)) {
            class162.method1216((byte) 38, 0, class91.field1506, class121.field2037);
            return;
        }
        class51.field843++;
        class106.field1779[class40.field628] = var3;
        class120.field2026[class40.field628] = arg1;
        class173.field2930[class40.field628] = 0;
        class120.field2020[class40.field628] = class121.field2037;
        class112.field1910[class40.field628] = arg0;
        class111.field1898[class40.field628] = false;
        class166.field2793 = class187.field3128;
        class40.field628++;
        class89.field1470.method87(65280, 202);
        class89.field1470.method514(30009, arg1);
    }
}
