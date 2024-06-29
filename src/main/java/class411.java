import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class411 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lika;")
    private class447 field6069 = null;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    private int field6066 = 65000;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Lika;")
    private class447 field6077 = null;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    private int field6065;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6078 = new String[] { method3205(method3204("4(i$'")), method3205(method3204("!s+f")), method3205(method3204("#viHr")), method3205(method3204("#viKr")), method3205(method3204("#viIr")), method3205(method3204("#vi63!o34r")), method3205(method3204("#viNr")), method3205(method3204("#vi~5\u001cr5c4(.")), method3205(method3204("\fg$b?u")) };

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Lel;")
    public static class573 field6068 = new class573(65, 4);

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field6076 = 4;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "Lkba;")
    public static class115 field6071 = new class115(8);

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Lla;")
    public static class476 field6075;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "([BIII)Z", line = 5)
    public final boolean method3200(byte[] arg0, int arg1, int arg2, int arg3) {
        try {
            field6073++;
            class447 var5 = this.field6077;
            synchronized (this.field6077) {
                if (arg3 < 0 || arg3 > this.field6066) {
                    throw new IllegalArgumentException();
                }
                if (arg2 != -17144) {
                    field6076 = 73;
                }
                boolean var6 = this.method3203((byte) -54, arg0, arg1, true, arg3);
                if (!var6) {
                    var6 = this.method3203((byte) -102, arg0, arg1, false, arg3);
                }
                return var6;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6078[2] + (arg0 == null ? field6078[1] : field6078[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 37)
    public static void method3201(byte arg0) {
        try {
            field6071 = null;
            field6075 = null;
            field6068 = null;
            if (arg0 <= 106) {
                field6076 = -34;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6078[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(ILika;Lika;I)V", line = 287)
    public class411(int arg0, class447 arg1, class447 arg2, int arg3) {
        try {
            this.field6066 = arg3;
            this.field6077 = arg1;
            this.field6065 = arg0;
            this.field6069 = arg2;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6078[5] + arg0 + ',' + (arg1 == null ? field6078[1] : field6078[0]) + ',' + (arg2 == null ? field6078[1] : field6078[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[B", line = 53)
    public final byte[] method3202(int arg0, int arg1) {
        try {
            field6074++;
            class447 var3 = this.field6077;
            synchronized (this.field6077) {
                try {
                    if (((long) (arg1 * 6 + 6)) > this.field6069.method3442((byte) 106)) {
                        return null;
                    }
                    this.field6069.method3438((long) (arg0 * arg1), (byte) 88);
                    this.field6069.method3443(0, 6, 113, class553.field8242);
                    int var5 = (class553.field8242[1] & 0xFF << 8) + (class553.field8242[0] & 0xFF << 16) + (class553.field8242[2] & 0xFF);
                    int var6 = (class553.field8242[3] & 0xFF << 16) + ((class553.field8242[4] & 0xFF) << 8) + (class553.field8242[5] & 0xFF);
                    if (var5 < 0 || var5 > this.field6066) {
                        return null;
                    } else if (var6 > 0 && ((long) var6) <= (this.field6077.method3442((byte) -14) / 520L)) {
                        byte[] var9 = new byte[var5];
                        int var10 = 0;
                        int var11 = 0;
                        while (var5 > var10) {
                            if (var6 == 0) {
                                return null;
                            }
                            this.field6077.method3438((long) (var6 * 520), (byte) 123);
                            int var13 = var5 - var10;
                            if (var13 > 512) {
                                var13 = 512;
                            }
                            this.field6077.method3443(0, var13 + 8, 108, class553.field8242);
                            int var14 = (class553.field8242[0] & 0xFF << 8) + (class553.field8242[1] & 0xFF);
                            int var15 = ((class553.field8242[2] & 0xFF) << 8) + (class553.field8242[3] & 0xFF);
                            int var16 = (class553.field8242[4] & 0xFF << 16) + ((class553.field8242[5] & 0xFF << 8) + (class553.field8242[6] & 0xFF));
                            int var17 = class553.field8242[7] & 0xFF;
                            if (arg1 == var14 && var11 == var15 && this.field6065 == var17) {
                                if (var16 >= 0 && this.field6077.method3442((byte) -48) / 520L >= (long) var16) {
                                    var11++;
                                    for (int var20 = 0; var20 < var13; var20++) {
                                        var9[var10++] = class553.field8242[var20 + 8];
                                    }
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
            throw class759.method5498(var42, field6078[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B[BIZI)Z", line = 132)
    private final boolean method3203(byte arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        try {
            field6072++;
            class447 var6 = this.field6077;
            synchronized (this.field6077) {
                try {
                    int var8;
                    if (arg3) {
                        if (this.field6069.method3442((byte) 98) < ((long) (arg2 * 6 + 6))) {
                            return false;
                        }
                        this.field6069.method3438((long) (arg2 * 6), (byte) 54);
                        this.field6069.method3443(0, 6, 57, class553.field8242);
                        var8 = ((class553.field8242[3] & 0xFF) << 16) + (class553.field8242[4] & 0xFF << 8) + (class553.field8242[5] & 0xFF);
                        if (var8 <= 0 || ((long) var8) > (this.field6077.method3442((byte) -116) / 520L)) {
                            return false;
                        }
                    } else {
                        var8 = (int) ((this.field6077.method3442((byte) 117) + 519L) / 520L);
                        if (var8 == 0) {
                            var8 = 1;
                        }
                    }
                    class553.field8242[1] = (byte) (arg4 >> 8);
                    class553.field8242[4] = (byte) (var8 >> 8);
                    class553.field8242[5] = (byte) var8;
                    class553.field8242[0] = (byte) (arg4 >> 16);
                    class553.field8242[3] = (byte) (var8 >> 16);
                    class553.field8242[2] = (byte) arg4;
                    this.field6069.method3438((long) (arg2 * 6), (byte) 100);
                    if (arg0 >= -35) {
                        this.field6065 = 26;
                    }
                    this.field6069.method3440(0, (byte) 45, class553.field8242, 6);
                    int var10 = 0;
                    int var11 = 0;
                    while (arg4 > var10) {
                        int var12 = 0;
                        if (arg3) {
                            this.field6077.method3438((long) (var8 * 520), (byte) 47);
                            try {
                                this.field6077.method3443(0, 8, 72, class553.field8242);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var13 = (class553.field8242[0] & 0xFF << 8) + (class553.field8242[1] & 0xFF);
                            int var14 = (class553.field8242[2] & 0xFF << 8) + (class553.field8242[3] & 0xFF);
                            var12 = ((class553.field8242[5] & 0xFF) << 8) + (class553.field8242[4] & 0xFF << 16) + (class553.field8242[6] & 0xFF);
                            int var15 = class553.field8242[7] & 0xFF;
                            if (arg2 != var13 || var11 != var14 || this.field6065 != var15) {
                                return false;
                            }
                            if (var12 < 0 || ((long) var12) > (this.field6077.method3442((byte) -87) / 520L)) {
                                return false;
                            }
                        }
                        if (var12 == 0) {
                            arg3 = false;
                            var12 = (int) ((this.field6077.method3442((byte) -70) + 519L) / 520L);
                            if (var12 == 0) {
                                var12++;
                            }
                            if (var8 == var12) {
                                var12++;
                            }
                        }
                        class553.field8242[3] = (byte) var11;
                        if (arg4 - var10 <= 512) {
                            var12 = 0;
                        }
                        class553.field8242[1] = (byte) arg2;
                        class553.field8242[2] = (byte) (var11 >> 8);
                        class553.field8242[0] = (byte) (arg2 >> 8);
                        class553.field8242[7] = (byte) this.field6065;
                        class553.field8242[5] = (byte) (var12 >> 8);
                        class553.field8242[4] = (byte) (var12 >> 16);
                        class553.field8242[6] = (byte) var12;
                        this.field6077.method3438((long) (var8 * 520), (byte) 55);
                        this.field6077.method3440(0, (byte) -82, class553.field8242, 8);
                        int var18 = arg4 - var10;
                        if (var18 > 512) {
                            var18 = 512;
                        }
                        this.field6077.method3440(var10, (byte) 126, arg1, var18);
                        var11++;
                        var8 = var12;
                        var10 += var18;
                    }
                    return true;
                } catch (IOException var35) {
                    return false;
                }
            }
        } catch (RuntimeException var37) {
            throw class759.method5498(var37, field6078[4] + arg0 + ',' + (arg1 == null ? field6078[1] : field6078[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!lp", name = "toString", descriptor = "()Ljava/lang/String;", line = 270)
    public final String toString() {
        try {
            field6067++;
            return field6078[8] + this.field6065;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6078[7] + ')');
        }
    }

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3204(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3205(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
