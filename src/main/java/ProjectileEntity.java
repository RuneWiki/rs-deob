import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KFJRVZCI")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "client!KFJRVZCI", name = "u", descriptor = "Z")
    private boolean field982 = false;

    @OriginalMember(owner = "client!KFJRVZCI", name = "x", descriptor = "B")
    private byte field985 = -41;

    @OriginalMember(owner = "client!KFJRVZCI", name = "G", descriptor = "Z")
    private boolean field994 = true;

    @OriginalMember(owner = "client!KFJRVZCI", name = "I", descriptor = "Z")
    public boolean field996 = false;

    @OriginalMember(owner = "client!KFJRVZCI", name = "m", descriptor = "LMNZYLKNY;")
    private SpotAnimType field974;

    @OriginalMember(owner = "client!KFJRVZCI", name = "n", descriptor = "I")
    public int field975;

    @OriginalMember(owner = "client!KFJRVZCI", name = "J", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!KFJRVZCI", name = "K", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!KFJRVZCI", name = "L", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!KFJRVZCI", name = "y", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!KFJRVZCI", name = "z", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!KFJRVZCI", name = "r", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!KFJRVZCI", name = "s", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!KFJRVZCI", name = "t", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!KFJRVZCI", name = "M", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!KFJRVZCI", name = "o", descriptor = "D")
    public double field976;

    @OriginalMember(owner = "client!KFJRVZCI", name = "p", descriptor = "D")
    public double field977;

    @OriginalMember(owner = "client!KFJRVZCI", name = "q", descriptor = "D")
    public double field978;

    @OriginalMember(owner = "client!KFJRVZCI", name = "C", descriptor = "D")
    private double field990;

    @OriginalMember(owner = "client!KFJRVZCI", name = "D", descriptor = "D")
    private double field991;

    @OriginalMember(owner = "client!KFJRVZCI", name = "E", descriptor = "D")
    private double field992;

    @OriginalMember(owner = "client!KFJRVZCI", name = "F", descriptor = "D")
    private double field993;

    @OriginalMember(owner = "client!KFJRVZCI", name = "H", descriptor = "D")
    private double field995;

    @OriginalMember(owner = "client!KFJRVZCI", name = "v", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!KFJRVZCI", name = "w", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!KFJRVZCI", name = "A", descriptor = "I")
    private int field988;

    @OriginalMember(owner = "client!KFJRVZCI", name = "B", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(IIIII)V")
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field996) {
            double var6 = (double) (arg0 - this.field997);
            double var8 = (double) (arg1 - this.field998);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field976 = (double) this.field980 * var6 / var10 + (double) this.field997;
            this.field977 = (double) this.field980 * var8 / var10 + (double) this.field998;
            this.field978 = this.field999;
        }
        double var12 = (double) (this.field987 + 1 - arg3);
        this.field990 = ((double) arg0 - this.field976) / var12;
        this.field991 = ((double) arg1 - this.field977) / var12;
        if (arg4 != 0) {
            return;
        }
        this.field992 = Math.sqrt(this.field991 * this.field991 + this.field990 * this.field990);
        if (!this.field996) {
            this.field993 = -this.field992 * Math.tan((double) this.field979 * 0.02454369D);
        }
        this.field995 = ((double) arg2 - this.field978 - this.field993 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(IZ)V")
    public final void method272(int arg0, boolean arg1) {
        this.field996 = true;
        this.field976 += (double) arg0 * this.field990;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field977 += (double) arg0 * this.field991;
        this.field978 += this.field995 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field993;
        this.field993 += (double) arg0 * this.field995;
        this.field983 = (int) (Math.atan2(this.field990, this.field991) * 325.949D) + 1024 & 0x7FF;
        this.field984 = (int) (Math.atan2(this.field993, this.field992) * 325.949D) & 0x7FF;
        if (this.field974.field1301 == null) {
            return;
        }
        this.field989 += arg0;
        while (this.field989 > this.field974.field1301.method214(0, this.field988)) {
            this.field989 -= this.field974.field1301.method214(0, this.field988);
            this.field988++;
            if (this.field988 >= this.field974.field1301.field776) {
                this.field988 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(B)LLZYQDKJV;")
    public final Model method239(byte arg0) {
        Model var2 = this.field974.method439();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field974.field1301 != null) {
            var3 = this.field974.field1301.field777[this.field988];
        }
        Model var4 = new Model(false, false, true, var2, AnimFrame.method265(this.field994, var3));
        if (var3 != -1) {
            var4.method366(7);
            var4.method367(var3, (byte) 6);
            var4.field1226 = null;
            var4.field1225 = null;
        }
        if (this.field974.field1304 != 128 || this.field974.field1305 != 128) {
            var4.method375(this.field974.field1305, this.field974.field1304, 9, this.field974.field1304);
        }
        var4.method371(this.field984, 341);
        var4.method376(this.field974.field1307 + 64, this.field974.field1308 + 850, -30, -50, -30, true);
        if (arg0 == 3) {
            boolean var5 = false;
        } else {
            this.field982 = !this.field982;
        }
        return var4;
    }

    @OriginalMember(owner = "client!KFJRVZCI", name = "<init>", descriptor = "(IIIIIIIIBIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        this.field974 = SpotAnimType.field1297[arg4];
        this.field975 = arg0;
        this.field997 = arg10;
        this.field998 = arg3;
        this.field999 = arg9;
        this.field986 = arg11;
        this.field987 = arg5;
        if (this.field985 != arg8) {
            throw new NullPointerException();
        }
        this.field979 = arg6;
        this.field980 = arg2;
        this.field981 = arg7;
        this.field1000 = arg1;
        this.field996 = false;
    }
}
