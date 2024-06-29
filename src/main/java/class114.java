import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class114 extends class130 {

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[B")
    public byte[] field1749;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Lap;")
    public static class29 field1755;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lre;")
    public static class486 field1751;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
    public static final void method871(int arg0, boolean arg1) {
        field1748++;
        if (class261.field4171 == null || class261.field4171.length < arg0) {
            class261.field4171 = new int[arg0];
        }
        if (arg1) {
            method876(103, -68);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method872(int arg0) {
        field1754++;
        if (class104.field1608 >= 0) {
            long var1 = class375.method2397((byte) -75);
            class104.field1608 = (int) ((long) class104.field1608 - (var1 - class530.field7745));
            if (class104.field1608 > 0) {
                int var3 = (class104.field1608 << 8) / class263.field4181;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class342.field5115 = ((class505.field7343 & 0xFF00FF) * var3 + (class231.field3478.field807 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class505.field7343 & 0xFF00) * var3 + (class231.field3478.field807 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class68.field1088 = (class231.field3478.field792 - class409.field6045) * var6 + class409.field6045;
                class22.field251 = (class231.field3478.field789 - class157.field2407) * var6 + class157.field2407;
                class138.field2093 = (class231.field3478.field803 - class4.field61) * var6 + class4.field61;
                class401.field5915 = (class231.field3478.field802 - class421.field6184) * var6 + class421.field6184;
                class128.field1915 = class272.field4287 * var3 + class231.field3478.field786 * var4 >> 8;
                class192.field2956 = (class231.field3478.field794 - class276.field4330) * var6 + class276.field4330;
                class172.field2667 = ((class238.field3585 & 0xFF00) * var3 + (class231.field3478.field805 & 0xFF00) * var4 & 0xFF0000) + ((class238.field3585 & 0xFF00FF) * var3 + (class231.field3478.field805 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class345.field5139 = (class231.field3478.field798 - class171.field2648) * var6 + class171.field2648;
                if (class327.field4947 != class231.field3478.field801) {
                    class172.field2666 = class73.field1248.method550(class327.field4947, class231.field3478.field801, var6, class172.field2666);
                }
            } else {
                class172.field2667 = class231.field3478.field805;
                class342.field5115 = class231.field3478.field807;
                class401.field5915 = class231.field3478.field802;
                class68.field1088 = class231.field3478.field792;
                class138.field2093 = class231.field3478.field803;
                class128.field1915 = class231.field3478.field786;
                class172.field2666 = class231.field3478.field801;
                class345.field5139 = class231.field3478.field798;
                class22.field251 = class231.field3478.field789;
                class192.field2956 = class231.field3478.field794;
                class104.field1608 = -1;
            }
            class530.field7745 = var1;
        }
        if (arg0 != -12500) {
            method872(-16);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BILza;I)V")
    public static final void method873(byte arg0, int arg1, class299 arg2, int arg3) {
        class166.field2508 = new class52[arg1][arg3];
        field1753++;
        class73.field1248 = arg2;
        if (class336.field5061 != null) {
            class489.field7140 = class364.method2325(class336.field5061[1], -53, class336.field5061[5], class336.field5061[0], class336.field5061[4], class336.field5061[3], class336.field5061[2]);
        }
        if (arg0 != 96) {
            field1755 = null;
        }
        class392.field5722 = new class52();
        class78.method702(17354);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZI)I")
    public static final int method874(int arg0, boolean arg1, int arg2) {
        field1756++;
        int var3 = class298.method1985(arg2 - 1, arg0 + -1, (byte) 26) + class298.method1985(arg2 - 1, arg0 + 1, (byte) 102) + class298.method1985(arg2 - -1, arg0 + -1, (byte) 33) + class298.method1985(arg2 + 1, arg0 + 1, (byte) 46);
        if (arg1) {
            return -116;
        } else {
            int var4 = class298.method1985(arg2, arg0 - 1, (byte) 116) + (class298.method1985(arg2, arg0 + 1, (byte) 23) - (-class298.method1985(arg2 - 1, arg0, (byte) 45) - class298.method1985(arg2 + 1, arg0, (byte) 90)));
            int var5 = class298.method1985(arg2, arg0, (byte) 125);
            return var5 / 4 + var3 / 16 + var4 / 8;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        this.field1749 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method875(int arg0) {
        field1751 = null;
        if (arg0 != -1) {
            method875(104);
        }
        field1755 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method876(int arg0, int arg1) {
        class107.field1629 = new int[arg1];
        class529.field7736 = new int[arg1];
        if (arg0 != 1) {
            field1750 = 83;
        }
        field1752++;
        class474.field6951 = new int[arg1];
        class316.field4820 = new int[arg1];
        class42.field675 = new int[arg1];
    }
}
