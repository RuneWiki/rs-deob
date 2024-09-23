import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("w")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "w", name = "f", descriptor = "I")
    private int field279 = -449;

    @OriginalMember(owner = "w", name = "k", descriptor = "I")
    public int field284 = 1;

    @OriginalMember(owner = "w", name = "l", descriptor = "I")
    public int field285 = -1;

    @OriginalMember(owner = "w", name = "m", descriptor = "I")
    public int field286 = -1;

    @OriginalMember(owner = "w", name = "n", descriptor = "I")
    public int field287 = -1;

    @OriginalMember(owner = "w", name = "o", descriptor = "I")
    public int field288 = -1;

    @OriginalMember(owner = "w", name = "p", descriptor = "I")
    public int field289 = -1;

    @OriginalMember(owner = "w", name = "q", descriptor = "I")
    public int field290 = -1;

    @OriginalMember(owner = "w", name = "s", descriptor = "I")
    public int field292 = 100;

    @OriginalMember(owner = "w", name = "x", descriptor = "I")
    public int field297 = -1000;

    @OriginalMember(owner = "w", name = "A", descriptor = "I")
    public int field300 = -1;

    @OriginalMember(owner = "w", name = "D", descriptor = "I")
    public int field303 = -1;

    @OriginalMember(owner = "w", name = "G", descriptor = "I")
    public int field306 = -1;

    @OriginalMember(owner = "w", name = "L", descriptor = "I")
    public int field311 = -1;

    @OriginalMember(owner = "w", name = "X", descriptor = "Z")
    public boolean field323 = false;

    @OriginalMember(owner = "w", name = "bb", descriptor = "[I")
    public int[] field327 = new int[10];

    @OriginalMember(owner = "w", name = "cb", descriptor = "[I")
    public int[] field328 = new int[10];

    @OriginalMember(owner = "w", name = "g", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "w", name = "h", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "w", name = "i", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "w", name = "j", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "w", name = "t", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "w", name = "u", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "w", name = "v", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "w", name = "w", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "w", name = "y", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "w", name = "z", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "w", name = "B", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "w", name = "C", descriptor = "I")
    public int field302;

    @OriginalMember(owner = "w", name = "E", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "w", name = "F", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "w", name = "H", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "w", name = "I", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "w", name = "J", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "w", name = "K", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "w", name = "M", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "w", name = "N", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "w", name = "O", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "w", name = "P", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "w", name = "Q", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "w", name = "R", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "w", name = "S", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "w", name = "T", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "w", name = "U", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "w", name = "V", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "w", name = "W", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "w", name = "Y", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "w", name = "Z", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "w", name = "ab", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "w", name = "db", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "w", name = "r", descriptor = "Ljava/lang/String;")
    public String field291;

    @OriginalMember(owner = "w", name = "a", descriptor = "(III)V")
    public final void method91(int arg0, int arg1, int arg2) {
        if (this.field327[0] == arg1 && this.field328[0] == arg2) {
            return;
        }
        if (this.field306 != -1 && SeqType.field927[this.field306].field935 <= 1) {
            this.field306 = -1;
        }
        if (this.field326 < 9) {
            this.field326++;
            for (int var4 = this.field326; var4 > 0; var4--) {
                this.field327[var4] = this.field327[var4 - 1];
                this.field328[var4] = this.field328[var4 - 1];
            }
        } else {
            for (int var5 = 8; var5 > 0; var5--) {
                this.field327[var5] = this.field327[var5 - 1];
                this.field328[var5] = this.field328[var5 - 1];
            }
        }
        this.field327[0] = arg1;
        int var6 = 87 / arg0;
        this.field328[0] = arg2;
    }

    @OriginalMember(owner = "w", name = "a", descriptor = "(ZII)V")
    public final void method92(boolean arg0, int arg1, int arg2) {
        if (arg2 == 0 && arg1 == 0) {
            return;
        }
        int var4 = this.field327[0] + arg2;
        int var5 = this.field328[0] + arg1;
        if (this.field306 != -1 && SeqType.field927[this.field306].field935 <= 1) {
            this.field306 = -1;
        }
        if (this.field326 < 9) {
            this.field326++;
            for (int var6 = this.field326; var6 > 0; var6--) {
                this.field327[var6] = this.field327[var6 - 1];
                this.field328[var6] = this.field328[var6 - 1];
            }
        } else {
            for (int var7 = 8; var7 > 0; var7--) {
                this.field327[var7] = this.field327[var7 - 1];
                this.field328[var7] = this.field328[var7 - 1];
            }
        }
        this.field327[0] = var4;
        this.field328[0] = var5;
        if (arg0) {
            this.field279 = -19;
        }
    }
}
