import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lph;")
    private class147 field282 = null;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lph;")
    private class147 field284 = null;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    private int field285 = 65000;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lrf;")
    public static class163 field271 = class53.method392(107, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lrf;")
    public static class163 field276 = class53.method392(-50, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
    public static int[] field274 = new int[50];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[[[I")
    public static int[][][] field270 = new int[4][13][13];

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lrf;")
    private static class163 field286 = class53.method392(113, "This computers address has been blocked");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lrf;")
    public static class163 field269 = field286;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field278++;
        return "Cache:" + this.field280;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BIII)Z")
    public final boolean method105(byte[] arg0, int arg1, int arg2, int arg3) {
        field272++;
        class147 var5 = this.field282;
        synchronized (this.field282) {
            if (arg2 < arg1 || this.field285 < arg2) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method107(true, (byte) -41, arg0, arg2, arg3);
            if (!var6) {
                var6 = this.method107(false, (byte) -41, arg0, arg2, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lrf;Lrf;BLrf;)V")
    public static final void method106(class163 arg0, class163 arg1, byte arg2, class163 arg3) {
        field281++;
        class202.field3995 = arg3;
        class202.field3994 = arg1;
        class202.field3985 = arg0;
        if (arg2 < 113) {
            field286 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZB[BII)Z")
    private final boolean method107(boolean arg0, byte arg1, byte[] arg2, int arg3, int arg4) {
        field275++;
        class147 var6 = this.field282;
        synchronized (this.field282) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg4 * 6 + 6) > this.field284.method960(-3)) {
                        return false;
                    }
                    this.field284.method964((long) (arg4 * 6), arg1 + 296);
                    this.field284.method962(-100, 6, 0, class61.field1260);
                    var7 = ((class61.field1260[3] & 0xFF) << 16) + ((class61.field1260[4] & 0xFF) << 8) + (class61.field1260[5] & 0xFF);
                    if (var7 <= 0 || this.field282.method960(-3) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field282.method960(arg1 ^ 0x2A) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class61.field1260[3] = (byte) (var7 >> 16);
                class61.field1260[1] = (byte) (arg3 >> 8);
                if (arg1 != -41) {
                    this.method105(null, -100, 111, 25);
                }
                class61.field1260[2] = (byte) arg3;
                class61.field1260[5] = (byte) var7;
                class61.field1260[0] = (byte) (arg3 >> 16);
                class61.field1260[4] = (byte) (var7 >> 8);
                this.field284.method964((long) (arg4 * 6), 255);
                this.field284.method956(class61.field1260, 0, (byte) -86, 6);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg3) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field282.method964((long) (var7 * 520), arg1 ^ 0xFFFFFF28);
                            try {
                                this.field282.method962(-108, 8, 0, class61.field1260);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class61.field1260[6] & 0xFF) + (((class61.field1260[4] & 0xFF) << 16) + ((class61.field1260[5] & 0xFF) << 8));
                            int var13 = ((class61.field1260[0] & 0xFF) << 8) + (class61.field1260[1] & 0xFF);
                            int var14 = ((class61.field1260[2] & 0xFF) << 8) + (class61.field1260[3] & 0xFF);
                            int var15 = class61.field1260[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field280 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field282.method960(arg1 ^ 0x2A) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field282.method960(-3) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg0 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class61.field1260[0] = (byte) (arg4 >> 8);
                    class61.field1260[7] = (byte) this.field280;
                    int var18 = arg3 - var10;
                    class61.field1260[2] = (byte) (var11 >> 8);
                    class61.field1260[3] = (byte) var11;
                    class61.field1260[5] = (byte) (var12 >> 8);
                    class61.field1260[4] = (byte) (var12 >> 16);
                    var11++;
                    class61.field1260[6] = (byte) var12;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class61.field1260[1] = (byte) arg4;
                    this.field282.method964((long) (var7 * 520), arg1 ^ 0xFFFFFF28);
                    this.field282.method956(class61.field1260, 0, (byte) -86, 8);
                    this.field282.method956(arg2, var10, (byte) -86, var18);
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method108(boolean arg0) {
        field271 = null;
        field276 = null;
        field270 = null;
        field269 = null;
        field274 = null;
        field286 = null;
        if (!arg0) {
            method106(null, null, (byte) 104, null);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)[B")
    public final byte[] method109(boolean arg0, int arg1) {
        field279++;
        class147 var3 = this.field282;
        synchronized (this.field282) {
            try {
                if (this.field284.method960(-3) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field284.method964((long) (arg1 * 6), 255);
                this.field284.method962(-108, 6, 0, class61.field1260);
                int var5 = ((class61.field1260[1] & 0xFF) << 8) + ((class61.field1260[0] & 0xFF) << 16) + (class61.field1260[2] & 0xFF);
                int var6 = (class61.field1260[5] & 0xFF) + ((class61.field1260[4] & 0xFF) << 8) + ((class61.field1260[3] & 0xFF) << 16);
                if (var5 < 0 || this.field285 < var5) {
                    return null;
                }
                if (arg0) {
                    this.method105(null, -10, 95, -108);
                }
                if (var6 <= 0 || (long) var6 > this.field282.method960(-3) / 520L) {
                    return null;
                }
                byte[] var9 = new byte[var5];
                int var10 = 0;
                int var11 = 0;
                while (var10 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    this.field282.method964((long) (var6 * 520), 255);
                    int var13 = var5 - var10;
                    if (var13 > 512) {
                        var13 = 512;
                    }
                    this.field282.method962(-96, var13 + 8, 0, class61.field1260);
                    int var14 = ((class61.field1260[0] & 0xFF) << 8) + (class61.field1260[1] & 0xFF);
                    int var15 = ((class61.field1260[2] & 0xFF) << 8) + (class61.field1260[3] & 0xFF);
                    int var16 = ((class61.field1260[4] & 0xFF) << 16) + (class61.field1260[5] << 8 & 0xFF00) + (class61.field1260[6] & 0xFF);
                    int var17 = class61.field1260[7] & 0xFF;
                    if (arg1 == var14 && var11 == var15 && this.field280 == var17) {
                        if (var16 >= 0 && this.field282.method960(-3) / 520L >= (long) var16) {
                            var6 = var16;
                            for (int var20 = 0; var20 < var13; var20++) {
                                var9[var10++] = class61.field1260[var20 + 8];
                            }
                            var11++;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var9;
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILph;Lph;I)V")
    public class16(int arg0, class147 arg1, class147 arg2, int arg3) {
        this.field280 = arg0;
        this.field282 = arg1;
        this.field285 = arg3;
        this.field284 = arg2;
    }
}
