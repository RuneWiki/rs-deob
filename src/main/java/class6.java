import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class6 extends class294 {

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "Lct;")
    public static class285 field103 = new class285(44, 11);

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "Lct;")
    public static class285 field106;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Ljava/lang/String;")
    public String field94;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILtr;ZILtq;I)V")
    public static final void method39(int arg0, int arg1, class229 arg2, boolean arg3, int arg4, class63 arg5, int arg6) {
        field100++;
        if (arg3) {
            class332.field4974.method1958((class342.field5115 - class332.field4974.method791()) / 2, (class233.field3411 - class332.field4974.method789()) / 2);
            class273.field4160.method1958((class342.field5115 - class273.field4160.method791()) / 2, 18);
        }
        arg2.method1494(-1, arg0, class342.field5115 / 2, (byte) 93, (class13.field195 == class124.field1710 ? class230.field3387 : class252.field3627).method2036(class4.field85, (byte) -21), class233.field3411 / 2 - 26);
        int var7 = class233.field3411 / 2 - 18;
        arg5.method569(class342.field5115 / 2 - 152, var7, 304, 34, arg4, 0);
        arg5.method569(class342.field5115 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg5.method508(class342.field5115 / 2 - 150, var7 + 2, class29.field403 * 3, 30, arg1, 0);
        arg5.method508(class342.field5115 / 2 + (class29.field403 * 3) - 150, var7 - -2, 300 - class29.field403 * 3, 30, 0, 0);
        arg2.method1494(-1, arg0, class342.field5115 / 2, (byte) 102, class273.field4111, class233.field3411 / arg6 + 4);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
    public static final void method40(byte arg0) {
        int var1 = 112 % ((-arg0 - 37) / 58);
        field102++;
        class324.field4865 = new class412();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method41(int arg0) {
        field106 = null;
        field103 = null;
        if (arg0 != 2) {
            method42(-46);
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)J")
    public static final long method42(int arg0) {
        field97++;
        return arg0 == 151 ? class260.field3869.method718(false) : 124L;
    }

    static {
        new class332("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field107 = -2;
        field106 = new class285(68, 15);
    }
}
