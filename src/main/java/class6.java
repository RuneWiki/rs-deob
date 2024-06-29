import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class6 {

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public int field77;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
    public int[] field74;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "[I")
    public int[] field81;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "F")
    public static float field78;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "F")
    public static float field79;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[S")
    public static short[] field75;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V")
    public static final void method28(int arg0, int arg1, int arg2) {
        field73++;
        int var3 = -86 % ((-arg2 - 39) / 41);
        int var4 = class447.field6643.method174(class23.field267.method1265(class345.field5141, -71), (byte) -108);
        for (class376 var5 = (class376) class154.field2370.method295((byte) -65); var5 != null; var5 = (class376) class154.field2370.method296(true)) {
            int var9 = class92.method788(var5, -98);
            if (var9 > var4) {
                var4 = var9;
            }
        }
        var4 += 8;
        int var6 = class540.field7909 * 16 + 21;
        int var7 = arg0 - var4 / 2;
        if ((var4 + var7) > class169.field2570) {
            var7 = class169.field2570 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if ((var6 + arg1) > class360.field5313) {
            var8 = class360.field5313 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        class404.field5975 = var7;
        class256.field4112 = true;
        class162.field2451 = class540.field7909 * 16 + (class86.field1411 ? 26 : 22);
        class354.field5246 = var8;
        class304.field4657 = var4;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static void method29(byte arg0) {
        field75 = null;
        if (arg0 != -61) {
            field76 = 4;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
    public class6(int arg0) {
        this.field77 = arg0;
        this.field74 = new int[this.field77];
        this.field81 = new int[this.field77];
    }
}
