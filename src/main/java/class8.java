import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DTIATKJO")
public class class8 {

    @OriginalMember(owner = "DTIATKJO", name = "a", descriptor = "B")
    private byte field598 = 8;

    @OriginalMember(owner = "DTIATKJO", name = "b", descriptor = "B")
    private byte field599 = -57;

    @OriginalMember(owner = "DTIATKJO", name = "c", descriptor = "I")
    private int field600 = -401;

    @OriginalMember(owner = "DTIATKJO", name = "d", descriptor = "Z")
    private boolean field601 = false;

    @OriginalMember(owner = "DTIATKJO", name = "f", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "DTIATKJO", name = "k", descriptor = "Z")
    private boolean field608;

    @OriginalMember(owner = "DTIATKJO", name = "e", descriptor = "[B")
    public byte[] field602;

    @OriginalMember(owner = "DTIATKJO", name = "g", descriptor = "[I")
    public int[] field604;

    @OriginalMember(owner = "DTIATKJO", name = "h", descriptor = "[I")
    public int[] field605;

    @OriginalMember(owner = "DTIATKJO", name = "i", descriptor = "[I")
    public int[] field606;

    @OriginalMember(owner = "DTIATKJO", name = "j", descriptor = "[I")
    public int[] field607;

    @OriginalMember(owner = "DTIATKJO", name = "<init>", descriptor = "(B[B)V")
    public class8(byte arg0, byte[] arg1) {
        if (this.field598 != arg0) {
            this.field601 = !this.field601;
        }
        this.method167(arg1, this.field599);
    }

    @OriginalMember(owner = "DTIATKJO", name = "a", descriptor = "([BB)V")
    private void method167(byte[] arg0, byte arg1) {
        class14 var3 = new class14(-527, arg0);
        int var4 = var3.method206();
        int var5 = var3.method206();
        if (var4 == var5) {
            this.field602 = arg0;
            this.field608 = false;
        } else {
            byte[] var6 = new byte[var4];
            class52.method499(var6, var4, arg0, var5, 6);
            this.field602 = var6;
            var3 = new class14(-527, this.field602);
            this.field608 = true;
        }
        this.field603 = var3.method204();
        if (arg1 != -57) {
            return;
        }
        this.field604 = new int[this.field603];
        this.field605 = new int[this.field603];
        this.field606 = new int[this.field603];
        this.field607 = new int[this.field603];
        int var7 = this.field603 * 10 + var3.field769;
        for (int var8 = 0; var8 < this.field603; var8++) {
            this.field604[var8] = var3.method207();
            this.field605[var8] = var3.method206();
            this.field606[var8] = var3.method206();
            this.field607[var8] = var7;
            var7 += this.field606[var8];
        }
    }

    @OriginalMember(owner = "DTIATKJO", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method168(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field603; var6++) {
            if (this.field604[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field605[var6]];
                }
                if (this.field608) {
                    for (int var7 = 0; var7 < this.field605[var6]; var7++) {
                        arg1[var7] = this.field602[this.field607[var6] + var7];
                    }
                } else {
                    class52.method499(arg1, this.field605[var6], this.field602, this.field606[var6], this.field607[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
