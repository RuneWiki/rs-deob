import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class276 extends class29 {

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Lur;")
    public class95 field4083;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field4080 = 1405;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field4085 = 0;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "Leb;")
    public static class395 field4087 = new class395();

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "[[Z")
    public static boolean[][] field4081;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static void method1879(int arg0) {
        field4081 = null;
        field4087 = null;
        if (arg0 != 31541) {
            field4081 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
    public static final void method1880(byte arg0) {
        field4079++;
        class363 var1 = class47.field615;
        synchronized (class47.field615) {
            class47.field615.method2307(48);
            if (arg0 < 59) {
                field4087 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1881(int arg0);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1882(boolean arg0);

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lur;I)V")
    public class276(class95 arg0, int arg1) {
        this.field4083 = arg0;
        this.field4086 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
    public static final void method1883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class138 var5 = (class138) class208.field2940.method2478(1603); var5 != null; var5 = (class138) class208.field2940.method2486((byte) -82)) {
            class365.method2326((byte) 121, arg4, arg2, var5, arg1, arg3);
        }
        field4082++;
        for (class138 var6 = (class138) class422.field6101.method2478(1603); var6 != null; var6 = (class138) class422.field6101.method2486((byte) -82)) {
            byte var11 = 1;
            class446 var12 = var6.field1881.method450(0);
            if (var6.field1881.field719) {
                var11 = 0;
            } else if (var6.field1881.field706 == var12.field6484 || var6.field1881.field706 == var12.field6486 || var6.field1881.field706 == var12.field6499 || var6.field1881.field706 == var12.field6537) {
                var11 = 2;
            } else if (var6.field1881.field706 == var12.field6504 || var6.field1881.field706 == var12.field6498 || var6.field1881.field706 == var12.field6503 || var6.field1881.field706 == var12.field6505) {
                var11 = 3;
            }
            if (var6.field1891 != var11) {
                int var13 = class171.method1110(var6.field1881, true);
                if (var6.field1901 != var13) {
                    if (var6.field1898 != null) {
                        class452.field6671.method278(var6.field1898);
                        var6.field1898 = null;
                    }
                    var6.field1901 = var13;
                }
                var6.field1891 = var11;
            }
            var6.field1897 = var6.field1881.field4954;
            var6.field1892 = var6.field1881.field4954 + var6.field1881.method446(arg0 - 26959) * 64;
            var6.field1900 = var6.field1881.field4951;
            var6.field1887 = var6.field1881.field4951 + var6.field1881.method446(10) * 64;
            class365.method2326((byte) 124, arg4, arg2, var6, arg1, arg3);
        }
        class138 var7 = (class138) class381.field5600.method608((byte) 126);
        if (arg0 != 26969) {
            return;
        }
        while (var7 != null) {
            byte var8 = 1;
            class446 var9 = var7.field1902.method450(0);
            if (var7.field1902.field719) {
                var8 = 0;
            } else if (var7.field1902.field706 == var9.field6484 || var7.field1902.field706 == var9.field6486 || var7.field1902.field706 == var9.field6499 || var7.field1902.field706 == var9.field6537) {
                var8 = 2;
            } else if (var7.field1902.field706 == var9.field6504 || var7.field1902.field706 == var9.field6498 || var7.field1902.field706 == var9.field6503 || var7.field1902.field706 == var9.field6505) {
                var8 = 3;
            }
            if (var7.field1891 != var8) {
                int var10 = class278.method1889(var7.field1902, (byte) 23);
                if (var7.field1901 != var10) {
                    if (var7.field1898 != null) {
                        class452.field6671.method278(var7.field1898);
                        var7.field1898 = null;
                    }
                    var7.field1901 = var10;
                }
                var7.field1891 = var8;
            }
            var7.field1897 = var7.field1902.field4954;
            var7.field1892 = var7.field1902.field4954 + var7.field1902.method446(10) * 64;
            var7.field1900 = var7.field1902.field4951;
            var7.field1887 = var7.field1902.field4951 + (var7.field1902.method446(arg0 ^ 0x6953) * 64);
            class365.method2326((byte) 122, arg4, arg2, var7, arg1, arg3);
            var7 = (class138) class381.field5600.method604(-80);
        }
    }
}
