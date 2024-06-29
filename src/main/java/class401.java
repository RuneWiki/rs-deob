import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class401 extends class316 implements class18 {

    @OriginalMember(owner = "client!v", name = "x", descriptor = "Lo;")
    public class316 field5970;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "[I")
    public static int[] field5976 = new int[32];

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "J")
    public static long field5969;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.method12((class261) null, -100, (byte) -54);
        }
        field5972++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        field5979++;
        if (arg1 >= -68) {
            field5976 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public static final void method2521(int arg0) {
        field5974++;
        try {
            if (arg0 != 0) {
                field5976 = null;
            }
            if (class360.field5320 == 1) {
                int var1 = class311.field4685.method1575(-1332089658);
                if (var1 > 0 && class311.field4685.method1593(false)) {
                    int var2 = var1 - class135.field1794;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class311.field4685.method1597(true, var2);
                } else {
                    class311.field4685.method1579((byte) 127);
                    class311.field4685.method1571(15);
                    class146.field2023 = null;
                    if (class162.field2247 == null) {
                        class360.field5320 = 0;
                    } else {
                        class360.field5320 = 2;
                    }
                    class176.field2677 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class311.field4685.method1579((byte) 125);
            class146.field2023 = null;
            class162.field2247 = null;
            class360.field5320 = 0;
            class176.field2677 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        field5975++;
        if (arg3 != 2) {
            this.method10((class261) null, 37);
        }
        return false;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            this.method7(true);
        }
        field5967++;
        return false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            field5976 = null;
        }
        field5968++;
        return 0;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 < 114) {
            field5976 = null;
        }
        field5980++;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        field5977++;
        if (arg1 != 7) {
            method2522(102, (class134) null);
        }
        return null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        field5981++;
        if (arg0 != 76) {
            field5976 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIILo;)V")
    public class401(int arg0, int arg1, int arg2, class316 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field5970 = arg3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILiq;)V")
    public static final void method2522(int arg0, class134 arg1) {
        if (arg0 != 0) {
            method2521(-123);
        }
        class201.field3034 = arg1;
        field5966++;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        field5982++;
        if (arg0 != -21910) {
            this.method1(-98);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 > -3) {
            method2523((byte) -2);
        }
        field5984++;
        return 0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        field5971++;
        if (arg0 <= 26) {
            this.method9(-123);
        }
        return 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = 21 / ((46 - arg2) / 47);
        field5978++;
        return null;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static void method2523(byte arg0) {
        field5976 = null;
        if (arg0 <= 49) {
            field5969 = -119L;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        field5973++;
        int var2 = -12 % ((-arg0 - 1) / 46);
        return false;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        field5983++;
        if (arg0 >= -45) {
            this.method7(true);
        }
    }
}
