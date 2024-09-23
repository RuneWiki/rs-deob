import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JVQZOBJO")
public class class24 extends class54 {

    @OriginalMember(owner = "JVQZOBJO", name = "l", descriptor = "I")
    private int field955 = 49048;

    @OriginalMember(owner = "JVQZOBJO", name = "u", descriptor = "B")
    private byte field964 = -120;

    @OriginalMember(owner = "JVQZOBJO", name = "r", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "JVQZOBJO", name = "s", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "JVQZOBJO", name = "t", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "JVQZOBJO", name = "m", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "JVQZOBJO", name = "n", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "JVQZOBJO", name = "o", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "JVQZOBJO", name = "p", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "JVQZOBJO", name = "z", descriptor = "LISUBRNPG;")
    private class20 field969;

    @OriginalMember(owner = "JVQZOBJO", name = "A", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "JVQZOBJO", name = "v", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "JVQZOBJO", name = "x", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "JVQZOBJO", name = "y", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "JVQZOBJO", name = "q", descriptor = "[I")
    public int[] field960;

    @OriginalMember(owner = "JVQZOBJO", name = "w", descriptor = "Lclient;")
    public static client field966;

    @OriginalMember(owner = "JVQZOBJO", name = "a", descriptor = "(B)LCCYECDYX;")
    public final class4 method181(byte arg0) {
        int var2 = -1;
        if (this.field969 != null) {
            int var3 = client.field441 - this.field965;
            if (var3 > 100 && this.field969.field880 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field969.method226((byte) 6, this.field970)) {
                            break label45;
                        }
                        var3 -= this.field969.method226((byte) 6, this.field970);
                        this.field970++;
                    } while (this.field970 < this.field969.field876);
                    this.field970 -= this.field969.field880;
                } while (this.field970 >= 0 && this.field970 < this.field969.field876);
                this.field969 = null;
            }
            this.field965 = client.field441 - var3;
            if (this.field969 != null) {
                var2 = this.field969.field877[this.field970];
            }
        }
        class33 var4;
        if (this.field960 == null) {
            var4 = class33.method350(this.field961);
        } else {
            var4 = this.method252(this.field955);
        }
        if (var4 == null) {
            return null;
        }
        class4 var5 = var4.method344(this.field962, this.field963, this.field956, this.field957, this.field958, this.field959, var2);
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return var5;
    }

    @OriginalMember(owner = "JVQZOBJO", name = "<init>", descriptor = "(IZIIIIBIII)V")
    public class24(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        this.field961 = arg2;
        this.field962 = arg3;
        this.field963 = arg9;
        this.field956 = arg8;
        if (this.field964 != arg6) {
            throw new NullPointerException();
        }
        this.field957 = arg4;
        this.field958 = arg7;
        this.field959 = arg5;
        if (arg0 != -1) {
            this.field969 = class20.field875[arg0];
            this.field970 = 0;
            this.field965 = client.field441;
            if (arg1 && this.field969.field880 != -1) {
                this.field970 = (int) (Math.random() * (double) this.field969.field876);
                this.field965 -= (int) (Math.random() * (double) this.field969.method226((byte) 6, this.field970));
            }
        }
        class33 var11 = class33.method350(this.field961);
        this.field967 = var11.field1145;
        this.field968 = var11.field1152;
        this.field960 = var11.field1155;
    }

    @OriginalMember(owner = "JVQZOBJO", name = "a", descriptor = "(I)LNNGZIOFO;")
    public final class33 method252(int arg0) {
        int var2 = -1;
        if (arg0 != 49048) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field967 != -1) {
            class14 var4 = class14.field795[this.field967];
            int var5 = var4.field797;
            int var6 = var4.field798;
            int var7 = var4.field799;
            int var8 = client.field405[var7 - var6];
            var2 = field966.field530[var5] >> var6 & var8;
        } else if (this.field968 != -1) {
            var2 = field966.field530[this.field968];
        }
        return var2 < 0 || var2 >= this.field960.length || this.field960[var2] == -1 ? null : class33.method350(this.field960[var2]);
    }
}
