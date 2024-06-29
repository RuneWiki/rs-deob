import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class191 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    private int field3369 = -1;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    private int field3379 = 0;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lv;")
    private class218 field3375 = new class218();

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Z")
    public boolean field3388 = false;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    private int field3384;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[[I")
    private int[][] field3387;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[Lab;")
    private class3[] field3380;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Loc;")
    public static class151 field3377 = class137.method873(2, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Loc;")
    public static class151 field3370 = null;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Loc;")
    public static class151 field3385 = class137.method873(2, ")1p");

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "[I")
    public static int[] field3386 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3373;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[I")
    public final int[] method1182(int arg0, int arg1) {
        if (arg1 != -31709) {
            this.field3387 = null;
        }
        field3382++;
        if (this.field3384 == this.field3381) {
            this.field3388 = this.field3380[arg0] == null;
            this.field3380[arg0] = class168.field3064;
            return this.field3387[arg0];
        } else if (this.field3384 == 1) {
            this.field3388 = this.field3369 != arg0;
            this.field3369 = arg0;
            return this.field3387[0];
        } else {
            class3 var3 = this.field3380[arg0];
            if (var3 == null) {
                this.field3388 = true;
                if (this.field3379 < this.field3384) {
                    var3 = new class3(arg0, this.field3379);
                    this.field3379++;
                } else {
                    class3 var4 = (class3) this.field3375.method1359(arg1 + 31631);
                    var3 = new class3(arg0, var4.field72);
                    this.field3380[var4.field76] = null;
                    var4.method636(95);
                }
                this.field3380[arg0] = var3;
            } else {
                this.field3388 = false;
            }
            this.field3375.method1356(var3, arg1 ^ 0xFFFF8422);
            return this.field3387[var3.field72];
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)[[I")
    public final int[][] method1183(int arg0) {
        field3371++;
        if (this.field3384 != this.field3381) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field3384; var2++) {
            this.field3380[var2] = class168.field3064;
        }
        return this.field3387;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1184(boolean arg0) {
        field3373 = null;
        field3377 = null;
        field3385 = null;
        if (!arg0) {
            method1184(true);
        }
        field3370 = null;
        field3386 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1185(byte arg0) {
        field3376++;
        if (arg0 != -60) {
            field3377 = null;
        }
        for (int var2 = 0; var2 < this.field3384; var2++) {
            this.field3387[var2] = null;
        }
        this.field3387 = null;
        this.field3380 = null;
        this.field3375.method1357(arg0 ^ 0xFFFFFFC0);
        this.field3375 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(III)V")
    public class191(int arg0, int arg1, int arg2) {
        this.field3381 = arg1;
        this.field3384 = arg0;
        this.field3387 = new int[this.field3384][arg2];
        this.field3380 = new class3[this.field3381];
    }
}
