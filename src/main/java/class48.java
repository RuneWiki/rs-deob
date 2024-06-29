import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QMMKOHGT")
public class class48 extends class16 {

    @OriginalMember(owner = "client!QMMKOHGT", name = "u", descriptor = "I")
    private int field1180 = 9;

    @OriginalMember(owner = "client!QMMKOHGT", name = "o", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!QMMKOHGT", name = "p", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!QMMKOHGT", name = "q", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client!QMMKOHGT", name = "w", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!QMMKOHGT", name = "x", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!QMMKOHGT", name = "y", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!QMMKOHGT", name = "z", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!QMMKOHGT", name = "l", descriptor = "LLZZHVUJR;")
    private class33 field1171;

    @OriginalMember(owner = "client!QMMKOHGT", name = "m", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client!QMMKOHGT", name = "v", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!QMMKOHGT", name = "n", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!QMMKOHGT", name = "s", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!QMMKOHGT", name = "t", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "client!QMMKOHGT", name = "A", descriptor = "[I")
    public int[] field1186;

    @OriginalMember(owner = "client!QMMKOHGT", name = "r", descriptor = "Lclient;")
    public static client field1177;

    @OriginalMember(owner = "client!QMMKOHGT", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public final class61 method174(boolean arg0) {
        int var2 = -1;
        if (this.field1171 != null) {
            int var3 = client.field399 - this.field1181;
            if (var3 > 100 && this.field1171.field968 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field1171.method301(this.field1172, this.field1173)) {
                            break label45;
                        }
                        var3 -= this.field1171.method301(this.field1172, this.field1173);
                        this.field1172++;
                    } while (this.field1172 < this.field1171.field964);
                    this.field1172 -= this.field1171.field968;
                } while (this.field1172 >= 0 && this.field1172 < this.field1171.field964);
                this.field1171 = null;
            }
            this.field1181 = client.field399 - var3;
            if (this.field1171 != null) {
                var2 = this.field1171.field965[this.field1172];
            }
        }
        class59 var4;
        if (this.field1186 == null) {
            var4 = class59.method450(this.field1174);
        } else {
            var4 = this.method375(6);
        }
        if (var4 == null) {
            return null;
        }
        class61 var5 = var4.method457(this.field1175, this.field1176, this.field1182, this.field1183, this.field1184, this.field1185, var2);
        if (arg0) {
            this.field1180 = -225;
        }
        return var5;
    }

    @OriginalMember(owner = "client!QMMKOHGT", name = "a", descriptor = "(I)LURZZBDTU;")
    public final class59 method375(int arg0) {
        int var2 = -1;
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        if (this.field1178 != -1) {
            class26 var3 = class26.field896[this.field1178];
            int var4 = var3.field898;
            int var5 = var3.field899;
            int var6 = var3.field900;
            int var7 = client.field370[var6 - var5];
            var2 = field1177.field214[var4] >> var5 & var7;
        } else if (this.field1179 != -1) {
            var2 = field1177.field214[this.field1179];
        }
        return var2 < 0 || var2 >= this.field1186.length || this.field1186[var2] == -1 ? null : class59.method450(this.field1186[var2]);
    }

    @OriginalMember(owner = "client!QMMKOHGT", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field1174 = arg1;
        this.field1175 = arg4;
        this.field1176 = arg2;
        this.field1182 = arg8;
        this.field1183 = arg6;
        this.field1184 = arg0;
        if (arg3 <= 0) {
            throw new NullPointerException();
        }
        this.field1185 = arg5;
        if (arg7 != -1) {
            this.field1171 = class33.field963[arg7];
            this.field1172 = 0;
            this.field1181 = client.field399;
            if (arg9 && this.field1171.field968 != -1) {
                this.field1172 = (int) (Math.random() * (double) this.field1171.field964);
                this.field1181 -= (int) (Math.random() * (double) this.field1171.method301(this.field1172, this.field1173));
            }
        }
        class59 var11 = class59.method450(this.field1174);
        this.field1178 = var11.field1408;
        this.field1179 = var11.field1390;
        this.field1186 = var11.field1373;
    }
}
