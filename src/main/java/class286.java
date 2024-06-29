import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class286 extends class184 {

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field5009 = 0;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "Lhe;")
    public static class94 field5000 = new class94(30);

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field5011 = 0;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "Lsf;")
    public static class108 field5010 = class140.method973(255, "Mem:");

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "Lsf;")
    private static class108 field5013 = class140.method973(255, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Lsf;")
    public static class108 field5012 = field5013;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field4994;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public int field5002;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public int field5005;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public int field5008;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lsf;")
    public class108 field4991;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lca;")
    public class98 field4999;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Lca;")
    public class98 field5006;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "Z")
    public boolean field5001;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "[Ljava/lang/Object;")
    public Object[] field4993;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 6)
    public static final void method2044(int arg0) {
        if (class139.field2455.toLowerCase().indexOf("microsoft") == -1) {
            class287.field5016[59] = 57;
            class287.field5016[91] = 42;
            class287.field5016[93] = 43;
            class287.field5016[45] = 26;
            class287.field5016[92] = 74;
            class287.field5016[46] = 72;
            if (class139.field2458 == null) {
                class287.field5016[192] = 58;
                class287.field5016[222] = 59;
            } else {
                class287.field5016[520] = 59;
                class287.field5016[192] = 28;
                class287.field5016[222] = 58;
            }
            class287.field5016[61] = 27;
            class287.field5016[44] = 71;
            class287.field5016[47] = 73;
        } else {
            class287.field5016[189] = 26;
            class287.field5016[221] = 43;
            class287.field5016[186] = 57;
            class287.field5016[220] = 74;
            class287.field5016[219] = 42;
            class287.field5016[188] = 71;
            class287.field5016[223] = 28;
            class287.field5016[192] = 58;
            class287.field5016[187] = 27;
            class287.field5016[222] = 59;
            class287.field5016[191] = 73;
            class287.field5016[190] = 72;
        }
        if (arg0 == 50000) {
            field5004++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 56)
    public static void method2045(int arg0) {
        field5013 = null;
        field5010 = null;
        if (arg0 != -14485) {
            method2046(false, (String) null);
        }
        field5012 = null;
        field5000 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 70)
    public static final void method2046(boolean arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field4992++;
        if (arg0) {
            method2046(true, (String) null);
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Z", line = 82)
    public static final boolean method2047(int arg0, byte arg1) {
        field4998++;
        class278 var2 = class135.method926(arg0, 846281444);
        if (var2 == null) {
            return false;
        } else if (class139.field2442 == 1 || class139.field2442 == 2 || class220.field3910 == 2) {
            byte[] var3 = var2.field4882.method782(false);
            class68.field1061 = new String(var3, 0, var3.length);
            class182.field3334 = var2.field4887;
            if (class220.field3910 != 0) {
                class78.field1184 = class182.field3334 + 50000;
                class135.field2345 = class182.field3334 + 40000;
                class149.field2723 = class135.field2345;
            }
            return true;
        } else {
            class108 var4 = class196.field3544;
            if (class220.field3910 != 0) {
                var4 = class117.method833(new class108[] { class34.field468, class79.method518(false, var2.field4887 + 7000) }, false);
            }
            int var5 = 112 / ((arg1 + 33) / 58);
            class108 var6 = class196.field3544;
            if (class160.field2869 != null) {
                var6 = class117.method833(new class108[] { class266.field4685, class160.field2869 }, false);
            }
            class108 var7 = class117.method833(new class108[] { class248.field4299, var2.field4882, var4, class29.field436, class79.method518(false, class88.field1393), class157.field2841, class79.method518(false, class247.field4269), var6, class252.field4391, class19.field281 ? class145.field2557 : class147.field2641, class186.field3412, class70.field1083 ? class145.field2557 : class147.field2641, class213.field3795, class329.field5618 ? class145.field2557 : class147.field2641 }, false);
            try {
                class5.field73.getAppletContext().showDocument(var7.method765(true), "_self");
                return true;
            } catch (Exception var9) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lik;ILik;Lik;)V", line = 140)
    public static final void method2048(class262 arg0, int arg1, class262 arg2, class262 arg3) {
        class62.field993 = arg0;
        if (arg1 > -1) {
            method2044(-36);
        }
        class218.field3890 = arg3;
        class152.field2756 = arg2;
        field5007++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIII)V", line = 159)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4995++;
        if (arg3 != 192) {
            method2050(-84, 85);
        }
        int var9 = arg8 - arg0;
        int var10 = arg1 - arg4;
        int var11 = (arg2 - arg5 << 16) / var9;
        int var12 = (arg6 - arg7 << 16) / var10;
        class261.method1853(arg1, arg5, var11, var12, arg4, 0, 0, arg8, arg0, arg7, false);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)Z", line = 182)
    public static final boolean method2050(int arg0, int arg1) {
        if (arg0 != 188) {
            field5013 = (class108) null;
        }
        field4997++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)V", line = 194)
    public static final void method2051(int arg0, long arg1) {
        field5003++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class120.field2056 < 100 || class304.field5290) || class120.field2056 >= 200) {
            class210.method1456(class185.field3406, 0, -117, class63.field1016);
            return;
        }
        class108 var3 = class330.method2259((byte) -37, arg1).method755(8975);
        for (int var4 = 0; var4 < class120.field2056; var4++) {
            if (class254.field4423[var4] == arg1) {
                class210.method1456(class117.method833(new class108[] { var3, class162.field2891 }, false), 0, -49, class63.field1016);
                return;
            }
        }
        for (int var5 = 0; var5 < class176.field3205; var5++) {
            if (class75.field1153[var5] == arg1) {
                class210.method1456(class117.method833(new class108[] { class13.field151, var3, class326.field5547 }, false), 0, -81, class63.field1016);
                return;
            }
        }
        if (var3.method779(class95.field1513.field757, 90)) {
            class210.method1456(class288.field5026, 0, -113, class63.field1016);
            return;
        }
        class197.field3563[class120.field2056] = var3;
        class108.field1892++;
        class254.field4423[class120.field2056] = arg1;
        class176.field3204[class120.field2056] = 0;
        class14.field168[class120.field2056] = class63.field1016;
        class295.field5154[class120.field2056] = 0;
        client.field4539[class120.field2056] = false;
        if (arg0 < -2) {
            class120.field2056++;
            class290.field5084 = class242.field4217;
            class256.field4471.method1427(63, 0);
            class256.field4471.method1735((byte) -62, arg1);
        }
    }
}
