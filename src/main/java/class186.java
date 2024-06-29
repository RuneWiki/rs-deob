import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class186 {

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
    private int field2952 = 65000;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "Lcka;")
    private class183 field2959 = null;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "Lcka;")
    private class183 field2962 = null;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    private int field2961;

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2965 = new String[] { method1751(method1750("t!c\tK8")), method1751(method1750("t!c\tH8")), method1751(method1750("~7nK")), method1751(method1750("kl,\tw")), method1751(method1750("t!c\tN8")), method1751(method1750("t!c\tO8")), method1751(method1750("t!c\tM8")), method1751(method1750("t!c\tI8")), method1751(method1750("t!c\tL8")), method1751(method1750("t!c\t~\u007f\u0011vUc~%*")), method1751(method1750("S#aOo*")), method1751(method1750("t!c\t6y,kS48")) };

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "Lega;")
    public static class742 field2964 = new class742();

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "[I")
    public static int[] field2963;

    @OriginalMember(owner = "client!dca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field2957++;
            return field2965[10] + this.field2961;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2965[9] + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)I")
    public static final int method1743(int arg0, boolean arg1) {
        try {
            field2960++;
            int var2 = class184.field2931;
            if (var2 == 0) {
                return arg1 ? 0 : class633.field9093;
            } else if (var2 == 1) {
                return class633.field9093;
            } else if (var2 == 2) {
                return 0;
            } else {
                if (arg0 <= 57) {
                    field2963 = null;
                }
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2965[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method1744(byte arg0) {
        try {
            field2963 = null;
            field2964 = null;
            int var1 = 67 / ((arg0 + 83) / 43);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2965[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1745(byte arg0, String arg1) {
        try {
            field2955++;
            if (arg1 != null) {
                if ((class198.field3145 < 200 || class229.field3564) && class198.field3145 < 200) {
                    int var2 = -28 % ((arg0 - 43) / 59);
                    String var3 = class788.method5662((byte) 102, arg1);
                    if (var3 != null) {
                        for (int var4 = 0; var4 < class198.field3145; var4++) {
                            String var5 = class788.method5662((byte) 103, class129.field1846[var4]);
                            if (var5 != null && var5.equals(var3)) {
                                class596.method4365(4, arg1 + class709.field10240.method5154(class795.field11624, (byte) 65), 0);
                                return;
                            }
                            if (class449.field6963[var4] != null) {
                                String var6 = class788.method5662((byte) 126, class449.field6963[var4]);
                                if (var6 != null && var6.equals(var3)) {
                                    class596.method4365(4, arg1 + class709.field10240.method5154(class795.field11624, (byte) 65), 0);
                                    return;
                                }
                            }
                        }
                        for (int var7 = 0; var7 < class223.field3504; var7++) {
                            String var8 = class788.method5662((byte) 125, class140.field1959[var7]);
                            if (var8 != null && var8.equals(var3)) {
                                class596.method4365(4, class709.field10245.method5154(class795.field11624, (byte) 65) + arg1 + class709.field10246.method5154(class795.field11624, (byte) 65), 0);
                                return;
                            }
                            if (class794.field11607[var7] != null) {
                                String var9 = class788.method5662((byte) 126, class794.field11607[var7]);
                                if (var9 != null && var9.equals(var3)) {
                                    class596.method4365(4, class709.field10245.method5154(class795.field11624, (byte) 65) + arg1 + class709.field10246.method5154(class795.field11624, (byte) 65), 0);
                                    return;
                                }
                            }
                        }
                        if (class788.method5662((byte) 125, class438.field6846.field10821).equals(var3)) {
                            class596.method4365(4, class709.field10243.method5154(class795.field11624, (byte) 65), 0);
                        } else {
                            class247.field3812++;
                            class164 var10 = class193.method1785(false);
                            class487 var11 = class618.method4519(67, class150.field2095, var10.field2659);
                            var11.field7362.method1678(class126.method1216(117, arg1), 65280);
                            var11.field7362.method1681(arg1, 23137);
                            var10.method1546(var11, 1);
                        }
                    }
                } else {
                    class596.method4365(4, class709.field10213.method5154(class795.field11624, (byte) 65), 0);
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field2965[6] + arg0 + ',' + (arg1 == null ? field2965[2] : field2965[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(III[B)Z")
    public final boolean method1746(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            field2958++;
            class183 var5 = this.field2962;
            synchronized (this.field2962) {
                if (arg2 < 0 || arg2 > this.field2952) {
                    throw new IllegalArgumentException();
                }
                boolean var6 = this.method1748(arg2, true, (byte) 66, arg0, arg3);
                if (arg1 != 730) {
                    method1749(true, 63L);
                }
                if (!var6) {
                    var6 = this.method1748(arg2, false, (byte) 66, arg0, arg3);
                }
                return var6;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field2965[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2965[2] : field2965[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IB)[B")
    public final byte[] method1747(int arg0, byte arg1) {
        try {
            field2956++;
            if (arg1 < 113) {
                method1744((byte) -52);
            }
            class183 var3 = this.field2962;
            synchronized (this.field2962) {
                try {
                    if (((long) (arg0 * 6 + 6)) > this.field2959.method1723(-1)) {
                        return null;
                    }
                    this.field2959.method1724(8259, (long) (arg0 * 6));
                    this.field2959.method1726(class154.field2145, -11018, 0, 6);
                    int var5 = (class154.field2145[0] & 0xFF << 16) - (-((class154.field2145[1] & 0xFF) << 8) - (class154.field2145[2] & 0xFF));
                    int var6 = (class154.field2145[3] & 0xFF << 16) - (-((class154.field2145[4] & 0xFF) << 8) - (class154.field2145[5] & 0xFF));
                    if (var5 < 0 || var5 > this.field2952) {
                        return null;
                    } else if (var6 > 0 && (long) var6 <= this.field2962.method1723(-1) / 520L) {
                        byte[] var9 = new byte[var5];
                        int var10 = 0;
                        int var11 = 0;
                        while (var5 > var10) {
                            if (var6 == 0) {
                                return null;
                            }
                            this.field2962.method1724(8259, (long) (var6 * 520));
                            int var13 = var5 - var10;
                            if (var13 > 512) {
                                var13 = 512;
                            }
                            this.field2962.method1726(class154.field2145, -11018, 0, var13 + 8);
                            int var14 = ((class154.field2145[0] & 0xFF) << 8) + (class154.field2145[1] & 0xFF);
                            int var15 = (class154.field2145[2] & 0xFF << 8) + (class154.field2145[3] & 0xFF);
                            int var16 = ((class154.field2145[5] & 0xFF) << 8) + ((class154.field2145[4] & 0xFF << 16) + (class154.field2145[6] & 0xFF));
                            int var17 = class154.field2145[7] & 0xFF;
                            if (arg0 == var14 && var11 == var15 && this.field2961 == var17) {
                                if (var16 >= 0 && (long) var16 <= this.field2962.method1723(-1) / 520L) {
                                    for (int var20 = 0; var20 < var13; var20++) {
                                        var9[var10++] = class154.field2145[var20 + 8];
                                    }
                                    var11++;
                                    var6 = var16;
                                    continue;
                                }
                                return null;
                            }
                            return null;
                        }
                        return var9;
                    } else {
                        return null;
                    }
                } catch (IOException var40) {
                    return null;
                }
            }
        } catch (RuntimeException var42) {
            throw class590.method4333(var42, field2965[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZBI[B)Z")
    private final boolean method1748(int arg0, boolean arg1, byte arg2, int arg3, byte[] arg4) {
        try {
            field2954++;
            class183 var6 = this.field2962;
            synchronized (this.field2962) {
                try {
                    int var7;
                    if (arg1) {
                        if ((long) (arg3 * 6 + 6) > this.field2959.method1723(-1)) {
                            return false;
                        }
                        this.field2959.method1724(8259, (long) (arg3 * 6));
                        this.field2959.method1726(class154.field2145, -11018, 0, 6);
                        var7 = ((class154.field2145[4] & 0xFF) << 8) + ((class154.field2145[3] & 0xFF << 16) + (class154.field2145[5] & 0xFF));
                        if (var7 <= 0 || ((long) var7) > (this.field2962.method1723(-1) / 520L)) {
                            return false;
                        }
                    } else {
                        var7 = (int) ((this.field2962.method1723(arg2 ^ 0xFFFFFFBD) + 519L) / 520L);
                        if (var7 == 0) {
                            var7 = 1;
                        }
                    }
                    class154.field2145[5] = (byte) var7;
                    class154.field2145[2] = (byte) arg0;
                    class154.field2145[4] = (byte) (var7 >> 8);
                    class154.field2145[1] = (byte) (arg0 >> 8);
                    class154.field2145[3] = (byte) (var7 >> 16);
                    class154.field2145[0] = (byte) (arg0 >> 16);
                    this.field2959.method1724(arg2 ^ 0x2001, (long) (arg3 * 6));
                    this.field2959.method1725(0, -11999, 6, class154.field2145);
                    int var10 = 0;
                    if (arg2 != 66) {
                        return false;
                    }
                    int var12 = 0;
                    while (var10 < arg0) {
                        int var13 = 0;
                        if (arg1) {
                            label128: {
                                this.field2962.method1724(8259, (long) (var7 * 520));
                                try {
                                    this.field2962.method1726(class154.field2145, -11018, 0, 8);
                                } catch (EOFException var37) {
                                    return true;
                                }
                                int var14 = (class154.field2145[0] & 0xFF << 8) + (class154.field2145[1] & 0xFF);
                                var13 = ((class154.field2145[4] & 0xFF) << 16) + ((class154.field2145[5] & 0xFF << 8) + (class154.field2145[6] & 0xFF));
                                int var15 = (class154.field2145[2] & 0xFF << 8) + (class154.field2145[3] & 0xFF);
                                int var16 = class154.field2145[7] & 0xFF;
                                if (arg3 == var14 && var12 == var15 && this.field2961 == var16) {
                                    if (var13 >= 0 && (this.field2962.method1723(-1) / 520L) >= ((long) var13)) {
                                        break label128;
                                    }
                                    return false;
                                }
                                return false;
                            }
                        }
                        if (var13 == 0) {
                            var13 = (int) ((this.field2962.method1723(-1) + 519L) / 520L);
                            arg1 = false;
                            if (var13 == 0) {
                                var13++;
                            }
                            if (var7 == var13) {
                                var13++;
                            }
                        }
                        class154.field2145[2] = (byte) (var12 >> 8);
                        class154.field2145[3] = (byte) var12;
                        class154.field2145[1] = (byte) arg3;
                        if ((arg0 - var10) <= 512) {
                            var13 = 0;
                        }
                        class154.field2145[0] = (byte) (arg3 >> 8);
                        class154.field2145[5] = (byte) (var13 >> 8);
                        class154.field2145[6] = (byte) var13;
                        class154.field2145[7] = (byte) this.field2961;
                        class154.field2145[4] = (byte) (var13 >> 16);
                        this.field2962.method1724(8259, (long) (var7 * 520));
                        this.field2962.method1725(0, -11999, 8, class154.field2145);
                        int var19 = arg0 - var10;
                        if (var19 > 512) {
                            var19 = 512;
                        }
                        this.field2962.method1725(var10, arg2 ^ 0xFFFFD163, var19, arg4);
                        var10 += var19;
                        var7 = var13;
                        var12++;
                    }
                    return true;
                } catch (IOException var38) {
                    return false;
                }
            }
        } catch (RuntimeException var40) {
            throw class590.method4333(var40, field2965[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field2965[2] : field2965[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZJ)V")
    public static final void method1749(boolean arg0, long arg1) {
        try {
            field2953++;
            int var3 = class438.field6844 + class438.field6846.field9985;
            int var4 = class159.field2334 + class438.field6846.field9983;
            if (class524.field7735 - var3 < -2000 || (class524.field7735 - var3) > 2000 || class147.field2059 - var4 < -2000 || class147.field2059 - var4 > 2000) {
                class524.field7735 = var3;
                class147.field2059 = var4;
            }
            if (class524.field7735 != var3) {
                int var5 = var3 - class524.field7735;
                int var6 = (int) ((long) var5 * arg1 / 320L);
                if (var5 <= 0) {
                    if (var6 == 0) {
                        var6 = -1;
                    } else if (var6 < var5) {
                        var6 = var5;
                    }
                } else if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
                class524.field7735 += var6;
            }
            if (arg0) {
                method1744((byte) 61);
            }
            class29.field293 += (float) arg1 * class636.field9130 / 6.0F;
            if (class147.field2059 != var4) {
                int var7 = var4 - class147.field2059;
                int var8 = (int) ((long) var7 * arg1 / 320L);
                if (var7 > 0) {
                    if (var8 == 0) {
                        var8 = 1;
                    } else if (var8 > var7) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
                class147.field2059 += var8;
            }
            class418.field6612 += (float) arg1 * class260.field3920 / 6.0F;
            class610.method4447(-18418);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field2965[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(ILcka;Lcka;I)V")
    public class186(int arg0, class183 arg1, class183 arg2, int arg3) {
        try {
            this.field2952 = arg3;
            this.field2959 = arg2;
            this.field2961 = arg0;
            this.field2962 = arg1;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field2965[11] + arg0 + ',' + (arg1 == null ? field2965[2] : field2965[3]) + ',' + (arg2 == null ? field2965[2] : field2965[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1750(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1751(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
