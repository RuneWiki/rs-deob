import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class27 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    private int field331 = -1;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lhe;")
    private class47 field333 = new class47();

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Z")
    public boolean field341 = false;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[[I")
    private int[][] field325;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[Lwj;")
    private class240[] field329;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[Lqe;")
    public static class168[] field324 = new class168[1000];

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[I")
    public static int[] field332 = new int[128];

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lqe;")
    private static class168 field340 = class66.method448("glow2:", 124);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lqe;")
    public static class168 field330 = field340;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field342 = -1;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lqe;")
    public static class168 field327 = field340;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "Lgd;")
    public static class65 field336;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Lwe;")
    public static final class91 method179(byte arg0, int arg1) {
        if (arg0 != 23) {
            method184(-37);
        }
        field328++;
        class91 var2 = (class91) class162.field2767.method1499(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class2.field17.method1712(arg1, 3, -1);
        class91 var4 = new class91();
        if (var3 != null) {
            var4.method596(new class112(var3), arg0 - 20329);
        }
        class162.field2767.method1502((byte) -18, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
    public static final void method180(byte arg0, int arg1, int arg2) {
        int var3 = 6 / ((-arg0 - 11) / 45);
        field323++;
        if (class93.field1464 != 0 && arg1 != -1) {
            class192.method1247(arg1, class91.field1418, (byte) -77, class93.field1464, 0, false);
            class147.field2574 = true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)[[I")
    public final int[][] method181(byte arg0) {
        field338++;
        if (this.field337 != this.field335) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -19 / ((17 - arg0) / 33);
        for (int var3 = 0; var3 < this.field335; var3++) {
            this.field329[var3] = class121.field2002;
        }
        return this.field325;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(BI)[I")
    public final int[] method182(byte arg0, int arg1) {
        if (arg0 >= -84) {
            field332 = null;
        }
        field339++;
        if (this.field337 == this.field335) {
            this.field341 = this.field329[arg1] == null;
            this.field329[arg1] = class121.field2002;
            return this.field325[arg1];
        } else if (this.field335 == 1) {
            this.field341 = this.field331 != arg1;
            this.field331 = arg1;
            return this.field325[0];
        } else {
            class240 var3 = this.field329[arg1];
            if (var3 == null) {
                this.field341 = true;
                if (this.field335 <= this.field326) {
                    class240 var4 = (class240) this.field333.method322((byte) 88);
                    var3 = new class240(arg1, var4.field4105);
                    this.field329[var4.field4113] = null;
                    var4.method1234(17216);
                } else {
                    var3 = new class240(arg1, this.field326);
                    this.field326++;
                }
                this.field329[arg1] = var3;
            } else {
                this.field341 = false;
            }
            this.field333.method310(-15062, var3);
            return this.field325[var3.field4105];
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public final void method183(byte arg0) {
        field321++;
        for (int var2 = 0; var2 < this.field335; var2++) {
            this.field325[var2] = null;
        }
        int var3 = 54 / ((arg0 + 34) / 49);
        this.field325 = null;
        this.field329 = null;
        this.field333.method318((byte) -126);
        this.field333 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(III)V")
    public class27(int arg0, int arg1, int arg2) {
        this.field335 = arg0;
        this.field325 = new int[this.field335][arg2];
        this.field337 = arg1;
        this.field329 = new class240[this.field337];
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method184(int arg0) {
        field324 = null;
        field336 = null;
        field330 = null;
        field340 = null;
        if (arg0 <= 94) {
            field336 = null;
        }
        field327 = null;
        field332 = null;
    }
}
