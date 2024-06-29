import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IEMHZJLX")
public class class23 {

    @OriginalMember(owner = "client!IEMHZJLX", name = "b", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!IEMHZJLX", name = "g", descriptor = "Z")
    private boolean field802;

    @OriginalMember(owner = "client!IEMHZJLX", name = "a", descriptor = "[B")
    public byte[] field796;

    @OriginalMember(owner = "client!IEMHZJLX", name = "c", descriptor = "[I")
    public int[] field798;

    @OriginalMember(owner = "client!IEMHZJLX", name = "d", descriptor = "[I")
    public int[] field799;

    @OriginalMember(owner = "client!IEMHZJLX", name = "e", descriptor = "[I")
    public int[] field800;

    @OriginalMember(owner = "client!IEMHZJLX", name = "f", descriptor = "[I")
    public int[] field801;

    @OriginalMember(owner = "client!IEMHZJLX", name = "<init>", descriptor = "(B[B)V")
    public class23(byte arg0, byte[] arg1) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        this.method241(true, arg1);
    }

    @OriginalMember(owner = "client!IEMHZJLX", name = "a", descriptor = "(Z[B)V")
    private void method241(boolean arg0, byte[] arg1) {
        if (!arg0) {
            return;
        }
        class38 var3 = new class38(0, arg1);
        int var4 = var3.method361();
        int var5 = var3.method361();
        if (var4 == var5) {
            this.field796 = arg1;
            this.field802 = false;
        } else {
            byte[] var6 = new byte[var4];
            class69.method590(var6, var4, arg1, var5, 6);
            this.field796 = var6;
            var3 = new class38(0, this.field796);
            this.field802 = true;
        }
        this.field797 = var3.method359();
        this.field798 = new int[this.field797];
        this.field799 = new int[this.field797];
        this.field800 = new int[this.field797];
        this.field801 = new int[this.field797];
        int var7 = this.field797 * 10 + var3.field1161;
        for (int var8 = 0; var8 < this.field797; var8++) {
            this.field798[var8] = var3.method362();
            this.field799[var8] = var3.method361();
            this.field800[var8] = var3.method361();
            this.field801[var8] = var7;
            var7 += this.field800[var8];
        }
    }

    @OriginalMember(owner = "client!IEMHZJLX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method242(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field797; var6++) {
            if (this.field798[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field799[var6]];
                }
                if (this.field802) {
                    for (int var7 = 0; var7 < this.field799[var6]; var7++) {
                        arg1[var7] = this.field796[this.field801[var6] + var7];
                    }
                } else {
                    class69.method590(arg1, this.field799[var6], this.field796, this.field800[var6], this.field801[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
