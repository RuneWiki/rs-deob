import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class172 extends class130 {

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private int field3300;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "[[I")
    public int[][] field3291;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "[I")
    public int[] field3289;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lsd;")
    public static class166 field3295 = class135.method935(")3runescape)3com", 0);

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Lsd;")
    public static class166 field3293 = class135.method935("Okay", 0);

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "Lsd;")
    public static class166 field3296 = class135.method935(" )2> <col=ffffff>", 0);

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lsd;")
    public static class166 field3294 = class135.method935("Lade Schrifts-=tze )2 ", 0);

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Lcb;")
    public static class22 field3298;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Z")
    public static boolean field3288;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[I")
    public static int[] field3297;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1189(byte arg0) {
        field3294 = null;
        field3296 = null;
        field3298 = null;
        field3293 = null;
        if (arg0 >= -13) {
            field3296 = null;
        }
        field3297 = null;
        field3295 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIB)I")
    public static final int method1190(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 114) {
            field3298 = null;
        }
        if (arg2 > 179) {
            arg0 /= 2;
        }
        if (arg2 > 192) {
            arg0 /= 2;
        }
        if (arg2 > 217) {
            arg0 /= 2;
        }
        if (arg2 > 243) {
            arg0 /= 2;
        }
        int var4 = (arg0 / 32 << 7) + (arg1 / 4 << 10) + arg2 / 2;
        field3292++;
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[B)V")
    public class172(int arg0, byte[] arg1) {
        this.field3290 = arg0;
        class53 var3 = new class53(arg1);
        this.field3300 = var3.method400(255);
        this.field3291 = new int[this.field3300][];
        this.field3289 = new int[this.field3300];
        for (int var4 = 0; var4 < this.field3300; var4++) {
            this.field3289[var4] = var3.method400(255);
        }
        for (int var5 = 0; var5 < this.field3300; var5++) {
            this.field3291[var5] = new int[var3.method400(255)];
        }
        for (int var6 = 0; var6 < this.field3300; var6++) {
            for (int var7 = 0; var7 < this.field3291[var6].length; var7++) {
                this.field3291[var6][var7] = var3.method400(255);
            }
        }
    }
}
