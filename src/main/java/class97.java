import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class97 {

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    private int field1647 = 0;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "[Ll;")
    public class80[] field1642;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1631 = 0;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lph;")
    public static class229 field1632 = class266.method1858("leuchten2:", 0);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lph;")
    public static class229 field1629 = class266.method1858("Textures charg-Bes", 0);

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lph;")
    private static class229 field1641 = class266.method1858("Face here", 0);

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lph;")
    public static class229 field1630 = field1641;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "J")
    private long field1624;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lsi;")
    public static class66 field1645;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Ll;")
    private class80 field1643;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Ll;")
    private class80 field1646;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ll;BJ)V", line = 4)
    public final void method710(class80 arg0, byte arg1, long arg2) {
        field1627++;
        if (arg0.field1318 != null) {
            arg0.method598(61);
        }
        class80 var5 = this.field1642[(int) (arg2 & (long) (this.field1637 - 1))];
        arg0.field1317 = var5;
        int var6 = 8 % ((14 - arg1) / 38);
        arg0.field1318 = var5.field1318;
        arg0.field1318.field1317 = arg0;
        arg0.field1325 = arg2;
        arg0.field1317.field1318 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Ll;", line = 28)
    public final class80 method711(int arg0) {
        this.field1647 = arg0;
        field1639++;
        return this.method718(27263);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 40)
    public final void method712(int arg0) {
        field1636++;
        for (int var2 = arg0; var2 < this.field1637; var2++) {
            class80 var3 = this.field1642[var2];
            while (true) {
                class80 var4 = var3.field1317;
                if (var3 == var4) {
                    break;
                }
                var4.method598(15);
            }
        }
        this.field1643 = null;
        this.field1646 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJ)Ll;", line = 75)
    public final class80 method713(int arg0, long arg1) {
        this.field1624 = arg1;
        class80 var4 = this.field1642[(int) ((long) (this.field1637 - 1) & arg1)];
        field1633++;
        if (arg0 != 3365) {
            return (class80) null;
        }
        for (this.field1643 = var4.field1317; this.field1643 != var4; this.field1643 = this.field1643.field1317) {
            if (this.field1643.field1325 == arg1) {
                class80 var5 = this.field1643;
                this.field1643 = this.field1643.field1317;
                return var5;
            }
        }
        this.field1643 = null;
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 106)
    public static void method714(byte arg0) {
        field1632 = null;
        field1630 = null;
        field1641 = null;
        if (arg0 < -39) {
            field1645 = null;
            field1629 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I", line = 126)
    public final int method715(int arg0) {
        int var2 = 0;
        field1644++;
        int var3 = -81 / ((89 - arg0) / 35);
        for (int var4 = 0; var4 < this.field1637; var4++) {
            class80 var5 = this.field1642[var4];
            class80 var6 = var5.field1317;
            while (var5 != var6) {
                var6 = var6.field1317;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lph;I)V", line = 165)
    public static final void method716(class229 arg0, int arg1) {
        int var2 = class95.method707(arg0, 0);
        field1625++;
        if (var2 != -1 && arg1 == 879) {
            class252.method1768(class1.field5.field868[var2], (byte) -72, class1.field5.field879[var2]);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Ll;", line = 181)
    public final class80 method717(int arg0) {
        field1640++;
        if (this.field1643 == null) {
            return null;
        }
        class80 var2 = this.field1642[(int) (this.field1624 & (long) (this.field1637 - 1))];
        if (arg0 != 29388) {
            this.method710((class80) null, (byte) 127, -81L);
        }
        while (this.field1643 != var2) {
            if (this.field1643.field1325 == this.field1624) {
                class80 var3 = this.field1643;
                this.field1643 = this.field1643.field1317;
                return var3;
            }
            this.field1643 = this.field1643.field1317;
        }
        this.field1643 = null;
        return null;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)Ll;", line = 215)
    public final class80 method718(int arg0) {
        if (arg0 != 27263) {
            return (class80) null;
        }
        field1635++;
        if (this.field1647 > 0 && this.field1642[this.field1647 - 1] != this.field1646) {
            class80 var2 = this.field1646;
            this.field1646 = var2.field1317;
            return var2;
        }
        class80 var3;
        do {
            if (this.field1647 >= this.field1637) {
                return null;
            }
            var3 = this.field1642[this.field1647++].field1317;
        } while (this.field1642[this.field1647 - 1] == var3);
        this.field1646 = var3.field1317;
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)I", line = 248)
    public final int method719(int arg0) {
        if (arg0 != 0) {
            this.method711(-24);
        }
        field1634++;
        return this.field1637;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lce;B)V", line = 268)
    public static final void method720(class209 arg0, byte arg1) {
        field1628++;
        class332 var2 = (class332) class122.field2049.method713(arg1 ^ 0xFFFFF2CE, arg0.field3463.method1634(false));
        if (var2 != null) {
            if (var2.field5662 != null) {
                class239.field3949.method2150(var2.field5662);
                var2.field5662 = null;
            }
            var2.method598(72);
        }
        if (arg1 != -21) {
            field1631 = 37;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[Ll;)I", line = 300)
    public final int method721(int arg0, class80[] arg1) {
        field1638++;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field1637; var4++) {
            class80 var5 = this.field1642[var4];
            for (class80 var6 = var5.field1317; var6 != var5; var6 = var6.field1317) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V", line = 326)
    public class97(int arg0) {
        this.field1637 = arg0;
        this.field1642 = new class80[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class80 var3 = this.field1642[var2] = new class80();
            var3.field1317 = var3;
            var3.field1318 = var3;
        }
    }
}
