import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Jagfile {

    @OriginalMember(owner = "yb", name = "a", descriptor = "B")
    private byte field865 = 117;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private boolean field866 = false;

    @OriginalMember(owner = "yb", name = "c", descriptor = "I")
    private int field867 = 307;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    private int field868 = -39972;

    @OriginalMember(owner = "yb", name = "f", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "yb", name = "k", descriptor = "Z")
    private boolean field875;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[B")
    public byte[] field869;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[I")
    public int[] field871;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[I")
    public int[] field872;

    @OriginalMember(owner = "yb", name = "i", descriptor = "[I")
    public int[] field873;

    @OriginalMember(owner = "yb", name = "j", descriptor = "[I")
    public int[] field874;

    @OriginalMember(owner = "yb", name = "<init>", descriptor = "(I[B)V")
    public Jagfile(int arg0, byte[] arg1) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        this.method307(arg1, (byte) 44);
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "([BB)V")
    private void method307(byte[] arg0, byte arg1) {
        Packet var3 = new Packet(arg0, false);
        int var4 = var3.method242();
        if (arg1 != 44) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = var3.method242();
        if (var4 == var6) {
            this.field869 = arg0;
            this.field875 = false;
        } else {
            byte[] var7 = new byte[var4];
            BZip2.method270(var7, var4, arg0, var6, 6);
            this.field869 = var7;
            var3 = new Packet(this.field869, false);
            this.field875 = true;
        }
        this.field870 = var3.method240();
        this.field871 = new int[this.field870];
        this.field872 = new int[this.field870];
        this.field873 = new int[this.field870];
        this.field874 = new int[this.field870];
        int var8 = this.field870 * 10 + var3.field713;
        for (int var9 = 0; var9 < this.field870; var9++) {
            this.field871[var9] = var3.method243();
            this.field872[var9] = var3.method242();
            this.field873[var9] = var3.method242();
            this.field874[var9] = var8;
            var8 += this.field873[var9];
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method308(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field870; var6++) {
            if (this.field871[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field872[var6]];
                }
                if (this.field875) {
                    for (int var7 = 0; var7 < this.field872[var6]; var7++) {
                        arg1[var7] = this.field869[this.field874[var6] + var7];
                    }
                } else {
                    BZip2.method270(arg1, this.field872[var6], this.field869, this.field873[var6], this.field874[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
