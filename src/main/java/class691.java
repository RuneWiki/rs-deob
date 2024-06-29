import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class691 {

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "Lwr;")
    private class421 field9718 = null;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    private int field9719 = 65000;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "Lwr;")
    private class421 field9720 = null;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    private int field9712;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "Lwba;")
    public static class46 field9713 = new class46();

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field9722 = 0;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "[C")
    private static char[] field9721 = new char[64];

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field9714;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!wo", name = "m", descriptor = "[[[Z")
    public static boolean[][][] field9724;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field9721[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field9721[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field9721[var2] = (char) (var2 - 4);
        }
        field9721[62] = '*';
        field9721[63] = '-';
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[BI)Z", line = 6)
    public final boolean method3800(int arg0, int arg1, byte[] arg2, int arg3) {
        field9714++;
        class421 var5 = this.field9720;
        synchronized (this.field9720) {
            if (arg3 != -1) {
                this.toString();
            }
            if (arg1 < 0 || this.field9719 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method3802(arg0, arg2, true, (byte) 126, arg1);
            if (!var6) {
                var6 = this.method3802(arg0, arg2, false, (byte) 127, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)[B", line = 33)
    public final byte[] method3801(boolean arg0, int arg1) {
        field9717++;
        class421 var3 = this.field9720;
        synchronized (this.field9720) {
            try {
                if (((long) (arg1 * 6 + 6)) > this.field9718.method2530(-12)) {
                    return null;
                }
                this.field9718.method2533((long) (arg1 * 6), 0);
                this.field9718.method2532(-1, 0, class35.field606, 6);
                int var5 = (class35.field606[0] & 0xFF << 16) + (class35.field606[1] & 0xFF << 8) + (class35.field606[2] & 0xFF);
                int var6 = ((class35.field606[3] & 0xFF) << 16) + (class35.field606[4] & 0xFF << 8) + (class35.field606[5] & 0xFF);
                if (var5 < 0 || var5 > this.field9719) {
                    return null;
                } else if (var6 <= 0 || (this.field9720.method2530(-123) / 520L) < ((long) var6)) {
                    return null;
                } else if (arg0) {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    label76: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field9720.method2533((long) (var6 * 520), 0);
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field9720.method2532(-1, 0, class35.field606, var14 + 8);
                        int var15 = (class35.field606[0] & 0xFF << 8) + (class35.field606[1] & 0xFF);
                        int var16 = ((class35.field606[2] & 0xFF) << 8) + (class35.field606[3] & 0xFF);
                        int var17 = ((class35.field606[5] & 0xFF) << 8) + ((class35.field606[4] & 0xFF) << 16) + (class35.field606[6] & 0xFF);
                        int var18 = class35.field606[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field9712 == var18) {
                            if (var17 >= 0 && (this.field9720.method2530(-126) / 520L) >= ((long) var17)) {
                                var12++;
                                var6 = var17;
                                int var21 = 0;
                                while (true) {
                                    if (var21 >= var14) {
                                        continue label76;
                                    }
                                    var10[var11++] = class35.field606[var21 + 8];
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
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[BZBI)Z", line = 130)
    private final boolean method3802(int arg0, byte[] arg1, boolean arg2, byte arg3, int arg4) {
        field9715++;
        class421 var6 = this.field9720;
        synchronized (this.field9720) {
            try {
                int var7;
                if (arg2) {
                    if (this.field9718.method2530(53) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field9718.method2533((long) (arg0 * 6), 0);
                    this.field9718.method2532(-1, 0, class35.field606, 6);
                    var7 = (class35.field606[4] & 0xFF << 8) + ((class35.field606[3] & 0xFF) << 16) + (class35.field606[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field9720.method2530(87) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field9720.method2530(-128) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class35.field606[5] = (byte) var7;
                class35.field606[4] = (byte) (var7 >> 8);
                class35.field606[0] = (byte) (arg4 >> 16);
                class35.field606[1] = (byte) (arg4 >> 8);
                class35.field606[3] = (byte) (var7 >> 16);
                class35.field606[2] = (byte) arg4;
                this.field9718.method2533((long) (arg0 * 6), 0);
                this.field9718.method2537(false, class35.field606, 0, 6);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg2) {
                        label110: {
                            this.field9720.method2533((long) (var7 * 520), 0);
                            try {
                                this.field9720.method2532(-1, 0, class35.field606, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class35.field606[0] & 0xFF) << 8) + (class35.field606[1] & 0xFF);
                            int var14 = (class35.field606[2] & 0xFF << 8) + (class35.field606[3] & 0xFF);
                            var12 = (class35.field606[5] & 0xFF << 8) + ((class35.field606[4] & 0xFF) << 16) + (class35.field606[6] & 0xFF);
                            int var15 = class35.field606[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field9712 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field9720.method2530(-125) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field9720.method2530(-124) + 519L) / 520L);
                        arg2 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class35.field606[1] = (byte) arg0;
                    class35.field606[0] = (byte) (arg0 >> 8);
                    class35.field606[2] = (byte) (var11 >> 8);
                    class35.field606[3] = (byte) var11;
                    if ((arg4 - var10) <= 512) {
                        var12 = 0;
                    }
                    class35.field606[6] = (byte) var12;
                    class35.field606[5] = (byte) (var12 >> 8);
                    class35.field606[7] = (byte) this.field9712;
                    class35.field606[4] = (byte) (var12 >> 16);
                    this.field9720.method2533((long) (var7 * 520), 0);
                    this.field9720.method2537(false, class35.field606, 0, 8);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field9720.method2537(false, arg1, var10, var18);
                    var11++;
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                if (arg3 < 120) {
                    this.method3801(false, 5);
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "toString", descriptor = "()Ljava/lang/String;", line = 254)
    public final String toString() {
        field9716++;
        return "Cache:" + this.field9712;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V", line = 263)
    public static void method3803(boolean arg0) {
        field9721 = null;
        field9713 = null;
        if (arg0) {
            field9722 = 31;
        }
        field9724 = null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(ILwr;Lwr;I)V", line = 332)
    public class691(int arg0, class421 arg1, class421 arg2, int arg3) {
        this.field9719 = arg3;
        this.field9712 = arg0;
        this.field9718 = arg2;
        this.field9720 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(Z)V", line = 291)
    public static final void method3804(boolean arg0) {
        if (!arg0) {
            method3803(false);
        }
        field9723++;
        class323.field4762.method395((byte) 106);
        class313.field4623 = 1;
        class208.field2929 = null;
    }
}
