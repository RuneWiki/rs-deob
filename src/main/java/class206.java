import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class206 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[I")
    public static int[] field3700 = new int[14];

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "F")
    public static float field3707;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public static int[] field3704;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3700 = null;
        if (arg0 <= -41) {
            field3704 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V")
    public static final void method1456(boolean arg0, int arg1) {
        field3699++;
        if (class124.field2211 == arg0) {
            return;
        }
        class124.field2211 = arg0;
        class164.method1181((byte) 121);
        if (arg1 != -108118970) {
            method1459(-118, (byte) 97);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V")
    public static final void method1457(int arg0, int arg1, int arg2, int arg3) {
        field3706++;
        class212 var4 = class123.method905(arg1 ^ 0xB8279929, arg1, arg2);
        var4.method1493(13);
        var4.field3889 = arg3;
        var4.field3883 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(ZI)Lch;")
    public static final class282 method1458(boolean arg0, int arg1) {
        class282 var2 = (class282) class283.field5079.method1852((long) arg1, (byte) -105);
        field3701++;
        if (arg0) {
            field3702 = 30;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class85.field1550.method1271(5, -2154, arg1);
        class282 var4 = new class282();
        if (var3 != null) {
            var4.method1935(126, new class280(var3));
        }
        class283.field5079.method1847(var4, 96, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V")
    public static final void method1459(int arg0, byte arg1) {
        field3705++;
        if (arg1 <= 49) {
            field3703 = 43;
        }
        class50.field815.method298(true, arg0);
    }
}
