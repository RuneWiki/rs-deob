import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KIZBPSHZ")
public class class29 {

    @OriginalMember(owner = "KIZBPSHZ", name = "h", descriptor = "I")
    public int field1019 = -1;

    @OriginalMember(owner = "KIZBPSHZ", name = "j", descriptor = "Z")
    public boolean field1021 = false;

    @OriginalMember(owner = "KIZBPSHZ", name = "k", descriptor = "I")
    public int field1022 = 5;

    @OriginalMember(owner = "KIZBPSHZ", name = "l", descriptor = "I")
    public int field1023 = -1;

    @OriginalMember(owner = "KIZBPSHZ", name = "m", descriptor = "I")
    public int field1024 = -1;

    @OriginalMember(owner = "KIZBPSHZ", name = "n", descriptor = "I")
    public int field1025 = 99;

    @OriginalMember(owner = "KIZBPSHZ", name = "o", descriptor = "I")
    public int field1026 = -1;

    @OriginalMember(owner = "KIZBPSHZ", name = "p", descriptor = "I")
    public int field1027 = -1;

    @OriginalMember(owner = "KIZBPSHZ", name = "q", descriptor = "I")
    public int field1028 = 2;

    @OriginalMember(owner = "KIZBPSHZ", name = "a", descriptor = "I")
    private static int field1012 = 974;

    @OriginalMember(owner = "KIZBPSHZ", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "KIZBPSHZ", name = "d", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "KIZBPSHZ", name = "r", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "KIZBPSHZ", name = "s", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "KIZBPSHZ", name = "e", descriptor = "[I")
    public int[] field1016;

    @OriginalMember(owner = "KIZBPSHZ", name = "f", descriptor = "[I")
    public int[] field1017;

    @OriginalMember(owner = "KIZBPSHZ", name = "g", descriptor = "[I")
    private int[] field1018;

    @OriginalMember(owner = "KIZBPSHZ", name = "i", descriptor = "[I")
    public int[] field1020;

    @OriginalMember(owner = "KIZBPSHZ", name = "c", descriptor = "[LKIZBPSHZ;")
    public static class29[] field1014;

    @OriginalMember(owner = "KIZBPSHZ", name = "a", descriptor = "(ILQDHHNYHL;)V")
    public static void method363(int arg0, class44 arg1) {
        class42 var2 = new class42(5, arg1.method488("seq.dat", null));
        field1013 = var2.method422();
        if (field1014 == null) {
            field1014 = new class29[field1013];
        }
        for (int var3 = 0; var3 < field1013; var3++) {
            if (field1014[var3] == null) {
                field1014[var3] = new class29();
            }
            field1014[var3].method365(var2, field1012);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "KIZBPSHZ", name = "a", descriptor = "(II)I")
    public int method364(int arg0, int arg1) {
        int var3 = this.field1018[arg1];
        if (arg0 != 40410) {
            return 0;
        }
        if (var3 == 0) {
            class21 var4 = class21.method286(this.field1016[arg1]);
            if (var4 != null) {
                var3 = this.field1018[arg1] = var4.field839;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "KIZBPSHZ", name = "a", descriptor = "(LPGNBHFUF;I)V")
    public void method365(class42 arg0, int arg1) {
        if (arg1 <= 0) {
            field1012 = -204;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method420();
                if (var3 == 0) {
                    if (this.field1015 == 0) {
                        this.field1015 = 1;
                        this.field1016 = new int[1];
                        this.field1016[0] = -1;
                        this.field1017 = new int[1];
                        this.field1017[0] = -1;
                        this.field1018 = new int[1];
                        this.field1018[0] = -1;
                    }
                    if (this.field1026 == -1) {
                        if (this.field1020 == null) {
                            this.field1026 = 0;
                        } else {
                            this.field1026 = 2;
                        }
                    }
                    if (this.field1027 == -1) {
                        if (this.field1020 != null) {
                            this.field1027 = 2;
                            return;
                        }
                        this.field1027 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1015 = arg0.method420();
                    this.field1016 = new int[this.field1015];
                    this.field1017 = new int[this.field1015];
                    this.field1018 = new int[this.field1015];
                    for (int var4 = 0; var4 < this.field1015; var4++) {
                        this.field1016[var4] = arg0.method422();
                        this.field1017[var4] = arg0.method422();
                        if (this.field1017[var4] == 65535) {
                            this.field1017[var4] = -1;
                        }
                        this.field1018[var4] = arg0.method422();
                    }
                } else if (var3 == 2) {
                    this.field1019 = arg0.method422();
                } else if (var3 == 3) {
                    int var5 = arg0.method420();
                    this.field1020 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1020[var6] = arg0.method420();
                    }
                    this.field1020[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1021 = true;
                } else if (var3 == 5) {
                    this.field1022 = arg0.method420();
                } else if (var3 == 6) {
                    this.field1023 = arg0.method422();
                } else if (var3 == 7) {
                    this.field1024 = arg0.method422();
                } else if (var3 == 8) {
                    this.field1025 = arg0.method420();
                } else if (var3 == 9) {
                    this.field1026 = arg0.method420();
                } else if (var3 == 10) {
                    this.field1027 = arg0.method420();
                } else if (var3 == 11) {
                    this.field1028 = arg0.method420();
                } else if (var3 == 12) {
                    this.field1029 = arg0.method425();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
