import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class522 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lifa;")
    private class450 field7401;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Z")
    public static boolean field7408 = false;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "F")
    public static float field7402;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ltf;")
    public static class312 field7403;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Loq;")
    private class379 field7405;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3131(byte arg0) {
        field7406++;
        int var1 = class229.field2709.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class229.field2709[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class317.field3903; var4++) {
                    if (class634.field8661[var4] == class471.field6569[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class634.field8661[class317.field3903] = class471.field6569[var2];
                    var3 = class317.field3903++;
                }
                class403 var5 = new class403(class229.field2709[var2]);
                int var6 = 0;
                while (var5.field5262 < class229.field2709[var2].length && var6 < 511 && class3.field42 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2390((byte) 111);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class471.field6569[var2] >> 8) * 64 + var10 - class632.field8626;
                    int var13 = (class471.field6569[var2] & 0xFF) * 64 + var11 - class620.field8435;
                    class479 var14 = class444.field5956.method1070(var5.method2390((byte) 45), true);
                    class273 var15 = (class273) class30.field444.method2121(92, (long) var7);
                    if (var15 == null && (var14.field6695 & 0x1) > 0 && class500.field7013 == var9 && var12 >= 0 && class596.field8090 > (var12 + var14.field6710) && var13 >= 0 && class107.field1350 > var13 + var14.field6710) {
                        class388 var16 = new class388();
                        var16.field3393 = var7;
                        class273 var17 = new class273(var16);
                        class30.field444.method2112(var17, (byte) 6, (long) var7);
                        class616.field8293[class370.field4599++] = var17;
                        class2.field29[class3.field42++] = var7;
                        var16.field3422 = class228.field2707;
                        var16.method2275(var14, (byte) -103);
                        var16.method1666(var16.field5003.field6710, true);
                        var16.field3413 = var16.field5003.field6688 << 3;
                        var16.method1677(var16.field5003.field6634 + 4 << 11 & 0x3E06, true, arg0 ^ 0x2F);
                        var16.method2272(var13, var9, var12, false, var16.method1665(1720746760), true);
                    }
                }
            }
        }
        if (arg0 != 73) {
            method3131((byte) -3);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 110)
    public static void method3132(int arg0) {
        field7403 = null;
        if (arg0 != 63) {
            field7408 = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I", line = 123)
    public static final int method3133(int arg0, int arg1, int arg2, int arg3) {
        field7400++;
        int var4 = arg3 & 0x3;
        if (arg2 >= -2) {
            method3133(-93, 80, -14, 105);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 4095 - arg1;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLifa;)V", line = 146)
    public final void method3134(byte arg0, class450 arg1) {
        field7404++;
        if (arg0 < 65) {
            this.method3135((byte) 121);
        }
        this.field7401 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Loq;", line = 157)
    public final class379 method3135(byte arg0) {
        if (arg0 < 25) {
            this.method3136((byte) 30);
        }
        field7409++;
        class379 var2 = this.field7405;
        if (this.field7401.field6367 == var2) {
            this.field7405 = null;
            return null;
        } else {
            this.field7405 = var2.field4806;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Loq;", line = 179)
    public final class379 method3136(byte arg0) {
        field7407++;
        class379 var2 = this.field7401.field6367.field4806;
        if (this.field7401.field6367 == var2) {
            this.field7405 = null;
            return null;
        }
        if (arg0 != -47) {
            this.field7401 = null;
        }
        this.field7405 = var2.field4806;
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 199)
    public class522() {
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lifa;)V", line = 203)
    public class522(class450 arg0) {
        this.field7401 = arg0;
    }
}
