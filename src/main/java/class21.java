import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class21 extends class10 {

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Lda;")
    private class44 field330;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field328 = 999999;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lnn;")
    public static class289 field331;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Ldl;")
    private class46 field329;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 3)
    public static void method141(int arg0) {
        field331 = null;
        if (arg0 != -29464) {
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Ldl;", line = 17)
    public final class46 method59(byte arg0) {
        field325++;
        if (arg0 >= -103) {
            return null;
        }
        if (this.field329 == null) {
            class100.field1926[5] = this.field322;
            class100.field1926[4] = this.field323;
            class100.field1926[0] = this.field326;
            class100.field1926[2] = this.field321;
            class100.field1926[3] = this.field324;
            class100.field1926[1] = this.field319;
            class16 var2 = this.field330.field4358;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method108(false, class100.field1926[var5])) {
                    return null;
                }
                class486 var7 = var2.method105(-128, class100.field1926[var5]);
                int var8 = var7.field7145 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field7147 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class243.field3771[var6] = var2.method106((byte) -50, false, var4, 1.0F, class100.field1926[var6], var4);
            }
            this.field329 = new class46(this.field330, 6407, var4, var3 != 0, class243.field3771);
        }
        return this.field329;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lda;IIIIII)V", line = 90)
    public class21(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field319 = arg2;
        this.field326 = arg1;
        this.field323 = arg5;
        this.field321 = arg3;
        this.field324 = arg4;
        this.field330 = arg0;
        this.field322 = arg6;
    }
}
