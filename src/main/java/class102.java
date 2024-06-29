import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class102 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ll;")
    private class66 field2583 = null;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Ll;")
    private class66 field2588 = null;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    private int field2599 = 65000;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    private int field2594;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lhb;")
    public static class44 field2587 = method810("backleft2", -28606);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2590 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lhb;")
    public static class44 field2584 = method810("_", -28606);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lhb;")
    public static class44 field2595 = method810("Lade Titelbild )2 ", -28606);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lhb;")
    private static class44 field2596 = method810("scroll:", -28606);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field2602 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lhb;")
    private static class44 field2586 = method810("Select", -28606);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2606 = 0;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Lhb;")
    public static class44 field2604 = method810("Spiel)2Fenster geladen)3", -28606);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Lhb;")
    public static class44 field2610 = method810("Wen m-Ochten Sie hinzuf-Ugen?", -28606);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lhb;")
    public static class44 field2607 = field2586;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2603 = -1;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Lhb;")
    public static class44 field2609 = field2596;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Lhb;")
    private static class44 field2614 = method810("K", -28606);

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Lhb;")
    public static class44 field2613 = field2614;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Lhb;")
    public static class44 field2598 = field2614;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lqd;")
    public static class100 field2608;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Lpc;")
    public static class93 field2589;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[Lne;")
    public static class83[] field2601;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[B)I", line = 8)
    public static final int method804(byte arg0, int arg1, int arg2, byte[] arg3) {
        field2611++;
        int var4 = -1;
        if (arg0 != -23) {
            field2601 = null;
        }
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = class117.field2855[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILl;Ll;I)V", line = 474)
    public class102(int arg0, class66 arg1, class66 arg2, int arg3) {
        this.field2583 = arg1;
        this.field2599 = arg3;
        this.field2588 = arg2;
        this.field2594 = arg0;
    }

    @OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;", line = 64)
    public final String toString() {
        field2591++;
        return "Cache:" + this.field2594;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLmc;)V", line = 78)
    public static final void method805(byte arg0, class75 arg1) {
        class34.field837 = arg1;
        if (arg0 <= 14) {
            field2608 = null;
        }
        field2612++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 91)
    public static void method806(byte arg0) {
        field2601 = null;
        field2589 = null;
        field2614 = null;
        field2610 = null;
        field2604 = null;
        field2584 = null;
        field2598 = null;
        field2596 = null;
        field2609 = null;
        int var1 = -9 / ((arg0 + 59) / 49);
        field2608 = null;
        field2607 = null;
        field2587 = null;
        field2613 = null;
        field2595 = null;
        field2586 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[Lhb;I)Lhb;", line = 121)
    public static final class44 method807(int arg0, int arg1, class44[] arg2, int arg3) {
        field2600++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg2[arg1 + var5] == null) {
                arg2[arg1 + var5] = class107.field2708;
            }
            var4 += arg2[arg1 + var5].field1070;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = arg3; var8 < arg0; var8++) {
            class44 var10 = arg2[arg1 + var8];
            class115.method872(var10.field1074, 0, var7, var6, var10.field1070);
            var6 += var10.field1070;
        }
        class44 var9 = new class44();
        var9.field1070 = var4;
        var9.field1074 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI[BI)Z", line = 173)
    public final boolean method808(byte arg0, int arg1, byte[] arg2, int arg3) {
        field2597++;
        class66 var5 = this.field2583;
        synchronized (this.field2583) {
            if (arg3 < 0 || this.field2599 < arg3) {
                throw new IllegalArgumentException();
            }
            int var6 = -116 % ((arg0 - 64) / 58);
            boolean var7 = this.method811((byte) 95, arg3, true, arg2, arg1);
            if (!var7) {
                var7 = this.method811((byte) 95, arg3, false, arg2, arg1);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[B", line = 200)
    public final byte[] method809(int arg0, int arg1) {
        field2585++;
        class66 var3 = this.field2583;
        synchronized (this.field2583) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field2588.method584(721266200)) {
                    return null;
                }
                int var5 = -11 % ((4 - arg0) / 57);
                this.field2588.method581((long) (arg1 * 6), (byte) 125);
                this.field2588.method578(class94.field2395, 0, 0, 6);
                int var6 = (class94.field2395[2] & 0xFF) + ((class94.field2395[1] & 0xFF) << 8) + ((class94.field2395[0] & 0xFF) << 16);
                int var7 = (class94.field2395[5] & 0xFF) + ((class94.field2395[4] & 0xFF) << 8) + ((class94.field2395[3] & 0xFF) << 16);
                if (var6 < 0 || this.field2599 < var6) {
                    return null;
                } else if (var7 > 0 && this.field2583.method584(721266200) / 520L >= (long) var7) {
                    int var10 = 0;
                    int var11 = 0;
                    byte[] var12 = new byte[var6];
                    while (var6 > var10) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field2583.method581((long) (var7 * 520), (byte) 114);
                        int var14 = var6 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2583.method578(class94.field2395, 0, 0, var14 + 8);
                        int var15 = ((class94.field2395[0] & 0xFF) << 8) + (class94.field2395[1] & 0xFF);
                        int var16 = ((class94.field2395[2] & 0xFF) << 8) + (class94.field2395[3] & 0xFF);
                        int var17 = (class94.field2395[6] & 0xFF) + (((class94.field2395[4] & 0xFF) << 16) + ((class94.field2395[5] & 0xFF) << 8));
                        int var18 = class94.field2395[7] & 0xFF;
                        if (arg1 == var15 && var11 == var16 && this.field2594 == var18) {
                            if (var17 >= 0 && (long) var17 <= this.field2583.method584(721266200) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var12[var10++] = class94.field2395[var21 + 8];
                                }
                                var7 = var17;
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var12;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;I)Lhb;", line = 281)
    public static final class44 method810(String arg0, int arg1) {
        field2605++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class44 var4 = new class44();
        if (arg1 != -28606) {
            field2607 = null;
        }
        var4.field1074 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1074[var4.field1070++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field1074[var4.field1070++] = (byte) var6;
            }
        }
        var4.method379(127);
        return var4.method394((byte) -121);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ[BI)Z", line = 334)
    private final boolean method811(byte arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field2593++;
        class66 var6 = this.field2583;
        synchronized (this.field2583) {
            try {
                if (arg0 != 95) {
                    this.field2599 = -110;
                }
                int var8;
                if (arg2) {
                    if (this.field2588.method584(721266200) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field2588.method581((long) (arg4 * 6), (byte) 96);
                    this.field2588.method578(class94.field2395, 0, arg0 - 95, 6);
                    var8 = ((class94.field2395[4] & 0xFF) << 8) + ((class94.field2395[3] << 16 & 0xFF0000) + (class94.field2395[5] & 0xFF));
                    if (var8 <= 0 || this.field2583.method584(arg0 + 721266105) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field2583.method584(721266200) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class94.field2395[0] = (byte) (arg1 >> 16);
                int var10 = 0;
                class94.field2395[1] = (byte) (arg1 >> 8);
                class94.field2395[2] = (byte) arg1;
                class94.field2395[3] = (byte) (var8 >> 16);
                class94.field2395[4] = (byte) (var8 >> 8);
                class94.field2395[5] = (byte) var8;
                int var11 = 0;
                this.field2588.method581((long) (arg4 * 6), (byte) 99);
                this.field2588.method586(0, 6, class94.field2395, -1);
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field2583.method581((long) (var8 * 520), (byte) 108);
                            try {
                                this.field2583.method578(class94.field2395, 0, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class94.field2395[6] & 0xFF) + ((class94.field2395[4] & 0xFF) << 16) + ((class94.field2395[5] & 0xFF) << 8);
                            int var13 = ((class94.field2395[2] & 0xFF) << 8) + (class94.field2395[3] & 0xFF);
                            int var14 = ((class94.field2395[0] & 0xFF) << 8) + (class94.field2395[1] & 0xFF);
                            int var15 = class94.field2395[7] & 0xFF;
                            if (arg4 == var14 && var11 == var13 && this.field2594 == var15) {
                                if (var12 >= 0 && this.field2583.method584(721266200) / 520L >= (long) var12) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field2583.method584(721266200) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class94.field2395[0] = (byte) (arg4 >> 8);
                    class94.field2395[1] = (byte) arg4;
                    class94.field2395[2] = (byte) (var11 >> 8);
                    class94.field2395[3] = (byte) var11;
                    var11++;
                    class94.field2395[4] = (byte) (var12 >> 16);
                    class94.field2395[5] = (byte) (var12 >> 8);
                    class94.field2395[6] = (byte) var12;
                    class94.field2395[7] = (byte) this.field2594;
                    this.field2583.method581((long) (var8 * 520), (byte) 110);
                    var8 = var12;
                    this.field2583.method586(0, 8, class94.field2395, -1);
                    this.field2583.method586(var10, var18, arg3, -1);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }
}
