import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class274 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Ljl;")
    private class253 field4129 = new class253(256);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Ljl;")
    private class253 field4135 = new class253(256);

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lpf;")
    private class294 field4132;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Lpf;")
    private class294 field4123;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4122 = 0;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field4119 = 0;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lik;")
    public static class267 field4121 = new class267(64);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    public static int[] field4133;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[Lpj;")
    public static class255[] field4115;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lpf;B)V")
    public static final void method1812(class294 arg0, byte arg1) {
        if (arg1 < 3) {
            field4119 = -13;
        }
        class220.field3308 = arg0;
        field4118++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II[II)Ljk;")
    private final class260 method1813(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = (arg3 >>> 12 | (arg3 & 0xA0000FFF) << 4) ^ arg1;
        field4124++;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class260 var9 = (class260) this.field4135.method1666(var7, (byte) -119);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (arg0 != 0) {
                field4119 = 38;
            }
            class121 var10 = (class121) this.field4129.method1666(var7, (byte) 80);
            if (var10 == null) {
                var10 = class121.method765(this.field4123, arg3, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field4129.method1663(var7, var10, -121);
            }
            class260 var11 = var10.method764(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method538(122);
                this.field4135.method1663(var7, var11, -117);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method1814(int arg0) {
        field4115 = null;
        if (arg0 == 15211) {
            field4133 = null;
            field4121 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method1815(int arg0) {
        class100.field1580.method1102(-2836);
        field4116++;
        int var1 = class100.field1580.method1098(1, (byte) -83);
        if (~var1 == arg0) {
            return;
        }
        int var2 = class100.field1580.method1098(2, (byte) -99);
        if (var2 == 0) {
            class113.field1736[class118.field1781++] = 2047;
        } else if (var2 == 1) {
            int var3 = class100.field1580.method1098(3, (byte) 86);
            class165.field2537.method926(var3, 1, -1);
            int var4 = class100.field1580.method1098(1, (byte) 122);
            if (var4 == 1) {
                class113.field1736[class118.field1781++] = 2047;
            }
        } else if (var2 == 2) {
            if (class100.field1580.method1098(1, (byte) -125) == 1) {
                int var6 = class100.field1580.method1098(3, (byte) 104);
                class165.field2537.method926(var6, 2, -1);
                int var7 = class100.field1580.method1098(3, (byte) 106);
                class165.field2537.method926(var7, 2, -1);
            } else {
                int var5 = class100.field1580.method1098(3, (byte) 100);
                class165.field2537.method926(var5, 0, -1);
            }
            int var8 = class100.field1580.method1098(1, (byte) -116);
            if (var8 == 1) {
                class113.field1736[class118.field1781++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class100.field1580.method1098(1, (byte) -2);
            int var10 = class100.field1580.method1098(7, (byte) 93);
            int var11 = class100.field1580.method1098(7, (byte) -99);
            int var12 = class100.field1580.method1098(1, (byte) -118);
            if (var12 == 1) {
                class113.field1736[class118.field1781++] = 2047;
            }
            class99.field1557 = class100.field1580.method1098(2, (byte) -105);
            class165.field2537.method677(-64, var9 == 1, var10, var11);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lee;")
    public static final class288 method1816(int arg0, int arg1) {
        field4125++;
        class288 var2 = (class288) class253.field3850.method1777((long) arg1, (byte) 112);
        if (arg0 <= 36) {
            method1814(-24);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field2893.method1973(1, class165.method1039(arg1, 0), class23.method143(-25737, arg1));
        class288 var4 = new class288();
        var4.field4323 = arg1;
        if (var3 != null) {
            var4.method1902(new class248(var3), (byte) 109);
        }
        var4.method1907(false);
        if (var4.field4365) {
            var4.field4333 = false;
            var4.field4375 = 0;
        }
        if (!class215.field3217 && var4.field4368) {
            var4.field4369 = null;
        }
        class253.field3850.method1784((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([III)Ljk;")
    public final class260 method1817(int[] arg0, int arg1, int arg2) {
        field4128++;
        if (this.field4132.method1962(true) == 1) {
            return this.method1821(127, 0, arg0, arg2);
        } else if (this.field4132.method1976(arg1 ^ 0x1, arg2) == 1) {
            return this.method1821(arg1 ^ 0x7C, arg2, arg0, 0);
        } else {
            if (arg1 != 0) {
                method1815(32);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILjava/awt/Component;)Lga;")
    public static final class174 method1818(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 1563430796) {
            field4122 = -58;
        }
        field4117++;
        try {
            Class var4 = Class.forName("ca");
            class174 var5 = (class174) var4.getDeclaredConstructor().newInstance();
            var5.method1078(arg1, (byte) -123, arg2, arg3);
            return var5;
        } catch (Throwable var7) {
            class225 var6 = new class225();
            var6.method1078(arg1, (byte) -124, arg2, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public static final void method1819(int arg0, int arg1) {
        if (arg0 != 3) {
            return;
        }
        field4131++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class221.method1419(0);
        } else if (arg1 == 2) {
            class292.method1932((byte) 48);
        } else if (arg1 == 3) {
            class137.method832(-2283);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II[I)Ljk;")
    public final class260 method1820(int arg0, int arg1, int[] arg2) {
        field4134++;
        if (this.field4123.method1962(true) == 1) {
            return this.method1813(0, arg1, arg2, 0);
        } else if (arg0 == ~this.field4123.method1976(~arg0, arg1)) {
            return this.method1813(0, 0, arg2, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II[II)Ljk;")
    private final class260 method1821(int arg0, int arg1, int[] arg2, int arg3) {
        field4114++;
        int var5 = arg3 ^ ((arg1 & 0xF0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class260 var9 = (class260) this.field4135.method1666(var7, (byte) -114);
        if (var9 != null) {
            return var9;
        } else if (arg2 != null && arg2[0] <= 0) {
            return null;
        } else if (arg0 < 117) {
            return null;
        } else {
            class280 var10 = class280.method1850(this.field4132, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class260 var11 = var10.method1851();
            this.field4135.method1663(var7, var11, -100);
            if (arg2 != null) {
                arg2[0] -= var11.field3956.length;
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lpf;Lpf;)V")
    public class274(class294 arg0, class294 arg1) {
        this.field4132 = arg0;
        this.field4123 = arg1;
    }
}
