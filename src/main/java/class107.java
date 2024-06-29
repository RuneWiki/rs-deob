import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class107 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lgk;")
    private class184 field1442 = null;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lgk;")
    private class184 field1448 = null;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    private int field1446 = 65000;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field1449 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[[[B")
    public static byte[][][] field1441;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method646(byte arg0) {
        field1441 = null;
        if (arg0 != 15) {
            field1438 = 80;
        }
    }

    @OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1436++;
        return "Cache:" + this.field1444;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB[B)Z")
    public final boolean method647(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 != -65) {
            field1441 = null;
        }
        field1443++;
        class184 var5 = this.field1448;
        synchronized (this.field1448) {
            if (arg0 < 0 || arg0 > this.field1446) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method651((byte) 54, arg3, arg0, arg1, true);
            if (!var6) {
                var6 = this.method651((byte) 83, arg3, arg0, arg1, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method648(byte arg0) {
        field1447++;
        if (class108.field1503) {
            return;
        }
        class253.field4120 = true;
        if (class129.field2065) {
            class226.field3639 = (float) ((int) class226.field3639 - 65 & 0xFFFFFF80);
        } else {
            class67.field847 += (-class67.field847 - 24.0F) / 2.0F;
        }
        class108.field1503 = true;
        if (arg0 <= 26) {
            field1441 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)[B")
    public final byte[] method649(boolean arg0, int arg1) {
        field1445++;
        class184 var3 = this.field1448;
        synchronized (this.field1448) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field1442.method1293(-126)) {
                    return null;
                }
                this.field1442.method1281((long) (arg1 * 6), (byte) -64);
                this.field1442.method1290(0, (byte) -69, 6, class240.field3951);
                int var5 = (class240.field3951[0] & 0xFF << 16) + (class240.field3951[2] & 0xFF) + ((class240.field3951[1] & 0xFF) << 8);
                int var6 = ((class240.field3951[3] & 0xFF) << 16) + (class240.field3951[4] & 0xFF << 8) + (class240.field3951[5] & 0xFF);
                if (var5 < 0 || var5 > this.field1446) {
                    return null;
                } else if (var6 > 0 && (this.field1448.method1293(-66) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    if (!arg0) {
                        return null;
                    }
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        int var14 = var5 - var11;
                        this.field1448.method1281((long) (var6 * 520), (byte) -52);
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1448.method1290(0, (byte) -76, var14 + 8, class240.field3951);
                        int var15 = ((class240.field3951[0] & 0xFF) << 8) + (class240.field3951[1] & 0xFF);
                        int var16 = ((class240.field3951[2] & 0xFF) << 8) + (class240.field3951[3] & 0xFF);
                        int var17 = ((class240.field3951[5] & 0xFF) << 8) + ((class240.field3951[4] & 0xFF) << 16) + (class240.field3951[6] & 0xFF);
                        int var18 = class240.field3951[7] & 0xFF;
                        if (arg1 == var15 && var10 == var16 && this.field1444 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field1448.method1293(-92) / 520L)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var11++] = class240.field3951[var21 + 8];
                                }
                                var10++;
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)V")
    public static final void method650(byte arg0, int arg1) {
        int var2 = -76 / ((arg0 + 8) / 48);
        field1439++;
        class233 var3 = class114.method746(arg1, 1228126432, 8);
        var3.method1653(false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B[BIIZ)Z")
    private final boolean method651(byte arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field1440++;
        class184 var6 = this.field1448;
        synchronized (this.field1448) {
            try {
                if (arg0 <= 38) {
                    return false;
                }
                int var8;
                if (arg4) {
                    if (((long) (arg3 * 6 + 6)) > this.field1442.method1293(-120)) {
                        return false;
                    }
                    this.field1442.method1281((long) (arg3 * 6), (byte) -77);
                    this.field1442.method1290(0, (byte) -121, 6, class240.field3951);
                    var8 = (class240.field3951[5] & 0xFF) + ((class240.field3951[3] & 0xFF) << 16) + ((class240.field3951[4] & 0xFF) << 8);
                    if (var8 <= 0 || (long) var8 > this.field1448.method1293(-90) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1448.method1293(-64) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class240.field3951[2] = (byte) arg2;
                class240.field3951[1] = (byte) (arg2 >> 8);
                class240.field3951[5] = (byte) var8;
                int var11 = 0;
                class240.field3951[3] = (byte) (var8 >> 16);
                class240.field3951[0] = (byte) (arg2 >> 16);
                class240.field3951[4] = (byte) (var8 >> 8);
                int var12 = 0;
                this.field1442.method1281((long) (arg3 * 6), (byte) 98);
                this.field1442.method1282(class240.field3951, 0, 6, -5342);
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg4) {
                        label112: {
                            this.field1448.method1281((long) (var8 * 520), (byte) 49);
                            try {
                                this.field1448.method1290(0, (byte) -59, 8, class240.field3951);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class240.field3951[4] & 0xFF) << 16) + (class240.field3951[5] & 0xFF << 8) + (class240.field3951[6] & 0xFF);
                            int var14 = (class240.field3951[0] & 0xFF << 8) + (class240.field3951[1] & 0xFF);
                            int var15 = (class240.field3951[2] & 0xFF << 8) + (class240.field3951[3] & 0xFF);
                            int var16 = class240.field3951[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field1444 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field1448.method1293(-69) / 520L)) {
                                    break label112;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg4 = false;
                        var13 = (int) ((this.field1448.method1293(-104) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class240.field3951[0] = (byte) (arg3 >> 8);
                    class240.field3951[3] = (byte) var12;
                    class240.field3951[7] = (byte) this.field1444;
                    class240.field3951[2] = (byte) (var12 >> 8);
                    var12++;
                    int var19 = arg2 - var11;
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    class240.field3951[4] = (byte) (var13 >> 16);
                    class240.field3951[6] = (byte) var13;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class240.field3951[1] = (byte) arg3;
                    class240.field3951[5] = (byte) (var13 >> 8);
                    this.field1448.method1281((long) (var8 * 520), (byte) 46);
                    this.field1448.method1282(class240.field3951, 0, 8, -5342);
                    this.field1448.method1282(arg1, var11, var19, -5342);
                    var8 = var13;
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ILgk;Lgk;I)V")
    public class107(int arg0, class184 arg1, class184 arg2, int arg3) {
        this.field1448 = arg1;
        this.field1444 = arg0;
        this.field1442 = arg2;
        this.field1446 = arg3;
    }
}
