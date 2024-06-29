import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class406 extends class73 {

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    private int field5909;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    private int field5897;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    private int field5900;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    private int field5906;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "[[I")
    public static int[][] field5908;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[[I")
    public static int[][] field5898;

    static {
        new class332("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field5908 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IJBI)V", line = 6)
    public static final void method2432(int arg0, long arg1, byte arg2, int arg3) {
        ++field5902;
        int var5 = (int) arg1 >> 14 & 31;
        int var6 = (int) arg1 >> 20 & 3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && ~var5 != -12 && ~var5 != -23) {
            class433.method2534(arg3, (byte) -125, 0, 0, arg0, 0, var5, var6, true);
        } else {
            class271 var8 = class206.field3124.method338((byte) 123, var7);
            int var9;
            int var10;
            if (~var6 != -1 && var6 != 2) {
                var9 = var8.field4014;
                var10 = var8.field4048;
            } else {
                var10 = var8.field4014;
                var9 = var8.field4048;
            }
            int var11 = var8.field4057;
            if (~var6 != -1) {
                var11 = (var11 >> 4 - var6) + (15 & var11 << var6);
            }
            class433.method2534(arg3, (byte) 31, var10, var9, arg0, var11, 0, 0, true);
        }
        if (arg2 != 19) {
            field5908 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V", line = 50)
    public static final void method2433(byte arg0) {
        ++field5899;
        int[] var1 = new int[class23.field309.field5781];
        if (arg0 > -100) {
            field5908 = null;
        }
        int var2 = 0;
        for (int var3 = 0; ~var3 > ~class23.field309.field5781; ++var3) {
            class184 var5 = class23.field309.method2364((byte) 118, var3);
            if (var5.field2760 >= 0 || ~var5.field2786 <= -1) {
                var1[var2++] = var3;
            }
        }
        class370.field5578 = new int[var2];
        for (int var4 = 0; var2 > var4; ++var4) {
            class370.field5578[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V", line = 86)
    public static void method2434(boolean arg0) {
        field5908 = null;
        if (!arg0) {
            method2432(-25, -41L, (byte) -120, -121);
        }
        field5898 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V", line = 101)
    public final void method627(int arg0, int arg1, int arg2) {
        ++field5904;
        int var4 = this.field5897 * arg1 >> 12;
        int var5 = this.field5900 * arg1 >> 12;
        int var6 = this.field5906 * arg2 >> 12;
        int var7 = this.field5909 * arg2 >> 12;
        class334.method2048((byte) -40, var7, var4, var5, var6, super.field988);
        if (arg0 != -16) {
            this.field5906 = 12;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)V", line = 122)
    public final void method630(byte arg0, int arg1, int arg2) {
        if (arg0 > 39) {
            ++field5905;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V", line = 132)
    public final void method632(int arg0, int arg1, int arg2) {
        ++field5903;
        if (arg0 != 5263) {
            method2432(80, -38L, (byte) 112, -47);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I", line = 150)
    public static final int method2435(int arg0) {
        int var1 = -119 / ((31 - arg0) / 59);
        ++field5910;
        try {
            if (~class140.field2006 == -1) {
                if (class162.field2248 > -5000L + class435.method2539(-10659)) {
                    return 0;
                }
                class128.field1788 = class21.field261.method1051(class461.field6509, -4655, class226.field3315);
                class468.field6581 = class435.method2539(-10659);
                class140.field2006 = 1;
            }
            if (~class435.method2539(-10659) < ~(class468.field6581 - -30000L)) {
                return class142.method978(0, 1000);
            } else {
                if (class140.field2006 == 1) {
                    if (~class128.field1788.field5822 == -3) {
                        return class142.method978(0, 1001);
                    }
                    if (class128.field1788.field5822 != 1) {
                        return -1;
                    }
                    class27.field335 = new class147((Socket) class128.field1788.field5823, class21.field261);
                    class128.field1788 = null;
                    int var2 = 0;
                    if (class373.field5604) {
                        var2 = class3.field71;
                    }
                    class230.field3390.field6315 = 0;
                    class230.field3390.method2619((byte) 92, class109.field1545.field2407);
                    class230.field3390.method2596((byte) -95, var2);
                    class27.field335.method1000(30000, 0, class230.field3390.field6315, class230.field3390.field6316);
                    if (class395.field5816 != null) {
                        class395.field5816.method2228(0);
                    }
                    if (class398.field5829 != null) {
                        class398.field5829.method2228(0);
                    }
                    int var3 = class27.field335.method1002((byte) 115);
                    if (class395.field5816 != null) {
                        class395.field5816.method2228(0);
                    }
                    if (class398.field5829 != null) {
                        class398.field5829.method2228(0);
                    }
                    if (var3 != 0) {
                        return class142.method978(0, var3);
                    }
                    class140.field2006 = 2;
                }
                if (~class140.field2006 == -3) {
                    if (class27.field335.method1005(5000) < 2) {
                        return -1;
                    }
                    class51.field739 = class27.field335.method1002((byte) -75);
                    class51.field739 <<= 8;
                    class51.field739 += class27.field335.method1002((byte) -58);
                    class184.field2770 = new byte[class51.field739];
                    class140.field2006 = 3;
                    class432.field6151 = 0;
                }
                if (~class140.field2006 == -4) {
                    int var4 = class27.field335.method1005(5000);
                    if (var4 < 1) {
                        return -1;
                    } else {
                        if (~(-class432.field6151 + class51.field739) > ~var4) {
                            var4 = -class432.field6151 + class51.field739;
                        }
                        class27.field335.method996(var4, class184.field2770, true, class432.field6151);
                        class432.field6151 += var4;
                        if (class51.field739 > class432.field6151) {
                            return -1;
                        } else if (!class492.method2881(class184.field2770, 119)) {
                            return class142.method978(0, 1002);
                        } else {
                            class201.field3056 = new class187[class306.field4563];
                            int var5 = 0;
                            for (int var6 = class203.field3091; ~var6 >= ~class345.field5253; ++var6) {
                                class187 var7 = class44.method321(-70, var6);
                                if (var7 != null) {
                                    class201.field3056[var5++] = var7;
                                }
                            }
                            class84.field1193 = 0;
                            class78.field1097 = null;
                            class27.field335.method998((byte) -13);
                            class27.field335 = null;
                            class184.field2770 = null;
                            class140.field2006 = 0;
                            class237.field3464 = 0;
                            class162.field2248 = class435.method2539(-10659);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var8) {
            return class142.method978(0, 1003);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIIII)V", line = 294)
    public class406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5909 = arg3;
        this.field5897 = arg0;
        this.field5900 = arg2;
        this.field5906 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)V", line = 305)
    public static final void method2436(int arg0, int arg1, int arg2) {
        ++field5907;
        class186 var3 = class275.method1789(0, (byte) 123, 15);
        var3.method1285(arg2 ^ arg2);
        var3.field2819 = arg0;
        var3.field2829 = arg1;
    }
}
