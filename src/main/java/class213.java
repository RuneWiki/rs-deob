import java.awt.Point;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class213 {

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lrn;")
    private class161 field2862 = null;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    private int field2864 = 65000;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "Lrn;")
    private class161 field2868 = null;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    private int field2859;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "Lgd;")
    public static class206 field2869 = new class206("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2870;

    static {
        new class206((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        new class206((String) null, "geschickt werden.", (String) null, (String) null);
        field2871 = 0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1204(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        if (!class488.field6789.field6694) {
            arg0 = -1;
        }
        field2860++;
        if (class66.field883 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class401 var2 = class86.field1146.method1729(arg0, -23);
            class325 var3 = var2.method2428((byte) 75);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class251.field3359.method1352(var3.method1815(), new Point(var2.field5514, var2.field5510), 0, var3.method1820(), class28.field378, var3.method1818());
                class66.field883 = arg0;
            }
        }
        if (arg0 == -1 && class66.field883 != -1) {
            class251.field3359.method1352(-1, new Point(), 0, (int[]) null, class28.field378, -1);
            class66.field883 = -1;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILoe;BI)V", line = 46)
    public static final void method1205(int arg0, class121 arg1, byte arg2, int arg3) {
        if (arg1.field1137 == arg0 && arg0 != -1) {
            class181 var4 = class395.field5477.method266(16107, arg0);
            int var5 = var4.field2470;
            if (var5 == 1) {
                arg1.field1132 = 1;
                arg1.field1169 = 0;
                arg1.field1150 = 0;
                arg1.field1130 = arg3;
                arg1.field1138 = 0;
                class402.method2437(var4, false, arg1.field6502, -125, arg1.field6501, arg1.field6507, arg1.field1150);
            }
            if (var5 == 2) {
                arg1.field1138 = 0;
            }
        } else if (arg0 == -1 || arg1.field1137 == -1 || class395.field5477.method266(16107, arg0).field2471 >= class395.field5477.method266(16107, arg1.field1137).field2471) {
            arg1.field1137 = arg0;
            arg1.field1138 = 0;
            arg1.field1150 = 0;
            arg1.field1169 = 0;
            arg1.field1132 = 1;
            arg1.field1130 = arg3;
            arg1.field1202 = arg1.field1203;
            if (arg1.field1137 != -1) {
                class402.method2437(class395.field5477.method266(16107, arg1.field1137), false, arg1.field6502, arg2 ^ 0x11, arg1.field6501, arg1.field6507, arg1.field1150);
            }
        }
        field2867++;
        if (arg2 != -120) {
            method1205(113, (class121) null, (byte) -32, -101);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)J", line = 102)
    public static final long method1206(boolean arg0) {
        field2866++;
        if (arg0) {
            method1205(35, (class121) null, (byte) 66, 74);
        }
        return class250.field3335.method134(28919);
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(ILrn;Lrn;I)V", line = 185)
    public class213(int arg0, class161 arg1, class161 arg2, int arg3) {
        this.field2862 = arg2;
        this.field2864 = arg3;
        this.field2868 = arg1;
        this.field2859 = arg0;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V", line = 127)
    public static void method1207(byte arg0) {
        field2870 = null;
        if (arg0 != 58) {
            method1204(-65, true);
        }
        field2869 = null;
    }

    @OriginalMember(owner = "client!rq", name = "toString", descriptor = "()Ljava/lang/String;", line = 140)
    public final String toString() {
        field2861++;
        return "Cache:" + this.field2859;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[BBI)Z", line = 154)
    public final boolean method1208(int arg0, byte[] arg1, byte arg2, int arg3) {
        field2858++;
        class161 var5 = this.field2868;
        synchronized (this.field2868) {
            if (arg0 < 0 || this.field2864 < arg0) {
                throw new IllegalArgumentException();
            }
            if (arg2 >= -56) {
                this.field2864 = 11;
            }
            boolean var6 = this.method1209(true, arg0, 5666, arg3, arg1);
            if (!var6) {
                var6 = this.method1209(false, arg0, 5666, arg3, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIII[B)Z", line = 198)
    private final boolean method1209(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field2865++;
        if (arg2 != 5666) {
            return false;
        }
        class161 var6 = this.field2868;
        synchronized (this.field2868) {
            try {
                int var7;
                if (arg0) {
                    if (((long) (arg3 * 6 + 6)) > this.field2862.method946((byte) -72)) {
                        return false;
                    }
                    this.field2862.method942((long) (arg3 * 6), (byte) -121);
                    this.field2862.method950(class77.field1036, true, 0, 6);
                    var7 = (class77.field1036[5] & 0xFF) + ((class77.field1036[4] & 0xFF) << 8) + (class77.field1036[3] & 0xFF << 16);
                    if (var7 <= 0 || (long) var7 > this.field2868.method946((byte) -67) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field2868.method946((byte) -88) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class77.field1036[1] = (byte) (arg1 >> 8);
                class77.field1036[3] = (byte) (var7 >> 16);
                class77.field1036[2] = (byte) arg1;
                class77.field1036[0] = (byte) (arg1 >> 16);
                class77.field1036[4] = (byte) (var7 >> 8);
                class77.field1036[5] = (byte) var7;
                this.field2862.method942((long) (arg3 * 6), (byte) -104);
                this.field2862.method943(19124, 0, class77.field1036, 6);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg0) {
                        label110: {
                            this.field2868.method942((long) (var7 * 520), (byte) -103);
                            try {
                                this.field2868.method950(class77.field1036, true, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class77.field1036[0] & 0xFF << 8) + (class77.field1036[1] & 0xFF);
                            int var14 = (class77.field1036[2] & 0xFF << 8) + (class77.field1036[3] & 0xFF);
                            var12 = ((class77.field1036[4] & 0xFF) << 16) + (((class77.field1036[5] & 0xFF) << 8) + (class77.field1036[6] & 0xFF));
                            int var15 = class77.field1036[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field2859 == var15) {
                                if (var12 >= 0 && this.field2868.method946((byte) -46) / 520L >= (long) var12) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field2868.method946((byte) -71) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class77.field1036[3] = (byte) var11;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class77.field1036[0] = (byte) (arg3 >> 8);
                    class77.field1036[1] = (byte) arg3;
                    class77.field1036[2] = (byte) (var11 >> 8);
                    class77.field1036[7] = (byte) this.field2859;
                    class77.field1036[4] = (byte) (var12 >> 16);
                    class77.field1036[5] = (byte) (var12 >> 8);
                    class77.field1036[6] = (byte) var12;
                    this.field2868.method942((long) (var7 * 520), (byte) -120);
                    this.field2868.method943(arg2 + 13458, 0, class77.field1036, 8);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field2868.method943(19124, var10, arg4, var18);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[B", line = 322)
    public final byte[] method1210(int arg0, int arg1) {
        field2863++;
        class161 var3 = this.field2868;
        synchronized (this.field2868) {
            try {
                if (this.field2862.method946((byte) -5) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field2862.method942((long) (arg1 * 6), (byte) -108);
                this.field2862.method950(class77.field1036, true, 0, 6);
                int var5 = (class77.field1036[2] & 0xFF) + ((class77.field1036[0] & 0xFF) << 16) + (class77.field1036[1] & 0xFF << 8);
                int var6 = ((class77.field1036[3] & 0xFF) << 16) - (-(class77.field1036[4] & 0xFF << 8) - (class77.field1036[5] & 0xFF));
                if (var5 < 0 || var5 > this.field2864) {
                    return null;
                } else if (var6 > 0 && this.field2868.method946((byte) -110) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = -113 % ((arg0 + 26) / 37);
                    int var12 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field2868.method942((long) (var6 * 520), (byte) -113);
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field2868.method950(class77.field1036, true, 0, var14 + 8);
                        int var15 = (class77.field1036[0] & 0xFF << 8) + (class77.field1036[1] & 0xFF);
                        int var16 = ((class77.field1036[2] & 0xFF) << 8) + (class77.field1036[3] & 0xFF);
                        int var17 = ((class77.field1036[4] & 0xFF) << 16) + (class77.field1036[5] & 0xFF << 8) + (class77.field1036[6] & 0xFF);
                        int var18 = class77.field1036[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field2859 == var18) {
                            if (var17 >= 0 && (this.field2868.method946((byte) -50) / 520L) >= ((long) var17)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class77.field1036[var21 + 8];
                                }
                                var12++;
                                var6 = var17;
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
    }
}
