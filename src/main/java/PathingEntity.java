import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "x", name = "f", descriptor = "I")
    private int field296 = 737;

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    private int field297 = 42815;

    @OriginalMember(owner = "x", name = "k", descriptor = "Z")
    public boolean field301 = false;

    @OriginalMember(owner = "x", name = "l", descriptor = "I")
    public int field302 = 1;

    @OriginalMember(owner = "x", name = "m", descriptor = "I")
    public int field303 = -1;

    @OriginalMember(owner = "x", name = "n", descriptor = "I")
    public int field304 = -1;

    @OriginalMember(owner = "x", name = "o", descriptor = "I")
    public int field305 = -1;

    @OriginalMember(owner = "x", name = "p", descriptor = "I")
    public int field306 = -1;

    @OriginalMember(owner = "x", name = "q", descriptor = "I")
    public int field307 = -1;

    @OriginalMember(owner = "x", name = "r", descriptor = "I")
    public int field308 = -1;

    @OriginalMember(owner = "x", name = "s", descriptor = "I")
    public int field309 = -1;

    @OriginalMember(owner = "x", name = "u", descriptor = "I")
    public int field311 = 100;

    @OriginalMember(owner = "x", name = "z", descriptor = "I")
    public int field316 = -1000;

    @OriginalMember(owner = "x", name = "C", descriptor = "I")
    public int field319 = -1;

    @OriginalMember(owner = "x", name = "F", descriptor = "I")
    public int field322 = -1;

    @OriginalMember(owner = "x", name = "I", descriptor = "I")
    public int field325 = -1;

    @OriginalMember(owner = "x", name = "N", descriptor = "I")
    public int field330 = -1;

    @OriginalMember(owner = "x", name = "db", descriptor = "[I")
    public int[] field346 = new int[10];

    @OriginalMember(owner = "x", name = "eb", descriptor = "[I")
    public int[] field347 = new int[10];

    @OriginalMember(owner = "x", name = "fb", descriptor = "[Z")
    public boolean[] field348 = new boolean[10];

    @OriginalMember(owner = "x", name = "h", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "x", name = "j", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "x", name = "v", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "x", name = "w", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "x", name = "x", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "x", name = "y", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "x", name = "A", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "x", name = "B", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "x", name = "D", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "x", name = "E", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "x", name = "G", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "x", name = "H", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "x", name = "J", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "x", name = "K", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "x", name = "L", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "x", name = "M", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "x", name = "O", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "x", name = "P", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "x", name = "Q", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "x", name = "R", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "x", name = "S", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "x", name = "T", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "x", name = "U", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "x", name = "V", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "x", name = "W", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "x", name = "X", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "x", name = "Y", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "x", name = "Z", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "x", name = "ab", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "x", name = "bb", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "x", name = "cb", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "x", name = "gb", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "x", name = "t", descriptor = "Ljava/lang/String;")
    public String field310;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIIZ)V")
    public final void method109(int arg0, int arg1, int arg2, boolean arg3) {
        if (this.field325 != -1 && SeqType.field999[this.field325].field1007 <= 1) {
            this.field325 = -1;
        }
        if (!arg3) {
            int var5 = arg1 - this.field346[0];
            int var6 = arg2 - this.field347[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field345 < 9) {
                    this.field345++;
                }
                for (int var7 = this.field345; var7 > 0; var7--) {
                    this.field346[var7] = this.field346[var7 - 1];
                    this.field347[var7] = this.field347[var7 - 1];
                    this.field348[var7] = this.field348[var7 - 1];
                }
                this.field346[0] = arg1;
                this.field347[0] = arg2;
                this.field348[0] = false;
                return;
            }
        }
        this.field345 = 0;
        this.field349 = 0;
        this.field346[0] = arg1;
        this.field347[0] = arg2;
        this.field298 = this.field346[0] * 128 + this.field302 * 64;
        this.field299 = this.field347[0] * 128 + this.field302 * 64;
        int var8 = 30 / arg0;
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(IZI)V")
    public final void method110(int arg0, boolean arg1, int arg2) {
        int var4 = this.field346[0];
        int var5 = this.field347[0];
        if (this.field297 != arg0) {
            this.field296 = -80;
        }
        if (arg2 == 0) {
            var4--;
            var5++;
        }
        if (arg2 == 1) {
            var5++;
        }
        if (arg2 == 2) {
            var4++;
            var5++;
        }
        if (arg2 == 3) {
            var4--;
        }
        if (arg2 == 4) {
            var4++;
        }
        if (arg2 == 5) {
            var4--;
            var5--;
        }
        if (arg2 == 6) {
            var5--;
        }
        if (arg2 == 7) {
            var4++;
            var5--;
        }
        if (this.field325 != -1 && SeqType.field999[this.field325].field1007 <= 1) {
            this.field325 = -1;
        }
        if (this.field345 < 9) {
            this.field345++;
        }
        for (int var6 = this.field345; var6 > 0; var6--) {
            this.field346[var6] = this.field346[var6 - 1];
            this.field347[var6] = this.field347[var6 - 1];
            this.field348[var6] = this.field348[var6 - 1];
        }
        this.field346[0] = var4;
        this.field347[0] = var5;
        this.field348[0] = arg1;
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(I)Z")
    public boolean method111(int arg0) {
        if (arg0 != 35155) {
            throw new NullPointerException();
        }
        return false;
    }
}
