import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public int field1093 = 0;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public int field1118 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lrd;")
    public static class117 field1091 = class95.method812("backhmid1", (byte) 8);

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Lrd;")
    public static class117 field1110 = class95.method812(":tradereq:", (byte) 8);

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lrd;")
    public static class117 field1102 = class95.method812("Sie befinden sich in einem Mitglieder)2Gebiet(Q", (byte) 8);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[Lrd;")
    public static class117[] field1101 = new class117[100];

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lrd;")
    private static class117 field1113 = class95.method812("Please wait)3)3)3", (byte) 8);

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lrd;")
    public static class117 field1109 = field1113;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lrd;")
    public static class117 field1104 = field1113;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Lrd;")
    private static class117 field1124 = class95.method812("Private chat", (byte) 8);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lrd;")
    public static class117 field1098 = field1124;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lid;")
    public class60 field1106;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lcb;IIII)V")
    public static final void method454(class17 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1095++;
        if (class21.field604 >= 400 || arg4 != -4) {
            return;
        }
        if (arg0.field427 != null) {
            arg0 = arg0.method188((byte) 73);
        }
        if (arg0 == null || !arg0.field420) {
            return;
        }
        class117 var5 = arg0.field411;
        if (arg0.field390 != 0) {
            var5 = class18.method193(new class117[] { var5, class90.method792(arg0.field390, 19501, class144.field3516.field2534), class23.field665, class107.field2669, class142.method1131(arg0.field390, true), class136.field3234 }, arg4 ^ 0xFFFFFF9D);
        }
        if (class32.field955 == 1) {
            client.method238(arg2, class18.method193(new class117[] { class1.field29, class133.field3180, var5 }, 45), arg1, 29, arg3, 31, class21.field583);
            class94.field2370++;
        } else if (!class46.field1292) {
            class116.field2833++;
            class117[] var6 = arg0.field422;
            if (class84.field2197) {
                var6 = class94.method810(var6, (byte) -87);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method965(class143.field3397, false)) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 35;
                        }
                        class6.field136++;
                        if (var7 == 1) {
                            var8 = 27;
                        }
                        if (var7 == 2) {
                            var8 = 16;
                        }
                        if (var7 == 3) {
                            var8 = 21;
                        }
                        if (var7 == 4) {
                            var8 = 11;
                        }
                        client.method238(arg2, class18.method193(new class117[] { class15.field346, var5 }, 115), arg1, 80, arg3, var8, var6[var7]);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method965(class143.field3397, false)) {
                        field1120++;
                        short var10 = 0;
                        if (class144.field3516.field2534 < arg0.field390) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 35;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 27;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 16;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 21;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 11;
                        }
                        client.method238(arg2, class18.method193(new class117[] { class15.field346, var5 }, 26), arg1, -126, arg3, var11, var6[var9]);
                    }
                }
            }
            client.method238(arg2, class18.method193(new class117[] { class15.field346, var5 }, 59), arg1, 24, arg3, 1004, class141.field3354);
            return;
        } else if ((class84.field2201 & 0x2) == 2) {
            client.method238(arg2, class18.method193(new class117[] { class57.field1589, class133.field3180, var5 }, 78), arg1, -118, arg3, 34, class37.field1085);
            class20.field499++;
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method455(boolean arg0) {
        field1098 = null;
        field1104 = null;
        field1124 = null;
        field1109 = null;
        field1113 = null;
        field1091 = null;
        field1101 = null;
        field1110 = null;
        if (!arg0) {
            field1102 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BIILge;)Ll;")
    public static final class76 method456(byte arg0, int arg1, int arg2, class47 arg3) {
        if (arg0 != -110) {
            field1098 = null;
        }
        field1121++;
        return class90.method790(arg1, arg3, 16711680, arg2) ? class105.method871(arg0 + 110) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V")
    public static final void method457(boolean arg0, byte arg1) {
        field1123++;
        if (arg1 != -65) {
            method455(true);
        }
        if (class4.field104.field199 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && class4.field104.field199.peekEvent() != null; var2++) {
            class60.method611(1L, true);
        }
        if (arg0) {
            class4.field104.field199.postEvent(new ActionEvent(class42.field1216, 1001, "dummy"));
        }
    }
}
