import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class144 extends class1 {

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "J")
    public static long field2112 = 0L;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "C")
    private char field2109;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public int field2107;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "Ljava/lang/String;")
    public String field2106;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lrf;I)Lrf;")
    public static final class289 method878(class289 arg0, int arg1) {
        field2110++;
        if (arg0.field4451 != -1) {
            return class89.method574((byte) -15, arg0.field4451);
        } else if (arg1 >= -8) {
            return null;
        } else {
            int var2 = arg0.field4504 >>> 16;
            class47 var3 = new class47(class229.field3449);
            for (class199 var4 = (class199) var3.method316((byte) 120); var4 != null; var4 = (class199) var3.method315(64)) {
                if (var4.field3026 == var2) {
                    return class89.method574((byte) -15, (int) var4.field1321);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILfl;I)V")
    private final void method879(int arg0, class248 arg1, int arg2) {
        field2103++;
        if (arg2 != 5) {
            method882(-7);
        }
        if (arg0 == 1) {
            this.field2109 = class129.method809(arg1.method1604(arg2 - 1), (byte) 95);
        } else if (arg0 == 2) {
            this.field2107 = arg1.method1576(arg2 - 17677);
        } else if (arg0 == 5) {
            this.field2106 = arg1.method1597((byte) 91);
            return;
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)Z")
    public final boolean method880(byte arg0) {
        field2108++;
        if (arg0 != -4) {
            this.field2109 = (char) 65526;
        }
        return this.field2109 == 's';
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
    public static final void method881(int arg0, boolean arg1) {
        field2104++;
        if (arg0 != -2) {
            return;
        }
        for (class151 var2 = (class151) class295.field4670.method983(7); var2 != null; var2 = (class151) class295.field4670.method985((byte) 104)) {
            if (var2.field2175 != null) {
                class213.field3187.method378(var2.field2175);
                var2.field2175 = null;
            }
            if (var2.field2193 != null) {
                class213.field3187.method378(var2.field2193);
                var2.field2193 = null;
            }
            var2.method538(124);
        }
        if (!arg1) {
            return;
        }
        for (class151 var3 = (class151) class264.field3988.method983(7); var3 != null; var3 = (class151) class264.field3988.method985((byte) -125)) {
            if (var3.field2175 != null) {
                class213.field3187.method378(var3.field2175);
                var3.field2175 = null;
            }
            var3.method538(54);
        }
        for (class151 var4 = (class151) class278.field4193.method1665(16); var4 != null; var4 = (class151) class278.field4193.method1659((byte) -118)) {
            if (var4.field2175 != null) {
                class213.field3187.method378(var4.field2175);
                var4.field2175 = null;
            }
            var4.method538(108);
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
    public static final void method882(int arg0) {
        class41.field608.method1782(0);
        field2113++;
        if (arg0 != 5) {
            field2112 = -49L;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)Lp;")
    public static final class292 method883(int arg0, byte arg1) {
        field2105++;
        class292 var2 = (class292) class146.field2133.method1777((long) arg0, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class220.field3308.method1973(1, 30, arg0);
        if (arg1 != -128) {
            method881(88, false);
        }
        class292 var4 = new class292();
        if (var3 != null) {
            var4.method1935((byte) 88, new class248(var3), arg0);
        }
        class146.field2133.method1784((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lfl;B)V")
    public final void method884(class248 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1593((byte) 27);
            if (var3 == 0) {
                field2111++;
                if (arg1 <= 33) {
                    this.method879(-116, (class248) null, 119);
                    return;
                }
                return;
            }
            this.method879(var3, arg0, 5);
        }
    }
}
