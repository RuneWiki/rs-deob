import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class355 extends class153 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ltb;")
    private class227 field4863;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field4870;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field4869;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "[[I")
    private static int[][] field4867 = new int[6][];

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
    private static int[] field4868 = new int[6];

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lds;")
    private class10 field4866;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Lds;", line = 13)
    public final class10 method1031(byte arg0) {
        if (this.field4866 == null) {
            field4868[1] = this.field4864;
            field4868[5] = this.field4870;
            field4868[4] = this.field4871;
            field4868[0] = this.field4865;
            field4868[3] = this.field4869;
            class152 var2 = this.field4863.field3186;
            field4868[2] = this.field4862;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method473(field4868[var5], 94)) {
                    return null;
                }
                class454 var6 = var2.method469(field4868[var5], (byte) -87);
                int var7 = var6.field6488 ? 64 : 128;
                if (var4 < var7) {
                    var4 = var7;
                }
                if (var6.field6486 > 0) {
                    var3 = true;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field4867[var8] = var2.method472(var4, (byte) -72, 1.0F, false, field4868[var8], var4);
            }
            this.field4866 = new class10(this.field4863, 6407, var4, var3, field4867);
        }
        return arg0 < 126 ? (class10) null : this.field4866;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ltb;IIIIII)V", line = 77)
    public class355(class227 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4864 = arg2;
        this.field4863 = arg0;
        this.field4865 = arg1;
        this.field4871 = arg5;
        this.field4862 = arg3;
        this.field4870 = arg6;
        this.field4869 = arg4;
    }
}
