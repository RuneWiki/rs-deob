import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class99 extends class79 {

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Lck;")
    public class119 field1510;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field1503 = 3;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Z")
    public static boolean field1504 = false;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "[Lnl;")
    public static class196[] field1513 = new class196[100];

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Lck;")
    private static class119 field1512 = class298.method1987((byte) 61, "Ok");

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Lck;")
    public static class119 field1506 = field1512;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
    public static long field1508;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lva;Lva;B)V", line = 6)
    public static final void method663(class36 arg0, class36 arg1, byte arg2) {
        int var3 = -44 % ((arg2 - 65) / 36);
        field1509++;
        class234.field3783 = arg1;
        class25.field379 = arg0;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)I", line = 27)
    public static final int method664(byte arg0) {
        field1505++;
        class119.field1822 = class266.field4340;
        class25.method188((byte) 111, false);
        class227.method1444(1);
        class270.method1793(class119.field1822, -1);
        class124.field1917 = new class292();
        class124.field1917.field4991 = 3000;
        class124.field1917.field4949 = 3000;
        if (class68.field1063 == 2) {
            class189.field2995 = class232.field3743 - 48;
            class70.field1097 = class232.field3743 * 128 + 64 - (class189.field2995 * 128);
            class30.field421 = class234.field3775 - 48;
            class62.field987 = class234.field3775 * 128 + 64 - (class30.field421 * 128);
            class234.field3775 = class62.field987 >> 7;
            class232.field3743 = class70.field1097 >> 7;
        } else {
            class280.method1861(-33);
        }
        class59.method439(arg0 + 38);
        if (arg0 != -37) {
            field1506 = (class119) null;
        }
        class216.method1368(-76);
        return 28;
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 79)
    public class99() {
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lck;)V", line = 87)
    public class99(class119 arg0) {
        this.field1510 = arg0;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 97)
    public static void method665(int arg0) {
        field1512 = null;
        field1513 = null;
        if (arg0 <= -79) {
            field1506 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 109)
    public static final void method666(int arg0) {
        field1507++;
        if (class207.field3303 == null) {
            return;
        }
        try {
            if (arg0 != 0) {
                return;
            }
            byte[] var1 = class207.field3303.method1926(-7388);
            if (var1 != null) {
                class3 var2 = new class3(var1);
                class238.field3816 = var2.method63((byte) 1);
                class280.field4629 = new class158[class238.field3816];
                for (int var3 = 0; var3 < class238.field3816; var3++) {
                    class158 var4 = class280.field4629[var3] = new class158();
                    int var5 = var2.method63((byte) 1);
                    var4.field2515 = (var5 & 0x8000) != 0;
                    var4.field2520 = var5 & 0x7FFF;
                    var4.field2523 = var2.method41((byte) -121);
                    var4.field2510 = var2.method59((byte) -68);
                    var4.field2518 = var3;
                    var4.field2521 = class176.method1125(var2.method63((byte) 1), 191);
                }
                class242.method1578(class280.field4629, class280.field4629.length - 1, true, 0);
                class207.field3303 = null;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class207.field3303 = null;
        }
    }
}
