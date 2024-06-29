import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 implements Runnable {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[Loj;")
    public volatile class156[] field699 = new class156[2];

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Z")
    public volatile boolean field704 = false;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Z")
    public volatile boolean field705 = false;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Lpj;")
    public static class237 field708 = method353("null", 51);

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lge;")
    public static class69 field703 = new class69(16);

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Lpj;")
    public static class237 field711 = method353(")1 ", 81);

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field713 = 2;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "Lpj;")
    private static class237 field719 = method353("Loading sprites )2 ", 60);

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Lpj;")
    public static class237 field715 = field719;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
    public static int[] field720 = new int[2];

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[B")
    public static byte[] field718 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lpj;")
    public static class237 field712 = method353("m-Ochte mit Ihnen handeln)3", 54);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Lw;")
    public static class141 field716;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Lfa;")
    public static class239 field714;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Lfa;")
    public static class239 field721;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Laf;")
    public class67 field700;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "Laf;")
    public static class67 field717;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method351(byte arg0) {
        field711 = null;
        field718 = null;
        field714 = null;
        field719 = null;
        field703 = null;
        field712 = null;
        field717 = null;
        field716 = null;
        field715 = null;
        field721 = null;
        if (arg0 >= 40) {
            field720 = null;
            field708 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLfa;Lui;Lfa;)V")
    public static final void method352(byte arg0, class239 arg1, class219 arg2, class239 arg3) {
        class54.field1120 = arg3;
        class90.field1649 = arg2;
        class273.field4738 = arg1;
        if (arg0 == 54) {
            field702++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;I)Lpj;")
    public static final class237 method353(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field706++;
        int var3 = var2.length;
        int var4 = 0;
        class237 var5 = new class237();
        var5.field4151 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field4151[var5.field4114++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var5.field4151[var5.field4114++] = (byte) var6;
            }
        }
        if (arg1 <= 13) {
            field712 = null;
        }
        var5.method1596(20325);
        return var5.method1595(28110);
    }

    @OriginalMember(owner = "client!bl", name = "run", descriptor = "()V")
    public final void run() {
        field709++;
        this.field705 = true;
        try {
            while (!this.field704) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class156 var2 = this.field699[var1];
                    if (var2 != null) {
                        var2.method1073(false);
                    }
                }
                class84.method645(1, 10L);
                class65.method539(this.field700, 9884, (Object) null);
            }
        } catch (Exception var9) {
            class158.method1123((String) null, (byte) -122, var9);
        } finally {
            Object var6 = null;
            this.field705 = false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Lcb;")
    public static final class232 method354(int arg0, int arg1, int arg2) {
        class35 var3 = class274.field4775[arg0][arg1][arg2];
        return var3 == null || var3.field753 == null ? null : var3.field753;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static final void method355(int arg0) {
        field707++;
        class114.field1997.method934((byte) 62);
        int var1 = 109 / ((10 - arg0) / 40);
        class90.field1640.method934((byte) 62);
    }
}
