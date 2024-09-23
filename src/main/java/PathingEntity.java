import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "z", name = "n", descriptor = "B")
    private byte field426 = 126;

    @OriginalMember(owner = "z", name = "o", descriptor = "Z")
    private boolean field427 = false;

    @OriginalMember(owner = "z", name = "s", descriptor = "Z")
    public boolean field431 = false;

    @OriginalMember(owner = "z", name = "t", descriptor = "I")
    public int field432 = 1;

    @OriginalMember(owner = "z", name = "u", descriptor = "I")
    public int field433 = -1;

    @OriginalMember(owner = "z", name = "v", descriptor = "I")
    public int field434 = -1;

    @OriginalMember(owner = "z", name = "w", descriptor = "I")
    public int field435 = -1;

    @OriginalMember(owner = "z", name = "x", descriptor = "I")
    public int field436 = -1;

    @OriginalMember(owner = "z", name = "y", descriptor = "I")
    public int field437 = -1;

    @OriginalMember(owner = "z", name = "z", descriptor = "I")
    public int field438 = -1;

    @OriginalMember(owner = "z", name = "A", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "z", name = "C", descriptor = "I")
    public int field441 = 100;

    @OriginalMember(owner = "z", name = "F", descriptor = "[I")
    public int[] field444 = new int[4];

    @OriginalMember(owner = "z", name = "G", descriptor = "[I")
    public int[] field445 = new int[4];

    @OriginalMember(owner = "z", name = "H", descriptor = "[I")
    public int[] field446 = new int[4];

    @OriginalMember(owner = "z", name = "I", descriptor = "I")
    public int field447 = -1000;

    @OriginalMember(owner = "z", name = "L", descriptor = "I")
    public int field450 = -1;

    @OriginalMember(owner = "z", name = "O", descriptor = "I")
    public int field453 = -1;

    @OriginalMember(owner = "z", name = "R", descriptor = "I")
    public int field456 = -1;

    @OriginalMember(owner = "z", name = "W", descriptor = "I")
    public int field461 = -1;

    @OriginalMember(owner = "z", name = "jb", descriptor = "I")
    public int field474 = 200;

    @OriginalMember(owner = "z", name = "mb", descriptor = "[I")
    public int[] field477 = new int[10];

    @OriginalMember(owner = "z", name = "nb", descriptor = "[I")
    public int[] field478 = new int[10];

    @OriginalMember(owner = "z", name = "ob", descriptor = "[Z")
    public boolean[] field479 = new boolean[10];

    @OriginalMember(owner = "z", name = "l", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "z", name = "m", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "z", name = "p", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "z", name = "q", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "z", name = "r", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "z", name = "D", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "z", name = "E", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "z", name = "J", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "z", name = "K", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "z", name = "M", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "z", name = "N", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "z", name = "P", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "z", name = "Q", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "z", name = "S", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "z", name = "T", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "z", name = "U", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "z", name = "V", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "z", name = "X", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "z", name = "Y", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "z", name = "Z", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "z", name = "ab", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "z", name = "bb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "z", name = "cb", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "z", name = "db", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "z", name = "eb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "z", name = "fb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "z", name = "gb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "z", name = "hb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "z", name = "kb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "z", name = "lb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "z", name = "pb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "z", name = "B", descriptor = "Ljava/lang/String;")
    public String field440;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZBII)V")
    public final void method124(boolean arg0, byte arg1, int arg2, int arg3) {
        if (this.field456 != -1 && SeqType.field1149[this.field456].field1162 == 1) {
            this.field456 = -1;
        }
        if (!arg0) {
            int var5 = arg3 - this.field477[0];
            int var6 = arg2 - this.field478[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field476 < 9) {
                    this.field476++;
                }
                for (int var7 = this.field476; var7 > 0; var7--) {
                    this.field477[var7] = this.field477[var7 - 1];
                    this.field478[var7] = this.field478[var7 - 1];
                    this.field479[var7] = this.field479[var7 - 1];
                }
                this.field477[0] = arg3;
                this.field478[0] = arg2;
                this.field479[0] = false;
                return;
            }
        }
        this.field476 = 0;
        this.field481 = 0;
        this.field480 = 0;
        this.field477[0] = arg3;
        if (this.field426 == arg1) {
            this.field478[0] = arg2;
            this.field428 = this.field477[0] * 128 + this.field432 * 64;
            this.field429 = this.field478[0] * 128 + this.field432 * 64;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZIZ)V")
    public final void method125(boolean arg0, int arg1, boolean arg2) {
        int var4 = this.field477[0];
        int var5 = this.field478[0];
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
        if (this.field456 != -1 && SeqType.field1149[this.field456].field1162 == 1) {
            this.field456 = -1;
        }
        if (this.field476 < 9) {
            this.field476++;
        }
        for (int var6 = this.field476; var6 > 0; var6--) {
            this.field477[var6] = this.field477[var6 - 1];
            this.field478[var6] = this.field478[var6 - 1];
            this.field479[var6] = this.field479[var6 - 1];
        }
        if (arg0) {
            this.field424 = -469;
        }
        this.field477[0] = var4;
        this.field478[0] = var5;
        this.field479[0] = arg2;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        this.field476 = 0;
        if (arg0 != -965) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field481 = 0;
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Z")
    public boolean method127(int arg0) {
        if (arg0 != -42790) {
            this.field425 = 339;
        }
        return false;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(III)V")
    public final void method128(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.field425 = 354;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field446[var4] <= client.field1247) {
                this.field444[var4] = arg2;
                this.field445[var4] = arg0;
                this.field446[var4] = client.field1247 + 70;
                return;
            }
        }
    }
}
