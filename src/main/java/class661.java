import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class661 {

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    private int field9236 = -1;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    private int field9243 = 0;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "Lkba;")
    private class108 field9239 = new class108();

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "Z")
    public boolean field9250 = false;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    private int field9242;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    private int field9238;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "[[I")
    private int[][] field9245;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "[Lvfa;")
    private class671[] field9247;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field9240 = -1;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "Lea;")
    public static class547 field9241 = new class547(45, 0);

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field9248 = 0;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field9251 = 7000;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field9249 = field9251;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    public static void method3740(byte arg0) {
        field9241 = null;
        if (arg0 != 102) {
            field9241 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public final void method3741(int arg0) {
        field9237++;
        for (int var2 = 0; var2 < this.field9238; var2++) {
            this.field9245[var2] = null;
        }
        this.field9245 = null;
        this.field9247 = null;
        int var3 = -61 % ((-arg0 - 49) / 48);
        this.field9239.method728((byte) 47);
        this.field9239 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)[I")
    public final int[] method3742(byte arg0, int arg1) {
        field9246++;
        if (arg0 != 98) {
            return null;
        } else if (this.field9242 == this.field9238) {
            this.field9250 = this.field9247[arg1] == null;
            this.field9247[arg1] = class579.field8122;
            return this.field9245[arg1];
        } else if (this.field9238 == 1) {
            this.field9250 = this.field9236 != arg1;
            this.field9236 = arg1;
            return this.field9245[0];
        } else {
            class671 var3 = this.field9247[arg1];
            if (var3 == null) {
                this.field9250 = true;
                if (this.field9243 < this.field9238) {
                    var3 = new class671(arg1, this.field9243);
                    this.field9243++;
                } else {
                    class671 var4 = (class671) this.field9239.method733(-111);
                    var3 = new class671(arg1, var4.field9326);
                    this.field9247[var4.field9321] = null;
                    var4.method315(63);
                }
                this.field9247[arg1] = var3;
            } else {
                this.field9250 = false;
            }
            this.field9239.method729(-2, var3);
            return this.field9245[var3.field9326];
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)[[I")
    public final int[][] method3743(int arg0) {
        field9244++;
        if (this.field9242 != this.field9238) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 71 % ((-arg0 - 66) / 53);
        for (int var3 = 0; var3 < this.field9238; var3++) {
            this.field9247[var3] = class579.field8122;
        }
        return this.field9245;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(III)V")
    public class661(int arg0, int arg1, int arg2) {
        this.field9242 = arg1;
        this.field9238 = arg0;
        this.field9245 = new int[this.field9238][arg2];
        this.field9247 = new class671[this.field9242];
    }
}
