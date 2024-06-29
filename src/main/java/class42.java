import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class42 extends class98 {

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Lmb;")
    private class96 field726 = class17.field250;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "[S")
    public static short[] field714 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Lmb;")
    public static class96 field717 = class243.method1708("M", (byte) 113);

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Lmb;")
    public static class96 field721 = class243.method1708("<col=40ff00>", (byte) 123);

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    private int field713;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Ldf;")
    private class146 field711;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "Ldf;")
    public class146 field729;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
    private final void method322(boolean arg0) {
        this.field711 = new class146(this.field729.method1078(-26661));
        for (class46 var2 = (class46) this.field729.method1074(arg0); var2 != null; var2 = (class46) this.field729.method1087((byte) -72)) {
            class46 var3 = new class46((int) var2.field4304);
            this.field711.method1085(-1, var3, (long) var2.field795);
        }
        field728++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Z")
    public final boolean method323(int arg0, int arg1) {
        field727++;
        if (this.field729 == null) {
            return false;
        }
        if (this.field711 == null) {
            this.method322(false);
        }
        int var3 = -60 / ((arg1 + 28) / 57);
        class46 var4 = (class46) this.field711.method1081(0, (long) arg0);
        return var4 != null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILrg;I)V")
    private final void method324(int arg0, class239 arg1, int arg2) {
        field718++;
        if (arg0 == 1) {
            this.field716 = arg1.method1651(4139);
        } else if (arg0 == 2) {
            this.field722 = arg1.method1651(arg2 ^ 0xFFFF98BA);
        } else if (arg0 == 3) {
            this.field726 = arg1.method1634(-103);
        } else if (arg0 == 4) {
            this.field713 = arg1.method1617((byte) -43);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1663((byte) 91);
            this.field729 = new class146(class82.method578(0, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1617((byte) -43);
                class249 var7;
                if (arg0 == 5) {
                    var7 = new class192(arg1.method1634(-43));
                } else {
                    var7 = new class46(arg1.method1617((byte) -43));
                }
                this.field729.method1085(-1, var7, (long) var6);
            }
        }
        if (arg2 != -30575) {
            method328(-69);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lmb;I)Z")
    public final boolean method325(class96 arg0, int arg1) {
        field719++;
        if (this.field729 == null) {
            return false;
        }
        if (this.field711 == null) {
            this.method330(-24379);
        }
        for (class14 var3 = (class14) this.field711.method1081(0, arg0.method696(0)); var3 != null; var3 = (class14) this.field711.method1086(8)) {
            if (var3.field221.method705(arg1 + 10429, arg0)) {
                return true;
            }
        }
        if (arg1 != -10429) {
            this.field716 = -56;
        }
        return false;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)Lmb;")
    public final class96 method326(int arg0, int arg1) {
        if (arg0 != -4) {
            method328(87);
        }
        field730++;
        if (this.field729 == null) {
            return this.field726;
        } else {
            class192 var3 = (class192) this.field729.method1081(arg0 + 4, (long) arg1);
            return var3 == null ? this.field726 : var3.field3315;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
    public static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class84.method593(arg3, arg1, arg3 + arg4, arg1 - -arg0);
        class84.method598(arg3, arg1, arg4, arg0, 0);
        field710++;
        if (class100.field1690 < 100) {
            return;
        }
        if (class130.field2349 == null || class130.field2349.field4266 != arg4 || class130.field2349.field4271 != arg0) {
            class174 var5 = new class174(arg4, arg0);
            class84.method590(var5.field3026, arg4, arg0);
            class231.method1575(0, true, arg0, class176.field3068, 0, arg4, 0, class140.field2500, 0);
            class130.field2349 = var5;
            class85.field1442.method667((byte) -67);
        }
        class130.field2349.method1048(arg3, arg1);
        int var6 = class89.field1483 * arg4 / class140.field2500 + arg3;
        int var7 = class235.field4026 * arg0 / class176.field3068 + arg1;
        if (arg2 > -2) {
            return;
        }
        int var8 = class78.field1326 * arg4 / class140.field2500;
        int var9 = class32.field502 * arg0 / class176.field3068;
        class84.method592(var6, var7, var8, var9, 16711680, 128);
        class84.method607(var6, var7, var8, var9, 16711680);
        if (class248.field4297 <= 0 || (class248.field4297 % 10) >= 5) {
            return;
        }
        for (class224 var10 = (class224) class54.field943.method1811(2); var10 != null; var10 = (class224) class54.field943.method1810(false)) {
            if (class175.field3051 == var10.field3809) {
                int var11 = var10.field3811 * arg0 / class176.field3068 + arg1;
                int var12 = arg3 + (var10.field3803 * arg4 / class140.field2500);
                class84.method598(var12 - 2, var11 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public static void method328(int arg0) {
        field717 = null;
        field714 = null;
        if (arg0 > -112) {
            method328(3);
        }
        field721 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILrg;)V")
    public final void method329(int arg0, class239 arg1) {
        field715++;
        if (arg0 < 2) {
            this.field713 = -61;
        }
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                return;
            }
            this.method324(var3, arg1, -30575);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    private final void method330(int arg0) {
        field723++;
        this.field711 = new class146(this.field729.method1078(arg0 - 2282));
        for (class192 var2 = (class192) this.field729.method1074(false); var2 != null; var2 = (class192) this.field729.method1087((byte) 101)) {
            class14 var3 = new class14(var2.field3315, (int) var2.field4304);
            this.field711.method1085(-1, var3, var2.field3315.method696(0));
        }
        if (arg0 != -24379) {
            this.field711 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)I")
    public final int method331(int arg0, int arg1) {
        field725++;
        if (arg1 <= 40) {
            this.field722 = 46;
        }
        if (this.field729 == null) {
            return this.field713;
        } else {
            class46 var3 = (class46) this.field729.method1081(0, (long) arg0);
            return var3 == null ? this.field713 : var3.field795;
        }
    }
}
