import java.io.EOFException;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class498 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    private int field6703 = 65000;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lcv;")
    private class569 field6710 = null;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lcv;")
    private class569 field6712 = null;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    private int field6707;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Lkaa;")
    public static class47 field6713 = new class47(3, 3);

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[B")
    public static byte[] field6714 = new byte[2048];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2806(int arg0) {
        field6706++;
        class508.method2851(-116);
        class651.method3552(-25926);
        if (arg0 > -94) {
            field6714 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BII)Z", line = 15)
    public final boolean method2807(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != -27945) {
            return true;
        }
        field6702++;
        class569 var5 = this.field6712;
        synchronized (this.field6712) {
            if (arg0 < 0 || this.field6703 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2813(127, arg1, arg2, arg0, true);
            if (!var6) {
                var6 = this.method2813(arg3 ^ 0xFFFF92A0, arg1, arg2, arg0, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 42)
    public static final String method2808(int arg0, long arg1) {
        class84.field1019.setTime(new Date(arg1));
        field6711++;
        int var3 = class84.field1019.get(7);
        int var4 = class84.field1019.get(5);
        int var5 = class84.field1019.get(2);
        int var6 = class84.field1019.get(arg0);
        int var7 = class84.field1019.get(11);
        int var8 = class84.field1019.get(12);
        int var9 = class84.field1019.get(13);
        return class112.field1853[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class534.field7037[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)Z", line = 76)
    public static final boolean method2809(int arg0, byte arg1, int arg2) {
        field6708++;
        int var3 = 3 % ((arg1 + 6) / 49);
        return class101.method761(16, arg2, arg0) | (arg0 & 0x60000) != 0 || class130.method1021(arg2, arg0, (byte) -74);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z", line = 89)
    public static final boolean method2810(int arg0, int arg1, int arg2) {
        field6701++;
        if (arg1 < 0 || arg2 < 0 || arg1 >= class184.field2782[1].length || class184.field2782[1][arg1].length <= arg2) {
            return false;
        } else if ((class184.field2782[1][arg1][arg2] & 0x2) == 0) {
            if (arg0 != -10387) {
                field6714 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "toString", descriptor = "()Ljava/lang/String;", line = 108)
    public final String toString() {
        field6709++;
        return "Cache:" + this.field6707;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILcv;Lcv;I)V", line = 347)
    public class498(int arg0, class569 arg1, class569 arg2, int arg3) {
        this.field6703 = arg3;
        this.field6707 = arg0;
        this.field6710 = arg2;
        this.field6712 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 120)
    public static void method2811(int arg0) {
        if (arg0 < 109) {
            field6714 = null;
        }
        field6714 = null;
        field6713 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[B", line = 135)
    public final byte[] method2812(int arg0, int arg1) {
        field6700++;
        class569 var3 = this.field6712;
        synchronized (this.field6712) {
            try {
                if (this.field6710.method3140(0) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field6710.method3138((byte) -66, (long) (arg1 * 6));
                this.field6710.method3141(6, class608.field8042, 0, false);
                int var5 = (class608.field8042[0] & 0xFF << 16) + ((class608.field8042[1] & 0xFF) << 8) + (class608.field8042[2] & 0xFF);
                if (arg0 <= 57) {
                    method2811(122);
                }
                int var6 = ((class608.field8042[3] & 0xFF) << 16) + ((class608.field8042[4] & 0xFF) << 8) + (class608.field8042[5] & 0xFF);
                if (var5 < 0 || this.field6703 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field6712.method3140(0) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6712.method3138((byte) -66, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field6712.method3141(var13 + 8, class608.field8042, 0, false);
                        int var14 = ((class608.field8042[0] & 0xFF) << 8) + (class608.field8042[1] & 0xFF);
                        int var15 = ((class608.field8042[2] & 0xFF) << 8) + (class608.field8042[3] & 0xFF);
                        int var16 = (class608.field8042[5] & 0xFF << 8) + ((class608.field8042[4] & 0xFF << 16) + (class608.field8042[6] & 0xFF));
                        int var17 = class608.field8042[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field6707 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field6712.method3140(0) / 520L) {
                                var6 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label72;
                                    }
                                    var9[var10++] = class608.field8042[var20 + 8];
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BIIZ)Z", line = 222)
    private final boolean method2813(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field6705++;
        class569 var6 = this.field6712;
        synchronized (this.field6712) {
            try {
                int var7;
                if (arg4) {
                    if ((long) (arg2 * 6 + 6) > this.field6710.method3140(0)) {
                        return false;
                    }
                    this.field6710.method3138((byte) -66, (long) (arg2 * 6));
                    this.field6710.method3141(6, class608.field8042, 0, false);
                    var7 = (class608.field8042[5] & 0xFF) + ((class608.field8042[3] & 0xFF << 16) + ((class608.field8042[4] & 0xFF) << 8));
                    if (var7 <= 0 || this.field6712.method3140(0) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field6712.method3140(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class608.field8042[5] = (byte) var7;
                class608.field8042[3] = (byte) (var7 >> 16);
                class608.field8042[1] = (byte) (arg3 >> 8);
                class608.field8042[2] = (byte) arg3;
                class608.field8042[0] = (byte) (arg3 >> 16);
                class608.field8042[4] = (byte) (var7 >> 8);
                this.field6710.method3138((byte) -66, (long) (arg2 * 6));
                this.field6710.method3139(false, 6, class608.field8042, 0);
                if (arg0 < 113) {
                    this.field6707 = -57;
                }
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field6712.method3138((byte) -66, (long) (var7 * 520));
                            try {
                                this.field6712.method3141(8, class608.field8042, 0, false);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class608.field8042[0] & 0xFF) << 8) + (class608.field8042[1] & 0xFF);
                            int var14 = ((class608.field8042[2] & 0xFF) << 8) + (class608.field8042[3] & 0xFF);
                            var12 = ((class608.field8042[4] & 0xFF) << 16) + ((class608.field8042[5] & 0xFF) << 8) + (class608.field8042[6] & 0xFF);
                            int var15 = class608.field8042[7] & 0xFF;
                            if (arg2 == var13 && var11 == var14 && this.field6707 == var15) {
                                if (var12 >= 0 && (this.field6712.method3140(0) / 520L) >= ((long) var12)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field6712.method3140(0) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class608.field8042[1] = (byte) arg2;
                    class608.field8042[0] = (byte) (arg2 >> 8);
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class608.field8042[3] = (byte) var11;
                    class608.field8042[2] = (byte) (var11 >> 8);
                    class608.field8042[5] = (byte) (var12 >> 8);
                    class608.field8042[4] = (byte) (var12 >> 16);
                    class608.field8042[7] = (byte) this.field6707;
                    class608.field8042[6] = (byte) var12;
                    this.field6712.method3138((byte) -66, (long) (var7 * 520));
                    this.field6712.method3139(false, 8, class608.field8042, 0);
                    int var18 = arg3 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field6712.method3139(false, var18, arg1, var10);
                    var10 += var18;
                    var11++;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }
}
