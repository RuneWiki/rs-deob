import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RSPRYUFS")
public class class49 {

    @OriginalMember(owner = "client!RSPRYUFS", name = "a", descriptor = "Z")
    private boolean field1202 = true;

    @OriginalMember(owner = "client!RSPRYUFS", name = "c", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!RSPRYUFS", name = "h", descriptor = "Z")
    private boolean field1209;

    @OriginalMember(owner = "client!RSPRYUFS", name = "b", descriptor = "[B")
    public byte[] field1203;

    @OriginalMember(owner = "client!RSPRYUFS", name = "d", descriptor = "[I")
    public int[] field1205;

    @OriginalMember(owner = "client!RSPRYUFS", name = "e", descriptor = "[I")
    public int[] field1206;

    @OriginalMember(owner = "client!RSPRYUFS", name = "f", descriptor = "[I")
    public int[] field1207;

    @OriginalMember(owner = "client!RSPRYUFS", name = "g", descriptor = "[I")
    public int[] field1208;

    @OriginalMember(owner = "client!RSPRYUFS", name = "<init>", descriptor = "([BB)V")
    public class49(byte[] arg0, byte arg1) {
        if (arg1 != -70) {
            throw new NullPointerException();
        }
        this.method426(arg0, 196);
    }

    @OriginalMember(owner = "client!RSPRYUFS", name = "a", descriptor = "([BI)V")
    private void method426(byte[] arg0, int arg1) {
        class36 var3 = new class36(-587, arg0);
        int var4 = var3.method343();
        int var5 = var3.method343();
        if (var4 == var5) {
            this.field1203 = arg0;
            this.field1209 = false;
        } else {
            byte[] var6 = new byte[var4];
            class39.method400(var6, var4, arg0, var5, 6);
            this.field1203 = var6;
            var3 = new class36(-587, this.field1203);
            this.field1209 = true;
        }
        this.field1204 = var3.method341();
        this.field1205 = new int[this.field1204];
        this.field1206 = new int[this.field1204];
        this.field1207 = new int[this.field1204];
        this.field1208 = new int[this.field1204];
        if (arg1 <= 0) {
            this.field1202 = !this.field1202;
        }
        int var7 = this.field1204 * 10 + var3.field1072;
        for (int var8 = 0; var8 < this.field1204; var8++) {
            this.field1205[var8] = var3.method344();
            this.field1206[var8] = var3.method343();
            this.field1207[var8] = var3.method343();
            this.field1208[var8] = var7;
            var7 += this.field1207[var8];
        }
    }

    @OriginalMember(owner = "client!RSPRYUFS", name = "a", descriptor = "(Ljava/lang/String;[B)[B")
    public byte[] method427(String arg0, byte[] arg1) {
        int var3 = 0;
        String var4 = arg0.toUpperCase();
        for (int var5 = 0; var5 < var4.length(); var5++) {
            var3 = var3 * 61 + var4.charAt(var5) - 32;
        }
        for (int var6 = 0; var6 < this.field1204; var6++) {
            if (this.field1205[var6] == var3) {
                if (arg1 == null) {
                    arg1 = new byte[this.field1206[var6]];
                }
                if (this.field1209) {
                    for (int var7 = 0; var7 < this.field1206[var6]; var7++) {
                        arg1[var7] = this.field1203[this.field1208[var6] + var7];
                    }
                } else {
                    class39.method400(arg1, this.field1206[var6], this.field1203, this.field1207[var6], this.field1208[var6]);
                }
                return arg1;
            }
        }
        return null;
    }
}
