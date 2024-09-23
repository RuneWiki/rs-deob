import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "y", name = "l", descriptor = "I")
    private int field399 = -116;

    @OriginalMember(owner = "y", name = "p", descriptor = "Z")
    public boolean field403 = false;

    @OriginalMember(owner = "y", name = "q", descriptor = "I")
    public int field404 = 1;

    @OriginalMember(owner = "y", name = "r", descriptor = "I")
    public int field405 = -1;

    @OriginalMember(owner = "y", name = "s", descriptor = "I")
    public int field406 = -1;

    @OriginalMember(owner = "y", name = "t", descriptor = "I")
    public int field407 = -1;

    @OriginalMember(owner = "y", name = "u", descriptor = "I")
    public int field408 = -1;

    @OriginalMember(owner = "y", name = "v", descriptor = "I")
    public int field409 = -1;

    @OriginalMember(owner = "y", name = "w", descriptor = "I")
    public int field410 = -1;

    @OriginalMember(owner = "y", name = "x", descriptor = "I")
    public int field411 = -1;

    @OriginalMember(owner = "y", name = "z", descriptor = "I")
    public int field413 = 100;

    @OriginalMember(owner = "y", name = "C", descriptor = "[I")
    public int[] field416 = new int[4];

    @OriginalMember(owner = "y", name = "D", descriptor = "[I")
    public int[] field417 = new int[4];

    @OriginalMember(owner = "y", name = "E", descriptor = "[I")
    public int[] field418 = new int[4];

    @OriginalMember(owner = "y", name = "F", descriptor = "I")
    public int field419 = -1000;

    @OriginalMember(owner = "y", name = "I", descriptor = "I")
    public int field422 = -1;

    @OriginalMember(owner = "y", name = "L", descriptor = "I")
    public int field425 = -1;

    @OriginalMember(owner = "y", name = "O", descriptor = "I")
    public int field428 = -1;

    @OriginalMember(owner = "y", name = "T", descriptor = "I")
    public int field433 = -1;

    @OriginalMember(owner = "y", name = "gb", descriptor = "I")
    public int field446 = 200;

    @OriginalMember(owner = "y", name = "ib", descriptor = "I")
    public int field448 = 32;

    @OriginalMember(owner = "y", name = "kb", descriptor = "[I")
    public int[] field450 = new int[10];

    @OriginalMember(owner = "y", name = "lb", descriptor = "[I")
    public int[] field451 = new int[10];

    @OriginalMember(owner = "y", name = "mb", descriptor = "[Z")
    public boolean[] field452 = new boolean[10];

    @OriginalMember(owner = "y", name = "m", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "y", name = "n", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "y", name = "o", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "y", name = "A", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "y", name = "B", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "y", name = "G", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "y", name = "H", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "y", name = "J", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "y", name = "K", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "y", name = "M", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "y", name = "N", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "y", name = "P", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "y", name = "Q", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "y", name = "R", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "y", name = "S", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "y", name = "U", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "y", name = "V", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "y", name = "W", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "y", name = "X", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "y", name = "Y", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "y", name = "Z", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "y", name = "ab", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "y", name = "bb", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "y", name = "cb", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "y", name = "db", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "y", name = "eb", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "y", name = "fb", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "y", name = "hb", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "y", name = "jb", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "y", name = "nb", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "y", name = "ob", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "y", name = "y", descriptor = "Ljava/lang/String;")
    public String field412;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IZII)V")
    public final void method110(int arg0, boolean arg1, int arg2, int arg3) {
        if (this.field428 != -1 && SeqType.field1136[this.field428].field1149 == 1) {
            this.field428 = -1;
        }
        if (!arg1) {
            int var5 = arg3 - this.field450[0];
            int var6 = arg2 - this.field451[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field449 < 9) {
                    this.field449++;
                }
                for (int var7 = this.field449; var7 > 0; var7--) {
                    this.field450[var7] = this.field450[var7 - 1];
                    this.field451[var7] = this.field451[var7 - 1];
                    this.field452[var7] = this.field452[var7 - 1];
                }
                this.field450[0] = arg3;
                this.field451[0] = arg2;
                this.field452[0] = false;
                return;
            }
        }
        this.field449 = 0;
        if (arg0 != -34395) {
            return;
        }
        this.field454 = 0;
        this.field453 = 0;
        this.field450[0] = arg3;
        this.field451[0] = arg2;
        this.field400 = this.field450[0] * 128 + this.field404 * 64;
        this.field401 = this.field451[0] * 128 + this.field404 * 64;
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(IZI)V")
    public final void method111(int arg0, boolean arg1, int arg2) {
        int var4 = this.field450[0];
        int var5 = this.field451[0];
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
        if (this.field428 != -1 && SeqType.field1136[this.field428].field1149 == 1) {
            this.field428 = -1;
        }
        if (this.field449 < 9) {
            this.field449++;
        }
        for (int var6 = this.field449; var6 > 0; var6--) {
            this.field450[var6] = this.field450[var6 - 1];
            this.field451[var6] = this.field451[var6 - 1];
            this.field452[var6] = this.field452[var6 - 1];
        }
        this.field450[0] = var4;
        if (arg2 < 0) {
            this.field451[0] = var5;
            this.field452[0] = arg1;
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(I)V")
    public final void method112(int arg0) {
        this.field449 = 0;
        this.field454 = 0;
        if (arg0 == -47205) {
            ;
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(Z)Z")
    public boolean method113(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(IIII)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 4; var5++) {
            if (this.field418[var5] <= arg1) {
                this.field416[var5] = arg2;
                this.field417[var5] = arg3;
                this.field418[var5] = arg1 + 70;
                return;
            }
        }
        if (arg0 != 14691) {
            this.field399 = 47;
        }
    }
}
