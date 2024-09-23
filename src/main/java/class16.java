import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DYBMLHQM")
public class class16 {

    @OriginalMember(owner = "DYBMLHQM", name = "a", descriptor = "Z")
    private boolean field773 = true;

    @OriginalMember(owner = "DYBMLHQM", name = "b", descriptor = "Z")
    private boolean field774 = true;

    @OriginalMember(owner = "DYBMLHQM", name = "c", descriptor = "I")
    private int field775 = -1221;

    @OriginalMember(owner = "DYBMLHQM", name = "e", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "DYBMLHQM", name = "j", descriptor = "Z")
    private boolean field782;

    @OriginalMember(owner = "DYBMLHQM", name = "d", descriptor = "[B")
    public byte[] field776;

    @OriginalMember(owner = "DYBMLHQM", name = "f", descriptor = "[I")
    public int[] field778;

    @OriginalMember(owner = "DYBMLHQM", name = "g", descriptor = "[I")
    public int[] field779;

    @OriginalMember(owner = "DYBMLHQM", name = "h", descriptor = "[I")
    public int[] field780;

    @OriginalMember(owner = "DYBMLHQM", name = "i", descriptor = "[I")
    public int[] field781;

    @OriginalMember(owner = "DYBMLHQM", name = "<init>", descriptor = "([BI)V")
    public class16(byte[] arg0, int arg1) {
        this.method247(this.field773, arg0);
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "DYBMLHQM", name = "a", descriptor = "(Z[B)V")
    private void method247(boolean arg0, byte[] arg1) {
        class29 var3 = new class29((byte) -28, arg1);
        int var4 = var3.method312();
        int var5 = var3.method312();
        if (var4 == var5) {
            this.field776 = arg1;
            this.field782 = false;
        } else {
            byte[] var6 = new byte[var4];
            class31.method343(var6, var4, arg1, var5, 6);
            this.field776 = var6;
            var3 = new class29((byte) -28, this.field776);
            this.field782 = true;
        }
        this.field777 = var3.method310();
        this.field778 = new int[this.field777];
        this.field779 = new int[this.field777];
        this.field780 = new int[this.field777];
        this.field781 = new int[this.field777];
        if (!arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = this.field777 * 10 + var3.field1107;
        for (int var9 = 0; var9 < this.field777; var9++) {
            this.field778[var9] = var3.method313();
            this.field779[var9] = var3.method312();
            this.field780[var9] = var3.method312();
            this.field781[var9] = var8;
            var8 += this.field780[var9];
        }
    }

    @OriginalMember(owner = "DYBMLHQM", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method248(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field777; var6++) {
            if (this.field778[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field779[var6]];
                }
                if (this.field782) {
                    for (int var7 = 0; var7 < this.field779[var6]; var7++) {
                        arg1[var7] = this.field776[this.field781[var6] + var7];
                    }
                } else {
                    class31.method343(arg1, this.field779[var6], this.field776, this.field780[var6], this.field781[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
