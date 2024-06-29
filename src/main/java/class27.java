import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KYGPROVJ")
public class class27 {

    @OriginalMember(owner = "client!KYGPROVJ", name = "h", descriptor = "I")
    public int field928 = -1;

    @OriginalMember(owner = "client!KYGPROVJ", name = "j", descriptor = "Z")
    public boolean field930 = false;

    @OriginalMember(owner = "client!KYGPROVJ", name = "k", descriptor = "I")
    public int field931 = 5;

    @OriginalMember(owner = "client!KYGPROVJ", name = "l", descriptor = "I")
    public int field932 = -1;

    @OriginalMember(owner = "client!KYGPROVJ", name = "m", descriptor = "I")
    public int field933 = -1;

    @OriginalMember(owner = "client!KYGPROVJ", name = "n", descriptor = "I")
    public int field934 = 99;

    @OriginalMember(owner = "client!KYGPROVJ", name = "o", descriptor = "I")
    public int field935 = -1;

    @OriginalMember(owner = "client!KYGPROVJ", name = "p", descriptor = "I")
    public int field936 = -1;

    @OriginalMember(owner = "client!KYGPROVJ", name = "q", descriptor = "I")
    public int field937 = 2;

    @OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "I")
    private static int field921 = -962;

    @OriginalMember(owner = "client!KYGPROVJ", name = "b", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!KYGPROVJ", name = "d", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!KYGPROVJ", name = "r", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!KYGPROVJ", name = "s", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!KYGPROVJ", name = "e", descriptor = "[I")
    public int[] field925;

    @OriginalMember(owner = "client!KYGPROVJ", name = "f", descriptor = "[I")
    public int[] field926;

    @OriginalMember(owner = "client!KYGPROVJ", name = "g", descriptor = "[I")
    private int[] field927;

    @OriginalMember(owner = "client!KYGPROVJ", name = "i", descriptor = "[I")
    public int[] field929;

    @OriginalMember(owner = "client!KYGPROVJ", name = "c", descriptor = "[LKYGPROVJ;")
    public static class27[] field923;

    @OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "(LRSPRYUFS;I)V")
    public static void method255(class49 arg0, int arg1) {
        while (arg1 >= 0) {
            field921 = 108;
        }
        class36 var2 = new class36(-587, arg0.method427("seq.dat", null));
        field922 = var2.method341();
        if (field923 == null) {
            field923 = new class27[field922];
        }
        for (int var3 = 0; var3 < field922; var3++) {
            if (field923[var3] == null) {
                field923[var3] = new class27();
            }
            field923[var3].method257((byte) 6, var2);
        }
    }

    @OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "(II)I")
    public int method256(int arg0, int arg1) {
        int var3 = 6 / arg1;
        int var4 = this.field927[arg0];
        if (var4 == 0) {
            class69 var5 = class69.method578(this.field925[arg0]);
            if (var5 != null) {
                var4 = this.field927[arg0] = var5.field1706;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!KYGPROVJ", name = "a", descriptor = "(BLNQUAUMDT;)V")
    public void method257(byte arg0, class36 arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.method339();
                if (var4 == 0) {
                    if (this.field924 == 0) {
                        this.field924 = 1;
                        this.field925 = new int[1];
                        this.field925[0] = -1;
                        this.field926 = new int[1];
                        this.field926[0] = -1;
                        this.field927 = new int[1];
                        this.field927[0] = -1;
                    }
                    if (this.field935 == -1) {
                        if (this.field929 == null) {
                            this.field935 = 0;
                        } else {
                            this.field935 = 2;
                        }
                    }
                    if (this.field936 == -1) {
                        if (this.field929 != null) {
                            this.field936 = 2;
                            return;
                        }
                        this.field936 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field924 = arg1.method339();
                    this.field925 = new int[this.field924];
                    this.field926 = new int[this.field924];
                    this.field927 = new int[this.field924];
                    for (int var5 = 0; var5 < this.field924; var5++) {
                        this.field925[var5] = arg1.method341();
                        this.field926[var5] = arg1.method341();
                        if (this.field926[var5] == 65535) {
                            this.field926[var5] = -1;
                        }
                        this.field927[var5] = arg1.method341();
                    }
                } else if (var4 == 2) {
                    this.field928 = arg1.method341();
                } else if (var4 == 3) {
                    int var6 = arg1.method339();
                    this.field929 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field929[var7] = arg1.method339();
                    }
                    this.field929[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field930 = true;
                } else if (var4 == 5) {
                    this.field931 = arg1.method339();
                } else if (var4 == 6) {
                    this.field932 = arg1.method341();
                } else if (var4 == 7) {
                    this.field933 = arg1.method341();
                } else if (var4 == 8) {
                    this.field934 = arg1.method339();
                } else if (var4 == 9) {
                    this.field935 = arg1.method339();
                } else if (var4 == 10) {
                    this.field936 = arg1.method339();
                } else if (var4 == 11) {
                    this.field937 = arg1.method339();
                } else if (var4 == 12) {
                    this.field938 = arg1.method344();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
