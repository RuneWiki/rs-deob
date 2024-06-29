import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class206 {

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lub;")
    private class64 field3584 = null;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lub;")
    private class64 field3581 = null;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field3574 = 65000;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lqe;")
    private static class168 field3578 = class66.method448("slide:", -117);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lqe;")
    public static class168 field3572 = class66.method448("loginscreen", 127);

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lqe;")
    public static class168 field3580 = field3578;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lqe;")
    public static class168 field3579 = field3578;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)Z")
    public final boolean method1332(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -24647) {
            return false;
        }
        field3586++;
        class64 var5 = this.field3581;
        synchronized (this.field3581) {
            if (arg1 < 0 || arg1 > this.field3574) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1333(arg2, arg1, arg3, true, -115);
            if (!var6) {
                var6 = this.method1333(arg2, arg1, arg3, false, -9);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[BZI)Z")
    private final boolean method1333(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field3583++;
        class64 var6 = this.field3581;
        synchronized (this.field3581) {
            try {
                int var8;
                if (arg3) {
                    if ((long) (arg0 * 6 + 6) > this.field3584.method431(-11744)) {
                        return false;
                    }
                    this.field3584.method437(-16099, (long) (arg0 * 6));
                    this.field3584.method439(0, (byte) -127, class151.field2632, 6);
                    var8 = ((class151.field2632[4] & 0xFF) << 8) + (((class151.field2632[3] & 0xFF) << 16) + (class151.field2632[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field3581.method431(-11744) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3581.method431(-11744) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                int var10 = -64 % ((-arg4 - 61) / 49);
                class151.field2632[1] = (byte) (arg1 >> 8);
                class151.field2632[0] = (byte) (arg1 >> 16);
                class151.field2632[5] = (byte) var8;
                int var11 = 0;
                class151.field2632[2] = (byte) arg1;
                class151.field2632[3] = (byte) (var8 >> 16);
                class151.field2632[4] = (byte) (var8 >> 8);
                int var12 = 0;
                this.field3584.method437(-16099, (long) (arg0 * 6));
                this.field3584.method432(0, 6, class151.field2632, true);
                while (arg1 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        label104: {
                            this.field3581.method437(-16099, (long) (var8 * 520));
                            try {
                                this.field3581.method439(0, (byte) -109, class151.field2632, 8);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = ((class151.field2632[4] & 0xFF) << 16) + (((class151.field2632[5] & 0xFF) << 8) + (class151.field2632[6] & 0xFF));
                            int var14 = ((class151.field2632[0] & 0xFF) << 8) + (class151.field2632[1] & 0xFF);
                            int var15 = ((class151.field2632[2] & 0xFF) << 8) + (class151.field2632[3] & 0xFF);
                            int var16 = class151.field2632[7] & 0xFF;
                            if (arg0 == var14 && var12 == var15 && this.field3582 == var16) {
                                if (var13 >= 0 && (long) var13 <= this.field3581.method431(-11744) / 520L) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var19 = arg1 - var11;
                    if (var13 == 0) {
                        arg3 = false;
                        var13 = (int) ((this.field3581.method431(-11744) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class151.field2632[1] = (byte) arg0;
                    class151.field2632[7] = (byte) this.field3582;
                    class151.field2632[0] = (byte) (arg0 >> 8);
                    class151.field2632[3] = (byte) var12;
                    if (arg1 - var11 <= 512) {
                        var13 = 0;
                    }
                    class151.field2632[4] = (byte) (var13 >> 16);
                    class151.field2632[5] = (byte) (var13 >> 8);
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class151.field2632[2] = (byte) (var12 >> 8);
                    class151.field2632[6] = (byte) var13;
                    this.field3581.method437(-16099, (long) (var8 * 520));
                    var8 = var13;
                    var12++;
                    this.field3581.method432(0, 8, class151.field2632, true);
                    this.field3581.method432(var11, var19, arg2, true);
                    var11 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)[B")
    public final byte[] method1334(int arg0, int arg1) {
        field3573++;
        class64 var3 = this.field3581;
        synchronized (this.field3581) {
            try {
                if (this.field3584.method431(-11744) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3584.method437(-16099, (long) (arg1 * 6));
                this.field3584.method439(0, (byte) -103, class151.field2632, 6);
                int var5 = (class151.field2632[5] & 0xFF) + ((class151.field2632[3] & 0xFF) << 16) + ((class151.field2632[4] & 0xFF) << 8);
                int var6 = (class151.field2632[2] & 0xFF) + ((class151.field2632[arg0] & 0xFF) << 16) + ((class151.field2632[1] & 0xFF) << 8);
                if (var6 < 0 || var6 > this.field3574) {
                    return null;
                } else if (var5 > 0 && this.field3581.method431(-11744) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    label70: while (var10 < var6) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3581.method437(arg0 ^ 0xFFFFC11D, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3581.method439(0, (byte) -108, class151.field2632, var13 + 8);
                        int var14 = ((class151.field2632[0] & 0xFF) << 8) + (class151.field2632[1] & 0xFF);
                        int var15 = ((class151.field2632[2] & 0xFF) << 8) + (class151.field2632[3] & 0xFF);
                        int var16 = ((class151.field2632[4] & 0xFF) << 16) + ((class151.field2632[5] & 0xFF) << 8) + (class151.field2632[6] & 0xFF);
                        int var17 = class151.field2632[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3582 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3581.method431(-11744) / 520L) {
                                var5 = var16;
                                var11++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label70;
                                    }
                                    var9[var10++] = class151.field2632[var20 + 8];
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

    @OriginalMember(owner = "client!t", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3577++;
        return "Cache:" + this.field3582;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBILoe;)Lgd;")
    public static final class65 method1335(int arg0, byte arg1, int arg2, class256 arg3) {
        field3575++;
        if (class9.method34(arg0, arg3, (byte) -16, arg2)) {
            return arg1 == -103 ? class198.method1274(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZ)V")
    public static final void method1336(int arg0, int arg1, boolean arg2) {
        int[] var3 = new int[4];
        field3576++;
        int[] var4 = new int[4];
        var3[0] = arg0;
        var4[0] = arg1;
        int var5 = 1;
        if (arg2) {
            field3580 = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            if (class148.field2581[var6] != arg0) {
                var3[var5] = class148.field2581[var6];
                var4[var5] = class9.field106[var6];
                var5++;
            }
        }
        class148.field2581 = var3;
        class9.field106 = var4;
        class19.method101(0, 1, class129.field2252, class129.field2252.length - 1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method1337(byte arg0) {
        field3578 = null;
        field3580 = null;
        field3572 = null;
        field3579 = null;
        if (arg0 <= 34) {
            method1336(-104, 28, true);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ILub;Lub;I)V")
    public class206(int arg0, class64 arg1, class64 arg2, int arg3) {
        this.field3582 = arg0;
        this.field3574 = arg3;
        this.field3581 = arg1;
        this.field3584 = arg2;
    }
}
