import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AWEEREDT")
public class class2 {

    @OriginalMember(owner = "client!AWEEREDT", name = "a", descriptor = "I")
    private int field8 = 1;

    @OriginalMember(owner = "client!AWEEREDT", name = "b", descriptor = "I")
    private int field9 = 7;

    @OriginalMember(owner = "client!AWEEREDT", name = "d", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!AWEEREDT", name = "i", descriptor = "Z")
    private boolean field16;

    @OriginalMember(owner = "client!AWEEREDT", name = "c", descriptor = "[B")
    public byte[] field10;

    @OriginalMember(owner = "client!AWEEREDT", name = "e", descriptor = "[I")
    public int[] field12;

    @OriginalMember(owner = "client!AWEEREDT", name = "f", descriptor = "[I")
    public int[] field13;

    @OriginalMember(owner = "client!AWEEREDT", name = "g", descriptor = "[I")
    public int[] field14;

    @OriginalMember(owner = "client!AWEEREDT", name = "h", descriptor = "[I")
    public int[] field15;

    @OriginalMember(owner = "client!AWEEREDT", name = "<init>", descriptor = "(I[B)V")
    public class2(int arg0, byte[] arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.method13((byte) 6, arg1);
    }

    @OriginalMember(owner = "client!AWEEREDT", name = "a", descriptor = "(B[B)V")
    private void method13(byte arg0, byte[] arg1) {
        class25 var3 = new class25(arg1, 713);
        int var4 = var3.method249();
        int var5 = var3.method249();
        if (var4 == var5) {
            this.field10 = arg1;
            this.field16 = false;
        } else {
            byte[] var6 = new byte[var4];
            class41.method370(var6, var4, arg1, var5, 6);
            this.field10 = var6;
            var3 = new class25(this.field10, 713);
            this.field16 = true;
        }
        this.field11 = var3.method247();
        this.field12 = new int[this.field11];
        this.field13 = new int[this.field11];
        this.field14 = new int[this.field11];
        this.field15 = new int[this.field11];
        int var7 = this.field11 * 10 + var3.field837;
        for (int var8 = 0; var8 < this.field11; var8++) {
            this.field12[var8] = var3.method250();
            this.field13[var8] = var3.method249();
            this.field14[var8] = var3.method249();
            this.field15[var8] = var7;
            var7 += this.field14[var8];
        }
        if (arg0 != 6) {
            this.field8 = -202;
        }
    }

    @OriginalMember(owner = "client!AWEEREDT", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method14(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field11; var6++) {
            if (this.field12[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field13[var6]];
                }
                if (this.field16) {
                    for (int var7 = 0; var7 < this.field13[var6]; var7++) {
                        arg1[var7] = this.field10[this.field15[var6] + var7];
                    }
                } else {
                    class41.method370(arg1, this.field13[var6], this.field10, this.field14[var6], this.field15[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
