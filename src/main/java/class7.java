import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CVNWKEAW")
public class class7 {

    @OriginalMember(owner = "CVNWKEAW", name = "a", descriptor = "Z")
    private boolean field552 = false;

    @OriginalMember(owner = "CVNWKEAW", name = "b", descriptor = "I")
    private int field553 = 1;

    @OriginalMember(owner = "CVNWKEAW", name = "c", descriptor = "Z")
    private boolean field554 = false;

    @OriginalMember(owner = "CVNWKEAW", name = "d", descriptor = "Z")
    private boolean field555 = true;

    @OriginalMember(owner = "CVNWKEAW", name = "f", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "CVNWKEAW", name = "k", descriptor = "Z")
    private boolean field562;

    @OriginalMember(owner = "CVNWKEAW", name = "e", descriptor = "[B")
    public byte[] field556;

    @OriginalMember(owner = "CVNWKEAW", name = "g", descriptor = "[I")
    public int[] field558;

    @OriginalMember(owner = "CVNWKEAW", name = "h", descriptor = "[I")
    public int[] field559;

    @OriginalMember(owner = "CVNWKEAW", name = "i", descriptor = "[I")
    public int[] field560;

    @OriginalMember(owner = "CVNWKEAW", name = "j", descriptor = "[I")
    public int[] field561;

    @OriginalMember(owner = "CVNWKEAW", name = "<init>", descriptor = "(I[B)V")
    public class7(int arg0, byte[] arg1) {
        this.method179(26981, arg1);
        if (arg0 != 0) {
            this.field555 = !this.field555;
        }
    }

    @OriginalMember(owner = "CVNWKEAW", name = "a", descriptor = "(I[B)V")
    private void method179(int arg0, byte[] arg1) {
        class62 var3 = new class62(-417, arg1);
        int var4 = var3.method525();
        if (arg0 != 26981) {
            return;
        }
        int var5 = var3.method525();
        if (var4 == var5) {
            this.field556 = arg1;
            this.field562 = false;
        } else {
            byte[] var6 = new byte[var4];
            class46.method423(var6, var4, arg1, var5, 6);
            this.field556 = var6;
            var3 = new class62(-417, this.field556);
            this.field562 = true;
        }
        this.field557 = var3.method523();
        this.field558 = new int[this.field557];
        this.field559 = new int[this.field557];
        this.field560 = new int[this.field557];
        this.field561 = new int[this.field557];
        int var7 = this.field557 * 10 + var3.field1579;
        for (int var8 = 0; var8 < this.field557; var8++) {
            this.field558[var8] = var3.method526();
            this.field559[var8] = var3.method525();
            this.field560[var8] = var3.method525();
            this.field561[var8] = var7;
            var7 += this.field560[var8];
        }
    }

    @OriginalMember(owner = "CVNWKEAW", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method180(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field557; var6++) {
            if (this.field558[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field559[var6]];
                }
                if (this.field562) {
                    for (int var7 = 0; var7 < this.field559[var6]; var7++) {
                        arg1[var7] = this.field556[this.field561[var6] + var7];
                    }
                } else {
                    class46.method423(arg1, this.field559[var6], this.field556, this.field560[var6], this.field561[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
