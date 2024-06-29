import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class211 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lma;")
    private class187 field3625 = null;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lma;")
    private class187 field3624 = null;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    private int field3630 = 65000;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lp;")
    private static class280 field3632 = class18.method140((byte) -117, "slide:");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lp;")
    public static class280 field3627 = field3632;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lp;")
    public static class280 field3629 = class18.method140((byte) -127, "Mem:");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lp;")
    public static class280 field3622 = field3632;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lp;")
    private static class280 field3634 = class18.method140((byte) -117, "Connected to update server");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lp;")
    public static class280 field3619 = field3634;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lp;")
    public static class280 field3631 = class18.method140((byte) -128, ")4");

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lbb;")
    public static class90 field3636 = new class90();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!pa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3628++;
        return "Cache:" + this.field3621;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3622 = null;
        if (arg0 < 51) {
            method1413(18, -23, -99, true, -35, 19);
        }
        field3629 = null;
        field3627 = null;
        field3636 = null;
        field3632 = null;
        field3634 = null;
        field3619 = null;
        field3631 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIZII)V")
    public static final void method1413(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = arg2 - arg1;
        field3626++;
        int var7 = arg5 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class91.method654(arg5, 4080, arg4, arg0, arg1);
            }
        } else if (var7 == 0) {
            class89.method635((byte) -2, arg1, arg2, arg4, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class89.field1440 > arg1) {
                var10 = class89.field1440;
                var11 = var9 + (class89.field1440 * var8 >> 12);
            } else if (class12.field249 >= arg1) {
                var10 = arg1;
                var11 = arg0;
            } else {
                var10 = class12.field249;
                var11 = (class12.field249 * var8 >> 12) + var9;
            }
            if (var11 < class36.field654) {
                var10 = (class36.field654 - var9 << 12) / var8;
                var11 = class36.field654;
            } else if (class249.field4360 < var11) {
                var10 = (class249.field4360 - var9 << 12) / var8;
                var11 = class249.field4360;
            }
            int var12;
            int var13;
            if (class89.field1440 > arg2) {
                var12 = (class89.field1440 * var8 >> 12) + var9;
                var13 = class89.field1440;
            } else if (class12.field249 < arg2) {
                var12 = var9 + (class12.field249 * var8 >> 12);
                var13 = class12.field249;
            } else {
                var13 = arg2;
                var12 = arg5;
            }
            if (var12 < class36.field654) {
                var12 = class36.field654;
                var13 = (class36.field654 - var9 << 12) / var8;
            } else if (var12 > class249.field4360) {
                var12 = class249.field4360;
                var13 = (class249.field4360 - var9 << 12) / var8;
            }
            if (arg3) {
                field3634 = null;
            }
            class83.method605(var10, (byte) -48, arg4, var13, var12, var11);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[B")
    public final byte[] method1414(byte arg0, int arg1) {
        field3618++;
        class187 var3 = this.field3624;
        synchronized (this.field3624) {
            try {
                if (this.field3625.method1304(false) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3625.method1307(arg0 + 57, (long) (arg1 * 6));
                this.field3625.method1303(class28.field535, 6, 0, -1);
                int var5 = (class28.field535[2] & 0xFF) + ((class28.field535[1] & 0xFF) << 8) + ((class28.field535[0] & 0xFF) << 16);
                int var6 = (class28.field535[5] & 0xFF) + (class28.field535[4] & 0xFF << 8) + (class28.field535[3] & 0xFF << 16);
                if (var5 < 0 || this.field3630 < var5) {
                    return null;
                } else if (var6 > 0 && this.field3624.method1304(false) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    if (arg0 != 38) {
                        return null;
                    }
                    int var12 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3624.method1307(114, (long) (var6 * 520));
                        int var14 = var5 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field3624.method1303(class28.field535, var14 + 8, 0, -1);
                        int var15 = class28.field535[7] & 0xFF;
                        int var16 = ((class28.field535[0] & 0xFF) << 8) + (class28.field535[1] & 0xFF);
                        int var17 = (class28.field535[6] & 0xFF) + ((class28.field535[4] & 0xFF << 16) + ((class28.field535[5] & 0xFF) << 8));
                        int var18 = (class28.field535[2] & 0xFF << 8) + (class28.field535[3] & 0xFF);
                        if (arg1 == var16 && var12 == var18 && this.field3621 == var15) {
                            if (var17 >= 0 && this.field3624.method1304(false) / 520L >= (long) var17) {
                                var12++;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var9[var10++] = class28.field535[var21 + 8];
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

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI[BI)Z")
    private final boolean method1415(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field3635++;
        class187 var6 = this.field3624;
        synchronized (this.field3624) {
            try {
                int var7;
                if (arg1) {
                    if (this.field3625.method1304(false) < ((long) (arg0 * 6 + 6))) {
                        return false;
                    }
                    this.field3625.method1307(54, (long) (arg0 * 6));
                    this.field3625.method1303(class28.field535, 6, 0, -1);
                    var7 = ((class28.field535[4] & 0xFF) << 8) + (((class28.field535[3] & 0xFF) << 16) + (class28.field535[5] & 0xFF));
                    if (var7 <= 0 || this.field3624.method1304(false) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3624.method1304(false) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class28.field535[5] = (byte) var7;
                class28.field535[3] = (byte) (var7 >> 16);
                class28.field535[1] = (byte) (arg2 >> 8);
                class28.field535[2] = (byte) arg2;
                class28.field535[4] = (byte) (var7 >> 8);
                class28.field535[0] = (byte) (arg2 >> 16);
                if (arg4 != -27669) {
                    field3636 = null;
                }
                int var10 = 0;
                int var11 = 0;
                this.field3625.method1307(arg4 + 27791, (long) (arg0 * 6));
                this.field3625.method1306(class28.field535, 0, 6, (byte) 81);
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg1) {
                        label111: {
                            this.field3624.method1307(arg4 ^ 0xFFFF9399, (long) (var7 * 520));
                            try {
                                this.field3624.method1303(class28.field535, 8, 0, -1);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class28.field535[0] & 0xFF << 8) + (class28.field535[1] & 0xFF);
                            int var14 = ((class28.field535[2] & 0xFF) << 8) + (class28.field535[3] & 0xFF);
                            int var15 = class28.field535[7] & 0xFF;
                            var12 = (class28.field535[4] & 0xFF << 16) + ((class28.field535[5] & 0xFF) << 8) + (class28.field535[6] & 0xFF);
                            if (arg0 == var13 && var11 == var14 && this.field3621 == var15) {
                                if (var12 >= 0 && (long) var12 <= this.field3624.method1304(false) / 520L) {
                                    break label111;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg2 - var10;
                    if (var12 == 0) {
                        var12 = (int) ((this.field3624.method1304(false) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                        arg1 = false;
                    }
                    class28.field535[7] = (byte) this.field3621;
                    class28.field535[3] = (byte) var11;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class28.field535[1] = (byte) arg0;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class28.field535[4] = (byte) (var12 >> 16);
                    class28.field535[2] = (byte) (var11 >> 8);
                    class28.field535[0] = (byte) (arg0 >> 8);
                    class28.field535[6] = (byte) var12;
                    var11++;
                    class28.field535[5] = (byte) (var12 >> 8);
                    this.field3624.method1307(117, (long) (var7 * 520));
                    this.field3624.method1306(class28.field535, 0, 8, (byte) 81);
                    var7 = var12;
                    this.field3624.method1306(arg3, var10, var18, (byte) 81);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1416(int arg0, int arg1, byte[] arg2, int arg3) {
        field3633++;
        class187 var5 = this.field3624;
        synchronized (this.field3624) {
            if (arg3 > arg1 || this.field3630 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1415(arg0, true, arg1, arg2, -27669);
            if (!var6) {
                var6 = this.method1415(arg0, false, arg1, arg2, -27669);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(ILma;Lma;I)V")
    public class211(int arg0, class187 arg1, class187 arg2, int arg3) {
        this.field3621 = arg0;
        this.field3624 = arg1;
        this.field3625 = arg2;
        this.field3630 = arg3;
    }
}
