import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class35 {

    @OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
    public static int[] field502 = new int[13];

    @OriginalMember(owner = "client!on", name = "e", descriptor = "[[I")
    public static int[][] field501 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "J")
    public long field499;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lon;")
    public class35 field497;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lon;")
    public class35 field498;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 10)
    public final void method251(int arg0) {
        field504++;
        if (this.field497 == null) {
            return;
        }
        this.field497.field498 = this.field498;
        if (arg0 <= 2) {
            this.method252(62);
        }
        this.field498.field497 = this.field497;
        this.field498 = null;
        this.field497 = null;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z", line = 32)
    public final boolean method252(int arg0) {
        field500++;
        if (this.field497 == null) {
            return false;
        } else {
            return arg0 <= -69;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 47)
    public static void method253(byte arg0) {
        field501 = null;
        field502 = null;
        if (arg0 < 99) {
            field501 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I", line = 58)
    public static int method254(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 75)
    public static final void method255(byte arg0) {
        field503++;
        if ((class272.field4082 > class272.field4078)) {
            class272.field4078 = (float) ((double) class272.field4078 / 30.0D + (double) class272.field4078);
            if (class272.field4082 < class272.field4078) {
                class272.field4078 = class272.field4082;
            }
            class441.method2748(-108);
            class272.field4077 = (int) class272.field4078 >> 1;
            class272.field4080 = class144.method1134(-120, class272.field4077);
        } else if (class272.field4078 > class272.field4082) {
            class272.field4078 = (float) ((double) class272.field4078 - (double) class272.field4078 / 30.0D);
            if (class272.field4078 < class272.field4082) {
                class272.field4078 = class272.field4082;
            }
            class441.method2748(-99);
            class272.field4077 = (int) class272.field4078 >> 1;
            class272.field4080 = class144.method1134(arg0 - 173, class272.field4077);
        }
        if (class270.field4049 != -1 && class243.field3541 != -1) {
            int var1 = class270.field4049 - class110.field1797;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class243.field3541 - class373.field5295;
            class110.field1797 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class373.field5295 += var2;
            if (var1 == 0 && var2 == 0) {
                class243.field3541 = -1;
                class270.field4049 = -1;
            }
            class441.method2748(arg0 - 96);
        }
        if (arg0 != 52) {
            return;
        }
        if (class351.field4992 > 0) {
            class319.field4609--;
            if (class319.field4609 == 0) {
                class319.field4609 = 100;
                class351.field4992--;
            }
        } else {
            class333.field4785 = -1;
            class218.field3234 = -1;
        }
        if (!class367.field5221 || class356.field5064 == null) {
            return;
        }
        for (class307 var3 = (class307) class356.field5064.method157((byte) -125); var3 != null; var3 = (class307) class356.field5064.method145(72)) {
            class242 var4 = class1.method3(var3.field4487.field2883, 36);
            if (class5.field34 == 0 && var3.method2103(-13297, class129.field2111, class291.field4327)) {
                if (var4.field3493 != null) {
                    if (var4.field3493[4] != null) {
                        class26.method217(var4.field3528, var4.field3493[4], 1006, 0, -1, 12154, var4.field3483, (long) var3.field4487.field2883);
                    }
                    if (var4.field3493[3] != null) {
                        class26.method217(var4.field3528, var4.field3493[3], 1007, 0, -1, 12154, var4.field3483, (long) var3.field4487.field2883);
                    }
                    if (var4.field3493[2] != null) {
                        class26.method217(var4.field3528, var4.field3493[2], 1011, 0, -1, 12154, var4.field3483, (long) var3.field4487.field2883);
                    }
                    if (var4.field3493[1] != null) {
                        class26.method217(var4.field3528, var4.field3493[1], 1009, 0, -1, 12154, var4.field3483, (long) var3.field4487.field2883);
                    }
                    if (var4.field3493[0] != null) {
                        class26.method217(var4.field3528, var4.field3493[0], 1012, 0, -1, arg0 ^ 0x2F4E, var4.field3483, (long) var3.field4487.field2883);
                    }
                }
                if (!var3.field4487.field2886) {
                    var3.field4487.field2886 = true;
                    class216.method1639(15, var3.field4487.field2883, var4.field3528);
                }
                if (var3.field4487.field2886) {
                    class216.method1639(17, var3.field4487.field2883, var4.field3528);
                }
            } else if (var3.field4487.field2886) {
                var3.field4487.field2886 = false;
                class216.method1639(16, var3.field4487.field2883, var4.field3528);
            }
        }
    }
}
