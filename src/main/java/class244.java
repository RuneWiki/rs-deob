import java.awt.Frame;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class244 {

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "Lon;")
    private class504 field3387 = null;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    private int field3388 = 65000;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "Lon;")
    private class504 field3392 = null;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "Lqk;")
    public static class148 field3389 = new class148(82, 1);

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field3384;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZI[BI)Z", line = 5)
    private final boolean method1546(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field3394++;
        class504 var6 = this.field3392;
        synchronized (this.field3392) {
            try {
                int var8;
                if (arg1) {
                    if ((long) (arg4 * 6 + 6) > this.field3387.method3007(false)) {
                        return false;
                    }
                    this.field3387.method3008((long) (arg4 * 6), (byte) -64);
                    this.field3387.method3017(class743.field10362, (byte) 75, 0, 6);
                    var8 = (class743.field10362[4] & 0xFF << 8) + (class743.field10362[3] & 0xFF << 16) + (class743.field10362[5] & 0xFF);
                    if (var8 <= 0 || this.field3392.method3007(false) / 520L < (long) var8) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3392.method3007(false) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class743.field10362[5] = (byte) var8;
                class743.field10362[4] = (byte) (var8 >> 8);
                class743.field10362[3] = (byte) (var8 >> 16);
                class743.field10362[2] = (byte) arg0;
                class743.field10362[0] = (byte) (arg0 >> 16);
                class743.field10362[1] = (byte) (arg0 >> 8);
                this.field3387.method3008((long) (arg4 * 6), (byte) -40);
                if (arg2 != -22965) {
                    this.field3388 = -55;
                }
                this.field3387.method3018(6, 0, class743.field10362, (byte) -99);
                int var10 = 0;
                int var11 = 0;
                while (var10 < arg0) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field3392.method3008((long) (var8 * 520), (byte) -97);
                            try {
                                this.field3392.method3017(class743.field10362, (byte) 75, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = (class743.field10362[0] & 0xFF << 8) + (class743.field10362[1] & 0xFF);
                            var12 = (class743.field10362[4] & 0xFF << 16) + (class743.field10362[5] & 0xFF << 8) + (class743.field10362[6] & 0xFF);
                            int var14 = ((class743.field10362[2] & 0xFF) << 8) + (class743.field10362[3] & 0xFF);
                            int var15 = class743.field10362[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field3391 == var15) {
                                if (var12 >= 0 && (this.field3392.method3007(false) / 520L) >= ((long) var12)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3392.method3007(false) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class743.field10362[0] = (byte) (arg4 >> 8);
                    if ((arg0 - var10) <= 512) {
                        var12 = 0;
                    }
                    class743.field10362[2] = (byte) (var11 >> 8);
                    class743.field10362[1] = (byte) arg4;
                    class743.field10362[3] = (byte) var11;
                    class743.field10362[5] = (byte) (var12 >> 8);
                    class743.field10362[6] = (byte) var12;
                    class743.field10362[4] = (byte) (var12 >> 16);
                    class743.field10362[7] = (byte) this.field3391;
                    this.field3392.method3008((long) (var8 * 520), (byte) -25);
                    this.field3392.method3018(8, 0, class743.field10362, (byte) -38);
                    int var18 = arg0 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3392.method3018(var18, var10, arg3, (byte) -67);
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

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(ILon;Lon;I)V", line = 281)
    public class244(int arg0, class504 arg1, class504 arg2, int arg3) {
        this.field3391 = arg0;
        this.field3387 = arg2;
        this.field3388 = arg3;
        this.field3392 = arg1;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BI)[B", line = 130)
    public final byte[] method1547(byte arg0, int arg1) {
        field3386++;
        class504 var3 = this.field3392;
        synchronized (this.field3392) {
            try {
                if (this.field3387.method3007(false) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field3387.method3008((long) (arg1 * 6), (byte) -107);
                this.field3387.method3017(class743.field10362, (byte) 75, 0, 6);
                int var5 = (class743.field10362[1] & 0xFF << 8) + (class743.field10362[0] & 0xFF << 16) + (class743.field10362[2] & 0xFF);
                int var6 = (class743.field10362[3] & 0xFF << 16) + (class743.field10362[4] & 0xFF << 8) + (class743.field10362[5] & 0xFF);
                if (arg0 < 19) {
                    method1550(true);
                }
                if (var5 < 0 || var5 > this.field3388) {
                    return null;
                } else if (var6 > 0 && (this.field3392.method3007(false) / 520L) >= ((long) var6)) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label72: while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3392.method3008((long) (var6 * 520), (byte) -51);
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3392.method3017(class743.field10362, (byte) 75, 0, var13 + 8);
                        int var14 = (class743.field10362[0] & 0xFF << 8) + (class743.field10362[1] & 0xFF);
                        int var15 = ((class743.field10362[2] & 0xFF) << 8) + (class743.field10362[3] & 0xFF);
                        int var16 = (class743.field10362[4] & 0xFF << 16) - (-(class743.field10362[5] & 0xFF << 8) - (class743.field10362[6] & 0xFF));
                        int var17 = class743.field10362[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3391 == var17) {
                            if (var16 >= 0 && this.field3392.method3007(false) / 520L >= (long) var16) {
                                var11++;
                                var6 = var16;
                                int var20 = 0;
                                while (true) {
                                    if (var13 <= var20) {
                                        continue label72;
                                    }
                                    var9[var10++] = class743.field10362[var20 + 8];
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

    @OriginalMember(owner = "client!hca", name = "toString", descriptor = "()Ljava/lang/String;", line = 217)
    public final String toString() {
        field3385++;
        return "Cache:" + this.field3391;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V", line = 225)
    public static final void method1548(int arg0) {
        field3390++;
        if (arg0 < -52 && class245.field3423 != -1) {
            class257.method1604(class245.field3423, -1, -1, false, -1);
            class245.field3423 = -1;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[BI)Z", line = 242)
    public final boolean method1549(int arg0, int arg1, byte[] arg2, int arg3) {
        field3382++;
        class504 var5 = this.field3392;
        synchronized (this.field3392) {
            if (arg1 < 0 || arg1 > this.field3388) {
                throw new IllegalArgumentException();
            } else if (arg3 == 1) {
                boolean var7 = this.method1546(arg1, true, -22965, arg2, arg0);
                if (!var7) {
                    var7 = this.method1546(arg1, false, -22965, arg2, arg0);
                }
                return var7;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V", line = 294)
    public static void method1550(boolean arg0) {
        field3389 = null;
        field3384 = null;
        if (!arg0) {
            field3384 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V", line = 310)
    public static final void method1551(int arg0) {
        field3393++;
        class721 var1 = null;
        try {
            var1 = class613.method3594(-9, "2");
            class26 var2 = new class26(class333.field4270 * 6 + 3);
            var2.method184(1, -90);
            if (arg0 >= -72) {
                return;
            }
            var2.method147((byte) 53, class333.field4270);
            for (int var3 = 0; var3 < class594.field8568.length; var3++) {
                if (class504.field7038[var3]) {
                    var2.method147((byte) 53, var3);
                    var2.method199(true, class594.field8568[var3]);
                }
            }
            var1.method4042(var2.field279, var2.field330, -38, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method4048(1);
            }
        } catch (Exception var4) {
        }
        class703.field9781 = class224.method1457((byte) -62);
        class97.field1411 = false;
    }
}
