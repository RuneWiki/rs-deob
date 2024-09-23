import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FSCCBLKX")
public class class22 extends class21 {

    @OriginalMember(owner = "FSCCBLKX", name = "w", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "FSCCBLKX", name = "x", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "FSCCBLKX", name = "y", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "FSCCBLKX", name = "p", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "FSCCBLKX", name = "q", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "FSCCBLKX", name = "r", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "FSCCBLKX", name = "s", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "FSCCBLKX", name = "o", descriptor = "LXKEHWKFH;")
    private class66 field745;

    @OriginalMember(owner = "FSCCBLKX", name = "m", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "FSCCBLKX", name = "v", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "FSCCBLKX", name = "t", descriptor = "I")
    public int field750;

    @OriginalMember(owner = "FSCCBLKX", name = "u", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "FSCCBLKX", name = "n", descriptor = "[I")
    public int[] field744;

    @OriginalMember(owner = "FSCCBLKX", name = "z", descriptor = "Lclient;")
    public static client field756;

    @OriginalMember(owner = "FSCCBLKX", name = "<init>", descriptor = "(IIZIIIIBII)V")
    public class22(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        this.field753 = arg4;
        this.field754 = arg5;
        this.field755 = arg0;
        this.field746 = arg6;
        this.field747 = arg1;
        this.field748 = arg8;
        if (arg7 != 5) {
            throw new NullPointerException();
        }
        this.field749 = arg9;
        if (arg3 != -1) {
            this.field745 = class66.field1608[arg3];
            this.field743 = 0;
            this.field752 = client.field246;
            if (arg2 && this.field745.field1613 != -1) {
                this.field743 = (int) (Math.random() * (double) this.field745.field1609);
                this.field752 -= (int) (Math.random() * (double) this.field745.method566(this.field743, (byte) 2));
            }
        }
        class59 var11 = class59.method555(this.field753);
        this.field750 = var11.field1464;
        this.field751 = var11.field1493;
        this.field744 = var11.field1502;
    }

    @OriginalMember(owner = "FSCCBLKX", name = "a", descriptor = "(B)LUSIJLMTP;")
    public final class59 method275(byte arg0) {
        int var2 = -1;
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        if (this.field750 != -1) {
            class37 var3 = class37.field1110[this.field750];
            int var4 = var3.field1112;
            int var5 = var3.field1113;
            int var6 = var3.field1114;
            int var7 = client.field176[var6 - var5];
            var2 = field756.field455[var4] >> var5 & var7;
        } else if (this.field751 != -1) {
            var2 = field756.field455[this.field751];
        }
        return var2 < 0 || var2 >= this.field744.length || this.field744[var2] == -1 ? null : class59.method555(this.field744[var2]);
    }

    @OriginalMember(owner = "FSCCBLKX", name = "a", descriptor = "(I)LHEQROJXW;")
    public final class27 method1(int arg0) {
        int var2 = -1;
        if (this.field745 != null) {
            int var3 = client.field246 - this.field752;
            if (var3 > 100 && this.field745.field1613 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field745.method566(this.field743, (byte) 2)) {
                            break label45;
                        }
                        var3 -= this.field745.method566(this.field743, (byte) 2);
                        this.field743++;
                    } while (this.field743 < this.field745.field1609);
                    this.field743 -= this.field745.field1613;
                } while (this.field743 >= 0 && this.field743 < this.field745.field1609);
                this.field745 = null;
            }
            this.field752 = client.field246 - var3;
            if (this.field745 != null) {
                var2 = this.field745.field1610[this.field743];
            }
        }
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        class59 var4;
        if (this.field744 == null) {
            var4 = class59.method555(this.field753);
        } else {
            var4 = this.method275((byte) 9);
        }
        return var4 == null ? null : var4.method548(this.field754, this.field755, this.field746, this.field747, this.field748, this.field749, var2);
    }
}
