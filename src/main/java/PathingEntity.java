import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "z", name = "l", descriptor = "I")
    private int field396 = 8;

    @OriginalMember(owner = "z", name = "p", descriptor = "Z")
    public boolean field400 = false;

    @OriginalMember(owner = "z", name = "q", descriptor = "I")
    public int field401 = 1;

    @OriginalMember(owner = "z", name = "r", descriptor = "I")
    public int field402 = -1;

    @OriginalMember(owner = "z", name = "s", descriptor = "I")
    public int field403 = -1;

    @OriginalMember(owner = "z", name = "t", descriptor = "I")
    public int field404 = -1;

    @OriginalMember(owner = "z", name = "u", descriptor = "I")
    public int field405 = -1;

    @OriginalMember(owner = "z", name = "v", descriptor = "I")
    public int field406 = -1;

    @OriginalMember(owner = "z", name = "w", descriptor = "I")
    public int field407 = -1;

    @OriginalMember(owner = "z", name = "x", descriptor = "I")
    public int field408 = -1;

    @OriginalMember(owner = "z", name = "z", descriptor = "I")
    public int field410 = 100;

    @OriginalMember(owner = "z", name = "E", descriptor = "I")
    public int field415 = -1000;

    @OriginalMember(owner = "z", name = "H", descriptor = "I")
    public int field418 = -1;

    @OriginalMember(owner = "z", name = "K", descriptor = "I")
    public int field421 = -1;

    @OriginalMember(owner = "z", name = "N", descriptor = "I")
    public int field424 = -1;

    @OriginalMember(owner = "z", name = "S", descriptor = "I")
    public int field429 = -1;

    @OriginalMember(owner = "z", name = "ib", descriptor = "[I")
    public int[] field445 = new int[10];

    @OriginalMember(owner = "z", name = "jb", descriptor = "[I")
    public int[] field446 = new int[10];

    @OriginalMember(owner = "z", name = "kb", descriptor = "[Z")
    public boolean[] field447 = new boolean[10];

    @OriginalMember(owner = "z", name = "m", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "z", name = "n", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "z", name = "o", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "z", name = "A", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "z", name = "B", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "z", name = "C", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "z", name = "D", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "z", name = "F", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "z", name = "G", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "z", name = "I", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "z", name = "J", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "z", name = "L", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "z", name = "M", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "z", name = "O", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "z", name = "P", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "z", name = "Q", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "z", name = "R", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "z", name = "T", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "z", name = "U", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "z", name = "V", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "z", name = "W", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "z", name = "X", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "z", name = "Y", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "z", name = "Z", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "z", name = "ab", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "z", name = "bb", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "z", name = "cb", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "z", name = "db", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "z", name = "eb", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "z", name = "fb", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "z", name = "gb", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "z", name = "hb", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "z", name = "lb", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "z", name = "y", descriptor = "Ljava/lang/String;")
    public String field409;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZZII)V")
    public final void method122(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (this.field424 != -1 && SeqType.field1069[this.field424].field1077 <= 1) {
            this.field424 = -1;
        }
        if (!arg0) {
            int var5 = arg3 - this.field445[0];
            int var6 = arg2 - this.field446[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field444 < 9) {
                    this.field444++;
                }
                for (int var7 = this.field444; var7 > 0; var7--) {
                    this.field445[var7] = this.field445[var7 - 1];
                    this.field446[var7] = this.field446[var7 - 1];
                    this.field447[var7] = this.field447[var7 - 1];
                }
                this.field445[0] = arg3;
                this.field446[0] = arg2;
                this.field447[0] = false;
                return;
            }
        }
        this.field444 = 0;
        this.field448 = 0;
        if (arg1) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        this.field445[0] = arg3;
        this.field446[0] = arg2;
        this.field397 = this.field445[0] * 128 + this.field401 * 64;
        this.field398 = this.field446[0] * 128 + this.field401 * 64;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZII)V")
    public final void method123(boolean arg0, int arg1, int arg2) {
        int var4 = this.field445[0];
        int var5 = this.field446[0];
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
        if (this.field424 != -1 && SeqType.field1069[this.field424].field1077 <= 1) {
            this.field424 = -1;
        }
        if (this.field444 < 9) {
            this.field444++;
        }
        for (int var6 = this.field444; var6 > 0; var6--) {
            this.field445[var6] = this.field445[var6 - 1];
            this.field446[var6] = this.field446[var6 - 1];
            this.field447[var6] = this.field447[var6 - 1];
        }
        if (arg2 == 0) {
            this.field445[0] = var4;
            this.field446[0] = var5;
            this.field447[0] = arg0;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Z")
    public boolean method124(int arg0) {
        if (arg0 != 0) {
            this.field396 = -495;
        }
        return false;
    }
}
