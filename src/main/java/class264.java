import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class264 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field3531 = 65000;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Lah;")
    private class249 field3536 = null;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Lah;")
    private class249 field3537 = null;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field3528;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BIZ)Z", line = 4)
    private final boolean method1631(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field3533++;
        class249 var6 = this.field3536;
        synchronized (this.field3536) {
            try {
                int var7;
                if (arg4) {
                    if (this.field3537.method1559(-126) < ((long) (arg3 * 6 + 6))) {
                        return false;
                    }
                    this.field3537.method1563((long) (arg3 * 6), (byte) 45);
                    this.field3537.method1561(class27.field409, 6, 0, false);
                    var7 = (class27.field409[3] & 0xFF << 16) - (-((class27.field409[4] & 0xFF) << 8) - (class27.field409[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field3536.method1559(arg1 - 525) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3536.method1559(117) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class27.field409[5] = (byte) var7;
                class27.field409[3] = (byte) (var7 >> 16);
                class27.field409[1] = (byte) (arg0 >> 8);
                class27.field409[4] = (byte) (var7 >> 8);
                class27.field409[2] = (byte) arg0;
                class27.field409[0] = (byte) (arg0 >> 16);
                this.field3537.method1563((long) (arg3 * 6), (byte) -110);
                this.field3537.method1567(class27.field409, 0, -1, 6);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg4) {
                        label110: {
                            this.field3536.method1563((long) (var7 * 520), (byte) 55);
                            try {
                                this.field3536.method1561(class27.field409, 8, 0, false);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class27.field409[0] & 0xFF << 8) + (class27.field409[1] & 0xFF);
                            int var14 = (class27.field409[2] & 0xFF << 8) + (class27.field409[3] & 0xFF);
                            var12 = (class27.field409[6] & 0xFF) + (class27.field409[5] & 0xFF << 8) + (class27.field409[4] & 0xFF << 16);
                            int var15 = class27.field409[7] & 0xFF;
                            if (arg3 == var13 && var11 == var14 && this.field3528 == var15) {
                                if (var12 >= 0 && this.field3536.method1559(arg1 - 638) / 520L >= (long) var12) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3536.method1559(-115) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class27.field409[0] = (byte) (arg3 >> 8);
                    class27.field409[3] = (byte) var11;
                    class27.field409[1] = (byte) arg3;
                    class27.field409[2] = (byte) (var11 >> 8);
                    class27.field409[7] = (byte) this.field3528;
                    class27.field409[5] = (byte) (var12 >> 8);
                    class27.field409[4] = (byte) (var12 >> 16);
                    class27.field409[6] = (byte) var12;
                    this.field3536.method1563((long) (var7 * 520), (byte) 84);
                    this.field3536.method1567(class27.field409, 0, arg1 ^ 0xFFFFFDFF, 8);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3536.method1567(arg2, var10, -1, var18);
                    var10 += var18;
                    var7 = var12;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                if (arg1 != 512) {
                    field3530 = 25;
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BIII)Z", line = 126)
    public final boolean method1632(byte[] arg0, int arg1, int arg2, int arg3) {
        field3534++;
        class249 var5 = this.field3536;
        synchronized (this.field3536) {
            if (arg1 < arg2 || this.field3531 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1631(arg1, 512, arg0, arg3, true);
            if (!var6) {
                var6 = this.method1631(arg1, 512, arg0, arg3, false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZIIIIIIIIII)V", line = 151)
    public static final void method1633(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field3529++;
        if (class392.field4997 == null) {
            return;
        }
        class227 var14 = null;
        if (arg13 >= 0) {
            int var15 = arg13 - 1;
            class234 var16 = (class234) class505.field6640.method39((long) var15, 31750);
            if (var16 != null) {
                var14 = var16.field3131;
            }
        } else {
            int var17 = -arg13 - 1;
            if (class353.field4536 == var17) {
                var14 = class233.field3130;
            } else {
                var14 = class592.field8019[var17];
            }
        }
        if (var14 == null) {
            return;
        }
        if (arg3) {
            field3530 = 34;
        }
        class698 var18 = class348.field4436.method1900(51, arg1);
        int var19;
        int var20;
        if (arg8 == 1 || arg8 == 3) {
            var20 = var18.field9589;
            var19 = var18.field9654;
        } else {
            var19 = var18.field9589;
            var20 = var18.field9654;
        }
        int var21 = arg6 + (var19 >> 1);
        int var22 = (var19 + 1 >> 1) + arg6;
        int var23 = (var20 >> 1) + arg10;
        int var24 = (var20 + 1 >> 1) + arg10;
        class88 var25 = class392.field4997[arg0];
        int var26 = var25.method668(var21, var23) - (-var25.method668(var22, var23) - var25.method668(var21, var24) - var25.method668(var22, var24)) >> 2;
        class535 var27 = new class535();
        var27.field6976 = arg8;
        var27.field6963 = arg6;
        var27.field6964 = arg4;
        var27.field6974 = arg10;
        var27.field6966 = var14.field508;
        var27.field6971 = arg1;
        var27.field6967 = class424.field5503 + arg11;
        if (arg12 < arg9) {
            int var28 = arg9;
            arg9 = arg12;
            arg12 = var28;
        }
        var27.field6969 = class424.field5503 + arg2;
        var27.field6962 = arg6 + arg12;
        if (arg5 < arg7) {
            int var29 = arg7;
            arg7 = arg5;
            arg5 = var29;
        }
        var27.field6965 = arg6 + arg9;
        var27.field6959 = arg7 + arg10;
        var27.field6961 = var26;
        var27.field6970 = (var27.field6974 << 9) + (var20 << 8);
        var27.field6960 = arg5 + arg10;
        var27.field6957 = (var27.field6963 << 9) + (var19 << 8);
        class141.field1854.method2087(var27, -116);
        var14.field3033 = var27;
    }

    @OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;", line = 259)
    public final String toString() {
        field3532++;
        return "Cache:" + this.field3528;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[B", line = 272)
    public final byte[] method1634(int arg0, int arg1) {
        field3535++;
        if (arg0 != 12123) {
            this.field3528 = 111;
        }
        class249 var3 = this.field3536;
        synchronized (this.field3536) {
            try {
                if (this.field3537.method1559(85) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3537.method1563((long) (arg1 * 6), (byte) -101);
                this.field3537.method1561(class27.field409, 6, 0, false);
                int var5 = ((class27.field409[0] & 0xFF) << 16) + (class27.field409[1] & 0xFF << 8) + (class27.field409[2] & 0xFF);
                int var6 = (class27.field409[5] & 0xFF) + (class27.field409[4] & 0xFF << 8) + (class27.field409[3] & 0xFF << 16);
                if (var5 < 0 || this.field3531 < var5) {
                    return null;
                } else if (var6 > 0 && (long) var6 <= this.field3536.method1559(58) / 520L) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3536.method1563((long) (var6 * 520), (byte) 122);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3536.method1561(class27.field409, var13 + 8, 0, false);
                        int var14 = ((class27.field409[0] & 0xFF) << 8) + (class27.field409[1] & 0xFF);
                        int var15 = (class27.field409[2] & 0xFF << 8) + (class27.field409[3] & 0xFF);
                        int var16 = (class27.field409[6] & 0xFF) + ((class27.field409[4] & 0xFF << 16) + (class27.field409[5] & 0xFF << 8));
                        int var17 = class27.field409[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3528 == var17) {
                            if (var16 >= 0 && (this.field3536.method1559(42) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class27.field409[var20 + 8];
                                }
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

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ILah;Lah;I)V", line = 368)
    public class264(int arg0, class249 arg1, class249 arg2, int arg3) {
        this.field3537 = arg2;
        this.field3531 = arg3;
        this.field3536 = arg1;
        this.field3528 = arg0;
    }
}
