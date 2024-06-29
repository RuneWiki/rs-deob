import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class38 extends class503 implements class17 {

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "Lrt;")
    private class179 field386;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method75(boolean arg0, int arg1) {
        ++field388;
        return arg1 != 21281 ? null : super.method2892(arg1 + -21391, super.field7248.field2724, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)V")
    public final void method73(int arg0, byte arg1) {
        ++field384;
        super.method73(this.field386.field2003 * arg0, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
    public final int method197(int arg0) {
        ++field385;
        int var2 = 52 % ((27 - arg0) / 38);
        return super.method197(75);
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)Z")
    public final boolean method71(int arg0) {
        ++field387;
        if (arg0 != -26305) {
            this.field386 = null;
        }
        return super.method2888(super.field7248.field2724, -1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)Lrt;")
    public final class179 method72(byte arg0) {
        ++field382;
        int var2 = 63 % ((30 - arg0) / 41);
        return this.field386;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public static final void method198(boolean arg0) {
        if (~class311.field3846 >= -1) {
            class222.field2755 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class210.field2549.length; ++var2) {
                if (class210.field2549[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class311.field3846;
                    ++var1;
                    if (var10000 == ~var1) {
                        class222.field2755 = class210.field2549[var2].substring(class210.field2549[var2].indexOf(">") - -2);
                        break;
                    }
                }
            }
        }
        if (!arg0) {
            method199(-5, (char) 65501, (String) null);
        }
        ++field383;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lmr;Lrt;Z)V")
    public class38(class221 arg0, class179 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field386 = arg1;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
    public final void method74(byte arg0) {
        if (arg0 >= 99) {
            ++field389;
            super.method74((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method199(int arg0, char arg1, String arg2) {
        ++field381;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg0; var4 > var5; ++var5) {
            if (~arg2.charAt(var5) == ~arg1) {
                ++var3;
            }
        }
        return var3;
    }
}
