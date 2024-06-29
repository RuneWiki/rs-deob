import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class571 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "F")
    public static float field8063 = 0.0F;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lea;")
    public class571 field8061;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lea;")
    public class571 field8064;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lha;")
    public static class65 field8060;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final void method3358(int arg0) {
        field8059++;
        if (this.field8061 == null) {
            return;
        }
        this.field8061.field8064 = this.field8064;
        this.field8064.field8061 = this.field8061;
        int var2 = 119 / ((45 - arg0) / 37);
        this.field8061 = null;
        this.field8064 = null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)I")
    public static final int method3359(int arg0) {
        field8057++;
        if (class763.field10520 == 1) {
            return class194.field2992;
        } else {
            if (arg0 < 99) {
                method3360((byte) -89);
            }
            return class355.field4991;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public static void method3360(byte arg0) {
        if (arg0 > -76) {
            method3360((byte) 60);
        }
        field8060 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIZ)I")
    public static final int method3361(int arg0, int arg1, int arg2, boolean arg3) {
        field8058++;
        class787 var4 = class447.method2666(arg0, Integer.MIN_VALUE, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field10805.length; var6++) {
                if (var4.field10809[var6] == arg1) {
                    var5 += var4.field10805[var6];
                }
            }
            if (arg2 != 25473) {
                method3360((byte) -49);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
    public static final int method3362(int arg0, int arg1, int arg2) {
        field8062++;
        int var3 = class559.method3310(-1, arg1 - 1, arg0 - 1) + class559.method3310(-1, arg1 + 1, arg0 + -1) - (-class559.method3310(-1, arg1 - 1, arg0 + 1) + -class559.method3310(-1, arg1 + 1, arg0 - -1));
        int var4 = class559.method3310(-1, arg1 - 1, arg0) + class559.method3310(-1, arg1 + 1, arg0) - (-class559.method3310(-1, arg1, arg0 + -1) + -class559.method3310(-1, arg1, arg0 + 1));
        int var5 = class559.method3310(-1, arg1, arg0);
        if (arg2 <= 72) {
            method3359(-37);
        }
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)Z")
    public static final boolean method3363(byte arg0) {
        if (arg0 > -121) {
            field8063 = -0.552973F;
        }
        field8065++;
        try {
            if (class90.field1011 == 2) {
                if (class252.field3717 == null) {
                    class252.field3717 = class334.method2125(class106.field1241, class665.field9257, class350.field4900);
                    if (class252.field3717 == null) {
                        return false;
                    }
                }
                if (class354.field4981 == null) {
                    class354.field4981 = new class133(class562.field7982, class288.field4230);
                }
                class462 var1 = class686.field9533;
                if (class161.field2559 != null) {
                    var1 = class161.field2559;
                }
                if (var1.method2772(class666.field9273, 22050, -123, class354.field4981, class252.field3717)) {
                    class686.field9533 = var1;
                    class686.field9533.method2770(2);
                    if (class562.field7991 <= 0) {
                        class90.field1011 = 0;
                        class686.field9533.method2776((byte) -105, class14.field279);
                        for (int var2 = 0; var2 < class46.field576.length; var2++) {
                            class686.field9533.method2766((byte) 70, var2, class46.field576[var2]);
                            class46.field576[var2] = 255;
                        }
                    } else {
                        class90.field1011 = 3;
                        class686.field9533.method2776((byte) 86, class14.field279 < class562.field7991 ? class14.field279 : class562.field7991);
                        for (int var3 = 0; var3 < class46.field576.length; var3++) {
                            class686.field9533.method2766((byte) 70, var3, class46.field576[var3]);
                            class46.field576[var3] = 255;
                        }
                    }
                    if (class161.field2559 == null) {
                        if (class278.field4039 <= 0L) {
                            class686.field9533.method2767(class252.field3717, class741.field10208, (byte) -87);
                        } else {
                            class686.field9533.method2779(class252.field3717, true, class278.field4039, class741.field10208, 0);
                        }
                    }
                    if (class599.field8410 != null) {
                        class599.field8410.method2190(0, class686.field9533);
                    }
                    class252.field3717 = null;
                    class106.field1241 = null;
                    class278.field4039 = 0L;
                    class161.field2559 = null;
                    class354.field4981 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class686.field9533.method2771(127);
            class90.field1011 = 0;
            class161.field2559 = null;
            class106.field1241 = null;
            class354.field4981 = null;
            class252.field3717 = null;
        }
        return false;
    }
}
