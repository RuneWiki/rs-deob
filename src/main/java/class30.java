import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LMDSPIVT")
public class class30 {

    @OriginalMember(owner = "client!LMDSPIVT", name = "b", descriptor = "Z")
    private boolean field980 = true;

    @OriginalMember(owner = "client!LMDSPIVT", name = "i", descriptor = "I")
    public int field987 = -1;

    @OriginalMember(owner = "client!LMDSPIVT", name = "k", descriptor = "Z")
    public boolean field989 = false;

    @OriginalMember(owner = "client!LMDSPIVT", name = "l", descriptor = "I")
    public int field990 = 5;

    @OriginalMember(owner = "client!LMDSPIVT", name = "m", descriptor = "I")
    public int field991 = -1;

    @OriginalMember(owner = "client!LMDSPIVT", name = "n", descriptor = "I")
    public int field992 = -1;

    @OriginalMember(owner = "client!LMDSPIVT", name = "o", descriptor = "I")
    public int field993 = 99;

    @OriginalMember(owner = "client!LMDSPIVT", name = "p", descriptor = "I")
    public int field994 = -1;

    @OriginalMember(owner = "client!LMDSPIVT", name = "q", descriptor = "I")
    public int field995 = -1;

    @OriginalMember(owner = "client!LMDSPIVT", name = "r", descriptor = "I")
    public int field996 = 2;

    @OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "Z")
    private static boolean field979 = true;

    @OriginalMember(owner = "client!LMDSPIVT", name = "c", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!LMDSPIVT", name = "e", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!LMDSPIVT", name = "s", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!LMDSPIVT", name = "t", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!LMDSPIVT", name = "f", descriptor = "[I")
    public int[] field984;

    @OriginalMember(owner = "client!LMDSPIVT", name = "g", descriptor = "[I")
    public int[] field985;

    @OriginalMember(owner = "client!LMDSPIVT", name = "h", descriptor = "[I")
    private int[] field986;

    @OriginalMember(owner = "client!LMDSPIVT", name = "j", descriptor = "[I")
    public int[] field988;

    @OriginalMember(owner = "client!LMDSPIVT", name = "d", descriptor = "[LLMDSPIVT;")
    public static class30[] field982;

    @OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "(BLSXKKBWPU;)V")
    public static void method279(byte arg0, class50 arg1) {
        class53 var2 = new class53(arg1.method442("seq.dat", null), -631);
        if (arg0 != -109) {
            field979 = !field979;
        }
        field981 = var2.method470();
        if (field982 == null) {
            field982 = new class30[field981];
        }
        for (int var3 = 0; var3 < field981; var3++) {
            if (field982[var3] == null) {
                field982[var3] = new class30();
            }
            field982[var3].method281(3, var2);
        }
    }

    @OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "(II)I")
    public int method280(int arg0, int arg1) {
        int var3 = this.field986[arg1];
        if (arg0 >= 0) {
            this.field980 = !this.field980;
        }
        if (var3 == 0) {
            class48 var4 = class48.method422(this.field984[arg1]);
            if (var4 != null) {
                var3 = this.field986[arg1] = var4.field1363;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public void method281(int arg0, class53 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method468();
                if (var4 == 0) {
                    if (this.field983 == 0) {
                        this.field983 = 1;
                        this.field984 = new int[1];
                        this.field984[0] = -1;
                        this.field985 = new int[1];
                        this.field985[0] = -1;
                        this.field986 = new int[1];
                        this.field986[0] = -1;
                    }
                    if (this.field994 == -1) {
                        if (this.field988 == null) {
                            this.field994 = 0;
                        } else {
                            this.field994 = 2;
                        }
                    }
                    if (this.field995 == -1) {
                        if (this.field988 != null) {
                            this.field995 = 2;
                            return;
                        }
                        this.field995 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field983 = arg1.method468();
                    this.field984 = new int[this.field983];
                    this.field985 = new int[this.field983];
                    this.field986 = new int[this.field983];
                    for (int var5 = 0; var5 < this.field983; var5++) {
                        this.field984[var5] = arg1.method470();
                        this.field985[var5] = arg1.method470();
                        if (this.field985[var5] == 65535) {
                            this.field985[var5] = -1;
                        }
                        this.field986[var5] = arg1.method470();
                    }
                } else if (var4 == 2) {
                    this.field987 = arg1.method470();
                } else if (var4 == 3) {
                    int var6 = arg1.method468();
                    this.field988 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field988[var7] = arg1.method468();
                    }
                    this.field988[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field989 = true;
                } else if (var4 == 5) {
                    this.field990 = arg1.method468();
                } else if (var4 == 6) {
                    this.field991 = arg1.method470();
                } else if (var4 == 7) {
                    this.field992 = arg1.method470();
                } else if (var4 == 8) {
                    this.field993 = arg1.method468();
                } else if (var4 == 9) {
                    this.field994 = arg1.method468();
                } else if (var4 == 10) {
                    this.field995 = arg1.method468();
                } else if (var4 == 11) {
                    this.field996 = arg1.method468();
                } else if (var4 == 12) {
                    this.field997 = arg1.method473();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
