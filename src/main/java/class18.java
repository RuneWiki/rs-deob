import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FXNTEMPE")
public class class18 {

    @OriginalMember(owner = "client!FXNTEMPE", name = "a", descriptor = "Z")
    private boolean field732 = false;

    @OriginalMember(owner = "client!FXNTEMPE", name = "c", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!FXNTEMPE", name = "h", descriptor = "Z")
    private boolean field739;

    @OriginalMember(owner = "client!FXNTEMPE", name = "b", descriptor = "[B")
    public byte[] field733;

    @OriginalMember(owner = "client!FXNTEMPE", name = "d", descriptor = "[I")
    public int[] field735;

    @OriginalMember(owner = "client!FXNTEMPE", name = "e", descriptor = "[I")
    public int[] field736;

    @OriginalMember(owner = "client!FXNTEMPE", name = "f", descriptor = "[I")
    public int[] field737;

    @OriginalMember(owner = "client!FXNTEMPE", name = "g", descriptor = "[I")
    public int[] field738;

    @OriginalMember(owner = "client!FXNTEMPE", name = "<init>", descriptor = "([BB)V")
    public class18(byte[] arg0, byte arg1) {
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            this.field732 = !this.field732;
        }
        this.method211(arg0, 39298);
    }

    @OriginalMember(owner = "client!FXNTEMPE", name = "a", descriptor = "([BI)V")
    private void method211(byte[] arg0, int arg1) {
        class50 var3 = new class50(arg0, -46859);
        int var4 = var3.method392();
        int var5 = var3.method392();
        if (var4 == var5) {
            this.field733 = arg0;
            this.field739 = false;
        } else {
            byte[] var6 = new byte[var4];
            class29.method275(var6, var4, arg0, var5, 6);
            this.field733 = var6;
            var3 = new class50(this.field733, -46859);
            this.field739 = true;
        }
        this.field734 = var3.method390();
        if (arg1 != 39298) {
            return;
        }
        this.field735 = new int[this.field734];
        this.field736 = new int[this.field734];
        this.field737 = new int[this.field734];
        this.field738 = new int[this.field734];
        int var7 = this.field734 * 10 + var3.field1225;
        for (int var8 = 0; var8 < this.field734; var8++) {
            this.field735[var8] = var3.method393();
            this.field736[var8] = var3.method392();
            this.field737[var8] = var3.method392();
            this.field738[var8] = var7;
            var7 += this.field737[var8];
        }
    }

    @OriginalMember(owner = "client!FXNTEMPE", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method212(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field734; var6++) {
            if (this.field735[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field736[var6]];
                }
                if (this.field739) {
                    for (int var7 = 0; var7 < this.field736[var6]; var7++) {
                        arg1[var7] = this.field733[this.field738[var6] + var7];
                    }
                } else {
                    class29.method275(arg1, this.field736[var6], this.field733, this.field737[var6], this.field738[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
