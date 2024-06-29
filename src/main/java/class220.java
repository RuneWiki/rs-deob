import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class220 {

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    private int field3244 = -1;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    private int field3249 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lrk;")
    private class419 field3240 = new class419();

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
    public boolean field3254 = false;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    private int field3242;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "[[I")
    private int[][] field3246;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[Leu;")
    private class636[] field3251;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Lqu;")
    public static class364 field3248 = new class364(49, 6);

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public static boolean field3252 = false;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public final void method1447(byte arg0) {
        field3253++;
        int var2 = -120 / ((-arg0 - 67) / 49);
        for (int var3 = 0; var3 < this.field3242; var3++) {
            this.field3246[var3] = null;
        }
        this.field3246 = null;
        this.field3251 = null;
        this.field3240.method2499(0);
        this.field3240 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)[[I")
    public final int[][] method1448(int arg0) {
        if (arg0 <= 2) {
            return null;
        }
        field3241++;
        if (this.field3245 != this.field3242) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3242; var2++) {
            this.field3251[var2] = class30.field282;
        }
        return this.field3246;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static void method1449(int arg0) {
        field3248 = null;
        if (arg0 != -12433) {
            field3252 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BI)I")
    public static final int method1450(int arg0, int arg1, byte[] arg2, int arg3) {
        field3250++;
        int var4 = -1;
        int var5 = arg3;
        if (arg1 != 0) {
            return 58;
        }
        while (arg0 > var5) {
            var4 = var4 >>> 8 ^ class313.field4695[(var4 ^ arg2[var5]) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method1451(int arg0, int arg1) {
        field3243++;
        int var3 = -117 / ((-arg0 - 58) / 52);
        if (this.field3245 == this.field3242) {
            this.field3254 = this.field3251[arg1] == null;
            this.field3251[arg1] = class30.field282;
            return this.field3246[arg1];
        } else if (this.field3242 == 1) {
            this.field3254 = this.field3244 != arg1;
            this.field3244 = arg1;
            return this.field3246[0];
        } else {
            class636 var4 = this.field3251[arg1];
            if (var4 == null) {
                this.field3254 = true;
                if (this.field3249 >= this.field3242) {
                    class636 var5 = (class636) this.field3240.method2490(0);
                    var4 = new class636(arg1, var5.field9270);
                    this.field3251[var5.field9267] = null;
                    var5.method2997(1);
                } else {
                    var4 = new class636(arg1, this.field3249);
                    this.field3249++;
                }
                this.field3251[arg1] = var4;
            } else {
                this.field3254 = false;
            }
            this.field3240.method2489(true, var4);
            return this.field3246[var4.field9270];
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(III)V")
    public class220(int arg0, int arg1, int arg2) {
        this.field3242 = arg0;
        this.field3245 = arg1;
        this.field3246 = new int[this.field3242][arg2];
        this.field3251 = new class636[this.field3245];
    }
}
