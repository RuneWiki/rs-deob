import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class122 extends class178 {

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Lpj;")
    public static class237 field2152 = class33.method353("", 120);

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "[I")
    public static int[] field2154 = new int[1000];

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field2153 = 0;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lpj;")
    public class237 field2149;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lpj;")
    public class237 field2155;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lfa;IB)Z")
    public static final boolean method872(class239 arg0, int arg1, byte arg2) {
        ++field2150;
        if (arg2 != -20) {
            method874(38);
        }
        byte[] var3 = arg0.method1656(arg2 + 20, arg1);
        if (var3 == null) {
            return false;
        } else {
            class172.method1190(var3, (byte) 75);
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public static void method873(byte arg0) {
        field2152 = null;
        if (arg0 >= -20) {
            method874(49);
        }
        field2154 = null;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)I")
    public static final int method874(int arg0) {
        if (arg0 != 17364) {
            method872((class239) null, -27, (byte) 10);
        }
        ++field2156;
        return class24.field441;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Lcd;")
    public final class27 method875(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field2151;
            return class202.field3470[super.field3129];
        }
    }
}
