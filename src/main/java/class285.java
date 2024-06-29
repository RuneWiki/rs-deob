import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class285 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    private int field4458 = -1;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    private int field4459 = 0;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lab;")
    private class148 field4465 = new class148();

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Z")
    public boolean field4474 = false;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    private int field4461;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[[I")
    private int[][] field4464;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    private int field4460;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lfb;")
    private class30[] field4467;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4457 = "Loading textures - ";

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4468 = new String[500];

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[[S")
    public static short[][] field4476 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Z")
    public static boolean field4470 = false;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
    public static int[] field4471;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)[[I")
    public final int[][] method1916(int arg0) {
        field4463++;
        if (this.field4461 != this.field4460) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 4783) {
            field4469 = -6;
        }
        for (int var2 = 0; var2 < this.field4461; var2++) {
            this.field4467[var2] = class247.field3793;
        }
        return this.field4464;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static void method1917(int arg0) {
        field4457 = null;
        field4471 = null;
        if (arg0 != 5681) {
            method1917(-111);
        }
        field4476 = null;
        field4468 = null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public final void method1918(int arg0) {
        for (int var2 = 0; var2 < this.field4461; var2++) {
            this.field4464[var2] = null;
        }
        this.field4467 = null;
        this.field4464 = null;
        field4473++;
        this.field4465.method989((byte) -94);
        this.field4465 = null;
        if (arg0 < 9) {
            this.field4467 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static final void method1919(byte arg0) {
        class228.field3461.method544(false);
        field4462++;
        if (arg0 != 94) {
            method1921(-6, 11, 41);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)[I")
    public final int[] method1920(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field4475++;
        if (this.field4461 == this.field4460) {
            this.field4474 = this.field4467[arg0] == null;
            this.field4467[arg0] = class247.field3793;
            return this.field4464[arg0];
        } else if (this.field4461 == 1) {
            this.field4474 = this.field4458 != arg0;
            this.field4458 = arg0;
            return this.field4464[0];
        } else {
            class30 var3 = this.field4467[arg0];
            if (var3 == null) {
                this.field4474 = true;
                if (this.field4459 >= this.field4461) {
                    class30 var4 = (class30) this.field4465.method992(3);
                    var3 = new class30(arg0, var4.field407);
                    this.field4467[var4.field406] = null;
                    var4.method1115(41);
                } else {
                    var3 = new class30(arg0, this.field4459);
                    this.field4459++;
                }
                this.field4467[arg0] = var3;
            } else {
                this.field4474 = false;
            }
            this.field4465.method991(var3, 124);
            return this.field4464[var3.field407];
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
    public static final void method1921(int arg0, int arg1, int arg2) {
        field4472++;
        class280 var3 = class181.method1180(arg2, arg0 ^ 0xC, arg0);
        var3.method1876(1840457248);
        var3.field4330 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(III)V")
    public class285(int arg0, int arg1, int arg2) {
        this.field4461 = arg0;
        this.field4464 = new int[this.field4461][arg2];
        this.field4460 = arg1;
        this.field4467 = new class30[this.field4460];
    }
}
