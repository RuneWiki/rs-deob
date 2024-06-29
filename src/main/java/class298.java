import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class298 {

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lwp;")
    public static class453 field3669 = new class453(62, -1);

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "Lks;")
    public static class30 field3671 = new class30(7500);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1655(int arg0) {
        field3672++;
        if (class82.field1097 == 0) {
            return;
        }
        try {
            if (++class279.field3503 > 2000) {
                if (class446.field5686 != null) {
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                }
                if (class290.field3618 >= 2) {
                    class82.field1097 = 0;
                    class76.field1046 = -5;
                    return;
                }
                class381.field4817.method1667(0);
                class82.field1097 = 1;
                class290.field3618++;
                class279.field3503 = 0;
            }
            if (class82.field1097 == 1) {
                class42.field553 = class381.field4817.method1664(0, class590.field8289);
                class82.field1097 = 2;
            }
            if (class82.field1097 == 2) {
                if (class42.field553.field3358 == 2) {
                    throw new IOException();
                }
                if (class42.field553.field3358 != 1) {
                    return;
                }
                class446.field5686 = class190.method1158(-125, (Socket) class42.field553.field3356, 7500);
                class42.field553 = null;
                class558.method3071((byte) 117);
                class82.field1097 = 4;
            }
            if (class82.field1097 == 4) {
                if (!class446.field5686.method1232(1, (byte) -100)) {
                    return;
                }
                class446.field5686.method1228((byte) 103, 0, field3671.field8804, 1);
                int var1 = field3671.field8804[0] & 0xFF;
                if (var1 != 21) {
                    class82.field1097 = 0;
                    class76.field1046 = var1;
                    class446.field5686.method1235(0);
                    class446.field5686 = null;
                    return;
                }
                class82.field1097 = 5;
            }
            int var2 = 71 / ((arg0 - 69) / 41);
            if (class82.field1097 == 5) {
                if (!class446.field5686.method1232(1, (byte) 125)) {
                    return;
                }
                class446.field5686.method1228((byte) 78, 0, field3671.field8804, 1);
                class82.field1097 = 6;
                class373.field4708 = new String[field3671.field8804[0] & 0xFF];
            }
            if (class82.field1097 == 6 && class446.field5686.method1232(class373.field4708.length * 8, (byte) 116)) {
                field3671.field8812 = 0;
                class446.field5686.method1228((byte) 81, 0, field3671.field8804, class373.field4708.length * 8);
                for (int var3 = 0; var3 < class373.field4708.length; var3++) {
                    class373.field4708[var3] = class577.method3181((byte) -114, field3671.method3527(false));
                }
                class76.field1046 = 21;
                class82.field1097 = 0;
                class446.field5686.method1235(0);
                class446.field5686 = null;
            }
        } catch (IOException var4) {
            if (class446.field5686 != null) {
                class446.field5686.method1235(0);
                class446.field5686 = null;
            }
            if (class290.field3618 >= 2) {
                class82.field1097 = 0;
                class76.field1046 = -4;
            } else {
                class381.field4817.method1667(0);
                class290.field3618++;
                class82.field1097 = 1;
                class279.field3503 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIIIII)V", line = 146)
    public static final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3668++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class430.field5384 + ((class525.field7130 - class430.field5384) * var8 / 100);
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg2 & 0x3FFF;
        int var12 = 16384 - arg4 & 0x3FFF;
        if (arg5 < 30) {
            field3669 = null;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class453.field5810[var11] * -var10 >> 14;
            var15 = class453.field5811[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class453.field5810[var12] * var15 >> 14;
            var15 = class453.field5811[var12] * var15 >> 14;
        }
        class693.field9826 = arg4;
        class571.field7982 = arg7 - var14;
        class20.field292 = arg3 - var13;
        class276.field3464 = arg1 - var15;
        class215.field2673 = arg2;
        class654.field9226 = 0;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIZ)I", line = 197)
    public static final int method1657(int arg0, int arg1, boolean arg2) {
        field3666++;
        if (!arg2) {
            method1657(90, 91, true);
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 227)
    public static void method1658(byte arg0) {
        field3669 = null;
        if (arg0 < 35) {
            method1655(15);
        }
        field3671 = null;
    }
}
