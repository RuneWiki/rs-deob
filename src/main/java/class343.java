import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class343 {

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lrs;")
    private class461 field4939 = null;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    private int field4942 = 65000;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lrs;")
    private class461 field4937 = null;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    private int field4933;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4934 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lwj;")
    public static class270 field4932 = new class270(65, 8);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lwa;")
    public static final class433 method2035(int arg0, int arg1) {
        field4941++;
        class433[] var2 = class271.method1622((byte) -94);
        if (arg0 > -53) {
            field4940 = 15;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class433 var4 = var2[var3];
            if (var4.field6349 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lvc;B)V")
    public static final void method2036(class207 arg0, byte arg1) {
        int var2 = 0;
        int var3 = -83 % ((16 - arg1) / 62);
        while (var2 < class292.field4039) {
            int var4 = class421.field6159[var2];
            class438 var5 = class12.field182[var4];
            int var6 = arg0.method2348(-2);
            if ((var6 & 0x2) != 0) {
                var6 += arg0.method2348(-2) << 8;
            }
            if ((var6 & 0x200) != 0) {
                var6 += arg0.method2348(-2) << 16;
            }
            class398.method2400(var6, (byte) -4, var5, var4, arg0);
            var2++;
        }
        field4938++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)I")
    public static final int method2037(boolean arg0, int arg1) {
        field4936++;
        if (arg0) {
            method2035(-12, -116);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BII)Z")
    public final boolean method2038(int arg0, byte[] arg1, int arg2, int arg3) {
        field4943++;
        if (arg0 != -820524600) {
            return true;
        }
        class461 var5 = this.field4939;
        synchronized (this.field4939) {
            if (arg2 < 0 || arg2 > this.field4942) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2039((byte) 74, arg2, arg3, true, arg1);
            if (!var6) {
                var6 = this.method2039((byte) 74, arg2, arg3, false, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIIZ[B)Z")
    private final boolean method2039(byte arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field4935++;
        class461 var6 = this.field4939;
        synchronized (this.field4939) {
            try {
                int var7;
                if (arg3) {
                    if ((long) (arg2 * 6 + 6) > this.field4937.method2706(-5302)) {
                        return false;
                    }
                    this.field4937.method2710(true, (long) (arg2 * 6));
                    this.field4937.method2712(0, 6, (byte) -81, class11.field174);
                    var7 = (class11.field174[4] & 0xFF << 8) + (class11.field174[3] & 0xFF << 16) + (class11.field174[5] & 0xFF);
                    if (var7 <= 0 || ((long) var7) > (this.field4939.method2706(-5302) / 520L)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4939.method2706(-5302) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class11.field174[0] = (byte) (arg1 >> 16);
                class11.field174[4] = (byte) (var7 >> 8);
                class11.field174[2] = (byte) arg1;
                class11.field174[5] = (byte) var7;
                class11.field174[3] = (byte) (var7 >> 16);
                class11.field174[1] = (byte) (arg1 >> 8);
                this.field4937.method2710(true, (long) (arg2 * 6));
                this.field4937.method2708(6, 0, class11.field174, (byte) 125);
                int var10 = 0;
                int var11 = 0;
                if (arg0 != 74) {
                    this.field4937 = null;
                }
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg3) {
                        label107: {
                            this.field4939.method2710(true, (long) (var7 * 520));
                            try {
                                this.field4939.method2712(0, 8, (byte) -81, class11.field174);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class11.field174[0] & 0xFF << 8) + (class11.field174[1] & 0xFF);
                            int var14 = (class11.field174[2] & 0xFF << 8) + (class11.field174[3] & 0xFF);
                            var12 = (class11.field174[4] & 0xFF << 16) + (class11.field174[5] & 0xFF << 8) + (class11.field174[6] & 0xFF);
                            int var15 = class11.field174[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field4933 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field4939.method2706(-5302) / 520L)) {
                                    break label107;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4939.method2706(arg0 ^ 0xFFFFEB00) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class11.field174[0] = (byte) (arg2 >> 8);
                    class11.field174[3] = (byte) var11;
                    class11.field174[1] = (byte) arg2;
                    if ((arg1 - var10) <= 512) {
                        var12 = 0;
                    }
                    class11.field174[2] = (byte) (var11 >> 8);
                    class11.field174[4] = (byte) (var12 >> 16);
                    class11.field174[7] = (byte) this.field4933;
                    class11.field174[6] = (byte) var12;
                    class11.field174[5] = (byte) (var12 >> 8);
                    this.field4939.method2710(true, (long) (var7 * 520));
                    this.field4939.method2708(8, 0, class11.field174, (byte) 114);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field4939.method2708(var18, var10, arg4, (byte) 91);
                    var7 = var12;
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(ZI)[B")
    public final byte[] method2040(boolean arg0, int arg1) {
        field4946++;
        class461 var3 = this.field4939;
        synchronized (this.field4939) {
            try {
                if (this.field4937.method2706(-5302) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field4937.method2710(arg0, (long) (arg1 * 6));
                this.field4937.method2712(0, 6, (byte) -81, class11.field174);
                int var5 = (class11.field174[2] & 0xFF) + ((class11.field174[0] & 0xFF << 16) + ((class11.field174[1] & 0xFF) << 8));
                int var6 = (class11.field174[5] & 0xFF) + ((class11.field174[4] & 0xFF) << 8) + ((class11.field174[3] & 0xFF) << 16);
                if (!arg0) {
                    return null;
                } else if (var5 < 0 || var5 > this.field4942) {
                    return null;
                } else if (var6 > 0 && this.field4939.method2706(-5302) / 520L >= (long) var6) {
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4939.method2710(arg0, (long) (var6 * 520));
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4939.method2712(0, var14 + 8, (byte) -81, class11.field174);
                        int var15 = ((class11.field174[0] & 0xFF) << 8) + (class11.field174[1] & 0xFF);
                        int var16 = ((class11.field174[2] & 0xFF) << 8) + (class11.field174[3] & 0xFF);
                        int var17 = (class11.field174[4] & 0xFF << 16) + (class11.field174[5] & 0xFF << 8) + (class11.field174[6] & 0xFF);
                        int var18 = class11.field174[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field4933 == var18) {
                            if (var17 >= 0 && ((long) var17) <= (this.field4939.method2706(-5302) / 520L)) {
                                var6 = var17;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class11.field174[var21 + 8];
                                }
                                var12++;
                                continue;
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

    @OriginalMember(owner = "client!va", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4945++;
        return "Cache:" + this.field4933;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method2041(boolean arg0) {
        if (!arg0) {
            field4932 = null;
        }
        field4932 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(ILrs;Lrs;I)V")
    public class343(int arg0, class461 arg1, class461 arg2, int arg3) {
        this.field4942 = arg3;
        this.field4939 = arg1;
        this.field4933 = arg0;
        this.field4937 = arg2;
    }
}
