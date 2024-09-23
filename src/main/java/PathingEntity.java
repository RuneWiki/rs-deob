import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "y", name = "m", descriptor = "Z")
    private boolean field396 = true;

    @OriginalMember(owner = "y", name = "q", descriptor = "Z")
    public boolean field400 = false;

    @OriginalMember(owner = "y", name = "r", descriptor = "I")
    public int field401 = 1;

    @OriginalMember(owner = "y", name = "s", descriptor = "I")
    public int field402 = -1;

    @OriginalMember(owner = "y", name = "t", descriptor = "I")
    public int field403 = -1;

    @OriginalMember(owner = "y", name = "u", descriptor = "I")
    public int field404 = -1;

    @OriginalMember(owner = "y", name = "v", descriptor = "I")
    public int field405 = -1;

    @OriginalMember(owner = "y", name = "w", descriptor = "I")
    public int field406 = -1;

    @OriginalMember(owner = "y", name = "x", descriptor = "I")
    public int field407 = -1;

    @OriginalMember(owner = "y", name = "y", descriptor = "I")
    public int field408 = -1;

    @OriginalMember(owner = "y", name = "A", descriptor = "I")
    public int field410 = 100;

    @OriginalMember(owner = "y", name = "D", descriptor = "[I")
    public int[] field413 = new int[4];

    @OriginalMember(owner = "y", name = "E", descriptor = "[I")
    public int[] field414 = new int[4];

    @OriginalMember(owner = "y", name = "F", descriptor = "[I")
    public int[] field415 = new int[4];

    @OriginalMember(owner = "y", name = "G", descriptor = "I")
    public int field416 = -1000;

    @OriginalMember(owner = "y", name = "J", descriptor = "I")
    public int field419 = -1;

    @OriginalMember(owner = "y", name = "M", descriptor = "I")
    public int field422 = -1;

    @OriginalMember(owner = "y", name = "P", descriptor = "I")
    public int field425 = -1;

    @OriginalMember(owner = "y", name = "U", descriptor = "I")
    public int field430 = -1;

    @OriginalMember(owner = "y", name = "hb", descriptor = "I")
    public int field443 = 200;

    @OriginalMember(owner = "y", name = "jb", descriptor = "I")
    public int field445 = 32;

    @OriginalMember(owner = "y", name = "lb", descriptor = "[I")
    public int[] field447 = new int[10];

    @OriginalMember(owner = "y", name = "mb", descriptor = "[I")
    public int[] field448 = new int[10];

    @OriginalMember(owner = "y", name = "nb", descriptor = "[Z")
    public boolean[] field449 = new boolean[10];

    @OriginalMember(owner = "y", name = "n", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "y", name = "o", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "y", name = "p", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "y", name = "B", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "y", name = "C", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "y", name = "H", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "y", name = "I", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "y", name = "K", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "y", name = "L", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "y", name = "N", descriptor = "I")
    public int field423;

    @OriginalMember(owner = "y", name = "O", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "y", name = "Q", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "y", name = "R", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "y", name = "S", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "y", name = "T", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "y", name = "V", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "y", name = "W", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "y", name = "X", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "y", name = "Y", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "y", name = "Z", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "y", name = "ab", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "y", name = "bb", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "y", name = "cb", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "y", name = "db", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "y", name = "eb", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "y", name = "fb", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "y", name = "gb", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "y", name = "ib", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "y", name = "kb", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "y", name = "ob", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "y", name = "pb", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "y", name = "z", descriptor = "Ljava/lang/String;")
    public String field409;

    @OriginalMember(owner = "y", name = "a", descriptor = "(IZZI)V")
    public final void method110(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field425 != -1 && SeqType.field1133[this.field425].field1146 == 1) {
            this.field425 = -1;
        }
        if (!arg1) {
            int var5 = arg0 - this.field447[0];
            int var6 = arg3 - this.field448[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field446 < 9) {
                    this.field446++;
                }
                for (int var7 = this.field446; var7 > 0; var7--) {
                    this.field447[var7] = this.field447[var7 - 1];
                    this.field448[var7] = this.field448[var7 - 1];
                    this.field449[var7] = this.field449[var7 - 1];
                }
                this.field447[0] = arg0;
                this.field448[0] = arg3;
                this.field449[0] = false;
                return;
            }
        }
        this.field446 = 0;
        this.field451 = 0;
        this.field450 = 0;
        this.field447[0] = arg0;
        if (arg2) {
            this.field396 = !this.field396;
        }
        this.field448[0] = arg3;
        this.field397 = this.field447[0] * 128 + this.field401 * 64;
        this.field398 = this.field448[0] * 128 + this.field401 * 64;
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(ZIZ)V")
    public final void method111(boolean arg0, int arg1, boolean arg2) {
        int var4 = this.field447[0];
        int var5 = this.field448[0];
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
        if (this.field425 != -1 && SeqType.field1133[this.field425].field1146 == 1) {
            this.field425 = -1;
        }
        if (this.field446 < 9) {
            this.field446++;
        }
        for (int var6 = this.field446; var6 > 0; var6--) {
            this.field447[var6] = this.field447[var6 - 1];
            this.field448[var6] = this.field448[var6 - 1];
            this.field449[var6] = this.field449[var6 - 1];
        }
        this.field447[0] = var4;
        if (!arg0) {
            this.field396 = !this.field396;
        }
        this.field448[0] = var5;
        this.field449[0] = arg2;
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(Z)V")
    public final void method112(boolean arg0) {
        this.field446 = 0;
        this.field451 = 0;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Z")
    public boolean method113(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return false;
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(IBII)V")
    public final void method114(int arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 4; var5++) {
            if (this.field415[var5] <= arg0) {
                this.field413[var5] = arg2;
                this.field414[var5] = arg3;
                this.field415[var5] = arg0 + 70;
                return;
            }
        }
        if (arg1 == 8) {
            ;
        }
    }
}
