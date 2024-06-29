import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class184 {

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    private int field3055 = 0;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    private int field3062 = -1;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lnb;")
    private class223 field3047 = new class223();

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    public boolean field3063 = false;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field3046;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[Lpk;")
    private class106[] field3051;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "[[[I")
    private int[][][] field3060;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lnb;")
    public static class223 field3050 = new class223();

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3061 = -1;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lt;")
    public static class212 field3052;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Z")
    public static boolean field3053;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3056;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1298(int arg0) {
        field3052 = null;
        if (arg0 != 0) {
            field3053 = false;
        }
        field3050 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method1299(int arg0) {
        field3054++;
        for (int var2 = 0; var2 < this.field3059; var2++) {
            this.field3060[var2][0] = null;
            this.field3060[var2][1] = null;
            this.field3060[var2][2] = null;
            this.field3060[var2] = null;
        }
        this.field3060 = null;
        this.field3051 = null;
        this.field3047.method1549(0);
        if (arg0 != 3) {
            this.field3047 = null;
        }
        this.field3047 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Lag;")
    public static final class197 method1300(int arg0) {
        field3049++;
        if (arg0 != 6051) {
            field3061 = -91;
        }
        class2 var1 = new class2(class14.field295, class13.field272, class80.field1286[0], class211.field3364[0], class217.field3413[0], class140.field2284[0], class232.field3635[0], class310.field5024);
        class180.method1265(50);
        return var1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1301(byte arg0) {
        field3058++;
        if (this.field3059 != this.field3046) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = 108 / ((arg0 - 53) / 56);
        while (this.field3059 > var2) {
            this.field3051[var2] = class59.field862;
            var2++;
        }
        return this.field3060;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1302(int arg0, byte arg1) {
        field3057++;
        if (arg1 != 26) {
            return null;
        } else if (this.field3059 == this.field3046) {
            this.field3063 = this.field3051[arg0] == null;
            this.field3051[arg0] = class59.field862;
            return this.field3060[arg0];
        } else if (this.field3059 == 1) {
            this.field3063 = this.field3062 != arg0;
            this.field3062 = arg0;
            return this.field3060[0];
        } else {
            class106 var3 = this.field3051[arg0];
            if (var3 == null) {
                this.field3063 = true;
                if (this.field3055 >= this.field3059) {
                    class106 var4 = (class106) this.field3047.method1547(0);
                    var3 = new class106(arg0, var4.field1653);
                    this.field3051[var4.field1651] = null;
                    var4.method952((byte) 40);
                } else {
                    var3 = new class106(arg0, this.field3055);
                    this.field3055++;
                }
                this.field3051[arg0] = var3;
            } else {
                this.field3063 = false;
            }
            this.field3047.method1548(var3, arg1 - 26);
            return this.field3060[var3.field1653];
        }
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)Le;")
    public static final class67 method1303(int arg0) {
        field3048++;
        int var1 = class217.field3413[arg0] * class140.field2284[0];
        byte[] var2 = class232.field3635[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class310.field5024[class233.method1609(var2[var4], 255)];
        }
        class67 var5 = new class67(class14.field295, class13.field272, class80.field1286[0], class211.field3364[0], class217.field3413[0], class140.field2284[0], var3);
        class180.method1265(45);
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(III)V")
    public class184(int arg0, int arg1, int arg2) {
        this.field3059 = arg0;
        this.field3046 = arg1;
        this.field3051 = new class106[this.field3046];
        this.field3060 = new int[this.field3059][3][arg2];
    }
}
