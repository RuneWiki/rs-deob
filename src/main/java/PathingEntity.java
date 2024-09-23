import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "z", name = "l", descriptor = "Z")
    private boolean field402 = true;

    @OriginalMember(owner = "z", name = "m", descriptor = "I")
    private int field403 = 354;

    @OriginalMember(owner = "z", name = "q", descriptor = "Z")
    public boolean field407 = false;

    @OriginalMember(owner = "z", name = "r", descriptor = "I")
    public int field408 = 1;

    @OriginalMember(owner = "z", name = "s", descriptor = "I")
    public int field409 = -1;

    @OriginalMember(owner = "z", name = "t", descriptor = "I")
    public int field410 = -1;

    @OriginalMember(owner = "z", name = "u", descriptor = "I")
    public int field411 = -1;

    @OriginalMember(owner = "z", name = "v", descriptor = "I")
    public int field412 = -1;

    @OriginalMember(owner = "z", name = "w", descriptor = "I")
    public int field413 = -1;

    @OriginalMember(owner = "z", name = "x", descriptor = "I")
    public int field414 = -1;

    @OriginalMember(owner = "z", name = "y", descriptor = "I")
    public int field415 = -1;

    @OriginalMember(owner = "z", name = "A", descriptor = "I")
    public int field417 = 100;

    @OriginalMember(owner = "z", name = "D", descriptor = "[I")
    public int[] field420 = new int[4];

    @OriginalMember(owner = "z", name = "E", descriptor = "[I")
    public int[] field421 = new int[4];

    @OriginalMember(owner = "z", name = "F", descriptor = "[I")
    public int[] field422 = new int[4];

    @OriginalMember(owner = "z", name = "G", descriptor = "I")
    public int field423 = -1000;

    @OriginalMember(owner = "z", name = "J", descriptor = "I")
    public int field426 = -1;

    @OriginalMember(owner = "z", name = "M", descriptor = "I")
    public int field429 = -1;

    @OriginalMember(owner = "z", name = "P", descriptor = "I")
    public int field432 = -1;

    @OriginalMember(owner = "z", name = "U", descriptor = "I")
    public int field437 = -1;

    @OriginalMember(owner = "z", name = "kb", descriptor = "[I")
    public int[] field453 = new int[10];

    @OriginalMember(owner = "z", name = "lb", descriptor = "[I")
    public int[] field454 = new int[10];

    @OriginalMember(owner = "z", name = "mb", descriptor = "[Z")
    public boolean[] field455 = new boolean[10];

    @OriginalMember(owner = "z", name = "n", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "z", name = "o", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "z", name = "p", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "z", name = "B", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "z", name = "C", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "z", name = "H", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "z", name = "I", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "z", name = "K", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "z", name = "L", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "z", name = "N", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "z", name = "O", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "z", name = "Q", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "z", name = "R", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "z", name = "S", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "z", name = "T", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "z", name = "V", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "z", name = "W", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "z", name = "X", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "z", name = "Y", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "z", name = "Z", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "z", name = "ab", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "z", name = "bb", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "z", name = "cb", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "z", name = "db", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "z", name = "eb", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "z", name = "fb", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "z", name = "gb", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "z", name = "hb", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "z", name = "jb", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "z", name = "nb", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "z", name = "ob", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "z", name = "z", descriptor = "Ljava/lang/String;")
    public String field416;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZIII)V")
    public final void method123(boolean arg0, int arg1, int arg2, int arg3) {
        if (this.field432 != -1 && SeqType.field1120[this.field432].field1133 == 1) {
            this.field432 = -1;
        }
        if (!arg0) {
            int var5 = arg1 - this.field453[0];
            int var6 = arg2 - this.field454[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field452 < 9) {
                    this.field452++;
                }
                for (int var7 = this.field452; var7 > 0; var7--) {
                    this.field453[var7] = this.field453[var7 - 1];
                    this.field454[var7] = this.field454[var7 - 1];
                    this.field455[var7] = this.field455[var7 - 1];
                }
                this.field453[0] = arg1;
                this.field454[0] = arg2;
                this.field455[0] = false;
                return;
            }
        }
        this.field452 = 0;
        this.field457 = 0;
        this.field456 = 0;
        this.field453[0] = arg1;
        this.field454[0] = arg2;
        this.field404 = this.field453[0] * 128 + this.field408 * 64;
        if (arg3 >= 7 && arg3 <= 7) {
            this.field405 = this.field454[0] * 128 + this.field408 * 64;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(IZZ)V")
    public final void method124(int arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            this.field402 = !this.field402;
        }
        int var4 = this.field453[0];
        int var5 = this.field454[0];
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
        if (this.field432 != -1 && SeqType.field1120[this.field432].field1133 == 1) {
            this.field432 = -1;
        }
        if (this.field452 < 9) {
            this.field452++;
        }
        for (int var6 = this.field452; var6 > 0; var6--) {
            this.field453[var6] = this.field453[var6 - 1];
            this.field454[var6] = this.field454[var6 - 1];
            this.field455[var6] = this.field455[var6 - 1];
        }
        this.field453[0] = var4;
        this.field454[0] = var5;
        this.field455[0] = arg1;
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)V")
    public final void method125(int arg0) {
        this.field452 = 0;
        this.field457 = 0;
        if (arg0 < 2 || arg0 > 2) {
            this.field403 = 186;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)Z")
    public boolean method126(byte arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(III)V")
    public final void method127(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field403 = -191;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field422[var4] <= client.field1588) {
                this.field420[var4] = arg2;
                this.field421[var4] = arg0;
                this.field422[var4] = client.field1588 + 70;
                return;
            }
        }
    }
}
