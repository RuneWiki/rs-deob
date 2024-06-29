import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class455 {

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "[I")
    private int[] field6763;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Z")
    public static boolean field6757 = false;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "S")
    public static short field6760 = 32767;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "[I")
    public static int[] field6762 = new int[13];

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "[I")
    public static int[] field6761 = new int[25];

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)Lfh;")
    public static final class170 method2827(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2827(28, true, 15);
        }
        field6754++;
        class170 var3 = class168.method1020(arg2, (byte) 77);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field2625 == null || var3.field2625.length <= arg0) {
            return null;
        } else {
            return var3.field2625[arg0];
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
    public final int method2828(int arg0, int arg1) {
        if (arg0 != -1) {
            field6755 = 72;
        }
        field6759++;
        int var3 = (this.field6763.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field6763[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field6763[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public static void method2829(boolean arg0) {
        if (!arg0) {
            field6760 = -42;
        }
        field6761 = null;
        field6762 = null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)I")
    public static final int method2830(int arg0, int arg1) {
        if (arg0 != -6040) {
            method2827(117, true, -55);
        }
        field6758++;
        return arg1 == 16711935 ? -1 : class388.method2401(arg1, (byte) -28);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
    public static final int method2831(byte arg0) {
        if (arg0 > -7) {
            field6755 = -69;
        }
        field6756++;
        if (class14.field173 == null) {
            if (!class306.field4628 && class149.field2067 > 0) {
                if (class67.field865 && class185.field2786.method578(false, 81) && class149.field2067 > 2) {
                    return ((class306) class372.field5433.field5946.field1336.field1336).field4624;
                }
                return ((class306) class372.field5433.field5946.field1336).field4624;
            }
            int var1 = class74.field1004.method505((byte) -109);
            int var2 = class74.field1004.method501(66);
            int var3 = class331.field4957;
            int var4 = class353.field5219;
            int var5 = class331.field4946;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class149.field2067; var7++) {
                    if (class338.field5046) {
                        int var11 = (class149.field2067 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var11 - 13) && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class149.field2067 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class172 var9 = new class172(class372.field5433);
                    for (class306 var10 = (class306) var9.method1064(1); var10 != null; var10 = (class306) var9.method1061(1)) {
                        if (var8++ == var6) {
                            return var10.field4624;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "([I)V")
    public class455(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field6763 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field6763[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field6763[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field6763[var5 + var5] = arg0[var4];
            this.field6763[var5 + var5 + 1] = var4++;
        }
    }
}
