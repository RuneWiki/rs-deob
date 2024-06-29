import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BKDXLPEF")
public class class2 {

    @OriginalMember(owner = "client!BKDXLPEF", name = "g", descriptor = "I")
    public int field82 = -1;

    @OriginalMember(owner = "client!BKDXLPEF", name = "i", descriptor = "Z")
    public boolean field84 = false;

    @OriginalMember(owner = "client!BKDXLPEF", name = "j", descriptor = "I")
    public int field85 = 5;

    @OriginalMember(owner = "client!BKDXLPEF", name = "k", descriptor = "I")
    public int field86 = -1;

    @OriginalMember(owner = "client!BKDXLPEF", name = "l", descriptor = "I")
    public int field87 = -1;

    @OriginalMember(owner = "client!BKDXLPEF", name = "m", descriptor = "I")
    public int field88 = 99;

    @OriginalMember(owner = "client!BKDXLPEF", name = "n", descriptor = "I")
    public int field89 = -1;

    @OriginalMember(owner = "client!BKDXLPEF", name = "o", descriptor = "I")
    public int field90 = -1;

    @OriginalMember(owner = "client!BKDXLPEF", name = "p", descriptor = "I")
    public int field91 = 2;

    @OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!BKDXLPEF", name = "c", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!BKDXLPEF", name = "q", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!BKDXLPEF", name = "r", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!BKDXLPEF", name = "d", descriptor = "[I")
    public int[] field79;

    @OriginalMember(owner = "client!BKDXLPEF", name = "e", descriptor = "[I")
    public int[] field80;

    @OriginalMember(owner = "client!BKDXLPEF", name = "f", descriptor = "[I")
    private int[] field81;

    @OriginalMember(owner = "client!BKDXLPEF", name = "h", descriptor = "[I")
    public int[] field83;

    @OriginalMember(owner = "client!BKDXLPEF", name = "b", descriptor = "[LBKDXLPEF;")
    public static class2[] field77;

    @OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "(BLXOJZVVDK;)V")
    public static void method11(byte arg0, class60 arg1) {
        class41 var2 = new class41(888, arg1.method560("seq.dat", null));
        field76 = var2.method342();
        if (field77 == null) {
            field77 = new class2[field76];
        }
        for (int var3 = 0; var3 < field76; var3++) {
            if (field77[var3] == null) {
                field77[var3] = new class2();
            }
            field77[var3].method13(var2, false);
        }
        if (arg0 == -82) {
            ;
        }
    }

    @OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "(II)I")
    public int method12(int arg0, int arg1) {
        int var3 = this.field81[arg0];
        int var4 = 41 / arg1;
        if (var3 == 0) {
            class37 var5 = class37.method301(this.field79[arg0]);
            if (var5 != null) {
                var3 = this.field81[arg0] = var5.field1162;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!BKDXLPEF", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    public void method13(class41 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method340();
                if (var3 == 0) {
                    if (this.field78 == 0) {
                        this.field78 = 1;
                        this.field79 = new int[1];
                        this.field79[0] = -1;
                        this.field80 = new int[1];
                        this.field80[0] = -1;
                        this.field81 = new int[1];
                        this.field81[0] = -1;
                    }
                    if (this.field89 == -1) {
                        if (this.field83 == null) {
                            this.field89 = 0;
                        } else {
                            this.field89 = 2;
                        }
                    }
                    if (this.field90 == -1) {
                        if (this.field83 != null) {
                            this.field90 = 2;
                            return;
                        }
                        this.field90 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field78 = arg0.method340();
                    this.field79 = new int[this.field78];
                    this.field80 = new int[this.field78];
                    this.field81 = new int[this.field78];
                    for (int var4 = 0; var4 < this.field78; var4++) {
                        this.field79[var4] = arg0.method342();
                        this.field80[var4] = arg0.method342();
                        if (this.field80[var4] == 65535) {
                            this.field80[var4] = -1;
                        }
                        this.field81[var4] = arg0.method342();
                    }
                } else if (var3 == 2) {
                    this.field82 = arg0.method342();
                } else if (var3 == 3) {
                    int var5 = arg0.method340();
                    this.field83 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field83[var6] = arg0.method340();
                    }
                    this.field83[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field84 = true;
                } else if (var3 == 5) {
                    this.field85 = arg0.method340();
                } else if (var3 == 6) {
                    this.field86 = arg0.method342();
                } else if (var3 == 7) {
                    this.field87 = arg0.method342();
                } else if (var3 == 8) {
                    this.field88 = arg0.method340();
                } else if (var3 == 9) {
                    this.field89 = arg0.method340();
                } else if (var3 == 10) {
                    this.field90 = arg0.method340();
                } else if (var3 == 11) {
                    this.field91 = arg0.method340();
                } else if (var3 == 12) {
                    this.field92 = arg0.method345();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
