import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class271 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Ljava/lang/String;")
    private String field3940 = "null";

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Ldk;")
    public static class326 field3956 = new class326("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[S")
    public static short[] field3958;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field3957;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "C")
    public char field3941;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "C")
    public char field3953;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lcp;")
    private class470 field3943;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lcp;")
    public class470 field3944;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[[Z")
    public static boolean[][] field3950;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1657(boolean arg0, int arg1, String arg2) {
        field3955++;
        if (!arg0) {
            field3950 = null;
        }
        class489 var3 = class116.method731(-625541408, 2, arg1);
        var3.method2863(255);
        var3.field6893 = arg2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lwm;")
    public static final class364 method1658(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1087;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnm;Z)Z")
    public static final boolean method1659(class304 arg0, boolean arg1) {
        boolean var2 = class53.field725 == class28.field388;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method922(200);
        if (arg0.field4330 < 0 || arg0.field4324 < 0 || arg0.field4328 >= class287.field4186 || arg0.field4334 >= class360.field5188) {
            return false;
        }
        for (int var6 = arg0.field4330; var6 <= arg0.field4328; var6++) {
            for (int var9 = arg0.field4324; var9 <= arg0.field4334; var9++) {
                class88 var10 = class257.method1605(arg0.field4319, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field4330) {
                        var11++;
                    }
                    if (var6 < arg0.field4328) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field4324) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field4334) {
                        var11 += 2;
                    }
                    class93 var12 = class268.method1647(var11, arg0, (byte) -11);
                    class93 var13 = var10.field1068;
                    if (var13 == null) {
                        var10.field1068 = var12;
                    } else {
                        while (var13.field1178 != null) {
                            var13 = var13.field1178;
                        }
                        var13.field1178 = var12;
                    }
                    var10.field1075 = (byte) (var10.field1075 | var11);
                    if (var2 && (class114.field1465[var6][var9] & 0xFF000000) != 0) {
                        var3 = class114.field1465[var6][var9];
                        var4 = class135.field1788[var6][var9];
                        var5 = class191.field2841[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field4330; var7 <= arg0.field4328; var7++) {
                for (int var8 = arg0.field4324; var8 <= arg0.field4334; var8++) {
                    if ((class114.field1465[var7][var8] & 0xFF000000) == 0) {
                        class114.field1465[var7][var8] = var3;
                        class135.field1788[var7][var8] = var4;
                        class191.field2841[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class293.field4249[class231.field3493++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    private final void method1660(int arg0) {
        this.field3943 = new class470(this.field3944.method2770(81));
        field3946++;
        if (arg0 == -16777216) {
            for (class349 var2 = (class349) this.field3944.method2769((byte) 100); var2 != null; var2 = (class349) this.field3944.method2768((byte) -88)) {
                class164 var3 = new class164(var2.field5053, (int) var2.field3568);
                this.field3943.method2767(-1, class102.method574(0, var2.field5053), var3);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZLrp;)V")
    private final void method1661(int arg0, boolean arg1, class276 arg2) {
        field3947++;
        if (!arg1) {
            method1663(-125);
        }
        if (arg0 == 1) {
            this.field3953 = class313.method1930(0, arg2.method1715((byte) -78));
        } else if (arg0 == 2) {
            this.field3941 = class313.method1930(0, arg2.method1715((byte) 112));
        } else if (arg0 == 3) {
            this.field3940 = arg2.method1750(-125);
        } else if (arg0 == 4) {
            this.field3951 = arg2.method1688(20402);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method1729(65280);
            this.field3944 = new class470(class276.method1708(1256978000, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1688(20402);
                class238 var7;
                if (arg0 == 5) {
                    var7 = new class349(arg2.method1750(-99));
                } else {
                    var7 = new class324(arg2.method1688(20402));
                }
                this.field3944.method2767(-1, (long) var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1662(int arg0, String arg1) {
        field3939++;
        if (this.field3944 == null) {
            return false;
        }
        if (this.field3943 == null) {
            this.method1660(-16777216);
        }
        if (arg0 != 2) {
            return true;
        }
        for (class164 var3 = (class164) this.field3943.method2761(class102.method574(0, arg1), (byte) -112); var3 != null; var3 = (class164) this.field3943.method2765(-1)) {
            if (var3.field2429.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method1663(int arg0) {
        field3956 = null;
        field3950 = null;
        field3958 = null;
        field3957 = null;
        if (arg0 != 0) {
            method1658(-13, -98, 16);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
    public final int method1664(int arg0, int arg1) {
        field3942++;
        if (this.field3944 == null) {
            return this.field3951;
        }
        class324 var3 = (class324) this.field3944.method2761((long) arg0, (byte) -112);
        if (var3 == null) {
            return this.field3951;
        } else if (arg1 == -1) {
            return var3.field4676;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method1665(int arg0, byte arg1) {
        field3954++;
        if (this.field3944 == null) {
            return this.field3940;
        }
        class349 var3 = (class349) this.field3944.method2761((long) arg0, (byte) -112);
        if (arg1 != 24) {
            field3958 = null;
        }
        return var3 == null ? this.field3940 : var3.field5053;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)Z")
    public final boolean method1666(int arg0, int arg1) {
        field3948++;
        if (this.field3944 == null) {
            return false;
        }
        if (this.field3943 == null) {
            this.method1668(0);
        }
        class324 var3 = (class324) this.field3943.method2761((long) arg1, (byte) -112);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 < 115) {
                this.method1665(-13, (byte) -87);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lrp;I)V")
    public final void method1667(class276 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                if (arg1 < 64) {
                    this.method1666(-85, 25);
                }
                field3952++;
                return;
            }
            this.method1661(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    private final void method1668(int arg0) {
        field3945++;
        this.field3943 = new class470(this.field3944.method2770(82));
        for (class324 var2 = (class324) this.field3944.method2769((byte) 47); var2 != null; var2 = (class324) this.field3944.method2768((byte) -88)) {
            class324 var3 = new class324((int) var2.field3568);
            this.field3943.method2767(~arg0, (long) var2.field4676, var3);
        }
        if (arg0 != 0) {
            this.method1668(-12);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public static final void method1669(int arg0) {
        field3949++;
        int var1 = class37.field491;
        int[] var2 = class348.field5033;
        for (int var3 = arg0; var3 < var1; var3++) {
            class452 var7 = class124.field1559[var2[var3]];
            if (var7 != null && var7.field2084 > 0) {
                var7.field2084--;
                if (var7.field2084 == 0) {
                    var7.field2113 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class225.field3418; var4++) {
            int var5 = class281.field4139[var4];
            class216 var6 = class139.field1851[var5];
            if (var6 != null && var6.field2084 > 0) {
                var6.field2084--;
                if (var6.field2084 == 0) {
                    var6.field2113 = null;
                }
            }
        }
    }

    static {
        new class326("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field3958 = new short[] { -4160, -4163, -8256, -8259, 22461 };
        field3957 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    }
}
