import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KAIFCIAJ")
public class class27 {

    @OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "Z")
    private boolean field846 = true;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "i", descriptor = "I")
    public int field854 = -1;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "k", descriptor = "Z")
    public boolean field856 = false;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "l", descriptor = "I")
    public int field857 = 5;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "m", descriptor = "I")
    public int field858 = -1;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "n", descriptor = "I")
    public int field859 = -1;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "o", descriptor = "I")
    public int field860 = 99;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "p", descriptor = "I")
    public int field861 = -1;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "q", descriptor = "I")
    public int field862 = -1;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "r", descriptor = "I")
    public int field863 = 2;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "b", descriptor = "I")
    private static int field847 = 48306;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "c", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "e", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "s", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "t", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "f", descriptor = "[I")
    public int[] field851;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "g", descriptor = "[I")
    public int[] field852;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "h", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "j", descriptor = "[I")
    public int[] field855;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "d", descriptor = "[LKAIFCIAJ;")
    public static class27[] field849;

    @OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "(BLESUFCMYV;)V")
    public static void method239(byte arg0, class11 arg1) {
        class53 var2 = new class53(arg1.method205("seq.dat", null), (byte) -17);
        field848 = var2.method457();
        if (arg0 != 6) {
            field847 = 72;
        }
        if (field849 == null) {
            field849 = new class27[field848];
        }
        for (int var3 = 0; var3 < field848; var3++) {
            if (field849[var3] == null) {
                field849[var3] = new class27();
            }
            field849[var3].method241(5, var2);
        }
    }

    @OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "(BI)I")
    public int method240(byte arg0, int arg1) {
        int var3 = this.field853[arg1];
        if (arg0 != 0) {
            return 3;
        }
        if (var3 == 0) {
            class49 var4 = class49.method427(this.field851[arg1]);
            if (var4 != null) {
                var3 = this.field853[arg1] = var4.field1419;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!KAIFCIAJ", name = "a", descriptor = "(ILRGCGKKUR;)V")
    public void method241(int arg0, class53 arg1) {
        if (arg0 != 5) {
            this.field846 = !this.field846;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    if (this.field850 == 0) {
                        this.field850 = 1;
                        this.field851 = new int[1];
                        this.field851[0] = -1;
                        this.field852 = new int[1];
                        this.field852[0] = -1;
                        this.field853 = new int[1];
                        this.field853[0] = -1;
                    }
                    if (this.field861 == -1) {
                        if (this.field855 == null) {
                            this.field861 = 0;
                        } else {
                            this.field861 = 2;
                        }
                    }
                    if (this.field862 == -1) {
                        if (this.field855 != null) {
                            this.field862 = 2;
                            return;
                        }
                        this.field862 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field850 = arg1.method455();
                    this.field851 = new int[this.field850];
                    this.field852 = new int[this.field850];
                    this.field853 = new int[this.field850];
                    for (int var4 = 0; var4 < this.field850; var4++) {
                        this.field851[var4] = arg1.method457();
                        this.field852[var4] = arg1.method457();
                        if (this.field852[var4] == 65535) {
                            this.field852[var4] = -1;
                        }
                        this.field853[var4] = arg1.method457();
                    }
                } else if (var3 == 2) {
                    this.field854 = arg1.method457();
                } else if (var3 == 3) {
                    int var5 = arg1.method455();
                    this.field855 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field855[var6] = arg1.method455();
                    }
                    this.field855[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field856 = true;
                } else if (var3 == 5) {
                    this.field857 = arg1.method455();
                } else if (var3 == 6) {
                    this.field858 = arg1.method457();
                } else if (var3 == 7) {
                    this.field859 = arg1.method457();
                } else if (var3 == 8) {
                    this.field860 = arg1.method455();
                } else if (var3 == 9) {
                    this.field861 = arg1.method455();
                } else if (var3 == 10) {
                    this.field862 = arg1.method455();
                } else if (var3 == 11) {
                    this.field863 = arg1.method455();
                } else if (var3 == 12) {
                    this.field864 = arg1.method460();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
