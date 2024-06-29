import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class626 {

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Z")
    public static boolean field9130 = false;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Z")
    public static boolean field9134 = false;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field9112;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field9113;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field9114;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field9115;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field9117;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field9118;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field9121;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public int field9122;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public int field9123;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public int field9124;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field9125;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field9127;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field9128;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public int field9129;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field9131;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public int field9135;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public int field9136;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public int field9137;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Z")
    public static boolean field9116;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static final void method3652(int arg0) {
        int var1 = -99 / ((arg0 - 14) / 45);
        field9119++;
        class494.field6919.method1279(class392.field5533, class552.field7624, class118.field1935);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)[Ltl;")
    public static final class531[] method3653(boolean arg0) {
        if (arg0) {
            method3655(null, (byte) -10);
        }
        field9133++;
        return new class531[] { class71.field1181, class494.field6920, class592.field8492, class224.field3214, class270.field3766, class487.field6836 };
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V")
    public static final void method3654(int arg0, int arg1) {
        if (arg0 != 28698) {
            method3655(null, (byte) -106);
        }
        field9126++;
        class571 var2 = class65.field1110;
        synchronized (class65.field1110) {
            class65.field1110.method3253(arg1, -128);
        }
        class571 var3 = class384.field5141;
        synchronized (class384.field5141) {
            class384.field5141.method3253(arg1, -126);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lmc;B)V")
    public static final void method3655(class114 arg0, byte arg1) {
        field9132++;
        class114 var2 = class104.method741((byte) -128, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class387.field5196;
            var4 = class134.field2128;
        } else {
            var3 = var2.field1853;
            var4 = var2.field1769;
        }
        int var5 = -105 % ((arg1 - 57) / 35);
        class466.method2722(var4, false, var3, arg0, false);
        class615.method3594(var4, false, var3, arg0);
    }
}
