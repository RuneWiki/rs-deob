import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "Z")
    private boolean field719 = false;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field720 = -588;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "ub", name = "i", descriptor = "Z")
    private boolean field727;

    @OriginalMember(owner = "ub", name = "c", descriptor = "[B")
    public byte[] field721;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[I")
    public int[] field723;

    @OriginalMember(owner = "ub", name = "f", descriptor = "[I")
    public int[] field724;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[I")
    public int[] field725;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[I")
    public int[] field726;

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        this.method249(false, arg1);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Z[B)V")
    private void method249(boolean arg0, byte[] arg1) {
        Packet var3 = new Packet(575, arg1);
        int var4 = var3.method213();
        int var5 = var3.method213();
        if (var4 == var5) {
            this.field721 = arg1;
            this.field727 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method238(var6, var4, arg1, var5, 6);
            this.field721 = var6;
            var3 = new Packet(575, this.field721);
            this.field727 = true;
        }
        this.field722 = var3.method211();
        this.field723 = new int[this.field722];
        this.field724 = new int[this.field722];
        this.field725 = new int[this.field722];
        this.field726 = new int[this.field722];
        if (arg0) {
            return;
        }
        int var7 = this.field722 * 10 + var3.field612;
        for (int var8 = 0; var8 < this.field722; var8++) {
            this.field723[var8] = var3.method214();
            this.field724[var8] = var3.method213();
            this.field725[var8] = var3.method213();
            this.field726[var8] = var7;
            var7 += this.field725[var8];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BILjava/lang/String;)[B")
    public byte[] method250(byte[] arg0, int arg1, String arg2) {
        int var4 = 0;
        String var5 = arg2.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        if (arg1 != 3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < this.field722; var8++) {
            if (this.field723[var8] == var4) {
                if (arg0 == null) {
                    arg0 = new byte[this.field724[var8]];
                }
                if (this.field727) {
                    for (int var9 = 0; var9 < this.field724[var8]; var9++) {
                        arg0[var9] = this.field721[this.field726[var8] + var9];
                    }
                } else {
                    BZip2.method238(arg0, this.field724[var8], this.field721, this.field725[var8], this.field726[var8]);
                }
                return arg0;
            }
        }
        return null;
    }
}
