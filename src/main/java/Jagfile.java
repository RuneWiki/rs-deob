import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("xb")
public class Jagfile {

    @OriginalMember(owner = "xb", name = "a", descriptor = "I")
    private int field868 = -195;

    @OriginalMember(owner = "xb", name = "b", descriptor = "Z")
    private boolean field869 = true;

    @OriginalMember(owner = "xb", name = "c", descriptor = "I")
    private int field870 = 722;

    @OriginalMember(owner = "xb", name = "e", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "xb", name = "j", descriptor = "Z")
    private boolean field877;

    @OriginalMember(owner = "xb", name = "d", descriptor = "[B")
    public byte[] field871;

    @OriginalMember(owner = "xb", name = "f", descriptor = "[I")
    public int[] field873;

    @OriginalMember(owner = "xb", name = "g", descriptor = "[I")
    public int[] field874;

    @OriginalMember(owner = "xb", name = "h", descriptor = "[I")
    public int[] field875;

    @OriginalMember(owner = "xb", name = "i", descriptor = "[I")
    public int[] field876;

    @OriginalMember(owner = "xb", name = "<init>", descriptor = "(Z[B)V")
    public Jagfile(boolean arg0, byte[] arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method298((byte) -109, arg1);
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(B[B)V")
    private void method298(byte arg0, byte[] arg1) {
        Packet var3 = new Packet(arg1, (byte) -93);
        if (arg0 != -109) {
            return;
        }
        int var4 = var3.method233();
        int var5 = var3.method233();
        if (var4 == var5) {
            this.field871 = arg1;
            this.field877 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method261(var6, var4, arg1, var5, 6);
            this.field871 = var6;
            var3 = new Packet(this.field871, (byte) -93);
            this.field877 = true;
        }
        this.field872 = var3.method231();
        this.field873 = new int[this.field872];
        this.field874 = new int[this.field872];
        this.field875 = new int[this.field872];
        this.field876 = new int[this.field872];
        int var7 = this.field872 * 10 + var3.field713;
        for (int var8 = 0; var8 < this.field872; var8++) {
            this.field873[var8] = var3.method234();
            this.field874[var8] = var3.method233();
            this.field875[var8] = var3.method233();
            this.field876[var8] = var7;
            var7 += this.field875[var8];
        }
    }

    @OriginalMember(owner = "xb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method299(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field872; var6++) {
            if (this.field873[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field874[var6]];
                }
                if (this.field877) {
                    for (int var7 = 0; var7 < this.field874[var6]; var7++) {
                        arg1[var7] = this.field871[this.field876[var6] + var7];
                    }
                } else {
                    BZip2.method261(arg1, this.field874[var6], this.field871, this.field875[var6], this.field876[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
