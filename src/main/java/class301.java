import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class301 extends class70 {

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[I")
    public static int[] field4898 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field4895 = 0;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "J")
    public long field4902;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "Lr;")
    public class301 field4901;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lr;")
    public class301 field4903;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 6)
    public final void method2152(byte arg0) {
        field4897++;
        if (this.field4903 == null) {
            return;
        }
        int var2 = -24 / ((-arg0 - 19) / 57);
        this.field4903.field4901 = this.field4901;
        this.field4901.field4903 = this.field4903;
        this.field4901 = null;
        this.field4903 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z", line = 24)
    public final boolean method2153(boolean arg0) {
        field4899++;
        if (this.field4903 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 41)
    public static void method2154(int arg0) {
        field4898 = null;
        if (arg0 != 100) {
            method2156(-123, (byte) -73, 123);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I", line = 53)
    public static final int method2155(int arg0, int arg1) {
        field4893++;
        if (arg1 != 0) {
            field4898 = (int[]) null;
        }
        int var2 = arg0 >> 6 & 0x3;
        int var3 = arg0 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Ljava/lang/String;", line = 109)
    public static final String method2156(int arg0, byte arg1, int arg2) {
        field4894++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 <= 3) {
            if (arg1 != 77) {
                field4898 = (int[]) null;
            }
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BB)Lcj;", line = 160)
    public static final class351 method2157(byte[] arg0, byte arg1) {
        field4900++;
        class351 var2 = new class351();
        class146 var3 = new class146(arg0);
        var3.field2435 = var3.field2496.length - 2;
        int var4 = var3.method989(98);
        int var5 = var3.field2496.length - var4 - 12 - 2;
        var3.field2435 = var5;
        int var6 = var3.method1004(3);
        var2.field5605 = var3.method989(121);
        var2.field5609 = var3.method989(120);
        var2.field5611 = var3.method989(102);
        int var7 = -101 % ((9 - arg1) / 51);
        var2.field5602 = var3.method989(84);
        int var8 = var3.method1005((byte) 122);
        if (var8 > 0) {
            var2.field5608 = new class328[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var3.method989(69);
                class328 var11 = new class328(class311.method2264(var10, (byte) -93));
                var2.field5608[var9] = var11;
                while ((var10--) > 0) {
                    int var12 = var3.method1004(3);
                    int var13 = var3.method1004(3);
                    var11.method2337(new class111(var13), 709, (long) var12);
                }
            }
        }
        var3.field2435 = 0;
        var2.field5610 = var3.method1036(0);
        var2.field5613 = new int[var6];
        var2.field5601 = new String[var6];
        int var14 = 0;
        var2.field5612 = new int[var6];
        while (var3.field2435 < var5) {
            int var15 = var3.method989(85);
            if (var15 == 3) {
                var2.field5601[var14] = var3.method1017((byte) -121).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field5612[var14] = var3.method1005((byte) 122);
            } else {
                var2.field5612[var14] = var3.method1004(3);
            }
            var2.field5613[var14++] = var15;
        }
        return var2;
    }
}
