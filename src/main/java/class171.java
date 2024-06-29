import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class171 extends class438 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field2360;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field2366;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field2359;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    private int field2363;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private int field2361;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lao;")
    private class157 field2358;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[[I")
    private static int[][] field2362 = new int[6][];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
    private static int[] field2364 = new int[6];

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lvk;")
    private class206 field2367;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lvk;")
    public final class206 method1145(byte arg0) {
        if (arg0 <= 90) {
            this.method1145((byte) 111);
        }
        if (this.field2367 == null) {
            field2364[5] = this.field2363;
            field2364[0] = this.field2366;
            field2364[3] = this.field2365;
            field2364[1] = this.field2360;
            field2364[2] = this.field2359;
            field2364[4] = this.field2361;
            class343 var2 = this.field2358.field1922;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1328((byte) 85, field2364[var5])) {
                    return null;
                }
                class336 var6 = var2.method1329((byte) -44, field2364[var5]);
                int var7 = var6.field4768 ? 64 : 128;
                if (var6.field4775 > 0) {
                    var3 = true;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field2362[var8] = var2.method1325(4692, var4, 1.0F, field2364[var8], var4, false);
            }
            this.field2367 = new class206(this.field2358, 6407, var4, var3, field2362);
        }
        return this.field2367;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lao;IIIIII)V")
    public class171(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2360 = arg2;
        this.field2365 = arg4;
        this.field2366 = arg1;
        this.field2359 = arg3;
        this.field2363 = arg6;
        this.field2361 = arg5;
        this.field2358 = arg0;
    }
}
