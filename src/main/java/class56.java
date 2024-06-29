import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class56 extends class274 {

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "Lnm;")
    private class254 field782;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
    private static int[] field783 = new int[6];

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "[[I")
    private static int[][] field781 = new int[6][];

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "Lcd;")
    private class60 field784;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)Lcd;")
    public final class60 method399(byte arg0) {
        int var2 = 48 / ((arg0 - 17) / 42);
        if (this.field784 == null) {
            field783[2] = this.field785;
            field783[1] = this.field780;
            field783[0] = this.field779;
            field783[4] = this.field787;
            field783[5] = this.field786;
            field783[3] = this.field788;
            class481 var3 = this.field782.field871;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1335(field783[var6], (byte) 9)) {
                    return null;
                }
                class85 var7 = var3.method1331(9386, field783[var6]);
                int var8 = var7.field1197 ? 64 : 128;
                if (var5 < var8) {
                    var5 = var8;
                }
                if (var7.field1200 > 0) {
                    var4 = true;
                }
            }
            for (int var9 = 0; var9 < 6; var9++) {
                field781[var9] = var3.method1332(false, var5, field783[var9], var5, 1.0F, false);
            }
            this.field784 = new class60(this.field782, 6407, var5, var4, field781);
        }
        return this.field784;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lnm;IIIIII)V")
    public class56(class254 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field788 = arg4;
        this.field787 = arg5;
        this.field786 = arg6;
        this.field782 = arg0;
        this.field780 = arg2;
        this.field785 = arg3;
        this.field779 = arg1;
    }
}
