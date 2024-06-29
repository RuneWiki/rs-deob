import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class202 {

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "Ler;")
    private class92 field176;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "[Lnc;")
    public static class23[] field172 = new class23[4];

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "Lvg;")
    public static class49 field173 = new class49(8);

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "Lhga;")
    public static class158 field177 = new class158(28, 6);

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "Lpca;")
    public static class665 field178 = null;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "Lqn;")
    private class58 field168;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V", line = 6)
    public static void method195(byte arg0) {
        field173 = null;
        int var1 = -17 / ((arg0 - 67) / 45);
        field178 = null;
        field177 = null;
        field172 = null;
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)Lqn;", line = 22)
    public final class58 method196(int arg0) {
        if (arg0 != 25270) {
            method195((byte) -52);
        }
        field169++;
        if (this.field168 == null) {
            class42.field588[4] = this.field174;
            class42.field588[3] = this.field165;
            class42.field588[0] = this.field166;
            class42.field588[5] = this.field170;
            class42.field588[1] = this.field175;
            class42.field588[2] = this.field171;
            class214 var2 = this.field176.field2812;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1608(-20340, class42.field588[var5])) {
                    return null;
                }
                class258 var7 = var2.method1610(18904, class42.field588[var5]);
                int var8 = var7.field4137 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field4127 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class694.field9731[var6] = var2.method1607(var4, class42.field588[var6], -20490, false, var4, 1.0F);
            }
            this.field168 = new class58(this.field176, 6407, var4, var3, class694.field9731);
        }
        return this.field168;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)V", line = 84)
    public static final void method197(byte arg0) {
        for (class119 var1 = (class119) class675.field9520.method3465((byte) -90); var1 != null; var1 = (class119) class675.field9520.method3469(0)) {
            if (var1.field1927) {
                var1.method1069(-66);
            }
        }
        field167++;
        for (class119 var2 = (class119) class235.field3738.method3465((byte) 119); var2 != null; var2 = (class119) class235.field3738.method3469(0)) {
            if (var2.field1927) {
                var2.method1069(-73);
            }
        }
        if (arg0 > -58) {
            method195((byte) 36);
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Ler;IIIIII)V", line = 134)
    public class10(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field175 = arg2;
        this.field176 = arg0;
        this.field165 = arg4;
        this.field174 = arg5;
        this.field171 = arg3;
        this.field166 = arg1;
        this.field170 = arg6;
    }
}
