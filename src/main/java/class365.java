import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class365 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    public static boolean field5242 = false;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field5243 = 0;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lcb;")
    public static class318 field5244 = new class318(19, 0);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
    public static final void method2237() {
        class119.method726(1, class87.field1079);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method2238(int arg0) {
        field5244 = null;
        if (arg0 != 0) {
            method2237();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2239(int arg0, int arg1, String arg2) {
        field5247++;
        class334.method2133("", arg0, "", arg2, 0, -64, "");
        if (arg1 != 19074) {
            field5243 = -74;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method2240(int arg0, byte arg1, int arg2) {
        int var3 = -106 % ((12 - arg1) / 36);
        field5245++;
        int var4 = arg2 - arg0;
        if (var4 < -9) {
            return "<col=ff0000>";
        } else if (var4 < -6) {
            return "<col=ff3000>";
        } else if (var4 < -3) {
            return "<col=ff7000>";
        } else if (var4 < 0) {
            return "<col=ffb000>";
        } else if (var4 > 9) {
            return "<col=00ff00>";
        } else if (var4 > 6) {
            return "<col=40ff00>";
        } else if (var4 > 3) {
            return "<col=80ff00>";
        } else if (var4 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([[BZLm;)V")
    public static final void method2241(byte[][] arg0, boolean arg1, class110 arg2) {
        field5246++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class138 var11 = new class138(var10);
                int var12 = class339.field4957[var5] >> 8;
                int var13 = class339.field4957[var5] & 0xFF;
                int var14 = var12 * 64 - class253.field3490;
                int var15 = var13 * 64 - class186.field2280;
                class155.method1031(-123);
                arg2.method2925(var11, var15, class186.field2280, -100, var14, class624.field8489, class253.field3490);
                arg2.method592(var15, class9.field103, var11, var3, -110, var14);
                if (!arg2.field7070 && (class690.field9747 / 8) == var12 && (class179.field2235 / 8) == var13 && var3[0] != -1) {
                    class397.field5668 = class603.field8243.method2898(-27611, var3[2], var3[0], class502.field6772, var3[1], var3[3]);
                    class487.field6572 = var3[4];
                }
            }
        }
        if (arg1) {
            return;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class339.field4957[var6] >> 8) * 64 - class253.field3490;
            int var8 = (class339.field4957[var6] & 0xFF) * 64 - class186.field2280;
            byte[] var9 = arg0[var6];
            if (var9 == null && class179.field2235 < 800) {
                class155.method1031(-73);
                arg2.method2930(var8, 8297, var7, 64, 64);
            }
        }
    }
}
