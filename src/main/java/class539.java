import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class539 extends class130 {

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Ltt;")
    public class249 field7896;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Ljp;")
    public static class55 field7888 = new class55(28, 1);

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Z")
    public boolean field7890;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLcd;Lcd;I)V")
    public abstract void method241(byte arg0, class65 arg1, class65 arg2, int arg3);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
    public final int method3169(int arg0) {
        if (arg0 == 1) {
            field7891++;
            return 1;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z")
    public final boolean method3170(byte arg0) {
        field7893++;
        int var2 = -20 % ((arg0 + 20) / 42);
        return this.field7890;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
    public int method240(int arg0) {
        field7895++;
        if (arg0 <= 95) {
            this.method244(-98, -123, -101);
        }
        return 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
    public abstract void method245(boolean arg0, int arg1);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)Z")
    public abstract boolean method242(int arg0);

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)Z")
    public abstract boolean method243(int arg0);

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)V")
    public static void method3171(int arg0) {
        field7888 = null;
        if (arg0 != -8) {
            method3171(125);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method3172(int arg0, byte arg1, String arg2) {
        field7894++;
        int var3 = class422.field6205;
        int[] var4 = class506.field7363;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class511 var7 = class530.field7747[var4[var6]];
            if (var7 != null && class116.field1781 != var7 && var7.field7437 != null && var7.field7437.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    class21.field236++;
                    class110.method857(4095, class503.field7309);
                    class312.field4752.method1362(var4[var6], arg1 - 192);
                    class312.field4752.method1381(0, (byte) 120);
                } else if (arg0 == 4) {
                    class410.field6053++;
                    class110.method857(4095, class225.field3432);
                    class312.field4752.method1364(var4[var6], true);
                    class312.field4752.method1400(0, true);
                } else if (arg0 == 5) {
                    class110.method857(arg1 ^ 0xF81, class47.field752);
                    class317.field4828++;
                    class312.field4752.method1360(0, (byte) 121);
                    class312.field4752.method1364(var4[var6], true);
                } else if (arg0 == 6) {
                    class110.method857(arg1 + 3969, class299.field4599);
                    class116.field1785++;
                    class312.field4752.method1381(0, (byte) 84);
                    class312.field4752.method1386(true, var4[var6]);
                } else if (arg0 == 7) {
                    class433.field6426++;
                    class110.method857(arg1 + 3969, class515.field7497);
                    class312.field4752.method1386(true, var4[var6]);
                    class312.field4752.method1381(0, (byte) 118);
                }
                break;
            }
        }
        if (!var5) {
            class492.method2961(arg1 ^ 0x7E, class525.field7694.method1265(class345.field5141, -106) + arg2);
        }
        if (arg1 != 126) {
            method3171(-107);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)Z")
    public final boolean method3173(byte arg0) {
        field7892++;
        if (arg0 != -8) {
            this.method3173((byte) -35);
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)V")
    public abstract void method239(int arg0);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public abstract void method244(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ltt;)V")
    public class539(class249 arg0) {
        this.field7896 = arg0;
    }
}
