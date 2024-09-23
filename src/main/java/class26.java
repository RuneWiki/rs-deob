import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HRXSNEYZ")
public class class26 {

    @OriginalMember(owner = "HRXSNEYZ", name = "a", descriptor = "B")
    private byte field823 = 6;

    @OriginalMember(owner = "HRXSNEYZ", name = "b", descriptor = "I")
    private int field824 = -308;

    @OriginalMember(owner = "HRXSNEYZ", name = "d", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "HRXSNEYZ", name = "i", descriptor = "Z")
    private boolean field831;

    @OriginalMember(owner = "HRXSNEYZ", name = "c", descriptor = "[B")
    public byte[] field825;

    @OriginalMember(owner = "HRXSNEYZ", name = "e", descriptor = "[I")
    public int[] field827;

    @OriginalMember(owner = "HRXSNEYZ", name = "f", descriptor = "[I")
    public int[] field828;

    @OriginalMember(owner = "HRXSNEYZ", name = "g", descriptor = "[I")
    public int[] field829;

    @OriginalMember(owner = "HRXSNEYZ", name = "h", descriptor = "[I")
    public int[] field830;

    @OriginalMember(owner = "HRXSNEYZ", name = "<init>", descriptor = "([BB)V")
    public class26(byte[] arg0, byte arg1) {
        this.method288(-713, arg0);
        if (this.field823 != arg1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "HRXSNEYZ", name = "a", descriptor = "(I[B)V")
    private void method288(int arg0, byte[] arg1) {
        class31 var3 = new class31(arg1, 8);
        int var4 = var3.method310();
        int var5 = var3.method310();
        if (var4 == var5) {
            this.field825 = arg1;
            this.field831 = false;
        } else {
            byte[] var6 = new byte[var4];
            class51.method404(var6, var4, arg1, var5, 6);
            this.field825 = var6;
            var3 = new class31(this.field825, 8);
            this.field831 = true;
        }
        this.field826 = var3.method308();
        this.field827 = new int[this.field826];
        this.field828 = new int[this.field826];
        while (arg0 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field829 = new int[this.field826];
        this.field830 = new int[this.field826];
        int var7 = this.field826 * 10 + var3.field901;
        for (int var8 = 0; var8 < this.field826; var8++) {
            this.field827[var8] = var3.method311();
            this.field828[var8] = var3.method310();
            this.field829[var8] = var3.method310();
            this.field830[var8] = var7;
            var7 += this.field829[var8];
        }
    }

    @OriginalMember(owner = "HRXSNEYZ", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method289(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field826; var6++) {
            if (this.field827[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field828[var6]];
                }
                if (this.field831) {
                    for (int var7 = 0; var7 < this.field828[var6]; var7++) {
                        arg1[var7] = this.field825[this.field830[var6] + var7];
                    }
                } else {
                    class51.method404(arg1, this.field828[var6], this.field825, this.field829[var6], this.field830[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
