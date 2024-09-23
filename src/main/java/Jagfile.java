import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Jagfile {

    @OriginalMember(owner = "yb", name = "a", descriptor = "Z")
    private boolean field847 = false;

    @OriginalMember(owner = "yb", name = "b", descriptor = "I")
    private int field848 = 33317;

    @OriginalMember(owner = "yb", name = "c", descriptor = "Z")
    private boolean field849 = true;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "yb", name = "f", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "yb", name = "k", descriptor = "Z")
    private boolean field857;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[B")
    public byte[] field851;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[I")
    public int[] field853;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[I")
    public int[] field854;

    @OriginalMember(owner = "yb", name = "i", descriptor = "[I")
    public int[] field855;

    @OriginalMember(owner = "yb", name = "j", descriptor = "[I")
    public int[] field856;

    @OriginalMember(owner = "yb", name = "<init>", descriptor = "([BZ)V")
    public Jagfile(byte[] arg0, boolean arg1) {
        this.method298(false, arg0);
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Z[B)V")
    private void method298(boolean arg0, byte[] arg1) {
        Packet var3 = new Packet(arg1, true);
        int var4 = var3.method235();
        if (arg0) {
            this.field850 = 322;
        }
        int var5 = var3.method235();
        if (var4 == var5) {
            this.field851 = arg1;
            this.field857 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method263(var6, var4, arg1, var5, 6);
            this.field851 = var6;
            var3 = new Packet(this.field851, true);
            this.field857 = true;
        }
        this.field852 = var3.method233();
        this.field853 = new int[this.field852];
        this.field854 = new int[this.field852];
        this.field855 = new int[this.field852];
        this.field856 = new int[this.field852];
        int var7 = this.field852 * 10 + var3.field698;
        for (int var8 = 0; var8 < this.field852; var8++) {
            this.field853[var8] = var3.method236();
            this.field854[var8] = var3.method235();
            this.field855[var8] = var3.method235();
            this.field856[var8] = var7;
            var7 += this.field855[var8];
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field852; var6++) {
            if (this.field853[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field854[var6]];
                }
                if (this.field857) {
                    for (int var7 = 0; var7 < this.field854[var6]; var7++) {
                        arg1[var7] = this.field851[this.field856[var6] + var7];
                    }
                } else {
                    BZip2.method263(arg1, this.field854[var6], this.field851, this.field855[var6], this.field856[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
