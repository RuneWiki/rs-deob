import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class15 {

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Z")
    private boolean field151;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "[B")
    public byte[] field145;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "[I")
    public int[] field147;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "[I")
    public int[] field148;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "[I")
    public int[] field149;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "[I")
    public int[] field150;

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "([B)V")
    public class15(byte[] arg0) {
        this.method61(arg0);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "([B)V")
    private void method61(byte[] arg0) {
        class10 var2 = new class10(arg0);
        int var3 = var2.method49();
        int var4 = var2.method49();
        if (var3 == var4) {
            this.field145 = arg0;
            this.field151 = false;
        } else {
            byte[] var5 = new byte[var3];
            class13.method59(var5, var3, arg0, var4, 6);
            this.field145 = var5;
            var2 = new class10(this.field145);
            this.field151 = true;
        }
        this.field146 = var2.method47();
        this.field147 = new int[this.field146];
        this.field148 = new int[this.field146];
        this.field149 = new int[this.field146];
        this.field150 = new int[this.field146];
        int var6 = this.field146 * 10 + var2.field77;
        for (int var7 = 0; var7 < this.field146; var7++) {
            this.field147[var7] = var2.method44();
            this.field148[var7] = var2.method49();
            this.field149[var7] = var2.method49();
            this.field150[var7] = var6;
            var6 += this.field149[var7];
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method62(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field146; var6++) {
            if (this.field147[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field148[var6]];
                }
                if (this.field151) {
                    for (int var7 = 0; var7 < this.field148[var6]; var7++) {
                        arg1[var7] = this.field145[this.field150[var6] + var7];
                    }
                } else {
                    class13.method59(arg1, this.field148[var6], this.field145, this.field149[var6], this.field150[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
