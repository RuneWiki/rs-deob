import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KMWMLVIH")
public class class26 {

    @OriginalMember(owner = "client!KMWMLVIH", name = "g", descriptor = "I")
    public int field926 = -1;

    @OriginalMember(owner = "client!KMWMLVIH", name = "i", descriptor = "Z")
    public boolean field928 = false;

    @OriginalMember(owner = "client!KMWMLVIH", name = "j", descriptor = "I")
    public int field929 = 5;

    @OriginalMember(owner = "client!KMWMLVIH", name = "k", descriptor = "I")
    public int field930 = -1;

    @OriginalMember(owner = "client!KMWMLVIH", name = "l", descriptor = "I")
    public int field931 = -1;

    @OriginalMember(owner = "client!KMWMLVIH", name = "m", descriptor = "I")
    public int field932 = 99;

    @OriginalMember(owner = "client!KMWMLVIH", name = "n", descriptor = "I")
    public int field933 = -1;

    @OriginalMember(owner = "client!KMWMLVIH", name = "o", descriptor = "I")
    public int field934 = -1;

    @OriginalMember(owner = "client!KMWMLVIH", name = "p", descriptor = "I")
    public int field935 = 2;

    @OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!KMWMLVIH", name = "c", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!KMWMLVIH", name = "q", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!KMWMLVIH", name = "r", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!KMWMLVIH", name = "d", descriptor = "[I")
    public int[] field923;

    @OriginalMember(owner = "client!KMWMLVIH", name = "e", descriptor = "[I")
    public int[] field924;

    @OriginalMember(owner = "client!KMWMLVIH", name = "f", descriptor = "[I")
    private int[] field925;

    @OriginalMember(owner = "client!KMWMLVIH", name = "h", descriptor = "[I")
    public int[] field927;

    @OriginalMember(owner = "client!KMWMLVIH", name = "b", descriptor = "[LKMWMLVIH;")
    public static class26[] field921;

    @OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "(LWEMOPWVJ;I)V")
    public static void method319(class62 arg0, int arg1) {
        class52 var2 = new class52(arg0.method559("seq.dat", null), true);
        field920 = var2.method463();
        if (field921 == null) {
            field921 = new class26[field920];
        }
        for (int var3 = 0; var3 < field920; var3++) {
            if (field921[var3] == null) {
                field921[var3] = new class26();
            }
            field921[var3].method321(-13096, var2);
        }
        if (arg1 != 24414) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "(IB)I")
    public int method320(int arg0, byte arg1) {
        int var3 = this.field925[arg0];
        if (arg1 != 0) {
            return 0;
        }
        boolean var4 = false;
        if (var3 == 0) {
            class45 var5 = class45.method405(this.field923[arg0]);
            if (var5 != null) {
                var3 = this.field925[arg0] = var5.field1249;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!KMWMLVIH", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public void method321(int arg0, class52 arg1) {
        if (arg0 != -13096) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method461();
                if (var4 == 0) {
                    if (this.field922 == 0) {
                        this.field922 = 1;
                        this.field923 = new int[1];
                        this.field923[0] = -1;
                        this.field924 = new int[1];
                        this.field924[0] = -1;
                        this.field925 = new int[1];
                        this.field925[0] = -1;
                    }
                    if (this.field933 == -1) {
                        if (this.field927 == null) {
                            this.field933 = 0;
                        } else {
                            this.field933 = 2;
                        }
                    }
                    if (this.field934 == -1) {
                        if (this.field927 != null) {
                            this.field934 = 2;
                            return;
                        }
                        this.field934 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field922 = arg1.method461();
                    this.field923 = new int[this.field922];
                    this.field924 = new int[this.field922];
                    this.field925 = new int[this.field922];
                    for (int var5 = 0; var5 < this.field922; var5++) {
                        this.field923[var5] = arg1.method463();
                        this.field924[var5] = arg1.method463();
                        if (this.field924[var5] == 65535) {
                            this.field924[var5] = -1;
                        }
                        this.field925[var5] = arg1.method463();
                    }
                } else if (var4 == 2) {
                    this.field926 = arg1.method463();
                } else if (var4 == 3) {
                    int var6 = arg1.method461();
                    this.field927 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field927[var7] = arg1.method461();
                    }
                    this.field927[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field928 = true;
                } else if (var4 == 5) {
                    this.field929 = arg1.method461();
                } else if (var4 == 6) {
                    this.field930 = arg1.method463();
                } else if (var4 == 7) {
                    this.field931 = arg1.method463();
                } else if (var4 == 8) {
                    this.field932 = arg1.method461();
                } else if (var4 == 9) {
                    this.field933 = arg1.method461();
                } else if (var4 == 10) {
                    this.field934 = arg1.method461();
                } else if (var4 == 11) {
                    this.field935 = arg1.method461();
                } else if (var4 == 12) {
                    this.field936 = arg1.method466();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
