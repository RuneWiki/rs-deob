import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class554 extends class408 {

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "Z")
    public boolean field7916 = true;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field7903 = 0;

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "[Lam;")
    public static class635[] field7904 = new class635[8];

    @OriginalMember(owner = "client!lq", name = "I", descriptor = "S")
    public static short field7908 = 1;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field7909;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "Ltia;")
    public class269 field7913;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "[I")
    public int[] field7906;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "[I")
    private int[] field7911;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field7912;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "[[I")
    private int[][] field7917;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 13)
    public final void method3229(int arg0) {
        if (arg0 < 114) {
            this.field7917 = null;
        }
        if (this.field7906 != null) {
            for (int var2 = 0; var2 < this.field7906.length; var2++) {
                this.field7906[var2] = class625.method3600(this.field7906[var2], 32768);
            }
        }
        field7918++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILrg;)Ljava/lang/String;", line = 36)
    public final String method3230(int arg0, class645 arg1) {
        if (arg0 >= -38) {
            this.field7906 = null;
        }
        field7902++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field7911 != null) {
            for (int var4 = 0; var4 < this.field7911.length; var4++) {
                var3.append(this.field7912[var4]);
                var3.append(this.field7913.method1719(this.field7917[var4], this.method3233(120, var4), arg1.method3733(class314.method1988(false, this.field7911[var4]).field3415, (byte) 116), 122));
            }
        }
        var3.append(this.field7912[this.field7912.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)I", line = 67)
    public final int method3231(int arg0, int arg1, int arg2) {
        field7910++;
        if (this.field7911 == null || arg1 < 0 || this.field7911.length < arg1) {
            return -1;
        } else if (this.field7917[arg1] == null || arg2 < 0 || arg2 > this.field7917[arg1].length) {
            return -1;
        } else if (arg0 == 0) {
            return this.field7917[arg1][arg2];
        } else {
            return -33;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lrg;I[I)V", line = 89)
    public final void method3232(class645 arg0, int arg1, int[] arg2) {
        field7901++;
        if (this.field7911 == null) {
            return;
        }
        int var4 = -9 / ((38 - arg1) / 47);
        for (int var5 = 0; var5 < this.field7911.length; var5++) {
            if (arg2.length <= var5) {
                return;
            }
            int var6 = this.method3233(77, var5).field3416;
            if (var6 > 0) {
                arg0.method3748((long) arg2[var5], -8, var6);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)Lfa;", line = 115)
    public final class235 method3233(int arg0, int arg1) {
        field7905++;
        if (this.field7911 == null || arg1 < 0 || arg1 > this.field7911.length) {
            return null;
        } else {
            if (arg0 <= 62) {
                this.field7917 = null;
            }
            return class314.method1988(false, this.field7911[arg1]);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lrg;BI)V", line = 132)
    private final void method3234(class645 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field7912 = class258.method1684(3270, arg0.method3752(-2), '<');
        } else if (arg2 == 2) {
            int var9 = arg0.method3745(-6314);
            this.field7906 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field7906[var10] = arg0.method3712((byte) -125);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method3745(arg1 - 6244);
            this.field7917 = new int[var4][];
            this.field7911 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method3712((byte) 52);
                class235 var7 = class314.method1988(false, var6);
                if (var7 != null) {
                    this.field7911[var5] = var6;
                    this.field7917[var5] = new int[var7.field3419];
                    for (int var8 = 0; var8 < var7.field3419; var8++) {
                        this.field7917[var5][var8] = arg0.method3712((byte) 57);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field7916 = false;
        }
        if (arg1 == -70) {
            field7907++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I", line = 211)
    public final int method3235(int arg0) {
        field7914++;
        if (this.field7911 == null) {
            return 0;
        } else {
            if (arg0 != 6359) {
                this.method3236(-96, null);
            }
            return this.field7911.length;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILrg;)V", line = 227)
    public final void method3236(int arg0, class645 arg1) {
        field7915++;
        int var3 = 5 / ((arg0 - 40) / 35);
        while (true) {
            int var4 = arg1.method3745(-6314);
            if (var4 == 0) {
                return;
            }
            this.method3234(arg1, (byte) -70, var4);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Ljava/lang/String;", line = 247)
    public final String method3237(byte arg0) {
        field7900++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0 != 109) {
            this.method3236(-83, null);
        }
        if (this.field7912 == null) {
            return "";
        }
        var2.append(this.field7912[0]);
        for (int var3 = 1; var3 < this.field7912.length; var3++) {
            var2.append("...");
            var2.append(this.field7912[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(B)V", line = 275)
    public static void method3238(byte arg0) {
        field7904 = null;
        if (arg0 < 39) {
            method3238((byte) -103);
        }
    }
}
