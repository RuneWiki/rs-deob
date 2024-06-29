import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!x")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "client!x", name = "e", descriptor = "Z")
    private boolean field304 = false;

    @OriginalMember(owner = "client!x", name = "i", descriptor = "Z")
    public boolean field308 = false;

    @OriginalMember(owner = "client!x", name = "j", descriptor = "I")
    public int field309 = 1;

    @OriginalMember(owner = "client!x", name = "k", descriptor = "I")
    public int field310 = -1;

    @OriginalMember(owner = "client!x", name = "l", descriptor = "I")
    public int field311 = -1;

    @OriginalMember(owner = "client!x", name = "m", descriptor = "I")
    public int field312 = -1;

    @OriginalMember(owner = "client!x", name = "n", descriptor = "I")
    public int field313 = -1;

    @OriginalMember(owner = "client!x", name = "o", descriptor = "I")
    public int field314 = -1;

    @OriginalMember(owner = "client!x", name = "p", descriptor = "I")
    public int field315 = -1;

    @OriginalMember(owner = "client!x", name = "q", descriptor = "I")
    public int field316 = -1;

    @OriginalMember(owner = "client!x", name = "s", descriptor = "I")
    public int field318 = 100;

    @OriginalMember(owner = "client!x", name = "x", descriptor = "I")
    public int field323 = -1000;

    @OriginalMember(owner = "client!x", name = "A", descriptor = "I")
    public int field326 = -1;

    @OriginalMember(owner = "client!x", name = "D", descriptor = "I")
    public int field329 = -1;

    @OriginalMember(owner = "client!x", name = "G", descriptor = "I")
    public int field332 = -1;

    @OriginalMember(owner = "client!x", name = "L", descriptor = "I")
    public int field337 = -1;

    @OriginalMember(owner = "client!x", name = "bb", descriptor = "[I")
    public int[] field353 = new int[10];

    @OriginalMember(owner = "client!x", name = "cb", descriptor = "[I")
    public int[] field354 = new int[10];

    @OriginalMember(owner = "client!x", name = "db", descriptor = "[Z")
    public boolean[] field355 = new boolean[10];

    @OriginalMember(owner = "client!x", name = "f", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!x", name = "g", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!x", name = "h", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!x", name = "t", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!x", name = "u", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!x", name = "v", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!x", name = "w", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!x", name = "y", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!x", name = "z", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!x", name = "B", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!x", name = "C", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!x", name = "E", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!x", name = "F", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!x", name = "H", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!x", name = "I", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!x", name = "J", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!x", name = "K", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!x", name = "M", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!x", name = "N", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "client!x", name = "O", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!x", name = "P", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!x", name = "Q", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!x", name = "R", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!x", name = "S", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!x", name = "T", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!x", name = "U", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!x", name = "V", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!x", name = "W", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "client!x", name = "X", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!x", name = "Y", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!x", name = "Z", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!x", name = "ab", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!x", name = "eb", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!x", name = "r", descriptor = "Ljava/lang/String;")
    public String field317;

    @OriginalMember(owner = "client!x", name = "a", descriptor = "(IZIZ)V")
    public final void method109(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (this.field332 != -1 && SeqType.field1023[this.field332].field1031 <= 1) {
            this.field332 = -1;
        }
        if (!arg1) {
            int var5 = arg2 - this.field353[0];
            int var6 = arg0 - this.field354[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field352 < 9) {
                    this.field352++;
                }
                for (int var7 = this.field352; var7 > 0; var7--) {
                    this.field353[var7] = this.field353[var7 - 1];
                    this.field354[var7] = this.field354[var7 - 1];
                    this.field355[var7] = this.field355[var7 - 1];
                }
                this.field353[0] = arg2;
                this.field354[0] = arg0;
                this.field355[0] = false;
                return;
            }
        }
        this.field352 = 0;
        this.field356 = 0;
        this.field353[0] = arg2;
        this.field354[0] = arg0;
        this.field305 = this.field353[0] * 128 + this.field309 * 64;
        if (!arg3) {
            this.field306 = this.field354[0] * 128 + this.field309 * 64;
        }
    }

    @OriginalMember(owner = "client!x", name = "a", descriptor = "(IZB)V")
    public final void method110(int arg0, boolean arg1, byte arg2) {
        int var4 = this.field353[0];
        int var5 = this.field354[0];
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
        if (this.field332 != -1 && SeqType.field1023[this.field332].field1031 <= 1) {
            this.field332 = -1;
        }
        if (this.field352 < 9) {
            this.field352++;
        }
        for (int var6 = this.field352; var6 > 0; var6--) {
            this.field353[var6] = this.field353[var6 - 1];
            this.field354[var6] = this.field354[var6 - 1];
            this.field355[var6] = this.field355[var6 - 1];
        }
        this.field353[0] = var4;
        if (arg2 != 8) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field354[0] = var5;
        this.field355[0] = arg1;
    }

    @OriginalMember(owner = "client!x", name = "a", descriptor = "(Z)Z")
    public boolean method111(boolean arg0) {
        if (!arg0) {
            this.field304 = !this.field304;
        }
        return false;
    }
}
