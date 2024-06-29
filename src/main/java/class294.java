import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class294 extends class366 {

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "Ljava/lang/String;")
    private String field4257 = "null";

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4243 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "Lub;")
    public static class15 field4263 = new class15(64);

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "C")
    public char field4256;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "C")
    public char field4262;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "Ltj;")
    public static class108 field4249;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "Ldj;")
    private class191 field4258;

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "Ldj;")
    public class191 field4261;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "Lvq;")
    public static class269 field4251;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Llf;ZI)V", line = 5)
    private final void method1983(class130 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field4256 = class171.method1223(3043, arg0.method823((byte) 107));
        } else if (arg2 == 2) {
            this.field4262 = class171.method1223(3043, arg0.method823((byte) -82));
        } else if (arg2 == 3) {
            this.field4257 = arg0.method843(-76);
        } else if (arg2 == 4) {
            this.field4252 = arg0.method815(true);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method798(arg1);
            this.field4261 = new class191(class258.method1787(-128, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method815(true);
                class425 var7;
                if (arg2 == 5) {
                    var7 = new class309(arg0.method843(-106));
                } else {
                    var7 = new class24(arg0.method815(true));
                }
                this.field4261.method1376(var7, (long) var6, 106);
            }
        }
        field4250++;
        if (arg1) {
            field4263 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I", line = 63)
    public final int method1984(int arg0, int arg1) {
        field4244++;
        if (arg1 != 2) {
            field4259 = -4;
        }
        if (this.field4261 == null) {
            return this.field4252;
        } else {
            class24 var3 = (class24) this.field4261.method1373((long) arg0, 126);
            return var3 == null ? this.field4252 : var3.field299;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 84)
    private final void method1985(int arg0) {
        this.field4258 = new class191(this.field4261.method1374(true));
        field4246++;
        class24 var2 = (class24) this.field4261.method1383(100);
        if (arg0 != 2) {
            return;
        }
        while (var2 != null) {
            class24 var3 = new class24((int) var2.field6070);
            this.field4258.method1376(var3, (long) var2.field299, 88);
            var2 = (class24) this.field4261.method1378((byte) 98);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILtj;)Lqf;", line = 106)
    public static final class406 method1986(int arg0, int arg1, int arg2, class108 arg3) {
        field4245++;
        byte[] var4 = arg3.method643(arg2, arg0, true);
        if (arg1 >= -51) {
            method1991((byte) 7);
        }
        return var4 == null ? null : new class406(var4);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 122)
    public final boolean method1987(int arg0, String arg1) {
        if (arg0 != 6) {
            field4243 = null;
        }
        field4265++;
        if (this.field4261 == null) {
            return false;
        }
        if (this.field4258 == null) {
            this.method1992((byte) -110);
        }
        for (class47 var3 = (class47) this.field4258.method1373(class145.method1072(arg1, false), arg0 - 63); var3 != null; var3 = (class47) this.field4258.method1379(-106)) {
            if (var3.field619.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)I", line = 152)
    public static final int method1988(int arg0, int arg1, int arg2) {
        field4247++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        if (arg2 != 1) {
            field4249 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V", line = 173)
    public static final void method1989(boolean arg0, int arg1) {
        field4255++;
        class407.field5761.method2048(2040, arg1);
        class355.field5146++;
        for (class253 var2 = (class253) class318.field4662.method1383(100); var2 != null; var2 = (class253) class318.field4662.method1378((byte) 98)) {
            if (!var2.method2662((byte) 116)) {
                var2 = (class253) class318.field4662.method1383(arg1 ^ 0xFFFFFF07);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field3748 == 0) {
                class102.method596(true, true, var2, arg0);
            }
        }
        if (class85.field1096 != null) {
            class245.method1701(class85.field1096, (byte) -94);
            class85.field1096 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLlf;)V", line = 211)
    public final void method1990(boolean arg0, class130 arg1) {
        field4248++;
        if (arg0) {
            this.method1990(false, (class130) null);
        }
        while (true) {
            int var3 = arg1.method837(true);
            if (var3 == 0) {
                return;
            }
            this.method1983(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V", line = 235)
    public static void method1991(byte arg0) {
        field4263 = null;
        field4243 = null;
        if (arg0 == -63) {
            field4251 = null;
            field4249 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V", line = 252)
    private final void method1992(byte arg0) {
        if (arg0 > -97) {
            method1989(false, 98);
        }
        this.field4258 = new class191(this.field4261.method1374(true));
        field4254++;
        for (class309 var2 = (class309) this.field4261.method1383(-56); var2 != null; var2 = (class309) this.field4261.method1378((byte) 98)) {
            class47 var3 = new class47(var2.field4493, (int) var2.field6070);
            this.field4258.method1376(var3, class145.method1072(var2.field4493, false), 92);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)Ljava/lang/String;", line = 275)
    public final String method1993(int arg0, byte arg1) {
        field4253++;
        if (arg1 >= -52) {
            method1989(false, 52);
        }
        if (this.field4261 == null) {
            return this.field4257;
        } else {
            class309 var3 = (class309) this.field4261.method1373((long) arg0, 127);
            return var3 == null ? this.field4257 : var3.field4493;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZI)Z", line = 298)
    public final boolean method1994(boolean arg0, int arg1) {
        field4260++;
        if (this.field4261 == null) {
            return false;
        }
        if (this.field4258 == null) {
            this.method1985(2);
        }
        if (arg0) {
            class24 var3 = (class24) this.field4258.method1373((long) arg1, 16);
            return var3 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILbr;)V", line = 329)
    public static final void method1995(int arg0, class223 arg1) {
        field4264++;
        if (!class269.field3935) {
            return;
        }
        class299.field4341++;
        class407.field5761.method2048(2040, 175);
        class407.field5761.method849(arg1.field3227, (byte) -108);
        class407.field5761.method835(7740, class261.field3855);
        class407.field5761.method840(255, class324.field4715);
        int var2 = 10 % ((arg0 - 11) / 40);
        class407.field5761.method840(255, arg1.field3344);
        class407.field5761.method856(arg1.field3304, -1004744376);
        class407.field5761.method819(class128.field1814, (byte) -75);
    }
}
