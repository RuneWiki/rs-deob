import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class251 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lhj;")
    public static class69 field4541 = class181.method1318(":duelstake:", (byte) -105);

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lhj;")
    public static class69 field4544 = class181.method1318("Verbindung zum Update)2Server hergestellt)3", (byte) -117);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    public static int[] field4545 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field4546 = new int[256];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4542++;
        if (arg5 != -59) {
            field4546 = null;
        }
        if (arg3 == arg6) {
            class9.method44(arg2, arg0, arg6, arg7, (byte) -112, arg4, arg1);
        } else if (arg1 - arg6 >= class201.field3629 && class35.field485 >= arg1 + arg6 && arg0 - arg3 >= class19.field252 && class166.field3075 >= (arg0 + arg3)) {
            class53.method312(arg0, arg4, (byte) -128, arg2, arg6, arg3, arg1, arg7);
        } else {
            class103.method756(arg0, arg6, arg7, (byte) -109, arg3, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1753(int arg0) {
        field4546 = null;
        field4545 = null;
        if (arg0 != 1) {
            field4541 = null;
        }
        field4541 = null;
        field4544 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBIZII)V")
    public static final void method1754(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4543++;
        class62.field1182++;
        if (!arg3) {
            class151.method1131(true, (byte) -11);
            class180.method1309(true, 114);
            class151.method1131(false, (byte) -11);
        }
        class180.method1309(false, 43);
        if (!arg3) {
            class51.method304(true);
        }
        class211.method1520((byte) 101);
        if (class265.field4711 == 1) {
            int var6 = class207.field3775;
            if (var6 < class110.field2093 / 256) {
                var6 = class110.field2093 / 256;
            }
            int var7 = client.field2812 + class11.field102 & 0x7FF;
            if (class199.field3588[4] && var6 < class171.field3125[4] + 128) {
                var6 = class171.field3125[4] + 128;
            }
            class134.method992(var7, class156.method1179(class156.field2904.field3985, class156.field2904.field4005, 54, class52.field927) - 50, var6 * 3 + 600, arg2, -305256944, class27.field381, var6, class167.field3083);
        }
        if (arg1 >= -3) {
            method1752(127, 77, -84, -104, -116, (byte) 41, 118, -37);
        }
        int var8 = class148.field2753;
        int var9 = class162.field3006;
        int var10 = class31.field427;
        int var11 = class127.field2327;
        int var12 = class123.field2291;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class199.field3588[var13]) {
                int var19 = (int) ((double) (class172.field3152[var13] * 2 + 1) * Math.random() + Math.sin((double) class163.field3014[var13] / 100.0D * (double) class236.field4289[var13]) * (double) class171.field3125[var13] - (double) class172.field3152[var13]);
                if (var13 == 4) {
                    class148.field2753 += var19;
                    if (class148.field2753 < 128) {
                        class148.field2753 = 128;
                    }
                    if (class148.field2753 > 383) {
                        class148.field2753 = 383;
                    }
                }
                if (var13 == 0) {
                    class127.field2327 += var19;
                }
                if (var13 == 1) {
                    class31.field427 += var19;
                }
                if (var13 == 2) {
                    class123.field2291 += var19;
                }
                if (var13 == 3) {
                    class162.field3006 = class162.field3006 + var19 & 0x7FF;
                }
            }
        }
        class158.method1191((byte) -95);
        class15.method89(arg5, arg0, arg5 + arg4, arg0 + arg2);
        class178.method1299();
        if (class103.field1936 || class256.field4601 < arg5 || class256.field4601 >= (arg4 + arg5) || arg0 > class240.field4416 || class240.field4416 >= arg0 + arg2) {
            class227.field4141 = false;
            class268.field4775 = 0;
        } else {
            class227.field4141 = true;
            class268.field4775 = 0;
            int var14 = class44.field632;
            int var15 = class266.field4733;
            int var16 = class36.field509;
            class65.field1252 = (class256.field4601 - arg5) * (var15 - var14) / arg4 + var14;
            int var17 = class155.field2895;
            class85.field1647 = (class240.field4416 - arg0) * (var17 - var16) / arg2 + var16;
        }
        class17.method105(-126);
        byte var18 = class180.method1310(-14234) == 2 ? (byte) class62.field1182 : 1;
        class15.method77(arg5, arg0, arg4, arg2, 0);
        class91.method646(class127.field2327, class31.field427, class123.field2291, class148.field2753, class162.field3006, class202.field3655, class247.field4520, class212.field3861, class273.field4827, class22.field300, class148.field2745, class52.field927 + 1, var18, class156.field2904.field3985 >> 7, class156.field2904.field4005 >> 7);
        class17.method105(-105);
        class17.method103();
        class33.method177(256, true, 256, arg5, arg2, arg0, arg4);
        class28.method159(256, arg0, 4, arg4, 256, arg2, arg5);
        ((class104) class178.field3236).method780(-72, class148.field2767);
        class43.method246(arg5, 105, arg4, arg2, arg0);
        class162.field3006 = var9;
        class123.field2291 = var12;
        class127.field2327 = var11;
        class148.field2753 = var8;
        class31.field427 = var10;
        if (class175.field3199 && class81.field1556.method984((byte) -60) == 0) {
            class175.field3199 = false;
        }
        if (class175.field3199) {
            class15.method77(arg5, arg0, arg4, arg2, 0);
            class155.method1175(false, false, class138.field2589);
        }
        if (!arg3 && !class175.field3199 && !class103.field1936 && arg5 <= class256.field4601 && arg5 + arg4 > class256.field4601 && arg0 <= class240.field4416 && class240.field4416 < (arg0 + arg2)) {
            class179.method1306(arg4, 4, arg0, arg5, arg2, class240.field4416, class256.field4601);
        }
    }
}
