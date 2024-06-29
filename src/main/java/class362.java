import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class362 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public int field5729 = -1;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field5734 = -1;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field5728 = -1;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5732 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Ll;")
    public static class328 field5736 = new class328(16);

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
    public int[] field5735;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILoe;I)V", line = 4)
    private final void method2542(int arg0, int arg1, class146 arg2, int arg3) {
        if (arg3 != 29949) {
            this.field5734 = 75;
        }
        field5731++;
        if (arg1 == 1) {
            this.field5729 = arg2.method989(93);
        } else if (arg1 == 2) {
            this.field5735 = new int[arg2.method1005((byte) 122)];
            for (int var5 = 0; var5 < this.field5735.length; var5++) {
                this.field5735[var5] = arg2.method989(76);
            }
        } else if (arg1 == 3) {
            this.field5734 = arg2.method1005((byte) 122);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLek;)V", line = 38)
    public static final void method2543(byte arg0, class206 arg1) {
        field5730++;
        int var2 = 30 % ((arg0 - 30) / 57);
        class201.field3379 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILoe;I)V", line = 49)
    public final void method2544(int arg0, class146 arg1, int arg2) {
        field5733++;
        if (arg0 != 0) {
            this.method2544(-54, (class146) null, -87);
        }
        while (true) {
            int var4 = arg1.method1005((byte) 122);
            if (var4 == 0) {
                return;
            }
            this.method2542(arg2, var4, arg1, 29949);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V", line = 72)
    public static void method2545(boolean arg0) {
        if (arg0) {
            method2543((byte) -126, (class206) null);
        }
        field5736 = null;
        field5732 = null;
    }
}
