import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class375 extends class152 {

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    private int field5342;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    private int field5346;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    private int field5347;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    private int field5343;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    private int field5349;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "Lig;")
    private class132 field5340;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    private int field5344;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "[I")
    private static int[] field5345 = new int[6];

    @OriginalMember(owner = "client!go", name = "p", descriptor = "[[I")
    private static int[][] field5348 = new int[6][];

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Lwl;")
    private class234 field5341;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)Lwl;")
    public final class234 method456(int arg0) {
        if (this.field5341 == null) {
            field5345[2] = this.field5342;
            field5345[5] = this.field5346;
            field5345[4] = this.field5344;
            field5345[1] = this.field5349;
            field5345[3] = this.field5343;
            field5345[0] = this.field5347;
            class211 var2 = this.field5340.field1915;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1471(-31571, field5345[var5])) {
                    return null;
                }
                class287 var6 = var2.method1475(field5345[var5], 17673);
                int var7 = var6.field4164 ? 64 : 128;
                if (var4 < var7) {
                    var4 = var7;
                }
                if (var6.field4185 > 0) {
                    var3 = 1;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field5348[var8] = var2.method1474(var4, false, 1.0F, var4, (byte) -125, field5345[var8]);
            }
            this.field5341 = new class234(this.field5340, 6407, var4, var3 != 0, field5348);
        }
        return arg0 == -32077 ? this.field5341 : (class234) null;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lig;IIIIII)V")
    public class375(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5342 = arg3;
        this.field5346 = arg6;
        this.field5347 = arg1;
        this.field5343 = arg4;
        this.field5349 = arg2;
        this.field5340 = arg0;
        this.field5344 = arg5;
    }
}
