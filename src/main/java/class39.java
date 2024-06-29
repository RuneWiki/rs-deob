import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class39 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    private int field645 = -1;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    private int field661 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lrg;")
    private class84 field643 = new class84();

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Z")
    public boolean field664 = false;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "[Lhf;")
    private class197[] field653;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[[I")
    private int[][] field660;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lda;")
    public static class275 field644 = class255.method1672(95, "m");

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lda;")
    private static class275 field651 = class255.method1672(98, "Hidden");

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field654 = 1;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Lda;")
    public static class275 field658 = field651;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Lda;")
    public static class275 field657 = class255.method1672(103, "cookieprefix");

    @OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
    public static int[] field655 = new int[128];

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lda;")
    private static class275 field642 = class255.method1672(109, "Loaded fonts");

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lda;")
    public static class275 field652 = field642;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[[I")
    public static int[][] field647;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)[[I")
    public final int[][] method226(byte arg0) {
        field659++;
        if (arg0 >= -37) {
            return null;
        } else if (this.field650 == this.field649) {
            for (int var2 = 0; var2 < this.field649; var2++) {
                this.field653[var2] = class195.field3336;
            }
            return this.field660;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lce;ZI)V")
    public static final void method227(class112 arg0, boolean arg1, int arg2) {
        field641++;
        int var3 = arg0.field1977;
        int var4 = (int) arg0.field1707;
        arg0.method741(arg2 + 3);
        if (arg1) {
            class139.method1000(96, var3);
        }
        class51.method322(var3, -9);
        class229 var5 = class261.method1709(var4, -123);
        if (var5 != null) {
            class40.method231(var5, 0);
        }
        int var6 = class52.field863;
        for (int var7 = arg2; var7 < var6; var7++) {
            if (class30.method181(class137.field2400[var7], (byte) 60)) {
                class17.method89(var7, arg2 ^ 0x1);
            }
        }
        if (class52.field863 == 1) {
            class63.field1051 = false;
            class102.method733(class29.field445, class157.field2769, class6.field84, (byte) -77, class23.field366);
        } else {
            class102.method733(class29.field445, class157.field2769, class6.field84, (byte) -77, class23.field366);
            int var8 = class93.field1599.method113(class52.field878);
            for (int var9 = 0; var9 < class52.field863; var9++) {
                int var10 = class93.field1599.method113(class269.method1774(var9, (byte) 64));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class6.field84 = var8 + 8;
            class29.field445 = class52.field863 * 15 + 22;
        }
        if (class166.field2881 != -1) {
            class37.method222(1, class166.field2881, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method228(int arg0) {
        field663++;
        for (int var2 = arg0; var2 < this.field649; var2++) {
            this.field660[var2] = null;
        }
        this.field660 = null;
        this.field653 = null;
        this.field643.method549((byte) -109);
        this.field643 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I")
    public final int[] method229(int arg0, byte arg1) {
        if (arg1 >= -48) {
            return null;
        }
        field648++;
        if (this.field650 == this.field649) {
            this.field664 = this.field653[arg0] == null;
            this.field653[arg0] = class195.field3336;
            return this.field660[arg0];
        } else if (this.field649 == 1) {
            this.field664 = this.field645 != arg0;
            this.field645 = arg0;
            return this.field660[0];
        } else {
            class197 var3 = this.field653[arg0];
            if (var3 == null) {
                this.field664 = true;
                if (this.field661 < this.field649) {
                    var3 = new class197(arg0, this.field661);
                    this.field661++;
                } else {
                    class197 var4 = (class197) this.field643.method546(21708);
                    var3 = new class197(arg0, var4.field3369);
                    this.field653[var4.field3377] = null;
                    var4.method741(3);
                }
                this.field653[arg0] = var3;
            } else {
                this.field664 = false;
            }
            this.field643.method558((byte) 126, var3);
            return this.field660[var3.field3369];
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static void method230(byte arg0) {
        field651 = null;
        field657 = null;
        if (arg0 >= -6) {
            return;
        }
        field652 = null;
        field655 = null;
        field647 = null;
        field642 = null;
        field644 = null;
        field658 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(III)V")
    public class39(int arg0, int arg1, int arg2) {
        this.field650 = arg1;
        this.field653 = new class197[this.field650];
        this.field649 = arg0;
        this.field660 = new int[this.field649][arg2];
    }
}
