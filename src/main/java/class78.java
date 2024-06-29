import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class78 {

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    private int field1424 = 0;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lum;")
    public class108[] field1423;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field1414 = new int[2];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Ljc;")
    public static class584 field1412 = new class584("stellardawn", 1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
    private long field1411;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lum;")
    private class108 field1413;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Lum;")
    private class108 field1425;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lha;")
    public static class116 field1416;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lum;", line = 3)
    public final class108 method734(int arg0) {
        field1408++;
        this.field1424 = arg0;
        return this.method736(-1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method735(int arg0, int arg1, int arg2) {
        if (arg0 == 9793) {
            field1415++;
            return (arg2 & 0x800) != 0 | class244.method1549(arg2, arg1, -24048) || class155.method1097((byte) -104, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lum;", line = 24)
    public final class108 method736(int arg0) {
        field1417++;
        if (this.field1424 > 0 && this.field1423[this.field1424 - 1] != this.field1425) {
            class108 var2 = this.field1425;
            this.field1425 = var2.field1802;
            return var2;
        } else if (arg0 == -1) {
            while (this.field1424 < this.field1418) {
                class108 var3 = this.field1423[this.field1424++].field1802;
                if (this.field1423[this.field1424 - 1] != var3) {
                    this.field1425 = var3.field1802;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(JBLum;)V", line = 62)
    public final void method737(long arg0, byte arg1, class108 arg2) {
        field1419++;
        if (arg2.field1800 != null) {
            arg2.method911(arg1 ^ 0xFFFFFF90);
        }
        if (arg1 != 92) {
            this.method740(119, 2L);
        }
        class108 var5 = this.field1423[(int) ((long) (this.field1418 - 1) & arg0)];
        arg2.field1802 = var5;
        arg2.field1800 = var5.field1800;
        arg2.field1800.field1802 = arg2;
        arg2.field1802.field1800 = arg2;
        arg2.field1798 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I", line = 83)
    public final int method738(byte arg0) {
        int var2 = -78 / ((-arg0 - 47) / 53);
        field1407++;
        return this.field1418;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V", line = 94)
    public final void method739(int arg0) {
        field1421++;
        if (arg0 != 2048) {
            this.method744(null, (byte) -93);
        }
        for (int var2 = 0; var2 < this.field1418; var2++) {
            class108 var3 = this.field1423[var2];
            while (true) {
                class108 var4 = var3.field1802;
                if (var3 == var4) {
                    break;
                }
                var4.method911(-52);
            }
        }
        this.field1425 = null;
        this.field1413 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJ)Lum;", line = 126)
    public final class108 method740(int arg0, long arg1) {
        this.field1411 = arg1;
        if (arg0 != 0) {
            this.field1424 = -5;
        }
        field1420++;
        class108 var4 = this.field1423[(int) ((long) (this.field1418 - 1) & arg1)];
        for (this.field1413 = var4.field1802; this.field1413 != var4; this.field1413 = this.field1413.field1802) {
            if (this.field1413.field1798 == arg1) {
                class108 var5 = this.field1413;
                this.field1413 = this.field1413.field1802;
                return var5;
            }
        }
        this.field1413 = null;
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Lum;", line = 155)
    public final class108 method741(int arg0) {
        field1409++;
        if (this.field1413 == null) {
            return null;
        }
        class108 var2 = this.field1423[(int) ((long) (this.field1418 - 1) & this.field1411)];
        while (this.field1413 != var2) {
            if (this.field1413.field1798 == this.field1411) {
                class108 var3 = this.field1413;
                this.field1413 = this.field1413.field1802;
                return var3;
            }
            this.field1413 = this.field1413.field1802;
        }
        this.field1413 = null;
        return arg0 == -1 ? null : null;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I", line = 186)
    public final int method742(int arg0) {
        field1422++;
        if (arg0 <= 24) {
            this.field1423 = null;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1418; var3++) {
            class108 var4 = this.field1423[var3];
            class108 var5 = var4.field1802;
            while (var4 != var5) {
                var5 = var5.field1802;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 218)
    public static void method743(int arg0) {
        field1416 = null;
        if (arg0 >= -54) {
            method735(-17, -110, -20);
        }
        field1414 = null;
        field1412 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lum;B)I", line = 237)
    public final int method744(class108[] arg0, byte arg1) {
        field1410++;
        if (arg1 > -96) {
            this.method739(54);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1418; var4++) {
            class108 var5 = this.field1423[var4];
            for (class108 var6 = var5.field1802; var6 != var5; var6 = var6.field1802) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V", line = 277)
    public class78(int arg0) {
        this.field1423 = new class108[arg0];
        this.field1418 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class108 var3 = this.field1423[var2] = new class108();
            var3.field1802 = var3;
            var3.field1800 = var3;
        }
    }
}
