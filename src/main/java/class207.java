import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class207 {

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    private int field3522 = -1;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    private int field3532 = 0;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Lub;")
    private class88 field3531 = new class88();

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Z")
    public boolean field3539 = false;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    private int field3519;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "[Lfe;")
    private class243[] field3530;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[[I")
    private int[][] field3524;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "[I")
    public static int[] field3517 = new int[2000];

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lpj;")
    private static class237 field3520 = class33.method353("Close", 43);

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field3527 = 0;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Lpj;")
    public static class237 field3536 = field3520;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[S")
    public static short[] field3516;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method1387(byte arg0) {
        field3536 = null;
        field3517 = null;
        if (arg0 >= 55) {
            field3516 = null;
            field3520 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[I")
    public final int[] method1388(int arg0, byte arg1) {
        field3525++;
        if (arg1 != -26) {
            return null;
        } else if (this.field3535 == this.field3519) {
            this.field3539 = this.field3530[arg0] == null;
            this.field3530[arg0] = class164.field2918;
            return this.field3524[arg0];
        } else if (this.field3519 == 1) {
            this.field3539 = this.field3522 != arg0;
            this.field3522 = arg0;
            return this.field3524[0];
        } else {
            class243 var3 = this.field3530[arg0];
            if (var3 == null) {
                this.field3539 = true;
                if (this.field3532 >= this.field3519) {
                    class243 var4 = (class243) this.field3531.method672((byte) 110);
                    var3 = new class243(arg0, var4.field4260);
                    this.field3530[var4.field4264] = null;
                    var4.method629(0);
                } else {
                    var3 = new class243(arg0, this.field3532);
                    this.field3532++;
                }
                this.field3530[arg0] = var3;
            } else {
                this.field3539 = false;
            }
            this.field3531.method679(24549, var3);
            return this.field3524[var3.field4260];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[[I")
    public final int[][] method1389(int arg0) {
        if (arg0 != 21082) {
            field3527 = 29;
        }
        field3518++;
        if (this.field3535 != this.field3519) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3519; var2++) {
            this.field3530[var2] = class164.field2918;
        }
        return this.field3524;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public final void method1390(int arg0) {
        if (arg0 > -110) {
            return;
        }
        for (int var2 = 0; var2 < this.field3519; var2++) {
            this.field3524[var2] = null;
        }
        field3533++;
        this.field3524 = null;
        this.field3530 = null;
        this.field3531.method676(16841);
        this.field3531 = null;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    public class207(int arg0, int arg1, int arg2) {
        this.field3519 = arg0;
        this.field3535 = arg1;
        this.field3530 = new class243[this.field3535];
        this.field3524 = new int[this.field3519][arg2];
    }
}
