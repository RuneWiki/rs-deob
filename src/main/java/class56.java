import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UHTSXKVU")
public class class56 {

    @OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client!UHTSXKVU", name = "b", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!UHTSXKVU", name = "e", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!UHTSXKVU", name = "f", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!UHTSXKVU", name = "g", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!UHTSXKVU", name = "h", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!UHTSXKVU", name = "i", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!UHTSXKVU", name = "j", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!UHTSXKVU", name = "k", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!UHTSXKVU", name = "l", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client!UHTSXKVU", name = "m", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!UHTSXKVU", name = "c", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "client!UHTSXKVU", name = "d", descriptor = "[I")
    private int[] field1337;

    @OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(LRSWRPCHR;B)V")
    public final void method445(class50 arg0, byte arg1) {
        if (arg1 != 46) {
            throw new NullPointerException();
        }
        this.field1340 = arg0.method388();
        this.field1338 = arg0.method393();
        this.field1339 = arg0.method393();
        this.method446(arg0, -7641);
    }

    @OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(LRSWRPCHR;I)V")
    public final void method446(class50 arg0, int arg1) {
        if (arg1 != -7641) {
            this.field1334 = 142;
        }
        this.field1335 = arg0.method388();
        this.field1336 = new int[this.field1335];
        this.field1337 = new int[this.field1335];
        for (int var3 = 0; var3 < this.field1335; var3++) {
            this.field1336[var3] = arg0.method390();
            this.field1337[var3] = arg0.method390();
        }
    }

    @OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(I)V")
    public final void method447(int arg0) {
        this.field1341 = 0;
        if (arg0 == -33980) {
            this.field1342 = 0;
            this.field1343 = 0;
            this.field1344 = 0;
            this.field1345 = 0;
        }
    }

    @OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(II)I")
    public final int method448(int arg0, int arg1) {
        if (this.field1345 >= this.field1341) {
            this.field1344 = this.field1337[this.field1342++] << 15;
            if (this.field1342 >= this.field1335) {
                this.field1342 = this.field1335 - 1;
            }
            this.field1341 = (int) ((double) this.field1336[this.field1342] / 65536.0D * (double) arg1);
            if (this.field1341 > this.field1345) {
                this.field1343 = ((this.field1337[this.field1342] << 15) - this.field1344) / (this.field1341 - this.field1345);
            }
        }
        this.field1344 += this.field1343;
        this.field1345++;
        return arg0 == 0 ? this.field1344 - this.field1343 >> 15 : 2;
    }
}
