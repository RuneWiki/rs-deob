import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MAARFNGV")
public class class29 {

    @OriginalMember(owner = "client!MAARFNGV", name = "a", descriptor = "Z")
    private boolean field979 = false;

    @OriginalMember(owner = "client!MAARFNGV", name = "c", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!MAARFNGV", name = "h", descriptor = "Z")
    private boolean field986;

    @OriginalMember(owner = "client!MAARFNGV", name = "b", descriptor = "[B")
    public byte[] field980;

    @OriginalMember(owner = "client!MAARFNGV", name = "d", descriptor = "[I")
    public int[] field982;

    @OriginalMember(owner = "client!MAARFNGV", name = "e", descriptor = "[I")
    public int[] field983;

    @OriginalMember(owner = "client!MAARFNGV", name = "f", descriptor = "[I")
    public int[] field984;

    @OriginalMember(owner = "client!MAARFNGV", name = "g", descriptor = "[I")
    public int[] field985;

    @OriginalMember(owner = "client!MAARFNGV", name = "<init>", descriptor = "([BB)V")
    public class29(byte[] arg0, byte arg1) {
        if (arg1 != 9) {
            this.field979 = !this.field979;
        }
        this.method331(arg0, false);
    }

    @OriginalMember(owner = "client!MAARFNGV", name = "a", descriptor = "([BZ)V")
    private void method331(byte[] arg0, boolean arg1) {
        class14 var3 = new class14(arg0, true);
        int var4 = var3.method221();
        int var5 = var3.method221();
        if (var4 == var5) {
            this.field980 = arg0;
            this.field986 = false;
        } else {
            byte[] var6 = new byte[var4];
            class53.method437(var6, var4, arg0, var5, 6);
            this.field980 = var6;
            var3 = new class14(this.field980, true);
            this.field986 = true;
        }
        this.field981 = var3.method219();
        this.field982 = new int[this.field981];
        this.field983 = new int[this.field981];
        this.field984 = new int[this.field981];
        if (arg1) {
            return;
        }
        this.field985 = new int[this.field981];
        int var7 = this.field981 * 10 + var3.field707;
        for (int var8 = 0; var8 < this.field981; var8++) {
            this.field982[var8] = var3.method222();
            this.field983[var8] = var3.method221();
            this.field984[var8] = var3.method221();
            this.field985[var8] = var7;
            var7 += this.field984[var8];
        }
    }

    @OriginalMember(owner = "client!MAARFNGV", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method332(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field981; var6++) {
            if (this.field982[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field983[var6]];
                }
                if (this.field986) {
                    for (int var7 = 0; var7 < this.field983[var6]; var7++) {
                        arg1[var7] = this.field980[this.field985[var6] + var7];
                    }
                } else {
                    class53.method437(arg1, this.field983[var6], this.field980, this.field984[var6], this.field985[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
