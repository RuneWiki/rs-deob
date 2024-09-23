import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NXAZLFDC")
public class class41 {

    @OriginalMember(owner = "NXAZLFDC", name = "a", descriptor = "I")
    private int field1181 = 16191;

    @OriginalMember(owner = "NXAZLFDC", name = "b", descriptor = "Z")
    private boolean field1182 = false;

    @OriginalMember(owner = "NXAZLFDC", name = "c", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "NXAZLFDC", name = "f", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "NXAZLFDC", name = "g", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "NXAZLFDC", name = "h", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "NXAZLFDC", name = "i", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "NXAZLFDC", name = "j", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "NXAZLFDC", name = "k", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "NXAZLFDC", name = "l", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "NXAZLFDC", name = "m", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "NXAZLFDC", name = "n", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "NXAZLFDC", name = "d", descriptor = "[I")
    private int[] field1184;

    @OriginalMember(owner = "NXAZLFDC", name = "e", descriptor = "[I")
    private int[] field1185;

    @OriginalMember(owner = "NXAZLFDC", name = "a", descriptor = "(LLDILQFVA;I)V")
    public final void method498(class34 arg0, int arg1) {
        this.field1188 = arg0.method402();
        if (this.field1181 != arg1) {
            this.field1182 = !this.field1182;
        }
        this.field1186 = arg0.method407();
        this.field1187 = arg0.method407();
        this.method499(arg0, false);
    }

    @OriginalMember(owner = "NXAZLFDC", name = "a", descriptor = "(LLDILQFVA;Z)V")
    public final void method499(class34 arg0, boolean arg1) {
        this.field1183 = arg0.method402();
        if (arg1) {
            this.field1182 = !this.field1182;
        }
        this.field1184 = new int[this.field1183];
        this.field1185 = new int[this.field1183];
        for (int var3 = 0; var3 < this.field1183; var3++) {
            this.field1184[var3] = arg0.method404();
            this.field1185[var3] = arg0.method404();
        }
    }

    @OriginalMember(owner = "NXAZLFDC", name = "a", descriptor = "(I)V")
    public final void method500(int arg0) {
        this.field1189 = 0;
        this.field1190 = 0;
        this.field1191 = 0;
        this.field1192 = 0;
        this.field1193 = 0;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "NXAZLFDC", name = "a", descriptor = "(IB)I")
    public final int method501(int arg0, byte arg1) {
        if (this.field1193 >= this.field1189) {
            this.field1192 = this.field1185[this.field1190++] << 15;
            if (this.field1190 >= this.field1183) {
                this.field1190 = this.field1183 - 1;
            }
            this.field1189 = (int) ((double) this.field1184[this.field1190] / 65536.0D * (double) arg0);
            if (this.field1189 > this.field1193) {
                this.field1191 = ((this.field1185[this.field1190] << 15) - this.field1192) / (this.field1189 - this.field1193);
            }
        }
        this.field1192 += this.field1191;
        this.field1193++;
        if (arg1 != -106) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1192 - this.field1191 >> 15;
    }
}
