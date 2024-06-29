import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class58 {

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    private int field913 = 0;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    private int field910 = -1;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lli;")
    private class18 field908 = new class18();

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
    public boolean field917 = false;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[Lmf;")
    private class154[] field902;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[[[I")
    private int[][][] field903;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
    public static int[] field914 = new int[25];

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Z")
    public static boolean field909 = false;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[Lni;")
    public static class59[] field899;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 4)
    public static final void method401(byte arg0) {
        field912++;
        if (class247.field4100 != null) {
            class247.field4100.method459(28968);
        }
        if (class268.field4484 != null) {
            class268.field4484.method459(28968);
        }
        if (arg0 != 62) {
            field899 = (class59[]) null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIII)V", line = 29)
    public static final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg1; var6++) {
            class3.method14(arg0, arg2, arg4, class184.field3180[var6], -118);
        }
        int var7 = -48 % ((arg3 + 6) / 42);
        field904++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)[[[I", line = 48)
    public final int[][][] method403(int arg0) {
        field915++;
        if (this.field901 != this.field900) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 1) {
            field916 = -101;
        }
        while (this.field900 > var2) {
            this.field902[var2] = class139.field2483;
            var2++;
        }
        return this.field903;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 73)
    public static final void method404(int arg0) {
        class229.field3807.method1533(true);
        field906++;
        int var1 = -14 / ((arg0 + 47) / 37);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 84)
    public static void method405(byte arg0) {
        field899 = null;
        if (arg0 > -50) {
            field909 = true;
        }
        field914 = null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(III)V", line = 216)
    public class58(int arg0, int arg1, int arg2) {
        this.field901 = arg1;
        this.field900 = arg0;
        this.field902 = new class154[this.field901];
        this.field903 = new int[this.field900][3][arg2];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)[[I", line = 114)
    public final int[][] method406(boolean arg0, int arg1) {
        if (arg0) {
            method405((byte) 118);
        }
        field911++;
        if (this.field901 == this.field900) {
            this.field917 = this.field902[arg1] == null;
            this.field902[arg1] = class139.field2483;
            return this.field903[arg1];
        } else if (this.field900 == 1) {
            this.field917 = this.field910 != arg1;
            this.field910 = arg1;
            return this.field903[0];
        } else {
            class154 var3 = this.field902[arg1];
            if (var3 == null) {
                this.field917 = true;
                if (this.field900 > this.field913) {
                    var3 = new class154(arg1, this.field913);
                    this.field913++;
                } else {
                    class154 var4 = (class154) this.field908.method160((byte) -48);
                    var3 = new class154(arg1, var4.field2736);
                    this.field902[var4.field2729] = null;
                    var4.method1183(arg0);
                }
                this.field902[arg1] = var3;
            } else {
                this.field917 = false;
            }
            this.field908.method163((byte) 77, var3);
            return this.field903[var3.field2736];
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 183)
    public final void method407(int arg0) {
        for (int var2 = 0; var2 < this.field900; var2++) {
            this.field903[var2][0] = null;
            this.field903[var2][1] = null;
            this.field903[var2][2] = null;
            this.field903[var2] = (int[][]) null;
        }
        int var3 = -81 / ((-arg0 - 50) / 54);
        this.field902 = null;
        this.field903 = (int[][][]) null;
        field905++;
        this.field908.method171(-97);
        this.field908 = null;
    }
}
