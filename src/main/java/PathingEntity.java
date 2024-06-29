import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!z")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "client!z", name = "l", descriptor = "Z")
    private boolean field400 = true;

    @OriginalMember(owner = "client!z", name = "m", descriptor = "B")
    private byte field401 = 9;

    @OriginalMember(owner = "client!z", name = "q", descriptor = "Z")
    public boolean field405 = false;

    @OriginalMember(owner = "client!z", name = "r", descriptor = "I")
    public int field406 = 1;

    @OriginalMember(owner = "client!z", name = "s", descriptor = "I")
    public int field407 = -1;

    @OriginalMember(owner = "client!z", name = "t", descriptor = "I")
    public int field408 = -1;

    @OriginalMember(owner = "client!z", name = "u", descriptor = "I")
    public int field409 = -1;

    @OriginalMember(owner = "client!z", name = "v", descriptor = "I")
    public int field410 = -1;

    @OriginalMember(owner = "client!z", name = "w", descriptor = "I")
    public int field411 = -1;

    @OriginalMember(owner = "client!z", name = "x", descriptor = "I")
    public int field412 = -1;

    @OriginalMember(owner = "client!z", name = "y", descriptor = "I")
    public int field413 = -1;

    @OriginalMember(owner = "client!z", name = "A", descriptor = "I")
    public int field415 = 100;

    @OriginalMember(owner = "client!z", name = "F", descriptor = "I")
    public int field420 = -1000;

    @OriginalMember(owner = "client!z", name = "I", descriptor = "I")
    public int field423 = -1;

    @OriginalMember(owner = "client!z", name = "L", descriptor = "I")
    public int field426 = -1;

    @OriginalMember(owner = "client!z", name = "O", descriptor = "I")
    public int field429 = -1;

    @OriginalMember(owner = "client!z", name = "T", descriptor = "I")
    public int field434 = -1;

    @OriginalMember(owner = "client!z", name = "jb", descriptor = "[I")
    public int[] field450 = new int[10];

    @OriginalMember(owner = "client!z", name = "kb", descriptor = "[I")
    public int[] field451 = new int[10];

    @OriginalMember(owner = "client!z", name = "lb", descriptor = "[Z")
    public boolean[] field452 = new boolean[10];

    @OriginalMember(owner = "client!z", name = "n", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!z", name = "o", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!z", name = "p", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!z", name = "B", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!z", name = "C", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!z", name = "D", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!z", name = "E", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!z", name = "G", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!z", name = "H", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!z", name = "J", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!z", name = "K", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!z", name = "M", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!z", name = "N", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!z", name = "P", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!z", name = "Q", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!z", name = "R", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!z", name = "S", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!z", name = "U", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!z", name = "V", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!z", name = "W", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!z", name = "X", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!z", name = "Y", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!z", name = "Z", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!z", name = "ab", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!z", name = "bb", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!z", name = "cb", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!z", name = "db", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!z", name = "eb", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!z", name = "fb", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!z", name = "gb", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!z", name = "hb", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!z", name = "ib", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!z", name = "mb", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!z", name = "z", descriptor = "Ljava/lang/String;")
    public String field414;

    @OriginalMember(owner = "client!z", name = "a", descriptor = "(IIZB)V")
    public final void method122(int arg0, int arg1, boolean arg2, byte arg3) {
        if (this.field429 != -1 && SeqType.field1081[this.field429].field1089 <= 1) {
            this.field429 = -1;
        }
        if (!arg2) {
            int var5 = arg0 - this.field450[0];
            int var6 = arg1 - this.field451[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.field449 < 9) {
                    this.field449++;
                }
                for (int var7 = this.field449; var7 > 0; var7--) {
                    this.field450[var7] = this.field450[var7 - 1];
                    this.field451[var7] = this.field451[var7 - 1];
                    this.field452[var7] = this.field452[var7 - 1];
                }
                this.field450[0] = arg0;
                this.field451[0] = arg1;
                this.field452[0] = false;
                return;
            }
        }
        this.field449 = 0;
        this.field453 = 0;
        this.field450[0] = arg0;
        this.field451[0] = arg1;
        this.field402 = this.field450[0] * 128 + this.field406 * 64;
        if (this.field401 == arg3) {
            boolean var8 = false;
        } else {
            this.field400 = !this.field400;
        }
        this.field403 = this.field451[0] * 128 + this.field406 * 64;
    }

    @OriginalMember(owner = "client!z", name = "a", descriptor = "(IZB)V")
    public final void method123(int arg0, boolean arg1, byte arg2) {
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
        if (this.field429 != -1 && SeqType.field1081[this.field429].field1089 <= 1) {
            this.field429 = -1;
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
        this.field451[0] = var5;
        this.field452[0] = arg1;
        if (arg2 == 43) {
            ;
        }
    }

    @OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Z")
    public boolean method124(int arg0) {
        if (arg0 != -27441) {
            this.field400 = !this.field400;
        }
        return false;
    }
}
