import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Llc;")
    private class79 field241 = null;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    private int field250 = 65000;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Llc;")
    private class79 field247 = null;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lqf;")
    private static class117 field225 = class72.method514(112, "The server is being updated)3");

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field240 = 0;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lqf;")
    private static class117 field236 = class72.method514(119, "Take");

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field246 = -1;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lqf;")
    public static class117 field227 = class72.method514(127, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field223 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lqf;")
    public static class117 field235 = class72.method514(113, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lqf;")
    private static class117 field234 = class72.method514(116, "Invalid username or password)3");

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Lqf;")
    public static class117 field238 = class72.method514(122, "invback");

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lqf;")
    public static class117 field253 = field236;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lqf;")
    public static class117 field242 = field234;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lqf;")
    public static class117 field255 = class72.method514(109, "sideicons");

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Lqf;")
    private static class117 field254 = class72.method514(122, "Players");

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "[I")
    public static int[] field256 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lqf;")
    public static class117 field230 = field254;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field257 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lqf;")
    public static class117 field226 = field225;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Lqf;")
    public static class117 field262 = class72.method514(122, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "Lqf;")
    public static class117 field263 = class72.method514(103, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[Lr;")
    public static class118[] field251;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "[[[B")
    public static byte[][][] field258;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[B")
    public final byte[] method134(byte arg0, int arg1) {
        field233++;
        class79 var3 = this.field241;
        synchronized (this.field241) {
            try {
                if ((long) (arg1 * 6 + 6) > this.field247.method622(-21138)) {
                    return null;
                }
                this.field247.method610((long) (arg1 * 6), -115);
                if (arg0 > -98) {
                    return null;
                }
                this.field247.method618(class13.field195, 0, 6, (byte) 42);
                int var6 = ((class13.field195[3] & 0xFF) << 16) + ((class13.field195[4] & 0xFF) << 8) + (class13.field195[5] & 0xFF);
                int var7 = (class13.field195[2] & 0xFF) + (((class13.field195[0] & 0xFF) << 16) + ((class13.field195[1] & 0xFF) << 8));
                if (var7 < 0 || var7 > this.field250) {
                    return null;
                } else if (var6 > 0 && this.field241.method622(-21138) / 520L >= (long) var6) {
                    int var10 = 0;
                    int var11 = 0;
                    byte[] var12 = new byte[var7];
                    while (var10 < var7) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field241.method610((long) (var6 * 520), 121);
                        int var14 = var7 - var10;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field241.method618(class13.field195, 0, var14 + 8, (byte) 42);
                        int var15 = ((class13.field195[2] & 0xFF) << 8) + (class13.field195[3] & 0xFF);
                        int var16 = class13.field195[7] & 0xFF;
                        int var17 = ((class13.field195[0] & 0xFF) << 8) + (class13.field195[1] & 0xFF);
                        int var18 = (class13.field195[6] & 0xFF) + ((class13.field195[4] & 0xFF) << 16) + ((class13.field195[5] & 0xFF) << 8);
                        if (arg1 == var17 && var11 == var15 && this.field232 == var16) {
                            if (var18 >= 0 && this.field241.method622(-21138) / 520L >= (long) var18) {
                                var11++;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var12[var10++] = class13.field195[var21 + 8];
                                }
                                var6 = var18;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var12;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    public static int method135(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field243++;
        return "Cache:" + this.field232;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z[BIII)Z")
    private final boolean method136(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field231++;
        class79 var6 = this.field241;
        synchronized (this.field241) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg3 * 6 + 6) > this.field247.method622(arg4 - 21138)) {
                        return false;
                    }
                    this.field247.method610((long) (arg3 * 6), 119);
                    this.field247.method618(class13.field195, 0, 6, (byte) 42);
                    var8 = (class13.field195[5] & 0xFF) + ((class13.field195[4] & 0xFF) << 8) + ((class13.field195[3] & 0xFF) << 16);
                    if (var8 <= 0 || this.field241.method622(arg4 ^ 0xFFFFAD6E) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field241.method622(-21138) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class13.field195[5] = (byte) var8;
                class13.field195[0] = (byte) (arg2 >> 16);
                class13.field195[1] = (byte) (arg2 >> 8);
                int var10 = arg4;
                class13.field195[2] = (byte) arg2;
                class13.field195[3] = (byte) (var8 >> 16);
                int var11 = 0;
                class13.field195[4] = (byte) (var8 >> 8);
                this.field247.method610((long) (arg3 * 6), arg4 ^ 0xFFFFFFC3);
                this.field247.method612(class13.field195, 0, -1177, 6);
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label104: {
                            this.field241.method610((long) (var8 * 520), 115);
                            try {
                                this.field241.method618(class13.field195, 0, 8, (byte) 42);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class13.field195[6] & 0xFF) + ((class13.field195[4] & 0xFF) << 16) + ((class13.field195[5] & 0xFF) << 8);
                            int var13 = ((class13.field195[0] & 0xFF) << 8) + (class13.field195[1] & 0xFF);
                            int var14 = class13.field195[7] & 0xFF;
                            int var15 = ((class13.field195[2] & 0xFF) << 8) + (class13.field195[3] & 0xFF);
                            if (arg3 == var13 && var11 == var15 && this.field232 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field241.method622(arg4 ^ 0xFFFFAD6E) / 520L) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg0 = false;
                        var12 = (int) ((this.field241.method622(arg4 ^ 0xFFFFAD6E) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class13.field195[0] = (byte) (arg3 >> 8);
                    class13.field195[3] = (byte) var11;
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class13.field195[2] = (byte) (var11 >> 8);
                    class13.field195[6] = (byte) var12;
                    class13.field195[5] = (byte) (var12 >> 8);
                    class13.field195[4] = (byte) (var12 >> 16);
                    class13.field195[7] = (byte) this.field232;
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    var11++;
                    class13.field195[1] = (byte) arg3;
                    this.field241.method610((long) (var8 * 520), 117);
                    var8 = var12;
                    this.field241.method612(class13.field195, 0, -1177, 8);
                    this.field241.method612(arg1, var10, -1177, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method137(int arg0) {
        field227 = null;
        field225 = null;
        field256 = null;
        field234 = null;
        field255 = null;
        field251 = null;
        field238 = null;
        field236 = null;
        field263 = null;
        field254 = null;
        field242 = null;
        field258 = null;
        if (arg0 > -57) {
            method137(-118);
        }
        field235 = null;
        field230 = null;
        field262 = null;
        field253 = null;
        field226 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method138(byte arg0, Component arg1) {
        field259++;
        Method var2 = class137.field3260;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class116.field2740);
        arg1.addFocusListener(class116.field2740);
        if (arg0 != -84) {
            field246 = -61;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method139(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field249++;
        int var8 = -54 % ((-arg0 - 27) / 45);
        if (arg1 < 1 || arg7 < 1 || arg1 > 102 || arg7 > 102) {
            return;
        }
        if (class20.field334 && class140.field3344 != arg3) {
            return;
        }
        int var9 = 0;
        if (arg2 == 0) {
            var9 = class19.field311.method846(arg3, arg1, arg7);
        }
        if (arg2 == 1) {
            var9 = class19.field311.method856(arg3, arg1, arg7);
        }
        boolean var10 = true;
        if (arg2 == 2) {
            var9 = class19.field311.method875(arg3, arg1, arg7);
        }
        if (arg2 == 3) {
            var9 = class19.field311.method839(arg3, arg1, arg7);
        }
        boolean var11 = false;
        boolean var12 = false;
        if (var9 != 0) {
            int var13 = var9 >> 14 & 0x7FFF;
            int var14 = class19.field311.method848(arg3, arg1, arg7, var9);
            int var15 = var14 & 0x1F;
            int var16 = var14 >> 6 & 0x3;
            if (arg2 == 0) {
                class19.field311.method833(arg3, arg1, arg7);
                class148 var17 = class23.method181((byte) -62, var13);
                if (var17.field3643 != 0) {
                    class107.field2550[arg3].method1046(var17.field3668, -5932, arg7, arg1, var15, var16);
                }
            }
            if (arg2 == 1) {
                class19.field311.method852(arg3, arg1, arg7);
            }
            if (arg2 == 2) {
                class19.field311.method876(arg3, arg1, arg7);
                class148 var18 = class23.method181((byte) -112, var13);
                if (var18.field3665 + arg1 > 103 || var18.field3665 + arg7 > 103 || var18.field3649 + arg1 > 103 || arg7 + var18.field3649 > 103) {
                    return;
                }
                if (var18.field3643 != 0) {
                    class107.field2550[arg3].method1057(var18.field3668, var18.field3649, 25027, var18.field3665, var16, arg7, arg1);
                }
            }
            if (arg2 == 3) {
                class19.field311.method851(arg3, arg1, arg7);
                class148 var19 = class23.method181((byte) -62, var13);
                if (var19.field3643 == 1) {
                    class107.field2550[arg3].method1048(-99, arg7, arg1);
                }
            }
        }
        if (arg6 < 0) {
            return;
        }
        int var20 = arg3;
        if (arg3 < 3 && (class73.field1606[1][arg1][arg7] & 0x2) == 2) {
            var20 = arg3 + 1;
        }
        class89.method703(class107.field2550[arg3], arg3, 30383, arg1, arg5, class19.field311, var20, arg7, arg4, arg6);
        return;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BBII)Z")
    public final boolean method140(byte[] arg0, byte arg1, int arg2, int arg3) {
        field260++;
        class79 var5 = this.field241;
        synchronized (this.field241) {
            if (arg2 < 0 || this.field250 < arg2) {
                throw new IllegalArgumentException();
            }
            if (arg1 < 78) {
                method142(null, null, true, 34, null, 28);
            }
            boolean var6 = this.method136(true, arg0, arg2, arg3, 0);
            if (!var6) {
                var6 = this.method136(false, arg0, arg2, arg3, 0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method141(int arg0) {
        class96.field2338.method960(-1);
        field224++;
        int var1 = class96.field2338.method963(-100, 8);
        if (class25.field483 > var1) {
            for (int var2 = var1; var2 < class25.field483; var2++) {
                class91.field2221[class139.field3318++] = class150.field3724[var2];
            }
        }
        if (var1 > class25.field483) {
            throw new RuntimeException("gnpov1");
        }
        class25.field483 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class150.field3724[var3];
            class58 var5 = class72.field1533[var4];
            int var6 = class96.field2338.method963(-59, 1);
            if (var6 == 0) {
                class150.field3724[class25.field483++] = var4;
                var5.field2008 = class43.field856;
            } else {
                int var7 = class96.field2338.method963(-48, 2);
                if (var7 == 0) {
                    class150.field3724[class25.field483++] = var4;
                    var5.field2008 = class43.field856;
                    class56.field1151[class91.field2225++] = var4;
                } else if (var7 == 1) {
                    class150.field3724[class25.field483++] = var4;
                    var5.field2008 = class43.field856;
                    int var8 = class96.field2338.method963(-77, 3);
                    var5.method686((byte) 103, false, var8);
                    int var9 = class96.field2338.method963(-104, 1);
                    if (var9 == 1) {
                        class56.field1151[class91.field2225++] = var4;
                    }
                } else if (var7 == 2) {
                    class150.field3724[class25.field483++] = var4;
                    var5.field2008 = class43.field856;
                    int var10 = class96.field2338.method963(-95, 3);
                    var5.method686((byte) -106, true, var10);
                    int var11 = class96.field2338.method963(-112, 3);
                    var5.method686((byte) -96, true, var11);
                    int var12 = class96.field2338.method963(-39, 1);
                    if (var12 == 1) {
                        class56.field1151[class91.field2225++] = var4;
                    }
                } else if (var7 == 3) {
                    class91.field2221[class139.field3318++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lqf;Lqf;ZILjb;I)V")
    public static final void method142(class117 arg0, class117 arg1, boolean arg2, int arg3, class64 arg4, int arg5) {
        int var6 = arg4.method447((byte) 61, arg0);
        field239++;
        if (arg3 != 10500) {
            method137(-29);
        }
        int var7 = arg4.method449(true, var6, arg1);
        class141.method1100(arg4, -106, var7, arg2, arg5, var6);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(ILlc;Llc;I)V")
    public class16(int arg0, class79 arg1, class79 arg2, int arg3) {
        this.field232 = arg0;
        this.field247 = arg2;
        this.field241 = arg1;
        this.field250 = arg3;
    }
}
