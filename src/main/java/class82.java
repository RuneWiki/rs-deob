import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class82 {

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ls;")
    private class92 field1497;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lud;")
    private class51 field1496;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ljc;")
    private class268 field1501;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1492 = 1;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field1490 = 0;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lrc;")
    public static class9 field1502 = new class9(200);

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Leh;")
    private class101 field1491;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[Lig;")
    private class135[] field1498;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method537(byte arg0) {
        field1502 = null;
        int var1 = -85 % ((-arg0 - 47) / 47);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBIII)V")
    public static final void method538(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1494++;
        if (arg3 <= 15) {
            return;
        }
        if (class126.field2222 <= arg6 && class118.field2098 >= arg4 && class118.field2094 <= arg0 && arg2 <= class89.field1582) {
            if (arg5 == 1) {
                class3.method18(arg2, arg0, arg6, arg1, arg4, true);
            } else {
                class135.method944(arg0, arg2, arg4, arg6, arg1, arg5, 86);
            }
        } else if (arg5 == 1) {
            class259.method1721(arg2, arg6, arg1, arg0, arg4, -792153624);
        } else {
            class143.method997(arg6, arg5, arg1, arg2, arg4, (byte) -100, arg0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method539(boolean arg0, String arg1) {
        field1487++;
        if (class182.field2972 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class103.method702(true, arg1);
        if (var3 == 0L) {
            return;
        }
        if (arg0) {
            field1489 = 115;
        }
        while (class182.field2972.length > var2 && class182.field2972[var2].field1515 != var3) {
            var2++;
        }
        if (var2 < class182.field2972.length && class182.field2972[var2] != null) {
            class167.field2746++;
            class168.field2778.method199(89, -98);
            class168.field2778.method640(21691, class182.field2972[var2].field1515);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)Z")
    public final boolean method540(byte arg0) {
        field1493++;
        if (this.field1491 != null) {
            return true;
        }
        if (this.field1501 == null) {
            if (this.field1496.method320(116)) {
                return false;
            }
            this.field1501 = this.field1496.method322(true, (byte) 23, 255, (byte) 0, 255);
        }
        if (arg0 <= 114) {
            this.method542((class126) null, -71, 26, (class126) null);
        }
        if (this.field1501.field2893) {
            return false;
        } else {
            this.field1491 = new class101(this.field1501.method36((byte) 46));
            this.field1498 = new class135[(this.field1491.field1730.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BZLac;Lac;I)Lig;")
    private final class135 method541(byte arg0, boolean arg1, class126 arg2, class126 arg3, int arg4) {
        field1499++;
        if (this.field1491 == null) {
            throw new RuntimeException();
        }
        this.field1491.field1762 = arg4 * 8 + 5;
        if (this.field1491.field1762 >= this.field1491.field1730.length) {
            throw new RuntimeException();
        } else if (this.field1498[arg4] == null) {
            int var6 = this.field1491.method655((byte) 49);
            int var7 = this.field1491.method655((byte) 61);
            class135 var8 = new class135(arg4, arg2, arg3, this.field1496, this.field1497, var6, var7, arg1);
            if (arg0 >= -52) {
                method537((byte) -25);
            }
            this.field1498[arg4] = var8;
            return var8;
        } else {
            return this.field1498[arg4];
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lud;Ls;)V")
    public class82(class51 arg0, class92 arg1) {
        this.field1497 = arg1;
        this.field1496 = arg0;
        if (!this.field1496.method320(79)) {
            this.field1501 = this.field1496.method322(true, (byte) 23, 255, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lac;IILac;)Lig;")
    public final class135 method542(class126 arg0, int arg1, int arg2, class126 arg3) {
        field1488++;
        if (arg2 != -24338) {
            method538(-82, 117, -35, (byte) -35, 101, 70, -35);
        }
        return this.method541((byte) -89, true, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLvh;)V")
    public static final void method543(byte arg0, class108 arg1) {
        class292.field4661 = arg1;
        field1495++;
        if (arg0 != 97) {
            method543((byte) -46, (class108) null);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
    public final void method544(byte arg0) {
        field1500++;
        if (this.field1498 == null || arg0 >= -77) {
            return;
        }
        for (int var2 = 0; var2 < this.field1498.length; var2++) {
            if (this.field1498[var2] != null) {
                this.field1498[var2].method943((byte) -1);
            }
        }
        for (int var3 = 0; var3 < this.field1498.length; var3++) {
            if (this.field1498[var3] != null) {
                this.field1498[var3].method938(true);
            }
        }
    }
}
