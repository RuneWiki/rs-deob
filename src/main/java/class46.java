import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class46 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lno;")
    private class476 field662;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lmf;")
    private class276 field660;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lae;")
    private class157 field666;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Loe;")
    public static class127 field668 = new class127(46, -2);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lha;")
    private class40 field667;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lnf;")
    private class390[] field664;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lap;ZLap;ZI)Lnf;", line = 4)
    private final class390 method320(class319 arg0, boolean arg1, class319 arg2, boolean arg3, int arg4) {
        field659++;
        if (this.field667 == null) {
            throw new RuntimeException();
        }
        this.field667.field585 = arg4 * 8 + 5;
        if (this.field667.field536.length <= this.field667.field585) {
            throw new RuntimeException();
        } else if (this.field664[arg4] != null) {
            return this.field664[arg4];
        } else if (arg3) {
            int var6 = this.field667.method255((byte) 96);
            int var7 = this.field667.method255((byte) 96);
            class390 var8 = new class390(arg4, arg2, arg0, this.field662, this.field660, var6, var7, arg1);
            this.field664[arg4] = var8;
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Z", line = 47)
    public final boolean method321(byte arg0) {
        field658++;
        if (this.field667 != null) {
            return true;
        }
        if (this.field666 == null) {
            if (this.field662.method2872((byte) 63)) {
                return false;
            }
            this.field666 = this.field662.method2861((byte) -122, true, (byte) 0, 255, 255);
        }
        if (arg0 > -21) {
            this.field664 = null;
        }
        if (this.field666.field3923) {
            return false;
        } else {
            this.field667 = new class40(this.field666.method1005(122));
            this.field664 = new class390[(this.field667.field536.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 75)
    public static void method322(int arg0) {
        if (arg0 != 4387) {
            method322(-72);
        }
        field668 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILap;Lap;)Lnf;", line = 90)
    public final class390 method323(int arg0, int arg1, class319 arg2, class319 arg3) {
        field663++;
        return arg0 > -127 ? null : this.method320(arg2, true, arg3, true, arg1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lbp;ILbp;)V", line = 102)
    public static final void method324(class251 arg0, int arg1, class251 arg2) {
        field665++;
        if (arg0.field3837 != null) {
            arg0.method1512((byte) 122);
        }
        arg0.field3842 = arg2.field3842;
        arg0.field3837 = arg2;
        if (arg1 >= -113) {
            method322(-55);
        }
        arg0.field3837.field3842 = arg0;
        arg0.field3842.field3837 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)I", line = 125)
    public static final int method325(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return 64;
        } else {
            field661++;
            return arg2 == 1 || arg2 == 3 ? class73.field1291[arg0 & 0x3] : class232.field3520[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 139)
    public final void method326(int arg0) {
        field669++;
        if (this.field664 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field664.length; var2++) {
            if (this.field664[var2] != null) {
                this.field664[var2].method2323(0);
            }
        }
        for (int var3 = 0; var3 < this.field664.length; var3++) {
            if (this.field664[var3] != null) {
                this.field664[var3].method2321(107);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lno;Lmf;)V", line = 173)
    public class46(class476 arg0, class276 arg1) {
        this.field662 = arg0;
        this.field660 = arg1;
        if (!this.field662.method2872((byte) 63)) {
            this.field666 = this.field662.method2861((byte) -74, true, (byte) 0, 255, 255);
        }
    }
}
