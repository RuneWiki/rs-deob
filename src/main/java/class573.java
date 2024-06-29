import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class573 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public int field8162;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lbv;")
    public static class567 field8155 = new class567("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lcb;")
    public static class78 field8163 = new class78(64);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field8160;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field8161;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field8164;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3282(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILrl;IIBLra;IILjava/lang/String;ILoh;Lpa;)V", line = 4)
    public static final void method3276(int arg0, class633 arg1, int arg2, int arg3, byte arg4, class259 arg5, int arg6, int arg7, String arg8, int arg9, class549 arg10, class593 arg11) {
        field8160++;
        if (arg4 != -72) {
            field8155 = null;
        }
        int var12;
        if (class377.field5547 == 4) {
            var12 = (int) class523.field7256 & 0x3FFF;
        } else {
            var12 = (int) class523.field7256 + class495.field6941 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field7678 / 2, arg10.field7776 / 2) + 10;
        int var14 = arg2 * arg2 + arg6 * arg6;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class285.field4154[var12];
        int var16 = class285.field4152[var12];
        if (class377.field5547 != 4) {
            var16 = var16 * 256 / (class353.field5042 + 256);
            var15 = var15 * 256 / (class353.field5042 + 256);
        }
        int var17 = arg2 * var15 + arg6 * var16 >> 15;
        int var18 = arg2 * var16 - (arg6 * var15) >> 15;
        int var19 = arg1.method3650(null, arg8, 3, 100);
        int var20 = arg1.method3658(null, 100, arg8, -124, 0);
        int var21 = var17 - var19 / 2;
        if (-arg10.field7678 <= var21 && var21 <= arg10.field7678 && var18 >= -arg10.field7776 && arg10.field7776 >= var18) {
            arg5.method1639(0, arg11, 0, 0, arg7, 1, var19, arg10.field7678 / 2 + var21 + arg3, 0, 50, null, arg9, arg9 + (arg10.field7776 / 2) - arg0 - var18 - var20, null, arg3, arg8);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIILqa;I)V", line = 52)
    public static final void method3277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class167 arg7, int arg8) {
        if (arg1 >= -91) {
            method3277(62, 76, -96, 37, 78, -37, -32, null, -103);
        }
        field8156++;
        class231 var9 = (class231) class507.method2859(arg8, arg6, arg5);
        if (var9 != null) {
            class370 var10 = class552.field7819.method2890(0, var9.method264(-25792));
            int var11 = var9.method258((byte) -36) & 0x3;
            int var12 = var9.method269(-13265);
            if (var10.field5293 == -1) {
                int var13 = arg2;
                if (var10.field5276 > 0) {
                    var13 = arg0;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method1164(4, arg3, 1, arg4, var13);
                    } else if (var11 == 1) {
                        arg7.method1160(4, arg4, arg3, -3, var13);
                    } else if (var11 == 2) {
                        arg7.method1164(4, arg3 + 3, 1, arg4, var13);
                    } else if (var11 == 3) {
                        arg7.method1160(4, arg4 + 3, arg3, -3, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method1159(var13, 1, arg4, arg3, (byte) -117, 1);
                    } else if (var11 == 1) {
                        arg7.method1159(var13, 1, arg4, arg3 + 3, (byte) -81, 1);
                    } else if (var11 == 2) {
                        arg7.method1159(var13, 1, arg4 + 3, arg3 - -3, (byte) -44, 1);
                    } else if (var11 == 3) {
                        arg7.method1159(var13, 1, arg4 + 3, arg3, (byte) 86, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method1160(4, arg4, arg3, -3, var13);
                    } else if (var11 == 1) {
                        arg7.method1164(4, arg3 + 3, 1, arg4, var13);
                    } else if (var11 == 2) {
                        arg7.method1160(4, arg4 + 3, arg3, -3, var13);
                    } else if (var11 == 3) {
                        arg7.method1164(4, arg3, 1, arg4, var13);
                    }
                }
            } else {
                class356.method2168(var10, arg3, arg4, arg7, var11, false);
            }
        }
        class231 var14 = (class231) class460.method2691(arg8, arg6, arg5, field8164 == null ? (field8164 = method3282("p")) : field8164);
        if (var14 != null) {
            class370 var15 = class552.field7819.method2890(0, var14.method264(-25792));
            int var16 = var14.method258((byte) -36) & 0x3;
            int var17 = var14.method269(-13265);
            if (var15.field5293 != -1) {
                class356.method2168(var15, arg3, arg4, arg7, var16, false);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5276 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method1155(var18, arg3 + 3, arg3, arg4 + 3, (byte) -8, arg4);
                } else {
                    arg7.method1155(var18, arg3 + 3, arg3, arg4, (byte) -8, arg4 + 3);
                }
            }
        }
        class231 var19 = (class231) class621.method3504(arg8, arg6, arg5);
        if (var19 == null) {
            return;
        }
        class370 var20 = class552.field7819.method2890(0, var19.method264(-25792));
        int var21 = var19.method258((byte) -36) & 0x3;
        if (var20.field5293 != -1) {
            class356.method2168(var20, arg3, arg4, arg7, var21, false);
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 192)
    public static void method3278(int arg0) {
        field8155 = null;
        field8163 = null;
        if (arg0 <= 0) {
            method3276(-103, null, -71, -5, (byte) 85, null, -64, 112, null, -26, null, null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "toString", descriptor = "()Ljava/lang/String;", line = 204)
    public final String toString() {
        field8157++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Lim;", line = 215)
    public static final class352 method3279(int arg0, byte arg1) {
        field8158++;
        class352 var2 = (class352) class539.field7512.method2407(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class566.field8096.method3175(arg0, (byte) -53, 0);
        class352 var4 = new class352();
        if (var3 != null) {
            var4.method2135(48, new class268(var3), arg0);
        }
        class539.field7512.method2408(var4, (long) arg0, -114);
        return arg1 == 118 ? var4 : null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(FIFF)F", line = 243)
    public static final float method3280(float arg0, int arg1, float arg2, float arg3) {
        field8159++;
        if (arg1 != 256) {
            field8155 = null;
        }
        return (arg2 - arg3) * arg0 + arg3;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V", line = 257)
    public class573(int arg0) {
        this.field8162 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V", line = 266)
    public static final void method3281(int arg0) {
        field8161++;
        int var1 = class543.field7574.length;
        if (arg0 < 111) {
            method3276(-115, null, -29, -44, (byte) -87, null, 108, 21, null, -47, null, null);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class543.field7574[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class642.field9338; var4++) {
                    if (class503.field7036[var4] == class43.field584[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class503.field7036[class642.field9338] = class43.field584[var2];
                    var3 = class642.field9338++;
                }
                class268 var5 = new class268(class543.field7574[var2]);
                int var6 = 0;
                while (var5.field3913 < class543.field7574[var2].length && var6 < 511 && class128.field2098 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1745(32132);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class43.field584[var2] >> 8) * 64 - (class382.field5687 - var10);
                    int var13 = (class43.field584[var2] & 0xFF) * 64 + var11 - class597.field8500;
                    class432 var14 = class204.field2882.method287(var5.method1745(32132), 8);
                    class181 var15 = (class181) class432.field6368.method740(0, (long) var7);
                    if (var15 == null && (var14.field6310 & 0x1) > 0 && class466.field6714 == var9 && var12 >= 0 && var14.field6337 + var12 < class146.field2247 && var13 >= 0 && (var14.field6337 + var13) < class66.field990) {
                        class170 var16 = new class170();
                        var16.field1555 = var7;
                        class181 var17 = new class181(var16);
                        class432.field6368.method737((long) var7, (byte) 92, var17);
                        class629.field8848[class313.field4570++] = var17;
                        class591.field8401[class128.field2098++] = var7;
                        var16.field1560 = class310.field4553;
                        var16.method1177(var14, (byte) 118);
                        var16.method776((byte) -111, var16.field2492.field6337);
                        var16.field1550 = var16.field2492.field6350 << 3;
                        var16.method771(0, var16.field2492.field6331 + 4 << 11 & 0x3C4E, true);
                        var16.method1182(true, var9, var12, var13, var16.method781((byte) -127), -1);
                    }
                }
            }
        }
    }
}
