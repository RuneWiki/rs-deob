import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DVIZXFSW")
public class class14 {

    @OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "Z")
    private boolean field715 = true;

    @OriginalMember(owner = "client!DVIZXFSW", name = "h", descriptor = "I")
    public int field722 = -1;

    @OriginalMember(owner = "client!DVIZXFSW", name = "j", descriptor = "Z")
    public boolean field724 = false;

    @OriginalMember(owner = "client!DVIZXFSW", name = "k", descriptor = "I")
    public int field725 = 5;

    @OriginalMember(owner = "client!DVIZXFSW", name = "l", descriptor = "I")
    public int field726 = -1;

    @OriginalMember(owner = "client!DVIZXFSW", name = "m", descriptor = "I")
    public int field727 = -1;

    @OriginalMember(owner = "client!DVIZXFSW", name = "n", descriptor = "I")
    public int field728 = 99;

    @OriginalMember(owner = "client!DVIZXFSW", name = "o", descriptor = "I")
    public int field729 = -1;

    @OriginalMember(owner = "client!DVIZXFSW", name = "p", descriptor = "I")
    public int field730 = -1;

    @OriginalMember(owner = "client!DVIZXFSW", name = "q", descriptor = "I")
    public int field731 = 2;

    @OriginalMember(owner = "client!DVIZXFSW", name = "b", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!DVIZXFSW", name = "d", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!DVIZXFSW", name = "r", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!DVIZXFSW", name = "s", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!DVIZXFSW", name = "e", descriptor = "[I")
    public int[] field719;

    @OriginalMember(owner = "client!DVIZXFSW", name = "f", descriptor = "[I")
    public int[] field720;

    @OriginalMember(owner = "client!DVIZXFSW", name = "g", descriptor = "[I")
    private int[] field721;

    @OriginalMember(owner = "client!DVIZXFSW", name = "i", descriptor = "[I")
    public int[] field723;

    @OriginalMember(owner = "client!DVIZXFSW", name = "c", descriptor = "[LDVIZXFSW;")
    public static class14[] field717;

    @OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "(LHBJEXSJX;Z)V")
    public static void method206(class24 arg0, boolean arg1) {
        class18 var2 = new class18(arg0.method348("seq.dat", null), 0);
        field716 = var2.method241();
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field717 == null) {
            field717 = new class14[field716];
        }
        for (int var4 = 0; var4 < field716; var4++) {
            if (field717[var4] == null) {
                field717[var4] = new class14();
            }
            field717[var4].method208((byte) 5, var2);
        }
    }

    @OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "(BI)I")
    public int method207(byte arg0, int arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field715 = !this.field715;
        }
        int var4 = this.field721[arg1];
        if (var4 == 0) {
            class37 var5 = class37.method394(this.field719[arg1]);
            if (var5 != null) {
                var4 = this.field721[arg1] = var5.field1128;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!DVIZXFSW", name = "a", descriptor = "(BLEYMNCFMK;)V")
    public void method208(byte arg0, class18 arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    if (this.field718 == 0) {
                        this.field718 = 1;
                        this.field719 = new int[1];
                        this.field719[0] = -1;
                        this.field720 = new int[1];
                        this.field720[0] = -1;
                        this.field721 = new int[1];
                        this.field721[0] = -1;
                    }
                    if (this.field729 == -1) {
                        if (this.field723 == null) {
                            this.field729 = 0;
                        } else {
                            this.field729 = 2;
                        }
                    }
                    if (this.field730 == -1) {
                        if (this.field723 != null) {
                            this.field730 = 2;
                            return;
                        }
                        this.field730 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field718 = arg1.method239();
                    this.field719 = new int[this.field718];
                    this.field720 = new int[this.field718];
                    this.field721 = new int[this.field718];
                    for (int var4 = 0; var4 < this.field718; var4++) {
                        this.field719[var4] = arg1.method241();
                        this.field720[var4] = arg1.method241();
                        if (this.field720[var4] == 65535) {
                            this.field720[var4] = -1;
                        }
                        this.field721[var4] = arg1.method241();
                    }
                } else if (var3 == 2) {
                    this.field722 = arg1.method241();
                } else if (var3 == 3) {
                    int var5 = arg1.method239();
                    this.field723 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field723[var6] = arg1.method239();
                    }
                    this.field723[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field724 = true;
                } else if (var3 == 5) {
                    this.field725 = arg1.method239();
                } else if (var3 == 6) {
                    this.field726 = arg1.method241();
                } else if (var3 == 7) {
                    this.field727 = arg1.method241();
                } else if (var3 == 8) {
                    this.field728 = arg1.method239();
                } else if (var3 == 9) {
                    this.field729 = arg1.method239();
                } else if (var3 == 10) {
                    this.field730 = arg1.method239();
                } else if (var3 == 11) {
                    this.field731 = arg1.method239();
                } else if (var3 == 12) {
                    this.field732 = arg1.method244();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
