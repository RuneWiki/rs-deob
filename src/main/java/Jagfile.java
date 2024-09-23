import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field864 = 6;

    @OriginalMember(owner = "xb", name = "c", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "xb", name = "h", descriptor = "Z")
    private boolean field871;

    @OriginalMember(owner = "xb", name = "b", descriptor = "[B")
    public byte[] field865;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "xb", name = "e", descriptor = "[I")
    public int[] field868;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field869;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field870;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "(Z[B)V")
    public Jagfile(boolean arg0, byte[] arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        this.method298(8, arg1);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(I[B)V")
    private void method298(int arg0, byte[] arg1) {
        if (arg0 != 8) {
            this.field864 = 203;
        }
        Packet var3 = new Packet(arg1, 58);
        int var4 = var3.method233();
        int var5 = var3.method233();
        if (var4 == var5) {
            this.field865 = arg1;
            this.field871 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method261(var6, var4, arg1, var5, 6);
            this.field865 = var6;
            var3 = new Packet(this.field865, 58);
            this.field871 = true;
        }
        this.field866 = var3.method231();
        this.field867 = new int[this.field866];
        this.field868 = new int[this.field866];
        this.field869 = new int[this.field866];
        this.field870 = new int[this.field866];
        int var7 = this.field866 * 10 + var3.field711;
        for (int var8 = 0; var8 < this.field866; var8++) {
            this.field867[var8] = var3.method234();
            this.field868[var8] = var3.method233();
            this.field869[var8] = var3.method233();
            this.field870[var8] = var7;
            var7 += this.field869[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field866; var6++) {
            if (this.field867[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field868[var6]];
                }
                if (this.field871) {
                    for (int var7 = 0; var7 < this.field868[var6]; var7++) {
                        arg1[var7] = this.field865[this.field870[var6] + var7];
                    }
                } else {
                    BZip2.method261(arg1, this.field868[var6], this.field865, this.field869[var6], this.field870[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
