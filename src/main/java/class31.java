import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Ldb;")
    private class24 field667 = new class24();

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Llf;")
    private class82 field678 = new class82();

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lwd;")
    private class153 field674;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public static int[] field655 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
    public static int[] field660 = new int[200];

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field664 = 0;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lqf;")
    public static class117 field668 = class72.method514(109, "k");

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lqf;")
    private static class117 field669 = class72.method514(106, "Password: ");

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lqf;")
    public static class117 field670 = class72.method514(104, "Cabbage");

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lqf;")
    public static class117 field657 = field669;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lha;")
    public static class50 field666;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljb;")
    public static class64 field659;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Laf;")
    public static class7 field656;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
    public static int[] field673;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Ldb;")
    public final class24 method247(int arg0, long arg1) {
        if (arg0 != 0) {
            method255(-102, -12, 69, -43, -89, 15, 34, -103, -73);
        }
        field671++;
        class24 var4 = (class24) this.field674.method1221(arg0 ^ 0xC, arg1);
        if (var4 != null) {
            this.field678.method645(true, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(JBLdb;)V")
    public final void method248(long arg0, byte arg1, class24 arg2) {
        if (this.field675 == 0) {
            class24 var5 = this.field678.method647((byte) 98);
            var5.method495(-81);
            var5.method185(-117);
            if (this.field667 == var5) {
                class24 var6 = this.field678.method647((byte) 78);
                var6.method495(-78);
                var6.method185(-114);
            }
        } else {
            this.field675--;
        }
        field654++;
        this.field674.method1219(arg2, (byte) 61, arg0);
        this.field678.method645(true, arg2);
        if (arg1 >= -100) {
            this.method248(-105L, (byte) 108, null);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
    public static final void method249(byte arg0) {
        for (int var1 = 0; var1 < class91.field2225; var1++) {
            int var2 = class56.field1151[var1];
            class21 var3 = class149.field3709[var2];
            int var4 = class96.field2338.method570((byte) 123);
            if ((var4 & 0x2) != 0) {
                var4 += class96.field2338.method570((byte) 123) << 8;
            }
            class77.method602(var2, var3, (byte) 47, var4);
        }
        field653++;
        if (arg0 > -73) {
            field669 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
    public final void method250(byte arg0) {
        if (arg0 != -54) {
            return;
        }
        while (true) {
            class24 var2 = this.field678.method647((byte) 94);
            if (var2 == null) {
                this.field675 = this.field676;
                field665++;
                return;
            }
            var2.method495(-69);
            var2.method185(-124);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjb;)V")
    public static final void method251(int arg0, class64 arg1) {
        if (arg0 != 1792) {
            field668 = null;
        }
        class107.field2545 = arg1;
        field661++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method252(int arg0) {
        field656 = null;
        field669 = null;
        field659 = null;
        field657 = null;
        field660 = null;
        field670 = null;
        if (arg0 != -4) {
            method249((byte) -128);
        }
        field655 = null;
        field673 = null;
        field666 = null;
        field668 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZJ)V")
    public final void method253(boolean arg0, long arg1) {
        if (arg0) {
            return;
        }
        class24 var4 = (class24) this.field674.method1221(20, arg1);
        field672++;
        if (var4 != null) {
            var4.method495(-18);
            var4.method185(-117);
            this.field675++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
    public static final int method254(int arg0, int arg1, int arg2) {
        field663++;
        int var3 = 21 / ((-arg2 - 40) / 41);
        if (arg0 >= 2) {
            int var4 = method254(arg0 >> 1, arg1 * arg1, 95);
            if ((arg0 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            return var4;
        } else if (arg0 == 1) {
            return arg1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field677++;
        if (class26.method201(arg1, 314356016)) {
            class152.method1211(arg4, arg6, arg5, arg0, class141.field3426[arg1], arg2, arg8, 0, 0, -1, arg3, (byte) 1);
            if (arg7 != -29013) {
                field673 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lmf;I)Z")
    public static final boolean method256(class89 arg0, int arg1) {
        field662++;
        if (arg0.field2058 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < arg0.field2058.length; var2++) {
            int var3 = class143.method1160(0, var2, arg0);
            int var4 = arg0.field2075[var2];
            if (arg0.field2058[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field2058[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field2058[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
    public class31(int arg0) {
        this.field675 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field676 = arg0;
        this.field674 = new class153(var2);
    }
}
