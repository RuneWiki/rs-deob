import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class241 {

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    private int field3430 = 65000;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lnn;")
    private class439 field3421 = null;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lnn;")
    private class439 field3427 = null;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Lfja;")
    public static class783 field3431 = new class783(43, -1);

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lfja;")
    public static class783 field3433 = new class783(18, 17);

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "Lir;")
    public static class28 field3435;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)[B")
    public final byte[] method1604(int arg0, boolean arg1) {
        field3428++;
        class439 var3 = this.field3421;
        synchronized (this.field3421) {
            try {
                if (((long) (arg0 * 6 + 6)) > this.field3427.method2556(-49)) {
                    return null;
                }
                this.field3427.method2553(-1, (long) (arg0 * 6));
                this.field3427.method2554(0, class370.field5026, 6, 0);
                if (!arg1) {
                    return null;
                }
                int var6 = ((class370.field5026[0] & 0xFF) << 16) + (class370.field5026[1] & 0xFF << 8) + (class370.field5026[2] & 0xFF);
                int var7 = ((class370.field5026[4] & 0xFF) << 8) + (((class370.field5026[3] & 0xFF) << 16) + (class370.field5026[5] & 0xFF));
                if (var6 < 0 || this.field3430 < var6) {
                    return null;
                } else if (var7 > 0 && this.field3421.method2556(-127) / 520L >= (long) var7) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var11 < var6) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field3421.method2553(-1, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field3421.method2554(0, class370.field5026, var14 + 8, 0);
                        int var15 = (class370.field5026[0] & 0xFF << 8) + (class370.field5026[1] & 0xFF);
                        int var16 = ((class370.field5026[2] & 0xFF) << 8) + (class370.field5026[3] & 0xFF);
                        int var17 = ((class370.field5026[5] & 0xFF) << 8) + (class370.field5026[4] & 0xFF << 16) + (class370.field5026[6] & 0xFF);
                        int var18 = class370.field5026[7] & 0xFF;
                        if (arg0 == var15 && var12 == var16 && this.field3434 == var18) {
                            if (var17 >= 0 && (this.field3421.method2556(-65) / 520L) >= ((long) var17)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class370.field5026[var21 + 8];
                                }
                                var12++;
                                var7 = var17;
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

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([BIII)Z")
    public final boolean method1605(byte[] arg0, int arg1, int arg2, int arg3) {
        field3432++;
        class439 var5 = this.field3421;
        synchronized (this.field3421) {
            if (arg1 < 0 || arg1 > this.field3430) {
                throw new IllegalArgumentException();
            }
            if (arg2 != 255) {
                method1607(15);
            }
            boolean var6 = this.method1606(-559654520, arg0, arg3, true, arg1);
            if (!var6) {
                var6 = this.method1606(-559654520, arg0, arg3, false, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[BIZI)Z")
    private final boolean method1606(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        field3423++;
        if (arg0 != -559654520) {
            this.field3427 = null;
        }
        class439 var6 = this.field3421;
        synchronized (this.field3421) {
            try {
                int var8;
                if (arg3) {
                    if (((long) (arg2 * 6 + 6)) > this.field3427.method2556(-63)) {
                        return false;
                    }
                    this.field3427.method2553(-1, (long) (arg2 * 6));
                    this.field3427.method2554(0, class370.field5026, 6, 0);
                    var8 = (class370.field5026[5] & 0xFF) + ((class370.field5026[3] & 0xFF) << 16) + (class370.field5026[4] & 0xFF << 8);
                    if (var8 <= 0 || (this.field3421.method2556(-108) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3421.method2556(-123) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class370.field5026[4] = (byte) (var8 >> 8);
                class370.field5026[3] = (byte) (var8 >> 16);
                class370.field5026[5] = (byte) var8;
                class370.field5026[1] = (byte) (arg4 >> 8);
                class370.field5026[0] = (byte) (arg4 >> 16);
                class370.field5026[2] = (byte) arg4;
                this.field3427.method2553(arg0 + 559654519, (long) (arg2 * 6));
                this.field3427.method2552(0, 6, class370.field5026, -1);
                int var10 = 0;
                int var11 = 0;
                while (arg4 > var10) {
                    int var12 = 0;
                    if (arg3) {
                        label109: {
                            this.field3421.method2553(-1, (long) (var8 * 520));
                            try {
                                this.field3421.method2554(0, class370.field5026, 8, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class370.field5026[0] & 0xFF) << 8) + (class370.field5026[1] & 0xFF);
                            var12 = (class370.field5026[4] & 0xFF << 16) + (class370.field5026[6] & 0xFF) + ((class370.field5026[5] & 0xFF) << 8);
                            int var14 = ((class370.field5026[2] & 0xFF) << 8) + (class370.field5026[3] & 0xFF);
                            int var15 = class370.field5026[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field3434 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3421.method2556(-41) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3421.method2556(-54) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class370.field5026[0] = (byte) (arg2 >> 8);
                    class370.field5026[3] = (byte) var11;
                    class370.field5026[1] = (byte) arg2;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class370.field5026[2] = (byte) (var11 >> 8);
                    class370.field5026[7] = (byte) this.field3434;
                    class370.field5026[6] = (byte) var12;
                    class370.field5026[5] = (byte) (var12 >> 8);
                    class370.field5026[4] = (byte) (var12 >> 16);
                    this.field3421.method2553(arg0 + 559654519, (long) (var8 * 520));
                    this.field3421.method2552(0, 8, class370.field5026, -1);
                    int var18 = arg4 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3421.method2552(var10, var18, arg1, arg0 ^ 0x215BA677);
                    var10 += var18;
                    var11++;
                    var8 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    public static void method1607(int arg0) {
        field3431 = null;
        field3433 = null;
        if (arg0 < 38) {
            method1607(-66);
        }
        field3435 = null;
    }

    @OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3424++;
        return "Cache:" + this.field3434;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        field3426++;
        class594.field8348.method3806(1);
        class366.method2232(-109);
        class262.field3679.field1442 = 0;
        class152.field2502 = null;
        class757.field10441 = null;
        class445.field6126 = 0;
        class698.field9643 = null;
        class445.field6088 = 0;
        class227.method1549(126);
        class21.field458 = null;
        class502.field6862 = null;
        class724.field9958 = 0;
        class601.field8410 = null;
        class554.field7831 = null;
        class683.field9510 = 0;
        if (arg0 != -4342) {
            field3425 = 87;
        }
        class749.field10345 = 0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)I")
    public static final int method1609(byte arg0, int arg1) {
        field3429++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 >= -71) {
            field3435 = null;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILnn;Lnn;I)V")
    public class241(int arg0, class439 arg1, class439 arg2, int arg3) {
        this.field3427 = arg2;
        this.field3421 = arg1;
        this.field3434 = arg0;
        this.field3430 = arg3;
    }
}
