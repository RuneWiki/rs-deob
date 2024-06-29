import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class198 {

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    private int field3284 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    private int field3262 = -1;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "Lkl;")
    private class64 field3283 = new class64();

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Z")
    public boolean field3297 = false;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "[[[I")
    private int[][][] field3295;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "[Lfd;")
    private class190[] field3274;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Z")
    public static boolean field3266 = false;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "J")
    public static long field3277 = 0L;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field3270 = 99;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Ltl;")
    private static class59 field3271 = class85.method639("Fri", 9588);

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Ltl;")
    private static class59 field3278 = class85.method639("green:", 9588);

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Ltl;")
    public static class59 field3280 = field3278;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Ltl;")
    public static class59 field3272 = field3278;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field3289 = 0;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Ltl;")
    private static class59 field3287 = class85.method639("Wed", 9588);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ltl;")
    private static class59 field3263 = class85.method639("Sun", 9588);

    @OriginalMember(owner = "client!di", name = "D", descriptor = "Ltl;")
    public static class59 field3290 = class85.method639(" zuerst von Ihrer Freunde)2Liste(Q", 9588);

    @OriginalMember(owner = "client!di", name = "A", descriptor = "Z")
    public static boolean field3288 = true;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Ltl;")
    private static class59 field3286 = class85.method639("Mon", 9588);

    @OriginalMember(owner = "client!di", name = "E", descriptor = "Ltl;")
    public static class59 field3291 = class85.method639("http:)4)4", 9588);

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Ltl;")
    private static class59 field3282 = class85.method639("Thu", 9588);

    @OriginalMember(owner = "client!di", name = "F", descriptor = "Ltl;")
    public static class59 field3292 = class85.method639(")4a=", 9588);

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Ltl;")
    private static class59 field3296 = class85.method639("Tue", 9588);

    @OriginalMember(owner = "client!di", name = "H", descriptor = "Ltl;")
    private static class59 field3294 = class85.method639("Sat", 9588);

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[Ltl;")
    public static class59[] field3267 = new class59[] { field3263, field3286, field3296, field3287, field3282, field3271, field3294 };

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[Llj;")
    public static class5[] field3273;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "[Llj;")
    public static class5[] field3279;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[[I", line = 31)
    public final int[][] method1427(int arg0, int arg1) {
        if (arg0 != 0) {
            return (int[][]) ((int[][]) null);
        }
        field3275++;
        if (this.field3268 == this.field3265) {
            this.field3297 = this.field3274[arg1] == null;
            this.field3274[arg1] = class73.field1167;
            return this.field3295[arg1];
        } else if (this.field3265 == 1) {
            this.field3297 = this.field3262 != arg1;
            this.field3262 = arg1;
            return this.field3295[0];
        } else {
            class190 var3 = this.field3274[arg1];
            if (var3 == null) {
                this.field3297 = true;
                if (this.field3284 >= this.field3265) {
                    class190 var4 = (class190) this.field3283.method529(false);
                    var3 = new class190(arg1, var4.field3175);
                    this.field3274[var4.field3180] = null;
                    var4.method2000(121);
                } else {
                    var3 = new class190(arg1, this.field3284);
                    this.field3284++;
                }
                this.field3274[arg1] = var3;
            } else {
                this.field3297 = false;
            }
            this.field3283.method534(var3, false);
            return this.field3295[var3.field3175];
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 100)
    public final void method1428(int arg0) {
        field3276++;
        for (int var2 = arg0; var2 < this.field3265; var2++) {
            this.field3295[var2][0] = null;
            this.field3295[var2][1] = null;
            this.field3295[var2][2] = null;
            this.field3295[var2] = (int[][]) null;
        }
        this.field3274 = null;
        this.field3295 = (int[][][]) null;
        this.field3283.method530(-15068);
        this.field3283 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)[[[I", line = 172)
    public final int[][][] method1429(int arg0) {
        field3281++;
        if (this.field3268 != this.field3265) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -2) {
            field3292 = (class59) null;
        }
        for (int var2 = 0; var2 < this.field3265; var2++) {
            this.field3274[var2] = class73.field1167;
        }
        return this.field3295;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V", line = 276)
    public class198(int arg0, int arg1, int arg2) {
        this.field3265 = arg0;
        this.field3268 = arg1;
        this.field3295 = new int[this.field3265][3][arg2];
        this.field3274 = new class190[this.field3268];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 206)
    public static void method1430(byte arg0) {
        field3294 = null;
        field3279 = null;
        field3280 = null;
        field3272 = null;
        field3292 = null;
        field3282 = null;
        int var1 = -17 / ((-arg0 - 13) / 63);
        field3291 = null;
        field3287 = null;
        field3273 = null;
        field3278 = null;
        field3296 = null;
        field3290 = null;
        field3286 = null;
        field3263 = null;
        field3267 = null;
        field3271 = null;
    }
}
