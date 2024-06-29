import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class295 implements class353 {

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lru;")
    private class177 field4659 = new class177(128);

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    private int[] field4658 = new int[class322.field5027.field1257];

    @OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
    public int[] field4650 = new int[class322.field5027.field1257];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lqu;")
    public static class219 field4647 = new class219(33, 11);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[S")
    public static short[] field4661;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1977(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 25034) {
            return;
        }
        field4652++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class305.field4802 - class296.field4666) * var8 / 100 + class296.field4666;
        int var10 = arg4 * var9 >> 8;
        int var11 = 16384 - arg5 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class147.field1988[var11] * -var10 >> 15;
            var15 = class147.field1986[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class147.field1988[var12] * var15 >> 15;
            var15 = class147.field1986[var12] * var15 >> 15;
        }
        class371.field5703 = arg0 - var14;
        class220.field3723 = arg5;
        class253.field4106 = 0;
        class387.field5912 = arg7;
        class163.field2367 = arg3 - var13;
        class98.field1404 = arg1 - var15;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method1978(int arg0, int arg1, int arg2) {
        field4648++;
        class198 var4 = class197.field3037.method760(arg1 ^ 0xFFFFB773, arg2);
        int var5 = var4.field3044;
        int var6 = var4.field3051;
        int var7 = var4.field3052;
        int var8 = class162.field2327[var7 - var6];
        if (arg0 < arg1 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1985((byte) 123, var9 & arg0 << var6 | this.field4650[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
    public final int method1979(int arg0, int arg1) {
        field4654++;
        class198 var3 = class197.field3037.method760(-18573, arg0);
        int var4 = var3.field3044;
        int var5 = var3.field3051;
        if (arg1 != 0) {
            method1987(-34);
        }
        int var6 = var3.field3052;
        int var7 = class162.field2327[var6 - var5];
        return this.field4650[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lec;")
    public static final class68 method1980(byte arg0) {
        field4663++;
        if (class471.field7209.length > class24.field268) {
            return class471.field7209[class24.field268++];
        } else if (arg0 > -24) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)I")
    public final int method1981(int arg0, boolean arg1) {
        field4662++;
        long var3 = class246.method1705((byte) 28);
        if (arg0 != 11560) {
            method1987(0);
        }
        for (class539 var5 = arg1 ? (class539) this.field4659.method1119(false) : (class539) this.field4659.method1121((byte) -125); var5 != null; var5 = (class539) this.field4659.method1121((byte) 38)) {
            if ((var5.field7885 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field7885 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7780;
                    this.field4650[var6] = this.field4658[var6];
                    var5.method3149(51);
                    return var6;
                }
                var5.method3149(55);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)I")
    public final int method1982(boolean arg0, int arg1) {
        field4660++;
        if (!arg0) {
            this.method1985((byte) -106, 18, 116);
        }
        return this.field4650[arg1];
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
    public final void method1983(int arg0, int arg1, byte arg2) {
        field4656++;
        class198 var4 = class197.field3037.method760(-18573, arg1);
        int var5 = var4.field3044;
        int var6 = var4.field3051;
        int var7 = var4.field3052;
        int var8 = 124 / ((arg2 - 58) / 62);
        int var9 = class162.field2327[var7 - var6];
        if (arg0 < 0 || var9 < arg0) {
            arg0 = 0;
        }
        int var10 = var9 << var6;
        this.method1989(var5, 0, this.field4658[var5] & ~var10 | var10 & arg0 << var6);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZB)Z")
    public static final boolean method1984(boolean arg0, byte arg1) {
        field4655++;
        if (arg1 != 22) {
            method1980((byte) 99);
        }
        boolean var2 = class19.field198.method1239();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class19.field198.method1319();
        } else if (!class19.field198.method1238()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class141.field1911.field6098 = arg0;
            class141.field1911.method1638(32749, class339.field5294);
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BII)V")
    public final void method1985(byte arg0, int arg1, int arg2) {
        field4651++;
        this.field4650[arg2] = arg1;
        int var4 = 95 / ((arg0 - 12) / 38);
        class539 var5 = (class539) this.field4659.method1122((byte) 59, (long) arg2);
        if (var5 == null) {
            class539 var6 = new class539(class246.method1705((byte) 28) + 500L);
            this.field4659.method1127(var6, (byte) 75, (long) arg2);
        } else {
            var5.field7885 = class246.method1705((byte) 28) + 500L;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public final void method1986(byte arg0) {
        field4653++;
        for (int var2 = 0; var2 < class322.field5027.field1257; var2++) {
            class314 var3 = class322.field5027.method596(var2, 16);
            if (var3 != null && var3.field4912 == 0) {
                this.field4658[var2] = 0;
                this.field4650[var2] = 0;
            }
        }
        if (arg0 != 7) {
            this.field4659 = null;
        }
        this.field4659 = new class177(128);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1987(int arg0) {
        field4661 = null;
        field4647 = null;
        if (arg0 >= -44) {
            field4661 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1988(String arg0, int arg1) {
        class528.method3140("", "", arg0, arg1 ^ 0x37, 0, arg1);
        field4657++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
    public final void method1989(int arg0, int arg1, int arg2) {
        this.field4658[arg0] = arg2;
        field4649++;
        class539 var4 = (class539) this.field4659.method1122((byte) 59, (long) arg0);
        if (var4 == null) {
            class539 var5 = new class539(4611686018427387905L);
            this.field4659.method1127(var5, (byte) 124, (long) arg0);
        } else if (var4.field7885 != 4611686018427387905L) {
            var4.field7885 = class246.method1705((byte) 28) + 500L | 0x4000000000000000L;
        }
        if (arg1 != 0) {
            this.field4658 = null;
        }
    }
}
