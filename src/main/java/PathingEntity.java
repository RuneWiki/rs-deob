import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "x", name = "h", descriptor = "Z")
    private boolean field303 = false;

    @OriginalMember(owner = "x", name = "l", descriptor = "Z")
    public boolean field307 = false;

    @OriginalMember(owner = "x", name = "m", descriptor = "I")
    public int field308 = 1;

    @OriginalMember(owner = "x", name = "n", descriptor = "I")
    public int field309 = -1;

    @OriginalMember(owner = "x", name = "o", descriptor = "I")
    public int field310 = -1;

    @OriginalMember(owner = "x", name = "p", descriptor = "I")
    public int field311 = -1;

    @OriginalMember(owner = "x", name = "q", descriptor = "I")
    public int field312 = -1;

    @OriginalMember(owner = "x", name = "r", descriptor = "I")
    public int field313 = -1;

    @OriginalMember(owner = "x", name = "s", descriptor = "I")
    public int field314 = -1;

    @OriginalMember(owner = "x", name = "t", descriptor = "I")
    public int field315 = -1;

    @OriginalMember(owner = "x", name = "v", descriptor = "I")
    public int field317 = 100;

    @OriginalMember(owner = "x", name = "A", descriptor = "I")
    public int field322 = -1000;

    @OriginalMember(owner = "x", name = "D", descriptor = "I")
    public int field325 = -1;

    @OriginalMember(owner = "x", name = "G", descriptor = "I")
    public int field328 = -1;

    @OriginalMember(owner = "x", name = "J", descriptor = "I")
    public int field331 = -1;

    @OriginalMember(owner = "x", name = "O", descriptor = "I")
    public int field336 = -1;

    @OriginalMember(owner = "x", name = "eb", descriptor = "[I")
    public int[] field352 = new int[10];

    @OriginalMember(owner = "x", name = "fb", descriptor = "[I")
    public int[] field353 = new int[10];

    @OriginalMember(owner = "x", name = "gb", descriptor = "[Z")
    public boolean[] field354 = new boolean[10];

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "x", name = "j", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "x", name = "w", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "x", name = "x", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "x", name = "y", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "x", name = "z", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "x", name = "B", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "x", name = "C", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "x", name = "E", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "x", name = "F", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "x", name = "H", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "x", name = "I", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "x", name = "K", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "x", name = "L", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "x", name = "M", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "x", name = "N", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "x", name = "P", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "x", name = "Q", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "x", name = "R", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "x", name = "S", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "x", name = "T", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "x", name = "U", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "x", name = "V", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "x", name = "W", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "x", name = "X", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "x", name = "Y", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "x", name = "Z", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "x", name = "ab", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "x", name = "bb", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "x", name = "cb", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "x", name = "db", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "x", name = "hb", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "x", name = "u", descriptor = "Ljava/lang/String;")
    public String field316;

    @OriginalMember(owner = "x", name = "a", descriptor = "(IIIZ)V")
    public final void method108(int arg0, int arg1, int arg2, boolean arg3) {
        if (this.field331 != -1 && SeqType.field1026[this.field331].field1034 <= 1) {
            this.field331 = -1;
        }
        if (!arg3) {
            int var5 = arg1 - this.field352[0];
            int var6 = arg2 - this.field353[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field351 < 9) {
                    this.field351++;
                }
                for (int var7 = this.field351; var7 > 0; var7--) {
                    this.field352[var7] = this.field352[var7 - 1];
                    this.field353[var7] = this.field353[var7 - 1];
                    this.field354[var7] = this.field354[var7 - 1];
                }
                this.field352[0] = arg1;
                this.field353[0] = arg2;
                this.field354[0] = false;
                return;
            }
        }
        this.field351 = 0;
        if (arg0 >= 0) {
            return;
        }
        this.field355 = 0;
        this.field352[0] = arg1;
        this.field353[0] = arg2;
        this.field304 = this.field352[0] * 128 + this.field308 * 64;
        this.field305 = this.field353[0] * 128 + this.field308 * 64;
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(ZIZ)V")
    public final void method109(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field303 = !this.field303;
        }
        int var4 = this.field352[0];
        int var5 = this.field353[0];
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
        if (this.field331 != -1 && SeqType.field1026[this.field331].field1034 <= 1) {
            this.field331 = -1;
        }
        if (this.field351 < 9) {
            this.field351++;
        }
        for (int var6 = this.field351; var6 > 0; var6--) {
            this.field352[var6] = this.field352[var6 - 1];
            this.field353[var6] = this.field353[var6 - 1];
            this.field354[var6] = this.field354[var6 - 1];
        }
        this.field352[0] = var4;
        this.field353[0] = var5;
        this.field354[0] = arg0;
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(Z)Z")
    public boolean method110(boolean arg0) {
        if (arg0) {
            this.field302 = -498;
        }
        return false;
    }
}
