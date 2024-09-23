import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MJLXHQTQ")
public class class44 {

    @OriginalMember(owner = "MJLXHQTQ", name = "a", descriptor = "I")
    private int field1173 = -42286;

    @OriginalMember(owner = "MJLXHQTQ", name = "b", descriptor = "Z")
    private boolean field1174 = true;

    @OriginalMember(owner = "MJLXHQTQ", name = "c", descriptor = "Z")
    private boolean field1175 = false;

    @OriginalMember(owner = "MJLXHQTQ", name = "e", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "MJLXHQTQ", name = "j", descriptor = "Z")
    private boolean field1182;

    @OriginalMember(owner = "MJLXHQTQ", name = "d", descriptor = "[B")
    public byte[] field1176;

    @OriginalMember(owner = "MJLXHQTQ", name = "f", descriptor = "[I")
    public int[] field1178;

    @OriginalMember(owner = "MJLXHQTQ", name = "g", descriptor = "[I")
    public int[] field1179;

    @OriginalMember(owner = "MJLXHQTQ", name = "h", descriptor = "[I")
    public int[] field1180;

    @OriginalMember(owner = "MJLXHQTQ", name = "i", descriptor = "[I")
    public int[] field1181;

    @OriginalMember(owner = "MJLXHQTQ", name = "<init>", descriptor = "(I[B)V")
    public class44(int arg0, byte[] arg1) {
        this.method316(true, arg1);
        if (arg0 != 20305) {
            this.field1173 = 72;
        }
    }

    @OriginalMember(owner = "MJLXHQTQ", name = "a", descriptor = "(Z[B)V")
    private void method316(boolean arg0, byte[] arg1) {
        class69 var3 = new class69(arg1, -82);
        int var4 = var3.method469();
        int var5 = var3.method469();
        if (var4 == var5) {
            this.field1176 = arg1;
            this.field1182 = false;
        } else {
            byte[] var6 = new byte[var4];
            class71.method553(var6, var4, arg1, var5, 6);
            this.field1176 = var6;
            var3 = new class69(this.field1176, -82);
            this.field1182 = true;
        }
        this.field1177 = var3.method467();
        if (!arg0) {
            this.field1174 = !this.field1174;
        }
        this.field1178 = new int[this.field1177];
        this.field1179 = new int[this.field1177];
        this.field1180 = new int[this.field1177];
        this.field1181 = new int[this.field1177];
        int var7 = this.field1177 * 10 + var3.field1652;
        for (int var8 = 0; var8 < this.field1177; var8++) {
            this.field1178[var8] = var3.method470();
            this.field1179[var8] = var3.method469();
            this.field1180[var8] = var3.method469();
            this.field1181[var8] = var7;
            var7 += this.field1180[var8];
        }
    }

    @OriginalMember(owner = "MJLXHQTQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method317(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1177; var6++) {
            if (this.field1178[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1179[var6]];
                }
                if (this.field1182) {
                    for (int var7 = 0; var7 < this.field1179[var6]; var7++) {
                        arg1[var7] = this.field1176[this.field1181[var6] + var7];
                    }
                } else {
                    class71.method553(arg1, this.field1179[var6], this.field1176, this.field1180[var6], this.field1181[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
