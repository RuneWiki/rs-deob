import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class598 {

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    private int field8323 = -1;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    private int field8334 = 0;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Lkba;")
    private class108 field8321 = new class108();

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "Z")
    public boolean field8335 = false;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    private int field8322;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    private int field8325;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "[[[I")
    private int[][][] field8330;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "[Ldaa;")
    private class11[] field8327;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8324 = 0;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Z")
    public static boolean field8329 = false;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "Lni;")
    public static class522 field8331;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method3306(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field8320++;
        if (this.field8325 == this.field8322) {
            this.field8335 = this.field8327[arg0] == null;
            this.field8327[arg0] = class564.field7973;
            return this.field8330[arg0];
        } else if (this.field8325 == 1) {
            this.field8335 = this.field8323 != arg0;
            this.field8323 = arg0;
            return this.field8330[0];
        } else {
            class11 var3 = this.field8327[arg0];
            if (var3 == null) {
                this.field8335 = true;
                if (this.field8325 > this.field8334) {
                    var3 = new class11(arg0, this.field8334);
                    this.field8334++;
                } else {
                    class11 var4 = (class11) this.field8321.method733(arg1 - 52);
                    var3 = new class11(arg0, var4.field65);
                    this.field8327[var4.field64] = null;
                    var4.method315(arg1 ^ 0x35);
                }
                this.field8327[arg0] = var3;
            } else {
                this.field8335 = false;
            }
            this.field8321.method729(-2, var3);
            return this.field8330[var3.field65];
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([SII)[S", line = 74)
    public static final short[] method3307(short[] arg0, int arg1, int arg2) {
        field8332++;
        short[] var3 = new short[arg1];
        class373.method2195(arg0, 0, var3, 0, arg1);
        return arg2 == 26813 ? var3 : null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)[[[I", line = 88)
    public final int[][][] method3308(int arg0) {
        if (arg0 != 26279) {
            this.method3306(-62, -13);
        }
        field8333++;
        if (this.field8325 != this.field8322) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field8325; var2++) {
            this.field8327[var2] = class564.field7973;
        }
        return this.field8330;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V", line = 111)
    public final void method3309(int arg0) {
        field8328++;
        for (int var2 = arg0; var2 < this.field8325; var2++) {
            this.field8330[var2][0] = null;
            this.field8330[var2][1] = null;
            this.field8330[var2][2] = null;
            this.field8330[var2] = null;
        }
        this.field8330 = null;
        this.field8327 = null;
        this.field8321.method728((byte) 47);
        this.field8321 = null;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(III)V", line = 177)
    public class598(int arg0, int arg1, int arg2) {
        this.field8322 = arg1;
        this.field8325 = arg0;
        this.field8330 = new int[this.field8325][3][arg2];
        this.field8327 = new class11[this.field8322];
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 156)
    public static void method3310(byte arg0) {
        if (arg0 <= 45) {
            field8331 = null;
        }
        field8331 = null;
    }
}
