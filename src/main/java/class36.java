import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NTLPGIRW")
public class class36 extends class17 {

    @OriginalMember(owner = "client!NTLPGIRW", name = "v", descriptor = "Z")
    private boolean field1132 = false;

    @OriginalMember(owner = "client!NTLPGIRW", name = "z", descriptor = "Z")
    private boolean field1136 = true;

    @OriginalMember(owner = "client!NTLPGIRW", name = "q", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client!NTLPGIRW", name = "r", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!NTLPGIRW", name = "s", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client!NTLPGIRW", name = "k", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!NTLPGIRW", name = "l", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client!NTLPGIRW", name = "m", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!NTLPGIRW", name = "n", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!NTLPGIRW", name = "w", descriptor = "LLMDSPIVT;")
    private class30 field1133;

    @OriginalMember(owner = "client!NTLPGIRW", name = "p", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client!NTLPGIRW", name = "t", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!NTLPGIRW", name = "x", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!NTLPGIRW", name = "y", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!NTLPGIRW", name = "u", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "client!NTLPGIRW", name = "o", descriptor = "Lclient;")
    public static client field1125;

    @OriginalMember(owner = "client!NTLPGIRW", name = "<init>", descriptor = "(IIIZIIIIBI)V")
    public class36(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        this.field1127 = arg1;
        if (arg8 != -108) {
            throw new NullPointerException();
        }
        this.field1128 = arg5;
        this.field1129 = arg4;
        this.field1121 = arg9;
        this.field1122 = arg2;
        this.field1123 = arg6;
        this.field1124 = arg0;
        if (arg7 != -1) {
            this.field1133 = class30.field982[arg7];
            this.field1126 = 0;
            this.field1130 = client.field291;
            if (arg3 && this.field1133.field987 != -1) {
                this.field1126 = (int) (Math.random() * (double) this.field1133.field983);
                this.field1130 -= (int) (Math.random() * (double) this.field1133.method280(-204, this.field1126));
            }
        }
        class63 var11 = class63.method555(this.field1127);
        this.field1134 = var11.field1575;
        this.field1135 = var11.field1568;
        this.field1131 = var11.field1573;
    }

    @OriginalMember(owner = "client!NTLPGIRW", name = "a", descriptor = "(B)LWEWSMZTU;")
    public final class63 method352(byte arg0) {
        if (arg0 != 2) {
            this.field1136 = !this.field1136;
        }
        int var2 = -1;
        if (this.field1134 != -1) {
            class5 var3 = class5.field74[this.field1134];
            int var4 = var3.field76;
            int var5 = var3.field77;
            int var6 = var3.field78;
            int var7 = client.field306[var6 - var5];
            var2 = field1125.field385[var4] >> var5 & var7;
        } else if (this.field1135 != -1) {
            var2 = field1125.field385[this.field1135];
        }
        return var2 < 0 || var2 >= this.field1131.length || this.field1131[var2] == -1 ? null : class63.method555(this.field1131[var2]);
    }

    @OriginalMember(owner = "client!NTLPGIRW", name = "a", descriptor = "(I)LKDWDYCIL;")
    public final class25 method185(int arg0) {
        int var2 = -1;
        if (arg0 < 9 || arg0 > 9) {
            this.field1132 = !this.field1132;
        }
        if (this.field1133 != null) {
            int var3 = client.field291 - this.field1130;
            if (var3 > 100 && this.field1133.field987 > 0) {
                var3 = 100;
            }
            label49: {
                do {
                    do {
                        if (var3 <= this.field1133.method280(-204, this.field1126)) {
                            break label49;
                        }
                        var3 -= this.field1133.method280(-204, this.field1126);
                        this.field1126++;
                    } while (this.field1126 < this.field1133.field983);
                    this.field1126 -= this.field1133.field987;
                } while (this.field1126 >= 0 && this.field1126 < this.field1133.field983);
                this.field1133 = null;
            }
            this.field1130 = client.field291 - var3;
            if (this.field1133 != null) {
                var2 = this.field1133.field984[this.field1126];
            }
        }
        class63 var4;
        if (this.field1131 == null) {
            var4 = class63.method555(this.field1127);
        } else {
            var4 = this.method352((byte) 2);
        }
        return var4 == null ? null : var4.method556(this.field1128, this.field1129, this.field1121, this.field1122, this.field1123, this.field1124, var2);
    }
}
