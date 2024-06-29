import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HBJEXSJX")
public class class24 {

    @OriginalMember(owner = "client!HBJEXSJX", name = "a", descriptor = "I")
    private int field947 = -28345;

    @OriginalMember(owner = "client!HBJEXSJX", name = "b", descriptor = "Z")
    private boolean field948 = true;

    @OriginalMember(owner = "client!HBJEXSJX", name = "d", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!HBJEXSJX", name = "i", descriptor = "Z")
    private boolean field955;

    @OriginalMember(owner = "client!HBJEXSJX", name = "c", descriptor = "[B")
    public byte[] field949;

    @OriginalMember(owner = "client!HBJEXSJX", name = "e", descriptor = "[I")
    public int[] field951;

    @OriginalMember(owner = "client!HBJEXSJX", name = "f", descriptor = "[I")
    public int[] field952;

    @OriginalMember(owner = "client!HBJEXSJX", name = "g", descriptor = "[I")
    public int[] field953;

    @OriginalMember(owner = "client!HBJEXSJX", name = "h", descriptor = "[I")
    public int[] field954;

    @OriginalMember(owner = "client!HBJEXSJX", name = "<init>", descriptor = "(Z[B)V")
    public class24(boolean arg0, byte[] arg1) {
        this.method347(-412, arg1);
        if (!arg0) {
            this.field947 = -427;
        }
    }

    @OriginalMember(owner = "client!HBJEXSJX", name = "a", descriptor = "(I[B)V")
    private void method347(int arg0, byte[] arg1) {
        class18 var3 = new class18(arg1, 0);
        if (arg0 >= 0) {
            this.field947 = -151;
        }
        int var4 = var3.method243();
        int var5 = var3.method243();
        if (var4 == var5) {
            this.field949 = arg1;
            this.field955 = false;
        } else {
            byte[] var6 = new byte[var4];
            class44.method440(var6, var4, arg1, var5, 6);
            this.field949 = var6;
            var3 = new class18(this.field949, 0);
            this.field955 = true;
        }
        this.field950 = var3.method241();
        this.field951 = new int[this.field950];
        this.field952 = new int[this.field950];
        this.field953 = new int[this.field950];
        this.field954 = new int[this.field950];
        int var7 = this.field950 * 10 + var3.field794;
        for (int var8 = 0; var8 < this.field950; var8++) {
            this.field951[var8] = var3.method244();
            this.field952[var8] = var3.method243();
            this.field953[var8] = var3.method243();
            this.field954[var8] = var7;
            var7 += this.field953[var8];
        }
    }

    @OriginalMember(owner = "client!HBJEXSJX", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method348(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field950; var6++) {
            if (this.field951[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field952[var6]];
                }
                if (this.field955) {
                    for (int var7 = 0; var7 < this.field952[var6]; var7++) {
                        arg1[var7] = this.field949[this.field954[var6] + var7];
                    }
                } else {
                    class44.method440(arg1, this.field952[var6], this.field949, this.field953[var6], this.field954[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
