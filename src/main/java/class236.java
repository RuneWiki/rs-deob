import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class236 {

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    private int field3346 = 0;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    private int field3344 = -1;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lhi;")
    private class192 field3335 = new class192();

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Z")
    public boolean field3352 = false;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[Ll;")
    private class61[] field3339;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    private int field3336;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[[[I")
    private int[][][] field3341;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3337 = 0;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lcg;II)Lvm;", line = 8)
    public static final class297 method1622(class316 arg0, int arg1, int arg2) {
        if (arg1 != -29136) {
            method1624(-103);
        }
        field3350++;
        class297 var3 = new class297(arg2, arg0.method2158(-872702056), arg0.method2158(arg1 - 872672920), arg0.method2172((byte) 71), arg0.method2172((byte) 71), arg0.method2219(16448) == 1, arg0.method2219(16448));
        int var4 = arg0.method2219(arg1 ^ 0xFFFFCE70);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4400.method1339((byte) -120, new class151(arg0.method2219(16448), arg0.method2219(16448), arg0.method2220((byte) 80), arg0.method2220((byte) 89), arg0.method2220((byte) 66), arg0.method2220((byte) 64), arg0.method2220((byte) 72), arg0.method2220((byte) 98), arg0.method2220((byte) 52), arg0.method2220((byte) 61)));
        }
        var3.method2021(12800);
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)[[[I", line = 33)
    public final int[][][] method1623(byte arg0) {
        field3343++;
        if (this.field3340 != this.field3336) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3336; var2++) {
            this.field3339[var2] = class117.field1591;
        }
        if (arg0 <= 22) {
            method1622((class316) null, -96, -22);
        }
        return this.field3341;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 66)
    public static final void method1624(int arg0) {
        class235.field3331 = null;
        class209.field3012 = (byte[][]) null;
        class274.field4115 = null;
        class323.field4903 = null;
        class209.field3002 = null;
        class288.field4281 = null;
        if (arg0 > 15) {
            field3349++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[[I", line = 85)
    public final int[][] method1625(int arg0, int arg1) {
        if (arg1 != -13241) {
            return (int[][]) ((int[][]) null);
        }
        field3338++;
        if (this.field3340 == this.field3336) {
            this.field3352 = this.field3339[arg0] == null;
            this.field3339[arg0] = class117.field1591;
            return this.field3341[arg0];
        } else if (this.field3336 == 1) {
            this.field3352 = this.field3344 != arg0;
            this.field3344 = arg0;
            return this.field3341[0];
        } else {
            class61 var3 = this.field3339[arg0];
            if (var3 == null) {
                this.field3352 = true;
                if (this.field3346 < this.field3336) {
                    var3 = new class61(arg0, this.field3346);
                    this.field3346++;
                } else {
                    class61 var4 = (class61) this.field3335.method1338(arg1 + 13240);
                    var3 = new class61(arg0, var4.field815);
                    this.field3339[var4.field811] = null;
                    var4.method1274((byte) -26);
                }
                this.field3339[arg0] = var3;
            } else {
                this.field3352 = false;
            }
            this.field3335.method1343(var3, -85);
            return this.field3341[var3.field815];
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 152)
    public final void method1626(byte arg0) {
        field3345++;
        int var2 = 0;
        int var3 = -123 / ((-arg0 - 5) / 62);
        while (var2 < this.field3336) {
            this.field3341[var2][0] = null;
            this.field3341[var2][1] = null;
            this.field3341[var2][2] = null;
            this.field3341[var2] = (int[][]) null;
            var2++;
        }
        this.field3341 = (int[][][]) null;
        this.field3339 = null;
        this.field3335.method1345(-47);
        this.field3335 = null;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V", line = 180)
    public static final void method1627(byte arg0) {
        class159.field2182.method717((byte) 69);
        class193.field2646.method717((byte) 34);
        field3342++;
        if (arg0 >= -108) {
            field3337 = -52;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(III)V", line = 213)
    public class236(int arg0, int arg1, int arg2) {
        this.field3340 = arg1;
        this.field3339 = new class61[this.field3340];
        this.field3336 = arg0;
        this.field3341 = new int[this.field3336][3][arg2];
    }
}
