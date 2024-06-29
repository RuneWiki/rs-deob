import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class314 extends class170 {

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "Z")
    public static boolean field4262;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "Ltn;")
    private class109 field4261;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Lij;")
    public static class316 field4254;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILrg;)V")
    private final void method1897(int arg0, int arg1, class366 arg2) {
        field4253++;
        int var4 = -107 / ((arg0 + 42) / 32);
        if (arg1 != 249) {
            return;
        }
        int var5 = arg2.method2306((byte) 91);
        if (this.field4261 == null) {
            int var6 = class177.method1249((byte) -123, var5);
            this.field4261 = new class109(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg2.method2306((byte) 85) == 1;
            int var9 = arg2.method2263((byte) 10);
            class311 var10;
            if (var8) {
                var10 = new class245(arg2.method2255(-32226));
            } else {
                var10 = new class166(arg2.method2258(1177515464));
            }
            this.field4261.method835(4, var10, (long) var9);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method1898(byte arg0) {
        if (arg0 != -97) {
            field4262 = false;
        }
        field4254 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)I")
    public final int method1899(byte arg0, int arg1, int arg2) {
        field4256++;
        if (this.field4261 == null) {
            return arg2;
        }
        class166 var4 = (class166) this.field4261.method837((byte) -72, (long) arg1);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 <= 94) {
                this.method1899((byte) 13, 26, -76);
            }
            return var4.field2342;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1900(long arg0, byte arg1) {
        class68.field946.setTime(new Date(arg0));
        field4260++;
        int var3 = class68.field946.get(7);
        int var4 = class68.field946.get(5);
        int var5 = class68.field946.get(2);
        int var6 = class68.field946.get(1);
        int var7 = class68.field946.get(11);
        int var8 = class68.field946.get(12);
        int var9 = class68.field946.get(13);
        return arg1 == -86 ? class132.field1981[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class351.field4723[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT" : null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILrg;)V")
    public final void method1901(int arg0, class366 arg1) {
        field4257++;
        while (true) {
            int var3 = arg1.method2306((byte) 78);
            if (var3 == 0) {
                if (arg0 < 14) {
                    field4259 = -128;
                    return;
                } else {
                    return;
                }
            }
            this.method1897(38, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
    public final String method1902(String arg0, byte arg1, int arg2) {
        field4255++;
        if (this.field4261 == null) {
            return arg0;
        } else if (arg1 == 5) {
            class245 var4 = (class245) this.field4261.method837((byte) -72, (long) arg2);
            return var4 == null ? arg0 : var4.field3460;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1903(int arg0, String arg1) {
        field4258++;
        if (class67.field944 != null) {
            class253.field3515++;
            class88.field1232.method1151(arg0, (byte) -36);
            class88.field1232.method2280(class82.method662(12189, arg1), 1537846408);
            class88.field1232.method2285(arg1, (byte) -97);
        }
    }

    static {
        new class368("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4262 = true;
        field4259 = 0;
    }
}
