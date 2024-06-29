import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KEEMQUKU")
public class class30 {

    @OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "Z")
    private boolean field1073 = false;

    @OriginalMember(owner = "client!KEEMQUKU", name = "b", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!KEEMQUKU", name = "e", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!KEEMQUKU", name = "f", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!KEEMQUKU", name = "g", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!KEEMQUKU", name = "h", descriptor = "I")
    private int field1080;

    @OriginalMember(owner = "client!KEEMQUKU", name = "i", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!KEEMQUKU", name = "j", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!KEEMQUKU", name = "k", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!KEEMQUKU", name = "l", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!KEEMQUKU", name = "m", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!KEEMQUKU", name = "c", descriptor = "[I")
    private int[] field1075;

    @OriginalMember(owner = "client!KEEMQUKU", name = "d", descriptor = "[I")
    private int[] field1076;

    @OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    public final void method272(class41 arg0, boolean arg1) {
        this.field1079 = arg0.method340();
        this.field1077 = arg0.method345();
        this.field1078 = arg0.method345();
        this.method273(0, arg0);
        if (arg1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(ILPQBRPYKE;)V")
    public final void method273(int arg0, class41 arg1) {
        this.field1074 = arg1.method340();
        this.field1075 = new int[this.field1074];
        if (arg0 != 0) {
            return;
        }
        this.field1076 = new int[this.field1074];
        for (int var3 = 0; var3 < this.field1074; var3++) {
            this.field1075[var3] = arg1.method342();
            this.field1076[var3] = arg1.method342();
        }
    }

    @OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(I)V")
    public final void method274(int arg0) {
        this.field1080 = 0;
        this.field1081 = 0;
        if (arg0 == 0) {
            this.field1082 = 0;
            this.field1083 = 0;
            this.field1084 = 0;
        }
    }

    @OriginalMember(owner = "client!KEEMQUKU", name = "a", descriptor = "(BI)I")
    public final int method275(byte arg0, int arg1) {
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field1073 = !this.field1073;
        }
        if (this.field1084 >= this.field1080) {
            this.field1083 = this.field1076[this.field1081++] << 15;
            if (this.field1081 >= this.field1074) {
                this.field1081 = this.field1074 - 1;
            }
            this.field1080 = (int) ((double) this.field1075[this.field1081] / 65536.0D * (double) arg1);
            if (this.field1080 > this.field1084) {
                this.field1082 = ((this.field1076[this.field1081] << 15) - this.field1083) / (this.field1080 - this.field1084);
            }
        }
        this.field1083 += this.field1082;
        this.field1084++;
        return this.field1083 - this.field1082 >> 15;
    }
}
