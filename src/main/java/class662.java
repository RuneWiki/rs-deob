import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class662 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lcq;")
    public static class110 field9280 = new class110(33, 8);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lvc;")
    public static class390 field9282;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ltf;")
    public static class701 field9281;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
    public static final boolean method3678(int arg0, int arg1, int arg2) {
        field9279++;
        return arg2 == 8 ? (class227.method1365(arg0, (byte) -115, arg1) | class231.method1386(arg0, -102, arg1) | class647.method3622(arg0, 0, arg1)) & class143.method787((byte) 48, arg1, arg0) : true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3679(int arg0, byte arg1, int arg2) {
        if (arg1 != 73) {
            field9281 = null;
        }
        field9278++;
        return class620.method3459(-80, arg0, arg2) || class145.method795((byte) -118, arg0, arg2);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method3680(int arg0) {
        if (arg0 == -24663) {
            field9281 = null;
            field9280 = null;
            field9282 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method3681(byte arg0) {
        if (arg0 >= -31) {
            return;
        }
        field9277++;
        class5 var1 = null;
        try {
            class88 var2 = class353.field4757.method2682("2", true, (byte) -16);
            while (var2.field884 == 0) {
                class452.method2602(1L, (byte) -97);
            }
            if (var2.field884 == 1) {
                var1 = (class5) var2.field886;
                byte[] var3 = new byte[(int) var1.method36(false)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method41(var3, var4, var3.length - var4, 31558);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class163.method884(95, new class115(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method37(-1);
            }
        } catch (Exception var6) {
        }
    }
}
