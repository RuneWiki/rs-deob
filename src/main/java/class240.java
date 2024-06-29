import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class class240 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
    public static int[] field3565 = new int[50];

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "J")
    public static long field3567 = 0L;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
    public static final void method1614(boolean arg0) {
        if (arg0) {
            field3565 = null;
        }
        field3566++;
        if (class359.field5226) {
            return;
        }
        class151.method1037(class349.field5121, 1336672256);
        if (class200.field2829 != null) {
            class151.method1037(class200.field2829, 1336672256);
        }
        class359.field5226 = true;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZZBLdp;)V")
    public static final void method1615(boolean arg0, boolean arg1, byte arg2, class182 arg3) {
        field3564++;
        if (arg2 <= 84) {
            return;
        }
        int var4 = arg3.field2564;
        int var5 = (int) arg3.field3907;
        arg3.method1820(-25246);
        if (arg1) {
            class464.method2866((byte) 28, var4);
        }
        class150.method1027((byte) 116, var4);
        class223 var6 = class432.method2655((byte) -107, var5);
        if (var6 != null) {
            class15.method216((byte) 123, var6);
        }
        class309.method2060((byte) 110);
        if (!arg0 && class318.field4672 != -1) {
            class433.method2657(1, (byte) -75, class318.field4672);
        }
        class22 var7 = new class22(class252.field3703);
        for (class182 var8 = (class182) var7.method242(0); var8 != null; var8 = (class182) var7.method240((byte) -104)) {
            if (!var8.method1822(-92)) {
                var8 = (class182) var7.method242(0);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2562 == 3) {
                int var9 = (int) var8.field3907;
                if (var9 >>> 16 == var4) {
                    method1615(arg0, true, (byte) 122, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLat;)Lit;")
    public static final class366 method1616(byte arg0, class256 arg1) {
        field3569++;
        return arg0 <= 33 ? null : new class366(arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1747((byte) 12), arg1.method1725((byte) 0), arg1.method1738((byte) -52));
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1617(byte arg0);

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
    public static void method1618(byte arg0) {
        field3565 = null;
        if (arg0 != -90) {
            method1614(true);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILct;)Lbk;")
    public static final class34 method1619(int arg0, int arg1, class104 arg2) {
        field3563++;
        byte[] var3 = arg2.method733(0, arg1);
        if (arg0 <= 30) {
            method1615(true, true, (byte) 13, (class182) null);
        }
        return var3 == null ? null : new class34(var3);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([BB)V")
    public abstract void method1620(byte[] arg0, byte arg1);
}
