import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class367 extends class430 {

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public int field5370;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[I")
    public int[] field5371;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[Z")
    public boolean[] field5369;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
    public int[] field5372;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[[I")
    public int[][] field5367;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Lkca;")
    public static class755 field5365 = new class755(2);

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field5374 = 999999;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[Lffa;")
    public static class676[] field5364;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
    public static final boolean method2305(int arg0, int arg1, int arg2) {
        field5368++;
        if (arg2 != 0) {
            field5374 = -55;
        }
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5366++;
        class279 var10 = null;
        class279 var11 = (class279) class154.field2233.method3565(arg9 ^ 0xFFFFFFA2);
        if (arg9 != 1) {
            field5365 = null;
        }
        while (var11 != null) {
            if (var11.field3899 == arg4 && var11.field3906 == arg0 && var11.field3901 == arg8 && var11.field3907 == arg7) {
                var10 = var11;
                break;
            }
            var11 = (class279) class154.field2233.method3561((byte) 71);
        }
        if (var10 == null) {
            var10 = new class279();
            var10.field3899 = arg4;
            var10.field3901 = arg8;
            var10.field3907 = arg7;
            var10.field3906 = arg0;
            if (arg0 >= 0 && arg8 >= 0 && class184.field2546 > arg0 && class240.field3555 > arg8) {
                class616.method3576(-24008, var10);
            }
            class154.field2233.method3559(var10, (byte) 12);
        }
        var10.field3909 = arg6;
        var10.field3900 = arg1;
        var10.field3902 = arg5;
        var10.field3910 = arg3;
        var10.field3898 = arg2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Z")
    public static final boolean method2307(byte arg0) {
        field5363++;
        if (class151.method1095("jaclib", 3)) {
            if (arg0 >= -72) {
                method2307((byte) 66);
            }
            return class151.method1095("hw3d", 3);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method2308(int arg0) {
        field5365 = null;
        if (arg0 != -1) {
            method2308(-87);
        }
        field5364 = null;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[B)V")
    public class367(int arg0, byte[] arg1) {
        this.field5362 = arg0;
        class479 var3 = new class479(arg1);
        this.field5370 = var3.method2886(true);
        this.field5371 = new int[this.field5370];
        this.field5369 = new boolean[this.field5370];
        this.field5372 = new int[this.field5370];
        this.field5367 = new int[this.field5370][];
        for (int var4 = 0; var4 < this.field5370; var4++) {
            this.field5371[var4] = var3.method2886(true);
            if (this.field5371[var4] == 6) {
                this.field5371[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5370; var5++) {
            this.field5369[var5] = var3.method2886(true) == 1;
        }
        for (int var6 = 0; var6 < this.field5370; var6++) {
            this.field5372[var6] = var3.method2882(-1);
        }
        for (int var7 = 0; var7 < this.field5370; var7++) {
            this.field5367[var7] = new int[var3.method2886(true)];
        }
        for (int var8 = 0; var8 < this.field5370; var8++) {
            for (int var9 = 0; var9 < this.field5367[var8].length; var9++) {
                this.field5367[var8][var9] = var3.method2886(true);
            }
        }
    }
}
