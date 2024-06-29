import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class703 extends class55 {

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
    public int field9872;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
    public int field9868;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
    public static int field9873 = 0;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "Lgea;")
    public static class76 field9866 = new class76(64);

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!waa", name = "v", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(III)I")
    public static final int method3961(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field9873 = -117;
        }
        field9874++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)I")
    public final int method3962(int arg0) {
        field9869++;
        return arg0 == 1 ? (this.field9868 & 0x1DF9B4) >> 18 : 24;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)Z")
    public final boolean method3963(int arg0) {
        if (arg0 != -1) {
            this.method3963(-109);
        }
        field9865++;
        return ((this.field9868 & 0x325CE0) >> 21) != 0;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public static void method3964(byte arg0) {
        if (arg0 != 116) {
            method3964((byte) 30);
        }
        field9866 = null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BI)Z")
    public final boolean method3965(byte arg0, int arg1) {
        field9875++;
        if (arg0 == -72) {
            return (this.field9868 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)Z")
    public final boolean method3966(byte arg0) {
        field9864++;
        int var2 = -125 % ((arg0 + 72) / 42);
        return (this.field9868 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)I")
    public final int method3967(int arg0) {
        field9867++;
        if (arg0 != -1) {
            this.method3968(-124);
        }
        return class24.method95(this.field9868, (byte) 64);
    }

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "(I)Z")
    public final boolean method3968(int arg0) {
        if (arg0 == 1964468) {
            field9871++;
            return (this.field9868 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(II)V")
    public class703(int arg0, int arg1) {
        this.field9872 = arg1;
        this.field9868 = arg0;
    }
}
