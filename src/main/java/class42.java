import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class42 extends class60 {

    @OriginalMember(owner = "client!h", name = "sb", descriptor = "Z")
    public boolean field948 = false;

    @OriginalMember(owner = "client!h", name = "ub", descriptor = "I")
    private int field950 = 0;

    @OriginalMember(owner = "client!h", name = "Nb", descriptor = "I")
    private int field969 = 0;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!h", name = "Hb", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!h", name = "yb", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!h", name = "zb", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!h", name = "wb", descriptor = "Ltb;")
    private class116 field952;

    @OriginalMember(owner = "client!h", name = "tb", descriptor = "I")
    public static int field949 = -1;

    @OriginalMember(owner = "client!h", name = "vb", descriptor = "Lle;")
    public static class71 field951 = new class71(64);

    @OriginalMember(owner = "client!h", name = "Fb", descriptor = "Lrc;")
    private static class105 field961 = class43.method374("Press (Wrecover a locked account(W on front page)3", 0);

    @OriginalMember(owner = "client!h", name = "Bb", descriptor = "Lrc;")
    public static class105 field957 = class43.method374("sich mit einer anderen Welt zu verbinden)3", 0);

    @OriginalMember(owner = "client!h", name = "Gb", descriptor = "Z")
    public static boolean field962 = true;

    @OriginalMember(owner = "client!h", name = "Ab", descriptor = "Lrc;")
    private static class105 field956 = class43.method374("red:", 0);

    @OriginalMember(owner = "client!h", name = "Mb", descriptor = "Lrc;")
    public static class105 field968 = field956;

    @OriginalMember(owner = "client!h", name = "Pb", descriptor = "Lrc;")
    private static class105 field971 = class43.method374("Attack", 0);

    @OriginalMember(owner = "client!h", name = "Kb", descriptor = "Lrc;")
    public static class105 field966 = field971;

    @OriginalMember(owner = "client!h", name = "Qb", descriptor = "Lrc;")
    public static class105 field972 = field961;

    @OriginalMember(owner = "client!h", name = "Ob", descriptor = "Lrc;")
    public static class105 field970 = class43.method374("Handel akzeptieren", 0);

    @OriginalMember(owner = "client!h", name = "Eb", descriptor = "Lle;")
    public static class71 field960 = new class71(64);

    @OriginalMember(owner = "client!h", name = "Sb", descriptor = "Lrc;")
    public static class105 field974 = class43.method374("Verbindung konnte nicht hergestellt werden)3", 0);

    @OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!h", name = "Cb", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!h", name = "Ib", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!h", name = "Jb", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!h", name = "Rb", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!h", name = "Lb", descriptor = "Lbd;")
    public static class11 field967;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "Lfc;")
    public static class34 field944;

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "Lmd;")
    public static class76 field945;

    @OriginalMember(owner = "client!h", name = "Db", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field959;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V", line = 3)
    public static void method370(int arg0) {
        field960 = null;
        field967 = null;
        field956 = null;
        field951 = null;
        field959 = null;
        field970 = null;
        field945 = null;
        field971 = null;
        if (arg0 != 11335) {
            method372(84, 31, -95, -19, -100);
        }
        field972 = null;
        field961 = null;
        field957 = null;
        field944 = null;
        field974 = null;
        field968 = null;
        field966 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V", line = 37)
    public final void method371(int arg0, int arg1) {
        int var3 = 96 / ((arg0 + 31) / 57);
        field973++;
        if (this.field948) {
            return;
        }
        this.field969 += arg1;
        while (this.field952.field2683[this.field950] < this.field969) {
            this.field969 -= this.field952.field2683[this.field950];
            this.field950++;
            if (this.field952.field2713.length <= this.field950) {
                this.field948 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIIIII)V", line = 175)
    public class42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field946 = arg3;
        this.field943 = arg2;
        this.field963 = arg4;
        this.field954 = arg0;
        this.field955 = arg5 + arg6;
        this.field947 = arg1;
        int var8 = class118.method956(this.field954, 19452).field1994;
        if (var8 == -1) {
            this.field948 = true;
        } else {
            this.field948 = false;
            this.field952 = class6.method49(103, var8);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)I", line = 129)
    public static final int method372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field965++;
        int var5 = 65536 - class38.field876[arg0 * 1024 / arg3] >> 1;
        if (arg4 != 1710581040) {
            method372(24, 5, 118, -9, -22);
        }
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)Ljb;", line = 154)
    public final class56 method168(int arg0) {
        if (arg0 < 6) {
            this.method371(70, 5);
        }
        field953++;
        class88 var2 = class118.method956(this.field954, 19452);
        class56 var3;
        if (this.field948) {
            var3 = var2.method724(-1, (byte) 36);
        } else {
            var3 = var2.method724(this.field950, (byte) 118);
        }
        return var3 == null ? null : var3;
    }
}
