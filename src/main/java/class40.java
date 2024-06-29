import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QARHEJHA")
public class class40 extends class12 {

    @OriginalMember(owner = "client!QARHEJHA", name = "n", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client!QARHEJHA", name = "o", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client!QARHEJHA", name = "p", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!QARHEJHA", name = "x", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!QARHEJHA", name = "y", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!QARHEJHA", name = "z", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!QARHEJHA", name = "A", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!QARHEJHA", name = "q", descriptor = "LVYXELYSX;")
    private class55 field1132;

    @OriginalMember(owner = "client!QARHEJHA", name = "v", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!QARHEJHA", name = "B", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!QARHEJHA", name = "t", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!QARHEJHA", name = "u", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!QARHEJHA", name = "s", descriptor = "[I")
    public int[] field1134;

    @OriginalMember(owner = "client!QARHEJHA", name = "w", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!QARHEJHA", name = "r", descriptor = "Lclient;")
    public static client field1133;

    @OriginalMember(owner = "client!QARHEJHA", name = "a", descriptor = "(I)LIEHKDFMR;")
    public final class18 method24(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            this.field1138 = -82;
        }
        if (this.field1132 != null) {
            int var3 = client.field257 - this.field1143;
            if (var3 > 100 && this.field1132.field1449 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field1132.method459(this.field1137, false)) {
                            break label44;
                        }
                        var3 -= this.field1132.method459(this.field1137, false);
                        this.field1137++;
                    } while (this.field1137 < this.field1132.field1445);
                    this.field1137 -= this.field1132.field1449;
                } while (this.field1137 >= 0 && this.field1137 < this.field1132.field1445);
                this.field1132 = null;
            }
            this.field1143 = client.field257 - var3;
            if (this.field1132 != null) {
                var2 = this.field1132.field1446[this.field1137];
            }
        }
        class1 var4;
        if (this.field1134 == null) {
            var4 = class1.method4(this.field1129);
        } else {
            var4 = this.method366(3);
        }
        return var4 == null ? null : var4.method5(this.field1130, this.field1131, this.field1139, this.field1140, this.field1141, this.field1142, var2);
    }

    @OriginalMember(owner = "client!QARHEJHA", name = "b", descriptor = "(I)LAMVKCKZF;")
    public final class1 method366(int arg0) {
        int var2 = -1;
        if (arg0 < 3 || arg0 > 3) {
            throw new NullPointerException();
        }
        if (this.field1135 != -1) {
            class13 var3 = class13.field684[this.field1135];
            int var4 = var3.field686;
            int var5 = var3.field687;
            int var6 = var3.field688;
            int var7 = client.field359[var6 - var5];
            var2 = field1133.field319[var4] >> var5 & var7;
        } else if (this.field1136 != -1) {
            var2 = field1133.field319[this.field1136];
        }
        return var2 < 0 || var2 >= this.field1134.length || this.field1134[var2] == -1 ? null : class1.method4(this.field1134[var2]);
    }

    @OriginalMember(owner = "client!QARHEJHA", name = "<init>", descriptor = "(IIIIIIIIBZ)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, boolean arg9) {
        this.field1129 = arg5;
        this.field1130 = arg3;
        this.field1131 = arg2;
        this.field1139 = arg4;
        this.field1140 = arg6;
        this.field1141 = arg0;
        this.field1142 = arg1;
        if (arg7 != -1) {
            this.field1132 = class55.field1444[arg7];
            this.field1137 = 0;
            this.field1143 = client.field257;
            if (arg9 && this.field1132.field1449 != -1) {
                this.field1137 = (int) (Math.random() * (double) this.field1132.field1445);
                this.field1143 -= (int) (Math.random() * (double) this.field1132.method459(this.field1137, false));
            }
        }
        class1 var11 = class1.method4(this.field1129);
        if (arg8 != 5) {
            throw new NullPointerException();
        }
        boolean var12 = false;
        this.field1135 = var11.field27;
        this.field1136 = var11.field13;
        this.field1134 = var11.field18;
    }
}
