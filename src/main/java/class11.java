import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ESUFCMYV")
public class class11 {

    @OriginalMember(owner = "client!ESUFCMYV", name = "a", descriptor = "Z")
    private boolean field666 = false;

    @OriginalMember(owner = "client!ESUFCMYV", name = "c", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!ESUFCMYV", name = "h", descriptor = "Z")
    private boolean field673;

    @OriginalMember(owner = "client!ESUFCMYV", name = "b", descriptor = "[B")
    public byte[] field667;

    @OriginalMember(owner = "client!ESUFCMYV", name = "d", descriptor = "[I")
    public int[] field669;

    @OriginalMember(owner = "client!ESUFCMYV", name = "e", descriptor = "[I")
    public int[] field670;

    @OriginalMember(owner = "client!ESUFCMYV", name = "f", descriptor = "[I")
    public int[] field671;

    @OriginalMember(owner = "client!ESUFCMYV", name = "g", descriptor = "[I")
    public int[] field672;

    @OriginalMember(owner = "client!ESUFCMYV", name = "<init>", descriptor = "(B[B)V")
    public class11(byte arg0, byte[] arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.method204(0, arg1);
    }

    @OriginalMember(owner = "client!ESUFCMYV", name = "a", descriptor = "(I[B)V")
    private void method204(int arg0, byte[] arg1) {
        class53 var3 = new class53(arg1, (byte) -17);
        int var4 = var3.method459();
        int var5 = var3.method459();
        if (var4 == var5) {
            this.field667 = arg1;
            this.field673 = false;
        } else {
            byte[] var6 = new byte[var4];
            class44.method355(var6, var4, arg1, var5, 6);
            this.field667 = var6;
            var3 = new class53(this.field667, (byte) -17);
            this.field673 = true;
        }
        this.field668 = var3.method457();
        this.field669 = new int[this.field668];
        this.field670 = new int[this.field668];
        this.field671 = new int[this.field668];
        this.field672 = new int[this.field668];
        if (arg0 < 0 || arg0 > 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = this.field668 * 10 + var3.field1539;
        for (int var9 = 0; var9 < this.field668; var9++) {
            this.field669[var9] = var3.method460();
            this.field670[var9] = var3.method459();
            this.field671[var9] = var3.method459();
            this.field672[var9] = var8;
            var8 += this.field671[var9];
        }
    }

    @OriginalMember(owner = "client!ESUFCMYV", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method205(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field668; var6++) {
            if (this.field669[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field670[var6]];
                }
                if (this.field673) {
                    for (int var7 = 0; var7 < this.field670[var6]; var7++) {
                        arg1[var7] = this.field667[this.field672[var6] + var7];
                    }
                } else {
                    class44.method355(arg1, this.field670[var6], this.field667, this.field671[var6], this.field672[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
