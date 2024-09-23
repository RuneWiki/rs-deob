import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NSRSHTPL")
public class class38 {

    @OriginalMember(owner = "NSRSHTPL", name = "a", descriptor = "B")
    private byte field1080 = 44;

    @OriginalMember(owner = "NSRSHTPL", name = "b", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "NSRSHTPL", name = "c", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "NSRSHTPL", name = "f", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "NSRSHTPL", name = "g", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "NSRSHTPL", name = "h", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "NSRSHTPL", name = "i", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "NSRSHTPL", name = "j", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "NSRSHTPL", name = "k", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "NSRSHTPL", name = "l", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "NSRSHTPL", name = "m", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "NSRSHTPL", name = "n", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "NSRSHTPL", name = "d", descriptor = "[I")
    private int[] field1083;

    @OriginalMember(owner = "NSRSHTPL", name = "e", descriptor = "[I")
    private int[] field1084;

    @OriginalMember(owner = "NSRSHTPL", name = "a", descriptor = "(BLYOXDZEVD;)V")
    public final void method338(byte arg0, class68 arg1) {
        if (this.field1080 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1087 = arg1.method549();
        this.field1085 = arg1.method554();
        this.field1086 = arg1.method554();
        this.method339(796, arg1);
    }

    @OriginalMember(owner = "NSRSHTPL", name = "a", descriptor = "(ILYOXDZEVD;)V")
    public final void method339(int arg0, class68 arg1) {
        if (arg0 <= 0) {
            return;
        }
        this.field1082 = arg1.method549();
        this.field1083 = new int[this.field1082];
        this.field1084 = new int[this.field1082];
        for (int var3 = 0; var3 < this.field1082; var3++) {
            this.field1083[var3] = arg1.method551();
            this.field1084[var3] = arg1.method551();
        }
    }

    @OriginalMember(owner = "NSRSHTPL", name = "a", descriptor = "(B)V")
    public final void method340(byte arg0) {
        this.field1088 = 0;
        this.field1089 = 0;
        if (arg0 == 0) {
            this.field1090 = 0;
            this.field1091 = 0;
            this.field1092 = 0;
        }
    }

    @OriginalMember(owner = "NSRSHTPL", name = "a", descriptor = "(II)I")
    public final int method341(int arg0, int arg1) {
        if (arg1 != 49916) {
            return this.field1081;
        }
        if (this.field1092 >= this.field1088) {
            this.field1091 = this.field1084[this.field1089++] << 15;
            if (this.field1089 >= this.field1082) {
                this.field1089 = this.field1082 - 1;
            }
            this.field1088 = (int) ((double) this.field1083[this.field1089] / 65536.0D * (double) arg0);
            if (this.field1088 > this.field1092) {
                this.field1090 = ((this.field1084[this.field1089] << 15) - this.field1091) / (this.field1088 - this.field1092);
            }
        }
        this.field1091 += this.field1090;
        this.field1092++;
        return this.field1091 - this.field1090 >> 15;
    }
}
