import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PFANSVWX")
public class SoundEnvelope {

    @OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "Z")
    private boolean field1345 = true;

    @OriginalMember(owner = "client!PFANSVWX", name = "b", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!PFANSVWX", name = "e", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!PFANSVWX", name = "f", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!PFANSVWX", name = "g", descriptor = "I")
    public int field1351;

    @OriginalMember(owner = "client!PFANSVWX", name = "h", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!PFANSVWX", name = "i", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!PFANSVWX", name = "j", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!PFANSVWX", name = "k", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client!PFANSVWX", name = "l", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!PFANSVWX", name = "m", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!PFANSVWX", name = "c", descriptor = "[I")
    private int[] field1347;

    @OriginalMember(owner = "client!PFANSVWX", name = "d", descriptor = "[I")
    private int[] field1348;

    @OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(BLMFMVIYHT;)V")
    public final void method441(byte arg0, Packet arg1) {
        this.field1351 = arg1.g1();
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.field1349 = arg1.g4();
        this.field1350 = arg1.g4();
        this.method442(arg1, 0);
    }

    @OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(LMFMVIYHT;I)V")
    public final void method442(Packet arg0, int arg1) {
        this.field1346 = arg0.g1();
        this.field1347 = new int[this.field1346];
        this.field1348 = new int[this.field1346];
        if (arg1 == 0) {
            for (int var3 = 0; var3 < this.field1346; var3++) {
                this.field1347[var3] = arg0.g2();
                this.field1348[var3] = arg0.g2();
            }
        }
    }

    @OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(Z)V")
    public final void method443(boolean arg0) {
        this.field1352 = 0;
        this.field1353 = 0;
        if (arg0) {
            this.field1354 = 0;
            this.field1355 = 0;
            this.field1356 = 0;
        }
    }

    @OriginalMember(owner = "client!PFANSVWX", name = "a", descriptor = "(II)I")
    public final int method444(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1356 >= this.field1352) {
            this.field1355 = this.field1348[this.field1353++] << 15;
            if (this.field1353 >= this.field1346) {
                this.field1353 = this.field1346 - 1;
            }
            this.field1352 = (int) ((double) this.field1347[this.field1353] / 65536.0D * (double) arg1);
            if (this.field1352 > this.field1356) {
                this.field1354 = ((this.field1348[this.field1353] << 15) - this.field1355) / (this.field1352 - this.field1356);
            }
        }
        this.field1355 += this.field1354;
        this.field1356++;
        return this.field1355 - this.field1354 >> 15;
    }
}
