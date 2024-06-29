import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class234 extends class349 {

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    private int field3829;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3836 = null;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "F")
    public static float field3834;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lme;")
    public static class210 field3830;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V", line = 6)
    public final void method210(int arg0, int arg1, int arg2) {
        int var4 = this.field3827 * arg1 >> 12;
        if (arg0 != 12459) {
            this.method210(-15, -42, 46);
        }
        field3839++;
        int var5 = this.field3831 * arg1 >> 12;
        int var6 = this.field3829 * arg2 >> 12;
        int var7 = this.field3837 * arg2 >> 12;
        class41.method318(var4, var5, this.field5589, false, var7, var6, this.field5585, this.field5583);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V", line = 26)
    public static final void method1627(byte arg0) {
        class189.method1309(-1, false);
        System.gc();
        class311.method2260(25, -19880);
        if (arg0 <= -58) {
            field3828++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V", line = 46)
    public static final void method1628(boolean arg0, int arg1) {
        field3835++;
        class223.field3687.method896(arg1, (byte) -27);
        class289.field4699.method896(arg1, (byte) -75);
        if (arg0) {
            field3834 = -0.062450107F;
        }
        class27.field679.method896(arg1, (byte) -55);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 60)
    public static void method1629(int arg0) {
        field3836 = null;
        field3830 = null;
        if (arg0 >= -24) {
            field3836 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I", line = 71)
    public static final int method1630(int arg0) {
        field3838++;
        try {
            if (class79.field1407 == 0) {
                if (class281.field4601 > (class218.method1520((byte) 122) - 5000L)) {
                    return 0;
                }
                class41.field877 = class59.field1164.method1120(class129.field2238, class20.field519, -31246);
                class180.field2962 = class218.method1520((byte) 121);
                class79.field1407 = 1;
            }
            if (class180.field2962 + 30000L < class218.method1520((byte) 30)) {
                return class299.method2139(1000, (byte) -79);
            }
            if (class79.field1407 == 1) {
                if (class41.field877.field3504 == 2) {
                    return class299.method2139(1001, (byte) -92);
                }
                if (class41.field877.field3504 != 1) {
                    return -1;
                }
                class127.field2224 = new class237((Socket) class41.field877.field3501, class59.field1164);
                class41.field877 = null;
                class51.field1038.field2435 = 0;
                int var1 = 0;
                if (class205.field3416) {
                    var1 = class76.field1375;
                }
                class51.field1038.method1027(23, -20374);
                class51.field1038.method1045((byte) -50, var1);
                class127.field2224.method1645(class51.field1038.field2496, class51.field1038.field2435, arg0 - 20322, 0);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-122);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-112);
                }
                int var2 = class127.field2224.method1639((byte) 125);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-83);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-110);
                }
                if (var2 != 0) {
                    return class299.method2139(var2, (byte) -69);
                }
                class79.field1407 = 2;
            }
            if (class79.field1407 == 2) {
                if (class127.field2224.method1642((byte) -89) < 2) {
                    return -1;
                }
                class233.field3822 = class127.field2224.method1639((byte) 125);
                class233.field3822 <<= 0x8;
                class233.field3822 += class127.field2224.method1639((byte) 125);
                class319.field5196 = new byte[class233.field3822];
                class314.field5110 = 0;
                class79.field1407 = 3;
            }
            if (~class79.field1407 != arg0) {
                return -1;
            }
            int var3 = class127.field2224.method1642((byte) -89);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > (class233.field3822 - class314.field5110)) {
                var3 = class233.field3822 - class314.field5110;
            }
            class127.field2224.method1643(class314.field5110, var3, (byte) -56, class319.field5196);
            class314.field5110 += var3;
            if (class314.field5110 < class233.field3822) {
                return -1;
            } else if (class208.method1440(class319.field5196, arg0 + 7510)) {
                class162.field2728 = new class191[class351.field5615];
                int var4 = 0;
                for (int var5 = class310.field5057; var5 <= class282.field4619; var5++) {
                    class191 var6 = class303.method2166(36, var5);
                    if (var6 != null) {
                        class162.field2728[var4++] = var6;
                    }
                }
                class127.field2224.method1646((byte) 88);
                class341.field5410 = 0;
                class79.field1407 = 0;
                class319.field5196 = null;
                class127.field2224 = null;
                class281.field4601 = class218.method1520((byte) 119);
                return 0;
            } else {
                return class299.method2139(1002, (byte) -117);
            }
        } catch (IOException var8) {
            return class299.method2139(1003, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V", line = 200)
    public final void method215(int arg0, int arg1, int arg2) {
        field3833++;
        int var4 = this.field3827 * arg2 >> 12;
        if (arg0 != -1664663732) {
            this.method210(-77, -57, -26);
        }
        int var5 = this.field3831 * arg2 >> 12;
        int var6 = this.field3829 * arg1 >> 12;
        int var7 = this.field3837 * arg1 >> 12;
        class119.method870(this.field5583, var5, var4, arg0 + 1664648619, var6, var7, this.field5589);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V", line = 221)
    public final void method213(int arg0, int arg1, int arg2) {
        if (arg2 != 13258) {
            return;
        }
        int var4 = this.field3831 * arg0 >> 12;
        int var5 = this.field3827 * arg0 >> 12;
        field3832++;
        int var6 = this.field3837 * arg1 >> 12;
        int var7 = this.field3829 * arg1 >> 12;
        class338.method2389(var7, -24690, var4, this.field5585, var6, var5);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIII)V", line = 242)
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3837 = arg3;
        this.field3831 = arg2;
        this.field3829 = arg1;
        this.field3827 = arg0;
    }
}
