import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class94 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field1192 = 2;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[I")
    private int[] field1190 = new int[2];

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    private int[] field1193 = new int[2];

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V", line = 10)
    public final void method644() {
        this.field1198 = 0;
        this.field1200 = 0;
        this.field1199 = 0;
        this.field1196 = 0;
        this.field1197 = 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ltn;)V", line = 18)
    public final void method645(class179 arg0) {
        this.field1192 = arg0.method1094(255);
        this.field1190 = new int[this.field1192];
        this.field1193 = new int[this.field1192];
        for (int var2 = 0; var2 < this.field1192; var2++) {
            this.field1190[var2] = arg0.method1107(false);
            this.field1193[var2] = arg0.method1107(false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 32)
    public class94() {
        this.field1190[0] = 0;
        this.field1190[1] = 65535;
        this.field1193[0] = 0;
        this.field1193[1] = 65535;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Ltn;)V", line = 43)
    public final void method646(class179 arg0) {
        this.field1195 = arg0.method1094(255);
        this.field1191 = arg0.method1095((byte) 118);
        this.field1194 = arg0.method1095((byte) 116);
        this.method645(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I", line = 53)
    public final int method647(int arg0) {
        if (this.field1197 >= this.field1198) {
            this.field1196 = this.field1193[this.field1200++] << 15;
            if (this.field1200 >= this.field1192) {
                this.field1200 = this.field1192 - 1;
            }
            this.field1198 = (int) ((double) this.field1190[this.field1200] / 65536.0D * (double) arg0);
            if (this.field1198 > this.field1197) {
                this.field1199 = ((this.field1193[this.field1200] << 15) - this.field1196) / (this.field1198 - this.field1197);
            }
        }
        this.field1196 += this.field1199;
        this.field1197++;
        return this.field1196 - this.field1199 >> 15;
    }
}
