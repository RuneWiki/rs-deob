import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class57 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    private int field1193 = 65000;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lw;")
    private class125 field1195 = null;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lw;")
    private class125 field1202 = null;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1198 = 0;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Llc;")
    public static class69 field1199 = class69.method470((byte) -126, "Error loading your profile)3");

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Llc;")
    public static class69 field1191 = class69.method470((byte) -117, "wishes to trade with you)3");

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "[[I")
    public static int[][] field1200 = new int[104][104];

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Llc;")
    public static class69 field1206 = class69.method470((byte) -99, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static volatile int field1204 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lf;")
    public static class31 field1203;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[B")
    public final byte[] method355(int arg0, byte arg1) {
        field1197++;
        class125 var3 = this.field1202;
        synchronized (this.field1202) {
            try {
                if (arg1 != -82) {
                    return null;
                } else if ((long) (arg0 * 6 + 6) > this.field1195.method924(-5655)) {
                    return null;
                } else {
                    this.field1195.method923((byte) -84, (long) (arg0 * 6));
                    this.field1195.method917(class16.field284, 0, 6, true);
                    int var6 = (class16.field284[2] & 0xFF) + ((class16.field284[0] & 0xFF) << 16) + ((class16.field284[1] & 0xFF) << 8);
                    int var7 = ((class16.field284[3] & 0xFF) << 16) + (class16.field284[5] & 0xFF) + ((class16.field284[4] & 0xFF) << 8);
                    if (var6 < 0 || var6 > this.field1193) {
                        return null;
                    } else if (var7 > 0 && (long) var7 <= this.field1202.method924(-5655) / 520L) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        label74: while (var6 > var11) {
                            if (var7 == 0) {
                                return null;
                            }
                            int var14 = var6 - var11;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1202.method923((byte) 70, (long) (var7 * 520));
                            this.field1202.method917(class16.field284, 0, var14 + 8, true);
                            int var15 = ((class16.field284[2] & 0xFF) << 8) + (class16.field284[3] & 0xFF);
                            int var16 = ((class16.field284[0] & 0xFF) << 8) + (class16.field284[1] & 0xFF);
                            int var17 = class16.field284[7] & 0xFF;
                            int var18 = ((class16.field284[5] & 0xFF) << 8) + (((class16.field284[4] & 0xFF) << 16) + (class16.field284[6] & 0xFF));
                            if (arg0 == var16 && var12 == var15 && this.field1196 == var17) {
                                if (var18 >= 0 && (long) var18 <= this.field1202.method924(-5655) / 520L) {
                                    var12++;
                                    var7 = var18;
                                    int var21 = 0;
                                    while (true) {
                                        if (var14 <= var21) {
                                            continue label74;
                                        }
                                        var10[var11++] = class16.field284[var21 + 8];
                                        var21++;
                                    }
                                }
                                return null;
                            }
                            return null;
                        }
                        return var10;
                    } else {
                        return null;
                    }
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method356(byte arg0) {
        field1203 = null;
        if (arg0 <= 43) {
            method356((byte) -82);
        }
        field1191 = null;
        field1199 = null;
        field1206 = null;
        field1200 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZI[B)Z")
    private final boolean method357(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field1192++;
        class125 var6 = this.field1202;
        synchronized (this.field1202) {
            try {
                int var7;
                if (arg2) {
                    if (this.field1195.method924(-5655) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field1195.method923((byte) 57, (long) (arg0 * 6));
                    this.field1195.method917(class16.field284, 0, 6, true);
                    var7 = (class16.field284[5] & 0xFF) + ((class16.field284[4] & 0xFF) << 8) + ((class16.field284[3] & 0xFF) << 16);
                    if (var7 <= 0 || this.field1202.method924(-5655) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1202.method924(-5655) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class16.field284[0] = (byte) (arg1 >> 16);
                if (arg3 != -1203457392) {
                    return false;
                }
                class16.field284[1] = (byte) (arg1 >> 8);
                class16.field284[2] = (byte) arg1;
                class16.field284[3] = (byte) (var7 >> 16);
                class16.field284[4] = (byte) (var7 >> 8);
                int var11 = 0;
                class16.field284[5] = (byte) var7;
                int var12 = 0;
                this.field1195.method923((byte) 86, (long) (arg0 * 6));
                this.field1195.method925(6, class16.field284, 0, true);
                while (var12 < arg1) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field1202.method923((byte) -121, (long) (var7 * 520));
                            try {
                                this.field1202.method917(class16.field284, 0, 8, true);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = (class16.field284[6] & 0xFF) + ((class16.field284[5] & 0xFF) << 8) + ((class16.field284[4] & 0xFF) << 16);
                            int var14 = ((class16.field284[0] & 0xFF) << 8) + (class16.field284[1] & 0xFF);
                            int var15 = ((class16.field284[2] & 0xFF) << 8) + (class16.field284[3] & 0xFF);
                            int var16 = class16.field284[7] & 0xFF;
                            if (arg0 == var14 && var11 == var15 && this.field1196 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field1202.method924(arg3 + 1203451737) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field1202.method924(-5655) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class16.field284[0] = (byte) (arg0 >> 8);
                    if (arg1 - var12 <= 512) {
                        var13 = 0;
                    }
                    int var19 = arg1 - var12;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class16.field284[1] = (byte) arg0;
                    class16.field284[2] = (byte) (var11 >> 8);
                    class16.field284[3] = (byte) var11;
                    var11++;
                    class16.field284[4] = (byte) (var13 >> 16);
                    class16.field284[5] = (byte) (var13 >> 8);
                    class16.field284[6] = (byte) var13;
                    class16.field284[7] = (byte) this.field1196;
                    this.field1202.method923((byte) -124, (long) (var7 * 520));
                    this.field1202.method925(8, class16.field284, 0, true);
                    var7 = var13;
                    this.field1202.method925(var19, arg4, var12, true);
                    var12 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB[BI)Z")
    public final boolean method358(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != 25) {
            this.field1195 = null;
        }
        field1205++;
        class125 var5 = this.field1202;
        synchronized (this.field1202) {
            if (arg3 < 0 || arg3 > this.field1193) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method357(arg0, arg3, true, -1203457392, arg2);
            if (!var6) {
                var6 = this.method357(arg0, arg3, false, -1203457392, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(ILw;Lw;I)V")
    public class57(int arg0, class125 arg1, class125 arg2, int arg3) {
        this.field1193 = arg3;
        this.field1196 = arg0;
        this.field1195 = arg2;
        this.field1202 = arg1;
    }
}
