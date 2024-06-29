import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JOBKQXED")
public class class32 {

    @OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "Z")
    private boolean field967 = true;

    @OriginalMember(owner = "client!JOBKQXED", name = "b", descriptor = "I")
    private int field968 = -12929;

    @OriginalMember(owner = "client!JOBKQXED", name = "c", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!JOBKQXED", name = "f", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!JOBKQXED", name = "g", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!JOBKQXED", name = "h", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!JOBKQXED", name = "i", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!JOBKQXED", name = "j", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!JOBKQXED", name = "k", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!JOBKQXED", name = "l", descriptor = "I")
    private int field978;

    @OriginalMember(owner = "client!JOBKQXED", name = "m", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "client!JOBKQXED", name = "n", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!JOBKQXED", name = "d", descriptor = "[I")
    private int[] field970;

    @OriginalMember(owner = "client!JOBKQXED", name = "e", descriptor = "[I")
    private int[] field971;

    @OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(LCMGGUSPR;I)V")
    public final void method337(class10 arg0, int arg1) {
        this.field974 = arg0.method194();
        while (arg1 >= 0) {
            this.field967 = !this.field967;
        }
        this.field972 = arg0.method199();
        this.field973 = arg0.method199();
        this.method338(true, arg0);
    }

    @OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(ZLCMGGUSPR;)V")
    public final void method338(boolean arg0, class10 arg1) {
        if (!arg0) {
            this.field968 = -466;
        }
        this.field969 = arg1.method194();
        this.field970 = new int[this.field969];
        this.field971 = new int[this.field969];
        for (int var3 = 0; var3 < this.field969; var3++) {
            this.field970[var3] = arg1.method196();
            this.field971[var3] = arg1.method196();
        }
    }

    @OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(B)V")
    public final void method339(byte arg0) {
        this.field975 = 0;
        if (arg0 != 3) {
            return;
        }
        boolean var2 = false;
        this.field976 = 0;
        this.field977 = 0;
        this.field978 = 0;
        this.field979 = 0;
    }

    @OriginalMember(owner = "client!JOBKQXED", name = "a", descriptor = "(IB)I")
    public final int method340(int arg0, byte arg1) {
        if (arg1 != 8) {
            this.field967 = !this.field967;
        }
        if (this.field979 >= this.field975) {
            this.field978 = this.field971[this.field976++] << 15;
            if (this.field976 >= this.field969) {
                this.field976 = this.field969 - 1;
            }
            this.field975 = (int) ((double) this.field970[this.field976] / 65536.0D * (double) arg0);
            if (this.field975 > this.field979) {
                this.field977 = ((this.field971[this.field976] << 15) - this.field978) / (this.field975 - this.field979);
            }
        }
        this.field978 += this.field977;
        this.field979++;
        return this.field978 - this.field977 >> 15;
    }
}
