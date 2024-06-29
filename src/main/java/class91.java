import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class91 {

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lmj;")
    private class473 field1459 = null;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    private int field1458 = 65000;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lmj;")
    private class473 field1467 = null;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[J")
    public static long[] field1456 = new long[100];

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lbd;")
    public static class44 field1465;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BIB)Z")
    public final boolean method670(int arg0, byte[] arg1, int arg2, byte arg3) {
        field1462++;
        class473 var5 = this.field1459;
        synchronized (this.field1459) {
            if (arg2 < 0 || arg2 > this.field1458) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method671(arg2, arg1, arg0, true, (byte) -92);
            if (arg3 != -63) {
                this.toString();
            }
            if (!var6) {
                var6 = this.method671(arg2, arg1, arg0, false, (byte) -62);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[BIZB)Z")
    private final boolean method671(int arg0, byte[] arg1, int arg2, boolean arg3, byte arg4) {
        field1457++;
        class473 var6 = this.field1459;
        synchronized (this.field1459) {
            try {
                if (arg4 > -56) {
                    this.field1467 = null;
                }
                int var8;
                if (arg3) {
                    if (this.field1467.method2802((byte) 43) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field1467.method2806(17788, (long) (arg2 * 6));
                    this.field1467.method2807(0, class287.field4246, 6, 122);
                    var8 = (class287.field4246[5] & 0xFF) + ((class287.field4246[4] & 0xFF) << 8) + (class287.field4246[3] & 0xFF << 16);
                    if (var8 <= 0 || (long) var8 > this.field1459.method2802((byte) 31) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1459.method2802((byte) -96) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class287.field4246[2] = (byte) arg0;
                class287.field4246[3] = (byte) (var8 >> 16);
                class287.field4246[5] = (byte) var8;
                class287.field4246[0] = (byte) (arg0 >> 16);
                class287.field4246[4] = (byte) (var8 >> 8);
                class287.field4246[1] = (byte) (arg0 >> 8);
                this.field1467.method2806(17788, (long) (arg2 * 6));
                this.field1467.method2805(0, (byte) 91, 6, class287.field4246);
                int var10 = 0;
                int var11 = 0;
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label108: {
                            this.field1459.method2806(17788, (long) (var8 * 520));
                            try {
                                this.field1459.method2807(0, class287.field4246, 8, 121);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class287.field4246[0] & 0xFF << 8) + (class287.field4246[1] & 0xFF);
                            int var14 = ((class287.field4246[2] & 0xFF) << 8) + (class287.field4246[3] & 0xFF);
                            var12 = ((class287.field4246[4] & 0xFF) << 16) + (class287.field4246[5] & 0xFF << 8) + (class287.field4246[6] & 0xFF);
                            int var15 = class287.field4246[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field1463 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1459.method2802((byte) -112) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1459.method2802((byte) 61) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class287.field4246[1] = (byte) arg2;
                    class287.field4246[2] = (byte) (var11 >> 8);
                    class287.field4246[3] = (byte) var11;
                    class287.field4246[0] = (byte) (arg2 >> 8);
                    class287.field4246[7] = (byte) this.field1463;
                    class287.field4246[5] = (byte) (var12 >> 8);
                    class287.field4246[4] = (byte) (var12 >> 16);
                    class287.field4246[6] = (byte) var12;
                    this.field1459.method2806(17788, (long) (var8 * 520));
                    this.field1459.method2805(0, (byte) 74, 8, class287.field4246);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field1459.method2805(var10, (byte) 122, var18, arg1);
                    var10 += var18;
                    var8 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1460++;
        return "Cache:" + this.field1463;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[B")
    public final byte[] method672(int arg0, int arg1) {
        field1461++;
        class473 var3 = this.field1459;
        synchronized (this.field1459) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field1467.method2802((byte) -99)) {
                    return null;
                }
                this.field1467.method2806(17788, (long) (arg1 * 6));
                this.field1467.method2807(0, class287.field4246, 6, 97);
                int var5 = (class287.field4246[2] & 0xFF) + ((class287.field4246[1] & 0xFF) << 8) + (class287.field4246[0] & 0xFF << 16);
                int var6 = ((class287.field4246[3] & 0xFF) << 16) - (-(class287.field4246[4] & 0xFF << 8) - (class287.field4246[5] & 0xFF));
                if (var5 < 0 || var5 > this.field1458) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field1459.method2802((byte) 120) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 != 995151496) {
                        return null;
                    }
                    int var12 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1459.method2806(arg0 ^ 0x3B508BF4, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1459.method2807(0, class287.field4246, var14 + 8, 123);
                        int var15 = ((class287.field4246[0] & 0xFF) << 8) + (class287.field4246[1] & 0xFF);
                        int var16 = ((class287.field4246[2] & 0xFF) << 8) + (class287.field4246[3] & 0xFF);
                        int var17 = ((class287.field4246[4] & 0xFF) << 16) + (((class287.field4246[5] & 0xFF) << 8) + (class287.field4246[6] & 0xFF));
                        int var18 = class287.field4246[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field1463 == var18) {
                            if (var17 >= 0 && (this.field1459.method2802((byte) 15) / 520L) >= ((long) var17)) {
                                var12++;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class287.field4246[var21 + 8];
                                }
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

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method673(int arg0) {
        if (arg0 != 255) {
            field1466 = 116;
        }
        field1456 = null;
        field1465 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILmj;Lmj;I)V")
    public class91(int arg0, class473 arg1, class473 arg2, int arg3) {
        this.field1458 = arg3;
        this.field1463 = arg0;
        this.field1459 = arg1;
        this.field1467 = arg2;
    }

    static {
        new class44("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1466 = 0;
        field1465 = new class44("wave:", "welle:", "ondulation:", "onda:");
    }
}
