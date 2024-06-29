import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class320 extends class372 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lhj;")
    private class338 field4392;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    private int field4393;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    private int field4394;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[I")
    private static int[] field4389 = new int[6];

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[[I")
    private static int[][] field4385 = new int[6][];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lih;")
    private class416 field4386;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Lih;")
    public final class416 method2030(byte arg0) {
        if (arg0 > -20) {
            this.method2030((byte) 7);
        }
        if (this.field4386 == null) {
            field4389[4] = this.field4390;
            field4389[3] = this.field4388;
            field4389[1] = this.field4394;
            field4389[2] = this.field4387;
            field4389[0] = this.field4393;
            class136 var2 = this.field4392.field4611;
            field4389[5] = this.field4391;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method610((byte) 0, field4389[var5])) {
                    return null;
                }
                class164 var6 = var2.method607(false, field4389[var5]);
                int var7 = var6.field2301 ? 64 : 128;
                if (var6.field2305 > 0) {
                    var3 = true;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field4385[var8] = var2.method613(1.0F, field4389[var8], var4, (byte) 75, false, var4);
            }
            this.field4386 = new class416(this.field4392, 6407, var4, var3, field4385);
        }
        return this.field4386;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lhj;IIIIII)V")
    public class320(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4391 = arg6;
        this.field4392 = arg0;
        this.field4393 = arg1;
        this.field4388 = arg4;
        this.field4390 = arg5;
        this.field4394 = arg2;
        this.field4387 = arg3;
    }
}
