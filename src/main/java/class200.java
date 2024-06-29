import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class200 extends class64 {

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[Lbf;")
    public class200[] field3629;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Z")
    public boolean field3641;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Lid;")
    public static class149 field3634 = class60.method382("Hidden)2use", (byte) 45);

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Lid;")
    public static class149 field3637 = class60.method382("scrollbar", (byte) 54);

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lpi;")
    public class139 field3632;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Lwk;")
    public class271 field3638;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)[[I")
    public final int[][] method1366(int arg0, boolean arg1, int arg2) {
        field3631++;
        if (arg1) {
            field3637 = null;
        }
        if (this.field3629[arg2].field3641) {
            int[] var4 = this.field3629[arg2].method26(arg0, (byte) 55);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3629[arg2].method24(true, arg0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
    public int method89(int arg0) {
        field3642++;
        if (arg0 != -1) {
            field3624 = 88;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)[I")
    public int[] method26(int arg0, byte arg1) {
        field3628++;
        if (arg1 == 55) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
    public final void method1367(byte arg0, int arg1, int arg2) {
        field3635++;
        if (arg0 > -112) {
            this.field3641 = true;
        }
        int var4 = this.field3640 == 255 ? arg2 : this.field3640;
        if (this.field3641) {
            this.field3638 = new class271(var4, arg2, arg1);
        } else {
            this.field3632 = new class139(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)[I")
    public final int[] method1368(int arg0, int arg1, boolean arg2) {
        field3622++;
        if (arg2) {
            return null;
        } else if (this.field3629[arg0].field3641) {
            return this.field3629[arg0].method26(arg1, (byte) 55);
        } else {
            return this.field3629[arg0].method24(!arg2, arg1)[0];
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public static final int method1369(int arg0, int arg1) {
        if (arg1 != 1393598983) {
            method1374(-114, -89);
        }
        field3636++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)I")
    public int method700(byte arg0) {
        int var2 = -58 % ((-arg0 - 11) / 59);
        field3620++;
        return -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lgd;B)Lv;")
    public static final class150 method1370(class74 arg0, byte arg1) {
        if (arg1 == -121) {
            field3633++;
            return new class150(arg0.method526((byte) 125), arg0.method526((byte) 105), arg0.method526((byte) 66), arg0.method526((byte) 106), arg0.method525(65280), arg0.method525(65280), arg0.method489((byte) 86));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public void method88(byte arg0) {
        int var2 = 9 % ((-arg0 - 21) / 49);
        if (this.field3641) {
            this.field3638.method1880(0);
            this.field3638 = null;
        } else {
            this.field3632.method971((byte) -56);
            this.field3632 = null;
        }
        field3630++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public void method150(int arg0) {
        field3625++;
        int var2 = 92 % ((arg0 + 60) / 62);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static final void method1371(int arg0) {
        field3621++;
        class256.method1767(100);
        class211.method1441(arg0 ^ 0xFFFFB96C);
        class116.method807(80);
        class108.method752(120);
        class249.method1731(false);
        class63.method399((byte) 46);
        class249.method1728(19785);
        class232.method1567(-75);
        class36.method211(-117);
        class86.method642((byte) 56);
        class210.method1429(64);
        class22.method126((byte) -114);
        class171.method1226(-95);
        class249.method1730((byte) -107);
        class285.method1957(-19933);
        class252.method1747((byte) -33);
        if (class80.field1484 != 0) {
            for (int var1 = 0; var1 < class273.field4907.length; var1++) {
                class273.field4907[var1] = null;
            }
            class73.field1259 = 0;
        }
        class196.method1337(-2);
        class75.method537(-1);
        class249.field4372.method1291(arg0 ^ arg0);
        ((class136) class235.field4129).method951(0);
        class94.field1658.method804(arg0 ^ 0xFFFFB939);
        class101.field1774.method1542((byte) -86);
        class175.field3211.method1542((byte) -86);
        class133.field2423.method1542((byte) -86);
        class226.field3964.method1542((byte) -86);
        class221.field3874.method1542((byte) -86);
        class230.field4010.method1542((byte) -86);
        class269.field4851.method1542((byte) -86);
        class270.field4864.method1542((byte) -86);
        class164.field3058.method1542((byte) -86);
        class74.field1294.method1542((byte) -86);
        class162.field3003.method1542((byte) -86);
        class271.field4879.method1291(0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBI)I")
    public static final int method1372(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field3639++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (arg2 == -88) {
            return var4 == 2 ? 7 - arg1 : arg3;
        } else {
            return -111;
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public static void method1373(int arg0) {
        field3634 = null;
        if (arg0 != 29749) {
            method1370((class74) null, (byte) -125);
        }
        field3637 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Lli;")
    public static final class288 method1374(int arg0, int arg1) {
        field3623++;
        if (arg0 != -17177) {
            field3624 = 86;
        }
        class288 var2 = (class288) class41.field646.method1293((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field123.method1562(-809612665, class264.method1838(arg1, (byte) -68), class176.method1244(false, arg1));
        class288 var4 = new class288();
        var4.field5123 = arg1;
        if (var3 != null) {
            var4.method1971(false, new class74(var3));
        }
        class41.field646.method1295((long) arg1, var4, (byte) -71);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lgd;ZI)V")
    public void method31(class74 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3624 = 120;
        }
        field3627++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)[[I")
    public int[][] method24(boolean arg0, int arg1) {
        field3626++;
        if (!arg0) {
            field3634 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IZ)V")
    public class200(int arg0, boolean arg1) {
        this.field3629 = new class200[arg0];
        this.field3641 = arg1;
    }
}
