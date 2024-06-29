import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class85 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1565 = 0;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Ltg;")
    public static class184 field1568 = class135.method812(")1j", 3);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field1574 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "Ltg;")
    private static class184 field1576 = class135.method812("We suspect someone knows your password)3", 3);

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
    public static int[] field1572 = new int[5];

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Ltg;")
    public static class184 field1570 = field1576;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field1577 = 50;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Ltg;")
    public static class184 field1578 = class135.method812("nicht hergestellt werden)3", 3);

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Ltg;")
    public static class184 field1573 = class135.method812("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 3);

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Ltg;")
    public static class184 field1579 = class135.method812("null", 3);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III[B)I")
    public static final int method500(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 11498) {
            return -89;
        }
        field1569++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class32.field560[(var4 ^ arg3[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method501(byte arg0, int arg1) {
        if (arg0 != -16) {
            return null;
        }
        field1566++;
        if (arg1 == 100 && class91.field1694 > 0) {
            byte[] var2 = class194.field3757[--class91.field1694];
            class194.field3757[class91.field1694] = null;
            return var2;
        } else if (arg1 == 5000 && class47.field890 > 0) {
            byte[] var3 = class157.field2821[--class47.field890];
            class157.field2821[class47.field890] = null;
            return var3;
        } else if (arg1 == 30000 && class128.field2316 > 0) {
            byte[] var4 = class107.field1936[--class128.field2316];
            class107.field1936[class128.field2316] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)I")
    public static final int method502(int arg0, int arg1, int arg2) {
        field1567++;
        if (arg1 >= -79) {
            method502(-114, -53, 20);
        }
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public static void method503(byte arg0) {
        if (arg0 != 4) {
            return;
        }
        field1576 = null;
        field1574 = null;
        field1572 = null;
        field1568 = null;
        field1573 = null;
        field1578 = null;
        field1570 = null;
        field1579 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIBILka;I)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class97 arg6, int arg7) {
        field1571++;
        if (arg4 != -38) {
            method504(108, 85, -123, 101, (byte) -54, 37, null, -13);
        }
        if (arg3 < 0 || arg3 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var10 = arg6.method588((byte) -77);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg6.method588((byte) -86);
                    return;
                }
                if (var10 <= 49) {
                    arg6.method588((byte) -30);
                }
            }
        }
        class46.field878[arg7][arg3][arg5] = 0;
        while (true) {
            int var8 = arg6.method588((byte) -105);
            if (var8 == 0) {
                if (arg7 == 0) {
                    class179.field3418[0][arg3][arg5] = -class31.method196((byte) 31, arg1 + arg5 + 556238, arg3 + 932731 + arg2) * 8;
                    return;
                } else {
                    class179.field3418[arg7][arg3][arg5] = class179.field3418[arg7 - 1][arg3][arg5] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg6.method588((byte) -79);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg7 == 0) {
                    class179.field3418[0][arg3][arg5] = -var9 * 8;
                    return;
                }
                class179.field3418[arg7][arg3][arg5] = class179.field3418[arg7 - 1][arg3][arg5] - var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class123.field2237[arg7][arg3][arg5] = arg6.method591(65280);
                class29.field492[arg7][arg3][arg5] = (byte) ((var8 - 2) / 4);
                class129.field2327[arg7][arg3][arg5] = (byte) class10.method61(arg0 + var8 - 2, 3);
            } else if (var8 <= 81) {
                class46.field878[arg7][arg3][arg5] = (byte) (var8 - 49);
            } else {
                class167.field2987[arg7][arg3][arg5] = (byte) (var8 - 81);
            }
        }
    }
}
