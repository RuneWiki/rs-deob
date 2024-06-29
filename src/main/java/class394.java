import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class394 extends class224 {

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    private int field5914;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    private int field5908;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    private int field5915;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    private int field5910;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field5905 = 3;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5903 = "glow3:";

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
    public static int[] field5904 = new int[100];

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static volatile int field5912 = 0;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Lgl;")
    public static class356 field5911;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIII)V")
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5914 = arg1;
        this.field5908 = arg3;
        this.field5915 = arg2;
        this.field5910 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)V")
    public final void method298(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2488(16, (byte) -54);
        }
        ++field5913;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lmo;ILmo;Lmo;)V")
    public static final void method2486(class447 arg0, int arg1, class447 arg2, class447 arg3) {
        class411.field6085 = arg3;
        if (arg1 != -1) {
            field5905 = 6;
        }
        ++field5901;
        class429.method2660((byte) 40, arg0, arg2);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)V")
    public final void method302(int arg0, int arg1, int arg2) {
        ++field5902;
        int var4 = this.field5910 * arg1 >> 12;
        int var5 = this.field5915 * arg1 >> 12;
        if (arg0 != -1011) {
            this.method302(-125, 76, 59);
        }
        int var6 = this.field5914 * arg2 >> 12;
        int var7 = this.field5908 * arg2 >> 12;
        class105.method795(arg0 + 3250, super.field3730, var5, var7, var4, var6);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static void method2487(boolean arg0) {
        if (!arg0) {
            field5912 = 92;
        }
        field5904 = null;
        field5903 = null;
        field5911 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)C")
    public static final char method2488(int arg0, byte arg1) {
        if (arg0 != -1206145460) {
            return '\u0015';
        } else {
            ++field5907;
            int var2 = 255 & arg1;
            if (~var2 == -1) {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
            } else {
                if (~var2 <= -129 && var2 < 160) {
                    char var3 = class249.field4073[var2 + -128];
                    if (~var3 == -1) {
                        var3 = '?';
                    }
                    var2 = var3;
                }
                return (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public final void method299(int arg0, int arg1, int arg2) {
        ++field5909;
        if (arg2 != -1011) {
            field5911 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2489(byte arg0, String arg1) {
        int var2 = 76 % ((arg0 - -50) / 52);
        if (class314.field4939 == null) {
            class331.method2197(-841);
        }
        ++field5906;
        String[] var3 = class63.method410(arg1, '\n', -1);
        for (int var4 = 0; ~var3.length < ~var4; ++var4) {
            for (int var5 = class92.field1134; var5 > 0; --var5) {
                class314.field4939[var5] = class314.field4939[var5 - 1];
            }
            class314.field4939[0] = var3[var4];
            if (~(class314.field4939.length + -1) < ~class92.field1134) {
                ++class92.field1134;
                if (~class316.field4967 < -1) {
                    ++class316.field4967;
                }
            }
        }
    }
}
