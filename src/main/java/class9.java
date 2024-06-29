import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CRSWMDQF")
public class class9 {

    @OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "Z")
    private boolean field659 = false;

    @OriginalMember(owner = "client!CRSWMDQF", name = "g", descriptor = "I")
    public int field665 = -1;

    @OriginalMember(owner = "client!CRSWMDQF", name = "i", descriptor = "[I")
    public int[] field667 = new int[6];

    @OriginalMember(owner = "client!CRSWMDQF", name = "j", descriptor = "[I")
    public int[] field668 = new int[6];

    @OriginalMember(owner = "client!CRSWMDQF", name = "k", descriptor = "I")
    public int field669 = 128;

    @OriginalMember(owner = "client!CRSWMDQF", name = "l", descriptor = "I")
    public int field670 = 128;

    @OriginalMember(owner = "client!CRSWMDQF", name = "p", descriptor = "LRYXFUVWJ;")
    public static class48 field674 = new class48(30, -268);

    @OriginalMember(owner = "client!CRSWMDQF", name = "c", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!CRSWMDQF", name = "e", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!CRSWMDQF", name = "f", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!CRSWMDQF", name = "m", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!CRSWMDQF", name = "n", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!CRSWMDQF", name = "o", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!CRSWMDQF", name = "h", descriptor = "LSPUHKLMC;")
    public class50 field666;

    @OriginalMember(owner = "client!CRSWMDQF", name = "b", descriptor = "Z")
    private static boolean field660;

    @OriginalMember(owner = "client!CRSWMDQF", name = "d", descriptor = "[LCRSWMDQF;")
    public static class9[] field662;

    @OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "(ZLVSQMPWOM;)V")
    public static void method297(boolean arg0, class59 arg1) {
        class3 var2 = new class3(arg1.method526("spotanim.dat", null), -990);
        field661 = var2.method56();
        if (field662 == null) {
            field662 = new class9[field661];
        }
        for (int var3 = 0; var3 < field661; var3++) {
            if (field662[var3] == null) {
                field662[var3] = new class9();
            }
            field662[var3].field663 = var3;
            field662[var3].method298((byte) -11, var2);
        }
        if (!arg0) {
            field660 = !field660;
        }
    }

    @OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public void method298(byte arg0, class3 arg1) {
        if (arg0 != -11) {
            this.field659 = !this.field659;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method54();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field664 = arg1.method56();
                } else if (var3 == 2) {
                    this.field665 = arg1.method56();
                    if (class50.field1392 != null) {
                        this.field666 = class50.field1392[this.field665];
                    }
                } else if (var3 == 4) {
                    this.field669 = arg1.method56();
                } else if (var3 == 5) {
                    this.field670 = arg1.method56();
                } else if (var3 == 6) {
                    this.field671 = arg1.method56();
                } else if (var3 == 7) {
                    this.field672 = arg1.method54();
                } else if (var3 == 8) {
                    this.field673 = arg1.method54();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field667[var3 - 40] = arg1.method56();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field668[var3 - 50] = arg1.method56();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "()LXBVYIDUH;")
    public class65 method299() {
        class65 var1 = (class65) field674.method495((long) this.field663);
        if (var1 != null) {
            return var1;
        }
        class65 var2 = class65.method541(this.field664);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field667[0] != 0) {
                var2.method555(this.field667[var3], this.field668[var3]);
            }
        }
        field674.method496(true, var2, (long) this.field663);
        return var2;
    }
}
