import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class222 {

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    private int field4185 = 65000;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lkj;")
    private class119 field4187 = null;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lkj;")
    private class119 field4182 = null;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Li;")
    public static class88 field4190 = class208.method1425(105, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Li;")
    public static class88 field4184 = null;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "S")
    public static short field4181 = 32767;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Li;")
    public static class88 field4192 = class208.method1425(105, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lq;BI)Li;")
    public static final class88 method1496(class174 arg0, byte arg1, int arg2) {
        field4191++;
        if (!class105.method728(108, arg2, class80.method530(-881710560, arg0)) && arg0.field3403 == null) {
            return null;
        }
        int var3 = -67 / ((-arg1 - 53) / 53);
        if (arg0.field3375 == null || arg2 >= arg0.field3375.length || arg0.field3375[arg2] == null || arg0.field3375[arg2].method602(113).method604((byte) -53) == 0) {
            return class116.field2105 ? class166.method1142(new class88[] { class99.field1804, class170.method1214(arg2, 115) }, -3) : null;
        } else {
            return arg0.field3375[arg2];
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZ[B)Z")
    private final boolean method1497(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        field4193++;
        class119 var6 = this.field4187;
        synchronized (this.field4187) {
            try {
                int var8;
                if (arg3) {
                    if (this.field4182.method810(103) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field4182.method820((byte) 97, (long) (arg2 * 6));
                    this.field4182.method818(class230.field4305, (byte) 20, 0, 6);
                    var8 = (class230.field4305[5] & 0xFF) + ((class230.field4305[3] & 0xFF) << 16) + ((class230.field4305[4] & 0xFF) << 8);
                    if (var8 <= 0 || (long) var8 > this.field4187.method810(arg0 ^ 0x7B) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4187.method810(76) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class230.field4305[0] = (byte) (arg1 >> 16);
                class230.field4305[5] = (byte) var8;
                int var10 = arg0;
                class230.field4305[2] = (byte) arg1;
                class230.field4305[4] = (byte) (var8 >> 8);
                class230.field4305[3] = (byte) (var8 >> 16);
                int var11 = 0;
                class230.field4305[1] = (byte) (arg1 >> 8);
                this.field4182.method820((byte) 122, (long) (arg2 * 6));
                this.field4182.method808(class230.field4305, 6, 0, -6668);
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg3) {
                        label104: {
                            this.field4187.method820((byte) 92, (long) (var8 * 520));
                            try {
                                this.field4187.method818(class230.field4305, (byte) 53, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class230.field4305[6] & 0xFF) + ((class230.field4305[5] & 0xFF) << 8) + ((class230.field4305[4] & 0xFF) << 16);
                            int var13 = ((class230.field4305[0] & 0xFF) << 8) + (class230.field4305[1] & 0xFF);
                            int var14 = ((class230.field4305[2] & 0xFF) << 8) + (class230.field4305[3] & 0xFF);
                            int var15 = class230.field4305[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field4183 == var15) {
                                if (var12 >= 0 && this.field4187.method810(55) / 520L >= (long) var12) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field4187.method810(52) + 519L) / 520L);
                        arg3 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class230.field4305[2] = (byte) (var11 >> 8);
                    class230.field4305[1] = (byte) arg2;
                    class230.field4305[3] = (byte) var11;
                    class230.field4305[0] = (byte) (arg2 >> 8);
                    class230.field4305[7] = (byte) this.field4183;
                    var11++;
                    if (arg1 - var10 <= 512) {
                        var12 = 0;
                    }
                    class230.field4305[5] = (byte) (var12 >> 8);
                    int var18 = arg1 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class230.field4305[4] = (byte) (var12 >> 16);
                    class230.field4305[6] = (byte) var12;
                    this.field4187.method820((byte) 103, (long) (var8 * 520));
                    var8 = var12;
                    this.field4187.method808(class230.field4305, 8, 0, -6668);
                    this.field4187.method808(arg4, var18, var10, arg0 ^ 0xFFFFE5F4);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method1498(int arg0) {
        field4184 = null;
        field4190 = null;
        field4192 = null;
        if (arg0 != -22187) {
            field4194 = -89;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[B")
    public final byte[] method1499(int arg0, byte arg1) {
        field4188++;
        class119 var3 = this.field4187;
        synchronized (this.field4187) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field4182.method810(68)) {
                    return null;
                }
                this.field4182.method820((byte) 103, (long) (arg0 * 6));
                this.field4182.method818(class230.field4305, (byte) 109, 0, 6);
                int var5 = (class230.field4305[2] & 0xFF) + ((class230.field4305[0] & 0xFF) << 16) + ((class230.field4305[1] & 0xFF) << 8);
                int var6 = (class230.field4305[5] & 0xFF) + ((class230.field4305[3] & 0xFF) << 16) + ((class230.field4305[4] & 0xFF) << 8);
                if (var5 < 0 || this.field4185 < var5) {
                    return null;
                } else if (var6 > 0 && this.field4187.method810(117) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    if (arg1 != -116) {
                        return null;
                    }
                    int var11 = 0;
                    int var12 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field4187.method820((byte) 113, (long) (var6 * 520));
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4187.method818(class230.field4305, (byte) -113, 0, var14 + 8);
                        int var15 = ((class230.field4305[0] & 0xFF) << 8) + (class230.field4305[1] & 0xFF);
                        int var16 = ((class230.field4305[5] & 0xFF) << 8) + (class230.field4305[4] << 16 & 0xFF0000) + (class230.field4305[6] & 0xFF);
                        int var17 = class230.field4305[7] & 0xFF;
                        int var18 = ((class230.field4305[2] & 0xFF) << 8) + (class230.field4305[3] & 0xFF);
                        if (arg0 == var15 && var12 == var18 && this.field4183 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field4187.method810(118) / 520L) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var11++] = class230.field4305[var21 + 8];
                                }
                                var6 = var16;
                                var12++;
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

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BIII)Z")
    public final boolean method1500(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 42 % ((arg1 + 91) / 35);
        field4186++;
        class119 var6 = this.field4187;
        synchronized (this.field4187) {
            if (arg3 < 0 || arg3 > this.field4185) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method1497(0, arg3, arg2, true, arg0);
            if (!var7) {
                var7 = this.method1497(0, arg3, arg2, false, arg0);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4189++;
        return "Cache:" + this.field4183;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILkj;Lkj;I)V")
    public class222(int arg0, class119 arg1, class119 arg2, int arg3) {
        this.field4183 = arg0;
        this.field4185 = arg3;
        this.field4187 = arg1;
        this.field4182 = arg2;
    }
}
