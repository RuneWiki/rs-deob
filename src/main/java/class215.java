import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class215 extends class381 {

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[[I")
    public int[][] field2980;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
    public int[] field2985;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[I")
    public int[] field2981;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[Z")
    public boolean[] field2979;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Z")
    public static boolean field2978 = true;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Z")
    public static boolean field2976 = false;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lkb;")
    public static class80 field2984;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V")
    public static void method1470(byte arg0) {
        field2984 = null;
        if (arg0 != 104) {
            field2976 = true;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg0; var5 < class352.field4817; var5++) {
            Rectangle var6 = class395.field5530[var5];
            if ((var6.x + var6.width) > arg2 && var6.x < (arg2 + arg3) && var6.y + var6.height > arg1 && arg1 + arg4 > var6.y) {
                class135.field1930[var5] = true;
            }
        }
        field2982++;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I[B)V")
    public class215(int arg0, byte[] arg1) {
        this.field2983 = arg0;
        class289 var3 = new class289(arg1);
        this.field2977 = var3.method1861((byte) -72);
        this.field2980 = new int[this.field2977][];
        this.field2985 = new int[this.field2977];
        this.field2981 = new int[this.field2977];
        this.field2979 = new boolean[this.field2977];
        for (int var4 = 0; var4 < this.field2977; var4++) {
            this.field2981[var4] = var3.method1861((byte) -72);
        }
        for (int var5 = 0; var5 < this.field2977; var5++) {
            this.field2979[var5] = var3.method1861((byte) -72) == 1;
        }
        for (int var6 = 0; var6 < this.field2977; var6++) {
            this.field2985[var6] = var3.method1853(120);
        }
        for (int var7 = 0; var7 < this.field2977; var7++) {
            this.field2980[var7] = new int[var3.method1861((byte) -72)];
        }
        for (int var8 = 0; var8 < this.field2977; var8++) {
            for (int var9 = 0; var9 < this.field2980[var8].length; var9++) {
                this.field2980[var8][var9] = var3.method1861((byte) -72);
            }
        }
    }
}
