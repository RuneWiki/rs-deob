import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class297 {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Llq;")
    private class385 field4256 = null;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Llq;")
    private class385 field4255 = null;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    private int field4261 = 65000;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Lsp;")
    public static class448 field4260 = new class448("LIVE", 0);

    @OriginalMember(owner = "client!st", name = "l", descriptor = "Lgk;")
    public static class331 field4266 = new class331("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field4267 = -1;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Lsb;")
    public static class191 field4264;

    @OriginalMember(owner = "client!st", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4259++;
        return "Cache:" + this.field4265;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static void method1870(int arg0) {
        field4264 = null;
        if (arg0 == 3) {
            field4260 = null;
            field4266 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(CI)C")
    public static final char method1871(char arg0, int arg1) {
        field4262++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 != 520) {
                method1870(16);
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[B")
    public final byte[] method1872(int arg0, int arg1) {
        field4257++;
        class385 var3 = this.field4255;
        synchronized (this.field4255) {
            try {
                if (this.field4256.method2339(true) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field4256.method2342(0, (long) (arg1 * 6));
                this.field4256.method2347(6, (byte) 110, class139.field1975, 0);
                int var5 = (class139.field1975[2] & 0xFF) + (((class139.field1975[0] & 0xFF) << 16) + ((class139.field1975[1] & 0xFF) << 8));
                int var6 = ((class139.field1975[3] & 0xFF) << 16) + ((class139.field1975[4] & 0xFF) << 8) + (class139.field1975[5] & 0xFF);
                if (var5 < 0 || this.field4261 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field4255.method2339(true) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 != 407064624) {
                        this.field4255 = null;
                    }
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4255.method2342(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4255.method2347(var13 + 8, (byte) 110, class139.field1975, 0);
                        int var14 = (class139.field1975[0] & 0xFF << 8) + (class139.field1975[1] & 0xFF);
                        int var15 = (class139.field1975[2] & 0xFF << 8) + (class139.field1975[3] & 0xFF);
                        int var16 = (class139.field1975[6] & 0xFF) + ((class139.field1975[4] & 0xFF) << 16) + (class139.field1975[5] & 0xFF << 8);
                        int var17 = class139.field1975[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field4265 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field4255.method2339(true) / 520L) {
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class139.field1975[var20 + 8];
                                }
                                var11++;
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
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([BZII)Z")
    public final boolean method1873(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field4265 = 118;
        }
        field4263++;
        class385 var5 = this.field4255;
        synchronized (this.field4255) {
            if (arg3 < 0 || this.field4261 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1874(arg2, 255, arg0, arg3, true);
            if (!var6) {
                var6 = this.method1874(arg2, 255, arg0, arg3, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II[BIZ)Z")
    private final boolean method1874(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field4258++;
        class385 var6 = this.field4255;
        synchronized (this.field4255) {
            try {
                int var8;
                if (arg4) {
                    if ((long) (arg0 * 6 + 6) > this.field4256.method2339(true)) {
                        return false;
                    }
                    this.field4256.method2342(0, (long) (arg0 * 6));
                    this.field4256.method2347(6, (byte) 110, class139.field1975, 0);
                    var8 = (class139.field1975[4] & 0xFF << 8) + (class139.field1975[3] & 0xFF << 16) + (class139.field1975[5] & 0xFF);
                    if (var8 <= 0 || this.field4255.method2339(true) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4255.method2339(true) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class139.field1975[3] = (byte) (var8 >> 16);
                class139.field1975[5] = (byte) var8;
                if (arg1 != 255) {
                    this.field4265 = 2;
                }
                class139.field1975[2] = (byte) arg3;
                class139.field1975[0] = (byte) (arg3 >> 16);
                class139.field1975[4] = (byte) (var8 >> 8);
                class139.field1975[1] = (byte) (arg3 >> 8);
                this.field4256.method2342(0, (long) (arg0 * 6));
                this.field4256.method2340(0, (byte) 126, class139.field1975, 6);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label108: {
                            this.field4255.method2342(0, (long) (var8 * 520));
                            try {
                                this.field4255.method2347(8, (byte) 110, class139.field1975, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class139.field1975[0] & 0xFF) << 8) + (class139.field1975[1] & 0xFF);
                            var12 = (class139.field1975[4] & 0xFF << 16) + ((class139.field1975[5] & 0xFF) << 8) + (class139.field1975[6] & 0xFF);
                            int var14 = ((class139.field1975[2] & 0xFF) << 8) + (class139.field1975[3] & 0xFF);
                            int var15 = class139.field1975[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field4265 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field4255.method2339(true) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg4 = false;
                        var12 = (int) ((this.field4255.method2339(true) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class139.field1975[1] = (byte) arg0;
                    class139.field1975[2] = (byte) (var11 >> 8);
                    class139.field1975[0] = (byte) (arg0 >> 8);
                    class139.field1975[3] = (byte) var11;
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class139.field1975[7] = (byte) this.field4265;
                    class139.field1975[5] = (byte) (var12 >> 8);
                    class139.field1975[4] = (byte) (var12 >> 16);
                    class139.field1975[6] = (byte) var12;
                    this.field4255.method2342(0, (long) (var8 * 520));
                    this.field4255.method2340(0, (byte) 126, class139.field1975, 8);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4255.method2340(var10, (byte) 127, arg2, var18);
                    var11++;
                    var10 += var18;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(ILlq;Llq;I)V")
    public class297(int arg0, class385 arg1, class385 arg2, int arg3) {
        this.field4256 = arg2;
        this.field4255 = arg1;
        this.field4265 = arg0;
        this.field4261 = arg3;
    }
}
