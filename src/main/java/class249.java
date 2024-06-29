import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class249 {

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lag;")
    public class180 field3504 = new class180();

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ltm;")
    public static class112 field3491 = new class112("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lfn;")
    public static class52 field3496 = new class52(51, -2);

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[[I")
    public static int[][] field3506;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lag;")
    private class180 field3505;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lsm;BLag;)V")
    private final void method1540(class249 arg0, byte arg1, class180 arg2) {
        field3494++;
        class180 var4 = this.field3504.field2609;
        if (arg1 != -119) {
            return;
        }
        this.field3504.field2609 = arg2.field2609;
        arg2.field2609.field2610 = this.field3504;
        if (this.field3504 != arg2) {
            arg2.field2609 = arg0.field3504.field2609;
            arg2.field2609.field2610 = arg2;
            var4.field2610 = arg0.field3504;
            arg0.field3504.field2609 = var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLag;)V")
    public final void method1541(byte arg0, class180 arg1) {
        field3500++;
        if (arg0 > -30) {
            field3506 = null;
        }
        if (arg1.field2609 != null) {
            arg1.method1182(28818);
        }
        arg1.field2610 = this.field3504.field2610;
        arg1.field2609 = this.field3504;
        arg1.field2609.field2610 = arg1;
        arg1.field2610.field2609 = arg1;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ltq;Z)Z")
    public static final boolean method1542(class478 arg0, boolean arg1) {
        boolean var2 = class8.field166 == class317.field4306;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method510((byte) -86);
        if (arg0.field6753 < 0 || arg0.field6747 < 0 || arg0.field6751 >= class456.field6299 || arg0.field6749 >= class205.field2946) {
            return false;
        }
        for (int var6 = arg0.field6753; var6 <= arg0.field6751; var6++) {
            for (int var9 = arg0.field6747; var9 <= arg0.field6749; var9++) {
                class406 var10 = class11.method105(arg0.field6766, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6753) {
                        var11++;
                    }
                    if (var6 < arg0.field6751) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6747) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6749) {
                        var11 += 2;
                    }
                    class146 var12 = class293.method1812(arg0, var11, false);
                    class146 var13 = var10.field5613;
                    if (var13 == null) {
                        var10.field5613 = var12;
                    } else {
                        while (var13.field2066 != null) {
                            var13 = var13.field2066;
                        }
                        var13.field2066 = var12;
                    }
                    var10.field5604 = (byte) (var10.field5604 | var11);
                    if (var2 && (class132.field1860[var6][var9] & 0xFF000000) != 0) {
                        var3 = class132.field1860[var6][var9];
                        var4 = class269.field3727[var6][var9];
                        var5 = class226.field3194[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6753; var7 <= arg0.field6751; var7++) {
                for (int var8 = arg0.field6747; var8 <= arg0.field6749; var8++) {
                    if ((class132.field1860[var7][var8] & 0xFF000000) == 0) {
                        class132.field1860[var7][var8] = var3;
                        class269.field3727[var7][var8] = var4;
                        class226.field3194[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class238.field3364[class160.field2305++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lag;")
    public final class180 method1543(int arg0) {
        if (arg0 != 4) {
            return null;
        }
        field3489++;
        class180 var2 = this.field3505;
        if (this.field3504 == var2) {
            this.field3505 = null;
            return null;
        } else {
            this.field3505 = var2.field2609;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Lag;")
    public final class180 method1544(int arg0) {
        if (arg0 > -84) {
            this.field3504 = null;
        }
        field3498++;
        class180 var2 = this.field3504.field2610;
        if (this.field3504 == var2) {
            this.field3505 = null;
            return null;
        } else {
            this.field3505 = var2.field2610;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)Lag;")
    public final class180 method1545(int arg0) {
        field3499++;
        class180 var2 = this.field3504.field2609;
        if (this.field3504 == var2) {
            this.field3505 = null;
            return null;
        } else if (arg0 >= -6) {
            return null;
        } else {
            this.field3505 = var2.field2609;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)Lag;")
    public final class180 method1546(byte arg0) {
        field3490++;
        class180 var2 = this.field3505;
        if (this.field3504 == var2) {
            this.field3505 = null;
            return null;
        } else if (arg0 == -42) {
            this.field3505 = var2.field2610;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)I")
    public final int method1547(int arg0) {
        if (arg0 != 4) {
            this.method1545(13);
        }
        field3502++;
        int var2 = 0;
        for (class180 var3 = this.field3504.field2610; var3 != this.field3504; var3 = var3.field2610) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)Lag;")
    public final class180 method1548(int arg0) {
        if (arg0 != 8779) {
            return null;
        }
        field3501++;
        class180 var2 = this.field3504.field2610;
        if (this.field3504 == var2) {
            return null;
        } else {
            var2.method1182(28818);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)Z")
    public final boolean method1549(int arg0) {
        field3497++;
        if (arg0 != 2) {
            field3491 = null;
        }
        return this.field3504.field2610 == this.field3504;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILsm;)V")
    public final void method1550(int arg0, class249 arg1) {
        this.method1540(arg1, (byte) -119, this.field3504.field2610);
        if (arg0 > 31) {
            field3492++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1551(String arg0, boolean arg1) {
        field3495++;
        if (arg0 == null) {
            return false;
        }
        if (!arg1) {
            method1551((String) null, true);
        }
        for (int var2 = 0; var2 < class205.field2934; var2++) {
            if (arg0.equalsIgnoreCase(class321.field4403[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class2.field21.field407);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
    public final void method1552(byte arg0) {
        while (true) {
            class180 var2 = this.field3504.field2610;
            if (this.field3504 == var2) {
                field3503++;
                this.field3505 = null;
                if (arg0 != 117) {
                    method1551((String) null, true);
                    return;
                }
                return;
            }
            var2.method1182(28818);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(BLag;)V")
    public final void method1553(byte arg0, class180 arg1) {
        if (arg1.field2609 != null) {
            arg1.method1182(28818);
        }
        field3493++;
        arg1.field2610 = this.field3504;
        if (arg0 > -76) {
            field3506 = null;
        }
        arg1.field2609 = this.field3504.field2609;
        arg1.field2609.field2610 = arg1;
        arg1.field2610.field2609 = arg1;
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
    public static void method1554(int arg0) {
        if (arg0 != 6) {
            method1555((class363) null, (byte) 13);
        }
        field3506 = null;
        field3491 = null;
        field3496 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lms;B)Lms;")
    public static final class363 method1555(class363 arg0, byte arg1) {
        field3488++;
        if (arg1 < 53) {
            method1554(82);
        }
        class363 var2 = client.method2329(arg0);
        if (var2 == null) {
            var2 = arg0.field5122;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
    public class249() {
        this.field3504.field2609 = this.field3504;
        this.field3504.field2610 = this.field3504;
    }

    static {
        new class112("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field3506 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    }
}
