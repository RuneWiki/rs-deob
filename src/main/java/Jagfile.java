import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "Z")
    private boolean field736 = true;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field737 = 742;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private int field738 = 8;

    @OriginalMember(owner = "ub", name = "e", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "ub", name = "j", descriptor = "Z")
    private boolean field745;

    @OriginalMember(owner = "ub", name = "d", descriptor = "[B")
    public byte[] field739;

    @OriginalMember(owner = "ub", name = "f", descriptor = "[I")
    public int[] field741;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[I")
    public int[] field742;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[I")
    public int[] field743;

    @OriginalMember(owner = "ub", name = "i", descriptor = "[I")
    public int[] field744;

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "(Z[B)V")
    public Jagfile(boolean arg0, byte[] arg1) {
        this.method249(arg1, -641);
        if (!arg0) {
            this.field736 = !this.field736;
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BI)V")
    private void method249(byte[] arg0, int arg1) {
        Packet var3 = new Packet(arg0, 0);
        int var4 = var3.method213();
        int var5 = var3.method213();
        if (var4 == var5) {
            this.field739 = arg0;
            this.field745 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method238(var6, var4, arg0, var5, 6);
            this.field739 = var6;
            var3 = new Packet(this.field739, 0);
            this.field745 = true;
        }
        this.field740 = var3.method211();
        this.field741 = new int[this.field740];
        this.field742 = new int[this.field740];
        this.field743 = new int[this.field740];
        this.field744 = new int[this.field740];
        if (arg1 >= 0) {
            return;
        }
        int var7 = this.field740 * 10 + var3.field623;
        for (int var8 = 0; var8 < this.field740; var8++) {
            this.field741[var8] = var3.method214();
            this.field742[var8] = var3.method213();
            this.field743[var8] = var3.method213();
            this.field744[var8] = var7;
            var7 += this.field743[var8];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BLjava/lang/String;[B)[B")
    public byte[] method250(byte arg0, String arg1, byte[] arg2) {
        int var4 = 0;
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        String var5 = arg1.toUpperCase();
        for (int var6 = 0; var6 < var5.length(); var6++) {
            var4 = var4 * 61 + var5.charAt(var6) - 32;
        }
        for (int var7 = 0; var7 < this.field740; var7++) {
            if (this.field741[var7] == var4) {
                if (arg2 == null) {
                    arg2 = new byte[this.field742[var7]];
                }
                if (this.field745) {
                    for (int var8 = 0; var8 < this.field742[var7]; var8++) {
                        arg2[var8] = this.field739[this.field744[var7] + var8];
                    }
                } else {
                    BZip2.method238(arg2, this.field742[var7], this.field739, this.field743[var7], this.field744[var7]);
                }
                return arg2;
            }
        }
        return null;
    }
}
