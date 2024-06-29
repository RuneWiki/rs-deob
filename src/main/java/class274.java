import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class274 extends class203 {

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public int field4638 = 0;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Z")
    public boolean field4643 = true;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public int field4646 = 12800;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public int field4648 = -1;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public int field4651 = 0;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public int field4637 = 12800;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Lmh;")
    public class62 field4653;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public int field4647;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Lmh;")
    public class62 field4650;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Lud;")
    public class52 field4645;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Lmh;")
    public static class62 field4641 = class201.method1405(true, "Fertigkeit)2");

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lbl;")
    public static class143 field4652;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "Z")
    public static boolean field4640;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "[I")
    public static int[] field4639;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)Z", line = 7)
    public final boolean method1871(byte arg0, int arg1, int arg2) {
        field4644++;
        if (this.field4637 > arg1 || arg1 > this.field4638 || this.field4646 > arg2 || arg2 > this.field4651) {
            return false;
        }
        class278 var4 = (class278) this.field4645.method334(-18673);
        if (arg0 != 27) {
            this.field4651 = -124;
        }
        while (var4 != null) {
            if (var4.method1901((byte) -124, arg1, arg2)) {
                return true;
            }
            var4 = (class278) this.field4645.method335((byte) 97);
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIII)V", line = 40)
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4655++;
        if (arg4 >= 1 && arg7 >= 1 && arg4 <= 102 && arg7 <= 102) {
            if (!class149.method1073((byte) -70) && (class42.field641[0][arg4][arg7] & 0x2) == 0) {
                int var8 = arg0;
                if ((class42.field641[arg0][arg4][arg7] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class190.field3028 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (arg0 < 3 && (class42.field641[1][arg4][arg7] & 0x2) == 2) {
                var9 = arg0 + 1;
            }
            class119.method924(class250.field4244[arg0], arg1, 4, arg0, arg7, arg4, var9);
            if (arg5 >= 0) {
                boolean var10 = class276.field4733;
                class276.field4733 = true;
                class110.method847(arg4, arg5, arg0, arg7, var9, arg3, arg2, (byte) 122, false, class250.field4244[arg0], false);
                class276.field4733 = var10;
            }
        }
        if (arg6 != -103) {
            field4652 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(B)V", line = 90)
    public static void method1873(byte arg0) {
        field4652 = null;
        field4641 = null;
        field4639 = null;
        if (arg0 < 96) {
            field4652 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lmh;Lmh;IIIZ)V", line = 188)
    public class274(class62 arg0, class62 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4654 = arg2;
        this.field4653 = arg1;
        this.field4643 = arg5;
        this.field4647 = arg3;
        this.field4648 = arg4;
        this.field4650 = arg0;
        this.field4645 = new class52();
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 122)
    public final void method1874(int arg0) {
        int var2 = -63 % ((arg0 + 10) / 36);
        this.field4646 = 12800;
        field4649++;
        this.field4638 = 0;
        this.field4637 = 12800;
        this.field4651 = 0;
        for (class278 var3 = (class278) this.field4645.method334(-18673); var3 != null; var3 = (class278) this.field4645.method335((byte) 103)) {
            if (this.field4646 > var3.field4764) {
                this.field4646 = var3.field4764;
            }
            if (this.field4651 < var3.field4784) {
                this.field4651 = var3.field4784;
            }
            if (this.field4638 < var3.field4783) {
                this.field4638 = var3.field4783;
            }
            if (var3.field4766 < this.field4637) {
                this.field4637 = var3.field4766;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)J", line = 165)
    public static final long method1875(int arg0, int arg1, int arg2) {
        class166 var3 = class256.field4320[arg0][arg1][arg2];
        return var3 == null || var3.field2720 == null ? 0L : var3.field2720.field4554;
    }
}
