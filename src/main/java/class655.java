import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class655 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field9236 = 0;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Ljo;")
    public static class351 field9238 = new class351(56, 2);

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Ljo;")
    public static class351 field9239 = new class351(83, -1);

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lke;")
    public static class622 field9240 = new class622(71, 10);

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lrh;")
    public static class275 field9242 = new class275(13, 0, 1, 0);

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "[Lco;")
    public static class129[] field9243 = new class129[14];

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field9241;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static final void method3755(byte arg0) {
        if (arg0 == 68) {
            class187.field2806.method2503(10);
            field9235++;
            class445.field6330 = 0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZLjava/lang/String;Lcb;)Ldia;")
    public static final class242 method3756(boolean arg0, boolean arg1, String arg2, class544 arg3) {
        field9237++;
        int var4 = arg3.method3134(0, arg2);
        if (var4 == -1) {
            return new class242(0);
        } else if (arg1) {
            return null;
        } else {
            int[] var5 = arg3.method3139(-1, var4);
            class242 var6 = new class242(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var7 < var6.field3466) {
                    class120 var9 = new class120(arg3.method3150(var5[var8++], -102, var4));
                    int var10 = var9.method871(23995);
                    int var11 = var9.method898((byte) -103);
                    int var12 = var9.method842(2384);
                    if (!arg0 && var12 == 1) {
                        var6.field3466--;
                    } else {
                        var6.field3467[var7] = var10;
                        var6.field3469[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public static void method3757(boolean arg0) {
        field9243 = null;
        if (arg0) {
            method3755((byte) 5);
        }
        field9238 = null;
        field9239 = null;
        field9242 = null;
        field9240 = null;
    }
}
