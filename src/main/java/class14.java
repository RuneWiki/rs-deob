import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FNOQZAYQ")
public class class14 {

    @OriginalMember(owner = "FNOQZAYQ", name = "a", descriptor = "Z")
    private boolean field674 = true;

    @OriginalMember(owner = "FNOQZAYQ", name = "b", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "FNOQZAYQ", name = "d", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "FNOQZAYQ", name = "i", descriptor = "Z")
    private boolean field682;

    @OriginalMember(owner = "FNOQZAYQ", name = "c", descriptor = "[B")
    public byte[] field676;

    @OriginalMember(owner = "FNOQZAYQ", name = "e", descriptor = "[I")
    public int[] field678;

    @OriginalMember(owner = "FNOQZAYQ", name = "f", descriptor = "[I")
    public int[] field679;

    @OriginalMember(owner = "FNOQZAYQ", name = "g", descriptor = "[I")
    public int[] field680;

    @OriginalMember(owner = "FNOQZAYQ", name = "h", descriptor = "[I")
    public int[] field681;

    @OriginalMember(owner = "FNOQZAYQ", name = "<init>", descriptor = "([BI)V")
    public class14(byte[] arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method245(arg0, (byte) 2);
    }

    @OriginalMember(owner = "FNOQZAYQ", name = "a", descriptor = "([BB)V")
    private void method245(byte[] arg0, byte arg1) {
        if (arg1 == 2) {
            boolean var3 = false;
        } else {
            this.field675 = -419;
        }
        class11 var4 = new class11(arg0, this.field674);
        int var5 = var4.method193();
        int var6 = var4.method193();
        if (var5 == var6) {
            this.field676 = arg0;
            this.field682 = false;
        } else {
            byte[] var7 = new byte[var5];
            class53.method404(var7, var5, arg0, var6, 6);
            this.field676 = var7;
            var4 = new class11(this.field676, this.field674);
            this.field682 = true;
        }
        this.field677 = var4.method191();
        this.field678 = new int[this.field677];
        this.field679 = new int[this.field677];
        this.field680 = new int[this.field677];
        this.field681 = new int[this.field677];
        int var8 = this.field677 * 10 + var4.field643;
        for (int var9 = 0; var9 < this.field677; var9++) {
            this.field678[var9] = var4.method194();
            this.field679[var9] = var4.method193();
            this.field680[var9] = var4.method193();
            this.field681[var9] = var8;
            var8 += this.field680[var9];
        }
    }

    @OriginalMember(owner = "FNOQZAYQ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method246(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field677; var6++) {
            if (this.field678[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field679[var6]];
                }
                if (this.field682) {
                    for (int var7 = 0; var7 < this.field679[var6]; var7++) {
                        arg1[var7] = this.field676[this.field681[var6] + var7];
                    }
                } else {
                    class53.method404(arg1, this.field679[var6], this.field676, this.field680[var6], this.field681[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
