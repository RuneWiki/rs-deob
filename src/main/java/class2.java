import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AKPFVPPG")
public class class2 {

    @OriginalMember(owner = "client!AKPFVPPG", name = "a", descriptor = "Z")
    private boolean field7 = true;

    @OriginalMember(owner = "client!AKPFVPPG", name = "b", descriptor = "Z")
    private boolean field8 = true;

    @OriginalMember(owner = "client!AKPFVPPG", name = "d", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!AKPFVPPG", name = "i", descriptor = "Z")
    private boolean field15;

    @OriginalMember(owner = "client!AKPFVPPG", name = "c", descriptor = "[B")
    public byte[] field9;

    @OriginalMember(owner = "client!AKPFVPPG", name = "e", descriptor = "[I")
    public int[] field11;

    @OriginalMember(owner = "client!AKPFVPPG", name = "f", descriptor = "[I")
    public int[] field12;

    @OriginalMember(owner = "client!AKPFVPPG", name = "g", descriptor = "[I")
    public int[] field13;

    @OriginalMember(owner = "client!AKPFVPPG", name = "h", descriptor = "[I")
    public int[] field14;

    @OriginalMember(owner = "client!AKPFVPPG", name = "<init>", descriptor = "(Z[B)V")
    public class2(boolean arg0, byte[] arg1) {
        this.method6(arg1, true);
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!AKPFVPPG", name = "a", descriptor = "([BZ)V")
    private void method6(byte[] arg0, boolean arg1) {
        class13 var3 = new class13(arg0, (byte) 3);
        if (!arg1) {
            return;
        }
        int var4 = var3.method217();
        int var5 = var3.method217();
        if (var4 == var5) {
            this.field9 = arg0;
            this.field15 = false;
        } else {
            byte[] var6 = new byte[var4];
            class58.method472(var6, var4, arg0, var5, 6);
            this.field9 = var6;
            var3 = new class13(this.field9, (byte) 3);
            this.field15 = true;
        }
        this.field10 = var3.method215();
        this.field11 = new int[this.field10];
        this.field12 = new int[this.field10];
        this.field13 = new int[this.field10];
        this.field14 = new int[this.field10];
        int var7 = this.field10 * 10 + var3.field643;
        for (int var8 = 0; var8 < this.field10; var8++) {
            this.field11[var8] = var3.method218();
            this.field12[var8] = var3.method217();
            this.field13[var8] = var3.method217();
            this.field14[var8] = var7;
            var7 += this.field13[var8];
        }
    }

    @OriginalMember(owner = "client!AKPFVPPG", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method7(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field10; var6++) {
            if (this.field11[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field12[var6]];
                }
                if (this.field15) {
                    for (int var7 = 0; var7 < this.field12[var6]; var7++) {
                        arg1[var7] = this.field9[this.field14[var6] + var7];
                    }
                } else {
                    class58.method472(arg1, this.field12[var6], this.field9, this.field13[var6], this.field14[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
