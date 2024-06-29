import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class218 {

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Lri;")
    public static class97 field3570;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIB)V", line = 5)
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 106) {
            method1629(37, null);
        }
        class96.field1534 = arg0;
        class559.field8074 = arg3;
        class563.field8097 = arg1;
        field3571++;
        class118.field1896 = arg2;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lr;IIIIIIZZ)V", line = 20)
    public static final void method1626(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class595.field8435 = arg0;
        class261.field4273 = arg1;
        class413.field6343 = class261.field4273 > 1 && class595.field8435.method266();
        class439.field6699 = arg2;
        class134.field2203 = 0x1 << class439.field6699;
        class459.field6867 = class134.field2203 >> 1;
        Math.sqrt((double) (class459.field6867 * class459.field6867 + class459.field6867 * class459.field6867));
        class524.field7649 = arg3;
        class43.field597 = arg4;
        class541.field7896 = arg5;
        class443.field6744 = arg6;
        class390.field6049 = class271.method1911(27309);
        class290.method2047(true);
        class500.field7343 = new class252[arg3][class43.field597][class541.field7896];
        class491.field7187 = new class37[arg3];
        if (arg7) {
            class575.field8191 = new int[class43.field597][class541.field7896];
            class530.field7728 = new byte[class43.field597][class541.field7896];
            class479.field7078 = new short[class43.field597][class541.field7896];
            class524.field7645 = new class252[1][class43.field597][class541.field7896];
            class493.field7208 = new class37[1];
        } else {
            class575.field8191 = null;
            class530.field7728 = null;
            class479.field7078 = null;
            class524.field7645 = null;
            class493.field7208 = null;
        }
        if (arg8) {
            class99.field1601 = new long[arg3][arg4][arg5];
            class529.field7714 = new class263[65535];
            class251.field4009 = new boolean[65535];
            class343.field5536 = 0;
        } else {
            class99.field1601 = null;
            class529.field7714 = null;
            class251.field4009 = null;
            class343.field5536 = 0;
        }
        class164.method1332(false);
        class20.field329 = new class692[2][];
        class20.field329[0] = new class692[class426.field6478[0]];
        class20.field329[1] = new class692[class426.field6478[1]];
        class203.field3310 = new int[2];
        class321.field5016 = new class692[2][];
        class321.field5016[0] = new class692[class441.field6714[0]];
        class321.field5016[1] = new class692[class441.field6714[1]];
        class124.field2052 = new int[2];
        class245.field3903 = new class692[2][];
        class245.field3903[0] = new class692[class691.field9694[0]];
        class245.field3903[1] = new class692[class691.field9694[1]];
        class95.field1483 = new int[2];
        class667.field9434 = new class692[10000];
        class148.field2465 = 0;
        class96.field1533 = new class692[5000];
        class207.field3462 = 0;
        class56.field730 = new class459[5000];
        class15.field203 = 0;
        class37.field509 = new boolean[class443.field6744 + class443.field6744 + 1][class443.field6744 + class443.field6744 + 1];
        class550.field7997 = new boolean[class443.field6744 + class443.field6744 + 2][class443.field6744 + class443.field6744 + 2];
        if (class413.field6343) {
            class299.field4678 = new boolean[arg3][class443.field6744 + class443.field6744 + 1][class443.field6744 + class443.field6744 + 1];
            class522.field7576 = new boolean[arg3][][];
            if (class458.field6856 != null) {
                class690.method3907();
            }
            class458.field6856 = new class526[class261.field4273];
            class595.field8435.method336(class458.field6856.length + 1);
            class595.field8435.method293(0);
            for (int var9 = 0; var9 < class458.field6856.length; var9++) {
                class458.field6856[var9] = new class526(var9 + 1, class595.field8435);
                (new Thread(class458.field6856[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class261.field4273 == 2) {
                var10 = 4;
                class180.field3034 = 2;
            } else if (class261.field4273 == 3) {
                var10 = 6;
                class180.field3034 = 3;
            } else {
                var10 = 8;
                class180.field3034 = 4;
            }
            class235.field3744 = new class367[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class235.field3744[var11] = new class367(class668.field9446[class261.field4273 - 2][var11]);
            }
        } else {
            class180.field3034 = 1;
        }
        class90.field1081 = new int[class180.field3034 - 1];
        class547.field7971 = new int[class180.field3034 - 1];
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILie;)V", line = 149)
    public static final void method1627(int arg0, class6 arg1) {
        if (arg0 != 3) {
            field3570 = null;
        }
        field3568++;
        byte[] var2 = new byte[24];
        if (class685.field9610 != null) {
            try {
                class685.field9610.method3154((byte) -75, 0L);
                class685.field9610.method3153(var2, -6724);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method80(255, var2, 24, 0);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 197)
    public static void method1628(int arg0) {
        field3570 = null;
        if (arg0 != 0) {
            field3569 = -122;
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(ILie;)Lmp;", line = 209)
    public static final class706 method1629(int arg0, class6 arg1) {
        field3572++;
        class706 var2 = new class706();
        var2.field9984 = arg1.method67(12021);
        var2.field9989 = class139.field2340.method3968(var2.field9984, 0);
        if (arg0 != 24) {
            field3570 = null;
        }
        return var2;
    }
}
