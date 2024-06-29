import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class487 {

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    private int field6901 = -1;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    private int field6913 = 0;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "Lvf;")
    private class166 field6909 = new class166();

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "Z")
    public boolean field6915 = false;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    private int field6912;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    private int field6900;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "[[I")
    private int[][] field6906;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "[Ltl;")
    private class106[] field6903;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "I")
    public static int field6911 = 0;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field6904 = 0;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "Llc;")
    public static class135 field6905 = new class135("", 10);

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Z")
    public static boolean field6914 = false;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "Lab;")
    public static class256 field6916 = null;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[Lrg;")
    public static class395[] field6902;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)[[I", line = 4)
    public final int[][] method2876(int arg0) {
        field6910++;
        if (this.field6912 != this.field6900) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6912; var2++) {
            this.field6903[var2] = class67.field839;
        }
        return this.field6906;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)[I", line = 23)
    public final int[] method2877(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        }
        field6908++;
        if (this.field6912 == this.field6900) {
            this.field6915 = this.field6903[arg0] == null;
            this.field6903[arg0] = class67.field839;
            return this.field6906[arg0];
        } else if (this.field6912 == 1) {
            this.field6915 = this.field6901 != arg0;
            this.field6901 = arg0;
            return this.field6906[0];
        } else {
            class106 var3 = this.field6903[arg0];
            if (var3 == null) {
                this.field6915 = true;
                if (this.field6912 <= this.field6913) {
                    class106 var4 = (class106) this.field6909.method807(arg1 - 18920);
                    var3 = new class106(arg0, var4.field1291);
                    this.field6903[var4.field1292] = null;
                    var4.method702((byte) -114);
                } else {
                    var3 = new class106(arg0, this.field6913);
                    this.field6913++;
                }
                this.field6903[arg0] = var3;
            } else {
                this.field6915 = false;
            }
            this.field6909.method811(-25513, var3);
            return this.field6906[var3.field1291];
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lvt;ILjava/lang/String;)I", line = 92)
    public static final int method2878(class179 arg0, int arg1, String arg2) {
        field6899++;
        int var3 = arg0.field2206;
        byte[] var4 = class4.method25(false, arg2);
        arg0.method925(var4.length, 88);
        arg0.field2206 += class200.field2774.method724(var4, arg0.field2159, arg0.field2206, 103, var4.length, arg1);
        return arg0.field2206 - var3;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(III)V", line = 188)
    public class487(int arg0, int arg1, int arg2) {
        this.field6912 = arg0;
        this.field6900 = arg1;
        this.field6906 = new int[this.field6912][arg2];
        this.field6903 = new class106[this.field6900];
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 117)
    public final void method2879(byte arg0) {
        if (arg0 < 42) {
            method2880((byte) -106);
        }
        for (int var2 = 0; var2 < this.field6912; var2++) {
            this.field6906[var2] = null;
        }
        field6907++;
        this.field6906 = null;
        this.field6903 = null;
        this.field6909.method813(0);
        this.field6909 = null;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 140)
    public static void method2880(byte arg0) {
        field6905 = null;
        field6902 = null;
        if (arg0 <= -10) {
            field6916 = null;
        }
    }
}
