import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QOBPOZUC")
public class class46 {

    @OriginalMember(owner = "QOBPOZUC", name = "a", descriptor = "Z")
    private boolean field1202 = false;

    @OriginalMember(owner = "QOBPOZUC", name = "b", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "QOBPOZUC", name = "e", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "QOBPOZUC", name = "f", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "QOBPOZUC", name = "g", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "QOBPOZUC", name = "h", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "QOBPOZUC", name = "i", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "QOBPOZUC", name = "j", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "QOBPOZUC", name = "k", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "QOBPOZUC", name = "l", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "QOBPOZUC", name = "m", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "QOBPOZUC", name = "c", descriptor = "[I")
    private int[] field1204;

    @OriginalMember(owner = "QOBPOZUC", name = "d", descriptor = "[I")
    private int[] field1205;

    @OriginalMember(owner = "QOBPOZUC", name = "a", descriptor = "(LXQPFGONL;I)V")
    public final void method390(class62 arg0, int arg1) {
        this.field1208 = arg0.method478();
        this.field1206 = arg0.method483();
        this.field1207 = arg0.method483();
        this.method391(arg0, true);
        int var3 = 12 / arg1;
    }

    @OriginalMember(owner = "QOBPOZUC", name = "a", descriptor = "(LXQPFGONL;Z)V")
    public final void method391(class62 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        this.field1203 = arg0.method478();
        this.field1204 = new int[this.field1203];
        this.field1205 = new int[this.field1203];
        for (int var3 = 0; var3 < this.field1203; var3++) {
            this.field1204[var3] = arg0.method480();
            this.field1205[var3] = arg0.method480();
        }
    }

    @OriginalMember(owner = "QOBPOZUC", name = "a", descriptor = "(I)V")
    public final void method392(int arg0) {
        this.field1209 = 0;
        this.field1210 = 0;
        this.field1211 = 0;
        this.field1212 = 0;
        this.field1213 = 0;
        if (arg0 != 8) {
            this.field1202 = !this.field1202;
        }
    }

    @OriginalMember(owner = "QOBPOZUC", name = "a", descriptor = "(ZI)I")
    public final int method393(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1213 >= this.field1209) {
            this.field1212 = this.field1205[this.field1210++] << 15;
            if (this.field1210 >= this.field1203) {
                this.field1210 = this.field1203 - 1;
            }
            this.field1209 = (int) ((double) this.field1204[this.field1210] / 65536.0D * (double) arg1);
            if (this.field1209 > this.field1213) {
                this.field1211 = ((this.field1205[this.field1210] << 15) - this.field1212) / (this.field1209 - this.field1213);
            }
        }
        this.field1212 += this.field1211;
        this.field1213++;
        return this.field1212 - this.field1211 >> 15;
    }
}
