import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class91 extends class271 {

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Lic;")
    private class246 field1133;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "[[I")
    private static int[][] field1138 = new int[6][];

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "[I")
    private static int[] field1140 = new int[6];

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "Lnb;")
    private class359 field1137;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)Lnb;")
    public final class359 method456(int arg0) {
        if (arg0 >= -103) {
            return (class359) null;
        }
        if (this.field1137 == null) {
            field1140[4] = this.field1134;
            field1140[0] = this.field1132;
            field1140[3] = this.field1136;
            field1140[2] = this.field1139;
            class394 var2 = this.field1133.field4073;
            field1140[1] = this.field1135;
            field1140[5] = this.field1131;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method575(field1140[var5], (byte) 123)) {
                    return null;
                }
                class189 var6 = var2.method577(field1140[var5], -117);
                int var7 = var6.field2592 ? 64 : 128;
                if (var6.field2578 > 0) {
                    var3 = true;
                }
                if (var4 < var7) {
                    var4 = var7;
                }
            }
            for (int var8 = 0; var8 < 6; var8++) {
                field1138[var8] = var2.method578(false, field1140[var8], var4, 1.0F, -126, var4);
            }
            this.field1137 = new class359(this.field1133, 6407, var4, var3, field1138);
        }
        return this.field1137;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lic;IIIIII)V")
    public class91(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1134 = arg5;
        this.field1139 = arg3;
        this.field1132 = arg1;
        this.field1133 = arg0;
        this.field1131 = arg6;
        this.field1136 = arg4;
        this.field1135 = arg2;
    }
}
