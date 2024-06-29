import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class262 {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    private int field4543 = -1;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    private int field4544 = 0;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lvf;")
    private class296 field4540 = new class296();

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "Z")
    public boolean field4552 = false;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    private int field4538;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[[I")
    private int[][] field4545;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[Log;")
    private class195[] field4547;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field4541 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "[I")
    public static int[] field4537 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lmh;")
    public static class128 field4553 = class22.method156(127, "Stufe: ");

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Ldj;")
    public static class314 field4551;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[I", line = 16)
    public final int[] method1838(boolean arg0, int arg1) {
        if (arg0) {
            field4553 = (class128) null;
        }
        field4546++;
        if (this.field4538 == this.field4536) {
            this.field4552 = this.field4547[arg1] == null;
            this.field4547[arg1] = class84.field1495;
            return this.field4545[arg1];
        } else if (this.field4538 == 1) {
            this.field4552 = this.field4543 != arg1;
            this.field4543 = arg1;
            return this.field4545[0];
        } else {
            class195 var3 = this.field4547[arg1];
            if (var3 == null) {
                this.field4552 = true;
                if (this.field4544 >= this.field4538) {
                    class195 var4 = (class195) this.field4540.method2031(1211754408);
                    var3 = new class195(arg1, var4.field3422);
                    this.field4547[var4.field3426] = null;
                    var4.method1978((byte) -98);
                } else {
                    var3 = new class195(arg1, this.field4544);
                    this.field4544++;
                }
                this.field4547[arg1] = var3;
            } else {
                this.field4552 = false;
            }
            this.field4540.method2022(-109, var3);
            return this.field4545[var3.field3422];
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 93)
    public static void method1839(int arg0) {
        field4553 = null;
        if (arg0 == -1) {
            field4537 = null;
            field4551 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(III)V", line = 367)
    public class262(int arg0, int arg1, int arg2) {
        this.field4538 = arg0;
        this.field4536 = arg1;
        this.field4545 = new int[this.field4538][arg2];
        this.field4547 = new class195[this.field4536];
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)[[I", line = 115)
    public final int[][] method1840(int arg0) {
        field4542++;
        if (this.field4538 != this.field4536) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -104 / ((19 - arg0) / 45);
        for (int var3 = 0; var3 < this.field4538; var3++) {
            this.field4547[var3] = class84.field1495;
        }
        return this.field4545;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V", line = 149)
    public static final void method1841(byte arg0, int arg1) {
        field4539++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class146.field2504 += arg1 * 128;
        if (class121.field2052.length < class146.field2504) {
            class146.field2504 -= class121.field2052.length;
            int var3 = (int) (Math.random() * 12.0D);
            class144.method959(14649, class299.field5093[var3]);
        }
        int var4 = 0;
        int var5 = (var2 - arg1) * 128;
        int var6 = arg1 * 128;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class128.field2222[var4 + var6] - (class121.field2052[class146.field2504 + var4 & class121.field2052.length + -1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class128.field2222[var4++] = var8;
        }
        int var9 = var2 - arg1;
        if (arg0 != -69) {
            return;
        }
        while (var9 < var2) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class128.field2222[var10 + var11] = 255;
                } else {
                    class128.field2222[var10 + var11] = 0;
                }
            }
            var9++;
        }
        for (int var13 = 0; var13 < var2 - arg1; var13++) {
            class229.field3993[var13] = class229.field3993[arg1 + var13];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class229.field3993[var14] = (int) (Math.sin((double) class173.field3058 / 14.0D) * 16.0D + Math.sin((double) class173.field3058 / 15.0D) * 14.0D + Math.sin((double) class173.field3058 / 16.0D) * 12.0D);
            class173.field3058++;
        }
        int var15 = (arg1 + (class293.field5011 & 0x1)) / 2;
        class187.field3248 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class187.field3248; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class128.field2222[(var18 << 7) + var17] = 192;
        }
        class187.field3248 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = var19 * 128;
            int var21 = 0;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var21 += class128.field2222[var20 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var21 -= class128.field2222[var22 + var20 - var15 - 1];
                }
                if (var22 >= 0) {
                    class181.field3170[var20 + var22] = var21 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > (var15 + var25)) {
                    var24 += class181.field3170[var15 * 128 + var23 + var26];
                }
                if ((var25 - (var15 + 1)) >= 0) {
                    var24 -= class181.field3170[(var23 - -var26) - var15 * 128 - 128];
                }
                if (var25 >= 0) {
                    class128.field2222[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 329)
    public final void method1842(boolean arg0) {
        field4548++;
        for (int var2 = 0; var2 < this.field4538; var2++) {
            this.field4545[var2] = null;
        }
        if (!arg0) {
            field4537 = (int[]) null;
        }
        this.field4547 = null;
        this.field4545 = (int[][]) null;
        this.field4540.method2025((byte) -97);
        this.field4540 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLdj;Ldj;)V", line = 350)
    public static final void method1843(boolean arg0, class314 arg1, class314 arg2) {
        class292.field4996 = arg2;
        class245.field4186 = arg1;
        field4549++;
        if (!arg0) {
            field4553 = (class128) null;
        }
    }
}
