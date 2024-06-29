import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class337 {

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field4846 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field4843 = 2048;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field4850 = 0;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field4849 = 2048;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[I")
    public static int[] field4845 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "S")
    public static short field4852 = 1;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvo;")
    public static final class215 method2041(Throwable arg0, String arg1) {
        field4851++;
        class215 var2;
        if (arg0 instanceof class215) {
            var2 = (class215) arg0;
            var2.field2960 = var2.field2960 + ' ' + arg1;
        } else {
            var2 = new class215(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(JI)V")
    public static final void method2042(long arg0, int arg1) {
        field4847++;
        if (arg1 != 1) {
            field4845 = null;
        }
        int var3 = class255.field3554;
        int var4 = class369.field5280;
        if (class191.field2617 != var3) {
            int var5 = var3 - class191.field2617;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class191.field2617 += var6;
        }
        if (!class92.field1146) {
            class349.field5021 += (float) arg0 * class184.field2404 / 40.0F * 8.0F;
            class31.field389 += (float) arg0 * class195.field2667 / 40.0F * 8.0F;
        }
        if (class186.field2445 != var4) {
            int var7 = var4 - class186.field2445;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class186.field2445 += var8;
        }
        class426.method2539(arg1 - 86);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBLab;)V")
    public static final void method2043(int arg0, int arg1, byte arg2, class256 arg3) {
        field4855++;
        if (class484.field6868 != null || class385.field5517 || arg3 == null || class230.method1273(74, arg3) == null) {
            return;
        }
        class484.field6868 = arg3;
        class487.field6916 = class230.method1273(87, arg3);
        if (arg2 != -17) {
            field4852 = -21;
        }
        class318.field4635 = arg0;
        class157.field1873 = false;
        class101.field1231 = arg1;
        class146.field1770 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lve;I)I")
    public static final int method2044(class331 arg0, int arg1) {
        field4844++;
        if (arg1 != -11825) {
            method2043(-85, -26, (byte) -22, (class256) null);
        }
        int var2 = arg0.method2017(arg1 ^ 0x2E51, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2017(-33, 5);
        } else if (var2 == 2) {
            var3 = arg0.method2017(-111, 8);
        } else {
            var3 = arg0.method2017(-44, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILvt;)V")
    public final void method2045(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method895((byte) -84);
            if (var3 == 0) {
                field4848++;
                if (arg0 >= -33) {
                    this.field4850 = 42;
                    return;
                }
                return;
            }
            this.method2048(arg1, var3, 121);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method2046(int arg0) {
        class230.field3185.field2206 = 0;
        field4853++;
        class357.field5161 = null;
        class361.field5203 = 0;
        class28.field366 = 0;
        class24.field333 = null;
        class159.field1908 = 0;
        class358.field5166 = null;
        class79.field939.field2206 = 0;
        class233.field3240 = null;
        class423.method2521((byte) -76);
        class58.method300(arg0 - 432);
        for (int var1 = 0; var1 < 2048; var1++) {
            class46.field596[var1] = null;
        }
        if (arg0 != 320) {
            return;
        }
        class19.field258 = null;
        for (int var2 = 0; var2 < class448.field6366.length; var2++) {
            class137 var4 = class448.field6366[var2];
            if (var4 != null) {
                var4.field2511 = -1;
            }
        }
        class83.method423(8);
        class358.field5167 = 1;
        class404.method2413(false, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class61.field764[var3] = true;
        }
        class168.method824(-116);
        class418.field6021 = null;
        class110.field1330 = 0L;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static void method2047(int arg0) {
        field4845 = null;
        if (arg0 != -18316) {
            field4852 = 30;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lvt;II)V")
    private final void method2048(class179 arg0, int arg1, int arg2) {
        field4854++;
        if (arg1 == 1) {
            this.field4850 = arg0.method895((byte) -113);
        } else if (arg1 == 2) {
            this.field4843 = arg0.method916(21933);
        } else if (arg1 == 3) {
            this.field4849 = arg0.method916(21933);
        } else if (arg1 == 4) {
            this.field4846 = arg0.method906(-100);
        }
        int var4 = 67 / ((59 - arg2) / 50);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2049(String arg0, int arg1) {
        field4856++;
        if (arg1 != -1) {
            method2044((class331) null, 54);
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class360.method2193(arg1 - 97, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class3.field25; var3++) {
            String var4 = class150.field1823[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class360.method2193(arg1 - 74, var4);
            if (var5 != null && var5.equals(var2)) {
                class3.field25--;
                for (int var6 = var3; var6 < class3.field25; var6++) {
                    class150.field1823[var6] = class150.field1823[var6 + 1];
                    class373.field5335[var6] = class373.field5335[var6 + 1];
                    class148.field1800[var6] = class148.field1800[var6 + 1];
                    class346.field4939[var6] = class346.field4939[var6 + 1];
                    class388.field5546[var6] = class388.field5546[var6 + 1];
                    class311.field4556[var6] = class311.field4556[var6 + 1];
                }
                class180.field2254++;
                class205.field2807 = class129.field1601;
                class244.method1332((byte) 126, class146.field1774);
                class230.field3185.method909(class183.method995((byte) 23, arg0), arg1);
                class230.field3185.method935(arg0, arg1 ^ 0x62);
                return;
            }
        }
    }
}
