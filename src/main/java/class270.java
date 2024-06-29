import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class270 {

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "Lpu;")
    private class522 field4051;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Lpu;")
    private class522 field4047;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "Lnea;")
    public static class664 field4048 = new class664(76, 4);

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field4054 = 1;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "Lff;")
    public static class9 field4057 = new class9(7, 0, 1, 1);

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "[I")
    public static int[] field4059 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "Leo;")
    private class266 field4049;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public static final void method1756(byte arg0) {
        if (class282.field4228 != null) {
            class380.field5378.method2409(104);
            class184.method1233();
            class575.method3262(-1);
            class271.method1787(7);
            class95.method779((byte) -29);
            class3.method11(-1);
            if (class380.field5380 != null) {
                class380.field5380.method1026(4039);
            }
            class333.method2098(-4107);
            class242.method1643(-19585);
            class596.method3371((byte) 81);
            class628.method3503(6025);
            class8.method44(false, (byte) -115);
            for (int var1 = 0; var1 < 2048; var1++) {
                class491 var5 = class141.field2087[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field6263.length; var6++) {
                        var5.field6263[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class428.field6288; var2++) {
                class577 var3 = class261.field3968[var2].field174;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field6263.length; var4++) {
                        var3.field6263[var4] = null;
                    }
                }
            }
            class303.field4524 = null;
            class318.field4690 = null;
            class282.field4228.method1154(false);
            class282.field4228 = null;
        }
        if (arg0 >= 32) {
            field4053++;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1757(byte arg0, long arg1) {
        class373.field5321.setTime(new Date(arg1));
        field4058++;
        int var3 = class373.field5321.get(7);
        int var4 = class373.field5321.get(5);
        if (arg0 >= -8) {
            return null;
        }
        int var5 = class373.field5321.get(2);
        int var6 = class373.field5321.get(1);
        int var7 = class373.field5321.get(11);
        int var8 = class373.field5321.get(12);
        int var9 = class373.field5321.get(13);
        return class279.field4215[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class562.field7912[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static void method1758(int arg0) {
        field4059 = null;
        field4057 = null;
        if (arg0 <= -25) {
            field4048 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
    public static final void method1759(int arg0, int arg1) {
        field4046++;
        class191 var2 = class6.method38(arg0, -123, arg1);
        var2.method1284((byte) -63);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)Z")
    public static final boolean method1760(int arg0, int arg1) {
        int var2 = -117 / ((-arg0 - 19) / 42);
        field4050++;
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)Leo;")
    private final class266 method1761(boolean arg0) {
        if (this.field4049 == null) {
            this.field4049 = new class266();
        }
        field4045++;
        if (!arg0) {
            this.method1762(null, (byte) -128);
        }
        return this.field4049;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lwaa;B)Lkba;")
    public final class90 method1762(class653 arg0, byte arg1) {
        field4056++;
        if (arg0 == null) {
            return null;
        }
        class703 var3 = arg0.method351((byte) 75);
        if (class573.field8065 == var3) {
            return new class700((class240) arg0);
        } else if (class336.field4962 == var3) {
            return new class278(this.method1761(true), (class504) arg0);
        } else if (class56.field1092 == var3) {
            return new class35(this.field4051, (class455) arg0);
        } else {
            if (arg1 != 100) {
                method1759(-27, 75);
            }
            if (class500.field7080 == var3) {
                return new class516(this.field4051, (class304) arg0);
            } else if (class188.field2710 == var3) {
                return new class626(this.field4051, this.field4047, (class650) arg0);
            } else if (class224.field3167 == var3) {
                return new class249(this.field4051, this.field4047, (class413) arg0);
            } else if (class333.field4944 == var3) {
                return new class311(this.field4051, this.field4047, (class64) arg0);
            } else if (class224.field3156 == var3) {
                return new class545(this.field4051, this.field4047, (class410) arg0);
            } else if (class701.field9907 == var3) {
                return new class224(this.field4051, (class531) arg0);
            } else if (class548.field7699 == var3) {
                return new class612(this.field4051, this.field4047, (class125) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lpu;Lpu;)V")
    public class270(class522 arg0, class522 arg1) {
        this.field4051 = arg0;
        this.field4047 = arg1;
    }
}
