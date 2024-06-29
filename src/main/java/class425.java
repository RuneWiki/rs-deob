import java.awt.Container;
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class425 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lr;")
    private class63 field6317 = null;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lr;")
    private class63 field6322 = null;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private int field6320 = 65000;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    private int field6325;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Z")
    public static boolean field6312 = true;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field6327 = -50;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "B")
    public static byte field6326;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "F")
    public static float field6313;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "[Lgm;")
    public static class337[] field6324;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 3)
    public static void method2727(int arg0) {
        field6324 = null;
        if (arg0 != 520) {
            field6319 = 123;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Z", line = 13)
    public static final boolean method2728(byte arg0, int arg1) {
        field6315++;
        if (arg1 == 5 || arg1 == 39 || arg1 == 46 || arg1 == 58 || arg1 == 60) {
            return true;
        } else if (arg1 == 32 || arg1 == 7 || arg1 == 1005) {
            return true;
        } else if (arg1 == 30 || arg1 == 26 || arg1 == 42 || arg1 == 31 || arg1 == 2) {
            return true;
        } else if (arg0 <= 103) {
            return false;
        } else {
            return arg1 == 35 || arg1 == 18 || arg1 == 1012 || arg1 == 11;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI)Z", line = 49)
    public final boolean method2729(int arg0, int arg1, byte[] arg2, int arg3) {
        field6316++;
        class63 var5 = this.field6322;
        synchronized (this.field6322) {
            if (arg3 < ~arg1 || this.field6320 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2731(arg2, (byte) 30, true, arg0, arg1);
            if (!var6) {
                var6 = this.method2731(arg2, (byte) 52, false, arg0, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)V", line = 74)
    public static final void method2730(int arg0, long arg1) {
        class232.field3279.field3915 = 0;
        field6318++;
        class232.field3279.method1707(-127, 21);
        class232.field3279.method1689((byte) 119, arg1);
        class69.field959 = 0;
        if (arg0 >= -75) {
            method2728((byte) -27, -13);
        }
        class239.field3379 = 1;
        class293.field4244 = -3;
        class212.field3008 = 0;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILr;Lr;I)V", line = 325)
    public class425(int arg0, class63 arg1, class63 arg2, int arg3) {
        this.field6320 = arg3;
        this.field6322 = arg1;
        this.field6325 = arg0;
        this.field6317 = arg2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([BBZII)Z", line = 99)
    private final boolean method2731(byte[] arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field6323++;
        class63 var6 = this.field6322;
        synchronized (this.field6322) {
            try {
                int var7;
                if (arg2) {
                    if (this.field6317.method411(-64) < (long) (arg3 * 6 + 6)) {
                        return false;
                    }
                    this.field6317.method408(0, (long) (arg3 * 6));
                    this.field6317.method414(class138.field1832, (byte) 92, 0, 6);
                    var7 = ((class138.field1832[4] & 0xFF) << 8) + (((class138.field1832[3] & 0xFF) << 16) + (class138.field1832[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field6322.method411(-72) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field6322.method411(-72) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class138.field1832[2] = (byte) arg4;
                class138.field1832[0] = (byte) (arg4 >> 16);
                if (arg1 <= 16) {
                    return true;
                }
                class138.field1832[3] = (byte) (var7 >> 16);
                class138.field1832[1] = (byte) (arg4 >> 8);
                class138.field1832[5] = (byte) var7;
                class138.field1832[4] = (byte) (var7 >> 8);
                this.field6317.method408(0, (long) (arg3 * 6));
                this.field6317.method415(class138.field1832, 6, 0, 90);
                int var11 = 0;
                int var12 = 0;
                while (var11 < arg4) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field6322.method408(0, (long) (var7 * 520));
                            try {
                                this.field6322.method414(class138.field1832, (byte) 71, 0, 8);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = (class138.field1832[0] & 0xFF << 8) + (class138.field1832[1] & 0xFF);
                            var13 = ((class138.field1832[4] & 0xFF) << 16) + (((class138.field1832[5] & 0xFF) << 8) + (class138.field1832[6] & 0xFF));
                            int var15 = ((class138.field1832[2] & 0xFF) << 8) + (class138.field1832[3] & 0xFF);
                            int var16 = class138.field1832[7] & 0xFF;
                            if (arg3 == var14 && var12 == var15 && this.field6325 == var16) {
                                if (var13 >= 0 && (this.field6322.method411(-121) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field6322.method411(-84) + 519L) / 520L);
                        arg2 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class138.field1832[2] = (byte) (var12 >> 8);
                    if ((arg4 - var11) <= 512) {
                        var13 = 0;
                    }
                    class138.field1832[1] = (byte) arg3;
                    class138.field1832[3] = (byte) var12;
                    class138.field1832[0] = (byte) (arg3 >> 8);
                    class138.field1832[6] = (byte) var13;
                    class138.field1832[7] = (byte) this.field6325;
                    class138.field1832[5] = (byte) (var13 >> 8);
                    class138.field1832[4] = (byte) (var13 >> 16);
                    this.field6322.method408(0, (long) (var7 * 520));
                    this.field6322.method415(class138.field1832, 8, 0, 78);
                    int var19 = arg4 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field6322.method415(arg0, var19, var11, 79);
                    var11 += var19;
                    var12++;
                    var7 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(BI)[B", line = 228)
    public final byte[] method2732(byte arg0, int arg1) {
        field6314++;
        class63 var3 = this.field6322;
        synchronized (this.field6322) {
            try {
                if (this.field6317.method411(arg0 ^ 0x44) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                if (arg0 != -4) {
                    field6312 = true;
                }
                this.field6317.method408(arg0 ^ 0xFFFFFFFC, (long) (arg1 * 6));
                this.field6317.method414(class138.field1832, (byte) 127, 0, 6);
                int var5 = ((class138.field1832[0] & 0xFF) << 16) + ((class138.field1832[1] & 0xFF) << 8) + (class138.field1832[2] & 0xFF);
                int var6 = (class138.field1832[5] & 0xFF) + (class138.field1832[4] & 0xFF << 8) + (class138.field1832[3] & 0xFF << 16);
                if (var5 < 0 || var5 > this.field6320) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field6322.method411(arg0 ^ 0x60) / 520L)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field6322.method408(0, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field6322.method414(class138.field1832, (byte) -72, 0, var13 + 8);
                        int var14 = ((class138.field1832[0] & 0xFF) << 8) + (class138.field1832[1] & 0xFF);
                        int var15 = (class138.field1832[2] & 0xFF << 8) + (class138.field1832[3] & 0xFF);
                        int var16 = (class138.field1832[6] & 0xFF) + ((class138.field1832[5] & 0xFF) << 8) + (class138.field1832[4] & 0xFF << 16);
                        int var17 = class138.field1832[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field6325 == var17) {
                            if (var16 >= 0 && (this.field6322.method411(-100) / 520L) >= ((long) var16)) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class138.field1832[var20 + 8];
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

    @OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;", line = 313)
    public final String toString() {
        field6311++;
        return "Cache:" + this.field6325;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 338)
    public static final void method2733(byte arg0) {
        field6321++;
        if (class106.field1428 != null) {
            return;
        }
        Container var1;
        if (class238.field3346 == null) {
            var1 = class361.field5285.field29;
        } else {
            var1 = class238.field3346;
        }
        class100.field1338 = var1.getSize().width;
        class384.field5739 = var1.getSize().height;
        if (class238.field3346 == var1) {
            Insets var2 = class238.field3346.getInsets();
            class100.field1338 -= var2.right + var2.left;
            class384.field5739 -= var2.top + var2.bottom;
        }
        if (class6.method51(-96) == 1) {
            class7.field68 = 0;
            class345.field5120 = 765;
            class274.field4034 = 503;
            class367.field5459 = (class100.field1338 - 765) / 2;
        } else if (class160.field2099 < 96 && class265.field3854 == 0) {
            int var3 = class100.field1338 <= 1024 ? class100.field1338 : 1024;
            class345.field5120 = var3;
            int var4 = class384.field5739 <= 768 ? class384.field5739 : 768;
            class367.field5459 = (class100.field1338 - var3) / 2;
            class274.field4034 = var4;
            class7.field68 = 0;
        } else {
            class345.field5120 = class100.field1338;
            class367.field5459 = 0;
            class7.field68 = 0;
            class274.field4034 = class384.field5739;
        }
        if (class59.field849 != 0) {
            boolean var10000;
            if (class345.field5120 < 1024 && class274.field4034 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class319.field4561.setSize(class345.field5120, class274.field4034);
        if (class35.field574 != null) {
            class35.field574.method2104();
        }
        if (class238.field3346 == var1) {
            Insets var5 = class238.field3346.getInsets();
            class319.field4561.setLocation(class367.field5459 + var5.left, class7.field68 + var5.top);
        } else {
            class319.field4561.setLocation(class367.field5459, class7.field68);
        }
        if (class404.field6020 != -1) {
            class110.method768(-123, true);
        }
        if (arg0 <= -82) {
            class220.method1364((byte) 106);
        }
    }
}
