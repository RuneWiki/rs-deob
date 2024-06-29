import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JZQVOFSF")
public class class29 {

    @OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "I")
    private int field885 = 939;

    @OriginalMember(owner = "client!JZQVOFSF", name = "h", descriptor = "I")
    public int field892 = -1;

    @OriginalMember(owner = "client!JZQVOFSF", name = "j", descriptor = "Z")
    public boolean field894 = false;

    @OriginalMember(owner = "client!JZQVOFSF", name = "k", descriptor = "I")
    public int field895 = 5;

    @OriginalMember(owner = "client!JZQVOFSF", name = "l", descriptor = "I")
    public int field896 = -1;

    @OriginalMember(owner = "client!JZQVOFSF", name = "m", descriptor = "I")
    public int field897 = -1;

    @OriginalMember(owner = "client!JZQVOFSF", name = "n", descriptor = "I")
    public int field898 = 99;

    @OriginalMember(owner = "client!JZQVOFSF", name = "o", descriptor = "I")
    public int field899 = -1;

    @OriginalMember(owner = "client!JZQVOFSF", name = "p", descriptor = "I")
    public int field900 = -1;

    @OriginalMember(owner = "client!JZQVOFSF", name = "q", descriptor = "I")
    public int field901 = 2;

    @OriginalMember(owner = "client!JZQVOFSF", name = "b", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!JZQVOFSF", name = "d", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!JZQVOFSF", name = "r", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!JZQVOFSF", name = "s", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!JZQVOFSF", name = "e", descriptor = "[I")
    public int[] field889;

    @OriginalMember(owner = "client!JZQVOFSF", name = "f", descriptor = "[I")
    public int[] field890;

    @OriginalMember(owner = "client!JZQVOFSF", name = "g", descriptor = "[I")
    private int[] field891;

    @OriginalMember(owner = "client!JZQVOFSF", name = "i", descriptor = "[I")
    public int[] field893;

    @OriginalMember(owner = "client!JZQVOFSF", name = "c", descriptor = "[LJZQVOFSF;")
    public static class29[] field887;

    @OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "(LSMIVAFST;I)V")
    public static void method341(class52 arg0, int arg1) {
        if (arg1 != -29636) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class7 var3 = new class7(arg0.method512("seq.dat", null), (byte) 3);
        field886 = var3.method49();
        if (field887 == null) {
            field887 = new class29[field886];
        }
        for (int var4 = 0; var4 < field886; var4++) {
            if (field887[var4] == null) {
                field887[var4] = new class29();
            }
            field887[var4].method343(7, var3);
        }
    }

    @OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "(II)I")
    public int method342(int arg0, int arg1) {
        if (arg1 != 8) {
            return this.field885;
        }
        int var3 = this.field891[arg0];
        if (var3 == 0) {
            class67 var4 = class67.method585(this.field889[arg0]);
            if (var4 != null) {
                var3 = this.field891[arg0] = var4.field1687;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!JZQVOFSF", name = "a", descriptor = "(ILBSNPYLEV;)V")
    public void method343(int arg0, class7 arg1) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method47();
                if (var3 == 0) {
                    if (this.field888 == 0) {
                        this.field888 = 1;
                        this.field889 = new int[1];
                        this.field889[0] = -1;
                        this.field890 = new int[1];
                        this.field890[0] = -1;
                        this.field891 = new int[1];
                        this.field891[0] = -1;
                    }
                    if (this.field899 == -1) {
                        if (this.field893 == null) {
                            this.field899 = 0;
                        } else {
                            this.field899 = 2;
                        }
                    }
                    if (this.field900 == -1) {
                        if (this.field893 != null) {
                            this.field900 = 2;
                            return;
                        }
                        this.field900 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field888 = arg1.method47();
                    this.field889 = new int[this.field888];
                    this.field890 = new int[this.field888];
                    this.field891 = new int[this.field888];
                    for (int var4 = 0; var4 < this.field888; var4++) {
                        this.field889[var4] = arg1.method49();
                        this.field890[var4] = arg1.method49();
                        if (this.field890[var4] == 65535) {
                            this.field890[var4] = -1;
                        }
                        this.field891[var4] = arg1.method49();
                    }
                } else if (var3 == 2) {
                    this.field892 = arg1.method49();
                } else if (var3 == 3) {
                    int var5 = arg1.method47();
                    this.field893 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field893[var6] = arg1.method47();
                    }
                    this.field893[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field894 = true;
                } else if (var3 == 5) {
                    this.field895 = arg1.method47();
                } else if (var3 == 6) {
                    this.field896 = arg1.method49();
                } else if (var3 == 7) {
                    this.field897 = arg1.method49();
                } else if (var3 == 8) {
                    this.field898 = arg1.method47();
                } else if (var3 == 9) {
                    this.field899 = arg1.method47();
                } else if (var3 == 10) {
                    this.field900 = arg1.method47();
                } else if (var3 == 11) {
                    this.field901 = arg1.method47();
                } else if (var3 == 12) {
                    this.field902 = arg1.method52();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
