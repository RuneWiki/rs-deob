import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("x")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "x", name = "e", descriptor = "I")
    private int field291 = 49498;

    @OriginalMember(owner = "x", name = "j", descriptor = "I")
    public int field296 = 1;

    @OriginalMember(owner = "x", name = "k", descriptor = "I")
    public int field297 = -1;

    @OriginalMember(owner = "x", name = "l", descriptor = "I")
    public int field298 = -1;

    @OriginalMember(owner = "x", name = "m", descriptor = "I")
    public int field299 = -1;

    @OriginalMember(owner = "x", name = "n", descriptor = "I")
    public int field300 = -1;

    @OriginalMember(owner = "x", name = "o", descriptor = "I")
    public int field301 = -1;

    @OriginalMember(owner = "x", name = "p", descriptor = "I")
    public int field302 = -1;

    @OriginalMember(owner = "x", name = "q", descriptor = "I")
    public int field303 = -1;

    @OriginalMember(owner = "x", name = "s", descriptor = "I")
    public int field305 = 100;

    @OriginalMember(owner = "x", name = "x", descriptor = "I")
    public int field310 = -1000;

    @OriginalMember(owner = "x", name = "A", descriptor = "I")
    public int field313 = -1;

    @OriginalMember(owner = "x", name = "D", descriptor = "I")
    public int field316 = -1;

    @OriginalMember(owner = "x", name = "G", descriptor = "I")
    public int field319 = -1;

    @OriginalMember(owner = "x", name = "L", descriptor = "I")
    public int field324 = -1;

    @OriginalMember(owner = "x", name = "bb", descriptor = "[I")
    public int[] field340 = new int[10];

    @OriginalMember(owner = "x", name = "cb", descriptor = "[I")
    public int[] field341 = new int[10];

    @OriginalMember(owner = "x", name = "db", descriptor = "[Z")
    public boolean[] field342 = new boolean[10];

    @OriginalMember(owner = "x", name = "f", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "x", name = "g", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "x", name = "h", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "x", name = "i", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "x", name = "t", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "x", name = "u", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "x", name = "v", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "x", name = "w", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "x", name = "y", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "x", name = "z", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "x", name = "B", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "x", name = "C", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "x", name = "E", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "x", name = "F", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "x", name = "H", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "x", name = "I", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "x", name = "J", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "x", name = "K", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "x", name = "M", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "x", name = "N", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "x", name = "O", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "x", name = "P", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "x", name = "Q", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "x", name = "R", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "x", name = "S", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "x", name = "T", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "x", name = "U", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "x", name = "V", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "x", name = "W", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "x", name = "X", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "x", name = "Y", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "x", name = "Z", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "x", name = "ab", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "x", name = "eb", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "x", name = "r", descriptor = "Ljava/lang/String;")
    public String field304;

    @OriginalMember(owner = "x", name = "a", descriptor = "(BII)V")
    public final void method106(byte arg0, int arg1, int arg2) {
        if (this.field319 != -1 && SeqType.field938[this.field319].field946 <= 1) {
            this.field319 = -1;
        }
        int var4 = arg1 - this.field340[0];
        int var5 = arg2 - this.field341[0];
        if (var4 < -2 || var4 > 2 || var5 < -2 || var5 > 2) {
            this.field339 = 0;
            this.field343 = 0;
            this.field340[0] = arg1;
            this.field341[0] = arg2;
            this.field292 = this.field340[0] * 128 + this.field296 * 64;
            if (arg0 == 28) {
                this.field293 = this.field341[0] * 128 + this.field296 * 64;
            }
            return;
        }
        if (this.field339 < 9) {
            this.field339++;
        }
        for (int var6 = this.field339; var6 > 0; var6--) {
            this.field340[var6] = this.field340[var6 - 1];
            this.field341[var6] = this.field341[var6 - 1];
            this.field342[var6] = this.field342[var6 - 1];
        }
        this.field340[0] = arg1;
        this.field341[0] = arg2;
        this.field342[0] = false;
    }

    @OriginalMember(owner = "x", name = "a", descriptor = "(ZII)V")
    public final void method107(boolean arg0, int arg1, int arg2) {
        int var4 = this.field340[0];
        int var5 = this.field341[0];
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
        if (this.field319 != -1 && SeqType.field938[this.field319].field946 <= 1) {
            this.field319 = -1;
        }
        if (this.field339 < 9) {
            this.field339++;
        }
        for (int var6 = this.field339; var6 > 0; var6--) {
            this.field340[var6] = this.field340[var6 - 1];
            this.field341[var6] = this.field341[var6 - 1];
            this.field342[var6] = this.field342[var6 - 1];
        }
        this.field340[0] = var4;
        this.field341[0] = var5;
        this.field342[0] = arg0;
        int var7 = 3 / arg2;
    }

    @OriginalMember(owner = "x", name = "b", descriptor = "(I)Z")
    public boolean method108(int arg0) {
        if (arg0 != 0) {
            this.field291 = 254;
        }
        return false;
    }
}
