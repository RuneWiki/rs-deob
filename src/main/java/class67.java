import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class67 extends class329 {

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[I")
    public int[] field906;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "[[I")
    public int[][] field914;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[Z")
    public boolean[] field910;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "[I")
    public int[] field912;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "[J")
    public static long[] field907 = new long[10];

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lpl;")
    public static class612 field908;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZC)C", line = 3)
    public static final char method396(int arg0, boolean arg1, char arg2) {
        field915++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (!arg1) {
            method396(-21, true, 'h');
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 98)
    public static void method397(int arg0) {
        if (arg0 == 18354) {
            field907 = null;
            field908 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[B)V", line = 109)
    public class67(int arg0, byte[] arg1) {
        this.field911 = arg0;
        class630 var3 = new class630(arg1);
        this.field909 = var3.method3501(-9268);
        this.field906 = new int[this.field909];
        this.field914 = new int[this.field909][];
        this.field910 = new boolean[this.field909];
        this.field912 = new int[this.field909];
        for (int var4 = 0; var4 < this.field909; var4++) {
            this.field906[var4] = var3.method3501(-9268);
            if (this.field906[var4] == 6) {
                this.field906[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field909; var5++) {
            this.field910[var5] = var3.method3501(-9268) == 1;
        }
        for (int var6 = 0; var6 < this.field909; var6++) {
            this.field912[var6] = var3.method3470(13111);
        }
        for (int var7 = 0; var7 < this.field909; var7++) {
            this.field914[var7] = new int[var3.method3501(-9268)];
        }
        for (int var8 = 0; var8 < this.field909; var8++) {
            for (int var9 = 0; var9 < this.field914[var8].length; var9++) {
                this.field914[var8][var9] = var3.method3501(-9268);
            }
        }
    }
}
