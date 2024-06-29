import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class471 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    private int field6296 = 0;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    private int field6308 = -1;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lgj;")
    private class593 field6313 = new class593();

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Z")
    public boolean field6315 = false;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    private int field6303;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    private int field6304;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "[[[I")
    private int[][][] field6302;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "[Lkg;")
    private class252[] field6312;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "[I")
    public static int[] field6298 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "S")
    public static short field6299 = 1;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "[Lae;")
    public static class233[] field6307 = new class233[0];

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "[I")
    public static int[] field6306 = new int[500];

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "[[I")
    public static int[][] field6310 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "F")
    public static float field6300;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method2650(int arg0) {
        field6297++;
        if (this.field6304 != this.field6303) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field6303; var2++) {
            this.field6312[var2] = class217.field3091;
        }
        return this.field6302;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method2651(byte arg0) {
        field6314++;
        for (int var2 = 0; var2 < this.field6303; var2++) {
            this.field6302[var2][0] = null;
            this.field6302[var2][1] = null;
            this.field6302[var2][2] = null;
            this.field6302[var2] = null;
        }
        this.field6312 = null;
        this.field6302 = null;
        this.field6313.method3255((byte) -82);
        this.field6313 = null;
        if (arg0 >= -37) {
            this.field6304 = 9;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public static void method2652(int arg0) {
        field6298 = null;
        field6307 = null;
        field6310 = null;
        field6306 = null;
        if (arg0 != 29795) {
            field6307 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IFFF)I")
    public static final int method2653(int arg0, float arg1, float arg2, float arg3) {
        field6311++;
        float var4 = (arg3 < 0.0F) ? -arg3 : arg3;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg0 != 3) {
            field6298 = null;
        }
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var5 > var4 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method2654(boolean arg0, int arg1) {
        field6305++;
        if (arg0) {
            this.method2650(-25);
        }
        if (this.field6304 == this.field6303) {
            this.field6315 = this.field6312[arg1] == null;
            this.field6312[arg1] = class217.field3091;
            return this.field6302[arg1];
        } else if (this.field6303 == 1) {
            this.field6315 = this.field6308 != arg1;
            this.field6308 = arg1;
            return this.field6302[0];
        } else {
            class252 var3 = this.field6312[arg1];
            if (var3 == null) {
                this.field6315 = true;
                if (this.field6303 <= this.field6296) {
                    class252 var4 = (class252) this.field6313.method3264((byte) 58);
                    var3 = new class252(arg1, var4.field3468);
                    this.field6312[var4.field3467] = null;
                    var4.method2797(-101);
                } else {
                    var3 = new class252(arg1, this.field6296);
                    this.field6296++;
                }
                this.field6312[arg1] = var3;
            } else {
                this.field6315 = false;
            }
            this.field6313.method3258(var3, 0);
            return this.field6302[var3.field3468];
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(III)V")
    public class471(int arg0, int arg1, int arg2) {
        this.field6303 = arg0;
        this.field6304 = arg1;
        this.field6302 = new int[this.field6303][3][arg2];
        this.field6312 = new class252[this.field6304];
    }
}
