import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class176 extends class383 {

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    private int field2914;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "Lsq;")
    private class96 field2908;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "[I")
    private static int[] field2909 = new int[6];

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "[[I")
    private static int[][] field2913 = new int[6][];

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "Lrj;")
    private class352 field2906;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Lrj;", line = 14)
    public final class352 method900(int arg0) {
        if (arg0 != 16057) {
            return (class352) null;
        }
        if (this.field2906 == null) {
            field2909[2] = this.field2910;
            field2909[0] = this.field2911;
            field2909[3] = this.field2914;
            field2909[1] = this.field2912;
            field2909[5] = this.field2905;
            class215 var2 = this.field2908.field1161;
            field2909[4] = this.field2907;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method985(field2909[var5], (byte) -16)) {
                    return null;
                }
                class266 var6 = var2.method989(field2909[var5], (byte) 53);
                int var7 = var6.field4282 ? 64 : 128;
                if (var4 < var7) {
                    var4 = var7;
                }
                if (var6.field4271 > 0) {
                    var3 = true;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field2913[var8] = var2.method983(field2909[var8], 1.0F, var4, false, arg0 - 44170, var4);
            }
            this.field2906 = new class352(this.field2908, 6407, var4, var3, field2913);
        }
        return this.field2906;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lsq;IIIIII)V", line = 77)
    public class176(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2910 = arg3;
        this.field2914 = arg4;
        this.field2908 = arg0;
        this.field2911 = arg1;
        this.field2907 = arg5;
        this.field2905 = arg6;
        this.field2912 = arg2;
    }
}
