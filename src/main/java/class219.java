import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class219 extends class162 {

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Z")
    public static boolean field3507 = false;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Leg;")
    public static class272 field3510 = new class272(64);

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Leb;")
    public static class103 field3506;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Ljj;")
    public static class134 field3502;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Ljava/lang/String;")
    public String field3505;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Ljava/lang/String;")
    public String field3509;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
    public static final void method1455(boolean arg0, int arg1) {
        ++field3504;
        if (arg1 != 64) {
            method1458(-27, -119, 33, -123, -124);
        }
        for (class54 var2 = (class54) class76.field1041.method365(3); var2 != null; var2 = (class54) class76.field1041.method372((byte) 7)) {
            if (var2.field749 != null) {
                class215.field3464.method454(var2.field749);
                var2.field749 = null;
            }
            if (var2.field764 != null) {
                class215.field3464.method454(var2.field764);
                var2.field764 = null;
            }
            var2.method544(121);
        }
        if (arg0) {
            for (class54 var3 = (class54) class128.field2141.method365(3); var3 != null; var3 = (class54) class128.field2141.method372((byte) 7)) {
                if (var3.field749 != null) {
                    class215.field3464.method454(var3.field749);
                    var3.field749 = null;
                }
                var3.method544(-43);
            }
            for (class54 var4 = (class54) class189.field3018.method465((byte) -123); var4 != null; var4 = (class54) class189.field3018.method461((byte) -13)) {
                if (var4.field749 != null) {
                    class215.field3464.method454(var4.field749);
                    var4.field749 = null;
                }
                var4.method544(arg1 ^ 50);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static void method1456(byte arg0) {
        if (arg0 == 31) {
            field3502 = null;
            field3506 = null;
            field3510 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)Lle;")
    public final class220 method1457(boolean arg0) {
        if (arg0) {
            method1455(true, 32);
        }
        ++field3511;
        return class244.field3907[super.field2635];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V")
    public static final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg4 > ~arg2) {
            for (int var5 = arg4; var5 < arg2; ++var5) {
                class85.field1162[var5][arg1] = arg0;
            }
        } else {
            for (int var6 = arg2; arg4 > var6; ++var6) {
                class85.field1162[var6][arg1] = arg0;
            }
        }
        ++field3503;
        if (arg3 > -21) {
            method1456((byte) 20);
        }
    }
}
