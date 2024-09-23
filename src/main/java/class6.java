import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BBMKAXRK")
public class class6 {

    @OriginalMember(owner = "BBMKAXRK", name = "a", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "BBMKAXRK", name = "c", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "BBMKAXRK", name = "h", descriptor = "Z")
    private boolean field142;

    @OriginalMember(owner = "BBMKAXRK", name = "b", descriptor = "[B")
    public byte[] field136;

    @OriginalMember(owner = "BBMKAXRK", name = "d", descriptor = "[I")
    public int[] field138;

    @OriginalMember(owner = "BBMKAXRK", name = "e", descriptor = "[I")
    public int[] field139;

    @OriginalMember(owner = "BBMKAXRK", name = "f", descriptor = "[I")
    public int[] field140;

    @OriginalMember(owner = "BBMKAXRK", name = "g", descriptor = "[I")
    public int[] field141;

    @OriginalMember(owner = "BBMKAXRK", name = "<init>", descriptor = "(B[B)V")
    public class6(byte arg0, byte[] arg1) {
        this.method29((byte) 8, arg1);
        if (arg0 != 70) {
            this.field135 = 486;
        }
    }

    @OriginalMember(owner = "BBMKAXRK", name = "a", descriptor = "(B[B)V")
    private void method29(byte arg0, byte[] arg1) {
        class17 var3 = new class17(arg1, -26583);
        int var4 = var3.method228();
        int var5 = var3.method228();
        if (var4 == var5) {
            this.field136 = arg1;
            this.field142 = false;
        } else {
            byte[] var6 = new byte[var4];
            class10.method36(var6, var4, arg1, var5, 6);
            this.field136 = var6;
            var3 = new class17(this.field136, -26583);
            this.field142 = true;
        }
        this.field137 = var3.method226();
        this.field138 = new int[this.field137];
        this.field139 = new int[this.field137];
        this.field140 = new int[this.field137];
        this.field141 = new int[this.field137];
        if (arg0 == 8) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = this.field137 * 10 + var3.field779;
        for (int var10 = 0; var10 < this.field137; var10++) {
            this.field138[var10] = var3.method229();
            this.field139[var10] = var3.method228();
            this.field140[var10] = var3.method228();
            this.field141[var10] = var9;
            var9 += this.field140[var10];
        }
    }

    @OriginalMember(owner = "BBMKAXRK", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method30(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field137; var6++) {
            if (this.field138[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field139[var6]];
                }
                if (this.field142) {
                    for (int var7 = 0; var7 < this.field139[var6]; var7++) {
                        arg1[var7] = this.field136[this.field141[var6] + var7];
                    }
                } else {
                    class10.method36(arg1, this.field139[var6], this.field136, this.field140[var6], this.field141[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
