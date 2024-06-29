import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class251 {

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lcd;")
    public static class64 field4356 = class44.method335((byte) 71, "Versteckt");

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lcd;")
    public static class64 field4376 = class44.method335((byte) 71, "::wm3");

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lcd;")
    public static class64 field4368 = class44.method335((byte) 71, " <col=00ff80>");

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Lcd;")
    public static class64 field4379 = class44.method335((byte) 71, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lwa;")
    public class75 field4363;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Ljava/awt/Image;")
    public static Image field4359;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Z")
    public static boolean field4378;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[I")
    public int[] field4357;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    public int[] field4358;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    public int[] field4362;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "[I")
    public int[] field4364;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[I")
    public static int[] field4365;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
    public int[] field4366;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "[I")
    public int[] field4374;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[Lwa;")
    public class75[] field4377;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[[I")
    public int[][] field4372;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "[[I")
    public int[][] field4381;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 11)
    public static void method1800(int arg0) {
        field4365 = null;
        if (arg0 != -1) {
            return;
        }
        field4376 = null;
        field4356 = null;
        field4368 = null;
        field4379 = null;
        field4359 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLfk;)V", line = 39)
    public static final void method1801(boolean arg0, class41 arg1) {
        if (!arg0) {
            field4378 = true;
        }
        class246 var2 = (class246) class17.field336.method1151(arg1.field672.method509(31492), 0);
        if (var2 != null) {
            if (var2.field4283 != null) {
                class250.field4341.method1419(var2.field4283);
                var2.field4283 = null;
            }
            var2.method232(128);
        }
        field4367++;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)[Ldb;", line = 88)
    public static final class175[] method1802(int arg0) {
        field4369++;
        class175[] var1 = new class175[class265.field4554];
        for (int var2 = arg0; var2 < class265.field4554; var2++) {
            if (class123.field2216) {
                var1[var2] = new class33(class24.field400, class46.field755, class234.field3959[var2], field4365[var2], class223.field3811[var2], class310.field5263[var2], class58.field969[var2], class236.field3985);
            } else {
                var1[var2] = new class176(class24.field400, class46.field755, class234.field3959[var2], field4365[var2], class223.field3811[var2], class310.field5263[var2], class58.field969[var2], class236.field3985);
            }
        }
        method1803(-1);
        return var1;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V", line = 112)
    public static final void method1803(int arg0) {
        field4361++;
        class310.field5263 = null;
        class234.field3959 = null;
        class58.field969 = (byte[][]) null;
        field4365 = null;
        class236.field3985 = null;
        if (arg0 != -1) {
            method1800(-76);
        }
        class223.field3811 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)V", line = 136)
    private final void method1804(int arg0, byte[] arg1) {
        field4380++;
        class13 var3 = new class13(class289.method1992(arg1, -126));
        int var4 = var3.method152((byte) -121);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4375 = var3.method105((byte) 78);
        } else {
            this.field4375 = 0;
        }
        int var5 = -1;
        int var6 = var3.method152((byte) -122);
        this.field4371 = var3.method112((byte) 92);
        int var7 = 0;
        this.field4362 = new int[this.field4371];
        for (int var8 = 0; var8 < this.field4371; var8++) {
            this.field4362[var8] = var7 += var3.method112((byte) 92);
            if (this.field4362[var8] > var5) {
                var5 = this.field4362[var8];
            }
        }
        this.field4373 = var5 + 1;
        this.field4374 = new int[this.field4373];
        this.field4372 = new int[this.field4373][];
        this.field4366 = new int[this.field4373];
        this.field4364 = new int[this.field4373];
        this.field4358 = new int[this.field4373];
        if (var6 != 0) {
            this.field4357 = new int[this.field4373];
            for (int var9 = 0; var9 < this.field4373; var9++) {
                this.field4357[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4371; var10++) {
                this.field4357[this.field4362[var10]] = var3.method105((byte) 43);
            }
            this.field4363 = new class75(this.field4357);
        }
        for (int var11 = 0; var11 < this.field4371; var11++) {
            this.field4366[this.field4362[var11]] = var3.method105((byte) 102);
        }
        for (int var12 = 0; var12 < this.field4371; var12++) {
            this.field4364[this.field4362[var12]] = var3.method105((byte) 63);
        }
        if (arg0 <= 80) {
            this.method1804(93, (byte[]) null);
        }
        for (int var13 = 0; var13 < this.field4371; var13++) {
            this.field4374[this.field4362[var13]] = var3.method112((byte) 92);
        }
        for (int var14 = 0; var14 < this.field4371; var14++) {
            int var15 = this.field4362[var14];
            int var16 = this.field4374[var15];
            this.field4372[var15] = new int[var16];
            int var17 = -1;
            int var18 = 0;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = this.field4372[var15][var19] = var18 += var3.method112((byte) 92);
                if (var17 < var20) {
                    var17 = var20;
                }
            }
            this.field4358[var15] = var17 + 1;
            if (var17 + 1 == var16) {
                this.field4372[var15] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4377 = new class75[var5 + 1];
        this.field4381 = new int[var5 + 1][];
        for (int var21 = 0; var21 < this.field4371; var21++) {
            int var22 = this.field4362[var21];
            int var23 = this.field4374[var22];
            this.field4381[var22] = new int[this.field4358[var22]];
            for (int var24 = 0; var24 < this.field4358[var22]; var24++) {
                this.field4381[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4372[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4372[var22][var25];
                }
                this.field4381[var22][var26] = var3.method105((byte) 125);
            }
            this.field4377[var22] = new class75(this.field4381[var22]);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([BI)V", line = 314)
    public class251(byte[] arg0, int arg1) {
        this.field4370 = class118.method841(arg0, arg0.length, true);
        if (this.field4370 != arg1) {
            throw new RuntimeException();
        }
        this.method1804(96, arg0);
    }
}
