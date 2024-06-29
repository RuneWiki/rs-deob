import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public abstract class class522 {

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
    public int field7313;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
    public int field7318;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public int field7312;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "Lhg;")
    public static class693 field7316 = new class693(61, 4);

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "Let;")
    public static class596 field7319 = new class596(1);

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!hha", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field7320;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V", line = 9)
    public static void method3030(byte arg0) {
        int var1 = -121 / ((arg0 - 62) / 48);
        field7320 = null;
        field7319 = null;
        field7316 = null;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V", line = 21)
    public static final void method3031(int arg0) {
        if (arg0 != 1603) {
            field7320 = null;
        }
        field7317++;
        class586.field8185.method3668(0);
        class28.field506 = 0;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)V", line = 34)
    public static final void method3032(int arg0, int arg1) {
        field7311++;
        class709.field9849 = false;
        if (arg0 != 4) {
            method3031(-4);
        }
        class514.field7217 = 1;
        class360.field4661 = arg1;
        client.field3977 = null;
        class615.field8495 = -1;
        class174.field2415 = 0;
        class272.field3416 = -1;
        class230.field3028 = null;
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V", line = 59)
    public static final void method3033(int arg0) {
        field7314++;
        if (!class8.field103) {
            return;
        }
        class288 var1 = class466.method2658(class100.field1388, class27.field489, 30639);
        if (var1 != null && var1.field3661 != null) {
            class694 var2 = new class694();
            var2.field9635 = var1;
            var2.field9645 = var1.field3661;
            class188.method1262(var2);
        }
        class718.field10004 = -1;
        class8.field103 = false;
        if (arg0 < 14) {
            field7319 = null;
        }
        class740.field10331 = -1;
        if (var1 != null) {
            class207.method1332((byte) -81, var1);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(IBI)Z", line = 92)
    public static final boolean method3034(int arg0, byte arg1, int arg2) {
        int var3 = 98 / ((arg1 + 1) / 60);
        field7315++;
        return class107.method861(arg2, 32768, arg0) | (arg2 & 0x800) != 0 || class164.method1143(arg2, -1, arg0);
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(III)V", line = 103)
    public class522(int arg0, int arg1, int arg2) {
        this.field7313 = arg2;
        this.field7318 = arg1;
        this.field7312 = arg0;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZII)V")
    public abstract void method1094(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(III)V")
    public abstract void method1092(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(III)V")
    public abstract void method1093(int arg0, int arg1, int arg2);
}
