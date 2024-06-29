import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class367 extends class518 {

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    private int field5550;

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
    private int field5552;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    private int field5543;

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    private int field5541;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
    private int field5551;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    private int field5547;

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "[I")
    public static int[] field5542 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
    public static int field5553 = 0;

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "Lkca;")
    public static class73 field5555 = new class73(37, 3);

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "Lxa;")
    public static class433 field5549;

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field5550 = arg6;
        this.field5552 = arg1;
        this.field5543 = arg4;
        this.field5554 = arg7;
        this.field5541 = arg0;
        this.field5551 = arg2;
        this.field5547 = arg3;
        this.field5556 = arg5;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public static void method2352(boolean arg0) {
        field5555 = null;
        if (arg0) {
            field5553 = 45;
        }
        field5542 = null;
        field5549 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V")
    public final void method223(int arg0, byte arg1, int arg2) {
        ++field5540;
        int var4 = this.field5541 * arg2 >> 12;
        int var5 = this.field5552 * arg0 >> 12;
        int var6 = this.field5551 * arg2 >> 12;
        int var7 = this.field5547 * arg0 >> 12;
        int var8 = this.field5543 * arg2 >> 12;
        int var9 = this.field5556 * arg0 >> 12;
        if (arg1 > -86) {
            this.method224(27, 54, false);
        }
        int var10 = this.field5550 * arg2 >> 12;
        int var11 = this.field5554 * arg0 >> 12;
        class277.method1812(var5, (byte) -80, var11, super.field7535, var7, var10, var6, var9, var4, var8);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
    public final void method220(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method224(-2, -98, false);
        }
        ++field5545;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
    public static final void method2353(byte arg0) {
        class277 var1 = class229.field3231;
        synchronized (class229.field3231) {
            if (arg0 <= 26) {
                method2354(-77, -36);
            }
            class229.field3231.method1805(86);
        }
        ++field5546;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)V")
    public final void method224(int arg0, int arg1, boolean arg2) {
        ++field5548;
        if (!arg2) {
            field5549 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(II)I")
    public static final int method2354(int arg0, int arg1) {
        ++field5544;
        int var7 = arg1 - 1;
        if (arg0 != -224121456) {
            field5555 = null;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 - -1;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lada;Z)Z")
    public static final boolean method2355(class144 arg0, boolean arg1) {
        boolean var2 = class492.field7164 == class435.field6449;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method862((byte) 69);
        if (arg0.field1773 >= 0 && arg0.field1758 >= 0 && arg0.field1762 < class588.field8441 && arg0.field1761 < class91.field1047) {
            short var6 = 0;
            for (int var7 = arg0.field1773; var7 <= arg0.field1762; ++var7) {
                for (int var10 = arg0.field1758; var10 <= arg0.field1761; ++var10) {
                    class99 var11 = class290.method1876(arg0.field1757, var7, var10);
                    if (var11 != null) {
                        int var12 = 0;
                        if (var7 > arg0.field1773) {
                            ++var12;
                        }
                        if (var7 < arg0.field1762) {
                            var12 += 4;
                        }
                        if (var10 > arg0.field1758) {
                            var12 += 8;
                        }
                        if (var10 < arg0.field1761) {
                            var12 += 2;
                        }
                        class104 var13 = class278.method1814(arg0, (byte) 65, var12);
                        class104 var14 = var11.field1167;
                        if (var14 == null) {
                            var11.field1167 = var13;
                        } else {
                            while (var14.field1251 != null) {
                                var14 = var14.field1251;
                            }
                            var14.field1251 = var13;
                        }
                        var11.field1163 = (byte) (var11.field1163 | var12);
                        if (var2 && (client.field3599[var7][var10] & -16777216) != 0) {
                            var3 = client.field3599[var7][var10];
                            var4 = class184.field2290[var7][var10];
                            var5 = class136.field1696[var7][var10];
                        }
                        if (var11.field1174 != null && var11.field1174.field1366 > var6) {
                            var6 = var11.field1174.field1366;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field1773; var8 <= arg0.field1762; ++var8) {
                    for (int var9 = arg0.field1758; var9 <= arg0.field1761; ++var9) {
                        if ((client.field3599[var8][var9] & -16777216) == 0) {
                            client.field3599[var8][var9] = var3;
                            class184.field2290[var8][var9] = var4;
                            class136.field1696[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class392.field6000[class392.field6001++] = arg0;
            }
            if (arg1) {
                arg0.field1769 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }
}
