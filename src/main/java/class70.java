import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class70 {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lqc;")
    private class98 field1796 = null;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    private int field1800 = 65000;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lqc;")
    private class98 field1787 = null;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lke;")
    private static class65 field1801 = class1.method17("Error connecting to server)3", -115);

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lke;")
    public static class65 field1795 = field1801;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lke;")
    private static class65 field1791 = class1.method17("Enter object name", -128);

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lke;")
    private static class65 field1805 = class1.method17("scroll:", -116);

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lke;")
    public static class65 field1803 = field1805;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lke;")
    public static class65 field1788 = field1791;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lqd;")
    public static class100 field1794 = new class100(30);

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Lke;")
    public static class65 field1813 = class1.method17("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -125);

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "[Z")
    public static boolean[] field1816 = new boolean[5];

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Lke;")
    private static class65 field1812 = class1.method17("Starting game engine)3)3)3", -118);

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lke;")
    public static class65 field1817 = field1812;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Lke;")
    private static class65 field1815 = class1.method17(" million", -126);

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "Lke;")
    private static class65 field1818 = class1.method17("RuneScape has been updated(Q", -118);

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Lke;")
    public static class65 field1820 = class1.method17("Anmelde)2Limit -Uberschritten)3", -121);

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Lke;")
    public static class65 field1819 = field1815;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lke;")
    public static class65 field1822 = field1818;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lta;")
    public static class112 field1809;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Ljd;")
    public static class58 field1821;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 12)
    public static final void method574(int arg0) {
        int var1 = 28 % ((81 - arg0) / 38);
        field1806++;
        class128.field3090.method834(5875);
        class7.field138.method834(5875);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BIIII[Lne;BIILle;)V", line = 23)
    public static final void method575(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class83[] arg6, byte arg7, int arg8, int arg9, class71 arg10) {
        class39 var11 = new class39(arg1);
        field1789++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method311((byte) -114);
            if (var13 == 0) {
                if (arg7 >= -70) {
                    field1822 = null;
                    return;
                }
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method311((byte) -110);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method334(118);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg9 == var19 && arg3 <= var17 && var17 < arg3 + 8 && arg0 <= var16 && var16 < arg0 + 8) {
                    class19 var22 = class54.method435(32247, var12);
                    int var23 = arg5 + class51.method406(var21, var17 & 0x7, var16 & 0x7, false, arg8, var22.field432, var22.field415);
                    int var24 = arg2 + class101.method842(var21, arg8, (byte) 13, var17 & 0x7, var22.field432, var16 & 0x7, var22.field415);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg4;
                        if ((class114.field2852[1][var23][var24] & 0x2) == 2) {
                            var25 = arg4 - 1;
                        }
                        class83 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg6[var25];
                        }
                        class58.method496(var24, arg4, var20, var23, arg10, arg8 + var21 & 0x3, var12, 85, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "toString", descriptor = "()Ljava/lang/String;", line = 99)
    public final String toString() {
        field1798++;
        return "Cache:" + this.field1811;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[B", line = 108)
    public final byte[] method576(int arg0, int arg1) {
        field1807++;
        class98 var3 = this.field1796;
        synchronized (this.field1796) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field1787.method821(108)) {
                    return null;
                }
                this.field1787.method826((long) (arg0 * 6), (byte) 43);
                if (arg1 > -126) {
                    return null;
                }
                this.field1787.method819(0, class125.field3027, -1, 6);
                int var6 = (class125.field3027[2] & 0xFF) + ((class125.field3027[1] & 0xFF) << 8) + ((class125.field3027[0] & 0xFF) << 16);
                int var7 = ((class125.field3027[4] & 0xFF) << 8) + ((class125.field3027[3] & 0xFF) << 16) + (class125.field3027[5] & 0xFF);
                if (var6 < 0 || var6 > this.field1800) {
                    return null;
                } else if (var7 > 0 && this.field1796.method821(116) / 520L >= (long) var7) {
                    int var10 = 0;
                    int var11 = 0;
                    byte[] var12 = new byte[var6];
                    while (var6 > var10) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field1796.method826((long) (var7 * 520), (byte) 43);
                        int var14 = var6 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1796.method819(0, class125.field3027, 96, var14 + 8);
                        int var15 = ((class125.field3027[0] & 0xFF) << 8) + (class125.field3027[1] & 0xFF);
                        int var16 = ((class125.field3027[5] & 0xFF) << 8) + (class125.field3027[4] << 16 & 0xFF0000) + (class125.field3027[6] & 0xFF);
                        int var17 = ((class125.field3027[2] & 0xFF) << 8) + (class125.field3027[3] & 0xFF);
                        int var18 = class125.field3027[7] & 0xFF;
                        if (arg0 == var15 && var11 == var17 && this.field1811 == var18) {
                            if (var16 >= 0 && this.field1796.method821(110) / 520L >= (long) var16) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var12[var10++] = class125.field3027[var21 + 8];
                                }
                                var7 = var16;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 195)
    public static final void method577(int arg0) {
        if (arg0 == 0) {
            class20.field481.method834(5875);
            class56.field1465.method834(5875);
            field1802++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(ILqc;Lqc;I)V", line = 688)
    public class70(int arg0, class98 arg1, class98 arg2, int arg3) {
        this.field1800 = arg3;
        this.field1811 = arg0;
        this.field1787 = arg2;
        this.field1796 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BII)Z", line = 231)
    public final boolean method578(int arg0, byte[] arg1, int arg2, int arg3) {
        field1804++;
        class98 var5 = this.field1796;
        synchronized (this.field1796) {
            if (arg0 < 0 || arg0 > this.field1800) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method582(124, arg2, arg1, true, arg0);
            if (arg3 <= 99) {
                return true;
            } else {
                if (!var6) {
                    var6 = this.method582(-100, arg2, arg1, false, arg0);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 257)
    public static final void method579(byte arg0) {
        try {
            Graphics var1 = class10.field210.getGraphics();
            class75.field2013.method790(550, 4, var1, 104);
        } catch (Exception var2) {
            class10.field210.repaint();
        }
        field1793++;
        if (arg0 != 91) {
            field1815 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILtc;I)V", line = 279)
    public static final void method580(int arg0, int arg1, class114 arg2, int arg3) {
        if ((arg1 & 0x4) != 0) {
            int var4 = class58.field1575.method300(125);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class58.field1575.method317(0);
            if (arg2.field1072 == var4 && var4 != -1) {
                int var6 = class80.method702(98, var4).field23;
                if (var6 == 1) {
                    arg2.field1118 = var5;
                    arg2.field1094 = 0;
                    arg2.field1051 = 0;
                    arg2.field1107 = 0;
                }
                if (var6 == 2) {
                    arg2.field1051 = 0;
                }
            } else if (var4 == -1 || arg2.field1072 == -1 || class80.method702(121, var4).field22 >= class80.method702(106, arg2.field1072).field22) {
                arg2.field1051 = 0;
                arg2.field1094 = 0;
                arg2.field1118 = var5;
                arg2.field1107 = 0;
                arg2.field1072 = var4;
                arg2.field1111 = arg2.field1119;
            }
        }
        if ((arg1 & 0x40) != 0) {
            int var7 = class58.field1575.method334(116);
            int var8 = class58.field1575.method342(-107);
            arg2.method367(0, var7, var8, class76.field2028);
            arg2.field1122 = class76.field2028 + 300;
            arg2.field1057 = class58.field1575.method346((byte) -6);
            arg2.field1117 = class58.field1575.method334(123);
        }
        if ((arg1 & 0x400) != 0) {
            arg2.field1075 = class58.field1575.method314(false);
            int var9 = class58.field1575.method329(144752608);
            arg2.field1102 = 0;
            arg2.field1079 = (var9 & 0xFFFF) + class76.field2028;
            arg2.field1084 = 0;
            arg2.field1115 = var9 >> 16;
            if (arg2.field1075 == 65535) {
                arg2.field1075 = -1;
            }
            if (class76.field2028 < arg2.field1079) {
                arg2.field1084 = -1;
            }
        }
        if ((arg1 & 0x10) != 0) {
            int var10 = class58.field1575.method334(122);
            byte[] var11 = new byte[var10];
            class39 var12 = new class39(var11);
            class58.field1575.method333(var11, true, 0, var10);
            class112.field2795[arg0] = var12;
            arg2.method932(var12, false);
        }
        if ((arg1 & 0x20) != 0) {
            arg2.field1060 = class58.field1575.method326(255);
            arg2.field1073 = class58.field1575.method314(false);
        }
        if (arg3 != 0) {
            field1812 = null;
        }
        if ((arg1 & 0x80) != 0) {
            arg2.field1112 = class58.field1575.method303((byte) 105);
            if (arg2.field1112.method563((byte) -17, 0) == 126) {
                arg2.field1112 = arg2.field1112.method539(-27693, 1);
                class101.method841(arg2.field1112, 2, arg2.field2866, 10751);
            } else if (class32.field833 == arg2) {
                class101.method841(arg2.field1112, 2, arg2.field2866, 10751);
            }
            arg2.field1085 = 0;
            arg2.field1098 = 150;
            arg2.field1086 = 0;
        }
        field1790++;
        if ((arg1 & 0x2) != 0) {
            arg2.field1109 = class58.field1575.method326(arg3 ^ 0xFF);
            if (arg2.field1109 == 65535) {
                arg2.field1109 = -1;
            }
        }
        if ((arg1 & 0x8) != 0) {
            int var13 = class58.field1575.method324(-64);
            int var14 = class58.field1575.method346((byte) -6);
            int var15 = class58.field1575.method334(arg3 ^ 0x6B);
            int var16 = class58.field1575.field998;
            if (arg2.field2866 != null && arg2.field2862 != null) {
                long var17 = arg2.field2866.method530((byte) 43);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < class51.field1311; var20++) {
                        if (class35.field885[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && class55.field1412 == 0) {
                    class111.field2759.field998 = 0;
                    class58.field1575.method330(class111.field2759.field994, (byte) -72, 0, var15);
                    class111.field2759.field998 = 0;
                    class65 var21 = class21.method170(0, class111.field2759).method558((byte) 59);
                    arg2.field1112 = var21.method543((byte) -111);
                    arg2.field1086 = var13 >> 8;
                    arg2.field1098 = 150;
                    arg2.field1085 = var13 & 0xFF;
                    if (var14 == 2 || var14 == 3) {
                        class101.method841(var21, 1, class21.method172(arg3 ^ 0xFFFFFFC0, new class65[] { class19.field445, arg2.field2866 }), 10751);
                    } else if (var14 == 1) {
                        class101.method841(var21, 1, class21.method172(-41, new class65[] { class53.field1371, arg2.field2866 }), 10751);
                    } else {
                        class101.method841(var21, 2, arg2.field2866, 10751);
                    }
                }
            }
            class58.field1575.field998 = var15 + var16;
        }
        if ((arg1 & 0x100) != 0) {
            arg2.field1091 = class58.field1575.method317(0);
            arg2.field1104 = class58.field1575.method346((byte) -6);
            arg2.field1108 = class58.field1575.method342(arg3 ^ 0xFFFFFF94);
            arg2.field1092 = class58.field1575.method346((byte) -6);
            arg2.field1071 = class58.field1575.method314(false) + class76.field2028;
            arg2.field1123 = class58.field1575.method300(arg3 ^ 0x7C) + class76.field2028;
            arg2.field1106 = class58.field1575.method334(125);
            arg2.method368(104);
        }
        if ((arg1 & 0x200) == 0) {
            return;
        }
        int var22 = class58.field1575.method334(arg3 ^ 0x68);
        int var23 = class58.field1575.method334(arg3 ^ 0x71);
        arg2.method367(0, var22, var23, class76.field2028);
        arg2.field1122 = class76.field2028 + 300;
        arg2.field1057 = class58.field1575.method334(121);
        arg2.field1117 = class58.field1575.method342(-104);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 520)
    public static void method581(byte arg0) {
        field1812 = null;
        field1816 = null;
        field1788 = null;
        field1805 = null;
        field1821 = null;
        field1801 = null;
        field1809 = null;
        field1813 = null;
        field1818 = null;
        field1815 = null;
        field1795 = null;
        field1820 = null;
        field1791 = null;
        field1817 = null;
        if (arg0 >= 122) {
            field1803 = null;
            field1822 = null;
            field1794 = null;
            field1819 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[BZI)Z", line = 550)
    private final boolean method582(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        int var6 = 30 / ((arg0 - 66) / 47);
        field1792++;
        class98 var7 = this.field1796;
        synchronized (this.field1796) {
            try {
                int var8;
                if (arg3) {
                    if (this.field1787.method821(125) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field1787.method826((long) (arg1 * 6), (byte) 43);
                    this.field1787.method819(0, class125.field3027, 104, 6);
                    var8 = ((class125.field3027[4] & 0xFF) << 8) + ((class125.field3027[3] & 0xFF) << 16) + (class125.field3027[5] & 0xFF);
                    if (var8 <= 0 || this.field1796.method821(112) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1796.method821(123) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class125.field3027[0] = (byte) (arg4 >> 16);
                int var11 = 0;
                class125.field3027[1] = (byte) (arg4 >> 8);
                class125.field3027[2] = (byte) arg4;
                class125.field3027[3] = (byte) (var8 >> 16);
                class125.field3027[4] = (byte) (var8 >> 8);
                class125.field3027[5] = (byte) var8;
                int var12 = 0;
                this.field1787.method826((long) (arg1 * 6), (byte) 43);
                this.field1787.method827(6, 0, class125.field3027, -83);
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg3) {
                        label105: {
                            this.field1796.method826((long) (var8 * 520), (byte) 43);
                            try {
                                this.field1796.method819(0, class125.field3027, 100, 8);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class125.field3027[5] & 0xFF) << 8) + ((class125.field3027[4] << 16 & 0xFF0000) + (class125.field3027[6] & 0xFF));
                            int var14 = ((class125.field3027[0] & 0xFF) << 8) + (class125.field3027[1] & 0xFF);
                            int var15 = class125.field3027[7] & 0xFF;
                            int var16 = ((class125.field3027[2] & 0xFF) << 8) + (class125.field3027[3] & 0xFF);
                            if (arg1 == var14 && var12 == var16 && this.field1811 == var15) {
                                if (var13 >= 0 && this.field1796.method821(116) / 520L >= (long) var13) {
                                    break label105;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field1796.method821(127) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    int var19 = arg4 - var11;
                    class125.field3027[0] = (byte) (arg1 >> 8);
                    class125.field3027[1] = (byte) arg1;
                    class125.field3027[2] = (byte) (var12 >> 8);
                    if (arg4 - var11 <= 512) {
                        var13 = 0;
                    }
                    class125.field3027[3] = (byte) var12;
                    var12++;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class125.field3027[4] = (byte) (var13 >> 16);
                    class125.field3027[5] = (byte) (var13 >> 8);
                    class125.field3027[6] = (byte) var13;
                    class125.field3027[7] = (byte) this.field1811;
                    this.field1796.method826((long) (var8 * 520), (byte) 43);
                    var8 = var13;
                    this.field1796.method827(8, 0, class125.field3027, 121);
                    this.field1796.method827(var19, var11, arg2, -90);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 677)
    public static final void method583(int arg0) {
        if (arg0 != 103) {
            field1795 = null;
        }
        field1799++;
        class74.field1967.method834(5875);
    }
}
