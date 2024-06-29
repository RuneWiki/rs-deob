import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class139 {

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lfc;")
    private class39 field3375 = null;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lfc;")
    private class39 field3367 = null;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private int field3378 = 65000;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field3365;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lu;")
    private static class135 field3364 = class87.method676((byte) -56, " has logged out)3");

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lu;")
    public static class135 field3363 = field3364;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lu;")
    private static class135 field3376 = class87.method676((byte) -108, "Unable to find ");

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lu;")
    public static class135 field3372 = field3376;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Le;")
    public static class29 field3380 = new class29(50);

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lu;")
    private static class135 field3384 = class87.method676((byte) -72, "Drop");

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lu;")
    private static class135 field3386 = class87.method676((byte) -71, "Loading friend list");

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lu;")
    public static class135 field3382 = field3384;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lu;")
    public static class135 field3385 = class87.method676((byte) -106, "backhmid2");

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lu;")
    public static class135 field3387 = class87.method676((byte) -93, "Weiter");

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lu;")
    public static class135 field3383 = field3386;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "[I")
    public static int[] field3390 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Z")
    public static boolean field3392 = false;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "[I")
    public static int[] field3391;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)V")
    public static final void method1122(int arg0, byte arg1, int arg2) {
        long var3 = (long) ((arg2 << 16) + arg0);
        field3373++;
        if (arg1 <= 18) {
            method1122(-36, (byte) -90, -87);
        }
        class128 var5 = (class128) class128.field3082.method842(var3, 123);
        if (var5 != null) {
            class100.field2408.method823(-51, var5);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[B")
    public final byte[] method1123(int arg0, int arg1) {
        field3379++;
        class39 var3 = this.field3375;
        synchronized (this.field3375) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field3367.method298(true)) {
                    return null;
                }
                this.field3367.method299((long) (arg0 * 6), -89);
                int var5 = -2 / ((67 - arg1) / 38);
                this.field3367.method293(0, 6, class50.field1191, (byte) 123);
                int var6 = (class50.field1191[2] & 0xFF) + ((class50.field1191[1] & 0xFF) << 8) + ((class50.field1191[0] & 0xFF) << 16);
                int var7 = ((class50.field1191[4] & 0xFF) << 8) + ((class50.field1191[3] << 16 & 0xFF0000) + (class50.field1191[5] & 0xFF));
                if (var6 < 0 || this.field3378 < var6) {
                    return null;
                } else if (var7 > 0 && this.field3375.method298(true) / 520L >= (long) var7) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var11) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field3375.method299((long) (var7 * 520), 77);
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field3375.method293(0, var14 + 8, class50.field1191, (byte) 119);
                        int var15 = ((class50.field1191[0] & 0xFF) << 8) + (class50.field1191[1] & 0xFF);
                        int var16 = (class50.field1191[6] & 0xFF) + ((class50.field1191[4] & 0xFF) << 16) + ((class50.field1191[5] & 0xFF) << 8);
                        int var17 = class50.field1191[7] & 0xFF;
                        int var18 = ((class50.field1191[2] & 0xFF) << 8) + (class50.field1191[3] & 0xFF);
                        if (arg0 == var15 && var12 == var18 && this.field3365 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3375.method298(true) / 520L) {
                                var7 = var16;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class50.field1191[var21 + 8];
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
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI[BZI)Z")
    private final boolean method1124(boolean arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field3381++;
        class39 var6 = this.field3375;
        synchronized (this.field3375) {
            try {
                int var7;
                if (arg3) {
                    if (this.field3367.method298(true) < (long) (arg4 * 6 + 6)) {
                        return false;
                    }
                    this.field3367.method299((long) (arg4 * 6), 99);
                    this.field3367.method293(0, 6, class50.field1191, (byte) 94);
                    var7 = ((class50.field1191[3] & 0xFF) << 16) + ((class50.field1191[4] & 0xFF) << 8) + (class50.field1191[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field3375.method298(arg0) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3375.method298(true) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                if (!arg0) {
                    return false;
                }
                class50.field1191[4] = (byte) (var7 >> 8);
                class50.field1191[5] = (byte) var7;
                class50.field1191[1] = (byte) (arg1 >> 8);
                class50.field1191[2] = (byte) arg1;
                int var11 = 0;
                class50.field1191[0] = (byte) (arg1 >> 16);
                int var12 = 0;
                class50.field1191[3] = (byte) (var7 >> 16);
                this.field3367.method299((long) (arg4 * 6), 58);
                this.field3367.method295(6, class50.field1191, 20, 0);
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field3375.method299((long) (var7 * 520), 74);
                            try {
                                this.field3375.method293(0, 8, class50.field1191, (byte) 103);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class50.field1191[4] & 0xFF) << 16) - (-((class50.field1191[5] & 0xFF) << 8) - (class50.field1191[6] & 0xFF));
                            int var14 = ((class50.field1191[0] & 0xFF) << 8) + (class50.field1191[1] & 0xFF);
                            int var15 = ((class50.field1191[2] & 0xFF) << 8) + (class50.field1191[3] & 0xFF);
                            int var16 = class50.field1191[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field3365 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field3375.method298(arg0) / 520L) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg1 - var11;
                    if (var13 == 0) {
                        var13 = (int) ((this.field3375.method298(arg0) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class50.field1191[7] = (byte) this.field3365;
                    class50.field1191[0] = (byte) (arg4 >> 8);
                    class50.field1191[1] = (byte) arg4;
                    class50.field1191[2] = (byte) (var12 >> 8);
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class50.field1191[3] = (byte) var12;
                    var12++;
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class50.field1191[5] = (byte) (var13 >> 8);
                    class50.field1191[4] = (byte) (var13 >> 16);
                    class50.field1191[6] = (byte) var13;
                    this.field3375.method299((long) (var7 * 520), 121);
                    var7 = var13;
                    this.field3375.method295(8, class50.field1191, 20, 0);
                    this.field3375.method295(var19, arg2, 20, var11);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3366++;
        return "Cache:" + this.field3365;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1125(byte arg0) {
        field3372 = null;
        field3386 = null;
        field3384 = null;
        field3382 = null;
        field3390 = null;
        field3385 = null;
        field3364 = null;
        if (arg0 <= 88) {
            field3372 = null;
        }
        field3383 = null;
        field3391 = null;
        field3387 = null;
        field3376 = null;
        field3380 = null;
        field3363 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)Z")
    public final boolean method1126(int arg0, byte[] arg1, int arg2, int arg3) {
        field3377++;
        class39 var5 = this.field3375;
        synchronized (this.field3375) {
            if (arg3 < 0 || this.field3378 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1124(true, arg3, arg1, true, arg0);
            if (!var6) {
                var6 = this.method1124(true, arg3, arg1, false, arg0);
            }
            return arg2 == 6 ? var6 : false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lcb;")
    public static final class17 method1127(int arg0, int arg1) {
        field3368++;
        class17 var2 = (class17) class109.field2640.method239(9325, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2984.method324(0, arg0, 14);
        class17 var4 = new class17();
        if (var3 != null) {
            var4.method110((byte) 73, new class59(var3));
        }
        if (arg1 == -1782) {
            class109.field2640.method241(var4, 0, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1128(byte arg0, Component arg1) {
        field3370++;
        if (arg0 == 57) {
            arg1.removeKeyListener(class46.field1103);
            arg1.removeFocusListener(class46.field1103);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Z")
    public static final boolean method1129(int arg0, byte arg1) {
        if (arg1 <= 98) {
            method1122(4, (byte) 91, -110);
        }
        field3371++;
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILfc;Lfc;I)V")
    public class139(int arg0, class39 arg1, class39 arg2, int arg3) {
        this.field3375 = arg1;
        this.field3365 = arg0;
        this.field3378 = arg3;
        this.field3367 = arg2;
    }
}
