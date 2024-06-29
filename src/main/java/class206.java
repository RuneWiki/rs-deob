import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class206 extends class157 {

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lcg;")
    private class393 field3081;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field3086;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    private int field3089;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    private int field3084;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "[[I")
    private static int[][] field3082 = new int[6][];

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
    private static int[] field3080 = new int[6];

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lgm;")
    private class92 field3085;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Lgm;")
    public final class92 method967(int arg0) {
        if (arg0 != -18478) {
            this.field3084 = 123;
        }
        if (this.field3085 == null) {
            field3080[1] = this.field3088;
            field3080[2] = this.field3084;
            field3080[3] = this.field3083;
            field3080[4] = this.field3089;
            field3080[0] = this.field3086;
            class96 var2 = this.field3081.field5773;
            field3080[5] = this.field3087;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method178(false, field3080[var5])) {
                    return null;
                }
                class154 var6 = var2.method180(field3080[var5], -122);
                int var7 = var6.field2126 ? 64 : 128;
                if (var6.field2131 > 0) {
                    var3 = true;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field3082[var8] = var2.method185(var4, false, var4, 1.0F, 17486, field3080[var8]);
            }
            this.field3085 = new class92(this.field3081, 6407, var4, var3, field3082);
        }
        return this.field3085;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lcg;IIIIII)V")
    public class206(class393 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3081 = arg0;
        this.field3088 = arg2;
        this.field3086 = arg1;
        this.field3089 = arg5;
        this.field3083 = arg4;
        this.field3084 = arg3;
        this.field3087 = arg6;
    }
}
