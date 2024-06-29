import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LMFHFXBO")
public class class34 {

    @OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "I")
    private int field1125 = 473;

    @OriginalMember(owner = "client!LMFHFXBO", name = "b", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client!LMFHFXBO", name = "e", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!LMFHFXBO", name = "f", descriptor = "I")
    public int field1130;

    @OriginalMember(owner = "client!LMFHFXBO", name = "g", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!LMFHFXBO", name = "h", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!LMFHFXBO", name = "i", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!LMFHFXBO", name = "j", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client!LMFHFXBO", name = "k", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client!LMFHFXBO", name = "l", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!LMFHFXBO", name = "m", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!LMFHFXBO", name = "c", descriptor = "[I")
    private int[] field1127;

    @OriginalMember(owner = "client!LMFHFXBO", name = "d", descriptor = "[I")
    private int[] field1128;

    @OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public final void method356(class37 arg0, int arg1) {
        this.field1131 = arg0.method386();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1129 = arg0.method391();
        this.field1130 = arg0.method391();
        this.method357(0, arg0);
    }

    @OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(ILMNKDCXXG;)V")
    public final void method357(int arg0, class37 arg1) {
        this.field1126 = arg1.method386();
        this.field1127 = new int[this.field1126];
        if (arg0 != 0) {
            return;
        }
        this.field1128 = new int[this.field1126];
        for (int var3 = 0; var3 < this.field1126; var3++) {
            this.field1127[var3] = arg1.method388();
            this.field1128[var3] = arg1.method388();
        }
    }

    @OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(B)V")
    public final void method358(byte arg0) {
        this.field1132 = 0;
        this.field1133 = 0;
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1125 = 73;
        }
        this.field1134 = 0;
        this.field1135 = 0;
        this.field1136 = 0;
    }

    @OriginalMember(owner = "client!LMFHFXBO", name = "a", descriptor = "(II)I")
    public final int method359(int arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1136 >= this.field1132) {
            this.field1135 = this.field1128[this.field1133++] << 15;
            if (this.field1133 >= this.field1126) {
                this.field1133 = this.field1126 - 1;
            }
            this.field1132 = (int) ((double) this.field1127[this.field1133] / 65536.0D * (double) arg0);
            if (this.field1132 > this.field1136) {
                this.field1134 = ((this.field1128[this.field1133] << 15) - this.field1135) / (this.field1132 - this.field1136);
            }
        }
        this.field1135 += this.field1134;
        this.field1136++;
        return this.field1135 - this.field1134 >> 15;
    }
}
