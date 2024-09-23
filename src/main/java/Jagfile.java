import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("yb")
public class Jagfile {

    @OriginalMember(owner = "yb", name = "a", descriptor = "Z")
    private boolean field836 = false;

    @OriginalMember(owner = "yb", name = "b", descriptor = "I")
    private int field837 = 69;

    @OriginalMember(owner = "yb", name = "c", descriptor = "Z")
    private boolean field838 = true;

    @OriginalMember(owner = "yb", name = "d", descriptor = "Z")
    private boolean field839 = false;

    @OriginalMember(owner = "yb", name = "e", descriptor = "I")
    private int field840 = -504;

    @OriginalMember(owner = "yb", name = "f", descriptor = "I")
    private int field841 = 281;

    @OriginalMember(owner = "yb", name = "h", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "yb", name = "m", descriptor = "Z")
    private boolean field848;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[B")
    public byte[] field842;

    @OriginalMember(owner = "yb", name = "i", descriptor = "[I")
    public int[] field844;

    @OriginalMember(owner = "yb", name = "j", descriptor = "[I")
    public int[] field845;

    @OriginalMember(owner = "yb", name = "k", descriptor = "[I")
    public int[] field846;

    @OriginalMember(owner = "yb", name = "l", descriptor = "[I")
    public int[] field847;

    @OriginalMember(owner = "yb", name = "<init>", descriptor = "([BB)V")
    public Jagfile(byte[] arg0, byte arg1) {
        if (arg1 != 49) {
            throw new NullPointerException();
        }
        this.method294(arg0, this.field836);
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "([BZ)V")
    private void method294(byte[] arg0, boolean arg1) {
        Packet var3 = new Packet(699, arg0);
        int var4 = var3.method235();
        int var5 = var3.method235();
        if (var4 == var5) {
            this.field842 = arg0;
            this.field848 = false;
        } else {
            byte[] var6 = new byte[var4];
            BZip2.method263(var6, var4, arg0, var5, 6);
            this.field842 = var6;
            var3 = new Packet(699, this.field842);
            this.field848 = true;
        }
        this.field843 = var3.method233();
        this.field844 = new int[this.field843];
        this.field845 = new int[this.field843];
        this.field846 = new int[this.field843];
        this.field847 = new int[this.field843];
        if (arg1) {
            this.field841 = 350;
        }
        int var7 = this.field843 * 10 + var3.field694;
        for (int var8 = 0; var8 < this.field843; var8++) {
            this.field844[var8] = var3.method236();
            this.field845[var8] = var3.method235();
            this.field846[var8] = var3.method235();
            this.field847[var8] = var7;
            var7 += this.field846[var8];
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method295(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field843; var6++) {
            if (this.field844[var6] == var3) {
                try {
                    if (arg1 == null) {
                        arg1 = new byte[this.field845[var6]];
                    }
                    if (this.field848) {
                        for (int var7 = 0; var7 < this.field845[var6]; var7++) {
                            arg1[var7] = this.field842[this.field847[var6] + var7];
                        }
                    } else {
                        BZip2.method263(arg1, this.field845[var6], this.field842, this.field846[var6], this.field847[var6]);
                    }
                    return arg1;
                } catch (Exception var10) {
                    CRC32 var8 = new CRC32();
                    var8.reset();
                    var8.update(arg1);
                    int var9 = (int) var8.getValue();
                    signlink.reporterror("jf-er: " + var4 + "," + this.field843 + "," + var6 + "," + this.field848 + "," + this.field845[var6] + "," + this.field846[var6] + "," + this.field847[var6] + "," + var9);
                }
            }
        }
        return null;
    }
}
