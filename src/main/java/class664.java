import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class664 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field9184;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lda;")
    public static class66 field9178;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qt", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9186;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "[B")
    public byte[] field9181;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "[S")
    public short[] field9175;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "[S")
    public short[] field9179;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "[S")
    public short[] field9185;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILha;IIIIII)V")
    public static final void method3676(int arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9183++;
        if (arg7 != -4) {
            method3677();
        }
        class392 var9 = (class392) class94.method752(arg4, arg5, arg0);
        if (var9 != null) {
            class589 var10 = class350.field5132.method3732((byte) 49, var9.method31(-23356));
            int var11 = var9.method17(-2132) & 0x3;
            int var12 = var9.method18(-10908);
            if (var10.field7855 == -1) {
                int var13 = arg6;
                if (var10.field7933 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg2.method502(4, 45, arg1, arg3, var13);
                    } else if (var11 == 1) {
                        arg2.method514(arg3, arg1, var13, 4, (byte) -102);
                    } else if (var11 == 2) {
                        arg2.method502(4, arg7 ^ 0xFFFFFFDA, arg1 + 3, arg3, var13);
                    } else if (var11 == 3) {
                        arg2.method514(arg3 + 3, arg1, var13, 4, (byte) -72);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg2.method462(arg7 - 107, 1, arg3, 1, arg1, var13);
                    } else if (var11 == 1) {
                        arg2.method462(arg7 - 107, 1, arg3, 1, arg1 + 3, var13);
                    } else if (var11 == 2) {
                        arg2.method462(-127, 1, arg3 + 3, 1, arg1 + 3, var13);
                    } else if (var11 == 3) {
                        arg2.method462(-120, 1, arg3 + 3, 1, arg1, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg2.method514(arg3, arg1, var13, 4, (byte) -64);
                    } else if (var11 == 1) {
                        arg2.method502(4, 62, arg1 + 3, arg3, var13);
                    } else if (var11 == 2) {
                        arg2.method514(arg3 + 3, arg1, var13, 4, (byte) -86);
                    } else if (var11 == 3) {
                        arg2.method502(4, -126, arg1, arg3, var13);
                    }
                }
            } else {
                class414.method2554(var10, arg2, var11, arg3, -24334, arg1);
            }
        }
        class392 var14 = (class392) class771.method4264(arg4, arg5, arg0, field9186 == null ? (field9186 = method3682("he")) : field9186);
        if (var14 != null) {
            class589 var15 = class350.field5132.method3732((byte) 60, var14.method31(-23356));
            int var16 = var14.method17(-2132) & 0x3;
            int var17 = var14.method18(-10908);
            if (var15.field7855 != -1) {
                class414.method2554(var15, arg2, var16, arg3, -24334, arg1);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field7933 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg2.method479(var18, (byte) -46, arg3 + 3, arg1 + 3, arg3, arg1);
                } else {
                    arg2.method479(var18, (byte) -99, arg3, arg1 + 3, arg3 - -3, arg1);
                }
            }
        }
        class392 var19 = (class392) class119.method988(arg4, arg5, arg0);
        if (var19 == null) {
            return;
        }
        class589 var20 = class350.field5132.method3732((byte) 39, var19.method31(-23356));
        int var21 = var19.method17(arg7 ^ 0x850) & 0x3;
        if (var20.field7855 != -1) {
            class414.method2554(var20, arg2, var21, arg3, arg7 ^ 0x5F0E, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "()V")
    public static final void method3677() {
        for (int var0 = 0; var0 < class665.field9187.length; var0++) {
            class665.field9187[var0].method1401();
        }
        class665.field9187 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static final void method3678(int arg0) {
        class533.field7257.method3959(0);
        field9180++;
        if (arg0 != 3) {
            method3680(-88, 79);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
    public static void method3679(int arg0) {
        field9178 = null;
        if (arg0 < 62) {
            method3679(17);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
    public static final void method3680(int arg0, int arg1) {
        field9177++;
        int var2 = -123 / ((arg0 - 59) / 45);
        class362.field5285 = 1000000000L / (long) arg1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method3681(byte arg0, String arg1, Throwable arg2) {
        field9182++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class332.method2086(-177, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class314.method1980(108, var3);
            int var4 = -66 % ((arg0 - 49) / 46);
            String var5 = class176.method1244("%3a", var3, -8560, ":");
            String var6 = class176.method1244("%40", var5, -8560, "@");
            String var7 = class176.method1244("%26", var6, -8560, "&");
            String var8 = class176.method1244("%23", var7, -8560, "#");
            if (class605.field8212 != null) {
                class615 var9 = class642.field8903.method614(new URL(class605.field8212.getCodeBase(), "clienterror.ws?c=" + class132.field1960 + "&u=" + (class566.field7571 == null ? String.valueOf(class327.field4755) : class566.field7571) + "&v1=" + class70.field998 + "&v2=" + class70.field986 + "&e=" + var8), 4159);
                while (var9.field8321 == 0) {
                    class438.method2636(true, 1L);
                }
                if (var9.field8321 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field8318;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3682(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
