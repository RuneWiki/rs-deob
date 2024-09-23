import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EAXVDNXA")
public class class12 {

    @OriginalMember(owner = "EAXVDNXA", name = "b", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "EAXVDNXA", name = "g", descriptor = "Z")
    private boolean field711;

    @OriginalMember(owner = "EAXVDNXA", name = "a", descriptor = "[B")
    public byte[] field705;

    @OriginalMember(owner = "EAXVDNXA", name = "c", descriptor = "[I")
    public int[] field707;

    @OriginalMember(owner = "EAXVDNXA", name = "d", descriptor = "[I")
    public int[] field708;

    @OriginalMember(owner = "EAXVDNXA", name = "e", descriptor = "[I")
    public int[] field709;

    @OriginalMember(owner = "EAXVDNXA", name = "f", descriptor = "[I")
    public int[] field710;

    @OriginalMember(owner = "EAXVDNXA", name = "<init>", descriptor = "([BI)V")
    public class12(byte[] arg0, int arg1) {
        this.method254(-686, arg0);
        if (arg1 != -5097) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "EAXVDNXA", name = "a", descriptor = "(I[B)V")
    private void method254(int arg0, byte[] arg1) {
        class5 var3 = new class5(2, arg1);
        int var4 = var3.method48();
        int var5 = var3.method48();
        if (var4 == var5) {
            this.field705 = arg1;
            this.field711 = false;
        } else {
            byte[] var6 = new byte[var4];
            class34.method404(var6, var4, arg1, var5, 6);
            this.field705 = var6;
            var3 = new class5(2, this.field705);
            this.field711 = true;
        }
        this.field706 = var3.method46();
        while (arg0 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field707 = new int[this.field706];
        this.field708 = new int[this.field706];
        this.field709 = new int[this.field706];
        this.field710 = new int[this.field706];
        int var7 = this.field706 * 10 + var3.field123;
        for (int var8 = 0; var8 < this.field706; var8++) {
            this.field707[var8] = var3.method49();
            this.field708[var8] = var3.method48();
            this.field709[var8] = var3.method48();
            this.field710[var8] = var7;
            var7 += this.field709[var8];
        }
    }

    @OriginalMember(owner = "EAXVDNXA", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method255(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field706; var6++) {
            if (this.field707[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field708[var6]];
                }
                if (this.field711) {
                    for (int var7 = 0; var7 < this.field708[var6]; var7++) {
                        arg1[var7] = this.field705[this.field710[var6] + var7];
                    }
                } else {
                    class34.method404(arg1, this.field708[var6], this.field705, this.field709[var6], this.field710[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
