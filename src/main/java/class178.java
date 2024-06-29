import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class178 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    private int field3651 = -1;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    private int field3654 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lth;")
    private class187 field3650 = new class187();

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Z")
    public boolean field3661 = false;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[Loc;")
    private class137[] field3659;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    private int field3645;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[[I")
    private int[][] field3647;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3648 = 0;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lld;")
    public static class111 field3649 = new class111(30);

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field3663 = -1;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Lah;")
    public static class9 field3658;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[Lba;")
    public static class12[] field3664;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public static final void method1184(boolean arg0) {
        class69.field1659 = new int[104];
        class25.field502 = 99;
        field3652++;
        class191.field3836 = new byte[4][104][104];
        if (arg0) {
            return;
        }
        class102.field2286 = new int[104];
        class145.field3054 = new byte[4][104][104];
        class69.field1672 = new byte[4][104][104];
        class198.field3943 = new int[104];
        class99.field2186 = new int[104];
        class92.field2050 = new byte[4][105][105];
        class179.field3677 = new int[4][105][105];
        class23.field458 = new byte[4][104][104];
        class74.field1785 = new int[104];
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)Log;")
    public static final class141 method1185(boolean arg0, int arg1) {
        field3655++;
        class141 var2 = (class141) class131.field2823.method817(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field3087.method39(3, -1, arg1);
        class141 var4 = new class141();
        if (var3 != null) {
            var4.method976((byte) 90, new class26(var3));
        }
        class131.field2823.method816(var4, (long) arg1, 16);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public final void method1186(int arg0) {
        if (arg0 != 104) {
            this.field3650 = null;
        }
        field3653++;
        for (int var2 = 0; var2 < this.field3645; var2++) {
            this.field3647[var2] = null;
        }
        this.field3659 = null;
        this.field3647 = null;
        this.field3650.method1230(-13057);
        this.field3650 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)[[I")
    public final int[][] method1187(int arg0) {
        field3660++;
        if (this.field3646 != this.field3645) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3645; var2++) {
            this.field3659[var2] = class75.field1799;
        }
        return arg0 > -1 ? null : this.field3647;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static void method1188(int arg0) {
        field3658 = null;
        field3649 = null;
        if (arg0 != 18976) {
            method1184(true);
        }
        field3664 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)[I")
    public final int[] method1189(byte arg0, int arg1) {
        if (arg0 != 33) {
            method1185(false, -56);
        }
        field3657++;
        if (this.field3646 == this.field3645) {
            this.field3661 = this.field3659[arg1] == null;
            this.field3659[arg1] = class75.field1799;
            return this.field3647[arg1];
        } else if (this.field3645 == 1) {
            this.field3661 = this.field3651 != arg1;
            this.field3651 = arg1;
            return this.field3647[0];
        } else {
            class137 var3 = this.field3659[arg1];
            if (this.field3661 = var3 == null) {
                if (this.field3654 >= this.field3645) {
                    class137 var4 = (class137) this.field3650.method1241((byte) -125);
                    var3 = new class137(arg1, var4.field2928);
                    this.field3659[var4.field2921] = null;
                    var4.method799(-24265);
                } else {
                    var3 = new class137(arg1, this.field3654);
                    this.field3654++;
                }
                this.field3659[arg1] = var3;
            }
            this.field3650.method1239((byte) 126, var3);
            return this.field3647[var3.field2928];
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(III)V")
    public class178(int arg0, int arg1, int arg2) {
        this.field3646 = arg1;
        this.field3659 = new class137[arg1];
        this.field3645 = arg0;
        this.field3647 = new int[arg0][arg2];
    }
}
