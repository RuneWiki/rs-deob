import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "z", name = "l", descriptor = "Z")
    private boolean field412 = true;

    @OriginalMember(owner = "z", name = "m", descriptor = "Z")
    private boolean field413 = false;

    @OriginalMember(owner = "z", name = "q", descriptor = "Z")
    public boolean field417 = false;

    @OriginalMember(owner = "z", name = "r", descriptor = "I")
    public int field418 = 1;

    @OriginalMember(owner = "z", name = "s", descriptor = "I")
    public int field419 = -1;

    @OriginalMember(owner = "z", name = "t", descriptor = "I")
    public int field420 = -1;

    @OriginalMember(owner = "z", name = "u", descriptor = "I")
    public int field421 = -1;

    @OriginalMember(owner = "z", name = "v", descriptor = "I")
    public int field422 = -1;

    @OriginalMember(owner = "z", name = "w", descriptor = "I")
    public int field423 = -1;

    @OriginalMember(owner = "z", name = "x", descriptor = "I")
    public int field424 = -1;

    @OriginalMember(owner = "z", name = "y", descriptor = "I")
    public int field425 = -1;

    @OriginalMember(owner = "z", name = "A", descriptor = "I")
    public int field427 = 100;

    @OriginalMember(owner = "z", name = "D", descriptor = "[I")
    public int[] field430 = new int[4];

    @OriginalMember(owner = "z", name = "E", descriptor = "[I")
    public int[] field431 = new int[4];

    @OriginalMember(owner = "z", name = "F", descriptor = "[I")
    public int[] field432 = new int[4];

    @OriginalMember(owner = "z", name = "G", descriptor = "I")
    public int field433 = -1000;

    @OriginalMember(owner = "z", name = "J", descriptor = "I")
    public int field436 = -1;

    @OriginalMember(owner = "z", name = "M", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "z", name = "P", descriptor = "I")
    public int field442 = -1;

    @OriginalMember(owner = "z", name = "U", descriptor = "I")
    public int field447 = -1;

    @OriginalMember(owner = "z", name = "kb", descriptor = "[I")
    public int[] field463 = new int[10];

    @OriginalMember(owner = "z", name = "lb", descriptor = "[I")
    public int[] field464 = new int[10];

    @OriginalMember(owner = "z", name = "mb", descriptor = "[Z")
    public boolean[] field465 = new boolean[10];

    @OriginalMember(owner = "z", name = "n", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "z", name = "o", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "z", name = "p", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "z", name = "B", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "z", name = "C", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "z", name = "H", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "z", name = "I", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "z", name = "K", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "z", name = "L", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "z", name = "N", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "z", name = "O", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "z", name = "Q", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "z", name = "R", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "z", name = "S", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "z", name = "T", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "z", name = "V", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "z", name = "W", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "z", name = "X", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "z", name = "Y", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "z", name = "Z", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "z", name = "ab", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "z", name = "bb", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "z", name = "cb", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "z", name = "db", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "z", name = "eb", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "z", name = "fb", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "z", name = "gb", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "z", name = "hb", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "z", name = "jb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "z", name = "nb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "z", name = "ob", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "z", name = "z", descriptor = "Ljava/lang/String;")
    public String field426;

    @OriginalMember(owner = "z", name = "a", descriptor = "(IIIZ)V")
    public final void method123(int arg0, int arg1, int arg2, boolean arg3) {
        if (this.field442 != -1 && SeqType.field1125[this.field442].field1138 == 1) {
            this.field442 = -1;
        }
        if (!arg3) {
            int var5 = arg0 - this.field463[0];
            int var6 = arg1 - this.field464[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field462 < 9) {
                    this.field462++;
                }
                for (int var7 = this.field462; var7 > 0; var7--) {
                    this.field463[var7] = this.field463[var7 - 1];
                    this.field464[var7] = this.field464[var7 - 1];
                    this.field465[var7] = this.field465[var7 - 1];
                }
                this.field463[0] = arg0;
                this.field464[0] = arg1;
                this.field465[0] = false;
                return;
            }
        }
        this.field462 = 0;
        if (arg2 != 8) {
            this.field413 = !this.field413;
        }
        this.field467 = 0;
        this.field466 = 0;
        this.field463[0] = arg0;
        this.field464[0] = arg1;
        this.field414 = this.field463[0] * 128 + this.field418 * 64;
        this.field415 = this.field464[0] * 128 + this.field418 * 64;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZII)V")
    public final void method124(boolean arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        int var4 = this.field463[0];
        int var5 = this.field464[0];
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
        if (this.field442 != -1 && SeqType.field1125[this.field442].field1138 == 1) {
            this.field442 = -1;
        }
        if (this.field462 < 9) {
            this.field462++;
        }
        for (int var6 = this.field462; var6 > 0; var6--) {
            this.field463[var6] = this.field463[var6 - 1];
            this.field464[var6] = this.field464[var6 - 1];
            this.field465[var6] = this.field465[var6 - 1];
        }
        this.field463[0] = var4;
        this.field464[0] = var5;
        this.field465[0] = arg0;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)V")
    public final void method125(byte arg0) {
        this.field462 = 0;
        this.field467 = 0;
        if (arg0 == -66) {
            ;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(B)Z")
    public boolean method126(byte arg0) {
        if (arg0 != 5) {
            this.field413 = !this.field413;
        }
        return false;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(III)V")
    public final void method127(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field432[var4] <= client.field1444) {
                this.field430[var4] = arg1;
                this.field431[var4] = arg0;
                this.field432[var4] = client.field1444 + 70;
                return;
            }
        }
        if (arg2 >= 0) {
            this.field412 = !this.field412;
        }
    }
}
