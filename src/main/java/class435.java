import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class435 extends class24 {

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "I")
    private int field6427;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    private int field6418;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    private int field6419;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    private int field6428;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    private int field6426;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "Lvd;")
    private class258 field6420;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "Luv;")
    public static class2 field6424 = new class2(11, -2);

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "Lui;")
    private class487 field6425;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "[[[Lrr;")
    public static class306[][][] field6422;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)Lui;", line = 8)
    public final class487 method244(int arg0) {
        field6421++;
        if (arg0 != 0) {
            this.field6418 = 30;
        }
        if (this.field6425 == null) {
            class386.field5805[3] = this.field6428;
            class386.field5805[1] = this.field6427;
            class386.field5805[5] = this.field6419;
            class243 var2 = this.field6420.field101;
            class386.field5805[0] = this.field6418;
            class386.field5805[2] = this.field6426;
            class386.field5805[4] = this.field6423;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1482((byte) 122, class386.field5805[var5])) {
                    return null;
                }
                class161 var7 = var2.method1480(class386.field5805[var5], 14270);
                int var8 = var7.field2421 ? 64 : 128;
                if (var7.field2418 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class258.field3705[var6] = var2.method1484(96, false, var4, 1.0F, class386.field5805[var6], var4);
            }
            this.field6425 = new class487(this.field6420, 6407, var4, var3, class258.field3705);
        }
        return this.field6425;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lvd;IIIIII)V", line = 75)
    public class435(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6427 = arg2;
        this.field6418 = arg1;
        this.field6423 = arg5;
        this.field6419 = arg6;
        this.field6428 = arg4;
        this.field6426 = arg3;
        this.field6420 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V", line = 90)
    public static void method2562(int arg0) {
        field6422 = null;
        field6424 = null;
        if (arg0 != -10894) {
            field6424 = null;
        }
    }
}
