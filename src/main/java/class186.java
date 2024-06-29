import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class186 {

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lfe;")
    private class51 field3644 = null;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    private int field3638 = 65000;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lfe;")
    private class51 field3645 = null;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    private int field3636;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Z")
    public static boolean field3635 = false;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Z")
    public static boolean field3639 = false;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Lcd;")
    public static class23 field3642 = class54.method414("Lade Eingabe)2Steuerungsprogramm)3)3)3", -1);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z[BII)Z")
    public final boolean method1142(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field3632++;
        class51 var5 = this.field3644;
        synchronized (this.field3644) {
            if (arg2 < 0 || arg2 > this.field3638) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1143(arg0, (byte) 120, arg2, arg1, arg3);
            if (!var6) {
                var6 = this.method1143(false, (byte) 116, arg2, arg1, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBI[BI)Z")
    private final boolean method1143(boolean arg0, byte arg1, int arg2, byte[] arg3, int arg4) {
        field3634++;
        class51 var6 = this.field3644;
        synchronized (this.field3644) {
            try {
                int var7;
                if (arg0) {
                    if (this.field3645.method403((byte) 100) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field3645.method401((byte) -85, (long) (arg4 * 6));
                    this.field3645.method397(class144.field2938, 0, (byte) 11, 6);
                    var7 = ((class144.field2938[3] & 0xFF) << 16) - (-((class144.field2938[4] & 0xFF) << 8) - (class144.field2938[5] & 0xFF));
                    if (var7 <= 0 || this.field3644.method403((byte) 100) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3644.method403((byte) 100) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class144.field2938[3] = (byte) (var7 >> 16);
                class144.field2938[2] = (byte) arg2;
                class144.field2938[4] = (byte) (var7 >> 8);
                if (arg1 < 85) {
                    field3639 = true;
                }
                class144.field2938[0] = (byte) (arg2 >> 16);
                class144.field2938[1] = (byte) (arg2 >> 8);
                class144.field2938[5] = (byte) var7;
                this.field3645.method401((byte) -85, (long) (arg4 * 6));
                this.field3645.method405(0, class144.field2938, 6, -96);
                int var10 = 0;
                int var11 = 0;
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field3644.method401((byte) -85, (long) (var7 * 520));
                            try {
                                this.field3644.method397(class144.field2938, 0, (byte) -110, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class144.field2938[0] & 0xFF) << 8) + (class144.field2938[1] & 0xFF);
                            var12 = ((class144.field2938[5] & 0xFF) << 8) + (class144.field2938[4] << 16 & 0xFF0000) + (class144.field2938[6] & 0xFF);
                            int var14 = ((class144.field2938[2] & 0xFF) << 8) + (class144.field2938[3] & 0xFF);
                            int var15 = class144.field2938[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field3636 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3644.method403((byte) 100) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3644.method403((byte) 100) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class144.field2938[7] = (byte) this.field3636;
                    class144.field2938[3] = (byte) var11;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class144.field2938[6] = (byte) var12;
                    class144.field2938[1] = (byte) arg4;
                    class144.field2938[5] = (byte) (var12 >> 8);
                    class144.field2938[0] = (byte) (arg4 >> 8);
                    class144.field2938[2] = (byte) (var11 >> 8);
                    var11++;
                    class144.field2938[4] = (byte) (var12 >> 16);
                    this.field3644.method401((byte) -85, (long) (var7 * 520));
                    var7 = var12;
                    this.field3644.method405(0, class144.field2938, 8, -93);
                    this.field3644.method405(var10, arg3, var18, -120);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1144(int arg0) {
        if (arg0 < 72) {
            method1144(-25);
        }
        field3642 = null;
    }

    @OriginalMember(owner = "client!ug", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3640++;
        return "Cache:" + this.field3636;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1145(String arg0, Throwable arg1, int arg2) {
        field3631++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class12.method68(arg1, false);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', (char) arg2);
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class12.field272.field2839 != null) {
                class32 var8 = class12.field272.method876(4, new URL(class12.field272.field2839.getCodeBase(), "clienterror.ws?c=" + class49.field1181 + "&u=" + class94.field1991 + "&v1=" + class137.field2827 + "&v2=" + class137.field2833 + "&e=" + var7));
                while (var8.field686 == 0) {
                    class53.method409(1L, -25391);
                }
                if (var8.field686 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field683;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[B")
    public final byte[] method1146(int arg0, int arg1) {
        field3637++;
        class51 var3 = this.field3644;
        synchronized (this.field3644) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field3645.method403((byte) 100)) {
                    return null;
                }
                this.field3645.method401((byte) -85, (long) (arg1 * 6));
                this.field3645.method397(class144.field2938, 0, (byte) -126, 6);
                int var5 = ((class144.field2938[0] & 0xFF) << 16) + ((class144.field2938[1] & 0xFF) << 8) + (class144.field2938[2] & 0xFF);
                int var6 = (class144.field2938[5] & 0xFF) + ((class144.field2938[3] & 0xFF) << 16) + ((class144.field2938[4] & 0xFF) << 8);
                if (var5 < 0 || var5 > this.field3638) {
                    return null;
                } else if (var6 > 0 && this.field3644.method403((byte) 100) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    if (arg0 != 21947) {
                        this.field3636 = -45;
                    }
                    int var10 = 0;
                    int var11 = 0;
                    label74: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3644.method401((byte) -85, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3644.method397(class144.field2938, 0, (byte) -112, var13 + 8);
                        int var14 = ((class144.field2938[2] & 0xFF) << 8) + (class144.field2938[3] & 0xFF);
                        int var15 = (class144.field2938[6] & 0xFF) + ((class144.field2938[5] & 0xFF) << 8) + ((class144.field2938[4] & 0xFF) << 16);
                        int var16 = class144.field2938[7] & 0xFF;
                        int var17 = ((class144.field2938[0] & 0xFF) << 8) + (class144.field2938[1] & 0xFF);
                        if (arg1 == var17 && var11 == var14 && this.field3636 == var16) {
                            if (var15 >= 0 && (long) var15 <= this.field3644.method403((byte) 100) / 520L) {
                                var6 = var15;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var9[var10++] = class144.field2938[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBZIIIIIIIII)Z")
    public static final boolean method1147(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field3643++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class50.field1198[var12][var37] = 0;
                class136.field2815[var12][var37] = 99999999;
            }
        }
        int var13 = arg4;
        class50.field1198[arg4][arg11] = 99;
        class136.field2815[arg4][arg11] = 0;
        int var14 = arg11;
        int var15 = 0;
        byte var16 = 0;
        class191.field3802[var16] = arg4;
        int var38 = var16 + 1;
        class104.field2209[var16] = arg11;
        int[][] var17 = class62.field1435[class59.field1385].field1261;
        boolean var18 = false;
        int var19 = class191.field3802.length;
        while (var15 != var38) {
            var13 = class191.field3802[var15];
            var14 = class104.field2209[var15];
            var15 = (var15 + 1) % var19;
            if (arg6 == var13 && arg10 == var14) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class62.field1435[class59.field1385].method416(-1, arg6, arg7, arg10, var13, arg3 - 1, var14)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class62.field1435[class59.field1385].method420(arg6, var14, 79, var13, arg3 - 1, arg10, arg7)) {
                    var18 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class62.field1435[class59.field1385].method417(var14, arg5, arg10, arg0, var13, 1, arg8, arg6)) {
                var18 = true;
                break;
            }
            int var36 = class136.field2815[var13][var14] + 1;
            if (var13 > 0 && class50.field1198[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0) {
                class191.field3802[var38] = var13 - 1;
                class104.field2209[var38] = var14;
                class50.field1198[var13 - 1][var14] = 2;
                class136.field2815[var13 - 1][var14] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var13 < 103 && class50.field1198[var13 + 1][var14] == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0) {
                class191.field3802[var38] = var13 + 1;
                class104.field2209[var38] = var14;
                class50.field1198[var13 + 1][var14] = 8;
                class136.field2815[var13 + 1][var14] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var14 > 0 && class50.field1198[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class191.field3802[var38] = var13;
                class104.field2209[var38] = var14 - 1;
                class50.field1198[var13][var14 - 1] = 1;
                var38 = (var38 + 1) % var19;
                class136.field2815[var13][var14 - 1] = var36;
            }
            if (var14 < 103 && class50.field1198[var13][var14 + 1] == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class191.field3802[var38] = var13;
                class104.field2209[var38] = var14 + 1;
                class50.field1198[var13][var14 + 1] = 4;
                var38 = (var38 + 1) % var19;
                class136.field2815[var13][var14 + 1] = var36;
            }
            if (var13 > 0 && var14 > 0 && class50.field1198[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class191.field3802[var38] = var13 - 1;
                class104.field2209[var38] = var14 - 1;
                class50.field1198[var13 - 1][var14 - 1] = 3;
                class136.field2815[var13 - 1][var14 - 1] = var36;
                var38 = (var38 + 1) % var19;
            }
            if (var13 < 103 && var14 > 0 && class50.field1198[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class191.field3802[var38] = var13 + 1;
                class104.field2209[var38] = var14 - 1;
                var38 = (var38 + 1) % var19;
                class50.field1198[var13 + 1][var14 - 1] = 9;
                class136.field2815[var13 + 1][var14 - 1] = var36;
            }
            if (var13 > 0 && var14 < 103 && class50.field1198[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class191.field3802[var38] = var13 - 1;
                class104.field2209[var38] = var14 + 1;
                var38 = (var38 + 1) % var19;
                class50.field1198[var13 - 1][var14 + 1] = 6;
                class136.field2815[var13 - 1][var14 + 1] = var36;
            }
            if (var13 < 103 && var14 < 103 && class50.field1198[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class191.field3802[var38] = var13 + 1;
                class104.field2209[var38] = var14 + 1;
                var38 = (var38 + 1) % var19;
                class50.field1198[var13 + 1][var14 + 1] = 12;
                class136.field2815[var13 + 1][var14 + 1] = var36;
            }
        }
        class47.field1080 = 0;
        if (!var18) {
            if (!arg2) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg6 - var21; var23 <= arg6 + var21; var23++) {
                for (int var24 = arg10 - var21; var24 <= arg10 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class136.field2815[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg6) {
                            var25 = arg6 - var23;
                        } else if (var23 > arg6 + arg8 - 1) {
                            var25 = var23 + 1 - arg6 - arg8;
                        }
                        int var26 = 0;
                        if (arg10 > var24) {
                            var26 = arg10 - var24;
                        } else if (arg10 + arg5 - 1 < var24) {
                            var26 = var24 + 1 - arg10 - arg5;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class136.field2815[var23][var24]) {
                            var20 = var27;
                            var13 = var23;
                            var14 = var24;
                            var22 = class136.field2815[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg4 == var13 && arg11 == var14) {
                return false;
            }
            class47.field1080 = 1;
        }
        byte var28 = 0;
        class191.field3802[var28] = var13;
        int var39 = var28 + 1;
        class104.field2209[var28] = var14;
        int var29;
        int var30 = var29 = class50.field1198[var13][var14];
        while (arg4 != var13 || arg11 != var14) {
            if (var29 != var30) {
                class191.field3802[var39] = var13;
                class104.field2209[var39++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class50.field1198[var13][var14];
        }
        int var31 = -44 % ((47 - arg1) / 54);
        if (var39 > 0) {
            int var32 = var39;
            if (var39 > 25) {
                var32 = 25;
            }
            var39--;
            int var33 = class104.field2209[var39];
            int var34 = class191.field3802[var39];
            if (arg9 == 0) {
                class152.field3040++;
                class159.field3190.method631(202, -1);
                class159.field3190.method1180(var32 + var32 + 3, (byte) 71);
            }
            if (arg9 == 1) {
                class117.field2433++;
                class159.field3190.method631(169, -1);
                class159.field3190.method1180(var32 + var32 + 14 + 3, (byte) 113);
            }
            if (arg9 == 2) {
                class159.field3190.method631(28, -1);
                class159.field3190.method1180(var32 + var32 + 3, (byte) 124);
                class167.field3336++;
            }
            class159.field3190.method1221(true, class94.field1989 + var33);
            class159.field3190.method1198(var34 + class155.field3099, -2053);
            class159.field3190.method1180(class110.field2340[82] ? 1 : 0, (byte) 112);
            class43.field915 = class104.field2209[0];
            class121.field2517 = class191.field3802[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class159.field3190.method1180(class191.field3802[var39] - var34, (byte) 94);
                class159.field3190.method1183(class104.field2209[var39] - var33, -1);
            }
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILfe;Lfe;I)V")
    public class186(int arg0, class51 arg1, class51 arg2, int arg3) {
        this.field3636 = arg0;
        this.field3638 = arg3;
        this.field3644 = arg1;
        this.field3645 = arg2;
    }
}
