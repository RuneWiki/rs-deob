import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bc")
public class Envelope {

    @OriginalMember(owner = "bc", name = "a", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "bc", name = "d", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "bc", name = "e", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "bc", name = "f", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "bc", name = "g", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "bc", name = "h", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "bc", name = "i", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "bc", name = "j", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "bc", name = "k", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "bc", name = "b", descriptor = "[I")
    private int[] field913;

    @OriginalMember(owner = "bc", name = "c", descriptor = "[I")
    private int[] field914;

    @OriginalMember(owner = "bc", name = "a", descriptor = "(Lmb;B)V")
    public final void method319(Packet arg0, byte arg1) {
        this.field917 = arg0.method239();
        this.field915 = arg0.method244();
        this.field916 = arg0.method244();
        this.field912 = arg0.method239();
        this.field913 = new int[this.field912];
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        this.field914 = new int[this.field912];
        for (int var3 = 0; var3 < this.field912; var3++) {
            this.field913[var3] = arg0.method241();
            this.field914[var3] = arg0.method241();
        }
        if (Linkable.field393) {
        }
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(I)V")
    public final void method320(int arg0) {
        this.field918 = 0;
        this.field919 = 0;
        this.field920 = 0;
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field921 = 0;
        this.field922 = 0;
    }

    @OriginalMember(owner = "bc", name = "a", descriptor = "(ZI)I")
    public final int method321(boolean arg0, int arg1) {
        if (this.field922 >= this.field918) {
            this.field921 = this.field914[this.field919++] << 15;
            if (this.field919 >= this.field912) {
                this.field919 = this.field912 - 1;
            }
            this.field918 = (int) ((double) this.field913[this.field919] / 65536.0D * (double) arg1);
            if (this.field918 > this.field922) {
                this.field920 = ((this.field914[this.field919] << 15) - this.field921) / (this.field918 - this.field922);
            }
        }
        this.field921 += this.field920;
        this.field922++;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field921 - this.field920 >> 15;
    }
}
