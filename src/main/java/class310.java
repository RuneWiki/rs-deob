import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class310 {

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Z")
    public static boolean field4315 = false;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "[I")
    public static int[] field4313 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "[[B")
    public static byte[][] field4317 = new byte[50][];

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field4320 = 0;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "S")
    public static short field4319 = 1;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lbg;")
    public static class464 field4316 = new class464();

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZLbe;)V")
    public static final void method2013(boolean arg0, class37 arg1) {
        field4314++;
        if (class436.field6192) {
            return;
        }
        arg1.method1185(-98);
        class25.field341--;
        if (arg1.field464) {
            for (class508 var2 = (class508) class455.field6429.method4000((byte) -7); var2 != null; var2 = (class508) class455.field6429.method4002(-85)) {
                if (var2.field7270.equals(arg1.field470)) {
                    boolean var3 = false;
                    for (class37 var4 = (class37) var2.field7267.method4000((byte) -7); var4 != null; var4 = (class37) var2.field7267.method4002(-111)) {
                        if (arg1 == var4) {
                            if (var2.method3003(arg1, (byte) 20)) {
                                class76.method610(-128, var2);
                            }
                            var3 = true;
                            break;
                        }
                    }
                    if (var3) {
                        break;
                    }
                }
            }
        } else {
            long var5 = arg1.field466;
            class508 var7;
            for (var7 = (class508) class417.field5899.method1180((byte) 26, var5); var7 != null && !var7.field7270.equals(arg1.field470); var7 = (class508) class417.field5899.method1174(0)) {
            }
            if (var7 != null && var7.method3003(arg1, (byte) 20)) {
                class76.method610(-113, var7);
            }
        }
        if (!arg0) {
            method2015((byte) 29);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)Z")
    public static final boolean method2014(int arg0, int arg1, int arg2) {
        field4318++;
        int var3 = 61 % ((arg0 - 67) / 39);
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V")
    public static final void method2015(byte arg0) {
        if (arg0 <= 36) {
            return;
        }
        field4321++;
        if (!class110.field1344) {
            class69.field847 = true;
            class110.field1344 = true;
            class518.field7368 += (-12.0F - class518.field7368) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static void method2016(int arg0) {
        field4316 = null;
        field4313 = null;
        if (arg0 > -107) {
            field4315 = false;
        }
        field4317 = null;
    }
}
