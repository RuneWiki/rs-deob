import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class Jagfile {

    @OriginalMember(owner = "ub", name = "a", descriptor = "Z")
    private boolean field715 = true;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "ub", name = "d", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "ub", name = "c", descriptor = "[B")
    public byte[] field717;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[I")
    public int[] field719;

    @OriginalMember(owner = "ub", name = "f", descriptor = "[I")
    public int[] field720;

    @OriginalMember(owner = "ub", name = "g", descriptor = "[I")
    public int[] field721;

    @OriginalMember(owner = "ub", name = "h", descriptor = "[I")
    public int[] field722;

    @OriginalMember(owner = "ub", name = "<init>", descriptor = "([BZ)V")
    public Jagfile(byte[] arg0, boolean arg1) {
        this.method241(arg0, (byte) 2);
        if (arg1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "([BB)V")
    private void method241(byte[] arg0, byte arg1) {
        Packet var3 = new Packet(arg0, 4);
        int var4 = var3.method205();
        if (arg1 == 2) {
            boolean var5 = false;
        } else {
            this.field716 = -215;
        }
        int var6 = var3.method205();
        if (var4 == var6) {
            this.field717 = arg0;
        } else {
            byte[] var7 = new byte[var4];
            BZip2.method230(var7, var4, arg0, var6, 6);
            this.field717 = var7;
            var3 = new Packet(this.field717, 4);
        }
        this.field718 = var3.method203();
        this.field719 = new int[this.field718];
        this.field720 = new int[this.field718];
        this.field721 = new int[this.field718];
        this.field722 = new int[this.field718];
        int var8 = this.field718 * 10 + var3.field606;
        for (int var9 = 0; var9 < this.field718; var9++) {
            this.field719[var9] = var3.method206();
            this.field720[var9] = var3.method205();
            this.field721[var9] = var3.method205();
            this.field722[var9] = var8;
            var8 += this.field721[var9];
        }
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(B[BLjava/lang/String;)[B")
    public byte[] method242(byte arg0, byte[] arg1, String arg2) {
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = 0;
        String var7 = arg2.toUpperCase();
        for (int var8 = 0; var8 < var7.length(); var8++) {
            var6 = var6 * 61 + var7.charAt(var8) - 32;
        }
        for (int var9 = 0; var9 < this.field718; var9++) {
            if (this.field719[var9] == var6) {
                if (arg1 == null) {
                    arg1 = new byte[this.field720[var9]];
                }
                if (this.field721[var9] == this.field720[var9]) {
                    for (int var10 = 0; var10 < this.field720[var9]; var10++) {
                        arg1[var10] = this.field717[this.field722[var9] + var10];
                    }
                } else {
                    BZip2.method230(arg1, this.field720[var9], this.field717, this.field721[var9], this.field722[var9]);
                }
                return arg1;
            }
        }
        return null;
    }
}
