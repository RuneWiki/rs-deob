import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class604 extends class567 implements class718 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field8415;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Lwr;")
    public static class459 field8417 = new class459(4);

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "[I")
    public static int[] field8423 = new int[13];

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I", line = 3)
    public final int method3338(int arg0) {
        if (arg0 != -22132) {
            return 116;
        } else {
            ++field8416;
            return 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)J", line = 15)
    public final long method3339(int arg0) {
        if (arg0 != 20260) {
            return -35L;
        } else {
            ++field8420;
            return super.field8000.getAddress();
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)I", line = 28)
    public final int method3340(int arg0) {
        if (arg0 != 5061) {
            field8422 = 93;
        }
        ++field8414;
        return this.field8415;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lac;I[BI)V", line = 40)
    public class604(class541 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8415 = arg1;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 57)
    public static void method3341(byte arg0) {
        if (arg0 >= -62) {
            field8422 = -42;
        }
        field8417 = null;
        field8423 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B[BII)V", line = 68)
    public final void method3342(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method3191(arg1, arg2);
        if (arg0 == -47) {
            ++field8418;
            this.field8415 = arg3;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBZ)I", line = 81)
    public static final int method3343(int arg0, byte arg1, boolean arg2) {
        ++field8419;
        if (arg2) {
            return 0;
        } else {
            class369 var3 = class190.method1059(arg0, arg2, 6);
            if (var3 == null) {
                return class503.field6834.method3321(9, arg0).field6809;
            } else {
                int var4 = 0;
                for (int var5 = 0; var3.field5172.length > var5; ++var5) {
                    if (var3.field5172[var5] == -1) {
                        ++var4;
                    }
                }
                if (arg1 <= 93) {
                    return -9;
                } else {
                    return var4 + (class503.field6834.method3321(9, arg0).field6809 - var3.field5172.length);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)I", line = 116)
    public static final int method3344(int arg0, int arg1, int arg2) {
        ++field8421;
        int var3 = class583.method3257(11348, arg2 + -1, arg1 + -1) + class583.method3257(11348, arg2 + 1, arg1 + -1) - (-class583.method3257(11348, arg2 - 1, arg1 + 1) + -class583.method3257(11348, arg2 - -1, arg1 + 1));
        int var4 = class583.method3257(11348, arg2 + -1, arg1) - (-class583.method3257(11348, arg2 + 1, arg1) + -class583.method3257(11348, arg2, arg1 + -1) + -class583.method3257(11348, arg2, arg1 + 1));
        int var5 = class583.method3257(11348, arg2, arg1);
        int var6 = 25 / ((-47 - arg0) / 54);
        return var3 / 16 + var4 / 8 - -(var5 / 4);
    }
}
