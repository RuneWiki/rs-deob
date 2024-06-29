import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class180 extends class5 {

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Leb;")
    public class228 field3261;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lhj;")
    public static class69 field3268 = class181.method1318("mapscene", (byte) -106);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Lhj;")
    public static class69 field3270 = class181.method1318(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -118);

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lhj;")
    public static class69 field3263 = class181.method1318("Zugewiesener Speicher)3", (byte) -128);

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V")
    public static final void method1308(int arg0, boolean arg1) {
        field3262++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class157.method1183(false);
        } else if (arg0 == 2) {
            class193.method1404((byte) 81);
        } else {
            throw new RuntimeException();
        }
        if (!arg1) {
            method1312((class69) null, -26);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
    public static final void method1309(boolean arg0, int arg1) {
        field3267++;
        for (int var2 = 0; var2 < class46.field659; var2++) {
            class38 var3 = class131.field2428[class245.field4490[var2]];
            long var4 = (long) class245.field4490[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method210(-30948) && var3.field517.field3365 == arg0 && var3.field517.method1351(false)) {
                int var6 = var3.field3985 >> 7;
                int var7 = var3.field4005 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method813(15963) == 1 && (var3.field3985 & 0x7F) == 64 && (var3.field4005 & 0x7F) == 64) {
                        if (class59.field1083[var6][var7] == class62.field1182) {
                            continue;
                        }
                        class59.field1083[var6][var7] = class62.field1182;
                    }
                    if (!var3.field517.field3410) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4044 = class156.method1179(var3.field3985, var3.field4005, 23, class52.field927);
                    class213.method1538(class52.field927, var3.field3985, var3.field4005, var3.field4044, var3.method813(15963) * 64 + 60 - 64, var3, var3.field4003, var4, var3.field4002);
                }
            }
        }
        if (arg1 < 23) {
            field3272 = -76;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Leb;)V")
    public class180(class228 arg0) {
        this.field3261 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
    public static final int method1310(int arg0) {
        field3271++;
        if (arg0 != -14234) {
            return -9;
        } else if (class263.field4694) {
            return 0;
        } else if (class163.method1215(73)) {
            return class45.field649 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZ)V")
    public static final void method1311(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field3265 = -24;
        }
        class135 var4 = class8.method38((byte) 104, 11, arg2);
        field3266++;
        var4.method1011((byte) 122);
        var4.field2535 = arg0;
        var4.field2539 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lhj;I)Z")
    public static final boolean method1312(class69 arg0, int arg1) {
        field3269++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class149.field2778; var2++) {
            if (arg0.method446(class105.field1977[var2], 71)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method1313(int arg0) {
        int var1 = 118 % ((arg0 + 54) / 56);
        field3268 = null;
        field3263 = null;
        field3270 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lnc;Lnc;B)I")
    public static final int method1314(class83 arg0, class83 arg1, byte arg2) {
        field3264++;
        if (arg2 > -65) {
            return -53;
        }
        int var3 = 0;
        if (arg0.method612(class186.field3368, -115)) {
            var3++;
        }
        if (arg0.method612(class56.field1006, -86)) {
            var3++;
        }
        if (arg0.method612(class165.field3049, -46)) {
            var3++;
        }
        if (arg1.method612(class186.field3368, -91)) {
            var3++;
        }
        if (arg1.method612(class56.field1006, -38)) {
            var3++;
        }
        if (arg1.method612(class165.field3049, -28)) {
            var3++;
        }
        return var3;
    }
}
