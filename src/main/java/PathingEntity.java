import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "x", name = "f", descriptor = "I")
    private int field306 = 19303;

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    private int field307 = 75;

    @OriginalMember(owner = "x", name = "k", descriptor = "Z")
    public boolean field311 = false;

    @OriginalMember(owner = "x", name = "l", descriptor = "I")
    public int field312 = 1;

    @OriginalMember(owner = "x", name = "m", descriptor = "I")
    public int field313 = -1;

    @OriginalMember(owner = "x", name = "n", descriptor = "I")
    public int field314 = -1;

    @OriginalMember(owner = "x", name = "o", descriptor = "I")
    public int field315 = -1;

    @OriginalMember(owner = "x", name = "p", descriptor = "I")
    public int field316 = -1;

    @OriginalMember(owner = "x", name = "q", descriptor = "I")
    public int field317 = -1;

    @OriginalMember(owner = "x", name = "r", descriptor = "I")
    public int field318 = -1;

    @OriginalMember(owner = "x", name = "s", descriptor = "I")
    public int field319 = -1;

    @OriginalMember(owner = "x", name = "u", descriptor = "I")
    public int field321 = 100;

    @OriginalMember(owner = "x", name = "z", descriptor = "I")
    public int field326 = -1000;

    @OriginalMember(owner = "x", name = "C", descriptor = "I")
    public int field329 = -1;

    @OriginalMember(owner = "x", name = "F", descriptor = "I")
    public int field332 = -1;

    @OriginalMember(owner = "x", name = "I", descriptor = "I")
    public int field335 = -1;

    @OriginalMember(owner = "x", name = "N", descriptor = "I")
    public int field340 = -1;

    @OriginalMember(owner = "x", name = "db", descriptor = "[I")
    public int[] field356 = new int[10];

    @OriginalMember(owner = "x", name = "eb", descriptor = "[I")
    public int[] field357 = new int[10];

    @OriginalMember(owner = "x", name = "fb", descriptor = "[Z")
    public boolean[] field358 = new boolean[10];

    @OriginalMember(owner = "x", name = "h", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "x", name = "j", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "x", name = "v", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "x", name = "w", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "x", name = "x", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "x", name = "y", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "x", name = "A", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "x", name = "B", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "x", name = "D", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "x", name = "E", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "x", name = "G", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "x", name = "H", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "x", name = "J", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "x", name = "K", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "x", name = "L", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "x", name = "M", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "x", name = "O", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "x", name = "P", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "x", name = "Q", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "x", name = "R", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "x", name = "S", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "x", name = "T", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "x", name = "U", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "x", name = "V", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "x", name = "W", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "x", name = "X", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "x", name = "Y", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "x", name = "Z", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "x", name = "ab", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "x", name = "bb", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "x", name = "cb", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "x", name = "gb", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "x", name = "t", descriptor = "Ljava/lang/String;")
    public String field320;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIZI)V")
    public final void method110(int arg0, int arg1, boolean arg2, int arg3) {
        if (this.field335 != -1 && SeqType.field1018[this.field335].field1026 <= 1) {
            this.field335 = -1;
        }
        if (!arg2) {
            int var5 = arg0 - this.field356[0];
            int var6 = arg3 - this.field357[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field355 < 9) {
                    this.field355++;
                }
                for (int var7 = this.field355; var7 > 0; var7--) {
                    this.field356[var7] = this.field356[var7 - 1];
                    this.field357[var7] = this.field357[var7 - 1];
                    this.field358[var7] = this.field358[var7 - 1];
                }
                this.field356[0] = arg0;
                this.field357[0] = arg3;
                this.field358[0] = false;
                return;
            }
        }
        this.field355 = 0;
        this.field359 = 0;
        this.field356[0] = arg0;
        this.field357[0] = arg3;
        while (arg1 >= 0) {
            this.field306 = 448;
        }
        this.field308 = this.field356[0] * 128 + this.field312 * 64;
        this.field309 = this.field357[0] * 128 + this.field312 * 64;
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(IZI)V")
    public final void method111(int arg0, boolean arg1, int arg2) {
        int var4 = this.field356[0];
        int var5 = this.field357[0];
        if (arg0 == 0) {
            var4--;
            var5++;
        }
        if (arg0 == 1) {
            var5++;
        }
        if (arg0 == 2) {
            var4++;
            var5++;
        }
        if (arg0 == 3) {
            var4--;
        }
        if (arg0 == 4) {
            var4++;
        }
        if (arg0 == 5) {
            var4--;
            var5--;
        }
        if (arg0 == 6) {
            var5--;
        }
        if (arg0 == 7) {
            var4++;
            var5--;
        }
        if (this.field335 != -1 && SeqType.field1018[this.field335].field1026 <= 1) {
            this.field335 = -1;
        }
        if (this.field355 < 9) {
            this.field355++;
        }
        for (int var6 = this.field355; var6 > 0; var6--) {
            this.field356[var6] = this.field356[var6 - 1];
            this.field357[var6] = this.field357[var6 - 1];
            this.field358[var6] = this.field358[var6 - 1];
        }
        this.field356[0] = var4;
        this.field357[0] = var5;
        this.field358[0] = arg1;
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "x", name = "b", descriptor = "(I)Z")
    public boolean method112(int arg0) {
        if (arg0 <= 0) {
            this.field306 = -350;
        }
        return false;
    }
}
