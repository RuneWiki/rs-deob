import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class306 extends class438 {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    private int field4339;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field4346;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    private int field4338;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lfu;")
    private class42 field4342;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[[I")
    private static int[][] field4341 = new int[6][];

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "[I")
    private static int[] field4347 = new int[6];

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Lbl;")
    private class240 field4344;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)Lbl;")
    public final class240 method1966(byte arg0) {
        if (arg0 >= -60) {
            this.field4344 = (class240) null;
        }
        if (this.field4344 == null) {
            class248 var2 = this.field4342.field1250;
            field4347[5] = this.field4343;
            field4347[1] = this.field4339;
            field4347[0] = this.field4338;
            field4347[4] = this.field4345;
            field4347[2] = this.field4340;
            field4347[3] = this.field4346;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1223(-29838, field4347[var5])) {
                    return null;
                }
                class308 var6 = var2.method1224((byte) 110, field4347[var5]);
                int var7 = var6.field4361 ? 64 : 128;
                if (var7 > var4) {
                    var4 = var7;
                }
                if (var6.field4362 > 0) {
                    var3 = true;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field4341[var8] = var2.method1231(field4347[var8], var4, var4, false, -22414, 1.0F);
            }
            this.field4344 = new class240(this.field4342, 6407, var4, var3, field4341);
        }
        return this.field4344;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lfu;IIIIII)V")
    public class306(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4339 = arg2;
        this.field4346 = arg4;
        this.field4343 = arg6;
        this.field4338 = arg1;
        this.field4340 = arg3;
        this.field4345 = arg5;
        this.field4342 = arg0;
    }
}
