import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RRWCTNMK")
public class class50 {

    @OriginalMember(owner = "RRWCTNMK", name = "a", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "RRWCTNMK", name = "b", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "RRWCTNMK", name = "e", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "RRWCTNMK", name = "f", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "RRWCTNMK", name = "g", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "RRWCTNMK", name = "h", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "RRWCTNMK", name = "i", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "RRWCTNMK", name = "j", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "RRWCTNMK", name = "k", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "RRWCTNMK", name = "l", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "RRWCTNMK", name = "m", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "RRWCTNMK", name = "c", descriptor = "[I")
    private int[] field1315;

    @OriginalMember(owner = "RRWCTNMK", name = "d", descriptor = "[I")
    private int[] field1316;

    @OriginalMember(owner = "RRWCTNMK", name = "a", descriptor = "(LEILHLJCE;B)V")
    public final void method443(class17 arg0, byte arg1) {
        this.field1319 = arg0.method224();
        this.field1317 = arg0.method229();
        this.field1318 = arg0.method229();
        if (arg1 != -50) {
            throw new NullPointerException();
        }
        this.method444(arg0, 0);
    }

    @OriginalMember(owner = "RRWCTNMK", name = "a", descriptor = "(LEILHLJCE;I)V")
    public final void method444(class17 arg0, int arg1) {
        this.field1314 = arg0.method224();
        if (arg1 != 0) {
            return;
        }
        this.field1315 = new int[this.field1314];
        this.field1316 = new int[this.field1314];
        for (int var3 = 0; var3 < this.field1314; var3++) {
            this.field1315[var3] = arg0.method226();
            this.field1316[var3] = arg0.method226();
        }
    }

    @OriginalMember(owner = "RRWCTNMK", name = "a", descriptor = "(I)V")
    public final void method445(int arg0) {
        this.field1320 = 0;
        this.field1321 = 0;
        this.field1322 = 0;
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1323 = 0;
        this.field1324 = 0;
    }

    @OriginalMember(owner = "RRWCTNMK", name = "a", descriptor = "(II)I")
    public final int method446(int arg0, int arg1) {
        if (arg0 != 0) {
            return this.field1313;
        }
        if (this.field1324 >= this.field1320) {
            this.field1323 = this.field1316[this.field1321++] << 15;
            if (this.field1321 >= this.field1314) {
                this.field1321 = this.field1314 - 1;
            }
            this.field1320 = (int) ((double) this.field1315[this.field1321] / 65536.0D * (double) arg1);
            if (this.field1320 > this.field1324) {
                this.field1322 = ((this.field1316[this.field1321] << 15) - this.field1323) / (this.field1320 - this.field1324);
            }
        }
        this.field1323 += this.field1322;
        this.field1324++;
        return this.field1323 - this.field1322 >> 15;
    }
}
