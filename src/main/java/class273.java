import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class273 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    private int field4411 = -1;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    private int field4427 = 0;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Lie;")
    private class2 field4412 = new class2();

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Z")
    public boolean field4428 = false;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "[Lwj;")
    private class158[] field4415;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    private int field4416;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "[[[I")
    private int[][][] field4413;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4422 = "Loaded interfaces";

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field4418 = 100;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[S")
    public static short[] field4423 = new short[256];

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Z")
    public static boolean field4424 = false;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static volatile int field4409 = 0;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "B")
    public static byte field4421;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Lca;")
    public static class122 field4426;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method1901(boolean arg0) {
        field4419++;
        if (this.field4416 != this.field4414) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0) {
            this.field4415 = null;
        }
        for (int var2 = 0; var2 < this.field4416; var2++) {
            this.field4415[var2] = class75.field1181;
        }
        return this.field4413;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[[I")
    public final int[][] method1902(int arg0, int arg1) {
        field4420++;
        if (arg0 > -94) {
            field4418 = -1;
        }
        if (this.field4416 == this.field4414) {
            this.field4428 = this.field4415[arg1] == null;
            this.field4415[arg1] = class75.field1181;
            return this.field4413[arg1];
        } else if (this.field4416 == 1) {
            this.field4428 = this.field4411 != arg1;
            this.field4411 = arg1;
            return this.field4413[0];
        } else {
            class158 var3 = this.field4415[arg1];
            if (var3 == null) {
                this.field4428 = true;
                if (this.field4416 <= this.field4427) {
                    class158 var4 = (class158) this.field4412.method6(32);
                    var3 = new class158(arg1, var4.field2457);
                    this.field4415[var4.field2458] = null;
                    var4.method1781(5250);
                } else {
                    var3 = new class158(arg1, this.field4427);
                    this.field4427++;
                }
                this.field4415[arg1] = var3;
            } else {
                this.field4428 = false;
            }
            this.field4412.method9((byte) 77, var3);
            return this.field4413[var3.field2457];
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Z")
    public static final boolean method1903(int arg0) {
        if (arg0 == 100) {
            field4410++;
            return class79.field1277;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public final void method1904(byte arg0) {
        for (int var2 = 0; var2 < this.field4416; var2++) {
            this.field4413[var2][0] = null;
            this.field4413[var2][1] = null;
            this.field4413[var2][2] = null;
            this.field4413[var2] = null;
        }
        this.field4413 = null;
        field4425++;
        this.field4415 = null;
        if (arg0 == 114) {
            this.field4412.method5(32);
            this.field4412 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method1905(int arg0) {
        if (arg0 <= 37) {
            field4418 = 78;
        }
        field4423 = null;
        field4426 = null;
        field4422 = null;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(III)V")
    public class273(int arg0, int arg1, int arg2) {
        this.field4414 = arg1;
        this.field4415 = new class158[this.field4414];
        this.field4416 = arg0;
        this.field4413 = new int[this.field4416][3][arg2];
    }
}
