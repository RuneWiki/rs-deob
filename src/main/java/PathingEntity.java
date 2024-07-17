import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "x", name = "e", descriptor = "I")
    private int field298 = 332;

    @OriginalMember(owner = "x", name = "f", descriptor = "Z")
    private boolean field299 = false;

    @OriginalMember(owner = "x", name = "j", descriptor = "Z")
    public boolean field303 = false;

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    public int field304 = 1;

    @OriginalMember(owner = "x", name = "l", descriptor = "I")
    public int field305 = -1;

    @OriginalMember(owner = "x", name = "m", descriptor = "I")
    public int field306 = -1;

    @OriginalMember(owner = "x", name = "n", descriptor = "I")
    public int field307 = -1;

    @OriginalMember(owner = "x", name = "o", descriptor = "I")
    public int field308 = -1;

    @OriginalMember(owner = "x", name = "p", descriptor = "I")
    public int field309 = -1;

    @OriginalMember(owner = "x", name = "q", descriptor = "I")
    public int field310 = -1;

    @OriginalMember(owner = "x", name = "r", descriptor = "I")
    public int field311 = -1;

    @OriginalMember(owner = "x", name = "t", descriptor = "I")
    public int field313 = 100;

    @OriginalMember(owner = "x", name = "y", descriptor = "I")
    public int field318 = -1000;

    @OriginalMember(owner = "x", name = "B", descriptor = "I")
    public int field321 = -1;

    @OriginalMember(owner = "x", name = "E", descriptor = "I")
    public int field324 = -1;

    @OriginalMember(owner = "x", name = "H", descriptor = "I")
    public int field327 = -1;

    @OriginalMember(owner = "x", name = "M", descriptor = "I")
    public int field332 = -1;

    @OriginalMember(owner = "x", name = "cb", descriptor = "[I")
    public int[] field348 = new int[10];

    @OriginalMember(owner = "x", name = "db", descriptor = "[I")
    public int[] field349 = new int[10];

    @OriginalMember(owner = "x", name = "eb", descriptor = "[Z")
    public boolean[] field350 = new boolean[10];

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "x", name = "h", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "x", name = "u", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "x", name = "v", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "x", name = "w", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "x", name = "x", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "x", name = "z", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "x", name = "A", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "x", name = "C", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "x", name = "D", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "x", name = "F", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "x", name = "G", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "x", name = "I", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "x", name = "J", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "x", name = "K", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "x", name = "L", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "x", name = "N", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "x", name = "O", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "x", name = "P", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "x", name = "Q", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "x", name = "R", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "x", name = "S", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "x", name = "T", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "x", name = "U", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "x", name = "V", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "x", name = "W", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "x", name = "X", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "x", name = "Y", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "x", name = "Z", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "x", name = "ab", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "x", name = "bb", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "x", name = "fb", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "x", name = "s", descriptor = "Ljava/lang/String;")
    public String field312;

    @OriginalMember(owner = "x", name = "a", descriptor = "(ZZII)V")
    public final void method110(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (this.field327 != -1 && SeqType.field1028[this.field327].field1036 <= 1) {
            this.field327 = -1;
        }
        if (!arg1) {
            int var5 = arg2 - this.field348[0];
            int var6 = arg3 - this.field349[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field347 < 9) {
                    this.field347++;
                }
                for (int var7 = this.field347; var7 > 0; var7--) {
                    this.field348[var7] = this.field348[var7 - 1];
                    this.field349[var7] = this.field349[var7 - 1];
                    this.field350[var7] = this.field350[var7 - 1];
                }
                this.field348[0] = arg2;
                this.field349[0] = arg3;
                this.field350[0] = false;
                return;
            }
        }
        this.field347 = 0;
        this.field351 = 0;
        this.field348[0] = arg2;
        if (!arg0) {
            this.field349[0] = arg3;
            this.field300 = this.field348[0] * 128 + this.field304 * 64;
            this.field301 = this.field349[0] * 128 + this.field304 * 64;
        }
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(ZIB)V")
    public final void method111(boolean arg0, int arg1, byte arg2) {
        int var4 = this.field348[0];
        int var5 = this.field349[0];
        if (arg2 == 6) {
            boolean var6 = false;
        } else {
            this.field298 = 243;
        }
        if (arg1 == 0) {
            var4--;
            var5++;
        }
        if (arg1 == 1) {
            var5++;
        }
        if (arg1 == 2) {
            var4++;
            var5++;
        }
        if (arg1 == 3) {
            var4--;
        }
        if (arg1 == 4) {
            var4++;
        }
        if (arg1 == 5) {
            var4--;
            var5--;
        }
        if (arg1 == 6) {
            var5--;
        }
        if (arg1 == 7) {
            var4++;
            var5--;
        }
        if (this.field327 != -1 && SeqType.field1028[this.field327].field1036 <= 1) {
            this.field327 = -1;
        }
        if (this.field347 < 9) {
            this.field347++;
        }
        for (int var7 = this.field347; var7 > 0; var7--) {
            this.field348[var7] = this.field348[var7 - 1];
            this.field349[var7] = this.field349[var7 - 1];
            this.field350[var7] = this.field350[var7 - 1];
        }
        this.field348[0] = var4;
        this.field349[0] = var5;
        this.field350[0] = arg0;
    }

    @OriginalMember(owner = "x", name = "b", descriptor = "(Z)Z")
    public boolean method112(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return false;
    }
}
