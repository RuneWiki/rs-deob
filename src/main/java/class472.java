import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class472 extends class541 {

    @OriginalMember(owner = "client!so", name = "s", descriptor = "Lvr;")
    public static class139 field6327 = null;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public static int field6331 = 328;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "D")
    public static double field6326;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static void method2686(byte arg0) {
        field6327 = null;
        if (arg0 != -66) {
            field6330 = 30;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        if (!arg0) {
            field6333++;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method58(byte arg0, OggPacket arg1) {
        if (arg0 == 61) {
            field6332++;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([Lrba;II)V")
    public static final void method2687(class435[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class435 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field5798;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field5798 > (var7 & 0x1) + var6) {
                class435 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2687(arg0, arg1, var4 - 1);
        method2687(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
    public static final void method2688(int arg0) {
        field6328++;
        class700 var1 = null;
        try {
            class181 var2 = class162.field2227.method2638("", 3070, true);
            while (var2.field2538 == 0) {
                class149.method1052(1L, true);
            }
            if (var2.field2538 == 1) {
                var1 = (class700) var2.field2540;
                class461 var3 = class748.field10451.method4144(24);
                var1.method3937(-14430, 0, var3.field6193, var3.field6180);
            }
            int var4 = 118 % ((-arg0 - 59) / 55);
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method3941(true);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2689(int arg0, String arg1) {
        field6325++;
        class589 var2 = class293.method1762(arg0 ^ 0xFFFFE745);
        var2.field8251.method2578(class262.field3309.field7471, -1221492240);
        var2.field8251.method2620(arg0, false);
        int var3 = var2.field8251.field6193;
        var2.field8251.method2620(638, false);
        int[] var4 = class373.method2147(var2, 4);
        int var5 = var2.field8251.field6193;
        var2.field8251.method2597(arg1, (byte) 101);
        var2.field8251.method2578(class243.field3143, arg0 - 1221492240);
        var2.field8251.field6193 += 7;
        var2.field8251.method2615(var4, var5, var2.field8251.field6193, arg0 - 32768);
        var2.field8251.method2602(var2.field8251.field6193 - var3, (byte) 70);
        class737.method4107(var2, arg0 + 7);
        class359.field4634 = 0;
        class638.field8793 = 0;
        class142.field2011 = 1;
        class692.field9626 = -3;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class472(OggStreamState arg0) {
        super(arg0);
    }
}
