import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class138 extends class172 implements class129 {

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Z")
    private boolean field2064 = false;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    private int field2072 = 50;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lnk;")
    private class16 field2057;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lnk;")
    private class16 field2067;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lqj;")
    private class280 field2050;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lqj;")
    private class280 field2066;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "[Lfh;")
    public static class223[] field2048 = new class223[6];

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Lfi;")
    public static class289 field2065;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "[I")
    public static int[] field2069;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method942(int arg0, boolean arg1) {
        this.field2064 = arg1;
        field2076++;
        this.method948(-81);
        if (arg0 != -18883) {
            this.field2066 = (class280) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZII)V", line = 19)
    public final void method887(boolean arg0, int arg1, int arg2) {
        field2074++;
        class11.method69(-116, this.method1207(arg2, (byte) -117).field5509 & 0xFF, this.method1207(arg2, (byte) -114).field5498 & 0xFF);
        boolean var4 = arg0;
        class114 var5 = this.method949(arg2, 0);
        if (var5 != null) {
            var4 = var5.method739(this, this.field2057, arg1);
        }
        if (!var4) {
            class57 var6 = this.method947(arg2, -127);
            var6.method345(693);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(BI)Lkd;", line = 48)
    public final class87 method943(byte arg0, int arg1) {
        class114 var3 = this.method949(arg1, 0);
        if (arg0 >= -94) {
            this.field2064 = false;
        }
        field2055++;
        return var3 == null ? null : var3.field1588;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(BI)V", line = 62)
    public final void method944(byte arg0, int arg1) {
        for (class114 var3 = (class114) this.field2050.method2007(-65); var3 != null; var3 = (class114) this.field2050.method1999(true)) {
            if (var3.field1589) {
                var3.method740(arg1);
                var3.field1589 = false;
            }
        }
        field2049++;
        if (arg0 >= -14) {
            field2069 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 90)
    public static void method945(int arg0) {
        if (arg0 != 255) {
            field2069 = (int[]) null;
        }
        field2069 = null;
        field2065 = null;
        field2048 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V", line = 108)
    public final void method883(byte arg0, int arg1) {
        this.method887(false, this.field2064 || this.method1207(arg1, (byte) -86).field5493 ? 64 : 128, arg1);
        if (arg0 != -20) {
            this.method879(-122, -59);
        }
        field2068++;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(II)Z", line = 119)
    public final boolean method886(int arg0, int arg1) {
        if (arg0 == 11843) {
            field2046++;
            return this.method1207(arg1, (byte) -86).field5496;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;II)Lgk;", line = 133)
    public static final class10 method946(int arg0, Component arg1, int arg2, int arg3) {
        field2077++;
        try {
            Class var4 = Class.forName("gg");
            class10 var5 = (class10) var4.getDeclaredConstructor().newInstance();
            if (arg0 == 64) {
                var5.method65((byte) 111, arg1, arg2, arg3);
                return var5;
            } else {
                return (class10) null;
            }
        } catch (Throwable var8) {
            class187 var7 = new class187();
            var7.method65((byte) 111, arg1, arg2, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I", line = 157)
    public final int method878(int arg0, int arg1) {
        int var3 = 19 % ((arg0 - 64) / 52);
        field2071++;
        return this.method1207(arg1, (byte) -95).field5508 & 0xFFFF;
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(IB)I", line = 169)
    public final int method885(int arg0, byte arg1) {
        field2063++;
        if (arg1 < 34) {
            this.method887(false, 91, 113);
        }
        return this.method1207(arg0, (byte) -125).field5505 & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(II)Lm;", line = 180)
    private final class57 method947(int arg0, int arg1) {
        field2045++;
        class57 var3 = (class57) this.field2066.method1998(-1114531641, (long) arg0);
        if (var3 == null) {
            int var4 = -114 % ((arg1 + 67) / 59);
            class57 var5 = new class57(this.method1207(arg0, (byte) -95).field5508 & 0xFFFF);
            this.field2066.method2000(var5, (byte) 117, (long) arg0);
            return var5;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)Z", line = 198)
    public final boolean method880(int arg0, byte arg1) {
        if (arg1 > -1) {
            return true;
        } else {
            field2058++;
            return !this.method1207(arg0, (byte) -87).field5506;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)Z", line = 210)
    public final boolean method884(int arg0, int arg1) {
        field2075++;
        if (this.field2064 || this.method1207(arg1, (byte) -117).field5493) {
            return true;
        } else if (arg0 >= -35) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 228)
    public final void method948(int arg0) {
        this.field2050.method2003(-85);
        field2051++;
        if (this.field2066 != null) {
            this.field2066.method2003(-87);
        }
        if (arg0 >= -25) {
            this.field2064 = false;
        }
        class114.field1585 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)Z", line = 247)
    public final boolean method882(boolean arg0, int arg1) {
        field2053++;
        if (arg0) {
            this.field2067 = (class16) null;
        }
        return this.method1207(arg1, (byte) -85).field5500;
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(II)Lsl;", line = 261)
    private final class114 method949(int arg0, int arg1) {
        field2044++;
        class114 var3 = (class114) this.field2050.method1998(arg1 - 1114531641, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2067.method100(arg0, arg1, (byte) -107);
        if (var4 == null) {
            return null;
        } else {
            class114 var5 = new class114(new class143(var4));
            this.field2050.method2000(var5, (byte) 116, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lnk;Lnk;Lnk;IZ)V", line = 419)
    public class138(class16 arg0, class16 arg1, class16 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2072 = arg3;
        this.field2057 = arg2;
        this.field2067 = arg0;
        this.field2064 = arg4;
        this.field2050 = new class280(this.field2072);
        if (class272.field4317) {
            this.field2066 = new class280(this.field2072);
        } else {
            this.field2066 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(II)V", line = 291)
    public final void method950(int arg0, int arg1) {
        this.field2072 = arg1;
        field2061++;
        this.field2050 = new class280(this.field2072);
        if (class272.field4317) {
            this.field2066 = new class280(this.field2072);
        } else {
            this.field2066 = null;
        }
        int var3 = 33 % ((arg0 + 11) / 45);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)I", line = 308)
    public final int method889(byte arg0, int arg1) {
        if (arg0 != 95) {
            this.field2064 = true;
        }
        field2047++;
        return this.method1207(arg1, (byte) -87).field5509 & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I", line = 319)
    public final int method879(int arg0, int arg1) {
        if (arg0 != -7796) {
            this.method878(-22, -55);
        }
        field2052++;
        return this.method1207(arg1, (byte) -112).field5504 & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(FII)[I", line = 335)
    public final int[] method891(float arg0, int arg1, int arg2) {
        class114 var4 = this.method949(arg2, 0);
        field2059++;
        int var5 = -61 / ((-arg1) / 54);
        if (var4 == null) {
            return null;
        } else {
            var4.field1589 = true;
            return var4.method738(this, this.field2057, arg0, this.field2064 || this.method1207(arg2, (byte) -98).field5493);
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(II)Z", line = 350)
    public final boolean method888(int arg0, int arg1) {
        if (arg0 == -231) {
            field2054++;
            class114 var3 = this.method949(arg1, 0);
            return var3 == null ? false : var3.method737(this, this.field2057);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZC)C", line = 367)
    public static final char method951(boolean arg0, char arg1) {
        field2043++;
        if (arg1 == 'Æ') {
            return 'E';
        }
        if (!arg0) {
            method951(true, '^');
        }
        if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(IB)[I", line = 397)
    public final int[] method881(int arg0, byte arg1) {
        int var3 = 98 / ((arg1 - 34) / 41);
        field2060++;
        class114 var4 = this.method949(arg0, 0);
        return var4 == null ? null : var4.method736(this, this.field2057, this.field2064 || this.method1207(arg0, (byte) -100).field5493);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIFB)Lch;", line = 437)
    public final class158 method890(int arg0, boolean arg1, int arg2, float arg3, byte arg4) {
        field2070++;
        if (arg4 != 120) {
            field2065 = (class289) null;
        }
        class114 var6 = this.method949(arg0, 0);
        if (var6 != null && var6.method737(this, this.field2057)) {
            return arg1 ? var6.field1588.method558(this, arg2, (double) arg3, arg2, false, 0, this.field2057) : var6.field1588.method557(arg2, this.field2057, (double) arg3, (byte) 28, arg2, false, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(II)I", line = 458)
    public final int method892(int arg0, int arg1) {
        field2073++;
        return arg0 == 21235 ? this.method1207(arg1, (byte) -83).field5498 & 0xFF : 66;
    }
}
