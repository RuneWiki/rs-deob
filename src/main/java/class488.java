import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class488 extends class100 {

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "Lht;")
    private class410 field7133;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    private int field7131;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    private int field7130;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    private int field7124;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    private int field7126;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    private int field7122;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    private int field7127;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "Luf;")
    public static class310 field7132 = new class310(106, 1);

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Loo;")
    public static class441 field7125;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "Lil;")
    private class7 field7123;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Lil;", line = 11)
    public final class7 method665(int arg0) {
        field7128++;
        if (arg0 != 26263) {
            return null;
        }
        if (this.field7123 == null) {
            class446.field6459[4] = this.field7126;
            class126 var2 = this.field7133.field2312;
            class446.field6459[5] = this.field7131;
            class446.field6459[1] = this.field7122;
            class446.field6459[2] = this.field7127;
            class446.field6459[0] = this.field7124;
            class446.field6459[3] = this.field7130;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method831(class446.field6459[var5], -100)) {
                    return null;
                }
                class501 var7 = var2.method830(class446.field6459[var5], (byte) 71);
                int var8 = var7.field7380 ? 64 : 128;
                if (var7.field7376 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class105.field1438[var6] = var2.method833(false, var4, 1.0F, -12422, var4, class446.field6459[var6]);
            }
            this.field7123 = new class7(this.field7133, 6407, var4, var3, class105.field1438);
        }
        return this.field7123;
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)V", line = 72)
    public static void method2867(int arg0) {
        field7132 = null;
        int var1 = 51 % ((arg0 - 76) / 46);
        field7125 = null;
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)Z", line = 89)
    public static final boolean method2868(int arg0) {
        if (arg0 != 0) {
            field7132 = null;
        }
        field7129++;
        return class528.field7773 != class175.field2498 || class370.field5196 >= 2;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lht;IIIIII)V", line = 99)
    public class488(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7133 = arg0;
        this.field7131 = arg6;
        this.field7130 = arg4;
        this.field7124 = arg1;
        this.field7126 = arg5;
        this.field7122 = arg2;
        this.field7127 = arg3;
    }
}
