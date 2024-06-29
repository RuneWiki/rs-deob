import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class183 {

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
    private int[] field2702 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public int field2701 = -1;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "Z")
    public boolean field2708 = false;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2696 = "Examine";

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field2703 = 104;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Ldp;")
    public static class174 field2704;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "Lmb;")
    public static class258 field2714;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "[I")
    private int[] field2693;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "[S")
    private short[] field2695;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "[S")
    private short[] field2697;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "[S")
    private short[] field2706;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[S")
    private short[] field2712;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)V")
    public static final void method1420(boolean arg0, int arg1) {
        field2705++;
        if (arg0) {
            if (class321.field4642 != -1) {
                class137.method1122(class321.field4642, -83);
            }
            for (class120 var2 = (class120) class355.field5045.method1222(arg1 + 5657); var2 != null; var2 = (class120) class355.field5045.method1224((byte) -117)) {
                if (!var2.method252(arg1 ^ 0x79)) {
                    var2 = (class120) class355.field5045.method1222(arg1 + 5657);
                    if (var2 == null) {
                        break;
                    }
                }
                class254.method1839(true, false, -1, var2);
            }
            class321.field4642 = -1;
            class355.field5045 = new class156(8);
            class269.method1925(6065);
            class321.field4642 = class21.field310;
            class93.method787((byte) 48, false);
            class126.method1061(false);
            class216.method1638(class321.field4642);
        }
        class225.method1696(1001);
        class436.field6354 = -1;
        class58.method449(72, class206.field3027);
        class86.field1394 = new class127();
        class86.field1394.field6520 = 6656;
        class86.field1394.field5694[0] = 52;
        class86.field1394.field6519 = 6656;
        class286.field4288 = 0;
        class265.field3985 = 0;
        class86.field1394.field5696[0] = 52;
        if (class322.field4643 == 2) {
            class286.field4288 = class423.field6165 << 7;
            class265.field3985 = class347.field4911 << 7;
        } else {
            class150.method1163(-13736);
        }
        class287.method2024(66);
        if (~class265.field3985 == arg1 || class286.field4288 == 0) {
            class168.method1288(-6, 10);
        } else {
            class49.method393(14);
            class168.method1288(-6, 28);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lec;I)V")
    public final void method1421(class37 arg0, int arg1) {
        field2713++;
        while (true) {
            int var3 = arg0.method271((byte) 127);
            if (var3 == 0) {
                if (arg1 >= -107) {
                    this.method1426(112);
                    return;
                } else {
                    return;
                }
            }
            this.method1423(arg0, var3, true);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
    public static final boolean method1422(int arg0, int arg1) {
        field2715++;
        if (arg1 == 49 || arg1 == 1 || arg1 == 26 || arg1 == 30 || arg1 == 4) {
            return true;
        } else if (arg1 == 44 || arg1 == 32 || arg1 == 1002) {
            return true;
        } else if (arg1 == 28 || arg1 == 42 || arg1 == 23 || arg1 == 24 || arg1 == 34) {
            return true;
        } else {
            if (arg0 != -5) {
                method1427((class174) null, (byte) -27);
            }
            return arg1 == 9 || arg1 == 40 || arg1 == 1005 || arg1 == 11;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lec;IZ)V")
    private final void method1423(class37 arg0, int arg1, boolean arg2) {
        field2699++;
        if (!arg2) {
            this.field2708 = true;
        }
        if (arg1 == 1) {
            this.field2701 = arg0.method271((byte) 122);
        } else if (arg1 == 2) {
            int var4 = arg0.method271((byte) 104);
            this.field2693 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2693[var5] = arg0.method320((byte) -87);
            }
        } else if (arg1 == 3) {
            this.field2708 = true;
        } else if (arg1 == 40) {
            int var8 = arg0.method271((byte) 125);
            this.field2695 = new short[var8];
            this.field2697 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2695[var9] = (short) arg0.method320((byte) -87);
                this.field2697[var9] = (short) arg0.method320((byte) -87);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method271((byte) 124);
            this.field2712 = new short[var6];
            this.field2706 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2706[var7] = (short) arg0.method320((byte) -87);
                this.field2712[var7] = (short) arg0.method320((byte) -87);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2702[arg1 - 60] = arg0.method320((byte) -87);
            return;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Leb;")
    public final class382 method1424(int arg0) {
        field2694++;
        if (this.field2693 == null) {
            return null;
        }
        class382[] var2 = new class382[this.field2693.length];
        class174 var3 = class90.field1435;
        synchronized (class90.field1435) {
            int var4 = arg0;
            while (true) {
                if (this.field2693.length <= var4) {
                    break;
                }
                var2[var4] = class265.method1893(this.field2693[var4], class90.field1435, 0, (byte) -114);
                var4++;
            }
        }
        class382 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class382(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field2695 != null) {
            for (int var6 = 0; var6 < this.field2695.length; var6++) {
                var5.method2425(this.field2695[var6], 116, this.field2697[var6]);
            }
        }
        if (this.field2706 != null) {
            for (int var7 = 0; var7 < this.field2706.length; var7++) {
                var5.method2426(this.field2712[var7], 0, this.field2706[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Leb;")
    public final class382 method1425(int arg0) {
        field2709++;
        if (arg0 != -2551) {
            this.method1425(104);
        }
        class382[] var2 = new class382[5];
        int var3 = 0;
        class174 var4 = class90.field1435;
        synchronized (class90.field1435) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field2702[var5] != -1) {
                    var2[var3++] = class265.method1893(this.field2702[var5], class90.field1435, 0, (byte) -104);
                }
            }
        }
        class382 var6 = new class382(var2, var3);
        if (this.field2695 != null) {
            for (int var7 = 0; var7 < this.field2695.length; var7++) {
                var6.method2425(this.field2695[var7], 124, this.field2697[var7]);
            }
        }
        if (this.field2706 != null) {
            for (int var8 = 0; var8 < this.field2706.length; var8++) {
                var6.method2426(this.field2712[var8], 0, this.field2706[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)Z")
    public final boolean method1426(int arg0) {
        field2700++;
        if (this.field2693 == null) {
            return true;
        }
        if (arg0 <= 85) {
            this.field2702 = null;
        }
        boolean var2 = true;
        class174 var3 = class90.field1435;
        synchronized (class90.field1435) {
            for (int var4 = 0; var4 < this.field2693.length; var4++) {
                if (!class90.field1435.method1358(this.field2693[var4], -127, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ldp;B)V")
    public static final void method1427(class174 arg0, byte arg1) {
        int var2 = -51 / ((56 - arg1) / 36);
        class423.field6170 = arg0;
        field2710++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
    public static void method1428(boolean arg0) {
        field2704 = null;
        field2696 = null;
        if (arg0) {
            method1429(false, -7L);
        }
        field2714 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZJ)V")
    public static final void method1429(boolean arg0, long arg1) {
        field2698++;
        class13.field216.field565 = 0;
        class13.field216.method267(21, false);
        if (!arg0) {
            return;
        }
        class13.field216.method269(125, arg1);
        class349.field4965 = -3;
        class205.field3012 = 1;
        class8.field110 = 0;
        class28.field421 = 0;
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)Z")
    public final boolean method1430(int arg0) {
        field2711++;
        boolean var2 = true;
        class174 var3 = class90.field1435;
        synchronized (class90.field1435) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field2702[var4] != -1 && !class90.field1435.method1358(this.field2702[var4], -127, 0)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 != -1) {
            this.field2693 = null;
        }
        return var2;
    }
}
