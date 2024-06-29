import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 {

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    private int field1188 = 65000;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lub;")
    private class122 field1194 = null;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lub;")
    private class122 field1201 = null;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    public static int[] field1184 = new int[1000];

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lrc;")
    public static class105 field1189 = class43.method374(":duelreq:", 0);

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lrc;")
    private static class105 field1200 = class43.method374("Loading config )2 ", 0);

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field1199 = 0;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[[[B")
    public static byte[][][] field1185 = new byte[4][104][104];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lrc;")
    private static class105 field1182 = class43.method374("Continue", 0);

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lrc;")
    public static class105 field1186 = field1182;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[Lmd;")
    public static class76[] field1204 = new class76[256];

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lrc;")
    public static class105 field1183 = field1200;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lrc;")
    public static class105 field1195 = class43.method374("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3", 0);

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Leb;")
    public static class27 field1187;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lfc;")
    public static class34 field1191;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lmd;")
    public static class76 field1203;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Lpb;")
    public static class92 field1190;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
    public static int[] field1196;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    public static int[] field1206;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BI)Z", line = 6)
    public final boolean method454(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 < 93) {
            return false;
        }
        field1197++;
        class122 var5 = this.field1201;
        synchronized (this.field1201) {
            if (arg0 < 0 || arg0 > this.field1188) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method457(arg2, arg3, true, 4, arg0);
            if (!var6) {
                var6 = this.method457(arg2, arg3, false, 4, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[B", line = 37)
    public final byte[] method455(byte arg0, int arg1) {
        field1205++;
        class122 var3 = this.field1201;
        synchronized (this.field1201) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1194.method990((byte) 117)) {
                    return null;
                }
                this.field1194.method991((long) (arg1 * 6), -93);
                this.field1194.method995(6, class80.field1803, 0, 103);
                int var5 = ((class80.field1803[1] & 0xFF) << 8) + ((class80.field1803[0] & 0xFF) << 16) + (class80.field1803[2] & 0xFF);
                int var6 = ((class80.field1803[3] & 0xFF) << 16) - (-((class80.field1803[4] & 0xFF) << 8) - (class80.field1803[5] & 0xFF));
                if (var5 < 0 || var5 > this.field1188) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1201.method990((byte) -118) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 <= 55) {
                        method456(121, -34, 2, 28, false, 110);
                    }
                    int var11 = 0;
                    label74: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1201.method991((long) (var6 * 520), -37);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1201.method995(var13 + 8, class80.field1803, 0, 59);
                        int var14 = ((class80.field1803[0] & 0xFF) << 8) + (class80.field1803[1] & 0xFF);
                        int var15 = class80.field1803[7] & 0xFF;
                        int var16 = ((class80.field1803[5] & 0xFF) << 8) + (class80.field1803[4] << 16 & 0xFF0000) + (class80.field1803[6] & 0xFF);
                        int var17 = ((class80.field1803[2] & 0xFF) << 8) + (class80.field1803[3] & 0xFF);
                        if (arg1 == var14 && var10 == var17 && this.field1198 == var15) {
                            if (var16 >= 0 && (long) var16 <= this.field1201.method990((byte) -88) / 520L) {
                                var6 = var16;
                                var10++;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label74;
                                    }
                                    var9[var11++] = class80.field1803[var20 + 8];
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

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V", line = 120)
    public static final void method456(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = (arg1 - 32) * arg1 / arg5;
        field1207++;
        if (var6 < 8) {
            var6 = 8;
        }
        class23.field560[0].method134(arg3, arg0);
        if (!arg4) {
            return;
        }
        int var7 = (arg1 - var6 - 32) * arg2 / (arg5 - arg1);
        class23.field560[1].method134(arg3, arg0 + arg1 - 16);
        class69.method580(arg3, arg0 + 16, 16, arg1 - 32, class93.field2172);
        class69.method580(arg3, arg0 + var7 + 16, 16, var6, class83.field1848);
        class69.method594(arg3, arg0 + var7 + 16, var6, client.field428);
        class69.method594(arg3 + 1, arg0 + var7 + 16, var6, client.field428);
        class69.method589(arg3, arg0 + var7 + 16, 16, client.field428);
        class69.method589(arg3, arg0 + var7 + 17, 16, client.field428);
        class69.method594(arg3 + 15, var7 + 16 + arg0, var6, class88.field1995);
        class69.method594(arg3 + 14, var7 + 17 + arg0, var6 - 1, class88.field1995);
        class69.method589(arg3, arg0 + var7 + var6 + 15, 16, class88.field1995);
        class69.method589(arg3 + 1, arg0 + var7 + 14 - -var6, 15, class88.field1995);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIZII)Z", line = 150)
    private final boolean method457(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1209++;
        class122 var6 = this.field1201;
        synchronized (this.field1201) {
            try {
                int var8;
                if (arg2) {
                    if (this.field1194.method990((byte) 67) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field1194.method991((long) (arg1 * 6), 122);
                    this.field1194.method995(6, class80.field1803, 0, 116);
                    var8 = (class80.field1803[5] & 0xFF) + ((class80.field1803[3] & 0xFF) << 16) + ((class80.field1803[4] & 0xFF) << 8);
                    if (var8 <= 0 || this.field1201.method990((byte) 107) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1201.method990((byte) 88) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class80.field1803[0] = (byte) (arg4 >> 16);
                class80.field1803[1] = (byte) (arg4 >> 8);
                class80.field1803[2] = (byte) arg4;
                class80.field1803[3] = (byte) (var8 >> 16);
                class80.field1803[arg3] = (byte) (var8 >> 8);
                int var10 = 0;
                class80.field1803[5] = (byte) var8;
                this.field1194.method991((long) (arg1 * 6), -45);
                int var11 = 0;
                this.field1194.method994(0, 6, class80.field1803, -3291);
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label104: {
                            this.field1201.method991((long) (var8 * 520), -26);
                            try {
                                this.field1201.method995(8, class80.field1803, 0, 47);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class80.field1803[5] & 0xFF) << 8) + ((class80.field1803[4] & 0xFF) << 16) + (class80.field1803[6] & 0xFF);
                            int var13 = ((class80.field1803[0] & 0xFF) << 8) + (class80.field1803[1] & 0xFF);
                            int var14 = ((class80.field1803[2] & 0xFF) << 8) + (class80.field1803[3] & 0xFF);
                            int var15 = class80.field1803[7] & 0xFF;
                            if (arg1 == var13 && var11 == var14 && this.field1198 == var15) {
                                if (var12 >= 0 && this.field1201.method990((byte) -115) / 520L >= (long) var12) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field1201.method990((byte) 23) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class80.field1803[0] = (byte) (arg1 >> 8);
                    class80.field1803[1] = (byte) arg1;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class80.field1803[2] = (byte) (var11 >> 8);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class80.field1803[3] = (byte) var11;
                    class80.field1803[4] = (byte) (var12 >> 16);
                    var11++;
                    class80.field1803[5] = (byte) (var12 >> 8);
                    class80.field1803[6] = (byte) var12;
                    class80.field1803[7] = (byte) this.field1198;
                    this.field1201.method991((long) (var8 * 520), 85);
                    var8 = var12;
                    this.field1201.method994(0, 8, class80.field1803, -3291);
                    this.field1201.method994(var10, var18, arg0, -3291);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Lbd;", line = 273)
    public static final class11 method458(byte arg0) {
        field1193++;
        class11 var1 = new class11();
        var1.field224 = class113.field2648;
        if (arg0 != 75) {
            method459((byte) -1, 58);
        }
        var1.field222 = class107.field2460;
        var1.field223 = class43.field981[0];
        var1.field219 = class113.field2646[0];
        var1.field221 = class90.field2059[0];
        var1.field225 = class50.field1057[0];
        var1.field220 = class58.field1295;
        var1.field218 = class85.field1908[0];
        class9.method118(-1);
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(BI)Lha;", line = 295)
    public static final class43 method459(byte arg0, int arg1) {
        if (arg0 >= -6) {
            field1189 = null;
        }
        field1202++;
        class43 var2 = (class43) class6.field65.method601((long) arg1, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field3101.method766(arg1, (byte) -45, 16);
        class43 var4 = new class43();
        if (var3 != null) {
            var4.method373((byte) -81, new class7(var3));
        }
        class6.field65.method608((long) arg1, var4, (byte) 124);
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;", line = 364)
    public final String toString() {
        field1192++;
        return "Cache:" + this.field1198;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILub;Lub;I)V", line = 428)
    public class57(int arg0, class122 arg1, class122 arg2, int arg3) {
        this.field1201 = arg1;
        this.field1194 = arg2;
        this.field1198 = arg0;
        this.field1188 = arg3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 397)
    public static void method460(boolean arg0) {
        field1191 = null;
        field1187 = null;
        field1184 = null;
        field1189 = null;
        field1195 = null;
        field1203 = null;
        field1185 = null;
        field1182 = null;
        field1190 = null;
        field1196 = null;
        field1186 = null;
        field1204 = null;
        if (!arg0) {
            field1204 = null;
        }
        field1206 = null;
        field1200 = null;
        field1183 = null;
    }
}
