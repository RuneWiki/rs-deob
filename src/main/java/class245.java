import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class245 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field4039 = 65000;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lbn;")
    private class62 field4041 = null;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lbn;")
    private class62 field4047 = null;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    private int field4042;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lhd;")
    public static class117 field4052 = new class117(64);

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lok;")
    public static class146 field4055 = class235.method1724(-12908, " ");

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
    public static int[] field4054;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[S")
    public static short[] field4045;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "[S")
    public static short[] field4048;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 5)
    public static final void method1771(Throwable arg0, String arg1, int arg2) {
        field4043++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class142.method1048(69, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class70.method518((byte) 126, var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class7.field149.field2162 == null) {
                return;
            }
            class256 var8 = class7.field149.method927(arg2 ^ arg2, new URL(class7.field149.field2162.getCodeBase(), "clienterror.ws?c=" + class96.field1563 + "&u=" + class116.field1862 + "&v1=" + class129.field2156 + "&v2=" + class129.field2153 + "&e=" + var7));
            while (var8.field4265 == 0) {
                class281.method2041((byte) 95, 1L);
            }
            if (var8.field4265 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field4269;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)I", line = 55)
    public static final int method1772(byte arg0, int arg1) {
        field4044++;
        if (arg0 != 124) {
            field4048 = (short[]) null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 72)
    public static void method1773(byte arg0) {
        field4048 = null;
        int var1 = -108 / ((58 - arg0) / 56);
        field4045 = null;
        field4052 = null;
        field4054 = null;
        field4055 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(ILbn;Lbn;I)V", line = 459)
    public class245(int arg0, class62 arg1, class62 arg2, int arg3) {
        this.field4047 = arg2;
        this.field4041 = arg1;
        this.field4039 = arg3;
        this.field4042 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZII[BB)Z", line = 92)
    private final boolean method1774(boolean arg0, int arg1, int arg2, byte[] arg3, byte arg4) {
        field4040++;
        class62 var6 = this.field4041;
        synchronized (this.field4041) {
            try {
                int var7;
                boolean var10000;
                if (arg0) {
                    if ((long) (arg1 * 6 + 6) > this.field4047.method481(-1)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field4047.method477(11955, (long) (arg1 * 6));
                    this.field4047.method483((byte) -68, 6, 0, class309.field5263);
                    var7 = (class309.field5263[3] & 0xFF << 16) + (class309.field5263[5] & 0xFF) + (class309.field5263[4] & 0xFF << 8);
                    if (var7 <= 0 || this.field4041.method481(-1) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4041.method481(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class309.field5263[4] = (byte) (var7 >> 8);
                class309.field5263[1] = (byte) (arg2 >> 8);
                class309.field5263[2] = (byte) arg2;
                class309.field5263[5] = (byte) var7;
                class309.field5263[0] = (byte) (arg2 >> 16);
                int var8 = 0;
                int var9 = -73 % ((arg4 - 12) / 52);
                int var10 = 0;
                class309.field5263[3] = (byte) (var7 >> 16);
                this.field4047.method477(11955, (long) (arg1 * 6));
                this.field4047.method475(class309.field5263, 6, 0, true);
                while (true) {
                    if (var8 < arg2) {
                        label132: {
                            int var11 = 0;
                            if (arg0) {
                                label151: {
                                    this.field4041.method477(11955, (long) (var7 * 520));
                                    try {
                                        this.field4041.method483((byte) -45, 8, 0, class309.field5263);
                                    } catch (EOFException var19) {
                                        break label132;
                                    }
                                    var11 = (class309.field5263[6] & 0xFF) + ((class309.field5263[4] & 0xFF) << 16) + (class309.field5263[5] & 0xFF << 8);
                                    int var13 = ((class309.field5263[2] & 0xFF) << 8) + (class309.field5263[3] & 0xFF);
                                    int var14 = (class309.field5263[0] & 0xFF << 8) + (class309.field5263[1] & 0xFF);
                                    int var15 = class309.field5263[7] & 0xFF;
                                    if (arg1 == var14 && var10 == var13 && this.field4042 == var15) {
                                        if (var11 >= 0 && ((long) var11) <= (this.field4041.method481(-1) / 520L)) {
                                            break label151;
                                        }
                                        var10000 = false;
                                        return var10000;
                                    }
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var11 == 0) {
                                var11 = (int) ((this.field4041.method481(-1) + 519L) / 520L);
                                arg0 = false;
                                if (var11 == 0) {
                                    var11++;
                                }
                                if (var7 == var11) {
                                    var11++;
                                }
                            }
                            class309.field5263[3] = (byte) var10;
                            class309.field5263[2] = (byte) (var10 >> 8);
                            if ((arg2 - var8) <= 512) {
                                var11 = 0;
                            }
                            class309.field5263[4] = (byte) (var11 >> 16);
                            class309.field5263[6] = (byte) var11;
                            class309.field5263[0] = (byte) (arg1 >> 8);
                            int var16 = arg2 - var8;
                            class309.field5263[1] = (byte) arg1;
                            class309.field5263[5] = (byte) (var11 >> 8);
                            if (var16 > 512) {
                                var16 = 512;
                            }
                            var10++;
                            class309.field5263[7] = (byte) this.field4042;
                            this.field4041.method477(11955, (long) (var7 * 520));
                            var7 = var11;
                            this.field4041.method475(class309.field5263, 8, 0, true);
                            this.field4041.method475(arg3, var16, var8, true);
                            var8 += var16;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 223)
    public static final void method1775(byte arg0) {
        field4051++;
        int var1 = class248.field4121.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class248.field4121[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class258.field4280; var4++) {
                    if (class94.field1517[var4] == class177.field3002[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class94.field1517[class258.field4280] = class177.field3002[var2];
                    var3 = class258.field4280++;
                }
                int var5 = 0;
                class47 var6 = new class47(class248.field4121[var2]);
                while (class248.field4121[var2].length > var6.field857 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method379(-2);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (var8 & 0x1FC2) >> 7;
                    int var12 = (class177.field3002[var2] & 0xFF) * 64 + var9 - class201.field3357;
                    int var13 = (class177.field3002[var2] >> 8) * 64 + var11 - class15.field300;
                    class301 var14 = class218.method1610(var6.method379(-2), (byte) -33);
                    if (class173.field2906[var7] == null && (var14.field5121 & 0x1) > 0 && class201.field3358 == var10 && var13 >= 0 && var14.field5150 + var13 < 104 && var12 >= 0 && (var14.field5150 + var12) < 104) {
                        class173.field2906[var7] = new class282();
                        class282 var15 = class173.field2906[var7];
                        class210.field3476[class151.field2574++] = var7;
                        var15.field5440 = class203.field3385;
                        var15.method2044(var14, (byte) 108);
                        var15.method2216(var15.field4838.field5150, -126);
                        var15.field5421 = var15.field5406 = class303.field5197[var15.field4838.field5109];
                        var15.field5433 = var15.field4838.field5108;
                        var15.field5398 = var15.field4838.field5105;
                        var15.field5418 = var15.field4838.field5139;
                        var15.field5384 = var15.field4838.field5104;
                        var15.field5381 = var15.field4838.field5107;
                        var15.field5372 = var15.field4838.field5118;
                        if (var15.field5418 == 0) {
                            var15.field5406 = 0;
                        }
                        var15.field5389 = var15.field4838.field5097;
                        var15.field5370 = var15.field4838.field5132;
                        var15.method2215(var13, (byte) -118, var15.method1717(0), true, var12);
                    }
                }
            }
        }
        if (arg0 >= -22) {
            field4045 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "toString", descriptor = "()Ljava/lang/String;", line = 320)
    public final String toString() {
        field4049++;
        return "Cache:" + this.field4042;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BII)Z", line = 340)
    public final boolean method1776(int arg0, byte[] arg1, int arg2, int arg3) {
        field4050++;
        class62 var5 = this.field4041;
        synchronized (this.field4041) {
            if (arg3 < ~arg2 || arg2 > this.field4039) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1774(true, arg0, arg2, arg1, (byte) 107);
            if (!var6) {
                var6 = this.method1774(false, arg0, arg2, arg1, (byte) 68);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(BI)[B", line = 367)
    public final byte[] method1777(byte arg0, int arg1) {
        field4046++;
        class62 var3 = this.field4041;
        synchronized (this.field4041) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field4047.method481(-1)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field4047.method477(11955, (long) (arg1 * 6));
                this.field4047.method483((byte) -95, 6, 0, class309.field5263);
                int var4 = (class309.field5263[2] & 0xFF) + ((class309.field5263[1] & 0xFF) << 8) + (class309.field5263[0] & 0xFF << 16);
                int var5 = (class309.field5263[5] & 0xFF) + (class309.field5263[4] & 0xFF << 8) + (class309.field5263[3] & 0xFF << 16);
                if (var4 < 0 || var4 > this.field4039) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || (long) var5 > this.field4041.method481(-1) / 520L) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var6 = 0;
                    int var7 = 0;
                    byte[] var8 = new byte[var4];
                    while (var4 > var6) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var6;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field4041.method477(11955, (long) (var5 * 520));
                        this.field4041.method483((byte) -124, var9 + 8, 0, class309.field5263);
                        int var10 = (class309.field5263[0] & 0xFF << 8) + (class309.field5263[1] & 0xFF);
                        int var11 = ((class309.field5263[5] & 0xFF) << 8) + (class309.field5263[4] & 0xFF << 16) + (class309.field5263[6] & 0xFF);
                        int var12 = ((class309.field5263[2] & 0xFF) << 8) + (class309.field5263[3] & 0xFF);
                        int var13 = class309.field5263[7] & 0xFF;
                        if (arg1 != var10 || var7 != var12 || this.field4042 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (this.field4041.method481(-1) / 520L) < ((long) var11)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var5 = var11;
                        var7++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var8[var6++] = class309.field5263[var14 + 8];
                        }
                    }
                    if (arg0 >= -23) {
                        field4048 = (short[]) null;
                    }
                    byte[] var19 = var8;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }
}
